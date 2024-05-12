package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C04330Ez;
import X.C15380j0;
import X.C221108m2;
import X.C53254KvC;
import X.C5H3;
import X.C62822Ol8;
import X.C62846OlW;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C86343Xud;
import X.C86361Xuv;
import X.InterfaceC65350Pko;
import X.KL2;
import X.ONY;
import X.OO3;
import X.OO9;
import X.OU0;
import X.XJ8;
import Y.AObserverS78S0100000_10;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.live.model.LivePreviewCardMaskConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreViewMaskSettings;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.guide.LivePreviewGuideEnterVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class BgWidget extends LiveWatchPreviewWidget {
    public OO3 LJLLL;
    public final C5H3 LJLLLLLL;
    public final C5H3 LJLZ;
    public final C5H3 LJZ;
    public final C5H3 LJZI;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 199));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 195));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 192));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 191));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 197));
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 196));
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 198));
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 194));
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 193));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 190));
    public final C62822Ol8 LJLLILLLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 204));
    public final C62822Ol8 LJLLJ = C221108m2.LIZIZ(new AqS160S0100000_10(this, 205));
    public final C62822Ol8 LJLLLL = C221108m2.LIZIZ(OO9.LJLIL);

    public BgWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        AqS160S0100000_10 aqS160S0100000_10 = new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 200);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        XJ8 xj8 = XJ8.WIDGET;
        this.LJLLLLLL = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, xj8, aqS160S0100000_10, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C65776Prg LIZ2 = C65352Pkq.LIZ(FeedLiveViewHolderVM.class);
        this.LJLZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ2, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ2, 201), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ3 = C65352Pkq.LIZ(LivePreviewGuideEnterVM.class);
        this.LJZ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ3, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ3, 202), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C65776Prg LIZ4 = C65352Pkq.LIZ(LivePreviewPlayerVM.class);
        this.LJZI = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ4, xj8, new AqS160S0100000_10((InterfaceC65350Pko) LIZ4, 203), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
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

    public final C62846OlW LJZ() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-coverPauseFrontView>(...)");
        return (C62846OlW) value;
    }

    public final View LJZI() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mGradualBottomView>(...)");
        return (View) value;
    }

    public final LinearLayout LJZL() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-mLivePauseView>(...)");
        return (LinearLayout) value;
    }

    public final View LL() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-mLoadingView>(...)");
        return (View) value;
    }

    public final ONY LLF() {
        return (ONY) this.LJLLLL.getValue();
    }

    public final ViewHolderStatusVM LLFF() {
        return (ViewHolderStatusVM) this.LJLLLLLL.getValue();
    }

    public final void LLFFF(boolean z) {
        Aweme aweme;
        OO3 oo3 = this.LJLLL;
        if (oo3 != null) {
            oo3.LJIILIIL(z);
            if (z) {
                ONY LLF = LLF();
                ViewStub viewStub = (ViewStub) this.LJLLJ.getValue();
                Context context = this.context;
                C86343Xud LJLZ = LJLZ();
                if (LJLZ != null) {
                    aweme = LJLZ.LIZ;
                } else {
                    aweme = null;
                }
                LLF.LJIIJ(viewStub, context, aweme, (View) this.LJLLI.getValue(), null, null, null, oo3);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        int i;
        MutableLiveData<C86361Xuv> mutableLiveData;
        NextLiveData<Boolean> nextLiveData;
        FeedLiveViewHolderVM feedLiveViewHolderVM;
        MutableLiveData<OU0> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        MutableLiveData<C76800UCe> mutableLiveData4;
        MutableLiveData<Integer> mutableLiveData5;
        MutableLiveData<C76800UCe> mutableLiveData6;
        NextLiveData<Boolean> nextLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData7;
        LivePreviewCardMaskConfig value = LivePreViewMaskSettings.INSTANCE.getValue();
        if (value.getTopOptimized()) {
            if (C53254KvC.LIZ()) {
                Object value2 = this.LJLJJI.getValue();
                o.LJIIIIZZ(value2, "<get-gradualTopView>(...)");
                ((View) value2).setBackground(C15380j0.LJI(R.drawable.bp2));
            }
            Object value3 = this.LJLJJI.getValue();
            o.LJIIIIZZ(value3, "<get-gradualTopView>(...)");
            ((View) value3).setVisibility(0);
        }
        if (value.getBottomMaskHeight() == -1) {
            LJZI().getLayoutParams().height = (KL2.LJIIIZ(this.context) * 3) / 4;
        }
        if (value.getBottomMaskAlpha() == 0) {
            LJZI().getVisibility();
        } else if (value.getBottomMaskAlpha() != 50) {
            if (value.getBottomMaskAlpha() == 15) {
                i = R.color.a03;
            } else if (value.getBottomMaskAlpha() == 30) {
                i = R.color.a05;
            } else {
                i = R.color.c_;
            }
            LJZI().setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{C04330Ez.LIZIZ(this.context, i), C04330Ez.LIZIZ(this.context, R.color.cz)}));
        }
        ViewHolderStatusVM LLFF = LLFF();
        if (LLFF != null && (mutableLiveData7 = LLFF.LJLJI) != null) {
            mutableLiveData7.observe(this, new AObserverS78S0100000_10(this, 9));
        }
        ViewHolderStatusVM LLFF2 = LLFF();
        if (LLFF2 != null && (nextLiveData2 = LLFF2.LJLLI) != null) {
            nextLiveData2.observe(this, new AObserverS78S0100000_10(this, 10));
        }
        ViewHolderStatusVM LLFF3 = LLFF();
        if (LLFF3 != null && (mutableLiveData6 = LLFF3.LJLJLJ) != null) {
            mutableLiveData6.observe(this, new AObserverS78S0100000_10(this, 11));
        }
        ViewHolderStatusVM LLFF4 = LLFF();
        if (LLFF4 != null && (mutableLiveData5 = LLFF4.LJLJJI) != null) {
            mutableLiveData5.observe(this, new AObserverS78S0100000_10(this, 12));
        }
        ViewHolderStatusVM LLFF5 = LLFF();
        if (LLFF5 != null && (mutableLiveData4 = LLFF5.LJLJJL) != null) {
            mutableLiveData4.observe(this, new AObserverS78S0100000_10(this, 13));
        }
        ViewHolderStatusVM LLFF6 = LLFF();
        if (LLFF6 != null && (mutableLiveData3 = LLFF6.LJLILLLLZI) != null) {
            mutableLiveData3.observe(this, new AObserverS78S0100000_10(this, 14));
        }
        if (!C53254KvC.LIZ() && (feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LJLZ.getValue()) != null && (mutableLiveData2 = feedLiveViewHolderVM.LJZL) != null) {
            mutableLiveData2.observe(this, new AObserverS78S0100000_10(this, 15));
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM2 = (FeedLiveViewHolderVM) this.LJLZ.getValue();
        if (feedLiveViewHolderVM2 != null && (nextLiveData = feedLiveViewHolderVM2.LLD) != null) {
            nextLiveData.observe(this, new AObserverS78S0100000_10(this, 16));
        }
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LJZI.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData = livePreviewPlayerVM.LJLILLLLZI) != null) {
            mutableLiveData.observe(this, new AObserverS78S0100000_10(this, 17));
        }
    }
}
