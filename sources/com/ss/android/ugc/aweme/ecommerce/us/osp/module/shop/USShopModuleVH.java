package com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop;

import X.AbstractC029409q;
import X.AbstractC73230Soc;
import X.C221108m2;
import X.C26584Ac0;
import X.C26609AcP;
import X.C26804AfY;
import X.C32151Nz;
import X.C62822Ol8;
import X.C71790SFm;
import X.C73227SoZ;
import X.C7MY;
import X.O6R;
import X.OUP;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USShopModuleVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final Map<Integer, View> LJLJJI;

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

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26584Ac0 item = (C26584Ac0) obj;
        o.LJIIIZ(item, "item");
        View view = this.LJLIL;
        if (((RecyclerView) _$_findCachedViewById(R.id.mx5)).getAdapter() == null) {
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.mx5);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.mx5);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            recyclerView2.LJII(new C71790SFm(context, new C26609AcP(O6R.LJJIIZ(C32151Nz.LJIIZILJ(Double.valueOf(0.5d))), R.attr.dv, C7MY.LIZIZ(0), C7MY.LIZIZ(20))), -1);
            ((RecyclerView) _$_findCachedViewById(R.id.mx5)).setAdapter((AbstractC029409q) this.LJLJI.getValue());
        }
        String str = item.LIZ;
        TextView us_order_submit_shop_info_vh_title = (TextView) _$_findCachedViewById(R.id.mx4);
        o.LJIIIIZZ(us_order_submit_shop_info_vh_title, "us_order_submit_shop_info_vh_title");
        OUP.LJJLIIIJILLIZJL(us_order_submit_shop_info_vh_title, str);
        AbstractC73230Soc abstractC73230Soc = (AbstractC73230Soc) this.LJLJI.getValue();
        List<C26804AfY> list = item.LIZIZ;
        abstractC73230Soc.getClass();
        C73227SoZ.LIZ(abstractC73230Soc, list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USShopModuleVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJJI = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        this.LJLJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 326));
    }
}
