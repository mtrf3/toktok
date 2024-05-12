package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ZzZ, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91745ZzZ {
    public static final void LIZ(EnumC91839a15 enumC91839a15, boolean z, boolean z2, boolean z3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        String LIZ;
        boolean z4;
        boolean z5 = z;
        EnumC91839a15 enumC91839a152 = enumC91839a15;
        boolean z6 = z3;
        boolean z7 = z2;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-685418238);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(enumC91839a152)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJI(z5)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJI(z7)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i12 = i2 & 8;
        if (i12 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJI(z6)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        int i13 = i2 & 16;
        if (i13 != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        if (((46811 & i3) ^ 9362) != 0 || !LJIL.LIZ()) {
            if (i9 != 0) {
                enumC91839a152 = EnumC91839a15.ALL;
            }
            if (i10 != 0) {
                z5 = false;
            }
            if (i11 != 0) {
                z7 = false;
            }
            if (i12 != 0) {
                z6 = true;
            }
            if (i13 != 0) {
                interfaceC65784Pro2 = C92474aBK.LJLIL;
            }
            InterfaceC91779a07 textCell = C91665ZyH.LIZ().getTextCell();
            int i14 = C91744ZzY.LIZ[enumC91839a152.ordinal()];
            if (i14 != 1) {
                if (i14 != 2) {
                    LIZ = C92054a4Y.LIZ("pipo_payin_logo_CCDC", new String[0]);
                } else {
                    LIZ = C92054a4Y.LIZ("pipo_payin_logo_CCDC_DC", new String[0]);
                }
            } else {
                LIZ = C92054a4Y.LIZ("pipo_payin_logo_CCDC_CC", new String[0]);
            }
            int i15 = i3 << 9;
            z4 = z7;
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = interfaceC65784Pro2;
            boolean z8 = z5;
            boolean z9 = z7;
            boolean z10 = z6;
            textCell.LIZ(Integer.valueOf(R.drawable.in), LIZ, false, null, z8, z9, false, z10, null, C1DJ.LJ(LJIL, -819892736, new C92475aBL(z7)), interfaceC65784Pro3, LJIL, (i15 & 458752) | (i15 & 57344) | 907545984 | ((i3 << 12) & 29360128), ((i3 >> 12) & 14) | 64);
        } else {
            LJIL.LIZLLL();
            z4 = z7;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92476aBM(enumC91839a152, z5, z4, z6, interfaceC65784Pro2, i, i2);
    }
}
