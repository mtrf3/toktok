package com.ss.android.ugc.aweme.search.source.neo.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.K3T;
import defpackage.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EffectJsonData extends F9E {

    @InterfaceC65349Pkn("creation_feed_scene_info")
    public final s<FeedSceneInfo> creationFeedSceneInfo;

    @InterfaceC65349Pkn("search_effect_scene_info")
    public final s<SearchSessionData> searchEffectSceneInfo;

    public EffectJsonData() {
        this(null, null, 3, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.searchEffectSceneInfo, this.creationFeedSceneInfo};
    }

    public EffectJsonData(s<SearchSessionData> searchEffectSceneInfo, s<FeedSceneInfo> creationFeedSceneInfo) {
        o.LJIIIZ(searchEffectSceneInfo, "searchEffectSceneInfo");
        o.LJIIIZ(creationFeedSceneInfo, "creationFeedSceneInfo");
        this.searchEffectSceneInfo = searchEffectSceneInfo;
        this.creationFeedSceneInfo = creationFeedSceneInfo;
    }

    public EffectJsonData(s sVar, s sVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new s(K3T.LIZIZ().effectSceneNum) : sVar, (i & 2) != 0 ? new s(K3T.LIZ()) : sVar2);
    }
}
