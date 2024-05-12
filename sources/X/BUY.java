package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskListUrlSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* loaded from: classes6.dex */
public final class BUY implements InterfaceViewOnClickListenerC30227Btf {
    public final Context LJLIL;
    public HybridDialogFragment LJLILLLLZI;
    public SparkContext LJLJI;

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Ea(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void F() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ long LLJZ() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean LLLILZJ(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void ei() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public BUY(Context context) {
        this.LJLIL = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String value = LiveBroadcastTaskListUrlSetting.INSTANCE.getValue();
        C32364Cn2 c32364Cn2 = new C32364Cn2(value);
        c32364Cn2.LIZJ("enter_from", "mission_entrance");
        String LIZLLL = c32364Cn2.LIZLLL();
        int i = (int) (r2.widthPixels / view.getContext().getResources().getDisplayMetrics().density);
        if (((IHostAction) CN1.LIZ(IHostAction.class)).hostInterceptSpark(value)) {
            SparkContext sparkContext = this.LJLJI;
            if (sparkContext != null) {
                InterfaceC40159FpT LJIILL = sparkContext.LJIILL();
                if (LJIILL != null) {
                    LJIILL.close();
                }
                this.LJLJI = null;
            }
            C29682Bks LIZJ = C29683Bkt.LIZJ(LIZLLL);
            BY3 by3 = BY3.DP;
            LIZJ.LJIL(i, by3);
            LIZJ.LJIIJ(LiveChatShowDelayForHotLiveSetting.DEFAULT, by3);
            C29682Bks.LJIJI(LIZJ, 8);
            LIZJ.LJIIIZ("bottom");
            this.LJLJI = ((IHybridContainerService) CN1.LIZ(IHybridContainerService.class)).Vs0(this.LJLIL, LIZJ.LIZ().toString(), null);
        } else {
            HybridDialogFragment hybridDialogFragment = this.LJLILLLLZI;
            if (hybridDialogFragment != null && hybridDialogFragment.getDialog() != null && hybridDialogFragment.getDialog().isShowing()) {
                this.LJLILLLLZI.dismissAllowingStateLoss();
                this.LJLILLLLZI = null;
            }
            C30882CAc Lu = C7N.LJFF().Lu();
            C28870BUs c28870BUs = new C28870BUs(LIZLLL);
            c28870BUs.LIZIZ = i;
            c28870BUs.LIZJ = LiveChatShowDelayForHotLiveSetting.DEFAULT;
            c28870BUs.LIZ(8, 8, 0);
            c28870BUs.LJIIL = false;
            c28870BUs.LIZLLL = 0;
            c28870BUs.LJIIIZ = 80;
            HybridDialogFragment LIZ = Lu.LIZ(c28870BUs);
            this.LJLILLLLZI = LIZ;
            Context context = this.LJLIL;
            if (context instanceof ActivityC45651qj) {
                BaseDialogFragment.wl((ActivityC45651qj) context, LIZ);
            }
        }
        C78920UyC.LJI("livesdk_anchor_mission_entrance_click", "live", "_param_live_platform");
    }
}
