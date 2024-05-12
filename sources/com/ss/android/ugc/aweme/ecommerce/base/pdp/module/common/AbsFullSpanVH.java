package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common;

import X.C1BZ;
import X.C26508Aam;
import X.C26830Afy;
import X.C70445Rkn;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class AbsFullSpanVH extends ECJediViewHolder {
    public Map<Integer, View> _$_findViewCache;
    public Object lastBindItem;

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

    public boolean needDivider() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void setFullSpan() {
        C1BZ c1bz;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C1BZ) && (c1bz = (C1BZ) layoutParams) != null) {
            c1bz.LJLILLLLZI = true;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onCreate() {
        super.onCreate();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, true);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onStop() {
        super.onStop();
        trackTag(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsFullSpanVH(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
    }

    public final void trackTag(C70445Rkn c70445Rkn) {
        this.itemView.setTag(R.id.bny, c70445Rkn);
    }

    @Override // com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(Object obj, int i, List<Object> list) {
        if (o.LJ(obj, this.lastBindItem) && C26830Afy.LIZ()) {
            return;
        }
        this.lastBindItem = obj;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, needDivider());
        super.onBind(obj, i, list);
    }
}
