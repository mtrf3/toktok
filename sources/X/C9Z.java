package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorNetworkMonitorDurationSetting;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C9Z implements C9W {
    public final /* synthetic */ NetSpeedMonitorWidget LIZ;

    public C9Z(NetSpeedMonitorWidget netSpeedMonitorWidget) {
        this.LIZ = netSpeedMonitorWidget;
    }

    @Override // X.C9W
    public final void LIZ(EnumC48190Ivi it) {
        if (it != EnumC48190Ivi.NONE) {
            C30855C9b c30855C9b = (C30855C9b) this.LIZ.LJLL.getValue();
            EnumC48190Ivi nonNoneNetworkType = this.LIZ.LJLLILLLL;
            o.LJIIIIZZ(nonNoneNetworkType, "nonNoneNetworkType");
            o.LJIIIIZZ(it, "it");
            NetSpeedMonitorWidget netSpeedMonitorWidget = this.LIZ;
            int i = netSpeedMonitorWidget.LJLJI;
            AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(netSpeedMonitorWidget, 122);
            c30855C9b.getClass();
            if (System.currentTimeMillis() - c30855C9b.LIZ < LiveAnchorNetworkMonitorDurationSetting.INSTANCE.getValue() * 1000) {
                BZI LIZ = C28787BRn.LIZ("livesdk_anchor_change_network");
                LIZ.LJIIZILJ();
                LIZ.LJIJJ(C30855C9b.LIZIZ(nonNoneNetworkType), "before_net_status");
                LIZ.LJIJJ(C30855C9b.LIZIZ(it), "after_net_status");
                LIZ.LJIJJ(C30855C9b.LIZ(i), "before_net_speed");
                LIZ.LJJIIJZLJL();
                System.currentTimeMillis();
                aqS155S0100000_5.invoke();
            }
            this.LIZ.LJLLILLLL = it;
        }
        this.LIZ.LJLLI = it;
    }
}
