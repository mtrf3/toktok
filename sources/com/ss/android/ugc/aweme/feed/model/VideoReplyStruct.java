package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class VideoReplyStruct implements Serializable {

    @InterfaceC65349Pkn("alias_comment_id")
    public long aliasCommentId;

    @InterfaceC65349Pkn("aweme_id")
    public long awemeId;

    @InterfaceC65349Pkn("collect_stat")
    public Integer collectStat;

    @InterfaceC65349Pkn("comment_id")
    public long commentId;

    @InterfaceC65349Pkn("comment_msg")
    public String commentMsg;

    @InterfaceC65349Pkn("comment_user_id")
    public long commentUserId;

    @InterfaceC65349Pkn("user_avatar")
    public UrlModel userAvatar;

    @InterfaceC65349Pkn("user_name")
    public String userName;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public VideoReplyStruct() {
        /*
            r15 = this;
            r1 = 0
            r7 = 0
            r13 = 255(0xff, float:3.57E-43)
            r0 = r15
            r3 = r1
            r5 = r1
            r8 = r7
            r9 = r1
            r11 = r7
            r12 = r7
            r14 = r7
            r0.<init>(r1, r3, r5, r7, r8, r9, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.VideoReplyStruct.<init>():void");
    }

    public final long getAliasCommentId() {
        return this.aliasCommentId;
    }

    public final long getAwemeId() {
        return this.awemeId;
    }

    public final Integer getCollectStat() {
        return this.collectStat;
    }

    public final long getCommentId() {
        return this.commentId;
    }

    public final String getCommentMsg() {
        return this.commentMsg;
    }

    public final long getCommentUserId() {
        return this.commentUserId;
    }

    public final UrlModel getUserAvatar() {
        return this.userAvatar;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setCollectStat(Integer num) {
        this.collectStat = num;
    }

    public VideoReplyStruct(long j, long j2, long j3, String userName, String commentMsg, long j4, UrlModel urlModel, Integer num) {
        o.LJIIIZ(userName, "userName");
        o.LJIIIZ(commentMsg, "commentMsg");
        this.awemeId = j;
        this.commentId = j2;
        this.aliasCommentId = j3;
        this.userName = userName;
        this.commentMsg = commentMsg;
        this.commentUserId = j4;
        this.userAvatar = urlModel;
        this.collectStat = num;
    }

    public /* synthetic */ VideoReplyStruct(long j, long j2, long j3, String str, String str2, long j4, UrlModel urlModel, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? 0L : j3, (i & 8) != 0 ? "" : str, (i & 16) == 0 ? str2 : "", (i & 32) == 0 ? j4 : 0L, (i & 64) != 0 ? null : urlModel, (i & 128) == 0 ? num : null);
    }
}
