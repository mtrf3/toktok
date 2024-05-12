package X;

import android.view.View;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.FreeTrialPage;

/* loaded from: classes8.dex */
public final class GI8 implements View.OnClickListener {
    public static final GI8 LJLIL = new GI8();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        FMX.LJIIL("click_ad_free_trial_prompt", new C188727au().LIZ);
        InterfaceC32051Chz interfaceC32051Chz = FreeTrialPage.LJLLLL;
        if (interfaceC32051Chz != null) {
            interfaceC32051Chz.LIZ();
        }
    }
}
