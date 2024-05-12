package com.bytedance.ies.sdk.widgets;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C31729Ccn;
import X.C31785Cdh;
import X.C31788Cdk;
import X.C31809Ce5;
import X.C51029K0z;
import X.InterfaceC31787Cdj;
import X.InterfaceC65784Pro;
import X.InterfaceC81248Vue;
import X.RunnableC31793Cdp;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class RecyclableWidgetManager extends com.bytedance.android.widget.WidgetManager {
    public boolean isSubWidgetManager;
    public LoadInterceptor loadInterceptor;
    public List<RecyclableWidgetEventListener> mRecyclableWidgetEventListeners;
    public List<SubWidgetManagerListener> mSubWidgetManagerListeners;

    /* loaded from: classes6.dex */
    public interface LoadInterceptor {
        boolean intercept(int i, Class<? extends com.bytedance.android.widget.Widget> cls);
    }

    @Override // com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void onDestroy() {
        super.onDestroy();
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            list.clear();
            this.mRecyclableWidgetEventListeners = null;
        }
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public List<? extends InterfaceC31787Cdj> getWidgetEventListeners() {
        return this.mRecyclableWidgetEventListeners;
    }

    public Set<com.bytedance.android.widget.Widget> getWidgetList() {
        return this.widgets;
    }

    public RecyclableWidgetManager(IWidgetProvider iWidgetProvider) {
        super(iWidgetProvider);
        this.widgetCallback = new LiveRecyclableWidget.RecyclableWidgetCallback() { // from class: com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.1
            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public final /* synthetic */ void onDetachContentView(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view) {
                C31788Cdk.LJFF(this, liveRecyclableWidget, viewGroup, view);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public Fragment getFragment() {
                return RecyclableWidgetManager.this.parentFragment;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public List<RecyclableWidgetEventListener> getRecyclableWidgetEventListeners() {
                return RecyclableWidgetManager.this.mRecyclableWidgetEventListeners;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public LifecycleOwner getRootLifeCycleOwner() {
                RecyclableWidgetManager recyclableWidgetManager = RecyclableWidgetManager.this;
                LifecycleOwner lifecycleOwner = recyclableWidgetManager.rootLifeCycleOwner;
                if (lifecycleOwner == null) {
                    return recyclableWidgetManager.parentFragment;
                }
                return lifecycleOwner;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public List<SubWidgetManagerListener> getSubWidgetManagerListeners() {
                return RecyclableWidgetManager.this.mSubWidgetManagerListeners;
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void loadRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                C31809Ce5 c31809Ce5 = liveRecyclableWidget.widgetContainer;
                if (c31809Ce5 != null) {
                    RecyclableWidgetManager.this.generateNewWidget(c31809Ce5, liveRecyclableWidget.async, liveRecyclableWidget);
                }
                ViewGroup viewGroup = liveRecyclableWidget.containerView;
                if (viewGroup != null) {
                    RecyclableWidgetManager.this.generateOldWidget(viewGroup, liveRecyclableWidget.async, liveRecyclableWidget);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void loadSubWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.continueLoadSubWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void loadWidget(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.load(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void onHide(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyHide(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void onPostCreate(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPostCreate(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void onPostDestroy(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPostDestroy(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPostInit(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPostInit(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPostLoad(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPostLoad(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPostUnload(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void onPreCreate(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPreCreate(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void onPreDestroy(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyOnPreDestroy(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPreInit(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPreInit(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPreLoad(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onPreUnload(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.notifyOnPreUnload(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void onShow(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.notifyShow(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void recycleRecyclableWidget(LiveRecyclableWidget liveRecyclableWidget) {
                RecyclableWidgetManager.this.mWidgetProvider.recycleRecyclableWidget(liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void removeAllMessages(Object obj) {
                FluencyOpt fluencyOpt = RecyclableWidgetManager.this.mFluencyOpt;
                if (fluencyOpt != null) {
                    fluencyOpt.removeMessages(obj);
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void unloadWidget(com.bytedance.android.widget.Widget widget) {
                RecyclableWidgetManager.this.unload(widget);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onDestroySubWidgetManager(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
                C31788Cdk.LJ(this, recyclableWidgetManager, liveWidget);
                List<SubWidgetManagerListener> list = RecyclableWidgetManager.this.mSubWidgetManagerListeners;
                if (list != null) {
                    Iterator<SubWidgetManagerListener> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().onDestroySubWidgetManager(RecyclableWidgetManager.this, recyclableWidgetManager, liveWidget);
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public void onSubWidgetManagerCreated(RecyclableWidgetManager recyclableWidgetManager, LiveWidget liveWidget) {
                C31788Cdk.LJIJ(this, recyclableWidgetManager, liveWidget);
                List<SubWidgetManagerListener> list = RecyclableWidgetManager.this.mSubWidgetManagerListeners;
                if (list != null) {
                    Iterator<SubWidgetManagerListener> it = list.iterator();
                    while (it.hasNext()) {
                        it.next().onSubWidgetManagerCreated(RecyclableWidgetManager.this, recyclableWidgetManager, liveWidget);
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback
            public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
                return (T) RecyclableWidgetManager.this.load(i, cls, z);
            }

            @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget.RecyclableWidgetCallback, X.InterfaceC31781Cdd
            public void loadWidget(int i, com.bytedance.android.widget.Widget widget, boolean z) {
                RecyclableWidgetManager.this.load(i, widget, z);
            }
        };
    }

    public static void detachFromParent(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        try {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        } catch (Exception unused) {
        }
    }

    public void addRecyclableWidgetEventListener(RecyclableWidgetEventListener recyclableWidgetEventListener) {
        if (recyclableWidgetEventListener != null) {
            if (this.mRecyclableWidgetEventListeners == null) {
                this.mRecyclableWidgetEventListeners = new ArrayList();
            }
            this.mRecyclableWidgetEventListeners.add(recyclableWidgetEventListener);
        }
    }

    public void addSubWidgetManagerListener(SubWidgetManagerListener subWidgetManagerListener) {
        if (subWidgetManagerListener != null) {
            if (this.mSubWidgetManagerListeners == null) {
                this.mSubWidgetManagerListeners = new ArrayList();
            }
            this.mSubWidgetManagerListeners.add(subWidgetManagerListener);
        }
    }

    public <T extends LiveRecyclableWidget> void continueLoadSubWidget(T t) {
        if (t.isInitialized()) {
            notifyWidgetRequestLoading(t, false);
            continueLoadNew(t, null, t.contentView);
        }
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls) {
        T t = (T) initWidget(-1, cls, null);
        boolean contains = this.widgets.contains(t);
        this.widgets.add(t);
        addWidget2Observer(t);
        if (!contains) {
            onCustomInfoCallBack(t);
        }
        return t;
    }

    public void notifyOnPostInit(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPostInit(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPostLoad(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPostLoad(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPostUnload(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPostUnload(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPreInit(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPreInit(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPreLoad(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPreLoad(this, liveRecyclableWidget);
            }
        }
    }

    public void notifyOnPreUnload(LiveRecyclableWidget liveRecyclableWidget) {
        List<RecyclableWidgetEventListener> list = this.mRecyclableWidgetEventListeners;
        if (list != null) {
            Iterator<RecyclableWidgetEventListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPreUnload(this, liveRecyclableWidget);
            }
        }
    }

    public void removeRecyclableWidgetEventListener(RecyclableWidgetEventListener recyclableWidgetEventListener) {
        List<RecyclableWidgetEventListener> list;
        if (recyclableWidgetEventListener != null && (list = this.mRecyclableWidgetEventListeners) != null) {
            list.remove(recyclableWidgetEventListener);
        }
    }

    public void setLoadInterceptor(LoadInterceptor loadInterceptor) {
        this.loadInterceptor = loadInterceptor;
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager load(com.bytedance.android.widget.Widget widget) {
        super.load(widget);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$0(LiveRecyclableWidget liveRecyclableWidget, C31809Ce5 c31809Ce5) {
        continueLoadNew(liveRecyclableWidget, c31809Ce5, liveRecyclableWidget.contentView);
    }

    public <T extends LiveRecyclableWidget> T createWidget(View view, T t) {
        initWidget(view.getId(), t);
        generateContentWidget(view, t);
        return t;
    }

    public <T extends LiveRecyclableWidget> T generateContentWidget(View view, T t) {
        t.containerView = null;
        if (this.parentFragment == null) {
            return t;
        }
        t.widgetContainer = null;
        resetContext(t, this.context);
        t.setContentView(view);
        boolean contains = this.widgets.contains(t);
        this.widgets.add(t);
        addWidget2Observer(t);
        if (!contains) {
            onCustomInfoCallBack(t);
        }
        return t;
    }

    public <T extends LiveRecyclableWidget> T initWidget(int i, T t) {
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.id = i;
        return t;
    }

    public <T extends LiveRecyclableWidget> T load(Class<T> cls, Object[] objArr) {
        T t = (T) initWidget(-1, cls, objArr);
        boolean contains = this.widgets.contains(t);
        this.widgets.add(t);
        addWidget2Observer(t);
        if (!contains) {
            onCustomInfoCallBack(t);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager load(int i, com.bytedance.android.widget.Widget widget) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        if (loadInterceptor != 0 && widget != null && loadInterceptor.intercept(i, widget.getClass())) {
            return null;
        }
        return super.load(i, widget);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls) {
        return (T) load(i, (Class) cls, true);
    }

    public <T extends LiveRecyclableWidget> T load(View view, Class<T> cls) {
        return (T) load(view, (Class) cls, true);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadNew(com.bytedance.android.widget.Widget widget, C31809Ce5 c31809Ce5, View view) {
        if (this.parentFragment == null || widget.context == null) {
            return;
        }
        if (view != null && (c31809Ce5 != null || !this.isSubWidgetManager)) {
            detachFromParent(view);
        }
        super.continueLoadNew(widget, c31809Ce5, view);
    }

    @Override // com.bytedance.android.widget.WidgetManager
    public void continueLoadOld(com.bytedance.android.widget.Widget widget, ViewGroup viewGroup, View view) {
        if (this.parentFragment == null || widget.containerView == null) {
            return;
        }
        if (view != null) {
            detachFromParent(view);
        }
        super.continueLoadOld(widget, viewGroup, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends LiveRecyclableWidget> T generateNewWidget(final C31809Ce5 c31809Ce5, boolean z, final T t) {
        View LLLLIILL;
        View preloadLayout;
        if (!t.shouldAttach()) {
            t.saveSnapShot(c31809Ce5, z);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        notifyWidgetRequestLoading(t, z);
        t.widgetContainer = c31809Ce5;
        int i = 0;
        if (t.isInitialized()) {
            try {
                if (z) {
                    FluencyOpt fluencyOpt = this.mFluencyOpt;
                    if (fluencyOpt != null) {
                        fluencyOpt.post(new RunnableC31793Cdp(i, this, t, c31809Ce5), t.dataChannel);
                    }
                } else {
                    continueLoadNew(t, c31809Ce5, t.contentView);
                }
                return t;
            } catch (Exception e) {
                throw new RuntimeException(this.context.getResources().getClass().getName(), e);
            }
        }
        if (t.getLayoutId() == 0) {
            continueLoadNew(t, c31809Ce5, null);
            return t;
        }
        if (z) {
            notifyOnPreCreateView(t);
            if (LiveWidgetProvider.getInstance().isEnablePriorityPreload) {
                View view = t.contentView;
                FluencyOpt fluencyOpt2 = this.mFluencyOpt;
                if (fluencyOpt2 != null) {
                    if (view == null) {
                        view = fluencyOpt2.getPreloadLayout(t.getLayoutId());
                    }
                    notifyOnPostCreateView(t);
                    continueLoadNew(t, c31809Ce5, view);
                    return t;
                }
                if (view == null) {
                    getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()).LIZIZ(t.getLayoutId(), (ViewGroup) c31809Ce5.getParent(), t.getThemeOverlay(this.context), new InterfaceC81248Vue() { // from class: X.Cdm
                        @Override // X.InterfaceC81248Vue
                        public final /* synthetic */ boolean callBackInMainThread() {
                            return true;
                        }

                        @Override // X.InterfaceC81248Vue
                        public final void onInflateFinished(View view2, int i2, ViewGroup viewGroup) {
                            RecyclableWidgetManager.this.lambda$generateNewWidget$1(t, c31809Ce5, view2, i2, viewGroup);
                        }
                    });
                    return t;
                }
                notifyOnPostCreateView(t);
                continueLoadNew(t, c31809Ce5, view);
                return t;
            }
            FluencyOpt fluencyOpt3 = this.mFluencyOpt;
            if (fluencyOpt3 != null && (preloadLayout = fluencyOpt3.getPreloadLayout(t.getLayoutId())) != null) {
                notifyOnPostCreateView(t);
                continueLoadNew(t, c31809Ce5, preloadLayout);
            } else {
                getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()).LIZIZ(t.getLayoutId(), (ViewGroup) c31809Ce5.getParent(), t.getThemeOverlay(this.context), new InterfaceC81248Vue() { // from class: X.Cdn
                    @Override // X.InterfaceC81248Vue
                    public final /* synthetic */ boolean callBackInMainThread() {
                        return true;
                    }

                    @Override // X.InterfaceC81248Vue
                    public final void onInflateFinished(View view2, int i2, ViewGroup viewGroup) {
                        RecyclableWidgetManager.this.lambda$generateNewWidget$2(t, c31809Ce5, view2, i2, viewGroup);
                    }
                });
            }
            return t;
        }
        notifyOnPreCreateView(t);
        if (LiveWidgetProvider.getInstance().isEnablePriorityPreload) {
            View view2 = t.contentView;
            FluencyOpt fluencyOpt4 = this.mFluencyOpt;
            if (fluencyOpt4 != null) {
                if (view2 == null) {
                    view2 = fluencyOpt4.getPreloadLayout(t.getLayoutId());
                }
                notifyOnPostCreateView(t);
                continueLoadNew(t, c31809Ce5, view2);
                return t;
            }
            if (view2 == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view2 = C16880lQ.LLLLIILL(getThemeOverlayLayoutInflater(getLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()), t.getThemeOverlay(this.context)), t.getLayoutId(), (ViewGroup) c31809Ce5.getParent(), false);
                if (view2 != null) {
                    view2.setTag(R.id.g0a, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
            notifyOnPostCreateView(t);
            continueLoadNew(t, c31809Ce5, view2);
            return t;
        }
        FluencyOpt fluencyOpt5 = this.mFluencyOpt;
        if (fluencyOpt5 == null || (LLLLIILL = fluencyOpt5.getPreloadLayout(t.getLayoutId())) == null) {
            long uptimeMillis2 = SystemClock.uptimeMillis();
            LLLLIILL = C16880lQ.LLLLIILL(getThemeOverlayLayoutInflater(getLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()), t.getThemeOverlay(this.context)), t.getLayoutId(), (ViewGroup) c31809Ce5.getParent(), false);
            if (LLLLIILL != null) {
                LLLLIILL.setTag(R.id.g0a, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
            }
        }
        notifyOnPostCreateView(t);
        continueLoadNew(t, c31809Ce5, LLLLIILL);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends LiveRecyclableWidget> T generateOldWidget(final ViewGroup viewGroup, boolean z, final T t) {
        notifyWidgetRequestLoading(t, z);
        t.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(t, viewGroup);
        if (t.isInitialized()) {
            try {
                continueLoadOld(t, viewGroup, t.contentView);
                return t;
            } catch (Exception e) {
                throw new RuntimeException(this.context.getResources().getClass().getName(), e);
            }
        }
        View view = null;
        if (t.getLayoutId() == 0) {
            continueLoadOld(t, viewGroup, null);
            return t;
        }
        if (z) {
            notifyOnPreCreateView(t);
            if (LiveWidgetProvider.getInstance().isEnablePriorityPreload) {
                view = t.contentView;
            }
            if (this.mFluencyOpt != null) {
                if (view == null || !LiveWidgetProvider.getInstance().isEnablePriorityPreload) {
                    view = this.mFluencyOpt.getPreloadLayout(t.getLayoutId());
                }
                notifyOnPostCreateView(t);
                continueLoadOld(t, viewGroup, view);
                return t;
            }
            if (view == null) {
                getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()).LIZIZ(t.getLayoutId(), viewGroup, t.getThemeOverlay(this.context), new InterfaceC81248Vue() { // from class: X.Cdq
                    @Override // X.InterfaceC81248Vue
                    public final /* synthetic */ boolean callBackInMainThread() {
                        return true;
                    }

                    @Override // X.InterfaceC81248Vue
                    public final void onInflateFinished(View view2, int i, ViewGroup viewGroup2) {
                        RecyclableWidgetManager.this.lambda$generateOldWidget$3(t, viewGroup, view2, i, viewGroup2);
                    }
                });
                return t;
            }
            notifyOnPostCreateView(t);
            continueLoadOld(t, viewGroup, view);
            return t;
        }
        notifyOnPreCreateView(t);
        if (LiveWidgetProvider.getInstance().isEnablePriorityPreload) {
            view = t.contentView;
        }
        if (this.mFluencyOpt != null) {
            if (view == null || !LiveWidgetProvider.getInstance().isEnablePriorityPreload) {
                view = this.mFluencyOpt.getPreloadLayout(t.getLayoutId());
            }
            notifyOnPostCreateView(t);
            continueLoadOld(t, viewGroup, view);
            return t;
        }
        if (view == null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            view = C16880lQ.LLLLIILL(getThemeOverlayLayoutInflater(getLayoutInflater((Class<? extends LiveRecyclableWidget>) t.getClass()), t.getThemeOverlay(this.context)), t.getLayoutId(), viewGroup, false);
            if (view != null) {
                view.setTag(R.id.g0a, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            }
        }
        notifyOnPostCreateView(t);
        continueLoadOld(t, viewGroup, view);
        return t;
    }

    public <T extends LiveRecyclableWidget> T getRecyclableWidgetFromCacheOrNew(Class<? extends LiveRecyclableWidget> cls, Object[] objArr, InterfaceC65784Pro<? extends LiveRecyclableWidget> interfaceC65784Pro) {
        T t;
        IWidgetProvider iWidgetProvider = this.mWidgetProvider;
        if (iWidgetProvider != null) {
            t = (T) iWidgetProvider.provideWithOutReflect(cls);
            if (t != null) {
                if (objArr != null && objArr.length > 0) {
                    t.initConstructor(objArr);
                    return t;
                }
                return t;
            }
        } else {
            t = null;
        }
        if (interfaceC65784Pro == null) {
            return t;
        }
        return (T) interfaceC65784Pro.invoke();
    }

    public <T extends LiveRecyclableWidget> T initWidget(int i, Class<T> cls, Object[] objArr) {
        T t = (T) this.mWidgetProvider.provide(cls);
        t.args = objArr;
        t.setWidgetCallback(this.widgetCallback);
        t.context = this.context;
        t.id = i;
        t.dataChannel = C51029K0z.LJIILIIL(this.parentFragment);
        resetContext(t, this.context);
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.widget.WidgetManager
    public com.bytedance.android.widget.WidgetManager load(int i, com.bytedance.android.widget.Widget widget, boolean z) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        if (loadInterceptor != 0 && widget != null && loadInterceptor.intercept(i, widget.getClass())) {
            return null;
        }
        return super.load(i, widget, z);
    }

    public <T extends LiveRecyclableWidget> T loadSubWidget(int i, Class<T> cls, Object[] objArr) {
        T t = (T) initWidget(i, cls, objArr);
        if (!t.shouldAttach()) {
            t.saveSnapShot(true);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        continueLoadSubWidget(t);
        return t;
    }

    private <T extends LiveRecyclableWidget> T load(View view, Class<T> cls, boolean z) {
        return (T) load(view.getId(), view, cls, z, null);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z) {
        return (T) load(i, cls, z, null);
    }

    public static RecyclableWidgetManager of(ActivityC45651qj activityC45651qj, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        recyclableWidgetManager.config(false, activityC45651qj, null, view, activityC45651qj, fluencyOpt);
        return recyclableWidgetManager;
    }

    public com.bytedance.android.widget.WidgetManager doLoad(int i, LiveRecyclableWidget liveRecyclableWidget, boolean z, Object[] objArr) {
        liveRecyclableWidget.args = objArr;
        if (objArr != null && objArr.length > 0) {
            liveRecyclableWidget.initConstructor(objArr);
        }
        return super.load(i, liveRecyclableWidget, z);
    }

    public <T extends LiveRecyclableWidget> T load(int i, Class<T> cls, boolean z, Object[] objArr) {
        return (T) load(i, onProvideContainer(i), cls, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T loadNew(C31809Ce5 c31809Ce5, Class<T> cls, boolean z, Object[] objArr) {
        T t = (T) initWidget(c31809Ce5.getId(), cls, objArr);
        generateNewWidget(c31809Ce5, z, t);
        return t;
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        recyclableWidgetManager.config(false, null, fragment, view, fragment.getContext(), fluencyOpt);
        return recyclableWidgetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$1(LiveRecyclableWidget liveRecyclableWidget, C31809Ce5 c31809Ce5, View view, int i, ViewGroup viewGroup) {
        notifyOnPostCreateView(liveRecyclableWidget);
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            continueLoadNew(liveRecyclableWidget, c31809Ce5, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateNewWidget$2(LiveRecyclableWidget liveRecyclableWidget, C31809Ce5 c31809Ce5, View view, int i, ViewGroup viewGroup) {
        notifyOnPostCreateView(liveRecyclableWidget);
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            continueLoadNew(liveRecyclableWidget, c31809Ce5, view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateOldWidget$3(LiveRecyclableWidget liveRecyclableWidget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        notifyOnPostCreateView(liveRecyclableWidget);
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            continueLoadOld(liveRecyclableWidget, viewGroup, view);
        }
    }

    public static RecyclableWidgetManager of(Fragment fragment, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z) {
        Context context;
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        if (z) {
            context = view.getContext();
        } else {
            context = fragment.getContext();
        }
        recyclableWidgetManager.config(false, null, fragment, view, context, fluencyOpt);
        return recyclableWidgetManager;
    }

    public <T extends LiveRecyclableWidget> T load(int i, View view, Class<T> widgetClass, boolean z, Object[] objArr) {
        LoadInterceptor loadInterceptor = this.loadInterceptor;
        com.bytedance.android.widget.Widget widget = null;
        if ((loadInterceptor != null && loadInterceptor.intercept(i, widgetClass)) || this.parentFragment == null) {
            return null;
        }
        if (view == null && this.isSubWidgetManager) {
            return (T) loadSubWidget(i, widgetClass, objArr);
        }
        if (view instanceof C31809Ce5) {
            return (T) loadNew((C31809Ce5) view, widgetClass, z, objArr);
        }
        boolean z2 = false;
        for (com.bytedance.android.widget.Widget widget2 : this.widgets) {
            if (widget2.getClass() == widgetClass) {
                z2 = true;
                widget = widget2;
            }
        }
        if (view != null && z2) {
            o.LJIIIZ(widgetClass, "widgetClass");
            if (!C31729Ccn.LIZ.contains(C16880lQ.LJLLJ(widgetClass))) {
                unload(widget);
                return (T) load(view.getId(), widgetClass, z, objArr);
            }
        }
        if (checkWidgetContainer() && view != null && C31729Ccn.LIZIZ(this.context)) {
            o.LJIIIZ(widgetClass, "widgetClass");
            if (!C31729Ccn.LIZ.contains(C16880lQ.LJLLJ(widgetClass))) {
                throw new C31785Cdh((Class<? extends com.bytedance.android.widget.Widget>) widgetClass);
            }
        }
        return (T) loadOld(i, (ViewGroup) view, widgetClass, z, objArr);
    }

    public <T extends LiveRecyclableWidget> T loadOld(int i, ViewGroup viewGroup, Class<T> cls, boolean z, Object[] objArr) {
        T t = (T) initWidget(i, cls, objArr);
        if (!t.shouldAttach()) {
            t.saveSnapShot(viewGroup, z);
            addWidgetAndCallCustomBack(t);
            return t;
        }
        generateOldWidget(viewGroup, z, t);
        return t;
    }

    public static RecyclableWidgetManager of(Fragment fragment, LifecycleOwner lifecycleOwner, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt) {
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        recyclableWidgetManager.config(false, null, fragment, view, fragment.requireContext(), fluencyOpt);
        recyclableWidgetManager.rootLifeCycleOwner = lifecycleOwner;
        return recyclableWidgetManager;
    }

    public static RecyclableWidgetManager of(Fragment fragment, LifecycleOwner lifecycleOwner, View view, IWidgetProvider iWidgetProvider, FluencyOpt fluencyOpt, boolean z) {
        Context requireContext;
        RecyclableWidgetManager recyclableWidgetManager = new RecyclableWidgetManager(iWidgetProvider);
        if (z) {
            requireContext = view.getContext();
        } else {
            requireContext = fragment.requireContext();
        }
        recyclableWidgetManager.config(false, null, fragment, view, requireContext, fluencyOpt);
        recyclableWidgetManager.rootLifeCycleOwner = lifecycleOwner;
        return recyclableWidgetManager;
    }
}
