package com.bytedance.android.livesdk.livesetting.linkmic;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LinkMicLoggerReportConf {

    @InterfaceC65349Pkn("sladar_report_enabled")
    public boolean sladarReportEnabled;

    @InterfaceC65349Pkn("sladar_report_level")
    public String sladarReportLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkMicLoggerReportConf() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public LinkMicLoggerReportConf(boolean z, String sladarReportLevel) {
        o.LJIIIZ(sladarReportLevel, "sladarReportLevel");
        this.sladarReportEnabled = z;
        this.sladarReportLevel = sladarReportLevel;
    }

    public /* synthetic */ LinkMicLoggerReportConf(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "info" : str);
    }
}
