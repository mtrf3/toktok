package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C53254KvC;
import X.C53839LBb;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C86339XuZ;
import X.ViewOnClickListenerC13880ga;
import X.XJ8;
import Y.ACListenerS35S0100000_15;
import Y.AObserverS77S0100000_9;
import Y.AObserverS83S0100000_15;
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
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS175S0100000_9;

/* loaded from: classes16.dex */
public final class BottomTipsWidget extends LiveWatchPreviewWidget {
    public C53839LBb LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public boolean LJLJJLL;

    public BottomTipsWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 268);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 269), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 270), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final FeedLiveViewHolderVM LJZ() {
        return (FeedLiveViewHolderVM) this.LJLJJI.getValue();
    }

    public final LivePreviewGuideEnterVM LJZI() {
        return (LivePreviewGuideEnterVM) this.LJLJJL.getValue();
    }

    public final ViewHolderStatusVM LJZL() {
        return (ViewHolderStatusVM) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bpx;
        }
        return super.getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C53839LBb c53839LBb = (C53839LBb) findViewById(R.id.arq);
        this.LJLILLLLZI = c53839LBb;
        if (c53839LBb != null) {
            c53839LBb.setAutoEnterListener(new C86339XuZ(this));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Boolean> nextLiveData;
        NextLiveData<Boolean> nextLiveData2;
        MutableLiveData<Boolean> mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2;
        NextLiveData<C76800UCe> nextLiveData3;
        MutableLiveData<C76800UCe> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        MutableLiveData<C76800UCe> mutableLiveData5;
        MutableLiveData<C76800UCe> mutableLiveData6;
        MutableLiveData<Integer> mutableLiveData7;
        MutableLiveData<C76800UCe> mutableLiveData8;
        MutableLiveData<C76800UCe> mutableLiveData9;
        ViewHolderStatusVM LJZL = LJZL();
        if (LJZL != null && (mutableLiveData9 = LJZL.LJLJLLL) != null) {
            mutableLiveData9.observe(this, new AObserverS77S0100000_9(this, 5));
        }
        ViewHolderStatusVM LJZL2 = LJZL();
        if (LJZL2 != null && (mutableLiveData8 = LJZL2.LJLILLLLZI) != null) {
            mutableLiveData8.observe(this, new AObserverS77S0100000_9(this, 6));
        }
        ViewHolderStatusVM LJZL3 = LJZL();
        if (LJZL3 != null && (mutableLiveData7 = LJZL3.LJLJL) != null) {
            mutableLiveData7.observe(this, new AObserverS77S0100000_9(this, 7));
        }
        ViewHolderStatusVM LJZL4 = LJZL();
        if (LJZL4 != null && (mutableLiveData6 = LJZL4.LJLJLJ) != null) {
            mutableLiveData6.observe(this, new AObserverS77S0100000_9(this, 8));
        }
        ViewHolderStatusVM LJZL5 = LJZL();
        if (LJZL5 != null && (mutableLiveData5 = LJZL5.LJLJJL) != null) {
            mutableLiveData5.observe(this, new AObserverS77S0100000_9(this, 9));
        }
        ViewHolderStatusVM LJZL6 = LJZL();
        if (LJZL6 != null && (mutableLiveData4 = LJZL6.LJLJJI) != null) {
            mutableLiveData4.observe(this, new AObserverS77S0100000_9(this, 10));
        }
        ViewHolderStatusVM LJZL7 = LJZL();
        if (LJZL7 != null && (mutableLiveData3 = LJZL7.LJLJJLL) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 19));
        }
        FeedLiveViewHolderVM LJZ = LJZ();
        if (LJZ != null && (nextLiveData3 = LJZ.LJLLLLLL) != null) {
            nextLiveData3.observe(this, new AObserverS83S0100000_15(this, 20));
        }
        LivePreviewGuideEnterVM LJZI = LJZI();
        if (LJZI != null && (mutableLiveData2 = LJZI.LJLJJI) != null) {
            mutableLiveData2.observe(this, new AObserverS77S0100000_9(this, 11));
        }
        LivePreviewGuideEnterVM LJZI2 = LJZI();
        if (LJZI2 != null && (mutableLiveData = LJZI2.LJLJI) != null) {
            mutableLiveData.observe(this, new AObserverS77S0100000_9(this, 4));
        }
        if (C53254KvC.LIZ()) {
            C53839LBb c53839LBb = this.LJLILLLLZI;
            if (c53839LBb != null) {
                c53839LBb.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS35S0100000_15(this, 282)));
            }
            FeedLiveViewHolderVM LJZ2 = LJZ();
            if (LJZ2 != null && (nextLiveData2 = LJZ2.LJZ) != null) {
                nextLiveData2.observe(this, new AqS175S0100000_9(this, 638), true);
                return;
            }
            return;
        }
        FeedLiveViewHolderVM LJZ3 = LJZ();
        if (LJZ3 == null || (nextLiveData = LJZ3.LJZ) == null) {
            return;
        }
        nextLiveData.observe(this, new AObserverS77S0100000_9(this, 144));
    }
}
