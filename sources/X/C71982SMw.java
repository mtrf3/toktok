package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.List;

/* renamed from: X.SMw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71982SMw extends C71985SMz {
    public final /* synthetic */ SMJ LIZJ;

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isEnabled() {
        while (true) {
            boolean z = false;
            for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem : (List) this.LIZJ.LJLLJ.getValue()) {
                if (z || SN3.LIZJ(privacySettingsRestrictionItem).LIZ) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isVisible() {
        while (true) {
            boolean z = false;
            for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem : (List) this.LIZJ.LJLLJ.getValue()) {
                if (z || SN3.LIZJ(privacySettingsRestrictionItem).LIZIZ) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71982SMw(SMJ smj) {
        super(smj, false);
        this.LIZJ = smj;
    }
}
