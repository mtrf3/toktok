package X;

import Y.IDgS350S0100000_11;
import android.app.Activity;
import android.os.Bundle;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokPublishGroupSceneFragment;
import com.ss.android.ugc.aweme.userservice.UserService;
import java.util.HashMap;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes12.dex */
public final class R3X implements HQ7 {
    public final java.util.Map<Integer, LEA> LIZ = new HashMap();

    @Override // X.HQ7
    public final String LIZJ() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null) {
            return currentUser.getSecUid();
        }
        return "";
    }

    @Override // X.HQ7
    public final boolean LJ() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        return currentUser != null && currentUser.isCanSetGeoFencing();
    }

    @Override // X.HQ7
    public final void LJI() {
    }

    @Override // X.HQ7
    public final void LJIIIZ() {
        BaseUserService.createIUserServicebyMonsterPlugin(false).setIsOldUser(true);
    }

    @Override // X.HQ7
    public final void LJIIJ() {
    }

    @Override // X.HQ7
    public final C44423Hc3 getCurrentUser() {
        User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
        if (currentUser != null) {
            return new C44423Hc3(currentUser);
        }
        return null;
    }

    @Override // X.HQ7
    public final String getCurrentUserID() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
    }

    @Override // X.HQ7
    public final void getSDKVersion() {
    }

    @Override // X.HQ7
    public final boolean isLogin() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).isLogin();
    }

    @Override // X.HQ7
    public final String LJFF() {
        return String.valueOf(19);
    }

    @Override // X.HQ7
    public final String getUserTTToken() {
        if (C66952QPk.LIZ) {
            C66953QPl c66953QPl = C66953QPl.LJZL;
            if (C66953QPl.LLD) {
                return c66953QPl.LJLJJI;
            }
            return c66953QPl.LJZI.LIZIZ("X-Tt-Token");
        }
        return null;
    }

    @Override // X.HQ7
    public final boolean isChildrenMode() {
        return AV1.LJIILLIIL();
    }

    @Override // X.HQ7
    public final boolean isUidContactPermisioned() {
        return HG3.LJIILL().isUidContactPermisioned();
    }

    @Override // X.HQ7
    public final void LIZIZ(final OKG okg) {
        IAccountService LJIJ = AccountService.LJIJ();
        LEA lea = new LEA() { // from class: X.HQA
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                HQ8 hq8 = okg;
                if (user != null) {
                    ShareDependService.LIZ.getClass();
                    C44498HdG.LIZ().LJJIIZ(user);
                }
                hq8.getClass();
                C60903NvH.LJIIJJI().getAccountService().LJIIJ();
                if (i == 3 && z) {
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("login", "false");
                    FMX.LJIIL("logout_in_ai_upload", c145995oB.LIZ);
                    C78934UyQ.LJLIL.getMusicService().LJIL();
                    C43014GuQ.LJII(false);
                }
            }
        };
        ((HashMap) this.LIZ).put(Integer.valueOf(okg.hashCode()), lea);
        LJIJ.LJIILJJIL(lea);
    }

    @Override // X.HQ7
    public final void LJIIJJI(OKG okg) {
        IAccountService LJIJ = AccountService.LJIJ();
        LEA lea = (LEA) ((HashMap) this.LIZ).remove(Integer.valueOf(okg.hashCode()));
        if (lea != null) {
            LJIJ.LJIILLIIL(lea);
        }
    }

    @Override // X.HQ7
    public final C44423Hc3 LJII(String str, String str2) {
        Z8A z8a = Z8A.LIZIZ;
        return new C44423Hc3(z8a.queryUser(z8a.userUrl(str2, str, null, 0), false, null));
    }

    @Override // X.HQ7
    public final void LIZLLL(int i, String str, String str2, AqS173S0100000_7 aqS173S0100000_7) {
        UserService.LIZ().LJI(i, -1, -1, -1, str, str2, "", "").LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LIZ(new C57384Mfc(aqS173S0100000_7));
    }

    @Override // X.HQ7
    public final void LJIIIIZZ(TikTokPublishGroupSceneFragment tikTokPublishGroupSceneFragment, String str, String str2, R3Y r3y) {
        J9P.LIZJ(tikTokPublishGroupSceneFragment, str, str2, null, new IDgS350S0100000_11(r3y, 1));
    }

    @Override // X.HQ7
    public final void LIZ(Activity activity, String str, String str2, Bundle bundle, R3Y r3y) {
        J9P.LIZIZ(activity, str, str2, bundle, new IDgS350S0100000_11(r3y, 2));
    }
}
