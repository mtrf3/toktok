package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionTargetResCfg {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("duration")
    public final Long duration;

    @InterfaceC65349Pkn("image")
    public final DiversionImage image;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("show_arrow")
    public final boolean showArrow;

    @InterfaceC65349Pkn("show_avatar")
    public final boolean showAvatar;

    @InterfaceC65349Pkn("show_text")
    public final boolean showText;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("text_color")
    public final String textColor;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionTargetResCfg)) {
            return false;
        }
        DiversionTargetResCfg diversionTargetResCfg = (DiversionTargetResCfg) obj;
        return o.LJ(this.text, diversionTargetResCfg.text) && o.LJ(this.image, diversionTargetResCfg.image) && o.LJ(this.duration, diversionTargetResCfg.duration) && o.LJ(this.schema, diversionTargetResCfg.schema) && this.showArrow == diversionTargetResCfg.showArrow && this.showText == diversionTargetResCfg.showText && this.showAvatar == diversionTargetResCfg.showAvatar && o.LJ(this.backgroundColor, diversionTargetResCfg.backgroundColor) && o.LJ(this.textColor, diversionTargetResCfg.textColor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        DiversionImage diversionImage = this.image;
        int hashCode2 = (hashCode + (diversionImage == null ? 0 : diversionImage.hashCode())) * 31;
        Long l = this.duration;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.schema;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.showArrow;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode4 + i) * 31;
        boolean z2 = this.showText;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.showAvatar ? 1 : 0)) * 31;
        String str3 = this.backgroundColor;
        int hashCode5 = (i4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textColor;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiversionTargetResCfg(text=");
        LIZ.append(this.text);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", duration=");
        LIZ.append(this.duration);
        LIZ.append(", schema=");
        LIZ.append(this.schema);
        LIZ.append(", showArrow=");
        LIZ.append(this.showArrow);
        LIZ.append(", showText=");
        LIZ.append(this.showText);
        LIZ.append(", showAvatar=");
        LIZ.append(this.showAvatar);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", textColor=");
        return q.LIZIZ(LIZ, this.textColor, ')', LIZ);
    }

    public DiversionTargetResCfg(String str, DiversionImage diversionImage, Long l, String str2, boolean z, boolean z2, boolean z3, String str3, String str4) {
        this.text = str;
        this.image = diversionImage;
        this.duration = l;
        this.schema = str2;
        this.showArrow = z;
        this.showText = z2;
        this.showAvatar = z3;
        this.backgroundColor = str3;
        this.textColor = str4;
    }
}
