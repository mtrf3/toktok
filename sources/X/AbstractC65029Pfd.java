package X;

import android.os.Build;
import com.google.gson.Gson;
import java.text.Normalizer;

/* renamed from: X.Pfd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65029Pfd {
    public final C65263PjP LIZ;
    public final C65051Pfz LIZIZ;
    public final String LIZJ;
    public final C65018PfS LIZLLL;

    public AbstractC65029Pfd(C65263PjP c65263PjP, C65051Pfz c65051Pfz) {
        C64600PWy build;
        C65018PfS LIZJ;
        this.LIZ = c65263PjP;
        this.LIZIZ = c65051Pfz;
        c65263PjP.getClass();
        StringBuilder sb = new StringBuilder("TwitterAndroidSDK/3.2.0.11 ");
        String str = Build.MODEL;
        sb.append(str);
        sb.append('/');
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (");
        sb.append(Build.MANUFACTURER);
        sb.append(';');
        sb.append(str);
        sb.append(';');
        sb.append(Build.BRAND);
        sb.append(';');
        String normalize = Normalizer.normalize(C07670Rv.LIZIZ(sb, Build.PRODUCT, ')'), Normalizer.Form.NFD);
        StringBuilder sb2 = new StringBuilder(normalize.length());
        for (int i = 0; i < normalize.length(); i++) {
            char charAt = normalize.charAt(i);
            if (charAt > 31 && charAt < 127) {
                sb2.append(charAt);
            }
        }
        this.LIZJ = sb2.toString();
        C64601PWz c64601PWz = new C64601PWz();
        c64601PWz.addInterceptor(new InterfaceC48121Iub() { // from class: X.PZK
            @Override // X.InterfaceC48121Iub
            public final C64598PWw intercept(PXZ pxz) {
                AbstractC65029Pfd abstractC65029Pfd = AbstractC65029Pfd.this;
                abstractC65029Pfd.getClass();
                PW8 pw8 = (PW8) pxz;
                C64618PXq newBuilder = pw8.LJFF.newBuilder();
                newBuilder.LIZJ.LJ("User-Agent", abstractC65029Pfd.LIZJ);
                return pw8.LIZ(newBuilder.LIZIZ());
            }
        });
        c64601PWz.certificatePinner(PV2.LIZ());
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-3434292502075657609"));
        if (LIZJ2.LIZ) {
            build = (C64600PWy) LIZJ2.LIZIZ;
        } else {
            build = c64601PWz.build();
        }
        C65027Pfb c65027Pfb = new C65027Pfb();
        c65027Pfb.LIZIZ(this.LIZIZ.LIZ);
        C65138PhO.LIZ(build, "client == null");
        c65027Pfb.LIZIZ = build;
        c65027Pfb.LIZ(new C65239Pj1(new Gson()));
        C39519Ff9 LIZJ3 = new C03880Dg(2).LIZJ(400200, "retrofit2/Retrofit$Builder", "build", c65027Pfb, new Object[0], "retrofit2.Retrofit", new C65300Pk0(false, "()Lretrofit2/Retrofit;", "-3434292502075657609"));
        if (LIZJ3.LIZ) {
            LIZJ = (C65018PfS) LIZJ3.LIZIZ;
        } else {
            LIZJ = c65027Pfb.LIZJ();
        }
        this.LIZLLL = LIZJ;
    }
}
