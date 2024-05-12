package com.bytedance.android.livesdk.broadcast.preview.widget.start_live;

import X.C28787BRn;
import X.C29306Beo;
import X.C2A7;
import X.C78540Us4;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;

/* loaded from: classes6.dex */
public final class PreviewPracticeLiveWidget extends PreviewWidget {
    public C2A7 LJLJI;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        C2A7 c2a7;
        super.LJZL();
        View view = getView();
        if (!(view instanceof C2A7) || (c2a7 = (C2A7) view) == null) {
            return;
        }
        this.LJLJI = c2a7;
        C28787BRn.LIZ("livesdk_practice_icon_show").LJJIIJZLJL();
        View view2 = getView();
        if (view2 != null) {
            C29306Beo.LJJJLL(view2, 500L, new AqS171S0100000_5(this, 236));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C78540Us4.LJJIIJ()) {
            return R.layout.dpq;
        }
        return R.layout.dpp;
    }
}
