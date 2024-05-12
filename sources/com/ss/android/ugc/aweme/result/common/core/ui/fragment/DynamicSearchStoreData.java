package com.ss.android.ugc.aweme.result.common.core.ui.fragment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DynamicSearchStoreData {

    @InterfaceC65349Pkn("requestInfo")
    public final RequestInfo requestInfo;

    @InterfaceC65349Pkn("searchResponseData")
    public final m storeList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSearchStoreData)) {
            return false;
        }
        DynamicSearchStoreData dynamicSearchStoreData = (DynamicSearchStoreData) obj;
        return o.LJ(this.storeList, dynamicSearchStoreData.storeList) && o.LJ(this.requestInfo, dynamicSearchStoreData.requestInfo);
    }

    public final int hashCode() {
        m mVar = this.storeList;
        return this.requestInfo.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSearchStoreData(storeList=");
        LIZ.append(this.storeList);
        LIZ.append(", requestInfo=");
        LIZ.append(this.requestInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DynamicSearchStoreData(m mVar, RequestInfo requestInfo) {
        o.LJIIIZ(requestInfo, "requestInfo");
        this.storeList = mVar;
        this.requestInfo = requestInfo;
    }
}
