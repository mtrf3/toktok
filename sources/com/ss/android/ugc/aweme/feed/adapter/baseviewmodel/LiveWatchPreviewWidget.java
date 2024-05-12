package com.ss.android.ugc.aweme.feed.adapter.baseviewmodel;

import X.C221108m2;
import X.C62822Ol8;
import X.C86343Xud;
import X.FIK;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.experiment.PreloadWidgetsData;
import kotlin.jvm.internal.AqS164S0100000_14;

/* loaded from: classes15.dex */
public abstract class LiveWatchPreviewWidget extends LiveRecyclableWidget {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 59));

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final C86343Xud LJLZ() {
        return (C86343Xud) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        FIK.LIZ.getClass();
        return ((PreloadWidgetsData) FIK.LIZJ.getValue()).enableRecycleWidget;
    }
}
