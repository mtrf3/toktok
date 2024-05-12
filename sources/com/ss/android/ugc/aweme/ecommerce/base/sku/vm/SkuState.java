package com.ss.android.ugc.aweme.ecommerce.base.sku.vm;

import X.C70042ReI;
import X.C70046ReM;
import X.C70109RfN;
import X.C70404Rk8;
import X.C79062V1e;
import X.EnumC70239RhT;
import X.InterfaceC61312at;
import X.OSZ;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuState implements InterfaceC61312at {
    public AddToCartButton addToCartButton;
    public final PdpBottomAreaElem bottomAreaElem;
    public final BuyButton buyButton;
    public final List<String> checkedSkuArray;
    public final Image currentImage;
    public final int currentImagePosition;
    public final InstallmentPlan currentInstallmentPlan;
    public final String currentPrice;
    public final OSZ<Integer, C70404Rk8> currentQuantity;
    public final C70109RfN currentQuantityLimit;
    public final String discountText;
    public final Object forceRefresh;
    public final boolean isFavorite;
    public final Boolean keyBoardVisibility;
    public final List<SaleProp> localSizeSalePropList;
    public final Boolean needIcon;
    public final String originalPrice;
    public final ProductPackStruct originalProductPackStruct;
    public final PdpPaymentModule paymentModule;
    public final PreOrderInfo preOrderInfo;
    public final String productTitle;
    public final PromotionView promotionView;
    public final LinkRichText protectionProgramText;
    public final String purchaseNotice;
    public boolean showLoadingView;
    public final C70042ReI showToast;
    public final EnumC70239RhT skuDataState;
    public final boolean skuFragmentClosed;
    public final SkuInfo skuInfo;
    public final C70046ReM skuStockInfo;
    public final String specifications;

    public SkuState() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, false, null, null, null, false, null, null, null, false, null, null, null, null, Integer.MAX_VALUE, null);
    }

    public static /* synthetic */ SkuState copy$default(SkuState skuState, SkuInfo skuInfo, List list, C70042ReI c70042ReI, Image image, Boolean bool, BuyButton buyButton, PreOrderInfo preOrderInfo, String str, String str2, PromotionView promotionView, String str3, String str4, String str5, C70109RfN c70109RfN, OSZ osz, int i, InstallmentPlan installmentPlan, Boolean bool2, boolean z, EnumC70239RhT enumC70239RhT, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, boolean z2, C70046ReM c70046ReM, Object obj, ProductPackStruct productPackStruct, boolean z3, List list2, LinkRichText linkRichText, String str6, PdpBottomAreaElem pdpBottomAreaElem, int i2, Object obj2) {
        String str7 = str5;
        String str8 = str4;
        String str9 = str3;
        C70109RfN c70109RfN2 = c70109RfN;
        PromotionView promotionView2 = promotionView;
        String str10 = str2;
        String str11 = str;
        PreOrderInfo preOrderInfo2 = preOrderInfo;
        List list3 = list;
        SkuInfo skuInfo2 = skuInfo;
        C70042ReI c70042ReI2 = c70042ReI;
        Image image2 = image;
        Boolean bool3 = bool;
        BuyButton buyButton2 = buyButton;
        EnumC70239RhT enumC70239RhT2 = enumC70239RhT;
        boolean z4 = z;
        Boolean bool4 = bool2;
        InstallmentPlan installmentPlan2 = installmentPlan;
        OSZ osz2 = osz;
        PdpBottomAreaElem pdpBottomAreaElem2 = pdpBottomAreaElem;
        int i3 = i;
        AddToCartButton addToCartButton2 = addToCartButton;
        PdpPaymentModule pdpPaymentModule2 = pdpPaymentModule;
        boolean z5 = z2;
        C70046ReM c70046ReM2 = c70046ReM;
        String str12 = str6;
        Object obj3 = obj;
        ProductPackStruct productPackStruct2 = productPackStruct;
        boolean z6 = z3;
        List list4 = list2;
        LinkRichText linkRichText2 = linkRichText;
        if ((i2 & 1) != 0) {
            skuInfo2 = skuState.skuInfo;
        }
        if ((i2 & 2) != 0) {
            list3 = skuState.checkedSkuArray;
        }
        if ((i2 & 4) != 0) {
            c70042ReI2 = skuState.showToast;
        }
        if ((i2 & 8) != 0) {
            image2 = skuState.currentImage;
        }
        if ((i2 & 16) != 0) {
            bool3 = skuState.needIcon;
        }
        if ((i2 & 32) != 0) {
            buyButton2 = skuState.buyButton;
        }
        if ((i2 & 64) != 0) {
            preOrderInfo2 = skuState.preOrderInfo;
        }
        if ((i2 & 128) != 0) {
            str11 = skuState.currentPrice;
        }
        if ((i2 & 256) != 0) {
            str10 = skuState.purchaseNotice;
        }
        if ((i2 & 512) != 0) {
            promotionView2 = skuState.promotionView;
        }
        if ((i2 & 1024) != 0) {
            str9 = skuState.originalPrice;
        }
        if ((i2 & 2048) != 0) {
            str8 = skuState.discountText;
        }
        if ((i2 & 4096) != 0) {
            str7 = skuState.specifications;
        }
        if ((i2 & FileUtils.BUFFER_SIZE) != 0) {
            c70109RfN2 = skuState.currentQuantityLimit;
        }
        if ((i2 & 16384) != 0) {
            osz2 = skuState.currentQuantity;
        }
        if ((32768 & i2) != 0) {
            i3 = skuState.currentImagePosition;
        }
        if ((65536 & i2) != 0) {
            installmentPlan2 = skuState.currentInstallmentPlan;
        }
        if ((131072 & i2) != 0) {
            bool4 = skuState.keyBoardVisibility;
        }
        if ((262144 & i2) != 0) {
            z4 = skuState.skuFragmentClosed;
        }
        if ((524288 & i2) != 0) {
            enumC70239RhT2 = skuState.skuDataState;
        }
        if ((1048576 & i2) != 0) {
            addToCartButton2 = skuState.addToCartButton;
        }
        if ((2097152 & i2) != 0) {
            pdpPaymentModule2 = skuState.paymentModule;
        }
        if ((4194304 & i2) != 0) {
            z5 = skuState.showLoadingView;
        }
        if ((8388608 & i2) != 0) {
            c70046ReM2 = skuState.skuStockInfo;
        }
        if ((16777216 & i2) != 0) {
            obj3 = skuState.forceRefresh;
        }
        if ((33554432 & i2) != 0) {
            productPackStruct2 = skuState.originalProductPackStruct;
        }
        if ((67108864 & i2) != 0) {
            z6 = skuState.isFavorite;
        }
        if ((134217728 & i2) != 0) {
            list4 = skuState.localSizeSalePropList;
        }
        if ((268435456 & i2) != 0) {
            linkRichText2 = skuState.protectionProgramText;
        }
        if ((536870912 & i2) != 0) {
            str12 = skuState.productTitle;
        }
        if ((i2 & 1073741824) != 0) {
            pdpBottomAreaElem2 = skuState.bottomAreaElem;
        }
        return skuState.copy(skuInfo2, list3, c70042ReI2, image2, bool3, buyButton2, preOrderInfo2, str11, str10, promotionView2, str9, str8, str7, c70109RfN2, osz2, i3, installmentPlan2, bool4, z4, enumC70239RhT2, addToCartButton2, pdpPaymentModule2, z5, c70046ReM2, obj3, productPackStruct2, z6, list4, linkRichText2, str12, pdpBottomAreaElem2);
    }

    public final SkuState copy(SkuInfo skuInfo, List<String> list, C70042ReI c70042ReI, Image image, Boolean bool, BuyButton buyButton, PreOrderInfo preOrderInfo, String currentPrice, String str, PromotionView promotionView, String str2, String str3, String specifications, C70109RfN currentQuantityLimit, OSZ<Integer, C70404Rk8> currentQuantity, int i, InstallmentPlan installmentPlan, Boolean bool2, boolean z, EnumC70239RhT skuDataState, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, boolean z2, C70046ReM skuStockInfo, Object forceRefresh, ProductPackStruct productPackStruct, boolean z3, List<SaleProp> list2, LinkRichText linkRichText, String str4, PdpBottomAreaElem pdpBottomAreaElem) {
        o.LJIIIZ(currentPrice, "currentPrice");
        o.LJIIIZ(specifications, "specifications");
        o.LJIIIZ(currentQuantityLimit, "currentQuantityLimit");
        o.LJIIIZ(currentQuantity, "currentQuantity");
        o.LJIIIZ(skuDataState, "skuDataState");
        o.LJIIIZ(skuStockInfo, "skuStockInfo");
        o.LJIIIZ(forceRefresh, "forceRefresh");
        return new SkuState(skuInfo, list, c70042ReI, image, bool, buyButton, preOrderInfo, currentPrice, str, promotionView, str2, str3, specifications, currentQuantityLimit, currentQuantity, i, installmentPlan, bool2, z, skuDataState, addToCartButton, pdpPaymentModule, z2, skuStockInfo, forceRefresh, productPackStruct, z3, list2, linkRichText, str4, pdpBottomAreaElem);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuState)) {
            return false;
        }
        SkuState skuState = (SkuState) obj;
        return o.LJ(this.skuInfo, skuState.skuInfo) && o.LJ(this.checkedSkuArray, skuState.checkedSkuArray) && o.LJ(this.showToast, skuState.showToast) && o.LJ(this.currentImage, skuState.currentImage) && o.LJ(this.needIcon, skuState.needIcon) && o.LJ(this.buyButton, skuState.buyButton) && o.LJ(this.preOrderInfo, skuState.preOrderInfo) && o.LJ(this.currentPrice, skuState.currentPrice) && o.LJ(this.purchaseNotice, skuState.purchaseNotice) && o.LJ(this.promotionView, skuState.promotionView) && o.LJ(this.originalPrice, skuState.originalPrice) && o.LJ(this.discountText, skuState.discountText) && o.LJ(this.specifications, skuState.specifications) && o.LJ(this.currentQuantityLimit, skuState.currentQuantityLimit) && o.LJ(this.currentQuantity, skuState.currentQuantity) && this.currentImagePosition == skuState.currentImagePosition && o.LJ(this.currentInstallmentPlan, skuState.currentInstallmentPlan) && o.LJ(this.keyBoardVisibility, skuState.keyBoardVisibility) && this.skuFragmentClosed == skuState.skuFragmentClosed && this.skuDataState == skuState.skuDataState && o.LJ(this.addToCartButton, skuState.addToCartButton) && o.LJ(this.paymentModule, skuState.paymentModule) && this.showLoadingView == skuState.showLoadingView && o.LJ(this.skuStockInfo, skuState.skuStockInfo) && o.LJ(this.forceRefresh, skuState.forceRefresh) && o.LJ(this.originalProductPackStruct, skuState.originalProductPackStruct) && this.isFavorite == skuState.isFavorite && o.LJ(this.localSizeSalePropList, skuState.localSizeSalePropList) && o.LJ(this.protectionProgramText, skuState.protectionProgramText) && o.LJ(this.productTitle, skuState.productTitle) && o.LJ(this.bottomAreaElem, skuState.bottomAreaElem);
    }

    public String toString() {
        return "SkuState(skuInfo=" + this.skuInfo + ", checkedSkuArray=" + this.checkedSkuArray + ", showToast=" + this.showToast + ", currentImage=" + this.currentImage + ", needIcon=" + this.needIcon + ", buyButton=" + this.buyButton + ", preOrderInfo=" + this.preOrderInfo + ", currentPrice=" + this.currentPrice + ", purchaseNotice=" + this.purchaseNotice + ", promotionView=" + this.promotionView + ", originalPrice=" + this.originalPrice + ", discountText=" + this.discountText + ", specifications=" + this.specifications + ", currentQuantityLimit=" + this.currentQuantityLimit + ", currentQuantity=" + this.currentQuantity + ", currentImagePosition=" + this.currentImagePosition + ", currentInstallmentPlan=" + this.currentInstallmentPlan + ", keyBoardVisibility=" + this.keyBoardVisibility + ", skuFragmentClosed=" + this.skuFragmentClosed + ", skuDataState=" + this.skuDataState + ", addToCartButton=" + this.addToCartButton + ", paymentModule=" + this.paymentModule + ", showLoadingView=" + this.showLoadingView + ", skuStockInfo=" + this.skuStockInfo + ", forceRefresh=" + this.forceRefresh + ", originalProductPackStruct=" + this.originalProductPackStruct + ", isFavorite=" + this.isFavorite + ", localSizeSalePropList=" + this.localSizeSalePropList + ", protectionProgramText=" + this.protectionProgramText + ", productTitle=" + this.productTitle + ", bottomAreaElem=" + this.bottomAreaElem + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        SkuInfo skuInfo = this.skuInfo;
        int i = 0;
        if (skuInfo == null) {
            hashCode = 0;
        } else {
            hashCode = skuInfo.hashCode();
        }
        int i2 = hashCode * 31;
        List<String> list = this.checkedSkuArray;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        C70042ReI c70042ReI = this.showToast;
        if (c70042ReI == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = c70042ReI.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Image image = this.currentImage;
        if (image == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = image.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Boolean bool = this.needIcon;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        BuyButton buyButton = this.buyButton;
        if (buyButton == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = buyButton.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        PreOrderInfo preOrderInfo = this.preOrderInfo;
        if (preOrderInfo == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = preOrderInfo.hashCode();
        }
        int LJ = C79062V1e.LJ(this.currentPrice, (i7 + hashCode7) * 31, 31);
        String str = this.purchaseNotice;
        if (str == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str.hashCode();
        }
        int i8 = (LJ + hashCode8) * 31;
        PromotionView promotionView = this.promotionView;
        if (promotionView == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = promotionView.hashCode();
        }
        int i9 = (i8 + hashCode9) * 31;
        String str2 = this.originalPrice;
        if (str2 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str2.hashCode();
        }
        int i10 = (i9 + hashCode10) * 31;
        String str3 = this.discountText;
        if (str3 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str3.hashCode();
        }
        int hashCode20 = (((this.currentQuantity.hashCode() + ((this.currentQuantityLimit.hashCode() + C79062V1e.LJ(this.specifications, (i10 + hashCode11) * 31, 31)) * 31)) * 31) + this.currentImagePosition) * 31;
        InstallmentPlan installmentPlan = this.currentInstallmentPlan;
        if (installmentPlan == null) {
            hashCode12 = 0;
        } else {
            hashCode12 = installmentPlan.hashCode();
        }
        int i11 = (hashCode20 + hashCode12) * 31;
        Boolean bool2 = this.keyBoardVisibility;
        if (bool2 == null) {
            hashCode13 = 0;
        } else {
            hashCode13 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode13) * 31;
        boolean z = this.skuFragmentClosed;
        int i13 = 1;
        int i14 = z;
        if (z != 0) {
            i14 = 1;
        }
        int hashCode21 = (this.skuDataState.hashCode() + ((i12 + i14) * 31)) * 31;
        AddToCartButton addToCartButton = this.addToCartButton;
        if (addToCartButton == null) {
            hashCode14 = 0;
        } else {
            hashCode14 = addToCartButton.hashCode();
        }
        int i15 = (hashCode21 + hashCode14) * 31;
        PdpPaymentModule pdpPaymentModule = this.paymentModule;
        if (pdpPaymentModule == null) {
            hashCode15 = 0;
        } else {
            hashCode15 = pdpPaymentModule.hashCode();
        }
        int i16 = (i15 + hashCode15) * 31;
        boolean z2 = this.showLoadingView;
        int i17 = z2;
        if (z2 != 0) {
            i17 = 1;
        }
        int hashCode22 = (this.forceRefresh.hashCode() + ((this.skuStockInfo.hashCode() + ((i16 + i17) * 31)) * 31)) * 31;
        ProductPackStruct productPackStruct = this.originalProductPackStruct;
        if (productPackStruct == null) {
            hashCode16 = 0;
        } else {
            hashCode16 = productPackStruct.hashCode();
        }
        int i18 = (hashCode22 + hashCode16) * 31;
        if (!this.isFavorite) {
            i13 = 0;
        }
        int i19 = (i18 + i13) * 31;
        List<SaleProp> list2 = this.localSizeSalePropList;
        if (list2 == null) {
            hashCode17 = 0;
        } else {
            hashCode17 = list2.hashCode();
        }
        int i20 = (i19 + hashCode17) * 31;
        LinkRichText linkRichText = this.protectionProgramText;
        if (linkRichText == null) {
            hashCode18 = 0;
        } else {
            hashCode18 = linkRichText.hashCode();
        }
        int i21 = (i20 + hashCode18) * 31;
        String str4 = this.productTitle;
        if (str4 == null) {
            hashCode19 = 0;
        } else {
            hashCode19 = str4.hashCode();
        }
        int i22 = (i21 + hashCode19) * 31;
        PdpBottomAreaElem pdpBottomAreaElem = this.bottomAreaElem;
        if (pdpBottomAreaElem != null) {
            i = pdpBottomAreaElem.hashCode();
        }
        return i22 + i;
    }

    public final AddToCartButton getAddToCartButton() {
        return this.addToCartButton;
    }

    public final PdpBottomAreaElem getBottomAreaElem() {
        return this.bottomAreaElem;
    }

    public final BuyButton getBuyButton() {
        return this.buyButton;
    }

    public final List<String> getCheckedSkuArray() {
        return this.checkedSkuArray;
    }

    public final Image getCurrentImage() {
        return this.currentImage;
    }

    public final int getCurrentImagePosition() {
        return this.currentImagePosition;
    }

    public final InstallmentPlan getCurrentInstallmentPlan() {
        return this.currentInstallmentPlan;
    }

    public final String getCurrentPrice() {
        return this.currentPrice;
    }

    public final OSZ<Integer, C70404Rk8> getCurrentQuantity() {
        return this.currentQuantity;
    }

    public final C70109RfN getCurrentQuantityLimit() {
        return this.currentQuantityLimit;
    }

    public final String getDiscountText() {
        return this.discountText;
    }

    public final Object getForceRefresh() {
        return this.forceRefresh;
    }

    public final Boolean getKeyBoardVisibility() {
        return this.keyBoardVisibility;
    }

    public final List<SaleProp> getLocalSizeSalePropList() {
        return this.localSizeSalePropList;
    }

    public final Boolean getNeedIcon() {
        return this.needIcon;
    }

    public final String getOriginalPrice() {
        return this.originalPrice;
    }

    public final ProductPackStruct getOriginalProductPackStruct() {
        return this.originalProductPackStruct;
    }

    public final PdpPaymentModule getPaymentModule() {
        return this.paymentModule;
    }

    public final PreOrderInfo getPreOrderInfo() {
        return this.preOrderInfo;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final PromotionView getPromotionView() {
        return this.promotionView;
    }

    public final LinkRichText getProtectionProgramText() {
        return this.protectionProgramText;
    }

    public final String getPurchaseNotice() {
        return this.purchaseNotice;
    }

    public final boolean getShowLoadingView() {
        return this.showLoadingView;
    }

    public final C70042ReI getShowToast() {
        return this.showToast;
    }

    public final EnumC70239RhT getSkuDataState() {
        return this.skuDataState;
    }

    public final boolean getSkuFragmentClosed() {
        return this.skuFragmentClosed;
    }

    public final SkuInfo getSkuInfo() {
        return this.skuInfo;
    }

    public final C70046ReM getSkuStockInfo() {
        return this.skuStockInfo;
    }

    public final String getSpecifications() {
        return this.specifications;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    public final void setAddToCartButton(AddToCartButton addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public final void setShowLoadingView(boolean z) {
        this.showLoadingView = z;
    }

    public SkuState(SkuInfo skuInfo, List<String> list, C70042ReI c70042ReI, Image image, Boolean bool, BuyButton buyButton, PreOrderInfo preOrderInfo, String currentPrice, String str, PromotionView promotionView, String str2, String str3, String specifications, C70109RfN currentQuantityLimit, OSZ<Integer, C70404Rk8> currentQuantity, int i, InstallmentPlan installmentPlan, Boolean bool2, boolean z, EnumC70239RhT skuDataState, AddToCartButton addToCartButton, PdpPaymentModule pdpPaymentModule, boolean z2, C70046ReM skuStockInfo, Object forceRefresh, ProductPackStruct productPackStruct, boolean z3, List<SaleProp> list2, LinkRichText linkRichText, String str4, PdpBottomAreaElem pdpBottomAreaElem) {
        o.LJIIIZ(currentPrice, "currentPrice");
        o.LJIIIZ(specifications, "specifications");
        o.LJIIIZ(currentQuantityLimit, "currentQuantityLimit");
        o.LJIIIZ(currentQuantity, "currentQuantity");
        o.LJIIIZ(skuDataState, "skuDataState");
        o.LJIIIZ(skuStockInfo, "skuStockInfo");
        o.LJIIIZ(forceRefresh, "forceRefresh");
        this.skuInfo = skuInfo;
        this.checkedSkuArray = list;
        this.showToast = c70042ReI;
        this.currentImage = image;
        this.needIcon = bool;
        this.buyButton = buyButton;
        this.preOrderInfo = preOrderInfo;
        this.currentPrice = currentPrice;
        this.purchaseNotice = str;
        this.promotionView = promotionView;
        this.originalPrice = str2;
        this.discountText = str3;
        this.specifications = specifications;
        this.currentQuantityLimit = currentQuantityLimit;
        this.currentQuantity = currentQuantity;
        this.currentImagePosition = i;
        this.currentInstallmentPlan = installmentPlan;
        this.keyBoardVisibility = bool2;
        this.skuFragmentClosed = z;
        this.skuDataState = skuDataState;
        this.addToCartButton = addToCartButton;
        this.paymentModule = pdpPaymentModule;
        this.showLoadingView = z2;
        this.skuStockInfo = skuStockInfo;
        this.forceRefresh = forceRefresh;
        this.originalProductPackStruct = productPackStruct;
        this.isFavorite = z3;
        this.localSizeSalePropList = list2;
        this.protectionProgramText = linkRichText;
        this.productTitle = str4;
        this.bottomAreaElem = pdpBottomAreaElem;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r35v0 */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r38v0, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem] */
    /* JADX WARN: Type inference failed for: r70v0, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ SkuState(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo r40, java.util.List r41, X.C70042ReI r42, com.ss.android.ugc.aweme.ecommerce.service.vo.Image r43, java.lang.Boolean r44, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton r45, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo r46, java.lang.String r47, java.lang.String r48, com.bytedance.android.livesdk.model.message.ext.PromotionView r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, X.C70109RfN r53, X.OSZ r54, int r55, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r56, java.lang.Boolean r57, boolean r58, X.EnumC70239RhT r59, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton r60, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule r61, boolean r62, X.C70046ReM r63, java.lang.Object r64, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct r65, boolean r66, java.util.List r67, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText r68, java.lang.String r69, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem r70, int r71, kotlin.jvm.internal.DefaultConstructorMarker r72) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuState.<init>(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo, java.util.List, X.ReI, com.ss.android.ugc.aweme.ecommerce.service.vo.Image, java.lang.Boolean, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo, java.lang.String, java.lang.String, com.bytedance.android.livesdk.model.message.ext.PromotionView, java.lang.String, java.lang.String, java.lang.String, X.RfN, X.OSZ, int, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan, java.lang.Boolean, boolean, X.RhT, com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule, boolean, X.ReM, java.lang.Object, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct, boolean, java.util.List, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomAreaElem, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
