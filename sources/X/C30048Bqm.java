package X;

import android.content.Context;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveSubscriptionAnchorUrlSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.Bqm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30048Bqm implements CEM {
    public final /* synthetic */ SubscriptionSettingFragmentNew LIZ;

    @Override // X.CEM
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LiveSubscriptionAnchorUrlSetting.spotlightIntro());
        LIZ.append("&anchor_id=");
        LIZ.append(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        String LIZIZ = X1D.LIZIZ(LIZ);
        InterfaceC06390Mx LIZ2 = CN1.LIZ(ISubscribeService.class);
        o.LJIIIIZZ(LIZ2, "getService(ISubscribeService::class.java)");
        Context requireContext = this.LIZ.requireContext();
        o.LJIIIIZZ(requireContext, "requireContext()");
        ((ISubscribeService) LIZ2).Vu0(requireContext, LIZIZ, C113554cx.LJJJLIIL());
        InterfaceC30442Bx8.LJLILLLLZI.LIZJ(Boolean.TRUE);
    }

    public C30048Bqm(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew) {
        this.LIZ = subscriptionSettingFragmentNew;
    }
}
