package com.niit.service.interfaces;

import com.niit.entity.Comment;

public interface ICommentService {
    String getMusicCommentByCid(long cId);
    String getMusicCommentByMid(long mId);
    long addComment(Comment comment);
}
