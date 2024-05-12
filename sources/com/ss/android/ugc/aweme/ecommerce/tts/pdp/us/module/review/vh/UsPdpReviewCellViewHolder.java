package com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh;

import X.AbstractC70686Rog;
import X.C16880lQ;
import X.C221108m2;
import X.C26508Aam;
import X.C44878HjO;
import X.C45804HyK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70445Rkn;
import X.C70677RoX;
import X.C70681Rob;
import X.C70682Roc;
import X.C7MY;
import X.ORZ;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class UsPdpReviewCellViewHolder extends AbsReviewCellViewHolder {
    public final C62822Ol8 LJLJI;
    public final Map<Integer, View> LJLJJI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void V(Integer num, Boolean bool) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void onResume() {
        super.onResume();
        ITEM item = getItem();
        o.LJII(item, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.base.review.viewobject.ReviewItem.ReviewCellVO");
        trackTag(new C70445Rkn(((C70677RoX) item).LIZ));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsPdpReviewCellViewHolder(ViewGroup viewGroup) {
        super(viewGroup);
        this.LJLJJI = C44878HjO.LIZIZ(viewGroup, "container");
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        this.LJLJI = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 191));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void L(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        super.L(reviewVO);
        C70682Roc bindCellBody$lambda$1 = (C70682Roc) _$_findCachedViewById(R.id.mht);
        o.LJIIIIZZ(bindCellBody$lambda$1, "bindCellBody$lambda$1");
        List<ReviewMedia> list = null;
        C70682Roc.LIZJ(bindCellBody$lambda$1, Q(reviewVO.LIZ), 4, false, null, 8);
        C70681Rob c70681Rob = (C70681Rob) _$_findCachedViewById(R.id.mi4);
        c70681Rob.getClass();
        ReviewItemStruct.MainReview mainReview = reviewVO.LIZ.review;
        Integer num = null;
        if (mainReview != null && (list = mainReview.media) != null) {
            num = Integer.valueOf(list.size());
        }
        if (num == null || num.intValue() == 0) {
            c70681Rob.setVisibility(8);
            return;
        }
        if (num.intValue() == 1) {
            c70681Rob.setVisibility(0);
            View one_image_layout = c70681Rob.LIZ(R.id.hab);
            o.LJIIIIZZ(one_image_layout, "one_image_layout");
            one_image_layout.setVisibility(0);
            View one_more_image_layout = c70681Rob.LIZ(R.id.hak);
            o.LJIIIIZZ(one_more_image_layout, "one_more_image_layout");
            one_more_image_layout.setVisibility(8);
            ReviewMedia reviewMedia = (ReviewMedia) ORZ.LJLLLL(list);
            if (reviewMedia == null) {
                return;
            }
            SmartImageView one_image_view = (SmartImageView) c70681Rob.LIZ(R.id.hac);
            o.LJIIIIZZ(one_image_view, "one_image_view");
            c70681Rob.LIZIZ(reviewMedia, one_image_view);
            return;
        }
        c70681Rob.setVisibility(0);
        View one_image_layout2 = c70681Rob.LIZ(R.id.hab);
        o.LJIIIIZZ(one_image_layout2, "one_image_layout");
        one_image_layout2.setVisibility(8);
        View one_more_image_layout2 = c70681Rob.LIZ(R.id.hak);
        o.LJIIIIZZ(one_more_image_layout2, "one_more_image_layout");
        one_more_image_layout2.setVisibility(0);
        ReviewMedia reviewMedia2 = (ReviewMedia) ORZ.LJLLLL(list);
        if (reviewMedia2 != null) {
            SmartImageView down_image_view = (SmartImageView) c70681Rob.LIZ(R.id.cfm);
            o.LJIIIIZZ(down_image_view, "down_image_view");
            c70681Rob.LIZIZ(reviewMedia2, down_image_view);
        }
        ReviewMedia reviewMedia3 = (ReviewMedia) ORZ.LJLLLLLL(1, list);
        if (reviewMedia3 != null) {
            SmartImageView up_image_view = (SmartImageView) c70681Rob.LIZ(R.id.muc);
            o.LJIIIIZZ(up_image_view, "up_image_view");
            c70681Rob.LIZIZ(reviewMedia3, up_image_view);
        }
        if (num.intValue() > 2) {
            View one_more_image_text = c70681Rob.LIZ(R.id.hal);
            o.LJIIIIZZ(one_more_image_text, "one_more_image_text");
            one_more_image_text.setVisibility(0);
            TextView textView = (TextView) c70681Rob.LIZ(R.id.hal);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(num.intValue() - 2);
            LIZ.append('+');
            textView.setText(X1D.LIZIZ(LIZ));
            return;
        }
        View one_more_image_text2 = c70681Rob.LIZ(R.id.hal);
        o.LJIIIIZZ(one_more_image_text2, "one_more_image_text");
        one_more_image_text2.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void M(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        super.M(reviewVO);
        ImageView tv_review_cell_digg = (ImageView) _$_findCachedViewById(R.id.mhw);
        o.LJIIIIZZ(tv_review_cell_digg, "tv_review_cell_digg");
        tv_review_cell_digg.setVisibility(8);
        View tv_review_cell_digg_count = _$_findCachedViewById(R.id.mhx);
        o.LJIIIIZZ(tv_review_cell_digg_count, "tv_review_cell_digg_count");
        tv_review_cell_digg_count.setVisibility(8);
        View tv_review_cell_bottom_split = _$_findCachedViewById(R.id.mhu);
        o.LJIIIIZZ(tv_review_cell_bottom_split, "tv_review_cell_bottom_split");
        tv_review_cell_bottom_split.setVisibility(8);
        C45804HyK.LJJLIIIIJ(0, _$_findCachedViewById(R.id.mhv));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void N(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        super.N(reviewVO);
        ImageView tv_more_icon = (ImageView) _$_findCachedViewById(R.id.mbd);
        o.LJIIIIZZ(tv_more_icon, "tv_more_icon");
        tv_more_icon.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void P(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        View tv_product_review_cell_reply_v1 = _$_findCachedViewById(R.id.mfa);
        o.LJIIIIZZ(tv_product_review_cell_reply_v1, "tv_product_review_cell_reply_v1");
        tv_product_review_cell_reply_v1.setVisibility(8);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    /* renamed from: U */
    public final void onBind(AbstractC70686Rog item, int i, List<Object> list) {
        o.LJIIIZ(item, "item");
        super.onBind(item, i, list);
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        int i2 = 0;
        C26508Aam.LIZ(itemView, false);
        View itemView2 = this.itemView;
        o.LJIIIIZZ(itemView2, "itemView");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, item, 23, 42), itemView2);
        if (((C70677RoX) item).LJIIIIZZ) {
            i2 = C7MY.LIZIZ(16);
        }
        C45804HyK.LJJL(i2, this.itemView);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj, int i, List list) {
        onBind((AbstractC70686Rog) obj, i, list);
    }
}
