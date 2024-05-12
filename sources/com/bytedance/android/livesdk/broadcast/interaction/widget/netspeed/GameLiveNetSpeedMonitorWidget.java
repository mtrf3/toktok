package com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed;

import X.AbstractC73672Svk;
import X.BZI;
import X.C0JU;
import X.C0NB;
import X.C162476Zf;
import X.C30868C9o;
import X.C30922CBq;
import X.C76965UIn;
import X.CN1;
import X.QZP;
import X.T16;
import X.X1D;
import Y.AfS17S0001000_5;
import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.NetworkStatus;
import com.bytedance.android.livesdk.dataChannel.GameLiveNetworkPoorToastEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.EnableGameNetworkToastAdjustSetting;
import com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class GameLiveNetSpeedMonitorWidget extends NetSpeedMonitorWidget {
    public long LJZI;
    public long LJLLLL = System.currentTimeMillis();
    public long LJLLLLLL = System.currentTimeMillis();
    public long LJLZ = System.currentTimeMillis();
    public final long LJZ = System.currentTimeMillis();
    public boolean LJZL = true;

    @Override // com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget
    public final void LJLZ() {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.nv0(NetworkStatus.class, this, new AqS171S0100000_5(this, 160));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDetachWidget() {
        super.onDetachWidget();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.interaction.widget.netspeed.NetSpeedMonitorWidget
    public final void LJZ(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        Object obj;
        long currentTimeMillis = System.currentTimeMillis();
        if (EnableGameNetworkToastAdjustSetting.INSTANCE.enable() && currentTimeMillis - this.LJZ < 30000) {
            return;
        }
        if (C30922CBq.LIZIZ) {
            QZP.LIZJ("onNetworkStatus(). status=", i, "GameLiveNetworkStatus");
        }
        int i2 = this.LJLJJI;
        super.LJZ(i);
        int i3 = this.LJLJI;
        boolean z4 = true;
        String str3 = "back";
        if (i2 != i3 && UnusedLogOfflineSetting.INSTANCE.isEnable("livesdk_live_anchor_network_status_show")) {
            String str4 = "good";
            if (i3 == 2) {
                str2 = "bad";
            } else if (i3 != 3) {
                str2 = "good";
            } else {
                str2 = "stuck";
            }
            if (i2 == 2) {
                str4 = "bad";
            } else if (i2 == 3) {
                str4 = "stuck";
            }
            boolean isAppForeground = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground();
            if (isAppForeground) {
                obj = "front";
            } else if (!isAppForeground) {
                obj = "back";
            } else {
                throw new C162476Zf();
            }
            BZI LIZIZ = C0JU.LIZIZ("livesdk_live_anchor_network_status_show", str2, "current_status", str4, "previous_status");
            LIZIZ.LJIJJ(obj, "app_status");
            LIZIZ.LJIILLIIL(this.dataChannel);
            LIZIZ.LJJIIJZLJL();
        }
        if (this.LJZL) {
            this.LJLLLL = currentTimeMillis;
            this.LJLLLLLL = currentTimeMillis;
            this.LJLZ = currentTimeMillis;
            this.LJZL = false;
        }
        int i4 = this.LJLJI;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    this.LJLZ = currentTimeMillis;
                }
            } else {
                this.LJLLLLLL = currentTimeMillis;
            }
        } else {
            this.LJLLLL = currentTimeMillis;
        }
        long j = this.LJLLLLLL;
        long j2 = this.LJLLLL;
        if (j - j2 > 30000) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJLZ - j2 > 5000) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (System.currentTimeMillis() - this.LJZI >= 1800000) {
            z3 = true;
        } else {
            z3 = false;
        }
        Activity LJIILJJIL = g0.LJIILJJIL(getContext());
        if (z3) {
            if (!z) {
                if (z2) {
                    str = "good_to_stuck";
                }
            } else {
                str = "good_to_bad";
            }
            boolean isAppForeground2 = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isAppForeground();
            if (isAppForeground2) {
                str3 = "front";
            } else if (isAppForeground2) {
                throw new C162476Zf();
            }
            BZI LIZIZ2 = C0JU.LIZIZ("livesdk_live_anchor_network_notification_show", str, "notification_type", str3, "app_status");
            LIZIZ2.LJIILLIIL(this.dataChannel);
            LIZIZ2.LJJIIJZLJL();
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.pv0(GameLiveNetworkPoorToastEvent.class);
            }
            this.LJZI = System.currentTimeMillis();
            if (LJIILJJIL != null) {
                C30868C9o.LJ(3000L, LJIILJJIL, LJIILJJIL.getString(R.string.le0));
            }
            AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new AfS17S0001000_5(this.LJLJI, 22));
        }
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("not show toast. activity is null: ");
            if (LJIILJJIL != null) {
                z4 = false;
            }
            C76965UIn.LIZJ(LIZ, z4, "; shouldToastAgain=", z3, "; becomeBadContinueDuration=");
            LIZ.append(z);
            LIZ.append("; becomeStuckContinueDuration=");
            LIZ.append(z2);
            C0NB.LJIIIZ("GameLiveNetSpeedMonitorWidget", X1D.LIZIZ(LIZ));
        }
        AbstractC73672Svk.LJJIJIL(Boolean.TRUE).LJJJ(T16.LIZ()).LJJJJZI(new AfS17S0001000_5(this.LJLJI, 22));
    }
}
