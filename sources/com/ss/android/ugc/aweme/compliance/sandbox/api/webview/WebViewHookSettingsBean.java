package com.ss.android.ugc.aweme.compliance.sandbox.api.webview;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WebViewHookSettingsBean extends F9E {

    @InterfaceC65349Pkn("enabled")
    public final boolean enable;

    @InterfaceC65349Pkn("fix_performance_timing_data")
    public final boolean enableFixPerfTimingData;

    @InterfaceC65349Pkn("http_cache")
    public final boolean enable_http_cache;

    @InterfaceC65349Pkn("policy")
    public final int policy;

    @InterfaceC65349Pkn("redirect_reload")
    public final boolean redirect_reload;

    @InterfaceC65349Pkn("url")
    public final UrlRules url;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewHookSettingsBean() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Integer.valueOf(this.policy), Boolean.valueOf(this.enableFixPerfTimingData), this.url, Boolean.valueOf(this.enable_http_cache), Boolean.valueOf(this.redirect_reload)};
    }

    public WebViewHookSettingsBean(boolean z, int i, boolean z2, UrlRules url, boolean z3, boolean z4) {
        o.LJIIIZ(url, "url");
        this.enable = z;
        this.policy = i;
        this.enableFixPerfTimingData = z2;
        this.url = url;
        this.enable_http_cache = z3;
        this.redirect_reload = z4;
    }

    public /* synthetic */ WebViewHookSettingsBean(boolean z, int i, boolean z2, UrlRules urlRules, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? new UrlRules(null, null, false, null, 15, null) : urlRules, (i2 & 16) == 0 ? z3 : false, (i2 & 32) == 0 ? z4 : true);
    }
}
