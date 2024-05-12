package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.productinfo;

import X.C221108m2;
import X.C27539ArP;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69687RWp;
import X.C70086Rf0;
import X.C70112RfQ;
import X.C70445Rkn;
import X.C70521Rm1;
import X.C70586Rn4;
import X.C70646Ro2;
import X.C72545SdZ;
import X.C73156SnQ;
import X.C78609UtB;
import X.InterfaceC88472Yns;
import X.TBT;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpInfoViewHolder extends AbsFullSpanVH {
    public final InterfaceC88472Yns<Integer, Object> LJLIL;
    public final CommerceProductInfoView LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return ((C69687RWp) getItem()).LJJIIJZLJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        FlashSale flashSale;
        Integer num;
        super.onCreate();
        this.LJLILLLLZI.setBizType(getViewModel().Wv0());
        getViewModel().Lv0(new AqS178S0100000_12(this, 125));
        ProductPackStruct productPackStruct = getViewModel().LJLJLLL;
        if ((productPackStruct == null || !C78609UtB.LJJJJJL(productPackStruct)) && (flashSale = ((C69687RWp) getItem()).LJIIJJI) != null && (num = flashSale.status) != null && num.intValue() == 1) {
            C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rn2
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((PdpMainState) obj).getFlashSaleCountDown();
                }
            }, new AqS194S0100000_12(this, 52));
        }
        C73156SnQ.LJIIIIZZ(this, getViewModel(), new TBT() { // from class: X.Rn3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getSkuSelectedIds();
            }
        }, new AqS194S0100000_12(this, 53));
        C73156SnQ.LJII(this, getViewModel(), new TBT() { // from class: X.Rn6
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((PdpMainState) obj).getShowFavoriteGuide();
            }
        }, new TBT() { // from class: X.Rn5
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((PdpMainState) obj).isFullScreen());
            }
        }, new IDqS436S0100000_12(this, 4));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        trackTag(new C70445Rkn(getItem()));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        Integer num;
        ProductPackStruct productPackStruct;
        C70646Ro2 c70646Ro2;
        C69687RWp item = (C69687RWp) obj;
        o.LJIIIZ(item, "item");
        FlashSale flashSale = item.LJIIJJI;
        if (flashSale != null && (num = flashSale.status) != null && num.intValue() == 1 && (((productPackStruct = getViewModel().LJLJLLL) == null || !C78609UtB.LJJJJJL(productPackStruct)) && (c70646Ro2 = getViewModel().LLFZ) != null)) {
            this.LJLILLLLZI.updateCountDown(flashSale, c70646Ro2.LIZIZ);
        }
        CommerceProductInfoView commerceProductInfoView = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = commerceProductInfoView.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 != null) {
            layoutParams2.height = -2;
            layoutParams2.width = -1;
            commerceProductInfoView.setLayoutParams(layoutParams2);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams3 = itemView.getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.LayoutParams) && layoutParams3 != null) {
            layoutParams3.height = -2;
            layoutParams3.width = -1;
            itemView.setLayoutParams(layoutParams3);
        }
        if (!getViewModel().LJLJL) {
            CommerceProductInfoView.bind$default(this.LJLILLLLZI, item, 1, this.latestItemPositionInternal, null, 8, null);
        } else {
            CommerceProductInfoView commerceProductInfoView2 = this.LJLILLLLZI;
            CommerceProductInfoView.bind$default(commerceProductInfoView2, item, commerceProductInfoView2.getStyle().getGoodDescMaxLine(), this.latestItemPositionInternal, null, 8, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PdpInfoViewHolder(ViewGroup viewGroup, InterfaceC88472Yns<? super Integer, ? extends Object> interfaceC88472Yns) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a3b, viewGroup, false));
        this.LJLJJL = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLIL = interfaceC88472Yns;
        View findViewById = this.itemView.findViewById(R.id.i5z);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.product_info_expand)");
        CommerceProductInfoView commerceProductInfoView = (CommerceProductInfoView) findViewById;
        this.LJLILLLLZI = commerceProductInfoView;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 53));
        C70112RfQ c70112RfQ = new C70112RfQ(this, viewGroup);
        C27539ArP c27539ArP = new C27539ArP(this);
        C70586Rn4 c70586Rn4 = new C70586Rn4(this);
        C70086Rf0 c70086Rf0 = new C70086Rf0(this);
        C70521Rm1 c70521Rm1 = new C70521Rm1(this, viewGroup);
        commerceProductInfoView.setCouponLogListener(c70112RfQ);
        commerceProductInfoView.setRatingListener(c27539ArP);
        commerceProductInfoView.setSalesInfoIconListener(c70521Rm1);
        commerceProductInfoView.setGetItem(interfaceC88472Yns);
        commerceProductInfoView.setFavoriteListener(c70586Rn4);
        commerceProductInfoView.setFreeReturnLogListener(c70086Rf0);
    }
}
