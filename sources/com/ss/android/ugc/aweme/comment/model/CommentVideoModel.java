package com.ss.android.ugc.aweme.comment.model;

import X.C07670Rv;
import X.InterfaceC137125Zs;
import X.V0N;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommentVideoModel implements InterfaceC137125Zs, Serializable {
    public static final Companion Companion = new Companion();
    public static final long serialVersionUID = 6067284783174034475L;
    public final String awemeId;
    public final String awemeUserId;
    public final int channelId;
    public final String commentId;
    public final String commentMsg;
    public int endTime;
    public final String enterFrom;
    public final String enterMethod;
    public final String replyId;
    public final String replyToReplyId;
    public String shootWay;
    public int startTime;
    public final Type type;
    public final UrlModel userAvatar;
    public final String userId;
    public final String userName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CommentVideoModel() {
        /*
            r19 = this;
            r1 = 0
            r10 = 0
            r17 = 65535(0xffff, float:9.1834E-41)
            r0 = r19
            r2 = r1
            r3 = r1
            r4 = r1
            r5 = r1
            r6 = r1
            r7 = r1
            r8 = r1
            r9 = r1
            r11 = r1
            r12 = r10
            r13 = r10
            r14 = r1
            r15 = r1
            r16 = r1
            r18 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.model.CommentVideoModel.<init>():void");
    }

    public static /* synthetic */ CommentVideoModel copy$default(CommentVideoModel commentVideoModel, String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11, int i4, Object obj) {
        String str12 = str;
        String str13 = str2;
        String str14 = str4;
        UrlModel urlModel2 = urlModel;
        String str15 = str3;
        String str16 = str7;
        String str17 = str5;
        String str18 = str6;
        String str19 = str9;
        String str20 = str8;
        int i5 = i;
        Type type2 = type;
        int i6 = i2;
        int i7 = i3;
        String str21 = str11;
        String str22 = str10;
        if ((i4 & 1) != 0) {
            str12 = commentVideoModel.userId;
        }
        if ((i4 & 2) != 0) {
            str13 = commentVideoModel.userName;
        }
        if ((i4 & 4) != 0) {
            urlModel2 = commentVideoModel.userAvatar;
        }
        if ((i4 & 8) != 0) {
            str15 = commentVideoModel.commentMsg;
        }
        if ((i4 & 16) != 0) {
            str14 = commentVideoModel.commentId;
        }
        if ((i4 & 32) != 0) {
            str17 = commentVideoModel.awemeId;
        }
        if ((i4 & 64) != 0) {
            str18 = commentVideoModel.awemeUserId;
        }
        if ((i4 & 128) != 0) {
            str16 = commentVideoModel.replyId;
        }
        if ((i4 & 256) != 0) {
            str20 = commentVideoModel.replyToReplyId;
        }
        if ((i4 & 512) != 0) {
            i5 = commentVideoModel.channelId;
        }
        if ((i4 & 1024) != 0) {
            str19 = commentVideoModel.enterMethod;
        }
        if ((i4 & 2048) != 0) {
            i6 = commentVideoModel.startTime;
        }
        if ((i4 & 4096) != 0) {
            i7 = commentVideoModel.endTime;
        }
        if ((i4 & FileUtils.BUFFER_SIZE) != 0) {
            type2 = commentVideoModel.type;
        }
        if ((i4 & 16384) != 0) {
            str22 = commentVideoModel.shootWay;
        }
        if ((i4 & 32768) != 0) {
            str21 = commentVideoModel.enterFrom;
        }
        String str23 = str15;
        return commentVideoModel.copy(str12, str13, urlModel2, str23, str14, str17, str18, str16, str20, i5, str19, i6, i7, type2, str22, str21);
    }

    public final CommentVideoModel copy(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11) {
        return new CommentVideoModel(str, str2, urlModel, str3, str4, str5, str6, str7, str8, i, str9, i2, i3, type, str10, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentVideoModel)) {
            return false;
        }
        CommentVideoModel commentVideoModel = (CommentVideoModel) obj;
        return o.LJ(this.userId, commentVideoModel.userId) && o.LJ(this.userName, commentVideoModel.userName) && o.LJ(this.userAvatar, commentVideoModel.userAvatar) && o.LJ(this.commentMsg, commentVideoModel.commentMsg) && o.LJ(this.commentId, commentVideoModel.commentId) && o.LJ(this.awemeId, commentVideoModel.awemeId) && o.LJ(this.awemeUserId, commentVideoModel.awemeUserId) && o.LJ(this.replyId, commentVideoModel.replyId) && o.LJ(this.replyToReplyId, commentVideoModel.replyToReplyId) && this.channelId == commentVideoModel.channelId && o.LJ(this.enterMethod, commentVideoModel.enterMethod) && this.startTime == commentVideoModel.startTime && this.endTime == commentVideoModel.endTime && this.type == commentVideoModel.type && o.LJ(this.shootWay, commentVideoModel.shootWay) && o.LJ(this.enterFrom, commentVideoModel.enterFrom);
    }

    public int hashCode() {
        String str = this.userId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.userName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UrlModel urlModel = this.userAvatar;
        int hashCode3 = (hashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str3 = this.commentMsg;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.commentId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.awemeId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awemeUserId;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.replyId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.replyToReplyId;
        int hashCode9 = (((hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.channelId) * 31;
        String str9 = this.enterMethod;
        int hashCode10 = (((((hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.startTime) * 31) + this.endTime) * 31;
        Type type = this.type;
        int hashCode11 = (hashCode10 + (type == null ? 0 : type.hashCode())) * 31;
        String str10 = this.shootWay;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.enterFrom;
        return hashCode12 + (str11 != null ? str11.hashCode() : 0);
    }

    public final boolean hasTimeData() {
        if (this.endTime != 0) {
            return true;
        }
        return false;
    }

    public final boolean isComment() {
        if (this.type == Type.COMMENT) {
            return true;
        }
        return false;
    }

    public final boolean isCommentFromEditPanel() {
        return o.LJ(this.shootWay, "edit_panel");
    }

    public final boolean isCommentFromPanel() {
        if (o.LJ(this.shootWay, "record_panel") || o.LJ(this.shootWay, "edit_panel")) {
            return true;
        }
        return false;
    }

    public final boolean isQuestion() {
        if (this.type == Type.QUESTION) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommentVideoModel(userId=");
        sb.append(this.userId);
        sb.append(", userName=");
        sb.append(this.userName);
        sb.append(", userAvatar=");
        sb.append(this.userAvatar);
        sb.append(", commentMsg=");
        sb.append(this.commentMsg);
        sb.append(", commentId=");
        sb.append(this.commentId);
        sb.append(", awemeId=");
        sb.append(this.awemeId);
        sb.append(", awemeUserId=");
        sb.append(this.awemeUserId);
        sb.append(", replyId=");
        sb.append(this.replyId);
        sb.append(", replyToReplyId=");
        sb.append(this.replyToReplyId);
        sb.append(", channelId=");
        sb.append(this.channelId);
        sb.append(", enterMethod=");
        sb.append(this.enterMethod);
        sb.append(", startTime=");
        sb.append(this.startTime);
        sb.append(", endTime=");
        sb.append(this.endTime);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", shootWay=");
        sb.append(this.shootWay);
        sb.append(", enterFrom=");
        return C07670Rv.LIZIZ(sb, this.enterFrom, ')');
    }

    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* loaded from: classes8.dex */
    public enum Type {
        NONE(0),
        COMMENT(1),
        QUESTION(2);

        public final int code;

        public static Type valueOf(String str) {
            return (Type) V0N.LJJJ(Type.class, str);
        }

        public final int getCode() {
            return this.code;
        }

        Type(int i) {
            this.code = i;
        }
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final String getAwemeUserId() {
        return this.awemeUserId;
    }

    public final int getChannelId() {
        return this.channelId;
    }

    public final String getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getReplyId() {
        return this.replyId;
    }

    public final String getReplyToReplyId() {
        return this.replyToReplyId;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final Type getType() {
        return this.type;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final boolean isVisibleWhen(long j) {
        if (!hasTimeData()) {
            return true;
        }
        if (this.startTime <= j && j <= this.endTime) {
            return true;
        }
        return false;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final void setShootWay(String str) {
        this.shootWay = str;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11) {
        this.userId = str;
        this.userName = str2;
        this.userAvatar = urlModel;
        this.commentMsg = str3;
        this.commentId = str4;
        this.awemeId = str5;
        this.awemeUserId = str6;
        this.replyId = str7;
        this.replyToReplyId = str8;
        this.channelId = i;
        this.enterMethod = str9;
        this.startTime = i2;
        this.endTime = i3;
        this.type = type;
        this.shootWay = str10;
        this.enterFrom = str11;
    }

    public /* synthetic */ CommentVideoModel(String str, String str2, UrlModel urlModel, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, int i3, Type type, String str10, String str11, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? null : urlModel, (i4 & 8) != 0 ? "" : str3, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? "" : str7, (i4 & 256) != 0 ? "" : str8, (i4 & 512) != 0 ? 0 : i, (i4 & 1024) != 0 ? "" : str9, (i4 & 2048) != 0 ? 0 : i2, (i4 & 4096) == 0 ? i3 : 0, (i4 & FileUtils.BUFFER_SIZE) != 0 ? Type.COMMENT : type, (i4 & 16384) != 0 ? "" : str10, (i4 & 32768) == 0 ? str11 : "");
    }
}
