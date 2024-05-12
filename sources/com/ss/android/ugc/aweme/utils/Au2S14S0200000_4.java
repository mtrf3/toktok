package com.ss.android.ugc.aweme.utils;

import X.AbstractC27419ApT;
import X.ActivityC45651qj;
import X.B1J;
import X.B1K;
import X.B1R;
import X.C113554cx;
import X.C16880lQ;
import X.C1A8;
import X.C221108m2;
import X.C252989wM;
import X.C26227ARb;
import X.C26430AYw;
import X.C26548AbQ;
import X.C26563Abf;
import X.C26566Abi;
import X.C26658AdC;
import X.C26669AdN;
import X.C26685Add;
import X.C26785AfF;
import X.C26786AfG;
import X.C26804AfY;
import X.C26836Ag4;
import X.C26839Ag7;
import X.C26847AgF;
import X.C26867AgZ;
import X.C27051AjX;
import X.C27057Ajd;
import X.C27129Akn;
import X.C27130Ako;
import X.C27416ApQ;
import X.C27420ApU;
import X.C27422ApW;
import X.C27513Aqz;
import X.C27516Ar2;
import X.C27574Ary;
import X.C27575Arz;
import X.C27739Aud;
import X.C27857AwX;
import X.C27949Ay1;
import X.C28003Ayt;
import X.C32151Nz;
import X.C3AW;
import X.C61447O9r;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70414RkI;
import X.C70889Rrx;
import X.C70917RsP;
import X.C70919RsR;
import X.C71731SDf;
import X.C76542zS;
import X.C76732zl;
import X.C76800UCe;
import X.C77125UOr;
import X.C77857Uh3;
import X.C78565UsT;
import X.C78685UuP;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78948Uye;
import X.C79234V7u;
import X.InterfaceC26837Ag5;
import X.InterfaceC36571c5;
import X.InterfaceC71003Rtn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.M2D;
import X.MBB;
import X.O6R;
import X.O9C;
import X.OUR;
import X.RX8;
import X.TAT;
import X.UC0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ShippingTextInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.address.AddressViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.UnreachableExpend;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary.SummaryVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.common.PdpSelectViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpMallFlashSalePromotionViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionResourceBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.rank.PdpRankHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryServiceViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v2.PdpSkuHolderV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPLogisticModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPShippingModule;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.RankInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.LogisticsBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.ReturnPolicyBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.CheckoutLink;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.LogisticBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.LogisticBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBizData;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.ReturnPolicyBrickVO;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.adapter.RegionAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspAsyncInflateSettings;
import com.ss.android.ugc.aweme.ecommerce.core.view.PdpUserRightSheetItemView;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.address.GlobalAddressVH;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.payment.GlobalPaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.shop.GlobalShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.global.osp.subpage.GlobalMessageEditDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.common.GlobalPdpSelectVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.productprop.ProductPropVO;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.productprop.TTFProductPropVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.review.GlobalShopReviewTitleVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.GlobalShippingVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.TtfUkShippingVH;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.promotion.UsSellerPromotionVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.returnpolicy.UsReturnPolicyVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpReviewTitleVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shipping.UsShippingVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.address.USAddressVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.payment.USPaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.unreachable.USUnreachableExpend;
import com.ss.android.ugc.aweme.ecommerce.us.osp.subpage.USMessageEditPanelFragment;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.IDqS183S0200000_4;
import kotlin.jvm.internal.IDqS429S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S14S0200000_4 extends TAT {
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
            case 59:
                LIZ$59(this, view);
                return;
            case 60:
                LIZ$60(this, view);
                return;
            case 61:
                LIZ$61(this, view);
                return;
            case BaseNotice.CREATOR /* 62 */:
                LIZ$62(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            EditText editText = ((C71731SDf) ((C252989wM) au2S14S0200000_4.l0).LIZIZ(R.id.eod)).getEditText();
            Object LLILL = C16880lQ.LLILL(((TextInputHelper) au2S14S0200000_4.l1).targetView.getContext(), "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            editText.requestFocus();
            ((InputMethodManager) LLILL).showSoftInput(editText, 0);
        }
    }

    public static final void LIZ$1(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            EditText editText = ((C71731SDf) ((C252989wM) au2S14S0200000_4.l0).LIZIZ(R.id.eod)).getEditText();
            Object LLILL = C16880lQ.LLILL(((com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper) au2S14S0200000_4.l1).targetView.getContext(), "input_method");
            o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            editText.requestFocus();
            ((InputMethodManager) LLILL).showSoftInput(editText, 0);
        }
    }

    public static final void LIZ$10(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            DistrictFragment districtFragment = (DistrictFragment) au2S14S0200000_4.l0;
            District district = districtFragment.LJLL;
            if (district != null) {
                districtFragment.getClass();
                ArrayList arrayList = new ArrayList();
                List<District> list = district.parRegions;
                if (list != null) {
                    for (District district2 : list) {
                        arrayList.add(new Region(district2.name, district2.geoNameId, district2.code, null, district2.longitude, district2.latitude, 8, null));
                    }
                }
                arrayList.add(new Region(district.name, district.geoNameId, district.code, null, district.longitude, district.latitude, 8, null));
                districtFragment.xl().invoke(arrayList);
            }
            C78946Uyc.LJJIIJ((View) au2S14S0200000_4.l1, new C70917RsP(), new AqS170S0100000_4((DistrictFragment) au2S14S0200000_4.l0, 331));
        }
    }

    public static final void LIZ$11(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            ((PdpUserRightSheetItemView) au2S14S0200000_4.l0).hideDesc((View) au2S14S0200000_4.l1);
        }
    }

    public static final void LIZ$12(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            ((PdpUserRightSheetItemView) au2S14S0200000_4.l0).expandDesc((View) au2S14S0200000_4.l1);
        }
    }

    public static final void LIZ$13(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            ((GlobalPdpSelectVH) au2S14S0200000_4.l0).onClick((InterfaceC26837Ag5) au2S14S0200000_4.l1, view);
        }
    }

    public static final void LIZ$14(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            FragmentManager childFragmentManager = ((GlobalShippingVH) au2S14S0200000_4.l0).fragment.getChildFragmentManager();
            ShippingDialogDto shippingDialogDto = ((ShippingTextInfo) au2S14S0200000_4.l1).shippingDialogDto;
            View itemView = ((GlobalShippingVH) au2S14S0200000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C27130Ako.LIZ(childFragmentManager, shippingDialogDto, C78948Uye.LJIILIIL(itemView));
        }
    }

    public static final void LIZ$15(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            FragmentManager childFragmentManager = ((TtfUkShippingVH) au2S14S0200000_4.l0).fragment.getChildFragmentManager();
            ShippingDialogDto shippingDialogDto = ((ShippingTextInfo) au2S14S0200000_4.l1).shippingDialogDto;
            View itemView = ((TtfUkShippingVH) au2S14S0200000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C27130Ako.LIZ(childFragmentManager, shippingDialogDto, C78948Uye.LJIILIIL(itemView));
        }
    }

    public static final void LIZ$16(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            FragmentManager childFragmentManager = ((TtfUkShippingVH) au2S14S0200000_4.l0).fragment.getChildFragmentManager();
            ShippingDialogDto shippingDialogDto = ((ShippingTextInfo) au2S14S0200000_4.l1).shippingDialogDto;
            View itemView = ((TtfUkShippingVH) au2S14S0200000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C27130Ako.LIZ(childFragmentManager, shippingDialogDto, C78948Uye.LJIILIIL(itemView));
        }
    }

    public static final void LIZ$17(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            PdpViewModel pdpViewModel = (PdpViewModel) ((PdpMallFlashSalePromotionViewHolder) au2S14S0200000_4.l0).LJLJJL.getValue();
            o.LJIIIIZZ(view.getContext(), "it.context");
            ((C26430AYw) au2S14S0200000_4.l1).getClass();
            pdpViewModel.getClass();
            C70414RkI c70414RkI = pdpViewModel.LLFII;
            if (c70414RkI != null) {
                if (C26847AgF.LIZ()) {
                    C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70919RsR(), new AqS170S0100000_4(c70414RkI, 1548));
                } else {
                    C76542zS.LJ("tiktokec_module_click", new AqS170S0100000_4(c70414RkI, 1549));
                }
            }
        }
    }

    public static final void LIZ$18(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        IPdpStarter.PdpEnterParam pdpEnterParam;
        HashMap<String, Object> trackParams;
        if (view != null) {
            TTFProductPropVH tTFProductPropVH = (TTFProductPropVH) au2S14S0200000_4.l0;
            ProductPropVO productPropVO = (ProductPropVO) au2S14S0200000_4.l1;
            tTFProductPropVH.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C70414RkI c70414RkI = ((PdpViewModel) tTFProductPropVH.LJLIL.getValue()).LLFII;
            if (c70414RkI != null && (pdpEnterParam = c70414RkI.LIZ) != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                linkedHashMap.putAll(trackParams);
            }
            linkedHashMap.put("previous_page", "product_detail");
            Context context = tTFProductPropVH.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            M2D m2d = new M2D();
            m2d.LIZ = TemplateData.LJFF(C27739Aud.LJI(productPropVO));
            String str = productPropVO.LIZ;
            if (str == null) {
                str = "";
            }
            m2d.LJIILLIIL = str;
            m2d.LIZIZ(C27739Aud.LJI(linkedHashMap), "track_params");
            O9C.LIZJ(context, m2d);
            View view2 = tTFProductPropVH.itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), C27574Ary.LJLIL);
        }
    }

    public static final void LIZ$19(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        int i;
        HashMap<String, Object> trackParams;
        if (view != null) {
            HashMap hashMap = new HashMap();
            String str = ((RankInfo) au2S14S0200000_4.l0).tpp;
            if (str != null && !ujb.o.LJJJJJL(str)) {
                hashMap.put("ranking_name", str);
            }
            String str2 = ((RankInfo) au2S14S0200000_4.l0).rankId;
            if (str2 != null && !ujb.o.LJJJJJL(str2)) {
                hashMap.put("ranking_id", str2);
            }
            Integer num = ((RankInfo) au2S14S0200000_4.l0).rankLevelNum;
            if (num != null) {
                hashMap.put("ranking_num", Integer.valueOf(num.intValue()));
            }
            String str3 = ((RankInfo) au2S14S0200000_4.l0).schema;
            if (str3 == null || ujb.o.LJJJJJL(str3)) {
                i = 1;
            } else {
                i = 0;
            }
            hashMap.put("is_clickable", Integer.valueOf(i ^ 1));
            C70414RkI c70414RkI = ((PdpViewModel) ((PdpRankHolder) au2S14S0200000_4.l1).LJLIL.getValue()).LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, "product_ranking", null, null, hashMap, 22);
            }
            String str4 = ((RankInfo) au2S14S0200000_4.l0).schema;
            if (str4 == null || ujb.o.LJJJJJL(str4)) {
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            IPdpStarter.PdpEnterParam pdpEnterParam = ((PdpViewModel) ((PdpRankHolder) au2S14S0200000_4.l1).LJLIL.getValue()).LJLJJLL;
            if (pdpEnterParam != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<String, Object> entry : trackParams.entrySet()) {
                    if (o.LJ(entry.getKey(), "enter_from") || o.LJ(entry.getKey(), "enter_from_info") || o.LJ(entry.getKey(), "action_type") || o.LJ(entry.getKey(), "search_entrance") || o.LJ(entry.getKey(), "first_source_page") || o.LJ(entry.getKey(), "source_previous_page")) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap.putAll(linkedHashMap2);
                linkedHashMap.put("parent_track_id", trackParams.get("track_id"));
                linkedHashMap.put("previous_page", "product_detail");
                if (linkedHashMap.get("first_source_page") == null) {
                    linkedHashMap.put("first_source_page", trackParams.get("source_page_type"));
                }
                if (linkedHashMap.get("source_previous_page") == null) {
                    linkedHashMap.put("source_previous_page", "product_detail");
                }
                linkedHashMap.put("init_time", Long.valueOf(System.currentTimeMillis()));
            }
            Context context = ((PdpRankHolder) au2S14S0200000_4.l1).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C26867AgZ.LIZIZ(context, str4, linkedHashMap, false).open();
        }
    }

    public static final void LIZ$2(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            C27949Ay1.LJJI("billing_address", ((PaymentInfoVH2) au2S14S0200000_4.l0).M().fw0(false), null, null, null, null, null, null, null, 1020);
            OrderSubmitViewModel M = ((PaymentInfoVH2) au2S14S0200000_4.l0).M();
            PaymentMethod paymentMethod = (PaymentMethod) au2S14S0200000_4.l1;
            M.getClass();
            if (paymentMethod == null) {
                return;
            }
            M.setState(new AqS135S0200000_4(M, paymentMethod, 226));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$20(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            if (((C26566Abi) ((USAddressVH) au2S14S0200000_4.l0).getItem()).LJIIL) {
                C27949Ay1.LJJJIL();
            }
            C27949Ay1.LJJI("edit_shipping", ((USAddressVH) au2S14S0200000_4.l0).L().fw0(false), null, null, null, null, null, null, null, 1020);
            String LJJIJ = C79234V7u.LJJIJ(view);
            C1A8.LJIJI(LJJIJ, new AqS170S0100000_4((USAddressVH) au2S14S0200000_4.l0, 918));
            ((USAddressVH) au2S14S0200000_4.l0).L().Ew0(((View) au2S14S0200000_4.l1).getContext(), LJJIJ, null);
            ((C26563Abf) ((View) au2S14S0200000_4.l1).findViewById(R.id.mvo))._$_findCachedViewById(R.id.mvm).setVisibility(8);
        }
    }

    public static final void LIZ$21(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            C27949Ay1.LJJI("add_new_shipping", ((USAddressVH) au2S14S0200000_4.l0).L().fw0(false), null, null, null, null, null, null, null, 1020);
            ((USAddressVH) au2S14S0200000_4.l0).L().Dw0(((USAddressVH) au2S14S0200000_4.l0).itemView, null);
            ((View) au2S14S0200000_4.l1).findViewById(R.id.mv9).setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$22(Au2S14S0200000_4 au2S14S0200000_4, View v) {
        o.LJIIIZ(v, "v");
        int bindingAdapterPosition = ((C27422ApW) au2S14S0200000_4.l0).getBindingAdapterPosition();
        if (bindingAdapterPosition >= 0) {
            ((AbstractC27419ApT) au2S14S0200000_4.l1).LJZ(bindingAdapterPosition);
            InterfaceC88471Ynr<? super Integer, ? super T, C76800UCe> interfaceC88471Ynr = ((AbstractC27419ApT) au2S14S0200000_4.l1).LJLIL;
            if (interfaceC88471Ynr != 0) {
                interfaceC88471Ynr.invoke(Integer.valueOf(bindingAdapterPosition), ((AbstractC27419ApT) au2S14S0200000_4.l1).getItem(bindingAdapterPosition));
            }
        }
    }

    public static final void LIZ$23(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            AddressListViewModel addressListViewModel = (AddressListViewModel) au2S14S0200000_4.l0;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) au2S14S0200000_4.l1;
            addressListViewModel.Iv0(activityC45651qj, C78948Uye.LJIIZILJ(activityC45651qj));
        }
    }

    public static final void LIZ$24(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            Integer num = ((C26839Ag7) au2S14S0200000_4.l0).LJLIL;
            if ((num != null && num.intValue() == 0) || ((C26839Ag7) au2S14S0200000_4.l0).LJLIL == null) {
                return;
            }
            ((PdpViewModel) ((GlobalShopReviewTitleVH) au2S14S0200000_4.l1).LJLIL.getValue()).Kw0(2, view, "shop_review_entrance", "shop_review_entrance", null);
        }
    }

    public static final void LIZ$25(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        if (view != null) {
            OrderSubmitViewModel L = ((USPaymentInfoVH) au2S14S0200000_4.l0).L();
            Context context = ((USPaymentInfoVH) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Hw0(context, C79234V7u.LJJIJ(view), false);
            HashMap<String, Object> fw0 = ((USPaymentInfoVH) au2S14S0200000_4.l0).L().fw0(false);
            PaymentMethod paymentMethod = (PaymentMethod) au2S14S0200000_4.l1;
            String str2 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIIL();
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) au2S14S0200000_4.l1;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.extraInfo;
            }
            C27949Ay1.LJJI("add_new_payment", fw0, null, null, null, str, Boolean.valueOf(C78685UuP.LJJJZ(str2)), null, null, 828);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$26(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        BillStarlingText billStarlingText;
        String str;
        BillStarlingText billStarlingText2;
        String str2;
        if (view != null) {
            Context context = ((USShopInfoVH) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            ActivityC45651qj LIZJ = C77125UOr.LIZJ(context);
            Bundle bundle = new Bundle();
            ShopOrderStarling shopOrderStarling = ((C26804AfY) ((USShopInfoVH) au2S14S0200000_4.l0).getItem()).LJIILJJIL;
            if (shopOrderStarling != null && (billStarlingText2 = shopOrderStarling.orderMessageHeader) != null && (str2 = billStarlingText2.text) != null) {
                bundle.putString("title", str2);
            }
            ShopOrderStarling shopOrderStarling2 = ((C26804AfY) ((USShopInfoVH) au2S14S0200000_4.l0).getItem()).LJIILJJIL;
            if (shopOrderStarling2 != null && (billStarlingText = shopOrderStarling2.orderNotesHint) != null && (str = billStarlingText.text) != null) {
                bundle.putString("hint", str);
            }
            String str3 = ((C26804AfY) ((USShopInfoVH) au2S14S0200000_4.l0).getItem()).LIZ;
            if (str3 != null) {
                bundle.putString("seller_id", str3);
            }
            bundle.putInt("height", O6R.LJJIIZ(C32151Nz.LJIIZILJ(328)));
            C79234V7u.LJJIJIL(bundle, view);
            FragmentManager supportFragmentManager = LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            USMessageEditPanelFragment uSMessageEditPanelFragment = new USMessageEditPanelFragment();
            uSMessageEditPanelFragment.setArguments(bundle);
            uSMessageEditPanelFragment.show(supportFragmentManager, "OSPMessagePanelFragment");
            C78946Uyc.LJJIIJ((View) au2S14S0200000_4.l1, new C70917RsP(), new AqS170S0100000_4((USShopInfoVH) au2S14S0200000_4.l0, 968));
        }
    }

    public static final void LIZ$27(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            FragmentManager childFragmentManager = ((PdpDeliveryHolder) au2S14S0200000_4.l0).LJLIL.getChildFragmentManager();
            ShippingDialogDto shippingDialogDto = ((ShippingTextInfo) au2S14S0200000_4.l1).shippingDialogDto;
            View itemView = ((PdpDeliveryHolder) au2S14S0200000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C27130Ako.LIZ(childFragmentManager, shippingDialogDto, C78948Uye.LJIILIIL(itemView));
        }
    }

    public static final void LIZ$28(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            PdpDeliveryServiceViewHolder pdpDeliveryServiceViewHolder = (PdpDeliveryServiceViewHolder) au2S14S0200000_4.l0;
            C78565UsT.LJJIJIIJIL(pdpDeliveryServiceViewHolder.LJLIL, new C26785AfF(pdpDeliveryServiceViewHolder, (C26786AfG) au2S14S0200000_4.l1, null));
            C70414RkI c70414RkI = ((PdpViewModel) ((PdpDeliveryServiceViewHolder) au2S14S0200000_4.l0).LJLILLLLZI.getValue()).LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, "logistics", (C26786AfG) au2S14S0200000_4.l1, "shipping_rights", null, 24);
            }
        }
    }

    public static final void LIZ$29(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            USUnreachableExpend uSUnreachableExpend = (USUnreachableExpend) au2S14S0200000_4.l0;
            C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
            JediViewModel jediViewModel = (JediViewModel) C221108m2.LIZIZ(new AqS93S0300000_4(uSUnreachableExpend, LIZ, LIZ, 174)).getValue();
            C26548AbQ c26548AbQ = (C26548AbQ) au2S14S0200000_4.l1;
            boolean z = !c26548AbQ.LJLIL;
            String positionTag = c26548AbQ.LJLILLLLZI;
            o.LJIIIZ(positionTag, "positionTag");
            C26548AbQ c26548AbQ2 = new C26548AbQ(z, positionTag);
            jediViewModel.getClass();
            jediViewModel.setState(new AqS170S0100000_4(c26548AbQ2, 1245));
        }
    }

    public static final void LIZ$3(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) au2S14S0200000_4.l0;
            orderSubmitFragment.withState(orderSubmitFragment.getViewModel(), new AqS135S0200000_4((OrderSubmitFragment) au2S14S0200000_4.l0, (Announcement) au2S14S0200000_4.l1, 32));
        }
    }

    public static final void LIZ$30(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        boolean z;
        CheckoutLink checkoutLink;
        Boolean bool;
        if (view != null) {
            View view2 = ((LogisticsBrickVH) au2S14S0200000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((LogisticsBrickVH) au2S14S0200000_4.l0, 1048));
            PdpMainViewModel M = ((LogisticsBrickVH) au2S14S0200000_4.l0).M();
            View view3 = ((LogisticsBrickVH) au2S14S0200000_4.l0).itemView;
            LogisticBizData LIZ = ((LogisticBrickVO) au2S14S0200000_4.l1).LIZ();
            if (LIZ != null && (bool = LIZ.hasNativePage) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            LogisticBizData LIZ2 = ((LogisticBrickVO) au2S14S0200000_4.l1).LIZ();
            if (LIZ2 != null) {
                checkoutLink = LIZ2.linkInfo;
            } else {
                checkoutLink = null;
            }
            M.getClass();
            if (!z && checkoutLink != null) {
                PdpMainViewModel.lv0(view3, checkoutLink, "logistics");
            }
        }
    }

    public static final void LIZ$31(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        boolean z;
        CheckoutLink checkoutLink;
        Boolean bool;
        if (view != null) {
            View view2 = ((ReturnPolicyBrickVH) au2S14S0200000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((ReturnPolicyBrickVH) au2S14S0200000_4.l0, 1049));
            PdpMainViewModel M = ((ReturnPolicyBrickVH) au2S14S0200000_4.l0).M();
            View view3 = ((ReturnPolicyBrickVH) au2S14S0200000_4.l0).itemView;
            ReturnPolicyBizData LIZ = ((ReturnPolicyBrickVO) au2S14S0200000_4.l1).LIZ();
            if (LIZ != null && (bool = LIZ.hasNativePage) != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            ReturnPolicyBizData LIZ2 = ((ReturnPolicyBrickVO) au2S14S0200000_4.l1).LIZ();
            if (LIZ2 != null) {
                checkoutLink = LIZ2.linkInfo;
            } else {
                checkoutLink = null;
            }
            M.getClass();
            if (!z && checkoutLink != null) {
                PdpMainViewModel.lv0(view3, checkoutLink, "return_policy");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$32(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            if (((C26566Abi) ((GlobalAddressVH) au2S14S0200000_4.l0).getItem()).LJIIL) {
                C27949Ay1.LJJJIL();
            }
            C27949Ay1.LJJI("edit_shipping", ((GlobalAddressVH) au2S14S0200000_4.l0).L().fw0(false), null, null, null, null, null, null, null, 1020);
            String LJJIJ = C79234V7u.LJJIJ(view);
            C1A8.LJIJI(LJJIJ, new AqS170S0100000_4((GlobalAddressVH) au2S14S0200000_4.l0, 1051));
            ((GlobalAddressVH) au2S14S0200000_4.l0).L().Ew0(((View) au2S14S0200000_4.l1).getContext(), LJJIJ, null);
        }
    }

    public static final void LIZ$33(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        if (view != null) {
            OrderSubmitViewModel L = ((GlobalPaymentInfoVH) au2S14S0200000_4.l0).L();
            Context context = ((GlobalPaymentInfoVH) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Hw0(context, C79234V7u.LJJIJ(view), false);
            HashMap<String, Object> fw0 = ((GlobalPaymentInfoVH) au2S14S0200000_4.l0).L().fw0(false);
            PaymentMethod paymentMethod = (PaymentMethod) au2S14S0200000_4.l1;
            String str2 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIIL();
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) au2S14S0200000_4.l1;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.extraInfo;
            }
            C27949Ay1.LJJI("add_new_payment", fw0, null, null, null, str, Boolean.valueOf(C78685UuP.LJJJZ(str2)), null, null, 828);
        }
    }

    public static final void LIZ$34(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            C27949Ay1.LJJI("billing_address", ((GlobalPaymentInfoVH) au2S14S0200000_4.l0).L().fw0(false), null, null, null, null, null, null, null, 1020);
            OrderSubmitViewModel L = ((GlobalPaymentInfoVH) au2S14S0200000_4.l0).L();
            PaymentMethod paymentMethod = (PaymentMethod) au2S14S0200000_4.l1;
            L.getClass();
            if (paymentMethod == null) {
                return;
            }
            L.setState(new AqS135S0200000_4(L, paymentMethod, 226));
        }
    }

    public static final void LIZ$35(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        BillStarlingText billStarlingText;
        String str;
        BillStarlingText billStarlingText2;
        String str2;
        if (view != null) {
            Context context = ((GlobalShopInfoVH) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            ActivityC45651qj LIZJ = C77125UOr.LIZJ(context);
            Bundle bundle = new Bundle();
            bundle.putString("message", ((AppCompatTextView) view.findViewById(R.id.ght)).getText().toString());
            ShopOrderStarling shopOrderStarling = (ShopOrderStarling) au2S14S0200000_4.l1;
            if (shopOrderStarling != null && (billStarlingText2 = shopOrderStarling.orderMessageHeader) != null && (str2 = billStarlingText2.text) != null) {
                bundle.putString("hint", str2);
            }
            ShopOrderStarling shopOrderStarling2 = (ShopOrderStarling) au2S14S0200000_4.l1;
            if (shopOrderStarling2 != null && (billStarlingText = shopOrderStarling2.orderNotesText) != null && (str = billStarlingText.text) != null) {
                bundle.putString("title", str);
            }
            C79234V7u.LJJIJIL(bundle, view);
            FragmentManager supportFragmentManager = LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            AqS135S0200000_4 aqS135S0200000_4 = new AqS135S0200000_4(view, (GlobalShopInfoVH) au2S14S0200000_4.l0, 213);
            GlobalMessageEditDialogFragment globalMessageEditDialogFragment = new GlobalMessageEditDialogFragment();
            globalMessageEditDialogFragment.setArguments(bundle);
            globalMessageEditDialogFragment.LJLJI = aqS135S0200000_4;
            globalMessageEditDialogFragment.show(supportFragmentManager, "OSPMessagePanelFragment");
            C27949Ay1.LJJI("message", ((OrderSubmitViewModel) ((GlobalShopInfoVH) au2S14S0200000_4.l0).LJLJI.getValue()).fw0(false), null, null, null, null, null, null, null, 1020);
        }
    }

    public static final void LIZ$36(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            PdpViewModel.Rw0(((PdpSkuHolderV2) au2S14S0200000_4.l0).getVm(), ((PdpSkuHolderV2) au2S14S0200000_4.l0).LJLIL.getView(), 0, new IDqS429S0100000_4((PdpSkuHolderV2) au2S14S0200000_4.l0, 13), true, null, null, 48);
            View view2 = ((PdpSkuHolderV2) au2S14S0200000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((RX8) au2S14S0200000_4.l1, 1131));
        }
    }

    public static final void LIZ$37(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            DistrictPickerViewModel L = ((RegionAdapter.DistrictViewHolder) au2S14S0200000_4.l0).L();
            District district = (District) au2S14S0200000_4.l1;
            L.getClass();
            o.LJIIIZ(district, "district");
            L.setState(new AqS170S0100000_4(district, 1352));
        }
    }

    public static final void LIZ$38(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = ((C27416ApQ) au2S14S0200000_4.l0).LJLJL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(((C27420ApU) au2S14S0200000_4.l1).LJLIL);
            }
            ((C27416ApQ) au2S14S0200000_4.l0).LJZI(((C27420ApU) au2S14S0200000_4.l1).LJLIL);
        }
    }

    public static final void LIZ$39(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        if (view != null) {
            String str = ((C26685Add) au2S14S0200000_4.l0).LIZIZ;
            if (str != null) {
                PdpViewModel pdpViewModel = (PdpViewModel) ((UsSellerPromotionVH) au2S14S0200000_4.l1).LJLJI.getValue();
                Context context = ((UsSellerPromotionVH) au2S14S0200000_4.l1).itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                pdpViewModel.Fw0(context, str, null, null);
            }
            C76732zl c76732zl = new C76732zl();
            int childCount = ((ViewGroup) ((UsSellerPromotionVH) au2S14S0200000_4.l1)._$_findCachedViewById(R.id.icd)).getChildCount();
            c76732zl.element = childCount;
            if (childCount > ((C26685Add) au2S14S0200000_4.l0).LIZJ.size()) {
                c76732zl.element = ((C26685Add) au2S14S0200000_4.l0).LIZJ.size();
            }
            C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS135S0200000_4(((C26685Add) au2S14S0200000_4.l0).LIZJ.subList(0, c76732zl.element), c76732zl, 239));
            InterfaceC36571c5 interfaceC36571c5 = ((UsSellerPromotionVH) au2S14S0200000_4.l1).LJLIL;
            if ((interfaceC36571c5 instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) interfaceC36571c5) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70919RsR(), new AqS170S0100000_4((C26685Add) au2S14S0200000_4.l0, 1312));
            }
        }
    }

    public static final void LIZ$4(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            String LJJIJ = C79234V7u.LJJIJ(view);
            C1A8.LJIJI(LJJIJ, new AqS170S0100000_4((C26566Abi) au2S14S0200000_4.l1, 257));
            ((OrderSubmitFragment) au2S14S0200000_4.l0).getViewModel().Ew0(((OrderSubmitFragment) au2S14S0200000_4.l0).getContext(), LJJIJ, null);
            View brief_address_bar = ((OrderSubmitFragment) au2S14S0200000_4.l0)._$_findCachedViewById(R.id.asw);
            o.LJIIIIZZ(brief_address_bar, "brief_address_bar");
            C78946Uyc.LJJIIJ(brief_address_bar, new C70919RsR(), C27857AwX.LJLIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r5, "gb") == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$40(com.ss.android.ugc.aweme.utils.Au2S14S0200000_4 r9, android.view.View r10) {
        /*
            if (r10 == 0) goto L55
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r0
            X.1qj r0 = r0.mo49getActivity()
            if (r0 == 0) goto Lf
            X.C27570Aru.LIZJ(r0)
        Lf:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r6 = r0.Dl()
            java.lang.Integer r0 = r6.LLIILII
            r2 = 1
            r4 = 0
            if (r0 != 0) goto L59
        L1d:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = r0.Dl()
            r3.getClass()
            kotlin.jvm.internal.AqS47S0110000_4 r1 = new kotlin.jvm.internal.AqS47S0110000_4
            r0 = 16
            r1.<init>(r3, r4, r0)
            r3.withState(r1)
        L32:
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter$AddressEditEnterParams r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter.AddressEditEnterParams) r0
            if (r0 == 0) goto L56
            int r0 = r0.buttonType
            if (r0 != r2) goto L56
            java.lang.String r5 = "next"
        L3e:
            java.lang.Object r4 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r4 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r4
            X.RsP r3 = new X.RsP
            r3.<init>()
            kotlin.jvm.internal.AqS58S1100000_4 r2 = new kotlin.jvm.internal.AqS58S1100000_4
            java.lang.Object r1 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r1
            r0 = 46
            r2.<init>(r5, r1, r0)
            X.C78946Uyc.LJJII(r4, r3, r2)
        L55:
            return
        L56:
            java.lang.String r5 = "save"
            goto L3e
        L59:
            int r0 = r0.intValue()
            if (r0 == r2) goto L60
            goto L1d
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = r6.LJLJLJ
            r5 = 0
            java.lang.String r3 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r0 == 0) goto L96
            java.lang.String r1 = r0.code
            if (r1 == 0) goto L96
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r3)
        L74:
            java.lang.String r0 = "us"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L98
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region r0 = r6.LJLJLJ
            if (r0 == 0) goto L8d
            java.lang.String r1 = r0.code
            if (r1 == 0) goto L8d
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r1.toLowerCase(r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r3)
        L8d:
            java.lang.String r0 = "gb"
            boolean r0 = kotlin.jvm.internal.o.LJ(r5, r0)
            if (r0 != 0) goto L98
            goto L1d
        L96:
            r1 = r5
            goto L74
        L98:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = r0.Dl()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r6 = 0
            kotlin.jvm.internal.AqS154S0100000_4 r7 = new kotlin.jvm.internal.AqS154S0100000_4
            java.lang.Object r1 = r9.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment) r1
            r0 = 1202(0x4b2, float:1.684E-42)
            r7.<init>(r1, r0)
            r8 = 4
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel.Uv0(r3, r4, r5, r6, r7, r8)
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S14S0200000_4.LIZ$40(com.ss.android.ugc.aweme.utils.Au2S14S0200000_4, android.view.View):void");
    }

    public static final void LIZ$41(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            UsReturnPolicyVH usReturnPolicyVH = (UsReturnPolicyVH) au2S14S0200000_4.l0;
            C78565UsT.LJJIJIIJIL(usReturnPolicyVH.LJLIL, new C26658AdC(usReturnPolicyVH, (C26669AdN) au2S14S0200000_4.l1, null));
        }
    }

    public static final void LIZ$42(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        StoreLabel storeLabel;
        StoreOfficialLabel storeOfficialLabel;
        SellerInfo sellerInfo;
        if (view != null) {
            C70414RkI c70414RkI = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).getVm().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, "shop_review_entrance", null, "shop_review_entrance", null, 26);
            }
            PdpViewModel vm = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).getVm();
            Context context = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C27575Arz c27575Arz = (C27575Arz) au2S14S0200000_4.l1;
            String str2 = c27575Arz.LJLJJLL;
            String str3 = null;
            if (str2 == null && ((sellerInfo = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).LJLILLLLZI) == null || (str2 = sellerInfo.shopLink) == null)) {
                str2 = "";
            }
            UsPdpReviewTitleVH usPdpReviewTitleVH = (UsPdpReviewTitleVH) au2S14S0200000_4.l0;
            SellerInfo sellerInfo2 = usPdpReviewTitleVH.LJLILLLLZI;
            if (sellerInfo2 != null) {
                str = sellerInfo2.sellerId;
            } else {
                str = null;
            }
            Float f = c27575Arz.LJLIL;
            if (sellerInfo2 != null && (storeLabel = sellerInfo2.storeLabel) != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                str3 = storeOfficialLabel.labelTypeStr;
            }
            PdpViewModel.nw0(vm, context, str2, str, f, "pdp_shop_review", str3, usPdpReviewTitleVH.getVm().aw0(), null, null, "shop_review", null, null, null, ((C27575Arz) au2S14S0200000_4.l1).LJLJJI, 7552);
        }
    }

    public static final void LIZ$43(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        StoreLabel storeLabel;
        StoreOfficialLabel storeOfficialLabel;
        SellerInfo sellerInfo;
        if (view != null) {
            C70414RkI c70414RkI = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).getVm().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, "shop_review_entrance", null, "shop_review_entrance", null, 26);
            }
            PdpViewModel vm = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).getVm();
            Context context = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C27575Arz c27575Arz = (C27575Arz) au2S14S0200000_4.l1;
            String str2 = c27575Arz.LJLJJLL;
            String str3 = null;
            if (str2 == null && ((sellerInfo = ((UsPdpReviewTitleVH) au2S14S0200000_4.l0).LJLILLLLZI) == null || (str2 = sellerInfo.shopLink) == null)) {
                str2 = "";
            }
            UsPdpReviewTitleVH usPdpReviewTitleVH = (UsPdpReviewTitleVH) au2S14S0200000_4.l0;
            SellerInfo sellerInfo2 = usPdpReviewTitleVH.LJLILLLLZI;
            if (sellerInfo2 != null) {
                str = sellerInfo2.sellerId;
            } else {
                str = null;
            }
            Float f = c27575Arz.LJLIL;
            if (sellerInfo2 != null && (storeLabel = sellerInfo2.storeLabel) != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                str3 = storeOfficialLabel.labelTypeStr;
            }
            PdpViewModel.nw0(vm, context, str2, str, f, "pdp_shop_review", str3, usPdpReviewTitleVH.getVm().aw0(), null, null, "shop_review", null, null, null, ((C27575Arz) au2S14S0200000_4.l1).LJLJJI, 7552);
        }
    }

    public static final void LIZ$44(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            DeliveryPanelViewModel viewModel = ((LogisticAdapter.LogisticViewHolder) au2S14S0200000_4.l0).getViewModel();
            LogisticDTO logisticDTO = (LogisticDTO) au2S14S0200000_4.l1;
            viewModel.getClass();
            viewModel.setState(new AqS170S0100000_4(logisticDTO, 1643));
        }
    }

    public static final void LIZ$45(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        String str2;
        String str3;
        Availability availability;
        if (view != null) {
            OrderSubmitViewModel L = ((PaymentInfoVH) au2S14S0200000_4.l0).L();
            Context context = ((PaymentInfoVH) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Hw0(context, C79234V7u.LJJIJ(view), !((C28003Ayt) au2S14S0200000_4.l1).LJ);
            HashMap<String, Object> fw0 = ((PaymentInfoVH) au2S14S0200000_4.l0).L().fw0(false);
            PaymentMethod paymentMethod = ((C28003Ayt) au2S14S0200000_4.l1).LIZ;
            String str4 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIIL();
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = ((C28003Ayt) au2S14S0200000_4.l1).LIZ;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.extraInfo;
            } else {
                str2 = null;
            }
            Boolean valueOf = Boolean.valueOf(C78857UxB.LJJJIL(str2));
            PaymentMethod paymentMethod3 = ((C28003Ayt) au2S14S0200000_4.l1).LIZ;
            if (paymentMethod3 != null) {
                str3 = paymentMethod3.balance;
            } else {
                str3 = null;
            }
            Boolean valueOf2 = Boolean.valueOf(C78857UxB.LJJJIL(str3));
            PaymentMethod paymentMethod4 = ((C28003Ayt) au2S14S0200000_4.l1).LIZ;
            if (paymentMethod4 != null && (availability = paymentMethod4.availability) != null) {
                str4 = availability.unavailableCode;
            }
            C27949Ay1.LJJI("payment_method", fw0, null, null, null, str, valueOf, valueOf2, str4, 60);
        }
    }

    public static final void LIZ$46(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        if (view != null) {
            OrderSubmitViewModel L = ((PaymentInfoVH) au2S14S0200000_4.l0).L();
            Context context = ((PaymentInfoVH) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Hw0(context, C79234V7u.LJJIJ(view), false);
            HashMap<String, Object> fw0 = ((PaymentInfoVH) au2S14S0200000_4.l0).L().fw0(false);
            PaymentMethod paymentMethod = ((C28003Ayt) au2S14S0200000_4.l1).LIZ;
            String str2 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIIL();
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = ((C28003Ayt) au2S14S0200000_4.l1).LIZ;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.extraInfo;
            }
            C27949Ay1.LJJI("add_new_payment", fw0, null, null, null, str, Boolean.valueOf(C78857UxB.LJJJIL(str2)), null, null, 828);
        }
    }

    public static final void LIZ$47(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        if (view != null) {
            OrderSubmitViewModel M = ((PaymentInfoVH2) au2S14S0200000_4.l0).M();
            Context context = ((PaymentInfoVH2) au2S14S0200000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            M.Hw0(context, C79234V7u.LJJIJ(view), false);
            HashMap<String, Object> fw0 = ((PaymentInfoVH2) au2S14S0200000_4.l0).M().fw0(false);
            PaymentMethod paymentMethod = (PaymentMethod) au2S14S0200000_4.l1;
            String str2 = null;
            if (paymentMethod != null) {
                str = paymentMethod.LJIIL();
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) au2S14S0200000_4.l1;
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.extraInfo;
            }
            C27949Ay1.LJJI("add_new_payment", fw0, null, null, null, str, Boolean.valueOf(C78685UuP.LJJJZ(str2)), null, null, 828);
        }
    }

    public static final void LIZ$48(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        String str;
        if (view != null) {
            ((B1R) au2S14S0200000_4.l0).getOnActivateClickListener().invoke();
            PaymentMethod paymentMethod = (PaymentMethod) au2S14S0200000_4.l1;
            o.LJIIIZ(paymentMethod, "paymentMethod");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C27949Ay1.LIZIZ);
            linkedHashMap.put("button_name", "active_now");
            linkedHashMap.put("payment_option", paymentMethod.LJIIL());
            BindInfo bindInfo = paymentMethod.bindInfo;
            if (bindInfo != null && (str = bindInfo.bindStatus) != null && str.length() > 0) {
                linkedHashMap.put("pay_bind_status", str);
            }
            linkedHashMap.put("is_option_discounted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod.extraInfo) ? 1 : 0));
            linkedHashMap.put("is_payment_promoted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod.LJIIIIZZ()) ? 1 : 0));
            C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
        }
    }

    public static final void LIZ$49(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            C78565UsT.LJJIJ(((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel(), MBB.INSTANCE, new C26836Ag4((PdpSelectViewHolder) au2S14S0200000_4.l0, (InterfaceC26837Ag5) au2S14S0200000_4.l1, null));
            C70414RkI c70414RkI = ((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, ((InterfaceC26837Ag5) au2S14S0200000_4.l1).LJJLIL(), null, null, null, 30);
            }
        }
    }

    public static final void LIZ$5(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJII((OrderSubmitFragment) au2S14S0200000_4.l0, new C70889Rrx(), new AqS170S0100000_4((Announcement) au2S14S0200000_4.l1, 261));
            FragmentManager fragmentManager = ((OrderSubmitFragment) au2S14S0200000_4.l0).getFragmentManager();
            if (fragmentManager != null) {
                C77857Uh3.LIZLLL(fragmentManager, ((Announcement) au2S14S0200000_4.l1).getText(), ((OrderSubmitFragment) au2S14S0200000_4.l0).getResources().getString(R.string.f82));
            }
        }
    }

    public static final void LIZ$50(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        View view2;
        if (view != null) {
            PdpViewModel viewModel = ((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel();
            Fragment fragment = ((PdpSelectViewHolder) au2S14S0200000_4.l0).LJLIL;
            if (fragment != null) {
                view2 = fragment.getView();
            } else {
                view2 = null;
            }
            PdpViewModel.Rw0(viewModel, view2, 0, new IDqS183S0200000_4(view, (PdpSelectViewHolder) au2S14S0200000_4.l0, 10), true, null, null, 48);
            C70414RkI c70414RkI = ((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel().LLFII;
            if (c70414RkI != null) {
                C70414RkI.LJJJIL(c70414RkI, ((InterfaceC26837Ag5) au2S14S0200000_4.l1).LJJLIL(), null, null, null, 30);
            }
        }
    }

    public static final void LIZ$51(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel();
            Context context = ((PdpSelectViewHolder) au2S14S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            InterfaceC26837Ag5 interfaceC26837Ag5 = (InterfaceC26837Ag5) au2S14S0200000_4.l1;
            String str = ((C27516Ar2) interfaceC26837Ag5).LJLIL.schema;
            C27516Ar2 c27516Ar2 = (C27516Ar2) interfaceC26837Ag5;
            String str2 = ((C27516Ar2) interfaceC26837Ag5).LJLIL.buttonText;
            if (str2 == null) {
                str2 = "";
            }
            viewModel.Jw0(context, str, c27516Ar2, str2);
        }
    }

    public static final void LIZ$52(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel();
            Context context = ((PdpSelectViewHolder) au2S14S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            InterfaceC26837Ag5 interfaceC26837Ag5 = (InterfaceC26837Ag5) au2S14S0200000_4.l1;
            viewModel.Jw0(context, ((C27516Ar2) interfaceC26837Ag5).LJLIL.schema, (C27516Ar2) interfaceC26837Ag5, "promotions");
        }
    }

    public static final void LIZ$53(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpSelectViewHolder) au2S14S0200000_4.l0).getViewModel();
            Context context = ((PdpSelectViewHolder) au2S14S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            InterfaceC26837Ag5 interfaceC26837Ag5 = (InterfaceC26837Ag5) au2S14S0200000_4.l1;
            viewModel.Jw0(context, ((C27516Ar2) interfaceC26837Ag5).LJLIL.schema, (C27516Ar2) interfaceC26837Ag5, "blank");
        }
    }

    public static final void LIZ$54(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        PDPLogisticModule pDPLogisticModule;
        PDPShippingModule pDPShippingModule;
        if (view != null && (pDPLogisticModule = ((C27129Akn) au2S14S0200000_4.l0).LJLJJI) != null && (pDPShippingModule = pDPLogisticModule.pdpShippingModule) != null && pDPShippingModule.descriptionListArrow != null) {
            ((UsShippingVH) au2S14S0200000_4.l1).getVm().Pw0(((UsShippingVH) au2S14S0200000_4.l1).itemView.getContext(), C79234V7u.LJJIJ(view));
            ((UsShippingVH) au2S14S0200000_4.l1).M("shipping_info", null, (C27129Akn) au2S14S0200000_4.l0);
        }
    }

    public static final void LIZ$55(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            ((AddressSelectViewModel) ((AddressViewHolder) au2S14S0200000_4.l0).LJLILLLLZI.getValue()).Mv0((ReachableAddress) au2S14S0200000_4.l1);
        }
    }

    public static final void LIZ$56(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            UnreachableExpend unreachableExpend = (UnreachableExpend) au2S14S0200000_4.l0;
            C65776Prg LIZ = C65352Pkq.LIZ(OrderSubmitViewModel.class);
            JediViewModel jediViewModel = (JediViewModel) C221108m2.LIZIZ(new AqS93S0300000_4(unreachableExpend, LIZ, LIZ, 200)).getValue();
            C26548AbQ c26548AbQ = (C26548AbQ) au2S14S0200000_4.l1;
            boolean z = !c26548AbQ.LJLIL;
            String positionTag = c26548AbQ.LJLILLLLZI;
            o.LJIIIZ(positionTag, "positionTag");
            C26548AbQ c26548AbQ2 = new C26548AbQ(z, positionTag);
            jediViewModel.getClass();
            jediViewModel.setState(new AqS170S0100000_4(c26548AbQ2, 1245));
        }
    }

    public static final void LIZ$57(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            JediViewModel jediViewModel = (JediViewModel) ((USLogisticVH) au2S14S0200000_4.l0).LJLILLLLZI.getValue();
            LogisticDTO logisticDTO = (LogisticDTO) au2S14S0200000_4.l1;
            jediViewModel.getClass();
            jediViewModel.setState(new AqS170S0100000_4(logisticDTO, 1643));
        }
    }

    public static final void LIZ$58(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            AddressListViewModel addressListViewModel = (AddressListViewModel) au2S14S0200000_4.l0;
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) au2S14S0200000_4.l1;
            addressListViewModel.Iv0(activityC45651qj, C78948Uye.LJIIZILJ(activityC45651qj));
        }
    }

    public static final void LIZ$59(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            ((AddressAdapter.AddressViewHolder) au2S14S0200000_4.l0).M("other", ((Address) au2S14S0200000_4.l1).LJ());
            ((AddressAdapter.AddressViewHolder) au2S14S0200000_4.l0).L().Rv0((Address) au2S14S0200000_4.l1);
        }
    }

    public static final void LIZ$6(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            B1K b1k = ((PaymentMethodViewHolder) au2S14S0200000_4.l0).getViewModel().LJLL;
            if (b1k != null) {
                b1k.LJ(((B1J) au2S14S0200000_4.l1).LIZ, "tiktokec_button_click");
            }
            ((PaymentMethodViewHolder) au2S14S0200000_4.l0).openCCDCPage("EDIT_CARD", "edit");
        }
    }

    public static final void LIZ$60(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            AddressListViewModel L = ((AddressAdapter.AddressViewHolder) au2S14S0200000_4.l0).L();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S14S0200000_4.l1);
            ((AddressAdapter.AddressViewHolder) au2S14S0200000_4.l0).M("edit", ((Address) au2S14S0200000_4.l1).LJ());
        }
    }

    public static final void LIZ$61(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            AddressListViewModel L = ((AddressAdapter.AddressViewHolder) au2S14S0200000_4.l0).L();
            Context context = view.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S14S0200000_4.l1);
            ((AddressAdapter.AddressViewHolder) au2S14S0200000_4.l0).M("edit", ((Address) au2S14S0200000_4.l1).LJ());
        }
    }

    public static final void LIZ$62(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            SummaryVH summaryVH = (SummaryVH) au2S14S0200000_4.l0;
            C27051AjX c27051AjX = (C27051AjX) au2S14S0200000_4.l1;
            summaryVH.getClass();
            Context context = summaryVH.LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            C26227ARb LIZ = C3AW.LIZ(context);
            LIZ.LJFF(c27051AjX.LIZ);
            String str = c27051AjX.LJIIIIZZ;
            if (str == null) {
                str = "";
            }
            LIZ.LIZIZ(str);
            UC0.LIZJ(LIZ, C27057Ajd.LJLIL);
            LIZ.LJI().LIZLLL();
        }
    }

    public static final void LIZ$7(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            HashMap<String, Object> fw0 = ((OrderSubmitBottomWidget) au2S14S0200000_4.l0).getViewModel().fw0(false);
            fw0.put("click_area", "reminder");
            C27949Ay1.LJJI("discount_reminder", fw0, null, null, null, null, null, null, null, 1020);
            OrderSubmitBottomWidget orderSubmitBottomWidget = (OrderSubmitBottomWidget) au2S14S0200000_4.l0;
            orderSubmitBottomWidget.withState(orderSubmitBottomWidget.getViewModel(), new AqS135S0200000_4((View) au2S14S0200000_4.l1, (OrderSubmitBottomWidget) au2S14S0200000_4.l0, 45));
        }
    }

    public static final void LIZ$8(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            if (OspAsyncInflateSettings.LIZ() && ((OrderSubmitBottomWidget) au2S14S0200000_4.l0).getViewModel().LLJJLIIIJLLLLLLLZ) {
                return;
            }
            OrderSubmitBottomWidget orderSubmitBottomWidget = (OrderSubmitBottomWidget) au2S14S0200000_4.l0;
            orderSubmitBottomWidget.withState(orderSubmitBottomWidget.getViewModel(), new AqS108S0300000_4((View) au2S14S0200000_4.l1, (OrderSubmitBottomWidget) au2S14S0200000_4.l0, view, 13));
        }
    }

    public static final void LIZ$9(Au2S14S0200000_4 au2S14S0200000_4, View view) {
        if (view != null) {
            ((PdpPromotionResourceBannerViewHolder) au2S14S0200000_4.l0).logModuleClick();
            PdpViewModel viewModel = ((PdpPromotionResourceBannerViewHolder) au2S14S0200000_4.l0).getViewModel();
            Context context = ((PdpPromotionResourceBannerViewHolder) au2S14S0200000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            String str = ((C27513Aqz) au2S14S0200000_4.l1).LIZJ;
            viewModel.getClass();
            if (str == null) {
                return;
            }
            C26867AgZ.LIZIZ(context, str, C113554cx.LJJJLIIL(), false).open();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S14S0200000_4(Object obj, Object obj2, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
