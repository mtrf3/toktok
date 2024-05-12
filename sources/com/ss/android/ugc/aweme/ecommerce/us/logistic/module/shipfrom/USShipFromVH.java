package com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipfrom;

import X.C1FL;
import X.C44878HjO;
import X.C45804HyK;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchFrom;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USShipFromVH extends ECJediViewHolder {
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
    public USShipFromVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8x, viewGroup, false, "from(parent.context)\n   …ar_layout, parent, false)"));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        DispatchFrom item = (DispatchFrom) obj;
        o.LJIIIZ(item, "item");
        C45804HyK.LJJLL(_$_findCachedViewById(R.id.jwg));
        String str = item.text;
        if (str != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.jwo);
            if (_$_findCachedViewById != null) {
                C45804HyK.LJJLL(_$_findCachedViewById);
            }
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.jwn);
            if (_$_findCachedViewById2 != null) {
                C45804HyK.LJJLL(_$_findCachedViewById2);
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.jwn);
            if (textView == null) {
                return;
            }
            textView.setText(str);
        }
    }
}
