package com.ss.android.ugc.aweme.ecommerce.us.logistic.module;

import X.C16880lQ;
import X.C1FL;
import X.C221108m2;
import X.C27117Akb;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.ORZ;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USLogisticVH extends ECJediViewHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

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

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        LogisticLinkRichText logisticLinkRichText;
        LogisticDTO item = (LogisticDTO) obj;
        o.LJIIIZ(item, "item");
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.AhZ
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((DeliveryPanelState) obj2).getSelectedLogistic();
            }
        }, new AqS186S0100000_4(this, 338));
        withState((JediViewModel) this.LJLILLLLZI.getValue(), new AqS135S0200000_4(this, item, 325));
        List<LogisticLinkRichText> list = item.logisticRichTextList;
        if (list != null && (logisticLinkRichText = (LogisticLinkRichText) ORZ.LJLLLL(list)) != null) {
            C27117Akb c27117Akb = (C27117Akb) _$_findCachedViewById(R.id.mvc);
            Context context = this.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            c27117Akb.LJJJIL(context, logisticLinkRichText, 1, 4, new AqS151S0200000_4(this, item, 56), new AqS151S0200000_4(this, item, 58));
            c27117Akb.setDefaultClickListener(new AqS151S0200000_4(this, item, 59));
        }
        ((TextView) _$_findCachedViewById(R.id.mvc)).setLineSpacing(C45804HyK.LJJ(4), 1.0f);
        View us_delivery_logistic_container = _$_findCachedViewById(R.id.mvb);
        o.LJIIIIZZ(us_delivery_logistic_container, "us_delivery_logistic_container");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 57), us_delivery_logistic_container);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USLogisticVH(ViewGroup parent, Fragment fragment) {
        super(C1FL.LIZIZ(parent, R.layout.a8r, parent, false, "from(parent.context)\n   …gistic_vh, parent, false)"));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this.LJLJI = new LinkedHashMap();
        this.LJLIL = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(DeliveryPanelViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 125));
    }
}
