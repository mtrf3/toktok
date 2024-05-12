package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;

/* renamed from: X.SOu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72032SOu implements InterfaceC71919SKl {
    public final /* synthetic */ C72037SOz LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = this.LIZ.LJLLI;
        if (privacySettingsRestrictionItem != null) {
            privacySettingsRestrictionOption = C78939UyV.LJJIFFI(privacySettingsRestrictionItem, Integer.valueOf(this.LIZIZ));
        } else {
            privacySettingsRestrictionOption = null;
        }
        if (SN3.LIZLLL(privacySettingsRestrictionOption).LIZ && SN3.LIZJ(this.LIZ.LJLLI).LIZ && ((!this.LIZJ || !C71945SLl.LIZLLL()) && this.LIZ.LLFZ())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        PrivacySettingsRestrictionOption privacySettingsRestrictionOption;
        PrivacySettingsRestrictionItem privacySettingsRestrictionItem = this.LIZ.LJLLI;
        if (privacySettingsRestrictionItem != null) {
            privacySettingsRestrictionOption = C78939UyV.LJJIFFI(privacySettingsRestrictionItem, Integer.valueOf(this.LIZIZ));
        } else {
            privacySettingsRestrictionOption = null;
        }
        if (SN3.LIZLLL(privacySettingsRestrictionOption).LIZIZ && this.LIZ.LLIFFJFJJ()) {
            return true;
        }
        return false;
    }

    public C72032SOu(C72037SOz c72037SOz, int i, boolean z) {
        this.LIZ = c72037SOz;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
