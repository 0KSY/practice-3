package com.solo.practice.postingLike.reposittory;

import com.solo.practice.postingLike.entity.PostingLike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PostingLikeRepository extends JpaRepository<PostingLike, Long> {

    Optional<PostingLike> findByMemberMemberIdAndPostingPostingId(Long memberId, Long postingId);
}
