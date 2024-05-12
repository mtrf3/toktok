package com.ss.android.ugc.aweme.kids.liked.api;

import X.AbstractC73672Svk;
import X.C40921G4f;
import X.E8L;
import X.InterfaceC64986Pew;
import com.ss.android.ugc.aweme.kids.liked.model.KidFeedItemList;

/* loaded from: classes7.dex */
public interface FavoriteApi {
    public static final C40921G4f LIZ = C40921G4f.LIZ;

    @E8L("/tiktok/v1/kids/aweme/favorite/")
    AbstractC73672Svk<KidFeedItemList> getFavoriteList(@InterfaceC64986Pew("max_cursor") long j, @InterfaceC64986Pew("min_cursor") long j2, @InterfaceC64986Pew("count") int i);
}
