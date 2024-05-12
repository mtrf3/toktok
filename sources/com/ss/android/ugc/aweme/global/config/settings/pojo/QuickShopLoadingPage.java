package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class QuickShopLoadingPage {

    @InterfaceC65349Pkn("background_url")
    public String backgroundUrl;

    @InterfaceC65349Pkn("text_pic_url")
    public String textPicUrl;

    public String getBackgroundUrl() {
        String str = this.backgroundUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getTextPicUrl() {
        String str = this.textPicUrl;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
