package com.ss.android.ugc.aweme.profile.model;

import X.C2U8;
import X.F9E;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UserInfoUpdateEvent extends F9E implements IEvent {
    public final User user;

    public static /* synthetic */ UserInfoUpdateEvent copy$default(UserInfoUpdateEvent userInfoUpdateEvent, User user, int i, Object obj) {
        if ((i & 1) != 0) {
            user = userInfoUpdateEvent.user;
        }
        return userInfoUpdateEvent.copy(user);
    }

    public final UserInfoUpdateEvent copy(User user) {
        o.LJIIIZ(user, "user");
        return new UserInfoUpdateEvent(user);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.user};
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public UserInfoUpdateEvent(User user) {
        o.LJIIIZ(user, "user");
        this.user = user;
    }
}
