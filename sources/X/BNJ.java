package X;

import Y.ARunnableS24S0200000_5;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.livesdk.BlockMessageEvent;
import com.bytedance.android.livesdk.dataChannel.KeyboardStatusChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveResetMessagePanelState;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BNJ implements InterfaceViewOnClickListenerC30227Btf {
    public final RecyclableWidgetManager LJLIL;
    public InterfaceC30237Btp LJLILLLLZI;
    public LiveIconView LJLJI;
    public DataChannel LJLJJI;
    public int LJLJJL;

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
    public final void Q4(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
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

    public BNJ(RecyclableWidgetManager widgetManager) {
        o.LJIIIZ(widgetManager, "widgetManager");
        this.LJLIL = widgetManager;
    }

    public final void LIZ(boolean z) {
        int i;
        int i2;
        int i3;
        if (LandscapeWatchLiveResetMessagePanelState.INSTANCE.isBlockMessageIconChangedToV2InLandscapeMode()) {
            LiveIconView liveIconView = this.LJLJI;
            if (liveIconView != null) {
                if (!z) {
                    i2 = R.drawable.d5r;
                } else {
                    i2 = R.drawable.d1r;
                }
                liveIconView.setIcon(i2);
                Context context = liveIconView.getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.dj, context);
                if (LJI != null) {
                    i3 = LJI.intValue();
                } else {
                    i3 = -1;
                }
                liveIconView.setIconTint(i3);
                return;
            }
            return;
        }
        LiveIconView liveIconView2 = this.LJLJI;
        if (liveIconView2 == null) {
            return;
        }
        if (!z) {
            i = R.drawable.d5q;
        } else {
            i = R.drawable.d1q;
        }
        liveIconView2.setIcon(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        DataChannel dataChannel;
        DataChannel dataChannel2 = this.LJLJJI;
        if (dataChannel2 != null) {
            dataChannel2.pv0(BlockMessageEvent.class);
        }
        if (!LandscapeWatchLiveGestureOpt.INSTANCE.getEnable() && (dataChannel = this.LJLJJI) != null) {
            dataChannel.pv0(ResetSilentTimerEvent.class);
        }
        B9E.LIZ(this.LJLJJI, true);
    }

    @Override // X.InterfaceViewOnClickListenerC30227Btf
    public final void i(InterfaceC30237Btp interfaceC30237Btp, DataChannel dataChannel) {
        LiveIconView liveIconView;
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLILLLLZI = interfaceC30237Btp;
        this.LJLJJL = !C30149BsP.LIZ() ? 1 : 0;
        this.LJLJJI = dataChannel;
        InterfaceC30237Btp interfaceC30237Btp2 = this.LJLILLLLZI;
        if (interfaceC30237Btp2 != null) {
            liveIconView = (LiveIconView) interfaceC30237Btp2.LIZ(R.id.ld4);
        } else {
            liveIconView = null;
        }
        this.LJLJI = liveIconView;
        C30326BvG.LIZ.post(new ARunnableS24S0200000_5(this, dataChannel, 71), null);
        ((InterfaceC29856Bng) C73943T0h.LIZ().LJ(BNM.class).LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this.LJLIL))).LIZIZ(new AfS57S0100000_5(this, 256));
        dataChannel.lv0(this.LJLIL, KeyboardStatusChannel.class, new AqS171S0100000_5(this, 703));
        LIZ(C30149BsP.LIZ());
        B9E.LIZIZ(this.LJLJJL, dataChannel);
    }
}
