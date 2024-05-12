package com.bytedance.android.livesdk.broadcast.interaction.widget.mutemic;

import X.BZI;
import X.C28787BRn;
import X.C30659C1n;
import X.CN1;
import X.WM7;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MuteMicViewStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class MuteMicWidget extends LiveWidget {
    public int LJLIL;
    public int LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpi;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C30659C1n c30659C1n;
        super.onCreate();
        View view = getView();
        if ((view instanceof C30659C1n) && (c30659C1n = (C30659C1n) view) != null) {
            c30659C1n.setClickAction(new AqS155S0100000_5(this, 119));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, MuteMicChannel.class, new AqS171S0100000_5(this, 156));
            dataChannel.lv0(this, PauseLiveChannel.class, new AqS171S0100000_5(this, 157));
            dataChannel.lv0(this, MuteMicViewStateChangeEvent.class, new AqS171S0100000_5(this, 158));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        DataChannel dataChannel = this.dataChannel;
        BZI LIZ = C28787BRn.LIZ("livesdk_live_take_mute_quick_button_show");
        LIZ.LJIILLIIL(dataChannel);
        LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), WM7.SCENE_SERVICE);
        LIZ.LJJIIJZLJL();
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.ov0(this, LinkCrossRoomStateChangeEvent.class, new AqS171S0100000_5(this, 159));
        }
    }
}
