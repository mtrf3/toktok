package X;

import android.view.View;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdk.impl.revenue.subscription.ui.setting.SubscriptionSettingFragmentNew;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bql, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC30047Bql implements View.OnClickListener {
    public final /* synthetic */ SubscriptionSettingFragmentNew LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;

    public ViewOnClickListenerC30047Bql(SubscriptionSettingFragmentNew subscriptionSettingFragmentNew, boolean z, C76732zl c76732zl) {
        this.LJLIL = subscriptionSettingFragmentNew;
        this.LJLILLLLZI = z;
        this.LJLJI = c76732zl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.jvm.internal.AqS155S0100000_5, O] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        O o;
        String str;
        InterfaceC30442Bx8.LJLJI.LIZ(Boolean.FALSE);
        ISubscribeService iSubscribeService = (ISubscribeService) CN1.LIZ(ISubscribeService.class);
        ViewModelProvider of = ViewModelProviders.of(this.LJLIL);
        o.LJIIIIZZ(of, "of(this@SubscriptionSettingFragmentNew)");
        DataChannel LIZ = BHA.LIZ(of, this.LJLIL);
        ActivityC45651qj mo49getActivity = this.LJLIL.mo49getActivity();
        if (mo49getActivity != null) {
            o = mo49getActivity.getSupportFragmentManager();
        } else {
            o = 0;
        }
        ((C32537Cpp) LIZ.gv0(C29494Bhq.class)).LIZ = o;
        ((C32537Cpp) LIZ.gv0(BDK.class)).LIZ = Integer.valueOf(this.LJLIL.LLFFF);
        ((C32537Cpp) LIZ.gv0(C75859Tpv.class)).LIZ = new AqS155S0100000_5(this.LJLIL, 219);
        iSubscribeService.EP(LIZ, this.LJLIL.LJLIL);
        SubscriptionSettingFragmentNew subscriptionSettingFragmentNew = this.LJLIL;
        BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_subscription_highlight_entrance_click");
        subscriptionSettingFragmentNew.Tl(LIZ2);
        LIZ2.LJIJJ(this.LJLIL.LJLIL, "show_entrance");
        if (this.LJLILLLLZI) {
            str = "not_approved";
        } else {
            str = "others";
        }
        LIZ2.LJIJJ(str, "status");
        UFE.LIZIZ(this.LJLJI.element, LIZ2, "is_red_dot");
    }
}
