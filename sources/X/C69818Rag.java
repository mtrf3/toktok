package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonFeedResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecommendFeedResponse;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Rag, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69818Rag {
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r1 == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            X.XKQ r0 = r3.LLLJ
            if (r0 == 0) goto L28
            boolean r1 = r0.isActive()
            r0 = 1
            if (r1 != r0) goto L28
        L10:
            r2 = 0
            if (r0 == 0) goto L1a
            X.XKQ r0 = r3.LLLJ
            if (r0 == 0) goto L1a
            r0.LIZIZ(r2)
        L1a:
            X.XIA r1 = X.C78613UtF.LIZJ
            X.2tJ r0 = new X.2tJ
            r0.<init>(r3, r2)
            X.XKQ r0 = X.C78565UsT.LJJIJ(r3, r1, r0)
            r3.LLLJ = r0
            return
        L28:
            r0 = 0
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69818Rag.LJ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel):void");
    }

    public static final SkuItem LJI(PdpViewModel pdpViewModel) {
        o.LJIIIZ(pdpViewModel, "<this>");
        SkuPanelState skuPanelState = pdpViewModel.LJLL;
        List<SkuItem> list = null;
        if (skuPanelState == null) {
            return null;
        }
        ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
        if (productPackStruct != null) {
            list = productPackStruct.skus;
        }
        return skuPanelState.getFullSkuItem(list);
    }

    public static final boolean LJIIIIZZ(PdpViewModel pdpViewModel) {
        String[] checkedSkuIds;
        SkuItem skuItem;
        Integer productQuantity;
        List<SkuItem> list;
        o.LJIIIZ(pdpViewModel, "<this>");
        SkuPanelState skuPanelState = pdpViewModel.LJLL;
        if (skuPanelState != null && (checkedSkuIds = skuPanelState.getCheckedSkuIds()) != null) {
            String LIZ = C63122Opy.LIZ(checkedSkuIds);
            ProductPackStruct productPackStruct = pdpViewModel.LJLJLLL;
            if (productPackStruct != null && (list = productPackStruct.skus) != null) {
                skuItem = RXW.LIZJ(LIZ, list);
            } else {
                skuItem = null;
            }
            int LJIIIIZZ = C70053ReT.LJIIIIZZ(pdpViewModel.LJLL, skuItem);
            if (LJIIIIZZ > 1) {
                return false;
            }
            SkuPanelState skuPanelState2 = pdpViewModel.LJLL;
            if (skuPanelState2 != null && (productQuantity = skuPanelState2.getProductQuantity()) != null && productQuantity.intValue() < LJIIIIZZ) {
                return false;
            }
        }
        return true;
    }

    public static final C27187Alj LIZJ(PdpViewModel pdpViewModel, List specifications) {
        o.LJIIIZ(pdpViewModel, "<this>");
        o.LJIIIZ(specifications, "specifications");
        return new C27187Alj(specifications);
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x00d1, code lost:
    
        if (r1 != null) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69818Rag.LIZLLL(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, boolean):void");
    }

    public static final boolean LJII(PdpViewModel pdpViewModel, ProductPackStruct productionInfoPack) {
        o.LJIIIZ(pdpViewModel, "<this>");
        o.LJIIIZ(productionInfoPack, "productionInfoPack");
        boolean z = false;
        if (productionInfoPack.staticSellingPoints != null) {
            return false;
        }
        SkuCommonConfig skuCommonConfig = productionInfoPack.skuCommonConfig;
        if (skuCommonConfig != null) {
            z = o.LJ(skuCommonConfig.isWithDefaultSku, Boolean.TRUE);
        }
        return !z;
    }

    public static final void LIZIZ(PdpViewModel pdpViewModel, List<Object> list, ShopReviewEntry shopReviewEntry) {
        Integer num;
        o.LJIIIZ(pdpViewModel, "<this>");
        if (shopReviewEntry != null && (num = shopReviewEntry.reviewCount) != null && num.intValue() > 0) {
            C26515Aat.LIZ.getClass();
            if (C26515Aat.LIZ()) {
                ((ArrayList) list).add(new C26839Ag7(shopReviewEntry.reviewCount, shopReviewEntry.reviewCountStr));
            }
        }
    }

    public static final List<Object> LJFF(PdpViewModel pdpViewModel, C26840Ag8 c26840Ag8, C69926RcQ c69926RcQ) {
        CommonFeedData commonFeedData;
        java.util.Map<String, CommonFeedResponse> map;
        CommonFeedResponse commonFeedResponse;
        ArrayList LJ = C72545SdZ.LJ(pdpViewModel, "<this>");
        String str = null;
        if (pdpViewModel.LLLILZJ) {
            RecommendFeedResponse recommendFeedResponse = pdpViewModel.LLLIL;
            if (recommendFeedResponse != null && recommendFeedResponse.LIZ()) {
                if (c26840Ag8 != null) {
                    LJ.add(c26840Ag8);
                }
                RecommendFeedResponse recommendFeedResponse2 = pdpViewModel.LLLIL;
                if (recommendFeedResponse2 != null && (map = recommendFeedResponse2.feedMap) != null && (commonFeedResponse = map.get("pdp_buy_together_recommend")) != null) {
                    commonFeedData = commonFeedResponse.data;
                    str = commonFeedResponse.daInfo;
                } else {
                    commonFeedData = null;
                }
                LJ.add(C78966Uyw.LJJJZ(commonFeedData, str, c69926RcQ));
            }
        } else {
            if (c26840Ag8 != null) {
                LJ.add(c26840Ag8);
            }
            LJ.add(C78966Uyw.LJJJZ(null, null, null));
        }
        return LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r15, java.util.List<java.lang.Object> r16, X.C26840Ag8 r17, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview r18, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry r19) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69818Rag.LIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, java.util.List, X.Ag8, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry):void");
    }
}
