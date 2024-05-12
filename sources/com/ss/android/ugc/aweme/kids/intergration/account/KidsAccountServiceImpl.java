package com.ss.android.ugc.aweme.kids.intergration.account;

import X.AFQ;
import X.C221108m2;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C78622UtO;
import X.C78623UtP;
import X.InterfaceC253709xW;
import X.InterfaceC65895Ptb;
import X.LEA;
import X.RBX;
import X.RBY;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.LoginMethodService;
import com.ss.android.ugc.aweme.services.PasswordService;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class KidsAccountServiceImpl implements IKidsAccountService, LEA {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C78623UtP.LJLIL);

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
    }

    public static IKidsAccountService LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IKidsAccountService.class, false);
        if (LIZ != null) {
            return (IKidsAccountService) LIZ;
        }
        if (C58096Mr6.K1 == null) {
            synchronized (IKidsAccountService.class) {
                if (C58096Mr6.K1 == null) {
                    C58096Mr6.K1 = new KidsAccountServiceImpl();
                }
            }
        }
        return C58096Mr6.K1;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final AFQ LJFF() {
        User curUser = ((RBX) C78622UtO.LIZIZ()).getCurUser();
        o.LJIIIIZZ(curUser, "AccountProxy.userService().curUser");
        return new AFQ(curUser);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean LIZ() {
        LoginMethodService LJIIIZ;
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        if (iAccountService != null && (LJIIIZ = iAccountService.LJIIIZ()) != null && LJIIIZ.isCurrentMethodAvaliable()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void LIZIZ() {
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        if (iAccountService != null) {
            iAccountService.LJIILJJIL(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean LIZJ() {
        LoginMethodService LJIIIZ;
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        if (iAccountService != null && (LJIIIZ = iAccountService.LJIIIZ()) != null && LJIIIZ.isOneKeyLoginExperimentEnabled()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean LIZLLL() {
        return ((RBY) C78622UtO.LIZIZ()).isChildrenMode();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void LJ() {
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        if (iAccountService != null) {
            iAccountService.LJIILLIIL(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean LJI() {
        LoginMethodService LJIIIZ;
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        if (iAccountService != null && (LJIIIZ = iAccountService.LJIIIZ()) != null && LJIIIZ.getSaveLoginStatus()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final boolean isLogin() {
        return ((RBX) C78622UtO.LIZIZ()).isLogin();
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void LJII(Activity activity, Bundle bundle) {
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        o.LJI(iAccountService);
        PasswordService LJII = iAccountService.LJII();
        o.LJIIIIZZ(LJII, "sSsrvice!!.passwordService()");
        LJII.changePassword(activity, "manage_my_account", "password_click", bundle, null);
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void logout(String str, String str2) {
        C78622UtO.LIZ();
        IAccountService iAccountService = C78622UtO.LIZ;
        o.LJI(iAccountService);
        InterfaceC65895Ptb LJI = iAccountService.LJI();
        o.LJIIIIZZ(LJI, "sSsrvice!!.loginService()");
        LJI.logout(str, "user_logout");
    }

    @Override // com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService
    public final void updateAllowOneKeyLoginInfo(boolean z, boolean z2) {
        InterfaceC253709xW interfaceC253709xW = (InterfaceC253709xW) this.LJLIL.getValue();
        if (interfaceC253709xW != null) {
            interfaceC253709xW.updateAllowOneKeyLoginInfo(z, z2);
        }
    }
}
