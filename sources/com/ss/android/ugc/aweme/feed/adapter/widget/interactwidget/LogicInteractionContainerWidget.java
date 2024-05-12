package com.ss.android.ugc.aweme.feed.adapter.widget.interactwidget;

import X.C28423BDn;
import X.C32537Cpp;
import X.C53254KvC;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C86332XuS;
import X.C86343Xud;
import X.C86350Xuk;
import X.XJ8;
import Y.AObserverS82S0100000_14;
import Y.AObserverS83S0100000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.ab.PreviewGuideData;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.BottomTipsWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedCardWidgetV1;
import com.ss.android.ugc.aweme.feed.adapter.widget.EcLiveFeedCardWidgetV2;
import com.ss.android.ugc.aweme.feed.adapter.widget.GiftEffectWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.InteractionContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LabelContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.LiveInfoContainerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.NameWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ReportWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.SCMLabelWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ShowInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.bc.BcToggleInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.PreviewEnterRoomGuideWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerAndWarningVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.MaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.ReportPreviewMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.SubscribeMaskLayerWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.WarningInfoWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.subscribe.SubscribeMaskLayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.pause.LivePreviewPausedWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.share.ShareWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBarBlockWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class LogicInteractionContainerWidget extends LiveWatchPreviewWidget {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final MaskLayerWidget LJLJL;
    public final SubscribeMaskLayerWidget LJLJLJ;
    public final ShowInfoWidget LJLJLLL;

    public LogicInteractionContainerWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 338);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLILLLLZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 339), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(MaskLayerAndWarningVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 340), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS165S0100000_15(LIZ4, 341), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ5 = C65352Pkq.LIZ(SubscribeMaskLayerVM.class);
        this.LJLJJLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ5, xj8, new AqS165S0100000_15(LIZ5, 342), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LJLJL = new MaskLayerWidget();
        this.LJLJLJ = new SubscribeMaskLayerWidget();
        this.LJLJLLL = new ShowInfoWidget();
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

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bpy;
        }
        return super.getLayoutId();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    public final void LJZ(boolean z) {
        LiveRoomStruct liveRoomStruct;
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null && (liveRoomStruct = LJLZ.LIZIZ) != null) {
            liveRoomStruct.allowPreviewTime = 0L;
        }
        ((C32537Cpp) this.dataChannel.gv0(C28423BDn.class)).LIZ = Boolean.valueOf(z);
        if (!this.LJLJLJ.isInitialized()) {
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(R.id.fwt, this.LJLJLJ);
                return;
            }
            return;
        }
        this.LJLJLJ.LJZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<C86350Xuk> mutableLiveData2;
        NextLiveData nextLiveData;
        MutableLiveData<Boolean> mutableLiveData3;
        MutableLiveData<Boolean> mutableLiveData4;
        enableSubWidgetManager();
        this.subWidgetManager.createWidget(findViewById(R.id.dsq), new GiftEffectWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.dck), new InteractionContainerWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.ma9), new NameWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.n4i), new VideoBottomBarBlockWidget());
        this.subWidgetManager.createWidget(findViewById(R.id.fwg), new EcLiveFeedCardWidgetV1());
        this.subWidgetManager.createWidget(findViewById(R.id.fwh), new EcLiveFeedCardWidgetV2());
        this.subWidgetManager.load(R.id.i36, new LivePreviewPausedWidget());
        this.subWidgetManager.load(R.id.i1t, new AdPreviewWidget());
        this.subWidgetManager.load(R.id.i3o, new SCMLabelWidget());
        this.subWidgetManager.load(R.id.i23, new BottomTipsWidget());
        this.subWidgetManager.load(R.id.i3m, new ReportWidget());
        this.subWidgetManager.load(R.id.i3b, new TitleWidget());
        this.subWidgetManager.load(R.id.i20, new BcToggleInfoWidget());
        this.subWidgetManager.load(R.id.i38, new LiveInfoContainerWidget());
        this.subWidgetManager.load(R.id.i3v, new WarningInfoWidget());
        this.subWidgetManager.load(R.id.i32, new LabelContainerWidget());
        this.subWidgetManager.load(R.id.i3a, new ShareWidget());
        this.subWidgetManager.load(R.id.fwv, new ReportPreviewMaskLayerWidget());
        C86332XuS.LIZ.getClass();
        if (((PreviewGuideData) C86332XuS.LIZJ.getValue()).style > 0) {
            PreviewEnterRoomGuideWidget previewEnterRoomGuideWidget = new PreviewEnterRoomGuideWidget();
            this.subWidgetManager.load(R.id.d7q, previewEnterRoomGuideWidget);
            LivePreviewGuideEnterVM livePreviewGuideEnterVM = (LivePreviewGuideEnterVM) this.LJLJJL.getValue();
            if (livePreviewGuideEnterVM != null && (mutableLiveData4 = livePreviewGuideEnterVM.LJLILLLLZI) != null) {
                mutableLiveData4.observe(this, new AObserverS82S0100000_14(previewEnterRoomGuideWidget, 0));
            }
        }
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLJJI.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData3 = maskLayerAndWarningVM.LJLJJL) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 1));
        }
        SubscribeMaskLayerVM subscribeMaskLayerVM = (SubscribeMaskLayerVM) this.LJLJJLL.getValue();
        if (subscribeMaskLayerVM != null && (nextLiveData = subscribeMaskLayerVM.LJLILLLLZI) != null) {
            nextLiveData.observe(this, new AObserverS83S0100000_15(this, 2));
        }
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LJLILLLLZI.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData2 = livePreviewPlayerVM.LJLJJI) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 3));
        }
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData = viewHolderStatusVM.LJLJI) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 46));
        }
    }
}
