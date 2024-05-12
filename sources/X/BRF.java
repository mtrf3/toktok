package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class BRF implements InterfaceViewOnClickListenerC30227Btf {
    public final DataChannel LJLIL;
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

    public BRF(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BR4.LIZIZ(this.LJLIL);
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LJLIL, BRH.LJLIL, new AqS171S0100000_5(this, 594), BRI.LJLIL, C15380j0.LJIILJJIL(R.string.lrt), Boolean.TRUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b7, code lost:
    
        if (r12 != null) goto L34;
     */
    @Override // X.InterfaceViewOnClickListenerC30227Btf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(X.InterfaceC30237Btp r11, com.bytedance.ies.sdk.datachannel.DataChannel r12) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BRF.i(X.Btp, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }
}
