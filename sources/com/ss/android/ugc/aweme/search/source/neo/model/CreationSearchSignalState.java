package com.ss.android.ugc.aweme.search.source.neo.model;

import X.AnonymousClass629;
import X.C113554cx;
import X.InterfaceC63694OzC;
import X.InterfaceC65349Pkn;
import X.K3T;
import X.X1D;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.q;
import defpackage.s;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class CreationSearchSignalState implements InterfaceC63694OzC<CreationSearchSignalState> {
    public final transient String LJLIL;

    @InterfaceC65349Pkn("creation_feed_scene_info")
    public final s<FeedSceneInfo> creationFeedSceneInfo;

    @InterfaceC65349Pkn("query_list")
    public List<LastSearch> queryList;

    @InterfaceC65349Pkn("search_effect_scene_info")
    public final s<SearchSessionData> searchEffectSceneInfo;

    @InterfaceC65349Pkn("search_music_scene_info")
    public s<SearchSceneInfo> searchMusicSceneInfo;

    public CreationSearchSignalState() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // X.InterfaceC54035LIp
    public final boolean LLD() {
        return true;
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() + ((this.creationFeedSceneInfo.hashCode() + ((this.searchEffectSceneInfo.hashCode() + ((this.searchMusicSceneInfo.hashCode() + (this.queryList.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String LIZ() {
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new EffectJsonData(this.searchEffectSceneInfo, this.creationFeedSceneInfo));
        o.LJIIIIZZ(json, "get().gson.toJson(\n     …\n            ),\n        )");
        return json;
    }

    public final String LIZIZ() {
        String json = GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), new MusicJsonData(this.queryList, this.searchMusicSceneInfo, this.creationFeedSceneInfo));
        o.LJIIIIZZ(json, "get().gson.toJson(\n     …\n            ),\n        )");
        return json;
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
        LIZ.append("CreationSearchSignalState(queryList=");
        LIZ.append(this.queryList);
        LIZ.append(", searchMusicSceneInfo=");
        LIZ.append(this.searchMusicSceneInfo);
        LIZ.append(", searchEffectSceneInfo=");
        LIZ.append(this.searchEffectSceneInfo);
        LIZ.append(", creationFeedSceneInfo=");
        LIZ.append(this.creationFeedSceneInfo);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreationSearchSignalState)) {
            return false;
        }
        CreationSearchSignalState creationSearchSignalState = (CreationSearchSignalState) obj;
        if (o.LJ(this.queryList, creationSearchSignalState.queryList) && o.LJ(this.searchMusicSceneInfo, creationSearchSignalState.searchMusicSceneInfo) && o.LJ(this.searchEffectSceneInfo, creationSearchSignalState.searchEffectSceneInfo) && o.LJ(this.creationFeedSceneInfo, creationSearchSignalState.creationFeedSceneInfo) && o.LJ(this.LJLIL, creationSearchSignalState.LJLIL)) {
            return true;
        }
        return false;
    }

    public CreationSearchSignalState(List<LastSearch> queryList, s<SearchSceneInfo> searchMusicSceneInfo, s<SearchSessionData> searchEffectSceneInfo, s<FeedSceneInfo> creationFeedSceneInfo, String sourceId) {
        o.LJIIIZ(queryList, "queryList");
        o.LJIIIZ(searchMusicSceneInfo, "searchMusicSceneInfo");
        o.LJIIIZ(searchEffectSceneInfo, "searchEffectSceneInfo");
        o.LJIIIZ(creationFeedSceneInfo, "creationFeedSceneInfo");
        o.LJIIIZ(sourceId, "sourceId");
        this.queryList = queryList;
        this.searchMusicSceneInfo = searchMusicSceneInfo;
        this.searchEffectSceneInfo = searchEffectSceneInfo;
        this.creationFeedSceneInfo = creationFeedSceneInfo;
        this.LJLIL = sourceId;
    }

    public CreationSearchSignalState(List list, s sVar, s sVar2, s sVar3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new s(K3T.LIZIZ().musicSceneNum) : sVar, (i & 4) != 0 ? new s(K3T.LIZIZ().effectSceneNum) : sVar2, (i & 8) != 0 ? new s(K3T.LIZ()) : sVar3, (i & 16) != 0 ? AnonymousClass629.LIZ("randomUUID().toString()") : str);
    }
}
