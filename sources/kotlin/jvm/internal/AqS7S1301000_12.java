package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C70120RfY;
import X.C70691Rol;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.RYM;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.zhiliaoapp.musically.R;

/* loaded from: classes13.dex */
public class AqS7S1301000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i4;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS7S1301000_12 aqS7S1301000_12, Object obj) {
        ProductReviewState it = (ProductReviewState) obj;
        o.LJIIIZ(it, "it");
        if (it.getSelectFilterId() == null || !o.LJ(it.getSelectFilterId(), ((ReviewFilterStruct) aqS7S1301000_12.l1).filterId)) {
            if (((ReviewFragmentV1) aqS7S1301000_12.l2).Al().LJLLILLLL != null) {
                View review_filter_view_v1 = ((ReviewFragmentV1) aqS7S1301000_12.l2)._$_findCachedViewById(R.id.j0r);
                o.LJIIIIZZ(review_filter_view_v1, "review_filter_view_v1");
                C70691Rol.LJIIZILJ(review_filter_view_v1, "rate_review");
            }
            ((ReviewFragmentV1) aqS7S1301000_12.l2).Al().Tv0((View) aqS7S1301000_12.l3, aqS7S1301000_12.i4 + 1, (ReviewFilterStruct) aqS7S1301000_12.l1, aqS7S1301000_12.s0, "rate_review");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS7S1301000_12 aqS7S1301000_12, Object obj) {
        ProductReviewState it = (ProductReviewState) obj;
        o.LJIIIZ(it, "it");
        if (it.getSelectFilterId() == null || !o.LJ(it.getSelectFilterId(), ((ReviewFilterStruct) aqS7S1301000_12.l1).filterId)) {
            if (((ReviewFragment) aqS7S1301000_12.l2).xl().LJLLILLLL != null) {
                View review_filter_view = ((ReviewFragment) aqS7S1301000_12.l2)._$_findCachedViewById(R.id.j0q);
                o.LJIIIIZZ(review_filter_view, "review_filter_view");
                C70691Rol.LJIIZILJ(review_filter_view, "rate_review");
            }
            ProductReviewViewModel.Uv0(((ReviewFragment) aqS7S1301000_12.l2).xl(), (View) aqS7S1301000_12.l3, aqS7S1301000_12.i4 + 1, (ReviewFilterStruct) aqS7S1301000_12.l1, aqS7S1301000_12.s0, null, 16);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0040, code lost:
    
        if (r1 == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AqS7S1301000_12 r3, java.lang.Object r4) {
        /*
            com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams r4 = (com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams) r4
            java.lang.String r0 = "$this$logNode"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.String r1 = "cart_form"
            java.lang.String r0 = "add_to_cart"
            r4.plusAssign(r1, r0)
            java.lang.Object r2 = r3.l1
            X.RfY r2 = (X.C70120RfY) r2
            java.lang.Object r1 = r3.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r1 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r1
            int r0 = r3.i4
            r2.LIZ(r4, r1, r0)
            java.lang.String r1 = "product_id"
            java.lang.String r0 = r3.s0
            r4.plusAssign(r1, r0)
            java.lang.Object r0 = r3.l3
            X.RYM r0 = (X.RYM) r0
            java.lang.String r1 = r0.LIZLLL
            java.lang.String r0 = "sku_id"
            r4.plusAssign(r0, r1)
            java.lang.Object r0 = r3.l2
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Feed) r0
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FeedProduct r0 = r0.product
            if (r0 == 0) goto L5c
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem> r0 = r0.skus
            if (r0 == 0) goto L5c
            int r1 = r0.size()
            r0 = 1
            if (r1 != r0) goto L5c
        L42:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "is_single_sku"
            r4.plusAssign(r0, r1)
            java.lang.String r1 = "source_page_type"
            java.lang.String r0 = "buy_together"
            r4.plusAssign(r1, r0)
            java.lang.String r1 = "source_module"
            java.lang.String r0 = "rec_pdp_outer_buy_together_module"
            r4.plusAssign(r1, r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5c:
            r0 = 0
            goto L42
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS7S1301000_12.invoke$2(kotlin.jvm.internal.AqS7S1301000_12, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S1301000_12(C70120RfY c70120RfY, Feed feed, int i, String str, RYM rym, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c70120RfY;
        this.l2 = feed;
        this.i4 = i;
        this.s0 = str;
        this.l3 = rym;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S1301000_12(ReviewFilterStruct reviewFilterStruct, ReviewFragment reviewFragment, View view, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = reviewFilterStruct;
        this.l2 = reviewFragment;
        this.l3 = view;
        this.i4 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS7S1301000_12(ReviewFilterStruct reviewFilterStruct, ReviewFragmentV1 reviewFragmentV1, View view, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = reviewFilterStruct;
        this.l2 = reviewFragmentV1;
        this.l3 = view;
        this.i4 = i;
        this.s0 = str;
    }
}
