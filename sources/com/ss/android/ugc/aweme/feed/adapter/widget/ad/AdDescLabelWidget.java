package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C221108m2;
import X.C59948Nfs;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C7Z1;
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
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdDescLabelWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 226));
    public final C5H3 LJLJI;
    public final C62822Ol8 LJLJJI;

    public AdDescLabelWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 227), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
        this.LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 225));
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

    public final C7Z1 LJZ() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-adTagView>(...)");
        return (C7Z1) value;
    }

    public final C59948Nfs LJZI() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-mAdLiveDescLabel>(...)");
        return (C59948Nfs) value;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        MutableLiveData<C76800UCe> mutableLiveData2;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData2 = viewHolderStatusVM.LJLJLLL) != null) {
            mutableLiveData2.observe(this, new AObserverS78S0100000_10(this, 30));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJI.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData = viewHolderStatusVM2.LJLJL) != null) {
            mutableLiveData.observe(this, new AObserverS78S0100000_10(this, 31));
        }
    }
}
