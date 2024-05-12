package com.ss.android.ugc.aweme.notification.redpoint;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.M57;
import com.ss.android.ugc.aweme.services.RetrofitService;

/* loaded from: classes10.dex */
public final class MultiUserNoticeApi {
    public static final MultiUserNoticeRetrofitApi LIZ = (MultiUserNoticeRetrofitApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(M57.LIZ).create(MultiUserNoticeRetrofitApi.class);

    /* loaded from: classes10.dex */
    public interface MultiUserNoticeRetrofitApi {
        @E4Q("/aweme/v1/notice/multi_user/count/")
        C10K<MultiUserNoticeCountResponse> getMultiUserNoticeCount(@InterfaceC64989Pez("user_ids") String str, @InterfaceC64989Pez("ab_settings") String str2);
    }
}
