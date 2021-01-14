package com.kodark.news.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kodark.news.dto.CategoryDto;
import com.kodark.news.mappers.ArticleProcedureMapper;

@Repository
public class ArticleProcedureDao {
	@Autowired
	ArticleProcedureMapper articleProcedureMapper;

	public void execuArticleProcedure(Map<String, Object> params) {
		articleProcedureMapper.articleProcedure(params);
	}
	
	public Map<String, Object> excuArticleProcedureMap(Map<String, Object> params) {
		return articleProcedureMapper.articleProcedureMap(params);
	}
	
	public List<Map<String, Object>> excuArticleProcedureList(Map<String, Object> params) {
		return articleProcedureMapper.articleProcedureList(params);
	}

	public List<Map<String, Object>> getArticleDetail(Map<String, Object> params) {
		return articleProcedureMapper.getArticleDetail(params);
	}

	public List<Map<String, Object>> execuArticleProcedure_2(Map<String, Object> params) {
		return articleProcedureMapper.articleProcedure_2(params);
	}

	public List<Map<String, Object>> latestProcedure(Map<String, Object> params) {
		return articleProcedureMapper.latestProcedure(params);
	}

	public List<Map<String, Object>> commentProcedure(int i) {
		return articleProcedureMapper.commentProcedure(i);
	}

}
