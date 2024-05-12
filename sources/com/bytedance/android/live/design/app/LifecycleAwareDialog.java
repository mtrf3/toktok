package com.bytedance.android.live.design.app;

import X.C03880Dg;
import X.C40971jB;
import X.C65300Pk0;
import X.DialogC47081t2;
import android.content.Context;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes.dex */
public class LifecycleAwareDialog extends DialogC47081t2 implements GenericLifecycleObserver {
    public LifecycleOwner LJLJI;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.DialogC47081t2, android.app.Dialog
    public void show() {
        LifecycleOwner lifecycleOwner = this.LJLJI;
        if ((lifecycleOwner != null && lifecycleOwner.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) || new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveControllableAppCompatDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "-3480746826433440598")).LIZ) {
            return;
        }
        super.show();
    }

    @Override // X.DialogC47081t2, X.C18Z, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LifecycleOwner lifecycleOwner = this.LJLJI;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        dismiss();
    }

    public LifecycleAwareDialog(Context context, C40971jB<?> c40971jB) {
        super(context);
        if (c40971jB != null) {
            LifecycleOwner lifecycleOwner = c40971jB.LIZIZ;
            LifecycleOwner lifecycleOwner2 = this.LJLJI;
            if (lifecycleOwner2 != null) {
                lifecycleOwner2.getLifecycle().removeObserver(this);
            }
            this.LJLJI = lifecycleOwner;
            if (lifecycleOwner != null) {
                lifecycleOwner.getLifecycle().addObserver(this);
            }
        }
    }

    public LifecycleAwareDialog(Context context, int i) {
        super(context, i);
    }

    public LifecycleAwareDialog(Context context, int i, int i2) {
        super(context, i);
    }
}
