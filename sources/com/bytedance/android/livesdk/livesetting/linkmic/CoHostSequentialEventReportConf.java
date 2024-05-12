package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class CoHostSequentialEventReportConf {

    @InterfaceC65349Pkn("enable")
    public boolean enable;

    public CoHostSequentialEventReportConf() {
        this(false, 1, null);
    }

    public CoHostSequentialEventReportConf(boolean z) {
        this.enable = z;
    }

    public /* synthetic */ CoHostSequentialEventReportConf(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
