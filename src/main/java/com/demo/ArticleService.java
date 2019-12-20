package com.demo;

import com.demo.model.Article;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ArticleService {
    List<Article> articleList = new ArrayList<Article>(Arrays.asList(
            new Article( "1", "akash",
                    "r"),
            new Article( "2", "akash1",
                    "r1")));
    //@RequestMapping("/articles")
    public List<Article> getAllArticleList() {
        return articleList;
    }
}
