package X;

import android.app.Activity;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GIj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41289GIj implements InterfaceC62930Oms {
    public final /* synthetic */ Integer LJLIL;
    public final /* synthetic */ PersonalizationViewModel LJLILLLLZI;
    public final /* synthetic */ C68322mC<Integer> LJLJI;
    public final /* synthetic */ C68322mC<Integer> LJLJJI;

    @Override // X.InterfaceC62930Oms
    public final void onError() {
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.g8s);
        }
        if (this.LJLJI.element != null) {
            this.LJLILLLLZI.hv0().setValue(this.LJLJI.element);
        }
        if (this.LJLJJI.element != null) {
            ((LiveData) this.LJLILLLLZI.LJLJI.getValue()).setValue(this.LJLJJI.element);
        }
    }

    @Override // X.InterfaceC62930Oms
    public final void onSuccess() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings adPersonalitySettings2;
        ComplianceSetting complianceSetting2;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (C41290GIk.LJIIIIZZ()) {
            AdPersonalitySettings LIZIZ2 = C41290GIk.LIZIZ();
            if (LIZIZ2 != null) {
                Integer num = this.LJLIL;
                if (num == null) {
                    if (LIZIZ != null) {
                        num = LIZIZ.getMode();
                    } else {
                        num = null;
                    }
                }
                adPersonalitySettings2 = AdPersonalitySettings.copy$default(LIZIZ2, num, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 67108862, null);
            } else {
                adPersonalitySettings2 = null;
            }
            IComplianceSettingsService gv0 = this.LJLILLLLZI.gv0();
            ComplianceSetting LJIIL = this.LJLILLLLZI.gv0().LJIIL();
            if (LJIIL == null || (complianceSetting2 = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
                complianceSetting2 = new ComplianceSetting(null, null, null, null, adPersonalitySettings2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
            }
            gv0.LJIILJJIL(complianceSetting2);
        } else {
            AdPersonalitySettings LIZIZ3 = C41290GIk.LIZIZ();
            if (LIZIZ3 != null) {
                Integer num2 = this.LJLIL;
                if (num2 == null) {
                    if (LIZIZ != null) {
                        num2 = LIZIZ.getUnifiedMode();
                    } else {
                        num2 = null;
                    }
                }
                adPersonalitySettings = AdPersonalitySettings.copy$default(LIZIZ3, null, null, null, null, null, null, null, null, null, null, null, null, num2, null, null, null, null, null, null, null, null, null, null, null, null, null, 67104767, null);
            } else {
                adPersonalitySettings = null;
            }
            IComplianceSettingsService gv02 = this.LJLILLLLZI.gv0();
            ComplianceSetting LJIIL2 = this.LJLILLLLZI.gv0().LJIIL();
            if (LJIIL2 == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL2, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
                complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
            }
            gv02.LJIILJJIL(complianceSetting);
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            AnonymousClass114.LIZ(LJIIIIZZ, R.string.p8_);
        }
    }

    public C41289GIj(Integer num, PersonalizationViewModel personalizationViewModel, C68322mC<Integer> c68322mC, C68322mC<Integer> c68322mC2) {
        this.LJLIL = num;
        this.LJLILLLLZI = personalizationViewModel;
        this.LJLJI = c68322mC;
        this.LJLJJI = c68322mC2;
    }
}
