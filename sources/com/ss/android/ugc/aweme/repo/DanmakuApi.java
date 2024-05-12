package com.ss.android.ugc.aweme.repo;

import X.AbstractC73672Svk;
import X.C77800Ug8;
import X.E8L;
import X.E8M;
import X.EFJ;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* loaded from: classes4.dex */
public final class DanmakuApi {
    public static final DanmakuApi LIZ = new DanmakuApi();
    public static final RetrofitApi LIZIZ;

    /* loaded from: classes4.dex */
    public interface RetrofitApi {
        @E8M("/tiktok/danmaku/create/v1")
        @InterfaceC195757mF
        AbstractC73672Svk<CreateDanmakuResponse> createDanmaku(@InterfaceC64985Pev("item_id") String str, @InterfaceC64985Pev("offset_time") long j, @InterfaceC64985Pev("text") String str2, @InterfaceC64985Pev("skip_rethink") boolean z);

        @E8M("/tiktok/danmaku/delete/v1")
        @InterfaceC195757mF
        AbstractC73672Svk<DanmakuDeleteResponse> deleteDanmaku(@InterfaceC64985Pev("danmaku_id") String str, @InterfaceC64985Pev("delete_danmaku_user_type") int i);

        @E8L("/tiktok/danmaku/get/v1")
        AbstractC73672Svk<DanmakuListResponse> getDanmaku(@InterfaceC64986Pew("item_id") String str, @InterfaceC64986Pew("start_time") long j);
    }

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String str = EFJ.LIZJ;
        LIZIZ = (RetrofitApi) C77800Ug8.LIZIZ(str, "API_URL_PREFIX_SI", LIZLLL, str, RetrofitApi.class);
    }
}
