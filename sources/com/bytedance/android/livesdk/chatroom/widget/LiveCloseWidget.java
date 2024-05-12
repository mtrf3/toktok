package com.bytedance.android.livesdk.chatroom.widget;

import X.BP4;
import X.BZI;
import X.C199097rd;
import X.C1EW;
import X.C28718BOw;
import X.C28787BRn;
import X.C30042Bqg;
import X.C72818Shy;
import X.CMC;
import X.CMD;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import Y.ARunnableS41S0100000_5;
import Y.AfS57S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LiveIntroApi;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class LiveCloseWidget extends LiveWidget implements InterfaceC72822Si2 {
    public CMC LJLIL;
    public boolean LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dp9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C72818Shy.LIZLLL("live_anchor_room_intro_switch", this);
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        C1EW.LIZ(((LiveIntroApi) LIZ.LIZIZ(LiveIntroApi.class)).getLiveIntroData()).LJJJLIIL(new AfS57S0100000_5(this, 95), CMD.LJLIL);
        View view = getView();
        if (view != null) {
            view.postDelayed(new ARunnableS41S0100000_5(this, 139), 2000L);
        }
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C72818Shy.LJII("live_anchor_room_intro_switch", this);
        if (this.LJLILLLLZI) {
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_room_detail_effective_use");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ(DataChannelGlobal.LJLJJI.mv0(C30042Bqg.class), "live_type");
            LIZ.LJJIIJZLJL();
        }
        CMC cmc = this.LJLIL;
        if (cmc != null) {
            cmc.cancel();
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ(c199097rd.LJLIL, "live_anchor_room_intro_switch")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null && u.LJJIIZI(interfaceC78280Uns, "is_turn_on", false)) {
                CMC cmc = this.LJLIL;
                if (cmc != null) {
                    cmc.cancel();
                }
                CMC cmc2 = new CMC(this);
                this.LJLIL = cmc2;
                cmc2.start();
                return;
            }
            CMC cmc3 = this.LJLIL;
            if (cmc3 == null) {
                return;
            }
            cmc3.cancel();
        }
    }
}
