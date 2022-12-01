package hyu_memento.memento_back.service;

import hyu_memento.memento_back.controller.dto.QuizDto;
import hyu_memento.memento_back.domain.Member;
import hyu_memento.memento_back.domain.Quiz;
import hyu_memento.memento_back.domain.QuizContent;
import hyu_memento.memento_back.repository.MemberRepository;
import hyu_memento.memento_back.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class QuizService {
    private final MemberRepository memberRepository;
    private final QuizRepository quizRepository;

    /* 퀴즈 생성 */
    @Transactional
    public Long createQuiz(LocalDate date) {
        Quiz quiz = new Quiz(memberRepository.findOne(1L), date);
        for (Long i=1L; i<=10; i++) {
            QuizContent qc = QuizContent.builder()
                    .num(i)
                    .content("내용")
                    .ans("답변")
                    .build();
            quiz.addQuizContent(qc);
        }
        return quizRepository.save(quiz);
    }

    /* 퀴즈 조회*/
    public QuizDto findQuizContent(LocalDate date, Long seq) {
        QuizContent quizCon = quizRepository.findQuizCon(date, seq);
        QuizDto quizdto = QuizDto.builder()
                .num(quizCon.getNum())
                .content(quizCon.getContent())
                .ans(quizCon.getAns())
                .build();
        return quizdto;
    }
}
