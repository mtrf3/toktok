package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class UpdateUserConfig {

    @InterfaceC65349Pkn("wx_toast_content")
    public String wxToastContent;

    @InterfaceC65349Pkn("wx_toast_enable")
    public Boolean wxToastEnable;

    @InterfaceC65349Pkn("wx_toast_frequence")
    public Integer wxToastFrequence;

    @InterfaceC65349Pkn("wx_toast_position")
    public Integer wxToastPosition;

    public String getWxToastContent() {
        String str = this.wxToastContent;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public Boolean getWxToastEnable() {
        Boolean bool = this.wxToastEnable;
        if (bool != null) {
            return bool;
        }
        throw new C158056If();
    }

    public Integer getWxToastFrequence() {
        Integer num = this.wxToastFrequence;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getWxToastPosition() {
        Integer num = this.wxToastPosition;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }
}
