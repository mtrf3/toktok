package com.ss.android.ugc.aweme.compliance.business.banappeal.popup.model;

import X.EnumC63033OoX;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PopButton implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("btn_content")
    public final String btnContent;

    @InterfaceC65349Pkn("btn_style")
    public final int btnStyle;

    @InterfaceC65349Pkn("btn_type")
    public final Integer btnType;

    @InterfaceC65349Pkn("btn_url")
    public final String btnUrl;

    public static /* synthetic */ PopButton copy$default(PopButton popButton, String str, int i, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = popButton.btnContent;
        }
        if ((i2 & 2) != 0) {
            i = popButton.btnStyle;
        }
        if ((i2 & 4) != 0) {
            str2 = popButton.btnUrl;
        }
        if ((i2 & 8) != 0) {
            num = popButton.btnType;
        }
        return popButton.copy(str, i, str2, num);
    }

    public final PopButton copy(String btnContent, int i, String str, Integer num) {
        o.LJIIIZ(btnContent, "btnContent");
        return new PopButton(btnContent, i, str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopButton)) {
            return false;
        }
        PopButton popButton = (PopButton) obj;
        return o.LJ(this.btnContent, popButton.btnContent) && this.btnStyle == popButton.btnStyle && o.LJ(this.btnUrl, popButton.btnUrl) && o.LJ(this.btnType, popButton.btnType);
    }

    public int hashCode() {
        int hashCode = ((this.btnContent.hashCode() * 31) + this.btnStyle) * 31;
        String str = this.btnUrl;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.btnType;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PopButton(btnContent=");
        LIZ.append(this.btnContent);
        LIZ.append(", btnStyle=");
        LIZ.append(this.btnStyle);
        LIZ.append(", btnUrl=");
        LIZ.append(this.btnUrl);
        LIZ.append(", btnType=");
        return s0.LIZJ(LIZ, this.btnType, ')', LIZ);
    }

    public final String getBtnContent() {
        return this.btnContent;
    }

    public final int getBtnStyle() {
        return this.btnStyle;
    }

    public final Integer getBtnType() {
        return this.btnType;
    }

    public final String getBtnUrl() {
        return this.btnUrl;
    }

    public PopButton(String btnContent, int i, String str, Integer num) {
        o.LJIIIZ(btnContent, "btnContent");
        this.btnContent = btnContent;
        this.btnStyle = i;
        this.btnUrl = str;
        this.btnType = num;
    }

    public /* synthetic */ PopButton(String str, int i, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? EnumC63033OoX.PRIMARY.getValue() : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? -1 : num);
    }
}
