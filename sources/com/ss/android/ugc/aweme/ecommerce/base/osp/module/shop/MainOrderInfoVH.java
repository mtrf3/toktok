package com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop;

import X.AbstractC030309z;
import X.C1AU;
import X.C221108m2;
import X.C26508Aam;
import X.C27946Axy;
import X.C29S;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73156SnQ;
import X.TBT;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MainOrderInfoVH extends ECJediViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public boolean LJLJJI;
    public KeyBoardVisibilityUtil LJLJJL;
    public C27946Axy LJLJJLL;
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

    public final OrderSubmitViewModel L() {
        return (OrderSubmitViewModel) this.LJLJI.getValue();
    }

    public final void M() {
        View view = this.LJLIL;
        if (this.LJLJJLL == null) {
            this.LJLJJLL = new C27946Axy(this);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.jym);
            view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager());
            ((RecyclerView) view.findViewById(R.id.jym)).LJII(new AbstractC030309z() { // from class: X.4KU
                public final int LJLIL = 16;

                @Override // X.AbstractC030309z
                public final void LJ(Rect outRect, View view2, RecyclerView parent, C0AC state) {
                    o.LJIIIZ(outRect, "outRect");
                    o.LJIIIZ(view2, "view");
                    o.LJIIIZ(parent, "parent");
                    o.LJIIIZ(state, "state");
                    if (parent.getAdapter() != null && RecyclerView.LJJJJIZL(view2) != 0) {
                        outRect.top = (int) KL2.LIZJ(view2.getContext(), this.LJLIL);
                    }
                }
            }, -1);
            ((RecyclerView) view.findViewById(R.id.jym)).setAdapter(this.LJLJJLL);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onCreate() {
        super.onCreate();
        C26508Aam.LIZ(this.LJLIL, true);
        View view = this.LJLIL;
        M();
        Context context = view.getContext();
        if (context != null && (context instanceof C29S)) {
            this.LJLJJL = new KeyBoardVisibilityUtil((C1AU) context, 32, new AqS186S0100000_4(view, 40));
        }
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AkS
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((OrderSubmitState) obj).getCheckPhoneNumber());
            }
        }, new AqS167S0200000_4(view, this, 3));
        C73156SnQ.LJIIIIZZ(this, L(), new TBT() { // from class: X.AkU
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OrderSubmitState) obj).getPhoneNumberErr();
            }
        }, new AqS186S0100000_4(view, 41));
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onDestroy() {
        super.onDestroy();
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.LJLJJL;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.LIZ();
        }
        this.LJLJJL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x07c1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x07f1  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x07f8  */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r15v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v105 */
    /* JADX WARN: Type inference failed for: r3v106 */
    /* JADX WARN: Type inference failed for: r3v86, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r3v92, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r5v65, types: [android.view.View, java.lang.Object, X.9qT] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 2144
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH.onBind(java.lang.Object):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainOrderInfoVH(View view, Fragment fragment) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        this.LJLJL = new LinkedHashMap();
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 30));
    }
}
