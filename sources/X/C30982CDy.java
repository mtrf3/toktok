package X;

import Y.ARunnableS24S0200000_5;
import android.view.View;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.CDy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30982CDy implements InterfaceC31860Ceu {
    public final /* synthetic */ SubscriptionSettingFragmentNew LIZ;

    @Override // X.InterfaceC31860Ceu
    public final void LIZLLL() {
        C0NB.LIZ("SubLinkShareImgLoadListener onFail");
    }

    public C30982CDy(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LIZ = subscriptionSettingFragmentNew;
    }

    @Override // X.InterfaceC31860Ceu
    public final void LIZ(C30988CEe subLinkShareImg) {
        o.LJIIIZ(subLinkShareImg, "subLinkShareImg");
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = this.LIZ;
        subscriptionSettingFragmentNew.LLFII = subLinkShareImg;
        View _$_findCachedViewById = subscriptionSettingFragmentNew._$_findCachedViewById(R.id.ev0);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.post(new ARunnableS24S0200000_5(subLinkShareImg, subscriptionSettingFragmentNew, 76));
        }
    }
}
