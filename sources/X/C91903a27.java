package X;

import android.view.View;
import com.bytedance.pipo.checkout.sdk.viewmodel.PIViewModel;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS2S0301000_31;
import kotlin.jvm.internal.IDqS418S0100000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.a27, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91903a27 {
    public static final void LIZIZ(C92145a61 c92145a61, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(1273901410);
        LJIL.LJJIIJ(773894976);
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        if (LJJJZ == C24500xi.LIZIZ) {
            LJJJZ = new C35821as(C24610xt.LJII(MBB.INSTANCE, LJIL));
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        InterfaceC70422pa interfaceC70422pa = ((C35821as) LJJJZ).LJLIL;
        LJIL.LJJJJJ(false);
        C24610xt.LJ(C76800UCe.LIZ, new C93111aLb(interfaceC70422pa, c92145a61, interfaceC88472Yns, interfaceC88472Yns2, null), LJIL);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS2S0301000_31(c92145a61, (C92145a61) interfaceC88472Yns, (InterfaceC88472Yns<? super String, C76800UCe>) interfaceC88472Yns2, (InterfaceC88472Yns<? super Boolean, C76800UCe>) i, 0);
    }

    public static final void LIZ(PIViewModel viewModel, String str, Boolean bool, C92145a61 c92145a61, C92083a51 apiService, C92330a90 c92330a90, C92204a6y bizData, String initialRoute, InterfaceC88472Yns<? super String, C76800UCe> setInitialRoute, AbstractC91861a1R abstractC91861a1R, String str2, C08370Un c08370Un, String str3, Boolean bool2, InterfaceC65784Pro<C76800UCe> onClose, InterfaceC24520xk interfaceC24520xk, int i, int i2, int i3) {
        int i4;
        AbstractC91861a1R abstractC91861a1R2 = abstractC91861a1R;
        C92330a90 c92330a902 = c92330a90;
        C92145a61 c92145a612 = c92145a61;
        String str4 = str;
        String str5 = str2;
        Boolean bool3 = bool;
        String str6 = str3;
        Boolean bool4 = bool2;
        o.LJIIIZ(viewModel, "viewModel");
        o.LJIIIZ(apiService, "apiService");
        o.LJIIIZ(bizData, "bizData");
        o.LJIIIZ(initialRoute, "initialRoute");
        o.LJIIIZ(setInitialRoute, "setInitialRoute");
        o.LJIIIZ(onClose, "onClose");
        C35931b3 LJIL = interfaceC24520xk.LJIL(493796657);
        C08370Un c08370Un2 = null;
        if ((i3 & 2) != 0) {
            str4 = null;
        }
        if ((i3 & 4) != 0) {
            bool3 = Boolean.FALSE;
        }
        if ((i3 & 8) != 0) {
            c92145a612 = C92147a63.LIZIZ(new AbstractC91695Zyl[0], LJIL);
            i4 = i & (-7169);
        } else {
            i4 = i;
        }
        if ((i3 & 32) != 0) {
            c92330a902 = null;
        }
        if ((i3 & 512) != 0) {
            abstractC91861a1R2 = C92199a6t.LIZIZ;
            i4 &= -1879048193;
        }
        if ((i3 & 1024) != 0) {
            str5 = null;
        }
        if ((i3 & 2048) == 0) {
            c08370Un2 = c08370Un;
        }
        if ((i3 & 4096) != 0) {
            str6 = "";
        }
        if ((i3 & FileUtils.BUFFER_SIZE) != 0) {
            bool4 = Boolean.FALSE;
        }
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ = LJIL.LJJJZ();
        InterfaceC24520xk.LIZ.getClass();
        C24490xh c24490xh = C24500xi.LIZIZ;
        if (LJJJZ == c24490xh) {
            LJJJZ = C78966Uyw.LJJJIL(Boolean.FALSE);
            LJIL.LJLJLLL(LJJJZ);
        }
        LJIL.LJJJJJ(false);
        InterfaceC35811ar interfaceC35811ar = (InterfaceC35811ar) LJJJZ;
        LJIL.LJJIIJ(-492369756);
        Object LJJJZ2 = LJIL.LJJJZ();
        if (LJJJZ2 == c24490xh) {
            LJJJZ2 = C78966Uyw.LJJJIL(Boolean.TRUE);
            LJIL.LJLJLLL(LJJJZ2);
        }
        LJIL.LJJJJJ(false);
        C44031o7 c44031o7 = AnonymousClass057.LJ;
        float LJJJLL = ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJJLL(viewModel.getUiState().getNavigationBarHeight());
        float LJJJLL2 = ((InterfaceC23370vt) LJIL.LJIILLIIL(c44031o7)).LJJJLL(viewModel.getUiState().getStatusBarHeight());
        View view = (View) LJIL.LJIILLIIL(C04Q.LJI);
        C91665ZyH.LIZ();
        C24610xt.LJ(bizData, new C93108aLY(apiService, bizData, str6, str5, viewModel, str4, null), LJIL);
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C24610xt.LJ(c76800UCe, new C93109aLZ(c92145a612, initialRoute, null), LJIL);
        C24610xt.LIZIZ(c76800UCe, new IDqS418S0100000_31(c92145a612, 74), LJIL);
        LIZIZ(c92145a612, setInitialRoute, new C93170aMY(viewModel), LJIL, ((i4 >> 21) & 112) | 8);
        C91673ZyP.LIZ(Boolean.valueOf(C91671ZyN.LIZ), null, Boolean.valueOf(C91671ZyN.LIZIZ), C91671ZyN.LIZIZ(), C1DJ.LJ(LJIL, -819888242, new C92788aGO(viewModel, LJJJLL2, LJJJLL, c92145a612, abstractC91861a1R2, bizData, onClose, (InterfaceC35811ar) LJJJZ2, c08370Un2, i2, view, bool4, c92330a902, interfaceC35811ar, bool3, i4)), LJIL, 24576, 2);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new C92789aGP(viewModel, str4, bool3, c92145a612, apiService, c92330a902, bizData, initialRoute, setInitialRoute, abstractC91861a1R2, str5, c08370Un2, str6, bool4, onClose, i, i2, i3);
    }
}
