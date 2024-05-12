package com.ss.android.ugc.aweme.ecommerce.global.osp.module.summary;

import X.C221108m2;
import X.C26983AiR;
import X.C27042AjO;
import X.C27051AjX;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.TBT;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalOrderSummaryVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public C26983AiR LJLJJI;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        View view = this.LJLIL;
        if (this.LJLJJI == null) {
            this.LJLJJI = new C26983AiR(this, (C27042AjO) getItem(), ((C27042AjO) getItem()).LIZ);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.mws);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) view.findViewById(R.id.mws)).setAdapter(this.LJLJJI);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        L();
        C73156SnQ.LJIIIIZZ(this, (JediViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.AiY
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getSummaryInfo();
            }
        }, new AqS186S0100000_4(this, 98));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(C27042AjO c27042AjO) {
        String str;
        C26983AiR c26983AiR = this.LJLJJI;
        if (c26983AiR != null) {
            ITEM summaryInfo = getItem();
            List<C27051AjX> list = ((C27042AjO) getItem()).LIZ;
            ArrayList arrayList = new ArrayList();
            for (C27051AjX c27051AjX : list) {
                C27051AjX c27051AjX2 = c27051AjX;
                Integer num = c27051AjX2.LJII;
                if (num == null || num.intValue() != 2 || c27051AjX2.LIZIZ.length() != 0) {
                    arrayList.add(c27051AjX);
                }
            }
            o.LJIIIZ(summaryInfo, "summaryInfo");
            c26983AiR.submitList(arrayList);
        }
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.mx1);
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
        L();
        M(item);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalOrderSummaryVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJLL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 92));
    }
}
