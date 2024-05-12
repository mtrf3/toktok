package com.ss.android.ugc.aweme.ecommerce.base.delivery.vh;

import X.C783235o;
import X.C9CN;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PreOrderShippingViewHolder extends ECJediViewHolder {
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PreOrderShippingViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r0 = "parent"
            java.util.LinkedHashMap r0 = X.C44878HjO.LIZIZ(r5, r0)
            r4.LJLIL = r0
            X.35o r3 = new X.35o
            android.content.Context r2 = r5.getContext()
            java.lang.String r0 = "parent.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)
            r1 = 0
            r0 = 6
            r3.<init>(r2, r1, r0)
            r4.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.PreOrderShippingViewHolder.<init>(android.view.ViewGroup):void");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C783235o c783235o;
        String str;
        C9CN item = (C9CN) obj;
        o.LJIIIZ(item, "item");
        this.itemView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        View view = this.itemView;
        if ((view instanceof C783235o) && (c783235o = (C783235o) view) != null && (str = item.LIZ) != null) {
            c783235o.setShippingInfo(str);
        }
    }
}
