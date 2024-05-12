package X;

import com.ss.android.ugc.aweme.friends.api.FriendApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import kotlin.jvm.internal.o;

/* renamed from: X.MbS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57126MbS {
    public static final /* synthetic */ C57126MbS LIZ = new C57126MbS();

    public static FriendApi LIZ() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(FriendApi.class);
        o.LJIIIIZZ(create, "get().getService(IRetrof…te(FriendApi::class.java)");
        return (FriendApi) create;
    }
}
