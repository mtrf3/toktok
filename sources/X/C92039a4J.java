package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.o;

/* renamed from: X.a4J, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92039a4J {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int, boolean] */
    public static final void LIZ(InterfaceC07790Sh interfaceC07790Sh, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> mainContent, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> trailingContent, int i, int i2, int i3, InterfaceC24520xk interfaceC24520xk, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ?? r1;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2 = interfaceC88471Ynr;
        InterfaceC07790Sh interfaceC07790Sh2 = interfaceC07790Sh;
        int i14 = i3;
        int i15 = i;
        int i16 = i2;
        o.LJIIIZ(mainContent, "mainContent");
        o.LJIIIZ(trailingContent, "trailingContent");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1547521250);
        int i17 = i5 & 1;
        if (i17 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 14) == 0) {
            if (LJIL.LJIJJ(interfaceC07790Sh2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i6 = i7 | i4;
        } else {
            i6 = i4;
        }
        if ((i5 & 2) != 0) {
            i6 |= 48;
        } else if ((i4 & 112) == 0) {
            if (LJIL.LJIJJ(mainContent)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i6 |= i8;
        }
        int i18 = i5 & 4;
        if (i18 != 0) {
            i6 |= 384;
        } else if ((i4 & 896) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr2)) {
                i9 = 256;
            } else {
                i9 = 128;
            }
            i6 |= i9;
        }
        if ((i5 & 8) != 0) {
            i6 |= 3072;
        } else if ((i4 & 7168) == 0) {
            if (LJIL.LJIJJ(trailingContent)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i6 |= i10;
        }
        int i19 = i5 & 16;
        if (i19 != 0) {
            i6 |= 24576;
        } else if ((57344 & i4) == 0) {
            if (LJIL.LJIIIZ(i15)) {
                i11 = 16384;
            } else {
                i11 = FileUtils.BUFFER_SIZE;
            }
            i6 |= i11;
        }
        int i20 = i5 & 32;
        if (i20 != 0) {
            i6 |= 196608;
        } else if ((458752 & i4) == 0) {
            if (LJIL.LJIIIZ(i16)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i6 |= i12;
        }
        int i21 = i5 & 64;
        if (i21 != 0) {
            i6 |= 1572864;
        } else if ((3670016 & i4) == 0) {
            if (LJIL.LJIIIZ(i14)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i6 |= i13;
        }
        if (((i6 & 2995931) ^ 599186) != 0 || !LJIL.LIZ()) {
            if (i17 != 0) {
                interfaceC07790Sh2 = InterfaceC07790Sh.LJJJI;
            }
            if (i18 != 0) {
                interfaceC88471Ynr2 = C92036a4G.LIZ;
            }
            if (i19 != 0) {
                i15 = 0;
            }
            if (i20 != 0) {
                i16 = 0;
            }
            if (i21 != 0) {
                i14 = 0;
            }
            Object[] objArr = {Integer.valueOf(i15), trailingContent, Integer.valueOf(i14), mainContent, interfaceC88471Ynr2, Integer.valueOf(i16)};
            LJIL.LJJIIJ(-568225417);
            int i22 = 0;
            boolean z = false;
            do {
                z |= LJIL.LJIJJ(objArr[i22]);
                i22++;
            } while (i22 < 6);
            Object LJJJZ = LJIL.LJJJZ();
            if (!z) {
                InterfaceC24520xk.LIZ.getClass();
                if (LJJJZ != C24500xi.LIZIZ) {
                    r1 = 0;
                    LJIL.LJJJJJ(r1);
                    AnonymousClass165.LIZ(interfaceC07790Sh2, (InterfaceC88471Ynr) LJJJZ, LJIL, i6 & 14, r1);
                }
            }
            r1 = 0;
            LJJJZ = new C92978aJS(i15, trailingContent, i14, mainContent, interfaceC88471Ynr2, i16);
            LJIL.LJLJLLL(LJJJZ);
            LJIL.LJJJJJ(r1);
            AnonymousClass165.LIZ(interfaceC07790Sh2, (InterfaceC88471Ynr) LJJJZ, LJIL, i6 & 14, r1);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        InterfaceC07790Sh interfaceC07790Sh3 = interfaceC07790Sh2;
        LJJJJLI.LIZLLL = new C92979aJT(interfaceC07790Sh3, mainContent, interfaceC88471Ynr2, trailingContent, i15, i16, i14, i4, i5);
    }
}
