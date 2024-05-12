package com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp;

import X.C221108m2;
import X.C26706Ady;
import X.C5H3;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70056ReW;
import X.C70149Rg1;
import X.C70243RhX;
import X.C73156SnQ;
import X.InterfaceC69848RbA;
import X.RWJ;
import X.TBT;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.widget.WidgetLifecycleAwareLazy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import com.ss.android.ugc.aweme.ecommerce.base.sku.BaseSkuFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpSkcViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.ttf.ITtfSkcStyle;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS72S0400000_12;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class MiniPdpSkcWidgetV2 extends SkuPanelBaseWidget implements c {
    public Map<Integer, View> _$_findViewCache;
    public final BaseSkuFragment fragment;
    public final int layoutId;
    public List<SaleProp> saleProps;
    public final C5H3 skcStyle$delegate;
    public final C5H3 skuContainerAbility$delegate;
    public final C5H3 skuStyle$delegate;
    public final WidgetLifecycleAwareLazy widgetViewModel$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget, com.ss.android.ugc.aweme.base.arch.JediBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final InterfaceC69848RbA getSkuContainerAbility() {
        return (InterfaceC69848RbA) this.skuContainerAbility$delegate.getValue();
    }

    private final ISpecListLayoutStyle getSkuStyle() {
        return (ISpecListLayoutStyle) this.skuStyle$delegate.getValue();
    }

    public final ITtfSkcStyle getSkcStyle() {
        return (ITtfSkcStyle) this.skcStyle$delegate.getValue();
    }

    public final MiniPdpSkcViewModel getWidgetViewModel() {
        return (MiniPdpSkcViewModel) this.widgetViewModel$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBaseWidget
    public void initSubscribe() {
        MiniPdpSkcViewModel widgetViewModel = getWidgetViewModel();
        InterfaceC69848RbA skuContainerAbility = getSkuContainerAbility();
        widgetViewModel.LJLJLJ = skuContainerAbility;
        if (skuContainerAbility != null) {
            skuContainerAbility.tN(new AqS143S0200000_12(widgetViewModel, skuContainerAbility, 70));
            skuContainerAbility.er(new AqS178S0100000_12(widgetViewModel, 347));
        }
        C73156SnQ.LJIIIIZZ(this, getWidgetViewModel(), new TBT() { // from class: X.RdC
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((MiniPdpSkcViewModel.SkcState) obj).getVo();
            }
        }, new AqS194S0100000_12(this, 81));
    }

    public final BaseSkuFragment getFragment() {
        return this.fragment;
    }

    @Override // com.bytedance.widget.Widget
    public int getLayoutId() {
        return this.layoutId;
    }

    public MiniPdpSkcWidgetV2(BaseSkuFragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(MiniPdpSkcViewModel.class);
        AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12(this, LIZ, 21);
        this.widgetViewModel$delegate = new WidgetLifecycleAwareLazy(this, aqS159S0200000_12, new AqS72S0400000_12(this, aqS159S0200000_12, LIZ, C70149Rg1.INSTANCE, 14));
        this.skuContainerAbility$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 487));
        this.layoutId = R.layout.a2l;
        this.saleProps = C61878OQg.INSTANCE;
        this.skcStyle$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 486));
        this.skuStyle$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 488));
    }

    public final void onBind(RWJ rwj) {
        List<SaleProp> list;
        List<SaleProp> list2 = rwj.LIZ;
        if (list2 == null) {
            list = C61878OQg.INSTANCE;
        } else {
            list = list2;
        }
        this.saleProps = list;
        if (list2 == null || rwj.LIZJ == null) {
            return;
        }
        ((SpecListLayoutV2) _$_findCachedViewById(R.id.k9c)).bindData(rwj, new C70243RhX(getSkuStyle(), "sku", this.fragment), new C70056ReW(this));
        MiniPdpSkcViewModel widgetViewModel = getWidgetViewModel();
        List<String> list3 = rwj.LJFF;
        widgetViewModel.getClass();
        if (list3 == null) {
            return;
        }
        widgetViewModel.setState(new AqS143S0200000_12(widgetViewModel, (MiniPdpSkcViewModel) list3, (List<String>) 68));
    }
}
