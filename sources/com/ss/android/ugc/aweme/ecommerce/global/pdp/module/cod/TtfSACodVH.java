package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.cod;

import X.C16880lQ;
import X.C26508Aam;
import X.C26627Ach;
import X.C26628Aci;
import X.C26630Ack;
import X.C32151Nz;
import X.C44878HjO;
import X.C62850Ola;
import X.C72545SdZ;
import X.C78946Uyc;
import X.O6R;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfSACodVH extends AbsFullSpanVH {
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfSACodVH(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a8h, viewGroup, false));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26630Ack item = (C26630Ack) obj;
        o.LJIIIZ(item, "item");
        ((TextView) _$_findCachedViewById(R.id.mo6)).setText(((C26630Ack) getItem()).LIZ);
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.hka);
        ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.hka).getLayoutParams();
        layoutParams.height = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        layoutParams.width = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        tuxIconView.setLayoutParams(layoutParams);
        tuxIconView.setTintColorRes(R.attr.gx);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 122, 42), itemView);
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C26628Aci.LJLIL, C26627Ach.LJLIL);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, item.LJ);
    }
}
