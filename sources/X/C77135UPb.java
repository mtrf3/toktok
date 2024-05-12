package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformAccessInfo;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformTokenStatus;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UPb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77135UPb implements UTL {
    public static final C77135UPb LIZ = new C77135UPb();

    @Override // X.UTL
    public final boolean LIZ() {
        Integer LIZLLL = LIZLLL();
        int value = SocialPlatformTokenStatus.STATUS_VALID.getValue();
        if (LIZLLL != null && LIZLLL.intValue() == value && LIZIZ()) {
            return true;
        }
        return false;
    }

    @Override // X.UTL
    public final boolean LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = HG3.LJIILL().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 6) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.UTL
    public final Integer LIZLLL() {
        List<SocialPlatformSetting> socialPlatformSettings = HG3.LJIILL().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings == null) {
            return null;
        }
        while (true) {
            Integer num = null;
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 6) {
                    SocialPlatformAccessInfo accessInfo = socialPlatformSetting.getAccessInfo();
                    if (accessInfo != null) {
                        num = accessInfo.getTokenStatus();
                    }
                }
            }
            return num;
        }
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
                    if (socialPlatformSetting.getSocialPlatform() == 6) {
                        break;
                    }
                } else {
                    socialPlatformSetting = null;
                    break;
                }
            }
            SocialPlatformSetting socialPlatformSetting2 = socialPlatformSetting;
            if (socialPlatformSetting2 != null) {
                socialPlatformSetting2.setSyncStatus(z);
                LJIILL.forceSave();
            }
        }
    }
}
