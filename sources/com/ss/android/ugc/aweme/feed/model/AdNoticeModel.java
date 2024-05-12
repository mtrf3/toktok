package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes8.dex */
public final class AdNoticeModel implements Serializable {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg = "";

    @InterfaceC65349Pkn("subscription_status")
    public final int subscriptionStatus;

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMsg() {
        return this.statusMsg;
    }

    public final int getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
}
