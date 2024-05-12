package com.ss.android.ugc.aweme.favorites.business;

import X.AbstractC73672Svk;
import X.C8Z3;
import X.E4Q;
import X.InterfaceC64989Pez;

/* loaded from: classes4.dex */
public interface FavoriteTabCountApi {
    public static final C8Z3 LIZ = C8Z3.LIZ;

    @E4Q("/aweme/v1/user/collect/count/")
    AbstractC73672Svk<FavoriteCountResponse> getTabCounts(@InterfaceC64989Pez("effect_channel") String str, @InterfaceC64989Pez("music_scene") String str2);

    @E4Q("/aweme/v1/user/collect/count/other/")
    AbstractC73672Svk<FavoriteCountResponse> getTabCountsForOtherProfile(@InterfaceC64989Pez("to_uid") String str);
}
