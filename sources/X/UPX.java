package X;

import com.ss.android.ugc.aweme.profile.model.SocialDataStruct;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UPX implements InterfaceC58710N2k {
    @Override // X.InterfaceC58710N2k
    public final int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC58710N2k
    public final OSZ<Boolean, Boolean> LIZJ() {
        List<SocialPlatformSetting> socialPlatformSettings;
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        SocialDataStruct socialData = curUser.getSocialData();
        if (socialData != null && (socialPlatformSettings = socialData.getSocialPlatformSettings()) != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    return new OSZ<>(Boolean.valueOf(!UPZ.LIZ.LIZJ()), Boolean.valueOf(socialPlatformSetting.getSyncStatus()));
                }
            }
        }
        Boolean bool = Boolean.TRUE;
        return new OSZ<>(bool, bool);
    }

    @Override // X.InterfaceC58710N2k
    public final boolean LIZIZ(ActivityC45651qj activityC45651qj) {
        int LIZLLL = UPT.LIZLLL(1);
        if ((LIZLLL != 4 && LIZLLL != 6) || !((RBX) HG3.LJIILL()).isLogin() || AV1.LJIIL() || !UPT.LJFF(1)) {
            return false;
        }
        OHI.LIZ.getClass();
        if (!OHI.LJI(activityC45651qj, "android.permission.READ_CONTACTS")) {
            return true;
        }
        return false;
    }
}
