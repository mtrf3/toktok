package com.ss.android.ugc.aweme.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class HybridLogReportModel extends F9E {

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    public HybridLogReportModel() {
        this(false, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable)};
    }

    public HybridLogReportModel(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ HybridLogReportModel(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
