package com.bytedance.ies.sdk.widgets;

import X.C1B3;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* loaded from: classes13.dex */
public abstract class Widget implements GenericLifecycleObserver, LifecycleOwner {
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public DataCenter dataCenter;
    public boolean isDestroyed;
    public boolean isViewValid;
    public LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public WidgetManager subWidgetManager;
    public WidgetCallback widgetCallback;

    /* loaded from: classes13.dex */
    public interface WidgetCallback {
        Fragment getFragment();

        <T extends ViewModel> T getViewModel(Class<T> cls);

        <T extends ViewModel> T getViewModel(Class<T> cls, ViewModelProvider.Factory factory);

        void startActivity(Intent intent);

        void startActivity(Intent intent, Bundle bundle);

        void startActivityForResult(Intent intent, int i);

        void startActivityForResult(Intent intent, int i, Bundle bundle);
    }

    public int getLayoutId() {
        return 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.isViewValid = true;
        this.isDestroyed = false;
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
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

    public void enableSubWidgetManager() {
        if (this.subWidgetManager == null) {
            WidgetManager of = WidgetManager.of(this.widgetCallback.getFragment(), this.contentView);
            this.subWidgetManager = of;
            of.setDataCenter(this.dataCenter);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        if (this.subWidgetManager != null) {
            FragmentManager childFragmentManager = this.widgetCallback.getFragment().getChildFragmentManager();
            childFragmentManager.getClass();
            C1B3 c1b3 = new C1B3(childFragmentManager);
            c1b3.LJJI(this.subWidgetManager);
            c1b3.LJII();
        }
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onStart() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    public <T extends ViewModel> T getViewModel(Class<T> cls) {
        return (T) this.widgetCallback.getViewModel(cls);
    }

    public void setWidgetCallback(WidgetCallback widgetCallback) {
        this.widgetCallback = widgetCallback;
    }

    public void startActivity(Intent intent) {
        this.widgetCallback.startActivity(intent);
    }

    public <T extends ViewModel> T getViewModel(Class<T> cls, ViewModelProvider.Factory factory) {
        return (T) this.widgetCallback.getViewModel(cls, factory);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        this.widgetCallback.startActivity(intent, bundle);
    }

    public void startActivityForResult(Intent intent, int i) {
        this.widgetCallback.startActivityForResult(intent, i);
    }

    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        this.widgetCallback.startActivityForResult(intent, i, bundle);
    }
}
