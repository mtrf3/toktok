package com.bytedance.android.widget;

import X.C31809Ce5;
import X.InterfaceC31781Cdd;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class Widget implements GenericLifecycleObserver, LifecycleOwner {
    public Object[] args;
    public boolean async;
    public int containerId;
    public ViewGroup containerView;
    public View contentView;
    public Context context;
    public boolean hasAttached;
    public boolean isDestroyed;
    public boolean isViewValid;
    public LifecycleObserverDelegate lifecycleObserver;
    public InterfaceC31781Cdd widgetCallback;
    public C31809Ce5 widgetContainer;
    public List mRegisterEvents = new ArrayList(8);
    public LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);
    public int id = -1;

    public int getLayoutId() {
        return 0;
    }

    public int getThemeOverlay(Context context) {
        return 0;
    }

    public void onCreate() {
    }

    public <T> void onCustomInfoCallBack(T t) {
    }

    public void onDestroy() {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            performCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            performStart();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            performResume();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            performPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            performStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            performDestroy();
        }
    }

    public void onStop() {
    }

    public boolean shouldAttach() {
        return true;
    }

    private void notifyOnHide() {
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onHide(this);
        }
    }

    private void notifyOnShow() {
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onShow(this);
        }
    }

    public LifecycleObserverDelegate getLifecycleObserverDelegate() {
        if (this.lifecycleObserver == null) {
            this.lifecycleObserver = new LifecycleObserverDelegate();
        }
        return this.lifecycleObserver;
    }

    public View getView() {
        View view = this.contentView;
        if (view != null) {
            return view;
        }
        C31809Ce5 c31809Ce5 = this.widgetContainer;
        if (c31809Ce5 != null) {
            return c31809Ce5;
        }
        return this.containerView;
    }

    public void onDetachWidget() {
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.unloadWidget(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void performDestroy() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.isDestroyed = true;
        this.isViewValid = false;
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onPreDestroy(this);
        }
        onDestroy();
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onPostDestroy(this);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void performPause() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        onPause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void performResume() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        onResume();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void performStart() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
        onStart();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void performStop() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        onStop();
    }

    private boolean isGone() {
        View view = getView();
        if (view == null || view.getVisibility() != 8) {
            return false;
        }
        return true;
    }

    public void attach() {
        InterfaceC31781Cdd interfaceC31781Cdd;
        if (shouldAttach() && (interfaceC31781Cdd = this.widgetCallback) != null && !this.hasAttached) {
            int i = this.containerId;
            if (i == -1) {
                interfaceC31781Cdd.loadWidget(this);
            } else {
                interfaceC31781Cdd.loadWidget(i, this, this.async);
            }
            this.hasAttached = true;
        }
    }

    public int getViewId() {
        View view = getView();
        if (view != null) {
            return view.getId();
        }
        return -1;
    }

    public void hide() {
        View view = getView();
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
            notifyOnHide();
        }
    }

    public boolean isShowing() {
        View view = getView();
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void performCreate() {
        if (LiveWidgetProvider.getInstance().isDestoryReInit) {
            if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView && this.isDestroyed) {
                this.lifecycleRegistry = new LifecycleRegistry(this);
            }
        } else if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
            this.lifecycleRegistry = new LifecycleRegistry(this);
        }
        this.isViewValid = true;
        this.isDestroyed = false;
        this.hasAttached = true;
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onPreCreate(this);
        }
        onCreate();
        if (interfaceC31781Cdd != null) {
            interfaceC31781Cdd.onPostCreate(this);
        }
    }

    public void show() {
        View view = getView();
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
            notifyOnShow();
        }
    }

    public int getId() {
        return this.id;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public boolean isViewValid() {
        return this.isViewValid;
    }

    /* loaded from: classes6.dex */
    public class LifecycleObserverDelegate implements GenericLifecycleObserver, DefaultLifecycleObserver {
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        public LifecycleObserverDelegate() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onCreate(LifecycleOwner lifecycleOwner) {
            Widget.this.performCreate();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            Widget.this.performDestroy();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onPause(LifecycleOwner lifecycleOwner) {
            Widget.this.performPause();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onResume(LifecycleOwner lifecycleOwner) {
            Widget.this.performResume();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onStart(LifecycleOwner lifecycleOwner) {
            Widget.this.performStart();
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
        public final void onStop(LifecycleOwner lifecycleOwner) {
            Widget.this.performStop();
        }
    }

    public <T> boolean hasRegister(Class<T> cls) {
        return this.mRegisterEvents.contains(cls);
    }

    public <T> void register(T t) {
        this.mRegisterEvents.add(t);
    }

    public void setContentView(View view) {
        this.contentView = view;
        if (view != null) {
            if (isGone()) {
                notifyOnHide();
            } else {
                notifyOnShow();
            }
        }
    }

    public void setWidgetCallback(InterfaceC31781Cdd interfaceC31781Cdd) {
        this.widgetCallback = interfaceC31781Cdd;
    }

    public void saveSnapShot(int i, boolean z) {
        this.containerId = i;
        this.async = z;
    }
}
