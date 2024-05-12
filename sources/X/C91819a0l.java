package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.bnpl.network.CheckoutApi;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.SessionInterceptor;

/* renamed from: X.a0l, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91819a0l {
    public static final /* synthetic */ C91819a0l LIZ = new C91819a0l();
    public static final CheckoutApi LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(C91826a0s.LIZ);
        LIZ2.LJIIIIZZ.LIZ(new C92365a9Z());
        LIZ2.LIZIZ(new SessionInterceptor());
        LIZIZ = (CheckoutApi) LIZ2.LJFF().LIZ.LIZ(CheckoutApi.class);
    }
}
