package com.ss.android.ugc.aweme.search.pages.result.placesearch.core.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DynamicSearchPlaceData {

    @InterfaceC65349Pkn("requestInfo")
    public final RequestInfo requestInfo;

    @InterfaceC65349Pkn("searchPOIData")
    public final m searchPOIData;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSearchPlaceData)) {
            return false;
        }
        DynamicSearchPlaceData dynamicSearchPlaceData = (DynamicSearchPlaceData) obj;
        return o.LJ(this.searchPOIData, dynamicSearchPlaceData.searchPOIData) && o.LJ(this.requestInfo, dynamicSearchPlaceData.requestInfo);
    }

    public final int hashCode() {
        m mVar = this.searchPOIData;
        return this.requestInfo.hashCode() + ((mVar == null ? 0 : mVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSearchPlaceData(searchPOIData=");
        LIZ.append(this.searchPOIData);
        LIZ.append(", requestInfo=");
        LIZ.append(this.requestInfo);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public DynamicSearchPlaceData(m mVar, RequestInfo requestInfo) {
        o.LJIIIZ(requestInfo, "requestInfo");
        this.searchPOIData = mVar;
        this.requestInfo = requestInfo;
    }
}
