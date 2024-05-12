package com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop;

import X.C16880lQ;
import X.C1DG;
import X.C26548AbQ;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UnreachableExpend extends ECJediViewHolder {
    public static final /* synthetic */ int LJLILLLLZI = 0;
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

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

    public UnreachableExpend(View view) {
        super(view);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C26548AbQ item = (C26548AbQ) obj;
        o.LJIIIZ(item, "item");
        if (item.LJLIL) {
            C1DG.LJI(this.itemView, R.string.fcq, (TuxTextView) this.itemView.findViewById(R.id.text));
            this.itemView.findViewById(R.id.e_q).setScaleY(-1.0f);
        } else {
            C1DG.LJI(this.itemView, R.string.fcr, (TuxTextView) this.itemView.findViewById(R.id.text));
            this.itemView.findViewById(R.id.e_q).setScaleY(1.0f);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 56), itemView);
    }
}
