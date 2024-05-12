package com.ss.android.ugc.aweme.editSticker.text.font;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* loaded from: classes3.dex */
public class TextFontStyleData {
    public String LIZ;
    public int LIZIZ = 2;
    public Effect LIZJ;

    @InterfaceC65349Pkn("enable_bg_color")
    public int enableBgColor;

    @InterfaceC65349Pkn("enable_maskblur_light_color")
    public int enableMaskBlurLightColor;

    @InterfaceC65349Pkn("font_file_name")
    public String fileName;

    @InterfaceC65349Pkn("font_name")
    public String fontName;

    @InterfaceC65349Pkn("default_font_size")
    public int fontSize;

    @InterfaceC65349Pkn("title")
    public String title;

    public final boolean LIZ() {
        if (this.enableBgColor == 1) {
            return true;
        }
        return false;
    }

    public final boolean LIZIZ() {
        if (this.enableMaskBlurLightColor == 1) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LIZIZ == 1) {
            return true;
        }
        return false;
    }
}
