package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.wiki.CheckAnchorModerationService;
import kotlin.jvm.internal.o;

/* renamed from: X.NgD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59969NgD {
    public static final /* synthetic */ C59969NgD LIZ = new C59969NgD();
    public static final CheckAnchorModerationService LIZIZ;

    static {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ2 = LIZLLL.LIZ(API_URL_PREFIX_SI);
        LIZ2.LJIIIZ = 3;
        LIZIZ = (CheckAnchorModerationService) LIZ2.LJFF().LIZ.LIZ(CheckAnchorModerationService.class);
    }
}
