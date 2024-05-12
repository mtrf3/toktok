package com.bytedance.ies.sdk.widgets;

import X.C76800UCe;
import X.InterfaceC30319Bv9;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ViewTreeObserverOnPreDrawListenerC16840lM;
import X.YA0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.WidgetGroupDelegate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class WidgetGroupDelegate {
    public static final Companion Companion = new Companion();
    public boolean asyncWaitShow;
    public final DataChannel dataChannel;
    public boolean enableAlphaAnimFboOpt;
    public final boolean isAccelerateInterpolator;
    public boolean isAutoShowWidgets;
    public boolean isLoadCalled;
    public boolean isShowOnScreen;
    public boolean isShown;
    public InterfaceC88471Ynr<? super Integer, ? super LiveRecyclableWidget, Boolean> loadFilter;
    public final List<WidgetDeleteInfo> needLoadWidgets;
    public final List<InterfaceC88472Yns<List<WidgetDeleteInfo>, C76800UCe>> onAnimEndShownListeners;
    public final List<InterfaceC88472Yns<List<WidgetDeleteInfo>, C76800UCe>> onLoadListeners;
    public final List<InterfaceC88472Yns<List<WidgetDeleteInfo>, C76800UCe>> onShowListeners;
    public final WidgetPreloader preloader;
    public final List<WidgetDeleteInfo> presetWidgets;
    public RecyclableWidgetManager realWidgetManager;
    public final long showAnimDuration;
    public final SparseArray<WidgetDeleteInfo> waitingLoadedMap;

    public final void doShowWidgets() {
        LiveRecyclableWidget preloadedWidget;
        View view;
        LiveRecyclableWidget preloadedWidget2;
        LayeredElementContext layeredElementContext;
        ConstraintProperty constraintPropertyById;
        this.isShown = true;
        Iterator<InterfaceC88472Yns<List<WidgetDeleteInfo>, C76800UCe>> it = this.onLoadListeners.iterator();
        while (it.hasNext()) {
            it.next().invoke(this.needLoadWidgets);
        }
        if (this.showAnimDuration <= 0) {
            Iterator<WidgetDeleteInfo> it2 = this.needLoadWidgets.iterator();
            while (it2.hasNext()) {
                LiveRecyclableWidget preloadedWidget3 = it2.next().getPreloadedWidget();
                if (preloadedWidget3 != null) {
                    preloadedWidget3.show();
                }
            }
            setupFirstDrawNotify(new AqS165S0100000_15(this, 41));
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (this.isAccelerateInterpolator) {
            ofFloat.setInterpolator(new AccelerateInterpolator(1.5f));
        } else {
            ofFloat.setInterpolator(new LinearInterpolator());
        }
        ofFloat.setDuration(this.showAnimDuration);
        for (WidgetDeleteInfo widgetDeleteInfo : this.needLoadWidgets) {
            LiveRecyclableWidget preloadedWidget4 = widgetDeleteInfo.getPreloadedWidget();
            if (preloadedWidget4 != null) {
                if (Build.VERSION.SDK_INT >= 24 && this.enableAlphaAnimFboOpt && (preloadedWidget2 = widgetDeleteInfo.getPreloadedWidget()) != null && (layeredElementContext = preloadedWidget2.layeredElementContext) != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(preloadedWidget4.getId())) != null) {
                    constraintPropertyById.forceHasOverlappingRendering(false);
                }
                if (widgetDeleteInfo.getManualHide() && (preloadedWidget = widgetDeleteInfo.getPreloadedWidget()) != null && (view = preloadedWidget.contentView) != null) {
                    view.setVisibility(0);
                }
            }
        }
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.ies.sdk.widgets.WidgetGroupDelegate$doShowWidgets$animator$1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animation) {
                LiveRecyclableWidget preloadedWidget5;
                LayeredElementContext layeredElementContext2;
                ConstraintProperty constraintPropertyById2;
                o.LJIIIZ(animation, "animation");
                for (WidgetGroupDelegate.WidgetDeleteInfo widgetDeleteInfo2 : WidgetGroupDelegate.this.needLoadWidgets) {
                    LiveRecyclableWidget preloadedWidget6 = widgetDeleteInfo2.getPreloadedWidget();
                    if (preloadedWidget6 != null && (preloadedWidget5 = widgetDeleteInfo2.getPreloadedWidget()) != null && (layeredElementContext2 = preloadedWidget5.layeredElementContext) != null && (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(preloadedWidget6.getId())) != null) {
                        Object animatedValue = animation.getAnimatedValue();
                        o.LJII(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        constraintPropertyById2.alpha(((Float) animatedValue).floatValue());
                    }
                }
            }
        });
        ofFloat.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.ies.sdk.widgets.WidgetGroupDelegate$doShowWidgets$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                o.LJIIIZ(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                o.LJIIIZ(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                o.LJIIIZ(animator, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                o.LJIIIZ(animator, "animator");
                Iterator<InterfaceC88472Yns<List<WidgetGroupDelegate.WidgetDeleteInfo>, C76800UCe>> it3 = WidgetGroupDelegate.this.onAnimEndShownListeners.iterator();
                while (it3.hasNext()) {
                    it3.next().invoke(WidgetGroupDelegate.this.needLoadWidgets);
                }
            }
        });
        if (this.enableAlphaAnimFboOpt && Build.VERSION.SDK_INT < 24) {
            ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.ies.sdk.widgets.WidgetGroupDelegate$doShowWidgets$6
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    View view2;
                    o.LJIIIZ(animation, "animation");
                    super.onAnimationEnd(animation);
                    Iterator<WidgetGroupDelegate.WidgetDeleteInfo> it3 = WidgetGroupDelegate.this.needLoadWidgets.iterator();
                    while (it3.hasNext()) {
                        LiveRecyclableWidget preloadedWidget5 = it3.next().getPreloadedWidget();
                        if (preloadedWidget5 != null && (view2 = preloadedWidget5.contentView) != null) {
                            view2.setLayerType(0, null);
                        }
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    View view2;
                    o.LJIIIZ(animation, "animation");
                    super.onAnimationStart(animation);
                    Iterator<WidgetGroupDelegate.WidgetDeleteInfo> it3 = WidgetGroupDelegate.this.needLoadWidgets.iterator();
                    while (it3.hasNext()) {
                        LiveRecyclableWidget preloadedWidget5 = it3.next().getPreloadedWidget();
                        if (preloadedWidget5 != null && (view2 = preloadedWidget5.contentView) != null) {
                            view2.setLayerType(2, null);
                        }
                    }
                }
            });
        }
        setupFirstDrawNotify(new AqS165S0100000_15(this, 42));
        ofFloat.start();
    }

    public final boolean canLoadWidgets() {
        return !this.isLoadCalled;
    }

    public final boolean isAllWidgetsPreloaded() {
        List<WidgetDeleteInfo> list = this.presetWidgets;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<WidgetDeleteInfo> it = list.iterator();
        while (it.hasNext()) {
            LiveRecyclableWidget preloadedWidget = it.next().getPreloadedWidget();
            if (preloadedWidget == null || preloadedWidget.contentView == null) {
                return false;
            }
        }
        return true;
    }

    public final void preload() {
        WidgetPreloader widgetPreloader = this.preloader;
        if (widgetPreloader == null) {
            return;
        }
        for (WidgetDeleteInfo widgetDeleteInfo : this.presetWidgets) {
            widgetDeleteInfo.setPreloadedWidget(widgetPreloader.preload(widgetDeleteInfo.getWidgetClazz(), widgetDeleteInfo.getPreloadedWidget(), this.dataChannel, widgetDeleteInfo.getMockParent()));
        }
    }

    public final void tryShow() {
        if (!this.isShown && this.isLoadCalled) {
            this.isAutoShowWidgets = true;
            if (this.waitingLoadedMap.size() == 0) {
                doShowWidgets();
            }
        }
    }

    /* loaded from: classes16.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* loaded from: classes16.dex */
    public static final class WidgetDeleteInfo {
        public final InterfaceC65784Pro<Object[]> args;
        public final boolean async;
        public final int containerId;
        public boolean manualHide;
        public final boolean mockParent;
        public LiveRecyclableWidget preloadedWidget;
        public final Class<? extends LiveRecyclableWidget> widgetClazz;

        public final InterfaceC65784Pro<Object[]> getArgs() {
            return this.args;
        }

        public final boolean getAsync() {
            return this.async;
        }

        public final int getContainerId() {
            return this.containerId;
        }

        public final boolean getManualHide() {
            return this.manualHide;
        }

        public final boolean getMockParent() {
            return this.mockParent;
        }

        public final LiveRecyclableWidget getPreloadedWidget() {
            return this.preloadedWidget;
        }

        public final Class<? extends LiveRecyclableWidget> getWidgetClazz() {
            return this.widgetClazz;
        }

        public final void setManualHide(boolean z) {
            this.manualHide = z;
        }

        public final void setPreloadedWidget(LiveRecyclableWidget liveRecyclableWidget) {
            this.preloadedWidget = liveRecyclableWidget;
        }

        public WidgetDeleteInfo(int i, Class<? extends LiveRecyclableWidget> widgetClazz, InterfaceC65784Pro<Object[]> interfaceC65784Pro, boolean z, boolean z2) {
            o.LJIIIZ(widgetClazz, "widgetClazz");
            this.containerId = i;
            this.widgetClazz = widgetClazz;
            this.args = interfaceC65784Pro;
            this.async = z;
            this.mockParent = z2;
        }

        public /* synthetic */ WidgetDeleteInfo(int i, Class cls, InterfaceC65784Pro interfaceC65784Pro, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, cls, interfaceC65784Pro, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? true : z2);
        }
    }

    public final boolean isShowOnScreen() {
        return this.isShowOnScreen;
    }

    public final boolean isShown() {
        return this.isShown;
    }

    private final void loadWidgetIfLoading(WidgetDeleteInfo widgetDeleteInfo) {
        RecyclableWidgetManager recyclableWidgetManager;
        View view;
        View view2;
        InterfaceC88471Ynr<? super Integer, ? super LiveRecyclableWidget, Boolean> interfaceC88471Ynr = this.loadFilter;
        if (interfaceC88471Ynr == null || !this.isLoadCalled || this.isShown || !interfaceC88471Ynr.invoke(Integer.valueOf(widgetDeleteInfo.getContainerId()), widgetDeleteInfo.getPreloadedWidget()).booleanValue() || (recyclableWidgetManager = this.realWidgetManager) == null) {
            return;
        }
        this.needLoadWidgets.add(widgetDeleteInfo);
        this.waitingLoadedMap.put(widgetDeleteInfo.getContainerId(), widgetDeleteInfo);
        LiveRecyclableWidget preloadedWidget = widgetDeleteInfo.getPreloadedWidget();
        Object[] objArr = null;
        if (preloadedWidget != null) {
            int containerId = widgetDeleteInfo.getContainerId();
            boolean async = widgetDeleteInfo.getAsync();
            InterfaceC65784Pro<Object[]> args = widgetDeleteInfo.getArgs();
            if (args != null) {
                objArr = args.invoke();
            }
            recyclableWidgetManager.doLoad(containerId, preloadedWidget, async, objArr);
        }
        LiveRecyclableWidget preloadedWidget2 = widgetDeleteInfo.getPreloadedWidget();
        if (preloadedWidget2 != null && (view = preloadedWidget2.contentView) != null && view.getVisibility() == 0) {
            widgetDeleteInfo.setManualHide(true);
            LiveRecyclableWidget preloadedWidget3 = widgetDeleteInfo.getPreloadedWidget();
            if (preloadedWidget3 == null || (view2 = preloadedWidget3.contentView) == null) {
                return;
            }
            view2.setVisibility(4);
        }
    }

    private final void setupFirstDrawNotify(final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        WidgetDeleteInfo widgetDeleteInfo;
        LiveRecyclableWidget preloadedWidget;
        final View view;
        View view2;
        if (this.isShowOnScreen) {
            return;
        }
        Iterator<WidgetDeleteInfo> it = this.presetWidgets.iterator();
        while (true) {
            if (it.hasNext()) {
                widgetDeleteInfo = it.next();
                LiveRecyclableWidget preloadedWidget2 = widgetDeleteInfo.getPreloadedWidget();
                if (preloadedWidget2 != null && (view2 = preloadedWidget2.contentView) != null && view2.getVisibility() == 0) {
                    break;
                }
            } else {
                widgetDeleteInfo = null;
                break;
            }
        }
        WidgetDeleteInfo widgetDeleteInfo2 = widgetDeleteInfo;
        if (widgetDeleteInfo2 != null && (preloadedWidget = widgetDeleteInfo2.getPreloadedWidget()) != null && (view = preloadedWidget.contentView) != null) {
            ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new Runnable() { // from class: com.bytedance.ies.sdk.widgets.WidgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    com_bytedance_ies_sdk_widgets_WidgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
                }

                public final void com_bytedance_ies_sdk_widgets_WidgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1__run$___twin___() {
                    this.isShowOnScreen = true;
                    interfaceC65784Pro.invoke();
                }

                public static void com_bytedance_ies_sdk_widgets_WidgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(WidgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1 widgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1) {
                    boolean LIZ;
                    try {
                        widgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1.com_bytedance_ies_sdk_widgets_WidgetGroupDelegate$setupFirstDrawNotify$lambda$16$$inlined$doOnPreDraw$1__run$___twin___();
                    } finally {
                        if (LIZ) {
                        }
                    }
                }
            });
        }
    }

    public final void addOnAnimEndShownListener(InterfaceC88472Yns<? super List<WidgetDeleteInfo>, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.onAnimEndShownListeners.add(block);
    }

    public final void addOnLoadListener(InterfaceC88472Yns<? super List<WidgetDeleteInfo>, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.onLoadListeners.add(block);
    }

    public final void addOnShowListener(InterfaceC88472Yns<? super List<WidgetDeleteInfo>, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        this.onShowListeners.add(block);
    }

    public final void setEnableAlphaAnimFboOpt(boolean z) {
        this.enableAlphaAnimFboOpt = z;
    }

    public final boolean isDelegated(int i, Class<?> widgetClazz) {
        o.LJIIIZ(widgetClazz, "widgetClazz");
        List<WidgetDeleteInfo> list = this.presetWidgets;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (WidgetDeleteInfo widgetDeleteInfo : list) {
            if (widgetDeleteInfo.getContainerId() == i && widgetDeleteInfo.getWidgetClazz().isAssignableFrom(widgetClazz)) {
                return true;
            }
        }
        return false;
    }

    public WidgetGroupDelegate(WidgetPreloader widgetPreloader, DataChannel dataChannel, long j) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.preloader = widgetPreloader;
        this.dataChannel = dataChannel;
        this.showAnimDuration = j;
        this.presetWidgets = new ArrayList();
        this.needLoadWidgets = new ArrayList();
        this.isAccelerateInterpolator = true;
        this.waitingLoadedMap = new SparseArray<>();
        this.onShowListeners = new ArrayList();
        this.onLoadListeners = new ArrayList();
        this.onAnimEndShownListeners = new ArrayList();
        this.enableAlphaAnimFboOpt = true;
    }

    public final boolean loadAndShow(RecyclableWidgetManager realWidgetManager, boolean z, InterfaceC88471Ynr<? super Integer, ? super LiveRecyclableWidget, Boolean> loadFilter) {
        View view;
        View view2;
        Object[] objArr;
        o.LJIIIZ(realWidgetManager, "realWidgetManager");
        o.LJIIIZ(loadFilter, "loadFilter");
        this.realWidgetManager = realWidgetManager;
        this.loadFilter = loadFilter;
        if (!canLoadWidgets()) {
            return false;
        }
        this.isAutoShowWidgets = z;
        this.isLoadCalled = true;
        this.needLoadWidgets.clear();
        List<WidgetDeleteInfo> list = this.needLoadWidgets;
        List<WidgetDeleteInfo> list2 = this.presetWidgets;
        ArrayList arrayList = new ArrayList();
        for (WidgetDeleteInfo widgetDeleteInfo : list2) {
            WidgetDeleteInfo widgetDeleteInfo2 = widgetDeleteInfo;
            if (loadFilter.invoke(Integer.valueOf(widgetDeleteInfo2.getContainerId()), widgetDeleteInfo2.getPreloadedWidget()).booleanValue()) {
                arrayList.add(widgetDeleteInfo);
            }
        }
        list.addAll(arrayList);
        for (WidgetDeleteInfo widgetDeleteInfo3 : this.needLoadWidgets) {
            if (widgetDeleteInfo3.getPreloadedWidget() == null) {
                widgetDeleteInfo3.setPreloadedWidget(realWidgetManager.initWidget(-1, widgetDeleteInfo3.getWidgetClazz(), null));
            }
            this.waitingLoadedMap.put(widgetDeleteInfo3.getContainerId(), widgetDeleteInfo3);
        }
        realWidgetManager.addRecyclableWidgetEventListener(new RecyclableWidgetEventListener() { // from class: com.bytedance.ies.sdk.widgets.WidgetGroupDelegate$loadAndShow$4
            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onHide(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onPostCreate(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onPostCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onPostDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJ(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPostUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJI(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onPreCreate(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onPreCreateView(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onPreDestroy(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreInit(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJIIJ(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreLoad(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJIIJJI(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public final /* synthetic */ void onPreUnload(InterfaceC30319Bv9 interfaceC30319Bv9, LiveRecyclableWidget liveRecyclableWidget) {
                YA0.LJIIL(this, interfaceC30319Bv9, liveRecyclableWidget);
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public /* bridge */ /* synthetic */ void onWidgetRequestLoading(InterfaceC30319Bv9 interfaceC30319Bv9, com.bytedance.android.widget.Widget widget, boolean z2) {
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener
            public void onPostLoad(InterfaceC30319Bv9 widgetManager, LiveRecyclableWidget widget) {
                o.LJIIIZ(widgetManager, "widgetManager");
                o.LJIIIZ(widget, "widget");
                YA0.LJFF(this, widgetManager, widget);
                if (WidgetGroupDelegate.this.waitingLoadedMap.size() != 0) {
                    WidgetGroupDelegate.WidgetDeleteInfo widgetDeleteInfo4 = WidgetGroupDelegate.this.waitingLoadedMap.get(widget.getId());
                    if (widgetDeleteInfo4 != null) {
                        if (WidgetGroupDelegate.this.asyncWaitShow && widget.isShowing()) {
                            widgetDeleteInfo4.setManualHide(true);
                            View view3 = widget.contentView;
                            if (view3 != null) {
                                view3.setVisibility(4);
                            }
                        }
                        WidgetGroupDelegate.this.waitingLoadedMap.remove(widget.getId());
                    }
                    if (WidgetGroupDelegate.this.waitingLoadedMap.size() == 0) {
                        WidgetGroupDelegate widgetGroupDelegate = WidgetGroupDelegate.this;
                        if (widgetGroupDelegate.isAutoShowWidgets) {
                            widgetGroupDelegate.doShowWidgets();
                        }
                    }
                }
            }

            @Override // com.bytedance.ies.sdk.widgets.RecyclableWidgetEventListener, X.InterfaceC31787Cdj
            public void onShow(InterfaceC30319Bv9 widgetManager, com.bytedance.android.widget.Widget widget) {
                WidgetGroupDelegate.WidgetDeleteInfo widgetDeleteInfo4;
                o.LJIIIZ(widgetManager, "widgetManager");
                o.LJIIIZ(widget, "widget");
                if (WidgetGroupDelegate.this.waitingLoadedMap.size() == 0) {
                    WidgetGroupDelegate widgetGroupDelegate = WidgetGroupDelegate.this;
                    if (!widgetGroupDelegate.isShown) {
                        Iterator<WidgetGroupDelegate.WidgetDeleteInfo> it = widgetGroupDelegate.needLoadWidgets.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                widgetDeleteInfo4 = it.next();
                                if (o.LJ(widgetDeleteInfo4.getPreloadedWidget(), widget)) {
                                    break;
                                }
                            } else {
                                widgetDeleteInfo4 = null;
                                break;
                            }
                        }
                        WidgetGroupDelegate.WidgetDeleteInfo widgetDeleteInfo5 = widgetDeleteInfo4;
                        if (widgetDeleteInfo5 != null) {
                            widgetDeleteInfo5.setManualHide(true);
                            View view3 = widget.contentView;
                            if (view3 == null) {
                                return;
                            }
                            view3.setVisibility(4);
                        }
                    }
                }
            }
        });
        for (WidgetDeleteInfo widgetDeleteInfo4 : this.needLoadWidgets) {
            LiveRecyclableWidget preloadedWidget = widgetDeleteInfo4.getPreloadedWidget();
            if (preloadedWidget != null) {
                int containerId = widgetDeleteInfo4.getContainerId();
                boolean async = widgetDeleteInfo4.getAsync();
                InterfaceC65784Pro<Object[]> args = widgetDeleteInfo4.getArgs();
                if (args != null) {
                    objArr = args.invoke();
                } else {
                    objArr = null;
                }
                realWidgetManager.doLoad(containerId, preloadedWidget, async, objArr);
            }
        }
        if (this.waitingLoadedMap.size() != 0 || !this.isAutoShowWidgets) {
            List<WidgetDeleteInfo> list3 = this.needLoadWidgets;
            ArrayList arrayList2 = new ArrayList();
            for (WidgetDeleteInfo widgetDeleteInfo5 : list3) {
                LiveRecyclableWidget preloadedWidget2 = widgetDeleteInfo5.getPreloadedWidget();
                if (preloadedWidget2 != null && (view2 = preloadedWidget2.contentView) != null && view2.getVisibility() == 0) {
                    arrayList2.add(widgetDeleteInfo5);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                WidgetDeleteInfo widgetDeleteInfo6 = (WidgetDeleteInfo) it.next();
                widgetDeleteInfo6.setManualHide(true);
                LiveRecyclableWidget preloadedWidget3 = widgetDeleteInfo6.getPreloadedWidget();
                if (preloadedWidget3 != null && (view = preloadedWidget3.contentView) != null) {
                    view.setVisibility(4);
                }
            }
            this.asyncWaitShow = true;
        }
        return true;
    }

    public /* synthetic */ WidgetGroupDelegate(WidgetPreloader widgetPreloader, DataChannel dataChannel, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(widgetPreloader, dataChannel, (i & 4) != 0 ? 300L : j);
    }

    public final void delegate(int i, LiveRecyclableWidget liveRecyclableWidget, boolean z, boolean z2, InterfaceC65784Pro<Object[]> interfaceC65784Pro) {
        if (liveRecyclableWidget == null) {
            return;
        }
        WidgetDeleteInfo widgetDeleteInfo = new WidgetDeleteInfo(i, liveRecyclableWidget.getClass(), interfaceC65784Pro, z, z2);
        widgetDeleteInfo.setPreloadedWidget(liveRecyclableWidget);
        this.presetWidgets.add(widgetDeleteInfo);
        loadWidgetIfLoading(widgetDeleteInfo);
    }

    public final void delegate(int i, Class<? extends LiveRecyclableWidget> cls, boolean z, boolean z2, InterfaceC65784Pro<Object[]> interfaceC65784Pro) {
        if (cls == null) {
            return;
        }
        WidgetDeleteInfo widgetDeleteInfo = new WidgetDeleteInfo(i, cls, interfaceC65784Pro, z, z2);
        this.presetWidgets.add(widgetDeleteInfo);
        loadWidgetIfLoading(widgetDeleteInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean loadAndShow$default(WidgetGroupDelegate widgetGroupDelegate, RecyclableWidgetManager recyclableWidgetManager, boolean z, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC88471Ynr = WidgetGroupDelegate$loadAndShow$1.INSTANCE;
        }
        return widgetGroupDelegate.loadAndShow(recyclableWidgetManager, z, interfaceC88471Ynr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void delegate$default(WidgetGroupDelegate widgetGroupDelegate, int i, LiveRecyclableWidget liveRecyclableWidget, boolean z, boolean z2, InterfaceC65784Pro interfaceC65784Pro, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        if ((i2 & 16) != 0) {
            interfaceC65784Pro = null;
        }
        widgetGroupDelegate.delegate(i, liveRecyclableWidget, z, z2, (InterfaceC65784Pro<Object[]>) interfaceC65784Pro);
    }

    public static /* synthetic */ void delegate$default(WidgetGroupDelegate widgetGroupDelegate, int i, Class cls, boolean z, boolean z2, InterfaceC65784Pro interfaceC65784Pro, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        widgetGroupDelegate.delegate(i, (Class<? extends LiveRecyclableWidget>) cls, z, z2, (InterfaceC65784Pro<Object[]>) interfaceC65784Pro);
    }
}
