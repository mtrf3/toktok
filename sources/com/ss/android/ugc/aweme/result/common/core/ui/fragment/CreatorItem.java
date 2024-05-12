package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CreatorItem {

    @InterfaceC65349Pkn("creator_id")
    public final String creatorId;

    @InterfaceC65349Pkn("has_official_shop")
    public final Boolean hasOfficialShop;

    @InterfaceC65349Pkn("shop_id")
    public final String shopId;

    /* JADX WARN: Multi-variable type inference failed */
    public CreatorItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatorItem)) {
            return false;
        }
        CreatorItem creatorItem = (CreatorItem) obj;
        return o.LJ(this.creatorId, creatorItem.creatorId) && o.LJ(this.hasOfficialShop, creatorItem.hasOfficialShop) && o.LJ(this.shopId, creatorItem.shopId);
    }

    public final int hashCode() {
        String str = this.creatorId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hasOfficialShop;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.shopId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CreatorItem(creatorId=");
        LIZ.append(this.creatorId);
        LIZ.append(", hasOfficialShop=");
        LIZ.append(this.hasOfficialShop);
        LIZ.append(", shopId=");
        return q.LIZIZ(LIZ, this.shopId, ')', LIZ);
    }

    public CreatorItem(String str, Boolean bool, String str2) {
        this.creatorId = str;
        this.hasOfficialShop = bool;
        this.shopId = str2;
    }

    public /* synthetic */ CreatorItem(String str, Boolean bool, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? Boolean.FALSE : bool, (i & 4) != 0 ? null : str2);
    }
}
