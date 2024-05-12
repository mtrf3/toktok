package com.ss.android.ugc.aweme.services;

import X.R47;
import X.RCK;
import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes12.dex */
public abstract class BasePasswordService implements GenericLifecycleObserver, RCK {
    public Set<Integer> actionSet = new HashSet(Arrays.asList(8, 13, 17));
    public boolean mKeepCallback;
    public LifecycleOwner mLifeOwner;
    public R47 mResult;

    public RCK keepCallback() {
        this.mKeepCallback = true;
        return this;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.RCK
    public void setPasswordForMT(Activity activity, String str, String str2, String str3, Bundle bundle, R47 r47) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LifecycleOwner lifecycleOwner = this.mLifeOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
        }
        this.mResult = null;
        this.mLifeOwner = null;
    }

    public void returnResult(int i, int i2, Object obj) {
        R47 r47;
        if (this.actionSet.contains(Integer.valueOf(i)) && (r47 = this.mResult) != null) {
            r47.onResult(i, i2, obj);
            this.mResult = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RCK
    public void setPassword(Activity activity, Bundle bundle, R47 r47) {
        this.mResult = r47;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RCK
    public void verifyPassword(Activity activity, String str, Bundle bundle, R47 r47) {
        this.mResult = r47;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.RCK
    public void changePassword(Activity activity, String str, String str2, Bundle bundle, R47 r47) {
        this.mResult = r47;
        if (!this.mKeepCallback && (activity instanceof LifecycleOwner)) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) activity;
            this.mLifeOwner = lifecycleOwner;
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        this.mKeepCallback = false;
    }
}
