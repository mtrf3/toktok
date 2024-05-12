package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.nows.api.NowTimeoutIntercept;
import com.ss.android.ugc.aweme.nows.feed.caption.INowCaptionApi;
import kotlin.jvm.internal.o;

/* renamed from: X.7X4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7X4 extends AbstractC65781Prl implements InterfaceC65784Pro<INowCaptionApi> {
    public static final C7X4 LJLIL = new C7X4();

    public C7X4() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.ss.android.ugc.aweme.nows.feed.caption.INowCaptionApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final INowCaptionApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        C65087PgZ LIZ = LIZLLL.LIZ(API_URL_PREFIX_SI);
        LIZ.LIZIZ(new NowTimeoutIntercept());
        return LIZ.LJFF().LIZ.LIZ(INowCaptionApi.class);
    }
}
