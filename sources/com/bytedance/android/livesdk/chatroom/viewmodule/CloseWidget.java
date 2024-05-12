package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.B76;
import X.BZI;
import X.C08660Vq;
import X.C08680Vs;
import X.C16880lQ;
import X.C28787BRn;
import X.C73943T0h;
import X.CN1;
import X.UPJ;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.performance.widget.PerformProcessWidget;
import com.bytedance.android.livesdk.dataChannel.HideParentCloseEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveLogMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.watch.IDisplayOptService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CloseWidget extends PerformProcessWidget {
    public long LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp1;
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJJJJ() {
        DataChannel dataChannel;
        Room room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.qv0(HideParentCloseEvent.class, Boolean.TRUE);
        }
        if (LJZ() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            B76.LIZLLL("close", room, Long.valueOf(this.LJLIL));
        }
    }

    public final boolean LJZ() {
        IDisplayOptService iDisplayOptService = (IDisplayOptService) CN1.LIZ(IDisplayOptService.class);
        if (iDisplayOptService != null) {
            return iDisplayOptService.bq(this.dataChannel);
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, X.YA7
    public final void LJLJI() {
        if (LJZ()) {
            this.LJLIL = System.currentTimeMillis();
        }
    }

    public final void LJLZ() {
        UPJ.LJFF(6, C73943T0h.LIZ());
        if (LiveLogMonitorSampleSetting.INSTANCE.isReport("livesdk_exit_liveroom_click", 0.1d)) {
            BZI LIZ = C28787BRn.LIZ("livesdk_exit_liveroom_click");
            LIZ.LJIILLIIL(this.dataChannel);
            String str = C08680Vs.LJIIZILJ;
            C08680Vs c08680Vs = C08680Vs.LJIILJJIL;
            LIZ.LJIJJ(Integer.valueOf(c08680Vs.LJFF()), str);
            LIZ.LJIJJ(C08660Vq.LIZ(), C08680Vs.LJIJ);
            LIZ.LJIJJ(c08680Vs.LIZIZ(), "entrance_type");
            LIZ.LJJIIJZLJL();
        }
        ((ILiveHostCrossRoomEventHelper) CN1.LIZ(ILiveHostCrossRoomEventHelper.class)).clearId();
    }

    @Override // com.bytedance.android.live.performance.widget.PerformProcessWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel;
        Room room;
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 134), view);
        }
        if (!LJZ() && (dataChannel = this.dataChannel) != null && (room = (Room) dataChannel.kv0(RoomChannel.class)) != null) {
            B76.LIZJ(room, "close");
        }
    }
}
