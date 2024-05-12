package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc;

import X.C221108m2;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72545SdZ;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;

/* loaded from: classes5.dex */
public final class ProductDescImageViewHolder extends AbsBrickFullSpanVH {
    public final C62822Ol8 LJLILLLLZI;
    public boolean LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final PdpViewModel getViewModel() {
        return (PdpViewModel) this.LJLILLLLZI.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDescImageViewHolder(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "viewGroup.context", R.layout.a35, viewGroup, false));
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "viewGroup");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 50));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0252, code lost:
    
        if (X.C70759Rpr.LIZIZ(r1) == false) goto L16;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsBrickFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(X.C27177AlZ r23) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductDescImageViewHolder.onBind(X.AlZ):void");
    }
}
