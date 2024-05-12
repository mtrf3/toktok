package X;

import com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.LAp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53827LAp {
    public static final IRetrofitService LIZ;
    public static final IFollowFeedApiV1 LIZIZ;

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIRetrofitServicebyMonsterPlugin, "get().getService(IRetrofitService::class.java)");
        LIZ = createIRetrofitServicebyMonsterPlugin;
        Object create = createIRetrofitServicebyMonsterPlugin.createNewRetrofit(EFJ.LIZJ).create(IFollowFeedApiV1.class);
        o.LJIIIIZZ(create, "retrofitService.createNe…lowFeedApiV1::class.java)");
        LIZIZ = (IFollowFeedApiV1) create;
    }
}
