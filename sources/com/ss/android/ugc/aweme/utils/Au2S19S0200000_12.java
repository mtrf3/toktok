package com.ss.android.ugc.aweme.utils;

import X.AI2;
import X.ASL;
import X.AbstractC70686Rog;
import X.C111434Yx;
import X.C113554cx;
import X.C16880lQ;
import X.C26227ARb;
import X.C26867AgZ;
import X.C27090AkA;
import X.C27162AlK;
import X.C27474AqM;
import X.C27493Aqf;
import X.C27949Ay1;
import X.C2U8;
import X.C36576EXc;
import X.C38350F3i;
import X.C44140HUa;
import X.C46536IOe;
import X.C55096Ljo;
import X.C61447O9r;
import X.C65352Pkq;
import X.C69643RUx;
import X.C69687RWp;
import X.C69698RXa;
import X.C69964Rd2;
import X.C70172RgO;
import X.C70174RgQ;
import X.C70178RgU;
import X.C70196Rgm;
import X.C70212Rh2;
import X.C70287RiF;
import X.C70414RkI;
import X.C70470RlC;
import X.C70591Rn9;
import X.C70656RoC;
import X.C70677RoX;
import X.C70691Rol;
import X.C70731RpP;
import X.C70732RpQ;
import X.C70736RpU;
import X.C70737RpV;
import X.C70799RqV;
import X.C70800RqW;
import X.C70836Rr6;
import X.C70837Rr7;
import X.C70917RsP;
import X.C70919RsR;
import X.C71538S5u;
import X.C71543S5z;
import X.C71581S7l;
import X.C71587S7r;
import X.C71589S7t;
import X.C71731SDf;
import X.C71759SEh;
import X.C71767SEp;
import X.C74284TDk;
import X.C76542zS;
import X.C77125UOr;
import X.C78685UuP;
import X.C78880UxY;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79234V7u;
import X.C8VC;
import X.DialogC71377Rzp;
import X.EnumC70012Rdo;
import X.EnumC70107RfL;
import X.EnumC70477RlJ;
import X.InterfaceC57784Mm4;
import X.InterfaceC70291RiJ;
import X.InterfaceC70593RnB;
import X.InterfaceC71003Rtn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.MG0;
import X.ORZ;
import X.OSZ;
import X.OUR;
import X.RWI;
import X.RX8;
import X.S4U;
import X.S4W;
import X.S5F;
import X.S6R;
import X.S6S;
import X.S6U;
import X.S7F;
import X.S7O;
import X.S87;
import X.SBC;
import X.SBH;
import X.SBI;
import X.SD2;
import X.SV5;
import X.TAS;
import X.TAT;
import X.TEZ;
import X.UC0;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.MessageCenterViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.SellerConversationViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.messagecenter.api.StoreSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.SameShippingAddressElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.PdpShopRecommendVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shoprecommend.ShopRecommendVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.ImageSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.PdpSkuHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.waist.WaistInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PlatformPromotionItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PopupPrompt;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseNotice;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ShopRecommendData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.SellerInfoBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.SkuBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SellerInfoBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.SkuBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ReviewFragmentV1;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewItemStruct;
import com.ss.android.ugc.aweme.ecommerce.base.review.viewholder.ReviewCellViewHolderV1;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowExtraModel;
import com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpReviewCellViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.widget.UsPdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuBottomWidget;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardTemplateFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.ProductTemplateEditAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.assem.TemplateEditBottomAreaAssem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.DiscountTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.MultiTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ProductTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SingleTextTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecoration;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateDecorationTitle;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.BaseTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.DiscountTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.ImageCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.MultiTextTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.ProductTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.SingleTextTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist.SizeChartTemplateCell;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateEditBottomAreaViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.TemplateListViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.productlist.ProductImageSelectFragment;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.TTMBrand;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.AqS87S1100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S19S0200000_12 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.TAT
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                return;
            case 1:
                LIZ$1(this, view);
                return;
            case 2:
                LIZ$2(this, view);
                return;
            case 3:
                LIZ$3(this, view);
                return;
            case 4:
                LIZ$4(this, view);
                return;
            case 5:
                LIZ$5(this, view);
                return;
            case 6:
                LIZ$6(this, view);
                return;
            case 7:
                LIZ$7(this, view);
                return;
            case 8:
                LIZ$8(this, view);
                return;
            case 9:
                LIZ$9(this, view);
                return;
            case 10:
                LIZ$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LIZ$11(this, view);
                return;
            case 12:
                LIZ$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LIZ$13(this, view);
                return;
            case 14:
                LIZ$14(this, view);
                return;
            case 15:
                LIZ$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LIZ$16(this, view);
                return;
            case 17:
                LIZ$17(this, view);
                return;
            case 18:
                LIZ$18(this, view);
                return;
            case 19:
                LIZ$19(this, view);
                return;
            case 20:
                LIZ$20(this, view);
                return;
            case 21:
                LIZ$21(this, view);
                return;
            case 22:
                LIZ$22(this, view);
                return;
            case 23:
                LIZ$23(this, view);
                return;
            case 24:
                LIZ$24(this, view);
                return;
            case 25:
                LIZ$25(this, view);
                return;
            case 26:
                LIZ$26(this, view);
                return;
            case 27:
                LIZ$27(this, view);
                return;
            case 28:
                LIZ$28(this, view);
                return;
            case 29:
                LIZ$29(this, view);
                return;
            case 30:
                LIZ$30(this, view);
                return;
            case 31:
                LIZ$31(this, view);
                return;
            case 32:
                LIZ$32(this, view);
                return;
            case 33:
                LIZ$33(this, view);
                return;
            case 34:
                LIZ$34(this, view);
                return;
            case 35:
                LIZ$35(this, view);
                return;
            case 36:
                LIZ$36(this, view);
                return;
            case 37:
                LIZ$37(this, view);
                return;
            case 38:
                LIZ$38(this, view);
                return;
            case 39:
                LIZ$39(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                LIZ$40(this, view);
                return;
            case 41:
                LIZ$41(this, view);
                return;
            case 42:
                LIZ$42(this, view);
                return;
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                LIZ$43(this, view);
                return;
            case 44:
                LIZ$44(this, view);
                return;
            case 45:
                LIZ$45(this, view);
                return;
            case 46:
                LIZ$46(this, view);
                return;
            case 47:
                LIZ$47(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                LIZ$48(this, view);
                return;
            case C61447O9r.LJIIJ:
                LIZ$49(this, view);
                return;
            case 50:
                LIZ$50(this, view);
                return;
            case 51:
                LIZ$51(this, view);
                return;
            case 52:
                LIZ$52(this, view);
                return;
            case 53:
                LIZ$53(this, view);
                return;
            case 54:
                LIZ$54(this, view);
                return;
            case 55:
                LIZ$55(this, view);
                return;
            case 56:
                LIZ$56(this, view);
                return;
            case 57:
                LIZ$57(this, view);
                return;
            case 58:
                LIZ$58(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        PlatformPromotionItem platformPromotionItem;
        if (view != null) {
            long currentTimeMillis = System.currentTimeMillis();
            C70212Rh2 c70212Rh2 = (C70212Rh2) au2S19S0200000_12.l0;
            if (currentTimeMillis - c70212Rh2.LJLILLLLZI >= c70212Rh2.LJLIL) {
                c70212Rh2.LJLILLLLZI = currentTimeMillis;
                InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) au2S19S0200000_12.l1;
                C69643RUx c69643RUx = c70212Rh2.LJLJI;
                if (c69643RUx != null) {
                    platformPromotionItem = c69643RUx.LIZIZ;
                } else {
                    platformPromotionItem = null;
                }
                interfaceC88471Ynr.invoke(platformPromotionItem, c70212Rh2);
            }
        }
    }

    public static final void LIZ$1(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        C69643RUx c69643RUx;
        Voucher voucher;
        String voucherTypeID;
        if (view != null && (c69643RUx = ((C70212Rh2) au2S19S0200000_12.l0).LJLJI) != null && (voucher = c69643RUx.LJ) != null && (voucherTypeID = voucher.getVoucherTypeID()) != null) {
            ((InterfaceC88472Yns) au2S19S0200000_12.l1).invoke(voucherTypeID);
        }
    }

    public static final void LIZ$10(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        if (view != null) {
            C70414RkI c70414RkI = ((PdpReviewViewHolder) au2S19S0200000_12.l0).getVm().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJL((ReviewItemStruct) au2S19S0200000_12.l1, "text");
            }
            PdpViewModel vm = ((PdpReviewViewHolder) au2S19S0200000_12.l0).getVm();
            ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) au2S19S0200000_12.l1).review;
            if (mainReview != null) {
                str = mainReview.reviewId;
            } else {
                str = null;
            }
            vm.Kw0(1, view, "review_entrance", "review", str);
        }
    }

    public static final void LIZ$11(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        if (view != null) {
            PdpViewModel vm = ((PdpReviewViewHolder) au2S19S0200000_12.l0).getVm();
            ReviewItemStruct.MainReview mainReview = ((ReviewItemStruct) au2S19S0200000_12.l1).review;
            if (mainReview != null) {
                str = mainReview.reviewId;
            } else {
                str = null;
            }
            vm.Kw0(1, view, "review_entrance", "review", str);
            C70414RkI c70414RkI = ((PdpReviewViewHolder) au2S19S0200000_12.l0).getVm().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJL((ReviewItemStruct) au2S19S0200000_12.l1, "other");
            }
        }
    }

    public static final void LIZ$12(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        SellerInfo sellerInfo;
        String str2;
        SellerInfo sellerInfo2;
        if (view != null) {
            ShopRecommendVO shopRecommendVO = (ShopRecommendVO) au2S19S0200000_12.l0;
            ShopRecommendData shopRecommendData = shopRecommendVO.shopRecommendData;
            Float f = null;
            if (shopRecommendData != null && shopRecommendData.productList != null) {
                if (shopRecommendVO.enterSchema != null) {
                    List<Object> ew0 = ((PdpShopRecommendVH) au2S19S0200000_12.l1).getVm().ew0();
                    List<Object> Yv0 = ((PdpShopRecommendVH) au2S19S0200000_12.l1).getVm().Yv0(null);
                    PdpViewModel vm = ((PdpShopRecommendVH) au2S19S0200000_12.l1).getVm();
                    Context context = ((PdpShopRecommendVH) au2S19S0200000_12.l1).itemView.getContext();
                    o.LJIIIIZZ(context, "itemView.context");
                    String str3 = ((ShopRecommendVO) au2S19S0200000_12.l0).enterSchema;
                    ProductPackStruct productPackStruct = ((PdpShopRecommendVH) au2S19S0200000_12.l1).getVm().LJLJLLL;
                    if (productPackStruct != null && (sellerInfo2 = productPackStruct.sellerInfo) != null) {
                        str = sellerInfo2.sellerId;
                    } else {
                        str = null;
                    }
                    ProductPackStruct productPackStruct2 = ((PdpShopRecommendVH) au2S19S0200000_12.l1).getVm().LJLJLLL;
                    if (productPackStruct2 != null && (sellerInfo = productPackStruct2.sellerInfo) != null && (str2 = sellerInfo.rating) != null) {
                        f = C38350F3i.LJJIJLIJ(str2);
                    }
                    PdpViewModel.nw0(vm, context, str3, str, f, "pdp_shop_view_more", null, ((PdpShopRecommendVH) au2S19S0200000_12.l1).getVm().aw0(), ew0, Yv0, "pdp_shop_view_more", null, null, null, null, 15360);
                    return;
                }
                C78983UzD.LJIILL("PdpViewModel_sameRecommend schema is null");
            }
        }
    }

    public static final void LIZ$13(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ((WaistInfoViewHolder) au2S19S0200000_12.l0).showReminderConfirmDlg();
            C70414RkI c70414RkI = ((WaistInfoViewHolder) au2S19S0200000_12.l0).getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIJIL((HashMap) au2S19S0200000_12.l1);
            }
        }
    }

    public static final void LIZ$14(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ((WaistInfoViewHolder) au2S19S0200000_12.l0).showReminderConfirmDlg();
            C70414RkI c70414RkI = ((WaistInfoViewHolder) au2S19S0200000_12.l0).getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIJIL((HashMap) au2S19S0200000_12.l1);
            }
        }
    }

    public static final void LIZ$15(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        CartEntry cartEntry;
        CartEntry cartEntry2;
        if (view != null) {
            PdpViewModel viewModel = ((PdpHeadNavBarWidget) au2S19S0200000_12.l0).getViewModel();
            Context context = ((View) au2S19S0200000_12.l1).getContext();
            if (context == null) {
                viewModel.getClass();
                C78983UzD.LJIILL("Open cart failed. Context is NULL");
            } else {
                String fw0 = PdpViewModel.fw0(viewModel.aw0());
                ProductPackStruct productPackStruct = viewModel.LJLJLLL;
                String str2 = null;
                if (productPackStruct != null && (cartEntry2 = productPackStruct.cartEntry) != null) {
                    str = cartEntry2.link;
                } else {
                    str = null;
                }
                String str3 = C27090AkA.LJLILLLLZI;
                if (str3 != null) {
                    if (productPackStruct != null && (cartEntry = productPackStruct.cartEntry) != null) {
                        str2 = cartEntry.link;
                    }
                    str = UriProtector.parse(str2).buildUpon().appendQueryParameter("buyer_addr_id", str3).toString();
                }
                C70172RgO.LIZJ(context, viewModel.LJLJJLL, fw0, str, false);
            }
            ((PdpHeadNavBarWidget) au2S19S0200000_12.l0).logCartClick();
        }
    }

    public static final void LIZ$16(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((ReviewCellViewHolderV1) au2S19S0200000_12.l0), new AqS159S0200000_12((ReviewCellViewHolderV1) au2S19S0200000_12.l0, (ReviewItemStruct) au2S19S0200000_12.l1, 17));
        }
    }

    public static final void LIZ$17(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((ReviewCellViewHolderV1) au2S19S0200000_12.l0), new AqS159S0200000_12((ReviewCellViewHolderV1) au2S19S0200000_12.l0, (ReviewItemStruct) au2S19S0200000_12.l1, 18));
        }
    }

    public static final void LIZ$18(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ReviewCellViewHolderV1 reviewCellViewHolderV1 = (ReviewCellViewHolderV1) au2S19S0200000_12.l0;
            reviewCellViewHolderV1.withState(reviewCellViewHolderV1.X(), new AqS143S0200000_12((ReviewCellViewHolderV1) au2S19S0200000_12.l0, (ReviewItemStruct) au2S19S0200000_12.l1, 38));
        }
    }

    public static final void LIZ$19(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        ReviewItemStruct reviewItemStruct;
        if (view != null) {
            Context context = ((TuxTextView) au2S19S0200000_12.l0).getContext();
            C70677RoX c70677RoX = ((ReviewCellViewHolderV1) au2S19S0200000_12.l1).LJLIL;
            if (c70677RoX != null && (reviewItemStruct = c70677RoX.LIZ) != null) {
                str = reviewItemStruct.reviewLink;
            } else {
                str = null;
            }
            SmartRouter.buildRoute(context, str).open();
        }
    }

    public static final void LIZ$2(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        Object build;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Long l;
        String l2;
        Integer num;
        Integer num2;
        Long l3;
        StoreSellingPoint storeSellingPoint;
        if (view != null && (str = ((C111434Yx) au2S19S0200000_12.l0).LJLJL) != null) {
            StringBuffer stringBuffer = new StringBuffer(str);
            int indexOf = stringBuffer.indexOf("source=");
            if (indexOf > 0) {
                int i = indexOf + 7;
                stringBuffer.replace(i, i + 1, "15");
            }
            int i2 = 0;
            if (ujb.o.LJJJLIIL(str, "aweme", false)) {
                build = stringBuffer.toString();
            } else {
                build = new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", stringBuffer.toString()).build();
            }
            int i3 = 1;
            String uri = C26867AgZ.LIZJ(build.toString(), C113554cx.LJJJLZIJ(new OSZ("enter_from", "message"))).build().toString();
            o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
            SmartRouter.buildRoute(((SellerConversationViewHolder) au2S19S0200000_12.l1).itemView.getContext(), uri).open();
            ((MessageCenterViewModel) ((SellerConversationViewHolder) au2S19S0200000_12.l1).LJLIL.getValue()).LJLJL = "next";
            OSZ[] oszArr = new OSZ[13];
            oszArr[0] = new OSZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            C27474AqM c27474AqM = ((SellerConversationViewHolder) au2S19S0200000_12.l1).LJLILLLLZI;
            if (c27474AqM == null || (str2 = c27474AqM.LJLILLLLZI) == null) {
                str2 = "notification_page";
            }
            oszArr[1] = new OSZ("enter_from", str2);
            C27474AqM c27474AqM2 = ((SellerConversationViewHolder) au2S19S0200000_12.l1).LJLILLLLZI;
            if (c27474AqM2 == null || (str3 = c27474AqM2.LJLIL) == null) {
                str3 = "shop_message";
            }
            int i4 = 2;
            oszArr[2] = new OSZ("page_name", str3);
            if (((C111434Yx) au2S19S0200000_12.l0).LJLJLLL) {
                str4 = "collaborator_message";
            } else {
                str4 = "tiktok shops";
            }
            oszArr[3] = new OSZ("account_type", str4);
            C111434Yx item = ((SellerConversationViewHolder) au2S19S0200000_12.l1).getItem();
            String str7 = "";
            if (item == null || (storeSellingPoint = item.LJLL) == null || (str5 = storeSellingPoint.shopRatingDisplay) == null) {
                str5 = "";
            }
            oszArr[4] = new OSZ("shop_rating", str5);
            oszArr[5] = new OSZ("notification_type", "official");
            oszArr[6] = new OSZ("action_type", "click");
            int bindingAdapterPosition = ((SellerConversationViewHolder) au2S19S0200000_12.l1).getBindingAdapterPosition();
            C27474AqM c27474AqM3 = ((SellerConversationViewHolder) au2S19S0200000_12.l1).LJLILLLLZI;
            if (c27474AqM3 == null || !c27474AqM3.LJLJJL) {
                i4 = 5;
            }
            oszArr[7] = new OSZ("client_order", String.valueOf(bindingAdapterPosition - i4));
            C111434Yx item2 = ((SellerConversationViewHolder) au2S19S0200000_12.l1).getItem();
            if (item2 == null || (l3 = item2.LJLJLJ) == null || (str6 = l3.toString()) == null) {
                str6 = "";
            }
            oszArr[8] = new OSZ("message_time", str6);
            C111434Yx item3 = ((SellerConversationViewHolder) au2S19S0200000_12.l1).getItem();
            if (item3 != null && (num2 = item3.LJLJJLL) != null && num2.intValue() > 0) {
                i3 = 0;
            }
            oszArr[9] = new OSZ("is_read", String.valueOf(i3));
            oszArr[10] = new OSZ("timeline", ((AppCompatTextView) ((SellerConversationViewHolder) au2S19S0200000_12.l1)._$_findCachedViewById(R.id.time)).getText().toString());
            C111434Yx item4 = ((SellerConversationViewHolder) au2S19S0200000_12.l1).getItem();
            if (item4 != null && (num = item4.LJLJJLL) != null) {
                i2 = num.intValue();
            }
            oszArr[11] = new OSZ("notice_number", String.valueOf(i2));
            C111434Yx item5 = ((SellerConversationViewHolder) au2S19S0200000_12.l1).getItem();
            if (item5 != null && (l = item5.LJLIL) != null && (l2 = l.toString()) != null) {
                str7 = l2;
            }
            oszArr[12] = new OSZ("content_id", str7);
            C76542zS.LIZ("official_message_inner_message", C113554cx.LJJJLZIJ(oszArr));
        }
    }

    public static final void LIZ$20(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            String str = ((LinkRichText) au2S19S0200000_12.l0).link;
            if (str != null) {
                C26867AgZ.LIZIZ(((SkuPanelBottomWidget) au2S19S0200000_12.l1).getContext(), str, C113554cx.LJJJLIIL(), false).open();
            }
            View tv_buyer_protection = ((SkuPanelBottomWidget) au2S19S0200000_12.l1)._$_findCachedViewById(R.id.m1a);
            o.LJIIIIZZ(tv_buyer_protection, "tv_buyer_protection");
            C78946Uyc.LJJIIJ(tv_buyer_protection, new C70919RsR(), C70196Rgm.LJLIL);
        }
    }

    public static final void LIZ$21(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        if (view != null) {
            Context context = ((CommerceProductInfoView) au2S19S0200000_12.l0).getContext();
            o.LJIIIIZZ(context, "context");
            C26227ARb c26227ARb = new C26227ARb(context);
            PopupPrompt popupPrompt = ((PurchaseNotice) au2S19S0200000_12.l1).popupPrompt;
            String str2 = null;
            if (popupPrompt != null) {
                str = popupPrompt.title;
            } else {
                str = null;
            }
            c26227ARb.LJFF(str);
            PopupPrompt popupPrompt2 = ((PurchaseNotice) au2S19S0200000_12.l1).popupPrompt;
            if (popupPrompt2 != null) {
                str2 = popupPrompt2.content;
            }
            c26227ARb.LIZIZ(str2);
            UC0.LIZJ(c26227ARb, C70591Rn9.LJLIL);
            c26227ARb.LJI().LIZLLL();
        }
    }

    public static final void LIZ$22(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        InterfaceC70593RnB interfaceC70593RnB;
        if (view != null && (interfaceC70593RnB = ((CommerceProductInfoView) au2S19S0200000_12.l0).couponLogListener) != null) {
            interfaceC70593RnB.LIZLLL(view, ((C69687RWp) au2S19S0200000_12.l1).LJJIIJ);
        }
    }

    public static final void LIZ$23(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        if (view != null) {
            C70414RkI c70414RkI = ((PdpViewModel) ((UsPdpReviewCellViewHolder) au2S19S0200000_12.l0).LJLJI.getValue()).LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJL(((C70677RoX) ((AbstractC70686Rog) au2S19S0200000_12.l1)).LIZ, "review");
            }
            PdpViewModel pdpViewModel = (PdpViewModel) ((UsPdpReviewCellViewHolder) au2S19S0200000_12.l0).LJLJI.getValue();
            ReviewItemStruct.MainReview mainReview = ((C70677RoX) ((AbstractC70686Rog) au2S19S0200000_12.l1)).LIZ.review;
            if (mainReview != null) {
                str = mainReview.reviewId;
            } else {
                str = null;
            }
            pdpViewModel.Kw0(1, view, "review_entrance", "review", str);
        }
    }

    public static final void LIZ$24(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ((UsSkuVH) au2S19S0200000_12.l0).getVm().Qw0(((UsSkuVH) au2S19S0200000_12.l0).getFragment(), ((RWI) au2S19S0200000_12.l1).LIZLLL);
        }
    }

    public static final void LIZ$25(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ((UsSkuVH) au2S19S0200000_12.l0).getVm().Qw0(((UsSkuVH) au2S19S0200000_12.l0).getFragment(), ((RWI) au2S19S0200000_12.l1).LIZLLL);
        }
    }

    public static final void LIZ$26(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            String str = ((LinkRichText) au2S19S0200000_12.l0).link;
            if (str != null) {
                C26867AgZ.LIZIZ(((UsSkuBottomWidget) au2S19S0200000_12.l1).getContext(), str, C113554cx.LJJJLIIL(), false).open();
            }
            View tv_buyer_protection = ((UsSkuBottomWidget) au2S19S0200000_12.l1)._$_findCachedViewById(R.id.m1a);
            o.LJIIIIZZ(tv_buyer_protection, "tv_buyer_protection");
            C78946Uyc.LJJIIJ(tv_buyer_protection, new C70919RsR(), C70174RgQ.LJLIL);
        }
    }

    public static final void LIZ$27(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        FragmentManager childFragmentManager;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view != null) {
            RootData rootData = ((ProductTemplateEditAssem) au2S19S0200000_12.l0).I3().getState().LJLILLLLZI;
            String str2 = rootData.roomId;
            String str3 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((ProductTemplateItem) au2S19S0200000_12.l1).getTemplateId();
            int type = ((ProductTemplateItem) au2S19S0200000_12.l1).getType();
            String L = rootData.L();
            int i = rootData.templateEntryType;
            List<TemplateDecoration> LLILIL = ((ProductTemplateItem) au2S19S0200000_12.l1).LLILIL();
            if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
                str = templateDecorationTitle.text;
            } else {
                str = null;
            }
            S5F.LIZJ(str2, str3, templateId, z, "template_product_name", L, C78685UuP.LJJJZ(str), type, i);
            Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
            if (LJIIIZ != null && (childFragmentManager = LJIIIZ.getChildFragmentManager()) != null) {
                Bundle bundle = new Bundle();
                bundle.putLong("start_click_time", System.currentTimeMillis());
                AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((ProductTemplateEditAssem) au2S19S0200000_12.l0, 216);
                ASL asl = new ASL();
                ProductImageSelectFragment productImageSelectFragment = new ProductImageSelectFragment();
                productImageSelectFragment.setArguments(bundle);
                productImageSelectFragment.LJLJI = aqS178S0100000_12;
                TuxSheet tuxSheet = asl.LIZ;
                tuxSheet.LJLLILLLL = productImageSelectFragment;
                tuxSheet.LJZI = false;
                asl.LJI(1);
                int LIZIZ = (int) C27162AlK.LIZIZ();
                TuxSheet tuxSheet2 = asl.LIZ;
                tuxSheet2.LJLLLLLL = LIZIZ;
                tuxSheet2.LJZL = true;
                tuxSheet2.LLD = false;
                tuxSheet2.show(childFragmentManager, ProductImageSelectFragment.LJLJLJ);
            }
        }
    }

    public static final void LIZ$28(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view != null) {
            String str = null;
            TemplateItem newItem = ((S87) C8VC.LIZIZ((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0, C65352Pkq.LIZ(S87.class), null)).Uf();
            TemplateEditBottomAreaViewModel K3 = ((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0).K3();
            TemplateItem rawItem = (TemplateItem) au2S19S0200000_12.l1;
            K3.getClass();
            o.LJIIIZ(rawItem, "rawItem");
            o.LJIIIZ(newItem, "newItem");
            K3.setState(C71587S7r.LJLIL);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(K3), null, null, new C71581S7l(K3, rawItem, newItem, null), 3);
            RootData rootData = ((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0).H3().getState().LJLILLLLZI;
            String str2 = rootData.roomId;
            String str3 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((TemplateItem) au2S19S0200000_12.l1).getTemplateId();
            int type = ((TemplateItem) au2S19S0200000_12.l1).getType();
            String L = rootData.L();
            int i = rootData.templateEntryType;
            List<TemplateDecoration> LLILIL = ((TemplateItem) au2S19S0200000_12.l1).LLILIL();
            if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
                str = templateDecorationTitle.text;
            }
            S5F.LIZJ(str2, str3, templateId, z, "template_save", L, C78685UuP.LJJJZ(str), type, i);
        }
    }

    public static final void LIZ$29(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view != null) {
            String str2 = null;
            S87 s87 = (S87) C8VC.LIZIZ((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0, C65352Pkq.LIZ(S87.class), null);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0).K3()), null, null, new C71589S7t((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0, (TemplateItem) au2S19S0200000_12.l1, s87.Uf(), s87, null), 3);
            RootData rootData = ((TemplateEditBottomAreaAssem) au2S19S0200000_12.l0).H3().getState().LJLILLLLZI;
            String str3 = rootData.roomId;
            String str4 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((TemplateItem) au2S19S0200000_12.l1).getTemplateId();
            int type = ((TemplateItem) au2S19S0200000_12.l1).getType();
            if (((TemplateItem) au2S19S0200000_12.l1).LLJLLIL()) {
                str = "template_update";
            } else {
                str = "template_display";
            }
            String L = rootData.L();
            int i = rootData.templateEntryType;
            List<TemplateDecoration> LLILIL = ((TemplateItem) au2S19S0200000_12.l1).LLILIL();
            if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
                str2 = templateDecorationTitle.text;
            }
            S5F.LIZJ(str3, str4, templateId, z, str, L, C78685UuP.LJJJZ(str2), type, i);
        }
    }

    public static final void LIZ$3(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            String str = ((LinkRichText) au2S19S0200000_12.l0).link;
            if (str != null) {
                C26867AgZ.LIZIZ(((UsPdpBottomNavBarWidget) au2S19S0200000_12.l1).getContext(), str, C113554cx.LJJJLIIL(), false).open();
            }
            C78946Uyc.LJJII(((UsPdpBottomNavBarWidget) au2S19S0200000_12.l1).LJLIL, new C70919RsR(), C70178RgU.LJLIL);
        }
    }

    public static final void LIZ$30(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C69964Rd2.LIZIZ((InterfaceC71003Rtn) au2S19S0200000_12.l0, (HashMap) au2S19S0200000_12.l1, "coupons", "pdp_top");
        }
    }

    public static final void LIZ$31(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C27493Aqf.LIZIZ("use_shipping_address", null);
            BillingAddressViewModel billingAddressViewModel = (BillingAddressViewModel) ((SameShippingAddressElementViewHolder) au2S19S0200000_12.l0).LJLIL.getValue();
            Address address = ((SBI) au2S19S0200000_12.l1).LJLIL;
            o.LJIIIZ(address, "address");
            List<InterfaceC57784Mm4> list = billingAddressViewModel.getState().LJLJJL;
            if (list != null) {
                for (InterfaceC57784Mm4 interfaceC57784Mm4 : list) {
                    if (interfaceC57784Mm4 instanceof SBC) {
                        ((SBC) interfaceC57784Mm4).LLIIIJ(null);
                    }
                }
            }
            billingAddressViewModel.hv0(address);
            billingAddressViewModel.qv0();
            billingAddressViewModel.setState(SBH.LJLIL);
        }
    }

    public static final void LIZ$32(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        ShopWindowExtraModel shopWindowExtraModel;
        String str;
        if (view != null && (shopWindowExtraModel = (ShopWindowExtraModel) au2S19S0200000_12.l0) != null && (str = shopWindowExtraModel.unavailableSchema) != null && str.length() > 0) {
            SmartRouter.buildRoute(((DialogC71377Rzp) au2S19S0200000_12.l1).getContext(), str).open();
            ((DialogC71377Rzp) au2S19S0200000_12.l1).LJJ("tiktokec_module_click");
        }
    }

    public static final void LIZ$33(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view != null) {
            TemplateListViewModel N = ((BaseTemplateCell) au2S19S0200000_12.l0).N();
            TemplateItem item = (TemplateItem) au2S19S0200000_12.l1;
            N.getClass();
            o.LJIIIZ(item, "item");
            String str = null;
            XKX.LIZLLL(ViewModelKt.getViewModelScope(N), C36576EXc.LIZJ, null, new S7O(N, (S6U) N.getVmDispatcher().getState(), item, null), 2);
            RootData rootData = ((BaseTemplateCell) au2S19S0200000_12.l0).M().getState().LJLILLLLZI;
            String str2 = rootData.roomId;
            String str3 = rootData.authorId;
            boolean z = rootData.isNewUser;
            String templateId = ((TemplateItem) au2S19S0200000_12.l1).getTemplateId();
            int type = ((TemplateItem) au2S19S0200000_12.l1).getType();
            boolean LJJJLZIJ = ((TemplateItem) au2S19S0200000_12.l1).LJJJLZIJ();
            String L = rootData.L();
            int i = rootData.templateEntryType;
            List<TemplateDecoration> LLILIL = ((TemplateItem) au2S19S0200000_12.l1).LLILIL();
            if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
                str = templateDecorationTitle.text;
            }
            S5F.LJ(type, i, str2, str3, "template_cancel", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
        }
    }

    public static final void LIZ$34(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        LifecycleOwner currentLifeCycleOwner;
        S6R s6r;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view == null || (currentLifeCycleOwner = ((DiscountTemplateCell) au2S19S0200000_12.l0).getCurrentLifeCycleOwner()) == null) {
            return;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        String str = null;
        if (LJIIIZ instanceof BillboardTemplateFragment) {
            s6r = ((BillboardTemplateFragment) LJIIIZ).LJLIL;
        } else {
            s6r = null;
        }
        S7F.LIZ(currentLifeCycleOwner, (DiscountTemplateItem) au2S19S0200000_12.l1, (DiscountTemplateCell) au2S19S0200000_12.l0, s6r);
        RootData rootData = ((DiscountTemplateCell) au2S19S0200000_12.l0).M().getState().LJLILLLLZI;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        boolean z = rootData.isNewUser;
        String templateId = ((DiscountTemplateItem) au2S19S0200000_12.l1).getTemplateId();
        int type = ((DiscountTemplateItem) au2S19S0200000_12.l1).getType();
        boolean LJJJLZIJ = ((DiscountTemplateItem) au2S19S0200000_12.l1).LJJJLZIJ();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        List<TemplateDecoration> LLILIL = ((DiscountTemplateItem) au2S19S0200000_12.l1).LLILIL();
        if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        }
        S5F.LJ(type, i, str2, str3, "template_edit", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
    }

    public static final void LIZ$35(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            RootData rootData = ((S6S) ((AssemViewModel) ((ImageCell) au2S19S0200000_12.l0).LJLILLLLZI.getValue()).getState()).LJLILLLLZI;
            String str = rootData.roomId;
            String str2 = rootData.authorId;
            boolean z = rootData.isNewUser;
            S5F.LJFF(rootData.templateEntryType, str, str2, "photo_delete", rootData.L(), z);
            ImageCell imageCell = (ImageCell) au2S19S0200000_12.l0;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            AqS159S0200000_12 aqS159S0200000_12 = new AqS159S0200000_12((ImageCell) au2S19S0200000_12.l0, (ImageItem) au2S19S0200000_12.l1, 62);
            imageCell.getClass();
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.q1k);
            c26227ARb.LIZ(R.string.exj);
            UC0.LIZJ(c26227ARb, new AqS172S0100000_6(aqS159S0200000_12, 80));
            c26227ARb.LJII = true;
            c26227ARb.LJI().LIZLLL();
        }
    }

    public static final void LIZ$36(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ImageListViewModel imageListViewModel = (ImageListViewModel) ((ImageCell) au2S19S0200000_12.l0).LJLIL.getValue();
            ImageItem item = (ImageItem) au2S19S0200000_12.l1;
            o.LJIIIZ(item, "item");
            XKX.LIZLLL(ViewModelKt.getViewModelScope(imageListViewModel), C36576EXc.LIZJ, null, new C71538S5u(imageListViewModel, item, null), 2);
            RootData rootData = ((S6S) ((AssemViewModel) ((ImageCell) au2S19S0200000_12.l0).LJLILLLLZI.getValue()).getState()).LJLILLLLZI;
            String str = rootData.roomId;
            String str2 = rootData.authorId;
            boolean z = rootData.isNewUser;
            S5F.LJFF(rootData.templateEntryType, str, str2, "photo_cancel", rootData.L(), z);
        }
    }

    public static final void LIZ$37(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ImageListViewModel imageListViewModel = (ImageListViewModel) ((ImageCell) au2S19S0200000_12.l0).LJLIL.getValue();
            ImageItem item = (ImageItem) au2S19S0200000_12.l1;
            o.LJIIIZ(item, "item");
            XKX.LIZLLL(ViewModelKt.getViewModelScope(imageListViewModel), C36576EXc.LIZJ, null, new C71543S5z(item, imageListViewModel, null, false), 2);
            RootData rootData = ((S6S) ((AssemViewModel) ((ImageCell) au2S19S0200000_12.l0).LJLILLLLZI.getValue()).getState()).LJLILLLLZI;
            String str = rootData.roomId;
            String str2 = rootData.authorId;
            boolean z = rootData.isNewUser;
            S5F.LJFF(rootData.templateEntryType, str, str2, "photo_display", rootData.L(), z);
        }
    }

    public static final void LIZ$38(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        LifecycleOwner currentLifeCycleOwner;
        S6R s6r;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view == null || (currentLifeCycleOwner = ((MultiTextTemplateCell) au2S19S0200000_12.l0).getCurrentLifeCycleOwner()) == null) {
            return;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        String str = null;
        if (LJIIIZ instanceof BillboardTemplateFragment) {
            s6r = ((BillboardTemplateFragment) LJIIIZ).LJLIL;
        } else {
            s6r = null;
        }
        S7F.LIZ(currentLifeCycleOwner, (MultiTextTemplateItem) au2S19S0200000_12.l1, (MultiTextTemplateCell) au2S19S0200000_12.l0, s6r);
        RootData rootData = ((MultiTextTemplateCell) au2S19S0200000_12.l0).M().getState().LJLILLLLZI;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        boolean z = rootData.isNewUser;
        String templateId = ((MultiTextTemplateItem) au2S19S0200000_12.l1).getTemplateId();
        int type = ((MultiTextTemplateItem) au2S19S0200000_12.l1).getType();
        boolean LJJJLZIJ = ((MultiTextTemplateItem) au2S19S0200000_12.l1).LJJJLZIJ();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        List<TemplateDecoration> LLILIL = ((MultiTextTemplateItem) au2S19S0200000_12.l1).LLILIL();
        if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        }
        S5F.LJ(type, i, str2, str3, "template_edit", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
    }

    public static final void LIZ$39(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        LifecycleOwner currentLifeCycleOwner;
        S6R s6r;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view == null || (currentLifeCycleOwner = ((ProductTemplateCell) au2S19S0200000_12.l0).getCurrentLifeCycleOwner()) == null) {
            return;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        String str = null;
        if (LJIIIZ instanceof BillboardTemplateFragment) {
            s6r = ((BillboardTemplateFragment) LJIIIZ).LJLIL;
        } else {
            s6r = null;
        }
        S7F.LIZ(currentLifeCycleOwner, (ProductTemplateItem) au2S19S0200000_12.l1, (ProductTemplateCell) au2S19S0200000_12.l0, s6r);
        RootData rootData = ((ProductTemplateCell) au2S19S0200000_12.l0).M().getState().LJLILLLLZI;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        boolean z = rootData.isNewUser;
        String templateId = ((ProductTemplateItem) au2S19S0200000_12.l1).getTemplateId();
        int type = ((ProductTemplateItem) au2S19S0200000_12.l1).getType();
        boolean LJJJLZIJ = ((ProductTemplateItem) au2S19S0200000_12.l1).LJJJLZIJ();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        List<TemplateDecoration> LLILIL = ((ProductTemplateItem) au2S19S0200000_12.l1).LLILIL();
        if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        }
        S5F.LJ(type, i, str2, str3, "template_edit", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
    }

    public static final void LIZ$4(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            AI2 ai2 = (AI2) au2S19S0200000_12.l0;
            ai2.LJIILIIL(!ai2.LJIIL());
            ((C71759SEh) au2S19S0200000_12.l1).setUseShippingAddress(ai2.LJIIL());
            ((C71759SEh) au2S19S0200000_12.l1).getOnUseShippingAddressChange().invoke(Boolean.valueOf(ai2.LJIIL()));
            ((C71759SEh) au2S19S0200000_12.l1).setAllElementsVisible(!ai2.LJIIL());
        }
    }

    public static final void LIZ$40(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        LifecycleOwner currentLifeCycleOwner;
        S6R s6r;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view == null || (currentLifeCycleOwner = ((SingleTextTemplateCell) au2S19S0200000_12.l0).getCurrentLifeCycleOwner()) == null) {
            return;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        String str = null;
        if (LJIIIZ instanceof BillboardTemplateFragment) {
            s6r = ((BillboardTemplateFragment) LJIIIZ).LJLIL;
        } else {
            s6r = null;
        }
        S7F.LIZ(currentLifeCycleOwner, (SingleTextTemplateItem) au2S19S0200000_12.l1, (SingleTextTemplateCell) au2S19S0200000_12.l0, s6r);
        RootData rootData = ((SingleTextTemplateCell) au2S19S0200000_12.l0).M().getState().LJLILLLLZI;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        boolean z = rootData.isNewUser;
        String templateId = ((SingleTextTemplateItem) au2S19S0200000_12.l1).getTemplateId();
        int type = ((SingleTextTemplateItem) au2S19S0200000_12.l1).getType();
        boolean LJJJLZIJ = ((SingleTextTemplateItem) au2S19S0200000_12.l1).LJJJLZIJ();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        List<TemplateDecoration> LLILIL = ((SingleTextTemplateItem) au2S19S0200000_12.l1).LLILIL();
        if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        }
        S5F.LJ(type, i, str2, str3, "template_edit", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
    }

    public static final void LIZ$41(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        LifecycleOwner currentLifeCycleOwner;
        S6R s6r;
        TemplateDecoration templateDecoration;
        TemplateDecorationTitle templateDecorationTitle;
        if (view == null || (currentLifeCycleOwner = ((SizeChartTemplateCell) au2S19S0200000_12.l0).getCurrentLifeCycleOwner()) == null) {
            return;
        }
        Fragment LJIIIZ = C79234V7u.LJIIIZ(view);
        String str = null;
        if (LJIIIZ instanceof BillboardTemplateFragment) {
            s6r = ((BillboardTemplateFragment) LJIIIZ).LJLIL;
        } else {
            s6r = null;
        }
        S7F.LIZ(currentLifeCycleOwner, (SizeChartTemplateItem) au2S19S0200000_12.l1, (SizeChartTemplateCell) au2S19S0200000_12.l0, s6r);
        RootData rootData = ((SizeChartTemplateCell) au2S19S0200000_12.l0).M().getState().LJLILLLLZI;
        String str2 = rootData.roomId;
        String str3 = rootData.authorId;
        boolean z = rootData.isNewUser;
        String templateId = ((SizeChartTemplateItem) au2S19S0200000_12.l1).getTemplateId();
        int type = ((SizeChartTemplateItem) au2S19S0200000_12.l1).getType();
        boolean LJJJLZIJ = ((SizeChartTemplateItem) au2S19S0200000_12.l1).LJJJLZIJ();
        String L = rootData.L();
        int i = rootData.templateEntryType;
        List<TemplateDecoration> LLILIL = ((SizeChartTemplateItem) au2S19S0200000_12.l1).LLILIL();
        if (LLILIL != null && (templateDecoration = (TemplateDecoration) ORZ.LJLLLLLL(0, LLILIL)) != null && (templateDecorationTitle = templateDecoration.decorationTitle) != null) {
            str = templateDecorationTitle.text;
        }
        S5F.LJ(type, i, str2, str3, "template_edit", templateId, L, z, LJJJLZIJ, C78685UuP.LJJJZ(str));
    }

    public static final void LIZ$42(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ(((C70732RpQ) au2S19S0200000_12.l0).LJLIL), new AqS101S0300000_12((C70732RpQ) au2S19S0200000_12.l0, view, (C69698RXa) au2S19S0200000_12.l1, 5));
        }
    }

    public static final void LIZ$43(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ(((C70732RpQ) au2S19S0200000_12.l0).LJLIL), new AqS101S0300000_12((C70732RpQ) au2S19S0200000_12.l0, view, (C69698RXa) au2S19S0200000_12.l1, 6));
        }
    }

    public static final void LIZ$44(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ(((C70731RpP) au2S19S0200000_12.l0).LJLIL), new AqS101S0300000_12((C70731RpP) au2S19S0200000_12.l0, view, (C69698RXa) au2S19S0200000_12.l1, 7));
        }
    }

    public static final void LIZ$45(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ(((C70731RpP) au2S19S0200000_12.l0).LJLIL), new AqS101S0300000_12((C70731RpP) au2S19S0200000_12.l0, view, (C69698RXa) au2S19S0200000_12.l1, 8));
        }
    }

    public static final void LIZ$46(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            SmartRouter.buildRoute(((TuxTextView) au2S19S0200000_12.l0).getContext(), ((C69698RXa) au2S19S0200000_12.l1).LJIILL).open();
        }
    }

    public static final void LIZ$47(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        Object obj;
        Context context;
        if (view != null) {
            PdpMainViewModel M = ((SellerInfoBrickVH) au2S19S0200000_12.l0).M();
            View view2 = ((SellerInfoBrickVH) au2S19S0200000_12.l0).itemView;
            SellerInfoBizData LIZ = ((SellerInfoBrickVO) au2S19S0200000_12.l1).LIZ();
            Object obj2 = null;
            if (LIZ != null && (str = LIZ.shopLink) != null) {
                Map<String, ? extends Object> map = M.iv0().LJLJJI;
                if (map != null) {
                    obj = map.get("author_id");
                } else {
                    obj = null;
                }
                Map<String, ? extends Object> map2 = M.iv0().LJLJJI;
                if (map2 != null) {
                    obj2 = map2.get("source_content_id");
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (obj != null) {
                    linkedHashMap2.put("author_id", obj);
                }
                if (obj2 != null) {
                    linkedHashMap2.put("source_content_id", obj2);
                }
                linkedHashMap.put("trackParams", linkedHashMap2);
                if (view2 != null && (context = view2.getContext()) != null) {
                    C26867AgZ.LIZIZ(context, str, linkedHashMap, false).open();
                    return;
                }
                return;
            }
            M.getClass();
        }
    }

    public static final void LIZ$48(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        Context context;
        if (view != null) {
            View view2 = ((SellerInfoBrickVH) au2S19S0200000_12.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS178S0100000_12((SellerInfoBrickVH) au2S19S0200000_12.l0, 465));
            PdpMainViewModel M = ((SellerInfoBrickVH) au2S19S0200000_12.l0).M();
            View view3 = ((SellerInfoBrickVH) au2S19S0200000_12.l0).itemView;
            SellerInfoBizData LIZ = ((SellerInfoBrickVO) au2S19S0200000_12.l1).LIZ();
            if (LIZ != null) {
                str = LIZ.sellerLink;
            } else {
                str = null;
            }
            M.getClass();
            if (str != null && view3 != null && (context = view3.getContext()) != null) {
                C26867AgZ.LIZIZ(context, str, new LinkedHashMap(), false).open();
            }
        }
    }

    public static final void LIZ$49(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            SkuBrickVH skuBrickVH = (SkuBrickVH) au2S19S0200000_12.l0;
            if (skuBrickVH.LJLJLLL != -1) {
                skuBrickVH.itemView.findViewById(R.id.jlb).setVisibility(0);
                Image image = ((SkuBrickVO) au2S19S0200000_12.l1).productFirstImage;
                if (image != null) {
                    ((SkuBrickVH) au2S19S0200000_12.l0).i0(new ImageSelectData(image, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.PRODUCT, -1), null);
                }
            }
        }
    }

    public static final void LIZ$5(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            EditText editText = ((C71731SDf) au2S19S0200000_12.l0).getEditText();
            Object LLILL = C16880lQ.LLILL(((SD2) au2S19S0200000_12.l1).LIZIZ(R.id.bt5).getContext(), "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            editText.requestFocus();
            ((InputMethodManager) LLILL).showSoftInput(editText, 0);
        }
    }

    public static final void LIZ$50(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        Object obj;
        if (view != null && !((S4W) au2S19S0200000_12.l0).LIZIZ()) {
            int LJZ = ORZ.LJZ(view, ((S4U) au2S19S0200000_12.l1).LJI);
            String optionName = ((S4W) au2S19S0200000_12.l0).getReason().reasonKey;
            HashMap<String, Object> generalParams = ((S4U) au2S19S0200000_12.l1).LJ;
            Boolean bool = Boolean.FALSE;
            o.LJIIIZ(optionName, "optionName");
            o.LJIIIZ(generalParams, "generalParams");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C27949Ay1.LIZIZ);
            linkedHashMap.put("page_name", "quit_pay_reason");
            if (bool != null) {
                linkedHashMap.put("is_fullscreen", 0);
            }
            linkedHashMap.put("option_type", "quit_pay_reason");
            linkedHashMap.put("rank", Integer.valueOf(LJZ));
            linkedHashMap.put("option_name", optionName);
            linkedHashMap.putAll(generalParams);
            C76542zS.LIZ("tiktokec_select_option", linkedHashMap);
            S4U s4u = (S4U) au2S19S0200000_12.l1;
            s4u.LJIIJ = true;
            s4u.LIZIZ();
            Iterator it = ((ArrayList) ((S4U) au2S19S0200000_12.l1).LJI).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((S4W) obj).getReason().reasonKey, ((S4U) au2S19S0200000_12.l1).LJIIIIZZ)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            S4W s4w = (S4W) obj;
            if (s4w != null) {
                s4w.setChecked(false);
            }
            ((S4W) au2S19S0200000_12.l0).setChecked(true);
            ((S4U) au2S19S0200000_12.l1).LJIIIIZZ = ((S4W) au2S19S0200000_12.l0).getReason().reasonKey;
        }
    }

    public static final void LIZ$51(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            PdpSkuHolderV2 pdpSkuHolderV2 = (PdpSkuHolderV2) au2S19S0200000_12.l0;
            if (pdpSkuHolderV2.LJLJJI != -1) {
                pdpSkuHolderV2.itemView.findViewById(R.id.jlb).setVisibility(0);
                Image image = ((RX8) au2S19S0200000_12.l1).LIZIZ;
                if (image != null) {
                    ((PdpSkuHolderV2) au2S19S0200000_12.l0).V(new ImageSelectData(image, EnumC70012Rdo.SKU_ENTRANCE, EnumC70107RfL.PRODUCT, -1), null);
                    View view2 = ((PdpSkuHolderV2) au2S19S0200000_12.l0).itemView;
                    C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((RX8) au2S19S0200000_12.l1, 1129));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$52(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        o.LJIIIZ(view, "view");
        TAS tas = (TAS) au2S19S0200000_12.l0;
        Effect effect = (Effect) tas.LJLIL;
        if (effect == null) {
            return;
        }
        OSZ[] oszArr = new OSZ[7];
        oszArr[0] = new OSZ("creation_id", tas.LJLL.LJI());
        oszArr[1] = new OSZ("enter_from", tas.LJLL.enterFrom);
        String str = tas.LJLL.shootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        oszArr[2] = new OSZ("shoot_way", str);
        String id = effect.getId();
        if (id == null) {
            id = "";
        }
        oszArr[3] = new OSZ("template_id", id);
        String name = effect.getName();
        if (name != null) {
            str2 = name;
        }
        oszArr[4] = new OSZ("template_name", str2);
        oszArr[5] = new OSZ("is_existing_effect", CardStruct.IStatusCode.DEFAULT);
        oszArr[6] = new OSZ("is_pro_template", "1");
        C78880UxY.LJJLIIIJL("click_mobile_effect_template", C113554cx.LJJL(oszArr));
        TAS tas2 = (TAS) au2S19S0200000_12.l0;
        tas2.LJLLI.invoke(effect, Integer.valueOf(tas2.getAdapterPosition()), Integer.valueOf(((TAS) au2S19S0200000_12.l0).LJLILLLLZI));
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C74284TDk.LIZ(context, (TEZ) au2S19S0200000_12.l1, effect, ((TAS) au2S19S0200000_12.l0).LJLL);
    }

    public static final void LIZ$53(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        if (view != null) {
            C70691Rol c70691Rol = ((ReviewFragment) au2S19S0200000_12.l0).xl().LJLLILLLL;
            if (c70691Rol != null) {
                ReviewFragment node = (ReviewFragment) au2S19S0200000_12.l0;
                o.LJIIIZ(node, "node");
                C78946Uyc.LJJII(node, new C70917RsP(), new AqS178S0100000_12(c70691Rol, 605));
            }
            ReviewFragment reviewFragment = (ReviewFragment) au2S19S0200000_12.l0;
            int intValue = ((Number) reviewFragment.withState(reviewFragment.xl(), C70736RpU.LJLIL)).intValue();
            if (intValue == 1) {
                str = "relevance";
            } else {
                str = "most_recent";
            }
            FragmentManager fragmentManager = ((ReviewFragment) au2S19S0200000_12.l0).getFragmentManager();
            if (fragmentManager != null) {
                OptionPickerDialogFragment LIZ = C70836Rr6.LIZ(fragmentManager, ((ReviewFragment) au2S19S0200000_12.l0).getString(R.string.f_l), (ArrayList) au2S19S0200000_12.l1, String.valueOf(intValue), true);
                LIZ.LJLJL = new AqS87S1100000_12((ReviewFragment) au2S19S0200000_12.l0, str, 1);
                LIZ.LJLJJLL = new AqS87S1100000_12((ReviewFragment) au2S19S0200000_12.l0, str, 2);
                LIZ.LJLJLLL = new AqS65S1100000_12((ReviewFragment) au2S19S0200000_12.l0, str, 11);
                LIZ.LJLL = new C70799RqV((ReviewFragment) au2S19S0200000_12.l0, str);
            }
        }
    }

    public static final void LIZ$54(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        String str;
        if (view != null) {
            C70691Rol c70691Rol = ((ReviewFragmentV1) au2S19S0200000_12.l0).Al().LJLLILLLL;
            if (c70691Rol != null) {
                ReviewFragmentV1 node = (ReviewFragmentV1) au2S19S0200000_12.l0;
                o.LJIIIZ(node, "node");
                C78946Uyc.LJJII(node, new C70917RsP(), new AqS178S0100000_12(c70691Rol, 605));
            }
            ReviewFragmentV1 reviewFragmentV1 = (ReviewFragmentV1) au2S19S0200000_12.l0;
            int intValue = ((Number) reviewFragmentV1.withState(reviewFragmentV1.Al(), C70737RpV.LJLIL)).intValue();
            if (intValue == 1) {
                str = "relevance";
            } else {
                str = "most_recent";
            }
            FragmentManager fragmentManager = ((ReviewFragmentV1) au2S19S0200000_12.l0).getFragmentManager();
            if (fragmentManager != null) {
                OptionPickerDialogFragmentV1 LIZ = C70837Rr7.LIZ(fragmentManager, ((ReviewFragmentV1) au2S19S0200000_12.l0).getString(R.string.f_l), (ArrayList) au2S19S0200000_12.l1, String.valueOf(intValue), String.valueOf(intValue));
                LIZ.LJLJL = new IDqS436S0100000_12((ReviewFragmentV1) au2S19S0200000_12.l0, 34);
                LIZ.LJLJLLL = new AqS65S1100000_12((ReviewFragmentV1) au2S19S0200000_12.l0, str, 13);
                LIZ.LJLL = new C70800RqW((ReviewFragmentV1) au2S19S0200000_12.l0, str);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01be, code lost:
    
        if (r2 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$55(com.ss.android.ugc.aweme.utils.Au2S19S0200000_12 r25, android.view.View r26) {
        /*
            Method dump skipped, instructions count: 866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S19S0200000_12.LIZ$55(com.ss.android.ugc.aweme.utils.Au2S19S0200000_12, android.view.View):void");
    }

    public static final void LIZ$56(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        TTMInfo ttmInfo;
        TTMBrand brand;
        Fragment LJIIIZ;
        FragmentManager childFragmentManager;
        TTMInfo ttmInfo2;
        String vipVerificationSchema;
        SV5 sv5 = (SV5) au2S19S0200000_12.l0;
        VideoItemParams videoItemParams = (VideoItemParams) au2S19S0200000_12.l1;
        if (view == null) {
            return;
        }
        MusicInfo invoke = sv5.LJI.invoke();
        String str = "";
        if (invoke != null) {
            invoke.setClickSource("click_source_icon");
            String aid = videoItemParams.getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            MusicDetailService.LJIJJ().LJ(String.valueOf(videoItemParams.getAweme().getMusic().getId()), aid);
            IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
            invoke.getProduct();
            String trackId = invoke.getTrackId();
            String clipId = invoke.getClipId();
            String requestId = invoke.getRequestId();
            Map<String, String> logExtraMap = invoke.getLogExtraMap();
            boolean isPgc = invoke.isPgc();
            o.LJIIIIZZ(LJIJJ, "getService(IMusicDetailService::class.java)");
            LJIJJ.LJIILLIIL(trackId, clipId, aid, requestId, logExtraMap, isPgc);
        }
        if (sv5.LJFF.invoke(videoItemParams).booleanValue() && (ttmInfo = videoItemParams.getAweme().getTtmInfo()) != null && (brand = ttmInfo.getBrand()) != null && brand.isUX1()) {
            Aweme aweme = videoItemParams.getAweme();
            if (aweme == null || (ttmInfo2 = aweme.getTtmInfo()) == null || (vipVerificationSchema = ttmInfo2.getVipVerificationSchema()) == null || vipVerificationSchema.length() == 0) {
                if (invoke == null || (LJIIIZ = C55096Ljo.LJIIIZ(sv5.LIZ)) == null || (childFragmentManager = LJIIIZ.getChildFragmentManager()) == null) {
                    return;
                }
                IMusicDetailService LJIJJ2 = MusicDetailService.LJIJJ();
                String str2 = videoItemParams.mEventType;
                if (str2 != null) {
                    str = str2;
                }
                LJIJJ2.LJIJ(childFragmentManager, invoke, str, "brand_icon", "click_icon");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("music_info", invoke);
            String str3 = videoItemParams.mEventType;
            if (str3 != null) {
                str = str3;
            }
            MG0.LIZ(sv5.LIZ.getContext(), vipVerificationSchema, C44140HUa.LIZ(str, "click_icon", videoItemParams.getAweme().getRequestId(), UUID.randomUUID().toString()), bundle);
            return;
        }
        VideoMusicBaseVM z4 = sv5.LIZ.z4();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        VideoMusicBaseVM.mv0(z4, context, view.getId(), false, null, sv5.LJII.invoke().booleanValue(), 28);
    }

    public static final void LIZ$57(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        InterfaceC70291RiJ interfaceC70291RiJ;
        if (view != null && (interfaceC70291RiJ = ((C70287RiF) au2S19S0200000_12.l0).LJLILLLLZI) != null) {
            interfaceC70291RiJ.onSizeGuideClick((SizeGuide) au2S19S0200000_12.l1);
        }
    }

    public static final void LIZ$58(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            AssemViewModel assemViewModel = (AssemViewModel) ((SubPaymentViewHolder) au2S19S0200000_12.l0).LJLIL.getValue();
            PaymentMethod checkedSubPaymentMethod = ((C71767SEp) au2S19S0200000_12.l1).LJLILLLLZI;
            o.LJIIIZ(checkedSubPaymentMethod, "checkedSubPaymentMethod");
            assemViewModel.setState(new AqS178S0100000_12(checkedSubPaymentMethod, 718));
            C2U8.LIZ(new C46536IOe((C71767SEp) au2S19S0200000_12.l1));
        }
    }

    public static final void LIZ$6(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S19S0200000_12.l0;
            C70470RlC c70470RlC = (C70470RlC) pdpCouponsViewHolder.itemView.findViewById(R.id.fox);
            o.LJIIIIZZ(c70470RlC, "itemView.left_item");
            pdpCouponsViewHolder.onButtonClick(pdpCouponsViewHolder.getVoucherByView(c70470RlC), (EnumC70477RlJ) au2S19S0200000_12.l1);
        }
    }

    public static final void LIZ$7(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S19S0200000_12.l0;
            C70470RlC c70470RlC = (C70470RlC) pdpCouponsViewHolder.itemView.findViewById(R.id.j2j);
            o.LJIIIIZZ(c70470RlC, "itemView.right_item");
            pdpCouponsViewHolder.onButtonClick(pdpCouponsViewHolder.getVoucherByView(c70470RlC), (EnumC70477RlJ) au2S19S0200000_12.l1);
        }
    }

    public static final void LIZ$8(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S19S0200000_12.l0;
            C70470RlC c70470RlC = (C70470RlC) pdpCouponsViewHolder.itemView.findViewById(R.id.had);
            o.LJIIIIZZ(c70470RlC, "itemView.one_item");
            pdpCouponsViewHolder.onButtonClick(pdpCouponsViewHolder.getVoucherByView(c70470RlC), (EnumC70477RlJ) au2S19S0200000_12.l1);
        }
    }

    public static final void LIZ$9(Au2S19S0200000_12 au2S19S0200000_12, View view) {
        if (view != null) {
            ((PdpCouponsViewHolder) au2S19S0200000_12.l0).onBodyClick((Voucher) au2S19S0200000_12.l1);
        }
    }

    public Au2S19S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S19S0200000_12(Object obj, Object obj2, int i, int i2) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
