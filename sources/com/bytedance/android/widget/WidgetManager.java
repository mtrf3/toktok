package com.bytedance.android.widget;

import X.ActivityC45651qj;
import X.C018905p;
import X.C16310kV;
import X.C16880lQ;
import X.C31729Ccn;
import X.C31785Cdh;
import X.C31786Cdi;
import X.C31797Cdt;
import X.C31809Ce5;
import X.C81126Vsg;
import X.C81246Vuc;
import X.InterfaceC30319Bv9;
import X.InterfaceC31781Cdd;
import X.InterfaceC31787Cdj;
import X.InterfaceC31795Cdr;
import X.InterfaceC31796Cds;
import X.InterfaceC81248Vue;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.widgets.FluencyOpt;
import com.bytedance.ies.sdk.widgets.IWidgetProvider;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidgetNonOpProvider;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes6.dex */
public class WidgetManager implements GenericLifecycleObserver, InterfaceC30319Bv9, LifecycleOwner {
    public static final String TAG = C16880lQ.LJLLILLLL(WidgetManager.class);
    public static boolean enableWidgetLifecycleDispatchOpt = false;
    public static volatile boolean hasSet = false;
    public C81246Vuc asyncLayoutInflater;
    public boolean configured;
    public View contentView;
    public Context context;
    public Map<Object, Long> customCallBackInfoMap;
    public boolean isRTL;
    public LifecycleRegistry lifecycleRegistry;
    public LayoutInflater.Factory2 mFactory;
    public FluencyOpt mFluencyOpt;
    public InterfaceC31795Cdr mWidgetCreateTimeListener;
    public List<InterfaceC31787Cdj> mWidgetEventListeners;
    public final IWidgetProvider mWidgetProvider;
    public Fragment parentFragment;
    public boolean resetParams;
    public LifecycleOwner rootLifeCycleOwner;
    public LayoutInflater syncLayoutInflater;
    public InterfaceC31781Cdd widgetCallback;
    public Map<Widget, ViewGroup> widgetViewGroupHashMap;
    public Set<Widget> widgets;

    public boolean checkWidgetContainer() {
        return true;
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

    private void applyFactory() {
        LayoutInflater.Factory2 factory2;
        C81126Vsg c81126Vsg;
        C81246Vuc c81246Vuc = this.asyncLayoutInflater;
        if (c81246Vuc != null && (factory2 = this.mFactory) != null && (c81126Vsg = c81246Vuc.LIZ) != null && c81126Vsg.getFactory2() == null) {
            c81246Vuc.LIZ.setFactory2(factory2);
        }
    }

    public void detachWidget() {
        Iterator<Widget> it = this.widgets.iterator();
        while (it.hasNext()) {
            it.next().onDetachWidget();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        Fragment fragment = this.parentFragment;
        if (fragment != null) {
            fragment.getLifecycle().removeObserver(this);
        }
        this.parentFragment = null;
        this.widgets.clear();
        this.widgetViewGroupHashMap.clear();
        this.customCallBackInfoMap.clear();
        FluencyOpt fluencyOpt = this.mFluencyOpt;
        if (fluencyOpt != null && fluencyOpt.shouldReleaseAsyncLayoutInflaterTaskQueue()) {
            this.asyncLayoutInflater.LIZLLL(this.context);
        }
        List<InterfaceC31787Cdj> list = this.mWidgetEventListeners;
        if (list != null) {
            list.clear();
            this.mWidgetEventListeners = null;
        }
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

    public WidgetManager() {
        this.widgetCallback = new C31786Cdi(this);
        this.widgets = new CopyOnWriteArraySet();
        this.widgetViewGroupHashMap = new HashMap();
        this.customCallBackInfoMap = new ConcurrentHashMap();
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.mWidgetProvider = LiveWidgetNonOpProvider.getInstance();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.lifecycleRegistry;
    }

    public List<? extends InterfaceC31787Cdj> getWidgetEventListeners() {
        return this.mWidgetEventListeners;
    }

    public WidgetManager(IWidgetProvider iWidgetProvider) {
        this.widgetCallback = new C31786Cdi(this);
        this.widgets = new CopyOnWriteArraySet();
        this.widgetViewGroupHashMap = new HashMap();
        this.customCallBackInfoMap = new ConcurrentHashMap();
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.mWidgetProvider = iWidgetProvider;
    }

    public static void enableWidgetLifecycleDispatchOpt(boolean z) {
        if (!hasSet) {
            hasSet = true;
            enableWidgetLifecycleDispatchOpt = z;
        }
    }

    private MutableContextWrapper findMutableContextWrapper(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof MutableContextWrapper) {
            return (MutableContextWrapper) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        return findMutableContextWrapper(((ContextWrapper) context).getBaseContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C81246Vuc getAsyncLayoutInflater(Widget widget) {
        if (widget instanceof LiveRecyclableWidget) {
            return getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) widget.getClass());
        }
        return this.asyncLayoutInflater;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private LayoutInflater getLayoutInflater(Widget widget) {
        if (widget instanceof LiveRecyclableWidget) {
            return getLayoutInflater((Class<? extends LiveRecyclableWidget>) widget.getClass());
        }
        return this.syncLayoutInflater;
    }

    private boolean isEnableRecycleWrap(Class<? extends LiveRecyclableWidget> cls) {
        if (LiveWidgetProvider.getInstance().isEnablePriorityPreload && this.mWidgetProvider.isEnablePriority() && this.mWidgetProvider.isPriority(cls)) {
            return true;
        }
        return false;
    }

    private void removeWidget2Observer(Widget widget) {
        if (enableWidgetLifecycleDispatchOpt) {
            getLifecycle().removeObserver(widget.getLifecycleObserverDelegate());
        } else {
            getLifecycle().removeObserver(widget);
        }
    }

    public void addWidget2Observer(Widget widget) {
        if (enableWidgetLifecycleDispatchOpt) {
            getLifecycle().addObserver(widget.getLifecycleObserverDelegate());
        } else {
            getLifecycle().addObserver(widget);
        }
    }

    public void addWidgetAndCallCustomBack(Widget widget) {
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
    }

    public void addWidgetEventListener(InterfaceC31787Cdj interfaceC31787Cdj) {
        if (interfaceC31787Cdj != null) {
            if (this.mWidgetEventListeners == null) {
                this.mWidgetEventListeners = new ArrayList();
            }
            this.mWidgetEventListeners.add(interfaceC31787Cdj);
        }
    }

    public WidgetManager load(Widget widget) {
        if (widget == null) {
            return this;
        }
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(-1, false);
            addWidgetAndCallCustomBack(widget);
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        addWidget2Observer(widget);
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
        return this;
    }

    public void notifyHide(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onHide(this, widget);
            }
        }
    }

    public void notifyOnPostCreate(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onPostCreate(this, widget);
            }
        }
    }

    public void notifyOnPostCreateView(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onPostCreateView(this, widget);
            }
        }
    }

    public void notifyOnPostDestroy(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onPostDestroy(this, widget);
            }
        }
    }

    public void notifyOnPreCreate(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onPreCreate(this, widget);
            }
        }
    }

    public void notifyOnPreCreateView(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onPreCreateView(this, widget);
            }
        }
    }

    public void notifyOnPreDestroy(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onPreDestroy(this, widget);
            }
        }
    }

    public void notifyShow(Widget widget) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onShow(this, widget);
            }
        }
    }

    public void onCustomInfoCallBack(Widget widget) {
        for (Object obj : this.customCallBackInfoMap.keySet()) {
            if (this.customCallBackInfoMap.get(obj).longValue() < SystemClock.elapsedRealtime() && widget.hasRegister(obj.getClass())) {
                widget.onCustomInfoCallBack(obj);
            }
        }
    }

    public View onProvideContainer(int i) {
        return this.contentView.findViewById(i);
    }

    public void setFactory2(LayoutInflater.Factory2 factory2) {
        this.mFactory = factory2;
        applyFactory();
    }

    public WidgetManager unload(Widget widget) {
        View view;
        if (widget == null) {
            return this;
        }
        removeWidget2Observer(widget);
        if (widget.isViewValid) {
            int i = C31797Cdt.LIZ[getLifecycle().getCurrentState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            widget.performPause();
                            widget.performStop();
                            widget.performDestroy();
                        }
                    } else {
                        widget.performStop();
                        widget.performDestroy();
                    }
                } else {
                    widget.performDestroy();
                }
            } else if (!widget.isDestroyed) {
                widget.performDestroy();
            }
        }
        C31809Ce5 c31809Ce5 = widget.widgetContainer;
        if (c31809Ce5 == null) {
            if (this.widgetViewGroupHashMap.containsKey(widget)) {
                if (this.widgetViewGroupHashMap.get(widget) != null) {
                    onDetachContentView(widget, this.widgetViewGroupHashMap.get(widget), widget.contentView);
                }
                this.widgetViewGroupHashMap.remove(widget);
            }
        } else {
            c31809Ce5.LIZ(widget.contentView);
        }
        if (this.resetParams && (view = widget.contentView) != null && view.getLayoutParams() != null && (widget.contentView.getLayoutParams() instanceof C018905p)) {
            ((C018905p) widget.contentView.getLayoutParams()).reset();
        }
        this.widgets.remove(widget);
        widget.context = null;
        widget.containerView = null;
        widget.widgetCallback = null;
        widget.widgetContainer = null;
        return this;
    }

    public C81246Vuc getAsyncLayoutInflater(Class<? extends LiveRecyclableWidget> cls) {
        return this.asyncLayoutInflater;
    }

    public LayoutInflater getLayoutInflater(Class<? extends LiveRecyclableWidget> cls) {
        return this.syncLayoutInflater;
    }

    public LayoutInflater getThemeOverlayLayoutInflater(LayoutInflater layoutInflater, int i) {
        if (i == 0) {
            return layoutInflater;
        }
        return layoutInflater.cloneInContext(new ContextThemeWrapper(layoutInflater.getContext(), i));
    }

    public WidgetManager load(int i, Widget widget) {
        return load(i, widget, true);
    }

    public void notifyWidgetRequestLoading(Widget widget, boolean z) {
        List<? extends InterfaceC31787Cdj> widgetEventListeners = getWidgetEventListeners();
        if (widgetEventListeners != null) {
            Iterator<? extends InterfaceC31787Cdj> it = widgetEventListeners.iterator();
            while (it.hasNext()) {
                it.next().onWidgetRequestLoading(this, widget, z);
            }
        }
    }

    public <T> void onCustomInfoCallBack(Class<T> cls, T t) {
        if (t == null || cls == null) {
            return;
        }
        for (Widget widget : this.widgets) {
            if (widget.hasRegister(cls)) {
                widget.onCustomInfoCallBack(t);
            }
        }
        this.customCallBackInfoMap.put(t, Long.valueOf(SystemClock.elapsedRealtime()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void resetContext(Widget widget, Context context) {
        View view;
        MutableContextWrapper findMutableContextWrapper;
        if (widget == null || !(widget instanceof LiveRecyclableWidget) || !isEnableRecycleWrap(widget.getClass()) || (view = widget.contentView) == null || (findMutableContextWrapper = findMutableContextWrapper(view.getContext())) == null) {
            return;
        }
        if (context instanceof ContextThemeWrapper) {
            findMutableContextWrapper.setBaseContext(context);
        } else {
            if (!(context instanceof MutableContextWrapper)) {
                return;
            }
            resetContext(widget, ((ContextWrapper) context).getBaseContext());
        }
    }

    private WidgetManager loadOld(final ViewGroup viewGroup, final Widget widget, boolean z) {
        notifyWidgetRequestLoading(widget, z);
        widget.containerView = viewGroup;
        this.widgetViewGroupHashMap.put(widget, viewGroup);
        View view = null;
        if (widget.getLayoutId() == 0) {
            continueLoadOld(widget, viewGroup, null);
            return this;
        }
        if (z) {
            notifyOnPreCreateView(widget);
            if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                view = widget.contentView;
            }
            if (this.mFluencyOpt != null) {
                if (view == null || !LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                    view = this.mFluencyOpt.getPreloadLayout(widget.getLayoutId());
                }
                notifyOnPostCreateView(widget);
                continueLoadOld(widget, viewGroup, view);
            }
            if (view == null) {
                getAsyncLayoutInflater(widget).LIZIZ(widget.getLayoutId(), viewGroup, widget.getThemeOverlay(this.context), new InterfaceC81248Vue() { // from class: X.Cdo
                    @Override // X.InterfaceC81248Vue
                    public final /* synthetic */ boolean callBackInMainThread() {
                        return true;
                    }

                    @Override // X.InterfaceC81248Vue
                    public final void onInflateFinished(View view2, int i, ViewGroup viewGroup2) {
                        WidgetManager.this.lambda$loadOld$1(widget, viewGroup, view2, i, viewGroup2);
                    }
                });
            }
            notifyOnPostCreateView(widget);
            continueLoadOld(widget, viewGroup, view);
        } else {
            notifyOnPreCreateView(widget);
            if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                view = widget.contentView;
            }
            if (this.mFluencyOpt != null) {
                if (view == null || !LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                    view = this.mFluencyOpt.getPreloadLayout(widget.getLayoutId());
                }
                notifyOnPostCreateView(widget);
                continueLoadOld(widget, viewGroup, view);
            }
            if (view == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view = C16880lQ.LLLLIILL(getThemeOverlayLayoutInflater(getLayoutInflater(widget), widget.getThemeOverlay(this.context)), widget.getLayoutId(), viewGroup, false);
                if (view != null) {
                    view.setTag(R.id.g0a, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
            notifyOnPostCreateView(widget);
            continueLoadOld(widget, viewGroup, view);
        }
        return this;
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(false, null, fragment, view, fragment.getContext(), fluencyOpt);
        return widgetManager;
    }

    public void continueLoadNew(Widget widget, C31809Ce5 c31809Ce5, View view) {
        if (this.parentFragment == null) {
            return;
        }
        if (view != null) {
            resetContext(widget, this.context);
            widget.setContentView(view);
        }
        if (c31809Ce5 != null) {
            c31809Ce5.LIZIZ(view);
            if (this.isRTL && view != null) {
                C16310kV.LJIIIZ(view, 1);
            }
        }
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        InterfaceC31795Cdr interfaceC31795Cdr = this.mWidgetCreateTimeListener;
        if (interfaceC31795Cdr == null || !interfaceC31795Cdr.needUploadTime(widget)) {
            addWidget2Observer(widget);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            addWidget2Observer(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
    }

    public void continueLoadOld(Widget widget, ViewGroup viewGroup, View view) {
        if (this.parentFragment == null) {
            return;
        }
        widget.widgetContainer = null;
        if (widget.containerView == null) {
            return;
        }
        resetContext(widget, this.context);
        onAttachContentView(widget, viewGroup, view);
        widget.setContentView(view);
        boolean contains = this.widgets.contains(widget);
        this.widgets.add(widget);
        InterfaceC31795Cdr interfaceC31795Cdr = this.mWidgetCreateTimeListener;
        if (interfaceC31795Cdr == null || !interfaceC31795Cdr.needUploadTime(widget)) {
            addWidget2Observer(widget);
        } else {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            addWidget2Observer(widget);
            this.mWidgetCreateTimeListener.onLoad(widget, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        if (!contains) {
            onCustomInfoCallBack(widget);
        }
    }

    public WidgetManager load(int i, Widget widget, boolean z) {
        if (this.parentFragment == null || widget == null) {
            return this;
        }
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.id = i;
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(i, z);
            addWidgetAndCallCustomBack(widget);
            return this;
        }
        if (this.contentView.findViewById(i) instanceof C31809Ce5) {
            loadNew((C31809Ce5) this.contentView.findViewById(i), widget, z, null, null);
            return this;
        }
        boolean z2 = false;
        Widget widget2 = null;
        for (Widget widget3 : this.widgets) {
            if (widget3.getClass() == widget.getClass()) {
                z2 = true;
                widget2 = widget3;
            }
        }
        Class<?> cls = widget.getClass();
        Set<String> set = C31729Ccn.LIZ;
        if (!set.contains(C16880lQ.LJLLJ(cls)) && z2) {
            unload(widget2);
            return load(i, widget, z);
        }
        if (!checkWidgetContainer() || set.contains(C16880lQ.LJLLJ(widget.getClass())) || !C31729Ccn.LIZIZ(this.context)) {
            loadOld((ViewGroup) onProvideContainer(i), widget, z);
            return this;
        }
        throw new C31785Cdh(widget);
    }

    public void onAttachContentView(Widget widget, ViewGroup viewGroup, View view) {
        if (viewGroup != null && view != null) {
            viewGroup.addView(view);
        }
    }

    public void onDetachContentView(Widget widget, ViewGroup viewGroup, View view) {
        viewGroup.removeAllViews();
    }

    public static WidgetManager of(ActivityC45651qj activityC45651qj, View view, FluencyOpt fluencyOpt) {
        WidgetManager widgetManager = new WidgetManager();
        widgetManager.config(false, activityC45651qj, null, view, activityC45651qj, fluencyOpt);
        return widgetManager;
    }

    public static WidgetManager of(Fragment fragment, View view, FluencyOpt fluencyOpt, boolean z) {
        Context context;
        WidgetManager widgetManager = new WidgetManager();
        if (z) {
            context = view.getContext();
        } else {
            context = fragment.getContext();
        }
        widgetManager.config(false, null, fragment, view, context, fluencyOpt);
        return widgetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadOld$1(Widget widget, ViewGroup viewGroup, View view, int i, ViewGroup viewGroup2) {
        notifyOnPostCreateView(widget);
        Fragment fragment = this.parentFragment;
        if (fragment == null || fragment.isRemoving() || this.parentFragment.isDetached() || getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        continueLoadOld(widget, viewGroup, view);
    }

    private WidgetManager loadNew(final C31809Ce5 c31809Ce5, final Widget widget, boolean z, final Object obj, final InterfaceC31796Cds interfaceC31796Cds) {
        notifyWidgetRequestLoading(widget, z);
        widget.widgetContainer = c31809Ce5;
        View view = null;
        if (widget.getLayoutId() == 0) {
            continueLoadNew(widget, c31809Ce5, null);
        } else if (z) {
            notifyOnPreCreateView(widget);
            System.currentTimeMillis();
            if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                view = widget.contentView;
            }
            if (this.mFluencyOpt != null) {
                if (view == null || !LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                    view = this.mFluencyOpt.getPreloadLayout(widget.getLayoutId());
                }
                notifyOnPostCreateView(widget);
                continueLoadNew(widget, c31809Ce5, view);
            }
            if (view == null) {
                getAsyncLayoutInflater(widget).LIZIZ(widget.getLayoutId(), (ViewGroup) c31809Ce5.getParent(), widget.getThemeOverlay(this.context), new InterfaceC81248Vue() { // from class: X.Cdl
                    @Override // X.InterfaceC81248Vue
                    public final /* synthetic */ boolean callBackInMainThread() {
                        return true;
                    }

                    @Override // X.InterfaceC81248Vue
                    public final void onInflateFinished(View view2, int i, ViewGroup viewGroup) {
                        WidgetManager.this.lambda$loadNew$0(widget, interfaceC31796Cds, obj, c31809Ce5, view2, i, viewGroup);
                    }
                });
            }
            notifyOnPostCreateView(widget);
            continueLoadNew(widget, c31809Ce5, view);
        } else {
            notifyOnPreCreateView(widget);
            System.currentTimeMillis();
            if (LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                view = widget.contentView;
            }
            if (this.mFluencyOpt != null) {
                if (view == null || !LiveWidgetProvider.getInstance().isRecycleWidgetContentView) {
                    view = this.mFluencyOpt.getPreloadLayout(widget.getLayoutId());
                }
                notifyOnPostCreateView(widget);
                continueLoadNew(widget, c31809Ce5, view);
            }
            if (view == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                view = C16880lQ.LLLLIILL(getThemeOverlayLayoutInflater(getLayoutInflater(widget), widget.getThemeOverlay(this.context)), widget.getLayoutId(), (ViewGroup) c31809Ce5.getParent(), false);
                if (view != null) {
                    view.setTag(R.id.g0a, Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                }
            }
            notifyOnPostCreateView(widget);
            continueLoadNew(widget, c31809Ce5, view);
        }
        return this;
    }

    public WidgetManager loadPreviewWidget(C31809Ce5 c31809Ce5, Widget widget, boolean z, Object obj, InterfaceC31796Cds interfaceC31796Cds) {
        if (this.parentFragment == null || widget == null || c31809Ce5 == null) {
            return this;
        }
        int id = c31809Ce5.getId();
        widget.setWidgetCallback(this.widgetCallback);
        widget.context = this.context;
        widget.id = id;
        if (!widget.shouldAttach()) {
            widget.saveSnapShot(id, z);
            addWidgetAndCallCustomBack(widget);
            return this;
        }
        loadNew(c31809Ce5, widget, z, obj, interfaceC31796Cds);
        return this;
    }

    public void config(boolean z, ActivityC45651qj activityC45651qj, Fragment fragment, View view, Context context, FluencyOpt fluencyOpt) {
        if (this.configured || fragment == null) {
            return;
        }
        this.resetParams = z;
        this.mFluencyOpt = fluencyOpt;
        this.parentFragment = fragment;
        this.contentView = view;
        this.context = context;
        this.isRTL = C31729Ccn.LIZJ(context);
        this.asyncLayoutInflater = new C81246Vuc(context);
        this.syncLayoutInflater = C16880lQ.LLZIL(context);
        applyFactory();
        fragment.getLifecycle().addObserver(this);
        this.configured = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadNew$0(Widget widget, InterfaceC31796Cds interfaceC31796Cds, Object obj, C31809Ce5 c31809Ce5, View view, int i, ViewGroup viewGroup) {
        notifyOnPostCreateView(widget);
        Fragment fragment = this.parentFragment;
        if (fragment != null && !fragment.isRemoving() && !this.parentFragment.isDetached() && getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED) {
            if (interfaceC31796Cds == null || interfaceC31796Cds.LIZ(obj)) {
                continueLoadNew(widget, c31809Ce5, view);
            }
        }
    }

    public void config(boolean z, ActivityC45651qj activityC45651qj, Fragment fragment, View view, Context context, FluencyOpt fluencyOpt, boolean z2, int i) {
        if (!z2) {
            config(z, activityC45651qj, fragment, view, context, fluencyOpt);
            return;
        }
        if (this.configured || fragment == null) {
            return;
        }
        this.resetParams = z;
        this.mFluencyOpt = fluencyOpt;
        this.parentFragment = fragment;
        this.contentView = view;
        this.context = context;
        this.isRTL = C31729Ccn.LIZJ(context);
        this.asyncLayoutInflater = C81246Vuc.LIZ(i, context);
        this.syncLayoutInflater = C16880lQ.LLZIL(context);
        applyFactory();
        fragment.getLifecycle().addObserver(this);
        this.configured = true;
    }
}
