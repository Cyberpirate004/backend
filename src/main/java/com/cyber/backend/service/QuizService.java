package com.cyber.backend.service;

import com.cyber.backend.model.exam.Quiz;

import java.util.Set;

public interface QuizService {

    public Quiz addQuiz(Quiz quiz);

    public Quiz updateQuiz(Quiz quiz);

    public Set<Quiz> getQuizzes();

    public Quiz getQuizById(Long quizId);

    public void deleteQuiz(Long quizId);
}
