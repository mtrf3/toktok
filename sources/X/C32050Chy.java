package X;

import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.PersonalizationViewModel;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.subscription.SubscriptionPage;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Chy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32050Chy implements InterfaceC18460ny {
    public final /* synthetic */ SubscriptionPage LIZ;

    public C32050Chy(SubscriptionPage subscriptionPage) {
        this.LIZ = subscriptionPage;
    }

    @Override // X.InterfaceC18460ny
    public final void LIZ(C1Z6 c1z6) {
        this.LIZ.LJIJ();
        SubscriptionPage subscriptionPage = this.LIZ;
        subscriptionPage.getClass();
        int i = c1z6.LIZ;
        if (i != 301) {
            if (i != 302) {
                switch (i) {
                    case 201:
                    case 202:
                    case 207:
                    case 209:
                    case 210:
                        C26045AKb c26045AKb = new C26045AKb(subscriptionPage);
                        c26045AKb.LJIIIIZZ(R.string.dry);
                        c26045AKb.LJIIJ();
                        break;
                    case 203:
                        C26045AKb c26045AKb2 = new C26045AKb(subscriptionPage);
                        c26045AKb2.LJIIIIZZ(R.string.drv);
                        c26045AKb2.LJIIJ();
                        break;
                    case 204:
                        C26045AKb c26045AKb3 = new C26045AKb(subscriptionPage);
                        c26045AKb3.LJIIIIZZ(R.string.ds2);
                        c26045AKb3.LJIIJ();
                        break;
                    case 205:
                        C26045AKb c26045AKb4 = new C26045AKb(subscriptionPage);
                        c26045AKb4.LJIIIIZZ(R.string.ds1);
                        c26045AKb4.LJIIJ();
                        break;
                    case 206:
                        C26045AKb c26045AKb5 = new C26045AKb(subscriptionPage);
                        c26045AKb5.LJIIIIZZ(R.string.ds3);
                        c26045AKb5.LJIIJ();
                        break;
                    case 208:
                        C26045AKb c26045AKb6 = new C26045AKb(subscriptionPage);
                        c26045AKb6.LJIIIIZZ(R.string.ds4);
                        c26045AKb6.LJIIJ();
                        break;
                    default:
                        C26045AKb c26045AKb7 = new C26045AKb(subscriptionPage);
                        c26045AKb7.LJIIIIZZ(R.string.dry);
                        c26045AKb7.LJIIJ();
                        break;
                }
            } else {
                C26045AKb c26045AKb8 = new C26045AKb(subscriptionPage);
                c26045AKb8.LJIIIIZZ(R.string.dru);
                c26045AKb8.LJIIJ();
            }
        } else if (c1z6.LIZIZ == -2) {
            C26045AKb c26045AKb9 = new C26045AKb(subscriptionPage);
            c26045AKb9.LJIIIIZZ(R.string.n6w);
            c26045AKb9.LJIIJ();
        } else {
            C26045AKb c26045AKb10 = new C26045AKb(subscriptionPage);
            c26045AKb10.LJIIIIZZ(R.string.drt);
            c26045AKb10.LJIIJ();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("error_message", c1z6.LIZJ);
        FMX.LJIIL("show_payment_error_prompt", c188727au.LIZ);
    }

    @Override // X.InterfaceC18460ny
    public final void LIZIZ(C1Z6 c1z6) {
        if (!TextUtils.isEmpty(c1z6.LIZLLL)) {
            this.LIZ.LJIJ();
            SubscriptionPage subscriptionPage = this.LIZ;
            PersonalizationViewModel personalizationViewModel = subscriptionPage.LJLJLLL;
            if (personalizationViewModel != null) {
                personalizationViewModel.iv0(2);
            }
            C188727au LIZJ = C0RN.LIZJ(0, "page_exit_status", 1, "click_value");
            LIZJ.LJ(System.currentTimeMillis() - subscriptionPage.LLIIII, "stay_time");
            FMX.LJIIL("exit_subscription_prompt", LIZJ.LIZ);
            InterfaceC32051Chz interfaceC32051Chz = SubscriptionPage.LLIIIL;
            if (interfaceC32051Chz != null) {
                interfaceC32051Chz.LIZIZ();
            }
        }
    }
}
