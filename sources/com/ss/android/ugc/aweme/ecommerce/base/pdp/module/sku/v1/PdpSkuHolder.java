package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v1;

import X.C03090Af;
import X.C221108m2;
import X.C27162AlK;
import X.C27528ArE;
import X.C32I;
import X.C47261Igj;
import X.C51029K0z;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C7MY;
import X.OSZ;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.IllegalFormatConversionException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS183S0200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpSkuHolder extends PdpHolder {
    public static final /* synthetic */ int LJLJJI = 0;
    public final Fragment LJLIL;
    public final int LJLILLLLZI;
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

    public static List M(List list) {
        int i;
        int LIZIZ = C7MY.LIZIZ(8);
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = ((ArrayList) list).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                if (i2 == 0) {
                    i = 0;
                } else {
                    i = LIZIZ;
                }
                arrayList.add(new OSZ(next, Integer.valueOf(i)));
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0308, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x02a6, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x034a, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L9;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v1.PdpSkuHolder.onBind(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onClick(String str) {
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 69));
        PdpViewModel.Rw0((PdpViewModel) LIZIZ.getValue(), this.LJLIL.getView(), 0, new IDqS183S0200000_4(this, LIZIZ, 1), true, null, null, 48);
        C70414RkI c70414RkI = ((PdpViewModel) LIZIZ.getValue()).LLFII;
        if (c70414RkI != null) {
            C70414RkI.LJJJIL(c70414RkI, "sku", null, str, C51029K0z.LJJIIZI(new OSZ("is_photo_show", Integer.valueOf(((C27528ArE) getItem()).LJLJJI ? 1 : 0))), 18);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpSkuHolder(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a4k);
        this.LJLJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        this.LJLIL = eCBaseFragment;
        this.LJLILLLLZI = C27162AlK.LIZ;
    }

    public final String L(int i, String str) {
        String string;
        try {
            string = this.itemView.getContext().getString(R.string.fbz, Integer.valueOf(i), str);
        } catch (IllegalFormatConversionException unused) {
            string = this.itemView.getContext().getString(R.string.fbz, str, Integer.valueOf(i));
        }
        o.LJIIIIZZ(string, "try {\n        itemView.c…re_sku, prop, more)\n    }");
        return string;
    }
}
