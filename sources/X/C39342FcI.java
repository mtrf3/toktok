package X;

import Y.AfS55S0200000_6;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.pns.universalpopup.api.UniversalPopupService;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS39S1300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FcI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39342FcI implements InterfaceC39781FjN {
    public InterfaceC65784Pro<C76800UCe> LIZJ;
    public final String LIZ = "UniversalPopupGatekeeperTask";
    public final java.util.Set<String> LIZIZ = C77275UUl.LJIIIIZZ("UserLogin", "AppStart");
    public String LIZLLL = "";
    public final C39347FcN LJ = new C39347FcN();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(new AqS156S0100000_6(this, 121));

    @Override // X.InterfaceC39779FjL
    public final void LIZ() {
    }

    public C39342FcI() {
        C221108m2.LIZIZ(C39336FcC.LJLIL);
    }

    @Override // X.InterfaceC39779FjL
    public final java.util.Set<String> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC39779FjL
    public final String LIZJ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC39779FjL
    public final EnumC39780FjM category() {
        return EnumC39780FjM.BLOCKING;
    }

    @Override // X.InterfaceC39779FjL
    public final boolean LJ(Bundle bundle, String signal) {
        IComplianceDependService LIZ;
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        if (this.LIZJ == null) {
            return false;
        }
        if ((bundle.getBoolean("is_after_login", false) && (LIZ = C54936LhE.LIZ()) != null && LIZ.LIZ()) || TpcConsentServiceImpl.LJIIZILJ().LJIILJJIL() || C6D8.LIZLLL()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC39779FjL
    public final void LIZLLL(String signal, Bundle bundle, C39778FjK c39778FjK) {
        o.LJIIIZ(signal, "signal");
        o.LJIIIZ(bundle, "bundle");
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            PopupManager.LJIIL(new C40461FuL(LJIIIIZZ, this.LIZLLL, c39778FjK, this.LIZJ));
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        C84763XOl.LIZLLL().LJJL(T16.LIZIZ).LJJLIIIJ(1L).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0200000_6(this, c39778FjK, 12));
    }

    @Override // X.InterfaceC39781FjN
    public final void LJFF(String signal, Bundle bundle, AqS39S1300000_6 aqS39S1300000_6) {
        int value;
        o.LJIIIZ(signal, "signal");
        ((UniversalPopupService) this.LJFF.getValue()).LJFF(new C39343FcJ(this, aqS39S1300000_6));
        UniversalPopupService universalPopupService = (UniversalPopupService) this.LJFF.getValue();
        if (bundle != null && bundle.getBoolean("is_after_login")) {
            value = EnumC39255Fat.SCENE_LOGIN.getValue();
        } else {
            value = EnumC39255Fat.SCENE_COLD_LAUNCH.getValue();
        }
        universalPopupService.LIZLLL(value, EF7.LIZIZ(), new AqS172S0100000_6(aqS39S1300000_6, 107));
    }
}
