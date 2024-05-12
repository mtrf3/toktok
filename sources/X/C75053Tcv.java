package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.show.anchor.LiveShowAnchorWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Tcv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75053Tcv implements InterfaceViewOnClickListenerC30227Btf {
    public final InterfaceC75092TdY LJLIL;
    public InterfaceC30237Btp LJLILLLLZI;

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
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final /* synthetic */ boolean ud() {
        return true;
    }

    public C75053Tcv(LiveShowAnchorWidget liveShowAnchorWidget) {
        this.LJLIL = liveShowAnchorWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        java.util.Map LIZJ = C76548U2m.LIZJ();
        LIZJ.put("guest_cnt", String.valueOf(C76548U2m.LJ()));
        C76548U2m.LJIIZILJ("livesdk_anchor_multiguest_liveshow_icon_click", LIZJ);
        C76548U2m.LJIIJ("liveshow_icon");
        this.LJLIL.LJJIIZ();
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        this.LJLILLLLZI = interfaceC30237Btp;
    }
}
