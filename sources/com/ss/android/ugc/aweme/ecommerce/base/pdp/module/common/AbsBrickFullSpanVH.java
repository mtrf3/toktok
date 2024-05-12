package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common;

import X.C0F1;
import X.C141335gf;
import X.C26508Aam;
import X.C278817o;
import X.C3C5;
import X.C76800UCe;
import X.InterfaceC27632Asu;
import android.graphics.Color;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public abstract class AbsBrickFullSpanVH extends AbsFullSpanVH {
    public final Map<Integer, View> LJLIL = new LinkedHashMap();

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
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
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public AbsBrickFullSpanVH(View view) {
        super(view);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void onBind(InterfaceC27632Asu item) {
        boolean z;
        String str;
        Object LIZ;
        Padding padding;
        Boolean bool;
        o.LJIIIZ(item, "item");
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        BrickStyle m = item.m();
        if (m != null && (bool = m.showDivider) != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        C26508Aam.LIZ(itemView, z);
        BrickStyle m2 = item.m();
        if (m2 != null && (padding = m2.padding) != null) {
            this.itemView.setPadding(C278817o.LIZ(padding.left), C278817o.LIZ(padding.top), C278817o.LIZ(padding.right), C278817o.LIZ(padding.bottom));
        }
        boolean LIZIZ = C0F1.LIZIZ(this.itemView, "itemView.context");
        BrickStyle m3 = item.m();
        if (LIZIZ) {
            if (m3 != null) {
                str = m3.backgroundColorDark;
            } else {
                return;
            }
        } else if (m3 != null) {
            str = m3.backgroundColor;
        } else {
            return;
        }
        if (str != null) {
            try {
                this.itemView.setBackgroundColor(Color.parseColor(str));
                LIZ = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            C3C5.m6boximpl(LIZ);
        }
    }
}
