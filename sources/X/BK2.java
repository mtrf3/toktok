package X;

import android.view.View;
import com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BK2 implements InterfaceViewOnClickListenerC30227Btf, InterfaceC72822Si2 {
    public DataChannel LJLIL;

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
    public final /* synthetic */ void ei() {
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannel = this.LJLIL;
        if (dataChannel != null) {
            ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).wr0(dataChannel, "anchor_toolbar");
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_click");
        LIZ.LJIILLIIL(this.LJLIL);
        C06490Nh.LIZLLL(LIZ, "anchor_toolbar", "show_entrance", "anchor", "user_type");
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String LJJIJIL;
        if (o.LJ(c199097rd.LJLIL, "show_subscription_management_popup")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            String str = "anchor_toolbar";
            if (interfaceC78280Uns != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns, "show_entrance", "anchor_toolbar")) != null) {
                str = LJJIJIL;
            }
            DataChannel dataChannel = this.LJLIL;
            if (dataChannel != null) {
                ((ISubscribeService) CN1.LIZ(ISubscribeService.class)).wr0(dataChannel, str);
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        C72818Shy.LJII("show_subscription_management_popup", this);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        C72818Shy.LIZLLL("show_subscription_management_popup", this);
        BZI LIZ = C28787BRn.LIZ("livesdk_subscribe_icon_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ("anchor_toolbar", "show_entrance");
        LIZ.LJIJJ("anchor", "user_type");
        LIZ.LJJIIJZLJL();
        Room LJJIJLIJ = C29306Beo.LJJIJLIJ(dataChannel);
        if (C29306Beo.LJIIJ(this.LJLIL) && C29232Bdc.LJIILIIL(LJJIJLIJ)) {
            InterfaceC30442Bx8.e3.LIZ(Boolean.TRUE);
        }
    }
}
