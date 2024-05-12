package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.SocialPlatformSetting;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes14.dex */
public final class UPZ implements InterfaceC57395Mfn {
    public static final UPZ LIZ = new UPZ();

    @Override // X.InterfaceC57395Mfn
    public final boolean LIZIZ() {
        List<SocialPlatformSetting> socialPlatformSettings = HG3.LJIILL().getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    return socialPlatformSetting.getSyncStatus();
                }
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC57395Mfn
    public final boolean LIZJ() {
        if (LIZIZ() && LJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC57395Mfn
    public final boolean LJ() {
        try {
            if (C04330Ez.LIZ(EF7.LIZIZ(), "android.permission.READ_CONTACTS") != -1) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    @Override // X.InterfaceC57395Mfn
    public final void LJFF(boolean z) {
        IAccountUserService LJIILL = HG3.LJIILL();
        List<SocialPlatformSetting> socialPlatformSettings = LJIILL.getCurUser().getSocialData().getSocialPlatformSettings();
        if (socialPlatformSettings != null) {
            for (SocialPlatformSetting socialPlatformSetting : socialPlatformSettings) {
                if (socialPlatformSetting.getSocialPlatform() == 1) {
                    socialPlatformSetting.setSyncStatus(z);
                    LJIILL.forceSave();
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }
}
