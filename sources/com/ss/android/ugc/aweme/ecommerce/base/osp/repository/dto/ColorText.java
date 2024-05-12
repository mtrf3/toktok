package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ColorText {

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color")
    public final Integer textColor;

    @InterfaceC65349Pkn("text_font")
    public final Integer textFont;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorText)) {
            return false;
        }
        ColorText colorText = (ColorText) obj;
        return o.LJ(this.text, colorText.text) && o.LJ(this.textColor, colorText.textColor) && o.LJ(this.textFont, colorText.textFont);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.textColor;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.textFont;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ColorText(text=");
        LIZ.append(this.text);
        LIZ.append(", textColor=");
        LIZ.append(this.textColor);
        LIZ.append(", textFont=");
        return s0.LIZJ(LIZ, this.textFont, ')', LIZ);
    }

    public ColorText(String str, Integer num, Integer num2) {
        this.text = str;
        this.textColor = num;
        this.textFont = num2;
    }
}
