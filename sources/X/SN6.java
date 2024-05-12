package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;

/* loaded from: classes13.dex */
public final class SN6 implements InterfaceC71919SKl {
    public final /* synthetic */ SN5 LIZ;

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
            if (SN3.LIZLLL(privacySettingsRestrictionOption).LIZ && !this.LIZ.LJLLJ) {
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

    public SN6(SN5 sn5) {
        this.LIZ = sn5;
    }
}
