package X;

import android.os.Bundle;
import java.math.BigInteger;

/* renamed from: X.Zbc, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90260Zbc {
    public static final C90469Zez LIZLLL = new C90469Zez("ApplicationAnalyticsUtils");
    public static final String LJ = "20.1.0";
    public final String LIZ;
    public final java.util.Map<Integer, Integer> LIZIZ;
    public final java.util.Map<Integer, Integer> LIZJ;

    public final C90979ZnD LIZIZ(C90252ZbU c90252ZbU) {
        long j;
        C90979ZnD LJIIJJI = C91028Zo0.LJIIJJI();
        long j2 = c90252ZbU.LIZJ;
        if (LJIIJJI.LJLJI) {
            LJIIJJI.LJ();
            LJIIJJI.LJLJI = false;
        }
        C91028Zo0.LJIJJ((C91028Zo0) LJIIJJI.LJLILLLLZI, j2);
        int i = c90252ZbU.LIZLLL;
        c90252ZbU.LIZLLL = i + 1;
        if (LJIIJJI.LJLJI) {
            LJIIJJI.LJ();
            LJIIJJI.LJLJI = false;
        }
        C91028Zo0.LJIILLIIL((C91028Zo0) LJIIJJI.LJLILLLLZI, i);
        String str = c90252ZbU.LIZIZ;
        if (str != null) {
            if (LJIIJJI.LJLJI) {
                LJIIJJI.LJ();
                LJIIJJI.LJLJI = false;
            }
            C91028Zo0.LJJ((C91028Zo0) LJIIJJI.LJLILLLLZI, str);
        }
        String str2 = c90252ZbU.LJI;
        if (str2 != null) {
            if (LJIIJJI.LJLJI) {
                LJIIJJI.LJ();
                LJIIJJI.LJLJI = false;
            }
            C91028Zo0.LJIJJLI((C91028Zo0) LJIIJJI.LJLILLLLZI, str2);
        }
        C90960Zmu LJIIJ = C91010Zni.LJIIJ();
        String str3 = LJ;
        if (LJIIJ.LJLJI) {
            LJIIJ.LJ();
            LJIIJ.LJLJI = false;
        }
        C91010Zni.LJIILL((C91010Zni) LJIIJ.LJLILLLLZI, str3);
        String str4 = this.LIZ;
        if (LJIIJ.LJLJI) {
            LJIIJ.LJ();
            LJIIJ.LJLJI = false;
        }
        C91010Zni.LJIIL((C91010Zni) LJIIJ.LJLILLLLZI, str4);
        C91010Zni LIZJ = LJIIJ.LIZJ();
        if (LJIIJJI.LJLJI) {
            LJIIJJI.LJ();
            LJIIJJI.LJLJI = false;
        }
        C91028Zo0.LJIJ((C91028Zo0) LJIIJJI.LJLILLLLZI, LIZJ);
        C90965Zmz LJIIJ2 = C91013Znl.LJIIJ();
        if (c90252ZbU.LIZ != null) {
            C90943Zmd LJIIJ3 = C90994ZnS.LJIIJ();
            String str5 = c90252ZbU.LIZ;
            if (LJIIJ3.LJLJI) {
                LJIIJ3.LJ();
                LJIIJ3.LJLJI = false;
            }
            C90994ZnS.LJIIL((C90994ZnS) LJIIJ3.LJLILLLLZI, str5);
            C90994ZnS LIZJ2 = LJIIJ3.LIZJ();
            if (LJIIJ2.LJLJI) {
                LJIIJ2.LJ();
                LJIIJ2.LJLJI = false;
            }
            C91013Znl.LJIILLIIL((C91013Znl) LJIIJ2.LJLILLLLZI, LIZJ2);
        }
        if (LJIIJ2.LJLJI) {
            LJIIJ2.LJ();
            LJIIJ2.LJLJI = false;
        }
        C91013Znl.LJIIZILJ((C91013Znl) LJIIJ2.LJLILLLLZI, false);
        String str6 = c90252ZbU.LJ;
        if (str6 != null) {
            try {
                String replace = str6.replace("-", "");
                j = new BigInteger(replace.substring(0, Math.min(16, replace.length())), 16).longValue();
            } catch (NumberFormatException unused) {
                LIZLLL.getClass();
                j = 0;
            }
            if (LJIIJ2.LJLJI) {
                LJIIJ2.LJ();
                LJIIJ2.LJLJI = false;
            }
            C91013Znl.LJIJ((C91013Znl) LJIIJ2.LJLILLLLZI, j);
        }
        int i2 = c90252ZbU.LJFF;
        if (LJIIJ2.LJLJI) {
            LJIIJ2.LJ();
            LJIIJ2.LJLJI = false;
        }
        C91013Znl.LJIJJLI((C91013Znl) LJIIJ2.LJLILLLLZI, i2);
        if (LJIIJJI.LJLJI) {
            LJIIJJI.LJ();
            LJIIJJI.LJLJI = false;
        }
        C91028Zo0.LJIIZILJ((C91028Zo0) LJIIJJI.LJLILLLLZI, LJIIJ2.LIZJ());
        return LJIIJJI;
    }

    public C90260Zbc(Bundle bundle, String str) {
        this.LIZ = str;
        this.LIZIZ = C90288Zc4.LIZ(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR");
        this.LIZJ = C90288Zc4.LIZ(bundle, "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C91028Zo0 LIZ(X.C90252ZbU r5, int r6) {
        /*
            r4 = this;
            X.ZnD r2 = r4.LIZIZ(r5)
            MessageType extends X.Zmk<MessageType, BuilderType> r0 = r2.LJLILLLLZI
            X.Zo0 r0 = (X.C91028Zo0) r0
            X.Znl r0 = r0.LJIIJ()
            X.Zmz r3 = X.C91013Znl.LJIIJJI(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r4.LIZJ
            if (r0 == 0) goto L1e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L64
        L1e:
            int r0 = r6 + 10000
        L20:
            r3.LJI(r0)
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r4.LIZIZ
            if (r0 == 0) goto L31
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L54
        L31:
            int r1 = r6 + 10000
        L33:
            boolean r0 = r3.LJLJI
            if (r0 == 0) goto L3d
            r3.LJ()
            r0 = 0
            r3.LJLJI = r0
        L3d:
            MessageType extends X.Zmk<MessageType, BuilderType> r0 = r3.LJLILLLLZI
            X.Znl r0 = (X.C91013Znl) r0
            X.C91013Znl.LJIJJ(r0, r1)
            X.Zmk r0 = r3.LIZJ()
            X.Znl r0 = (X.C91013Znl) r0
            r2.LJI(r0)
            X.Zmk r0 = r2.LIZJ()
            X.Zo0 r0 = (X.C91028Zo0) r0
            return r0
        L54:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r4.LIZIZ
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.QH7.LJIIIIZZ(r0)
            int r1 = r0.intValue()
            goto L33
        L64:
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r4.LIZJ
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.QH7.LJIIIIZZ(r0)
            int r0 = r0.intValue()
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90260Zbc.LIZ(X.ZbU, int):X.Zo0");
    }
}
