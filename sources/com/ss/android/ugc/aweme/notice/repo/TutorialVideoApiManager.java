package com.ss.android.ugc.aweme.notice.repo;

import X.C10K;
import X.E4Q;
import X.InterfaceC64989Pez;
import X.X1D;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class TutorialVideoApiManager {
    public static final TutorialVideoApi LIZ;

    /* loaded from: classes10.dex */
    public interface TutorialVideoApi {
        @E4Q("/tiktok/v1/inbox/top/message/")
        C10K<TutorialVideoResp> getTutorialVideoAndPoint(@InterfaceC64989Pez("msg_id") String str, @InterfaceC64989Pez("first_show_time") long j, @InterfaceC64989Pez("current_show_time") long j2, @InterfaceC64989Pez("clicked") int i);
    }

    static {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("https://");
        LIZ2.append("api-va.tiktokv.com");
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(X1D.LIZIZ(LIZ2)).create(TutorialVideoApi.class);
        o.LJIIIIZZ(create, "get()\n            .getSe…rialVideoApi::class.java)");
        LIZ = (TutorialVideoApi) create;
    }
}
