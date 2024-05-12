package com.bytedance.android.livesdk.widget;

import X.B35;
import X.C16880lQ;
import Y.ACListenerS52S0000000_5;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* loaded from: classes6.dex */
public class LiveAgeRestrictedWidget extends LiveWidget {
    public B35 LJLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dnf;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        B35 b35 = this.LJLIL;
        if (b35 != null) {
            b35.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        TextView textView = (TextView) findViewById(R.id.z6);
        TextView textView2 = (TextView) findViewById(R.id.z7);
        textView.setText(R.string.mm9);
        textView2.setText(R.string.mm8);
        View view = getView();
        Objects.requireNonNull(view);
        C16880lQ.LJIIJ(new ACListenerS52S0000000_5(1), view);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        B35 b35 = this.LJLIL;
        if (b35 != null) {
            b35.stop(false);
        }
    }

    public LiveAgeRestrictedWidget(B35 b35) {
        this.LJLIL = b35;
    }
}
