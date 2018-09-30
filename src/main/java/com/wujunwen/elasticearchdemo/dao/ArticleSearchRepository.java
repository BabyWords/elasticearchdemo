package com.wujunwen.elasticearchdemo.dao;

import com.wujunwen.elasticearchdemo.entity.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleSearchRepository extends ElasticsearchRepository<Article, Long> {
}