package com.ss.android.ugc.aweme.utils;

import X.ARV;
import X.ASQ;
import X.ASX;
import X.ATX;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C03660Ck;
import X.C03880Dg;
import X.C113554cx;
import X.C115894gj;
import X.C188727au;
import X.C19K;
import X.C212428Vi;
import X.C26045AKb;
import X.C26048AKe;
import X.C26059AKp;
import X.C26227ARb;
import X.C26847AgF;
import X.C26867AgZ;
import X.C27493Aqf;
import X.C27570Aru;
import X.C27927Axf;
import X.C27949Ay1;
import X.C27959AyB;
import X.C28112B1o;
import X.C2UK;
import X.C32I;
import X.C36636EZk;
import X.C3AW;
import X.C44140HUa;
import X.C45804HyK;
import X.C47261Igj;
import X.C51029K0z;
import X.C61447O9r;
import X.C65300Pk0;
import X.C68322mC;
import X.C69638RUs;
import X.C69689RWr;
import X.C70030Re6;
import X.C70084Rey;
import X.C70172RgO;
import X.C70301RiT;
import X.C70362RjS;
import X.C70364RjU;
import X.C70414RkI;
import X.C70470RlC;
import X.C70522Rm2;
import X.C70531RmB;
import X.C70589Rn7;
import X.C70607RnP;
import X.C70637Rnt;
import X.C70638Rnu;
import X.C70656RoC;
import X.C70691Rol;
import X.C70819Rqp;
import X.C70842RrC;
import X.C70843RrD;
import X.C70884Rrs;
import X.C70917RsP;
import X.C70947Rst;
import X.C70982RtS;
import X.C71035RuJ;
import X.C71094RvG;
import X.C71095RvH;
import X.C71096RvI;
import X.C71097RvJ;
import X.C71118Rve;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71702SCc;
import X.C72225SWf;
import X.C72735Sgd;
import X.C72736Sge;
import X.C74155T8l;
import X.C76542zS;
import X.C76732zl;
import X.C76800UCe;
import X.C77125UOr;
import X.C78946Uyc;
import X.C78983UzD;
import X.C79234V7u;
import X.DialogC70776Rq8;
import X.FFL;
import X.FMX;
import X.FT5;
import X.InterfaceC36571c5;
import X.InterfaceC44105HSr;
import X.InterfaceC65784Pro;
import X.InterfaceC70593RnB;
import X.InterfaceC70598RnG;
import X.InterfaceC70599RnH;
import X.InterfaceC70603RnL;
import X.InterfaceC70614RnW;
import X.InterfaceC70844RrE;
import X.InterfaceC71003Rtn;
import X.InterfaceC71446S2g;
import X.InterfaceC88472Yns;
import X.JJZ;
import X.MG0;
import X.MKO;
import X.ORZ;
import X.OSZ;
import X.OUP;
import X.OUR;
import X.RVZ;
import X.S02;
import X.S05;
import X.S07;
import X.S2K;
import X.S2L;
import X.S2M;
import X.S2N;
import X.S4U;
import X.S4V;
import X.S4W;
import X.T5T;
import X.TAT;
import X.UC0;
import X.V1M;
import X.ViewOnFocusChangeListenerC71602S8g;
import X.XKX;
import Y.IDAListenerS236S0100000_12;
import Y.IDrS14S0200000_12;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeDialog;
import com.ss.android.ugc.aweme.badge.EditProfileBadgeModel;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.cpf.CpfVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.RegionInputElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.USSameShippingAddressElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SelectReason;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SubmitQuitReason;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.header.PdpHeadViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.payment.PdpPaymentModuleViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpCouponsViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.waist.WaistInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DeductibleVoucherReminder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.DynamicSellingPointsBase;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.ui.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpAddonFloatWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpBottomNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.widget.PdpHeadNavBarWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vh.SkuBrickVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.viewmodel.PdpMainViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdpv2.widget.PdpBodyAssem;
import com.ss.android.ugc.aweme.ecommerce.base.review.Option;
import com.ss.android.ugc.aweme.ecommerce.base.review.OptionPickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewFragment;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.SkuPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.SkuPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import com.ss.android.ugc.aweme.ecommerce.base.sku.strategy.SkuPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.core.view.CommerceProductInfoView;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.GlobalHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.header.sa.TtfHeadVH;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.service.AnchorPdpPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.header.vh.UsHeaderVH;
import com.ss.android.ugc.aweme.ecommerce.tts.pdp.us.module.sku.UsSkuVH;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuHeaderWidget;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.widget.UsSkuWidget;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.ccdc.USBARegionInputElementViewHolder;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data.VoucherInfo;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicBaseVM;
import com.ss.android.ugc.aweme.feed.assem.music.VideoMusicTitleAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardImagesFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.BillboardTemplateFragment;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.music.model.MusicInfo;
import com.ss.android.ugc.aweme.music.model.TTMBrand;
import com.ss.android.ugc.aweme.music.model.TTMInfo;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.AqS65S1100000_12;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class Au2S20S0100000_12 extends TAT {
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
            default:
                super.LIZ(view);
                return;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Au2S20S0100000_12(X.InterfaceC65784Pro r4, int r5) {
        /*
            r3 = this;
            r3.$t = r5
            switch(r5) {
                case 20: goto Le;
                case 21: goto Le;
                case 27: goto Le;
                case 81: goto Le;
                default: goto L5;
            }
        L5:
            r2 = r3
            r2.l0 = r4
            r0 = 300(0x12c, double:1.48E-321)
        La:
            r2.<init>(r0)
            return
        Le:
            r2 = r3
            r2.l0 = r4
            r0 = 700(0x2bc, double:3.46E-321)
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S20S0100000_12.<init>(X.Pro, int):void");
    }

    public static final void LIZ$0(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((PdpPaymentModuleViewHolder) au2S20S0100000_12.l0).M();
            View view2 = ((PdpPaymentModuleViewHolder) au2S20S0100000_12.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), C70362RjS.LJLIL);
            View itemView = ((PdpPaymentModuleViewHolder) au2S20S0100000_12.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C78946Uyc.LJJIIJ(itemView, new C70884Rrs(), C70364RjU.LJLIL);
        }
    }

    public static final void LIZ$1(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$10(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S20S0100000_12.l0;
            C70470RlC c70470RlC = (C70470RlC) pdpCouponsViewHolder.itemView.findViewById(R.id.had);
            o.LJIIIIZZ(c70470RlC, "itemView.one_item");
            pdpCouponsViewHolder.onBodyClick(pdpCouponsViewHolder.getVoucherByView(c70470RlC));
        }
    }

    public static final void LIZ$100(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().Vv0((ProductReviewFragment) au2S20S0100000_12.l0, 2);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6w)).setVisibility(8);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6y)).setVisibility(0);
            C70691Rol c70691Rol = ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().LJLLILLLL;
            if (c70691Rol != null) {
                c70691Rol.LJJIJIIJIL((ProductReviewFragment) au2S20S0100000_12.l0, 2);
            }
            C26045AKb c26045AKb = new C26045AKb((ProductReviewFragment) au2S20S0100000_12.l0);
            c26045AKb.LJIIIIZZ(R.string.ffo);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZ$101(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().Vv0((ProductReviewFragment) au2S20S0100000_12.l0, 1);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6w)).setVisibility(0);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6y)).setVisibility(8);
            C70691Rol c70691Rol = ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().LJLLILLLL;
            if (c70691Rol != null) {
                c70691Rol.LJJIJIIJIL((ProductReviewFragment) au2S20S0100000_12.l0, 1);
            }
            C26045AKb c26045AKb = new C26045AKb((ProductReviewFragment) au2S20S0100000_12.l0);
            c26045AKb.LJIIIIZZ(R.string.ffn);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZ$102(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6w);
            C70691Rol c70691Rol = ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().LJLLILLLL;
            if (c70691Rol != null) {
                c70691Rol.LJJIJIIJIL((ProductReviewFragment) au2S20S0100000_12.l0, 1);
            }
            ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().Vv0((ProductReviewFragment) au2S20S0100000_12.l0, 2);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6x)).setVisibility(8);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6z)).setVisibility(0);
            C70691Rol c70691Rol2 = ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().LJLLILLLL;
            if (c70691Rol2 != null) {
                c70691Rol2.LJJIJIIJIL((ProductReviewFragment) au2S20S0100000_12.l0, 2);
            }
            C26045AKb c26045AKb = new C26045AKb((ProductReviewFragment) au2S20S0100000_12.l0);
            c26045AKb.LJIIIIZZ(R.string.ffo);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZ$103(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().Vv0((ProductReviewFragment) au2S20S0100000_12.l0, 1);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6x)).setVisibility(0);
            ((ImageView) ((ProductReviewFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.k6z)).setVisibility(8);
            C70691Rol c70691Rol = ((ProductReviewFragment) au2S20S0100000_12.l0).Hl().LJLLILLLL;
            if (c70691Rol != null) {
                c70691Rol.LJJIJIIJIL((ProductReviewFragment) au2S20S0100000_12.l0, 1);
            }
            C26045AKb c26045AKb = new C26045AKb((ProductReviewFragment) au2S20S0100000_12.l0);
            c26045AKb.LJIIIIZZ(R.string.ffn);
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZ$104(Au2S20S0100000_12 au2S20S0100000_12, View v) {
        int i;
        o.LJIIIZ(v, "v");
        Context it = v.getContext();
        C72225SWf c72225SWf = (C72225SWf) au2S20S0100000_12.l0;
        VideoMusicBaseVM z4 = c72225SWf.LIZ.z4();
        o.LJIIIIZZ(it, "it");
        ImageView imageView = c72225SWf.LIZJ;
        if (imageView != null) {
            i = imageView.getId();
        } else {
            i = 0;
        }
        VideoMusicBaseVM.mv0(z4, it, i, false, null, c72225SWf.LJI.invoke().booleanValue(), 28);
    }

    public static final void LIZ$105(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        ActivityC45651qj mo49getActivity;
        if (view != null && (mo49getActivity = ((ReviewGalleryFragment) au2S20S0100000_12.l0).mo49getActivity()) != null) {
            mo49getActivity.finish();
        }
    }

    public static final void LIZ$106(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        ATX atx = new ATX(((C74155T8l) au2S20S0100000_12.l0).LIZIZ);
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/duet/ui/DuetPermissionAlertDialog", "show", atx, new Object[0], "void", new C65300Pk0(false, "()V", "6017780611914991729")).LIZ) {
            return;
        }
        atx.show();
    }

    public static final void LIZ$107(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((ECBaseSheetFragment) au2S20S0100000_12.l0).Il();
        }
    }

    public static final void LIZ$108(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        String str;
        List<DynamicSellingPoint> list;
        DynamicSellingPoint dynamicSellingPoint;
        C70414RkI c70414RkI;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        HashMap<String, Object> trackParams;
        List<DynamicSellingPoint> list2;
        DynamicSellingPoint dynamicSellingPoint2;
        Integer num;
        List<DynamicSellingPoint> list3;
        DynamicSellingPoint dynamicSellingPoint3;
        String str2;
        List<DynamicSellingPoint> list4;
        if (view != null) {
            C70637Rnt c70637Rnt = (C70637Rnt) au2S20S0100000_12.l0;
            int i = c70637Rnt.LJFF - 1;
            DynamicSellingPointsBase dynamicSellingPointsBase = c70637Rnt.LIZ;
            if (dynamicSellingPointsBase != null && (list4 = dynamicSellingPointsBase.dynamicSellingPoints) != null && i >= list4.size()) {
                int size = list4.size();
                int i2 = i % size;
                i = i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31));
            }
            PdpViewModel pdpViewModel = ((C70637Rnt) au2S20S0100000_12.l0).LJII;
            if (pdpViewModel != null && (c70414RkI = pdpViewModel.LLFII) != null) {
                HashMap LIZJ = C03660Ck.LIZJ("bubble_type", "selling_point");
                DynamicSellingPointsBase dynamicSellingPointsBase2 = ((C70637Rnt) au2S20S0100000_12.l0).LIZ;
                if (dynamicSellingPointsBase2 != null && (list3 = dynamicSellingPointsBase2.dynamicSellingPoints) != null && (dynamicSellingPoint3 = (DynamicSellingPoint) ORZ.LJLLLLLL(i, list3)) != null && (str2 = dynamicSellingPoint3.bubbleTextType) != null) {
                    LIZJ.put("bubble_text_type", str2);
                }
                DynamicSellingPointsBase dynamicSellingPointsBase3 = ((C70637Rnt) au2S20S0100000_12.l0).LIZ;
                if (dynamicSellingPointsBase3 != null && (list2 = dynamicSellingPointsBase3.dynamicSellingPoints) != null && (dynamicSellingPoint2 = (DynamicSellingPoint) ORZ.LJLLLLLL(i, list2)) != null && (num = dynamicSellingPoint2.numInSellingPoint) != null) {
                    LIZJ.put("num_in_selling_point", Integer.valueOf(num.intValue()));
                }
                LIZJ.put("bubble_position", "pdp_headpic");
                PdpViewModel pdpViewModel2 = ((C70637Rnt) au2S20S0100000_12.l0).LJII;
                Object obj = null;
                if (pdpViewModel2 != null && (pdpEnterParam = pdpViewModel2.LJLJJLL) != null && (trackParams = pdpEnterParam.getTrackParams()) != null) {
                    obj = trackParams.get("previous_page");
                }
                if (!(obj instanceof String) || obj == null) {
                    obj = "";
                }
                LIZJ.put("previous_page", obj);
                C76542zS.LIZJ("tiktokec_bubble_click", new AqS135S0200000_4(c70414RkI, (C70414RkI) LIZJ, (HashMap<String, Object>) 296));
            }
            DynamicSellingPointsBase dynamicSellingPointsBase4 = ((C70637Rnt) au2S20S0100000_12.l0).LIZ;
            if (dynamicSellingPointsBase4 == null || (list = dynamicSellingPointsBase4.dynamicSellingPoints) == null || (dynamicSellingPoint = (DynamicSellingPoint) ORZ.LJLLLLLL(i, list)) == null || (str = dynamicSellingPoint.description) == null) {
                str = " ";
            }
            C2UK c2uk = ((C70637Rnt) au2S20S0100000_12.l0).LIZIZ;
            if (c2uk != null) {
                Context context = c2uk.getContext();
                o.LJIIIIZZ(context, "it.context");
                C26227ARb LIZ = C3AW.LIZ(context);
                LIZ.LIZIZ(str);
                UC0.LIZJ(LIZ, C70638Rnu.LJLIL);
                LIZ.LJII = false;
                LIZ.LJI().LIZLLL();
            }
        }
    }

    public static final void LIZ$109(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            if (((PdpHeadViewHolder) au2S20S0100000_12.l0).T().LJFF()) {
                if (((PdpHeadViewHolder) au2S20S0100000_12.l0).T().isMute()) {
                    ((PdpHeadViewHolder) au2S20S0100000_12.l0).T().LJIIIZ();
                    return;
                } else {
                    ((PdpHeadViewHolder) au2S20S0100000_12.l0).T().LIZIZ();
                    return;
                }
            }
            ((PdpHeadViewHolder) au2S20S0100000_12.l0).T().resume();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$11(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        String str;
        if (view != null) {
            WaistInfoViewHolder waistInfoViewHolder = (WaistInfoViewHolder) au2S20S0100000_12.l0;
            DeductibleVoucherReminder deductibleVoucherReminder = ((C69689RWr) waistInfoViewHolder.getItem()).LJIIJ;
            if (deductibleVoucherReminder != null) {
                str = deductibleVoucherReminder.schema;
            } else {
                str = null;
            }
            waistInfoViewHolder.openPanelWithSchema(str, "discounts_module");
        }
    }

    public static final void LIZ$110(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((TextView) ((SubPaymentListAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cza)).setText("");
            ((SubPaymentListAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cza).clearFocus();
            T5T etInput = (T5T) ((SubPaymentListAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cza);
            o.LJIIIIZZ(etInput, "etInput");
            C27570Aru.LIZLLL(etInput);
            SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) au2S20S0100000_12.l0;
            subPaymentListAssem.withState(subPaymentListAssem.x3(), new AqS178S0100000_12((SubPaymentListAssem) au2S20S0100000_12.l0, 719));
        }
    }

    public static final void LIZ$111(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((TextView) ((SubPaymentListAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cza)).setText("");
            ((SubPaymentListAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cza).clearFocus();
            T5T etInput = (T5T) ((SubPaymentListAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cza);
            o.LJIIIIZZ(etInput, "etInput");
            C27570Aru.LIZLLL(etInput);
        }
    }

    public static final void LIZ$112(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) au2S20S0100000_12.l0;
            subPaymentListAssem.withState(subPaymentListAssem.x3(), new AqS178S0100000_12((SubPaymentListAssem) au2S20S0100000_12.l0, 720));
        }
    }

    public static final void LIZ$113(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((PdpFragment) au2S20S0100000_12.l0).Ll().Xw0(((PdpFragment) au2S20S0100000_12.l0).getView());
            C70414RkI c70414RkI = ((PdpFragment) au2S20S0100000_12.l0).Ll().LLFII;
            if (c70414RkI != null) {
                C70531RmB c70531RmB = new C70531RmB("tiktokec_button_click");
                ConcurrentHashMap<String, Object> commonParams = c70414RkI.LIZIZ;
                o.LJIIIZ(commonParams, "commonParams");
                c70531RmB.LIZIZ.putAll(commonParams);
                c70531RmB.LIZIZ.put("button_name", "promote_product");
                c70531RmB.LIZIZ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r6 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$12(com.ss.android.ugc.aweme.utils.Au2S20S0100000_12 r11, android.view.View r12) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S20S0100000_12.LIZ$12(com.ss.android.ugc.aweme.utils.Au2S20S0100000_12, android.view.View):void");
    }

    public static final void LIZ$13(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        Map<String, String> map;
        if (view != null) {
            PdpAddonFloatWidget pdpAddonFloatWidget = (PdpAddonFloatWidget) au2S20S0100000_12.l0;
            pdpAddonFloatWidget.getClass();
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 1000.0f, 0.0f, 0.0f);
            translateAnimation.setDuration(500L);
            translateAnimation.setAnimationListener(new IDAListenerS236S0100000_12(pdpAddonFloatWidget, 0));
            View view2 = pdpAddonFloatWidget.contentView;
            if (view2 != null) {
                view2.setAnimation(translateAnimation);
            }
            View view3 = pdpAddonFloatWidget.contentView;
            if (view3 != null) {
                view3.startAnimation(translateAnimation);
            }
            pdpAddonFloatWidget.LJLJJL = Boolean.TRUE;
            C70414RkI c70414RkI = pdpAddonFloatWidget.getViewModel().LLFII;
            if (c70414RkI != null) {
                RVZ rvz = pdpAddonFloatWidget.LJLJI;
                if (rvz != null) {
                    map = rvz.LJI;
                } else {
                    map = null;
                }
                if (C26847AgF.LIZ()) {
                    C78946Uyc.LJJII(c70414RkI.LJIJI(), new C70982RtS(), new AqS135S0200000_4(c70414RkI, (C70414RkI) map, (Map<String, ? extends Object>) 311));
                } else {
                    C76542zS.LJ("tiktokec_add_on_entrance_cancel", new AqS135S0200000_4(c70414RkI, (C70414RkI) map, (Map<String, ? extends Object>) 314));
                }
            }
            C70522Rm2.LIZ.LIZJ(1, 0);
        }
    }

    public static final void LIZ$14(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            if (((PdpBottomNavBarWidget) au2S20S0100000_12.l0).getViewModel().LLIIIILZ) {
                FFL LJIIIZ = FFL.LJIIIZ();
                AnchorPdpPreloadModel anchorPdpPreloadModel = C70084Rey.LIZ;
                LJIIIZ.getClass();
                AnchorPdpPreloadModel anchorPdpPreloadModel2 = (AnchorPdpPreloadModel) FFL.LJIJ(true, "ec_anchor_pdp_preload_opt_android", 31744, AnchorPdpPreloadModel.class, anchorPdpPreloadModel);
                if (anchorPdpPreloadModel2 != null) {
                    anchorPdpPreloadModel = anchorPdpPreloadModel2;
                }
                if (anchorPdpPreloadModel.enable == 1) {
                    C26048AKe c26048AKe = new C26048AKe(view);
                    c26048AKe.LJI(((PdpBottomNavBarWidget) au2S20S0100000_12.l0).getContext().getString(R.string.f3i));
                    c26048AKe.LJII();
                    return;
                }
            }
            PdpBottomNavBarWidget pdpBottomNavBarWidget = (PdpBottomNavBarWidget) au2S20S0100000_12.l0;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            pdpBottomNavBarWidget.checkLoginAndDo(context, new AqS159S0200000_12((PdpBottomNavBarWidget) au2S20S0100000_12.l0, view, 15));
        }
    }

    public static final void LIZ$15(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).onMoreIconClick(view);
        }
    }

    public static final void LIZ$16(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).onMoreIconClick(view);
        }
    }

    public static final void LIZ$17(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).getViewModel().Ov0(C77125UOr.LIZJ((PdpHeadNavBarWidget) au2S20S0100000_12.l0), ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).getFragment());
        }
    }

    public static final void LIZ$18(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            PdpViewModel viewModel = ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).getViewModel();
            viewModel.getClass();
            viewModel.setStateImmediate(new AqS36S0001000_12(0, 1));
            C26059AKp.LIZ().LIZ("ec_back_from_review", "{}");
        }
    }

    public static final void LIZ$19(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            Activity LIZ = FT5.LIZ(view, "view.context");
            if (LIZ != null) {
                ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).getViewModel().Ow0(LIZ);
            }
            ((PdpHeadNavBarWidget) au2S20S0100000_12.l0).logShareIconClick();
        }
    }

    public static final void LIZ$2(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$20(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S20S0100000_12.l0).invoke();
        }
    }

    public static final void LIZ$21(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S20S0100000_12.l0).invoke();
        }
    }

    public static final void LIZ$22(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        SkuItem skuItem;
        String str;
        Price price;
        InterfaceC71003Rtn interfaceC71003Rtn;
        List<SkuItem> list;
        if (view != null) {
            String Kv0 = ((SkuPanelBottomWidget) au2S20S0100000_12.l0).getMViewModel().Kv0();
            if (Kv0 != null) {
                SkuPanelViewModel.Uv0(((SkuPanelBottomWidget) au2S20S0100000_12.l0).getViewModel(), ((SkuPanelBottomWidget) au2S20S0100000_12.l0).getContainer().getContext().getResources().getString(R.string.f3u, Kv0));
                ((SkuPanelBottomWidget) au2S20S0100000_12.l0).getViewModel().getClass();
                SkuPanelViewModel.gw0(Kv0);
                ((SkuPanelBottomWidget) au2S20S0100000_12.l0).sendUncheckedSpecData(Kv0);
                return;
            }
            SkuPanelBottomWidget skuPanelBottomWidget = (SkuPanelBottomWidget) au2S20S0100000_12.l0;
            View view2 = skuPanelBottomWidget.contentView;
            if (view2 == null) {
                return;
            }
            SkuPanelViewModel viewModel = skuPanelBottomWidget.getViewModel();
            View view3 = ((SkuPanelBottomWidget) au2S20S0100000_12.l0).contentView;
            if (view3 != null) {
                C79234V7u.LJJIJ(view3);
            }
            viewModel.getClass();
            SkuPanelState skuPanelState = viewModel.LJLLI;
            String str2 = null;
            if (skuPanelState != null) {
                SkuInfo skuInfo = viewModel.LJLLILLLL;
                if (skuInfo != null) {
                    list = skuInfo.skuList;
                } else {
                    list = null;
                }
                skuItem = skuPanelState.getFullSkuItem(list);
            } else {
                skuItem = null;
            }
            InterfaceC36571c5 LJIIIZ = C79234V7u.LJIIIZ(view2);
            if ((LJIIIZ instanceof InterfaceC71003Rtn) && (interfaceC71003Rtn = (InterfaceC71003Rtn) LJIIIZ) != null) {
                C78946Uyc.LJJII(interfaceC71003Rtn, new C70917RsP(), new AqS178S0100000_12(skuItem, 458));
            }
            if (skuItem == null) {
                return;
            }
            SkuPanelState skuPanelState2 = viewModel.LJLLI;
            if (skuPanelState2 != null) {
                skuPanelState2.setBackToPdp(false);
            }
            SkuPanelState skuPanelState3 = viewModel.LJLLI;
            if (skuPanelState3 != null) {
                skuPanelState3.setCloseFrom(3);
            }
            SkuPanelState skuPanelState4 = viewModel.LJLLI;
            if (skuPanelState4 != null) {
                skuPanelState4.setSkuId(skuItem.skuId);
            }
            SkuPanelState skuPanelState5 = viewModel.LJLLI;
            if (skuPanelState5 != null) {
                skuPanelState5.setLink(skuItem.link);
            }
            SkuPanelState skuPanelState6 = viewModel.LJLLI;
            if (skuPanelState6 != null) {
                skuPanelState6.setProductQuantity(1);
            }
            SkuPanelState skuPanelState7 = viewModel.LJLLI;
            if (skuPanelState7 != null) {
                skuPanelState7.setNeedOpenThirdApp(Boolean.TRUE);
            }
            SkuPanelState skuPanelState8 = viewModel.LJLLI;
            if (skuPanelState8 != null) {
                SkuPrice skuPrice = skuItem.price;
                if (skuPrice != null && (price = skuPrice.realPrice) != null) {
                    str = price.getPriceVal();
                } else {
                    str = null;
                }
                skuPanelState8.setSalePriceValue(str);
            }
            SkuPanelState skuPanelState9 = viewModel.LJLLI;
            if (skuPanelState9 != null) {
                SkuPrice skuPrice2 = skuItem.price;
                if (skuPrice2 != null) {
                    str2 = skuPrice2.originalPriceVal;
                }
                skuPanelState9.setOriginPriceValue(str2);
            }
            viewModel.setState(C70030Re6.LJLIL);
        }
    }

    public static final void LIZ$23(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        CommerceProductInfoView commerceProductInfoView;
        InterfaceC70603RnL interfaceC70603RnL;
        if (view != null && (interfaceC70603RnL = (commerceProductInfoView = (CommerceProductInfoView) au2S20S0100000_12.l0).favoriteListener) != null) {
            interfaceC70603RnL.LIZ(!commerceProductInfoView.isFavorite);
        }
    }

    public static final void LIZ$24(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        CommerceProductInfoView commerceProductInfoView;
        InterfaceC70593RnB interfaceC70593RnB;
        if (view != null && (interfaceC70593RnB = (commerceProductInfoView = (CommerceProductInfoView) au2S20S0100000_12.l0).couponLogListener) != null) {
            interfaceC70593RnB.LIZIZ(commerceProductInfoView.promotionView, commerceProductInfoView.couponTagShowCount, commerceProductInfoView.couponSchema);
        }
    }

    public static final void LIZ$25(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        CommerceProductInfoView commerceProductInfoView;
        InterfaceC70593RnB interfaceC70593RnB;
        if (view != null && (interfaceC70593RnB = (commerceProductInfoView = (CommerceProductInfoView) au2S20S0100000_12.l0).couponLogListener) != null) {
            interfaceC70593RnB.LIZIZ(commerceProductInfoView.promotionView, commerceProductInfoView.couponTagShowCount, commerceProductInfoView.couponSchema);
        }
    }

    public static final void LIZ$26(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC70599RnH interfaceC70599RnH;
        if (view != null && (interfaceC70599RnH = ((C70589Rn7) au2S20S0100000_12.l0).LJLILLLLZI) != null) {
            interfaceC70599RnH.LIZ();
        }
    }

    public static final void LIZ$27(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S20S0100000_12.l0).invoke();
        }
    }

    public static final void LIZ$28(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            C78946Uyc.LJJII(((UsSkuVH) au2S20S0100000_12.l0).getFragment(), new C70917RsP(), new AqS178S0100000_12((UsSkuVH) au2S20S0100000_12.l0, 191));
            PdpViewModel.Rw0(((UsSkuVH) au2S20S0100000_12.l0).getVm(), ((UsSkuVH) au2S20S0100000_12.l0).getFragment().getView(), 0, new IDqS436S0100000_12((UsSkuVH) au2S20S0100000_12.l0, 13), true, null, null, 48);
        }
    }

    public static final void LIZ$29(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((UsSkuHeaderWidget) au2S20S0100000_12.l0).LJLIL.dismissAllowingStateLoss();
        }
    }

    public static final void LIZ$3(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC70844RrE interfaceC70844RrE;
        if (view != null) {
            C70842RrC c70842RrC = (C70842RrC) au2S20S0100000_12.l0;
            C70843RrD[] c70843RrDArr = c70842RrC.LJLJLJ;
            int i = c70842RrC.LJLJL;
            if (c70843RrDArr[i].LJLIL && (interfaceC70844RrE = c70842RrC.LJLJI) != null) {
                interfaceC70844RrE.LIZ(view, (JJZ) ListProtector.get(c70842RrC.LJLILLLLZI, i), ((C70842RrC) au2S20S0100000_12.l0).LJLJL);
            }
        }
    }

    public static final void LIZ$30(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((UsSkuWidget) au2S20S0100000_12.l0).getMViewModel().aw0(((UsSkuWidget) au2S20S0100000_12.l0).LJLIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01ef, code lost:
    
        if (r0 != null) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$31(com.ss.android.ugc.aweme.utils.Au2S20S0100000_12 r23, android.view.View r24) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.Au2S20S0100000_12.LIZ$31(com.ss.android.ugc.aweme.utils.Au2S20S0100000_12, android.view.View):void");
    }

    public static final void LIZ$32(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        TTMInfo ttmInfo;
        TTMBrand brand;
        Fragment LIZLLL;
        FragmentManager childFragmentManager;
        TTMInfo ttmInfo2;
        String vipVerificationSchema;
        VideoMusicTitleAssem videoMusicTitleAssem = (VideoMusicTitleAssem) au2S20S0100000_12.l0;
        if (view == null) {
            return;
        }
        MusicInfo B4 = videoMusicTitleAssem.B4();
        String str = "";
        if (B4 != null) {
            B4.setClickSource("click_source_icon");
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).getAweme().getAid();
            if (aid == null) {
                aid = "";
            }
            MusicDetailService.LJIJJ().LJ(String.valueOf(((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).getAweme().getMusic().getId()), aid);
            IMusicDetailService LJIJJ = MusicDetailService.LJIJJ();
            B4.getProduct();
            String trackId = B4.getTrackId();
            String clipId = B4.getClipId();
            String requestId = B4.getRequestId();
            Map<String, String> logExtraMap = B4.getLogExtraMap();
            boolean isPgc = B4.isPgc();
            o.LJIIIIZZ(LJIJJ, "getService(IMusicDetailService::class.java)");
            LJIJJ.LJIILLIIL(trackId, clipId, aid, requestId, logExtraMap, isPgc);
        }
        if (videoMusicTitleAssem.Y4() && (ttmInfo = ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).getAweme().getTtmInfo()) != null && (brand = ttmInfo.getBrand()) != null && brand.isUX1()) {
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).getAweme();
            if (aweme == null || (ttmInfo2 = aweme.getTtmInfo()) == null || (vipVerificationSchema = ttmInfo2.getVipVerificationSchema()) == null || vipVerificationSchema.length() == 0) {
                if (B4 == null || (LIZLLL = C212428Vi.LIZLLL(videoMusicTitleAssem)) == null || (childFragmentManager = LIZLLL.getChildFragmentManager()) == null) {
                    return;
                }
                IMusicDetailService LJIJJ2 = MusicDetailService.LJIJJ();
                String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).mEventType;
                if (str2 != null) {
                    str = str2;
                }
                LJIJJ2.LJIJ(childFragmentManager, B4, str, "brand_icon", "click_icon");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putSerializable("music_info", B4);
            String str3 = ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).mEventType;
            if (str3 != null) {
                str = str3;
            }
            MG0.LIZ(videoMusicTitleAssem.getContext(), vipVerificationSchema, C44140HUa.LIZ(str, "click_icon", ((VideoItemParams) C51029K0z.LJIILLIIL(videoMusicTitleAssem)).getAweme().getRequestId(), UUID.randomUUID().toString()), bundle);
            return;
        }
        VideoMusicBaseVM A4 = videoMusicTitleAssem.A4();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        VideoMusicBaseVM.mv0(A4, context, view.getId(), false, null, videoMusicTitleAssem.LLILIL, 28);
    }

    public static final void LIZ$33(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        int i;
        Context context = ((VideoMusicTitleAssem) au2S20S0100000_12.l0).getContext();
        if (context != null) {
            VideoMusicTitleAssem videoMusicTitleAssem = (VideoMusicTitleAssem) au2S20S0100000_12.l0;
            VideoMusicBaseVM A4 = videoMusicTitleAssem.A4();
            ImageView imageView = videoMusicTitleAssem.LLIIL;
            if (imageView != null) {
                i = imageView.getId();
            } else {
                i = 0;
            }
            VideoMusicBaseVM.mv0(A4, context, i, false, null, videoMusicTitleAssem.LLILIL, 28);
        }
    }

    public static final void LIZ$34(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            FragmentManager childFragmentManager = ((BillboardImagesFragment) au2S20S0100000_12.l0).getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            C115894gj.LIZ(childFragmentManager, new Bundle());
        }
    }

    public static final void LIZ$35(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((BillboardGlobalViewModel) ((BillboardImagesFragment) au2S20S0100000_12.l0).LJLJI.getValue()).gv0();
            View _$_findCachedViewById = ((BillboardImagesFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.dbm);
            if (_$_findCachedViewById != null) {
                OUP.LJIJJLI(_$_findCachedViewById);
            }
        }
    }

    public static final void LIZ$36(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            FragmentManager childFragmentManager = ((BillboardTemplateFragment) au2S20S0100000_12.l0).getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            C115894gj.LIZ(childFragmentManager, new Bundle());
        }
    }

    public static final void LIZ$37(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((BillboardTemplateFragment) au2S20S0100000_12.l0).vl().gv0();
            View flAutoDisplayGuide = ((BillboardTemplateFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.dbm);
            o.LJIIIIZZ(flAutoDisplayGuide, "flAutoDisplayGuide");
            OUP.LJIJJLI(flAutoDisplayGuide);
        }
    }

    public static final void LIZ$38(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$39(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            C70172RgO.LIZ(C77125UOr.LIZJ((TtfHeadVH) au2S20S0100000_12.l0), new AqS159S0200000_12((TtfHeadVH) au2S20S0100000_12.l0, view, 42));
        }
    }

    public static final void LIZ$4(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            C70656RoC.LIZ(C77125UOr.LIZJ((GlobalHeaderVH) au2S20S0100000_12.l0), new AqS159S0200000_12((GlobalHeaderVH) au2S20S0100000_12.l0, view, 7));
        }
    }

    public static final void LIZ$40(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            if (((TtfHeadVH) au2S20S0100000_12.l0).N().LJFF()) {
                if (((TtfHeadVH) au2S20S0100000_12.l0).N().isMute()) {
                    ((TtfHeadVH) au2S20S0100000_12.l0).N().LJIIIZ();
                    return;
                } else {
                    ((TtfHeadVH) au2S20S0100000_12.l0).N().LIZIZ();
                    return;
                }
            }
            ((TtfHeadVH) au2S20S0100000_12.l0).N().resume();
        }
    }

    public static final void LIZ$41(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$42(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$43(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$44(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$45(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC88472Yns) au2S20S0100000_12.l0).invoke(view);
        }
    }

    public static final void LIZ$46(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((SkuPanelFragment) au2S20S0100000_12.l0).vl().aw0(((SkuPanelFragment) au2S20S0100000_12.l0).LJLJJLL);
        }
    }

    public static final void LIZ$47(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        Aweme aweme;
        if (view != null) {
            ECommerceAnchorPanelViewModel viewModel = ((S02) au2S20S0100000_12.l0).LIZ.getViewModel();
            Context context = ((S02) au2S20S0100000_12.l0).LIZ.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            ECommerceAnchorPanelViewModel.tv0(viewModel, context, null, "ecom_panel", null, 92);
            Context context2 = ((S02) au2S20S0100000_12.l0).LIZ.getContext();
            o.LJIIIIZZ(context2, "rootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI != null) {
                C71361RzZ c71361RzZ = C71361RzZ.LIZ;
                int size = ((S02) au2S20S0100000_12.l0).LIZ.getViewModel().LJLJJL.size();
                c71361RzZ.getClass();
                PanelOpenInfo panelOpenInfo = new PanelOpenInfo(0, null, C71361RzZ.LJJIJL(size, 2), true, 1, 3, null);
                InterfaceC44105HSr interfaceC44105HSr = ((S02) au2S20S0100000_12.l0).LIZ.getViewModel().LJLIL;
                if (interfaceC44105HSr != null) {
                    aweme = interfaceC44105HSr.LJJLL();
                } else {
                    aweme = null;
                }
                C71361RzZ.LJJJJL(c71361RzZ, LJJIFFI, C71360RzY.LJJIIZI(aweme, ((S02) au2S20S0100000_12.l0).LIZ.getViewModel().LJLIL, "video_single_anchor", panelOpenInfo, "video_single_anchor"), panelOpenInfo, ((S02) au2S20S0100000_12.l0).LIZ.getViewModel().LJLIL, 16);
            }
        }
    }

    public static final void LIZ$48(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        Aweme aweme;
        if (view != null) {
            ECommerceAnchorPanelViewModel viewModel = ((S05) au2S20S0100000_12.l0).LIZ.getViewModel();
            Context context = ((S05) au2S20S0100000_12.l0).LIZ.getContext();
            o.LJIIIIZZ(context, "rootView.context");
            ECommerceAnchorPanelViewModel.tv0(viewModel, context, null, "ecom_panel", null, 92);
            Context context2 = ((S05) au2S20S0100000_12.l0).LIZ.getContext();
            o.LJIIIIZZ(context2, "rootView.context");
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context2);
            if (LJJIFFI != null) {
                C71361RzZ c71361RzZ = C71361RzZ.LIZ;
                int size = ((S05) au2S20S0100000_12.l0).LIZ.getViewModel().LJLJJL.size();
                c71361RzZ.getClass();
                PanelOpenInfo panelOpenInfo = new PanelOpenInfo(0, null, C71361RzZ.LJJIJL(size, 2), true, 1, 3, null);
                InterfaceC44105HSr interfaceC44105HSr = ((S05) au2S20S0100000_12.l0).LIZ.getViewModel().LJLIL;
                if (interfaceC44105HSr != null) {
                    aweme = interfaceC44105HSr.LJJLL();
                } else {
                    aweme = null;
                }
                C71361RzZ.LJJJJL(c71361RzZ, LJJIFFI, C71360RzY.LJJIIZI(aweme, ((S05) au2S20S0100000_12.l0).LIZ.getViewModel().LJLIL, "video_single_anchor", panelOpenInfo, "video_single_anchor"), panelOpenInfo, ((S05) au2S20S0100000_12.l0).LIZ.getViewModel().LJLIL, 16);
            }
        }
    }

    public static final void LIZ$49(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((S07) au2S20S0100000_12.l0).LJIIIIZZ("anchor");
        }
    }

    public static final void LIZ$5(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            if (((GlobalHeaderVH) au2S20S0100000_12.l0).P().LJFF()) {
                if (((GlobalHeaderVH) au2S20S0100000_12.l0).P().isMute()) {
                    ((GlobalHeaderVH) au2S20S0100000_12.l0).P().LJIIIZ();
                    return;
                } else {
                    ((GlobalHeaderVH) au2S20S0100000_12.l0).P().LIZIZ();
                    return;
                }
            }
            ((GlobalHeaderVH) au2S20S0100000_12.l0).P().resume();
        }
    }

    public static final void LIZ$50(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((S07) au2S20S0100000_12.l0).LJIIIIZZ("button");
        }
    }

    public static final void LIZ$51(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        String str;
        if (view != null) {
            Context context = ((RegionInputElementViewHolder) au2S20S0100000_12.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("geoname_ids", C47261Igj.LJJIJ(((BillingAddressViewModel) ((RegionInputElementViewHolder) au2S20S0100000_12.l0).LJLIL.getValue()).kv0().geoNameId));
            oszArr[1] = new OSZ("is_full_screen", CardStruct.IStatusCode.DEFAULT);
            oszArr[2] = new OSZ("is_show_searchbar", V1M.LJJJJZ(!((Boolean) ((RegionInputElementViewHolder) au2S20S0100000_12.l0).LJLILLLLZI.getValue()).booleanValue()));
            oszArr[3] = new OSZ("without_next_level", String.valueOf(((Boolean) ((RegionInputElementViewHolder) au2S20S0100000_12.l0).LJLILLLLZI.getValue()).booleanValue()));
            HashMap hashMap = new HashMap();
            hashMap.putAll(C27493Aqf.LIZ);
            hashMap.put("previous_page", "billing_address");
            String str2 = ((BillingAddressViewModel) ((RegionInputElementViewHolder) au2S20S0100000_12.l0).LJLIL.getValue()).kv0().code;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                String str3 = PaymentCacheHelper.LJFF().code;
                if (str3 != null) {
                    str = str3.toLowerCase(Locale.ROOT);
                    o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } else {
                    str = "";
                }
            }
            hashMap.put("location", str);
            oszArr[4] = new OSZ("trackParams", hashMap);
            C26867AgZ.LIZIZ(context, "aweme://ec/geo_select_v2", C113554cx.LJJL(oszArr), false).open();
        }
    }

    public static final void LIZ$52(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((DialogC70776Rq8) au2S20S0100000_12.l0).dismiss();
        }
    }

    public static final void LIZ$53(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S20S0100000_12.l0).invoke();
        }
    }

    public static final void LIZ$54(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S20S0100000_12.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$55(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2L) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("assistant");
        }
    }

    public static final void LIZ$56(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2L) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("pic");
        }
    }

    public static final void LIZ$57(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2L) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("title");
        }
    }

    public static final void LIZ$58(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2L) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("button");
        }
    }

    public static final void LIZ$59(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2L) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("other");
        }
    }

    public static final void LIZ$6(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            CCDCAddCardViewModel viewModel = ((CCDCAddCardAssem) au2S20S0100000_12.l0).getViewModel();
            String logBtName = ((CCDCAddCardAssem) au2S20S0100000_12.l0).getHierarchyData().LJLJJL;
            viewModel.getClass();
            o.LJIIIZ(logBtName, "logBtName");
            viewModel.withState(new AqS65S1100000_12(viewModel, logBtName, 8));
            ((CCDCAddCardAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cd9).requestFocus();
        }
    }

    public static final void LIZ$60(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S20S0100000_12.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$61(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2M) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("pic");
        }
    }

    public static final void LIZ$62(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2M) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("title");
        }
    }

    public static final void LIZ$63(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2M) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("button");
        }
    }

    public static final void LIZ$64(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2M) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("other");
        }
    }

    public static final void LIZ$65(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S20S0100000_12.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$66(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2N) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("pic");
        }
    }

    public static final void LIZ$67(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2N) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("title");
        }
    }

    public static final void LIZ$68(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2N) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("button");
        }
    }

    public static final void LIZ$69(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2N) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("other");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZ$7(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            C70414RkI c70414RkI = ((PdpCouponsViewHolder) au2S20S0100000_12.l0).getViewModel().LLFII;
            if (c70414RkI != null) {
                c70414RkI.LJJIIZI(((C69638RUs) ((PdpCouponsViewHolder) au2S20S0100000_12.l0).getItem()).LJ);
            }
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S20S0100000_12.l0;
            pdpCouponsViewHolder.jumpCouponPage(((C69638RUs) pdpCouponsViewHolder.getItem()).LIZJ, null, "discounts_module");
        }
    }

    public static final void LIZ$70(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC65784Pro interfaceC65784Pro;
        if (view != null && (interfaceC65784Pro = (InterfaceC65784Pro) au2S20S0100000_12.l0) != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ$71(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2K) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("button");
        }
    }

    public static final void LIZ$72(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2K) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("pic");
        }
    }

    public static final void LIZ$73(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2K) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("title");
        }
    }

    public static final void LIZ$74(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC71446S2g popCardViewCallback;
        if (view != null && (popCardViewCallback = ((S2K) au2S20S0100000_12.l0).getPopCardViewCallback()) != null) {
            popCardViewCallback.onClick("other");
        }
    }

    public static final void LIZ$75(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ATMCardViewModel x3 = ((ATMCardAssem) au2S20S0100000_12.l0).x3();
            String btName = ((ATMCardAssem) au2S20S0100000_12.l0).v3().LJLJJL;
            x3.getClass();
            o.LJIIIZ(btName, "btName");
            XKX.LIZLLL(ViewModelKt.getViewModelScope(x3), null, null, new C71702SCc(x3, btName, null), 3);
            ((ATMCardAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cd9).requestFocus();
        }
    }

    public static final void LIZ$76(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            View view2 = ((SkuBrickVH) au2S20S0100000_12.l0).itemView;
            C78946Uyc.LJJIIJ(view2, OUR.LIZLLL(view2, "itemView"), new AqS178S0100000_12((SkuBrickVH) au2S20S0100000_12.l0, 466));
            PdpMainViewModel M = ((SkuBrickVH) au2S20S0100000_12.l0).M();
            View view3 = ((SkuBrickVH) au2S20S0100000_12.l0).itemView;
            M.getClass();
            if (view3 == null || view3.getContext() == null) {
                C78983UzD.LJIILL("Open sku failed. Context is NULL");
            } else {
                SkuPanelStarter.LIZIZ = Long.valueOf(System.currentTimeMillis());
                XKX.LIZLLL(M.getAssemVMScope(), C36636EZk.LIZ, null, new C70301RiT(M, view3, 0, null), 2);
            }
        }
    }

    public static final void LIZ$77(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        Long l;
        Long id;
        String str;
        Object obj;
        Boolean bool;
        EditProfileBadgeModel editProfileBadgeModel;
        EditProfileBadgeModel editProfileBadgeModel2;
        EditProfileBadgeModel editProfileBadgeModel3;
        EditProfileBadgeModel editProfileBadgeModel4;
        String str2;
        Long l2;
        String str3;
        String str4;
        Boolean bool2;
        EditProfileBadgeDialog editProfileBadgeDialog = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
        if (editProfileBadgeDialog.LJLJJL) {
            EditProfileBadgeModel editProfileBadgeModel5 = editProfileBadgeDialog.LJLJJI;
            boolean z = false;
            Boolean bool3 = null;
            if (editProfileBadgeModel5 == null || editProfileBadgeModel5.getUrl() == null || (editProfileBadgeModel = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJI) == null || editProfileBadgeModel.getId() == null || (editProfileBadgeModel2 = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJI) == null || editProfileBadgeModel2.getName() == null || (editProfileBadgeModel3 = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJI) == null || editProfileBadgeModel3.getShouldShow() == null || (editProfileBadgeModel4 = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJI) == null || editProfileBadgeModel4.getDescription() == null) {
                ProfileBadgeStruct profileBadgeStruct = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJLL;
                if (profileBadgeStruct != null) {
                    profileBadgeStruct.setShouldShow(false);
                }
            } else {
                EditProfileBadgeDialog editProfileBadgeDialog2 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                ProfileBadgeStruct profileBadgeStruct2 = editProfileBadgeDialog2.LJLJJLL;
                if (profileBadgeStruct2 != null) {
                    EditProfileBadgeModel editProfileBadgeModel6 = editProfileBadgeDialog2.LJLJJI;
                    if (editProfileBadgeModel6 != null) {
                        str2 = editProfileBadgeModel6.getUrl();
                    } else {
                        str2 = null;
                    }
                    o.LJI(str2);
                    profileBadgeStruct2.setUrl(str2);
                }
                EditProfileBadgeDialog editProfileBadgeDialog3 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                ProfileBadgeStruct profileBadgeStruct3 = editProfileBadgeDialog3.LJLJJLL;
                if (profileBadgeStruct3 != null) {
                    EditProfileBadgeModel editProfileBadgeModel7 = editProfileBadgeDialog3.LJLJJI;
                    if (editProfileBadgeModel7 != null) {
                        l2 = editProfileBadgeModel7.getId();
                    } else {
                        l2 = null;
                    }
                    o.LJI(l2);
                    profileBadgeStruct3.setId(l2);
                }
                EditProfileBadgeDialog editProfileBadgeDialog4 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                ProfileBadgeStruct profileBadgeStruct4 = editProfileBadgeDialog4.LJLJJLL;
                if (profileBadgeStruct4 != null) {
                    EditProfileBadgeModel editProfileBadgeModel8 = editProfileBadgeDialog4.LJLJJI;
                    if (editProfileBadgeModel8 != null) {
                        str3 = editProfileBadgeModel8.getName();
                    } else {
                        str3 = null;
                    }
                    o.LJI(str3);
                    profileBadgeStruct4.setName(str3);
                }
                EditProfileBadgeDialog editProfileBadgeDialog5 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                ProfileBadgeStruct profileBadgeStruct5 = editProfileBadgeDialog5.LJLJJLL;
                if (profileBadgeStruct5 != null) {
                    EditProfileBadgeModel editProfileBadgeModel9 = editProfileBadgeDialog5.LJLJJI;
                    if (editProfileBadgeModel9 != null) {
                        str4 = editProfileBadgeModel9.getDescription();
                    } else {
                        str4 = null;
                    }
                    o.LJI(str4);
                    profileBadgeStruct5.setDescription(str4);
                }
                EditProfileBadgeDialog editProfileBadgeDialog6 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                ProfileBadgeStruct profileBadgeStruct6 = editProfileBadgeDialog6.LJLJJLL;
                if (profileBadgeStruct6 != null) {
                    EditProfileBadgeModel editProfileBadgeModel10 = editProfileBadgeDialog6.LJLJJI;
                    if (editProfileBadgeModel10 != null) {
                        bool2 = editProfileBadgeModel10.getShouldShow();
                    } else {
                        bool2 = null;
                    }
                    o.LJI(bool2);
                    profileBadgeStruct6.setShouldShow(bool2.booleanValue());
                }
            }
            EditProfileBadgeModel editProfileBadgeModel11 = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJI;
            if (editProfileBadgeModel11 != null) {
                l = editProfileBadgeModel11.getId();
            } else {
                l = null;
            }
            if (l == null) {
                ((ImageView) ((EditProfileBadgeDialog) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cnj)).setVisibility(8);
                EditProfileBadgeDialog editProfileBadgeDialog7 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                ProfileBadgeStruct profileBadgeStruct7 = editProfileBadgeDialog7.LJLJJLL;
                if (profileBadgeStruct7 != null && Boolean.valueOf(profileBadgeStruct7.getShouldShow()) != null) {
                    ProfileBadgeStruct profileBadgeStruct8 = editProfileBadgeDialog7.LJLJJLL;
                    if (profileBadgeStruct8 != null) {
                        bool = Boolean.valueOf(profileBadgeStruct8.getShouldShow());
                    } else {
                        bool = null;
                    }
                    o.LJI(bool);
                    if (bool.booleanValue()) {
                        z = true;
                    }
                }
                if (editProfileBadgeDialog7.LJLLJ == null) {
                    editProfileBadgeDialog7.LJLLJ = new C72736Sge(editProfileBadgeDialog7);
                }
                C72736Sge c72736Sge = editProfileBadgeDialog7.LJLLJ;
                if (c72736Sge != null) {
                    editProfileBadgeDialog7.LJLL.removeProfileBadgeIsShowListener(c72736Sge);
                    editProfileBadgeDialog7.LJLL.updateProfileBadgeIsShow(z, c72736Sge);
                }
            } else {
                ((ImageView) ((EditProfileBadgeDialog) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.cnj)).setVisibility(0);
                EditProfileBadgeDialog editProfileBadgeDialog8 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
                if (editProfileBadgeDialog8.LJLLILLLL == null) {
                    editProfileBadgeDialog8.LJLLILLLL = new C72735Sgd(editProfileBadgeDialog8);
                }
                ProfileBadgeStruct profileBadgeStruct9 = editProfileBadgeDialog8.LJLJJLL;
                if (profileBadgeStruct9 != null && (id = profileBadgeStruct9.getId()) != null) {
                    long longValue = id.longValue();
                    C72735Sgd c72735Sgd = editProfileBadgeDialog8.LJLLILLLL;
                    if (c72735Sgd != null) {
                        editProfileBadgeDialog8.LJLL.removeProfileBadgeIdListener(c72735Sgd);
                        editProfileBadgeDialog8.LJLL.updateProfileBadgeId(longValue, c72735Sgd);
                    }
                }
            }
            AccountService.LJIJ().LJFF().updateCurProfileBadge(((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJLL);
            EditProfileBadgeDialog editProfileBadgeDialog9 = (EditProfileBadgeDialog) au2S20S0100000_12.l0;
            ProfileBadgeStruct profileBadgeStruct10 = editProfileBadgeDialog9.LJLJJLL;
            if (profileBadgeStruct10 != null) {
                str = profileBadgeStruct10.getUrl();
            } else {
                str = null;
            }
            ProfileBadgeStruct profileBadgeStruct11 = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJLL;
            if (profileBadgeStruct11 != null) {
                bool3 = Boolean.valueOf(profileBadgeStruct11.getShouldShow());
            }
            editProfileBadgeDialog9.Al(bool3, str);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "personal_homepage");
            ProfileBadgeStruct profileBadgeStruct12 = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLJJLL;
            if (profileBadgeStruct12 == null || (obj = profileBadgeStruct12.getId()) == null) {
                obj = "";
            }
            c188727au.LJFF(obj, "badge_id");
            FMX.LJIIL("profile_badge_change_save", c188727au.LIZ);
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((EditProfileBadgeDialog) au2S20S0100000_12.l0).LJLILLLLZI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        }
    }

    public static final void LIZ$78(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        String str;
        if (view != null) {
            Context context = ((USBARegionInputElementViewHolder) au2S20S0100000_12.l0).itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("geoname_ids", C47261Igj.LJJIJ(((Region) ((USBARegionInputElementViewHolder) au2S20S0100000_12.l0).getViewModel().LJLL.getValue()).geoNameId));
            oszArr[1] = new OSZ("is_full_screen", CardStruct.IStatusCode.DEFAULT);
            oszArr[2] = new OSZ("is_show_searchbar", V1M.LJJJJZ(!((Boolean) ((USBARegionInputElementViewHolder) au2S20S0100000_12.l0).LJLILLLLZI.getValue()).booleanValue()));
            oszArr[3] = new OSZ("without_next_level", String.valueOf(((Boolean) ((USBARegionInputElementViewHolder) au2S20S0100000_12.l0).LJLILLLLZI.getValue()).booleanValue()));
            HashMap hashMap = new HashMap();
            hashMap.putAll(C28112B1o.LIZIZ);
            hashMap.put("page_name", "ccdc_card_info");
            String str2 = ((Region) ((USBARegionInputElementViewHolder) au2S20S0100000_12.l0).getViewModel().LJLL.getValue()).code;
            if (str2 != null) {
                str = str2.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            } else {
                String str3 = PaymentCacheHelper.LJFF().code;
                if (str3 != null) {
                    str = str3.toLowerCase(Locale.ROOT);
                    o.LJIIIIZZ(str, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                } else {
                    str = "";
                }
            }
            hashMap.put("location", str);
            oszArr[4] = new OSZ("trackParams", hashMap);
            C26867AgZ.LIZIZ(context, "aweme://ec/geo_select_v2", C113554cx.LJJL(oszArr), false).open();
        }
    }

    public static final void LIZ$79(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            C71096RvI c71096RvI = (C71096RvI) au2S20S0100000_12.l0;
            InterfaceC88472Yns<? super C71096RvI, C76800UCe> interfaceC88472Yns = c71096RvI.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c71096RvI);
                C76732zl c76732zl = new C76732zl();
                C71096RvI c71096RvI2 = (C71096RvI) au2S20S0100000_12.l0;
                int i = c71096RvI2.LJLIL;
                if (i < c71096RvI2.LJLILLLLZI.LJLILLLLZI) {
                    c71096RvI2.LJLJJI.invoke(Integer.valueOf(i + 1), ((C71096RvI) au2S20S0100000_12.l0).LJLJI);
                    c76732zl.element = ((C71096RvI) au2S20S0100000_12.l0).LJLIL + 1;
                    if (C27927Axf.LIZ()) {
                        ((C71096RvI) au2S20S0100000_12.l0).setQuantity(c76732zl.element);
                    }
                } else {
                    String string = c71096RvI2.getContext().getResources().getString(R.string.f3v, Integer.valueOf(((C71096RvI) au2S20S0100000_12.l0).LJLILLLLZI.LJLILLLLZI));
                    o.LJIIIIZZ(string, "context.resources.getStr…t_max, quantityLimit.max)");
                    C26048AKe c26048AKe = new C26048AKe((C71096RvI) au2S20S0100000_12.l0);
                    c26048AKe.LJI(string);
                    c26048AKe.LJII();
                    C78946Uyc.LJJII((C71096RvI) au2S20S0100000_12.l0, new C70947Rst(), C71097RvJ.LJLIL);
                    c76732zl.element = ((C71096RvI) au2S20S0100000_12.l0).LJLIL;
                }
                C78946Uyc.LJJII((C71096RvI) au2S20S0100000_12.l0, new C70917RsP(), new AqS143S0200000_12((C71096RvI) au2S20S0100000_12.l0, c76732zl, 114));
                return;
            }
            o.LJIJI("clickListener");
            throw null;
        }
    }

    public static final void LIZ$8(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S20S0100000_12.l0;
            C70470RlC c70470RlC = (C70470RlC) pdpCouponsViewHolder.itemView.findViewById(R.id.fox);
            o.LJIIIIZZ(c70470RlC, "itemView.left_item");
            pdpCouponsViewHolder.onBodyClick(pdpCouponsViewHolder.getVoucherByView(c70470RlC));
        }
    }

    public static final void LIZ$80(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        Integer num;
        boolean z;
        String quantityString;
        String str;
        if (view != null) {
            C71096RvI c71096RvI = (C71096RvI) au2S20S0100000_12.l0;
            InterfaceC88472Yns<? super C71096RvI, C76800UCe> interfaceC88472Yns = c71096RvI.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c71096RvI);
                C76732zl c76732zl = new C76732zl();
                C71096RvI c71096RvI2 = (C71096RvI) au2S20S0100000_12.l0;
                int i = c71096RvI2.LJLIL;
                if (i > c71096RvI2.LJLILLLLZI.LJLIL) {
                    c71096RvI2.LJLJJI.invoke(Integer.valueOf(i - 1), ((C71096RvI) au2S20S0100000_12.l0).LJLJI);
                    c76732zl.element = ((C71096RvI) au2S20S0100000_12.l0).LJLIL - 1;
                    if (C27927Axf.LIZ()) {
                        ((C71096RvI) au2S20S0100000_12.l0).setQuantity(c76732zl.element);
                    }
                } else {
                    C68322mC c68322mC = new C68322mC();
                    c68322mC.element = "select_atleast_x";
                    C27959AyB c27959AyB = ((C71096RvI) au2S20S0100000_12.l0).LJLJLLL;
                    if (c27959AyB == null || (num = c27959AyB.LJIIL) == null || num.intValue() <= 1) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        c68322mC.element = "min_quantity_limitation";
                        Resources resources = ((C71096RvI) au2S20S0100000_12.l0).getContext().getResources();
                        int i2 = ((C71096RvI) au2S20S0100000_12.l0).LJLILLLLZI.LJLIL;
                        quantityString = resources.getQuantityString(R.plurals.ds, i2, Integer.valueOf(i2));
                        o.LJIIIIZZ(quantityString, "context.resources.getQua…in,\n                    )");
                        C71096RvI c71096RvI3 = (C71096RvI) au2S20S0100000_12.l0;
                        C71094RvG c71094RvG = c71096RvI3.LJLL;
                        if (c71094RvG != null && (str = c71094RvG.LJI) != null) {
                            quantityString = C71095RvH.LIZ(c71096RvI3.LJLILLLLZI.LJLIL, str);
                        }
                    } else {
                        Resources resources2 = ((C71096RvI) au2S20S0100000_12.l0).getContext().getResources();
                        int i3 = ((C71096RvI) au2S20S0100000_12.l0).LJLILLLLZI.LJLIL;
                        quantityString = resources2.getQuantityString(R.plurals.ds, i3, Integer.valueOf(i3));
                        o.LJIIIIZZ(quantityString, "{\n                    co…      )\n                }");
                    }
                    C26048AKe c26048AKe = new C26048AKe((C71096RvI) au2S20S0100000_12.l0);
                    c26048AKe.LJI(quantityString);
                    c26048AKe.LJII();
                    C78946Uyc.LJJII((C71096RvI) au2S20S0100000_12.l0, new C70947Rst(), new AqS143S0200000_12(c68322mC, (C68322mC<String>) au2S20S0100000_12.l0, (C71096RvI) 115));
                    c76732zl.element = ((C71096RvI) au2S20S0100000_12.l0).LJLIL;
                }
                C78946Uyc.LJJII((C71096RvI) au2S20S0100000_12.l0, new C70917RsP(), new AqS143S0200000_12((C71096RvI) au2S20S0100000_12.l0, c76732zl, 116));
                if (C27927Axf.LIZ()) {
                    ((C71096RvI) au2S20S0100000_12.l0).LJLIL = c76732zl.element;
                    return;
                }
                return;
            }
            o.LJIJI("clickListener");
            throw null;
        }
    }

    public static final void LIZ$81(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((InterfaceC65784Pro) au2S20S0100000_12.l0).invoke();
        }
    }

    public static final void LIZ$82(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        C71118Rve c71118Rve;
        VoucherInfo voucherInfo;
        AqS194S0100000_12 aqS194S0100000_12;
        if (view != null && (voucherInfo = (c71118Rve = (C71118Rve) au2S20S0100000_12.l0).LJLILLLLZI) != null && (aqS194S0100000_12 = c71118Rve.LJLJLJ) != null) {
            aqS194S0100000_12.invoke(view, voucherInfo);
        }
    }

    public static final void LIZ$83(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC88472Yns interfaceC88472Yns;
        if (view != null && (interfaceC88472Yns = (InterfaceC88472Yns) au2S20S0100000_12.l0) != null) {
            interfaceC88472Yns.invoke(view);
        }
    }

    public static final void LIZ$84(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((View.OnClickListener) au2S20S0100000_12.l0).onClick(view);
        }
    }

    public static final void LIZ$85(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((View.OnClickListener) au2S20S0100000_12.l0).onClick(view);
        }
    }

    public static final void LIZ$86(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((View.OnClickListener) au2S20S0100000_12.l0).onClick(view);
        }
    }

    public static final void LIZ$87(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        String str;
        SelectReason reason;
        String str2;
        if (view != null) {
            S4U s4u = (S4U) au2S20S0100000_12.l0;
            if (!s4u.LJIIJJI || !s4u.LJIIJ) {
                return;
            }
            List<S4W> list = s4u.LJI;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((S4W) next).LIZIZ()) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((S4W) it2.next()).getReason());
            }
            List<S4V> list2 = ((S4U) au2S20S0100000_12.l0).LJII;
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = ((ArrayList) list2).iterator();
            while (true) {
                str = "";
                if (!it3.hasNext()) {
                    break;
                }
                Object next2 = it3.next();
                if (!o.LJ(String.valueOf(((C19K) ((S4V) next2).LIZ(R.id.ilc)).getText()), "")) {
                    arrayList3.add(next2);
                }
            }
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList4.add(((S4V) it4.next()).getReason());
            }
            SubmitQuitReason submitQuitReason = new SubmitQuitReason(0, arrayList2, arrayList4);
            InterfaceC88472Yns<SubmitQuitReason, C76800UCe> interfaceC88472Yns = ((S4U) au2S20S0100000_12.l0).LIZLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(submitQuitReason);
            }
            TuxSheet tuxSheet = ((S4U) au2S20S0100000_12.l0).LJFF;
            Object obj = null;
            if (tuxSheet != null) {
                tuxSheet.dismissAllowingStateLoss();
                S4U s4u2 = (S4U) au2S20S0100000_12.l0;
                HashMap<String, Object> hashMap = s4u2.LJ;
                Iterator it5 = ((ArrayList) s4u2.LJI).iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next3 = it5.next();
                    if (((S4W) next3).LIZIZ()) {
                        obj = next3;
                        break;
                    }
                }
                S4W s4w = (S4W) obj;
                if (s4w != null && (reason = s4w.getReason()) != null && (str2 = reason.reasonKey) != null) {
                    str = str2;
                }
                C27949Ay1.LJIJ("submit", "return", hashMap, "quit_pay_reason", str, Boolean.FALSE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435392);
                return;
            }
            o.LJIJI("dialog");
            throw null;
        }
    }

    public static final void LIZ$88(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            if (((UsHeaderVH) au2S20S0100000_12.l0).M().LJFF()) {
                if (((UsHeaderVH) au2S20S0100000_12.l0).M().isMute()) {
                    ((UsHeaderVH) au2S20S0100000_12.l0).M().LJIIIZ();
                    return;
                } else {
                    ((UsHeaderVH) au2S20S0100000_12.l0).M().LIZIZ();
                    return;
                }
            }
            ((UsHeaderVH) au2S20S0100000_12.l0).M().resume();
        }
    }

    public static final void LIZ$89(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            ((TextView) ((ViewOnFocusChangeListenerC71602S8g) au2S20S0100000_12.l0).LIZ(R.id.lr)).setText("");
        }
    }

    public static final void LIZ$9(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            PdpCouponsViewHolder pdpCouponsViewHolder = (PdpCouponsViewHolder) au2S20S0100000_12.l0;
            C70470RlC c70470RlC = (C70470RlC) pdpCouponsViewHolder.itemView.findViewById(R.id.j2j);
            o.LJIIIIZZ(c70470RlC, "itemView.right_item");
            pdpCouponsViewHolder.onBodyClick(pdpCouponsViewHolder.getVoucherByView(c70470RlC));
        }
    }

    public static final void LIZ$90(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            MKO recyclerView = (MKO) ((PdpBodyAssem) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.isf);
            o.LJIIIIZZ(recyclerView, "recyclerView");
            recyclerView.LJIIJJI(new IDrS14S0200000_12(null, recyclerView, 3));
            recyclerView.LJLIL(0);
        }
    }

    public static final void LIZ$91(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC70614RnW interfaceC70614RnW;
        if (view != null && (interfaceC70614RnW = ((C70607RnP) au2S20S0100000_12.l0).LJLIL) != null) {
            interfaceC70614RnW.LLLLZIL(view);
        }
    }

    public static final void LIZ$92(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        C70607RnP c70607RnP;
        InterfaceC70614RnW interfaceC70614RnW;
        if (view != null && (interfaceC70614RnW = (c70607RnP = (C70607RnP) au2S20S0100000_12.l0).LJLIL) != null) {
            interfaceC70614RnW.LJLJI(view, !c70607RnP.LJLILLLLZI);
        }
    }

    public static final void LIZ$93(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            C70607RnP c70607RnP = (C70607RnP) au2S20S0100000_12.l0;
            if (c70607RnP.LJLJI) {
                int i = c70607RnP.LJLJJI;
                if (i == -1) {
                    c70607RnP.LJLJJI = ((TextView) c70607RnP._$_findCachedViewById(R.id.i6m)).getMaxLines();
                    ((C70607RnP) au2S20S0100000_12.l0).setTitleMaxLine(Integer.MAX_VALUE);
                } else {
                    c70607RnP.setTitleMaxLine(i);
                    ((C70607RnP) au2S20S0100000_12.l0).LJLJJI = -1;
                }
            }
        }
    }

    public static final void LIZ$94(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC70598RnG interfaceC70598RnG;
        if (view != null && (interfaceC70598RnG = ((C70589Rn7) au2S20S0100000_12.l0).LJLIL) != null) {
            interfaceC70598RnG.LIZ();
        }
    }

    public static final void LIZ$95(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC70598RnG interfaceC70598RnG;
        if (view != null && (interfaceC70598RnG = ((C70589Rn7) au2S20S0100000_12.l0).LJLIL) != null) {
            interfaceC70598RnG.LIZ();
        }
    }

    public static final void LIZ$96(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        InterfaceC70598RnG interfaceC70598RnG;
        if (view != null && (interfaceC70598RnG = ((C70589Rn7) au2S20S0100000_12.l0).LJLIL) != null) {
            interfaceC70598RnG.LIZ();
        }
    }

    public static final void LIZ$97(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        if (view != null) {
            Context context = ((CpfVH) au2S20S0100000_12.l0).LJLIL.getContext();
            o.LJIIIIZZ(context, "view.context");
            C26227ARb c26227ARb = new C26227ARb(context);
            c26227ARb.LJ(R.string.f7y);
            c26227ARb.LIZ(R.string.f7x);
            UC0.LIZJ(c26227ARb, new AqS178S0100000_12((CpfVH) au2S20S0100000_12.l0, 598));
            c26227ARb.LIZLLL(new AqS178S0100000_12((CpfVH) au2S20S0100000_12.l0, 599));
            c26227ARb.LJI().LIZLLL();
            C78946Uyc.LJJIIJ(((CpfVH) au2S20S0100000_12.l0).LJLIL, new C70917RsP(), C71035RuJ.LJLIL);
        }
    }

    public static final void LIZ$98(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        String str;
        if (view != null) {
            ((ARV) ((USSameShippingAddressElementViewHolder) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.jae)).setChecked(!((CompoundButton) ((USSameShippingAddressElementViewHolder) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.jae)).isChecked());
            ((CCDCAddCardViewModel) ((USSameShippingAddressElementViewHolder) au2S20S0100000_12.l0).LJLIL.getValue()).pv0(((CompoundButton) ((USSameShippingAddressElementViewHolder) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.jae)).isChecked());
            if (((CompoundButton) ((USSameShippingAddressElementViewHolder) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.jae)).isChecked()) {
                str = "select";
            } else {
                str = "cancel";
            }
            C28112B1o.LIZLLL("use_shipping_address", C113554cx.LJJJLZIJ(new OSZ("button_type", str)), 28);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.Ynr, X.Prl] */
    public static final void LIZ$99(Au2S20S0100000_12 au2S20S0100000_12, View view) {
        C70819Rqp c70819Rqp;
        Option option;
        OptionPickerDialogFragment optionPickerDialogFragment;
        ?? r2;
        if (view != null) {
            AbstractC029409q adapter = ((RecyclerView) ((OptionPickerDialogFragment) au2S20S0100000_12.l0)._$_findCachedViewById(R.id.isn)).getAdapter();
            if ((adapter instanceof C70819Rqp) && (c70819Rqp = (C70819Rqp) adapter) != null && (option = c70819Rqp.LJLJI) != null && (r2 = (optionPickerDialogFragment = (OptionPickerDialogFragment) au2S20S0100000_12.l0).LJLJL) != 0) {
                View done_button = optionPickerDialogFragment._$_findCachedViewById(R.id.cf0);
                o.LJIIIIZZ(done_button, "done_button");
                r2.invoke(done_button, option);
            }
            OptionPickerDialogFragment optionPickerDialogFragment2 = (OptionPickerDialogFragment) au2S20S0100000_12.l0;
            optionPickerDialogFragment2.LJLJJI = false;
            ASQ.LJ(optionPickerDialogFragment2, ASX.LIZ);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S20S0100000_12(C74155T8l c74155T8l, int i) {
        super(500L);
        this.$t = i;
        this.l0 = c74155T8l;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S20S0100000_12(EditProfileBadgeDialog editProfileBadgeDialog, int i) {
        super(2000L);
        this.$t = i;
        this.l0 = editProfileBadgeDialog;
    }

    public Au2S20S0100000_12(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S20S0100000_12(Object obj, int i, int i2) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S20S0100000_12(long j, UsSkuVH usSkuVH, int i) {
        super(j);
        this.$t = i;
        this.l0 = usSkuVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Au2S20S0100000_12(Object obj, int i, int i2, int i3) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }
}
