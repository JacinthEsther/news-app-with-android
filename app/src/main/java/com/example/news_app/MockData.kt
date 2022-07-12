package com.example.news_app

import com.example.news_app.ui.NewsData

object MockData {

    val topNewsList = listOf<NewsData>(
        NewsData(
            1,
            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),

        NewsData(
            2,

            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),
        NewsData(
            3,

            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),

        NewsData(
            4,

            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),

        NewsData(
            5,

            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),

        NewsData(
            6,

            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),

        NewsData(
            7,

            author = "Jay Est, CNN",
            title = "'Top News' ",
            description = "hello",
            publishedAt = "2022-09-07T06:58:21Z"
        ),
    )

    fun getNews(newsId: Int?): NewsData{
        return topNewsList.first { it.id==newsId }
    }
}