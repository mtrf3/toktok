package com.ss.android.ugc.aweme.ecommerce.global.osp.module.discount;

import X.C16880lQ;
import X.C221108m2;
import X.C26691Adj;
import X.C26692Adk;
import X.C27724AuO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70920RsS;
import X.C78857UxB;
import X.C78946Uyc;
import X.OUP;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S1S0310000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS28S0210000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalDiscountVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLILLLLZI.getValue();
    }

    public GlobalDiscountVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 88));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C27724AuO item = (C27724AuO) obj;
        o.LJIIIZ(item, "item");
        View view = this.LJLIL;
        boolean LIZ = C26692Adk.LIZ();
        TextView us_order_submit_discount_total = (TextView) _$_findCachedViewById(R.id.mw0);
        o.LJIIIIZZ(us_order_submit_discount_total, "us_order_submit_discount_total");
        OUP.LJJLIIIJILLIZJL(us_order_submit_discount_total, item.LIZ);
        if (C78857UxB.LJJJIL(item.LJI)) {
            ((TextView) _$_findCachedViewById(R.id.mvz)).setText(item.LJI);
        }
        View us_order_submit_discount_layout = _$_findCachedViewById(R.id.mvx);
        o.LJIIIIZZ(us_order_submit_discount_layout, "us_order_submit_discount_layout");
        C16880lQ.LJIIJ(new Au2S1S0310000_4(this, item, view, LIZ, 3), us_order_submit_discount_layout);
        C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C26691Adj.LJLIL, new AqS28S0210000_4(item, this, LIZ, 9));
    }
}
