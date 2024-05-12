package com.ss.android.ugc.aweme.arch.widgets.base.widgetcore;

import X.AbstractC209098In;
import X.C29257Be1;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;

/* loaded from: classes4.dex */
public abstract class AbsAsyncWidget<T> extends Widget implements Observer<T> {
    public abstract AbstractC209098In LJIILJJIL();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onCreate() {
        super.onCreate();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void LJIIL(View view) {
        C29257Be1 c29257Be1 = C29257Be1.LIZ;
        synchronized (c29257Be1) {
            c29257Be1.LIZ();
        }
        LJIILJJIL();
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else {
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            onDestroy();
        }
    }
}
