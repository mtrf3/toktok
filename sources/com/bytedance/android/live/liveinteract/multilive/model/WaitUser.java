package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class WaitUser extends F9E {

    @InterfaceC65349Pkn("link_mic_id")
    public String linkMicId;

    @InterfaceC65349Pkn("uid")
    public long uid;

    /* JADX WARN: Multi-variable type inference failed */
    public WaitUser() {
        this(0L, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.uid), this.linkMicId};
    }

    public WaitUser(long j, String str) {
        this.uid = j;
        this.linkMicId = str;
    }

    public /* synthetic */ WaitUser(long j, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : str);
    }
}
