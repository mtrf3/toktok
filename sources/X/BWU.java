package X;

import android.view.View;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BWU implements InterfaceC28903BVz {
    public DataChannel LJLIL;
    public boolean LJLILLLLZI;

    @Override // X.InterfaceC28903BVz
    public final void LIZJ(DataChannel dataChannel) {
    }

    @Override // X.InterfaceC28903BVz
    public final int LIZLLL() {
        return R.string.jvh;
    }

    @Override // X.InterfaceC28903BVz
    public final void onHide() {
    }

    @Override // X.InterfaceC28903BVz
    public final int LJ() {
        if (LiveToolbarMoreConfig.INSTANCE.enableInteractionPanelOptimizeByLine()) {
            return R.attr.auh;
        }
        return R.attr.at3;
    }

    @Override // X.InterfaceC28903BVz
    public final void onShow() {
        if (this.LJLILLLLZI) {
            return;
        }
        this.LJLILLLLZI = true;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_karaoke_show");
        LIZ.LJIILLIIL(this.LJLIL);
        LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC28903BVz
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(this.LJLIL, BWV.LJLIL, new AqS171S0100000_5(this, 17), BWX.LJLIL, C15380j0.LJIILJJIL(R.string.jvh), Boolean.TRUE);
    }

    @Override // X.InterfaceC28903BVz
    public final void LIZIZ(View view, DataChannel dataChannel) {
        this.LJLIL = dataChannel;
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).disableFunctionAccordingLevel(null, BWW.LJLIL, new AqS171S0100000_5(view, 15), null, null, null);
    }
}
