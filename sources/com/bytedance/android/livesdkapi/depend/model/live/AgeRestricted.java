package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class AgeRestricted {

    @InterfaceC65349Pkn("AgeInterval")
    public int ageInterval;

    @InterfaceC65349Pkn("restricted")
    public boolean restricted;

    @InterfaceC65349Pkn("source")
    public int source;

    /* JADX WARN: Multi-variable type inference failed */
    public AgeRestricted() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public AgeRestricted(boolean z, int i) {
        this.restricted = z;
        this.ageInterval = i;
    }

    public /* synthetic */ AgeRestricted(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
