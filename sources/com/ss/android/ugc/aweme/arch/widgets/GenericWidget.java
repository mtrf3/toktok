package com.ss.android.ugc.aweme.arch.widgets;

import X.C207668Da;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;

/* loaded from: classes4.dex */
public class GenericWidget extends Widget implements Observer<C207668Da> {
    @Override // androidx.lifecycle.Observer
    /* renamed from: LJIILJJIL, reason: merged with bridge method [inline-methods] */
    public void onChanged(C207668Da c207668Da) {
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
