package com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.discount;

import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26692Adk;
import X.C26693Adl;
import X.C27724AuO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70920RsS;
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
public final class TtfDiscountVH extends ECJediViewHolder {
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

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
    }

    public TtfDiscountVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 108));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C27724AuO item = (C27724AuO) obj;
        o.LJIIIZ(item, "item");
        View view = this.LJLIL;
        boolean LIZ = C26692Adk.LIZ();
        TextView platform_discounts = (TextView) _$_findCachedViewById(R.id.hrc);
        o.LJIIIIZZ(platform_discounts, "platform_discounts");
        OUP.LJJLIIIJILLIZJL(platform_discounts, item.LIZ);
        View platform_discounts_layout = _$_findCachedViewById(R.id.hrd);
        o.LJIIIIZZ(platform_discounts_layout, "platform_discounts_layout");
        C16880lQ.LJIIJ(new Au2S1S0310000_4(this, item, view, LIZ, 4), platform_discounts_layout);
        C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C26693Adl.LJLIL, new AqS28S0210000_4(item, this, LIZ, 13));
        int i = 8;
        if ((!item.LJ.isEmpty()) && LIZ) {
            View tv_free_shipping = _$_findCachedViewById(R.id.m78);
            o.LJIIIIZZ(tv_free_shipping, "tv_free_shipping");
            tv_free_shipping.setVisibility(8);
            return;
        }
        View tv_free_shipping2 = _$_findCachedViewById(R.id.m78);
        o.LJIIIIZZ(tv_free_shipping2, "tv_free_shipping");
        if (item.LIZJ) {
            i = 0;
        }
        tv_free_shipping2.setVisibility(i);
        TextView textView = (TextView) _$_findCachedViewById(R.id.m78);
        String str = item.LJFF;
        if (str == null) {
            str = view.getContext().getString(R.string.f43);
        }
        textView.setText(str);
    }
}
