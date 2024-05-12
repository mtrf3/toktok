package com.ss.android.ugc.aweme.brdatagift.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BaseBemobiResponse extends F9E {

    @InterfaceC65349Pkn("carrier")
    public String carrier;

    @InterfaceC65349Pkn("iframeUrl")
    public String iframeUrl;

    @InterfaceC65349Pkn("eligibilityStatus")
    public String status;

    @InterfaceC65349Pkn("subscriptionEndpoint")
    public String subscriptionEndpoint;

    @InterfaceC65349Pkn("status")
    public String url_check_status;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseBemobiResponse() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.status, this.subscriptionEndpoint, this.iframeUrl, this.carrier, this.url_check_status};
    }

    public BaseBemobiResponse(String status, String subscriptionEndpoint, String iframeUrl, String carrier, String url_check_status) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(subscriptionEndpoint, "subscriptionEndpoint");
        o.LJIIIZ(iframeUrl, "iframeUrl");
        o.LJIIIZ(carrier, "carrier");
        o.LJIIIZ(url_check_status, "url_check_status");
        this.status = status;
        this.subscriptionEndpoint = subscriptionEndpoint;
        this.iframeUrl = iframeUrl;
        this.carrier = carrier;
        this.url_check_status = url_check_status;
    }

    public /* synthetic */ BaseBemobiResponse(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
