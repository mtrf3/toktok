package X;

import androidx.compose.ui.platform.g1;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a3Q, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91984a3Q {
    public static final void LIZIZ(InterfaceC91758Zzm controller, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        long j;
        InterfaceC07790Sh LJI;
        C11850dJ c11850dJ2 = c11850dJ;
        boolean z2 = z;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1431802810);
        if ((i2 & 2) != 0) {
            interfaceC11790dD2 = null;
        }
        if ((i2 & 4) != 0) {
            c11850dJ2 = null;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        if ((i2 & 16) != 0) {
            interfaceC65784Pro2 = C92865aHd.LJLIL;
        }
        C24610xt.LJ(C76800UCe.LIZ, new C93120aLk(controller, null), LJIL);
        if (c11850dJ2 == null) {
            if (C91671ZyN.LIZ) {
                j = C78897Uxp.LJFF(2147483648L);
            } else {
                j = C78897Uxp.LJFF(2902458368L);
            }
        } else {
            j = c11850dJ2.LIZ;
        }
        if (interfaceC11790dD2 == null || (LJI = C78840Uwu.LJI(InterfaceC07790Sh.LJJJI, interfaceC11790dD2)) == null) {
            LJI = InterfaceC07790Sh.LJJJI;
        }
        C06500Ni.LJFF(((Boolean) controller.LIZIZ().getValue()).booleanValue(), null, C06670Nz.LIZLLL(null, 3).LIZIZ(C06670Nz.LJFF(C1JI.LJJIJIIJIL((int) controller.LIZJ(), 0, new C1JS(0.33f, 1.0f, 0.68f, 1.0f), 2), 1.2f, 4)), C06670Nz.LJ(null, 3), null, C1DJ.LJ(LJIL, -819892096, new C92866aHe(LJI, z2, j, interfaceC65784Pro2, content, i)), LJIL, 199680, 18);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92867aHf(controller, interfaceC11790dD2, c11850dJ2, z2, interfaceC65784Pro2, content, i, i2);
    }

    public static final void LIZJ(String str, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, String str2, String primaryActionText, InterfaceC65784Pro<C76800UCe> primaryAction, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        long LJFF;
        InterfaceC07790Sh LIZ;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = interfaceC88471Ynr;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr2;
        o.LJIIIZ(primaryActionText, "primaryActionText");
        o.LJIIIZ(primaryAction, "primaryAction");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-110111688);
        int i13 = i2 & 1;
        if (i13 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            if (LJIL.LJIJJ(str4)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i14 = i2 & 2;
        if (i14 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr3)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            if (LJIL.LJIJJ(str5)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (LJIL.LJIJJ(primaryActionText)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((57344 & i) == 0) {
            if (LJIL.LJIJJ(primaryAction)) {
                i8 = 16384;
            } else {
                i8 = FileUtils.BUFFER_SIZE;
            }
            i3 |= i8;
        }
        int i16 = i2 & 32;
        if (i16 != 0) {
            i3 |= 196608;
        } else if ((458752 & i) == 0) {
            if (LJIL.LJIJJ(str6)) {
                i9 = 131072;
            } else {
                i9 = 65536;
            }
            i3 |= i9;
        }
        int i17 = i2 & 64;
        if (i17 != 0) {
            i3 |= 1572864;
        } else if ((3670016 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro4)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        int i18 = i2 & 128;
        if (i18 != 0) {
            i3 |= 12582912;
        } else if ((29360128 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC88471Ynr4)) {
                i11 = 8388608;
            } else {
                i11 = 4194304;
            }
            i3 |= i11;
        }
        int i19 = i2 & 256;
        if (i19 != 0) {
            i3 |= 100663296;
        } else if ((234881024 & i) == 0) {
            if (LJIL.LJIJJ(interfaceC65784Pro2)) {
                i12 = 67108864;
            } else {
                i12 = 33554432;
            }
            i3 |= i12;
        }
        if (((i3 & 191739611) ^ 38347922) != 0 || !LJIL.LIZ()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro5 = null;
            if (i13 != 0) {
                str4 = null;
            }
            if (i14 != 0) {
                interfaceC88471Ynr3 = null;
            }
            if (i15 != 0) {
                str5 = null;
            }
            if (i16 != 0) {
                str6 = null;
            }
            if (i17 != 0) {
                interfaceC65784Pro4 = null;
            }
            if (i18 != 0) {
                interfaceC88471Ynr4 = C91983a3P.LIZIZ;
            }
            if (i19 == 0) {
                interfaceC65784Pro5 = interfaceC65784Pro2;
            }
            C43401n6 LIZ2 = C17480mO.LIZ(12);
            float f = 0;
            if (C91671ZyN.LIZ) {
                LJFF = C78897Uxp.LJFF(4294967295L);
            } else {
                LJFF = C78897Uxp.LJFF(4281216558L);
            }
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            o.LJIIIZ(c1m1, "<this>");
            LIZ = C07770Sf.LIZ(c1m1, g1.LIZ, C92870aHi.LJLIL);
            interfaceC65784Pro3 = interfaceC65784Pro5;
            C78857UxB.LJI(LIZ, LIZ2, LJFF, f, C1DJ.LJ(LJIL, -819888277, new C92868aHg(i3, str4, str5, primaryActionText, str6, primaryAction, interfaceC65784Pro3, interfaceC65784Pro4, interfaceC88471Ynr4, interfaceC88471Ynr3)), LJIL, 24);
        } else {
            LJIL.LIZLLL();
            interfaceC65784Pro3 = interfaceC65784Pro2;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92869aHh(str4, interfaceC88471Ynr3, str5, primaryActionText, primaryAction, str6, interfaceC65784Pro4, interfaceC88471Ynr4, interfaceC65784Pro3, i, i2);
    }

    public static final void LIZ(InterfaceC91758Zzm controller, String str, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, String str2, String primaryActionText, InterfaceC65784Pro<C76800UCe> primaryAction, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3;
        boolean z2 = z;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro2;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = interfaceC88471Ynr;
        String str4 = str2;
        String str5 = str3;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr2;
        String str6 = str;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro5 = interfaceC65784Pro;
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(primaryActionText, "primaryActionText");
        o.LJIIIZ(primaryAction, "primaryAction");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1504357667);
        C11850dJ c11850dJ2 = null;
        if ((i3 & 2) != 0) {
            str6 = null;
        }
        if ((i3 & 4) != 0) {
            interfaceC88471Ynr3 = null;
        }
        if ((i3 & 8) != 0) {
            str4 = null;
        }
        if ((i3 & 64) != 0) {
            str5 = null;
        }
        if ((i3 & 128) != 0) {
            interfaceC65784Pro5 = null;
        }
        if ((i3 & 256) != 0) {
            interfaceC88471Ynr4 = C91983a3P.LIZ;
        }
        if ((i3 & 512) != 0) {
            interfaceC11790dD2 = null;
        }
        if ((i3 & 1024) == 0) {
            c11850dJ2 = c11850dJ;
        }
        if ((i3 & 2048) != 0) {
            z2 = true;
        }
        if ((i3 & 4096) != 0) {
            interfaceC65784Pro4 = C92862aHa.LJLIL;
        }
        if (((Boolean) controller.LJ().getValue()).booleanValue()) {
            int i4 = i2 << 6;
            interfaceC65784Pro3 = interfaceC65784Pro4;
            LIZIZ(controller, interfaceC11790dD2, c11850dJ2, z2, interfaceC65784Pro4, C1DJ.LJ(LJIL, -819890255, new C92863aHb(str6, interfaceC88471Ynr3, str4, primaryActionText, primaryAction, str5, interfaceC65784Pro5, interfaceC88471Ynr4, interfaceC65784Pro4, i, i2)), LJIL, ((i >> 24) & 112) | 196616 | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
            C15980jy.LIZ(false, new IDqS178S0200000_31(controller, (InterfaceC91758Zzm) interfaceC65784Pro4, (InterfaceC65784Pro<C76800UCe>) 23), LJIL, 0, 1);
        } else {
            interfaceC65784Pro3 = interfaceC65784Pro4;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92864aHc(controller, str6, interfaceC88471Ynr3, str4, primaryActionText, primaryAction, str5, interfaceC65784Pro5, interfaceC88471Ynr4, interfaceC11790dD2, c11850dJ2, z2, interfaceC65784Pro3, i, i2, i3);
    }
}
