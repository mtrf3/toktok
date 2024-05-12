package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.app.api.TrendingTimeGapInterceptor;
import com.ss.android.ugc.aweme.trending.TrendingDetailApi;
import kotlin.jvm.internal.o;

/* renamed from: X.EjH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37227EjH {
    public static final /* synthetic */ C37227EjH LIZ = new C37227EjH();
    public static final TrendingDetailApi LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ2 = LIZLLL.LIZ(API_URL_PREFIX_SI);
        LIZ2.LIZIZ(new TrendingTimeGapInterceptor());
        LIZIZ = (TrendingDetailApi) LIZ2.LJFF().LIZ.LIZ(TrendingDetailApi.class);
    }
}
