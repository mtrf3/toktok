package X;

import com.google.gson.e;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.models.BindingValuesAdapter;
import com.twitter.sdk.android.core.models.SafeListAdapter;
import com.twitter.sdk.android.core.models.SafeMapAdapter;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Pfy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65050Pfy {
    public final ConcurrentHashMap<Class, Object> LIZ;
    public final C65018PfS LIZIZ;

    public C65050Pfy(TwitterSession twitterSession) {
        C64600PWy build;
        C65018PfS LIZJ;
        TwitterAuthConfig twitterAuthConfig = C65263PjP.LIZIZ().LIZLLL;
        if (twitterSession != null) {
            C64601PWz c64601PWz = new C64601PWz();
            c64601PWz.certificatePinner(PV2.LIZ());
            c64601PWz.addInterceptor(new C64637PYj(twitterSession, twitterAuthConfig));
            C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "4373353005722573951"));
            if (LIZJ2.LIZ) {
                build = (C64600PWy) LIZJ2.LIZIZ;
            } else {
                build = c64601PWz.build();
            }
            this.LIZ = new ConcurrentHashMap<>();
            C65027Pfb c65027Pfb = new C65027Pfb();
            C65138PhO.LIZ(build, "client == null");
            c65027Pfb.LIZIZ = build;
            c65027Pfb.LIZIZ("https://api.twitter.com");
            e eVar = new e();
            ((ArrayList) eVar.LJ).add(new SafeListAdapter());
            ((ArrayList) eVar.LJ).add(new SafeMapAdapter());
            eVar.LIZIZ(new BindingValuesAdapter(), C65345Pkj.class);
            c65027Pfb.LIZ(new C65239Pj1(eVar.LIZ()));
            C39519Ff9 LIZJ3 = new C03880Dg(2).LIZJ(400200, "retrofit2/Retrofit$Builder", "build", c65027Pfb, new Object[0], "retrofit2.Retrofit", new C65300Pk0(false, "()Lretrofit2/Retrofit;", "3533010398660671363"));
            if (LIZJ3.LIZ) {
                LIZJ = (C65018PfS) LIZJ3.LIZIZ;
            } else {
                LIZJ = c65027Pfb.LIZJ();
            }
            this.LIZIZ = LIZJ;
            return;
        }
        throw new IllegalArgumentException("Session must not be null.");
    }
}
