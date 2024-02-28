package com.kishan.quizz_app.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.kishan.quizz_app.model.QuestionList;
import com.kishan.quizz_app.repository.QuizRepository;

public class QuizViewModel extends ViewModel {
	
	QuizRepository repository = new QuizRepository();
	
	LiveData<QuestionList> questionListLiveData;
	
	public QuizViewModel() {
		questionListLiveData = repository.getQuestionsFromAPI();
	}
	
	public LiveData<QuestionList> getQuestionListLiveData() {
		return questionListLiveData;
	}
}
