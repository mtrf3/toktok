package com.bytedance.ies.sdk.widgets;

import X.C16880lQ;
import X.C221108m2;
import X.C47261Igj;
import X.C5H3;
import X.C81246Vuc;
import X.EnumC221088m0;
import X.InterfaceC81248Vue;
import X.X1D;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidgetProvider;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class WidgetPreloader extends RecyclableWidgetManager {
    public final Fragment fragment;
    public boolean isReleased;
    public final SparseArray<List<View>> layoutCache;
    public final C5H3 mockParent$delegate;

    @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetManager, com.bytedance.android.widget.WidgetManager, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void release() {
        this.isReleased = true;
        this.asyncLayoutInflater.LIZLLL(this.context);
        this.layoutCache.clear();
    }

    public final FrameLayout getMockParent() {
        return (FrameLayout) this.mockParent$delegate.getValue();
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final View getPreloadedView(int i) {
        List<View> list = this.layoutCache.get(i);
        View view = null;
        if (list != null) {
            if (list.isEmpty()) {
                return null;
            }
            view = (View) ListProtector.remove(list, 0);
            if (list.isEmpty()) {
                this.layoutCache.remove(i);
            }
        }
        return view;
    }

    public final void preloadLayout(final int i) {
        if (!this.isReleased) {
            this.asyncLayoutInflater.LIZIZ(i, null, 0, new InterfaceC81248Vue() { // from class: com.bytedance.ies.sdk.widgets.WidgetPreloader$preloadLayout$1
                @Override // X.InterfaceC81248Vue
                public /* bridge */ /* synthetic */ boolean callBackInMainThread() {
                    return true;
                }

                @Override // X.InterfaceC81248Vue
                public final void onInflateFinished(View view, int i2, ViewGroup viewGroup) {
                    Fragment fragment;
                    if (view == null || (fragment = WidgetPreloader.this.parentFragment) == null || fragment.isRemoving() || WidgetPreloader.this.parentFragment.isDetached() || WidgetPreloader.this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                        return;
                    }
                    List<View> list = WidgetPreloader.this.layoutCache.get(i);
                    if (list != null) {
                        list.add(view);
                    } else {
                        WidgetPreloader.this.layoutCache.put(i, C47261Igj.LJJIJIL(view));
                    }
                }
            });
            return;
        }
        throw new RuntimeException("Preload is already released");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetPreloader(Fragment fragment, IWidgetProvider widgetProvider, Context context, FluencyOpt opt) {
        super(widgetProvider);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(widgetProvider, "widgetProvider");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(opt, "opt");
        this.fragment = fragment;
        this.layoutCache = new SparseArray<>();
        this.mockParent$delegate = C221108m2.LIZ(EnumC221088m0.NONE, new AqS155S0100000_5(context, 279));
        super.config(false, null, fragment, null, context, opt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends LiveRecyclableWidget> T preload(Class<T> cls, LiveRecyclableWidget liveRecyclableWidget, DataChannel dataChannel, final boolean z) {
        View view;
        o.LJIIIZ(dataChannel, "dataChannel");
        if (liveRecyclableWidget == null || (cls != null && cls.isAssignableFrom(liveRecyclableWidget.getClass()))) {
            if (!this.isReleased) {
                FrameLayout frameLayout = null;
                if (liveRecyclableWidget != null || (liveRecyclableWidget = (T) initWidget(-1, cls, null)) != null) {
                    liveRecyclableWidget.dataChannel = dataChannel;
                    LiveWidgetProvider.Companion companion = LiveWidgetProvider.Companion;
                    if (companion.getInstance().isRecycleWidgetContentView) {
                        view = liveRecyclableWidget.contentView;
                    } else {
                        view = null;
                    }
                    if (this.mFluencyOpt != null) {
                        if (view == null || !companion.getInstance().isRecycleWidgetContentView) {
                            view = this.mFluencyOpt.getPreloadLayout(liveRecyclableWidget.getLayoutId());
                        }
                        resetContext(liveRecyclableWidget, this.context);
                        liveRecyclableWidget.setContentView(view);
                        return (T) liveRecyclableWidget;
                    }
                    if (view == null) {
                        C81246Vuc asyncLayoutInflater = getAsyncLayoutInflater((Class<? extends LiveRecyclableWidget>) liveRecyclableWidget.getClass());
                        int layoutId = liveRecyclableWidget.getLayoutId();
                        if (z) {
                            frameLayout = getMockParent();
                        }
                        int themeOverlay = liveRecyclableWidget.getThemeOverlay(this.context);
                        final LiveRecyclableWidget liveRecyclableWidget2 = liveRecyclableWidget;
                        asyncLayoutInflater.LIZIZ(layoutId, frameLayout, themeOverlay, new InterfaceC81248Vue() { // from class: com.bytedance.ies.sdk.widgets.WidgetPreloader$preload$1
                            @Override // X.InterfaceC81248Vue
                            public /* bridge */ /* synthetic */ boolean callBackInMainThread() {
                                return true;
                            }

                            @Override // X.InterfaceC81248Vue
                            public final void onInflateFinished(View view2, int i, ViewGroup viewGroup) {
                                Fragment fragment;
                                WidgetPreloader widgetPreloader = WidgetPreloader.this;
                                if (widgetPreloader.isReleased || (fragment = widgetPreloader.parentFragment) == null || fragment.isRemoving() || WidgetPreloader.this.parentFragment.isDetached() || WidgetPreloader.this.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
                                    return;
                                }
                                if (z) {
                                    C16880lQ.LJLLLL(view2, WidgetPreloader.this.getMockParent());
                                }
                                WidgetPreloader widgetPreloader2 = WidgetPreloader.this;
                                widgetPreloader2.resetContext(liveRecyclableWidget2, widgetPreloader2.context);
                                liveRecyclableWidget2.setContentView(view2);
                            }
                        });
                        return (T) liveRecyclableWidget;
                    }
                    resetContext(liveRecyclableWidget, this.context);
                    liveRecyclableWidget.setContentView(view);
                    return (T) liveRecyclableWidget;
                }
                throw new RuntimeException("initWidget should not return a null widget!");
            }
            throw new RuntimeException("Preload is already released");
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error ");
        LIZ.append(liveRecyclableWidget);
        LIZ.append(" instance with class ");
        LIZ.append(cls);
        throw new RuntimeException(X1D.LIZIZ(LIZ));
    }

    public static /* synthetic */ LiveRecyclableWidget preload$default(WidgetPreloader widgetPreloader, Class cls, LiveRecyclableWidget liveRecyclableWidget, DataChannel dataChannel, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return widgetPreloader.preload(cls, liveRecyclableWidget, dataChannel, z);
    }
}
