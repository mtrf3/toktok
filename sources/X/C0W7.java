package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0W7, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0W7 {
    public final AbstractC38911fr LIZ;
    public final C64600PWy LIZIZ;
    public PXH LIZJ;

    public C0W7(C42101l0 c42101l0) {
        C64600PWy build;
        this.LIZ = c42101l0;
        C64601PWz c64601PWz = new C64601PWz();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c64601PWz.readTimeout(60L, timeUnit);
        c64601PWz.writeTimeout(60L, timeUnit);
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "1587092237156305812"));
        if (LIZJ.LIZ) {
            build = (C64600PWy) LIZJ.LIZIZ;
        } else {
            build = c64601PWz.build();
        }
        this.LIZIZ = build;
    }
}
