package X;

import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage;
import com.zhiliaoapp.musically.R;
import yq4.a;

/* renamed from: X.Ci0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32052Ci0 implements InterfaceC41281GIb {
    public final /* synthetic */ SubscriptionPage LIZ;

    @Override // X.InterfaceC41281GIb
    public final void onFail() {
        this.LIZ.LJIJ();
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.g8s);
        c26045AKb.LJIIJ();
    }

    @Override // X.InterfaceC41281GIb
    public final void onSuccess() {
        this.LIZ.LJIJ();
        C26045AKb c26045AKb = new C26045AKb(this.LIZ);
        c26045AKb.LJIIIIZZ(R.string.p8_);
        c26045AKb.LJIIJ();
        SubscriptionPage subscriptionPage = this.LIZ;
        PersonalizationViewModel personalizationViewModel = subscriptionPage.LJLJLLL;
        if (personalizationViewModel != null) {
            personalizationViewModel.iv0(1);
        }
        a.LJIIZILJ().LJIIIZ();
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(0, "page_exit_status");
        c188727au.LIZLLL(0, "click_value");
        c188727au.LJ(System.currentTimeMillis() - subscriptionPage.LLIIII, "stay_time");
        FMX.LJIIL("exit_subscription_prompt", c188727au.LIZ);
        InterfaceC32051Chz interfaceC32051Chz = SubscriptionPage.LLIIIL;
        if (interfaceC32051Chz != null) {
            interfaceC32051Chz.LIZ();
        }
    }

    public C32052Ci0(SubscriptionPage subscriptionPage) {
        this.LIZ = subscriptionPage;
    }
}
