package X;

import android.view.View;
import com.bytedance.pipo.checkout.sdk.viewmodel.CheckoutNavBarState;
import kotlin.jvm.internal.o;

/* renamed from: X.a29, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91905a29 {
    public static final void LIZJ(int i, InterfaceC24520xk interfaceC24520xk, String str) {
        int i2;
        int i3;
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1159821800);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(str)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if (((i2 & 11) ^ 2) != 0 || !LJIL.LIZ()) {
            C21430sl.LIZIZ(str, null, C91671ZyN.LIZ(LJIL).LIZJ, 0L, null, null, null, 0L, null, new C22060tm(3), 0L, 0, false, 0, null, C91676ZyS.LJ(C21350sd.LIZJ(LJIL), LJIL), LJIL, i2 & 14, 0, 32250);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92828aH2(str, i);
    }

    public static final void LIZIZ(String merchant, String amount, InterfaceC24520xk interfaceC24520xk, int i) {
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(merchant, "merchant");
        o.LJIIIZ(amount, "amount");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1848515988);
        if ((i & 14) == 0) {
            if (LJIL.LJIJJ(merchant)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (LJIL.LJIJJ(amount)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if (((i2 & 91) ^ 18) != 0 || !LJIL.LIZ()) {
            InterfaceC07760Se.LJJJ.getClass();
            C31611Lx c31611Lx = C07730Sb.LJIILJJIL;
            LJIL.LJJIIJ(-483455358);
            C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
            InterfaceC273215k LIZ = C09330Yf.LIZ(C0YW.LIZJ, c31611Lx, LJIL);
            LJIL.LJJIIJ(-1323940314);
            Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
            Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
            Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
            InterfaceC03730Cr.LJ.getClass();
            C46041rM c46041rM = C03720Cq.LIZIZ;
            C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
            if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
                LJIL.LJIJI();
                if (LJIL.LJJIL) {
                    LJIL.LJJI(c46041rM);
                } else {
                    LJIL.LIZIZ();
                }
                LJIL.LJJI = false;
                C24830yF.LIZ(LJIL, LIZ, C03720Cq.LJ);
                C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
                C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
                C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
                LJIL.LJIIIIZZ();
                LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
                LJIL.LJJIIJ(2058660585);
                LJIL.LJJIIJ(-1163856341);
                C21430sl.LIZIZ(merchant, null, C91671ZyN.LIZ(LJIL).LIZJ, C79043V0l.LJIIIIZZ(13), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, LJIL, (i2 & 14) | 3072, 0, 65522);
                C21430sl.LIZIZ(amount, null, C91671ZyN.LIZ(LJIL).LIZJ, C79043V0l.LJIIIIZZ(15), null, C13640gC.LJLJLJ, null, 0L, null, null, 0L, 0, false, 0, null, null, LJIL, ((i2 >> 3) & 14) | 199680, 0, 65490);
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
                LJIL.LJIJ();
                LJIL.LJJJJJ(false);
                LJIL.LJJJJJ(false);
            } else {
                C78929UyL.LJIILJJIL();
                throw null;
            }
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92815aGp(merchant, amount, i);
    }

    public static final void LIZ(float f, CheckoutNavBarState navState, InterfaceC65784Pro<Float> interfaceC65784Pro, String str, C92283a8F eventSender, String webviewTitle, String str2, Object obj, InterfaceC65784Pro<C76800UCe> onBack, InterfaceC65784Pro<C76800UCe> onClose, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        String str3 = str;
        InterfaceC65784Pro<Float> interfaceC65784Pro2 = interfaceC65784Pro;
        Object obj2 = obj;
        o.LJIIIZ(navState, "navState");
        o.LJIIIZ(eventSender, "eventSender");
        o.LJIIIZ(webviewTitle, "webviewTitle");
        o.LJIIIZ(onBack, "onBack");
        o.LJIIIZ(onClose, "onClose");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-49669590);
        if ((i2 & 4) != 0) {
            interfaceC65784Pro2 = C92808aGi.LJLIL;
        }
        String str4 = "";
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 64) == 0) {
            str4 = str2;
        }
        if ((i2 & 128) != 0) {
            obj2 = null;
        }
        View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
        LJIL.LJJIIJ(773894976);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJJJZ == c24490xh) {
            LJJJZ = new C35821as(C24610xt.LJII(MBB.INSTANCE, LJIL));
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJJJZ).LJLIL;
        LJIL.LJJJJJ(false);
        C05P LIZ = C015804k.LIZ(LJIL);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ2 = LJIL.LJJJZ();
        if (LJJJZ2 == c24490xh) {
            LJJJZ2 = new C92158a6E(null);
            LJIL.LJLJLLL(LJJJZ2);
        }
        LJIL.LJJJJJ(false);
        C92158a6E c92158a6E = (C92158a6E) LJJJZ2;
        C44031o7 c44031o7 = AnonymousClass057.LJ;
        int LJJIJ = ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJIJ(52);
        InterfaceC91773a01 dialog = C91665ZyH.LIZ().getDialog();
        C76800UCe c76800UCe = C76800UCe.LIZ;
        Integer valueOf = Integer.valueOf(LJJIJ);
        LJIL.LJJIIJ(1157296644);
        boolean LJIJJ = LJIL.LJIJJ(valueOf);
        Object LJJJZ3 = LJIL.LJJJZ();
        if (LJIJJ || LJJJZ3 == c24490xh) {
            LJJJZ3 = new C93113aLd(LJJIJ, null);
            LJIL.LJLJLLL(LJJJZ3);
        }
        LJIL.LJJJJJ(false);
        C24610xt.LJ(c76800UCe, (InterfaceC88471Ynr) LJJJZ3, LJIL);
        LJIL.LJJIIJ(-483455358);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        C32371Ov c32371Ov = C0YW.LIZJ;
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ2 = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
        LJIL.LJJIIJ(-1323940314);
        Object LJIILLIIL = LJIL.LJIILLIIL(c44031o7);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(c1m1);
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJIJI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(c46041rM);
            } else {
                LJIL.LIZIZ();
            }
            LJIL.LJJI = false;
            C24830yF.LIZ(LJIL, LIZ2, C03720Cq.LJ);
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
            LJIL.LJIIIIZZ();
            LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
            LJIL.LJJIIJ(2058660585);
            LJIL.LJJIIJ(-1163856341);
            C06500Ni.LIZLLL(C1P2.LIZ, navState.isFullScreen(), null, null, null, null, C1DJ.LJ(LJIL, -819894169, new C92809aGj(f)), LJIL, 1572870, 30);
            C92112a5U.LIZ(null, navState.isBackShow(), C1DJ.LJ(LJIL, -819890527, new C92810aGk(navState, c92158a6E, dialog, view, interfaceC70422pa, eventSender, onClose, LIZ, onBack)), navState.isCloseShow(), C1DJ.LJ(LJIL, -819891539, new C92811aGl(navState, c92158a6E, dialog, view, interfaceC70422pa, eventSender, onClose)), C92812aGm.LJLIL, true, C1DJ.LJ(LJIL, -819888141, new C92813aGn(navState, interfaceC65784Pro2, str3, i, str4, obj2, webviewTitle)), LJIL, 14377344, 1);
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new C92814aGo(f, navState, interfaceC65784Pro2, str3, eventSender, webviewTitle, str4, obj2, onBack, onClose, i, i2);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }
}
