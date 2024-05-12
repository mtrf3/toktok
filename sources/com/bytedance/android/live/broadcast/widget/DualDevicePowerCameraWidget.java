package com.bytedance.android.live.broadcast.widget;

import X.C15380j0;
import X.C16880lQ;
import X.C259710f;
import X.C47061t0;
import Y.IDCListenerS135S0100000;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* loaded from: classes.dex */
public final class DualDevicePowerCameraWidget extends LiveRecyclableWidget {
    public C47061t0 LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d5o;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C259710f.LIZ.LIZJ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View view = getView();
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.i08);
            if (textView != null) {
                textView.setText(C15380j0.LJIILJJIL(R.string.mwe));
            }
            C47061t0 c47061t0 = (C47061t0) view.findViewById(R.id.i03);
            this.LJLIL = c47061t0;
            if (c47061t0 != null) {
                c47061t0.setBackground(C15380j0.LJI(R.drawable.d07));
            }
        }
        View view2 = getView();
        if (view2 != null) {
            C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 44), view2);
        }
    }
}
