package com.ajweb.ainews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ajweb.ainews.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
