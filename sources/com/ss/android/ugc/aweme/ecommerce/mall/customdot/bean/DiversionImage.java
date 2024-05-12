package com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class DiversionImage {

    @InterfaceC65349Pkn("dark")
    public final String darkUrl;

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("light")
    public final String lightUrl;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    public static /* synthetic */ DiversionImage copy$default(DiversionImage diversionImage, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diversionImage.lightUrl;
        }
        if ((i & 2) != 0) {
            str2 = diversionImage.darkUrl;
        }
        if ((i & 4) != 0) {
            num = diversionImage.width;
        }
        if ((i & 8) != 0) {
            num2 = diversionImage.height;
        }
        return diversionImage.copy(str, str2, num, num2);
    }

    public final DiversionImage copy(String str, String str2, Integer num, Integer num2) {
        return new DiversionImage(str, str2, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiversionImage)) {
            return false;
        }
        DiversionImage diversionImage = (DiversionImage) obj;
        return o.LJ(this.lightUrl, diversionImage.lightUrl) && o.LJ(this.darkUrl, diversionImage.darkUrl) && o.LJ(this.width, diversionImage.width) && o.LJ(this.height, diversionImage.height);
    }

    public int hashCode() {
        String str = this.lightUrl;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.darkUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DiversionImage(lightUrl=");
        LIZ.append(this.lightUrl);
        LIZ.append(", darkUrl=");
        LIZ.append(this.darkUrl);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return s0.LIZJ(LIZ, this.height, ')', LIZ);
    }

    public final String getDarkUrl() {
        return this.darkUrl;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getLightUrl() {
        return this.lightUrl;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public DiversionImage(String str, String str2, Integer num, Integer num2) {
        this.lightUrl = str;
        this.darkUrl = str2;
        this.width = num;
        this.height = num2;
    }
}
