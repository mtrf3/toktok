package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.api.interceptor.GecNetInterceptor;

/* renamed from: X.AkH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27097AkH {
    public static final /* synthetic */ C27097AkH LIZ = new C27097AkH();
    public static final InterfaceC789838c LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ("https://oec-api.tiktokv.com/");
        LIZ2.LIZIZ(new GecNetInterceptor());
        LIZIZ = LIZ2.LJFF();
    }
}
