package X;

import kotlin.jvm.internal.AqS111S0101000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.V5t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79181V5t {
    public static final void LIZ(C32541Pm listState, int i, InterfaceC65784Pro<C76800UCe> onLoadMore, InterfaceC24520xk interfaceC24520xk, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(onLoadMore, "onLoadMore");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-398196064);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            if (LJIL.LJIJJ(listState)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i5 | i2;
        } else {
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            if (LJIL.LJIIIZ(i8)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 896) == 0) {
            if (LJIL.LJIJJ(onLoadMore)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i4 |= i7;
        }
        if ((i4 & 731) != 146 || !LJIL.LIZ()) {
            if (i9 != 0) {
                i8 = 3;
            }
            LJIL.LJJIIJ(-492369756);
            Object LJJJZ = LJIL.LJJJZ();
            InterfaceC24520xk.LIZ.getClass();
            C24490xh c24490xh = C24500xi.LIZIZ;
            if (LJJJZ == c24490xh) {
                LJJJZ = C78966Uyw.LJIJI(new AqS111S0101000_13(listState, i8, 1));
                LJIL.LJLJLLL(LJJJZ);
            }
            LJIL.LJJJJJ(false);
            InterfaceC24760y8 interfaceC24760y8 = (InterfaceC24760y8) LJJJZ;
            LJIL.LJJIIJ(511388516);
            boolean LJIJJ = LJIL.LJIJJ(interfaceC24760y8) | LJIL.LJIJJ(onLoadMore);
            Object LJJJZ2 = LJIL.LJJJZ();
            if (LJIJJ || LJJJZ2 == c24490xh) {
                LJJJZ2 = new C61489OBh(interfaceC24760y8, onLoadMore, null);
                LJIL.LJLJLLL(LJJJZ2);
            }
            LJIL.LJJJJJ(false);
            C24610xt.LJ(interfaceC24760y8, (InterfaceC88471Ynr) LJJJZ2, LJIL);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C79198V6k(listState, i8, onLoadMore, i2, i3);
    }
}
