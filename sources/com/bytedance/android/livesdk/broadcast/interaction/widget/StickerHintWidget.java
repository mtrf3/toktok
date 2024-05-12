package com.bytedance.android.livesdk.broadcast.interaction.widget;

import X.C29306Beo;
import X.C78290Uo2;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class StickerHintWidget extends LiveRecyclableWidget {
    public C78290Uo2 LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dd0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        if (this.LJLIL != null) {
            C29306Beo.LJIILLIIL(null);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        View view;
        if (this.LJLIL == null && (view = getView()) != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            this.LJLIL = new C78290Uo2(view, dataChannel, this);
        }
        C78290Uo2 c78290Uo2 = this.LJLIL;
        if (c78290Uo2 != null) {
            c78290Uo2.LIZLLL();
        }
    }
}
