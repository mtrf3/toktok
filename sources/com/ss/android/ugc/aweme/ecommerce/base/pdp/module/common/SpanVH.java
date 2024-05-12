package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common;

import X.C26508Aam;
import X.C26840Ag8;
import X.C44878HjO;
import X.C79045V0n;
import X.KL2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SpanVH extends AbsFullSpanVH {
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
    public SpanVH(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26840Ag8 item = (C26840Ag8) obj;
        o.LJIIIZ(item, "item");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, (int) KL2.LIZJ(this.itemView.getContext(), item.LJLIL));
        int i = item.LJLJI;
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i;
        this.itemView.setLayoutParams(layoutParams);
        View view = this.itemView;
        int i2 = item.LJLJI;
        int i3 = 0;
        view.setPadding(i2, 0, i2, 0);
        View view2 = this.itemView;
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Integer LJI = C79045V0n.LJI(item.LJLJJI, context);
        if (LJI != null) {
            i3 = LJI.intValue();
        }
        view2.setBackgroundColor(i3);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, item.LJLILLLLZI);
    }
}
