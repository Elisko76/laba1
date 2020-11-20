package elisko.dao;


import elisko.domain.Question;

import java.io.IOException;
import java.util.List;

public interface QuestionDao {
    List<Question> getQuestionPack() throws IOException;
}
