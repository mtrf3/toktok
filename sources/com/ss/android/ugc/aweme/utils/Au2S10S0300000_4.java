package com.ss.android.ugc.aweme.utils;

import X.ASL;
import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.B1J;
import X.B1K;
import X.B1X;
import X.C113554cx;
import X.C1A8;
import X.C212428Vi;
import X.C26566Abi;
import X.C26610AcQ;
import X.C26804AfY;
import X.C26867AgZ;
import X.C26965Ai9;
import X.C26968AiC;
import X.C26971AiF;
import X.C26972AiG;
import X.C26976AiK;
import X.C26979AiN;
import X.C26980AiO;
import X.C26981AiP;
import X.C26984AiS;
import X.C26985AiT;
import X.C27042AjO;
import X.C27043AjP;
import X.C27051AjX;
import X.C27055Ajb;
import X.C27070Ajq;
import X.C27350AoM;
import X.C27515Ar1;
import X.C27516Ar2;
import X.C27724AuO;
import X.C27739Aud;
import X.C27949Ay1;
import X.C28113B1p;
import X.C28145B2v;
import X.C32151Nz;
import X.C36636EZk;
import X.C38350F3i;
import X.C3C5;
import X.C51029K0z;
import X.C70376Rjg;
import X.C70414RkI;
import X.C70917RsP;
import X.C70919RsR;
import X.C70957Rt3;
import X.C76542zS;
import X.C76800UCe;
import X.C77125UOr;
import X.C780334l;
import X.C78565UsT;
import X.C78886Uxe;
import X.C78946Uyc;
import X.C78948Uye;
import X.C79234V7u;
import X.C7MY;
import X.EnumC28021AzB;
import X.InterfaceC27046AjS;
import X.InterfaceC65784Pro;
import X.O6R;
import X.ORZ;
import X.OSZ;
import X.OUR;
import X.TAT;
import X.XKX;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.address.AddressVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.discount.PlatformDiscountsVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.ShippingFeeDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.MainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.ShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary.SubBillItemData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.summary.SummaryVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuaranteeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.MessageEditDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionForUSHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRightDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.PoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.CheckoutFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo.CheckoutLink;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.summary.GlobalOrderSummaryVH;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreLabel;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.vo.StoreOfficialLabel;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.summary.USOrderSummaryVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH;
import com.zhiliaoapp.musically.R;
import defpackage.g1;
import defpackage.h1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS151S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS42S1000000_4;
import kotlin.jvm.internal.AqS47S1200000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Au2S10S0300000_4 extends TAT {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.LIZ(view);
                return;
        }
    }

    public static final void LIZ$0(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        Object obj;
        String str;
        if (view != null) {
            ((OrderSubmitViewModel) au2S10S0300000_4.l0).LLILZIL = ((C26804AfY) au2S10S0300000_4.l1).LJFF;
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            Context context = ((View) au2S10S0300000_4.l2).getContext();
            String str2 = ((C26804AfY) au2S10S0300000_4.l1).LJII;
            if (str2 == null) {
                str2 = "";
            }
            HashMap<String, Object> hashMap = ((OrderSubmitViewModel) au2S10S0300000_4.l0).LLIL;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> hashMap2 = ((OrderSubmitViewModel) au2S10S0300000_4.l0).LLIL;
            String str3 = ((C26804AfY) au2S10S0300000_4.l1).LJFF;
            o.LJIIIIZZ(context, "context");
            C70376Rjg.LIZLLL(c70376Rjg, context, str2, str3, 2, str, hashMap2);
            C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS135S0200000_4((C26804AfY) au2S10S0300000_4.l1, (OrderSubmitViewModel) au2S10S0300000_4.l0, 28));
        }
    }

    public static final void LIZ$1(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            B1K paymentLogger = ((PaymentMethodView) au2S10S0300000_4.l0).getPaymentLogger();
            if (paymentLogger != null) {
                B1K.LJIIJJI(paymentLogger, "edit", ((B1J) au2S10S0300000_4.l1).LIZ.LJIIL(), null, 4092);
            }
            ((PaymentMethodViewHolder) au2S10S0300000_4.l2).openCCDCPage("EDIT_CARD", "edit");
        }
    }

    public static final void LIZ$10(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        Fragment LIZLLL;
        PaymentInfo paymentInfo;
        if (view != null) {
            B1K paymentLogger = ((USCashierPaymentMethodView) au2S10S0300000_4.l0).getPaymentLogger();
            PaymentGuaranteeInfo paymentGuaranteeInfo = null;
            if (paymentLogger != null) {
                B1K.LJIIJJI(paymentLogger, "edit", ((B1J) au2S10S0300000_4.l1).LIZ.LJIIL(), null, 4092);
            }
            if (((B1J) au2S10S0300000_4.l1).LIZ.LIZIZ) {
                PaymentMethod paymentMethod = PaymentCacheHelper.LJFF;
                if (paymentMethod != null && (LIZLLL = C212428Vi.LIZLLL(((USCashierPaymentMethodVH) au2S10S0300000_4.l2).LJLILLLLZI)) != null) {
                    FragmentManager childFragmentManager = LIZLLL.getChildFragmentManager();
                    o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
                    Address address = ((USCashierPaymentMethodVH) au2S10S0300000_4.l2).getViewModel().LJLJL;
                    PaymentMethodsData paymentMethodsData = ((USCashierPaymentMethodVH) au2S10S0300000_4.l2).getViewModel().LJZ;
                    PaymentViewModel viewModel = ((USCashierPaymentMethodVH) au2S10S0300000_4.l2).getViewModel();
                    String LJFF = ((B1J) au2S10S0300000_4.l1).LIZ.LJFF();
                    viewModel.getClass();
                    if (LJFF == null) {
                        paymentInfo = null;
                    } else {
                        Object LIZLLL2 = C78886Uxe.LIZLLL(PaymentCacheHelper.LJII, new AqS42S1000000_4(LJFF, 1));
                        if (C3C5.m12isFailureimpl(LIZLLL2)) {
                            LIZLLL2 = null;
                        }
                        paymentInfo = (PaymentInfo) LIZLLL2;
                    }
                    HashMap hashMap = new HashMap();
                    HashMap<String, Object> trackParams = ((USCashierPaymentMethodView) au2S10S0300000_4.l0).getTrackParams();
                    if (trackParams != null) {
                        hashMap.putAll(trackParams);
                    }
                    hashMap.put("previous_page", "payment_method");
                    hashMap.put("page_info", "edit");
                    PaymentMethodsData paymentMethodsData2 = ((USCashierPaymentMethodVH) au2S10S0300000_4.l2).getViewModel().LJZ;
                    if (paymentMethodsData2 != null) {
                        paymentGuaranteeInfo = paymentMethodsData2.guaranteeInfo;
                    }
                    C28113B1p.LIZ(childFragmentManager, paymentMethod, new EnterParams(null, null, null, paymentMethodsData, null, false, paymentInfo, hashMap, null, null, address, null, null, null, null, null, paymentGuaranteeInfo, 64311, null), new AqS151S0200000_4(LIZLLL, (USCashierPaymentMethodVH) au2S10S0300000_4.l2, 39), "EDIT_CARD", EnumC28021AzB.ADD_CCDC);
                    return;
                }
                return;
            }
            XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ.LJJIJIL(), null, new B1X((USCashierPaymentMethodVH) au2S10S0300000_4.l2, (B1J) au2S10S0300000_4.l1, null), 2);
        }
    }

    public static final void LIZ$11(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            if (((C26566Abi) au2S10S0300000_4.l0).LJIIL) {
                C27949Ay1.LJJJIL();
            }
            C27949Ay1.LJJI("edit_shipping", ((AddressVH) au2S10S0300000_4.l1).L().fw0(false), null, null, null, null, null, null, null, 1020);
            String LJJIJ = C79234V7u.LJJIJ(view);
            C1A8.LJIJI(LJJIJ, new AqS170S0100000_4((C26566Abi) au2S10S0300000_4.l0, 1125));
            ((AddressVH) au2S10S0300000_4.l1).L().Ew0(((View) au2S10S0300000_4.l2).getContext(), LJJIJ, null);
        }
    }

    public static final void LIZ$12(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            IBulletService LIZ = BulletService.LIZ();
            Context context = ((LinearLayout) au2S10S0300000_4.l0).getContext();
            o.LJIIIIZZ(context, "view.context");
            String uri = C26867AgZ.LIZJ(((LinkText) au2S10S0300000_4.l1).link, C113554cx.LJJJLIIL()).build().toString();
            o.LJIIIIZZ(uri, "RouterUtils.createUrl(\n …     ).build().toString()");
            LIZ.LJIIIIZZ(context, uri);
            View linkTextView = (View) au2S10S0300000_4.l2;
            o.LJIIIIZZ(linkTextView, "linkTextView");
            C78946Uyc.LJJIIJ((View) au2S10S0300000_4.l2, new C70917RsP(), new AqS170S0100000_4((LinkText) au2S10S0300000_4.l1, 1140));
        }
    }

    public static final void LIZ$13(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((GlobalOrderSummaryVH) au2S10S0300000_4.l0).LJLIL, new C70917RsP(), C26976AiK.LJLIL);
            FragmentManager fragmentManager = ((GlobalOrderSummaryVH) au2S10S0300000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                Context context = ((C26985AiT) au2S10S0300000_4.l1).itemView.getContext();
                o.LJIIIIZZ(context, "holder.itemView.context");
                C26968AiC.LJFF(C26968AiC.LIZ(C26968AiC.LIZJ(context, R.attr.gx, ((C27051AjX) au2S10S0300000_4.l2).LJIIIIZZ), ((C27051AjX) au2S10S0300000_4.l2).LIZ, null), fragmentManager, "order_summary_tax_sheet", null, 8);
            }
        }
    }

    public static final void LIZ$14(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((GlobalOrderSummaryVH) au2S10S0300000_4.l0).LJLIL, new C70917RsP(), C26972AiG.LJLIL);
            FragmentManager fragmentManager = ((GlobalOrderSummaryVH) au2S10S0300000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                Context context = ((C26985AiT) au2S10S0300000_4.l1).itemView.getContext();
                o.LJIIIIZZ(context, "holder.itemView.context");
                o.LJIIIIZZ((C27051AjX) au2S10S0300000_4.l2, "item");
                C27051AjX item = (C27051AjX) au2S10S0300000_4.l2;
                o.LJIIIZ(item, "item");
                C26971AiF c26971AiF = new C26971AiF(context, null, 0);
                c26971AiF.setPrice(item.LIZIZ);
                c26971AiF.setExplainText(item.LJIIJ);
                c26971AiF.setShippingFeeItem(item.LJIIIZ);
                C26968AiC.LJFF(C26968AiC.LIZ(c26971AiF, ((C27051AjX) au2S10S0300000_4.l2).LIZ, null), fragmentManager, "order_summary_shipping_detail_sheet", null, 8);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$15(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        Object obj;
        String str;
        if (view != null) {
            ((PlatformDiscountsVH) au2S10S0300000_4.l0).M().LLILZIL = ((C27724AuO) ((PlatformDiscountsVH) au2S10S0300000_4.l0).getItem()).LIZIZ;
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            Context context = ((View) au2S10S0300000_4.l1).getContext();
            String str2 = ((C27724AuO) ((PlatformDiscountsVH) au2S10S0300000_4.l0).getItem()).LIZLLL;
            if (str2 == null) {
                str2 = "";
            }
            HashMap<String, Object> hashMap = ((PlatformDiscountsVH) au2S10S0300000_4.l0).M().LLIL;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> hashMap2 = ((PlatformDiscountsVH) au2S10S0300000_4.l0).M().LLIL;
            String str3 = ((C27724AuO) ((PlatformDiscountsVH) au2S10S0300000_4.l0).getItem()).LIZIZ;
            o.LJIIIIZZ(context, "context");
            C70376Rjg.LIZLLL(c70376Rjg, context, str2, str3, 1, str, hashMap2);
            C78946Uyc.LJJIIJ((View) au2S10S0300000_4.l1, new C70919RsR(), new AqS135S0200000_4((PlatformDiscountsVH) au2S10S0300000_4.l0, (PlatformDiscountsVH) au2S10S0300000_4.l2, (HashMap<String, Object>) 259));
        }
    }

    public static final void LIZ$16(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        HashMap<String, Object> LJII;
        if (view != null) {
            LogisticAdapter.LogisticViewHolder logisticViewHolder = (LogisticAdapter.LogisticViewHolder) au2S10S0300000_4.l0;
            logisticViewHolder.withState(logisticViewHolder.getViewModel(), new AqS135S0200000_4((LogisticAdapter.LogisticViewHolder) au2S10S0300000_4.l0, (LogisticDTO) au2S10S0300000_4.l1, 23));
            String str = ((LogisticDTO) au2S10S0300000_4.l1).spendMoreForFree.schema;
            if (str != null) {
                DeliveryPanelViewModel viewModel = ((LogisticAdapter.LogisticViewHolder) au2S10S0300000_4.l0).getViewModel();
                Context context = ((View) au2S10S0300000_4.l2).getContext();
                o.LJIIIIZZ(context, "context");
                viewModel.getClass();
                Parcelable parcelable = viewModel.LJLJJLL;
                if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
                    LJII = C27739Aud.LJII(((DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable).trackParams);
                } else if (!(parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage)) {
                    return;
                } else {
                    LJII = C27739Aud.LJII(((DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable).trackParams);
                }
                if (LJII == null) {
                    return;
                }
                LJII.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
                C26867AgZ.LIZIZ(context, str, C51029K0z.LJJIIZI(new OSZ("trackParams", LJII)), false).open();
            }
        }
    }

    public static final void LIZ$17(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        Object obj;
        String str;
        if (view != null) {
            ((OrderSubmitViewModel) au2S10S0300000_4.l0).LLILZIL = ((C26804AfY) au2S10S0300000_4.l1).LJFF;
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            Context context = ((View) au2S10S0300000_4.l2).getContext();
            String str2 = ((C26804AfY) au2S10S0300000_4.l1).LJII;
            if (str2 == null) {
                str2 = "";
            }
            HashMap<String, Object> hashMap = ((OrderSubmitViewModel) au2S10S0300000_4.l0).LLIL;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            HashMap<String, Object> hashMap2 = ((OrderSubmitViewModel) au2S10S0300000_4.l0).LLIL;
            String str3 = ((C26804AfY) au2S10S0300000_4.l1).LJFF;
            o.LJIIIIZZ(context, "context");
            C70376Rjg.LIZLLL(c70376Rjg, context, str2, str3, 2, str, hashMap2);
            C78946Uyc.LJJIIJ(view, new C70919RsR(), new AqS135S0200000_4((C26804AfY) au2S10S0300000_4.l1, (OrderSubmitViewModel) au2S10S0300000_4.l0, 60));
        }
    }

    public static final void LIZ$18(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        String str;
        if (view != null) {
            Context context = ((View) au2S10S0300000_4.l0).getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LIZJ = C77125UOr.LIZJ(context);
            Bundle bundle = new Bundle();
            C26965Ai9 c26965Ai9 = (C26965Ai9) ORZ.LJLLLL(((C26804AfY) au2S10S0300000_4.l2).LIZLLL);
            if (c26965Ai9 == null || (str = c26965Ai9.LJIILIIL) == null) {
                str = "";
            }
            bundle.putString("main_order_id", str);
            bundle.putString("message", ((AppCompatTextView) view.findViewById(R.id.ght)).getText().toString());
            C79234V7u.LJJIJIL(bundle, view);
            FragmentManager supportFragmentManager = LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            MessageEditDialogFragment messageEditDialogFragment = new MessageEditDialogFragment();
            messageEditDialogFragment.setArguments(bundle);
            messageEditDialogFragment.show(supportFragmentManager, "OSPMessagePanelFragment");
            C27949Ay1.LJJI("message", ((TtfShopInfoVH) au2S10S0300000_4.l1).L().fw0(false), null, null, null, null, null, null, null, 1020);
        }
    }

    public static final void LIZ$19(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            View view2 = ((MainOrderInfoVH) au2S10S0300000_4.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS170S0100000_4((HashMap) au2S10S0300000_4.l1, (HashMap<String, Object>) 247));
            MainOrderInfoVH mainOrderInfoVH = (MainOrderInfoVH) au2S10S0300000_4.l0;
            C78565UsT.LJJIJIIJIL(mainOrderInfoVH.LJLILLLLZI, new C27070Ajq(mainOrderInfoVH, (UserRightDetail) au2S10S0300000_4.l2, (HashMap) au2S10S0300000_4.l1, null));
        }
    }

    public static final void LIZ$2(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpPromotionForUSHolder) au2S10S0300000_4.l0).getViewModel();
            Context context = ((PdpPromotionForUSHolder) au2S10S0300000_4.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            viewModel.Jw0(context, ((C27515Ar1) au2S10S0300000_4.l1).LJLIL.schema, (C27516Ar2) au2S10S0300000_4.l2, "promotions");
        }
    }

    public static final void LIZ$20(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        List<LogisticDTO> list;
        Float f;
        String str;
        LogisticTextDTO logisticTextDTO;
        Price price;
        Price price2;
        String priceVal;
        Map<String, String> map;
        if (view != null && (list = ((C26965Ai9) au2S10S0300000_4.l0).LIZLLL) != null && list.size() > 1) {
            String str2 = null;
            if (1 != 0) {
                OrderSubmitViewModel L = ((MainOrderInfoVH) au2S10S0300000_4.l1).L();
                C26965Ai9 c26965Ai9 = (C26965Ai9) au2S10S0300000_4.l0;
                Context context = ((View) au2S10S0300000_4.l2).getContext();
                o.LJIIIIZZ(context, "context");
                L.Iw0(c26965Ai9, list, context, C79234V7u.LJJIJ(view));
                HashMap<String, Object> fw0 = ((MainOrderInfoVH) au2S10S0300000_4.l1).L().fw0(false);
                LogisticDTO logisticDTO = ((C26965Ai9) au2S10S0300000_4.l0).LJ;
                if (logisticDTO != null && (map = logisticDTO.eventTrackInfo) != null) {
                    fw0.putAll(map);
                }
                LogisticDTO logisticDTO2 = ((C26965Ai9) au2S10S0300000_4.l0).LJ;
                if (logisticDTO2 != null && (price2 = logisticDTO2.shippingFee) != null && (priceVal = price2.getPriceVal()) != null) {
                    f = C38350F3i.LJJIJLIJ(priceVal);
                } else {
                    f = null;
                }
                LogisticDTO logisticDTO3 = ((C26965Ai9) au2S10S0300000_4.l0).LJ;
                if (logisticDTO3 != null && (price = logisticDTO3.shippingFee) != null) {
                    str = price.getCurrency();
                } else {
                    str = null;
                }
                LogisticDTO logisticDTO4 = ((C26965Ai9) au2S10S0300000_4.l0).LJ;
                if (logisticDTO4 != null && (logisticTextDTO = logisticDTO4.logisticText) != null) {
                    str2 = logisticTextDTO.thresholdTextEn;
                }
                C27949Ay1.LJJI("logistics", fw0, f, str, str2, null, null, null, null, 964);
            }
        }
    }

    public static final void LIZ$21(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        String str;
        if (view != null) {
            Context context = ((View) au2S10S0300000_4.l0).getContext();
            o.LJIIIIZZ(context, "context");
            ActivityC45651qj LIZJ = C77125UOr.LIZJ(context);
            Bundle bundle = new Bundle();
            C26965Ai9 c26965Ai9 = (C26965Ai9) ORZ.LJLLLL(((C26804AfY) au2S10S0300000_4.l2).LIZLLL);
            if (c26965Ai9 == null || (str = c26965Ai9.LJIILIIL) == null) {
                str = "";
            }
            bundle.putString("main_order_id", str);
            bundle.putString("message", ((AppCompatTextView) view.findViewById(R.id.ght)).getText().toString());
            C79234V7u.LJJIJIL(bundle, view);
            FragmentManager supportFragmentManager = LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            MessageEditDialogFragment messageEditDialogFragment = new MessageEditDialogFragment();
            messageEditDialogFragment.setArguments(bundle);
            messageEditDialogFragment.show(supportFragmentManager, "OSPMessagePanelFragment");
            C27949Ay1.LJJI("message", ((ShopInfoVH) au2S10S0300000_4.l1).L().fw0(false), null, null, null, null, null, null, null, 1020);
        }
    }

    public static final void LIZ$22(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            PoliciesFragment policiesFragment = (PoliciesFragment) au2S10S0300000_4.l0;
            String str = ((PrivacyPolicy) au2S10S0300000_4.l1).nameEn;
            if (str == null) {
                str = "terms_of_use_and_sale";
            }
            policiesFragment.getClass();
            C70414RkI LIZ = C27350AoM.LIZ(policiesFragment.getContext());
            if (LIZ != null) {
                C76542zS.LIZJ("tiktokec_button_click", new AqS47S1200000_4(LIZ, policiesFragment, str, 40));
            }
            String str2 = ((PrivacyPolicy) au2S10S0300000_4.l1).link;
            if (str2 != null) {
                SmartRouter.buildRoute((Context) au2S10S0300000_4.l2, UriProtector.parse(str2).toString()).open();
            }
        }
    }

    public static final void LIZ$23(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l0).M("other", ((Address) au2S10S0300000_4.l1).LJ());
            if (((C26610AcQ) au2S10S0300000_4.l2).getReachable()) {
                ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l0).L().Jv0((Address) au2S10S0300000_4.l1);
            }
        }
    }

    public static final void LIZ$24(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l0).M("other", ((Address) au2S10S0300000_4.l1).LJ());
            String hintText = ((C26610AcQ) au2S10S0300000_4.l2).getHintText();
            if (hintText != null && !ujb.o.LJJJJJL(hintText)) {
                AddressListViewModel L = ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l0).L();
                Context context = ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l0).itemView.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S10S0300000_4.l1);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l0).L().Jv0((Address) au2S10S0300000_4.l1);
        }
    }

    public static final void LIZ$25(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        String hintText;
        if (view == null || (hintText = ((C26610AcQ) au2S10S0300000_4.l0).getHintText()) == null || ujb.o.LJJJJJL(hintText)) {
            return;
        }
        ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l1).M("other", ((Address) au2S10S0300000_4.l2).LJ());
        AddressListViewModel L = ((AddressAdapter.AddressViewHolder) au2S10S0300000_4.l1).L();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        L.Kv0(context, C78948Uye.LJIILIIL(view), (Address) au2S10S0300000_4.l2);
    }

    public static final void LIZ$26(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        List<C27051AjX> list;
        if (view != null) {
            C27042AjO c27042AjO = (C27042AjO) au2S10S0300000_4.l0;
            if (c27042AjO != null) {
                list = c27042AjO.LIZ;
            } else {
                list = null;
            }
            HashMap hashMap = new HashMap();
            if (list != null) {
                for (C27051AjX c27051AjX : list) {
                    Integer num = c27051AjX.LJII;
                    if (num != null) {
                        num.intValue();
                        hashMap.put(String.valueOf(c27051AjX.LJII), c27051AjX.LIZIZ);
                    }
                }
            }
            C78946Uyc.LJJIIJ(((SummaryVH) au2S10S0300000_4.l1).LJLIL, new C70917RsP(), C27055Ajb.LJLIL);
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            ActivityC45651qj LIZJ = C77125UOr.LIZJ(context);
            Bundle bundle = new Bundle();
            C79234V7u.LJJIJIL(bundle, view);
            bundle.putString("name", ((C27051AjX) au2S10S0300000_4.l2).LIZ);
            C27051AjX c27051AjX2 = (C27051AjX) au2S10S0300000_4.l2;
            o.LJIIIZ(c27051AjX2, "<this>");
            bundle.putParcelable("sub_items", new SubBillItemData(c27051AjX2.LIZ, c27051AjX2.LIZIZ, c27051AjX2.LIZLLL, c27051AjX2.LJ, c27051AjX2.LJI, c27051AjX2.LJII, c27051AjX2.LJIIIIZZ, c27051AjX2.LJIIIZ));
            bundle.putString("price", ((C27051AjX) au2S10S0300000_4.l2).LIZIZ);
            bundle.putString("explain_text", ((C27051AjX) au2S10S0300000_4.l2).LJIIJ);
            FragmentManager supportFragmentManager = LIZJ.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "supportFragmentManager");
            ASL asl = new ASL();
            asl.LJI(0);
            ShippingFeeDialogFragment shippingFeeDialogFragment = new ShippingFeeDialogFragment();
            shippingFeeDialogFragment.setArguments(bundle);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = shippingFeeDialogFragment;
            tuxSheet.LJZI = false;
            tuxSheet.show(supportFragmentManager, "OSPShippingFeeDialogFragment");
        }
    }

    public static final void LIZ$3(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        String str;
        Float f;
        StoreOfficialLabel storeOfficialLabel;
        if (view != null && (str = ((SellerInfo) au2S10S0300000_4.l0).shopLink) != null && !ujb.o.LJJJJJL(str)) {
            PdpViewModel viewModel = ((PdpHeadNavBarWidget) au2S10S0300000_4.l1).getViewModel();
            Context context = (Context) au2S10S0300000_4.l2;
            SellerInfo sellerInfo = (SellerInfo) au2S10S0300000_4.l0;
            String str2 = sellerInfo.sellerId;
            String str3 = sellerInfo.rating;
            String str4 = null;
            if (str3 != null) {
                f = C38350F3i.LJJIJLIJ(str3);
            } else {
                f = null;
            }
            StoreLabel storeLabel = ((SellerInfo) au2S10S0300000_4.l0).storeLabel;
            if (storeLabel != null && (storeOfficialLabel = storeLabel.officialLabel) != null) {
                str4 = storeOfficialLabel.labelTypeStr;
            }
            PdpViewModel.nw0(viewModel, context, str, str2, f, "top_bar", str4, ((PdpHeadNavBarWidget) au2S10S0300000_4.l1).getViewModel().aw0(), null, null, "click_top_bar", null, null, null, null, 15744);
        }
    }

    public static final void LIZ$4(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            ((CheckoutFragment) au2S10S0300000_4.l0).LJLJI = true;
            C78946Uyc.LJJIIJ((View) au2S10S0300000_4.l1, new C70957Rt3(), null);
            CheckoutFragment checkoutFragment = (CheckoutFragment) au2S10S0300000_4.l0;
            String str = ((CheckoutLink) au2S10S0300000_4.l2).link;
            checkoutFragment.getClass();
            if (str != null && (ujb.o.LJJJLIIL(str, "aweme", false) || (str = new Uri.Builder().scheme("aweme").authority("echybrid").appendQueryParameter("url", str).build().toString()) != null)) {
                Context context = ((View) au2S10S0300000_4.l1).getContext();
                o.LJIIIIZZ(context, "view.context");
                C26867AgZ.LIZIZ(context, str, new LinkedHashMap(), false).open();
            }
            ASQ.LJ((CheckoutFragment) au2S10S0300000_4.l0, ASX.LIZ);
        }
    }

    public static final void LIZ$5(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            C28145B2v.LIZ((TuxTextView) au2S10S0300000_4.l0, (ExceptionUX) au2S10S0300000_4.l1, g1.LJLIL, h1.LJLIL, null);
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) au2S10S0300000_4.l2;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public static final void LIZ$6(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((USOrderSummaryVH) au2S10S0300000_4.l0).LJLIL, new C70917RsP(), C26979AiN.LJLIL);
            FragmentManager fragmentManager = ((USOrderSummaryVH) au2S10S0300000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                Context context = ((C26984AiS) au2S10S0300000_4.l1).itemView.getContext();
                o.LJIIIIZZ(context, "holder.itemView.context");
                TuxTextView LIZJ = C26968AiC.LIZJ(context, R.attr.go, ((C27051AjX) au2S10S0300000_4.l2).LJIIIIZZ);
                LIZJ.setPadding(C7MY.LIZIZ(16), C7MY.LIZIZ(24), C7MY.LIZIZ(16), O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)));
                C26968AiC.LJFF(C26968AiC.LIZ(LIZJ, ((C27051AjX) au2S10S0300000_4.l2).LIZ, null), fragmentManager, "order_summary_tax_sheet", null, 8);
            }
        }
    }

    public static final void LIZ$7(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((USOrderSummaryVH) au2S10S0300000_4.l0).LJLIL, new C70917RsP(), C26980AiO.LJLIL);
            FragmentManager fragmentManager = ((USOrderSummaryVH) au2S10S0300000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                Context context = ((C26984AiS) au2S10S0300000_4.l1).itemView.getContext();
                o.LJIIIIZZ(context, "holder.itemView.context");
                C27051AjX item = (C27051AjX) au2S10S0300000_4.l2;
                o.LJIIIIZZ(item, "item");
                C26968AiC.LJFF(C26968AiC.LIZ(C26968AiC.LJ(context, (C27051AjX) au2S10S0300000_4.l2), ((C27051AjX) au2S10S0300000_4.l2).LIZ, null), fragmentManager, "order_summary_shipping_detail_sheet", null, 8);
            }
        }
    }

    public static final void LIZ$8(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        if (view != null) {
            C78946Uyc.LJJIIJ(((USOrderSummaryVH) au2S10S0300000_4.l0).LJLIL, new C70917RsP(), C26981AiP.LJLIL);
            FragmentManager fragmentManager = ((USOrderSummaryVH) au2S10S0300000_4.l0).LJLILLLLZI.getFragmentManager();
            if (fragmentManager != null) {
                Context context = ((C26984AiS) au2S10S0300000_4.l1).itemView.getContext();
                o.LJIIIIZZ(context, "holder.itemView.context");
                C27051AjX item = (C27051AjX) au2S10S0300000_4.l2;
                o.LJIIIIZZ(item, "item");
                C26968AiC.LJFF(C26968AiC.LIZ(C26968AiC.LJ(context, (C27051AjX) au2S10S0300000_4.l2), ((C27051AjX) au2S10S0300000_4.l2).LIZ, null), fragmentManager, "order_summary_discount_detail_sheet", null, 8);
            }
        }
    }

    public static final void LIZ$9(Au2S10S0300000_4 au2S10S0300000_4, View view) {
        String str;
        String str2;
        Object obj;
        String str3;
        if (view != null) {
            OrderSubmitViewModel M = ((USOrderSummaryVH) au2S10S0300000_4.l0).M();
            C27724AuO c27724AuO = ((C27043AjP) au2S10S0300000_4.l1).LIZIZ;
            String str4 = null;
            if (c27724AuO != null) {
                str = c27724AuO.LIZIZ;
            } else {
                str = null;
            }
            M.LLILZIL = str;
            C70376Rjg c70376Rjg = InterfaceC27046AjS.LIZ;
            Context context = ((View) au2S10S0300000_4.l2).getContext();
            C27724AuO c27724AuO2 = ((C27043AjP) au2S10S0300000_4.l1).LIZIZ;
            if (c27724AuO2 == null || (str2 = c27724AuO2.LIZLLL) == null) {
                str2 = "";
            }
            HashMap<String, Object> hashMap = ((USOrderSummaryVH) au2S10S0300000_4.l0).M().LLIL;
            if (hashMap != null) {
                obj = hashMap.get("entrance_info");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str3 = (String) obj;
            } else {
                str3 = null;
            }
            HashMap<String, Object> hashMap2 = ((USOrderSummaryVH) au2S10S0300000_4.l0).M().LLIL;
            C27724AuO c27724AuO3 = ((C27043AjP) au2S10S0300000_4.l1).LIZIZ;
            if (c27724AuO3 != null) {
                str4 = c27724AuO3.LIZIZ;
            }
            o.LJIIIIZZ(context, "context");
            C70376Rjg.LIZLLL(c70376Rjg, context, str2, str4, 3, str3, hashMap2);
            C78946Uyc.LJJIIJ((View) au2S10S0300000_4.l2, new C70919RsR(), new AqS135S0200000_4((C27043AjP) au2S10S0300000_4.l1, (USOrderSummaryVH) au2S10S0300000_4.l0, 174));
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S10S0300000_4(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r4, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter.AddressViewHolder r5, X.C26610AcQ r6, int r7) {
        /*
            r3 = this;
            r3.$t = r7
            switch(r7) {
                case 23: goto L12;
                case 24: goto L12;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r6
            r2.l1 = r5
            r2.l2 = r4
            r0 = 700(0x2bc, double:3.46E-321)
        Le:
            r2.<init>(r0)
            return
        L12:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r2.l2 = r6
            r0 = 700(0x2bc, double:3.46E-321)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S10S0300000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address, com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressAdapter$AddressViewHolder, X.AcQ, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S10S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
