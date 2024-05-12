package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common;

import X.C221108m2;
import X.C26668AdM;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72545SdZ;
import X.InterfaceC26837Ag5;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class GlobalPdpSelectVH extends AbsFullSpanVH {
    public static final C26668AdM Companion = new C26668AdM();
    public Map<Integer, View> _$_findViewCache;
    public final ECBaseFragment fragment;
    public final C5H3 vm$delegate;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void bindCustomView(InterfaceC26837Ag5 interfaceC26837Ag5, View view);

    public Map<String, Object> getModuleClickExtraParams() {
        return null;
    }

    public Map<String, Object> getModuleShowExtraParams() {
        return null;
    }

    public abstract int getStartIconRes(InterfaceC26837Ag5 interfaceC26837Ag5);

    public abstract void onClick(InterfaceC26837Ag5 interfaceC26837Ag5, View view);

    public abstract View onCreateMiddleCustomView(InterfaceC26837Ag5 interfaceC26837Ag5);

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.vm$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0034, code lost:
    
        if ((r1 instanceof android.view.View) != false) goto L6;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(X.InterfaceC26837Ag5 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r3.getVm()
            r0 = 2131370239(0x7f0a20ff, float:1.8360479E38)
            android.view.View r1 = r3._$_findCachedViewById(r0)
            com.bytedance.tux.icon.TuxIconView r1 = (com.bytedance.tux.icon.TuxIconView) r1
            int r0 = r3.getStartIconRes(r4)
            r1.setIconRes(r0)
            r2 = 2131371378(0x7f0a2572, float:1.836279E38)
            android.view.View r0 = r3._$_findCachedViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L4d
            android.view.View r1 = r3._$_findCachedViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r0 = 0
            android.view.View r1 = r1.getChildAt(r0)
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L3b
        L36:
            if (r1 == 0) goto L3b
            r3.bindCustomView(r4, r1)
        L3b:
            android.view.View r2 = r3.itemView
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            com.ss.android.ugc.aweme.utils.Au2S14S0200000_4 r1 = new com.ss.android.ugc.aweme.utils.Au2S14S0200000_4
            r0 = 13
            r1.<init>(r3, r4, r0)
            X.C16880lQ.LJIIJ(r1, r2)
            return
        L4d:
            android.view.View r1 = r3.onCreateMiddleCustomView(r4)
            if (r1 == 0) goto L3b
            android.view.View r0 = r3._$_findCachedViewById(r2)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.addView(r1)
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH.onBind(X.Ag5):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalPdpSelectVH(ViewGroup parent, ECBaseFragment fragment) {
        super(C72545SdZ.LIZJ(parent, "parent.context", R.layout.a4x, parent, false));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(fragment, "fragment");
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.vm$delegate = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 97));
    }
}
