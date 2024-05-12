package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.returnpolicy;

import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26651Ad5;
import X.C26670AdO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78565UsT;
import Y.ARunnableS40S0100000_4;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpReturnPolicyHolder extends PdpHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26670AdO item = (C26670AdO) obj;
        o.LJIIIZ(item, "item");
        this.itemView.post(new ARunnableS40S0100000_4(this, 95));
        C78565UsT.LJJIJIIJIL(this.LJLIL, new C26651Ad5(item, this, null));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 57, 42), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, item.LJLJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpReturnPolicyHolder(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a3z);
        this.LJLJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 165));
    }
}
