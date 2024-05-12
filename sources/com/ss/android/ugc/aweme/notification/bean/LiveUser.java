package com.ss.android.ugc.aweme.notification.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class LiveUser extends F9E {

    @InterfaceC65349Pkn("id")
    public final long id;

    public LiveUser() {
        this(0L, 1, null);
    }

    public static /* synthetic */ LiveUser copy$default(LiveUser liveUser, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = liveUser.id;
        }
        return liveUser.copy(j);
    }

    public final LiveUser copy(long j) {
        return new LiveUser(j);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.id)};
    }

    public LiveUser(long j) {
        this.id = j;
    }

    public /* synthetic */ LiveUser(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
