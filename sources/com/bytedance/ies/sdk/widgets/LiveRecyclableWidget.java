package com.bytedance.ies.sdk.widgets;

import X.C31729Ccn;
import X.C31780Cdc;
import X.C31809Ce5;
import X.InterfaceC31781Cdd;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class LiveRecyclableWidget extends LiveWidget implements IRecyclableWidget {
    public boolean initialized;
    public RecyclableWidgetCallback recyclableWidgetCallback;
    public boolean shouldLoadSubWidget;

    /* loaded from: classes6.dex */
    public interface RecyclableWidgetCallback extends InterfaceC31781Cdd {
        @Override // X.InterfaceC31781Cdd
        /* synthetic */ Fragment getFragment();

        List<RecyclableWidgetEventListener> getRecyclableWidgetEventListeners();

        @Override // X.InterfaceC31781Cdd
        /* synthetic */ LifecycleOwner getRootLifeCycleOwner();

        List<SubWidgetManagerListener> getSubWidgetManagerListeners();

        <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z);

        void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC31781Cdd
        /* synthetic */ void loadWidget(int i, com.bytedance.android.widget.Widget widget, boolean z);

        @Override // X.InterfaceC31781Cdd
        /* synthetic */ void loadWidget(com.bytedance.android.widget.Widget widget);

        void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget);

        void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void onHide(com.bytedance.android.widget.Widget widget);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void onPostCreate(com.bytedance.android.widget.Widget widget);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void onPostDestroy(com.bytedance.android.widget.Widget widget);

        void onPostInit(LiveRecyclableWidget liveRecyclableWidget);

        void onPostLoad(LiveRecyclableWidget liveRecyclableWidget);

        void onPostUnload(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void onPreCreate(com.bytedance.android.widget.Widget widget);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void onPreDestroy(com.bytedance.android.widget.Widget widget);

        void onPreInit(LiveRecyclableWidget liveRecyclableWidget);

        void onPreLoad(LiveRecyclableWidget liveRecyclableWidget);

        void onPreUnload(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void onShow(com.bytedance.android.widget.Widget widget);

        void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget);

        void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget);

        @Override // X.InterfaceC31781Cdd
        /* bridge */ /* synthetic */ void removeAllMessages(Object obj);

        @Override // X.InterfaceC31781Cdd
        /* synthetic */ void unloadWidget(com.bytedance.android.widget.Widget widget);
    }

    /* loaded from: classes6.dex */
    public static class RecyclableWidgetCallbackWrapper extends C31780Cdc implements RecyclableWidgetCallback {
        public final RecyclableWidgetCallback callback;

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public List<RecyclableWidgetEventListener> getRecyclableWidgetEventListeners() {
            return this.callback.getRecyclableWidgetEventListeners();
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public List<SubWidgetManagerListener> getSubWidgetManagerListeners() {
            return this.callback.getSubWidgetManagerListeners();
        }

        public RecyclableWidgetCallbackWrapper(RecyclableWidgetCallback recyclableWidgetCallback) {
            super(recyclableWidgetCallback);
            this.callback = recyclableWidgetCallback;
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.loadRecyclableWidget(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.loadSubWidget(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPostInit(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPostInit(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPostLoad(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPostLoad(liveRecyclableWidget);
        }

        public void onPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPostUnload(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPreInit(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPreInit(liveRecyclableWidget);
        }

        public void onPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPreLoad(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onPreUnload(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.onPreUnload(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.callback.recycleRecyclableWidget(liveRecyclableWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
            this.callback.onDestroySubWidgetManager(recyclableWidgetManager, liveWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
            this.callback.onSubWidgetManagerCreated(recyclableWidgetManager, liveWidget);
        }

        @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
        public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
            return (T) this.callback.load(i, cls, z);
        }

        public void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view) {
            this.callback.onDetachContentView(liveRecyclableWidget, viewGroup, view);
        }
    }

    public void initConstructor(Object... objArr) {
    }

    public boolean needRecycle() {
        return true;
    }

    public abstract void onInit(Object[] objArr);

    public abstract void onLoad(Object[] objArr);

    public void onPostUnload() {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void onUnload();

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void resetInternal() {
        this.hasAttached = false;
        this.isDestroyed = true;
        this.isViewValid = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        RecyclableWidgetCallback recyclableWidgetCallback = this.recyclableWidgetCallback;
        if (recyclableWidgetCallback != null) {
            recyclableWidgetCallback.onDetachContentView(this, this.containerView, this.contentView);
        }
        try {
            RecyclableWidgetCallback recyclableWidgetCallback2 = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback2 != null) {
                recyclableWidgetCallback2.onPreUnload(this);
            }
            onUnload();
            onPostUnload();
            RecyclableWidgetCallback recyclableWidgetCallback3 = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback3 != null) {
                recyclableWidgetCallback3.onPostUnload(this);
            }
        } catch (Exception e) {
            if (C31729Ccn.LIZIZ(this.context)) {
                throw e;
            }
        }
        if (this.recyclableWidgetCallback != null && needRecycle() && LiveWidgetProvider.getInstance().isValid) {
            this.recyclableWidgetCallback.recycleRecyclableWidget(this);
        }
        super.onDestroy();
        this.containerView = null;
        this.recyclableWidgetCallback = null;
        this.dataChannel = null;
        setWidgetCallback(null);
        this.args = null;
        this.context = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public void attach() {
        RecyclableWidgetCallback recyclableWidgetCallback;
        if (shouldAttach() && this.widgetCallback != null && !this.hasAttached && (recyclableWidgetCallback = this.recyclableWidgetCallback) != null) {
            if (this.shouldLoadSubWidget) {
                recyclableWidgetCallback.loadSubWidget(this);
            }
            if (this.widgetContainer != null) {
                this.recyclableWidgetCallback.loadRecyclableWidget(this);
            }
            if (this.containerView != null) {
                this.recyclableWidgetCallback.loadRecyclableWidget(this);
            }
            this.hasAttached = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        InterfaceC31781Cdd interfaceC31781Cdd = this.widgetCallback;
        if (interfaceC31781Cdd instanceof RecyclableWidgetCallback) {
            this.recyclableWidgetCallback = (RecyclableWidgetCallback) interfaceC31781Cdd;
        }
        if (!this.initialized) {
            RecyclableWidgetCallback recyclableWidgetCallback = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback != null) {
                recyclableWidgetCallback.onPreInit(this);
            }
            onInit(this.args);
            RecyclableWidgetCallback recyclableWidgetCallback2 = this.recyclableWidgetCallback;
            if (recyclableWidgetCallback2 != null) {
                recyclableWidgetCallback2.onPostInit(this);
            }
            this.initialized = true;
        }
        RecyclableWidgetCallback recyclableWidgetCallback3 = this.recyclableWidgetCallback;
        if (recyclableWidgetCallback3 != null) {
            recyclableWidgetCallback3.onPreLoad(this);
        }
        onLoad(this.args);
        RecyclableWidgetCallback recyclableWidgetCallback4 = this.recyclableWidgetCallback;
        if (recyclableWidgetCallback4 != null) {
            recyclableWidgetCallback4.onPostLoad(this);
        }
    }

    public void resetAnim() {
        if (getView() != null) {
            getView().setAlpha(1.0f);
            show();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final boolean isInitialized() {
        return this.initialized;
    }

    public void saveSnapShot(boolean z) {
        this.shouldLoadSubWidget = z;
    }

    public void saveSnapShot(C31809Ce5 c31809Ce5, boolean z) {
        this.widgetContainer = c31809Ce5;
        this.async = z;
    }

    public void saveSnapShot(ViewGroup viewGroup, boolean z) {
        this.containerView = viewGroup;
        this.async = z;
    }
}
