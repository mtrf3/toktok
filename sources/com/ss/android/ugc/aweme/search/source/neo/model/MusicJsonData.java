package com.ss.android.ugc.aweme.search.source.neo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.K3T;
import com.ss.android.ugc.aweme.discover.helper.LastSearch;
import defpackage.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class MusicJsonData extends F9E {

    @InterfaceC65349Pkn("creation_feed_scene_info")
    public final s<FeedSceneInfo> creationFeedSceneInfo;

    @InterfaceC65349Pkn("query_list")
    public List<LastSearch> queryList;

    @InterfaceC65349Pkn("search_music_scene_info")
    public s<SearchSceneInfo> searchMusicSceneInfo;

    public MusicJsonData() {
        this(null, null, null, 7, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.queryList, this.searchMusicSceneInfo, this.creationFeedSceneInfo};
    }

    public MusicJsonData(List<LastSearch> queryList, s<SearchSceneInfo> searchMusicSceneInfo, s<FeedSceneInfo> creationFeedSceneInfo) {
        o.LJIIIZ(queryList, "queryList");
        o.LJIIIZ(searchMusicSceneInfo, "searchMusicSceneInfo");
        o.LJIIIZ(creationFeedSceneInfo, "creationFeedSceneInfo");
        this.queryList = queryList;
        this.searchMusicSceneInfo = searchMusicSceneInfo;
        this.creationFeedSceneInfo = creationFeedSceneInfo;
    }

    public MusicJsonData(List list, s sVar, s sVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new s(K3T.LIZIZ().musicSceneNum) : sVar, (i & 4) != 0 ? new s(K3T.LIZ()) : sVar2);
    }
}
