package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.ReviewItemVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Padding;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewAspectPercentageCard;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewImageItem;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rah, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69819Rah {
    public static final boolean LIZIZ(PdpViewModel pdpViewModel) {
        String str;
        SkcInfo skcInfo;
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (C1XY.LJIL() && productPackStruct != null && (skcInfo = productPackStruct.skcInfo) != null) {
            str = skcInfo.miniPanelSchema;
        } else {
            str = null;
        }
        if (!C78685UuP.LJJJZ(str)) {
            return false;
        }
        C69820Rai.LIZ.getClass();
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "use_native_minipdp", true, false) == C69820Rai.LIZIZ) {
            return false;
        }
        return true;
    }

    public static final void LJFF(PdpViewModel pdpViewModel) {
        o.LJIIIZ(pdpViewModel, "<this>");
        C26059AKp.LIZ().LIZJ("ec_ttf_sku_panel_load_page_success", pdpViewModel);
        C26059AKp.LIZ().LIZJ("ec_ttf_sku_panel_close", pdpViewModel);
    }

    public static final void LJI(PdpViewModel pdpViewModel) {
        o.LJIIIZ(pdpViewModel, "<this>");
        C26059AKp.LIZ().LIZIZ("ec_ttf_sku_panel_load_page_success", pdpViewModel);
        C26059AKp.LIZ().LIZIZ("ec_ttf_sku_panel_close", pdpViewModel);
    }

    public static final void LIZLLL(long j, PdpViewModel pdpViewModel) {
        String str;
        o.LJIIIZ(pdpViewModel, "<this>");
        if (LIZIZ(pdpViewModel)) {
            C70414RkI c70414RkI = pdpViewModel.LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJLIIIJILLIZJL(SystemClock.elapsedRealtime() - j);
                return;
            }
            return;
        }
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (productPackStruct != null && productPackStruct.LIZLLL()) {
            str = "aweme://ec/sku";
        } else {
            str = null;
        }
        if (C78685UuP.LJJJZ(str)) {
            C70414RkI c70414RkI2 = pdpViewModel.LLFII;
            if (c70414RkI2 == null) {
                return;
            }
            c70414RkI2.LJJLIIIJILLIZJL(SystemClock.elapsedRealtime() - j);
            return;
        }
        C70414RkI c70414RkI3 = pdpViewModel.LLFII;
        if (c70414RkI3 == null) {
            return;
        }
        c70414RkI3.LJJLIIIJ(SystemClock.elapsedRealtime() - j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
    
        if (r19 != null) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r39, java.lang.String r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69819Rah.LIZJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ(PdpViewModel pdpViewModel, List<Object> list, C26840Ag8 gray, ProductDetailReview productDetailReview, ShopReviewEntry shopReviewEntry) {
        Integer num;
        List<ReviewFilterStruct> list2;
        String str;
        List<ReviewAspectPercentageCard> list3;
        Integer num2;
        List<ReviewImageItem> list4;
        Float f;
        Integer num3;
        String str2;
        Integer num4;
        String str3;
        String str4;
        String str5;
        Integer num5;
        boolean z;
        Integer num6;
        o.LJIIIZ(pdpViewModel, "<this>");
        o.LJIIIZ(gray, "gray");
        ArrayList arrayList = (ArrayList) list;
        arrayList.add(gray);
        Float f2 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (C70293RiL.LIZIZ) {
            C27631Ast c27631Ast = new C27631Ast(null, Integer.valueOf(R.string.f4u), 1);
            float f3 = 16;
            c27631Ast.LJLJJI = new Padding(C45804HyK.LJJ(f3), C45804HyK.LJJ(8), C45804HyK.LJJ(f3), C45804HyK.LJJ(f3));
            arrayList.add(c27631Ast);
            if (productDetailReview != null) {
                f = productDetailReview.rating;
                num3 = productDetailReview.reviewCount;
                str2 = productDetailReview.reviewCountStr;
            } else {
                f = null;
                num3 = null;
                str2 = null;
            }
            if (shopReviewEntry != null) {
                num4 = shopReviewEntry.reviewCount;
                str3 = shopReviewEntry.reviewCountStr;
                str4 = shopReviewEntry.shopSchema;
            } else {
                num4 = null;
                str3 = null;
                str4 = null;
            }
            if (productDetailReview != null) {
                str5 = productDetailReview.reviewCountStrV2;
            } else {
                str5 = null;
            }
            arrayList.add(new C27575Arz(f, num3, str2, num4, str3, str4, productDetailReview, str5, true));
            if (productDetailReview != null && (num5 = productDetailReview.reviewCount) != null && num5.intValue() > 0) {
                List<ReviewItemStruct> list5 = productDetailReview.reviewItems;
                if (list5 != null) {
                    int i = 0;
                    for (ReviewItemStruct reviewItemStruct : list5) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            ReviewItemStruct reviewItemStruct2 = reviewItemStruct;
                            if (i <= 3) {
                                if (i != C47261Igj.LJJI(productDetailReview.reviewItems) || (num6 = productDetailReview.reviewCount) == null || num6.intValue() <= 3) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                arrayList.add(new C70677RoX(reviewItemStruct2, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, z, 766));
                            }
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                Integer num7 = productDetailReview.reviewCount;
                if (num7 != null && num7.intValue() > 3) {
                    arrayList.add(new C26844AgC());
                    return;
                }
                return;
            }
            return;
        }
        C27631Ast c27631Ast2 = new C27631Ast(null, Integer.valueOf(R.string.slw), 1);
        c27631Ast2.LJLJJL = EnumC27721AuL.REVIEW.getValue();
        arrayList.add(c27631Ast2);
        if (productDetailReview != null && (num2 = productDetailReview.reviewCount) != null && num2.intValue() > 0) {
            arrayList.add(new C26870Agc(productDetailReview.rating, productDetailReview.reviewCount, productDetailReview.reviewFilters, productDetailReview.reviewCountStr, productDetailReview.reviewAspectPercentageCards, productDetailReview));
            List<ReviewItemStruct> list6 = productDetailReview.reviewItems;
            if (list6 != null) {
                int i3 = 0;
                for (ReviewItemStruct reviewItemStruct3 : list6) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        ReviewItemStruct reviewItemStruct4 = reviewItemStruct3;
                        if (i3 != C47261Igj.LJJI(productDetailReview.reviewItems)) {
                            arrayList.add(new ReviewItemVO(reviewItemStruct4, true));
                        } else {
                            arrayList.add(new ReviewItemVO(reviewItemStruct4, false));
                        }
                        i3 = i4;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            if (((Boolean) pdpViewModel.LLJILJIL.getValue()).booleanValue() && (list4 = productDetailReview.reviewImageItems) != null && !list4.isEmpty()) {
                arrayList.add(new C26845AgD(list4));
            }
            Integer num8 = productDetailReview.reviewCount;
            if (num8 != null && num8.intValue() > 2) {
                arrayList.add(new C26843AgB());
                return;
            }
            return;
        }
        if (productDetailReview != null) {
            f2 = productDetailReview.rating;
            num = productDetailReview.reviewCount;
            list2 = productDetailReview.reviewFilters;
            str = productDetailReview.reviewCountStr;
            list3 = productDetailReview.reviewAspectPercentageCards;
        } else {
            num = null;
            list2 = null;
            str = null;
            list3 = null;
        }
        arrayList.add(new C26870Agc(f2, num, list2, str, list3, productDetailReview));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r29, android.view.View r30, int r31, java.lang.String r32, java.util.HashMap<java.lang.String, java.lang.Object> r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState> r38) {
        /*
            Method dump skipped, instructions count: 561
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69819Rah.LJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, android.view.View, int, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.2kd):java.lang.Object");
    }
}
