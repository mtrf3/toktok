package com.ss.android.ugc.aweme.setting.page.security;

import X.AI2;
import X.AI8;
import X.AnonymousClass114;
import X.C03880Dg;
import X.C188727au;
import X.C253689xU;
import X.C253699xV;
import X.C253719xX;
import X.C26227ARb;
import X.C2NU;
import X.C35936E8m;
import X.C53262KvK;
import X.C65300Pk0;
import X.C68517Qun;
import X.C78920UyC;
import X.DialogC25756A8y;
import X.FMX;
import X.HG3;
import X.InterfaceC253709xW;
import X.ORZ;
import X.R41;
import X.R5K;
import X.R5M;
import X.RBX;
import X.UC0;
import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.ICloudTokenLoginService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.CloudTokenLoginService;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.setting.page.base.SwitchCell;
import com.ss.android.ugc.aweme.user.UserStore;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SecuritySaveInfoCell extends SwitchCell<C253689xU> {
    public DialogC25756A8y LJLJJI;

    public final boolean M() {
        if (C2NU.LIZ.LIZIZ()) {
            return true;
        }
        Activity activity = this.LJLIL;
        if (activity != null) {
            AnonymousClass114.LIZ(activity, R.string.img);
        }
        return false;
    }

    public final void N() {
        DialogC25756A8y dialogC25756A8y = this.LJLJJI;
        if (dialogC25756A8y != null && dialogC25756A8y.isShowing()) {
            dialogC25756A8y.dismiss();
        }
    }

    public final void Q() {
        DialogC25756A8y dialogC25756A8y;
        DialogC25756A8y dialogC25756A8y2;
        if (this.LJLJJI == null) {
            Activity activity = this.LJLIL;
            if (activity != null) {
                dialogC25756A8y2 = new DialogC25756A8y(activity);
            } else {
                dialogC25756A8y2 = null;
            }
            this.LJLJJI = dialogC25756A8y2;
        }
        DialogC25756A8y dialogC25756A8y3 = this.LJLJJI;
        if (dialogC25756A8y3 == null || dialogC25756A8y3.isShowing() || (dialogC25756A8y = this.LJLJJI) == null || new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y, new Object[0], "void", new C65300Pk0(false, "()V", "9108812121990314050")).LIZ) {
            return;
        }
        dialogC25756A8y.show();
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell
    public final void L() {
        User LIZJ;
        String uniqueId;
        if (!C53262KvK.LIZIZ()) {
            super.L();
            return;
        }
        AI8 ai8 = this.LJLILLLLZI;
        if (ai8 != null && (LIZJ = UserStore.LIZJ(false)) != null && (uniqueId = LIZJ.getUniqueId()) != null) {
            ai8.setSubtitle(ai8.getContext().getString(R.string.jaj, uniqueId));
        }
    }

    public final void P(int i) {
        Activity activity = this.LJLIL;
        if (activity == null) {
            return;
        }
        if (i == 2029) {
            C26227ARb c26227ARb = new C26227ARb(activity);
            c26227ARb.LJ(R.string.jer);
            c26227ARb.LJII = true;
            c26227ARb.LJIIIIZZ = true;
            c26227ARb.LIZ(R.string.jeq);
            UC0.LIZJ(c26227ARb, C253719xX.LJLIL);
            c26227ARb.LJI().LIZLLL();
            return;
        }
        AnonymousClass114.LIZ(activity, R.string.jes);
    }

    @Override // com.ss.android.ugc.aweme.setting.page.base.SwitchCell, android.view.View.OnClickListener
    public final void onClick(View v) {
        String oneClickLoginToken;
        o.LJIIIZ(v, "v");
        HG3.LJIIL();
        LoginMethodService LJIIIZ = HG3.LJLJL.LJIIIZ();
        boolean saveLoginStatus = LJIIIZ.getSaveLoginStatus();
        if (C53262KvK.LIZIZ()) {
            if (!C53262KvK.LIZIZ()) {
                return;
            }
            if (saveLoginStatus) {
                C35936E8m c35936E8m = new C35936E8m();
                c35936E8m.LIZ(0, "status");
                FMX.LJIIL("save_login_info_toggle", c35936E8m.LIZ);
                if (!M()) {
                    return;
                }
                String LIZLLL = R41.LIZLLL();
                BaseLoginMethod baseLoginMethod = (BaseLoginMethod) ORZ.LJLLLL(C68517Qun.LIZ.LJI(R41.LIZLLL()));
                if (baseLoginMethod == null || !o.LJ(baseLoginMethod.isOneClickLogin(), Boolean.TRUE) || (oneClickLoginToken = baseLoginMethod.getOneClickLoginToken()) == null || oneClickLoginToken.length() == 0) {
                    return;
                }
                Q();
                ICloudTokenLoginService createICloudTokenLoginServicebyMonsterPlugin = CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false);
                String oneClickLoginToken2 = baseLoginMethod.getOneClickLoginToken();
                if (oneClickLoginToken2 != null) {
                    createICloudTokenLoginServicebyMonsterPlugin.disableTokenForOneClickLogin(oneClickLoginToken2, LIZLLL, true, R5K.SETTING, "settings_page", null, new AqS154S0100000_4(this, 1226), new AqS170S0100000_4(this, 1430));
                    return;
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C35936E8m c35936E8m2 = new C35936E8m();
            c35936E8m2.LIZ(1, "status");
            FMX.LJIIL("save_login_info_toggle", c35936E8m2.LIZ);
            if (!M()) {
                return;
            }
            Q();
            CloudTokenLoginService.createICloudTokenLoginServicebyMonsterPlugin(false).enableCloudTokenForOneClickLogin(false, R5M.SETTING, "settings_page", null, new AqS154S0100000_4(this, 1227), new AqS170S0100000_4(this, 1431));
            return;
        }
        if (saveLoginStatus) {
            if (LJIIIZ.isOneKeyLoginExperimentEnabled()) {
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
                FMX.LJIIL("remove_login_info_notify", c188727au.LIZ);
                Activity activity = this.LJLIL;
                if (activity == null) {
                    return;
                }
                C26227ARb c26227ARb = new C26227ARb(activity);
                c26227ARb.LJ(R.string.u8);
                c26227ARb.LJII = false;
                c26227ARb.LIZ(R.string.u5);
                UC0.LIZJ(c26227ARb, new AqS135S0200000_4(this, LJIIIZ, 287));
                c26227ARb.LJI().LIZLLL();
                return;
            }
            T(false, LJIIIZ);
            return;
        }
        T(true, LJIIIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T(boolean z, InterfaceC253709xW interfaceC253709xW) {
        C253699xV c253699xV;
        AI2 ai2;
        FMX.LJIIL("switch_login_save", C78920UyC.LIZJ(z ? 1 : 0, "state").LIZ);
        interfaceC253709xW.updateAllowOneKeyLoginInfo(z, true);
        C253699xV c253699xV2 = (C253699xV) getItem();
        if (c253699xV2 != null) {
            c253699xV2.LJLJI = z;
        }
        if (this.LJLILLLLZI != null && (c253699xV = (C253699xV) getItem()) != null && (ai2 = this.LJLJI) != null) {
            boolean LJIIL = ai2.LJIIL();
            boolean z2 = c253699xV.LJLJI;
            if (LJIIL != z2) {
                ai2.LJIILIIL(z2);
            }
        }
    }
}
