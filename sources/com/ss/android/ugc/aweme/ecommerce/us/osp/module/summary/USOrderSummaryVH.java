package com.ss.android.ugc.aweme.ecommerce.us.osp.module.summary;

import X.C06460Ne;
import X.C110614Vt;
import X.C16880lQ;
import X.C221108m2;
import X.C26982AiQ;
import X.C27042AjO;
import X.C27043AjP;
import X.C27044AjQ;
import X.C27051AjX;
import X.C27724AuO;
import X.C45804HyK;
import X.C61328O5c;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70920RsS;
import X.C73156SnQ;
import X.C78946Uyc;
import X.OUP;
import X.TBT;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PromotionTagStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USOrderSummaryVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C26982AiQ LJLJJI;
    public volatile boolean LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public final OrderSubmitViewModel M() {
        return (OrderSubmitViewModel) this.LJLJI.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N() {
        View view = this.LJLIL;
        if (this.LJLJJI == null) {
            this.LJLJJI = new C26982AiQ(this, (C27043AjP) getItem(), ((C27043AjP) getItem()).LIZ.LIZ);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mws);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) view.findViewById(R.id.mws)).setAdapter(this.LJLJJI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String L() {
        Integer num;
        Integer num2;
        String str;
        C27724AuO c27724AuO = ((C27043AjP) getItem()).LIZIZ;
        int i = 0;
        if (c27724AuO != null && (str = c27724AuO.LJIIIIZZ) != null && str.length() > 0) {
            return "all_applied";
        }
        C27724AuO c27724AuO2 = ((C27043AjP) getItem()).LIZIZ;
        if (c27724AuO2 != null && (num = c27724AuO2.LJII) != null && num.intValue() > 0) {
            C27724AuO c27724AuO3 = ((C27043AjP) getItem()).LIZIZ;
            if (c27724AuO3 != null && (num2 = c27724AuO3.LJII) != null) {
                i = num2.intValue();
            }
            return String.valueOf(i);
        }
        return "no_coupon";
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        N();
        C73156SnQ.LJIIIIZZ(this, M(), new TBT() { // from class: X.Ax0
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPageStatus();
            }
        }, new AqS186S0100000_4(this, 265));
        C73156SnQ.LJIIIIZZ(this, M(), new TBT() { // from class: X.AjN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getSummaryInfo();
            }
        }, new AqS186S0100000_4(this, 101));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(C27042AjO c27042AjO) {
        String str;
        String str2;
        String str3;
        PromotionTagStyle promotionTagStyle;
        Drawable drawable;
        Integer num;
        Integer num2;
        C26982AiQ c26982AiQ = this.LJLJJI;
        if (c26982AiQ != null) {
            ITEM summaryInfo = getItem();
            List<C27051AjX> list = c27042AjO.LIZ;
            ArrayList arrayList = new ArrayList();
            for (C27051AjX c27051AjX : list) {
                C27051AjX c27051AjX2 = c27051AjX;
                Integer num3 = c27051AjX2.LJII;
                if (num3 == null || num3.intValue() != 2 || c27051AjX2.LIZIZ.length() != 0) {
                    arrayList.add(c27051AjX);
                }
            }
            o.LJIIIZ(summaryInfo, "summaryInfo");
            c26982AiQ.submitList(arrayList);
        }
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.mx1);
        Price price = c27042AjO.LIZIZ;
        if (price == null || (str = price.getPriceStr()) == null) {
            str = "";
        }
        textView.setText(str);
        int i = 8;
        if (((C27043AjP) getItem()).LIZIZ == null) {
            this.LJLIL.findViewById(R.id.mwv).setVisibility(8);
            this.LJLIL.findViewById(R.id.mwt).setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) this.LJLIL.findViewById(R.id.mwv).findViewById(R.id.mwz);
        C27724AuO c27724AuO = ((C27043AjP) getItem()).LIZIZ;
        String str4 = null;
        if (c27724AuO != null) {
            str2 = c27724AuO.LJI;
        } else {
            str2 = null;
        }
        textView2.setText(str2);
        TextView textView3 = (TextView) this.LJLIL.findViewById(R.id.mwv).findViewById(R.id.mwy);
        o.LJIIIIZZ(textView3, "view.us_order_submit_ord…er_summary_promotions_tag");
        C27724AuO c27724AuO2 = ((C27043AjP) getItem()).LIZIZ;
        if (c27724AuO2 != null) {
            str3 = c27724AuO2.LJIIIIZZ;
        } else {
            str3 = null;
        }
        OUP.LJJLIIIJILLIZJL(textView3, str3);
        View findViewById = this.LJLIL.findViewById(R.id.mwv).findViewById(R.id.mwy);
        C27724AuO c27724AuO3 = ((C27043AjP) getItem()).LIZIZ;
        if (c27724AuO3 != null) {
            promotionTagStyle = c27724AuO3.LJIIIZ;
        } else {
            promotionTagStyle = null;
        }
        if (promotionTagStyle != PromotionTagStyle.PURE_TEXT) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.is);
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            c110614Vt.LIZLLL = Integer.valueOf(C45804HyK.LJJI(1));
            c110614Vt.LJFF = Integer.valueOf(R.attr.eb);
            drawable = C06460Ne.LIZ(this.itemView, "itemView.context", c110614Vt);
        } else {
            drawable = null;
        }
        findViewById.setBackground(drawable);
        View findViewById2 = this.LJLIL.findViewById(R.id.mwv).findViewById(R.id.abf);
        C27724AuO c27724AuO4 = ((C27043AjP) getItem()).LIZIZ;
        if (c27724AuO4 != null && (num2 = c27724AuO4.LJII) != null && num2.intValue() > 0) {
            i = 0;
        }
        findViewById2.setVisibility(i);
        TextView textView4 = (TextView) this.LJLIL.findViewById(R.id.mwv).findViewById(R.id.abg);
        o.LJIIIIZZ(textView4, "view.us_order_submit_ord…ilable_coupons_count_text");
        C27724AuO c27724AuO5 = ((C27043AjP) getItem()).LIZIZ;
        if (c27724AuO5 != null && (num = c27724AuO5.LJII) != null) {
            str4 = num.toString();
        }
        OUP.LJJLIIIJILLIZJL(textView4, str4);
        this.LJLIL.findViewById(R.id.mwv).setVisibility(0);
        this.LJLIL.findViewById(R.id.mwt).setVisibility(0);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C27043AjP item = (C27043AjP) obj;
        o.LJIIIZ(item, "item");
        N();
        P(item.LIZ);
        View view = this.LJLIL;
        View us_order_submit_order_summary_module_promotions = view.findViewById(R.id.mwv);
        o.LJIIIIZZ(us_order_submit_order_summary_module_promotions, "us_order_submit_order_summary_module_promotions");
        C16880lQ.LJIIJ(new Au2S10S0300000_4(this, item, view, 9), us_order_submit_order_summary_module_promotions);
        C78946Uyc.LJJIIJZLJL(view, new C70920RsS(), C27044AjQ.LJLIL, new AqS135S0200000_4(item, this, 175));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USOrderSummaryVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJLL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 134));
    }
}
