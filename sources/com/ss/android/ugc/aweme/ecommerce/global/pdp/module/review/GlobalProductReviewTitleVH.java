package com.ss.android.ugc.aweme.ecommerce.global.pdp.module.review;

import X.C025908h;
import X.C03090Af;
import X.C16880lQ;
import X.C1AH;
import X.C221108m2;
import X.C26516Aau;
import X.C26871Agd;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C72704Sg8;
import X.C88913eJ;
import X.JBR;
import X.X1D;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class GlobalProductReviewTitleVH extends PdpHolder {
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH
    public final boolean needDivider() {
        ProductPackStruct productPackStruct;
        Integer num = ((C26871Agd) getItem()).LJLILLLLZI;
        if (((num != null && num.intValue() == 0) || ((C26871Agd) getItem()).LJLILLLLZI == null) && (productPackStruct = ((PdpViewModel) this.LJLIL.getValue()).LJLJLLL) != null && productPackStruct.shopReview != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String LJFF;
        int i;
        C26871Agd item = (C26871Agd) obj;
        o.LJIIIZ(item, "item");
        int i2 = 8;
        if (item.LJLIL != null) {
            C1AH rating_group = (C1AH) _$_findCachedViewById(R.id.ind);
            o.LJIIIIZZ(rating_group, "rating_group");
            rating_group.setVisibility(0);
            View review_title_text = _$_findCachedViewById(R.id.j1e);
            o.LJIIIIZZ(review_title_text, "review_title_text");
            review_title_text.setVisibility(8);
            ((C26516Aau) _$_findCachedViewById(R.id.ink)).getScore().setText(item.LJLIL.toString());
            TextView textView = (TextView) _$_findCachedViewById(R.id.j0j);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('(');
            LIZ.append(item.LJLJJI);
            LIZ.append(')');
            textView.setText(X1D.LIZIZ(LIZ));
        } else {
            C1AH rating_group2 = (C1AH) _$_findCachedViewById(R.id.ind);
            o.LJIIIIZZ(rating_group2, "rating_group");
            rating_group2.setVisibility(8);
            View review_title_text2 = _$_findCachedViewById(R.id.j1e);
            o.LJIIIIZZ(review_title_text2, "review_title_text");
            review_title_text2.setVisibility(0);
            String LIZ2 = C88913eJ.LIZ(this.itemView, R.string.f_d, "itemView.context.getStri…review_less_than_5_entry)");
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.j1e);
            if (C72704Sg8.LIZIZ(this.itemView, "itemView.context")) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('(');
                LJFF = C025908h.LIZIZ(LIZ3, item.LJLJJI, ") ", LIZ2, LIZ3);
            } else {
                StringBuilder LIZJ = b1.LIZJ(LIZ2, " (");
                LJFF = JBR.LJFF(LIZJ, item.LJLJJI, ") ", LIZJ);
            }
            textView2.setText(LJFF);
            View no_review_text = _$_findCachedViewById(R.id.h2g);
            o.LJIIIIZZ(no_review_text, "no_review_text");
            Integer num = item.LJLILLLLZI;
            if ((num != null && num.intValue() == 0) || item.LJLILLLLZI == null) {
                i = 0;
            } else {
                i = 8;
            }
            no_review_text.setVisibility(i);
            ImageView rating_arrow_view = (ImageView) _$_findCachedViewById(R.id.in9);
            o.LJIIIIZZ(rating_arrow_view, "rating_arrow_view");
            Integer num2 = item.LJLILLLLZI;
            if ((num2 == null || num2.intValue() != 0) && item.LJLILLLLZI != null) {
                i2 = 0;
            }
            rating_arrow_view.setVisibility(i2);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 58, 42), itemView);
        C70414RkI c70414RkI = ((PdpViewModel) this.LJLIL.getValue()).LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJLI(item);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalProductReviewTitleVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a4v);
        this.LJLILLLLZI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 99));
    }
}
