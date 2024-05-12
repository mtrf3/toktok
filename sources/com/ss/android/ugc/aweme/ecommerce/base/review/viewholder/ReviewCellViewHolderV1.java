package com.ss.android.ugc.aweme.ecommerce.base.review.viewholder;

import X.AbstractC70686Rog;
import X.C16880lQ;
import X.C221108m2;
import X.C44878HjO;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70677RoX;
import X.C70681Rob;
import X.C70682Roc;
import X.C70684Roe;
import X.C70691Rol;
import X.ORZ;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS116S0300000_12;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ReviewCellViewHolderV1 extends AbsReviewCellViewHolder {
    public final FragmentManager LJLJI;
    public final int LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final Map<Integer, View> LJLJJLL;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJLL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
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

    public final ProductReviewViewModel X() {
        return (ProductReviewViewModel) this.LJLJJL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void L(C70677RoX reviewVO) {
        String str;
        List<ReviewMedia> list;
        o.LJIIIZ(reviewVO, "reviewVO");
        super.L(reviewVO);
        ReviewItemStruct reviewItemStruct = reviewVO.LIZ;
        C70682Roc bindCellBody$lambda$3 = (C70682Roc) _$_findCachedViewById(R.id.mht);
        Integer num = null;
        if (reviewVO.LJ) {
            o.LJIIIIZZ(bindCellBody$lambda$3, "bindCellBody$lambda$3");
            C70682Roc.LIZJ(bindCellBody$lambda$3, Q(reviewItemStruct), 0, false, null, 14);
        } else {
            o.LJIIIIZZ(bindCellBody$lambda$3, "bindCellBody$lambda$3");
            ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
            if (mainReview != null) {
                str = mainReview.text;
            } else {
                str = null;
            }
            C70682Roc.LIZJ(bindCellBody$lambda$3, str, 4, true, null, 8);
        }
        bindCellBody$lambda$3.setExpandListener(new AqS116S0300000_12(this, reviewItemStruct, bindCellBody$lambda$3, 8));
        C70681Rob c70681Rob = (C70681Rob) _$_findCachedViewById(R.id.mi4);
        ProductReviewViewModel vm = X();
        c70681Rob.getClass();
        o.LJIIIZ(vm, "vm");
        ReviewItemStruct.MainReview mainReview2 = reviewVO.LIZ.review;
        if (mainReview2 != null) {
            list = mainReview2.media;
            if (list != null) {
                num = Integer.valueOf(list.size());
            }
        } else {
            list = null;
        }
        if (num == null || num.intValue() == 0) {
            c70681Rob.setVisibility(8);
        } else if (num.intValue() == 1) {
            c70681Rob.setVisibility(0);
            View one_image_layout = c70681Rob.LIZ(R.id.hab);
            o.LJIIIIZZ(one_image_layout, "one_image_layout");
            one_image_layout.setVisibility(0);
            View one_more_image_layout = c70681Rob.LIZ(R.id.hak);
            o.LJIIIIZZ(one_more_image_layout, "one_more_image_layout");
            one_more_image_layout.setVisibility(8);
            ReviewMedia reviewMedia = (ReviewMedia) ORZ.LJLLLL(list);
            if (reviewMedia != null) {
                SmartImageView one_image_view = (SmartImageView) c70681Rob.LIZ(R.id.hac);
                o.LJIIIIZZ(one_image_view, "one_image_view");
                c70681Rob.LIZIZ(reviewMedia, one_image_view);
                SmartImageView one_image_view2 = (SmartImageView) c70681Rob.LIZ(R.id.hac);
                o.LJIIIIZZ(one_image_view2, "one_image_view");
                c70681Rob.LIZJ(reviewMedia, vm, one_image_view2, reviewVO);
            }
        } else {
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
                SmartImageView down_image_view2 = (SmartImageView) c70681Rob.LIZ(R.id.cfm);
                o.LJIIIIZZ(down_image_view2, "down_image_view");
                c70681Rob.LIZJ(reviewMedia2, vm, down_image_view2, reviewVO);
            }
            ReviewMedia reviewMedia3 = (ReviewMedia) ORZ.LJLLLLLL(1, list);
            if (reviewMedia3 != null) {
                SmartImageView up_image_view = (SmartImageView) c70681Rob.LIZ(R.id.muc);
                o.LJIIIIZZ(up_image_view, "up_image_view");
                c70681Rob.LIZIZ(reviewMedia3, up_image_view);
                SmartImageView up_image_view2 = (SmartImageView) c70681Rob.LIZ(R.id.muc);
                o.LJIIIIZZ(up_image_view2, "up_image_view");
                c70681Rob.LIZJ(reviewMedia3, vm, up_image_view2, reviewVO);
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
            } else {
                View one_more_image_text2 = c70681Rob.LIZ(R.id.hal);
                o.LJIIIIZZ(one_more_image_text2, "one_more_image_text");
                one_more_image_text2.setVisibility(8);
            }
        }
        ((C70681Rob) _$_findCachedViewById(R.id.mi4)).setOnItemMediaClickListener(new C70684Roe(this, reviewItemStruct));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void M(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        super.M(reviewVO);
        ReviewItemStruct reviewItemStruct = reviewVO.LIZ;
        View tv_review_cell_digg = _$_findCachedViewById(R.id.mhw);
        o.LJIIIIZZ(tv_review_cell_digg, "tv_review_cell_digg");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, reviewItemStruct, 16, 42), tv_review_cell_digg);
        View tv_review_cell_digg_count = _$_findCachedViewById(R.id.mhx);
        o.LJIIIIZZ(tv_review_cell_digg_count, "tv_review_cell_digg_count");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, reviewItemStruct, 17, 42), tv_review_cell_digg_count);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (r1 == true) goto L8;
     */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(X.C70677RoX r6) {
        /*
            r5 = this;
            java.lang.String r0 = "reviewVO"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            super.N(r6)
            com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct r4 = r6.LIZ
            java.lang.Integer r2 = r4.reviewSourceType
            X.IMn r0 = X.EnumC46493IMn.THIRD_PARTY
            int r1 = r0.getType()
            if (r2 != 0) goto L54
        L14:
            com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel r0 = r5.X()
            X.Rot r0 = r0.LJLLI
            r3 = 0
            if (r0 == 0) goto L52
            boolean r1 = r0.LJLJJLL
            r0 = 1
            if (r1 != r0) goto L52
        L22:
            r2 = 2131379308(0x7f0a446c, float:1.8378873E38)
            if (r0 != 0) goto L48
            android.view.View r1 = r5._$_findCachedViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 8
            r1.setVisibility(r0)
        L32:
            android.view.View r3 = r5._$_findCachedViewById(r2)
            java.lang.String r0 = "tv_more_icon"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            com.ss.android.ugc.aweme.utils.Au2S19S0200000_12 r2 = new com.ss.android.ugc.aweme.utils.Au2S19S0200000_12
            r1 = 18
            r0 = 42
            r2.<init>(r5, r4, r1, r0)
            X.C16880lQ.LJIIJ(r2, r3)
            return
        L48:
            android.view.View r0 = r5._$_findCachedViewById(r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setVisibility(r3)
            goto L32
        L52:
            r0 = 0
            goto L22
        L54:
            int r0 = r2.intValue()
            if (r0 != r1) goto L14
            r0 = 2131379633(0x7f0a45b1, float:1.8379532E38)
            android.view.View r3 = r5._$_findCachedViewById(r0)
            com.bytedance.tux.input.TuxTextView r3 = (com.bytedance.tux.input.TuxTextView) r3
            java.lang.String r0 = "bindCellHeader$lambda$1"
            kotlin.jvm.internal.o.LJIIIIZZ(r3, r0)
            com.ss.android.ugc.aweme.utils.Au2S19S0200000_12 r2 = new com.ss.android.ugc.aweme.utils.Au2S19S0200000_12
            r1 = 19
            r0 = 42
            r2.<init>(r3, r5, r1, r0)
            X.C16880lQ.LJIIJ(r2, r3)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolderV1.N(X.RoX):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    public final void P(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        ReviewItemStruct reviewItemStruct = reviewVO.LIZ;
        super.P(reviewVO);
        C70682Roc c70682Roc = (C70682Roc) _$_findCachedViewById(R.id.mi2);
        c70682Roc.setExpandListener(new AqS116S0300000_12(this, reviewItemStruct, c70682Roc, 9));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewCellViewHolderV1(ViewGroup viewGroup, FragmentManager fragmentManager, int i) {
        super(viewGroup);
        this.LJLJJLL = C44878HjO.LIZIZ(viewGroup, "container");
        this.LJLJI = fragmentManager;
        this.LJLJJI = i;
        C65776Prg LIZ = C65352Pkq.LIZ(ProductReviewViewModel.class);
        this.LJLJJL = C221108m2.LIZIZ(new AqS93S0300000_4(this, LIZ, LIZ, 77));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder
    /* renamed from: U */
    public final void onBind(AbstractC70686Rog item, int i, List<Object> list) {
        o.LJIIIZ(item, "item");
        super.onBind(item, i, list);
        C70677RoX c70677RoX = (C70677RoX) item;
        C70691Rol c70691Rol = X().LJLLILLLL;
        if (c70691Rol != null) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            c70691Rol.LJJIFFI(this.latestItemPositionInternal + 1, itemView, c70677RoX.LIZ, c70677RoX.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.AbsReviewCellViewHolder, com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* bridge */ /* synthetic */ void onBind(Object obj, int i, List list) {
        onBind((AbstractC70686Rog) obj, i, list);
    }
}
