package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.module.logistic;

import X.C26817Afl;
import X.C44878HjO;
import X.JVD;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class TtfShipToBarHolder extends ShipToBarHolder {
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    public final void P() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtfShipToBarHolder(ViewGroup viewGroup) {
        super(viewGroup, R.layout.a8g, 2);
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder
    /* renamed from: N */
    public final void onBind(C26817Afl item) {
        o.LJIIIZ(item, "item");
        ((TextView) this.itemView.findViewById(R.id.lmy)).setText(L());
        JVD.LIZ(this.itemView.findViewById(R.id.lmy), new AqS153S0100000_3(this, 1624));
        Q();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj) {
        onBind((C26817Afl) obj);
    }
}
