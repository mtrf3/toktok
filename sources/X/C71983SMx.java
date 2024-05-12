package X;

import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import java.util.List;

/* renamed from: X.SMx, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71983SMx extends C71985SMz {
    public final /* synthetic */ C71979SMt LIZJ;

    @Override // X.C71985SMz, X.InterfaceC71919SKl
    public final boolean isEnabled() {
        while (true) {
            boolean z = false;
            for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem : (List) this.LIZJ.LJLLILLLL.getValue()) {
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
            for (PrivacySettingsRestrictionItem privacySettingsRestrictionItem : (List) this.LIZJ.LJLLILLLL.getValue()) {
                if (z || SN3.LIZJ(privacySettingsRestrictionItem).LIZIZ) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71983SMx(C71979SMt c71979SMt) {
        super(c71979SMt, false);
        this.LIZJ = c71979SMt;
    }
}
