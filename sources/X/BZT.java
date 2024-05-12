package X;

import Y.AObjectS10S0001000_5;
import Y.AObjectS11S0001000_6;
import Y.AObjectS42S0101000_5;
import Y.AObjectS43S0101000_7;
import Y.AObjectS86S0300000_5;
import android.view.View;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.LiveBanCapabilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class BZT extends BZU {
    public final AObjectS11S0001000_6 LJLIL = new AObjectS11S0001000_6(0, 0);
    public final /* synthetic */ VideoWidget LJLILLLLZI;

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final boolean ud() {
        BEF bef = (BEF) this.LJLILLLLZI.dataChannel.kv0(LiveBanCapabilityChannel.class);
        if (bef == null || !bef.LJLJI) {
            return true;
        }
        return false;
    }

    public BZT(VideoWidget videoWidget) {
        this.LJLILLLLZI = videoWidget;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        BEF bef = (BEF) this.LJLILLLLZI.dataChannel.kv0(LiveBanCapabilityChannel.class);
        if (bef != null && bef.LJLJI) {
            C30868C9o.LIZJ(R.string.o8r);
        } else {
            BCD.LIZ(this.LJLILLLLZI.dataChannel, this.LJLIL, new AObjectS42S0101000_5(0, this, 11), new AObjectS10S0001000_5(1, 3), C15380j0.LJIILJJIL(R.string.k0w), Boolean.FALSE);
        }
    }

    @Override // X.BZU, X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        super.i(interfaceC30237Btp, dataChannel);
        EnumC30204BtI.PROPS.setEnableClick(dataChannel, false);
        AObjectS11S0001000_6 extractServerResponse = this.LJLIL;
        AObjectS86S0300000_5 aObjectS86S0300000_5 = new AObjectS86S0300000_5(this, dataChannel, interfaceC30237Btp, 0);
        o.LJIIIZ(extractServerResponse, "extractServerResponse");
        BCD.LIZ(null, extractServerResponse, aObjectS86S0300000_5, null, null, Boolean.TRUE);
        dataChannel.lv0(this.LJLILLLLZI, LiveBanCapabilityChannel.class, new AObjectS43S0101000_7(0, interfaceC30237Btp, 0));
    }
}
