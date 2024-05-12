package com.ss.android.ugc.aweme.encouragepublish.manager;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyVideoCardPoiInfo {

    @InterfaceC65349Pkn("play_count")
    public final String playCount;

    @InterfaceC65349Pkn("poi_name")
    public final String poiName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyVideoCardPoiInfo)) {
            return false;
        }
        NearbyVideoCardPoiInfo nearbyVideoCardPoiInfo = (NearbyVideoCardPoiInfo) obj;
        return o.LJ(this.poiName, nearbyVideoCardPoiInfo.poiName) && o.LJ(this.playCount, nearbyVideoCardPoiInfo.playCount);
    }

    public final int hashCode() {
        String str = this.poiName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.playCount;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyVideoCardPoiInfo(poiName=");
        LIZ.append(this.poiName);
        LIZ.append(", playCount=");
        return q.LIZIZ(LIZ, this.playCount, ')', LIZ);
    }

    public NearbyVideoCardPoiInfo(String str, String str2) {
        this.poiName = str;
        this.playCount = str2;
    }
}
