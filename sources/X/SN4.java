package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;

/* loaded from: classes13.dex */
public final class SN4 implements InterfaceC71919SKl {
    public final /* synthetic */ SN1<VM> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        PrivacySettingsRestrictionItem LLII = this.LIZ.LLII();
        if (LLII != null) {
            privacySettingsRestrictionOption = C78939UyV.LJJIFFI(LLII, Integer.valueOf(this.LIZIZ));
        } else {
            privacySettingsRestrictionOption = null;
        }
        if (SN3.LIZLLL(privacySettingsRestrictionOption).LIZ && SN3.LIZJ(this.LIZ.LLII()).LIZ && (!this.LIZJ || !C78966Uyw.LJJIJL())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        PrivacySettingsRestrictionItem LLII = this.LIZ.LLII();
        if (LLII != null) {
            privacySettingsRestrictionOption = C78939UyV.LJJIFFI(LLII, Integer.valueOf(this.LIZIZ));
        } else {
            privacySettingsRestrictionOption = null;
        }
        return SN3.LIZLLL(privacySettingsRestrictionOption).LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SN4(SN1<? extends VM> sn1, int i, boolean z) {
        this.LIZ = sn1;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
