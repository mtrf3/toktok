package com.ss.android.ugc.aweme.arch.widgets.base;

import X.C220998lr;
import X.C78598Ut0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* loaded from: classes4.dex */
public abstract class Widget implements GenericLifecycleObserver, ViewModelStoreOwner {
    public Context LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public DataCenter LJLJJI;
    public C220998lr LJLJJL;
    public boolean LJLJJLL;
    public ViewModelStore LJLJL;

    public int LJIIJ() {
        return 0;
    }

    public void LJIIJJI(int i, int i2, Intent intent) {
    }

    public void LJIIL(View view) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.LJLJJLL = true;
        LJIIL(this.LJLJI);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.LJLJJLL = false;
        ViewModelStore viewModelStore = this.LJLJL;
        if (viewModelStore != null) {
            viewModelStore.clear();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    public final Activity LJIIIZ() {
        return this.LJLJJL.LIZ.mo49getActivity();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        if (this.LJLJL == null) {
            this.LJLJL = new ViewModelStore();
        }
        return this.LJLJL;
    }

    public final void LJIILIIL(Intent intent, int i) {
        WidgetManager widgetManager = this.LJLJJL.LIZ;
        C78598Ut0.LJIJJ(intent, widgetManager);
        widgetManager.startActivityForResult(intent, i);
    }
}
