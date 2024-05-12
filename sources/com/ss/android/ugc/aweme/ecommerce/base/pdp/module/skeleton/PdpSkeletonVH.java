package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.skeleton;

import X.AnonymousClass636;
import X.C27162AlK;
import X.C32151Nz;
import X.C44878HjO;
import X.C72545SdZ;
import X.C7MY;
import X.O6R;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PdpSkeletonVH extends AbsFullSpanVH {
    public static final int LJLILLLLZI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
    public static final int LJLJI = C7MY.LIZIZ(4);
    public static final int LJLJJI = 10;
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdpSkeletonVH(ViewGroup viewGroup) {
        super(C72545SdZ.LIZJ(viewGroup, "parent.context", R.layout.a4i, viewGroup, false));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        int i;
        o.LJIIIZ(item, "item");
        if (((ViewGroup) _$_findCachedViewById(R.id.bs8)).getChildCount() > 0) {
            ((ViewGroup) _$_findCachedViewById(R.id.bs8)).removeAllViews();
        }
        int i2 = C27162AlK.LIZ - (LJLILLLLZI * 2);
        int i3 = LJLJJI;
        int i4 = (i2 - ((i3 - 1) * LJLJI)) / i3;
        for (int i5 = 0; i5 < i3; i5++) {
            ViewGroup viewGroup = (ViewGroup) _$_findCachedViewById(R.id.bs8);
            View view = new View(this.itemView.getContext());
            Context context = view.getContext();
            o.LJIIIIZZ(context, "context");
            view.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ck, context));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i4, i4);
            if (i5 == LJLJJI - 1) {
                i = 0;
            } else {
                i = LJLJI;
            }
            marginLayoutParams.setMarginEnd(i);
            viewGroup.addView(view, marginLayoutParams);
        }
    }
}
