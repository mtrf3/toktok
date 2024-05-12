package X;

import com.ss.android.ugc.aweme.innerpush.idl.LiveInnerPushApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCI {
    public static final LiveInnerPushApi LIZ;

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(LiveInnerPushApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…InnerPushApi::class.java)");
        LIZ = (LiveInnerPushApi) create;
    }
}
