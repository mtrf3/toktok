package X;

import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;

/* renamed from: X.GIe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41284GIe implements InterfaceC62930Oms {
    public final /* synthetic */ boolean LJLIL;

    @Override // X.InterfaceC62930Oms
    public final void onError() {
    }

    @Override // X.InterfaceC62930Oms
    public final void onSuccess() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(LIZIZ, null, null, null, null, null, null, null, null, null, Boolean.valueOf(this.LJLIL), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108351, null);
        } else {
            adPersonalitySettings = null;
        }
        IComplianceSettingsService LIZLLL = C41290GIk.LIZLLL();
        ComplianceSetting LJIIL = C41290GIk.LIZLLL().LJIIL();
        if (LJIIL == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
        }
        LIZLLL.LJIILJJIL(complianceSetting);
    }

    public C41284GIe(boolean z) {
        this.LJLIL = z;
    }
}
