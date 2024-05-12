package com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop;

import X.C16880lQ;
import X.C221108m2;
import X.C26962Ai6;
import X.C26965Ai9;
import X.C27117Akb;
import X.C27739Aud;
import X.C27947Axz;
import X.C29542Bic;
import X.C45804HyK;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C79234V7u;
import X.ORZ;
import X.OUR;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.global.osp.vm.USOrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS38S1300000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS58S1100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USMainOrderInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C27947Axz LJLJJI;
    public final Map<Integer, View> LJLJJL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        LogisticDTO logisticDTO;
        LogisticLinkRichText logisticLinkRichText;
        LogisticDTO logisticDTO2;
        String priceVal;
        String currency;
        String str;
        C26965Ai9 item = (C26965Ai9) obj;
        o.LJIIIZ(item, "item");
        boolean z = L() instanceof USOrderSubmitViewModel;
        View view = this.LJLIL;
        if (this.LJLJJI == null) {
            this.LJLJJI = new C27947Axz(this);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.mwb);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) _$_findCachedViewById(R.id.mwb)).LJII(new C29542Bic(16), -1);
            ((RecyclerView) _$_findCachedViewById(R.id.mwb)).setAdapter(this.LJLJJI);
        }
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.Awz
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj2) {
                return ((OrderSubmitState) obj2).getPageStatus();
            }
        }, new AqS186S0100000_4(this, 263));
        View view2 = this.LJLIL;
        List<LogisticDTO> list = ((C26965Ai9) getItem()).LIZLLL;
        String str2 = null;
        if (list != null) {
            Iterator<LogisticDTO> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    logisticDTO2 = it.next();
                    String str3 = logisticDTO2.logisticsServiceId;
                    LogisticDTO logisticDTO3 = ((C26965Ai9) getItem()).LJ;
                    if (logisticDTO3 != null) {
                        str = logisticDTO3.logisticsServiceId;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str3, str)) {
                        break;
                    }
                } else {
                    logisticDTO2 = null;
                    break;
                }
            }
            logisticDTO = logisticDTO2;
            if (logisticDTO != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Price price = logisticDTO.shippingFee;
                if (price != null && (currency = price.getCurrency()) != null) {
                    linkedHashMap.put("shipping_currency", currency);
                }
                Price price2 = logisticDTO.shippingFee;
                if (price2 != null && (priceVal = price2.getPriceVal()) != null) {
                    linkedHashMap.put("shipping_price", priceVal);
                }
                Map<String, String> map = logisticDTO.eventTrackInfo;
                if (map != null) {
                    linkedHashMap.putAll(map);
                }
                str2 = C27739Aud.LJI(linkedHashMap);
            }
        } else {
            logisticDTO = null;
        }
        View view3 = this.itemView;
        C78946Uyc.LJJIIJZLJL(view3, C62850Ola.LJI(view3, "itemView"), new AqS154S0100000_4(this, 1073), new AqS47S1200000_4(str2, this, logisticDTO, 16));
        if (logisticDTO == null) {
            ((TuxTextView) _$_findCachedViewById(R.id.mw9)).setTextColorRes(R.attr.gp);
            ((TextView) _$_findCachedViewById(R.id.mw9)).setText(((C26965Ai9) getItem()).LJIIL);
        } else {
            ((TuxTextView) _$_findCachedViewById(R.id.mw9)).setTextColorRes(R.attr.go);
            List<LogisticLinkRichText> list2 = logisticDTO.logisticRichTextList;
            if (list2 != null && (logisticLinkRichText = (LogisticLinkRichText) ORZ.LJLLLL(list2)) != null) {
                C27117Akb c27117Akb = (C27117Akb) _$_findCachedViewById(R.id.mw9);
                Context context = c27117Akb.getContext();
                o.LJIIIIZZ(context, "context");
                c27117Akb.LJJJIL(context, logisticLinkRichText, 1, 4, new AqS151S0200000_4(this, logisticDTO, 30), new AqS93S0300000_4(this, logisticDTO, c27117Akb, 168));
                c27117Akb.setDefaultClickListener(new AqS38S1300000_4(this, c27117Akb, str2, logisticDTO, 0));
            }
        }
        ((TextView) _$_findCachedViewById(R.id.mw9)).setLineSpacing(C45804HyK.LJJ(4), 1.0f);
        ImageView us_order_submit_shop_logistic_select_icon = (ImageView) _$_findCachedViewById(R.id.mx6);
        o.LJIIIIZZ(us_order_submit_shop_logistic_select_icon, "us_order_submit_shop_logistic_select_icon");
        List<LogisticDTO> list3 = ((C26965Ai9) getItem()).LIZLLL;
        int i = 0;
        if (list3 == null || list3.size() <= 1) {
            i = 8;
        }
        us_order_submit_shop_logistic_select_icon.setVisibility(i);
        View us_order_submit_main_order_logistic_layout = _$_findCachedViewById(R.id.mw8);
        o.LJIIIIZZ(us_order_submit_main_order_logistic_layout, "us_order_submit_main_order_logistic_layout");
        C16880lQ.LJIIJ(new C26962Ai6(this, view2, str2, logisticDTO), us_order_submit_main_order_logistic_layout);
        C27947Axz c27947Axz = this.LJLJJI;
        if (c27947Axz != null) {
            c27947Axz.LJLIL.clear();
            c27947Axz.LJLIL.addAll(item.LJII);
            c27947Axz.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USMainOrderInfoVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 132));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(Context context, LogisticDTO logisticDTO, String str) {
        View view = this.itemView;
        C78946Uyc.LJJIIJ(view, OUR.LIZLLL(view, "itemView"), new AqS58S1100000_4(logisticDTO, str, 32));
        List<LogisticDTO> list = ((C26965Ai9) getItem()).LIZLLL;
        if (list != null && list.size() > 1) {
            OrderSubmitViewModel L = L();
            C26965Ai9 c26965Ai9 = (C26965Ai9) getItem();
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            L.Iw0(c26965Ai9, list, context, C79234V7u.LJJIJ(itemView));
        }
    }
}
