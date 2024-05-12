package com.ss.android.ugc.aweme.feed.model.live;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes14.dex */
public class LiveAuthenticationInfo implements Serializable, Cloneable {

    @InterfaceC65349Pkn("authentication_badge")
    public UrlModel authenticationBadge;

    @InterfaceC65349Pkn("custom_verify")
    public String customVerify;

    @InterfaceC65349Pkn("enterprise_verify_reason")
    public String enterpriseVerifyReason;

    public UrlModel getAuthenticationBadge() {
        return this.authenticationBadge;
    }

    public String getCustomVerify() {
        return this.customVerify;
    }

    public String getEnterpriseVerifyReason() {
        return this.enterpriseVerifyReason;
    }

    public void setAuthenticationBadge(UrlModel urlModel) {
        this.authenticationBadge = urlModel;
    }

    public void setCustomVerify(String str) {
        this.customVerify = str;
    }

    public void setEnterpriseVerifyReason(String str) {
        this.enterpriseVerifyReason = str;
    }
}
