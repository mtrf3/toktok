package com.ss.android.ugc.aweme.placediscovery.model;

import X.X1D;
import com.ss.android.ugc.aweme.placediscovery.api.NearbyPoiCategoryResponse;
import com.ss.android.ugc.aweme.roaming.RoamingLocationInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class POICategoryApiState {
    public final boolean isFromCache;
    public final NearbyPoiCategoryResponse poiCategoryResponse;
    public final RoamingLocationInfo roamingLocationInfo;

    public static /* synthetic */ POICategoryApiState copy$default(POICategoryApiState pOICategoryApiState, RoamingLocationInfo roamingLocationInfo, boolean z, NearbyPoiCategoryResponse nearbyPoiCategoryResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            roamingLocationInfo = pOICategoryApiState.roamingLocationInfo;
        }
        if ((i & 2) != 0) {
            z = pOICategoryApiState.isFromCache;
        }
        if ((i & 4) != 0) {
            nearbyPoiCategoryResponse = pOICategoryApiState.poiCategoryResponse;
        }
        return pOICategoryApiState.copy(roamingLocationInfo, z, nearbyPoiCategoryResponse);
    }

    public final POICategoryApiState copy(RoamingLocationInfo roamingLocationInfo, boolean z, NearbyPoiCategoryResponse poiCategoryResponse) {
        o.LJIIIZ(poiCategoryResponse, "poiCategoryResponse");
        return new POICategoryApiState(roamingLocationInfo, z, poiCategoryResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof POICategoryApiState)) {
            return false;
        }
        POICategoryApiState pOICategoryApiState = (POICategoryApiState) obj;
        return o.LJ(this.roamingLocationInfo, pOICategoryApiState.roamingLocationInfo) && this.isFromCache == pOICategoryApiState.isFromCache && o.LJ(this.poiCategoryResponse, pOICategoryApiState.poiCategoryResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        RoamingLocationInfo roamingLocationInfo = this.roamingLocationInfo;
        int hashCode = (roamingLocationInfo == null ? 0 : roamingLocationInfo.hashCode()) * 31;
        boolean z = this.isFromCache;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.poiCategoryResponse.hashCode() + ((hashCode + i) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("POICategoryApiState(roamingLocationInfo=");
        LIZ.append(this.roamingLocationInfo);
        LIZ.append(", isFromCache=");
        LIZ.append(this.isFromCache);
        LIZ.append(", poiCategoryResponse=");
        LIZ.append(this.poiCategoryResponse);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final NearbyPoiCategoryResponse getPoiCategoryResponse() {
        return this.poiCategoryResponse;
    }

    public final RoamingLocationInfo getRoamingLocationInfo() {
        return this.roamingLocationInfo;
    }

    public final boolean isFromCache() {
        return this.isFromCache;
    }

    public POICategoryApiState(RoamingLocationInfo roamingLocationInfo, boolean z, NearbyPoiCategoryResponse poiCategoryResponse) {
        o.LJIIIZ(poiCategoryResponse, "poiCategoryResponse");
        this.roamingLocationInfo = roamingLocationInfo;
        this.isFromCache = z;
        this.poiCategoryResponse = poiCategoryResponse;
    }
}
