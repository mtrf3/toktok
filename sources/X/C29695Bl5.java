package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bl5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29695Bl5 implements InterfaceViewOnClickListenerC30227Btf {
    public final /* synthetic */ C29694Bl4 LJLIL;

    public C29695Bl5(C29694Bl4 c29694Bl4) {
        this.LJLIL = c29694Bl4;
    }

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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.LIZLLL();
        C29694Bl4 c29694Bl4 = this.LJLIL;
        ViewOnClickListenerC29222BdS viewOnClickListenerC29222BdS = c29694Bl4.LJII;
        if (viewOnClickListenerC29222BdS != null) {
            viewOnClickListenerC29222BdS.LJLLL = false;
        }
        c29694Bl4.getClass();
        BZI LIZ = C28787BRn.LIZ("livesdk_stream_key_banner_show");
        LIZ.LJIIZILJ();
        LIZ.LJIJJ("third_party", "live_type");
        LIZ.LJJIIJZLJL();
    }
}
