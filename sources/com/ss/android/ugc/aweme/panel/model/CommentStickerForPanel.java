package com.ss.android.ugc.aweme.panel.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CommentStickerForPanel {

    @InterfaceC65349Pkn("aweme_id")
    public final String awemeId;

    @InterfaceC65349Pkn("aweme_uid")
    public final String awemeUserId;

    @InterfaceC65349Pkn("cid")
    public final String cid;

    @InterfaceC65349Pkn("reply_id")
    public final String replyId;

    @InterfaceC65349Pkn("reply_to_reply_id")
    public final String replyToReplyId;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("user")
    public final UserForPanel user;

    /* JADX WARN: Multi-variable type inference failed */
    public CommentStickerForPanel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentStickerForPanel)) {
            return false;
        }
        CommentStickerForPanel commentStickerForPanel = (CommentStickerForPanel) obj;
        return o.LJ(this.user, commentStickerForPanel.user) && o.LJ(this.text, commentStickerForPanel.text) && o.LJ(this.cid, commentStickerForPanel.cid) && o.LJ(this.awemeId, commentStickerForPanel.awemeId) && o.LJ(this.replyId, commentStickerForPanel.replyId) && o.LJ(this.replyToReplyId, commentStickerForPanel.replyToReplyId) && o.LJ(this.awemeUserId, commentStickerForPanel.awemeUserId);
    }

    public final int hashCode() {
        UserForPanel userForPanel = this.user;
        int hashCode = (userForPanel == null ? 0 : userForPanel.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cid;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.awemeId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.replyId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.replyToReplyId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.awemeUserId;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentStickerForPanel(user=");
        LIZ.append(this.user);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", cid=");
        LIZ.append(this.cid);
        LIZ.append(", awemeId=");
        LIZ.append(this.awemeId);
        LIZ.append(", replyId=");
        LIZ.append(this.replyId);
        LIZ.append(", replyToReplyId=");
        LIZ.append(this.replyToReplyId);
        LIZ.append(", awemeUserId=");
        return q.LIZIZ(LIZ, this.awemeUserId, ')', LIZ);
    }

    public CommentStickerForPanel(UserForPanel userForPanel, String str, String str2, String str3, String str4, String str5, String str6) {
        this.user = userForPanel;
        this.text = str;
        this.cid = str2;
        this.awemeId = str3;
        this.replyId = str4;
        this.replyToReplyId = str5;
        this.awemeUserId = str6;
    }

    public /* synthetic */ CommentStickerForPanel(UserForPanel userForPanel, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userForPanel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null);
    }
}
