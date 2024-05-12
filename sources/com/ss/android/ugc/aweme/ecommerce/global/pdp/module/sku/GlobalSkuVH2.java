package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku;

import X.C03090Af;
import X.C221108m2;
import X.C26706Ady;
import X.C45804HyK;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70064Ree;
import X.C70216Rh6;
import X.C70236RhQ;
import X.C70243RhX;
import X.C70248Rhc;
import X.InterfaceC70059ReZ;
import X.RWJ;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.style.ISpecListLayoutStyle;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.ecommerce.core.view.speclayoutv2.SpecListLayoutV2;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class GlobalSkuVH2 extends PdpHolder implements InterfaceC70059ReZ, c {
    public Map<Integer, View> _$_findViewCache;
    public final ECBaseFragment fragment;
    public final C5H3 skuWidgetStyle$delegate;
    public final C5H3 style$delegate;
    public final C5H3 vm$delegate;
    public static final C70236RhQ Companion = new C70236RhQ();
    public static final float NORMAL_BOTTOM_MARGIN = C45804HyK.LJJ(32);
    public static final float LAST_BOTTOM_MARGIN = C45804HyK.LJJ(24);

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public boolean needDivider() {
        return false;
    }

    @Override // X.InterfaceC70059ReZ
    public void onSpecItemBind(View view, int i, int i2, C70216Rh6 c70216Rh6) {
    }

    @Override // X.InterfaceC70059ReZ
    public void onSpecLayoutBind(C70248Rhc c70248Rhc, int i, List<C70216Rh6> list) {
    }

    @Override // X.InterfaceC70059ReZ
    public void onSpecListLayoutBind(SpecListLayoutV2 specListLayoutV2, RWJ vo) {
        o.LJIIIZ(vo, "vo");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final ISpecListLayoutStyle getSkuWidgetStyle() {
        return (ISpecListLayoutStyle) this.skuWidgetStyle$delegate.getValue();
    }

    public final IGlobalSkuStyle getStyle() {
        return (IGlobalSkuStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    public final ECBaseFragment getFragment() {
        return this.fragment;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(RWJ item) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        o.LJIIIZ(item, "item");
        getVm();
        ((SpecListLayoutV2) _$_findCachedViewById(R.id.k9c)).bindData(item, new C70243RhX(getSkuWidgetStyle(), "product_detail", this.fragment), this);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.k9c).getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.topMargin = getStyle().getFirstSpecMarginTop();
        }
    }

    @Override // X.InterfaceC70059ReZ
    public void onSizeGuideClick(SizeGuide sizeGuide) {
        HashMap<String, Object> hashMap;
        FragmentManager requireFragmentManager = this.fragment.requireFragmentManager();
        o.LJIIIIZZ(requireFragmentManager, "fragment.requireFragmentManager()");
        Context requireContext = this.fragment.requireContext();
        o.LJIIIIZZ(requireContext, "fragment.requireContext()");
        ECBaseFragment eCBaseFragment = this.fragment;
        IPdpStarter.PdpEnterParam pdpEnterParam = getVm().LJLJJLL;
        if (pdpEnterParam != null) {
            hashMap = pdpEnterParam.getTrackParams();
        } else {
            hashMap = null;
        }
        C70064Ree.LIZIZ(requireFragmentManager, requireContext, eCBaseFragment, hashMap, sizeGuide);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSkuVH2(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a2l);
        this._$_findViewCache = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.fragment = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 105));
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 529));
        this.skuWidgetStyle$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 528));
    }

    @Override // X.InterfaceC70059ReZ
    public void onSpecChecked(View view, int i, int i2, C70216Rh6 c70216Rh6, boolean z) {
        String str;
        o.LJIIIZ(view, "view");
        PdpViewModel vm = getVm();
        if (c70216Rh6 == null || (str = c70216Rh6.LIZ) == null) {
            str = "";
        }
        vm.qx0(i, i2, str, null);
    }
}
