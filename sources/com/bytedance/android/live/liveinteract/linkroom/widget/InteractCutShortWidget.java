package com.bytedance.android.live.liveinteract.linkroom.widget;

import X.C16880lQ;
import X.C29701Eo;
import X.C76349Txp;
import X.RunnableC76527U1r;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortAniEndEvent;
import com.bytedance.android.live.liveinteract.api.event.MatchCutShortEvent;
import com.bytedance.android.live.liveinteract.api.event.TwoMatchCutShortEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class InteractCutShortWidget extends LiveWidget {
    public C29701Eo LJLIL;
    public Handler LJLILLLLZI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dbk;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        C29701Eo c29701Eo;
        super.onCreate();
        View view = getView();
        if (view != null) {
            c29701Eo = (C29701Eo) view.findViewById(R.id.c32);
        } else {
            c29701Eo = null;
        }
        this.LJLIL = c29701Eo;
        this.LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.mv0(MatchCutShortEvent.class, this, new AqS179S0100000_13(this, 60));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.mv0(TwoMatchCutShortEvent.class, this, new AqS179S0100000_13(this, 61));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.mv0(MatchCutShortAniEndEvent.class, this, new AqS179S0100000_13(this, 62));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }

    public final void LJLZ(C76349Txp c76349Txp, boolean z) {
        C29701Eo c29701Eo;
        boolean z2 = c76349Txp.LJLILLLLZI;
        if (Build.VERSION.SDK_INT > 26 && (c29701Eo = this.LJLIL) != null) {
            c29701Eo.useHardwareAcceleration(true);
        }
        Handler handler = this.LJLILLLLZI;
        if (handler != null) {
            handler.postDelayed(new RunnableC76527U1r(this, c76349Txp, z, z2), 700L);
        } else {
            o.LJIJI("handler");
            throw null;
        }
    }
}
