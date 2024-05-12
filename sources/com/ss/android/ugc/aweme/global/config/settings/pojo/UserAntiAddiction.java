package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class UserAntiAddiction {

    @InterfaceC65349Pkn("aweme_id")
    public String awemeId;

    @InterfaceC65349Pkn("popup_text")
    public String popupText;

    public String getAwemeId() {
        String str = this.awemeId;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getPopupText() {
        String str = this.popupText;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
