package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.security;

import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C26680AdY;
import X.C26681AdZ;
import X.C26830Afy;
import X.C62822Ol8;
import X.C62850Ola;
import X.C65352Pkq;
import X.C65776Prg;
import X.C76800UCe;
import X.C78946Uyc;
import Y.ARunnableS38S0100000_2;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpSecurityHolder extends PdpHolder {
    public final Fragment LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final LinkedList<View> LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        o.LJIIIZ(item, "item");
        View view = this.itemView;
        C78946Uyc.LJJIIJZLJL(view, C62850Ola.LJI(view, "itemView"), C26681AdZ.LJLIL, C26680AdY.LJLIL);
        if (C26830Afy.LIZ()) {
            ViewGroup viewGroup = (ViewGroup) this.itemView.findViewById(R.id.jjv);
            o.LJIIIIZZ(viewGroup, "itemView.securities");
            LinkedList<View> linkedList = this.LJLJI;
            while (viewGroup.getChildCount() > 0) {
                C16880lQ.LLIFFJFJJ(0, viewGroup);
                C76800UCe c76800UCe = C76800UCe.LIZ;
                if (c76800UCe instanceof View) {
                    linkedList.add(c76800UCe);
                }
            }
        } else {
            ((ViewGroup) this.itemView.findViewById(R.id.jjv)).removeAllViews();
        }
        this.itemView.findViewById(R.id.jjv).post(new ARunnableS38S0100000_2(this, 142));
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 75, 42), itemView);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C26508Aam.LIZ(itemView2, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpSecurityHolder(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a43);
        this.LJLJJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 170));
        this.LJLJI = new LinkedList<>();
    }
}
