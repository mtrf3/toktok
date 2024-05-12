package X;

import android.text.TextUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a1g, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91876a1g {
    public static final void LIZ(int i, int i2, InterfaceC24520xk interfaceC24520xk, String str, InterfaceC65784Pro onRetry, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        String LIZIZ;
        InterfaceC07790Sh LJIIIIZZ;
        boolean z2 = z;
        String str2 = str;
        o.LJIIIZ(onRetry, "onRetry");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-575555744);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJI(z2)) {
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
            if (LJIL.LJIJJ(str2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(onRetry)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if (((i3 & 731) ^ 146) != 0 || !LJIL.LIZ()) {
            if (i7 != 0) {
                z2 = false;
            }
            if (i8 != 0) {
                str2 = null;
            }
            String LIZ = C92054a4Y.LIZ(o.LJIILLIIL(str2, "pipo_common_error_"), new String[0]);
            if (!(!TextUtils.equals(r6, LIZ))) {
                LIZ = C92054a4Y.LIZ("pipo_common_error_try_again", new String[0]);
            }
            if (str2 == null || !new OJD("[A-Za-z]{2}[0-9]{4}").matches(str2)) {
                LIZIZ = "";
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" [");
                LIZ2.append(C92054a4Y.LIZ("pipo_common_error_code_update", new String[0]));
                LIZ2.append(": ");
                LIZ2.append((Object) str2);
                LIZ2.append(']');
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            if (z2) {
                LJIIIIZZ = C09290Yb.LJI(c1m1);
            } else {
                LJIIIIZZ = C09290Yb.LJIIIIZZ(C09290Yb.LJII(c1m1), 323);
            }
            InterfaceC91778a06 stateView = C91665ZyH.LIZ().getStateView();
            String LIZ3 = C92054a4Y.LIZ("pipo_payin_everypage_abnormal_main", new String[0]);
            String LIZ4 = C92054a4Y.LIZ("pipo_payin_everypage_abnormal_button", new String[0]);
            String LJIILLIIL = o.LJIILLIIL(LIZIZ, LIZ);
            int i9 = i3 << 9;
            stateView.LIZ(LIZ3, LIZ4, LJIIIIZZ, z2, LJIILLIIL, onRetry, LJIL, (i9 & 7168) | 2097152 | (i9 & 458752));
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92716aFE(i, i2, str2, onRetry, z2);
    }
}
