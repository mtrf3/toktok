package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.InterfaceC86379XvD;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.live.FypRecommendInfo;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public abstract class BaseEcLiveFeedCardWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 263));
    public InterfaceC86379XvD LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;

    public BaseEcLiveFeedCardWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 264);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 265), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    public abstract boolean LJZ(FypRecommendInfo fypRecommendInfo);

    public abstract FrameLayout LJZI();

    public abstract void LJZL();

    public abstract String LLFF();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FrameLayout LL() {
        return (FrameLayout) this.LJLILLLLZI.getValue();
    }

    public final FeedLiveViewHolderVM LLF() {
        return (FeedLiveViewHolderVM) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        InterfaceC86379XvD interfaceC86379XvD = this.LJLJI;
        if (interfaceC86379XvD != null) {
            interfaceC86379XvD.destroy();
        }
        this.LJLJI = null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData4 = viewHolderStatusVM.LJLJL) != null) {
            mutableLiveData4.observe(this, new AObserverS83S0100000_15(this, 15));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData3 = viewHolderStatusVM2.LJLJLJ) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 16));
        }
        ViewHolderStatusVM viewHolderStatusVM3 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM3 != null && (mutableLiveData2 = viewHolderStatusVM3.LJLJI) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 17));
        }
        ViewHolderStatusVM viewHolderStatusVM4 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM4 != null && (mutableLiveData = viewHolderStatusVM4.LJLILLLLZI) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 18));
        }
    }
}
