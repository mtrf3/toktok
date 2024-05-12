package com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop;

import X.C221108m2;
import X.C27949Ay1;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USShopInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public final Map<Integer, View> LJLJL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJL;
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

    public final void L(String str) {
        C27949Ay1.LJIJI("message", str, ((OrderSubmitViewModel) this.LJLJI.getValue()).fw0(false), "order_submit", null, null, null, 4080);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x013e, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USShopInfoVH.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USShopInfoVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 133));
        this.LJLJJI = C221108m2.LIZIZ(new AqS154S0100000_4(this, 325));
    }
}
