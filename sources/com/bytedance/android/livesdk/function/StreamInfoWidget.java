package com.bytedance.android.livesdk.function;

import X.C15380j0;
import X.C16880lQ;
import X.C47121t6;
import Y.ACListenerS33S0100000_13;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.InteractStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.LinkInteractMixStreamTypeChannel;
import com.bytedance.android.livesdk.dataChannel.StreamInfoEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class StreamInfoWidget extends LiveRecyclableWidget {
    public C47121t6 LJLIL;
    public Object LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.diu;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        hide();
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            c47121t6.setText("");
            this.LJLILLLLZI = null;
        } else {
            o.LJIJI("streamInfoTv");
            throw null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.kli);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.stream_info_text)");
        this.LJLIL = (C47121t6) findViewById;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, LinkInteractMixStreamTypeChannel.class, new AqS179S0100000_13(this, 320));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, InteractStateChangeEvent.class, new AqS179S0100000_13(this, 321));
            dataChannel2.lv0(this, StreamInfoEvent.class, new AqS179S0100000_13(this, 322));
        }
        View view = getView();
        if (view != null) {
            view.setBackgroundDrawable(C15380j0.LJI(R.color.b9));
        }
        C47121t6 c47121t6 = this.LJLIL;
        if (c47121t6 != null) {
            C16880lQ.LJJIIZ(c47121t6, new ACListenerS33S0100000_13(this, 74));
        } else {
            o.LJIJI("streamInfoTv");
            throw null;
        }
    }
}
