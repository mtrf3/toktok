package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.policy;

import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26789AfJ;
import X.C26792AfM;
import X.C26847AgF;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70920RsS;
import X.C76542zS;
import X.C78565UsT;
import X.C78946Uyc;
import X.OQN;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S3S0400000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpPolicyHolder extends PdpHolder {
    public static final /* synthetic */ int LJLJI = 0;
    public final Fragment LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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
        Integer num;
        C26792AfM item = (C26792AfM) obj;
        o.LJIIIZ(item, "item");
        C78565UsT.LJJIJIIJIL(this.LJLIL, new C26789AfJ(this, item, null));
        TuxIconView tuxIconView = (TuxIconView) this.itemView.findViewById(R.id.hvp);
        o.LJIIIIZZ(tuxIconView, "itemView.policies_small_icon");
        OQN.LJIIL(tuxIconView, item.LJLIL);
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 1));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ProductPackStruct productPackStruct = ((PdpViewModel) LIZIZ.getValue()).LJLJLLL;
        if (productPackStruct != null && (num = productPackStruct.productType) != null && num.intValue() == 1) {
            linkedHashMap.put("module_text", "refund_not_supported");
        }
        C70414RkI c70414RkI = ((PdpViewModel) LIZIZ.getValue()).LLFII;
        if (c70414RkI != null && !c70414RkI.LJJIIJ) {
            c70414RkI.LJJIIJ = true;
            if (C26847AgF.LIZ()) {
                C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70920RsS(), new AqS135S0200000_4(c70414RkI, (C70414RkI) linkedHashMap, (Map<String, ? extends Object>) 312));
            } else {
                C76542zS.LJ("tiktokec_module_show", new AqS135S0200000_4(c70414RkI, (C70414RkI) linkedHashMap, (Map<String, ? extends Object>) 315));
            }
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S3S0400000_4(this, linkedHashMap, LIZIZ, item, 2), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpPolicyHolder(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a3i);
        this.LJLILLLLZI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
    }
}
