package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.review;

import X.C025908h;
import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C26839Ag7;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C72704Sg8;
import X.C88913eJ;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalShopReviewTitleVH extends PdpHolder {
    public final C62822Ol8 LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLILLLLZI;
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

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String LIZIZ;
        int i;
        C26839Ag7 item = (C26839Ag7) obj;
        o.LJIIIZ(item, "item");
        this.LJLIL.getValue();
        String LIZ = C88913eJ.LIZ(this.itemView, R.string.f_p, "itemView.context.getStri…eview_store_review_entry)");
        TextView textView = (TextView) _$_findCachedViewById(R.id.jyl);
        boolean LIZIZ2 = C72704Sg8.LIZIZ(this.itemView, "itemView.context");
        Object obj2 = CardStruct.IStatusCode.DEFAULT;
        if (LIZIZ2) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append('(');
            String str = item.LJLILLLLZI;
            if (str == null) {
                Object obj3 = item.LJLIL;
                if (obj3 != null) {
                    obj2 = obj3;
                }
                str = obj2.toString();
            }
            LIZIZ = C025908h.LIZIZ(LIZ2, str, ") ", LIZ, LIZ2);
        } else {
            StringBuilder LIZJ = b1.LIZJ(LIZ, " (");
            String str2 = item.LJLILLLLZI;
            if (str2 == null) {
                Object obj4 = item.LJLIL;
                if (obj4 != null) {
                    obj2 = obj4;
                }
                str2 = obj2.toString();
            }
            LIZIZ = q.LIZIZ(LIZJ, str2, ')', LIZJ);
        }
        textView.setText(LIZIZ);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.jyf);
        Context context = this.itemView.getContext();
        Integer num = item.LJLIL;
        if ((num != null && num.intValue() == 0) || item.LJLIL == null) {
            i = R.string.f_u;
        } else {
            i = R.string.f_q;
        }
        textView2.setText(context.getString(i));
        ImageView shop_arrow_view = (ImageView) _$_findCachedViewById(R.id.jxu);
        o.LJIIIIZZ(shop_arrow_view, "shop_arrow_view");
        Integer num2 = item.LJLIL;
        int i2 = 0;
        if ((num2 != null && num2.intValue() == 0) || item.LJLIL == null) {
            i2 = 8;
        }
        shop_arrow_view.setVisibility(i2);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S14S0200000_4(item, this, 24), itemView);
        C70414RkI c70414RkI = ((PdpViewModel) this.LJLIL.getValue()).LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJLIIIIJ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalShopReviewTitleVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a9i);
        this.LJLILLLLZI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 100));
    }
}
