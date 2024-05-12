package com.bytedance.scene.group;

import X.WH3;
import X.WMH;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes15.dex */
public abstract class UserVisibleHintGroupScene extends WMH {
    public final WH3 mUserVisibleLifecycleOwner = new WH3();
    public boolean mUserVisibleHint = true;
    public boolean mResume = false;
    public boolean mStart = false;
    public final LifecycleObserver mUserVisibleLifecycleObserver = new GenericLifecycleObserver() { // from class: com.bytedance.scene.group.UserVisibleHintGroupScene.1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
                return;
            }
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_START) {
                onStart();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            UserVisibleHintGroupScene.this.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_DESTROY);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public void onPause() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.mResume = false;
            if (userVisibleHintGroupScene.mUserVisibleHint) {
                userVisibleHintGroupScene.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_PAUSE);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public void onResume() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.mResume = true;
            if (userVisibleHintGroupScene.mUserVisibleHint) {
                userVisibleHintGroupScene.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_RESUME);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.mStart = true;
            if (userVisibleHintGroupScene.mUserVisibleHint) {
                userVisibleHintGroupScene.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_START);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.mStart = false;
            if (userVisibleHintGroupScene.mUserVisibleHint) {
                userVisibleHintGroupScene.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_STOP);
            }
        }
    };

    public Lifecycle getUserVisibleHintLifecycle() {
        WH3 wh3 = this.mUserVisibleLifecycleOwner;
        if (wh3.LJLIL == null) {
            wh3.LJLIL = new LifecycleRegistry(wh3);
        }
        return wh3.LJLIL;
    }

    @Override // X.WM7
    public boolean isVisible() {
        if (super.isVisible() && this.mUserVisibleHint) {
            return true;
        }
        return false;
    }

    @Override // X.WM7
    public void onDestroyView() {
        super.onDestroyView();
        getLifecycle().removeObserver(this.mUserVisibleLifecycleObserver);
    }

    @Override // X.WM7
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_CREATE);
        getLifecycle().addObserver(this.mUserVisibleLifecycleObserver);
    }

    @Override // X.WMH, X.WM7
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.mUserVisibleHint = bundle.getBoolean("bd-scene-nav:scene_user_visible_hint");
        }
    }

    @Override // X.WMH, X.WM7
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("bd-scene-nav:scene_user_visible_hint", this.mUserVisibleHint);
    }

    public void setUserVisibleHint(boolean z) {
        if (this.mUserVisibleHint == z) {
            return;
        }
        this.mUserVisibleHint = z;
        dispatchVisibleChanged();
        if (this.mUserVisibleHint) {
            if (this.mStart) {
                this.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_START);
            }
            if (this.mResume) {
                this.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_RESUME);
                return;
            }
            return;
        }
        if (this.mResume) {
            this.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_PAUSE);
        }
        if (!this.mStart) {
            return;
        }
        this.mUserVisibleLifecycleOwner.LIZ(Lifecycle.Event.ON_STOP);
    }

    @Override // X.WMH, X.WM7
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
