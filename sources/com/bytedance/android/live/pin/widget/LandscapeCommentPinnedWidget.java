package com.bytedance.android.live.pin.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GameLinkLayoutLandDataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class LandscapeCommentPinnedWidget extends MainScreenCommentPinnedWidget {
    @Override // com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget, com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.android.live.publicscreen.api.IPublicScreenContextWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.pin.widget.MainScreenCommentPinnedWidget, com.bytedance.android.live.pin.widget.BaseCommentPinnedWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(dataChannel.LJLJJI, GameLinkLayoutLandDataChannel.class, new AqS171S0100000_5(this, 72));
        }
    }
}
