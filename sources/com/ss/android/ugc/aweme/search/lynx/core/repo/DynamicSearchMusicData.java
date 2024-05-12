package com.ss.android.ugc.aweme.search.lynx.core.repo;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import com.google.gson.m;
import com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui.RequestInfo;
import defpackage.b0;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class DynamicSearchMusicData {

    @InterfaceC65349Pkn("is_non_personalized_search")
    public final int isNonPersonalizedSearch;

    @InterfaceC65349Pkn("searchMusicData")
    public final m musicList;

    @InterfaceC65349Pkn("requestInfo")
    public final RequestInfo requestInfo;

    @InterfaceC65349Pkn("enterFromSub")
    public final String searchEntranceSub;

    @InterfaceC65349Pkn("searchSessionId")
    public final long searchSessionId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DynamicSearchMusicData)) {
            return false;
        }
        DynamicSearchMusicData dynamicSearchMusicData = (DynamicSearchMusicData) obj;
        return o.LJ(this.musicList, dynamicSearchMusicData.musicList) && o.LJ(this.requestInfo, dynamicSearchMusicData.requestInfo) && this.searchSessionId == dynamicSearchMusicData.searchSessionId && o.LJ(this.searchEntranceSub, dynamicSearchMusicData.searchEntranceSub) && this.isNonPersonalizedSearch == dynamicSearchMusicData.isNonPersonalizedSearch;
    }

    public final int hashCode() {
        int hashCode;
        m mVar = this.musicList;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        return C79062V1e.LJ(this.searchEntranceSub, JBR.LIZJ(this.searchSessionId, (this.requestInfo.hashCode() + (hashCode * 31)) * 31, 31), 31) + this.isNonPersonalizedSearch;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DynamicSearchMusicData(musicList=");
        LIZ.append(this.musicList);
        LIZ.append(", requestInfo=");
        LIZ.append(this.requestInfo);
        LIZ.append(", searchSessionId=");
        LIZ.append(this.searchSessionId);
        LIZ.append(", searchEntranceSub=");
        LIZ.append(this.searchEntranceSub);
        LIZ.append(", isNonPersonalizedSearch=");
        return b0.LIZJ(LIZ, this.isNonPersonalizedSearch, ')', LIZ);
    }

    public DynamicSearchMusicData(m mVar, RequestInfo requestInfo, long j, String searchEntranceSub, int i) {
        o.LJIIIZ(requestInfo, "requestInfo");
        o.LJIIIZ(searchEntranceSub, "searchEntranceSub");
        this.musicList = mVar;
        this.requestInfo = requestInfo;
        this.searchSessionId = j;
        this.searchEntranceSub = searchEntranceSub;
        this.isNonPersonalizedSearch = i;
    }
}
