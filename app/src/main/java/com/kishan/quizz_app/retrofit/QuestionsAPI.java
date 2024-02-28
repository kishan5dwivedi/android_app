package com.kishan.quizz_app.retrofit;

import com.kishan.quizz_app.model.QuestionList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface QuestionsAPI {
	
	@GET("my_quiz_api.php") //endpoint
	Call<QuestionList> getQuestions();
	
}
