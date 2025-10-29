package com.ajweb.ainews.service;

import com.ajweb.ainews.model.Article;
import com.ajweb.ainews.repository.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleRepository repo;

    public ArticleService(ArticleRepository repo) {
        this.repo = repo;
    }

    public List<Article> getAllArticles() {
        return repo.findAll();
    }

    public Optional<Article> getArticleById(Long id) {
        return repo.findById(id);
    }

    public Article addArticle(Article article) {
        return repo.save(article);
    }

    public void deleteArticle(Long id) {
        repo.deleteById(id);
    }
}
