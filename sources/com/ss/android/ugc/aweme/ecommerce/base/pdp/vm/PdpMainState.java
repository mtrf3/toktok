package com.ss.android.ugc.aweme.ecommerce.base.pdp.vm;

import X.AnonymousClass391;
import X.C27766Av4;
import X.C47959Irz;
import X.C61878OQg;
import X.C69643RUx;
import X.C69684RWm;
import X.EnumC27721AuL;
import X.InterfaceC61312at;
import X.RVZ;
import X.RXA;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PdpMainState implements InterfaceC61312at {
    public final RVZ addonFloatViewViewVO;
    public final Boolean affiliatePromoteTip;
    public final BlockPageInfo blockInfo;
    public final int bodyContent;
    public final PdpBottomAreaElem bottomAreaElem;
    public final C69684RWm bottomBarVO;
    public final float bottomSheetSlideOffset;
    public final CartEntry cartEntry;
    public final RXA cartTip;
    public final List<Object> contentList;
    public final boolean dismiss;
    public final boolean firstHeaderImageReady;
    public final Long flashSaleCountDown;
    public final Integer flashSaleState;
    public final C27766Av4 focusTabAction;
    public final boolean isFullScreen;
    public final int loadingStatus;
    public final C69643RUx platformPromotion;
    public final LinkRichText protectionProgramText;
    public final RecallBox recallBox;
    public final Integer reminderButtonState;
    public final ProductDetailReview reviewInfo;
    public final int scrollOffset;
    public final ShareInfo shareInfo;
    public final int sheetState;
    public final SellerInfo shopInfo;
    public final Boolean showFavoriteGuide;
    public final Boolean showFloatShop;
    public final boolean showLoadingDialog;
    public final Image skuImageSelectState;
    public final List<String> skuSelectedIds;
    public final List<Tab> tabs;

    public PdpMainState() {
        this(false, null, null, false, 0, null, null, 0.0f, 0, null, 0, false, null, null, null, null, null, null, null, 0, null, false, null, null, null, null, null, null, null, null, null, null, -1, null);
    }

    public static /* synthetic */ PdpMainState copy$default(PdpMainState pdpMainState, boolean z, C69684RWm c69684RWm, List list, boolean z2, int i, ProductDetailReview productDetailReview, List list2, float f, int i2, C27766Av4 c27766Av4, int i3, boolean z3, Integer num, Long l, RXA rxa, CartEntry cartEntry, Integer num2, Image image, RVZ rvz, int i4, ShareInfo shareInfo, boolean z4, BlockPageInfo blockPageInfo, RecallBox recallBox, List list3, Boolean bool, Boolean bool2, Boolean bool3, C69643RUx c69643RUx, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText, int i5, Object obj) {
        Integer num3 = num;
        boolean z5 = z3;
        Long l2 = l;
        int i6 = i3;
        C27766Av4 c27766Av42 = c27766Av4;
        int i7 = i2;
        float f2 = f;
        List list4 = list2;
        C69684RWm c69684RWm2 = c69684RWm;
        boolean z6 = z;
        List list5 = list;
        boolean z7 = z2;
        int i8 = i;
        ProductDetailReview productDetailReview2 = productDetailReview;
        int i9 = i4;
        RVZ rvz2 = rvz;
        Image image2 = image;
        Integer num4 = num2;
        RXA rxa2 = rxa;
        LinkRichText linkRichText2 = linkRichText;
        CartEntry cartEntry2 = cartEntry;
        ShareInfo shareInfo2 = shareInfo;
        boolean z8 = z4;
        BlockPageInfo blockPageInfo2 = blockPageInfo;
        RecallBox recallBox2 = recallBox;
        PdpBottomAreaElem pdpBottomAreaElem2 = pdpBottomAreaElem;
        List list6 = list3;
        Boolean bool4 = bool;
        Boolean bool5 = bool2;
        Boolean bool6 = bool3;
        C69643RUx c69643RUx2 = c69643RUx;
        SellerInfo sellerInfo2 = sellerInfo;
        if ((i5 & 1) != 0) {
            z6 = pdpMainState.isFullScreen;
        }
        if ((i5 & 2) != 0) {
            c69684RWm2 = pdpMainState.bottomBarVO;
        }
        if ((i5 & 4) != 0) {
            list5 = pdpMainState.tabs;
        }
        if ((i5 & 8) != 0) {
            z7 = pdpMainState.dismiss;
        }
        if ((i5 & 16) != 0) {
            i8 = pdpMainState.sheetState;
        }
        if ((i5 & 32) != 0) {
            productDetailReview2 = pdpMainState.reviewInfo;
        }
        if ((i5 & 64) != 0) {
            list4 = pdpMainState.contentList;
        }
        if ((i5 & 128) != 0) {
            f2 = pdpMainState.bottomSheetSlideOffset;
        }
        if ((i5 & 256) != 0) {
            i7 = pdpMainState.scrollOffset;
        }
        if ((i5 & 512) != 0) {
            c27766Av42 = pdpMainState.focusTabAction;
        }
        if ((i5 & 1024) != 0) {
            i6 = pdpMainState.loadingStatus;
        }
        if ((i5 & 2048) != 0) {
            z5 = pdpMainState.firstHeaderImageReady;
        }
        if ((i5 & 4096) != 0) {
            num3 = pdpMainState.flashSaleState;
        }
        if ((i5 & FileUtils.BUFFER_SIZE) != 0) {
            l2 = pdpMainState.flashSaleCountDown;
        }
        if ((i5 & 16384) != 0) {
            rxa2 = pdpMainState.cartTip;
        }
        if ((32768 & i5) != 0) {
            cartEntry2 = pdpMainState.cartEntry;
        }
        if ((65536 & i5) != 0) {
            num4 = pdpMainState.reminderButtonState;
        }
        if ((131072 & i5) != 0) {
            image2 = pdpMainState.skuImageSelectState;
        }
        if ((262144 & i5) != 0) {
            rvz2 = pdpMainState.addonFloatViewViewVO;
        }
        if ((524288 & i5) != 0) {
            i9 = pdpMainState.bodyContent;
        }
        if ((1048576 & i5) != 0) {
            shareInfo2 = pdpMainState.shareInfo;
        }
        if ((2097152 & i5) != 0) {
            z8 = pdpMainState.showLoadingDialog;
        }
        if ((4194304 & i5) != 0) {
            blockPageInfo2 = pdpMainState.blockInfo;
        }
        if ((8388608 & i5) != 0) {
            recallBox2 = pdpMainState.recallBox;
        }
        if ((16777216 & i5) != 0) {
            list6 = pdpMainState.skuSelectedIds;
        }
        if ((33554432 & i5) != 0) {
            bool4 = pdpMainState.affiliatePromoteTip;
        }
        if ((67108864 & i5) != 0) {
            bool5 = pdpMainState.showFloatShop;
        }
        if ((134217728 & i5) != 0) {
            bool6 = pdpMainState.showFavoriteGuide;
        }
        if ((268435456 & i5) != 0) {
            c69643RUx2 = pdpMainState.platformPromotion;
        }
        if ((536870912 & i5) != 0) {
            sellerInfo2 = pdpMainState.shopInfo;
        }
        if ((1073741824 & i5) != 0) {
            pdpBottomAreaElem2 = pdpMainState.bottomAreaElem;
        }
        if ((i5 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0) {
            linkRichText2 = pdpMainState.protectionProgramText;
        }
        return pdpMainState.copy(z6, c69684RWm2, list5, z7, i8, productDetailReview2, list4, f2, i7, c27766Av42, i6, z5, num3, l2, rxa2, cartEntry2, num4, image2, rvz2, i9, shareInfo2, z8, blockPageInfo2, recallBox2, list6, bool4, bool5, bool6, c69643RUx2, sellerInfo2, pdpBottomAreaElem2, linkRichText2);
    }

    public final PdpMainState copy(boolean z, C69684RWm c69684RWm, List<Tab> list, boolean z2, int i, ProductDetailReview productDetailReview, List<? extends Object> contentList, float f, int i2, C27766Av4 focusTabAction, int i3, boolean z3, Integer num, Long l, RXA rxa, CartEntry cartEntry, Integer num2, Image image, RVZ rvz, int i4, ShareInfo shareInfo, boolean z4, BlockPageInfo blockPageInfo, RecallBox recallBox, List<String> list2, Boolean bool, Boolean bool2, Boolean bool3, C69643RUx c69643RUx, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText) {
        o.LJIIIZ(contentList, "contentList");
        o.LJIIIZ(focusTabAction, "focusTabAction");
        return new PdpMainState(z, c69684RWm, list, z2, i, productDetailReview, contentList, f, i2, focusTabAction, i3, z3, num, l, rxa, cartEntry, num2, image, rvz, i4, shareInfo, z4, blockPageInfo, recallBox, list2, bool, bool2, bool3, c69643RUx, sellerInfo, pdpBottomAreaElem, linkRichText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PdpMainState)) {
            return false;
        }
        PdpMainState pdpMainState = (PdpMainState) obj;
        return this.isFullScreen == pdpMainState.isFullScreen && o.LJ(this.bottomBarVO, pdpMainState.bottomBarVO) && o.LJ(this.tabs, pdpMainState.tabs) && this.dismiss == pdpMainState.dismiss && this.sheetState == pdpMainState.sheetState && o.LJ(this.reviewInfo, pdpMainState.reviewInfo) && o.LJ(this.contentList, pdpMainState.contentList) && Float.compare(this.bottomSheetSlideOffset, pdpMainState.bottomSheetSlideOffset) == 0 && this.scrollOffset == pdpMainState.scrollOffset && o.LJ(this.focusTabAction, pdpMainState.focusTabAction) && this.loadingStatus == pdpMainState.loadingStatus && this.firstHeaderImageReady == pdpMainState.firstHeaderImageReady && o.LJ(this.flashSaleState, pdpMainState.flashSaleState) && o.LJ(this.flashSaleCountDown, pdpMainState.flashSaleCountDown) && o.LJ(this.cartTip, pdpMainState.cartTip) && o.LJ(this.cartEntry, pdpMainState.cartEntry) && o.LJ(this.reminderButtonState, pdpMainState.reminderButtonState) && o.LJ(this.skuImageSelectState, pdpMainState.skuImageSelectState) && o.LJ(this.addonFloatViewViewVO, pdpMainState.addonFloatViewViewVO) && this.bodyContent == pdpMainState.bodyContent && o.LJ(this.shareInfo, pdpMainState.shareInfo) && this.showLoadingDialog == pdpMainState.showLoadingDialog && o.LJ(this.blockInfo, pdpMainState.blockInfo) && o.LJ(this.recallBox, pdpMainState.recallBox) && o.LJ(this.skuSelectedIds, pdpMainState.skuSelectedIds) && o.LJ(this.affiliatePromoteTip, pdpMainState.affiliatePromoteTip) && o.LJ(this.showFloatShop, pdpMainState.showFloatShop) && o.LJ(this.showFavoriteGuide, pdpMainState.showFavoriteGuide) && o.LJ(this.platformPromotion, pdpMainState.platformPromotion) && o.LJ(this.shopInfo, pdpMainState.shopInfo) && o.LJ(this.bottomAreaElem, pdpMainState.bottomAreaElem) && o.LJ(this.protectionProgramText, pdpMainState.protectionProgramText);
    }

    public String toString() {
        return "PdpMainState(isFullScreen=" + this.isFullScreen + ", bottomBarVO=" + this.bottomBarVO + ", tabs=" + this.tabs + ", dismiss=" + this.dismiss + ", sheetState=" + this.sheetState + ", reviewInfo=" + this.reviewInfo + ", contentList=" + this.contentList + ", bottomSheetSlideOffset=" + this.bottomSheetSlideOffset + ", scrollOffset=" + this.scrollOffset + ", focusTabAction=" + this.focusTabAction + ", loadingStatus=" + this.loadingStatus + ", firstHeaderImageReady=" + this.firstHeaderImageReady + ", flashSaleState=" + this.flashSaleState + ", flashSaleCountDown=" + this.flashSaleCountDown + ", cartTip=" + this.cartTip + ", cartEntry=" + this.cartEntry + ", reminderButtonState=" + this.reminderButtonState + ", skuImageSelectState=" + this.skuImageSelectState + ", addonFloatViewViewVO=" + this.addonFloatViewViewVO + ", bodyContent=" + this.bodyContent + ", shareInfo=" + this.shareInfo + ", showLoadingDialog=" + this.showLoadingDialog + ", blockInfo=" + this.blockInfo + ", recallBox=" + this.recallBox + ", skuSelectedIds=" + this.skuSelectedIds + ", affiliatePromoteTip=" + this.affiliatePromoteTip + ", showFloatShop=" + this.showFloatShop + ", showFavoriteGuide=" + this.showFavoriteGuide + ", platformPromotion=" + this.platformPromotion + ", shopInfo=" + this.shopInfo + ", bottomAreaElem=" + this.bottomAreaElem + ", protectionProgramText=" + this.protectionProgramText + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v99 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int hashCode12;
        int hashCode13;
        int hashCode14;
        int hashCode15;
        int hashCode16;
        int hashCode17;
        int hashCode18;
        int hashCode19;
        int hashCode20;
        boolean z = this.isFullScreen;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        C69684RWm c69684RWm = this.bottomBarVO;
        int i3 = 0;
        if (c69684RWm == null) {
            hashCode = 0;
        } else {
            hashCode = c69684RWm.hashCode();
        }
        int i4 = (i2 + hashCode) * 31;
        List<Tab> list = this.tabs;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i5 = (i4 + hashCode2) * 31;
        ?? r02 = this.dismiss;
        int i6 = r02;
        if (r02 != 0) {
            i6 = 1;
        }
        int i7 = (((i5 + i6) * 31) + this.sheetState) * 31;
        ProductDetailReview productDetailReview = this.reviewInfo;
        if (productDetailReview == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = productDetailReview.hashCode();
        }
        int hashCode21 = (((this.focusTabAction.hashCode() + ((C47959Irz.LIZIZ(this.bottomSheetSlideOffset, AnonymousClass391.LIZIZ(this.contentList, (i7 + hashCode3) * 31, 31), 31) + this.scrollOffset) * 31)) * 31) + this.loadingStatus) * 31;
        ?? r03 = this.firstHeaderImageReady;
        int i8 = r03;
        if (r03 != 0) {
            i8 = 1;
        }
        int i9 = (hashCode21 + i8) * 31;
        Integer num = this.flashSaleState;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i10 = (i9 + hashCode4) * 31;
        Long l = this.flashSaleCountDown;
        if (l == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = l.hashCode();
        }
        int i11 = (i10 + hashCode5) * 31;
        RXA rxa = this.cartTip;
        if (rxa == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = rxa.hashCode();
        }
        int i12 = (i11 + hashCode6) * 31;
        CartEntry cartEntry = this.cartEntry;
        if (cartEntry == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = cartEntry.hashCode();
        }
        int i13 = (i12 + hashCode7) * 31;
        Integer num2 = this.reminderButtonState;
        if (num2 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num2.hashCode();
        }
        int i14 = (i13 + hashCode8) * 31;
        Image image = this.skuImageSelectState;
        if (image == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = image.hashCode();
        }
        int i15 = (i14 + hashCode9) * 31;
        RVZ rvz = this.addonFloatViewViewVO;
        if (rvz == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = rvz.hashCode();
        }
        int i16 = (((i15 + hashCode10) * 31) + this.bodyContent) * 31;
        ShareInfo shareInfo = this.shareInfo;
        if (shareInfo == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = shareInfo.hashCode();
        }
        int i17 = (i16 + hashCode11) * 31;
        if (!this.showLoadingDialog) {
            i = 0;
        }
        int i18 = (i17 + i) * 31;
        BlockPageInfo blockPageInfo = this.blockInfo;
        if (blockPageInfo == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = blockPageInfo.hashCode();
        }
        int i19 = (i18 + hashCode12) * 31;
        RecallBox recallBox = this.recallBox;
        if (recallBox == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = recallBox.hashCode();
        }
        int i20 = (i19 + hashCode13) * 31;
        List<String> list2 = this.skuSelectedIds;
        if (list2 == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = list2.hashCode();
        }
        int i21 = (i20 + hashCode14) * 31;
        Boolean bool = this.affiliatePromoteTip;
        if (bool == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = bool.hashCode();
        }
        int i22 = (i21 + hashCode15) * 31;
        Boolean bool2 = this.showFloatShop;
        if (bool2 == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = bool2.hashCode();
        }
        int i23 = (i22 + hashCode16) * 31;
        Boolean bool3 = this.showFavoriteGuide;
        if (bool3 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = bool3.hashCode();
        }
        int i24 = (i23 + hashCode17) * 31;
        C69643RUx c69643RUx = this.platformPromotion;
        if (c69643RUx == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = c69643RUx.hashCode();
        }
        int i25 = (i24 + hashCode18) * 31;
        SellerInfo sellerInfo = this.shopInfo;
        if (sellerInfo == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = sellerInfo.hashCode();
        }
        int i26 = (i25 + hashCode19) * 31;
        PdpBottomAreaElem pdpBottomAreaElem = this.bottomAreaElem;
        if (pdpBottomAreaElem == null) {
            hashCode20 = 0;
        } else {
            hashCode20 = pdpBottomAreaElem.hashCode();
        }
        int i27 = (i26 + hashCode20) * 31;
        LinkRichText linkRichText = this.protectionProgramText;
        if (linkRichText != null) {
            i3 = linkRichText.hashCode();
        }
        return i27 + i3;
    }

    public final RVZ getAddonFloatViewViewVO() {
        return this.addonFloatViewViewVO;
    }

    public final Boolean getAffiliatePromoteTip() {
        return this.affiliatePromoteTip;
    }

    public final BlockPageInfo getBlockInfo() {
        return this.blockInfo;
    }

    public final int getBodyContent() {
        return this.bodyContent;
    }

    public final PdpBottomAreaElem getBottomAreaElem() {
        return this.bottomAreaElem;
    }

    public final C69684RWm getBottomBarVO() {
        return this.bottomBarVO;
    }

    public final float getBottomSheetSlideOffset() {
        return this.bottomSheetSlideOffset;
    }

    public final CartEntry getCartEntry() {
        return this.cartEntry;
    }

    public final RXA getCartTip() {
        return this.cartTip;
    }

    public final List<Object> getContentList() {
        return this.contentList;
    }

    public final boolean getDismiss() {
        return this.dismiss;
    }

    public final boolean getFirstHeaderImageReady() {
        return this.firstHeaderImageReady;
    }

    public final Long getFlashSaleCountDown() {
        return this.flashSaleCountDown;
    }

    public final Integer getFlashSaleState() {
        return this.flashSaleState;
    }

    public final C27766Av4 getFocusTabAction() {
        return this.focusTabAction;
    }

    public final int getLoadingStatus() {
        return this.loadingStatus;
    }

    public final C69643RUx getPlatformPromotion() {
        return this.platformPromotion;
    }

    public final LinkRichText getProtectionProgramText() {
        return this.protectionProgramText;
    }

    public final RecallBox getRecallBox() {
        return this.recallBox;
    }

    public final Integer getReminderButtonState() {
        return this.reminderButtonState;
    }

    public final ProductDetailReview getReviewInfo() {
        return this.reviewInfo;
    }

    public final int getScrollOffset() {
        return this.scrollOffset;
    }

    public final ShareInfo getShareInfo() {
        return this.shareInfo;
    }

    public final int getSheetState() {
        return this.sheetState;
    }

    public final SellerInfo getShopInfo() {
        return this.shopInfo;
    }

    public final Boolean getShowFavoriteGuide() {
        return this.showFavoriteGuide;
    }

    public final Boolean getShowFloatShop() {
        return this.showFloatShop;
    }

    public final boolean getShowLoadingDialog() {
        return this.showLoadingDialog;
    }

    public final Image getSkuImageSelectState() {
        return this.skuImageSelectState;
    }

    public final List<String> getSkuSelectedIds() {
        return this.skuSelectedIds;
    }

    public final List<Tab> getTabs() {
        return this.tabs;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public PdpMainState(boolean z, C69684RWm c69684RWm, List<Tab> list, boolean z2, int i, ProductDetailReview productDetailReview, List<? extends Object> contentList, float f, int i2, C27766Av4 focusTabAction, int i3, boolean z3, Integer num, Long l, RXA rxa, CartEntry cartEntry, Integer num2, Image image, RVZ rvz, int i4, ShareInfo shareInfo, boolean z4, BlockPageInfo blockPageInfo, RecallBox recallBox, List<String> list2, Boolean bool, Boolean bool2, Boolean bool3, C69643RUx c69643RUx, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText) {
        o.LJIIIZ(contentList, "contentList");
        o.LJIIIZ(focusTabAction, "focusTabAction");
        this.isFullScreen = z;
        this.bottomBarVO = c69684RWm;
        this.tabs = list;
        this.dismiss = z2;
        this.sheetState = i;
        this.reviewInfo = productDetailReview;
        this.contentList = contentList;
        this.bottomSheetSlideOffset = f;
        this.scrollOffset = i2;
        this.focusTabAction = focusTabAction;
        this.loadingStatus = i3;
        this.firstHeaderImageReady = z3;
        this.flashSaleState = num;
        this.flashSaleCountDown = l;
        this.cartTip = rxa;
        this.cartEntry = cartEntry;
        this.reminderButtonState = num2;
        this.skuImageSelectState = image;
        this.addonFloatViewViewVO = rvz;
        this.bodyContent = i4;
        this.shareInfo = shareInfo;
        this.showLoadingDialog = z4;
        this.blockInfo = blockPageInfo;
        this.recallBox = recallBox;
        this.skuSelectedIds = list2;
        this.affiliatePromoteTip = bool;
        this.showFloatShop = bool2;
        this.showFavoriteGuide = bool3;
        this.platformPromotion = c69643RUx;
        this.shopInfo = sellerInfo;
        this.bottomAreaElem = pdpBottomAreaElem;
        this.protectionProgramText = linkRichText;
    }

    public PdpMainState(boolean z, C69684RWm c69684RWm, List list, boolean z2, int i, ProductDetailReview productDetailReview, List list2, float f, int i2, C27766Av4 c27766Av4, int i3, boolean z3, Integer num, Long l, RXA rxa, CartEntry cartEntry, Integer num2, Image image, RVZ rvz, int i4, ShareInfo shareInfo, boolean z4, BlockPageInfo blockPageInfo, RecallBox recallBox, List list3, Boolean bool, Boolean bool2, Boolean bool3, C69643RUx c69643RUx, SellerInfo sellerInfo, PdpBottomAreaElem pdpBottomAreaElem, LinkRichText linkRichText, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? false : z, (i5 & 2) != 0 ? null : c69684RWm, (i5 & 4) != 0 ? null : list, (i5 & 8) != 0 ? false : z2, (i5 & 16) != 0 ? 4 : i, (i5 & 32) != 0 ? null : productDetailReview, (i5 & 64) != 0 ? C61878OQg.INSTANCE : list2, (i5 & 128) != 0 ? 0.0f : f, (i5 & 256) != 0 ? 0 : i2, (i5 & 512) != 0 ? new C27766Av4(EnumC27721AuL.HEADER.getValue(), false) : c27766Av4, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? false : z3, (i5 & 4096) != 0 ? null : num, (i5 & FileUtils.BUFFER_SIZE) != 0 ? null : l, (i5 & 16384) != 0 ? null : rxa, (32768 & i5) != 0 ? null : cartEntry, (65536 & i5) != 0 ? null : num2, (131072 & i5) != 0 ? null : image, (262144 & i5) != 0 ? null : rvz, (524288 & i5) != 0 ? -1 : i4, (1048576 & i5) != 0 ? null : shareInfo, (2097152 & i5) != 0 ? false : z4, (4194304 & i5) != 0 ? null : blockPageInfo, (8388608 & i5) != 0 ? null : recallBox, (16777216 & i5) != 0 ? null : list3, (33554432 & i5) != 0 ? null : bool, (67108864 & i5) != 0 ? null : bool2, (134217728 & i5) != 0 ? null : bool3, (268435456 & i5) != 0 ? null : c69643RUx, (536870912 & i5) != 0 ? null : sellerInfo, (1073741824 & i5) != 0 ? null : pdpBottomAreaElem, (i5 & LiveLayoutPreloadThreadPriority.DEFAULT) != 0 ? null : linkRichText);
    }
}
