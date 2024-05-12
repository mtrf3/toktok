package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70153Rg5;
import X.C73156SnQ;
import X.InterfaceC69848RbA;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpTitleViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;

/* loaded from: classes13.dex */
public final class MiniPdpTitleWidget extends SkuPanelBaseWidget {
    public final WidgetLifecycleAwareLazy LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final int LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final Map<Integer, View> LJLLI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public MiniPdpTitleWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(MiniPdpTitleViewModel.class);
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, LIZ, 22);
        this.LJLIL = new WidgetLifecycleAwareLazy(this, aqS159S0200000_12, new AqS72S0400000_12(this, aqS159S0200000_12, LIZ, C70153Rg5.INSTANCE, 15));
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 491));
        this.LJLJI = R.layout.a0i;
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 490));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 496));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 489));
        this.LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 495));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 492));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 494));
        this.LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 493));
    }

    public final TuxTextView LIZ() {
        return (TuxTextView) this.LJLJL.getValue();
    }

    public final TuxTextView LIZIZ() {
        return (TuxTextView) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        MiniPdpTitleViewModel miniPdpTitleViewModel = (MiniPdpTitleViewModel) this.LJLIL.getValue();
        InterfaceC69848RbA interfaceC69848RbA = (InterfaceC69848RbA) this.LJLILLLLZI.getValue();
        miniPdpTitleViewModel.LJLJJLL = interfaceC69848RbA;
        if (interfaceC69848RbA != null) {
            interfaceC69848RbA.tN(new AqS143S0200000_12(miniPdpTitleViewModel, interfaceC69848RbA, 72));
            interfaceC69848RbA.vs0(new AqS178S0100000_12(miniPdpTitleViewModel, 349));
        }
        C16880lQ.LJIIL((ViewGroup) this.LJLJLLL.getValue(), new ACListenerS32S0100000_12(this, 51));
        JediViewModel jediViewModel = (JediViewModel) this.LJLIL.getValue();
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfo
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getDetailShow();
            }
        }, new AqS194S0100000_12(this, 88));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfp
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getOpenPDPEvent();
            }
        }, new AqS194S0100000_12(this, 89));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfk
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getPrice();
            }
        }, new AqS194S0100000_12(this, 90));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfr
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getPromotionView();
            }
        }, new AqS194S0100000_12(this, 91));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfq
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getMarketPrice();
            }
        }, new AqS194S0100000_12(this, 82));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfi
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getDiscount();
            }
        }, new AqS194S0100000_12(this, 83));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getLayoutVertical();
            }
        }, new AqS194S0100000_12(this, 84));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfj
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getTitle();
            }
        }, new AqS194S0100000_12(this, 85));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfm
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getShowCouponIcon();
            }
        }, new AqS194S0100000_12(this, 86));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rfn
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpTitleViewModel.TitleState) obj).getShowTitleByCouponStyle();
            }
        }, new AqS194S0100000_12(this, 87));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        LIZ().getPaint().setFlags(16);
        LIZ().getPaint().setAntiAlias(true);
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLJI;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.bytedance.widget.Widget
    public final void onCreate() {
        super.onCreate();
    }
}
