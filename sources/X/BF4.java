package X;

import android.content.Context;
import com.bytedance.android.livesdk.impl.revenue.subscription.dialog.SubscribeGiftSubHintDialog;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;

/* loaded from: classes6.dex */
public final class BF4 implements CEM {
    public final /* synthetic */ SubscriptionSettingFragmentNew LIZ;

    @Override // X.CEM
    public final void LIZ() {
        Context context = this.LIZ.getContext();
        if (context != null) {
            SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = this.LIZ;
            SubscribeGiftSubHintDialog subscribeGiftSubHintDialog = new SubscribeGiftSubHintDialog(context);
            if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/impl/revenue/subscription/dialog/SubscribeGiftSubHintDialog", "show", subscribeGiftSubHintDialog, new Object[0], "void", new C65300Pk0(false, "()V", "2622147783387198772")).LIZ) {
                subscribeGiftSubHintDialog.show();
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_subscription_gift_sub_layer_show");
            LIZ.LJIIZILJ();
            LIZ.LJIJJ(subscriptionSettingFragmentNew.LJLIL, "show_entrance");
            LIZ.LJJIIJZLJL();
            InterfaceC30442Bx8.W2.LIZJ(Boolean.TRUE);
        }
    }

    public BF4(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LIZ = subscriptionSettingFragmentNew;
    }
}
