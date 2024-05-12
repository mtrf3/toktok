package com.bytedance.ies.sdk.widgets.widgetloadpriority;

import X.C62850Ola;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreloadInteractionLayerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

/* loaded from: classes6.dex */
public abstract class RoomRecycleWidget extends LiveRecyclableWidget {
    public boolean isAnimated;

    public void onGetRoomInfo(Room room) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        this.isAnimated = false;
    }

    public RoomRecycleWidget() {
        register(Room.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public <T> void onCustomInfoCallBack(T t) {
        if (t instanceof Room) {
            onGetRoomInfo((Room) t);
        }
        super.onCustomInfoCallBack(t);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (!this.isAnimated && LivePreloadInteractionLayerSetting.INSTANCE.isEnablePreload(this.dataChannel)) {
            AlphaAnimation LIZIZ = C62850Ola.LIZIZ(0.0f, 1.0f, 200L);
            View view = getView();
            if (view != null) {
                view.startAnimation(LIZIZ);
            }
            this.isAnimated = true;
        }
    }
}
