package com.ss.android.ugc.aweme.services.external.ui;

import X.C79062V1e;
import X.JBR;
import X.X1D;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.model.SearchCreationExtraData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SearchAlbumParams {
    public final CreativeInfo creativeInfo;
    public final String enterFrom;
    public final long invokeTime;
    public final SearchCreationExtraData searchCreationExtraData;
    public final String shootWay;

    public static /* synthetic */ SearchAlbumParams copy$default(SearchAlbumParams searchAlbumParams, String str, String str2, long j, CreativeInfo creativeInfo, SearchCreationExtraData searchCreationExtraData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchAlbumParams.shootWay;
        }
        if ((i & 2) != 0) {
            str2 = searchAlbumParams.enterFrom;
        }
        if ((i & 4) != 0) {
            j = searchAlbumParams.invokeTime;
        }
        if ((i & 8) != 0) {
            creativeInfo = searchAlbumParams.creativeInfo;
        }
        if ((i & 16) != 0) {
            searchCreationExtraData = searchAlbumParams.searchCreationExtraData;
        }
        return searchAlbumParams.copy(str, str2, j, creativeInfo, searchCreationExtraData);
    }

    public final SearchAlbumParams copy(String shootWay, String enterFrom, long j, CreativeInfo creativeInfo, SearchCreationExtraData searchCreationExtraData) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        return new SearchAlbumParams(shootWay, enterFrom, j, creativeInfo, searchCreationExtraData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchAlbumParams)) {
            return false;
        }
        SearchAlbumParams searchAlbumParams = (SearchAlbumParams) obj;
        return o.LJ(this.shootWay, searchAlbumParams.shootWay) && o.LJ(this.enterFrom, searchAlbumParams.enterFrom) && this.invokeTime == searchAlbumParams.invokeTime && o.LJ(this.creativeInfo, searchAlbumParams.creativeInfo) && o.LJ(this.searchCreationExtraData, searchAlbumParams.searchCreationExtraData);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchAlbumParams(shootWay=");
        LIZ.append(this.shootWay);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", invokeTime=");
        LIZ.append(this.invokeTime);
        LIZ.append(", creativeInfo=");
        LIZ.append(this.creativeInfo);
        LIZ.append(", searchCreationExtraData=");
        LIZ.append(this.searchCreationExtraData);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.creativeInfo.hashCode() + JBR.LIZJ(this.invokeTime, C79062V1e.LJ(this.enterFrom, this.shootWay.hashCode() * 31, 31), 31)) * 31;
        SearchCreationExtraData searchCreationExtraData = this.searchCreationExtraData;
        if (searchCreationExtraData == null) {
            hashCode = 0;
        } else {
            hashCode = searchCreationExtraData.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final CreativeInfo getCreativeInfo() {
        return this.creativeInfo;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final long getInvokeTime() {
        return this.invokeTime;
    }

    public final SearchCreationExtraData getSearchCreationExtraData() {
        return this.searchCreationExtraData;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public SearchAlbumParams(String shootWay, String enterFrom, long j, CreativeInfo creativeInfo, SearchCreationExtraData searchCreationExtraData) {
        o.LJIIIZ(shootWay, "shootWay");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(creativeInfo, "creativeInfo");
        this.shootWay = shootWay;
        this.enterFrom = enterFrom;
        this.invokeTime = j;
        this.creativeInfo = creativeInfo;
        this.searchCreationExtraData = searchCreationExtraData;
    }

    public /* synthetic */ SearchAlbumParams(String str, String str2, long j, CreativeInfo creativeInfo, SearchCreationExtraData searchCreationExtraData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? new CreativeInfo(null, 0, null, 7, null) : creativeInfo, (i & 16) != 0 ? new SearchCreationExtraData(false, null, null, 7, null) : searchCreationExtraData);
    }
}
