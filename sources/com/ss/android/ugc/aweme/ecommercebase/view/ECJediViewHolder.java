package com.ss.android.ugc.aweme.ecommercebase.view;

import X.C26901Ah7;
import X.C78983UzD;
import X.InterfaceC26903Ah9;
import X.X1D;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class ECJediViewHolder extends JediSimpleViewHolder implements InterfaceC26903Ah9 {
    public Map<Integer, View> _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

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

    public void onEvent(String eventName, String params) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(params, "params");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void onDestroy() {
        super.onDestroy();
        onClearEvent();
    }

    public View getContainerView() {
        return this.itemView;
    }

    public void onClearEvent() {
        C26901Ah7.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECJediViewHolder(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this._$_findViewCache = new LinkedHashMap();
    }

    public void subscribeEvent(String... strArr) {
        C26901Ah7.LIZIZ(this, strArr);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public void onBind(Object obj, int i, List<Object> list) {
        try {
            super.onBind(obj, i, list);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onBind uncaught EC error: msg = ");
            LIZ.append(th.getMessage());
            C78983UzD.LJIJ(th, X1D.LIZIZ(LIZ));
            throw th;
        }
    }
}
