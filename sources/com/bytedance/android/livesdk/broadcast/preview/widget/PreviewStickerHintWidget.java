package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C29306Beo;
import X.C78290Uo2;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class PreviewStickerHintWidget extends PreviewWidget {
    public C78290Uo2 LJLJI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dd0;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        View view;
        super.LJZL();
        if (this.LJLJI == null && (view = getView()) != null) {
            DataChannel dataChannel = this.dataChannel;
            o.LJIIIIZZ(dataChannel, "dataChannel");
            this.LJLJI = new C78290Uo2(view, dataChannel, this);
        }
        C78290Uo2 c78290Uo2 = this.LJLJI;
        if (c78290Uo2 != null) {
            c78290Uo2.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (this.LJLJI != null) {
            C29306Beo.LJIILLIIL(null);
        }
    }
}
