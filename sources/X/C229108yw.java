package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.api.response.PlaylistTimeGapInterceptor;
import kotlin.jvm.internal.o;

/* renamed from: X.8yw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C229108yw {
    public static final /* synthetic */ C229108yw LIZ = new C229108yw();

    public static MixFeedApi LIZ() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ2 = LIZLLL.LIZ(API_URL_PREFIX_SI);
        LIZ2.LIZIZ(new PlaylistTimeGapInterceptor());
        return (MixFeedApi) LIZ2.LJFF().LIZ.LIZ(MixFeedApi.class);
    }
}
