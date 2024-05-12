package com.ss.android.ugc.aweme.feed.adapter.widget.ad;

import X.C221108m2;
import X.C47622ImY;
import X.C47623ImZ;
import X.C59406NTe;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C86343Xud;
import X.InterfaceC37276Ek4;
import X.InterfaceC59337NQn;
import X.InterfaceC65350Pko;
import X.XJ8;
import Y.AObserverS78S0100000_10;
import Y.ARunnableS46S0100000_10;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.ViewHolderStatusVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LiveAdCardModel;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class AdCardWidget extends LiveWatchPreviewWidget implements Observer {
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 221));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 223));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS160S0100000_10(this, 219));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 220));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS160S0100000_10(this, 222));
    public InterfaceC37276Ek4<LiveAdCardModel> LJLJL;
    public final C5H3 LJLJLJ;
    public boolean LJLJLLL;

    public AdCardWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(ViewHolderStatusVM.class);
        this.LJLJLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, LIZ, XJ8.WIDGET, new AqS160S0100000_10((InterfaceC65350Pko) LIZ, 224), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
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

    public final InterfaceC59337NQn LJZ() {
        return (InterfaceC59337NQn) this.LJLJJL.getValue();
    }

    public final LinearLayout LJZI() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-mLiveStyle2Container>(...)");
        return (LinearLayout) value;
    }

    public final void LJZL() {
        Aweme aweme;
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null) {
            aweme = LJLZ.LIZ;
        } else {
            aweme = null;
        }
        if (!C59406NTe.LJIILIIL(aweme) || !this.LJLJLLL) {
            return;
        }
        LJZI().animate().translationY(0.0f).setDuration(360L).setStartDelay(250L).start();
        int childCount = LJZI().getChildCount();
        for (int i = 0; i < childCount; i++) {
            LJZI().getChildAt(i).animate().alpha(1.0f).setDuration(200L).setStartDelay(450L).start();
        }
        this.LJLJLLL = false;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String str;
        C47622ImY c47622ImY = (C47622ImY) obj;
        C86343Xud LJLZ = LJLZ();
        if (LJLZ != null && LJLZ.LJFF) {
            C86343Xud LJLZ2 = LJLZ();
            Aweme aweme = null;
            if (LJLZ2 != null) {
                aweme = LJLZ2.LIZ;
            }
            if (!C59406NTe.LJIILIIL(aweme) || c47622ImY == null || (str = c47622ImY.LIZ) == null) {
                return;
            }
            int hashCode = str.hashCode();
            if (hashCode != 97530138) {
                if (hashCode != 97857237 || !str.equals("ad_live_card_show") || this.LJLJLLL) {
                    return;
                }
                Object value = this.LJLILLLLZI.getValue();
                o.LJIIIIZZ(value, "<get-mAdCardContainer>(...)");
                ((View) value).post(new ARunnableS46S0100000_10(this, 0));
                return;
            }
            if (!str.equals("ad_live_card_hide")) {
                return;
            }
            LJZL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C76800UCe> mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2;
        MutableLiveData<C76800UCe> mutableLiveData3;
        ViewHolderStatusVM viewHolderStatusVM = (ViewHolderStatusVM) this.LJLJLJ.getValue();
        if (viewHolderStatusVM != null && (mutableLiveData3 = viewHolderStatusVM.LJLJI) != null) {
            mutableLiveData3.observe(this, new AObserverS78S0100000_10(this, 27));
        }
        ViewHolderStatusVM viewHolderStatusVM2 = (ViewHolderStatusVM) this.LJLJLJ.getValue();
        if (viewHolderStatusVM2 != null && (mutableLiveData2 = viewHolderStatusVM2.LJLJL) != null) {
            mutableLiveData2.observe(this, new AObserverS78S0100000_10(this, 28));
        }
        ViewHolderStatusVM viewHolderStatusVM3 = (ViewHolderStatusVM) this.LJLJLJ.getValue();
        if (viewHolderStatusVM3 != null && (mutableLiveData = viewHolderStatusVM3.LJLJLJ) != null) {
            mutableLiveData.observe(this, new AObserverS78S0100000_10(this, 29));
        }
        ((C47623ImZ) this.LJLJJLL.getValue()).LIZ("ad_live_card_hide", this);
        ((C47623ImZ) this.LJLJJLL.getValue()).LIZ("ad_live_card_show", this);
    }
}
