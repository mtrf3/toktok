package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.bnpl.network.BillApi;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.SessionInterceptor;

/* renamed from: X.a0k, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91818a0k {
    public static final /* synthetic */ C91818a0k LIZ = new C91818a0k();
    public static final BillApi LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(C91826a0s.LIZ);
        LIZ2.LIZIZ(new SessionInterceptor());
        LIZ2.LIZIZ(new CommonParamInterceptor());
        LIZ2.LJIIIIZZ.LIZ(new C92365a9Z());
        LIZIZ = (BillApi) LIZ2.LJFF().LIZ.LIZ(BillApi.class);
    }
}
