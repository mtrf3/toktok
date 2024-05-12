package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.user.UserStore;
import com.ss.android.ugc.aweme.user.lego.FetchUserInfoRequest;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RBY extends RBX {
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(ENU.LJLIL);

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final EFM fetchUserInfoRequest() {
        return new FetchUserInfoRequest();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isChildrenMode() {
        init();
        RBW.LJLJLJ.getClass();
        return RBW.LJLLI.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isDeleteByAgeGate() {
        init();
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser == null || currentUser.getAgeGatePostAction() != EnumC62956OnI.EU_EEA.getValue()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final boolean isUidContactPermisioned() {
        try {
            if (C04330Ez.LIZ(EF7.LIZIZ(), (String) LIZIZ.getValue()) != -1) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void clear(String enterMethod) {
        o.LJIIIZ(enterMethod, "enterMethod");
        init();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C67737QiD.LIZ);
        LIZ.append("|clear:");
        LIZ.append(enterMethod);
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        o.LJIIIZ(LIZIZ2, "<set-?>");
        C67737QiD.LIZ = LIZIZ2;
        Keva.getRepo("password_status").clear();
        RBW rbw = RBW.LJLLI;
        rbw.LJLIL = false;
        C16880lQ.LJLIIIL(rbw, UserStore.LIZLLL());
        rbw.LJLILLLLZI = -1L;
    }

    @Override // com.ss.android.ugc.aweme.IAccountUserService
    public final void queryVerifyStatus(InterfaceC26190APq interfaceC26190APq, boolean z) {
        RBW.LJLLI.LJI();
    }
}
