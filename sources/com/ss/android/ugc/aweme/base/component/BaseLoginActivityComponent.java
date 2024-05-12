package com.ss.android.ugc.aweme.base.component;

import X.J9O;
import X.JJ4;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes9.dex */
public abstract class BaseLoginActivityComponent implements GenericLifecycleObserver, J9O {
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.J9O
    public void LIZ(Fragment fragment, String str, String str2, Bundle bundle, JJ4 jj4) {
        fragment.getLifecycle().addObserver(this);
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.J9O
    public void LIZIZ(Activity activity, String str, String str2, Bundle bundle, JJ4 jj4) {
        if (activity instanceof LifecycleOwner) {
            ((LifecycleOwner) activity).getLifecycle().addObserver(this);
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("enter_from", str);
        bundle.putString("enter_method", str2);
    }
}
