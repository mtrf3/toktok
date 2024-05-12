package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.moduletitle;

import X.C1DG;
import X.C1FL;
import X.C44878HjO;
import X.C45804HyK;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USLogisticModuleTitleVH extends ECJediViewHolder {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USLogisticModuleTitleVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8t, viewGroup, false, "from(parent.context)\n   …le_layout, parent, false)"));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object item) {
        o.LJIIIZ(item, "item");
        View _$_findCachedViewById = _$_findCachedViewById(R.id.glq);
        if (_$_findCachedViewById != null) {
            C45804HyK.LJJLL(_$_findCachedViewById);
        }
        TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.glp);
        if (tuxTextView == null) {
            return;
        }
        C1DG.LJI(this.itemView, R.string.fbt, tuxTextView);
    }
}
