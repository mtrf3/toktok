package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.discover.api.DiscoverApiNew;
import com.ss.android.ugc.aweme.discover.repo.fetcher.DiscoveryTimeGapInterceptor;
import kotlin.jvm.internal.o;

/* renamed from: X.EjG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37226EjG {
    public static final /* synthetic */ C37226EjG LIZ = new C37226EjG();
    public static final DiscoverApiNew LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ2 = LIZLLL.LIZ(API_URL_PREFIX_SI);
        LIZ2.LIZIZ(new DiscoveryTimeGapInterceptor());
        LIZIZ = (DiscoverApiNew) LIZ2.LJFF().LIZ.LIZ(DiscoverApiNew.class);
    }
}
