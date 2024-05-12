package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend;

import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26706Ady;
import X.C27570Aru;
import X.C32151Nz;
import X.C45804HyK;
import X.C5H3;
import X.C61878OQg;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70296RiO;
import X.C70298RiQ;
import X.C70299RiR;
import X.C70858RrS;
import X.C70941Rsn;
import X.C72545SdZ;
import X.C78915Uy7;
import X.C78946Uyc;
import X.C78948Uye;
import X.InterfaceC71003Rtn;
import X.O6R;
import X.OUP;
import Y.IDrS50S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes13.dex */
public final class PdpShopRecommendVH extends AbsFullSpanVH implements InterfaceC71003Rtn, c {
    public static final C70299RiR Companion = new C70299RiR();
    public Map<Integer, View> _$_findViewCache;
    public final ECBaseFragment fragment;
    public boolean hasReport;
    public int scrollState;
    public int scrollX;
    public C70296RiO shopAdapter;
    public String slideType;
    public final C5H3 style$delegate;
    public final C5H3 vm$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final IShopRecommendStyle getStyle() {
        return (IShopRecommendStyle) this.style$delegate.getValue();
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    @Override // X.InterfaceC71003Rtn
    public InterfaceC71003Rtn preTrackNode() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return C78948Uye.LJIILIIL(itemView);
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onCreate() {
        super.onCreate();
        this.shopAdapter = new C70296RiO(getVm(), this.fragment, getStyle());
        ((RecyclerView) this.itemView.findViewById(R.id.j_d)).setAdapter(this.shopAdapter);
        ((RecyclerView) this.itemView.findViewById(R.id.j_d)).LJIIJJI(new IDrS50S0100000_12(this, 3));
    }

    public final ECBaseFragment getFragment() {
        return this.fragment;
    }

    @Override // X.InterfaceC71003Rtn
    public List<String> getRegisteredLane() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, new AqS178S0100000_12(this, 127));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(ShopRecommendVO item) {
        boolean z;
        List<ProductData> list;
        o.LJIIIZ(item, "item");
        String str = item.modelTitle;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((TextView) this.itemView.findViewById(R.id.mo6)).setText(this.itemView.getContext().getResources().getString(R.string.fc6));
        } else {
            ((TextView) this.itemView.findViewById(R.id.mo6)).setText(item.modelTitle);
        }
        ((TuxTextView) this.itemView.findViewById(R.id.mo6)).setTuxFont(getStyle().getTitleFont());
        ((TuxTextView) this.itemView.findViewById(R.id.mo6)).setTextColorRes(getStyle().getTitleTextColor());
        TextView textView = (TextView) this.itemView.findViewById(R.id.mqb);
        String str2 = item.enterName;
        if (str2 == null) {
            str2 = "";
        }
        textView.setText(str2);
        ShopRecommendData shopRecommendData = item.shopRecommendData;
        if (shopRecommendData != null) {
            list = shopRecommendData.productList;
        } else {
            list = null;
        }
        if (list != null) {
            View findViewById = this.itemView.findViewById(R.id.j_d);
            o.LJIIIIZZ(findViewById, "itemView.rv_product");
            findViewById.setVisibility(0);
            View findViewById2 = this.itemView.findViewById(R.id.k24);
            o.LJIIIIZZ(findViewById2, "itemView.skeleton_layout");
            findViewById2.setVisibility(8);
            C70296RiO c70296RiO = this.shopAdapter;
            if (c70296RiO != null) {
                ShopRecommendData shopRecommendData2 = item.shopRecommendData;
                List<ProductData> data = shopRecommendData2.productList;
                String str3 = shopRecommendData2.requestId;
                o.LJIIIZ(data, "data");
                c70296RiO.LJLJJI = data;
                c70296RiO.LJLJJL = str3;
                c70296RiO.notifyDataSetChanged();
            }
        } else {
            View findViewById3 = this.itemView.findViewById(R.id.j_d);
            o.LJIIIIZZ(findViewById3, "itemView.rv_product");
            findViewById3.setVisibility(8);
            View findViewById4 = this.itemView.findViewById(R.id.k24);
            o.LJIIIIZZ(findViewById4, "itemView.skeleton_layout");
            findViewById4.setVisibility(0);
            PdpViewModel vm = getVm();
            View view = this.itemView;
            if (!vm.LLLIZZ) {
                vm.LLLIZZ = true;
                vm.withState(new AqS143S0200000_12(view, vm, 12));
            }
        }
        View findViewById5 = this.itemView.findViewById(R.id.lfb);
        o.LJIIIIZZ(findViewById5, "itemView.top_layout");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(item, this, 12, 42), findViewById5);
        if (!this.hasReport) {
            this.hasReport = true;
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJZLJL(itemView, new C70941Rsn(), C70298RiQ.LJLIL, new AqS178S0100000_12(this, 128));
        }
        if (getStyle().getBigArrowIcon()) {
            View id_tiv_arrow = _$_findCachedViewById(R.id.edd);
            o.LJIIIIZZ(id_tiv_arrow, "id_tiv_arrow");
            C27570Aru.LJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), id_tiv_arrow);
            ((TuxIconView) _$_findCachedViewById(R.id.edd)).setTintColorRes(R.attr.gx);
        }
        C45804HyK.LJJLIIIJ(getStyle().getProductMarginTop(), _$_findCachedViewById(R.id.j_d));
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        OUP.LJJJJJL(getStyle().getPaddingTop(), itemView2);
        View itemView3 = this.itemView;
        o.LJIIIIZZ(itemView3, "itemView");
        C26508Aam.LIZ(itemView3, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpShopRecommendVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4d, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        this.slideType = "";
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 68));
        this.style$delegate = C221108m2.LIZIZ(new AqS162S0100000_12(this, 366));
    }
}
