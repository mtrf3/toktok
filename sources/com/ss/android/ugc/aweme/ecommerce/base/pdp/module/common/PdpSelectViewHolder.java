package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common;

import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26662AdG;
import X.C26663AdH;
import X.C27516Ar2;
import X.C27517Ar3;
import X.C27518Ar4;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70445Rkn;
import X.C72545SdZ;
import X.C78565UsT;
import X.InterfaceC26837Ag5;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RelateProduct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpSelectViewHolder extends AbsFullSpanVH {
    public final Fragment LJLIL;
    public final C27517Ar3 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        trackTag(new C70445Rkn(getItem()));
        super.onResume();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        if (getItem() instanceof C26662AdG) {
            o.LJII(getItem(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.ProductSelectSkuVO");
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, false);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        InterfaceC26837Ag5 item = (InterfaceC26837Ag5) obj;
        o.LJIIIZ(item, "item");
        this.LJLILLLLZI.setDesc(null);
        this.LJLILLLLZI.setSubDesc(null);
        this.LJLILLLLZI.setSecondLineDescL2(null);
        this.LJLILLLLZI.setSecondLineDescL1(null);
        this.LJLILLLLZI.setSecondLineDescExtra(null);
        int dimensionPixelSize = this.LJLILLLLZI.getContext().getResources().getDimensionPixelSize(R.dimen.jw);
        this.LJLILLLLZI.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        boolean z = true;
        this.LJLILLLLZI.setBackIconVisibility(true);
        if (item instanceof C26663AdH) {
            this.LJLILLLLZI.setTitle(R.string.f3s);
            C27517Ar3 selectItem = this.LJLILLLLZI;
            o.LJIIIIZZ(selectItem, "selectItem");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 49), selectItem);
            return;
        }
        if (item instanceof C26662AdG) {
            this.LJLILLLLZI.setTitle(R.string.f3y);
            if (getViewModel().LJLLILLLL) {
                ujb.o.LJJJJJL(null);
                throw null;
            }
            C27517Ar3 selectItem2 = this.LJLILLLLZI;
            o.LJIIIIZZ(selectItem2, "selectItem");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 50), selectItem2);
            ujb.o.LJJJJJL(null);
            throw null;
        }
        if (!(item instanceof C27516Ar2)) {
            return;
        }
        C27517Ar3 c27517Ar3 = this.LJLILLLLZI;
        C27516Ar2 c27516Ar2 = (C27516Ar2) item;
        String str = c27516Ar2.LJLIL.title;
        if (str == null) {
            str = "";
        }
        c27517Ar3.setTitle(str);
        c27517Ar3.setDescColorRes(R.attr.eb);
        c27517Ar3.setDesc(c27516Ar2.LJLIL.buttonText);
        TuxTextView desc = c27517Ar3.getDesc();
        if (desc != null) {
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 51), desc);
        }
        List<RelateProduct> list = c27516Ar2.LJLIL.relateProducts;
        AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(this, item, 288);
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            View select_item_relate_products = c27517Ar3._$_findCachedViewById(R.id.jlj);
            o.LJIIIIZZ(select_item_relate_products, "select_item_relate_products");
            select_item_relate_products.setVisibility(8);
        } else {
            View select_item_relate_products2 = c27517Ar3._$_findCachedViewById(R.id.jlj);
            o.LJIIIIZZ(select_item_relate_products2, "select_item_relate_products");
            select_item_relate_products2.setVisibility(0);
            C78565UsT.LJJIJLIJ(c27517Ar3, new C27518Ar4(c27517Ar3, list, aqS135S0200000_4, null));
        }
        TuxTextView title = c27517Ar3.getTitle();
        if (title != null) {
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 52), title);
        }
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 53), c27517Ar3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpSelectViewHolder(ViewGroup viewGroup, ECBaseFragment eCBaseFragment) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a46, viewGroup, false));
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "parent");
        this.LJLIL = eCBaseFragment;
        this.LJLILLLLZI = (C27517Ar3) this.itemView.findViewById(R.id.jlc);
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 195));
    }
}
