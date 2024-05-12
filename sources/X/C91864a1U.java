package X;

import com.bytedance.pipo.checkout.api.network.model.response.CashierOptionList;
import com.bytedance.pipo.checkout.api.network.model.response.Methods;
import java.util.List;
import kotlin.jvm.internal.IDqS30S0300000_31;
import kotlin.jvm.internal.IDqS7S0400000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a1U, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91864a1U {
    public static final void LIZ(String title, Object obj, InterfaceC24520xk interfaceC24520xk, int i) {
        o.LJIIIZ(title, "title");
        C35931b3 LJIL = interfaceC24520xk.LJIL(-1812351640);
        LJIL.LJJIIJ(693286680);
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        C32361Ou c32361Ou = C0YW.LIZ;
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C0YX.LIZ(c32361Ou, C07730Sb.LJIIJ, LJIL);
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
            LJIL.LJJIIJ(-678309503);
            C92038a4I.LIZ(obj, LJIL, 8);
            C79057V0z.LJ(C09290Yb.LJIILIIL(c1m1, 8), LJIL, 6);
            C21430sl.LIZIZ(title, null, 0L, 0L, null, null, null, 0L, null, new C22060tm(3), 0L, 0, false, 0, null, C08370Un.LIZ(C91676ZyS.LJFF(C21350sd.LIZJ(LJIL), LJIL), C91671ZyN.LIZ(LJIL).LIZJ, 0L, null, null, 262142), LJIL, i & 14, 0, 32254);
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            LJIL.LJIJ();
            LJIL.LJJJJJ(false);
            LJIL.LJJJJJ(false);
            C35991b9 LJJJJLI = LJIL.LJJJJLI();
            if (LJJJJLI == null) {
                return;
            }
            LJJJJLI.LIZLLL = new C92685aEj(i, title, obj);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }

    public static final void LIZIZ(Methods method, Methods methods, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC24520xk interfaceC24520xk, int i, int i2) {
        String iconUrl;
        String darkModeIconUrl;
        String value;
        boolean LJ;
        Methods methods2 = methods;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
        o.LJIIIZ(method, "method");
        C35931b3 LJIL = interfaceC24520xk.LJIL(1768709609);
        String str = null;
        if ((i2 & 2) != 0) {
            methods2 = null;
        }
        if ((i2 & 4) != 0) {
            interfaceC65784Pro2 = C92686aEk.LJLIL;
        }
        CashierOptionList LJ2 = C91969a3B.LJ(method);
        if (LJ2 == null) {
            iconUrl = null;
            darkModeIconUrl = null;
        } else {
            iconUrl = LJ2.getIconUrl();
            darkModeIconUrl = LJ2.getDarkModeIconUrl();
        }
        String LJII = C91969a3B.LJII(iconUrl, darkModeIconUrl, C91671ZyN.LIZ);
        if (methods2 == null) {
            LJ = false;
        } else {
            CashierOptionList LJ3 = C91969a3B.LJ(methods2);
            if (LJ3 == null) {
                value = null;
            } else {
                value = LJ3.getValue();
            }
            if (LJ2 != null) {
                str = LJ2.getValue();
            }
            LJ = o.LJ(value, str);
        }
        C91665ZyH.LIZ().getTextCell().LIZ(LJII, C91969a3B.LIZJ(LJ2), false, null, LJ, false, false, true, null, null, interfaceC65784Pro2, LJIL, 920325504, ((i >> 6) & 14) | 64);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92687aEl(method, methods2, interfaceC65784Pro2, i, i2);
    }

    public static final void LIZJ(List<Methods> methods, InterfaceC91961a33 selectedMethod, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> onPopBackStack, C92283a8F eventSender, InterfaceC88472Yns<? super InterfaceC91961a33, C76800UCe> onSelectPI, InterfaceC24520xk interfaceC24520xk, int i) {
        Methods methods2;
        o.LJIIIZ(methods, "methods");
        o.LJIIIZ(selectedMethod, "selectedMethod");
        o.LJIIIZ(onPopBackStack, "onPopBackStack");
        o.LJIIIZ(eventSender, "eventSender");
        o.LJIIIZ(onSelectPI, "onSelectPI");
        C35931b3 LJIL = interfaceC24520xk.LJIL(524143985);
        InterfaceC07790Sh LJJJJLI = C78841Uwv.LJJJJLI(InterfaceC07790Sh.LJJJI, C78841Uwv.LJJIJIIJI(LJIL));
        LJIL.LJJIIJ(-483455358);
        C32371Ov c32371Ov = C0YW.LIZJ;
        InterfaceC07760Se.LJJJ.getClass();
        InterfaceC273215k LIZ = C09330Yf.LIZ(c32371Ov, C07730Sb.LJIILIIL, LJIL);
        LJIL.LJJIIJ(-1323940314);
        Object LJIILLIIL = LJIL.LJIILLIIL(AnonymousClass057.LJ);
        Object LJIILLIIL2 = LJIL.LJIILLIIL(AnonymousClass057.LJIIJ);
        Object LJIILLIIL3 = LJIL.LJIILLIIL(AnonymousClass057.LJIILJJIL);
        InterfaceC03730Cr.LJ.getClass();
        C46041rM c46041rM = C03720Cq.LIZIZ;
        C40431iJ LJIIL = C56509MFt.LJIIL(LJJJJLI);
        if (LJIL.LIZIZ instanceof InterfaceC24420xa) {
            LJIL.LJIJI();
            if (LJIL.LJJIL) {
                LJIL.LJJI(c46041rM);
            } else {
                LJIL.LIZIZ();
            }
            boolean z = false;
            LJIL.LJJI = false;
            C24830yF.LIZ(LJIL, LIZ, C03720Cq.LJ);
            C24830yF.LIZ(LJIL, LJIILLIIL, C03720Cq.LIZLLL);
            C24830yF.LIZ(LJIL, LJIILLIIL2, C03720Cq.LJFF);
            C24830yF.LIZ(LJIL, LJIILLIIL3, C03720Cq.LJI);
            LJIL.LJIIIIZZ();
            LJIIL.invoke(new C24440xc(LJIL), LJIL, 0);
            LJIL.LJJIIJ(2058660585);
            LJIL.LJJIIJ(-1163856341);
            try {
                methods2 = ((C92231a7P) selectedMethod).LJLIL;
            } catch (Throwable unused) {
                methods2 = new Methods(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435455, null);
            }
            C24610xt.LJ(methods, new C93088aLE(methods, eventSender, null), LJIL);
            for (Methods methods3 : methods) {
                if (o.LJ(methods3.getPaymentMethodType(), EnumC91967a39.BankTransfer.getValue())) {
                    LJIL.LJJIIJ(1655171927);
                    methods2 = methods2;
                    LIZIZ(methods3, methods2, new IDqS7S0400000_31(eventSender, (C92283a8F) methods3, (Methods) onSelectPI, (InterfaceC88472Yns<? super InterfaceC91961a33, C76800UCe>) onPopBackStack, (InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe>) 2), LJIL, 72, z ? 1 : 0);
                    LJIL.LJJJJJ(z);
                } else {
                    LJIL.LJJIIJ(1655172606);
                    C91750Zze.LIZIZ(methods3, null, null, o.LJ(methods2.getPaymentMethodId(), methods3.getPaymentMethodId()), false, false, false, new IDqS30S0300000_31(eventSender, (C92283a8F) onSelectPI, (InterfaceC88472Yns<? super InterfaceC91961a33, C76800UCe>) onPopBackStack, (InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe>) 2), LJIL, 8, 118);
                    LJIL.LJJJJJ(false);
                    z = false;
                }
            }
            LJIL.LJJJJJ(z);
            LJIL.LJJJJJ(z);
            LJIL.LJIJ();
            LJIL.LJJJJJ(z);
            LJIL.LJJJJJ(z);
            C35991b9 LJJJJLI2 = LJIL.LJJJJLI();
            if (LJJJJLI2 == null) {
                return;
            }
            LJJJJLI2.LIZLLL = new C92688aEm(methods, selectedMethod, onPopBackStack, eventSender, onSelectPI, i);
            return;
        }
        C78929UyL.LJIILJJIL();
        throw null;
    }
}
