package com.ss.android.ugc.aweme.compliance.sandbox.webview;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebViewInjectScriptSettingsBean extends F9E {

    @InterfaceC65349Pkn("webapi_report")
    public final WebapiReport webapiReport;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewInjectScriptSettingsBean() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.webapiReport};
    }

    public WebViewInjectScriptSettingsBean(WebapiReport webapiReport) {
        o.LJIIIZ(webapiReport, "webapiReport");
        this.webapiReport = webapiReport;
    }

    public /* synthetic */ WebViewInjectScriptSettingsBean(WebapiReport webapiReport, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new WebapiReport(false, null, 3, null) : webapiReport);
    }
}
