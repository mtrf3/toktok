package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C221108m2;
import X.C53254KvC;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class LiveInfoContainerWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 298));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 300));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 302));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS165S0100000_15(this, 301));
    public final C5H3 LJLJJLL;
    public String LJLJL;
    public ViewPropertyAnimator LJLJLJ;

    public LiveInfoContainerWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS165S0100000_15(LIZ, 299), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
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

    public final LinearLayout LJZ() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mLiveInfoContainer>(...)");
        return (LinearLayout) value;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bq0;
        }
        return super.getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<String> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        NextLiveData<Boolean> nextLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLJJLL.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LJZ) != null) {
            nextLiveData.observe(this, new AqS181S0100000_15(this, 56), C53254KvC.LIZ());
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LJLJJLL.getValue();
        if (feedLiveViewHolderVM2 != null && (mutableLiveData2 = feedLiveViewHolderVM2.LLF) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 30));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM3 = (FeedLiveViewHolderVM) this.LJLJJLL.getValue();
        if (feedLiveViewHolderVM3 != null && (mutableLiveData = feedLiveViewHolderVM3.LLFF) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 31));
        }
    }
}
