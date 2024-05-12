package com.ss.android.ugc.aweme.feed.adapter.widget.pause;

import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.InterfaceC65350Pko;
import X.OU0;
import X.XJ8;
import Y.AObserverS78S0100000_10;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class LivePreviewPausedWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 231));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 233));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 232));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 234));
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;

    public LivePreviewPausedWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 235);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS160S0100000_10, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJLJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 236), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ3, 237), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.bq1;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final C62846OlW LJZ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-coverPauseFrontView>(...)");
        return (C62846OlW) value;
    }

    public final LinearLayout LJZI() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-livePauseView>(...)");
        return (LinearLayout) value;
    }

    public final View LJZL() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-loadingView>(...)");
        return (View) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<OU0> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJJLL.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData2 = viewHolderStatusVM.LJLJLJ) != null) {
            mutableLiveData2.observe(this, new AObserverS78S0100000_10(this, 36));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLJLJ.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData = feedLiveViewHolderVM.LJZL) != null) {
            mutableLiveData.observe(this, new AObserverS78S0100000_10(this, 37));
        }
    }
}
