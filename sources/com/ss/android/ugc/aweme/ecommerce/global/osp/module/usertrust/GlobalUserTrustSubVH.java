package com.ss.android.ugc.aweme.ecommerce.global.osp.module.usertrust;

import X.C221108m2;
import X.C26575Abr;
import X.C29542Bic;
import X.C32151Nz;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.O6R;
import X.OUP;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalUserTrustSubVH extends ECJediViewHolder {
    public final View LJLIL;
    public UserTrustItemAdapter LJLILLLLZI;
    public final C62822Ol8 LJLJI;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void L() {
        List<UserTrustItemDescriptionChunk> list;
        View view = this.LJLIL;
        if (this.LJLILLLLZI == null && (list = ((C26575Abr) getItem()).LIZIZ) != null) {
            this.LJLILLLLZI = new UserTrustItemAdapter(list, R.attr.gu, new AqS170S0100000_4(this, 349));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.mxa);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) _$_findCachedViewById(R.id.mxa)).LJII(new C29542Bic(16), -1);
            ((RecyclerView) _$_findCachedViewById(R.id.mxa)).setAdapter(this.LJLILLLLZI);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        L();
    }

    public GlobalUserTrustSubVH(View view) {
        super(view);
        this.LJLIL = view;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 93));
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        UserTrustItemAdapter userTrustItemAdapter;
        C26575Abr item = (C26575Abr) obj;
        o.LJIIIZ(item, "item");
        L();
        TextView us_order_submit_user_trust_title = (TextView) _$_findCachedViewById(R.id.mxi);
        o.LJIIIIZZ(us_order_submit_user_trust_title, "us_order_submit_user_trust_title");
        OUP.LJJLIIIJILLIZJL(us_order_submit_user_trust_title, item.LIZ);
        List<UserTrustItemDescriptionChunk> list = item.LIZIZ;
        if (list != null && (userTrustItemAdapter = this.LJLILLLLZI) != null) {
            userTrustItemAdapter.updateUserTrustInfo(list);
        }
        if (item.LIZJ) {
            _$_findCachedViewById(R.id.mxh).setVisibility(0);
            View us_order_submit_user_trust_layout = _$_findCachedViewById(R.id.mxg);
            o.LJIIIIZZ(us_order_submit_user_trust_layout, "us_order_submit_user_trust_layout");
            OUP.LJJJJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0)), us_order_submit_user_trust_layout);
            return;
        }
        _$_findCachedViewById(R.id.mxh).setVisibility(8);
        View us_order_submit_user_trust_layout2 = _$_findCachedViewById(R.id.mxg);
        o.LJIIIIZZ(us_order_submit_user_trust_layout2, "us_order_submit_user_trust_layout");
        OUP.LJJJJI(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)), us_order_submit_user_trust_layout2);
    }
}
