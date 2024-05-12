package com.bytedance.android.livesdk.programmedlive.ui;

import X.B76;
import X.BJM;
import X.BZI;
import X.C16880lQ;
import X.C199097rd;
import X.C28787BRn;
import X.C29717BlR;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73943T0h;
import X.CL0;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import Y.ACListenerS25S0100000_5;
import Y.AfS57S0100000_5;
import Y.IDCallbackS367S0100000_5;
import android.os.Handler;
import android.text.TextUtils;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.dataChannel.ProgrammedLiveMenuVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class ProgrammedLiveTitleWidget extends LiveRecyclableWidget implements InterfaceC72822Si2 {
    public LinearLayout LJLIL;
    public CL0 LJLILLLLZI;
    public LiveIconView LJLJI;
    public boolean LJLJJI;
    public Room LJLJJL;
    public final Handler LJLJJLL = new Handler(C16880lQ.LLJJJJ(), new IDCallbackS367S0100000_5(this, 4));
    public final C73318Sq2 LJLJL = new C73318Sq2();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dhh;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLJJI = false;
        this.LJLJJLL.removeCallbacksAndMessages(null);
        this.LJLJL.LIZLLL();
        C72818Shy.LJII("program_live_tile", this);
    }

    public final void onEvent(C29717BlR c29717BlR) {
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout == null) {
            return;
        }
        linearLayout.setClickable(!c29717BlR.LIZ);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLIL = (LinearLayout) findViewById(R.id.j83);
        this.LJLILLLLZI = (CL0) findViewById(R.id.title);
        this.LJLJI = (LiveIconView) findViewById(R.id.ghc);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Long l;
        User owner;
        String str;
        TopFrameSummary topFrameSummary;
        Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
        this.LJLJJL = room;
        CL0 cl0 = this.LJLILLLLZI;
        Long l2 = null;
        if (cl0 != null) {
            if (room != null && (topFrameSummary = room.topFrameSummary) != null) {
                str = topFrameSummary.title;
            } else {
                str = null;
            }
            cl0.setText(str);
            cl0.requestLayout();
        }
        this.LJLJJLL.sendEmptyMessageDelayed(0, 2000L);
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout != null) {
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS25S0100000_5(this, 237));
        }
        this.dataChannel.lv0(this, ProgrammedLiveMenuVisibilityChannel.class, new AqS171S0100000_5(this, 468));
        this.LJLJL.LIZ(C73943T0h.LIZ().LJ(C29717BlR.class).LJJJJZI(new AfS57S0100000_5(this, 158)));
        C72818Shy.LIZLLL("program_live_tile", this);
        BZI LIZ = C28787BRn.LIZ("livesdk_program_live_list_entrance_show");
        Room room2 = this.LJLJJL;
        if (room2 != null && (owner = room2.getOwner()) != null) {
            l = Long.valueOf(owner.getId());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "anchor_id");
        Room room3 = this.LJLJJL;
        if (room3 != null) {
            l2 = Long.valueOf(room3.getId());
        }
        LIZ.LJIJJ(l2, "room_id");
        LIZ.LJIJJ(BJM.LJFF(), "enter_from_merge");
        LIZ.LJIJJ(BJM.LJIIIIZZ(), "enter_method");
        LIZ.LJIJJ(BJM.LIZLLL(), "action_type");
        LIZ.LJJIIJZLJL();
        Room room4 = this.LJLJJL;
        if (room4 != null) {
            B76.LIZJ(room4, "programmedlive_title");
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        CL0 cl0;
        String str;
        if (TextUtils.equals(c199097rd.LJLIL, "program_live_tile") && (cl0 = this.LJLILLLLZI) != null) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "title", "");
            } else {
                str = null;
            }
            cl0.setText(str);
            cl0.requestLayout();
        }
    }
}
