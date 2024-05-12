package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder;

import X.C1FL;
import X.C221108m2;
import X.C26597AcD;
import X.C26706Ady;
import X.C26707Adz;
import X.C45804HyK;
import X.C5H3;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.dynamicstyle.payment.IAreaTitleStyle;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import wg5.c;

/* loaded from: classes5.dex */
public final class AreaTitleViewHolder extends ECJediViewHolder implements c {
    public Map<Integer, View> _$_findViewCache;
    public final C26597AcD adapter;
    public final C5H3 dynamicStyle$delegate;

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final IAreaTitleStyle getDynamicStyle() {
        return (IAreaTitleStyle) this.dynamicStyle$delegate.getValue();
    }

    @Override // wg5.c
    public String getViewName() {
        return C26706Ady.LIZ(this);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(C26707Adz item) {
        o.LJIIIZ(item, "item");
        this.itemView.setPadding(C45804HyK.LJJI(16), this.itemView.getPaddingTop(), C45804HyK.LJJI(16), this.itemView.getPaddingBottom());
        if (this.adapter.LJZL(this.latestItemPositionInternal - 1, false) != null) {
            C45804HyK.LJJLIIIJ(C45804HyK.LJJI(24), this.itemView);
        }
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        TuxTextView tuxTextView = (TuxTextView) view;
        tuxTextView.setText(this.itemView.getContext().getString(item.LJLIL));
        tuxTextView.setTuxFont(getDynamicStyle().getTuxFont());
        tuxTextView.setTextColorRes(getDynamicStyle().getTuxColor());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AreaTitleViewHolder(ViewGroup parent, C26597AcD adapter) {
        super(C1FL.LIZIZ(parent, R.layout.a1q, parent, false, "from(parent.context)\n   …rea_title, parent, false)"));
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(adapter, "adapter");
        this._$_findViewCache = new LinkedHashMap();
        this.adapter = adapter;
        this.dynamicStyle$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 223));
    }
}
