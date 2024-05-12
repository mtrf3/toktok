package X;

import com.bytedance.apm.agent.instrumentation.OkHttp3Instrumentation;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Iwj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48253Iwj extends AbstractC65781Prl implements InterfaceC65784Pro<C64600PWy> {
    public static final C48253Iwj LJLIL = new C48253Iwj();

    public C48253Iwj() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.PWy, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final C64600PWy invoke() {
        C64601PWz c64601PWz = new C64601PWz();
        c64601PWz.retryOnConnectionFailure(true);
        c64601PWz.connectTimeout(15L, TimeUnit.SECONDS);
        if (!(c64601PWz instanceof C64601PWz)) {
            C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-358357555563955934"));
            if (LIZJ.LIZ) {
                return LIZJ.LIZIZ;
            }
            return c64601PWz.build();
        }
        return OkHttp3Instrumentation.build(c64601PWz);
    }
}
