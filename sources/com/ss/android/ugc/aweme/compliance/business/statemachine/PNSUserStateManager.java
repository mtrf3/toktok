package com.ss.android.ugc.aweme.compliance.business.statemachine;

import X.C10K;
import X.C188727au;
import X.C19N;
import X.C58096Mr6;
import X.CallableC26191APr;
import X.CallableC39787FjT;
import X.EnumC39785FjR;
import X.FMX;
import X.HG3;
import X.InterfaceC252619vl;
import X.LEA;
import X.RBX;
import X.RBY;
import Y.AgS109S0200000_6;
import Y.AgS123S0100000_6;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService;
import com.ss.android.ugc.aweme.compliance.api.services.statemachine.UserStateHandler;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PNSUserStateManager implements IPNSUserStateService, LEA, InterfaceC252619vl {
    public User LJLIL;
    public HashSet<String> LJLILLLLZI;
    public final HashSet<UserStateHandler> LJLJI = new HashSet<>();

    public static IPNSUserStateService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IPNSUserStateService.class, false);
        if (LIZ != null) {
            return (IPNSUserStateService) LIZ;
        }
        if (C58096Mr6.LLZZ == null) {
            synchronized (IPNSUserStateService.class) {
                if (C58096Mr6.LLZZ == null) {
                    C58096Mr6.LLZZ = new PNSUserStateManager();
                }
            }
        }
        return C58096Mr6.LLZZ;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService
    public final void initService() {
        if (this.LJLIL == null) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            o.LJIIIIZZ(curUser, "userService().curUser");
            Iterator<UserStateHandler> it = this.LJLJI.iterator();
            while (it.hasNext()) {
                UserStateHandler next = it.next();
                if (next.LIZ() == LIZJ()) {
                    next.LIZLLL(curUser);
                    LJFF("state_machine_user_load", next.key());
                }
            }
        }
        LJI();
        ((RBX) HG3.LJIILL()).addUserChangeListener(this);
        HG3.LJIIL();
        HG3.LJLJL.LJIILJJIL(this);
    }

    public static EnumC39785FjR LIZJ() {
        if (((RBY) HG3.LJIILL()).isChildrenMode()) {
            return EnumC39785FjR.PNS_USER_TYPE_KIDS;
        }
        return EnumC39785FjR.PNS_USER_TYPE_NORMAL;
    }

    public final void LJI() {
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        this.LJLIL = curUser;
        C10K.LIZJ(CallableC26191APr.LJLIL).LIZLLL(new AgS123S0100000_6(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.statemachine.IPNSUserStateService
    public final void LIZ(UserStateHandler userStateHandler) {
        synchronized (PNSUserStateManager.class) {
            this.LJLJI.add(userStateHandler);
        }
    }

    public final void LIZLLL(User user) {
        Iterator<UserStateHandler> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            UserStateHandler next = it.next();
            if (next.LIZ() == LIZJ()) {
                next.LIZIZ(user);
                LJFF("state_machine_user_remove", next.key());
            }
        }
    }

    public final void LJ(User user) {
        if (!C19N.LJ("pns_state_machine_android", false) || this.LJLIL == null || this.LJLILLLLZI == null) {
            return;
        }
        C10K.LIZJ(CallableC39787FjT.LJLIL).LIZLLL(new AgS109S0200000_6(this, user, 0));
    }

    public static void LJFF(String str, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(LIZJ().ordinal(), "user_type");
        c188727au.LJIIIZ("handle_key", str2);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // X.InterfaceC252619vl
    public final void t0(int i, User user, User user2) {
        if (i == 5 && user2 != null) {
            LJ(user2);
        }
    }

    @Override // X.LEA
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        if (i == 1) {
            if (z && ((RBY) HG3.LJIILL()).isChildrenMode() && user != null) {
                LJ(user);
                return;
            }
            return;
        }
        if (i != 3 || !z) {
            return;
        }
        User user2 = this.LJLIL;
        if (user2 != null) {
            LIZLLL(user2);
            LJI();
        } else {
            o.LJIJI("lastLoggedInUser");
            throw null;
        }
    }
}
