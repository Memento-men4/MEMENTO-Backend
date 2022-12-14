package hyu_memento.memento_back.domain;

import hyu_memento.memento_back.domain.type.Gender;
import hyu_memento.memento_back.domain.type.MemberType;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity()
@Table
@Getter
@NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long member_seq;

    private String id; // unique 제약 조건?
    private String password;
    private String name;
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Enumerated(EnumType.STRING)
    private MemberType type;

    private LocalDate birthDay;
    private String email;

    @OneToMany(mappedBy = "member")
    private List<Record> records = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Quiz> quizs = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<GamePlay> gamePlays = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Appliance> appliances = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<ApplianceOperation> applianceOperations = new ArrayList<>();

    @Builder
    public Member(String id, String password, String name, String phoneNumber, Gender gender, MemberType type, LocalDate birthDay, String email) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.type = type;
        this.birthDay = birthDay;
        this.email = email;
    }

//    public void changeUserName(String username) {
//        this.username = username;
//    }
}
