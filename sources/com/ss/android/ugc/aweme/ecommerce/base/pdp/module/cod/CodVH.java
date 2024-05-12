package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.cod;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CodVH extends PdpHolder {
    public final Map<Integer, View> LJLIL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodVH(View view) {
        super(view, R.layout.a27);
        o.LJIIIZ(view, "view");
        this.LJLIL = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002f, code lost:
    
        if ((!ujb.o.LJJJJJL(r0)) == true) goto L6;
     */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBind(java.lang.Object r7) {
        /*
            r6 = this;
            X.Ack r7 = (X.C26630Ack) r7
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            android.view.View r1 = r6.itemView
            java.lang.String r4 = "itemView"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r4)
            boolean r0 = r7.LJ
            X.C26508Aam.LIZ(r1, r0)
            android.view.View r1 = r6.itemView
            r0 = 2131364405(0x7f0a0a35, float:1.8348646E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r7.LIZ
            r1.setText(r0)
            java.lang.String r0 = r7.LIZLLL
            r5 = 0
            if (r0 == 0) goto La6
            boolean r0 = ujb.o.LJJJJJL(r0)
            r3 = 1
            r0 = r0 ^ 1
            if (r0 != r3) goto La6
        L31:
            java.lang.String r2 = "itemView.cod_desc"
            r1 = 2131364402(0x7f0a0a32, float:1.834864E38)
            if (r3 == 0) goto L97
            android.view.View r0 = r6.itemView
            android.view.View r0 = r0.findViewById(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r2)
            r0.setVisibility(r5)
            android.view.View r0 = r6.itemView
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            java.lang.String r0 = r7.LIZLLL
            r1.setText(r0)
        L51:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r1 = r7.LIZJ
            if (r1 == 0) goto L86
            android.view.View r0 = r6.itemView
            java.lang.String r3 = "itemView.context"
            boolean r0 = X.C0F1.LIZIZ(r0, r3)
            if (r0 == 0) goto L94
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.iconDark
        L61:
            if (r0 == 0) goto L86
            X.2cu r0 = r0.toImageUrlModel()
            X.W5F r2 = X.W5U.LJIIIZ(r0)
            android.view.View r1 = r6.itemView
            r0 = 2130968616(0x7f040028, float:1.754589E38)
            android.graphics.drawable.Drawable r0 = X.C7MY.LIZJ(r1, r3, r0)
            r2.LJIILIIL = r0
            android.view.View r1 = r6.itemView
            r0 = 2131364403(0x7f0a0a33, float:1.8348642E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.LJJIIJZLJL = r0
            X.C16880lQ.LLJJJ(r2)
        L86:
            android.view.View r3 = r6.itemView
            X.RsS r2 = X.C62850Ola.LJI(r3, r4)
            X.Acm r1 = X.C26632Acm.LJLIL
            X.Acl r0 = X.C26631Acl.LJLIL
            X.C78946Uyc.LJJIIJZLJL(r3, r2, r1, r0)
            return
        L94:
            com.ss.android.ugc.aweme.ecommerce.service.vo.Image r0 = r1.icon
            goto L61
        L97:
            android.view.View r0 = r6.itemView
            android.view.View r1 = r0.findViewById(r1)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r2)
            r0 = 8
            r1.setVisibility(r0)
            goto L51
        La6:
            r3 = 0
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.pdp.module.cod.CodVH.onBind(java.lang.Object):void");
    }
}
