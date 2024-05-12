package X;

import kotlin.jvm.internal.o;

/* renamed from: X.ZzP, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91735ZzP {
    public static final void LIZ(Boolean bool, EnumC91751Zzf type, boolean z, InterfaceC65784Pro<C76800UCe> onClick, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        boolean z2 = z;
        Boolean bool2 = bool;
        o.LJIIIZ(type, "type");
        o.LJIIIZ(onClick, "onClick");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-562962422);
        int i8 = i2 & 1;
        if (i8 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(bool2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(type)) {
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
            if (LJIL.LJI(z2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(onClick)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if (((i3 & 5851) ^ 1170) != 0 || !LJIL.LIZ()) {
            if (i8 != 0) {
                bool2 = Boolean.FALSE;
            }
            if (i9 != 0) {
                z2 = true;
            }
            if (o.LJ(bool2, Boolean.TRUE)) {
                C35991b9 LJJJJLI = LJIL.LJJJJLI();
                if (LJJJJLI == null) {
                    return;
                }
                LJJJJLI.LIZLLL = new C92438aAk(bool2, type, z2, onClick, i, i2);
                return;
            }
            LJIL.LJJIIJ(-711988086);
            int[] iArr = C91734ZzO.LIZ;
            int i10 = iArr[type.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    str = "pipo_payin_PP_learn_more";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str = "pipo_cashier_privacy_policy_three";
            }
            LJIL.LJJJJJ(false);
            LJIL.LJJIIJ(-1477301852);
            int i11 = iArr[type.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    str2 = "pipo_payin_PP_content";
                } else {
                    throw new C162476Zf();
                }
            } else {
                str2 = "pipo_payin_checkout_PIPO_Privacy_Policy";
            }
            LJIL.LJJJJJ(false);
            String LIZ = C92054a4Y.LIZ(str, new String[0]);
            C91746Zza.LIZIZ(C92054a4Y.LIZ(str2, LIZ), LIZ, z2, onClick, LJIL, (i3 & 896) | (i3 & 7168), 0);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI2 = LJIL.LJJJJLI();
        if (LJJJJLI2 == null) {
            return;
        }
        LJJJJLI2.LIZLLL = new C92439aAl(bool2, type, z2, onClick, i, i2);
    }
}
