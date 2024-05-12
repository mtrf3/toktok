package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;

/* renamed from: X.Aym, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27996Aym {
    public static final /* synthetic */ C27996Aym LIZ = new C27996Aym();
    public static final InterfaceC789838c LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ("https://oec-api.tiktokv.com/");
        LIZ2.LIZIZ(new GecNetInterceptor());
        LIZIZ = LIZ2.LJFF();
    }
}
