package com.twitter.sdk.android.core.internal.scribe;

import X.C03880Dg;
import X.C39519Ff9;
import X.C64600PWy;
import X.C64601PWz;
import X.C64637PYj;
import X.C64653PYz;
import X.C65018PfS;
import X.C65027Pfb;
import X.C65074PgM;
import X.C65077PgP;
import X.C65138PhO;
import X.C65182Pi6;
import X.C65253PjF;
import X.C65254PjG;
import X.C65264PjQ;
import X.C65266PjS;
import X.C65300Pk0;
import X.C78841Uwv;
import X.E4T;
import X.InterfaceC195787mI;
import X.InterfaceC36226EJq;
import X.InterfaceC64987Pex;
import X.InterfaceC64988Pey;
import X.InterfaceC65076PgO;
import X.InterfaceC65079PgR;
import X.InterfaceC65283Pjj;
import X.PV2;
import X.PVM;
import android.content.Context;
import android.text.TextUtils;
import com.twitter.sdk.android.core.Session;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.scribe.ScribeFilesSender;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class ScribeFilesSender {
    public static final byte[] LJIIIZ = {91};
    public static final byte[] LJIIJ = {44};
    public static final byte[] LJIIJJI = {93};
    public final Context LIZ;
    public final C65077PgP LIZIZ;
    public final long LIZJ;
    public final TwitterAuthConfig LIZLLL;
    public final InterfaceC65283Pjj<? extends Session<TwitterAuthToken>> LJ;
    public final C65254PjG LJFF;
    public final AtomicReference<ScribeService> LJI = new AtomicReference<>();
    public final ExecutorService LJII;
    public final C65266PjS LJIIIIZZ;

    /* loaded from: classes12.dex */
    public interface ScribeService {
        @InterfaceC36226EJq({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @InterfaceC195787mI
        @E4T("/{version}/jot/{type}")
        InterfaceC65079PgR<PVM> upload(@InterfaceC64988Pey("version") String str, @InterfaceC64988Pey("type") String str2, @InterfaceC64987Pex("log[]") String str3);

        @InterfaceC36226EJq({"Content-Type: application/x-www-form-urlencoded;charset=UTF-8"})
        @InterfaceC195787mI
        @E4T("/scribe/{sequence}")
        InterfaceC65079PgR<PVM> uploadSequence(@InterfaceC64988Pey("sequence") String str, @InterfaceC64987Pex("log[]") String str2);
    }

    public static C64600PWy LIZ(C64601PWz c64601PWz) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-3690410423023300770"));
        return LIZJ.LIZ ? (C64600PWy) LIZJ.LIZIZ : c64601PWz.build();
    }

    public static C65018PfS LIZIZ(C65027Pfb c65027Pfb) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400200, "retrofit2/Retrofit$Builder", "build", c65027Pfb, new Object[0], "retrofit2.Retrofit", new C65300Pk0(false, "()Lretrofit2/Retrofit;", "-3690410423023300770"));
        return LIZJ.LIZ ? (C65018PfS) LIZJ.LIZIZ : c65027Pfb.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized ScribeService LIZLLL() {
        C64600PWy LIZ;
        if (this.LJI.get() == null) {
            long j = this.LIZJ;
            C65264PjQ c65264PjQ = (C65264PjQ) this.LJ;
            c65264PjQ.LIZLLL();
            Session session = (Session) c65264PjQ.LIZJ.get(Long.valueOf(j));
            if (session != null && session.authToken != 0) {
                C64601PWz c64601PWz = new C64601PWz();
                c64601PWz.certificatePinner(PV2.LIZ());
                c64601PWz.addInterceptor(new C65074PgM(this.LIZIZ, this.LJIIIIZZ));
                c64601PWz.addInterceptor(new C64637PYj(session, this.LIZLLL));
                LIZ = LIZ(c64601PWz);
            } else {
                C64601PWz c64601PWz2 = new C64601PWz();
                c64601PWz2.certificatePinner(PV2.LIZ());
                c64601PWz2.addInterceptor(new C65074PgM(this.LIZIZ, this.LJIIIIZZ));
                c64601PWz2.addInterceptor(new C65253PjF(this.LJFF));
                LIZ = LIZ(c64601PWz2);
            }
            C65027Pfb c65027Pfb = new C65027Pfb();
            c65027Pfb.LIZIZ(this.LIZIZ.LIZ);
            C65138PhO.LIZ(LIZ, "client == null");
            c65027Pfb.LIZIZ = LIZ;
            C65018PfS LIZIZ = LIZIZ(c65027Pfb);
            AtomicReference<ScribeService> atomicReference = this.LJI;
            Object LIZIZ2 = LIZIZ.LIZIZ(ScribeService.class);
            while (!atomicReference.compareAndSet(null, LIZIZ2) && atomicReference.get() == null) {
            }
        }
        return this.LJI.get();
    }

    public static String LIZJ(List list) {
        C65182Pi6 c65182Pi6;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        final boolean[] zArr = new boolean[1];
        byteArrayOutputStream.write(LJIIIZ);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                c65182Pi6 = new C65182Pi6((File) it.next());
                try {
                    c65182Pi6.LIZIZ(new InterfaceC65076PgO() { // from class: X.PgN
                        @Override // X.InterfaceC65076PgO
                        public final void LIZ(C65183Pi7 c65183Pi7, int i) {
                            boolean[] zArr2 = zArr;
                            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
                            byte[] bArr = new byte[i];
                            c65183Pi7.read(bArr);
                            if (zArr2[0]) {
                                byteArrayOutputStream2.write(ScribeFilesSender.LJIIJ);
                            } else {
                                zArr2[0] = true;
                            }
                            byteArrayOutputStream2.write(bArr);
                        }
                    });
                    try {
                        c65182Pi6.close();
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused) {
                    }
                } catch (Throwable th) {
                    th = th;
                    if (c65182Pi6 != null) {
                        try {
                            c65182Pi6.close();
                        } catch (RuntimeException e2) {
                            throw e2;
                        } catch (Exception unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                c65182Pi6 = null;
            }
        }
        byteArrayOutputStream.write(LJIIJJI);
        return byteArrayOutputStream.toString("UTF-8");
    }

    public final boolean LJ(List<File> list) {
        if (LIZLLL() != null) {
            try {
                String LIZJ = LIZJ(list);
                C78841Uwv.LJJ(this.LIZ);
                C64653PYz<PVM> LJFF = LJFF(LIZJ);
                if (LJFF.LIZ.LJLJI == 200) {
                    return true;
                }
                C78841Uwv.LJJI(this.LIZ);
                int i = LJFF.LIZ.LJLJI;
                if (i == 500 || i == 400) {
                    return true;
                }
            } catch (Exception unused) {
                C78841Uwv.LJJI(this.LIZ);
            }
        } else {
            C78841Uwv.LJJ(this.LIZ);
        }
        return false;
    }

    public final C64653PYz<PVM> LJFF(String str) {
        ScribeService LIZLLL = LIZLLL();
        this.LIZIZ.getClass();
        if (!TextUtils.isEmpty("")) {
            this.LIZIZ.getClass();
            return LIZLLL.uploadSequence("", str).execute();
        }
        this.LIZIZ.getClass();
        this.LIZIZ.getClass();
        return LIZLLL.upload("i", "sdk", str).execute();
    }

    public ScribeFilesSender(Context context, C65077PgP c65077PgP, long j, TwitterAuthConfig twitterAuthConfig, InterfaceC65283Pjj<? extends Session<TwitterAuthToken>> interfaceC65283Pjj, C65254PjG c65254PjG, ExecutorService executorService, C65266PjS c65266PjS) {
        this.LIZ = context;
        this.LIZIZ = c65077PgP;
        this.LIZJ = j;
        this.LIZLLL = twitterAuthConfig;
        this.LJ = interfaceC65283Pjj;
        this.LJFF = c65254PjG;
        this.LJII = executorService;
        this.LJIIIIZZ = c65266PjS;
    }
}
