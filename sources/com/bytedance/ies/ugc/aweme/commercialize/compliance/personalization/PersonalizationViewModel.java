package com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization;

import X.C221108m2;
import X.C41285GIf;
import X.C41286GIg;
import X.C41287GIh;
import X.C41290GIk;
import X.C62822Ol8;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.model.AdFreeSubscription;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;

/* loaded from: classes8.dex */
public final class PersonalizationViewModel extends ViewModel {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(C41287GIh.LJLIL);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C41285GIf.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C41286GIg.LJLIL);

    public final IComplianceSettingsService gv0() {
        return (IComplianceSettingsService) this.LJLIL.getValue();
    }

    public final MutableLiveData<Integer> hv0() {
        return (MutableLiveData) this.LJLILLLLZI.getValue();
    }

    public final void iv0(int i) {
        AdFreeSubscription adFreeSubscription;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        AdPersonalitySettings adPersonalitySettings = null;
        if (LIZIZ != null) {
            adFreeSubscription = LIZIZ.getSubscription();
            if (adFreeSubscription != null) {
                adFreeSubscription.setSubscriptionStatus(Integer.valueOf(i));
            }
        } else {
            adFreeSubscription = null;
        }
        AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
        if (LIZIZ2 != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(LIZIZ2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, adFreeSubscription, null, 50331647, null);
        }
        IComplianceSettingsService gv0 = gv0();
        ComplianceSetting LJIIL = gv0().LJIIL();
        if (LJIIL == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
        }
        gv0.LJIILJJIL(complianceSetting);
    }
}
