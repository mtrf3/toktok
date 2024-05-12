package com.ss.android.ugc.aweme.discover.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* loaded from: classes13.dex */
public class InquiryStruct implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("icon")
    public UrlModel icon;

    @InterfaceC65349Pkn("open_url")
    public String openUrl;

    @InterfaceC65349Pkn("web_url")
    public String webUrl;

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
