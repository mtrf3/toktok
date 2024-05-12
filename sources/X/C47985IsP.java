package X;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* renamed from: X.IsP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47985IsP extends AbstractC47819Ipj {
    public static C64600PWy LIZJ;
    public C64587PWl LIZ;
    public int LIZIZ;

    public static void LJFF(C64587PWl c64587PWl, PX8 px8) {
        if (new C03880Dg(2).LIZJ(400103, "okhttp3/Call", "enqueue", c64587PWl, new Object[]{px8}, "void", new C65300Pk0(false, "(Lokhttp3/Callback;)V", "-7232781007992467679")).LIZ) {
            return;
        }
        c64587PWl.LLIZLLLIL(px8);
    }

    static {
        C39745Fin.LIZJ("application/json");
    }

    public static void LJI() {
        C64600PWy build;
        if (LIZJ == null) {
            C64601PWz c64601PWz = new C64601PWz();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            c64601PWz.connectTimeout(10L, timeUnit);
            c64601PWz.writeTimeout(10L, timeUnit);
            c64601PWz.readTimeout(10L, timeUnit);
            C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400100, "okhttp3/OkHttpClient$Builder", "build", c64601PWz, new Object[0], "okhttp3.OkHttpClient", new C65300Pk0(false, "()Lokhttp3/OkHttpClient;", "-7232781007992467679"));
            if (LIZJ2.LIZ) {
                build = (C64600PWy) LIZJ2.LIZIZ;
            } else {
                build = c64601PWz.build();
            }
            LIZJ = build;
        }
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZ() {
        C64587PWl c64587PWl = this.LIZ;
        if (c64587PWl != null && !c64587PWl.LJLILLLLZI.LIZLLL) {
            this.LIZ.LIZ(-1);
        }
    }

    public C47985IsP() {
        if (LIZJ != null) {
            return;
        }
        synchronized (C47985IsP.class) {
            LJI();
        }
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZJ(String str, C47590Im2 c47590Im2) {
        synchronized (C47985IsP.class) {
            LJI();
        }
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        Request LIZIZ = c64618PXq.LIZIZ();
        C64600PWy c64600PWy = LIZJ;
        c64600PWy.getClass();
        C64587PWl LIZJ2 = C64587PWl.LIZJ(c64600PWy, LIZIZ, false);
        this.LIZ = LIZJ2;
        LJFF(LIZJ2, new C47984IsO(this, c47590Im2));
    }

    public final void LJ(Request request, InterfaceC47420IjI interfaceC47420IjI) {
        synchronized (C47985IsP.class) {
            int i = this.LIZIZ;
            if (i != 3 && i != 1) {
                this.LIZIZ = 1;
                C64600PWy c64600PWy = LIZJ;
                c64600PWy.getClass();
                C64587PWl LIZJ2 = C64587PWl.LIZJ(c64600PWy, request, false);
                this.LIZ = LIZJ2;
                LJFF(LIZJ2, new C47983IsN(this, interfaceC47420IjI));
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("_startTask status error, return. ");
            LIZ.append(this.LIZIZ);
            C78253UnR.LJI("TTHTTPNetwork", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZIZ(String str, java.util.Map map, InterfaceC47420IjI interfaceC47420IjI) {
        synchronized (C47985IsP.class) {
            LJI();
        }
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        if (map != null && map.size() > 0) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c64618PXq.LIZ((String) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        LJ(c64618PXq.LIZIZ(), interfaceC47420IjI);
    }

    @Override // X.AbstractC47819Ipj
    public final void LIZLLL(String str, java.util.Map<String, String> map, InterfaceC47420IjI interfaceC47420IjI) {
        synchronized (C47985IsP.class) {
            LJI();
        }
        C64618PXq c64618PXq = new C64618PXq();
        c64618PXq.LJII(str);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    c64618PXq.LIZLLL(entry.getKey(), entry.getValue());
                }
            }
        }
        LJ(c64618PXq.LIZIZ(), interfaceC47420IjI);
    }
}
