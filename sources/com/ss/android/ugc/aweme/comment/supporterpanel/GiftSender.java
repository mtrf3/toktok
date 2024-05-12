package com.ss.android.ugc.aweme.comment.supporterpanel;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GiftSender {

    @InterfaceC65349Pkn("comment_id")
    public final Long commentID;

    @InterfaceC65349Pkn("comment_text")
    public final String commentText;

    @InterfaceC65349Pkn("user")
    public final User user;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftSender)) {
            return false;
        }
        GiftSender giftSender = (GiftSender) obj;
        return o.LJ(this.user, giftSender.user) && o.LJ(this.commentID, giftSender.commentID) && o.LJ(this.commentText, giftSender.commentText);
    }

    public final int hashCode() {
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        Long l = this.commentID;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.commentText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GiftSender(user=");
        LIZ.append(this.user);
        LIZ.append(", commentID=");
        LIZ.append(this.commentID);
        LIZ.append(", commentText=");
        return q.LIZIZ(LIZ, this.commentText, ')', LIZ);
    }

    public GiftSender(User user, Long l, String str) {
        this.user = user;
        this.commentID = l;
        this.commentText = str;
    }
}
