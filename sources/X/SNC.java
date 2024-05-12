package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;

/* loaded from: classes13.dex */
public final class SNC implements InterfaceC71919SKl {
    public final /* synthetic */ SNB LIZ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        if (SN3.LIZJ(this.LIZ.LLII()).LIZ) {
            PrivacySettingsRestrictionItem LLII = this.LIZ.LLII();
            if (LLII != null) {
                privacySettingsRestrictionOption = C78939UyV.LJJIFFI(LLII, 1);
            } else {
                privacySettingsRestrictionOption = null;
            }
            if (SN3.LIZLLL(privacySettingsRestrictionOption).LIZ && !this.LIZ.LJLLL) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        if (SN3.LIZJ(this.LIZ.LLII()).LIZIZ) {
            PrivacySettingsRestrictionItem LLII = this.LIZ.LLII();
            if (LLII != null) {
                privacySettingsRestrictionOption = C78939UyV.LJJIFFI(LLII, 1);
            } else {
                privacySettingsRestrictionOption = null;
            }
            if (SN3.LIZLLL(privacySettingsRestrictionOption).LIZIZ) {
                return true;
            }
        }
        return false;
    }

    public SNC(SNB snb) {
        this.LIZ = snb;
    }
}
