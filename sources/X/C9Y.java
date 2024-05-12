package X;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class C9Y implements Runnable {
    public final /* synthetic */ NetSpeedMonitorWidget LJLIL;

    public final void LIZ() {
        NetSpeedMonitorWidget netSpeedMonitorWidget = this.LJLIL;
        netSpeedMonitorWidget.getClass();
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("refreshStatusView. networkStatus=");
            b1.LJ(LIZ, netSpeedMonitorWidget.LJLJI, LIZ, "OBSBroadcastInteractionFragment");
        }
        int i = netSpeedMonitorWidget.LJLJI;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    TextView textView = netSpeedMonitorWidget.LJLILLLLZI;
                    if (textView != null) {
                        textView.setText(R.string.ngd);
                        ImageView imageView = netSpeedMonitorWidget.LJLIL;
                        if (imageView != null) {
                            imageView.setImageResource(R.drawable.d0j);
                        } else {
                            o.LJIJI("statusIcon");
                            throw null;
                        }
                    } else {
                        o.LJIJI("statusTip");
                        throw null;
                    }
                }
            } else {
                TextView textView2 = netSpeedMonitorWidget.LJLILLLLZI;
                if (textView2 != null) {
                    textView2.setText(R.string.ngg);
                    ImageView imageView2 = netSpeedMonitorWidget.LJLIL;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.d0h);
                    } else {
                        o.LJIJI("statusIcon");
                        throw null;
                    }
                } else {
                    o.LJIJI("statusTip");
                    throw null;
                }
            }
        } else {
            TextView textView3 = netSpeedMonitorWidget.LJLILLLLZI;
            if (textView3 != null) {
                textView3.setText(R.string.ngc);
                ImageView imageView3 = netSpeedMonitorWidget.LJLIL;
                if (imageView3 != null) {
                    imageView3.setImageResource(R.drawable.d0i);
                } else {
                    o.LJIJI("statusIcon");
                    throw null;
                }
            } else {
                o.LJIJI("statusTip");
                throw null;
            }
        }
        Object value = this.LJLIL.LJLL.getValue();
        int i2 = this.LJLIL.LJLJI;
        value.getClass();
        if (UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_netspeed_show")) {
            BZI LIZ2 = C28787BRn.LIZ("livesdk_netspeed_show");
            LIZ2.LJIIZILJ();
            LIZ2.LJIJJ(C30855C9b.LIZ(i2), "net_speed");
            LIZ2.LJJIIJZLJL();
        }
        C30857C9d c30857C9d = (C30857C9d) this.LJLIL.LJLJLLL.getValue();
        NetSpeedMonitorWidget netSpeedMonitorWidget2 = this.LJLIL;
        int i3 = netSpeedMonitorWidget2.LJLJI;
        AqS155S0100000_5 aqS155S0100000_5 = new AqS155S0100000_5(netSpeedMonitorWidget2, LiveTryModeCountDownThresholdSetting.DEFAULT);
        c30857C9d.getClass();
        if (i3 != 3) {
            c30857C9d.LIZJ = 0L;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            if (c30857C9d.LIZJ == 0) {
                c30857C9d.LIZJ = currentTimeMillis;
            }
            if (currentTimeMillis - c30857C9d.LIZJ >= 9000 && currentTimeMillis - c30857C9d.LIZIZ >= TimeUnit.MINUTES.toMillis(1L)) {
                c30857C9d.LIZIZ = currentTimeMillis;
                c30857C9d.LIZJ = 0L;
                if (!c30857C9d.LIZ) {
                    C30868C9o.LJIIIIZZ(R.string.ngf, C15380j0.LIZLLL());
                }
                aqS155S0100000_5.invoke();
            }
        }
        ((Handler) this.LJLIL.LJLJLJ.getValue()).postDelayed(this, 3000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C9Y(NetSpeedMonitorWidget netSpeedMonitorWidget) {
        this.LJLIL = netSpeedMonitorWidget;
    }
}
