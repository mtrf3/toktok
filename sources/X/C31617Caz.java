package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.SubscriptionGiftSendDialog;

/* renamed from: X.Caz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31617Caz implements InterfaceC18460ny {
    public final /* synthetic */ SubscriptionGiftSendDialog LIZ;

    public C31617Caz(SubscriptionGiftSendDialog subscriptionGiftSendDialog) {
        this.LIZ = subscriptionGiftSendDialog;
    }

    @Override // X.InterfaceC18460ny
    public final void LIZ(C1Z6 c1z6) {
        Long l;
        C31614Caw c31614Caw;
        this.LIZ.dismiss();
        C31620Cb2.LIZ(c1z6.LIZ, this.LIZ.getContext());
        FragmentManager fragmentManager = this.LIZ.getFragmentManager();
        if (fragmentManager != null) {
            SubscriptionGiftSendDialog subscriptionGiftSendDialog = this.LIZ;
            int i = c1z6.LIZ;
            String str = subscriptionGiftSendDialog.LJLLLL;
            String str2 = subscriptionGiftSendDialog.LJLLLLLL;
            C31616Cay c31616Cay = subscriptionGiftSendDialog.LJLLILLLL;
            if (c31616Cay != null && (c31614Caw = c31616Cay.LJLJJLL) != null) {
                l = Long.valueOf(c31614Caw.LIZ);
            } else {
                l = null;
            }
            UHW.LIZ(false, i, str, str2, l, subscriptionGiftSendDialog.LJZI, subscriptionGiftSendDialog.LJZ).show(fragmentManager, "");
        }
        this.LIZ.wl();
    }

    @Override // X.InterfaceC18460ny
    public final void LIZIZ(C1Z6 c1z6) {
        Long l;
        C31614Caw c31614Caw;
        this.LIZ.dismiss();
        FragmentManager fragmentManager = this.LIZ.getFragmentManager();
        if (fragmentManager != null) {
            SubscriptionGiftSendDialog subscriptionGiftSendDialog = this.LIZ;
            String str = subscriptionGiftSendDialog.LJLLLLLL;
            C31616Cay c31616Cay = subscriptionGiftSendDialog.LJLLILLLL;
            if (c31616Cay != null && (c31614Caw = c31616Cay.LJLJJLL) != null) {
                l = Long.valueOf(c31614Caw.LIZ);
            } else {
                l = null;
            }
            UHW.LIZ(true, -1, "", str, l, subscriptionGiftSendDialog.LJZI, subscriptionGiftSendDialog.LJZ).show(fragmentManager, "");
        }
        this.LIZ.wl();
    }
}
