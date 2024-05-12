package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;

/* loaded from: classes8.dex */
public final class GIZ implements InterfaceC62930Oms {
    public final /* synthetic */ PersonalizationViewModel LJLIL;

    @Override // X.InterfaceC62930Oms
    public final void onError() {
    }

    @Override // X.InterfaceC62930Oms
    public final void onSuccess() {
        ResetEntryTextData resetEntryTextData;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        AdPersonalitySettings adPersonalitySettings = null;
        if (LIZIZ != null) {
            resetEntryTextData = LIZIZ.getReset();
            if (resetEntryTextData != null) {
                resetEntryTextData.setResetStatus(1);
            }
        } else {
            resetEntryTextData = null;
        }
        AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
        if (LIZIZ2 != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(LIZIZ2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, resetEntryTextData, null, null, null, null, null, null, null, 66846719, null);
        }
        IComplianceSettingsService gv0 = this.LJLIL.gv0();
        ComplianceSetting LJIIL = this.LJLIL.gv0().LJIIL();
        if (LJIIL == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
        }
        gv0.LJIILJJIL(complianceSetting);
    }

    public GIZ(PersonalizationViewModel personalizationViewModel) {
        this.LJLIL = personalizationViewModel;
    }
}
