package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;

/* renamed from: X.GIa, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41280GIa implements InterfaceC62930Oms {
    public final /* synthetic */ int LJLIL = 1;
    public final /* synthetic */ PersonalizationViewModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC41281GIb LJLJI;
    public final /* synthetic */ C68322mC<Integer> LJLJJI;

    @Override // X.InterfaceC62930Oms
    public final void onError() {
        if (this.LJLJJI.element != null) {
            this.LJLILLLLZI.hv0().setValue(this.LJLJJI.element);
        }
        this.LJLJI.onFail();
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
        IComplianceSettingsService gv0 = this.LJLILLLLZI.gv0();
        ComplianceSetting LJIIL = this.LJLILLLLZI.gv0().LJIIL();
        if (LJIIL == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
        }
        gv0.LJIILJJIL(complianceSetting);
        this.LJLJI.onSuccess();
    }

    public C41280GIa(PersonalizationViewModel personalizationViewModel, C32052Ci0 c32052Ci0, C68322mC c68322mC) {
        this.LJLILLLLZI = personalizationViewModel;
        this.LJLJI = c32052Ci0;
        this.LJLJJI = c68322mC;
    }
}
