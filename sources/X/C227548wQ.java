package X;

import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2;

/* renamed from: X.8wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227548wQ extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C227548wQ LJLIL = new C227548wQ();

    public C227548wQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        boolean z;
        Integer M;
        PrivacyUserSettingsV2 privacyUserSettings = PrivacyServiceImpl.LJIIIIZZ().getPrivacyUserSettings();
        if (privacyUserSettings == null || (M = privacyUserSettings.M("profile_view_history")) == null || 1 != M.intValue()) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = !z;
        C227538wP.LIZLLL = z2;
        if (!z2) {
            C227538wP.LIZ = System.currentTimeMillis();
        }
        return C76800UCe.LIZ;
    }
}
