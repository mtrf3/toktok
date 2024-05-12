package com.ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommentUtils {
    public static final CommentUtils INSTANCE = new CommentUtils();

    public static final boolean isDataValid(CommentVideoModel commentVideoModel) {
        if (commentVideoModel == null || TextUtils.isEmpty(commentVideoModel.getUserName()) || TextUtils.isEmpty(commentVideoModel.getCommentMsg()) || TextUtils.isEmpty(commentVideoModel.getAwemeId()) || TextUtils.isEmpty(commentVideoModel.getUserId())) {
            return false;
        }
        return true;
    }

    public static final boolean needMob(ShortVideoContext shortVideoContext) {
        if (shortVideoContext == null || !o.LJ("comment_reply", shortVideoContext.shootWay) || shortVideoContext.commentVideoModel == null) {
            return false;
        }
        return true;
    }

    public static final boolean needMob(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null || !o.LJ("comment_reply", videoPublishEditModel.mShootWay) || videoPublishEditModel.commentVideoModel == null) {
            return false;
        }
        return true;
    }
}
