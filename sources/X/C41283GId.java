package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GId, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41283GId implements InterfaceC62930Oms {
    public final /* synthetic */ int LJLIL;

    @Override // X.InterfaceC62930Oms
    public final void onError() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.g8s);
        }
    }

    @Override // X.InterfaceC62930Oms
    public final void onSuccess() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(LIZIZ, Integer.valueOf(this.LJLIL), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862, null);
        } else {
            adPersonalitySettings = null;
        }
        IComplianceSettingsService LIZLLL = C41290GIk.LIZLLL();
        ComplianceSetting LJIIL = C41290GIk.LIZLLL().LJIIL();
        if (LJIIL == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
        }
        LIZLLL.LJIILJJIL(complianceSetting);
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.p8_);
        }
    }

    public C41283GId(int i) {
        this.LJLIL = i;
    }
}
