package X;

import com.ss.android.ugc.aweme.settingsrequest.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService;

/* loaded from: classes7.dex */
public final class EID implements EIE {
    @Override // X.EIE
    public final void LIZ(java.util.Map<String, String> map) {
        ISettingsRequestService LJIILLIIL = SettingsRequestServiceImpl.LJIILLIIL();
        if (LJIILLIIL != null) {
            LJIILLIIL.LJIIJ(map);
        }
    }
}
