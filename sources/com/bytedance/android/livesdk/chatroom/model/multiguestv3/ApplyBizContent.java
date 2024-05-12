package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class ApplyBizContent extends F9E {

    @InterfaceC65349Pkn("user")
    public User user;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplyBizContent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.user};
    }

    public ApplyBizContent(User user) {
        this.user = user;
    }

    public /* synthetic */ ApplyBizContent(User user, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user);
    }
}
