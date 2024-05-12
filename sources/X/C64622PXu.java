package X;

import com.bytedance.apm.agent.instrumentation.OkHttp3Instrumentation;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.OkHttp3SecurityFactorInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import java.net.CookieHandler;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.PXu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64622PXu {
    public static final C64622PXu LIZJ = new C64622PXu();
    public C64600PWy LIZ;
    public final C64600PWy LIZIZ = OkHttp3Instrumentation.init();

    public final C64600PWy LIZ() {
        C64600PWy c64600PWy = this.LIZ;
        if (c64600PWy != null) {
            return c64600PWy;
        }
        AbstractC64623PXv.LIZ.LIZ();
        C64600PWy c64600PWy2 = this.LIZIZ;
        c64600PWy2.getClass();
        C64601PWz c64601PWz = new C64601PWz(c64600PWy2);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c64601PWz.connectTimeout(60000L, timeUnit);
        c64601PWz.readTimeout(60000L, timeUnit);
        c64601PWz.retryOnConnectionFailure(true);
        if (V2B.LJLIL != null) {
            c64601PWz.dispatcher(new C64588PWm(V2B.LJLIL));
        }
        if (FCD.LJI(EF7.LIZIZ())) {
            c64601PWz.cookieJar(new C61699OJj(CookieHandler.getDefault()));
        }
        if (C72085SQv.LJLILLLLZI != null) {
            c64601PWz.addInterceptor(new PYL());
        }
        c64601PWz.addNetworkInterceptor(new NetWorkSpeedInterceptor());
        c64601PWz.addNetworkInterceptor(new OkHttp3SecurityFactorInterceptor());
        c64601PWz.addNetworkInterceptor(new C64607PXf());
        c64601PWz.addInterceptor(new DevicesNullInterceptor());
        c64601PWz.addInterceptor(new C64624PXw());
        c64601PWz.addInterceptor(new InterfaceC48121Iub() { // from class: X.PZk
            @Override // X.InterfaceC48121Iub
            public final C64598PWw intercept(PXZ pxz) {
                InterfaceC64715PaZ interfaceC64715PaZ = C64735Pat.LJI;
                if (interfaceC64715PaZ != null) {
                    interfaceC64715PaZ.LIZIZ();
                }
                C64735Pat.LJIIIIZZ();
                PW8 pw8 = (PW8) pxz;
                return pw8.LIZ(pw8.LJFF);
            }
        });
        c64601PWz.protocols(Collections.singletonList(EnumC64572PVw.HTTP_1_1));
        C64600PWy build = OkHttp3Instrumentation.build(c64601PWz);
        this.LIZ = build;
        return build;
    }
}
