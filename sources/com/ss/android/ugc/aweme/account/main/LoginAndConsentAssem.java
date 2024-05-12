package com.ss.android.ugc.aweme.account.main;

import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C212428Vi;
import X.C221108m2;
import X.C34K;
import X.C38985FRt;
import X.C38986FRu;
import X.C39173FYz;
import X.C40843G1f;
import X.C55096Ljo;
import X.C56662Kg;
import X.C62822Ol8;
import X.C68322mC;
import X.CallableC39172FYy;
import X.FZ1;
import X.T16;
import Y.AfS53S0100000_1;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.plugin.PluginService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import defpackage.s1;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LoginAndConsentAssem extends BaseMainContainerAssem {
    public ActivityC45651qj LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C39173FYz.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(FZ1.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS156S0100000_6(this, 20));
    public boolean LJLJJLL;

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void splashOverShowMandatoryLoginPage() {
        v3(false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.C8W0
    public final void onParentSet() {
        C55096Ljo.LIZJ(this);
        ActivityC45651qj LIZ = C212428Vi.LIZ(this);
        if (LIZ != null) {
            this.LJLIL = LIZ;
        } else {
            "LoginAndConsentAssem should be attach to MainActivity.".toString();
            throw new IllegalArgumentException("LoginAndConsentAssem should be attach to MainActivity.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [T, X.3kP] */
    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC55372LoG
    public final void onCreate(Bundle bundle) {
        boolean z = true;
        String LLLZ = C16880lQ.LLLZ("main_act_assem_lifecycle_%s_%s", new Object[]{C16880lQ.LJLLJ(LoginAndConsentAssem.class), "onCreate_with_bundle"});
        C56662Kg.LIZ().LIZJ(LLLZ, false);
        ActivityC45651qj activityC45651qj = this.LJLIL;
        if (activityC45651qj != null) {
            this.LJLILLLLZI = activityC45651qj.getIntent().getBooleanExtra("restart_from_logout", false);
            ActivityC45651qj activityC45651qj2 = this.LJLIL;
            if (activityC45651qj2 != null) {
                Intent intent = activityC45651qj2.getIntent();
                if (intent == null || !intent.getBooleanExtra("from_require_login", false)) {
                    z = false;
                }
                ActivityC45651qj activityC45651qj3 = this.LJLIL;
                if (activityC45651qj3 != null) {
                    activityC45651qj3.getIntent().getIntExtra("page_type", -1);
                    boolean H40 = ((MainBusinessAbility) C55096Ljo.LIZIZ(C55096Ljo.LJIIZILJ(this), MainBusinessAbility.class)).H40();
                    boolean z2 = this.LJLILLLLZI;
                    C68322mC c68322mC = new C68322mC();
                    c68322mC.element = AbstractC73672Svk.LJJIIJZLJL(new CallableC39172FYy(H40, z, z2, this)).LJJL(T16.LIZ()).LJJJJZI(new AfS53S0100000_1(c68322mC, 52));
                    C56662Kg.LIZ().LJFF(LLLZ, false);
                    return;
                }
                o.LJIJI("activity");
                throw null;
            }
            o.LJIJI("activity");
            throw null;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final void v3(boolean z) {
        boolean z2;
        if (((Keva) this.LJLJI.getValue()).getBoolean("did_launch", false) && s1.LIZLLL("isFirstInstallAndFirstLaunch()")) {
            ((Keva) this.LJLJI.getValue()).storeBoolean("did_launch", true);
            return;
        }
        C38985FRt c38985FRt = C38985FRt.LIZIZ;
        boolean LIZLLL = c38985FRt.LJIIL().LIZLLL();
        if (GuestModeServiceImpl.LJIIJJI().LJIIJ()) {
            return;
        }
        boolean shouldShowForcedLogin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin(true);
        if (z && shouldShowForcedLogin) {
            z2 = true;
        } else {
            z2 = false;
        }
        C34K c34k = new C34K();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        C34K c34k2 = new C34K();
        if (z2) {
            c34k.element = true;
            c68322mC.element = "log_out";
            c68322mC2.element = "normal";
        } else if (C38986FRu.LIZ().LIZIZ() != 2 && !this.LJLJJLL && shouldShowForcedLogin) {
            c34k.element = true;
            c68322mC.element = "cold_launch";
            c68322mC2.element = "normal";
            this.LJLJJLL = true;
            c34k2.element = true;
        }
        if (LIZLLL) {
            c34k.element = true;
            if (!z && c38985FRt.LJIIL().LJFF()) {
                c68322mC2.element = "nvv_forced_login";
            }
        }
        PluginService.createIPluginServicebyMonsterPlugin(false).subscribeInit(new C40843G1f(this, c34k, c34k2, c68322mC, c68322mC2, z));
    }
}
