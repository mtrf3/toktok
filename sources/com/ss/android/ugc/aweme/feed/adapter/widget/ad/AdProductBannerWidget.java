package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C221108m2;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.InterfaceC59736NcS;
import X.InterfaceC65350Pko;
import X.XJ8;
import Y.AObserverS78S0100000_10;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import kotlin.jvm.internal.AqS160S0100000_10;

/* loaded from: classes11.dex */
public final class AdProductBannerWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 228));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 229));
    public final C5H3 LJLJJI;

    public AdProductBannerWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 230), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final InterfaceC59736NcS LJZI() {
        return (InterfaceC59736NcS) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        LJZI().release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0036, code lost:
    
        if (r5 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJZ(com.ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
            r4 = 0
            if (r5 == 0) goto L34
            boolean r0 = r5.isAd()
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L35
            r3 = 1
        L10:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r5.getAwemeRawAd()
            if (r0 == 0) goto L39
            int r0 = r0.getComponentType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r2 == 0) goto L39
            r1 = 3
            int r0 = r2.intValue()
            if (r0 == r1) goto L2e
            r1 = 4
            int r0 = r2.intValue()
            if (r0 != r1) goto L39
        L2e:
            r0 = 1
        L2f:
            if (r3 == 0) goto L34
            if (r0 == 0) goto L34
            r4 = 1
        L34:
            return r4
        L35:
            r3 = 0
            if (r5 == 0) goto L39
            goto L10
        L39:
            r0 = 0
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.ad.AdProductBannerWidget.LJZ(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        MutableLiveData<Integer> mutableLiveData3;
        MutableLiveData<C76800UCe> mutableLiveData4;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData4 = viewHolderStatusVM.LJLJI) != null) {
            mutableLiveData4.observe(this, new AObserverS78S0100000_10(this, 32));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData3 = viewHolderStatusVM2.LJLJL) != null) {
            mutableLiveData3.observe(this, new AObserverS78S0100000_10(this, 33));
        }
        ViewHolderStatusVM viewHolderStatusVM3 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM3 != null && (mutableLiveData2 = viewHolderStatusVM3.LJLJLJ) != null) {
            mutableLiveData2.observe(this, new AObserverS78S0100000_10(this, 34));
        }
        ViewHolderStatusVM viewHolderStatusVM4 = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM4 != null && (mutableLiveData = viewHolderStatusVM4.LJLILLLLZI) != null) {
            mutableLiveData.observe(this, new AObserverS78S0100000_10(this, 35));
        }
    }
}
