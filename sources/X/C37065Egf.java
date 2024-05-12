package X;

import Y.ACallableS109S0100000_6;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Egf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37065Egf {
    public static final String LJJIL;
    public static final C37066Egg LJJIZ;
    public final EnumC58085Mqv LIZ;
    public final EMQ LIZIZ;
    public final MessageDigest LIZJ;
    public final InterfaceC88472Yns<String, C76800UCe> LIZLLL;
    public final MessageDigest LJ;
    public final InterfaceC88472Yns<String, C76800UCe> LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public final int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public final C62822Ol8 LJJIJLIJ;

    static {
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        LJJIL = uuid;
        LJJIZ = new C37066Egg(0);
    }

    public final void LIZ() {
        this.LJI = SystemClock.uptimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("begin: ");
        LIZ.append(SystemClock.uptimeMillis());
        X1D.LIZIZ(LIZ);
    }

    public final void LIZIZ() {
        this.LJIILJJIL = SystemClock.uptimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("end: ");
        LIZ.append(this.LJIILJJIL);
        X1D.LIZIZ(LIZ);
        if (this.LJJIJIL != 0) {
            String LJ = C38352F3k.LJ(this.LJ.digest());
            long uptimeMillis = SystemClock.uptimeMillis();
            C37066Egg c37066Egg = LJJIZ;
            if ((!o.LJ(c37066Egg.LIZ.getFirst(), "")) & (!o.LJ(c37066Egg.LIZ.getFirst(), LJ))) {
                c37066Egg.LIZIZ = uptimeMillis - c37066Egg.LIZ.getSecond().longValue();
            }
            c37066Egg.LIZ = new OSZ<>(LJ, Long.valueOf(uptimeMillis));
            OSZ<String, Long> osz = c37066Egg.LIZJ.get(Integer.valueOf(this.LIZ.getValue()));
            if (osz != null && !o.LJ(osz.getFirst(), LJ)) {
                c37066Egg.LIZLLL = uptimeMillis - osz.getSecond().longValue();
            }
            c37066Egg.LIZJ.put(Integer.valueOf(this.LIZ.getValue()), new OSZ<>(LJ, Long.valueOf(uptimeMillis)));
        }
        if (this.LJJIJIIJIL != 0) {
            String LJ2 = C38352F3k.LJ(this.LIZJ.digest());
            long uptimeMillis2 = SystemClock.uptimeMillis();
            C37066Egg c37066Egg2 = LJJIZ;
            if ((!o.LJ(c37066Egg2.LJ.getFirst(), "")) & (!o.LJ(c37066Egg2.LJ.getFirst(), LJ2))) {
                c37066Egg2.LJFF = uptimeMillis2 - c37066Egg2.LJ.getSecond().longValue();
            }
            c37066Egg2.LJ = new OSZ<>(LJ2, Long.valueOf(uptimeMillis2));
            OSZ<String, Long> osz2 = c37066Egg2.LJI.get(Integer.valueOf(this.LIZ.getValue()));
            if (osz2 != null && !o.LJ(osz2.getFirst(), LJ2)) {
                c37066Egg2.LJII = uptimeMillis2 - osz2.getSecond().longValue();
            }
            c37066Egg2.LJI.put(Integer.valueOf(this.LIZ.getValue()), new OSZ<>(LJ2, Long.valueOf(uptimeMillis2)));
        }
        C10K.LIZJ(new ACallableS109S0100000_6(this, 30));
    }

    public static Long LIZJ(long j) {
        if (j == -1) {
            return null;
        }
        return Long.valueOf(j);
    }

    public static OSZ LIZLLL(InterfaceC65784Pro interfaceC65784Pro) {
        return new OSZ(interfaceC65784Pro.invoke(), Long.valueOf(SystemClock.uptimeMillis() - SystemClock.uptimeMillis()));
    }

    public static String LJFF(Throwable th) {
        if (th instanceof C38333F2r) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Server, code: ");
            C38333F2r c38333F2r = (C38333F2r) th;
            LIZ.append(c38333F2r.getErrorCode());
            LIZ.append(", msg: ");
            LIZ.append(c38333F2r.getErrorMsg());
            return X1D.LIZIZ(LIZ);
        }
        if (th instanceof C38305F1p) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Local, code: ");
            LIZ2.append(((C38306F1q) th).getErrorCode());
            return X1D.LIZIZ(LIZ2);
        }
        if (th instanceof C64698PaI) {
            return "NetworkNotAvail";
        }
        if (th instanceof C64802Pby) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("HttpResponseException, code: ");
            LIZ3.append(((C64802Pby) th).getStatusCode());
            return X1D.LIZIZ(LIZ3);
        }
        if (th instanceof C38299F1j) {
            return "CdnCacheVerifyException";
        }
        if (th instanceof C64801Pbx) {
            return "ClientProtocolException";
        }
        if (th instanceof C64800Pbw) {
            return "OtherTTNException";
        }
        String message = th.getMessage();
        if (message != null) {
            return message;
        }
        return "monitor unknown exception";
    }

    public final void LJ(Throwable th) {
        this.LJIILLIIL++;
        C73802v2.LIZIZ(205, th.getMessage(), 60);
    }

    public final <T> T LJI(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        OSZ LIZLLL = LIZLLL(interfaceC65784Pro);
        T t = (T) LIZLLL.getFirst();
        long longValue = ((Number) LIZLLL.getSecond()).longValue();
        this.LJIILIIL = longValue;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("construct cost: ");
        LIZ.append(longValue);
        X1D.LIZIZ(LIZ);
        return t;
    }

    public final <T> T LJII(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        OSZ LIZLLL = LIZLLL(interfaceC65784Pro);
        T t = (T) LIZLLL.getFirst();
        this.LJIIJ = ((Number) LIZLLL.getSecond()).longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("hash cost: ");
        LIZ.append(this.LJIIJ);
        X1D.LIZIZ(LIZ);
        return t;
    }

    public final void LJIIIIZZ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        OSZ LIZLLL = LIZLLL(interfaceC65784Pro);
        LIZLLL.getFirst();
        this.LJIIIIZZ = ((Number) LIZLLL.getSecond()).longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("normalized cost: ");
        LIZ.append(this.LJIIIIZZ);
        X1D.LIZIZ(LIZ);
    }

    public final <T> T LJIIIZ(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            return interfaceC65784Pro.invoke();
        } finally {
        }
    }

    public final <T> T LJIIJ(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        OSZ LIZLLL = LIZLLL(interfaceC65784Pro);
        T t = (T) LIZLLL.getFirst();
        this.LJIIIZ = ((Number) LIZLLL.getSecond()).longValue();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("parsed cost: ");
        LIZ.append(this.LJIIJ);
        X1D.LIZIZ(LIZ);
        return t;
    }

    public final <T extends List<?>> T LJIIJJI(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        OSZ LIZLLL = LIZLLL(interfaceC65784Pro);
        T t = (T) LIZLLL.getFirst();
        this.LJII = ((Number) LIZLLL.getSecond()).longValue();
        this.LJIILL = t.size();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("read db cost: ");
        LIZ.append(this.LJII);
        LIZ.append(", count: ");
        LIZ.append(this.LJIILL);
        X1D.LIZIZ(LIZ);
        return t;
    }

    public C37065Egf(EnumC58085Mqv scene, EMQ bizScene) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        o.LJIIIIZZ(messageDigest, "getInstance(\"SHA-256\")");
        AqS172S0100000_6 aqS172S0100000_6 = new AqS172S0100000_6(messageDigest, 130);
        MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
        o.LJIIIIZZ(messageDigest2, "getInstance(\"SHA-256\")");
        AqS172S0100000_6 aqS172S0100000_62 = new AqS172S0100000_6(messageDigest2, 131);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(bizScene, "bizScene");
        this.LIZ = scene;
        this.LIZIZ = bizScene;
        this.LIZJ = messageDigest;
        this.LIZLLL = aqS172S0100000_6;
        this.LJ = messageDigest2;
        this.LJFF = aqS172S0100000_62;
        this.LJI = -1L;
        this.LJII = -1L;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1L;
        this.LJIILIIL = -1L;
        this.LJIILJJIL = -1L;
        this.LJIJI = 3;
        this.LJJIJLIJ = C221108m2.LIZIZ(new AqS156S0100000_6(this, 157));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object LJIIL(X.InterfaceC88472Yns<? super X.InterfaceC67352kd<? super T>, ? extends java.lang.Object> r9, X.InterfaceC67352kd<? super T> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.EME
            if (r0 == 0) goto L24
            r7 = r10
            X.EME r7 = (X.EME) r7
            int r2 = r7.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r7.LJLJJL = r2
        L12:
            java.lang.Object r3 = r7.LJLJI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r7.LJLJJL
            java.lang.String r6 = "api cost: "
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L30
            long r4 = r7.LJLILLLLZI
            X.Egf r7 = r7.LJLIL
            goto L2a
        L24:
            X.EME r7 = new X.EME
            r7.<init>(r8, r10)
            goto L12
        L2a:
            X.C141335gf.LIZJ(r3)     // Catch: java.lang.Throwable -> L2e
            goto L4d
        L2e:
            r3 = move-exception
            goto L67
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L38:
            X.C141335gf.LIZJ(r3)
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.LJLIL = r8     // Catch: java.lang.Throwable -> L65
            r7.LJLILLLLZI = r4     // Catch: java.lang.Throwable -> L65
            r7.LJLJJL = r0     // Catch: java.lang.Throwable -> L65
            java.lang.Object r3 = r9.invoke(r7)     // Catch: java.lang.Throwable -> L65
            if (r3 != r2) goto L4c
            return r2
        L4c:
            r7 = r8
        L4d:
            r7.getClass()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r4
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r6)
            r0.append(r1)
            X.X1D.LIZIZ(r0)
            r7.LJIIJJI = r1
            return r3
        L65:
            r3 = move-exception
            r7 = r8
        L67:
            r7.getClass()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = LJFF(r3)     // Catch: java.lang.Throwable -> L78
            r7.LJIIZILJ = r2     // Catch: java.lang.Throwable -> L78
            r1 = 402(0x192, float:5.63E-43)
            r0 = 60
            X.C73802v2.LIZIZ(r1, r2, r0)     // Catch: java.lang.Throwable -> L78
            throw r3     // Catch: java.lang.Throwable -> L78
        L78:
            r3 = move-exception
            r7.getClass()
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r4
            java.lang.StringBuilder r0 = X.X1D.LIZ()
            r0.append(r6)
            r0.append(r1)
            X.X1D.LIZIZ(r0)
            r7.LJIIJJI = r1
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37065Egf.LJIIL(X.Yns, X.2kd):java.lang.Object");
    }
}
