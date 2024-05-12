package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UPc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77136UPc implements UTL {
    public static final C77136UPc LIZ = new C77136UPc();

    @Override // X.UTL
    public final Integer LIZLLL() {
        return Integer.valueOf(SocialPlatformTokenStatus.STATUS_VALID.getValue());
    }

    @Override // X.UTL
    public final boolean LIZ() {
        if (HG3.LJIILL().isUidContactPermisioned() && LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.UTL
    public final boolean LIZIZ() {
        SocialPlatformSetting socialPlatformSetting;
        List<SocialPlatformSetting> socialPlatformSettings = HG3.LJIILL().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return false;
        }
        Iterator<SocialPlatformSetting> it = socialPlatformSettings.iterator();
        while (true) {
            if (it.hasNext()) {
                socialPlatformSetting = it.next();
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    break;
                }
            } else {
                socialPlatformSetting = null;
                break;
            }
        }
        SocialPlatformSetting socialPlatformSetting2 = socialPlatformSetting;
        if (socialPlatformSetting2 == null) {
            return false;
        }
        return socialPlatformSetting2.getEmailAdsDisclosure();
    }

    @Override // X.UTL
    public final void LIZJ(boolean z) {
        SocialPlatformSetting socialPlatformSetting;
        IAccountUserService LJIILL = HG3.LJIILL();
        List<SocialPlatformSetting> socialPlatformSettings = LJIILL.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            Iterator<SocialPlatformSetting> it = socialPlatformSettings.iterator();
            while (true) {
                if (it.hasNext()) {
                    socialPlatformSetting = it.next();
                    if (socialPlatformSetting.getSocialPlatform() == 1) {
                        break;
                    }
                } else {
                    socialPlatformSetting = null;
                    break;
                }
            }
            SocialPlatformSetting socialPlatformSetting2 = socialPlatformSetting;
            if (socialPlatformSetting2 != null) {
                socialPlatformSetting2.setEmailAdsDisclosure(z);
                LJIILL.forceSave();
            }
        }
    }
}
