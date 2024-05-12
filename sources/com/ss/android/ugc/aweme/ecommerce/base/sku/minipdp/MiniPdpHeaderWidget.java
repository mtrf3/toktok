package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C16880lQ;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70332Riy;
import X.C70341Rj7;
import X.C70372Rjc;
import X.C70659RoF;
import X.C73156SnQ;
import X.InterfaceC69848RbA;
import X.TBT;
import Y.ACListenerS32S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpHeaderViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;

/* loaded from: classes13.dex */
public final class MiniPdpHeaderWidget extends SkuPanelBaseWidget {
    public final WidgetLifecycleAwareLazy LJLILLLLZI;
    public boolean LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C70372Rjc LJLJJLL;
    public final Map<Integer, View> LJLJL = new LinkedHashMap();
    public final int LJLIL = R.layout.a0h;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public MiniPdpHeaderWidget() {
        C65776Prg LIZ = C65352Pkq.LIZ(MiniPdpHeaderViewModel.class);
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, LIZ, 19);
        this.LJLILLLLZI = new WidgetLifecycleAwareLazy(this, aqS159S0200000_12, new AqS72S0400000_12(this, aqS159S0200000_12, LIZ, C70332Riy.INSTANCE, 11));
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 477));
        this.LJLJJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 476));
        C70372Rjc c70372Rjc = new C70372Rjc(this);
        c70372Rjc.setShowFooter(false);
        this.LJLJJLL = c70372Rjc;
    }

    public final RecyclerView LIZ() {
        return (RecyclerView) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initSubscribe() {
        if (this.LJLJI) {
            return;
        }
        this.LJLJI = true;
        MiniPdpHeaderViewModel miniPdpHeaderViewModel = (MiniPdpHeaderViewModel) this.LJLILLLLZI.getValue();
        InterfaceC69848RbA interfaceC69848RbA = (InterfaceC69848RbA) this.LJLJJI.getValue();
        miniPdpHeaderViewModel.LJLJL = interfaceC69848RbA;
        if (interfaceC69848RbA != null) {
            interfaceC69848RbA.tN(new AqS178S0100000_12(miniPdpHeaderViewModel, 344));
            interfaceC69848RbA.vs0(new AqS178S0100000_12(miniPdpHeaderViewModel, 345));
        }
        JediViewModel jediViewModel = (JediViewModel) this.LJLILLLLZI.getValue();
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rat
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpHeaderViewModel.MiniPdpHeaderState) obj).getImages();
            }
        }, new AqS194S0100000_12(this, 166));
        C73156SnQ.LJIIIIZZ(this, jediViewModel, new TBT() { // from class: X.Rap
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpHeaderViewModel.MiniPdpHeaderState) obj).getOpenGalleryEvent();
            }
        }, new AqS192S0100000_10(this, 21));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public final void initView() {
        RecyclerView LIZ = LIZ();
        LIZ().getContext();
        LIZ.setLayoutManager(new LinearLayoutManager(0, false));
        LIZ().setAdapter(this.LJLJJLL);
        LIZ().LJIIJJI(new C70341Rj7(this));
        LIZ().LJII(new C70659RoF(), -1);
        View findView = findView(R.id.k3_);
        if (findView != null) {
            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 50), findView);
        }
    }

    @Override // com.bytedance.widget.Widget
    public final int getLayoutId() {
        return this.LJLIL;
    }
}
