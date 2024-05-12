package com.ss.android.ugc.aweme.feed.adapter.widget.bc;

import X.AnonymousClass391;
import X.C221108m2;
import X.C32151Nz;
import X.C53254KvC;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C7MY;
import X.C86343Xud;
import X.O6R;
import X.XJ8;
import Y.AObserverS83S0100000_15;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class BcToggleInfoWidget extends LiveWatchPreviewWidget {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 315));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS165S0100000_15(this, 316));
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public ViewPropertyAnimator LJLJJLL;

    public BcToggleInfoWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 317);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLJJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS165S0100000_15, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLJJL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS165S0100000_15(LIZ2, 318), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
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

    public final View LJZI() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-liveBcToggleInfoView>(...)");
        return (View) value;
    }

    public final View LJZL() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-liveHeatingLabelView>(...)");
        return (View) value;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        if (C53254KvC.LIZ()) {
            return R.layout.bpw;
        }
        return super.getLayoutId();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Integer> mutableLiveData;
        NextLiveData<Boolean> nextLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJJI.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData2 = viewHolderStatusVM.LJLJL) != null) {
            mutableLiveData2.observe(this, new AObserverS83S0100000_15(this, 38));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLJJL.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LJZ) != null) {
            nextLiveData.observe(this, new AqS181S0100000_15(this, 57), C53254KvC.LIZ());
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LJLJJL.getValue();
        if (feedLiveViewHolderVM2 != null && (mutableLiveData = feedLiveViewHolderVM2.LLF) != null) {
            mutableLiveData.observe(this, new AObserverS83S0100000_15(this, 39));
        }
    }

    public final boolean LJZ(View view, TuxTextView tuxTextView) {
        LiveRoomStruct liveRoomStruct;
        C86343Xud LJLZ = LJLZ();
        boolean z = true;
        if (LJLZ == null || (liveRoomStruct = LJLZ.LIZIZ) == null || !liveRoomStruct.hasCommerceGoods) {
            return false;
        }
        if (ECommerceAnchorService.LJJJJI().LJJIJIL()) {
            tuxTextView.setTuxFont(92);
            view.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), AnonymousClass391.LIZ(1.5d), C7MY.LIZIZ(4), O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(1.5d))));
            view.setBackgroundResource(R.drawable.a7i);
        } else {
            z = false;
        }
        if (ECommerceAnchorService.LJJJJI().LJJ()) {
            view.setBackgroundResource(R.drawable.a7h);
        }
        return z;
    }
}
