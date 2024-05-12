package com.ss.android.ugc.aweme.dsp.common.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public final class DspUpsellRessoStruct implements Serializable {

    @InterfaceC65349Pkn("app_link")
    public String appLink = "";

    @InterfaceC65349Pkn("deep_link")
    public String deepLink = "";

    @InterfaceC65349Pkn("download_link")
    public String downloadLink = "";

    @InterfaceC65349Pkn("store_link")
    public TTMStoreLink storeLink;

    public final String getAppLink() {
        return this.appLink;
    }

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getDownloadLink() {
        return this.downloadLink;
    }

    public final TTMStoreLink getStoreLink() {
        return this.storeLink;
    }

    public final void setAppLink(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.appLink = str;
    }

    public final void setDeepLink(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.deepLink = str;
    }

    public final void setDownloadLink(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.downloadLink = str;
    }

    public final void setStoreLink(TTMStoreLink tTMStoreLink) {
        this.storeLink = tTMStoreLink;
    }
}
