package com.ss.android.ugc.aweme.crossplatform.abtest;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;

/* loaded from: classes10.dex */
public class WebViewPreloadEntry {

    @InterfaceC65349Pkn("type")
    public String type = "BootFinished";

    @InterfaceC65349Pkn("preType")
    public String preType = "render";

    @InterfaceC65349Pkn("delay")
    public long delay = 3000;

    @InterfaceC65349Pkn("url")
    public String url = "https://s16-ies.tiktok.com/ies-cdn-alisg/tiktok_activities/covid19/pages/coronavirus/index.html?hide_nav_bar=1&enter_from=topic_entrance";

    @InterfaceC65349Pkn("usePool")
    public boolean usePool = true;

    public boolean isBackground() {
        return TextUtils.equals("Background", this.type);
    }

    public boolean isNeedRender() {
        return TextUtils.equals("render", this.preType);
    }

    public long getDelay() {
        return this.delay;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isUsePool() {
        return this.usePool;
    }
}
