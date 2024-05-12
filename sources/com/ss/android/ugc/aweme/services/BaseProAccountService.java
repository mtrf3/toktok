package com.ss.android.ugc.aweme.services;

import X.R47;
import X.R48;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes12.dex */
public class BaseProAccountService implements GenericLifecycleObserver, R48 {
    public LifecycleOwner mLifeOwner;
    public R47 mResult;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public void switchBusinessAccount(String str, R47 r47) {
    }

    @Override // X.R48
    public void switchProAccount(int i, String str, String str2, int i2, R47 r47) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LifecycleOwner lifecycleOwner = this.mLifeOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mLifeOwner = null;
        this.mResult = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        R47 r47 = this.mResult;
        if (r47 != null) {
            r47.onResult(i, i2, obj);
        }
    }
}
