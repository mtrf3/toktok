package com.ss.android.ugc.aweme.im.sdk.chat.feature.ec.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECBannerProductInfo {

    @InterfaceC65349Pkn("amount")
    public final String amount;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("price")
    public final String price;

    @InterfaceC65349Pkn("thumbnail")
    public final String thumbnail;

    /* JADX WARN: Multi-variable type inference failed */
    public ECBannerProductInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECBannerProductInfo)) {
            return false;
        }
        ECBannerProductInfo eCBannerProductInfo = (ECBannerProductInfo) obj;
        return o.LJ(this.thumbnail, eCBannerProductInfo.thumbnail) && o.LJ(this.name, eCBannerProductInfo.name) && o.LJ(this.amount, eCBannerProductInfo.amount) && o.LJ(this.price, eCBannerProductInfo.price);
    }

    public final int hashCode() {
        String str = this.thumbnail;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.amount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.price;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECBannerProductInfo(thumbnail=");
        LIZ.append(this.thumbnail);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", amount=");
        LIZ.append(this.amount);
        LIZ.append(", price=");
        return q.LIZIZ(LIZ, this.price, ')', LIZ);
    }

    public ECBannerProductInfo(String str, String str2, String str3, String str4) {
        this.thumbnail = str;
        this.name = str2;
        this.amount = str3;
        this.price = str4;
    }

    public /* synthetic */ ECBannerProductInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
