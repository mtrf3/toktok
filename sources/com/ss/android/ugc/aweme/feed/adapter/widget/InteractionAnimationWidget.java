package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C16880lQ;
import X.C221108m2;
import X.C53254KvC;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.InterfaceC65350Pko;
import X.XJ8;
import Y.AObserverS78S0100000_10;
import android.os.Handler;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class InteractionAnimationWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 208));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 206));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 207));
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final Handler LJLJL;
    public boolean LJLJLJ;

    public InteractionAnimationWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 209);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS160S0100000_10, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 210), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLJL = new Handler(C16880lQ.LLJJJJ());
        this.LJLJLJ = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final View LJZI() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-bottomTipsView>(...)");
        return (View) value;
    }

    public final LinearLayout LJZL() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-liveStyle2Container>(...)");
        return (LinearLayout) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LJLJL.removeCallbacksAndMessages(null);
        LJZ(true);
    }

    public final void LJZ(boolean z) {
        this.LJLJL.removeCallbacksAndMessages(null);
        if (this.LJLJLJ && !z) {
            return;
        }
        this.LJLJLJ = true;
        int i = 0;
        if (z) {
            LJZL().animate().cancel();
            LJZL().setTranslationY(0.0f);
            if (C53254KvC.LIZ()) {
                LJZI().setTranslationY(0.0f);
            }
            int childCount = LJZL().getChildCount();
            while (i < childCount) {
                View childAt = LJZL().getChildAt(i);
                childAt.animate().cancel();
                childAt.setAlpha(1.0f);
                i++;
            }
            return;
        }
        ViewPropertyAnimator animate = LJZL().animate();
        animate.cancel();
        animate.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
        if (C53254KvC.LIZ()) {
            ViewPropertyAnimator animate2 = LJZI().animate();
            animate2.cancel();
            animate2.translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
        }
        int childCount2 = LJZL().getChildCount();
        while (i < childCount2) {
            ViewPropertyAnimator animate3 = LJZL().getChildAt(i).animate();
            animate3.cancel();
            animate3.alpha(1.0f).setDuration(200L).setStartDelay(450L).start();
            i++;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        LivePreviewGuideEnterVM livePreviewGuideEnterVM;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLJJLL.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData2 = feedLiveViewHolderVM.LLF) != null) {
            mutableLiveData2.observe(this, new AObserverS78S0100000_10(this, 18));
        }
        if (C53254KvC.LIZ() && (livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LJLJJL.getValue()) != null && (mutableLiveData = livePreviewGuideEnterVM.LJLJI) != null) {
            mutableLiveData.observe(this, new AObserverS78S0100000_10(this, 19));
        }
    }
}
