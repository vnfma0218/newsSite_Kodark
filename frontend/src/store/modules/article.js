
import axios from 'axios'
import Util from '../../utils/util'
const util = new Util()

const state = () => ({
})

const getters = {
}

const mutations = {
}

const actions = {
  async getCategory({}) {
    try {
      const res = await axios.get('/article/category')

      return { status: res.status, categories: res.data }
    } catch(err) {
      return { status: err.response.status }
    }
  },

  async popular({}, {category}) {
    try {
      const res = await axios.get(`/article/popular?category=${category}`)
      
      const popularNews = res.data.data
      return { status: res.status, popularNews }
    } catch(err) {
      return { status: err.response.status }
    }
  },

  async latestAll({}) {
    try {
      const res = await axios.get('/article/latest/all')
      
      const latestAll = res.data
      return { status: res.status, latestAll }
    } catch(err) {
      return { status: err.response.status }
    }
  },

  async latest({}, { category }) {
    try {
      const res = await axios.get(`/article/latest?category=${category}`)
      
      const latest = res.data.data
      return { status: res.status, latest }
    } catch(err) {
      return { status: err.response.status }
    }
  },

}

export default {
  namespaced: true,
  state,
  getters,
  mutations,
  actions
}
