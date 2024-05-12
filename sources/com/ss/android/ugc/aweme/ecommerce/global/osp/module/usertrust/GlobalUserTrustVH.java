package com.ss.android.ugc.aweme.ecommerce.global.osp.module.usertrust;

import X.AbstractC029409q;
import X.AbstractC73230Soc;
import X.C221108m2;
import X.C26575Abr;
import X.C26577Abt;
import X.C27949Ay1;
import X.C32I;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73227SoZ;
import X.ORZ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalUserTrustVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
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

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        View view = this.LJLIL;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.n0z);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) view.findViewById(R.id.n0z)).setAdapter((AbstractC029409q) this.LJLJI.getValue());
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        Object obj2;
        C26577Abt item = (C26577Abt) obj;
        o.LJIIIZ(item, "item");
        List<UserTrustItem> list = item.LJLIL;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (UserTrustItem userTrustItem : list) {
            boolean LJ = true ^ o.LJ(userTrustItem, ORZ.LLFF(item.LJLIL));
            o.LJIIIZ(userTrustItem, "<this>");
            C26575Abr c26575Abr = new C26575Abr(userTrustItem.title, userTrustItem.description);
            c26575Abr.LIZJ = LJ;
            arrayList.add(c26575Abr);
        }
        AbstractC73230Soc abstractC73230Soc = (AbstractC73230Soc) this.LJLJI.getValue();
        abstractC73230Soc.getClass();
        C73227SoZ.LIZ(abstractC73230Soc, arrayList);
        if (!this.LJLJJL) {
            this.LJLJJL = true;
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            HashMap<String, Object> fw0 = ((OrderSubmitViewModel) this.LJLJJI.getValue()).fw0(false);
            fw0.put("module_name", "user_trust");
            HashMap<String, Object> hashMap = ((OrderSubmitViewModel) this.LJLJJI.getValue()).LLIL;
            if (hashMap != null && (obj2 = hashMap.get("product_source")) != null) {
                fw0.put("product_source", obj2);
            }
            C27949Ay1.LJJIFFI(c27949Ay1, "order_summary", fw0, null, null, null, null, null, 2044);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalUserTrustVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJLL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 319));
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 94));
    }
}
