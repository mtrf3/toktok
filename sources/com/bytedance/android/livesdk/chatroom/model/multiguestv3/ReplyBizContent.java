package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ReplyBizContent extends F9E {

    @InterfaceC65349Pkn("is_turn_off_invitation")
    public int isTurnOffInvitation;

    @InterfaceC65349Pkn("link_type")
    public int linkType;

    @InterfaceC65349Pkn("reply_user_info")
    public User replyUserInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ReplyBizContent() {
        /*
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 7
            r0 = r6
            r2 = r1
            r5 = r3
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.model.multiguestv3.ReplyBizContent.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.linkType), Integer.valueOf(this.isTurnOffInvitation), this.replyUserInfo};
    }

    public ReplyBizContent(int i, int i2, User user) {
        this.linkType = i;
        this.isTurnOffInvitation = i2;
        this.replyUserInfo = user;
    }

    public /* synthetic */ ReplyBizContent(int i, int i2, User user, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? null : user);
    }
}
