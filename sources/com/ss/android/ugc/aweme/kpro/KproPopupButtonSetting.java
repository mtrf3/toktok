package com.ss.android.ugc.aweme.kpro;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class KproPopupButtonSetting {

    @InterfaceC65349Pkn("background_image_url")
    public final String backGroundImageUrl;

    @InterfaceC65349Pkn("color")
    public final String color;

    @InterfaceC65349Pkn("label")
    public final String label;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KproPopupButtonSetting)) {
            return false;
        }
        KproPopupButtonSetting kproPopupButtonSetting = (KproPopupButtonSetting) obj;
        return o.LJ(this.label, kproPopupButtonSetting.label) && o.LJ(this.color, kproPopupButtonSetting.color) && o.LJ(this.backGroundImageUrl, kproPopupButtonSetting.backGroundImageUrl);
    }

    public final int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.color;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.backGroundImageUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KproPopupButtonSetting(label=");
        LIZ.append(this.label);
        LIZ.append(", color=");
        LIZ.append(this.color);
        LIZ.append(", backGroundImageUrl=");
        return q.LIZIZ(LIZ, this.backGroundImageUrl, ')', LIZ);
    }

    public KproPopupButtonSetting(String str, String str2, String str3) {
        this.label = str;
        this.color = str2;
        this.backGroundImageUrl = str3;
    }
}
