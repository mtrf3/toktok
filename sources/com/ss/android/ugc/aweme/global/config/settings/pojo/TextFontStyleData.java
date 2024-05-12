package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes3.dex */
public class TextFontStyleData {

    @InterfaceC65349Pkn("enable_bg_color")
    public Integer enableBgColor;

    @InterfaceC65349Pkn("enable_maskblur_light_color")
    public Integer enableMaskblurLightColor;

    @InterfaceC65349Pkn("extra_type")
    public Integer extraType;

    @InterfaceC65349Pkn("font_name")
    public String fontName;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("url")
    public String url;

    public Integer getEnableBgColor() {
        Integer num = this.enableBgColor;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getEnableMaskblurLightColor() {
        Integer num = this.enableMaskblurLightColor;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public Integer getExtraType() {
        Integer num = this.extraType;
        if (num != null) {
            return num;
        }
        throw new C158056If();
    }

    public String getFontName() {
        String str = this.fontName;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getUrl() {
        String str = this.url;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
