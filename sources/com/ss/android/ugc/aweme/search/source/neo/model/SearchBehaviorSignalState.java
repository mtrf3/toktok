package com.ss.android.ugc.aweme.search.source.neo.model;

import X.AnonymousClass629;
import X.C113554cx;
import X.InterfaceC63694OzC;
import X.InterfaceC65349Pkn;
import X.K3T;
import X.X1D;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import defpackage.q;
import defpackage.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchBehaviorSignalState implements InterfaceC63694OzC<SearchBehaviorSignalState> {
    public final transient String LJLIL;

    @InterfaceC65349Pkn("feed_scene_info")
    public final s<FeedSceneInfo> feedSceneInfo;

    @InterfaceC65349Pkn("query_list")
    public List<LastSearch> queryList;

    @InterfaceC65349Pkn("search_scene_info")
    public final s<SearchSceneInfo> searchSceneInfo;

    public SearchBehaviorSignalState() {
        this(null, null, null, null, 15, null);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() + ((this.feedSceneInfo.hashCode() + ((this.searchSceneInfo.hashCode() + (this.queryList.hashCode() * 31)) * 31)) * 31);
    }

    @Override // X.InterfaceC54035LIp
    public final Map<String, Object> LLJZ() {
        return LLLILZ();
    }

    @Override // X.InterfaceC54035LIp
    public final Map<String, Object> LLLILZ() {
        return C113554cx.LJJJLIIL();
    }

    @Override // X.InterfaceC54035LIp
    public final Map<String, Object> LLLLIL() {
        return C113554cx.LJJJLIIL();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchBehaviorSignalState(queryList=");
        LIZ.append(this.queryList);
        LIZ.append(", searchSceneInfo=");
        LIZ.append(this.searchSceneInfo);
        LIZ.append(", feedSceneInfo=");
        LIZ.append(this.feedSceneInfo);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchBehaviorSignalState)) {
            return false;
        }
        SearchBehaviorSignalState searchBehaviorSignalState = (SearchBehaviorSignalState) obj;
        if (o.LJ(this.queryList, searchBehaviorSignalState.queryList) && o.LJ(this.searchSceneInfo, searchBehaviorSignalState.searchSceneInfo) && o.LJ(this.feedSceneInfo, searchBehaviorSignalState.feedSceneInfo) && o.LJ(this.LJLIL, searchBehaviorSignalState.LJLIL)) {
            return true;
        }
        return false;
    }

    public SearchBehaviorSignalState(List<LastSearch> queryList, s<SearchSceneInfo> searchSceneInfo, s<FeedSceneInfo> feedSceneInfo, String sourceId) {
        o.LJIIIZ(queryList, "queryList");
        o.LJIIIZ(searchSceneInfo, "searchSceneInfo");
        o.LJIIIZ(feedSceneInfo, "feedSceneInfo");
        o.LJIIIZ(sourceId, "sourceId");
        this.queryList = queryList;
        this.searchSceneInfo = searchSceneInfo;
        this.feedSceneInfo = feedSceneInfo;
        this.LJLIL = sourceId;
    }

    public SearchBehaviorSignalState(List list, s sVar, s sVar2, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new s(K3T.LIZIZ().searchSceneNum) : sVar, (i & 4) != 0 ? new s(K3T.LIZ()) : sVar2, (i & 8) != 0 ? AnonymousClass629.LIZ("randomUUID().toString()") : str);
    }
}
