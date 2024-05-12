package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SellingItem {

    @InterfaceC65349Pkn("da_info")
    public final DaInfo daInfo;

    @InterfaceC65349Pkn("opt_show_text")
    public final String optShowText;

    @InterfaceC65349Pkn("selling_item_type")
    public final int sellingItemType;

    @InterfaceC65349Pkn("show_text")
    public final String showText;

    /* JADX WARN: Multi-variable type inference failed */
    public SellingItem() {
        this(null, 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellingItem)) {
            return false;
        }
        SellingItem sellingItem = (SellingItem) obj;
        return o.LJ(this.showText, sellingItem.showText) && this.sellingItemType == sellingItem.sellingItemType && o.LJ(this.daInfo, sellingItem.daInfo) && o.LJ(this.optShowText, sellingItem.optShowText);
    }

    public final int hashCode() {
        String str = this.showText;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.sellingItemType) * 31;
        DaInfo daInfo = this.daInfo;
        int hashCode2 = (hashCode + (daInfo == null ? 0 : daInfo.hashCode())) * 31;
        String str2 = this.optShowText;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellingItem(showText=");
        LIZ.append(this.showText);
        LIZ.append(", sellingItemType=");
        LIZ.append(this.sellingItemType);
        LIZ.append(", daInfo=");
        LIZ.append(this.daInfo);
        LIZ.append(", optShowText=");
        return q.LIZIZ(LIZ, this.optShowText, ')', LIZ);
    }

    public SellingItem(String str, int i, DaInfo daInfo, String str2) {
        this.showText = str;
        this.sellingItemType = i;
        this.daInfo = daInfo;
        this.optShowText = str2;
    }

    public /* synthetic */ SellingItem(String str, int i, DaInfo daInfo, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : daInfo, (i2 & 8) != 0 ? null : str2);
    }
}
