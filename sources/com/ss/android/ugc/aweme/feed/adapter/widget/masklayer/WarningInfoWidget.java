package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C53254KvC;
import X.C53840LBc;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;

/* loaded from: classes16.dex */
public final class WarningInfoWidget extends LiveWatchPreviewWidget {
    public C53840LBc LJLILLLLZI;
    public final C5H3 LJLJI;

    public WarningInfoWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(MaskLayerAndWarningVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS165S0100000_15(LIZ, 353), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
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
            return R.layout.bq6;
        }
        return super.getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        this.LJLILLLLZI = (C53840LBc) findViewById(R.id.nh0);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Boolean> mutableLiveData;
        MaskLayerAndWarningVM maskLayerAndWarningVM = (MaskLayerAndWarningVM) this.LJLJI.getValue();
        if (maskLayerAndWarningVM != null && (mutableLiveData = maskLayerAndWarningVM.LJLJL) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 59));
        }
    }
}
