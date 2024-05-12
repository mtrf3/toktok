package X;

import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import kotlin.jvm.internal.o;

/* renamed from: X.CDz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30983CDz implements InterfaceC31860Ceu {
    public final /* synthetic */ SubscriptionSettingFragmentNew LIZ;

    @Override // X.InterfaceC31860Ceu
    public final void LIZLLL() {
        C0NB.LIZ("SubLinkShareImgLoadListener onFail");
    }

    public C30983CDz(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LIZ = subscriptionSettingFragmentNew;
    }

    @Override // X.InterfaceC31860Ceu
    public final void LIZ(C30988CEe subLinkShareImg) {
        o.LJIIIZ(subLinkShareImg, "subLinkShareImg");
        this.LIZ.LLFII = subLinkShareImg;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SubLinkShareImgLoadListener onLoadSuccess: ");
        LIZ.append(subLinkShareImg);
        C0NB.LIZ(X1D.LIZIZ(LIZ));
    }
}
