package com.ss.android.ugc.aweme.result.common.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EComMallLiveTabCardStruct {

    @InterfaceC65349Pkn("creator_card_info")
    public final EComCreatorSearchStruct creatorCardInfo;

    @InterfaceC65349Pkn("search_result_id")
    public final String searchResultId;

    @InterfaceC65349Pkn("shop_card_info")
    public final EComShopCardStruct shopCardInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EComMallLiveTabCardStruct)) {
            return false;
        }
        EComMallLiveTabCardStruct eComMallLiveTabCardStruct = (EComMallLiveTabCardStruct) obj;
        return o.LJ(this.shopCardInfo, eComMallLiveTabCardStruct.shopCardInfo) && o.LJ(this.creatorCardInfo, eComMallLiveTabCardStruct.creatorCardInfo) && o.LJ(this.searchResultId, eComMallLiveTabCardStruct.searchResultId);
    }

    public final int hashCode() {
        EComShopCardStruct eComShopCardStruct = this.shopCardInfo;
        int hashCode = (eComShopCardStruct == null ? 0 : eComShopCardStruct.hashCode()) * 31;
        EComCreatorSearchStruct eComCreatorSearchStruct = this.creatorCardInfo;
        int hashCode2 = (hashCode + (eComCreatorSearchStruct == null ? 0 : eComCreatorSearchStruct.hashCode())) * 31;
        String str = this.searchResultId;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EComMallLiveTabCardStruct(shopCardInfo=");
        LIZ.append(this.shopCardInfo);
        LIZ.append(", creatorCardInfo=");
        LIZ.append(this.creatorCardInfo);
        LIZ.append(", searchResultId=");
        return q.LIZIZ(LIZ, this.searchResultId, ')', LIZ);
    }

    public EComMallLiveTabCardStruct(EComShopCardStruct eComShopCardStruct, EComCreatorSearchStruct eComCreatorSearchStruct, String str) {
        this.shopCardInfo = eComShopCardStruct;
        this.creatorCardInfo = eComCreatorSearchStruct;
        this.searchResultId = str;
    }
}
