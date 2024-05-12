package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C15380j0;
import X.C15450j7;
import X.C16880lQ;
import X.C29306Beo;
import X.C29744Bls;
import Y.ACListenerS25S0100000_5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* loaded from: classes6.dex */
public final class PreviewCloseWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dpt;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZ() {
        super.LJZ();
        C29306Beo.LJJLIIIJILLIZJL(C15450j7.LIZ(this.context) + C15380j0.LIZ(27.0f), getView());
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void LJZL() {
        super.LJZL();
        View view = getView();
        if (view != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 96), view);
        }
        View view2 = getView();
        if (view2 != null) {
            h0.LJIJI(view2, new C29744Bls(C15380j0.LJIILJJIL(R.string.k20)));
        }
    }
}
