package X;

import android.os.Build;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes12.dex */
public final class PX1 {
    public static PXG LIZIZ;
    public static int LIZJ;
    public C64600PWy LIZ;

    public static C64600PWy LIZ(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-3991409860728839904"));
        return LIZJ2.LIZ ? (C64600PWy) LIZJ2.LIZIZ : c64601PWz.build();
    }

    public static C64601PWz LIZIZ(C64601PWz c64601PWz) {
        if (Build.VERSION.SDK_INT < 22) {
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
                sSLContext.init(null, null, null);
                try {
                    c64601PWz.sslSocketFactory(new C63998P9u(sSLContext.getSocketFactory()));
                } catch (Exception unused) {
                    LIZJ(c64601PWz, sSLContext);
                }
                PVH pvh = new PVH(PVF.LJ);
                pvh.LIZLLL(EnumC64000P9w.TLS_1_2);
                PVF pvf = new PVF(pvh);
                ArrayList arrayList = new ArrayList();
                arrayList.add(pvf);
                arrayList.add(PVF.LJFF);
                arrayList.add(PVF.LJI);
                c64601PWz.connectionSpecs(arrayList);
            } catch (Exception unused2) {
            }
        }
        return c64601PWz;
    }

    public static void LIZLLL(C64601PWz c64601PWz) {
        ArrayList arrayList = new ArrayList();
        int i = LIZJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    arrayList.add(EnumC64572PVw.HTTP_2);
                    arrayList.add(EnumC64572PVw.SPDY_3);
                }
            } else {
                arrayList.add(EnumC64572PVw.SPDY_3);
            }
        } else {
            arrayList.add(EnumC64572PVw.HTTP_2);
        }
        LIZJ = 4;
        arrayList.add(EnumC64572PVw.HTTP_1_1);
        c64601PWz.protocols(Collections.unmodifiableList(arrayList));
    }

    public static void LIZJ(C64601PWz c64601PWz, SSLContext sSLContext) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                c64601PWz.sslSocketFactory(new C63998P9u(sSLContext.getSocketFactory()), (X509TrustManager) trustManager);
                return;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Unexpected default trust managers:");
        LIZ.append(Arrays.toString(trustManagers));
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }
}
