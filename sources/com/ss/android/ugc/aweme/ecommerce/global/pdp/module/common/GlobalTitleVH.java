package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common;

import X.C16880lQ;
import X.C27631Ast;
import X.C45804HyK;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class GlobalTitleVH extends PdpHolder {
    public static final float LJLILLLLZI = C45804HyK.LJJ(24);
    public static final float LJLJI = C45804HyK.LJJ(16);
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalTitleVH(View view) {
        super(view, R.layout.a9t);
        o.LJIIIZ(view, "view");
        this.LJLIL = new LinkedHashMap();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        float f;
        float f2;
        float f3;
        float f4;
        C27631Ast item = (C27631Ast) obj;
        o.LJIIIZ(item, "item");
        TextView textView = (TextView) _$_findCachedViewById(R.id.lai);
        String str = item.LJLIL;
        if (str == null) {
            Integer num = item.LJLILLLLZI;
            if (num != null) {
                str = this.itemView.getContext().getString(num.intValue());
            } else {
                str = null;
            }
        }
        textView.setText(str);
        ImageView title_arrow = (ImageView) _$_findCachedViewById(R.id.l_0);
        o.LJIIIIZZ(title_arrow, "title_arrow");
        int i = 0;
        if (item.LJLJI == null) {
            i = 8;
        }
        title_arrow.setVisibility(i);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(item, 0, 42), itemView);
        View view = this.itemView;
        Padding padding = item.LJLJJI;
        if (padding != null) {
            f = padding.left;
        } else {
            f = LJLJI;
        }
        int i2 = (int) f;
        if (padding != null) {
            f2 = padding.top;
        } else {
            f2 = LJLILLLLZI;
        }
        int i3 = (int) f2;
        if (padding != null) {
            f3 = padding.right;
        } else {
            f3 = LJLJI;
        }
        int i4 = (int) f3;
        if (padding != null) {
            f4 = padding.bottom;
        } else {
            f4 = LJLILLLLZI;
        }
        view.setPadding(i2, i3, i4, (int) f4);
    }
}
