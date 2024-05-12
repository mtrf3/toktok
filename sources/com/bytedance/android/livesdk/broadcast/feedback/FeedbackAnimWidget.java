package com.bytedance.android.livesdk.broadcast.feedback;

import X.C15380j0;
import X.C15490jB;
import X.C15540jG;
import X.C31479CXb;
import X.C47061t0;
import X.C5H3;
import X.C78996UzQ;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.FeedbackAnimChannel;
import com.bytedance.android.live.FeedbackAnimVisibilityChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FeedbackAnimWidget extends LiveWidget {
    public final C5H3 LJLIL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 109));
    public final C5H3 LJLILLLLZI = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 108));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dao;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C47061t0 LJLZ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-animView>(...)");
        return (C47061t0) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FeedbackAnimVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        int LIZ = C15380j0.LIZ(225.0f);
        C15490jB.LJI((C15540jG) this.LJLIL.getValue());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, FeedbackAnimChannel.class, new C31479CXb(this, LIZ));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        ((C15540jG) this.LJLIL.getValue()).LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(FeedbackAnimVisibilityChannel.class, Boolean.TRUE);
        }
    }
}
