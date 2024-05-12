package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.bnpl.network.VerifyApi;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.CommonParamInterceptor;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.RiskInfoInterceptor;
import com.ss.android.ugc.aweme.bnpl.network.interceptor.SessionInterceptor;
import com.ss.android.ugc.aweme.bnpl.network.model.DoVerifyRequest;
import com.ss.android.ugc.aweme.bnpl.network.model.SendVerifyCodeRequest;

/* renamed from: X.a0m, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91820a0m {
    public static final /* synthetic */ C91820a0m LIZ = new C91820a0m();
    public static final VerifyApi LIZIZ;

    static {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(C91826a0s.LIZ);
        LIZ2.LIZIZ(new RiskInfoInterceptor());
        LIZ2.LIZIZ(new SessionInterceptor());
        LIZ2.LIZIZ(new CommonParamInterceptor());
        LIZ2.LJIIIIZZ.LIZ(new C92365a9Z());
        LIZIZ = (VerifyApi) LIZ2.LJFF().LIZ.LIZ(VerifyApi.class);
    }

    public static Object LIZ(String str, DoVerifyRequest doVerifyRequest, InterfaceC67352kd interfaceC67352kd) {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(str);
        LIZ2.LIZIZ(new RiskInfoInterceptor());
        LIZ2.LIZIZ(new SessionInterceptor());
        LIZ2.LIZIZ(new CommonParamInterceptor());
        LIZ2.LJIIIIZZ.LIZ(new C92365a9Z());
        return ((VerifyApi) LIZ2.LJFF().LIZ.LIZ(VerifyApi.class)).doVerify(doVerifyRequest, interfaceC67352kd);
    }

    public static Object LIZIZ(String str, SendVerifyCodeRequest sendVerifyCodeRequest, InterfaceC67352kd interfaceC67352kd) {
        C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(str);
        LIZ2.LIZIZ(new RiskInfoInterceptor());
        LIZ2.LIZIZ(new SessionInterceptor());
        LIZ2.LIZIZ(new CommonParamInterceptor());
        LIZ2.LJIIIIZZ.LIZ(new C92365a9Z());
        return ((VerifyApi) LIZ2.LJFF().LIZ.LIZ(VerifyApi.class)).sendVerifyCode(sendVerifyCodeRequest, interfaceC67352kd);
    }
}
