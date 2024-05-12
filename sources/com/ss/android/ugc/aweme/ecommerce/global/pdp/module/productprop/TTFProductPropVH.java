package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.productprop;

import X.C119774mz;
import X.C16880lQ;
import X.C221108m2;
import X.C26624Ace;
import X.C26625Acf;
import X.C26626Acg;
import X.C44878HjO;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72545SdZ;
import X.C78946Uyc;
import X.C78977Uz7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPropertyItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TTFProductPropVH extends AbsFullSpanVH {
    public final C62822Ol8 LJLIL;
    public final int LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TTFProductPropVH(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a3p, viewGroup, false));
        this.LJLJI = C44878HjO.LIZIZ(viewGroup, "parent");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 98));
        this.LJLILLLLZI = 5;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        int i;
        ProductPropVO item = (ProductPropVO) obj;
        o.LJIIIZ(item, "item");
        ((TextView) _$_findCachedViewById(R.id.mo6)).setText(item.title);
        List<ProductPropertyItem> list = item.propItems;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        int i2 = this.LJLILLLLZI;
        if (i > i2) {
            if (list != null) {
                list = list.subList(0, i2);
            } else {
                list = null;
            }
        }
        ((C119774mz) _$_findCachedViewById(R.id.dj8)).setMaxTagLines(1);
        ViewGroup flow_layout = (ViewGroup) _$_findCachedViewById(R.id.dj8);
        o.LJIIIIZZ(flow_layout, "flow_layout");
        C78977Uz7.LJJIIJZLJL(flow_layout, list, new AqS170S0100000_4(this, 892), C26624Ace.LJLIL);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 18), itemView);
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C26626Acg.LJLIL, C26625Acf.LJLIL);
    }
}
