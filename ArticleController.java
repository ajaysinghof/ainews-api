package com.ajweb.ainews.controller;

import com.ajweb.ainews.model.Article;
import com.ajweb.ainews.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/articles")
@CrossOrigin(origins = "*") // allow web access
public class ArticleController {

    private final ArticleService service;

    public ArticleController(ArticleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Article> getAllArticles() {
        return service.getAllArticles();
    }

    @GetMapping("/{id}")
    public Article getArticle(@PathVariable Long id) {
        return service.getArticleById(id).orElse(null);
    }

    @PostMapping
    public Article createArticle(@RequestBody Article article) {
        return service.addArticle(article);
    }

    @DeleteMapping("/{id}")
    public void deleteArticle(@PathVariable Long id) {
        service.deleteArticle(id);
    }
}
