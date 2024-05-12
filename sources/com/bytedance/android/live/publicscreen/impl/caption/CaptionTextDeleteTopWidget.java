package com.bytedance.android.live.publicscreen.impl.caption;

import X.C15380j0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.CaptionTextTouchEvent;
import com.bytedance.android.livesdk.dataChannel.CaptionTopInvadeEvent;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class CaptionTextDeleteTopWidget extends LiveRecyclableWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.contentView.setBackgroundColor(C15380j0.LIZIZ(R.color.a05));
        hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        findViewById(R.id.l4m);
        findViewById(R.id.b4p);
        findViewById(R.id.b4q);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        this.dataChannel.lv0(this, CaptionTopInvadeEvent.class, new AqS171S0100000_5(this, 73));
        this.dataChannel.lv0(this, CaptionTextTouchEvent.class, new AqS171S0100000_5(this, 74));
        hide();
    }
}
