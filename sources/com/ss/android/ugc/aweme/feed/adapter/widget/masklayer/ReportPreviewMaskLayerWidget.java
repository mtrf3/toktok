package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C199097rd;
import X.C2U8;
import X.C53254KvC;
import X.C55045Liz;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72818Shy;
import X.C76800UCe;
import X.C86343Xud;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class ReportPreviewMaskLayerWidget extends LiveWatchPreviewWidget implements InterfaceC72822Si2 {
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    public ReportPreviewMaskLayerWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 347);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLILLLLZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 348), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS165S0100000_15(LIZ3, 349), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
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
        if (this.LJLJJLL) {
            C72818Shy.LJII("ttlive_report_preview", this);
            C72818Shy.LJII("ttlive_report_success", this);
            this.LJLJJLL = false;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bqk;
        }
        return super.getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<C76800UCe> nextLiveData;
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData4 = viewHolderStatusVM.LJLJL) != null) {
            mutableLiveData4.observe(this, new AObserverS83S0100000_15(this, 50));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData3 = viewHolderStatusVM2.LJLJLJ) != null) {
            mutableLiveData3.observe(this, new AObserverS83S0100000_15(this, 51));
        }
        ViewHolderStatusVM viewHolderStatusVM3 = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM3 != null && (mutableLiveData2 = viewHolderStatusVM3.LJLJJL) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 52));
        }
        ViewHolderStatusVM viewHolderStatusVM4 = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM4 != null && (mutableLiveData = viewHolderStatusVM4.LJLJJI) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 53));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLILLLLZI.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LJZI) != null) {
            nextLiveData.observe(this, new AObserverS83S0100000_15(this, 54));
        }
        hide();
        if (!this.LJLJJLL) {
            C72818Shy.LIZLLL("ttlive_report_preview", this);
            C72818Shy.LIZLLL("ttlive_report_success", this);
            this.LJLJJLL = true;
        }
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String str;
        Aweme aweme;
        if (!this.LJLJJL) {
            return;
        }
        String str2 = c199097rd.LJLIL;
        String str3 = null;
        if (o.LJ(str2, "ttlive_report_preview")) {
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null) {
                String string = interfaceC78280Uns2.getString("source");
                InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
                if (interfaceC78280Uns3 != null) {
                    str3 = interfaceC78280Uns3.getString("action");
                }
                if (TextUtils.equals(string, "anchor")) {
                    if (TextUtils.equals(str3, "hide")) {
                        show();
                        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LJLJJI.getValue();
                        if (livePreviewPlayerVM != null) {
                            livePreviewPlayerVM.setMute(true);
                            return;
                        }
                        return;
                    }
                    if (!TextUtils.equals(str3, "unhide")) {
                        return;
                    }
                    hide();
                    LivePreviewPlayerVM livePreviewPlayerVM2 = (LivePreviewPlayerVM) this.LJLJJI.getValue();
                    if (livePreviewPlayerVM2 == null) {
                        return;
                    }
                    livePreviewPlayerVM2.setMute(false);
                    return;
                }
                return;
            }
            return;
        }
        if (!o.LJ(str2, "ttlive_report_success") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
            return;
        }
        String string2 = interfaceC78280Uns.getString("source");
        InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns4 != null) {
            str = interfaceC78280Uns4.getString("action");
        } else {
            str = null;
        }
        if (!TextUtils.equals(string2, "anchor") || !TextUtils.equals(str, "remove")) {
            return;
        }
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        C86343Xud LJLZ2 = LJLZ();
        if (LJLZ2 != null) {
            str3 = LJLZ2.LIZLLL;
        }
        C2U8.LIZ(new C55045Liz(aweme, str3));
    }
}
