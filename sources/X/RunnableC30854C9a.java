package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;

/* renamed from: X.C9a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC30854C9a implements Runnable {
    public final /* synthetic */ NetSpeedMonitorWidget LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            C30855C9b c30855C9b = (C30855C9b) this.LJLIL.LJLL.getValue();
            int i = this.LJLIL.LJLJI;
            c30855C9b.getClass();
            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_change_netspeed_show");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(C30855C9b.LIZ(i), "net_speed");
            LIZ2.LJJIIJZLJL();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC30854C9a(NetSpeedMonitorWidget netSpeedMonitorWidget) {
        this.LJLIL = netSpeedMonitorWidget;
    }
}
