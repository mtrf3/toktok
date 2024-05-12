package com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait;

import X.AbstractC32349Cmn;
import X.B83;
import X.C15490jB;
import X.C199097rd;
import X.C29306Beo;
import X.C29374Bfu;
import X.C31160CKu;
import X.C32094Cig;
import X.C32346Cmk;
import X.C32347Cml;
import X.C32506CpK;
import X.C32511CpP;
import X.C32580CqW;
import X.C32658Crm;
import X.C32694CsM;
import X.C32696CsO;
import X.C62819Ol5;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73943T0h;
import X.CCJ;
import X.CFX;
import X.InterfaceC31781Cdd;
import X.InterfaceC72822Si2;
import X.UC8;
import Y.AfS57S0100000_5;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.api.event.MatchStartEventFromMessage;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftMatchTraySetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdk.pack.viewmodel.BagListViewModel;
import com.bytedance.android.livesdk.widgets.giftwidget.viewmodel.GiftLeafRootViewModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class GiftLeafRootWidget extends LiveRecyclableWidget implements InterfaceC72822Si2 {
    public C32094Cig LJLIL;
    public UC8 LJLILLLLZI;
    public ViewGroup LJLJI;
    public final C73318Sq2 LJLJJI = new C73318Sq2();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d5s;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final BagListViewModel LJLZ() {
        Fragment fragment;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null) {
            return (BagListViewModel) ViewModelProviders.of(fragment).get(BagListViewModel.class);
        }
        return null;
    }

    public final GiftLeafRootViewModel LJZI() {
        Fragment fragment;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null && (fragment = interfaceC31781Cdd.getFragment()) != null) {
            return (GiftLeafRootViewModel) ViewModelProviders.of(fragment).get(GiftLeafRootViewModel.class);
        }
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C32580CqW LJZ;
        if (WatchMemoryLeakOpt.INSTANCE.settingValue() && (LJZ = LJZ()) != null) {
            LJZ.setFragment(null);
        }
        UC8 uc8 = this.LJLILLLLZI;
        if (uc8 != null) {
            uc8.LJIJJ();
        }
        C72818Shy.LJII("webcast_education_exit", this);
        this.LJLJJI.LIZLLL();
    }

    public final C32580CqW LJZ() {
        if (getView() instanceof C32580CqW) {
            View view = getView();
            o.LJII(view, "null cannot be cast to non-null type com.bytedance.android.livesdk.ui.framework.LeafHostLayout");
            return (C32580CqW) view;
        }
        View view2 = getView();
        if (view2 != null) {
            return (C32580CqW) view2.findViewById(R.id.fo8);
        }
        return null;
    }

    public GiftLeafRootWidget(C32094Cig c32094Cig) {
        this.LJLIL = c32094Cig;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
        Object obj = args[0];
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.GiftPagesData");
        this.LJLIL = (C32094Cig) obj;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        BagListViewModel LJLZ;
        long j;
        C32506CpK<AbstractC32349Cmn> c32506CpK;
        Boolean bool;
        C15490jB.LJIJ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_4"), "ttlive_gift_group_guide.webp");
        C15490jB.LJIJ(CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_recharge_anim.webp");
        C32580CqW LJZ = LJZ();
        if (LJZ != null) {
            LJZ.setFragment(this.widgetCallback.getFragment());
        }
        GiftLeafRootViewModel LJZI = LJZI();
        if (LJZI != null) {
            LJZI.LJLIL = this.dataChannel;
        }
        if (C31160CKu.LIZLLL()) {
            C31160CKu.LIZJ();
            C31160CKu.LIZIZ();
            C31160CKu.LIZ();
            ((Boolean) C31160CKu.LIZLLL.getValue()).booleanValue();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if ((LiveGiftMatchTraySetting.INSTANCE.getValue() || z) && !CCJ.LIZ(this.context)) {
            C32694CsM.LJIJJ = SystemClock.uptimeMillis();
            Context context = this.context;
            o.LJIIIIZZ(context, "context");
            UC8 uc8 = new UC8(context);
            this.LJLILLLLZI = uc8;
            C32580CqW LJZ2 = LJZ();
            if (LJZ2 != null) {
                LJZ2.LJJLJLI(uc8, null);
            }
            C32694CsM.LJIJJLI = SystemClock.uptimeMillis();
        }
        C72818Shy.LIZLLL("webcast_education_exit", this);
        this.LJLJJI.LIZ(C73943T0h.LIZ().LJ(C32346Cmk.class).LJJJJZI(new AfS57S0100000_5(this, 325)));
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, MatchStartEventFromMessage.class, new AqS171S0100000_5(this, 827));
        }
        GiftLeafRootViewModel LJZI2 = LJZI();
        if (LJZI2 != null && (c32506CpK = LJZI2.LJLILLLLZI) != null) {
            C32347Cml c32347Cml = new C32347Cml(this);
            C62819Ol5.LJIIJ("observer");
            if (!c32506CpK.LIZ.containsKey(c32347Cml)) {
                c32506CpK.LIZ.put(c32347Cml, new C32511CpP(c32347Cml));
            }
        }
        if (C32658Crm.LIZJ() && (LJLZ = LJLZ()) != null) {
            long LJJIZ = C29306Beo.LJJIZ(this.dataChannel);
            Room LJJIJLIJ = C29306Beo.LJJIJLIJ(this.dataChannel);
            if (LJJIJLIJ != null) {
                j = LJJIJLIJ.getOwnerUserId();
            } else {
                j = 0;
            }
            LJLZ.hv0(7, LJJIZ, j, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId());
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        if (o.LJ("live_goal_update_event", c199097rd.LJLIL)) {
            C32696CsO.LIZ = false;
        }
        if (o.LJ("webcast_education_exit", c199097rd.LJLIL)) {
            C32696CsO.LIZ = false;
            C32696CsO.LIZIZ = false;
        }
    }
}
