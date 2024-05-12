package com.bytedance.android.livesdk.chatroom.widget;

import X.C0K2;
import X.C16880lQ;
import X.C29306Beo;
import X.CN1;
import X.EnumC30204BtI;
import X.EnumC30241Btt;
import X.InterfaceViewOnClickListenerC30227Btf;
import Y.ACListenerS25S0100000_5;
import Y.IDCListenerS298S0100000_5;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.share.IShareService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.ToolBarRefactor;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.TtliveGameLandscapeDesignOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public class LiveTopShareWidget extends LiveRecyclableWidget implements View.OnClickListener {
    public InterfaceViewOnClickListenerC30227Btf LJLIL;
    public View LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.do9;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (WatchMemoryLeakOpt.INSTANCE.valueForEc()) {
            this.LJLILLLLZI = null;
            this.LJLIL = null;
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            view2.callOnClick();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View findViewById;
        LiveMode streamType;
        if (this.LJLIL == null) {
            Room room = (Room) this.dataChannel.kv0(RoomChannel.class);
            if (room == null) {
                C0K2.LIZ("current room is null when watch live", new NullPointerException());
                streamType = LiveMode.VIDEO;
            } else {
                streamType = room.getStreamType();
            }
            this.LJLIL = ((IShareService) CN1.LIZ(IShareService.class)).bW(C29306Beo.LIZIZ(this.context), this.context, streamType, this);
        }
        InterfaceViewOnClickListenerC30227Btf interfaceViewOnClickListenerC30227Btf = this.LJLIL;
        EnumC30204BtI enumC30204BtI = EnumC30204BtI.SHARE;
        enumC30204BtI.load(this.dataChannel, interfaceViewOnClickListenerC30227Btf);
        View view = enumC30204BtI.getView(this.dataChannel);
        this.LJLILLLLZI = view;
        if (view != null && getView() != null) {
            ViewGroup viewGroup = (ViewGroup) this.LJLILLLLZI.getParent();
            if (viewGroup != null) {
                this.LJLILLLLZI.clearAnimation();
                viewGroup.setLayoutTransition(null);
                C16880lQ.LJLLL(this.LJLILLLLZI, viewGroup);
            }
            View view2 = this.LJLILLLLZI;
            if (ToolBarRefactor.enable()) {
                EnumC30241Btt.SHARE.getViewModel(this.dataChannel).hv0(false, true);
                C16880lQ.LJIIJ(new ACListenerS25S0100000_5(interfaceViewOnClickListenerC30227Btf, 138), this.LJLILLLLZI);
                this.LJLILLLLZI.setOnLongClickListener(new IDCListenerS298S0100000_5(interfaceViewOnClickListenerC30227Btf, 3));
            } else {
                View findViewById2 = this.LJLILLLLZI.findViewById(R.id.lsg);
                if (findViewById2 != null) {
                    if (findViewById2.getParent() != null) {
                        C16880lQ.LJLLL(findViewById2, (ViewGroup) findViewById2.getParent());
                    }
                    view2 = findViewById2;
                }
                view2.setPadding(0, 0, 0, 0);
            }
            FrameLayout frameLayout = (FrameLayout) getView();
            if (TtliveGameLandscapeDesignOptimizeSetting.INSTANCE.shouldAddIconBackground() && (findViewById = this.LJLILLLLZI.findViewById(R.id.ld_)) != null) {
                findViewById.setVisibility(8);
            }
            frameLayout.addView(view2, new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.setClipChildren(false);
            C16880lQ.LJIILJJIL(frameLayout, this);
        }
    }
}
