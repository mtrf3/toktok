package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DynamicSearchShopData {

    @InterfaceC65349Pkn("requestInfo")
    public final RequestInfo requestInfo;

    @InterfaceC65349Pkn("searchShopData")
    public final m shopList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSearchShopData)) {
            return false;
        }
        DynamicSearchShopData dynamicSearchShopData = (DynamicSearchShopData) obj;
        return o.LJ(this.shopList, dynamicSearchShopData.shopList) && o.LJ(this.requestInfo, dynamicSearchShopData.requestInfo);
    }

    public final int hashCode() {
        m mVar = this.shopList;
        return this.requestInfo.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSearchShopData(shopList=");
        LIZ.append(this.shopList);
        LIZ.append(", requestInfo=");
        LIZ.append(this.requestInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DynamicSearchShopData(m mVar, RequestInfo requestInfo) {
        o.LJIIIZ(requestInfo, "requestInfo");
        this.shopList = mVar;
        this.requestInfo = requestInfo;
    }
}
