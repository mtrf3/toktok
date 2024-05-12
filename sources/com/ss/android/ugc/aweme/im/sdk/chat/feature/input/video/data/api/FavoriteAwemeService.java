package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.data.api;

import X.AbstractC73638SvC;
import X.C57360MfE;
import X.E4Q;
import X.InterfaceC64989Pez;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;

/* loaded from: classes10.dex */
public interface FavoriteAwemeService {
    public static final C57360MfE LIZ = C57360MfE.LIZ;

    @E4Q("/aweme/v1/aweme/favorite/")
    AbstractC73638SvC<FeedItemList> getFavoriteAweme(@InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("user_id") String str, @InterfaceC64989Pez("sec_user_id") String str2, @InterfaceC64989Pez("max_cursor") long j);
}
