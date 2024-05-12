package com.ss.android.ugc.aweme.commerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ShopAdStruct implements Serializable {

    @InterfaceC65349Pkn("ad_id")
    public String adId;

    @InterfaceC65349Pkn("creative_id")
    public String creativeId;

    @InterfaceC65349Pkn("is_ad")
    public String isAd;

    public static /* synthetic */ ShopAdStruct copy$default(ShopAdStruct shopAdStruct, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shopAdStruct.isAd;
        }
        if ((i & 2) != 0) {
            str2 = shopAdStruct.adId;
        }
        if ((i & 4) != 0) {
            str3 = shopAdStruct.creativeId;
        }
        return shopAdStruct.copy(str, str2, str3);
    }

    public final ShopAdStruct copy(String str, String str2, String str3) {
        return new ShopAdStruct(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShopAdStruct)) {
            return false;
        }
        ShopAdStruct shopAdStruct = (ShopAdStruct) obj;
        return o.LJ(this.isAd, shopAdStruct.isAd) && o.LJ(this.adId, shopAdStruct.adId) && o.LJ(this.creativeId, shopAdStruct.creativeId);
    }

    public int hashCode() {
        String str = this.isAd;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.adId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.creativeId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShopAdStruct(isAd=");
        LIZ.append(this.isAd);
        LIZ.append(", adId=");
        LIZ.append(this.adId);
        LIZ.append(", creativeId=");
        return q.LIZIZ(LIZ, this.creativeId, ')', LIZ);
    }

    public final String getAdId() {
        return this.adId;
    }

    public final String getCreativeId() {
        return this.creativeId;
    }

    public final String isAd() {
        return this.isAd;
    }

    public final void setAd(String str) {
        this.isAd = str;
    }

    public final void setAdId(String str) {
        this.adId = str;
    }

    public final void setCreativeId(String str) {
        this.creativeId = str;
    }

    public ShopAdStruct(String str, String str2, String str3) {
        this.isAd = str;
        this.adId = str2;
        this.creativeId = str3;
    }

    public /* synthetic */ ShopAdStruct(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
