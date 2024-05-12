package com.bytedance.pns.scopedid;

import X.C38496F8y;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class ScopedDeviceIdModel extends F9E {

    @InterfaceC65349Pkn("enabled")
    public final boolean enabled;

    public ScopedDeviceIdModel() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enabled)};
    }

    public ScopedDeviceIdModel(boolean z) {
        this.enabled = z;
    }

    public /* synthetic */ ScopedDeviceIdModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C38496F8y.LIZ() : z);
    }
}
