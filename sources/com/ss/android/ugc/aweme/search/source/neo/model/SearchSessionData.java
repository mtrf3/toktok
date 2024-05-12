package com.ss.android.ugc.aweme.search.source.neo.model;

import X.InterfaceC65349Pkn;
import X.K3T;
import X.X1D;
import defpackage.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchSessionData {

    @InterfaceC65349Pkn("search_id_info")
    public final s<SearchSceneInfo> searchIdInfo;

    @InterfaceC65349Pkn("search_session_id")
    public final String searchSessionId;

    public SearchSessionData() {
        this(null, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchSessionData)) {
            return false;
        }
        SearchSessionData searchSessionData = (SearchSessionData) obj;
        return o.LJ(this.searchSessionId, searchSessionData.searchSessionId) && o.LJ(this.searchIdInfo, searchSessionData.searchIdInfo);
    }

    public final int hashCode() {
        return this.searchIdInfo.hashCode() + (this.searchSessionId.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[searchSessionId:");
        LIZ.append(this.searchSessionId);
        LIZ.append(", searchIdInfo:");
        LIZ.append(this.searchIdInfo);
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }

    public SearchSessionData(String searchSessionId, s<SearchSceneInfo> searchIdInfo) {
        o.LJIIIZ(searchSessionId, "searchSessionId");
        o.LJIIIZ(searchIdInfo, "searchIdInfo");
        this.searchSessionId = searchSessionId;
        this.searchIdInfo = searchIdInfo;
    }

    public SearchSessionData(String str, s sVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new s(K3T.LIZIZ().effectSceneSearchIdNum) : sVar);
    }
}
