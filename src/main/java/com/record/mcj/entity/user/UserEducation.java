package com.record.mcj.entity.user;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserEducation {

    @Id
    @GeneratedValue
    @Column(name = "user_education_id")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "user_profile_id")
    private UserProfile userProfile;


}
