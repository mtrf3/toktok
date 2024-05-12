package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.livesdk.model.message.ext.PromotionView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Video;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.AdditionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BlockPageInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleBrief;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CodPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ConvenientSubmitOrder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Creator;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DelayOperation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Favorite;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.FlashSale;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.GlobalWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.HalfWaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LazyLoadInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.MarketingConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ModelCard;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpPaymentModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PickTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopUp;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBannerLabel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductProperty;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionEntrance;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionLogo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RecallBox;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SKUPanelBottomText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SecurityInformation;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SelfOperatedSloganInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShareInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopReviewEntry;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ThirdParty;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightTag;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.WaistBanner;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.AddToCartButton;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.PreOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkcInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.StandardSaleProps;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class RWA implements Parcelable.Creator<ProductPackStruct> {
    @Override // android.os.Parcelable.Creator
    public final ProductPackStruct createFromParcel(Parcel parcel) {
        Integer valueOf;
        SellerInfo createFromParcel;
        SelfOperatedSloganInfo createFromParcel2;
        ProductBase createFromParcel3;
        ArrayList arrayList;
        StandardSaleProps createFromParcel4;
        ArrayList arrayList2;
        SkcInfo createFromParcel5;
        ArrayList arrayList3;
        ArrayList arrayList4;
        UserRight createFromParcel6;
        UserRightTag createFromParcel7;
        SecurityInformation createFromParcel8;
        LogisticDTO createFromParcel9;
        ArrayList arrayList5;
        WaistBanner createFromParcel10;
        VoucherInfo createFromParcel11;
        Voucher createFromParcel12;
        ModelCard createFromParcel13;
        ProductDetailReview createFromParcel14;
        ShopReviewEntry createFromParcel15;
        FlashSale createFromParcel16;
        Integer valueOf2;
        ArrayList arrayList6;
        ThirdParty createFromParcel17;
        AddToCartButton createFromParcel18;
        Creator createFromParcel19;
        PickTag createFromParcel20;
        ArrayList arrayList7;
        ArrayList arrayList8;
        PopUp createFromParcel21;
        HalfWaistBanner createFromParcel22;
        boolean z;
        Boolean valueOf3;
        boolean z2;
        Boolean valueOf4;
        DynamicSchema createFromParcel23;
        LinkedHashMap linkedHashMap;
        BuyButton createFromParcel24;
        ProductUnavailableInfo createFromParcel25;
        ShareInfo createFromParcel26;
        ArrayList arrayList9;
        RankInfo createFromParcel27;
        PreOrderInfo createFromParcel28;
        PromotionEntrance createFromParcel29;
        Integer valueOf5;
        MarketingConfig createFromParcel30;
        ArrayList arrayList10;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ProductUnavailableInfo createFromParcel31;
        Integer valueOf6;
        BlockPageInfo createFromParcel32;
        ArrayList arrayList13;
        RecallBox createFromParcel33;
        SKUPanelBottomText createFromParcel34;
        ArrayList arrayList14;
        SkuCommonConfig createFromParcel35;
        PDPLogisticModule createFromParcel36;
        PdpPaymentModule createFromParcel37;
        UserRight createFromParcel38;
        WarehouseTag createFromParcel39;
        boolean z3;
        Boolean valueOf7;
        boolean z4;
        Boolean valueOf8;
        Integer valueOf9;
        BundleBrief createFromParcel40;
        LazyLoadInfo createFromParcel41;
        PdpShipping createFromParcel42;
        ProductProperty createFromParcel43;
        CodPolicy createFromParcel44;
        SelfOperatedPolicy createFromParcel45;
        Integer valueOf10;
        Integer valueOf11;
        Favorite createFromParcel46;
        PlatformPromotion createFromParcel47;
        GlobalWaistBanner createFromParcel48;
        SellerPromotion createFromParcel49;
        PdpBottomArea createFromParcel50;
        PurchaseLimit createFromParcel51;
        ConvenientSubmitOrder createFromParcel52;
        o.LJIIIZ(parcel, "parcel");
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel = null;
        } else {
            createFromParcel = SellerInfo.CREATOR.createFromParcel(parcel);
        }
        SellerInfo sellerInfo = createFromParcel;
        if (parcel.readInt() == 0) {
            createFromParcel2 = null;
        } else {
            createFromParcel2 = SelfOperatedSloganInfo.CREATOR.createFromParcel(parcel);
        }
        SelfOperatedSloganInfo selfOperatedSloganInfo = createFromParcel2;
        if (parcel.readInt() == 0) {
            createFromParcel3 = null;
        } else {
            createFromParcel3 = ProductBase.CREATOR.createFromParcel(parcel);
        }
        ProductBase productBase = createFromParcel3;
        if (parcel.readInt() == 0) {
            arrayList = null;
        } else {
            int readInt = parcel.readInt();
            arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = C279117r.LIZIZ(Video.CREATOR, parcel, arrayList, i, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel4 = null;
        } else {
            createFromParcel4 = StandardSaleProps.CREATOR.createFromParcel(parcel);
        }
        StandardSaleProps standardSaleProps = createFromParcel4;
        if (parcel.readInt() == 0) {
            arrayList2 = null;
        } else {
            int readInt2 = parcel.readInt();
            arrayList2 = new ArrayList(readInt2);
            int i2 = 0;
            while (i2 != readInt2) {
                i2 = C279117r.LIZIZ(SaleProp.CREATOR, parcel, arrayList2, i2, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel5 = null;
        } else {
            createFromParcel5 = SkcInfo.CREATOR.createFromParcel(parcel);
        }
        SkcInfo skcInfo = createFromParcel5;
        if (parcel.readInt() == 0) {
            arrayList3 = null;
        } else {
            int readInt3 = parcel.readInt();
            arrayList3 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = C279117r.LIZIZ(SkuItem.CREATOR, parcel, arrayList3, i3, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList4 = null;
        } else {
            int readInt4 = parcel.readInt();
            arrayList4 = new ArrayList(readInt4);
            int i4 = 0;
            while (i4 != readInt4) {
                i4 = C279117r.LIZIZ(ShopPolicy.CREATOR, parcel, arrayList4, i4, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel6 = null;
        } else {
            createFromParcel6 = UserRight.CREATOR.createFromParcel(parcel);
        }
        UserRight userRight = createFromParcel6;
        if (parcel.readInt() == 0) {
            createFromParcel7 = null;
        } else {
            createFromParcel7 = UserRightTag.CREATOR.createFromParcel(parcel);
        }
        UserRightTag userRightTag = createFromParcel7;
        if (parcel.readInt() == 0) {
            createFromParcel8 = null;
        } else {
            createFromParcel8 = SecurityInformation.CREATOR.createFromParcel(parcel);
        }
        SecurityInformation securityInformation = createFromParcel8;
        if (parcel.readInt() == 0) {
            createFromParcel9 = null;
        } else {
            createFromParcel9 = LogisticDTO.CREATOR.createFromParcel(parcel);
        }
        LogisticDTO logisticDTO = createFromParcel9;
        if (parcel.readInt() == 0) {
            arrayList5 = null;
        } else {
            int readInt5 = parcel.readInt();
            arrayList5 = new ArrayList(readInt5);
            int i5 = 0;
            while (i5 != readInt5) {
                i5 = C279117r.LIZIZ(AdditionInfo.CREATOR, parcel, arrayList5, i5, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel10 = null;
        } else {
            createFromParcel10 = WaistBanner.CREATOR.createFromParcel(parcel);
        }
        WaistBanner waistBanner = createFromParcel10;
        if (parcel.readInt() == 0) {
            createFromParcel11 = null;
        } else {
            createFromParcel11 = VoucherInfo.CREATOR.createFromParcel(parcel);
        }
        VoucherInfo voucherInfo = createFromParcel11;
        if (parcel.readInt() == 0) {
            createFromParcel12 = null;
        } else {
            createFromParcel12 = Voucher.CREATOR.createFromParcel(parcel);
        }
        Voucher voucher = createFromParcel12;
        if (parcel.readInt() == 0) {
            createFromParcel13 = null;
        } else {
            createFromParcel13 = ModelCard.CREATOR.createFromParcel(parcel);
        }
        ModelCard modelCard = createFromParcel13;
        if (parcel.readInt() == 0) {
            createFromParcel14 = null;
        } else {
            createFromParcel14 = ProductDetailReview.CREATOR.createFromParcel(parcel);
        }
        ProductDetailReview productDetailReview = createFromParcel14;
        if (parcel.readInt() == 0) {
            createFromParcel15 = null;
        } else {
            createFromParcel15 = ShopReviewEntry.CREATOR.createFromParcel(parcel);
        }
        ShopReviewEntry shopReviewEntry = createFromParcel15;
        if (parcel.readInt() == 0) {
            createFromParcel16 = null;
        } else {
            createFromParcel16 = FlashSale.CREATOR.createFromParcel(parcel);
        }
        FlashSale flashSale = createFromParcel16;
        if (parcel.readInt() == 0) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            arrayList6 = null;
        } else {
            int readInt6 = parcel.readInt();
            arrayList6 = new ArrayList(readInt6);
            int i6 = 0;
            while (i6 != readInt6) {
                i6 = C279117r.LIZIZ(ProductBannerLabel.CREATOR, parcel, arrayList6, i6, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel17 = null;
        } else {
            createFromParcel17 = ThirdParty.CREATOR.createFromParcel(parcel);
        }
        ThirdParty thirdParty = createFromParcel17;
        if (parcel.readInt() == 0) {
            createFromParcel18 = null;
        } else {
            createFromParcel18 = AddToCartButton.CREATOR.createFromParcel(parcel);
        }
        AddToCartButton addToCartButton = createFromParcel18;
        if (parcel.readInt() == 0) {
            createFromParcel19 = null;
        } else {
            createFromParcel19 = Creator.CREATOR.createFromParcel(parcel);
        }
        Creator creator = createFromParcel19;
        CartEntry cartEntry = (CartEntry) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel20 = null;
        } else {
            createFromParcel20 = PickTag.CREATOR.createFromParcel(parcel);
        }
        PickTag pickTag = createFromParcel20;
        if (parcel.readInt() == 0) {
            arrayList7 = null;
        } else {
            int readInt7 = parcel.readInt();
            arrayList7 = new ArrayList(readInt7);
            int i7 = 0;
            while (i7 != readInt7) {
                i7 = C279117r.LIZIZ(PromotionLogo.CREATOR, parcel, arrayList7, i7, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList8 = null;
        } else {
            int readInt8 = parcel.readInt();
            arrayList8 = new ArrayList(readInt8);
            int i8 = 0;
            while (i8 != readInt8) {
                i8 = C279117r.LIZIZ(ProductLogo.CREATOR, parcel, arrayList8, i8, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel21 = null;
        } else {
            createFromParcel21 = PopUp.CREATOR.createFromParcel(parcel);
        }
        PopUp popUp = createFromParcel21;
        String readString2 = parcel.readString();
        PromotionView promotionView = (PromotionView) parcel.readParcelable(ProductPackStruct.class.getClassLoader());
        if (parcel.readInt() == 0) {
            createFromParcel22 = null;
        } else {
            createFromParcel22 = HalfWaistBanner.CREATOR.createFromParcel(parcel);
        }
        HalfWaistBanner halfWaistBanner = createFromParcel22;
        if (parcel.readInt() == 0) {
            valueOf3 = null;
        } else {
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            valueOf3 = Boolean.valueOf(z);
        }
        if (parcel.readInt() == 0) {
            valueOf4 = null;
        } else {
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            valueOf4 = Boolean.valueOf(z2);
        }
        if (parcel.readInt() == 0) {
            createFromParcel23 = null;
        } else {
            createFromParcel23 = DynamicSchema.CREATOR.createFromParcel(parcel);
        }
        DynamicSchema dynamicSchema = createFromParcel23;
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt9 = parcel.readInt();
            linkedHashMap = new LinkedHashMap(readInt9);
            for (int i9 = 0; i9 != readInt9; i9++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel24 = null;
        } else {
            createFromParcel24 = BuyButton.CREATOR.createFromParcel(parcel);
        }
        BuyButton buyButton = createFromParcel24;
        if (parcel.readInt() == 0) {
            createFromParcel25 = null;
        } else {
            createFromParcel25 = ProductUnavailableInfo.CREATOR.createFromParcel(parcel);
        }
        ProductUnavailableInfo productUnavailableInfo = createFromParcel25;
        if (parcel.readInt() == 0) {
            createFromParcel26 = null;
        } else {
            createFromParcel26 = ShareInfo.CREATOR.createFromParcel(parcel);
        }
        ShareInfo shareInfo = createFromParcel26;
        if (parcel.readInt() == 0) {
            arrayList9 = null;
        } else {
            int readInt10 = parcel.readInt();
            arrayList9 = new ArrayList(readInt10);
            int i10 = 0;
            while (i10 != readInt10) {
                i10 = C279117r.LIZIZ(StaticSellingPoint.CREATOR, parcel, arrayList9, i10, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel27 = null;
        } else {
            createFromParcel27 = RankInfo.CREATOR.createFromParcel(parcel);
        }
        RankInfo rankInfo = createFromParcel27;
        if (parcel.readInt() == 0) {
            createFromParcel28 = null;
        } else {
            createFromParcel28 = PreOrderInfo.CREATOR.createFromParcel(parcel);
        }
        PreOrderInfo preOrderInfo = createFromParcel28;
        if (parcel.readInt() == 0) {
            createFromParcel29 = null;
        } else {
            createFromParcel29 = PromotionEntrance.CREATOR.createFromParcel(parcel);
        }
        PromotionEntrance promotionEntrance = createFromParcel29;
        if (parcel.readInt() == 0) {
            valueOf5 = null;
        } else {
            valueOf5 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel30 = null;
        } else {
            createFromParcel30 = MarketingConfig.CREATOR.createFromParcel(parcel);
        }
        MarketingConfig marketingConfig = createFromParcel30;
        if (parcel.readInt() == 0) {
            arrayList10 = null;
        } else {
            int readInt11 = parcel.readInt();
            arrayList10 = new ArrayList(readInt11);
            int i11 = 0;
            while (i11 != readInt11) {
                i11 = C279117r.LIZIZ(PromotionDiscount.CREATOR, parcel, arrayList10, i11, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList11 = null;
        } else {
            int readInt12 = parcel.readInt();
            arrayList11 = new ArrayList(readInt12);
            int i12 = 0;
            while (i12 != readInt12) {
                i12 = C279117r.LIZIZ(BrickInfo.CREATOR, parcel, arrayList11, i12, 1);
            }
        }
        if (parcel.readInt() == 0) {
            arrayList12 = null;
        } else {
            int readInt13 = parcel.readInt();
            arrayList12 = new ArrayList(readInt13);
            int i13 = 0;
            while (i13 != readInt13) {
                i13 = C279117r.LIZIZ(com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Tab.CREATOR, parcel, arrayList12, i13, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel31 = null;
        } else {
            createFromParcel31 = ProductUnavailableInfo.CREATOR.createFromParcel(parcel);
        }
        ProductUnavailableInfo productUnavailableInfo2 = createFromParcel31;
        String readString3 = parcel.readString();
        if (parcel.readInt() == 0) {
            valueOf6 = null;
        } else {
            valueOf6 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel32 = null;
        } else {
            createFromParcel32 = BlockPageInfo.CREATOR.createFromParcel(parcel);
        }
        BlockPageInfo blockPageInfo = createFromParcel32;
        if (parcel.readInt() == 0) {
            arrayList13 = null;
        } else {
            int readInt14 = parcel.readInt();
            arrayList13 = new ArrayList(readInt14);
            int i14 = 0;
            while (i14 != readInt14) {
                i14 = C279117r.LIZIZ(Announcement.CREATOR, parcel, arrayList13, i14, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel33 = null;
        } else {
            createFromParcel33 = RecallBox.CREATOR.createFromParcel(parcel);
        }
        RecallBox recallBox = createFromParcel33;
        if (parcel.readInt() == 0) {
            createFromParcel34 = null;
        } else {
            createFromParcel34 = SKUPanelBottomText.CREATOR.createFromParcel(parcel);
        }
        SKUPanelBottomText sKUPanelBottomText = createFromParcel34;
        if (parcel.readInt() == 0) {
            arrayList14 = null;
        } else {
            int readInt15 = parcel.readInt();
            arrayList14 = new ArrayList(readInt15);
            int i15 = 0;
            while (i15 != readInt15) {
                i15 = C279117r.LIZIZ(DelayOperation.CREATOR, parcel, arrayList14, i15, 1);
            }
        }
        if (parcel.readInt() == 0) {
            createFromParcel35 = null;
        } else {
            createFromParcel35 = SkuCommonConfig.CREATOR.createFromParcel(parcel);
        }
        SkuCommonConfig skuCommonConfig = createFromParcel35;
        String readString4 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel36 = null;
        } else {
            createFromParcel36 = PDPLogisticModule.CREATOR.createFromParcel(parcel);
        }
        PDPLogisticModule pDPLogisticModule = createFromParcel36;
        if (parcel.readInt() == 0) {
            createFromParcel37 = null;
        } else {
            createFromParcel37 = PdpPaymentModule.CREATOR.createFromParcel(parcel);
        }
        PdpPaymentModule pdpPaymentModule = createFromParcel37;
        if (parcel.readInt() == 0) {
            createFromParcel38 = null;
        } else {
            createFromParcel38 = UserRight.CREATOR.createFromParcel(parcel);
        }
        UserRight userRight2 = createFromParcel38;
        if (parcel.readInt() == 0) {
            createFromParcel39 = null;
        } else {
            createFromParcel39 = WarehouseTag.CREATOR.createFromParcel(parcel);
        }
        WarehouseTag warehouseTag = createFromParcel39;
        if (parcel.readInt() == 0) {
            valueOf7 = null;
        } else {
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            valueOf7 = Boolean.valueOf(z3);
        }
        if (parcel.readInt() == 0) {
            valueOf8 = null;
        } else {
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            valueOf8 = Boolean.valueOf(z4);
        }
        if (parcel.readInt() == 0) {
            valueOf9 = null;
        } else {
            valueOf9 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel40 = null;
        } else {
            createFromParcel40 = BundleBrief.CREATOR.createFromParcel(parcel);
        }
        BundleBrief bundleBrief = createFromParcel40;
        if (parcel.readInt() == 0) {
            createFromParcel41 = null;
        } else {
            createFromParcel41 = LazyLoadInfo.CREATOR.createFromParcel(parcel);
        }
        LazyLoadInfo lazyLoadInfo = createFromParcel41;
        if (parcel.readInt() == 0) {
            createFromParcel42 = null;
        } else {
            createFromParcel42 = PdpShipping.CREATOR.createFromParcel(parcel);
        }
        PdpShipping pdpShipping = createFromParcel42;
        String readString5 = parcel.readString();
        if (parcel.readInt() == 0) {
            createFromParcel43 = null;
        } else {
            createFromParcel43 = ProductProperty.CREATOR.createFromParcel(parcel);
        }
        ProductProperty productProperty = createFromParcel43;
        if (parcel.readInt() == 0) {
            createFromParcel44 = null;
        } else {
            createFromParcel44 = CodPolicy.CREATOR.createFromParcel(parcel);
        }
        CodPolicy codPolicy = createFromParcel44;
        if (parcel.readInt() == 0) {
            createFromParcel45 = null;
        } else {
            createFromParcel45 = SelfOperatedPolicy.CREATOR.createFromParcel(parcel);
        }
        SelfOperatedPolicy selfOperatedPolicy = createFromParcel45;
        if (parcel.readInt() == 0) {
            valueOf10 = null;
        } else {
            valueOf10 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            valueOf11 = null;
        } else {
            valueOf11 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readInt() == 0) {
            createFromParcel46 = null;
        } else {
            createFromParcel46 = Favorite.CREATOR.createFromParcel(parcel);
        }
        Favorite favorite = createFromParcel46;
        if (parcel.readInt() == 0) {
            createFromParcel47 = null;
        } else {
            createFromParcel47 = PlatformPromotion.CREATOR.createFromParcel(parcel);
        }
        PlatformPromotion platformPromotion = createFromParcel47;
        if (parcel.readInt() == 0) {
            createFromParcel48 = null;
        } else {
            createFromParcel48 = GlobalWaistBanner.CREATOR.createFromParcel(parcel);
        }
        GlobalWaistBanner globalWaistBanner = createFromParcel48;
        if (parcel.readInt() == 0) {
            createFromParcel49 = null;
        } else {
            createFromParcel49 = SellerPromotion.CREATOR.createFromParcel(parcel);
        }
        SellerPromotion sellerPromotion = createFromParcel49;
        if (parcel.readInt() == 0) {
            createFromParcel50 = null;
        } else {
            createFromParcel50 = PdpBottomArea.CREATOR.createFromParcel(parcel);
        }
        PdpBottomArea pdpBottomArea = createFromParcel50;
        if (parcel.readInt() == 0) {
            createFromParcel51 = null;
        } else {
            createFromParcel51 = PurchaseLimit.CREATOR.createFromParcel(parcel);
        }
        PurchaseLimit purchaseLimit = createFromParcel51;
        if (parcel.readInt() == 0) {
            createFromParcel52 = null;
        } else {
            createFromParcel52 = ConvenientSubmitOrder.CREATOR.createFromParcel(parcel);
        }
        return new ProductPackStruct(readString, valueOf, sellerInfo, selfOperatedSloganInfo, productBase, arrayList, standardSaleProps, arrayList2, skcInfo, arrayList3, arrayList4, userRight, userRightTag, securityInformation, logisticDTO, arrayList5, waistBanner, voucherInfo, voucher, modelCard, productDetailReview, shopReviewEntry, flashSale, valueOf2, arrayList6, thirdParty, addToCartButton, creator, cartEntry, pickTag, arrayList7, arrayList8, popUp, readString2, promotionView, halfWaistBanner, valueOf3, valueOf4, dynamicSchema, linkedHashMap, buyButton, productUnavailableInfo, shareInfo, arrayList9, rankInfo, preOrderInfo, promotionEntrance, valueOf5, marketingConfig, arrayList10, arrayList11, arrayList12, productUnavailableInfo2, readString3, valueOf6, blockPageInfo, arrayList13, recallBox, sKUPanelBottomText, arrayList14, skuCommonConfig, readString4, pDPLogisticModule, pdpPaymentModule, userRight2, warehouseTag, valueOf7, valueOf8, valueOf9, bundleBrief, lazyLoadInfo, pdpShipping, readString5, productProperty, codPolicy, selfOperatedPolicy, valueOf10, valueOf11, favorite, platformPromotion, globalWaistBanner, sellerPromotion, pdpBottomArea, purchaseLimit, createFromParcel52, parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final ProductPackStruct[] newArray(int i) {
        return new ProductPackStruct[i];
    }
}
