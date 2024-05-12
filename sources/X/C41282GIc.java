package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GIc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41282GIc implements InterfaceC62930Oms {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;

    @Override // X.InterfaceC62930Oms
    public final void onError() {
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.g8s);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC62930Oms
    public final void onSuccess() {
        AdPersonalitySettings adPersonalitySettings;
        ComplianceSetting complianceSetting;
        AdPersonalitySettings LIZIZ = C41290GIk.LIZIZ();
        if (LIZIZ != null) {
            adPersonalitySettings = AdPersonalitySettings.copy$default(LIZIZ, null, null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(this.LJLIL), null, null, null, null, null, null, null, null, null, null, null, null, null, 67104767, null);
        } else {
            adPersonalitySettings = null;
        }
        IComplianceSettingsService LIZLLL = C41290GIk.LIZLLL();
        ComplianceSetting LJIIL = C41290GIk.LIZLLL().LJIIL();
        if (LJIIL == null || (complianceSetting = ComplianceSetting.copy$default(LJIIL, null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null)) == null) {
            complianceSetting = new ComplianceSetting(null, null, null, null, adPersonalitySettings, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 0, 0, null, false, null, 33554415, null);
        }
        LIZLLL.LJIILJJIL(complianceSetting);
        C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
        c26045AKb.LJIIIIZZ(R.string.p8_);
        c26045AKb.LJIIJ();
    }

    public C41282GIc(Activity activity, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = activity;
    }
}
