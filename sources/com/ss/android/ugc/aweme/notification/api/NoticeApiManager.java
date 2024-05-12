package com.ss.android.ugc.aweme.notification.api;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.M57;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.notification.bean.FavoriteListResponse;
import com.ss.android.ugc.aweme.notification.bean.LikeListResponse;
import com.ss.android.ugc.aweme.notification.bean.TranslationLikeListResponse;

/* loaded from: classes10.dex */
public final class NoticeApiManager {
    public static final NoticeApi LIZ = (NoticeApi) RetrofitFactory.LIZLLL().create(M57.LIZ).create(NoticeApi.class);

    /* loaded from: classes10.dex */
    public interface NoticeApi {
        @E4Q("/aweme/v1/aweme/collecteduser/")
        C10K<FavoriteListResponse> fetchFavoriteUserList(@InterfaceC64989Pez("aweme_id") String str, @InterfaceC64989Pez("cursor") long j, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("scenario") int i2);

        @E4Q("/aweme/v1/digg/list/")
        C10K<LikeListResponse> fetchLikeList(@InterfaceC64989Pez("max_cursor") long j, @InterfaceC64989Pez("min_cursor") long j2, @InterfaceC64989Pez("count") int i, @InterfaceC64989Pez("is_new") boolean z, @InterfaceC64989Pez("digg_type") int i2, @InterfaceC64989Pez("ref_id") String str, @InterfaceC64989Pez("user_type") int i3);

        @E4Q("/tiktok/cla/translation_like/list/v1/")
        C10K<TranslationLikeListResponse> fetchTranslationLikeList(@InterfaceC64989Pez("subtitle_id") String str, @InterfaceC64989Pez("item_id") String str2, @InterfaceC64989Pez("offset") long j, @InterfaceC64989Pez("max_cursor") long j2);
    }

    public static C10K LIZ(long j, String str) {
        return LIZ.fetchFavoriteUserList(str, j, 20, 1);
    }

    public static C10K<TranslationLikeListResponse> LIZJ(String str, String str2, long j, long j2) {
        return LIZ.fetchTranslationLikeList(str, str2, j, j2);
    }

    public static C10K LIZIZ(long j, long j2, boolean z, int i, String str, int i2) {
        return LIZ.fetchLikeList(j, j2, 20, z, i, str, i2);
    }
}
