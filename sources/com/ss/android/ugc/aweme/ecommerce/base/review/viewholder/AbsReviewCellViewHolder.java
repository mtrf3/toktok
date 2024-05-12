package com.ss.android.ugc.aweme.ecommerce.base.review.viewholder;

import X.AbstractC70686Rog;
import X.C0F1;
import X.C110614Vt;
import X.C16880lQ;
import X.C1EU;
import X.C1FL;
import X.C2068389v;
import X.C26508Aam;
import X.C32151Nz;
import X.C38350F3i;
import X.C44878HjO;
import X.C45804HyK;
import X.C61328O5c;
import X.C70677RoX;
import X.C70682Roc;
import X.C70759Rpr;
import X.C71313Ryn;
import X.C78685UuP;
import X.EnumC46493IMn;
import X.LTF;
import X.O6R;
import X.ORZ;
import X.W5F;
import Y.ARunnableS31S0200000_12;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewMedia;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class AbsReviewCellViewHolder extends AbsFullSpanVH {
    public C70677RoX LJLIL;
    public final Map<Integer, View> LJLILLLLZI;

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLILLLLZI).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder
    public View _$_findCachedViewById(int i) {
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

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean T() {
        C70677RoX c70677RoX;
        ReviewItemStruct reviewItemStruct;
        Boolean bool;
        ITEM item = getItem();
        if ((item instanceof C70677RoX) && (c70677RoX = (C70677RoX) item) != null && (reviewItemStruct = c70677RoX.LIZ) != null && (bool = reviewItemStruct.isOwner) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsReviewCellViewHolder(ViewGroup viewGroup) {
        super(C1FL.LIZIZ(viewGroup, R.layout.a5y, viewGroup, false, "from(container.context).…ell_v1, container, false)"));
        this.LJLILLLLZI = C44878HjO.LIZIZ(viewGroup, "container");
    }

    public void L(C70677RoX reviewVO) {
        o.LJIIIZ(reviewVO, "reviewVO");
        ReviewItemStruct reviewItemStruct = reviewVO.LIZ;
        C70682Roc bindCellBody$lambda$1 = (C70682Roc) _$_findCachedViewById(R.id.mht);
        o.LJIIIIZZ(bindCellBody$lambda$1, "bindCellBody$lambda$1");
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        int i = 0;
        if (mainReview == null || !mainReview.LIZ()) {
            i = 8;
        }
        bindCellBody$lambda$1.setVisibility(i);
        bindCellBody$lambda$1.setContentFont(41);
        bindCellBody$lambda$1.setMoreFont(42);
        bindCellBody$lambda$1.setContentColor(R.attr.go);
        bindCellBody$lambda$1.setMoreDotText("...");
    }

    public void M(C70677RoX reviewVO) {
        String str;
        int i;
        o.LJIIIZ(reviewVO, "reviewVO");
        ReviewItemStruct reviewItemStruct = reviewVO.LIZ;
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        if (mainReview != null) {
            str = mainReview.reviewTimestampFmt;
        } else {
            str = null;
        }
        View tv_review_cell_date = _$_findCachedViewById(R.id.mhv);
        o.LJIIIIZZ(tv_review_cell_date, "tv_review_cell_date");
        int i2 = 0;
        if (C78685UuP.LJJJZ(str)) {
            i = 0;
        } else {
            i = 8;
        }
        tv_review_cell_date.setVisibility(i);
        ((TextView) _$_findCachedViewById(R.id.mhv)).setText(str);
        String str2 = reviewItemStruct.specification;
        View tv_review_cell_size = _$_findCachedViewById(R.id.mi3);
        o.LJIIIIZZ(tv_review_cell_size, "tv_review_cell_size");
        if (!C78685UuP.LJJJZ(str2)) {
            i2 = 8;
        }
        tv_review_cell_size.setVisibility(i2);
        ((TextView) _$_findCachedViewById(R.id.mi3)).setText(str2);
        V(reviewItemStruct.diggCount, reviewItemStruct.isDigged);
    }

    public void N(C70677RoX reviewVO) {
        Icon icon;
        String str;
        int i;
        int i2;
        String str2;
        Float LJJIJLIJ;
        String str3;
        Image image;
        Icon icon2;
        o.LJIIIZ(reviewVO, "reviewVO");
        ReviewItemStruct reviewItemStruct = reviewVO.LIZ;
        Image image2 = null;
        if (C0F1.LIZIZ(this.itemView, "itemView.context")) {
            ReviewItemStruct.User user = reviewItemStruct.user;
            if (user != null && (icon2 = user.defaultAvatar) != null) {
                image2 = icon2.iconDark;
            }
        } else {
            ReviewItemStruct.User user2 = reviewItemStruct.user;
            if (user2 != null && (icon = user2.defaultAvatar) != null) {
                image2 = icon.icon;
            }
        }
        ReviewItemStruct.User user3 = reviewItemStruct.user;
        if (user3 != null && (image = user3.avatar) != null) {
            image2 = image;
        }
        W5F LJ = C70759Rpr.LJ(image2);
        LJ.LJIIJJI = R.drawable.dds;
        LJ.LJJIIJ = (SmartImageView) _$_findCachedViewById(R.id.m08);
        C16880lQ.LLJJJ(LJ);
        TextView textView = (TextView) _$_findCachedViewById(R.id.mby);
        ReviewItemStruct.User user4 = reviewItemStruct.user;
        String str4 = "";
        if (user4 == null || (str = user4.name) == null) {
            str = "";
        }
        textView.setText(str);
        View tv_shop_from = _$_findCachedViewById(R.id.mk6);
        o.LJIIIIZZ(tv_shop_from, "tv_shop_from");
        int i3 = 8;
        if (C78685UuP.LJJJZ(reviewItemStruct.reviewSourceName)) {
            i = 0;
        } else {
            i = 8;
        }
        tv_shop_from.setVisibility(i);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.mk6);
        String str5 = reviewItemStruct.reviewSourceName;
        if (str5 != null) {
            str4 = str5;
        }
        textView2.setText(str4);
        Integer num = reviewItemStruct.reviewSourceType;
        int type = EnumC46493IMn.THIRD_PARTY.getType();
        if (num == null || num.intValue() != type || !C78685UuP.LJJJZ(reviewItemStruct.reviewLink)) {
            i2 = R.attr.gv;
        } else {
            i2 = R.attr.bx;
        }
        ((TuxTextView) _$_findCachedViewById(R.id.mk6)).setTextColorRes(i2);
        View tv_rating_star = _$_findCachedViewById(R.id.mgm);
        o.LJIIIIZZ(tv_rating_star, "tv_rating_star");
        ReviewItemStruct.MainReview mainReview = reviewItemStruct.review;
        if (mainReview != null && (str3 = mainReview.rating) != null && C38350F3i.LJJIJLIJ(str3) != null) {
            i3 = 0;
        }
        tv_rating_star.setVisibility(i3);
        ((LTF) _$_findCachedViewById(R.id.mgm)).setStarSize(16);
        ((LTF) _$_findCachedViewById(R.id.mgm)).setNoneTypeStarTintColor(R.attr.gp);
        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
        if (mainReview2 != null && (str2 = mainReview2.rating) != null && (LJJIJLIJ = C38350F3i.LJJIJLIJ(str2)) != null) {
            ((LTF) _$_findCachedViewById(R.id.mgm)).setRate(LJJIJLIJ.floatValue());
        }
    }

    public void P(C70677RoX reviewVO) {
        String str;
        o.LJIIIZ(reviewVO, "reviewVO");
        ReviewItemStruct.MainReview mainReview = reviewVO.LIZ.review;
        if (mainReview != null) {
            str = mainReview.reply;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            View tv_product_review_cell_reply_v1 = _$_findCachedViewById(R.id.mfa);
            o.LJIIIIZZ(tv_product_review_cell_reply_v1, "tv_product_review_cell_reply_v1");
            tv_product_review_cell_reply_v1.setVisibility(0);
            C70682Roc c70682Roc = (C70682Roc) _$_findCachedViewById(R.id.mi2);
            c70682Roc.setContentFont(71);
            c70682Roc.setMoreFont(72);
            c70682Roc.setContentColor(R.attr.go);
            c70682Roc.setMoreDotText("...");
            if (reviewVO.LJI) {
                C70682Roc.LIZJ(c70682Roc, str, 0, false, null, 14);
                return;
            } else {
                c70682Roc.LIZIZ(str, 2, true, new AqS178S0100000_12(this, 166));
                return;
            }
        }
        View tv_product_review_cell_reply_v12 = _$_findCachedViewById(R.id.mfa);
        o.LJIIIIZZ(tv_product_review_cell_reply_v12, "tv_product_review_cell_reply_v1");
        tv_product_review_cell_reply_v12.setVisibility(8);
    }

    public final SpannableStringBuilder Q(ReviewItemStruct reviewData) {
        List<ReviewItemStruct.DisplayReviewText> list;
        boolean z;
        o.LJIIIZ(reviewData, "reviewData");
        ReviewItemStruct.MainReview mainReview = reviewData.review;
        String str = null;
        if (mainReview != null) {
            list = mainReview.displayReviewTexts;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z) {
            ReviewItemStruct.MainReview mainReview2 = reviewData.review;
            if (mainReview2 != null) {
                str = mainReview2.text;
            }
            spannableStringBuilder.append((CharSequence) str);
        } else {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            spannableStringBuilder = new SpannableStringBuilder();
            if (list != null) {
                int i = 0;
                for (ReviewItemStruct.DisplayReviewText displayReviewText : list) {
                    if (i != 0) {
                        spannableStringBuilder.append((CharSequence) "\n");
                    }
                    Integer num = displayReviewText.textType;
                    if (num == null || num.intValue() != 2) {
                        Integer num2 = displayReviewText.textType;
                        if (num2 != null && num2.intValue() == 1) {
                            String str2 = displayReviewText.plainText;
                            if (str2 != null && !ujb.o.LJJJJJL(str2)) {
                                int length = spannableStringBuilder.length();
                                spannableStringBuilder.append((CharSequence) displayReviewText.plainText);
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(itemView, "itemView.context", R.attr.go)), length, spannableStringBuilder.length(), 33);
                            }
                        }
                    } else {
                        if (displayReviewText.tagKey != null) {
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) displayReviewText.tagKey);
                            spannableStringBuilder.append((CharSequence) ":");
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(itemView, "itemView.context", R.attr.gv)), length2, spannableStringBuilder.length(), 33);
                        }
                        if (displayReviewText.tagText != null) {
                            int length3 = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) displayReviewText.tagText);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(C1EU.LIZ(itemView, "itemView.context", R.attr.go)), length3, spannableStringBuilder.length(), 33);
                        }
                    }
                    i++;
                }
            }
        }
        return spannableStringBuilder;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void onBind(Object obj) {
        String str;
        List<ReviewAspectItem> list;
        ReviewAspectItem reviewAspectItem;
        ReviewAspectOption reviewAspectOption;
        List<ReviewMedia> list2;
        AbstractC70686Rog item = (AbstractC70686Rog) obj;
        o.LJIIIZ(item, "item");
        C70677RoX c70677RoX = (C70677RoX) item;
        this.LJLIL = c70677RoX;
        View view = this.itemView;
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
        c110614Vt.LIZJ = C61328O5c.LIZJ(6);
        C71313Ryn.LIZIZ(this.itemView, "itemView.context", c110614Vt, view);
        boolean z = true;
        this.itemView.setElevation(C32151Nz.LJIIZILJ(1));
        this.itemView.setTranslationZ(C32151Nz.LJIIZILJ(1));
        Integer num = c70677RoX.LJIIIZ;
        if (num != null) {
            C45804HyK.LJJLIIIJ(num.intValue(), this.itemView);
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C26508Aam.LIZ(itemView, true);
        ReviewItemStruct.MainReview mainReview = c70677RoX.LIZ.review;
        if (mainReview == null || (list2 = mainReview.media) == null || !(!list2.isEmpty())) {
            z = false;
        }
        if (z) {
            C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), _$_findCachedViewById(R.id.mf8));
            C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), _$_findCachedViewById(R.id.mf9));
        } else {
            C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), _$_findCachedViewById(R.id.mf8));
            C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)), _$_findCachedViewById(R.id.mf9));
        }
        N(c70677RoX);
        L(c70677RoX);
        ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
        ReviewItemStruct.MainReview mainReview2 = reviewItemStruct.review;
        if (mainReview2 != null && (list = mainReview2.reviewAspectItems) != null && (reviewAspectItem = (ReviewAspectItem) ORZ.LJLLLL(list)) != null && (reviewAspectOption = reviewAspectItem.answer) != null) {
            str = reviewAspectOption.optionText;
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            View tv_product_review_cell_aspect_v1 = _$_findCachedViewById(R.id.mf7);
            o.LJIIIIZZ(tv_product_review_cell_aspect_v1, "tv_product_review_cell_aspect_v1");
            tv_product_review_cell_aspect_v1.setVisibility(0);
            _$_findCachedViewById(R.id.mf7).post(new ARunnableS31S0200000_12(reviewItemStruct, this, 30));
        } else {
            View tv_product_review_cell_aspect_v12 = _$_findCachedViewById(R.id.mf7);
            o.LJIIIIZZ(tv_product_review_cell_aspect_v12, "tv_product_review_cell_aspect_v1");
            tv_product_review_cell_aspect_v12.setVisibility(8);
        }
        M(c70677RoX);
        P(c70677RoX);
    }

    public void V(Integer num, Boolean bool) {
        int i;
        int i2;
        if (o.LJ(bool, Boolean.TRUE)) {
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.mhx);
            i2 = R.attr.e2;
            tuxTextView.setTextColorRes(R.attr.e2);
            i = R.raw.icon_heart_fill;
        } else {
            ((TuxTextView) _$_findCachedViewById(R.id.mhx)).setTextColorRes(R.attr.gv);
            i = R.raw.icon_heart;
            i2 = R.attr.gx;
        }
        TuxIconView tuxIconView = (TuxIconView) _$_findCachedViewById(R.id.mhw);
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = i;
        c2068389v.LJ = Integer.valueOf(i2);
        tuxIconView.setTuxIcon(c2068389v);
        int i3 = 8;
        if (num == null || num.intValue() != 0) {
            View tv_review_cell_digg_count = _$_findCachedViewById(R.id.mhx);
            o.LJIIIIZZ(tv_review_cell_digg_count, "tv_review_cell_digg_count");
            tv_review_cell_digg_count.setVisibility(0);
            View tv_review_cell_bottom_split = _$_findCachedViewById(R.id.mhu);
            o.LJIIIIZZ(tv_review_cell_bottom_split, "tv_review_cell_bottom_split");
            View tv_review_cell_date = _$_findCachedViewById(R.id.mhv);
            o.LJIIIIZZ(tv_review_cell_date, "tv_review_cell_date");
            if (tv_review_cell_date.getVisibility() == 0) {
                i3 = 0;
            }
            tv_review_cell_bottom_split.setVisibility(i3);
        } else {
            View tv_review_cell_digg_count2 = _$_findCachedViewById(R.id.mhx);
            o.LJIIIIZZ(tv_review_cell_digg_count2, "tv_review_cell_digg_count");
            tv_review_cell_digg_count2.setVisibility(8);
            View tv_review_cell_bottom_split2 = _$_findCachedViewById(R.id.mhu);
            o.LJIIIIZZ(tv_review_cell_bottom_split2, "tv_review_cell_bottom_split");
            tv_review_cell_bottom_split2.setVisibility(8);
        }
        ((TextView) _$_findCachedViewById(R.id.mhx)).setText(String.valueOf(num));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.AbsFullSpanVH, com.ss.android.ugc.aweme.ecommercebase.view.ECJediViewHolder, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public void onBind(AbstractC70686Rog item, int i, List<Object> list) {
        o.LJIIIZ(item, "item");
        C70677RoX c70677RoX = (C70677RoX) item;
        this.LJLIL = c70677RoX;
        if (list == null || list.isEmpty()) {
            super.onBind(item, i, list);
        } else {
            ReviewItemStruct reviewItemStruct = c70677RoX.LIZ;
            V(reviewItemStruct.diggCount, reviewItemStruct.isDigged);
        }
    }
}
