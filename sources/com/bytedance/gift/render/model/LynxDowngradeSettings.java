package com.bytedance.gift.render.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LynxDowngradeSettings extends F9E {

    @InterfaceC65349Pkn("min_memory")
    public long minMemory;

    public LynxDowngradeSettings() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.minMemory)};
    }

    public LynxDowngradeSettings(long j) {
        this.minMemory = j;
    }

    public /* synthetic */ LynxDowngradeSettings(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
