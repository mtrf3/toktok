package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C113554cx;
import X.C26867AgZ;
import X.C27739Aud;
import X.C70293RiL;
import X.C70414RkI;
import X.C70437Rkf;
import X.C70438Rkg;
import X.C70666RoM;
import X.C70690Rok;
import X.C70691Rol;
import X.C71284RyK;
import X.C76800UCe;
import X.C78948Uye;
import X.C79234V7u;
import X.EnumC70719RpD;
import X.InterfaceC71003Rtn;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewState;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectOption;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class AqS12S1201000_12 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i3;
    public Object l1;
    public Object l2;
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
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS12S1201000_12 aqS12S1201000_12, Object it) {
        o.LJIIIZ(it, "it");
        C70414RkI c70414RkI = ((PdpCouponsViewHolder) aqS12S1201000_12.l1).getViewModel().LLFII;
        if (c70414RkI != null) {
            c70414RkI.LJJIIZ(aqS12S1201000_12.i3 + 1, (Voucher) aqS12S1201000_12.l2, aqS12S1201000_12.s0);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS12S1201000_12 aqS12S1201000_12, Object obj) {
        int type;
        C70691Rol c70691Rol;
        ProductReviewState it = (ProductReviewState) obj;
        o.LJIIIZ(it, "it");
        C70691Rol c70691Rol2 = ((ProductReviewViewModel) aqS12S1201000_12.l1).LJLLILLLL;
        if (c70691Rol2 != null) {
            c70691Rol2.LIZLLL = "next";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("product_review_resp_");
        LIZ.append(System.currentTimeMillis());
        String LIZIZ = X1D.LIZIZ(LIZ);
        C71284RyK.LIZIZ("product_review_gallery", LIZIZ, C27739Aud.LJI(it.getSubstate().getList()));
        if (o.LJ(C70293RiL.LIZ(), "us")) {
            type = EnumC70719RpD.US_REVIEW_GALLERY.getType();
        } else {
            type = EnumC70719RpD.OLD_REVIEW_GALLERY.getType();
        }
        Context context = ((View) aqS12S1201000_12.l2).getContext();
        o.LJIIIIZZ(context, "view.context");
        OSZ[] oszArr = new OSZ[14];
        oszArr[0] = new OSZ("product_id", it.getProductId());
        int i = 1;
        oszArr[1] = new OSZ("review_resp_key", LIZIZ);
        oszArr[2] = new OSZ("review_id", aqS12S1201000_12.s0);
        oszArr[3] = new OSZ("index", Integer.valueOf(aqS12S1201000_12.i3));
        String selectFilterId = it.getSelectFilterId();
        String str = "";
        if (selectFilterId == null) {
            selectFilterId = "";
        }
        oszArr[4] = new OSZ("filter_id", selectFilterId);
        Integer sortType = it.getSortType();
        if (sortType != null) {
            i = sortType.intValue();
        }
        oszArr[5] = new OSZ("sort_type", Integer.valueOf(i));
        oszArr[6] = new OSZ("cursor", Integer.valueOf(it.getSubstate().getPayload().LIZIZ));
        oszArr[7] = new OSZ("has_more", Boolean.valueOf(it.getSubstate().getPayload().LIZ.LIZ));
        oszArr[8] = new OSZ("review_body_content", Integer.valueOf(it.getReviewBodyContent()));
        oszArr[9] = new OSZ("seller_id", it.getSellerId());
        String kolId = it.getKolId();
        if (kolId == null) {
            kolId = "";
        }
        oszArr[10] = new OSZ("kol_id", kolId);
        ArrayList<Integer> trafficSourceList = it.getTrafficSourceList();
        if (trafficSourceList == null) {
            trafficSourceList = new ArrayList<>();
        }
        oszArr[11] = new OSZ("traffic_source_list", trafficSourceList);
        String trafficSource = it.getTrafficSource();
        if (trafficSource != null) {
            str = trafficSource;
        }
        oszArr[12] = new OSZ("traffic_source", str);
        oszArr[13] = new OSZ("review_gallery_type", Integer.valueOf(type));
        SmartRoute LIZIZ2 = C26867AgZ.LIZIZ(context, "aweme://ec/review/gallery", C113554cx.LJJJLZIJ(oszArr), false);
        InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL((View) aqS12S1201000_12.l2);
        if (LJIILIIL != null) {
            C79234V7u.LJJIJIIJIL(LIZIZ2, LJIILIIL, null);
        }
        LIZIZ2.open();
        InterfaceC71003Rtn LJIILIIL2 = C78948Uye.LJIILIIL((View) aqS12S1201000_12.l2);
        if (LJIILIIL2 != null && (c70691Rol = ((ProductReviewViewModel) aqS12S1201000_12.l1).LJLLILLLL) != null) {
            c70691Rol.LJJIJIL(LJIILIIL2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS12S1201000_12 aqS12S1201000_12, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        C70666RoM.LJ(logView, (ReviewItemStruct) aqS12S1201000_12.l1, C70691Rol.LJIJ);
        logView.put("rank", Integer.valueOf(aqS12S1201000_12.i3 + 1));
        if (C70691Rol.LJIJJLI == 2) {
            C70666RoM.LIZLLL(logView, aqS12S1201000_12.s0);
        }
        logView.put("biz_type", String.valueOf(((C70691Rol) aqS12S1201000_12.l2).LIZJ));
        logView.put("product_id", ((C70691Rol) aqS12S1201000_12.l2).LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS12S1201000_12 aqS12S1201000_12, Object obj) {
        List<ReviewAspectItem> list;
        ReviewAspectItem reviewAspectItem;
        ReviewAspectOption reviewAspectOption;
        String str;
        String str2;
        Integer num;
        LaneParams logWhenShow = (LaneParams) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("review_cnt", Integer.valueOf(C70691Rol.LJIILLIIL));
        logWhenShow.put("rank", Integer.valueOf(aqS12S1201000_12.i3));
        if (C70691Rol.LJIJJLI == 2) {
            logWhenShow.put("page_name", "shop_review");
            C70666RoM.LIZLLL(logWhenShow, aqS12S1201000_12.s0);
        } else {
            logWhenShow.put("page_name", "product_review");
        }
        logWhenShow.put("previous_page", "product_detail");
        C70666RoM.LJ(logWhenShow, (ReviewItemStruct) aqS12S1201000_12.l1, C70691Rol.LJIJ);
        C70690Rok c70690Rok = C70691Rol.LJIJ;
        if (c70690Rok != null) {
            String str3 = c70690Rok.LIZJ;
            if (str3 == null) {
                str3 = "";
            }
            logWhenShow.put("filter_id", str3);
            C70690Rok c70690Rok2 = C70691Rol.LJIJ;
            if (c70690Rok2 != null) {
                str2 = c70690Rok2.LIZIZ;
            } else {
                str2 = null;
            }
            logWhenShow.put("filter_name", String.valueOf(str2));
            C70690Rok c70690Rok3 = C70691Rol.LJIJ;
            if (c70690Rok3 != null && (num = c70690Rok3.LIZLLL) != null) {
                C70691Rol c70691Rol = (C70691Rol) aqS12S1201000_12.l2;
                int intValue = num.intValue();
                c70691Rol.getClass();
                C70691Rol.LIZ(logWhenShow, intValue);
            }
        }
        ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) aqS12S1201000_12.l1).review;
        if (mainReview != null && (list = mainReview.reviewAspectItems) != null && (reviewAspectItem = (ReviewAspectItem) ORZ.LJLLJ(list)) != null && (reviewAspectOption = reviewAspectItem.answer) != null && (str = reviewAspectOption.optionText) != null) {
            logWhenShow.put("fitness_info", str);
        }
        logWhenShow.put("biz_type", String.valueOf(((C70691Rol) aqS12S1201000_12.l2).LIZJ));
        logWhenShow.put("product_id", ((C70691Rol) aqS12S1201000_12.l2).LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS12S1201000_12 aqS12S1201000_12, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS12S1201000_12.l1).LIZIZ);
        logNode.put("coupon_zone", "discounts_module");
        C70438Rkg LIZJ = C70437Rkf.LIZJ((Voucher) aqS12S1201000_12.l2, Boolean.FALSE);
        logNode.put("coupon_id", LIZJ.LJLIL);
        logNode.put("coupon_type_id", LIZJ.LJLILLLLZI);
        logNode.put("coupon_name", LIZJ.LJLJI);
        logNode.put("coupon_type", LIZJ.LJLJJI);
        logNode.put("coupon_type_info", LIZJ.LJLJJL);
        logNode.put("coupon_cost_role", LIZJ.LJLJJLL);
        logNode.put("click_area", aqS12S1201000_12.s0);
        logNode.put("coupon_order", Integer.valueOf(aqS12S1201000_12.i3));
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS12S1201000_12(int r3, X.C70691Rol r4, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct r5, java.lang.String r6, int r7) {
        /*
            r2 = this;
            r2.$t = r7
            switch(r7) {
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i3 = r3
            r1.s0 = r6
            r1.l1 = r5
            r1.l2 = r4
            r0 = 1
        Lf:
            r1.<init>(r0)
            return
        L13:
            r1 = r2
            r1.l1 = r5
            r1.i3 = r3
            r1.s0 = r6
            r1.l2 = r4
            r0 = 1
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS12S1201000_12.<init>(int, X.Rol, com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1201000_12(C70414RkI c70414RkI, Voucher voucher, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = c70414RkI;
        this.l2 = voucher;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1201000_12(PdpCouponsViewHolder pdpCouponsViewHolder, Voucher voucher, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = pdpCouponsViewHolder;
        this.l2 = voucher;
        this.s0 = str;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS12S1201000_12(ProductReviewViewModel productReviewViewModel, View view, String str, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = productReviewViewModel;
        this.l2 = view;
        this.s0 = str;
        this.i3 = i;
    }
}
