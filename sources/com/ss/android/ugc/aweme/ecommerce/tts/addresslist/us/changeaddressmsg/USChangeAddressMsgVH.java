package com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.changeaddressmsg;

import X.C1FL;
import X.C44878HjO;
import X.C9CJ;
import X.OUP;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class USChangeAddressMsgVH extends ECJediViewHolder {
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
    public USChangeAddressMsgVH(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a8n, viewGroup, false, "from(parent.context)\n   …_hint_msg, parent, false)"));
        this.LJLIL = C44878HjO.LIZIZ(viewGroup, "parent");
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        C9CJ item = (C9CJ) obj;
        o.LJIIIZ(item, "item");
        String str = item.LIZ;
        if (str != null) {
            View description_layout = _$_findCachedViewById(R.id.c8i);
            o.LJIIIIZZ(description_layout, "description_layout");
            OUP.LJJLIIIJ(description_layout);
            ((TextView) _$_findCachedViewById(R.id.c84)).setText(str);
        }
    }
}
