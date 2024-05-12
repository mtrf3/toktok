package com.bytedance.android.livesdk.broadcast.preview.widget.livestudio;

import Y.ARunnableS41S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.DeepLinkLiveModeChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public abstract class AbstractPreviewLiveStudioPage extends PreviewWidget {
    public boolean LJLJI;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void LJZL() {
        super.LJZL();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.ov0(this, DeepLinkLiveModeChannel.class, new AqS171S0100000_5(this, 208));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        View view = getView();
        if (view != null) {
            view.postDelayed(new ARunnableS41S0100000_5(this, 68), 1000L);
        }
    }
}
