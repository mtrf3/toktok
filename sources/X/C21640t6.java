package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0t6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21640t6 {
    public static final long LIZ = C78555UsJ.LIZJ(0, 0, 0, 0);
    public static final float LIZIZ = 16;
    public static final float LIZJ = 12;
    public static final InterfaceC07790Sh LIZLLL;

    static {
        float f = 48;
        LIZLLL = C09290Yb.LIZLLL(InterfaceC07790Sh.LJJJI, f, f);
    }

    public static final Object LIZJ(InterfaceC274115t interfaceC274115t) {
        InterfaceC274715z interfaceC274715z;
        o.LJIIIZ(interfaceC274115t, "<this>");
        Object LJIIJJI = interfaceC274115t.LJIIJJI();
        if (!(LJIIJJI instanceof InterfaceC274715z) || (interfaceC274715z = (InterfaceC274715z) LJIIJJI) == null) {
            return null;
        }
        return interfaceC274715z.getLayoutId();
    }

    public static final int LIZLLL(AbstractC39201gK abstractC39201gK) {
        if (abstractC39201gK != null) {
            return abstractC39201gK.LJLILLLLZI;
        }
        return 0;
    }

    public static final int LJ(AbstractC39201gK abstractC39201gK) {
        if (abstractC39201gK != null) {
            return abstractC39201gK.LJLIL;
        }
        return 0;
    }

    public static final void LIZIZ(long j, C08370Un c08370Un, Float f, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Float f2 = f;
        C08370Un c08370Un2 = c08370Un;
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-399493340);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIIJ(j)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(c08370Un2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(f2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(content)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 5851) != 1170 || !LJIL.LIZ()) {
            Float f3 = null;
            if (i8 != 0) {
                c08370Un2 = null;
            }
            if (i9 == 0) {
                f3 = f2;
            }
            f2 = f3;
            C40431iJ LJ = C1DJ.LJ(LJIL, 494684590, new C25H(i3, j, f3, content));
            if (c08370Un2 != null) {
                LJIL.LJJIIJ(-2009952864);
                C21430sl.LIZ(c08370Un2, LJ, LJIL, ((i3 >> 3) & 14) | 48);
            } else {
                LJIL.LJJIIJ(-2009952812);
                LJ.invoke(LJIL, 6);
            }
            LJIL.LJJJJJ(false);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C25G(j, c08370Un2, f2, content, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0114, code lost:
    
        if (r2 == X.C24500xi.LIZIZ) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.EnumC21390sh r42, java.lang.String r43, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r44, X.InterfaceC14810i5 r45, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r46, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r47, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r48, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r49, boolean r50, boolean r51, boolean r52, X.C0X9 r53, X.InterfaceC09420Yo r54, X.InterfaceC21550sx r55, X.InterfaceC88471Ynr<? super X.InterfaceC24520xk, ? super java.lang.Integer, X.C76800UCe> r56, X.InterfaceC24520xk r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21640t6.LIZ(X.0sh, java.lang.String, X.Ynr, X.0i5, X.Ynr, X.Ynr, X.Ynr, X.Ynr, boolean, boolean, boolean, X.0X9, X.0Yo, X.0sx, X.Ynr, X.0xk, int, int, int):void");
    }
}
