package com.ss.android.ugc.aweme.autocut;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class PreloadNLEConfig extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("max_concurrent_count")
    public final int maxConcurrentCount;

    /* JADX WARN: Multi-variable type inference failed */
    public PreloadNLEConfig() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.maxConcurrentCount)};
    }

    public PreloadNLEConfig(boolean z, int i) {
        this.enable = z;
        this.maxConcurrentCount = i;
    }

    public /* synthetic */ PreloadNLEConfig(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }
}
