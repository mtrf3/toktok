package com.bytedance.widget;

import X.C221108m2;
import X.C5H3;
import X.C65352Pkq;
import X.C72713SgH;
import X.C78598Ut0;
import X.InterfaceC74236TBo;
import X.TBT;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Widget implements GenericLifecycleObserver, LifecycleOwner {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public ViewGroup container;
    public View contentView;
    public boolean isDestroyed;
    public WidgetHost widgetHost;
    public C72713SgH widgetManager;
    public boolean isFirstLoadedInternal = true;
    public final C5H3 lifecycleRegistry$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 33));
    public final C5H3 childWidgetManager$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 89));

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(Widget.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(Widget.class), "childWidgetManager", "getChildWidgetManager$widget_release()Lcom/bytedance/widget/WidgetManager;")};
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.lifecycleRegistry$delegate.getValue();
    }

    public final C72713SgH getChildWidgetManager$widget_release() {
        return (C72713SgH) this.childWidgetManager$delegate.getValue();
    }

    public int getLayoutId() {
        return 0;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onCreate() {
        this.isDestroyed = false;
    }

    public void onDestroy() {
        this.isDestroyed = true;
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
            create$widget_release();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            start$widget_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            resume$widget_release();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause$widget_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            stop$widget_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy$widget_release();
        }
    }

    public void onStop() {
    }

    public final ViewGroup getContainer() {
        ViewGroup viewGroup = this.container;
        if (viewGroup != null) {
            return viewGroup;
        }
        o.LJIJI("container");
        throw null;
    }

    public final WidgetHost requireWidgetHost$widget_release() {
        WidgetHost widgetHost = this.widgetHost;
        if (widgetHost != null) {
            return widgetHost;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create$widget_release() {
        onCreate();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$widget_release() {
        onDestroy();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public final Object getHost() {
        WidgetHost requireWidgetHost$widget_release = requireWidgetHost$widget_release();
        Fragment parentFragment = requireWidgetHost$widget_release.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        Object requireHost = requireWidgetHost$widget_release.requireHost();
        o.LJFF(requireHost, "requireHost()");
        return requireHost;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause$widget_release() {
        onPause();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume$widget_release() {
        onResume();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start$widget_release() {
        onStart();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop$widget_release() {
        onStop();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public final void setContainer(ViewGroup viewGroup) {
        o.LJIIJ(viewGroup, "<set-?>");
        this.container = viewGroup;
    }

    public final void setContainerView$widget_release(ViewGroup containerView) {
        o.LJIIJ(containerView, "containerView");
        this.container = containerView;
    }

    public final void setContentView$widget_release(View contentView) {
        o.LJIIJ(contentView, "contentView");
        this.contentView = contentView;
    }

    public final void startActivity(Intent intent) {
        o.LJIIJ(intent, "intent");
        WidgetHost requireWidgetHost$widget_release = requireWidgetHost$widget_release();
        C78598Ut0.LJIJJ(intent, requireWidgetHost$widget_release);
        requireWidgetHost$widget_release.startActivity(intent);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        o.LJIIJ(intent, "intent");
        WidgetHost requireWidgetHost$widget_release = requireWidgetHost$widget_release();
        C78598Ut0.LJIJJ(intent, requireWidgetHost$widget_release);
        requireWidgetHost$widget_release.startActivity(intent, bundle);
    }

    public final void startActivityForResult(Intent intent, int i) {
        o.LJIIJ(intent, "intent");
        requireWidgetHost$widget_release().xl(intent, i, this);
    }

    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        o.LJIIJ(intent, "intent");
        requireWidgetHost$widget_release().wl(intent, i, bundle, this);
    }
}
