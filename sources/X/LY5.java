package X;

import com.ss.android.ugc.aweme.feed.api.FollowFeedApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LY5 {
    public static final /* synthetic */ LY5 LIZ = new LY5();

    public static FollowFeedApi LIZ() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(EFJ.LIZJ).create(FollowFeedApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…ollowFeedApi::class.java)");
        return (FollowFeedApi) create;
    }
}
