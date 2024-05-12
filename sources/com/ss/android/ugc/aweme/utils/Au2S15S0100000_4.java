package com.ss.android.ugc.aweme.utils;

import X.AI8;
import X.ASL;
import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.B1K;
import X.B1R;
import X.B1S;
import X.B1T;
import X.B24;
import X.B26;
import X.C113554cx;
import X.C116414hZ;
import X.C16880lQ;
import X.C19K;
import X.C1DG;
import X.C1XY;
import X.C221108m2;
import X.C232579Av;
import X.C234529Ii;
import X.C235119Kp;
import X.C25991AHz;
import X.C26018AJa;
import X.C26048AKe;
import X.C26059AKp;
import X.C26227ARb;
import X.C26338AVi;
import X.C26616AcW;
import X.C26629Acj;
import X.C26630Ack;
import X.C26653Ad7;
import X.C26676AdU;
import X.C26682Ada;
import X.C26735AeR;
import X.C26802AfW;
import X.C26867AgZ;
import X.C26937Ahh;
import X.C27019Aj1;
import X.C27021Aj3;
import X.C27039AjL;
import X.C27077Ajx;
import X.C27079Ajz;
import X.C27096AkG;
import X.C27127Akl;
import X.C27163AlL;
import X.C27186Ali;
import X.C27187Alj;
import X.C27194Alq;
import X.C27196Als;
import X.C27241Amb;
import X.C27312Ank;
import X.C27354AoQ;
import X.C27411ApL;
import X.C27448Apw;
import X.C27452Aq0;
import X.C27515Ar1;
import X.C27516Ar2;
import X.C27550Ara;
import X.C27631Ast;
import X.C27739Aud;
import X.C27740Aue;
import X.C27743Auh;
import X.C27774AvC;
import X.C27804Avg;
import X.C27949Ay1;
import X.C27959AyB;
import X.C28112B1o;
import X.C36671EaJ;
import X.C38350F3i;
import X.C44384HbQ;
import X.C45804HyK;
import X.C47261Igj;
import X.C51029K0z;
import X.C53299Kvv;
import X.C61447O9r;
import X.C61836OOq;
import X.C61841OOv;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C69943Rch;
import X.C70414RkI;
import X.C70656RoC;
import X.C70917RsP;
import X.C70921RsT;
import X.C71096RvI;
import X.C72264SXs;
import X.C73157SnR;
import X.C73969T1h;
import X.C76542zS;
import X.C76800UCe;
import X.C78565UsT;
import X.C78857UxB;
import X.C78946Uyc;
import X.C78948Uye;
import X.C78996UzQ;
import X.C79045V0n;
import X.C79234V7u;
import X.C9KF;
import X.EnumC26917AhN;
import X.EnumC26931Ahb;
import X.FMX;
import X.FT5;
import X.InterfaceC27330Ao2;
import X.InterfaceC36571c5;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.M06;
import X.ORZ;
import X.OSZ;
import X.OUP;
import X.OUR;
import X.T16;
import X.TAT;
import X.UC0;
import X.V1M;
import X.XKX;
import Y.AfS56S0100000_4;
import Y.IDCListenerS205S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.api.AddressApi;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressLocation;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressRequest;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.MapLocateData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailActivity;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.TextInputHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PhoneInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SwitchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.strategy.AddressListNativeStrategy;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.ZipCodePickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ShipToBarHolder;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.AddressVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuCardStyleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.MessageEditDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.desc.ProductSpecificationViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionEntranceInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionForUSHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.returnpolicy.PdpReturnPolicyHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpShopReviewHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.SeeMoreVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.security.PdpSecurityHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.DeliveryBySellerInfoFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.PdpDeliveryHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping.ShippingDialogDto;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shopprofile.ShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.sku.v1.PdpSkuHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.userright.PdpUserRightHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.NoShippingTimeFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.SizeGuideFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpFloatShopWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.ProductInfoBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.desc.ProductDescSpecBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpBodyViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictPage;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressSearchMapConfig;
import com.ss.android.ugc.aweme.ecommerce.gallery.GalleryUtil;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.module.addaddress.GlobalAddAddressHolder;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItem;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.address.GlobalAddressVH;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.payment.GlobalPaymentInfoVH;
import com.ss.android.ugc.aweme.ecommerce.global.osp.subpage.GlobalMessageEditDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.cod.TtfSACodVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.desc.GlobalSpecificationVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.returnpolicy.TtfUkPdpReturnPolicyVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.review.GlobalProductReviewTitleVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.review.TtfProductReviewTitleVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shipping.TtfSAPdpDeliveryHolder;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.shopprofile.TtfMultiShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sizeguide.TTFPdpSizeGuideViewHolder;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.userright.TtfUkUserRightVH;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USDeleteButtonViewHolder;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.vh.USSwitchInputItemVH;
import com.ss.android.ugc.aweme.ecommerce.tts.addresslist.us.addaddress.UsAddAddressVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpAllReviewsVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.review.vh.UsPdpReviewTitleVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.shopprofile.UsShopProfileVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.logisticselectzipcode.USLogisticSelectByZipcodeVH;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.shipto.USShipToBarVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.payment.USPaymentInfoVH;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.AqS10S2200000_4;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.AqS93S0300000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class Au2S15S0100000_4 extends TAT {
    public final int $t;
    public Object l0;

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
            case 63:
                LIZ$63(this, view);
                return;
            case 64:
                LIZ$64(this, view);
                return;
            case 65:
                LIZ$65(this, view);
                return;
            case 66:
                LIZ$66(this, view);
                return;
            case 67:
                LIZ$67(this, view);
                return;
            case 68:
                LIZ$68(this, view);
                return;
            case 69:
                LIZ$69(this, view);
                return;
            case 70:
                LIZ$70(this, view);
                return;
            case 71:
                LIZ$71(this, view);
                return;
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                LIZ$72(this, view);
                return;
            case 73:
                LIZ$73(this, view);
                return;
            case 74:
                LIZ$74(this, view);
                return;
            case 75:
                LIZ$75(this, view);
                return;
            case 76:
                LIZ$76(this, view);
                return;
            case 77:
                LIZ$77(this, view);
                return;
            case 78:
                LIZ$78(this, view);
                return;
            case 79:
                LIZ$79(this, view);
                return;
            case 80:
                LIZ$80(this, view);
                return;
            case 81:
                LIZ$81(this, view);
                return;
            case 82:
                LIZ$82(this, view);
                return;
            case 83:
                LIZ$83(this, view);
                return;
            case 84:
                LIZ$84(this, view);
                return;
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                LIZ$85(this, view);
                return;
            case 86:
                LIZ$86(this, view);
                return;
            case 87:
                LIZ$87(this, view);
                return;
            case 88:
                LIZ$88(this, view);
                return;
            case 89:
                LIZ$89(this, view);
                return;
            case 90:
                LIZ$90(this, view);
                return;
            case 91:
                LIZ$91(this, view);
                return;
            case 92:
                LIZ$92(this, view);
                return;
            case 93:
                LIZ$93(this, view);
                return;
            case 94:
                LIZ$94(this, view);
                return;
            case 95:
                LIZ$95(this, view);
                return;
            case 96:
                LIZ$96(this, view);
                return;
            case 97:
                LIZ$97(this, view);
                return;
            case 98:
                LIZ$98(this, view);
                return;
            case 99:
                LIZ$99(this, view);
                return;
            case 100:
                LIZ$100(this, view);
                return;
            case 101:
                LIZ$101(this, view);
                return;
            case 102:
                LIZ$102(this, view);
                return;
            case 103:
                LIZ$103(this, view);
                return;
            case 104:
                LIZ$104(this, view);
                return;
            case 105:
                LIZ$105(this, view);
                return;
            case 106:
                LIZ$106(this, view);
                return;
            case 107:
                LIZ$107(this, view);
                return;
            case 108:
                LIZ$108(this, view);
                return;
            case 109:
                LIZ$109(this, view);
                return;
            case 110:
                LIZ$110(this, view);
                return;
            case 111:
                LIZ$111(this, view);
                return;
            case 112:
                LIZ$112(this, view);
                return;
            case 113:
                LIZ$113(this, view);
                return;
            case 114:
                LIZ$114(this, view);
                return;
            case 115:
                LIZ$115(this, view);
                return;
            case 116:
                LIZ$116(this, view);
                return;
            case 117:
                LIZ$117(this, view);
                return;
            case 118:
                LIZ$118(this, view);
                return;
            case 119:
                LIZ$119(this, view);
                return;
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                LIZ$120(this, view);
                return;
            case 121:
                LIZ$121(this, view);
                return;
            case 122:
                LIZ$122(this, view);
                return;
            case 123:
                LIZ$123(this, view);
                return;
            default:
                super.LIZ(view);
                return;
        }
    }

    public Au2S15S0100000_4(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        AqS143S0200000_12 aqS143S0200000_12;
        if (view != null && (aqS143S0200000_12 = ((C27631Ast) au2S15S0100000_4.l0).LJLJI) != null) {
            aqS143S0200000_12.invoke(view);
        }
    }

    public static final void LIZ$1(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Context context = ((C232579Av) au2S15S0100000_4.l0).getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            C232579Av c232579Av = (C232579Av) au2S15S0100000_4.l0;
            IRecommendUsersService LJIIIZ = IRecommendUsersServiceImpl.LJIIIZ();
            String enterFrom = c232579Av.getEnterFrom();
            String str = "";
            if (enterFrom == null) {
                enterFrom = "";
            }
            String previousPage = c232579Av.getPreviousPage();
            if (previousPage != null) {
                str = previousPage;
            }
            LJIIIZ.LJFF(LJJIFFI, enterFrom, str);
        }
    }

    public static final void LIZ$10(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$100(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((AddressEditDetailActivity) au2S15S0100000_4.l0).LJLLL.LJLIL = new ArrayList();
            ((AddressEditDetailActivity) au2S15S0100000_4.l0).LJLLL.notifyDataSetChanged();
            ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLLL = true;
            ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJL = null;
            View enterManuallyLayout = ((AddressEditDetailActivity) au2S15S0100000_4.l0)._$_findCachedViewById(R.id.cx4);
            o.LJIIIIZZ(enterManuallyLayout, "enterManuallyLayout");
            OUP.LJIJJLI(enterManuallyLayout);
            C78946Uyc.LJJII((AddressEditDetailActivity) au2S15S0100000_4.l0, new C70917RsP(), C27019Aj1.LJLIL);
        }
    }

    public static final void LIZ$101(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        String str;
        AddressLocation addressLocation;
        String str2;
        Region region;
        String str3;
        String str4;
        String str5;
        String str6;
        Object obj;
        Region region2;
        String str7;
        String str8;
        List<Region> list;
        Region region3;
        Address address;
        Region region4;
        String str9;
        if (view != null) {
            List LJJIJIIJI = C47261Igj.LJJIJIIJI("MY", "TH", "SG");
            AddressPageStarter.AddressEditDetailEnterParams addressEditDetailEnterParams = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LJLJLLL;
            HashMap<String, Object> hashMap = null;
            if (addressEditDetailEnterParams != null && (address = addressEditDetailEnterParams.address) != null && (region4 = address.region) != null && (str9 = region4.code) != null) {
                str = str9.toUpperCase();
                o.LJIIIIZZ(str, "this as java.lang.String).toUpperCase()");
            } else {
                str = null;
            }
            if (!ORZ.LJLJJI(str, LJJIJIIJI)) {
                C27196Als.LIZ.getClass();
                if (((AddressSearchMapConfig) C27196Als.LIZJ.getValue()).pinMovable || ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJL != null || !((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJLLL) {
                    Address address2 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJLJ;
                    if ((address2 == null || address2.districts == null) && ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJL == null) {
                        AddressEditDetailViewModel LLFZ = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ();
                        Address Iv0 = LLFZ.Iv0(LLFZ.LJLLI);
                        if (Iv0 != null) {
                            C26059AKp.LIZ().LIZ("ec_change_address_on_edit_detail", C27739Aud.LJI(Iv0));
                        }
                        ((AddressEditDetailActivity) au2S15S0100000_4.l0).onBackPressed();
                        return;
                    }
                    InputItemData inputItemData = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLLILLLL;
                    if (inputItemData == null || (addressLocation = inputItemData.addressLocation) == null || (str2 = addressLocation.addressMapSchema) == null) {
                        return;
                    }
                    AddressEditDetailViewModel LLFZ2 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ();
                    Address Iv02 = LLFZ2.Iv0(LLFZ2.LJLLI);
                    C72264SXs.LIZ((AddressEditDetailActivity) au2S15S0100000_4.l0).LJIIIIZZ(C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ("address", Iv02))), "origin_district");
                    Address address3 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJLJ;
                    boolean z = true;
                    if (address3 != null && (list = address3.districts) != null) {
                        ListIterator<Region> listIterator = list.listIterator(list.size());
                        while (true) {
                            if (listIterator.hasPrevious()) {
                                region3 = listIterator.previous();
                                if (region3.latitude != null) {
                                    break;
                                }
                            } else {
                                region3 = null;
                                break;
                            }
                        }
                        region = region3;
                    } else {
                        region = null;
                    }
                    CandInputData candInputData = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJL;
                    if (candInputData == null || (str3 = candInputData.latitude) == null) {
                        if (region != null) {
                            str3 = region.latitude;
                        } else {
                            str3 = null;
                        }
                    }
                    CandInputData candInputData2 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJL;
                    if (candInputData2 == null || (str4 = candInputData2.longitude) == null) {
                        if (region != null) {
                            str4 = region.longitude;
                        } else {
                            str4 = null;
                        }
                    }
                    CandInputData candInputData3 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ().LJLJL;
                    if (candInputData3 != null) {
                        str5 = candInputData3.autocompleteAddressId;
                    } else {
                        str5 = null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    C27194Alq c27194Alq = MapLocateData.Companion;
                    AddressEditDetailActivity addressEditDetailActivity = (AddressEditDetailActivity) au2S15S0100000_4.l0;
                    String str10 = addressEditDetailActivity.LJLJLJ;
                    if (addressEditDetailActivity.LLFZ().LJLJL == null) {
                        z = false;
                    }
                    String LJJJJZ = V1M.LJJJJZ(z);
                    C27196Als.LIZ.getClass();
                    MapLocateData mapLocateData = new MapLocateData(str4, str3, Iv02, str5, str10, null, LJJJJZ, V1M.LJJJJZ(((AddressSearchMapConfig) C27196Als.LIZJ.getValue()).pinMovable));
                    c27194Alq.getClass();
                    linkedHashMap.putAll(C27194Alq.LIZ(mapLocateData));
                    AddressPageStarter.AddressEditDetailEnterParams addressEditDetailEnterParams2 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LJLJLLL;
                    if (addressEditDetailEnterParams2 != null && (str8 = addressEditDetailEnterParams2.trackParams) != null) {
                        hashMap = C27739Aud.LJII(str8);
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
                    linkedHashMap2.put("previous_page", "shipping_address");
                    AddressPageStarter.AddressEditDetailEnterParams addressEditDetailEnterParams3 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LJLJLLL;
                    if (addressEditDetailEnterParams3 == null || addressEditDetailEnterParams3.address == null) {
                        str6 = "add";
                    } else {
                        str6 = "edit";
                    }
                    linkedHashMap2.put("fill_type", str6);
                    if (Iv02 != null && (region2 = Iv02.region) != null && (str7 = region2.code) != null) {
                        String lowerCase = str7.toLowerCase(Locale.ROOT);
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        linkedHashMap2.put("location", lowerCase);
                    }
                    if (hashMap != null && (obj = hashMap.get("entrance_info")) != null) {
                        linkedHashMap2.put("entrance_info", obj);
                    }
                    linkedHashMap.put("trackParams", linkedHashMap2);
                    C26867AgZ.LIZIZ((AddressEditDetailActivity) au2S15S0100000_4.l0, str2, linkedHashMap, false).open();
                    AddressEditDetailActivity addressEditDetailActivity2 = (AddressEditDetailActivity) au2S15S0100000_4.l0;
                    addressEditDetailActivity2.LJLJL = "next";
                    C78946Uyc.LJJII(addressEditDetailActivity2, new C70917RsP(), C27039AjL.LJLIL);
                    return;
                }
            }
            AddressEditDetailViewModel LLFZ3 = ((AddressEditDetailActivity) au2S15S0100000_4.l0).LLFZ();
            Address Iv03 = LLFZ3.Iv0(LLFZ3.LJLLI);
            if (Iv03 != null) {
                C26059AKp.LIZ().LIZ("ec_change_address_on_edit_detail", C27739Aud.LJI(Iv03));
            }
            ((AddressEditDetailActivity) au2S15S0100000_4.l0).onBackPressed();
        }
    }

    public static final void LIZ$102(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpViewModel) ((UsPdpAllReviewsVH) au2S15S0100000_4.l0).LJLIL.getValue()).Kw0(1, view, "review_entrance", "all_customer_review", null);
    }

    public static final void LIZ$103(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((UsPdpReviewTitleVH) au2S15S0100000_4.l0).getVm().Kw0(1, view, "review_entrance", "review_entrance", null);
    }

    public static final void LIZ$104(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1R) au2S15S0100000_4.l0).getOnViewMoreInstallmentPlansClickListener().invoke();
        }
    }

    public static final void LIZ$105(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1R) au2S15S0100000_4.l0).getOnViewMoreSubPaymentsClickListener().invoke();
        }
    }

    public static final void LIZ$106(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1R) au2S15S0100000_4.l0).getOnCheckedListener().invoke();
        }
    }

    public static final void LIZ$107(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            OrderSubmitViewModel M = ((PaymentInfoVH2) au2S15S0100000_4.l0).M();
            Context context = ((PaymentInfoVH2) au2S15S0100000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            M.Hw0(context, C79234V7u.LJJIJ(view), false);
            C27949Ay1.LJJI("payment_method", ((PaymentInfoVH2) au2S15S0100000_4.l0).M().fw0(false), null, null, null, null, null, null, null, 1020);
        }
    }

    public static final void LIZ$108(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            OrderSubmitViewModel M = ((PaymentInfoVH2) au2S15S0100000_4.l0).M();
            Context context = ((PaymentInfoVH2) au2S15S0100000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            M.Hw0(context, C79234V7u.LJJIJ(view), false);
            C27949Ay1.LJIJ("view_all_payment", "view_all_payment", ((PaymentInfoVH2) au2S15S0100000_4.l0).M().fw0(false), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435440);
        }
    }

    public static final void LIZ$109(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((SearchInputItemViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78996UzQ.LJJJJ(itemView);
        }
    }

    public static final void LIZ$11(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$110(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((SearchInputItemViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78996UzQ.LJJJJ(itemView);
        }
    }

    public static final void LIZ$111(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((SwitchInputItemViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78996UzQ.LJJJJ(itemView);
        }
    }

    public static final void LIZ$112(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S15S0100000_4.l0).invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$113(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        M06 m06;
        if (view != null) {
            UsShopProfileVH usShopProfileVH = (UsShopProfileVH) au2S15S0100000_4.l0;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            PdpViewModel viewModel = usShopProfileVH.getViewModel();
            o.LJIIIZ(viewModel, "<this>");
            Activity LIZ = C27740Aue.LIZ(context);
            o.LJIIIIZZ(LIZ, "getActivity(context)");
            C70656RoC.LIZ(LIZ, new AqS151S0200000_4(viewModel, context, 1));
            C70414RkI c70414RkI = usShopProfileVH.getViewModel().LLFII;
            if (c70414RkI != null) {
                if (((C27550Ara) usShopProfileVH.getItem()).LJIIIIZZ) {
                    m06 = M06.NORMAL;
                } else {
                    m06 = M06.NONE;
                }
                C70414RkI.LJJIL(c70414RkI, "contact_seller", null, null, m06.getValue(), 0, 6);
            }
        }
    }

    public static final void LIZ$114(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((UsShopProfileVH) au2S15S0100000_4.l0).L("view_shop");
        }
    }

    public static final void LIZ$115(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((UsShopProfileVH) au2S15S0100000_4.l0).L("shop_pic");
        }
    }

    public static final void LIZ$116(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((UsShopProfileVH) au2S15S0100000_4.l0).L("shop_name");
        }
    }

    public static final void LIZ$117(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ASQ.LJ((SizeGuideFragment) au2S15S0100000_4.l0, ASX.LIZ);
        }
    }

    public static final void LIZ$118(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Object obj;
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            List<String> urls = ((Image) au2S15S0100000_4.l0).getUrls();
            if (urls == null || (obj = ORZ.LJLLLL(urls)) == null) {
                obj = "";
            }
            GalleryUtil.LIZ(context, 0, 1, C47261Igj.LJJIJ(obj), null, null, null, null, null, 32752);
        }
    }

    public static final void LIZ$119(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.r9d);
            c26227ARb.LIZ(R.string.r9b);
            UC0.LIZJ(c26227ARb, new AqS170S0100000_4((USDeleteButtonViewHolder) au2S15S0100000_4.l0, 1627));
            c26227ARb.LJII = true;
            c26227ARb.LJI().LIZLLL();
            C27241Amb.LIZIZ(((USDeleteButtonViewHolder) au2S15S0100000_4.l0).getViewModel().Wv0(), "delete_address", null, null, null, 254);
            View itemView = ((USDeleteButtonViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(itemView);
            if (LJIILIIL != null) {
                C78946Uyc.LJJII(LJIILIIL, new C70917RsP(), new AqS170S0100000_4((USDeleteButtonViewHolder) au2S15S0100000_4.l0, 1628));
            }
        }
    }

    public static final void LIZ$12(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$120(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((USSwitchInputItemVH) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78996UzQ.LJJJJ(itemView);
        }
    }

    public static final void LIZ$121(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Activity activity;
        if (view != null) {
            Context context = ((AddressAdapter.AddAddressBarHolder) au2S15S0100000_4.l0).itemView.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                ((AddressListViewModel) ((AddressAdapter.AddAddressBarHolder) au2S15S0100000_4.l0).LJLILLLLZI.getValue()).Iv0(activity, C78948Uye.LJIILIIL(view));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$122(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            TtfSACodVH ttfSACodVH = (TtfSACodVH) au2S15S0100000_4.l0;
            String str = ((C26630Ack) ttfSACodVH.getItem()).LIZIZ;
            if (str != null) {
                Context context = ttfSACodVH.itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                C26867AgZ.LIZIZ(context, str, C113554cx.LJJJLIIL(), false).open();
            }
            View view2 = ttfSACodVH.itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), C26629Acj.LJLIL);
        }
    }

    public static final void LIZ$123(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Activity activity;
        if (view != null) {
            Context context = ((UsAddAddressVH) au2S15S0100000_4.l0).itemView.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                ((AddressListViewModel) ((UsAddAddressVH) au2S15S0100000_4.l0).LJLIL.getValue()).Iv0(activity, C78948Uye.LJIILIIL(view));
            }
        }
    }

    public static final void LIZ$13(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        String str;
        Object obj;
        String str2;
        InputItemDTO inputItemDTO;
        Region region;
        String str3;
        if (view != null) {
            AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
            if (addressEditFragment != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70921RsT(), new AqS170S0100000_4((RegionSelectHelper) au2S15S0100000_4.l0, 194));
            }
            FragmentManager fragmentManager = ((RegionSelectHelper) au2S15S0100000_4.l0).getFragmentManager();
            if (((RegionSelectHelper) au2S15S0100000_4.l0).getViewModel().LLFF == null) {
                str = "add";
            } else {
                str = "edit";
            }
            AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((RegionSelectHelper) au2S15S0100000_4.l0, 122);
            AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4((RegionSelectHelper) au2S15S0100000_4.l0, 195);
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(((RegionSelectHelper) au2S15S0100000_4.l0).getTargetView());
            C27021Aj3 inputItem = ((RegionSelectHelper) au2S15S0100000_4.l0).getInputItem();
            String str4 = null;
            if (inputItem != null) {
                obj = inputItem.LIZIZ;
            } else {
                obj = null;
            }
            if ((obj instanceof Region) && (region = (Region) obj) != null && (str3 = region.code) != null) {
                str2 = str3.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(str2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                str2 = null;
            }
            ClientConfig clientConfig = ((RegionSelectHelper) au2S15S0100000_4.l0).getViewModel().LLIIJI;
            C27021Aj3 inputItem2 = ((RegionSelectHelper) au2S15S0100000_4.l0).getInputItem();
            if (inputItem2 != null && (inputItemDTO = inputItem2.LIZ) != null) {
                str4 = inputItemDTO.key;
            }
            C27452Aq0.LIZIZ(1, null, null, 1, fragmentManager, str, aqS154S0100000_4, aqS170S0100000_4, null, null, null, null, LJIILIIL, false, str2, null, null, null, null, C27452Aq0.LIZ(clientConfig, str4), 1007117);
        }
    }

    public static final void LIZ$14(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((RegionSelectHelper) au2S15S0100000_4.l0).getTargetView());
        }
    }

    public static final void LIZ$15(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((RegionSelectHelper) au2S15S0100000_4.l0).getTargetView());
        }
    }

    public static final void LIZ$16(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((RegionSelectHelper) au2S15S0100000_4.l0).getTargetView());
        }
    }

    public static final void LIZ$17(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((TextInputHelper) au2S15S0100000_4.l0).targetView);
        }
    }

    public static final void LIZ$18(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((TextInputHelper) au2S15S0100000_4.l0).targetView);
        }
    }

    public static final void LIZ$19(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((TextInputHelper) au2S15S0100000_4.l0).targetView);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$2(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null && C78857UxB.LJJJIL(((C26735AeR) ((USLogisticSelectByZipcodeVH) au2S15S0100000_4.l0).getItem()).LIZ)) {
            AttributeSet attributeSet = null;
            C26937Ahh.LIZLLL("apply", "next", null, null, null, null, "choose_your_location", 60);
            C26018AJa c26018AJa = ((USLogisticSelectByZipcodeVH) au2S15S0100000_4.l0).LJLILLLLZI;
            int i = 0;
            if (c26018AJa != null) {
                USLogisticSelectByZipcodeVH.L(c26018AJa.getEditText());
                if (c26018AJa.LJLJLJ == null) {
                    Context context = c26018AJa.getContext();
                    o.LJIIIIZZ(context, "context");
                    C116414hZ c116414hZ = new C116414hZ(context, attributeSet, 6, i);
                    c26018AJa.LJLJLJ = c116414hZ;
                    int i2 = C26018AJa.LJLLI;
                    c116414hZ.setLayoutParams(new FrameLayout.LayoutParams(i2, i2));
                    C26338AVi.LJI(c116414hZ, Integer.valueOf(C26018AJa.LJLLILLLL), null, Integer.valueOf(C26018AJa.LJLLJ), null, false, 26);
                }
                c26018AJa.LIZLLL(c26018AJa.LJLJLJ);
                C116414hZ c116414hZ2 = c26018AJa.LJLJLJ;
                if (c116414hZ2 != null) {
                    c116414hZ2.setVisibility(0);
                }
                ((USLogisticSelectByZipcodeVH) au2S15S0100000_4.l0).LJLJJL = true;
            }
            USLogisticSelectByZipcodeVH uSLogisticSelectByZipcodeVH = (USLogisticSelectByZipcodeVH) au2S15S0100000_4.l0;
            if (!uSLogisticSelectByZipcodeVH.LJLJJI) {
                uSLogisticSelectByZipcodeVH.M().Iv0(((C26735AeR) ((USLogisticSelectByZipcodeVH) au2S15S0100000_4.l0).getItem()).LIZ, false);
            } else {
                uSLogisticSelectByZipcodeVH.M().Lv0(((C26735AeR) ((USLogisticSelectByZipcodeVH) au2S15S0100000_4.l0).getItem()).LIZ);
            }
        }
    }

    public static final void LIZ$20(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$21(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$22(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$23(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((PhoneInputItemViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78996UzQ.LJJJJ(itemView);
        }
    }

    public static final void LIZ$24(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((PhoneInputItemViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78996UzQ.LJJJJ(itemView);
        }
    }

    public static final void LIZ$25(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            View itemView = ((SearchInputItemViewHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70917RsP(), C27312Ank.LJLIL);
            ((SearchInputItemViewHolder) au2S15S0100000_4.l0).M(false);
            ((SearchInputItemViewHolder) au2S15S0100000_4.l0).L();
            AddressEditViewModel viewModel = ((SearchInputItemViewHolder) au2S15S0100000_4.l0).getViewModel();
            Boolean bool = Boolean.FALSE;
            AddressEditViewModel.Uv0(viewModel, 0, bool, bool, null, 8);
        }
    }

    public static final void LIZ$26(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        ReachableAddress reachableAddress;
        String str;
        Integer num;
        Boolean bool;
        String str2;
        Map<String, String> map;
        String str3;
        String str4;
        String str5;
        Address address;
        List<ReachableAddress> list;
        if (view != null) {
            ActivityC45651qj requireActivity = ((AddressListPanelFragment) au2S15S0100000_4.l0).requireActivity();
            o.LJIIIIZZ(requireActivity, "fragment.requireActivity()");
            InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL(view);
            if (!((AddressListPanelFragment) au2S15S0100000_4.l0).getViewModel().Nv0()) {
                Integer num2 = ((AddressListPanelFragment) au2S15S0100000_4.l0).getViewModel().LJZ;
                if (num2 == null || num2.intValue() != 4) {
                    ((AddressListPanelFragment) au2S15S0100000_4.l0).getViewModel().Tv0(requireActivity, LJIILIIL, new AqS154S0100000_4((AddressListPanelFragment) au2S15S0100000_4.l0, 137));
                    return;
                }
                AddressListViewModel viewModel = ((AddressListPanelFragment) au2S15S0100000_4.l0).getViewModel();
                AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((AddressListPanelFragment) au2S15S0100000_4.l0, 136);
                String str6 = "";
                Integer num3 = viewModel.LJZ;
                if (num3 == null || num3.intValue() != 4) {
                    return;
                }
                AddressListState lv0 = viewModel.lv0();
                AddressListData addressListData = viewModel.LJZL;
                if (addressListData != null && (list = addressListData.addressList) != null) {
                    reachableAddress = (ReachableAddress) ORZ.LJLLLLLL(0, list);
                } else {
                    reachableAddress = null;
                }
                String selectAddressId = lv0.getSelectAddressId();
                if (selectAddressId == null) {
                    return;
                }
                if (reachableAddress != null && (address = reachableAddress.address) != null) {
                    str = address.id;
                } else {
                    str = null;
                }
                if (o.LJ(selectAddressId, str)) {
                    C26059AKp.LIZ().LIZ("ec_change_address_on_order", C27739Aud.LJI(new ChangeOnOrderStruct(1, null)));
                    aqS154S0100000_4.invoke();
                    return;
                }
                try {
                    Map<String, String> map2 = viewModel.LJZI;
                    if (map2 != null && (str5 = map2.get("change_addr_order_type")) != null) {
                        num = Integer.valueOf(CastIntegerProtector.parseInt(str5));
                    } else {
                        num = null;
                    }
                    try {
                        Map<String, String> map3 = viewModel.LJZI;
                        if (map3 != null && (str4 = map3.get("change_addr_order_id")) != null) {
                            str6 = str4;
                        }
                        Map<String, String> map4 = viewModel.LJZI;
                        if (map4 != null && (str3 = map4.get("from_incentive")) != null) {
                            bool = Boolean.valueOf(Boolean.parseBoolean(str3));
                        } else {
                            bool = null;
                        }
                        try {
                            map = viewModel.LJZI;
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        bool = null;
                        str2 = null;
                        AddressApi.LIZ.getClass();
                        viewModel.disposeOnClear(C36671EaJ.LIZIZ(((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).changeOnOrder(new ChangeOrderShippingAddressRequest(num, str6, selectAddressId, bool, str2, null)), "shipping_info", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(aqS154S0100000_4, 165), new AfS56S0100000_4(aqS154S0100000_4, 166)));
                        return;
                    }
                } catch (Exception unused3) {
                    num = null;
                }
                if (map != null) {
                    str2 = map.get("incentive_record_id");
                    AddressApi.LIZ.getClass();
                    viewModel.disposeOnClear(C36671EaJ.LIZIZ(((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).changeOnOrder(new ChangeOrderShippingAddressRequest(num, str6, selectAddressId, bool, str2, null)), "shipping_info", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(aqS154S0100000_4, 165), new AfS56S0100000_4(aqS154S0100000_4, 166)));
                    return;
                }
                str2 = null;
                AddressApi.LIZ.getClass();
                viewModel.disposeOnClear(C36671EaJ.LIZIZ(((AddressApi) C27096AkG.LIZIZ.create(AddressApi.class)).changeOnOrder(new ChangeOrderShippingAddressRequest(num, str6, selectAddressId, bool, str2, null)), "shipping_info", new OSZ[0]).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(aqS154S0100000_4, 165), new AfS56S0100000_4(aqS154S0100000_4, 166)));
                return;
            }
            if (!((AddressListPanelFragment) au2S15S0100000_4.l0)._$_findCachedViewById(R.id.aoe).isEnabled()) {
                return;
            }
            AddressListPanelFragment addressListPanelFragment = (AddressListPanelFragment) au2S15S0100000_4.l0;
            addressListPanelFragment.withState(addressListPanelFragment.getViewModel(), new AqS170S0100000_4((AddressListPanelFragment) au2S15S0100000_4.l0, 214));
        }
    }

    public static final void LIZ$27(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null && ((AddressListNativeStrategy) au2S15S0100000_4.l0).getActivity()._$_findCachedViewById(R.id.auf).isEnabled()) {
            AddressListNativeStrategy addressListNativeStrategy = (AddressListNativeStrategy) au2S15S0100000_4.l0;
            addressListNativeStrategy.withState(addressListNativeStrategy.getViewModel(), new AqS170S0100000_4((AddressListNativeStrategy) au2S15S0100000_4.l0, 220));
        }
    }

    public static final void LIZ$28(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        TuxSheet tuxSheet;
        if (view != null && (tuxSheet = ((ZipCodePickerDialogFragment) au2S15S0100000_4.l0).LJLIL) != null) {
            tuxSheet.dismiss();
        }
    }

    public static final void LIZ$29(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            AddressSelectFragment addressSelectFragment = (AddressSelectFragment) au2S15S0100000_4.l0;
            addressSelectFragment.withState(addressSelectFragment.getViewModel(), new AqS170S0100000_4((AddressSelectFragment) au2S15S0100000_4.l0, 230));
        }
    }

    public static final void LIZ$3(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S15S0100000_4.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$30(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((AddressSelectFragment) au2S15S0100000_4.l0).getDeliveryPanelViewModel().Kv0(EnumC26931Ahb.PUSH_AREA_PAGE);
            C26937Ahh.LIZLLL("select_location", "next", null, null, null, null, ((AddressSelectFragment) au2S15S0100000_4.l0).getSubPageName(), 60);
        }
    }

    public static final void LIZ$31(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            DeliveryPanelViewModel viewModel = ((LogisticSelectFragment) au2S15S0100000_4.l0).getViewModel();
            viewModel.getClass();
            viewModel.withState(new AqS170S0100000_4(viewModel, 1640));
            LogisticSelectFragment logisticSelectFragment = (LogisticSelectFragment) au2S15S0100000_4.l0;
            logisticSelectFragment.withState(logisticSelectFragment.getViewModel(), new AqS170S0100000_4((LogisticSelectFragment) au2S15S0100000_4.l0, 237));
            C26937Ahh.LJ(((LogisticSelectFragment) au2S15S0100000_4.l0).getViewModel().LJLLI, "confirm", null, 4);
        }
    }

    public static final void LIZ$32(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ShipToBarHolder shipToBarHolder = (ShipToBarHolder) au2S15S0100000_4.l0;
            shipToBarHolder.withState((JediViewModel) shipToBarHolder.LJLILLLLZI.getValue(), new AqS170S0100000_4((ShipToBarHolder) au2S15S0100000_4.l0, 240));
        }
    }

    public static final void LIZ$33(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        int i;
        UserTrustItem userTrustItem;
        String str;
        if (view != null) {
            B1K paymentLogger = ((PaymentFragment) au2S15S0100000_4.l0).getPaymentLogger();
            int i2 = 1;
            if (((PaymentFragment) au2S15S0100000_4.l0).getViewModel().LJLJL == null) {
                i = 0;
            } else {
                i = 1;
            }
            paymentLogger.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(paymentLogger.LIZ);
            linkedHashMap.put("page_name", "payment_method");
            linkedHashMap.put("button_name", "secure_payments");
            linkedHashMap.put("is_with_delivery_info", Integer.valueOf(i));
            C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
            Bundle bundle = new Bundle();
            PaymentMethodsData paymentMethodsData = ((PaymentFragment) au2S15S0100000_4.l0).getEnterParams().paymentData;
            if (paymentMethodsData != null && (userTrustItem = paymentMethodsData.securePayment) != null && (str = userTrustItem.title) != null) {
                bundle.putString("title", str);
            }
            if (((PaymentFragment) au2S15S0100000_4.l0).getViewModel().LJLJL == null) {
                i2 = 0;
            }
            bundle.putInt("with_delivery_info", i2);
            C79234V7u.LJJIJIL(bundle, view);
            ActivityC45651qj mo49getActivity = ((PaymentFragment) au2S15S0100000_4.l0).mo49getActivity();
            if (mo49getActivity != null) {
                FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "act.supportFragmentManager");
                C27163AlL.LIZ(supportFragmentManager, bundle, ((PaymentFragment) au2S15S0100000_4.l0).getEnterParams().paymentData, ((PaymentFragment) au2S15S0100000_4.l0).getEnterParams().trackParams);
            }
        }
    }

    public static final void LIZ$34(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        int i;
        PaymentMethodsData paymentMethodsData;
        HashMap<String, Object> hashMap;
        PaymentMethodsData paymentMethodsData2;
        UserTrustItem userTrustItem;
        String str;
        if (view != null) {
            Bundle bundle = new Bundle();
            EnterParams enterParams = ((CCDCAddCardHalfFragment) au2S15S0100000_4.l0).getEnterParams();
            if (enterParams != null && (paymentMethodsData2 = enterParams.paymentData) != null && (userTrustItem = paymentMethodsData2.securePayment) != null && (str = userTrustItem.title) != null) {
                bundle.putString("title", str);
            }
            Integer num = C28112B1o.LIZLLL;
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            bundle.putInt("with_delivery_info", i);
            String str2 = C28112B1o.LJ;
            if (str2 == null) {
                str2 = "add";
            }
            bundle.putString("fill_type", str2);
            C79234V7u.LJJIJIL(bundle, view);
            ActivityC45651qj mo49getActivity = ((CCDCAddCardHalfFragment) au2S15S0100000_4.l0).mo49getActivity();
            if (mo49getActivity != null) {
                FragmentManager supportFragmentManager = mo49getActivity.getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "act.supportFragmentManager");
                EnterParams enterParams2 = ((CCDCAddCardHalfFragment) au2S15S0100000_4.l0).getEnterParams();
                if (enterParams2 != null) {
                    paymentMethodsData = enterParams2.paymentData;
                } else {
                    paymentMethodsData = null;
                }
                EnterParams enterParams3 = ((CCDCAddCardHalfFragment) au2S15S0100000_4.l0).getEnterParams();
                if (enterParams3 != null) {
                    hashMap = enterParams3.trackParams;
                } else {
                    hashMap = null;
                }
                C27163AlL.LIZ(supportFragmentManager, bundle, paymentMethodsData, hashMap);
            }
            C28112B1o.LIZLLL("secure_payments", null, 30);
        }
    }

    public static final void LIZ$35(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        String str;
        BindInfo bindInfo;
        if (view != null) {
            PaymentMethod paymentMethod = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
            String str2 = null;
            if (paymentMethod != null && (bindInfo = paymentMethod.bindInfo) != null) {
                str = bindInfo.buttonText;
            } else {
                str = null;
            }
            if (C78857UxB.LJJJIL(str)) {
                return;
            }
            InterfaceC88472Yns<String, C76800UCe> onCheckedListener = ((PaymentMethodView) au2S15S0100000_4.l0).getOnCheckedListener();
            PaymentMethod paymentMethod2 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.id;
            }
            onCheckedListener.invoke(str2);
        }
    }

    public static final void LIZ$36(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        String str;
        String str2;
        CommuteType commuteType;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        BindInfo bindInfo;
        String str8;
        String str9;
        BindInfo bindInfo2;
        ExceptionUX exceptionUX;
        DialogContent dialogContent;
        Availability availability;
        CommuteInfo LJ;
        BindInfo bindInfo3;
        if (view != null) {
            HashMap<String, Object> trackParams = ((PaymentMethodView) au2S15S0100000_4.l0).getTrackParams();
            if (trackParams != null) {
                Context context = ((PaymentMethodView) au2S15S0100000_4.l0).getContext();
                o.LJIIIIZZ(context, "context");
                C72264SXs.LIZ(context).LJIIIIZZ(C27739Aud.LJI(trackParams), "payment_track_params");
            }
            PaymentMethod paymentMethod = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
            String str10 = null;
            if (paymentMethod != null && (bindInfo3 = paymentMethod.bindInfo) != null) {
                str = bindInfo3.schema;
            } else {
                str = null;
            }
            PaymentMethod paymentMethod2 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
            if (paymentMethod2 != null) {
                str2 = paymentMethod2.packageName;
            } else {
                str2 = null;
            }
            PaymentMethod paymentMethod3 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
            if (paymentMethod3 != null && (LJ = paymentMethod3.LJ()) != null) {
                commuteType = LJ.commuteType;
            } else {
                commuteType = null;
            }
            PaymentMethod paymentMethod4 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
            if (paymentMethod4 != null && (availability = paymentMethod4.availability) != null) {
                str3 = availability.statusCode;
            } else {
                str3 = null;
            }
            if (o.LJ(str3, "16")) {
                PaymentMethod paymentMethod5 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                if (paymentMethod5 != null && (exceptionUX = paymentMethod5.exceptionUX) != null && (dialogContent = exceptionUX.getDialogContent()) != null) {
                    PaymentMethodView paymentMethodView = (PaymentMethodView) au2S15S0100000_4.l0;
                    paymentMethodView.displayDialog(dialogContent, new AqS154S0100000_4(paymentMethodView, 222));
                } else {
                    InterfaceC88472Yns<PaymentMethod, C76800UCe> removeBindMethod = ((PaymentMethodView) au2S15S0100000_4.l0).getRemoveBindMethod();
                    if (removeBindMethod != null) {
                        removeBindMethod.invoke(((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod());
                    }
                }
                B1K paymentLogger = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentLogger();
                if (paymentLogger != null) {
                    PaymentMethod paymentMethod6 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                    if (paymentMethod6 != null) {
                        str8 = paymentMethod6.LJIIL();
                    } else {
                        str8 = null;
                    }
                    PaymentMethod paymentMethod7 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                    if (paymentMethod7 != null) {
                        str9 = paymentMethod7.extraInfo;
                    } else {
                        str9 = null;
                    }
                    Boolean valueOf = Boolean.valueOf(C78857UxB.LJJJIL(str9));
                    PaymentMethod paymentMethod8 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                    if (paymentMethod8 != null && (bindInfo2 = paymentMethod8.bindInfo) != null) {
                        str10 = bindInfo2.bindStatus;
                    }
                    C76542zS.LIZIZ("tiktokec_button_click", paymentLogger.LIZ, new AqS10S2200000_4(str8, str10, Boolean.TRUE, valueOf, 0));
                    return;
                }
                return;
            }
            if (str != null && C78857UxB.LJJJIL(str)) {
                if (commuteType != null) {
                    str4 = C61841OOv.LIZ(commuteType);
                } else {
                    str4 = null;
                }
                Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
                buildUpon.appendQueryParameter("source", "payment_method");
                if (str4 != null && str4.length() != 0) {
                    buildUpon.appendQueryParameter("commute_type", str4);
                }
                PaymentMethod paymentMethod9 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                if (paymentMethod9 != null) {
                    str5 = UUID.randomUUID().toString();
                    paymentMethod9.LIZLLL = str5;
                    if (str5 != null && str5.length() != 0) {
                        buildUpon.appendQueryParameter("idempotency_key", str5);
                    }
                } else {
                    str5 = null;
                }
                Context context2 = ((PaymentMethodView) au2S15S0100000_4.l0).getContext();
                o.LJIIIIZZ(context2, "context");
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "builder.toString()");
                C61836OOq.LIZ(context2, str5, str2, builder, commuteType, ((PaymentMethodView) au2S15S0100000_4.l0).getPaySource());
                B1K paymentLogger2 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentLogger();
                if (paymentLogger2 == null) {
                    return;
                }
                PaymentMethod paymentMethod10 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                if (paymentMethod10 != null) {
                    str6 = paymentMethod10.LJIIL();
                } else {
                    str6 = null;
                }
                PaymentMethod paymentMethod11 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                if (paymentMethod11 != null) {
                    str7 = paymentMethod11.extraInfo;
                } else {
                    str7 = null;
                }
                Boolean valueOf2 = Boolean.valueOf(C78857UxB.LJJJIL(str7));
                PaymentMethod paymentMethod12 = ((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod();
                if (paymentMethod12 != null && (bindInfo = paymentMethod12.bindInfo) != null) {
                    str10 = bindInfo.bindStatus;
                }
                C76542zS.LIZIZ("tiktokec_button_click", paymentLogger2.LIZ, new AqS10S2200000_4(str6, str10, Boolean.FALSE, valueOf2, 0));
                return;
            }
            InterfaceC88471Ynr<PaymentMethod, InterfaceC88472Yns<? super String, C76800UCe>, C76800UCe> getBindUrl = ((PaymentMethodView) au2S15S0100000_4.l0).getGetBindUrl();
            if (getBindUrl == null) {
                return;
            }
            getBindUrl.invoke(((PaymentMethodView) au2S15S0100000_4.l0).getPaymentMethod(), new AqS47S1200000_4((PaymentMethodView) au2S15S0100000_4.l0, str2, commuteType, 3));
        }
    }

    public static final void LIZ$37(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C27949Ay1.LJIJ("save", "confirm", ((MessageEditDialogFragment) au2S15S0100000_4.l0).getViewModel().fw0(false), "message", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435440);
            MessageEditDialogFragment messageEditDialogFragment = (MessageEditDialogFragment) au2S15S0100000_4.l0;
            String str = messageEditDialogFragment.LJLJJI;
            if (str != null) {
                messageEditDialogFragment.getViewModel().Qw0(new C26802AfW(str, s.LJZI(String.valueOf(((C19K) ((MessageEditDialogFragment) au2S15S0100000_4.l0)._$_findCachedViewById(R.id.ghv)).getText())).toString()));
            }
            ((MessageEditDialogFragment) au2S15S0100000_4.l0).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$38(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null && C1XY.LJJ()) {
            ((OrderSubmitBottomWidget) au2S15S0100000_4.l0).getViewModel().setState(C27774AvC.LJLIL);
            OrderSubmitBottomWidget orderSubmitBottomWidget = (OrderSubmitBottomWidget) au2S15S0100000_4.l0;
            orderSubmitBottomWidget.withState(orderSubmitBottomWidget.getViewModel(), new AqS170S0100000_4((OrderSubmitBottomWidget) au2S15S0100000_4.l0, 297));
        }
    }

    public static final void LIZ$39(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null && !((OrderSubmitBottomWidget) au2S15S0100000_4.l0).hideSummaryPanel) {
            ((OrderSubmitBottomWidget) au2S15S0100000_4.l0).toggleSummaryPanel();
        }
    }

    public static final void LIZ$4(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S15S0100000_4.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$40(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            HashMap<String, Object> fw0 = ((OrderSubmitBottomWidget) au2S15S0100000_4.l0).getViewModel().fw0(false);
            fw0.put("click_area", "close");
            C27949Ay1.LJJI("discount_reminder", fw0, null, null, null, null, null, null, null, 1020);
            ((OrderSubmitBottomWidget) au2S15S0100000_4.l0).getViewModel().setState(C27804Avg.LJLIL);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$41(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ProductSpecificationViewHolder productSpecificationViewHolder = (ProductSpecificationViewHolder) au2S15S0100000_4.l0;
            int size = ((C27186Ali) productSpecificationViewHolder.getItem()).LJLIL.size();
            for (int i = 4; i < size; i++) {
                ((ViewGroup) productSpecificationViewHolder.itemView.findViewById(R.id.dlx)).addView(productSpecificationViewHolder.M((Specification) ListProtector.get(((C27186Ali) productSpecificationViewHolder.getItem()).LJLIL, i)));
            }
            productSpecificationViewHolder.LJLILLLLZI = true;
            View findViewById = productSpecificationViewHolder.itemView.findViewById(R.id.jk3);
            o.LJIIIIZZ(findViewById, "itemView.see_more");
            findViewById.setVisibility(8);
            ImageView imageView = (ImageView) productSpecificationViewHolder.itemView.findViewById(R.id.jk6);
            o.LJIIIIZZ(imageView, "itemView.see_more_icon");
            imageView.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$42(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        String str;
        if (view != null) {
            PdpPromotionEntranceInfoViewHolder pdpPromotionEntranceInfoViewHolder = (PdpPromotionEntranceInfoViewHolder) au2S15S0100000_4.l0;
            Integer num = ((C27448Apw) pdpPromotionEntranceInfoViewHolder.getItem()).LIZ;
            if (num == null || num.intValue() != 6) {
                str = "unKnown";
            } else {
                str = "promotion";
            }
            View view2 = pdpPromotionEntranceInfoViewHolder.itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS47S1200000_4(pdpPromotionEntranceInfoViewHolder, view, str, 13));
            Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ("trackParams", C113554cx.LJJJLZIJ(new OSZ("entrance_info", ((PdpViewModel) ((PdpPromotionEntranceInfoViewHolder) au2S15S0100000_4.l0).LJLILLLLZI.getValue()).dw0()), new OSZ("previous_page", "product_detail"), new OSZ("product_id", ((PdpViewModel) ((PdpPromotionEntranceInfoViewHolder) au2S15S0100000_4.l0).LJLILLLLZI.getValue()).jw0()))));
            Object value = ((PdpPromotionEntranceInfoViewHolder) au2S15S0100000_4.l0).LJLILLLLZI.getValue();
            Context context = ((PdpPromotionEntranceInfoViewHolder) au2S15S0100000_4.l0).LJLIL;
            o.LJIIIIZZ(context, "context");
            String str2 = ((C27448Apw) ((PdpPromotionEntranceInfoViewHolder) au2S15S0100000_4.l0).getItem()).LIZIZ;
            value.getClass();
            if (str2 == null) {
                return;
            }
            C26867AgZ.LIZIZ(context, str2, LJJIIZI, false).open();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$43(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpPromotionForUSHolder) au2S15S0100000_4.l0).getViewModel();
            Context context = ((PdpPromotionForUSHolder) au2S15S0100000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            viewModel.Jw0(context, ((C27515Ar1) ((PdpPromotionForUSHolder) au2S15S0100000_4.l0).getItem()).LJLIL.schema, new C27516Ar2(((C27515Ar1) ((PdpPromotionForUSHolder) au2S15S0100000_4.l0).getItem()).LJLIL), "product");
        }
    }

    public static final void LIZ$44(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ASQ.LJ((DeliveryBySellerInfoFragment) au2S15S0100000_4.l0, ASX.LIZ);
        }
    }

    public static final void LIZ$45(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((ShopProfileVH) au2S15S0100000_4.l0).onClick("head");
        }
    }

    public static final void LIZ$46(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((ShopProfileVH) au2S15S0100000_4.l0).onClick("visit");
        }
    }

    public static final void LIZ$47(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ASQ.LJ((NoShippingTimeFragment) au2S15S0100000_4.l0, ASX.LIZ);
        }
    }

    public static final void LIZ$48(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        SellerInfo sellerInfo;
        View view2;
        Context context;
        String str;
        Float f;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null) {
            PdpFloatShopWidget pdpFloatShopWidget = (PdpFloatShopWidget) au2S15S0100000_4.l0;
            ProductPackStruct productPackStruct = ((PdpViewModel) pdpFloatShopWidget.LJLIL.getValue()).LJLJLLL;
            String str2 = null;
            if (productPackStruct == null || (sellerInfo = productPackStruct.sellerInfo) == null || (view2 = pdpFloatShopWidget.contentView) == null || (context = view2.getContext()) == null || (str = sellerInfo.shopLink) == null || ujb.o.LJJJJJL(str)) {
                return;
            }
            PdpViewModel pdpViewModel = (PdpViewModel) pdpFloatShopWidget.LJLIL.getValue();
            String str3 = sellerInfo.sellerId;
            String str4 = sellerInfo.rating;
            if (str4 != null) {
                f = C38350F3i.LJJIJLIJ(str4);
            } else {
                f = null;
            }
            StoreLabel storeLabel = sellerInfo.storeLabel;
            if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                str2 = storeOfficialLabel.labelTypeStr;
            }
            PdpViewModel.nw0(pdpViewModel, context, str, str3, f, "floating_window", str2, ((PdpViewModel) pdpFloatShopWidget.LJLIL.getValue()).aw0(), null, null, null, null, null, null, null, 16256);
        }
    }

    public static final void LIZ$49(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$5(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S15S0100000_4.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$50(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$51(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$52(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C27949Ay1.LJIJ("save", "confirm", ((GlobalMessageEditDialogFragment) au2S15S0100000_4.l0).getViewModel().fw0(false), "message", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435440);
            GlobalMessageEditDialogFragment globalMessageEditDialogFragment = (GlobalMessageEditDialogFragment) au2S15S0100000_4.l0;
            InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns = globalMessageEditDialogFragment.LJLJI;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(s.LJZI(String.valueOf(((C19K) globalMessageEditDialogFragment._$_findCachedViewById(R.id.ghv)).getText())).toString());
            }
            ((GlobalMessageEditDialogFragment) au2S15S0100000_4.l0).dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$53(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((TtfMultiShopProfileVH) au2S15S0100000_4.l0).onSubShopClick();
        }
    }

    public static final void LIZ$54(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            USShipToBarVH uSShipToBarVH = (USShipToBarVH) au2S15S0100000_4.l0;
            uSShipToBarVH.withState((JediViewModel) uSShipToBarVH.LJLJJI.getValue(), new AqS170S0100000_4((USShipToBarVH) au2S15S0100000_4.l0, 359));
        }
    }

    public static final void LIZ$55(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Editable text;
        if (view != null) {
            ((C27354AoQ) au2S15S0100000_4.l0).LIZLLL();
            Iterator it = ((ArrayList) ((C27354AoQ) au2S15S0100000_4.l0).LJLIL).iterator();
            while (it.hasNext()) {
                InterfaceC27330Ao2 interfaceC27330Ao2 = (InterfaceC27330Ao2) it.next();
                C19K c19k = (C19K) ((C27354AoQ) au2S15S0100000_4.l0).LIZIZ(R.id.jdi);
                if (c19k != null && (text = c19k.getText()) != null) {
                    text.toString();
                }
                interfaceC27330Ao2.LJIIZILJ();
            }
        }
    }

    public static final void LIZ$56(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("return_policy");
            TtfUkPdpReturnPolicyVH ttfUkPdpReturnPolicyVH = (TtfUkPdpReturnPolicyVH) au2S15S0100000_4.l0;
            C78565UsT.LJJIJIIJIL(ttfUkPdpReturnPolicyVH.LJLIL, new C26653Ad7(ttfUkPdpReturnPolicyVH, null));
        }
    }

    public static final void LIZ$57(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PageNodeMonitorService.LJIIIZ().LJIIIIZZ("return_policy");
            PdpReturnPolicyHolder pdpReturnPolicyHolder = (PdpReturnPolicyHolder) au2S15S0100000_4.l0;
            C78565UsT.LJJIJIIJIL(pdpReturnPolicyHolder.LJLIL, new C26616AcW(pdpReturnPolicyHolder, null));
        }
    }

    public static final void LIZ$58(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null || ((PdpViewModel) ((GlobalProductReviewTitleVH) au2S15S0100000_4.l0).LJLIL.getValue()).rw0()) {
            return;
        }
        ((PdpViewModel) ((GlobalProductReviewTitleVH) au2S15S0100000_4.l0).LJLIL.getValue()).Kw0(1, view, "review_entrance", "review_entrance", null);
    }

    public static final void LIZ$59(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null || ((TtfProductReviewTitleVH) au2S15S0100000_4.l0).getVm().rw0()) {
            return;
        }
        ((TtfProductReviewTitleVH) au2S15S0100000_4.l0).getVm().Kw0(1, view, "review_entrance", "review_entrance", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$6(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            GlobalSpecificationVH globalSpecificationVH = (GlobalSpecificationVH) au2S15S0100000_4.l0;
            int size = ((C27187Alj) globalSpecificationVH.getItem()).LJLIL.size();
            for (int i = 4; i < size; i++) {
                ((ViewGroup) globalSpecificationVH.itemView.findViewById(R.id.dlx)).addView(globalSpecificationVH.L((Specification) ListProtector.get(((C27187Alj) globalSpecificationVH.getItem()).LJLIL, i), i));
            }
            globalSpecificationVH.LJLIL = true;
            View findViewById = globalSpecificationVH.itemView.findViewById(R.id.g5z);
            o.LJIIIIZZ(findViewById, "itemView.ll_see_more_container");
            findViewById.setVisibility(8);
        }
    }

    public static final void LIZ$60(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((TtfProductReviewTitleVH) au2S15S0100000_4.l0).getVm().Kw0(1, view, "size_fitness", "review_entrance", null);
    }

    public static final void LIZ$61(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1S) au2S15S0100000_4.l0).getOnCheckedListener().invoke();
        }
    }

    public static final void LIZ$62(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1S) au2S15S0100000_4.l0).getOnBalanceClickListener().invoke();
        }
    }

    public static final void LIZ$63(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((USPaymentInfoVH) au2S15S0100000_4.l0).LJLIL, new C70917RsP(), B24.LJLIL);
            OrderSubmitViewModel L = ((USPaymentInfoVH) au2S15S0100000_4.l0).L();
            Context context = ((USPaymentInfoVH) au2S15S0100000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Hw0(context, C79234V7u.LJJIJ(((USPaymentInfoVH) au2S15S0100000_4.l0).LJLIL), false);
        }
    }

    public static final void LIZ$64(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null || ((PdpReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().rw0()) {
            return;
        }
        ((PdpReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().Kw0(1, view, "review_entrance", "review_entrance", null);
    }

    public static final void LIZ$65(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().Kw0(1, view, "size_fitness", "review_entrance", null);
    }

    public static final void LIZ$66(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().Kw0(1, view, "review_entrance", "impression_tag", null);
    }

    public static final void LIZ$67(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((PdpViewModel) ((PdpReviewImageViewHolder) au2S15S0100000_4.l0).LJLIL.getValue()).Gw0(0, view, "photo_entrance", null);
        }
    }

    public static final void LIZ$68(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpShopReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().Kw0(2, view, "shop_review_entrance", "shop_review_entrance", null);
    }

    public static final void LIZ$69(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpShopReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().Kw0(2, view, "shop_review_entrance", "other", null);
    }

    public static final void LIZ$7(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper) au2S15S0100000_4.l0).targetView);
        }
    }

    public static final void LIZ$70(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpShopReviewHeadViewHolder) au2S15S0100000_4.l0).getVm().Kw0(2, view, "shop_review_entrance", "other", null);
    }

    public static final void LIZ$71(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view == null) {
            return;
        }
        ((PdpViewModel) ((SeeMoreVH) au2S15S0100000_4.l0).LJLIL.getValue()).Kw0(1, view, "review_entrance", "see_more", null);
    }

    public static final void LIZ$72(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Activity activity;
        if (view != null) {
            Context context = ((GlobalAddAddressHolder) au2S15S0100000_4.l0).itemView.getContext();
            if ((context instanceof Activity) && (activity = (Activity) context) != null) {
                ((AddressListViewModel) ((GlobalAddAddressHolder) au2S15S0100000_4.l0).LJLIL.getValue()).Iv0(activity, C78948Uye.LJIILIIL(view));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$73(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Map<String, Object> LJJJLIIL;
        ShippingDialogDto shippingDialogDto;
        LogisticDTO logisticDTO;
        if (view != null) {
            TtfSAPdpDeliveryHolder ttfSAPdpDeliveryHolder = (TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0;
            C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
            C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS93S0300000_4(ttfSAPdpDeliveryHolder, LIZ, LIZ, 167));
            PdpShipping pdpShipping = ((C27127Akl) ((TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0).getItem()).LJLJI;
            if (pdpShipping != null) {
                LJJJLIIL = pdpShipping.LIZIZ();
            } else {
                LJJJLIIL = C113554cx.LJJJLIIL();
            }
            if (((PdpViewModel) LIZIZ.getValue()).yw0()) {
                TtfSAPdpDeliveryHolder ttfSAPdpDeliveryHolder2 = (TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0;
                ProductPackStruct productPackStruct = ((PdpViewModel) LIZIZ.getValue()).LJLJLLL;
                if (productPackStruct != null && (logisticDTO = productPackStruct.logistic) != null) {
                    shippingDialogDto = logisticDTO.shopifyFallbackDialog;
                } else {
                    shippingDialogDto = null;
                }
                View itemView = ((TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0).itemView;
                o.LJIIIIZZ(itemView, "itemView");
                ttfSAPdpDeliveryHolder2.P(shippingDialogDto, C78948Uye.LJIILIIL(itemView));
                C70414RkI c70414RkI = ((PdpViewModel) LIZIZ.getValue()).LLFII;
                if (c70414RkI != null) {
                    C70414RkI.LJJJIL(c70414RkI, "logistics", (C27127Akl) ((TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0).getItem(), null, LJJJLIIL, 20);
                    return;
                }
                return;
            }
            ((PdpViewModel) LIZIZ.getValue()).Pw0(FT5.LIZ(((TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0).itemView, "itemView.context"), C79234V7u.LJJIJ(view));
            C70414RkI c70414RkI2 = ((PdpViewModel) LIZIZ.getValue()).LLFII;
            if (c70414RkI2 == null) {
                return;
            }
            C70414RkI.LJJJIL(c70414RkI2, "logistics", (C27127Akl) ((TtfSAPdpDeliveryHolder) au2S15S0100000_4.l0).getItem(), "shipping_info", LJJJLIIL, 16);
        }
    }

    public static final void LIZ$74(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        View LLLLIILL;
        boolean z;
        boolean z2;
        C27743Auh c27743Auh = (C27743Auh) au2S15S0100000_4.l0;
        Context context = c27743Auh.getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null) {
            if (C53299Kvv.LIZJ()) {
                if (c27743Auh.LJLJL == null) {
                    c27743Auh.LJLJL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c27743Auh.getContext()), R.layout.c8o, null, false);
                }
                LLLLIILL = c27743Auh.LJLJL;
            } else {
                LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c27743Auh.getContext()), R.layout.c8o, null, false);
            }
            if (LLLLIILL == null) {
                return;
            }
            AI8 ai8 = (AI8) LLLLIILL.findViewById(R.id.jld);
            if (ai8 != null) {
                Context context2 = LLLLIILL.getContext();
                o.LJIIIIZZ(context2, "contentView.context");
                C25991AHz c25991AHz = new C25991AHz(context2);
                if (c27743Auh.LJLJJL == EnumC26917AhN.DEFAULT.getValue()) {
                    z = true;
                } else {
                    z = false;
                }
                c25991AHz.LJIILIIL(z);
                c25991AHz.LJIILL(new IDCListenerS205S0100000_4(c27743Auh, 6));
                ai8.setAccessory(c25991AHz);
            }
            AI8 ai82 = (AI8) LLLLIILL.findViewById(R.id.jlh);
            if (ai82 != null) {
                Context context3 = LLLLIILL.getContext();
                o.LJIIIIZZ(context3, "contentView.context");
                C25991AHz c25991AHz2 = new C25991AHz(context3);
                if (c27743Auh.LJLJJL == EnumC26917AhN.LATEST.getValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c25991AHz2.LJIILIIL(z2);
                c25991AHz2.LJIILL(new IDCListenerS205S0100000_4(c27743Auh, 7));
                ai82.setAccessory(c25991AHz2);
            }
            ASL asl = new ASL();
            C235119Kp c235119Kp = new C235119Kp();
            c235119Kp.LIZJ(0);
            C9KF c9kf = new C9KF();
            c9kf.LIZJ = C44384HbQ.LJJZ(R.string.gkn);
            c235119Kp.LIZJ = c9kf;
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_x_mark_small;
            LIZJ.LIZIZ(new AqS154S0100000_4(c27743Auh, 1125));
            c235119Kp.LIZIZ(LIZJ);
            asl.LIZ.LJLLL = c235119Kp;
            Context context4 = c27743Auh.getContext();
            o.LJIIIIZZ(context4, "context");
            Integer LJI = C79045V0n.LJI(R.attr.c9, context4);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLJL = LJI;
            tuxSheet.LJLLI = LLLLIILL;
            c27743Auh.LJLJJI = tuxSheet;
            C1DG.LJII(LJJIFFI, "it.supportFragmentManager", tuxSheet, "sort");
        }
        FMX.LJIIL("livesdk_following_sort_click", new HashMap());
    }

    public static final void LIZ$75(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PdpSecurityHolder pdpSecurityHolder = (PdpSecurityHolder) au2S15S0100000_4.l0;
            C78565UsT.LJJIJIIJIL(pdpSecurityHolder.LJLIL, new C26682Ada(pdpSecurityHolder, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$76(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        Map<String, Object> LJJJLIIL;
        ShippingDialogDto shippingDialogDto;
        LogisticDTO logisticDTO;
        if (view == null || ((PdpDeliveryHolder) au2S15S0100000_4.l0).getViewModel().qw0()) {
            return;
        }
        PdpDeliveryHolder pdpDeliveryHolder = (PdpDeliveryHolder) au2S15S0100000_4.l0;
        C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS93S0300000_4(pdpDeliveryHolder, LIZ, LIZ, 171));
        PdpShipping pdpShipping = ((C27127Akl) ((PdpDeliveryHolder) au2S15S0100000_4.l0).getItem()).LJLJI;
        if (pdpShipping != null) {
            LJJJLIIL = pdpShipping.LIZIZ();
        } else {
            LJJJLIIL = C113554cx.LJJJLIIL();
        }
        if (((PdpViewModel) LIZIZ.getValue()).yw0()) {
            PdpDeliveryHolder pdpDeliveryHolder2 = (PdpDeliveryHolder) au2S15S0100000_4.l0;
            ProductPackStruct productPackStruct = ((PdpViewModel) LIZIZ.getValue()).LJLJLLL;
            if (productPackStruct != null && (logisticDTO = productPackStruct.logistic) != null) {
                shippingDialogDto = logisticDTO.shopifyFallbackDialog;
            } else {
                shippingDialogDto = null;
            }
            View itemView = ((PdpDeliveryHolder) au2S15S0100000_4.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            pdpDeliveryHolder2.P(shippingDialogDto, C78948Uye.LJIILIIL(itemView));
            C70414RkI c70414RkI = ((PdpViewModel) LIZIZ.getValue()).LLFII;
            if (c70414RkI == null) {
                return;
            }
            C70414RkI.LJJJIL(c70414RkI, "logistics", (C27127Akl) ((PdpDeliveryHolder) au2S15S0100000_4.l0).getItem(), null, LJJJLIIL, 20);
            return;
        }
        ((PdpViewModel) LIZIZ.getValue()).Pw0(FT5.LIZ(((PdpDeliveryHolder) au2S15S0100000_4.l0).itemView, "itemView.context"), C79234V7u.LJJIJ(view));
        C70414RkI c70414RkI2 = ((PdpViewModel) LIZIZ.getValue()).LLFII;
        if (c70414RkI2 == null) {
            return;
        }
        C70414RkI.LJJJIL(c70414RkI2, "logistics", (C27127Akl) ((PdpDeliveryHolder) au2S15S0100000_4.l0).getItem(), "shipping_info", LJJJLIIL, 16);
    }

    public static final void LIZ$77(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((TTFPdpSizeGuideViewHolder) au2S15S0100000_4.l0).L("size_guide", true);
        }
    }

    public static final void LIZ$78(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((TTFPdpSizeGuideViewHolder) au2S15S0100000_4.l0).L("model", false);
        }
    }

    public static final void LIZ$79(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        InterfaceC71003Rtn interfaceC71003Rtn;
        if (view != null) {
            PdpMainViewModel M = ((ProductInfoBrickVH) au2S15S0100000_4.l0).M();
            InterfaceC36571c5 fragment = ((ProductInfoBrickVH) au2S15S0100000_4.l0).getFragment();
            boolean z = !((ProductInfoBrickVH) au2S15S0100000_4.l0).LJLJLLL;
            M.getClass();
            if (fragment instanceof InterfaceC71003Rtn) {
                interfaceC71003Rtn = (InterfaceC71003Rtn) fragment;
            } else {
                interfaceC71003Rtn = null;
            }
            XKX.LIZLLL(M.getAssemVMScope(), null, null, new C69943Rch(M, interfaceC71003Rtn, z, view, null), 3);
        }
    }

    public static final void LIZ$8(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper) au2S15S0100000_4.l0).targetView);
        }
    }

    public static final void LIZ$80(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C27949Ay1.LJJI("add_new_shipping", ((GlobalAddressVH) au2S15S0100000_4.l0).L().fw0(false), null, null, null, null, null, null, null, 1020);
            ((GlobalAddressVH) au2S15S0100000_4.l0).L().Dw0(((GlobalAddressVH) au2S15S0100000_4.l0).itemView, null);
        }
    }

    public static final void LIZ$81(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S15S0100000_4.l0).invoke();
        }
    }

    public static final void LIZ$82(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PdpBodyViewModel L = ((ProductDescSpecBrickVH) au2S15S0100000_4.l0).L();
            L.LJLJI = true;
            L.withState(new AqS170S0100000_4(L, 1119));
        }
    }

    public static final void LIZ$83(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PdpBodyViewModel L = ((ProductDescSpecBrickVH) au2S15S0100000_4.l0).L();
            L.LJLJI = true;
            L.withState(new AqS170S0100000_4(L, 1119));
        }
    }

    public static final void LIZ$84(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        C71096RvI c71096RvI;
        C27959AyB c27959AyB;
        SkuCardStyleInfo skuCardStyleInfo;
        String str;
        if (view != null && (c27959AyB = (c71096RvI = (C71096RvI) au2S15S0100000_4.l0).LJLJLLL) != null && (skuCardStyleInfo = c27959AyB.LJIILLIIL) != null && (str = skuCardStyleInfo.editBundleQuantityToast) != null) {
            C26048AKe c26048AKe = new C26048AKe(c71096RvI);
            c26048AKe.LJI(str);
            c26048AKe.LJII();
        }
    }

    public static final void LIZ$85(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1T) au2S15S0100000_4.l0).getOnCheckedListener().invoke();
        }
    }

    public static final void LIZ$86(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((B1T) au2S15S0100000_4.l0).getOnBalanceClickListener().invoke();
        }
    }

    public static final void LIZ$87(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((GlobalPaymentInfoVH) au2S15S0100000_4.l0).LJLIL, new C70917RsP(), B26.LJLIL);
            OrderSubmitViewModel L = ((GlobalPaymentInfoVH) au2S15S0100000_4.l0).L();
            Context context = ((GlobalPaymentInfoVH) au2S15S0100000_4.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            L.Hw0(context, C79234V7u.LJJIJ(((GlobalPaymentInfoVH) au2S15S0100000_4.l0).LJLIL), false);
        }
    }

    public static final void LIZ$88(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((PdpSkuHolder) au2S15S0100000_4.l0).onClick("title");
        }
    }

    public static final void LIZ$89(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((PdpSkuHolder) au2S15S0100000_4.l0).onClick("subtitle");
        }
    }

    public static final void LIZ$9(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C78996UzQ.LJJJJ(((com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.viewholder.TextInputHelper) au2S15S0100000_4.l0).targetView);
        }
    }

    public static final void LIZ$90(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((PdpSkuHolder) au2S15S0100000_4.l0).onClick("other");
        }
    }

    public static final void LIZ$91(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S15S0100000_4.l0).invoke();
        }
    }

    public static final void LIZ$92(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C27949Ay1.LJJI("add_new_shipping", ((AddressVH) au2S15S0100000_4.l0).L().fw0(false), null, null, null, null, null, null, null, 1020);
            ((AddressVH) au2S15S0100000_4.l0).L().Dw0(((AddressVH) au2S15S0100000_4.l0).itemView, null);
        }
    }

    public static final void LIZ$93(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S15S0100000_4.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$94(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            TtfUkUserRightVH ttfUkUserRightVH = (TtfUkUserRightVH) au2S15S0100000_4.l0;
            String LJJIJ = C79234V7u.LJJIJ(view);
            List<UserRightDetail> list = ((C27079Ajz) ttfUkUserRightVH.getItem()).LJLIL.userRightDetails;
            if (list == null) {
                return;
            }
            C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
            C78565UsT.LJJIJIIJIL(ttfUkUserRightVH.LJLIL, new C27077Ajx(ttfUkUserRightVH, C221108m2.LIZIZ(new AqS93S0300000_4(ttfUkUserRightVH, LIZ, LIZ, 183)), list, LJJIJ, null));
        }
    }

    public static final void LIZ$95(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            C73157SnR.LJIIJJI(((RegionPicker) au2S15S0100000_4.l0).wl(), new AqS170S0100000_4((RegionPicker) au2S15S0100000_4.l0, 1249));
        }
    }

    public static final void LIZ$96(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            DistrictPage districtPage = (DistrictPage) au2S15S0100000_4.l0;
            C78565UsT.LJJIJIIJIL(districtPage, new C27411ApL(districtPage, null));
        }
    }

    public static final void LIZ$97(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S15S0100000_4.l0).invoke(view);
        }
    }

    public static final void LIZ$98(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            Editable text = ((C19K) ((CpfVH) au2S15S0100000_4.l0)._$_findCachedViewById(R.id.cz9)).getText();
            if (text != null) {
                text.clear();
            }
            ((CpfVH) au2S15S0100000_4.l0)._$_findCachedViewById(R.id.cz9).clearFocus();
            ((CpfVH) au2S15S0100000_4.l0).L().Xw0(null);
        }
    }

    public static final void LIZ$99(Au2S15S0100000_4 au2S15S0100000_4, View view) {
        if (view != null) {
            PdpUserRightHolder pdpUserRightHolder = (PdpUserRightHolder) au2S15S0100000_4.l0;
            String LJJIJ = C79234V7u.LJJIJ(view);
            pdpUserRightHolder.getClass();
            C65776Prg LIZ = C65352Pkq.LIZ(PdpViewModel.class);
            C78565UsT.LJJIJIIJIL(pdpUserRightHolder.LJLIL, new C26676AdU(pdpUserRightHolder, C221108m2.LIZIZ(new AqS93S0300000_4(pdpUserRightHolder, LIZ, LIZ, 189)), LJJIJ, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S15S0100000_4(Object obj, int i, int i2) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }
}
