package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class LinkMicPerfSladarEventReportConf {

    @InterfaceC65349Pkn("max-length")
    public int maxLength;

    public LinkMicPerfSladarEventReportConf() {
        this(0, 1, null);
    }

    public LinkMicPerfSladarEventReportConf(int i) {
        this.maxLength = i;
    }

    public /* synthetic */ LinkMicPerfSladarEventReportConf(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i);
    }
}
