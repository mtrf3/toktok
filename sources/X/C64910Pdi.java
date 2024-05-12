package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Pdi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64910Pdi extends AbstractC64911Pdj<C64907Pdf, C64797Pbt<?>> {
    public final C0M6<String, C0M6<String, EQ5>> LIZLLL = new C0M6<>(16);
    public final String LJ = "MemoryCache";

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r0 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        r2.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return X.X1D.LIZIZ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        r0 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(X.C64907Pdf r3) {
        /*
            X.Pdk r0 = r3.LIZLLL
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "GET"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)
            java.lang.String r1 = "mutableUrl.originUrl"
            if (r0 == 0) goto L16
            X.PY0 r0 = r3.LIZIZ
            java.lang.String r0 = r0.LJIIIIZZ
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
        L15:
            return r0
        L16:
            boolean r0 = X.C78939UyV.LJJIJLIJ(r3)
            if (r0 == 0) goto L54
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            X.PY0 r0 = r3.LIZIZ
            java.lang.String r0 = r0.LJIIIIZZ
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r1)
            r2.append(r0)
            java.lang.String r0 = "m:post "
            r2.append(r0)
            X.Pdk r0 = r3.LIZLLL
            java.lang.Object r1 = r0.LIZJ
            X.PVP r1 = (X.PVP) r1
            if (r1 == 0) goto L4a
            X.PVR r0 = new X.PVR
            r0.<init>(r1)
        L3c:
            java.lang.String r0 = r0.md5Stub()
            if (r0 == 0) goto L51
        L42:
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            goto L15
        L4a:
            java.lang.Object r0 = r0.LIZIZ
            com.bytedance.retrofit2.mime.TypedOutput r0 = (com.bytedance.retrofit2.mime.TypedOutput) r0
            if (r0 == 0) goto L51
            goto L3c
        L51:
            java.lang.String r0 = ""
            goto L42
        L54:
            r0 = 0
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64910Pdi.LIZIZ(X.Pdf):java.lang.String");
    }

    public final String LIZJ(Object obj) {
        C64907Pdf c64907Pdf = (C64907Pdf) obj;
        if (C78966Uyw.LJJJ(c64907Pdf, 20)) {
            return this.LIZJ;
        }
        String LIZIZ = LIZIZ(c64907Pdf);
        if (LIZIZ != null) {
            return LIZIZ;
        }
        return this.LIZIZ;
    }

    public final C64797Pbt LIZLLL(Object obj) {
        String LJIIZILJ;
        EQ5 eq5;
        C64907Pdf c64907Pdf = (C64907Pdf) obj;
        String LIZIZ = LIZIZ(c64907Pdf);
        if (LIZIZ == null) {
            return null;
        }
        C76H LJII = C78966Uyw.LJII(c64907Pdf);
        if (LJII == null || (LJIIZILJ = LJII.LIZLLL) == null) {
            LJIIZILJ = C78939UyV.LJIIZILJ(c64907Pdf);
        }
        synchronized (this.LIZLLL) {
            C0M6<String, EQ5> LIZIZ2 = this.LIZLLL.LIZIZ(LJIIZILJ);
            if (LIZIZ2 != null) {
                eq5 = LIZIZ2.LIZIZ(LIZIZ);
            } else {
                eq5 = null;
            }
        }
        if (eq5 == null) {
            return null;
        }
        if (System.currentTimeMillis() > eq5.LIZ) {
            synchronized (this.LIZLLL) {
                C0M6<String, EQ5> LIZIZ3 = this.LIZLLL.LIZIZ(LJIIZILJ);
                if (LIZIZ3 != null) {
                    LIZIZ3.LIZLLL(LIZIZ);
                }
            }
            return null;
        }
        if (C78966Uyw.LJJJ(c64907Pdf, 16)) {
            eq5.LIZ = System.currentTimeMillis() + eq5.LIZIZ;
        }
        C64797Pbt<?> markFromCache = eq5.LIZJ;
        o.LJIIIZ(markFromCache, "$this$markFromCache");
        C78555UsJ.LJJIIJZLJL(markFromCache, "is_from_cache", Boolean.TRUE);
        C78555UsJ.LJJIIJZLJL(markFromCache, "from_cache_type", "Memory");
        return eq5.LIZJ;
    }

    public final void LJ(C64907Pdf c64907Pdf, C64797Pbt c64797Pbt) {
        C76H LJII;
        String LIZIZ;
        if (!c64797Pbt.LIZIZ() || (LJII = C78966Uyw.LJII(c64907Pdf)) == null || (LIZIZ = LIZIZ(c64907Pdf)) == null) {
            return;
        }
        String str = LJII.LIZLLL;
        if (str == null) {
            str = C78939UyV.LJIIZILJ(c64907Pdf);
        }
        synchronized (this.LIZLLL) {
            C0M6<String, EQ5> LIZIZ2 = this.LIZLLL.LIZIZ(str);
            if (LIZIZ2 == null) {
                LIZIZ2 = new C0M6<>(LJII.LIZ);
                this.LIZLLL.LIZJ(str, LIZIZ2);
            }
            EQ5 LIZIZ3 = LIZIZ2.LIZIZ(LIZIZ);
            if (LIZIZ3 != null) {
                LIZIZ3.LIZJ = c64797Pbt;
                LIZIZ3.LIZIZ = LJII.LIZIZ;
                LIZIZ3.LIZ = System.currentTimeMillis() + LIZIZ3.LIZIZ;
            } else {
                LIZIZ2.LIZJ(LIZIZ, new EQ5(LJII.LIZIZ, c64797Pbt));
            }
        }
        C78555UsJ.LJJIIJZLJL(c64797Pbt, "is_fresh_cache", Boolean.TRUE);
    }
}
