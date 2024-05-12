package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS178S0200000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a3Y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91992a3Y {
    public static final C11850dJ LIZLLL() {
        if (o.LJ(C91671ZyN.LIZJ, C92119a5b.LIZ)) {
            return new C11850dJ(C11850dJ.LIZIZ(C11850dJ.LIZIZ, 0.25f));
        }
        return null;
    }

    public static final C43401n6 LJ() {
        if (o.LJ(C91671ZyN.LIZJ, C92119a5b.LIZ)) {
            return C17480mO.LIZ(24);
        }
        return null;
    }

    public static final void LIZ(InterfaceC91758Zzm controller, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> content, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        long j;
        InterfaceC07790Sh LJI;
        long j2;
        C11850dJ c11850dJ2 = c11850dJ;
        boolean z2 = z;
        InterfaceC11790dD interfaceC11790dD2 = interfaceC11790dD;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(content, "content");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1335444040);
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
            interfaceC65784Pro2 = C92881aHt.LJLIL;
        }
        C24610xt.LJ(C76800UCe.LIZ, new C93121aLl(controller, null), LJIL);
        if (c11850dJ2 == null) {
            if (C91671ZyN.LIZ) {
                j2 = C11850dJ.LIZIZ;
            } else {
                j2 = C11850dJ.LIZJ;
            }
            j = C11850dJ.LIZIZ(j2, 0.4f);
        } else {
            j = c11850dJ2.LIZ;
        }
        if (interfaceC11790dD2 == null || (LJI = C78840Uwu.LJI(InterfaceC07790Sh.LJJJI, interfaceC11790dD2)) == null) {
            LJI = InterfaceC07790Sh.LJJJI;
        }
        C06500Ni.LJFF(((Boolean) controller.LIZIZ().getValue()).booleanValue(), null, C06670Nz.LIZLLL(null, 3).LIZIZ(C06670Nz.LJFF(null, 1.2f, 5)), C06670Nz.LJ(null, 3), null, C1DJ.LJ(LJIL, -819891767, new C92882aHu(LJI, z2, j, interfaceC65784Pro2, content, i)), LJIL, 200064, 18);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92883aHv(controller, interfaceC11790dD2, c11850dJ2, z2, interfaceC65784Pro2, content, i, i2);
    }

    public static void LJI(View view, InterfaceC91758Zzm interfaceC91758Zzm, String str, C40431iJ c40431iJ, String str2, String str3, InterfaceC65784Pro interfaceC65784Pro, String str4, InterfaceC65784Pro interfaceC65784Pro2, C40431iJ c40431iJ2, int i) {
        C43401n6 c43401n6;
        C11850dJ c11850dJ;
        C40431iJ c40431iJ3 = c40431iJ;
        String str5 = str;
        C40431iJ c40431iJ4 = c40431iJ2;
        String str6 = str2;
        String str7 = str4;
        InterfaceC65784Pro interfaceC65784Pro3 = interfaceC65784Pro2;
        C92892aI4 c92892aI4 = null;
        if ((i & 2) != 0) {
            str5 = null;
        }
        if ((i & 4) != 0) {
            c40431iJ3 = null;
        }
        if ((i & 8) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            str7 = null;
        }
        if ((i & 128) != 0) {
            interfaceC65784Pro3 = null;
        }
        if ((i & 256) != 0) {
            c40431iJ4 = C91991a3X.LIZJ;
        }
        if ((i & 512) != 0) {
            c43401n6 = LJ();
        } else {
            c43401n6 = null;
        }
        if ((i & 1024) != 0) {
            c11850dJ = LIZLLL();
        } else {
            c11850dJ = null;
        }
        if ((i & 2048) != 0) {
            c92892aI4 = C92892aI4.LJLIL;
        }
        LJFF(view, interfaceC91758Zzm, str5, c40431iJ3, str6, str3, interfaceC65784Pro, str7, interfaceC65784Pro3, c40431iJ4, c43401n6, c11850dJ, c92892aI4);
    }

    public static final void LIZIZ(String str, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, String str2, String primaryActionText, InterfaceC65784Pro<C76800UCe> primaryAction, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
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
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr3 = interfaceC88471Ynr;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro4 = interfaceC65784Pro;
        InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr4 = interfaceC88471Ynr2;
        o.LJIIIZ(primaryActionText, "primaryActionText");
        o.LJIIIZ(primaryAction, "primaryAction");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1476117856);
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
                interfaceC88471Ynr4 = C91991a3X.LIZIZ;
            }
            if (i19 == 0) {
                interfaceC65784Pro5 = interfaceC65784Pro2;
            }
            interfaceC65784Pro3 = interfaceC65784Pro5;
            C78857UxB.LJI(null, C17480mO.LIZ(10), C91671ZyN.LIZ(LJIL).LIZIZ, 0, C1DJ.LJ(LJIL, -819888721, new C92884aHw(i3, str4, str5, str6, primaryActionText, primaryAction, interfaceC65784Pro3, interfaceC65784Pro4, interfaceC88471Ynr4, interfaceC88471Ynr3)), LJIL, 25);
        } else {
            LJIL.LIZLLL();
            interfaceC65784Pro3 = interfaceC65784Pro2;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92885aHx(str4, interfaceC88471Ynr3, str5, primaryActionText, primaryAction, str6, interfaceC65784Pro4, interfaceC88471Ynr4, interfaceC65784Pro3, i, i2);
    }

    public static final void LJFF(View showPuxDialog, InterfaceC91758Zzm controller, String str, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, String str2, String primaryActionText, InterfaceC65784Pro<C76800UCe> primaryAction, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> topImage, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, InterfaceC65784Pro<C76800UCe> onDismissRequest) {
        o.LJIIIZ(showPuxDialog, "$this$showPuxDialog");
        o.LJIIIZ(controller, "controller");
        o.LJIIIZ(primaryActionText, "primaryActionText");
        o.LJIIIZ(primaryAction, "primaryAction");
        o.LJIIIZ(topImage, "topImage");
        o.LJIIIZ(onDismissRequest, "onDismissRequest");
        ViewGroup LIZ = C92116a5Y.LIZ(showPuxDialog);
        Context context = LIZ.getContext();
        o.LJIIIIZZ(context, "viewGroup.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setContent(C1DJ.LJFF(new C92889aI1(controller, str, interfaceC88471Ynr, str2, primaryActionText, primaryAction, str3, interfaceC65784Pro, topImage, interfaceC11790dD, c11850dJ, LIZ, composeView, onDismissRequest), -985541404, true));
        LIZ.addView(composeView);
    }

    public static final void LIZJ(InterfaceC91758Zzm controller, String str, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr, String str2, String primaryActionText, InterfaceC65784Pro<C76800UCe> primaryAction, String str3, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr2, InterfaceC11790dD interfaceC11790dD, C11850dJ c11850dJ, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
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
        C35931b3 LJIL = interfaceC24520xk.LJIL(1193508966);
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
            interfaceC88471Ynr4 = C91991a3X.LIZ;
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
            interfaceC65784Pro4 = C92886aHy.LJLIL;
        }
        if (((Boolean) controller.LJ().getValue()).booleanValue()) {
            int i4 = i2 << 6;
            interfaceC65784Pro3 = interfaceC65784Pro4;
            LIZ(controller, interfaceC11790dD2, c11850dJ2, z2, interfaceC65784Pro4, C1DJ.LJ(LJIL, -819890959, new C92887aHz(str6, interfaceC88471Ynr3, str4, primaryActionText, primaryAction, str5, interfaceC65784Pro5, interfaceC88471Ynr4, interfaceC65784Pro4, i, i2)), LJIL, ((i >> 24) & 112) | 196616 | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 0);
            C15980jy.LIZ(false, new IDqS178S0200000_31(controller, (InterfaceC91758Zzm) interfaceC65784Pro4, (InterfaceC65784Pro<C76800UCe>) 26), LJIL, 0, 1);
        } else {
            interfaceC65784Pro3 = interfaceC65784Pro4;
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92888aI0(controller, str6, interfaceC88471Ynr3, str4, primaryActionText, primaryAction, str5, interfaceC65784Pro5, interfaceC88471Ynr4, interfaceC11790dD2, c11850dJ2, z2, interfaceC65784Pro3, i, i2, i3);
    }
}
