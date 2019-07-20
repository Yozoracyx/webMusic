package com.niit.mapper;


import com.niit.entity.Comment;

import java.util.List;

public interface CommentMapper {
    List<Comment> getMusicCommentByMid(long mid);
    List<Comment> getMusicCommentByCid(long cid);
    long addComment(Comment comment);
}
