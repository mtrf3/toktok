package com.bytedance.android.livesdk.livesetting.effect;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class ReportFeedbackUrls {

    @InterfaceC65349Pkn("creator")
    public String reportCreatorUrl;

    @InterfaceC65349Pkn("official")
    public String reportOfficialUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public ReportFeedbackUrls() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public ReportFeedbackUrls(String reportCreatorUrl, String reportOfficialUrl) {
        o.LJIIIZ(reportCreatorUrl, "reportCreatorUrl");
        o.LJIIIZ(reportOfficialUrl, "reportOfficialUrl");
        this.reportCreatorUrl = reportCreatorUrl;
        this.reportOfficialUrl = reportOfficialUrl;
    }

    public /* synthetic */ ReportFeedbackUrls(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
