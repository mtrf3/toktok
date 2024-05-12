package com.bytedance.android.livesdk.chatroom.model;

import X.C16880lQ;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import webcast.data.UserIdentity;

/* loaded from: classes6.dex */
public final class EmoteChatResult {

    @InterfaceC65349Pkn("msg_id")
    public final long msgId;

    @InterfaceC65349Pkn("user")
    public final User user;

    @InterfaceC65349Pkn("user_identity")
    public final UserIdentity userIdentity;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EmoteChatResult)) {
            return false;
        }
        EmoteChatResult emoteChatResult = (EmoteChatResult) obj;
        return this.msgId == emoteChatResult.msgId && o.LJ(this.user, emoteChatResult.user) && o.LJ(this.userIdentity, emoteChatResult.userIdentity);
    }

    public final int hashCode() {
        int hashCode = (this.user.hashCode() + (C16880lQ.LLJIJIL(this.msgId) * 31)) * 31;
        UserIdentity userIdentity = this.userIdentity;
        return hashCode + (userIdentity == null ? 0 : userIdentity.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EmoteChatResult(msgId=");
        LIZ.append(this.msgId);
        LIZ.append(", user=");
        LIZ.append(this.user);
        LIZ.append(", userIdentity=");
        LIZ.append(this.userIdentity);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public EmoteChatResult(long j, User user, UserIdentity userIdentity) {
        o.LJIIIZ(user, "user");
        this.msgId = j;
        this.user = user;
        this.userIdentity = userIdentity;
    }

    public /* synthetic */ EmoteChatResult(long j, User user, UserIdentity userIdentity, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, user, (i & 4) != 0 ? null : userIdentity);
    }
}
