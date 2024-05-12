package com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary;

import X.AnonymousClass636;
import X.C16880lQ;
import X.C1EU;
import X.C1GE;
import X.C1XY;
import X.C221108m2;
import X.C26508Aam;
import X.C27042AjO;
import X.C27050AjW;
import X.C27051AjX;
import X.C62562cu;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.KL2;
import X.TBT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SummaryVH extends ECJediViewHolder {
    public final View LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public volatile boolean LJLJI;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
        ((ViewGroup) this.LJLIL.findViewById(R.id.ktr)).removeAllViews();
        if (C1XY.LJJ()) {
            ((TuxTextView) this.LJLIL.findViewById(R.id.title)).setTuxFont(33);
            C26508Aam.LIZ(this.LJLIL, false);
        }
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLILLLLZI.getValue(), new TBT() { // from class: X.AjU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getSummaryInfo();
            }
        }, new AqS186S0100000_4(this, 42));
    }

    public SummaryVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 33));
    }

    public final int L(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return C1EU.LIZ(this.LJLIL, "view.context", R.attr.go);
            }
            if (num.intValue() == 2) {
                return C1EU.LIZ(this.LJLIL, "view.context", R.attr.eb);
            }
        }
        return C1EU.LIZ(this.LJLIL, "view.context", R.attr.gu);
    }

    public final void M(C27042AjO c27042AjO) {
        String str;
        String str2;
        Integer num;
        if (((ViewGroup) this.LJLIL.findViewById(R.id.ktr)).getChildCount() > 0) {
            ((ViewGroup) this.LJLIL.findViewById(R.id.ktr)).removeAllViews();
        }
        List<C27051AjX> list = c27042AjO.LIZ;
        ArrayList arrayList = new ArrayList();
        for (C27051AjX c27051AjX : list) {
            C27051AjX c27051AjX2 = c27051AjX;
            Integer num2 = c27051AjX2.LJII;
            if (num2 == null || num2.intValue() != 2 || c27051AjX2.LIZIZ.length() != 0) {
                arrayList.add(c27051AjX);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C27051AjX c27051AjX3 = (C27051AjX) it.next();
            Context context = this.LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            C27050AjW c27050AjW = new C27050AjW(context, null, 6);
            c27050AjW.setTitleText(c27051AjX3.LIZ);
            String str3 = c27051AjX3.LJIIIIZZ;
            if (str3 != null && ((num = c27051AjX3.LJII) == null || num.intValue() != 2)) {
                c27050AjW.setSubDescText(str3);
            }
            c27050AjW.setDescText(c27051AjX3.LIZIZ);
            c27050AjW.LIZIZ(false);
            c27050AjW.setTitleFont(61);
            c27050AjW.setTitleColor(L(c27051AjX3.LJI));
            c27050AjW.setDescFont(61);
            c27050AjW.setDescColor(L(c27051AjX3.LIZLLL));
            C62562cu c62562cu = c27051AjX3.LJFF;
            if (c62562cu != null && (str2 = c27051AjX3.LJ) != null) {
                c27050AjW.LIZJ(c62562cu, str2);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = (int) KL2.LIZJ(this.LJLIL.getContext(), 15.0f);
            Integer num3 = c27051AjX3.LJII;
            if (num3 != null && num3.intValue() == 2) {
                Integer valueOf = Integer.valueOf(R.raw.icon_info_circle);
                Context context2 = this.LJLIL.getContext();
                o.LJIIIIZZ(context2, "view.context");
                c27050AjW.LIZLLL(AnonymousClass636.LJIIIIZZ(R.attr.gv, context2), valueOf);
                C16880lQ.LJIIJ(new Au2S14S0200000_4(this, c27051AjX3, 62), c27050AjW);
            }
            Integer num4 = c27051AjX3.LJII;
            if (num4 != null && num4.intValue() == 16 && C1GE.LJIILIIL(c27051AjX3.LJIIIZ)) {
                Integer valueOf2 = Integer.valueOf(R.raw.icon_info_circle);
                Context context3 = this.LJLIL.getContext();
                o.LJIIIIZZ(context3, "view.context");
                c27050AjW.LIZLLL(AnonymousClass636.LJIIIIZZ(R.attr.gv, context3), valueOf2);
                C16880lQ.LJIIJ(new Au2S10S0300000_4(c27042AjO, this, c27051AjX3, 26), c27050AjW);
            }
            ((ViewGroup) this.LJLIL.findViewById(R.id.ktr)).addView(c27050AjW, layoutParams);
        }
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.lik);
        if (textView == null) {
            return;
        }
        Price price = c27042AjO.LIZIZ;
        if (price == null || (str = price.getPriceStr()) == null) {
            str = "";
        }
        textView.setText(str);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C27042AjO item = (C27042AjO) obj;
        o.LJIIIZ(item, "item");
        M(item);
    }
}
