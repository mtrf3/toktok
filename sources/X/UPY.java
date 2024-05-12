package X;

import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPY implements InterfaceC58710N2k {
    @Override // X.InterfaceC58710N2k
    public final int LIZ() {
        return 2;
    }

    @Override // X.InterfaceC58710N2k
    public final OSZ<Boolean, Boolean> LIZJ() {
        List<SocialPlatformSetting> socialPlatformSettings;
        boolean z;
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        SocialDataStruct socialData = curUser.getSocialData();
        if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 2) {
                    if (!socialPlatformSetting.getSyncStatus() && socialPlatformSetting.getDisplayConsentPage()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new OSZ<>(Boolean.valueOf(z), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                }
            }
        }
        Boolean bool = Boolean.TRUE;
        return new OSZ<>(bool, bool);
    }

    @Override // X.InterfaceC58710N2k
    public final boolean LIZIZ(ActivityC45651qj activityC45651qj) {
        int LIZLLL = UPT.LIZLLL(2);
        if ((LIZLLL != 4 && LIZLLL != 6) || !((RBX) HG3.LJIILL()).isLogin() || AV1.LJIIL()) {
            return false;
        }
        HG3.LJIIL();
        if (!o.LJ(HG3.LJLJL.LJIIIZ().getLatestLoginMethodName(), "facebook") || !C68736QyK.LIZLLL.LIZ("facebook") || C77266UUc.LIZIZ.LJIIJ().LJI(((RBX) HG3.LJIILL()).getCurUserId()).length() == 0 || !UPT.LJFF(2)) {
            return false;
        }
        return true;
    }
}
