package com.bytedance.android.livesdk.chatroom.widget;

import X.C16880lQ;
import X.C221108m2;
import X.C276716t;
import X.C4C;
import X.C4D;
import X.C62822Ol8;
import X.C73933Szx;
import X.C73969T1h;
import X.InterfaceC29856Bng;
import Y.ACListenerS40S0200000_5;
import Y.AfS57S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class GameDualDeviceWidget extends LiveRecyclableWidget {
    public final boolean LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C4C.LJLIL);
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C4D.LJLIL);
    public LiveIconView LJLJJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (this.LJLIL) {
            return R.layout.cv3;
        }
        return R.layout.cv2;
    }

    public GameDualDeviceWidget(boolean z) {
        this.LJLIL = z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        LiveIconView liveIconView;
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS40S0200000_5(this, view, 15), view);
        }
        View view2 = getView();
        if (view2 != null) {
            liveIconView = (LiveIconView) view2.findViewById(R.id.ebc);
        } else {
            liveIconView = null;
        }
        this.LJLJJI = liveIconView;
        ((InterfaceC29856Bng) C276716t.LIZJ.LJJJ(C73969T1h.LIZIZ()).LIZJ(C73933Szx.LJ(this))).LIZIZ(new AfS57S0100000_5(this, 94));
    }
}
