package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C119414mP;
import X.C62374Odu;
import X.EF7;
import X.InterfaceC65349Pkn;
import android.os.Bundle;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.share.improve.pkg.CommentSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CommentContent extends BaseContent {
    public static final Companion Companion = new Companion();

    @InterfaceC65349Pkn("author_id")
    public String authorId;

    @InterfaceC65349Pkn("author_name")
    public String authorName;

    @InterfaceC65349Pkn("avatar_url")
    public UrlModel avatarUrl;

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;

    @InterfaceC65349Pkn("aweme_type")
    public int awemeType;

    @InterfaceC65349Pkn("comment")
    public String comment;

    @InterfaceC65349Pkn("comment_id")
    public String commentId;

    @InterfaceC65349Pkn("comment_media_type")
    public int commentMediaType;

    @InterfaceC65349Pkn("cover_url")
    public UrlModel coverUrl;

    @InterfaceC65349Pkn("is_reply_with_video")
    public boolean isReplyWithVideo;

    @InterfaceC65349Pkn("is_sub_comment")
    public boolean isSubComment;

    @InterfaceC65349Pkn("reply_user_id")
    public String replyUserId;

    @InterfaceC65349Pkn("reply_user_name")
    public String replyUserName;

    public static final CommentContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public SharePackage generateSharePackage() {
        String str;
        String str2;
        String str3;
        C119414mP c119414mP = CommentSharePackage.Companion;
        String str4 = this.awemeId;
        UrlModel urlModel = this.coverUrl;
        int i = this.awemeType;
        String str5 = this.commentId;
        String str6 = this.comment;
        String str7 = this.authorName;
        String str8 = this.authorId;
        String str9 = this.replyUserName;
        String str10 = this.replyUserId;
        UrlModel urlModel2 = this.avatarUrl;
        boolean z = this.isSubComment;
        boolean z2 = this.isReplyWithVideo;
        c119414mP.getClass();
        C62374Odu c62374Odu = new C62374Odu();
        c62374Odu.LIZ = "comment";
        if (str5 == null) {
            str = "";
        } else {
            str = str5;
        }
        c62374Odu.LIZIZ = str;
        if (str5 == null) {
            str2 = "";
        } else {
            str2 = str5;
        }
        c62374Odu.LIZLLL = str2;
        if (str6 == null) {
            str3 = "";
        } else {
            str3 = str6;
        }
        c62374Odu.LJ = str3;
        c62374Odu.LJFF = "";
        CommentSharePackage commentSharePackage = new CommentSharePackage(c62374Odu);
        Bundle bundle = commentSharePackage.extras;
        if (str4 == null) {
            str4 = "";
        }
        bundle.putString("aweme_id", str4);
        if (str6 == null) {
            str6 = "";
        }
        bundle.putString("comment_text", str6);
        if (str5 == null) {
            str5 = "";
        }
        bundle.putString("comment_id", str5);
        if (str7 == null) {
            str7 = "";
        }
        bundle.putString("comment_author_name", str7);
        if (str8 == null) {
            str8 = "";
        }
        bundle.putString("comment_author_id", str8);
        if (str9 == null) {
            str9 = "";
        }
        bundle.putString("comment_reply_user_name", str9);
        if (str10 == null) {
            str10 = "";
        }
        bundle.putString("comment_reply_user_id", str10);
        bundle.putSerializable("video_cover", urlModel);
        bundle.putSerializable("comment_author_avatar_url", urlModel2);
        bundle.putInt("aweme_type", i);
        bundle.putBoolean("comment_is_sub_comment", z);
        bundle.putBoolean("comment_is_reply_with_video", z2);
        return commentSharePackage;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String getMsgHint() {
        String string = EF7.LIZIZ().getResources().getString(R.string.h1k, this.authorName);
        o.LJIIIIZZ(string, "getApplicationContext().…    authorName,\n        )");
        return string;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final CommentContent fromSharePackage(SharePackage sharePackage) {
            UrlModel urlModel;
            o.LJIIIZ(sharePackage, "sharePackage");
            CommentContent commentContent = new CommentContent();
            Bundle bundle = sharePackage.extras;
            commentContent.setAwemeId(bundle.getString("aweme_id"));
            commentContent.setComment(bundle.getString("comment_text"));
            commentContent.setCommentId(bundle.getString("comment_id"));
            commentContent.setAuthorName(bundle.getString("comment_author_name"));
            commentContent.setAuthorId(bundle.getString("comment_author_id"));
            commentContent.setReplyUserName(bundle.getString("comment_reply_user_name"));
            commentContent.setReplyUserId(bundle.getString("comment_reply_user_id"));
            Serializable serializable = bundle.getSerializable("video_cover");
            UrlModel urlModel2 = null;
            if (serializable instanceof UrlModel) {
                urlModel = (UrlModel) serializable;
            } else {
                urlModel = null;
            }
            commentContent.setCoverUrl(urlModel);
            Serializable serializable2 = bundle.getSerializable("comment_author_avatar_url");
            if (serializable2 instanceof UrlModel) {
                urlModel2 = (UrlModel) serializable2;
            }
            commentContent.setAvatarUrl(urlModel2);
            commentContent.setAwemeType(bundle.getInt("aweme_type"));
            commentContent.setSubComment(bundle.getBoolean("comment_is_sub_comment"));
            commentContent.setReplyWithVideo(bundle.getBoolean("comment_is_reply_with_video"));
            commentContent.setCommentMediaType(bundle.getInt("comment_media_type"));
            commentContent.type = 0;
            return commentContent;
        }
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getAuthorName() {
        return this.authorName;
    }

    public final UrlModel getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int getAwemeType() {
        return this.awemeType;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final int getCommentMediaType() {
        return this.commentMediaType;
    }

    public final UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public final String getReplyUserId() {
        return this.replyUserId;
    }

    public final String getReplyUserName() {
        return this.replyUserName;
    }

    public final boolean isReplyWithVideo() {
        return this.isReplyWithVideo;
    }

    public final boolean isSubComment() {
        return this.isSubComment;
    }

    public final void setAuthorId(String str) {
        this.authorId = str;
    }

    public final void setAuthorName(String str) {
        this.authorName = str;
    }

    public final void setAvatarUrl(UrlModel urlModel) {
        this.avatarUrl = urlModel;
    }

    public final void setAwemeId(String str) {
        this.awemeId = str;
    }

    public final void setAwemeType(int i) {
        this.awemeType = i;
    }

    public final void setComment(String str) {
        this.comment = str;
    }

    public final void setCommentId(String str) {
        this.commentId = str;
    }

    public final void setCommentMediaType(int i) {
        this.commentMediaType = i;
    }

    public final void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public final void setReplyUserId(String str) {
        this.replyUserId = str;
    }

    public final void setReplyUserName(String str) {
        this.replyUserName = str;
    }

    public final void setReplyWithVideo(boolean z) {
        this.isReplyWithVideo = z;
    }

    public final void setSubComment(boolean z) {
        this.isSubComment = z;
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent
    public String wrapMsgHint(boolean z, boolean z2, String str, C109544Rq c109544Rq) {
        if (z || z2) {
            String string = EF7.LIZIZ().getResources().getString(R.string.eve);
            o.LJIIIIZZ(string, "{\n            getApplica…e_sent_comment)\n        }");
            return string;
        }
        String string2 = EF7.LIZIZ().getResources().getString(R.string.etx);
        o.LJIIIIZZ(string2, "{\n            getApplica…_comment_inbox)\n        }");
        return string2;
    }
}
