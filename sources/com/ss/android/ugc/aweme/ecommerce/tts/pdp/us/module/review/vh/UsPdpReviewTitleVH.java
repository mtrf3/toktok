package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh;

import X.C03090Af;
import X.C16880lQ;
import X.C221108m2;
import X.C27575Arz;
import X.C27578As2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70941Rsn;
import X.C73156SnQ;
import X.C78946Uyc;
import X.C88913eJ;
import X.Q8U;
import X.TBT;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.ss.android.ugc.aweme.utils.Au2S14S0200000_4;
import com.ss.android.ugc.aweme.utils.Au2S15S0100000_4;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class UsPdpReviewTitleVH extends PdpHolder {
    public final C62822Ol8 LJLIL;
    public SellerInfo LJLILLLLZI;
    public final Map<Integer, View> LJLJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJI;
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

    public final PdpViewModel getVm() {
        return (PdpViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String LIZIZ;
        String LIZIZ2;
        Integer num;
        C27575Arz item = (C27575Arz) obj;
        o.LJIIIZ(item, "item");
        if (item.LJLJLLL) {
            View have_review_group = _$_findCachedViewById(R.id.e34);
            o.LJIIIIZZ(have_review_group, "have_review_group");
            have_review_group.setVisibility(0);
            View have_review_group2 = _$_findCachedViewById(R.id.e34);
            o.LJIIIIZZ(have_review_group2, "have_review_group");
            C16880lQ.LJIIJ(new Au2S15S0100000_4(this, 103, 42), have_review_group2);
            View no_product_review_group = _$_findCachedViewById(R.id.h2_);
            o.LJIIIIZZ(no_product_review_group, "no_product_review_group");
            no_product_review_group.setVisibility(8);
            View no_shop_review_group = _$_findCachedViewById(R.id.h2o);
            o.LJIIIIZZ(no_shop_review_group, "no_shop_review_group");
            no_shop_review_group.setVisibility(8);
            if (item.LJLIL != null) {
                View rating_number = _$_findCachedViewById(R.id.ink);
                o.LJIIIIZZ(rating_number, "rating_number");
                rating_number.setVisibility(0);
                ImageView rating_star = (ImageView) _$_findCachedViewById(R.id.inq);
                o.LJIIIIZZ(rating_star, "rating_star");
                rating_star.setVisibility(0);
                View review_subtitle_split = _$_findCachedViewById(R.id.j1b);
                o.LJIIIIZZ(review_subtitle_split, "review_subtitle_split");
                review_subtitle_split.setVisibility(0);
                ((TextView) _$_findCachedViewById(R.id.ink)).setText(item.LJLIL.toString());
            } else {
                View rating_number2 = _$_findCachedViewById(R.id.ink);
                o.LJIIIIZZ(rating_number2, "rating_number");
                rating_number2.setVisibility(8);
                ImageView rating_star2 = (ImageView) _$_findCachedViewById(R.id.inq);
                o.LJIIIIZZ(rating_star2, "rating_star");
                rating_star2.setVisibility(8);
                View review_subtitle_split2 = _$_findCachedViewById(R.id.j1b);
                o.LJIIIIZZ(review_subtitle_split2, "review_subtitle_split");
                review_subtitle_split2.setVisibility(8);
            }
            String str = item.LJLJLJ;
            if (str == null && (str = item.LJLJI) == null) {
                str = String.valueOf(item.LJLILLLLZI);
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.j1c);
            Integer num2 = item.LJLILLLLZI;
            if ((num2 == null || num2.intValue() != 0) && ((num = item.LJLILLLLZI) == null || num.intValue() != 1)) {
                LIZIZ2 = Q8U.LIZIZ(new Object[]{str}, 1, C88913eJ.LIZ(this.itemView, R.string.fc2, "itemView.context.getStri…g.ecom_pdp_reviews_count)"), "format(format, *args)");
            } else {
                LIZIZ2 = Q8U.LIZIZ(new Object[]{item.LJLILLLLZI}, 1, C88913eJ.LIZ(this.itemView, R.string.fc3, "itemView.context.getStri…ecom_pdp_reviews_count_1)"), "format(format, *args)");
            }
            textView.setText(LIZIZ2);
            C70414RkI c70414RkI = getVm().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJLI(item);
                return;
            }
            return;
        }
        Integer num3 = item.LJLJJI;
        if (num3 != null && num3.intValue() > 0) {
            View have_review_group3 = _$_findCachedViewById(R.id.e34);
            o.LJIIIIZZ(have_review_group3, "have_review_group");
            have_review_group3.setVisibility(8);
            View no_product_review_group2 = _$_findCachedViewById(R.id.h2_);
            o.LJIIIIZZ(no_product_review_group2, "no_product_review_group");
            no_product_review_group2.setVisibility(0);
            View no_shop_review_group2 = _$_findCachedViewById(R.id.h2o);
            o.LJIIIIZZ(no_shop_review_group2, "no_shop_review_group");
            no_shop_review_group2.setVisibility(8);
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.jyg);
            Integer num4 = item.LJLJJI;
            if (num4 == null || num4.intValue() != 1) {
                LIZIZ = Q8U.LIZIZ(new Object[]{item.LJLJJI}, 1, C88913eJ.LIZ(this.itemView, R.string.slt, "itemView.context.getStri…ec_pdp_shopreviews_count)"), "format(format, *args)");
            } else {
                LIZIZ = Q8U.LIZIZ(new Object[]{item.LJLJJI}, 1, C88913eJ.LIZ(this.itemView, R.string.slu, "itemView.context.getStri…_pdp_shopreviews_count_1)"), "format(format, *args)");
            }
            textView2.setText(LIZIZ);
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJZLJL(itemView, new C70941Rsn(), C27578As2.LJLIL, new AqS170S0100000_4(item, 1410));
            C70414RkI c70414RkI2 = getVm().LLFII;
            if (c70414RkI2 != null) {
                c70414RkI2.LJJLIIIIJ();
            }
            C73156SnQ.LJIIIIZZ(this, getVm(), new TBT() { // from class: X.As0
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj2) {
                    return ((PdpMainState) obj2).getShopInfo();
                }
            }, new AqS186S0100000_4(this, 322));
            View shop_review_entry = _$_findCachedViewById(R.id.jyh);
            o.LJIIIIZZ(shop_review_entry, "shop_review_entry");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 42), shop_review_entry);
            View shop_review_count = _$_findCachedViewById(R.id.jyg);
            o.LJIIIIZZ(shop_review_count, "shop_review_count");
            C16880lQ.LJIIJ(new Au2S14S0200000_4(this, item, 43), shop_review_count);
            return;
        }
        View have_review_group4 = _$_findCachedViewById(R.id.e34);
        o.LJIIIIZZ(have_review_group4, "have_review_group");
        have_review_group4.setVisibility(8);
        View no_product_review_group3 = _$_findCachedViewById(R.id.h2_);
        o.LJIIIIZZ(no_product_review_group3, "no_product_review_group");
        no_product_review_group3.setVisibility(8);
        View no_shop_review_group3 = _$_findCachedViewById(R.id.h2o);
        o.LJIIIIZZ(no_shop_review_group3, "no_shop_review_group");
        no_shop_review_group3.setVisibility(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsPdpReviewTitleVH(View view, ECBaseFragment eCBaseFragment) {
        super(view, R.layout.a4w);
        this.LJLJI = C03090Af.LIZLLL(view, "view", eCBaseFragment, "fragment");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLIL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 119));
    }
}
