package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C86366Xv0;
import X.C86367Xv1;
import X.InterfaceC15850jl;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class GiftEffectWidget extends LiveWatchPreviewWidget {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final AqS165S0100000_15 LJLJLLL;
    public final AqS165S0100000_15 LJLL;

    public GiftEffectWidget() {
        XJ8 xj8 = XJ8.WIDGET;
        C65776Prg LIZ = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 277);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        this.LJLILLLLZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ2 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 278), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 279), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS165S0100000_15(LIZ4, 280), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLJJLL = C221108m2.LIZIZ(C86366Xv0.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(C86367Xv1.LJLIL);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS165S0100000_15(this, 274));
        this.LJLJLLL = new AqS165S0100000_15(this, 276);
        this.LJLL = new AqS165S0100000_15(this, 275);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final InterfaceC15850jl LJZ() {
        return (InterfaceC15850jl) this.LJLJL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC15850jl LJZ = LJZ();
        if (LJZ != null) {
            LJZ.unInit();
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        InterfaceC15850jl LJZ = LJZ();
        if (LJZ != null) {
            LJZ.LIZ(this.LJLJLLL);
        }
        InterfaceC15850jl LJZ2 = LJZ();
        if (LJZ2 != null) {
            LJZ2.LIZIZ(this.LJLL);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        NextLiveData<Boolean> nextLiveData;
        MutableLiveData<String> mutableLiveData4;
        InterfaceC15850jl LJZ = LJZ();
        if (LJZ != null) {
            Object value = this.LJLJLJ.getValue();
            o.LJIIIIZZ(value, "<get-container>(...)");
            LJZ.LJ((FrameLayout) value);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLJJI.getValue();
        if (feedLiveViewHolderVM != null) {
            feedLiveViewHolderVM.LLFII = 0;
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LJLJJI.getValue();
        if (feedLiveViewHolderVM2 != null) {
            feedLiveViewHolderVM2.LLFZ = 0;
        }
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LJLILLLLZI.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData4 = livePreviewPlayerVM.LJLJJLL) != null) {
            mutableLiveData4.observe(this, new AObserverS83S0100000_15(this, 24));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM3 = (FeedLiveViewHolderVM) this.LJLJJI.getValue();
        if (feedLiveViewHolderVM3 != null && (nextLiveData = feedLiveViewHolderVM3.LJZ) != null) {
            nextLiveData.observe(this, new AObserverS83S0100000_15(this, 25));
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData3 = viewHolderStatusVM.LJLJJI) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 26));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData2 = viewHolderStatusVM2.LJLJLJ) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 27));
        }
        LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LJLJJL.getValue();
        if (livePreviewGuideEnterVM != null && (mutableLiveData = livePreviewGuideEnterVM.LJLJJL) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 28));
        }
    }
}
