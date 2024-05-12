package kotlin.jvm.internal;

import X.A32;
import X.A37;
import X.A3U;
import X.A3V;
import X.A4S;
import X.A4T;
import X.ARH;
import X.ARI;
import X.ARN;
import X.ASL;
import X.AbstractC65781Prl;
import X.AbstractC73230Soc;
import X.B1J;
import X.B1K;
import X.B1U;
import X.B1V;
import X.B20;
import X.B21;
import X.B2D;
import X.C16300kU;
import X.C16880lQ;
import X.C188727au;
import X.C211568Sa;
import X.C212428Vi;
import X.C234109Gs;
import X.C240719cZ;
import X.C240839cl;
import X.C252659vp;
import X.C252989wM;
import X.C253489xA;
import X.C253509xC;
import X.C253539xF;
import X.C25542A0s;
import X.C25589A2n;
import X.C25590A2o;
import X.C25598A2w;
import X.C25859ACx;
import X.C26175APb;
import X.C26804AfY;
import X.C26895Ah1;
import X.C26965Ai9;
import X.C27021Aj3;
import X.C27162AlK;
import X.C27221AmH;
import X.C27230AmQ;
import X.C27937Axp;
import X.C27949Ay1;
import X.C27959AyB;
import X.C28002Ays;
import X.C28064Azs;
import X.C28113B1p;
import X.C28123B1z;
import X.C29822Bn8;
import X.C2U8;
import X.C32I;
import X.C34K;
import X.C47261Igj;
import X.C4LX;
import X.C55096Ljo;
import X.C61447O9r;
import X.C61841OOv;
import X.C65352Pkq;
import X.C65429Pm5;
import X.C66822jm;
import X.C68322mC;
import X.C6DQ;
import X.C70414RkI;
import X.C70922RsU;
import X.C73227SoZ;
import X.C73969T1h;
import X.C76732zl;
import X.C76800UCe;
import X.C78897Uxp;
import X.C78946Uyc;
import X.C78948Uye;
import X.C78983UzD;
import X.C79057V0z;
import X.C79234V7u;
import X.C98Q;
import X.C9G2;
import X.C9IB;
import X.C9Q1;
import X.C9RT;
import X.EnumC27826Aw2;
import X.EnumC28021AzB;
import X.FMX;
import X.HG3;
import X.InterfaceC35811ar;
import X.InterfaceC65784Pro;
import X.InterfaceC71003Rtn;
import X.InterfaceC82683Wch;
import X.InterfaceC88472Yns;
import X.J14;
import X.KNV;
import X.M78;
import X.ORZ;
import X.RBX;
import X.SCS;
import X.SD1;
import X.SD4;
import X.SD6;
import X.T16;
import X.T5T;
import X.X1D;
import X.XKS;
import Y.ACListenerS30S0300000_4;
import Y.ARunnableS40S0100000_4;
import Y.ARunnableS8S0400000_4;
import Y.AfS56S0100000_4;
import Y.IDDListenerS144S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.BottomSheetOption;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.handlers.DialogOption;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressTipButton;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressVerifyData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandiHeader;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.strategy.AddressListNativeStrategy;
import com.ss.android.ugc.aweme.ecommerce.base.address.widget.ZipCodePickerDialogFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.shop.ShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.BillingFragmentEnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuaranteeInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.CardNumberElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.DateElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.InstallmentPlanListElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.NormalElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderAvailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitState;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.widget.OrderSubmitBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpShipping;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.global.address.list.GlobalAddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierNormalElementVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PaidContentInfo;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.music.service.ProfileMusicTabService;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageFragment;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailHeaderAssem;
import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesListAssem;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.ss.android.ugc.aweme.paidcontent.ui.SeriesListItemCell;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.profile.widgets.header.avatar.OtherProfileAvatarAssem;
import com.ss.android.ugc.aweme.rss.link.models.RssLinkParam;
import com.ss.android.ugc.aweme.rss.link.ui.RssIntroAssem;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.IArticleModeRssService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.Au2S10S0300000_4;
import com.ss.android.ugc.aweme.utils.Au2S3S0400000_4;
import com.ss.android.ugc.profile.platform.base.assemble.ProfileRootBaseComponent;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.ICTARecommendButtonAbility;
import com.ss.android.ugc.profile.platform.business.header.business.recommend.business.HeaderRecommendUserCardUserComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public class AqS108S0300000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj);
            case 12:
                return invoke$12(this, obj);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj);
            case 17:
                return invoke$17(this, obj);
            case 18:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case 20:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            case 22:
                return invoke$22(this, obj);
            case 23:
                return invoke$23(this, obj);
            case 24:
                return invoke$24(this, obj);
            case 25:
                return invoke$25(this, obj);
            case 26:
                return invoke$26(this, obj);
            case 27:
                return invoke$27(this, obj);
            case 28:
                return invoke$28(this, obj);
            case 29:
                return invoke$29(this, obj);
            case 30:
                return invoke$30(this, obj);
            case 31:
                return invoke$31(this, obj);
            case 32:
                return invoke$32(this, obj);
            case 33:
                return invoke$33(this, obj);
            case 34:
                return invoke$34(this, obj);
            case 35:
                return invoke$35(this, obj);
            case 36:
                return invoke$36(this, obj);
            case 37:
                return invoke$37(this, obj);
            case 38:
                return invoke$38(this, obj);
            case 39:
                return invoke$39(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj);
            case 41:
                return invoke$41(this, obj);
            case 42:
                return invoke$42(this, obj);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj);
            case 44:
                return invoke$44(this, obj);
            case 45:
                return invoke$45(this, obj);
            case 46:
                return invoke$46(this, obj);
            case 47:
                return invoke$47(this, obj);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this, obj);
            case C61447O9r.LJIIJ:
                return invoke$49(this, obj);
            case 50:
                return invoke$50(this, obj);
            case 51:
                return invoke$51(this, obj);
            case 52:
                return invoke$52(this, obj);
            case 53:
                return invoke$53(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(C240839cl it) {
        o.LJIIIZ(it, "it");
        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS8S0400000_4(it, (MusicModel) this.l0, (MusicPlayViewModel) this.l1, (C240719cZ) this.l2, 2));
    }

    public final void invoke$1(PaymentState it) {
        o.LJIIIZ(it, "it");
        boolean LIZIZ = C61841OOv.LIZIZ(((B1J) this.l0).LIZ, it.getCheckedPaymentMethod());
        Availability availability = ((B1J) this.l0).LIZ.availability;
        if (availability != null && o.LJ(Boolean.FALSE, availability.isAvailable)) {
            LIZIZ = false;
        }
        ((USCashierPaymentMethodView) this.l1).setChecked(LIZIZ);
        ((USCashierPaymentMethodView) this.l1).setPaymentViewModel(((USCashierPaymentMethodVH) this.l2).getViewModel());
        View iconEdit = ((USCashierPaymentMethodVH) this.l2)._$_findCachedViewById(R.id.ea4);
        o.LJIIIIZZ(iconEdit, "iconEdit");
        C16880lQ.LJIIJ(new Au2S10S0300000_4((USCashierPaymentMethodView) this.l1, (B1J) this.l0, (USCashierPaymentMethodVH) this.l2, 10), iconEdit);
    }

    public final void invoke$2(OrderSubmitState state) {
        int i;
        o.LJIIIZ(state, "state");
        Iterator<C26965Ai9> it = ((C26804AfY) this.l0).LIZLLL.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            i3 += it.next().LJII.size();
        }
        ((TtfShopInfoVH) this.l1).getClass();
        C27937Axp.LIZ.getClass();
        Integer num = C27937Axp.LIZ()._itemsExpandCount;
        int i4 = 3;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        if (i3 > i) {
            AbstractC73230Soc abstractC73230Soc = (AbstractC73230Soc) ((TtfShopInfoVH) this.l1).LJLJJI.getValue();
            TtfShopInfoVH ttfShopInfoVH = (TtfShopInfoVH) this.l1;
            C26804AfY c26804AfY = (C26804AfY) this.l0;
            ttfShopInfoVH.getClass();
            ArrayList arrayList = new ArrayList();
            Integer num2 = C27937Axp.LIZ()._itemsExpandCount;
            if (num2 != null) {
                i4 = num2.intValue();
            }
            List<C26965Ai9> list = c26804AfY.LIZLLL;
            if (list != null) {
                int i5 = 0;
                for (C26965Ai9 c26965Ai9 : list) {
                    if (i5 < i4) {
                        int i6 = i4 - i5;
                        if (c26965Ai9.LJII.size() > i6) {
                            List<C27959AyB> skuInfos = c26965Ai9.LJII.subList(i2, i6);
                            String str = c26965Ai9.LIZ;
                            String str2 = c26965Ai9.LIZIZ;
                            boolean z = c26965Ai9.LIZJ;
                            List<LogisticDTO> list2 = c26965Ai9.LIZLLL;
                            LogisticDTO logisticDTO = c26965Ai9.LJ;
                            boolean z2 = c26965Ai9.LJFF;
                            String str3 = c26965Ai9.LJI;
                            String str4 = c26965Ai9.LJIIIIZZ;
                            Integer num3 = c26965Ai9.LJIIIZ;
                            PhoneCredit phoneCredit = c26965Ai9.LJIIJ;
                            WarehouseTag warehouseTag = c26965Ai9.LJIIJJI;
                            String str5 = c26965Ai9.LJIIL;
                            String str6 = c26965Ai9.LJIILIIL;
                            MainOrderAvailableInfo mainOrderAvailableInfo = c26965Ai9.LJIILJJIL;
                            o.LJIIIZ(skuInfos, "skuInfos");
                            C26965Ai9 c26965Ai92 = new C26965Ai9(str, str2, z, list2, logisticDTO, z2, str3, skuInfos, str4, num3, phoneCredit, warehouseTag, str5, str6, mainOrderAvailableInfo);
                            c26965Ai92.LJIILL = c26965Ai9.LJIILL;
                            arrayList.add(c26965Ai92);
                            i5 += i6;
                        } else {
                            i5 += c26965Ai9.LJII.size();
                            arrayList.add(c26965Ai9);
                        }
                    }
                    i2 = 0;
                }
            }
            abstractC73230Soc.getClass();
            C73227SoZ.LIZ(abstractC73230Soc, arrayList);
            TextView textView = (TextView) ((View) this.l2).findViewById(R.id.d1g);
            String str7 = ((C26804AfY) this.l0).LJIIJJI;
            if (str7 == null) {
                str7 = "";
            }
            textView.setText(str7);
            ((View) this.l2).findViewById(R.id.d1d).setVisibility(i2);
            C27949Ay1 c27949Ay1 = C27949Ay1.LIZ;
            HashMap<String, Object> fw0 = ((TtfShopInfoVH) this.l1).L().fw0(false);
            fw0.put("tag_text", state.getTotalDesc());
            C27949Ay1.LJJIFFI(c27949Ay1, "show_all_items", fw0, null, null, null, null, null, 2044);
            View expand_items_layout = ((View) this.l2).findViewById(R.id.d1d);
            o.LJIIIIZZ(expand_items_layout, "expand_items_layout");
            C16880lQ.LJIIJ(new Au2S3S0400000_4((View) this.l2, (TtfShopInfoVH) this.l1, (C26804AfY) this.l0, state, 8), expand_items_layout);
            return;
        }
        AbstractC73230Soc abstractC73230Soc2 = (AbstractC73230Soc) ((TtfShopInfoVH) this.l1).LJLJJI.getValue();
        List<C26965Ai9> list3 = ((C26804AfY) this.l0).LIZLLL;
        abstractC73230Soc2.getClass();
        C73227SoZ.LIZ(abstractC73230Soc2, list3);
        ((View) this.l2).findViewById(R.id.d1d).setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        if (r2 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b2, code lost:
    
        r2 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        r1 = X.X1D.LIZ();
        r1.append("geo:");
        r1.append(r3);
        r1.append(',');
        r1.append(r7);
        r1.append("?q=");
        r1.append(android.net.Uri.encode(r2, "utf-8"));
        r0 = new android.content.Intent("android.intent.action.VIEW", com.bytedance.mt.protector.impl.UriProtector.parse(X.X1D.LIZIZ(r1)));
        r0.setPackage("com.google.android.apps.maps");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        if (r4 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        X.C16880lQ.LIZJ(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        if (r2 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke$3(android.view.View r9) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$3(android.view.View):void");
    }

    public static final Object invoke$0(AqS108S0300000_4 aqS108S0300000_4, Object it) {
        o.LJIIIZ(it, "it");
        Context context = (Context) aqS108S0300000_4.l0;
        String str = ((PhoneContact) aqS108S0300000_4.l1).phoneNum;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("tel:");
        LIZ.append(str);
        C16880lQ.LIZJ(context, new Intent("android.intent.action.DIAL", UriProtector.parse(X1D.LIZIZ(LIZ))));
        C70414RkI c70414RkI = ((PdpViewModel) aqS108S0300000_4.l2).LLFII;
        if (c70414RkI != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("popup_name", "contact_seller");
            linkedHashMap.put("action_type", "call");
            c70414RkI.LJJJLL(linkedHashMap);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        PhoneContact phoneContact = (PhoneContact) aqS108S0300000_4.l0;
        String str = phoneContact.buttonText;
        if (str != null) {
            actionGroup.LJII(str, new AqS108S0300000_4((Context) aqS108S0300000_4.l1, phoneContact, (PdpViewModel) aqS108S0300000_4.l2, 0));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        ARH buttonGroup = (ARH) obj;
        o.LJIIIZ(buttonGroup, "$this$buttonGroup");
        String str = "";
        if (ORZ.LJLLLL((List) aqS108S0300000_4.l0) != null) {
            String text = ((DialogButton) ORZ.LJLLJ((List) aqS108S0300000_4.l0)).getText();
            if (text == null) {
                text = "";
            }
            buttonGroup.LJFF(text, new AqS135S0200000_4((InterfaceC65784Pro) aqS108S0300000_4.l1, (InterfaceC65784Pro<C76800UCe>) aqS108S0300000_4.l2, (PaymentMethodView) 40));
        }
        if (ORZ.LJLLLLLL(1, (List) aqS108S0300000_4.l0) != null) {
            String text2 = ((DialogButton) ListProtector.get((List) aqS108S0300000_4.l0, 1)).getText();
            if (text2 != null) {
                str = text2;
            }
            buttonGroup.LJII(str, new AqS170S0100000_4((PaymentMethodView) aqS108S0300000_4.l2, 281));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        boolean z;
        List<PaymentElement> arrayList;
        PaymentInfo paymentInfo;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethodInfo paymentMethodInfo2;
        List<PaymentElement> paymentElements;
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        String LIZIZ = SCS.LIZIZ((ElementDTO) aqS108S0300000_4.l0, (PaymentMethod) aqS108S0300000_4.l1, it);
        B1V b1v = (B1V) aqS108S0300000_4.l2;
        if (LIZIZ == null) {
            z = true;
        } else {
            z = false;
        }
        PaymentInfo paymentInfo2 = b1v.LJLILLLLZI;
        if (paymentInfo2 != null && (paymentMethodInfo2 = paymentInfo2.paymentMethodInfo) != null && (paymentElements = paymentMethodInfo2.getPaymentElements()) != null) {
            arrayList = ORZ.LLJILJILJ(paymentElements);
        } else {
            arrayList = new ArrayList<>();
        }
        Iterator it2 = it.iterator();
        while (true) {
            paymentInfo = null;
            PaymentElement paymentElement = null;
            if (!it2.hasNext()) {
                break;
            }
            PaymentElement paymentElement2 = (PaymentElement) it2.next();
            Iterator<PaymentElement> it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                PaymentElement next = it3.next();
                if (o.LJ(next.getElement(), paymentElement2.getElement())) {
                    paymentElement = next;
                    break;
                }
            }
            PaymentElement paymentElement3 = paymentElement;
            if (paymentElement3 != null) {
                paymentElement3.setParamValue(paymentElement2.getParamValue());
            } else {
                arrayList.add(paymentElement2);
            }
        }
        PaymentInfo paymentInfo3 = b1v.LJLILLLLZI;
        if (paymentInfo3 != null && (paymentInfo = PaymentInfo.LIZ(paymentInfo3, null, null, null, 63)) != null) {
            PaymentMethodInfo paymentMethodInfo3 = paymentInfo.paymentMethodInfo;
            if (paymentMethodInfo3 != null) {
                paymentMethodInfo3.setPaymentElements(arrayList);
            }
            if (paymentInfo != null) {
                paymentInfo.isValid = Boolean.valueOf(z);
            }
        }
        b1v.LJLJJL.invoke(paymentInfo);
        PaymentInfo paymentInfo4 = b1v.LJLILLLLZI;
        if (paymentInfo4 != null && (paymentMethodInfo = paymentInfo4.paymentMethodInfo) != null) {
            paymentMethodInfo.setPaymentElements(arrayList);
        }
        PaymentInfo paymentInfo5 = b1v.LJLILLLLZI;
        if (paymentInfo5 != null) {
            paymentInfo5.isValid = Boolean.valueOf(z);
        }
        ((B1V) aqS108S0300000_4.l2).getLogVerify().invoke(LIZIZ);
        return LIZIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r3 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AqS108S0300000_4 r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$12(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x02b3, code lost:
    
        if (r0.intValue() != 1) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AqS108S0300000_4 r29, java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$13(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$14(kotlin.jvm.internal.AqS108S0300000_4 r10, java.lang.Object r11) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState r11 = (com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState) r11
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r3 = r11.getSelectAddressId()
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r0.addressList
            if (r0 == 0) goto L63
            java.lang.Object r2 = r10.l1
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r10.l2
            com.ss.android.ugc.aweme.ecommerce.global.address.list.GlobalAddressListViewModel r4 = (com.ss.android.ugc.aweme.ecommerce.global.address.list.GlobalAddressListViewModel) r4
            java.util.Iterator r5 = r0.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r1 = r5.next()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r1 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r1
            X.Aco r6 = new X.Aco
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r7 = r1.address
            if (r3 == 0) goto L61
            if (r7 == 0) goto L5f
            java.lang.String r0 = r7.id
        L35:
            boolean r0 = kotlin.jvm.internal.o.LJ(r3, r0)
            if (r0 == 0) goto L61
            boolean r0 = r4.Ov0()
            if (r0 == 0) goto L61
            r8 = 1
        L42:
            java.lang.Boolean r0 = r1.reachable
            if (r0 == 0) goto L5d
            boolean r9 = r0.booleanValue()
        L4a:
            java.lang.Boolean r0 = r1.addressValid
            if (r0 == 0) goto L5b
            boolean r10 = r0.booleanValue()
        L52:
            java.lang.String r11 = r1.invalidHintMessage
            r6.<init>(r7, r8, r9, r10, r11)
            r2.add(r6)
            goto L1f
        L5b:
            r10 = 0
            goto L52
        L5d:
            r9 = 0
            goto L4a
        L5f:
            r0 = 0
            goto L35
        L61:
            r8 = 0
            goto L42
        L63:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$14(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$15(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        String str;
        ((Number) obj).intValue();
        ((M78) aqS108S0300000_4.l0).LIZ();
        ProfileMusicTabService profileMusicTabService = (ProfileMusicTabService) aqS108S0300000_4.l1;
        int i = ((C76732zl) aqS108S0300000_4.l2).element;
        profileMusicTabService.getClass();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("page", "music_tab");
        if (i == 0) {
            str = "close";
        } else {
            str = "go_check";
        }
        c188727au.LJIIIZ("button_name", str);
        FMX.LJIIL("aop_authorize_button_click", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$16(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        aqS108S0300000_4.invoke$0((C240839cl) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.wv0((OfflineModeSheetPageFragment) aqS108S0300000_4.l0, new AqS135S0200000_4((View) aqS108S0300000_4.l1, (C9Q1) aqS108S0300000_4.l2, 70));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        CollectionDetailModel it = (CollectionDetailModel) obj;
        o.LJIIIZ(it, "it");
        ((InterfaceC35811ar) aqS108S0300000_4.l0).setValue(Boolean.valueOf(it.isStandardReviewDisplayed()));
        ((InterfaceC35811ar) aqS108S0300000_4.l1).setValue(A4S.LJ(it));
        ((InterfaceC35811ar) aqS108S0300000_4.l2).setValue(it);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (kotlin.jvm.internal.o.LJ(r1, "homepage_hot") != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$19(kotlin.jvm.internal.AqS108S0300000_4 r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$19(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        Integer fetchAPI;
        FetchInfo fetchInfo = (FetchInfo) obj;
        if (fetchInfo != null && (fetchAPI = fetchInfo.getFetchAPI()) != null && fetchAPI.intValue() == 3) {
            ((C28064Azs) aqS108S0300000_4.l0).LIZ((PaymentInfo) aqS108S0300000_4.l1, fetchInfo.getServerIssuedParams(), null, new AqS154S0100000_4((InterfaceC65784Pro) aqS108S0300000_4.l2, (InterfaceC65784Pro<C76800UCe>) 12));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS108S0300000_4 aqS108S0300000_4, Object it) {
        o.LJIIIZ(it, "it");
        int indexOf = ((List) aqS108S0300000_4.l0).indexOf(it) - 1;
        if (indexOf == -1) {
            ((InterfaceC88472Yns) aqS108S0300000_4.l1).invoke(null);
        } else {
            ((InterfaceC88472Yns) aqS108S0300000_4.l1).invoke(ListProtector.get((List) aqS108S0300000_4.l2, indexOf));
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$21(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        ((InterfaceC88472Yns) aqS108S0300000_4.l0).invoke(Integer.valueOf(((Number) obj).intValue()));
        if (((InterfaceC65784Pro) aqS108S0300000_4.l1) == null) {
            try {
                TuxSheet tuxSheet = (TuxSheet) ((C68322mC) aqS108S0300000_4.l2).element;
                if (tuxSheet != null) {
                    tuxSheet.xl();
                }
            } catch (Exception unused) {
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        String str3;
        HashMap<String, String> hashMap;
        C26175APb c26175APb;
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        ProfileComponents profileComponents = (ProfileComponents) aqS108S0300000_4.l0;
        C9IB<ProfileUser> I3 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        String str4 = null;
        if (I3 != null) {
            str = I3.LJLILLLLZI;
        } else {
            str = null;
        }
        C9IB<ProfileUser> I32 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        if (I32 != null) {
            str2 = I32.LJLJI;
        } else {
            str2 = null;
        }
        C9IB<ProfileUser> I33 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        if (I33 != null) {
            bool = I33.LJLJJI;
        } else {
            bool = null;
        }
        C9IB<ProfileUser> I34 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        if (I34 != null) {
            bool2 = I34.LJLJJL;
        } else {
            bool2 = null;
        }
        C9IB<ProfileUser> I35 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        if (I35 != null) {
            str3 = I35.LJLJJLL;
        } else {
            str3 = null;
        }
        C9IB<ProfileUser> I36 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        if (I36 != null) {
            hashMap = I36.LJLJL;
        } else {
            hashMap = null;
        }
        C9IB<ProfileUser> I37 = ((ProfileRootBaseComponent) aqS108S0300000_4.l1).I3();
        if (I37 != null) {
            c26175APb = I37.LJLJLJ;
        } else {
            c26175APb = null;
        }
        hierarchyData.LIZ = new C9IB(profileComponents, str, str2, bool, bool2, str3, hashMap, c26175APb);
        C234109Gs c234109Gs = (C234109Gs) aqS108S0300000_4.l2;
        if (c234109Gs != null) {
            str4 = c234109Gs.LIZ;
        }
        hierarchyData.LIZIZ = str4;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(C29822Bn8.LIZ((Context) aqS108S0300000_4.l0, R.string.qqh, "ctx.resources.getString(…reen_newSeriesModal_ctaB)"), new AqS135S0200000_4((T5T) aqS108S0300000_4.l1, (SeriesListItemCell) aqS108S0300000_4.l2, LiveTryModeCountDownThresholdSetting.DEFAULT));
        actionGroup.LJIIIZ(C29822Bn8.LIZ((Context) aqS108S0300000_4.l0, R.string.qql, "ctx.resources.getString(…newSeriesTitleModal_ctaA)"), new AqS170S0100000_4((SeriesListItemCell) aqS108S0300000_4.l2, 858));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        List<PaymentElement> it = (List) obj;
        o.LJIIIZ(it, "it");
        ((CardNumberElementViewHolder) aqS108S0300000_4.l0).getViewModel().Kv0().LJ(new AqS178S0100000_12((SD1) aqS108S0300000_4.l2, 322));
        PaymentViewModel viewModel = ((CardNumberElementViewHolder) aqS108S0300000_4.l0).getViewModel();
        C28123B1z c28123B1z = (C28123B1z) aqS108S0300000_4.l1;
        PaymentMethod paymentMethod = c28123B1z.LIZIZ;
        String str = c28123B1z.LIZ.id;
        if (str == null) {
            str = "";
        }
        viewModel.Sv0(paymentMethod, str, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        boolean z;
        String str;
        String paramValue;
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        C28123B1z c28123B1z = (C28123B1z) aqS108S0300000_4.l0;
        String LIZIZ = SCS.LIZIZ(c28123B1z.LIZ, c28123B1z.LIZIZ, it);
        Boolean bool = null;
        if (LIZIZ != null) {
            B1K.LJIIJJI[0] = ",card_number";
        } else {
            B1K.LJIIJJI[0] = null;
        }
        B1K b1k = ((CardNumberElementViewHolder) aqS108S0300000_4.l1).getViewModel().LJLL;
        if (b1k != null) {
            String LJIIL = ((C28123B1z) aqS108S0300000_4.l0).LIZIZ.LJIIL();
            if (LIZIZ == null) {
                z = true;
            } else {
                z = false;
            }
            String str2 = ((C28123B1z) aqS108S0300000_4.l0).LIZ.id;
            String str3 = "";
            if (str2 != null) {
                str = ujb.o.LJJJJZ(str2, "eg_ccdc_global_", "", false);
            } else {
                str = null;
            }
            String inputType = ((SD1) aqS108S0300000_4.l2).getInputType();
            if (((SD1) aqS108S0300000_4.l2).getLastOcrValue() != null) {
                String lastOcrValue = ((SD1) aqS108S0300000_4.l2).getLastOcrValue();
                PaymentElement paymentElement = (PaymentElement) ORZ.LJLLLL(it);
                if (paymentElement != null && (paramValue = paymentElement.getParamValue()) != null) {
                    str3 = paramValue;
                }
                bool = Boolean.valueOf(o.LJ(lastOcrValue, str3));
            }
            b1k.LJIILIIL(bool, LJIIL, str, inputType, z);
        }
        return LIZIZ;
    }

    public static final Object invoke$26(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        List<PaymentElement> it = (List) obj;
        o.LJIIIZ(it, "it");
        ((DateElementViewHolder) aqS108S0300000_4.l0).getViewModel().Kv0().LJ(new AqS178S0100000_12((SD4) aqS108S0300000_4.l2, 323));
        PaymentViewModel viewModel = ((DateElementViewHolder) aqS108S0300000_4.l0).getViewModel();
        B20 b20 = (B20) aqS108S0300000_4.l1;
        PaymentMethod paymentMethod = b20.LIZIZ;
        String str = b20.LIZ.id;
        if (str == null) {
            str = "";
        }
        viewModel.Sv0(paymentMethod, str, it);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        boolean z;
        List it = (List) obj;
        o.LJIIIZ(it, "it");
        B20 b20 = (B20) aqS108S0300000_4.l0;
        String LIZIZ = SCS.LIZIZ(b20.LIZ, b20.LIZIZ, it);
        if (LIZIZ != null) {
            B1K.LJIIJJI[1] = ",date";
        } else {
            B1K.LJIIJJI[1] = null;
        }
        B1K b1k = ((DateElementViewHolder) aqS108S0300000_4.l1).getViewModel().LJLL;
        if (b1k != null) {
            B20 b202 = (B20) aqS108S0300000_4.l0;
            SD4 sd4 = (SD4) aqS108S0300000_4.l2;
            String LJIIL = b202.LIZIZ.LJIIL();
            if (LIZIZ == null) {
                z = true;
            } else {
                z = false;
            }
            B1K.LJIILJJIL(b1k, LJIIL, z, B1K.LJIJ(b202.LIZ.paramName), sd4.getInputType(), 16);
            b1k.LIZJ(b1k.LIZ(C65352Pkq.LIZ(DateElementViewHolder.class).LJFF()), B1K.LJIJ(b202.LIZ.paramName), sd4.getInputType());
        }
        return LIZIZ;
    }

    public static final Object invoke$28(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        String str;
        List<InstallmentPlan> list;
        PaymentMethodInfo paymentMethodInfo;
        PaymentState paymentState = (PaymentState) obj;
        o.LJIIIZ(paymentState, "paymentState");
        PaymentInfo paymentInfo = paymentState.getPaymentInfo();
        InstallmentPlan installmentPlan = null;
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null) {
            str = paymentMethodInfo.getTenure();
        } else {
            str = null;
        }
        B1U b1u = (B1U) aqS108S0300000_4.l0;
        InstallmentPlan Mv0 = ((InstallmentPlanListElementViewHolder) aqS108S0300000_4.l1).getViewModel().Mv0(((B2D) aqS108S0300000_4.l2).LIZIZ);
        if (Mv0 == null) {
            InstallmentInfo installmentInfo = ((B2D) aqS108S0300000_4.l2).LIZIZ.installmentInfo;
            if (installmentInfo != null && (list = installmentInfo.installmentPlans) != null) {
                Iterator<InstallmentPlan> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InstallmentPlan next = it.next();
                    if (o.LJ(next.tenure, str)) {
                        installmentPlan = next;
                        break;
                    }
                }
                installmentPlan = installmentPlan;
            }
        } else {
            installmentPlan = Mv0;
        }
        b1u.setSelectedInstallmentPlan(installmentPlan);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        A37 it = (A37) obj;
        o.LJIIIZ(it, "it");
        CollectionDetailModel collectionDetailModel = ((PaidContentCollectionDetailHeaderAssem) aqS108S0300000_4.l0).LJLJJI;
        if (collectionDetailModel != null && collectionDetailModel.getCanReviewCollection() && !it.LJLJJLL) {
            ((List) aqS108S0300000_4.l1).add((C252659vp) aqS108S0300000_4.l2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AqS108S0300000_4 r3, java.lang.Object r4) {
        /*
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            java.lang.Class<X.GEz> r0 = X.InterfaceC41201GEz.class
            X.G8o r1 = X.C59367NRr.LIZIZ(r0)
            X.GEz r1 = (X.InterfaceC41201GEz) r1
            if (r1 == 0) goto L1e
            java.lang.Object r0 = r3.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.Context r0 = r0.getContext()
            r1.wb0(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L31
        L1e:
            com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService r2 = com.ss.android.ugc.aweme.commercialize.tcm.service.TcmServiceImpl.LJIJI()
            java.lang.Object r0 = r3.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.mo49getActivity()
            java.lang.Object r0 = r3.l1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            r2.LJIILJJIL(r1, r0)
        L31:
            java.lang.Class<X.GEz> r0 = X.InterfaceC41201GEz.class
            X.G8o r1 = X.C59367NRr.LIZIZ(r0)
            X.GEz r1 = (X.InterfaceC41201GEz) r1
            r0 = 1
            if (r1 == 0) goto L3f
            r1.Kf(r0)
        L3f:
            java.lang.Object r1 = r3.l2
            X.XJL r1 = (X.XJL) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C3C5.m7constructorimpl(r0)
            r1.resumeWith(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$3(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$30(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        A37 it = (A37) obj;
        o.LJIIIZ(it, "it");
        CollectionDetailModel collectionDetailModel = ((PaidContentCollectionDetailHeaderAssem) aqS108S0300000_4.l0).LJLJJI;
        if (collectionDetailModel != null && collectionDetailModel.getCanCollectionRefund() && !o.LJ(it.LJLJJI, Boolean.TRUE)) {
            ((List) aqS108S0300000_4.l1).add((C252659vp) aqS108S0300000_4.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        A32 setState = (A32) obj;
        o.LJIIIZ(setState, "$this$setState");
        return A32.LIZ(setState, null, new C25598A2w(((C76732zl) aqS108S0300000_4.l0).element, ((C76732zl) aqS108S0300000_4.l1).element, ((C34K) aqS108S0300000_4.l2).element), 1);
    }

    public static final Object invoke$32(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        String str;
        String str2;
        float f;
        String str3;
        int i;
        String str4;
        int i2;
        String str5;
        PaidContentInfo paidContentInfo;
        PaidContentInfo paidContentInfo2;
        Aweme aweme;
        PaidContentInfo paidContentInfo3;
        A3V state = (A3V) obj;
        o.LJIIIZ(state, "state");
        if (!state.LJLIL.LJLIL && !((A3U) aqS108S0300000_4.l0).LJLIL.isReported()) {
            if (!((A3U) aqS108S0300000_4.l0).LJLIL.isIntro()) {
                A3U a3u = (A3U) aqS108S0300000_4.l0;
                if (!a3u.LJLJI && !a3u.LJLILLLLZI && ((aweme = a3u.LJLIL.getAweme()) == null || (paidContentInfo3 = aweme.mPaidContentInfo) == null || !paidContentInfo3.getShouldShowPreview() || !C211568Sa.LIZ())) {
                    if (state.LJLILLLLZI.LIZ() != null) {
                        ((PaidContentDetailVideoListViewModel) aqS108S0300000_4.l1).setState(new AqS170S0100000_4((A3U) aqS108S0300000_4.l0, 907));
                    }
                }
            }
            Bundle bundle = new Bundle();
            Aweme aweme2 = ((A3U) aqS108S0300000_4.l0).LJLIL.getAweme();
            Float f2 = null;
            String str6 = null;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            bundle.putString("id", str);
            CollectionDetailModel LIZ = state.LJLILLLLZI.LIZ();
            if (LIZ != null) {
                PaidContentDetailVideoListViewModel paidContentDetailVideoListViewModel = (PaidContentDetailVideoListViewModel) aqS108S0300000_4.l1;
                A3U a3u2 = (A3U) aqS108S0300000_4.l0;
                Intent intent = paidContentDetailVideoListViewModel.gv0().LJLJJI;
                Aweme aweme3 = a3u2.LJLIL.getAweme();
                if (aweme3 != null) {
                    str3 = aweme3.getAid();
                } else {
                    str3 = null;
                }
                Long valueOf = Long.valueOf(paidContentDetailVideoListViewModel.gv0().LJLJL);
                String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
                boolean isIntro = a3u2.LJLIL.isIntro();
                Aweme aweme4 = a3u2.LJLIL.getAweme();
                if (aweme4 != null && (paidContentInfo2 = aweme4.mPaidContentInfo) != null && paidContentInfo2.getShouldShowPreview()) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (intent != null) {
                    str4 = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
                } else {
                    str4 = null;
                }
                String str7 = null;
                Integer num = null;
                C25589A2n.LJIIJJI("collection_intro_video_preview", str4, null, null, str3, Boolean.valueOf(C25590A2o.LIZ(intent)), null, null, null, null, null, valueOf, currentUserID, Integer.valueOf(isIntro ? 1 : 0), null, Integer.valueOf(i), null, null, LIZ, null, null, null, null, null, null, 66490284);
                Aweme aweme5 = a3u2.LJLIL.getAweme();
                if (aweme5 != null) {
                    str7 = aweme5.getAid();
                }
                Intent intent2 = paidContentDetailVideoListViewModel.gv0().LJLJJI;
                Aweme aweme6 = a3u2.LJLIL.getAweme();
                if (aweme6 != null && (paidContentInfo = aweme6.mPaidContentInfo) != null && paidContentInfo.getShouldShowPreview()) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                Integer valueOf2 = Integer.valueOf(a3u2.LJLIL.isIntro() ? 1 : 0);
                List<ITEM> listGetAll = paidContentDetailVideoListViewModel.listGetAll();
                if (listGetAll != 0) {
                    Iterator it = listGetAll.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            Aweme aweme7 = ((A3U) it.next()).LJLIL.getAweme();
                            if (aweme7 != null) {
                                str5 = aweme7.getAid();
                            } else {
                                str5 = null;
                            }
                            if (o.LJ(str5, str7)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    num = Integer.valueOf(i3);
                }
                C25590A2o.LIZIZ(LIZ, intent2, str7, false, i2, valueOf2, num);
            }
            CollectionDetailModel LIZ2 = state.LJLILLLLZI.LIZ();
            if (LIZ2 != null) {
                PaidContentDetailVideoListViewModel paidContentDetailVideoListViewModel2 = (PaidContentDetailVideoListViewModel) aqS108S0300000_4.l1;
                A3U a3u3 = (A3U) aqS108S0300000_4.l0;
                View view = (View) aqS108S0300000_4.l2;
                PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem = paidContentDetailVideoListViewModel2.LJLILLLLZI;
                if (paidContentCollectionDetailDescriptionAssem != null) {
                    Aweme aweme8 = a3u3.LJLIL.getAweme();
                    if (aweme8 != null) {
                        str2 = aweme8.getAid();
                    } else {
                        str2 = null;
                    }
                    J14 A3 = paidContentCollectionDetailDescriptionAssem.A3();
                    if (str2 != null) {
                        Aweme aweme9 = A3.LJLJI;
                        if (aweme9 != null) {
                            str6 = aweme9.getAid();
                        }
                        if (o.LJ(str2, str6)) {
                            f = (((float) A3.getVideoViewComponent().LIZLLL()) * 1.0f) / ((float) A3.getVideoViewComponent().LJ());
                            f2 = Float.valueOf(f);
                        }
                    }
                    f = 0.0f;
                    f2 = Float.valueOf(f);
                }
                PaidVideoItem paidVideoItem = a3u3.LJLIL;
                Context context = view.getContext();
                o.LJIIIIZZ(context, "itemView.context");
                paidContentDetailVideoListViewModel2.iv0(paidVideoItem, context, LIZ2, f2);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        Object obj2;
        PdpShipping pdpShipping;
        List<LogisticDTO> list;
        List<LogisticDTO> list2;
        Object LJLLLL;
        LaneParams injectParamsToNode = (LaneParams) obj;
        o.LJIIIZ(injectParamsToNode, "$this$injectParamsToNode");
        injectParamsToNode.plusAssign("product_info", (ProductPackStruct) aqS108S0300000_4.l0);
        injectParamsToNode.plusAssign("sku_info", (C27959AyB) aqS108S0300000_4.l1);
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = (DeliveryPanelStarter.PackedDeliverySelectResult) aqS108S0300000_4.l2;
        if (packedDeliverySelectResult == null || (obj2 = packedDeliverySelectResult.selectedLogistic) == null) {
            obj2 = null;
            if (packedDeliverySelectResult == null || (list2 = packedDeliverySelectResult.logistics) == null || (LJLLLL = ORZ.LJLLLL(list2)) == null) {
                ProductPackStruct productPackStruct = (ProductPackStruct) aqS108S0300000_4.l0;
                if (productPackStruct != null && (pdpShipping = productPackStruct.shipping) != null && (list = pdpShipping.logistics) != null) {
                    obj2 = ORZ.LJLLLL(list);
                }
            } else {
                obj2 = LJLLLL;
            }
        }
        injectParamsToNode.plusAssign("logistic_info", obj2);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r2 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$34(kotlin.jvm.internal.AqS108S0300000_4 r13, java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$34(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$35(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        PaymentGuaranteeInfo paymentGuaranteeInfo;
        if (o.LJ(((B1J) aqS108S0300000_4.l0).LIZ.id, "pm_pi_ccdc_all")) {
            try {
                Fragment LIZLLL = C212428Vi.LIZLLL(((USCashierPaymentMethodVH) aqS108S0300000_4.l1).LJLILLLLZI);
                if (LIZLLL != null) {
                    B1J b1j = (B1J) aqS108S0300000_4.l0;
                    USCashierPaymentMethodVH uSCashierPaymentMethodVH = (USCashierPaymentMethodVH) aqS108S0300000_4.l1;
                    USCashierPaymentMethodView uSCashierPaymentMethodView = (USCashierPaymentMethodView) aqS108S0300000_4.l2;
                    FragmentManager childFragmentManager = LIZLLL.getChildFragmentManager();
                    o.LJIIIIZZ(childFragmentManager, "it.childFragmentManager");
                    PaymentMethod paymentMethod = b1j.LIZ;
                    Address address = uSCashierPaymentMethodVH.getViewModel().LJLJL;
                    PaymentMethodsData paymentMethodsData = uSCashierPaymentMethodVH.getViewModel().LJZ;
                    String str = uSCashierPaymentMethodVH.getViewModel().LJZI;
                    HashMap hashMap = new HashMap();
                    HashMap<String, Object> trackParams = uSCashierPaymentMethodView.getTrackParams();
                    if (trackParams != null) {
                        hashMap.putAll(trackParams);
                    }
                    hashMap.put("previous_page", "payment_method");
                    hashMap.put("page_info", "add");
                    PaymentMethodsData paymentMethodsData2 = uSCashierPaymentMethodVH.getViewModel().LJZ;
                    if (paymentMethodsData2 != null) {
                        paymentGuaranteeInfo = paymentMethodsData2.guaranteeInfo;
                    } else {
                        paymentGuaranteeInfo = null;
                    }
                    C28113B1p.LIZ(childFragmentManager, paymentMethod, new EnterParams(null, null, null, paymentMethodsData, null, false, null, hashMap, null, null, address, null, null, str, null, null, paymentGuaranteeInfo, 56183, null), new AqS151S0200000_4(LIZLLL, uSCashierPaymentMethodVH, 38), "ADD_NEW_CARD", EnumC28021AzB.ADD_CCDC);
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("USPaymentMethodViewHolder fragmentFinder exception: ");
                LIZ.append(e);
                C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
            }
        } else {
            PaymentViewModel viewModel = ((USCashierPaymentMethodVH) aqS108S0300000_4.l1).getViewModel();
            PaymentMethod paymentMethod2 = ((B1J) aqS108S0300000_4.l0).LIZ;
            viewModel.getClass();
            viewModel.setState(new AqS135S0200000_4(viewModel, paymentMethod2, 2));
            List<? extends T> list = ((USCashierPaymentMethodVH) aqS108S0300000_4.l1).LJLIL.LJLJI.LIZJ;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof B1J) {
                    arrayList.add(obj2);
                }
            }
            if (ORZ.LLJI(arrayList).indexOf((B1J) aqS108S0300000_4.l0) == r2.size() - 1) {
                ((USCashierPaymentMethodView) aqS108S0300000_4.l2).postDelayed(new ARunnableS40S0100000_4((USCashierPaymentMethodVH) aqS108S0300000_4.l1, 109), 500L);
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$36(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        aqS108S0300000_4.invoke$1((PaymentState) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        ManageSeriesViewModel L3 = ((ManageSeriesListAssem) aqS108S0300000_4.l0).L3();
        String valueOf = String.valueOf(((T5T) aqS108S0300000_4.l1).getText());
        String videoId = ((ManagementPagePaidVideo) aqS108S0300000_4.l2).id;
        L3.getClass();
        o.LJIIIZ(videoId, "videoId");
        L3.disposeOnClear(L3.hv0().LJ(L3.getState().LJLIL, videoId, valueOf, null).LJIIL(new AfS56S0100000_4(L3, 143)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0100000_4(L3, 145), new AfS56S0100000_4(L3, 147)));
        it.LIZJ = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI(R.string.qs2, new AqS108S0300000_4((ManageSeriesListAssem) aqS108S0300000_4.l0, (T5T) aqS108S0300000_4.l1, (ManagementPagePaidVideo) aqS108S0300000_4.l2, 37));
        actionGroup.LJ(R.string.qs1, C25542A0s.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        OrderSubmitState setState = (OrderSubmitState) obj;
        o.LJIIIZ(setState, "$this$setState");
        List<Object> adapterList = setState.getAdapterList();
        C28002Ays c28002Ays = (C28002Ays) aqS108S0300000_4.l0;
        OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS108S0300000_4.l1;
        List list = (List) aqS108S0300000_4.l2;
        ArrayList arrayList = new ArrayList(C32I.LJJL(adapterList, 10));
        for (Object obj2 : adapterList) {
            if (obj2 instanceof C28002Ays) {
                obj2 = new C28002Ays(c28002Ays.LIZ, orderSubmitViewModel.LL, new CopyOnWriteArrayList(list), c28002Ays.LIZLLL, c28002Ays.LJ, c28002Ays.LJFF, c28002Ays.LJI, c28002Ays.LJII);
            }
            arrayList.add(obj2);
        }
        return OrderSubmitState.copy$default(setState, 0, arrayList, null, false, null, null, false, false, null, null, null, 0, null, 0, 0, null, null, false, false, false, null, false, null, 0, null, false, null, false, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, false, null, false, null, false, -3, 67108863, null);
    }

    public static final Object invoke$4(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        Object obj2;
        Object obj3;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        Iterator it = ((List) aqS108S0300000_4.l0).iterator();
        while (true) {
            obj2 = null;
            if (it.hasNext()) {
                obj3 = it.next();
                Integer num = ((AddressTipButton) obj3).buttonType;
                if (num != null && num.intValue() == 2) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        AddressTipButton addressTipButton = (AddressTipButton) obj3;
        String str = "";
        if (addressTipButton != null) {
            AddressEditFragment addressEditFragment = (AddressEditFragment) aqS108S0300000_4.l1;
            AddressVerifyData addressVerifyData = (AddressVerifyData) aqS108S0300000_4.l2;
            String str2 = addressTipButton.text;
            if (str2 == null) {
                str2 = "";
            }
            actionGroup.LJII(str2, new AqS135S0200000_4(addressEditFragment, addressVerifyData, 16));
        }
        Iterator it2 = ((List) aqS108S0300000_4.l0).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            Integer num2 = ((AddressTipButton) next).buttonType;
            if (num2 != null && num2.intValue() == 1) {
                obj2 = next;
                break;
            }
        }
        AddressTipButton addressTipButton2 = (AddressTipButton) obj2;
        if (addressTipButton2 != null) {
            AddressEditFragment addressEditFragment2 = (AddressEditFragment) aqS108S0300000_4.l1;
            String str3 = addressTipButton2.text;
            if (str3 != null) {
                str = str3;
            }
            actionGroup.LJIIIZ(str, new AqS170S0100000_4(addressEditFragment2, 201));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS108S0300000_4 aqS108S0300000_4, Object it) {
        o.LJIIIZ(it, "it");
        C253489xA c253489xA = (C253489xA) aqS108S0300000_4.l0;
        BottomSheetOption bottomSheetOption = (BottomSheetOption) aqS108S0300000_4.l1;
        Activity activity = (Activity) aqS108S0300000_4.l2;
        c253489xA.getClass();
        String str = bottomSheetOption.optionUrl;
        if (str != null) {
            SmartRouter.buildRoute(activity, str).open();
        }
        if (bottomSheetOption.optionId != null) {
            String flattenToShortString = activity.getComponentName().flattenToShortString();
            o.LJIIIIZZ(flattenToShortString, "currentActivity.componen…me.flattenToShortString()");
            C2U8.LIZ(new C253539xF(flattenToShortString, bottomSheetOption.optionId));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS108S0300000_4 aqS108S0300000_4, Object it) {
        o.LJIIIZ(it, "it");
        C253509xC c253509xC = (C253509xC) aqS108S0300000_4.l0;
        DialogOption dialogOption = (DialogOption) aqS108S0300000_4.l1;
        Activity activity = (Activity) aqS108S0300000_4.l2;
        c253509xC.getClass();
        C253509xC.LIZIZ(dialogOption, activity);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS108S0300000_4 aqS108S0300000_4, Object it) {
        o.LJIIIZ(it, "it");
        C253509xC c253509xC = (C253509xC) aqS108S0300000_4.l0;
        DialogOption dialogOption = (DialogOption) aqS108S0300000_4.l1;
        Activity activity = (Activity) aqS108S0300000_4.l2;
        c253509xC.getClass();
        C253509xC.LIZIZ(dialogOption, activity);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS108S0300000_4 aqS108S0300000_4, Object it) {
        o.LJIIIZ(it, "it");
        C253509xC c253509xC = (C253509xC) aqS108S0300000_4.l0;
        DialogOption dialogOption = (DialogOption) aqS108S0300000_4.l1;
        Activity activity = (Activity) aqS108S0300000_4.l2;
        c253509xC.getClass();
        C253509xC.LIZIZ(dialogOption, activity);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        C25859ACx it = (C25859ACx) obj;
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(it, null, new ACListenerS30S0300000_4((C9G2) aqS108S0300000_4.l1, (IArticleModeRssService) aqS108S0300000_4.l0, (CreatorToolsActivity) aqS108S0300000_4.l2, 19), true, null, null, false, !((IArticleModeRssService) aqS108S0300000_4.l0).getHasRssEntrypointClicked(), null, false, false, false, false, 8388075);
    }

    public static final Object invoke$45(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        String str;
        List<ViewItem> list;
        ViewItem viewItem;
        String str2;
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        if (candInputDataOptions != null) {
            CandiHeader candiHeader = candInputDataOptions.candHeader;
            if (candiHeader == null || (str = candiHeader.text) == null) {
                str = "";
            }
            ArrayList<String> arrayList = new ArrayList<>();
            List<CandInputData> list2 = candInputDataOptions.candInputOptions;
            if (list2 != null) {
                for (CandInputData candInputData : list2) {
                    Integer num = candInputData.type;
                    if (num != null && num.intValue() == 3 && (list = candInputData.viewItems) != null && (viewItem = (ViewItem) ORZ.LJLLLLLL(0, list)) != null && (str2 = viewItem.text) != null) {
                        arrayList.add(str2);
                    }
                }
            }
            if (arrayList.size() > 1) {
                FragmentManager fragmentManager = (FragmentManager) aqS108S0300000_4.l0;
                InterfaceC71003Rtn LJIILIIL = C78948Uye.LJIILIIL((View) aqS108S0300000_4.l1);
                if (fragmentManager != null) {
                    ZipCodePickerDialogFragment zipCodePickerDialogFragment = new ZipCodePickerDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("zipcode", arrayList);
                    bundle.putString("title", str);
                    if (LJIILIIL != null) {
                        C79234V7u.LJJIJIIJI(bundle, LJIILIIL, null);
                    }
                    zipCodePickerDialogFragment.setArguments(bundle);
                    ASL asl = new ASL();
                    asl.LJI(1);
                    int i = (int) C27162AlK.LIZJ;
                    TuxSheet tuxSheet = asl.LIZ;
                    tuxSheet.LJLLLLLL = i;
                    tuxSheet.LJLLILLLL = zipCodePickerDialogFragment;
                    tuxSheet.LJZI = false;
                    tuxSheet.show(fragmentManager, "ZipCodePickerDialogFragment");
                    zipCodePickerDialogFragment.LJLIL = tuxSheet;
                }
            } else {
                Object LJLLLLLL = ORZ.LJLLLLLL(0, arrayList);
                if (LJLLLLLL != null) {
                    AddressEditViewModel addressEditViewModel = (AddressEditViewModel) aqS108S0300000_4.l2;
                    addressEditViewModel.getClass();
                    addressEditViewModel.xw0(C47261Igj.LJJIJ(new C27230AmQ("zipcode", null)), new AqS186S0100000_4(LJLLLLLL, 305));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        C98Q it = (C98Q) obj;
        o.LJIIIZ(it, "it");
        ICTARecommendButtonAbility iCTARecommendButtonAbility = (ICTARecommendButtonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((UIAssem) aqS108S0300000_4.l0), ICTARecommendButtonAbility.class, null);
        if (iCTARecommendButtonAbility != null && iCTARecommendButtonAbility.isVisible() && !it.LJLJLLL) {
            ((HeaderRecommendUserCardUserComponent) aqS108S0300000_4.l1).H3((User) aqS108S0300000_4.l2, false);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$47(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        aqS108S0300000_4.invoke$2((OrderSubmitState) obj);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$48(kotlin.jvm.internal.AqS108S0300000_4 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$48(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$49(kotlin.jvm.internal.AqS108S0300000_4 r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$49(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        AddressEditFragment addressEditFragment;
        String str;
        Boolean bool;
        AddressEditState setState = (AddressEditState) obj;
        o.LJIIIZ(setState, "$this$setState");
        if (!setState.getInputItemVOList().isEmpty()) {
            ((AddressEditViewModel) aqS108S0300000_4.l0).LLFII = null;
        }
        List<C27021Aj3> iw0 = ((AddressEditViewModel) aqS108S0300000_4.l0).iw0(setState, (InputItemData) aqS108S0300000_4.l1);
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) aqS108S0300000_4.l0;
        addressEditViewModel.LJLJLLL = null;
        addressEditViewModel.LJLL = null;
        addressEditViewModel.LLFFF = null;
        ClientConfig clientConfig = addressEditViewModel.LLIIJI;
        if (clientConfig != null && (bool = clientConfig.enableDistrictTab) != null) {
            Boolean valueOf = Boolean.valueOf(bool.booleanValue());
            DistrictFragment.LLFZ = valueOf;
            C79057V0z.LJJJJJL(C66822jm.LIZ, "enable_district_tab", o.LJ(valueOf, Boolean.TRUE));
        }
        InputItemData inputItemData = (InputItemData) aqS108S0300000_4.l1;
        Region region = inputItemData.regionInfo;
        if (region != null && (str = region.geoNameId) != null) {
            AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) aqS108S0300000_4.l0;
            addressEditViewModel2.LLIIJLIL.put(str, new C27221AmH(iw0, addressEditViewModel2.LLIIJI, inputItemData.privacyPolicyStatement, inputItemData.addressLocation, inputItemData.addressRight));
        }
        if (!o.LJ((Boolean) aqS108S0300000_4.l2, Boolean.FALSE) && (addressEditFragment = AddressEditFragment.LLD) != null) {
            C78946Uyc.LJJII(addressEditFragment, new C70922RsU(), new AqS170S0100000_4((AddressEditViewModel) aqS108S0300000_4.l0, 202));
        }
        InputItemData inputItemData2 = (InputItemData) aqS108S0300000_4.l1;
        return AddressEditState.copy$default(setState, 0, null, null, null, iw0, false, inputItemData2.privacyPolicyStatement, null, null, null, null, inputItemData2.addressRight, false, 6063, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0191, code lost:
    
        if (r6 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01c7, code lost:
    
        if (r6 == null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0165, code lost:
    
        if (r7 != null) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00e5, code lost:
    
        if (r6 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0163, code lost:
    
        if (r6 == null) goto L99;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$50(kotlin.jvm.internal.AqS108S0300000_4 r27, java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$50(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static /* bridge */ /* synthetic */ Object invoke$51(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        aqS108S0300000_4.invoke$3((View) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        C6DQ arrowAction = (C6DQ) obj;
        o.LJIIIZ(arrowAction, "$this$arrowAction");
        arrowAction.LIZIZ = R.string.ef;
        arrowAction.LIZLLL = new ACListenerS30S0300000_4((OtherProfileAvatarAssem) aqS108S0300000_4.l0, (Context) aqS108S0300000_4.l1, (C68322mC) aqS108S0300000_4.l2, 24);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        M78 wrapper = (M78) obj;
        o.LJIIIZ(wrapper, "wrapper");
        ((ASL) aqS108S0300000_4.l0).LJ(new IDDListenerS144S0100000_4(wrapper, 19));
        RssIntroAssem rssIntroAssem = (RssIntroAssem) aqS108S0300000_4.l1;
        TuxSheet tuxSheet = ((ASL) aqS108S0300000_4.l0).LIZ;
        rssIntroAssem.LJLJLLL = tuxSheet;
        if (tuxSheet != null) {
            tuxSheet.show((FragmentManager) aqS108S0300000_4.l2, "RssIntroAssem");
        }
        String enterFrom = ((RssLinkParam) ((RssIntroAssem) aqS108S0300000_4.l1).LJLJJI.getValue()).getEnterFrom();
        C188727au LIZLLL = KNV.LIZLLL(enterFrom, "enterFrom");
        LIZLLL.LJIIIZ("enter_from", enterFrom);
        FMX.LJIIL("show_new_rss_bottom_sheet", LIZLLL.LIZ);
        C65429Pm5.LJ("article_mode_intro_shown|", ((RBX) HG3.LJIILL()).getCurUserId(), C9RT.LIZ, true);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AqS108S0300000_4 r12, java.lang.Object r13) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState r13 = (com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListState) r13
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.lang.String r7 = r13.getSelectAddressId()
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel) r0
            boolean r0 = r0.LJLLILLLL
            if (r0 != 0) goto L23
            java.lang.Object r0 = r12.l1
            X.2mC r0 = (X.C68322mC) r0
            T r1 = r0.element
            java.util.List r1 = (java.util.List) r1
            X.Ac8 r0 = new X.Ac8
            r0.<init>()
            r1.add(r0)
        L23:
            java.lang.Object r0 = r12.l2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressListData) r0
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r0.addressList
            r5 = 0
            if (r0 == 0) goto L7f
            java.lang.Object r6 = r12.l1
            X.2mC r6 = (X.C68322mC) r6
            java.lang.Object r4 = r12.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel r4 = (com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel) r4
            java.util.Iterator r11 = r0.iterator()
        L38:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r8 = r11.next()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r8 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r8
            T r3 = r6.element
            java.util.List r3 = (java.util.List) r3
            r10 = 1
            r9 = 0
            if (r7 == 0) goto L7d
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
            if (r0 == 0) goto L7b
            java.lang.String r0 = r0.id
        L52:
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L7d
            r2 = 1
        L59:
            boolean r0 = r4.LJLLILLLL
            if (r0 == 0) goto L78
            java.util.ArrayList<java.lang.String> r1 = X.C27090AkA.LJLJI
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
            if (r0 == 0) goto L65
            java.lang.String r9 = r0.id
        L65:
            boolean r0 = X.ORZ.LJLJJI(r9, r1)
            r10 = r10 ^ r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
        L6e:
            r0 = 510(0x1fe, float:7.15E-43)
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r0 = com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress.LIZ(r8, r1, r2, r0)
            r3.add(r0)
            goto L38
        L78:
            java.lang.Boolean r1 = r8.reachable
            goto L6e
        L7b:
            r0 = r9
            goto L52
        L7d:
            r2 = 0
            goto L59
        L7f:
            java.lang.Object r0 = r12.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel) r0
            boolean r0 = r0.LJLLILLLL
            if (r0 == 0) goto Ld8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r0 = r12.l1
            X.2mC r0 = (X.C68322mC) r0
            T r1 = r0.element
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress>{ kotlin.collections.TypeAliasesKt.ArrayList<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> }"
            kotlin.jvm.internal.o.LJII(r1, r0)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r2.addAll(r1)
            java.util.Collections.reverse(r2)
            java.lang.Object r0 = r12.l1
            X.2mC r0 = (X.C68322mC) r0
            T r0 = r0.element
            java.util.List r0 = (java.util.List) r0
            r0.clear()
            java.lang.Object r4 = r12.l1
            X.2mC r4 = (X.C68322mC) r4
            java.util.Iterator r3 = r2.iterator()
        Lb2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Ld8
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r2 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r2
            java.lang.Boolean r1 = r2.reachable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Ld0
            T r0 = r4.element
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r0, r5, r2)
            goto Lb2
        Ld0:
            T r0 = r4.element
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            goto Lb2
        Ld8:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.invoke$6(kotlin.jvm.internal.AqS108S0300000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        Integer num;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        C26895Ah1 addressState = ((AddressListState) aqS108S0300000_4.l0).getAddressState();
        Integer num2 = null;
        if (addressState != null) {
            num = Integer.valueOf(addressState.LIZ);
        } else {
            num = null;
        }
        logNode.plusAssign("address_num", num);
        C26895Ah1 addressState2 = ((AddressListState) aqS108S0300000_4.l0).getAddressState();
        if (addressState2 != null) {
            num2 = Integer.valueOf(addressState2.LIZIZ);
        }
        logNode.plusAssign("available_address_num", num2);
        logNode.plusAssign("is_fullscreen", "1");
        logNode.plusAssign("stay_time", Long.valueOf(SystemClock.elapsedRealtime() - ((AddressListNativeStrategy) aqS108S0300000_4.l1).getActivity().LLFII()));
        logNode.plusAssign("quit_type", ((C68322mC) aqS108S0300000_4.l2).element);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        DeliveryPanelState state = (DeliveryPanelState) obj;
        o.LJIIIZ(state, "state");
        if (!state.canSelectLogistic(((LogisticAdapter.LogisticViewHolder) aqS108S0300000_4.l0).getViewModel().LJLJJLL)) {
            ((LogisticAdapter.LogisticViewHolder) aqS108S0300000_4.l0).itemView.findViewById(R.id.bdw).setClickable(false);
            ((View) aqS108S0300000_4.l1).findViewById(R.id.iln).setVisibility(8);
            C16300kU.LJIILLIIL(((LogisticAdapter.LogisticViewHolder) aqS108S0300000_4.l0).itemView.findViewById(R.id.bdw), null);
        } else {
            ((LogisticAdapter.LogisticViewHolder) aqS108S0300000_4.l0).itemView.findViewById(R.id.bdw).setClickable(true);
            View findViewById = ((LogisticAdapter.LogisticViewHolder) aqS108S0300000_4.l0).itemView.findViewById(R.id.bdw);
            o.LJIIIIZZ(findViewById, "itemView.cl_top_layout");
            C78897Uxp.LJJJJJL(findViewById, 0.0f);
            ((View) aqS108S0300000_4.l1).findViewById(R.id.iln).setVisibility(0);
        }
        if (!state.getExposedItems().contains((LogisticDTO) aqS108S0300000_4.l2)) {
            LogisticAdapter.LogisticViewHolder.L((LogisticAdapter.LogisticViewHolder) aqS108S0300000_4.l0, "tiktokec_option_show", state, null, null, 28);
            state.getExposedItems().add((LogisticDTO) aqS108S0300000_4.l2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS108S0300000_4 aqS108S0300000_4, Object obj) {
        PaymentState setState = (PaymentState) obj;
        o.LJIIIZ(setState, "$this$setState");
        EnumC27826Aw2 enumC27826Aw2 = EnumC27826Aw2.OSP;
        Address address = ((PaymentViewModel) aqS108S0300000_4.l0).LJLJL;
        HashMap hashMap = new HashMap();
        HashMap<String, Object> hashMap2 = ((PaymentViewModel) aqS108S0300000_4.l0).LJLZ;
        if (hashMap2 != null) {
            hashMap.putAll(hashMap2);
        }
        hashMap.put("previous_page", "payment_method");
        hashMap.put("page_info", "edit");
        return PaymentState.copy$default(setState, null, null, null, null, false, null, null, false, null, null, null, new BillingFragmentEnterParams((PaymentMethod) aqS108S0300000_4.l1, enumC27826Aw2, address, (PaymentInfo) aqS108S0300000_4.l2, false, "ordersubmit", hashMap, null, 144, null), 2047, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS108S0300000_4(X.B1J r3, com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView r4, com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 35: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.<init>(X.B1J, com.ss.android.ugc.aweme.ecommerce.us.osp.payment.view.USCashierPaymentMethodView, com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS108S0300000_4(X.SD1 r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.CardNumberElementViewHolder r4, X.C28123B1z r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 24: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.<init>(X.SD1, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.CardNumberElementViewHolder, X.B1z, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS108S0300000_4(X.SD4 r3, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.DateElementViewHolder r4, X.B20 r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 26: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.<init>(X.SD4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.DateElementViewHolder, X.B20, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS108S0300000_4(android.content.Context r3, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact r4, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.l2 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.<init>(android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PhoneContact, com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS108S0300000_4(android.view.View r3, X.C26804AfY r4, com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 47: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r4
            r1.l2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.l2 = r3
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS108S0300000_4.<init>(android.view.View, X.AfY, com.ss.android.ugc.aweme.ecommerce.ttf.osp.module.shop.TtfShopInfoVH, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(InterfaceC35811ar interfaceC35811ar, InterfaceC35811ar<Boolean> interfaceC35811ar2, InterfaceC35811ar<A4T> interfaceC35811ar3, InterfaceC35811ar<CollectionDetailModel> interfaceC35811ar4) {
        super(1);
        this.$t = interfaceC35811ar4;
        this.l0 = interfaceC35811ar;
        this.l1 = interfaceC35811ar2;
        this.l2 = interfaceC35811ar3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(C76732zl c76732zl, C76732zl c76732zl2, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = c76732zl;
        this.l1 = c76732zl2;
        this.l2 = c34k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(C253489xA c253489xA, BottomSheetOption bottomSheetOption, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = c253489xA;
        this.l1 = bottomSheetOption;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(C253509xC c253509xC, DialogOption dialogOption, Activity activity, int i) {
        super(1);
        this.$t = i;
        this.l0 = c253509xC;
        this.l1 = dialogOption;
        this.l2 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(A3U a3u, PaidContentDetailVideoListViewModel paidContentDetailVideoListViewModel, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = a3u;
        this.l1 = paidContentDetailVideoListViewModel;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(ASL asl, RssIntroAssem rssIntroAssem, FragmentManager fragmentManager, int i) {
        super(1);
        this.$t = i;
        this.l0 = asl;
        this.l1 = rssIntroAssem;
        this.l2 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(C28002Ays c28002Ays, C28002Ays c28002Ays2, OrderSubmitViewModel orderSubmitViewModel, List<PaymentMethod> list) {
        super(1);
        this.$t = list;
        this.l0 = c28002Ays;
        this.l1 = c28002Ays2;
        this.l2 = orderSubmitViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(C28064Azs c28064Azs, C28064Azs c28064Azs2, PaymentInfo paymentInfo, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$t = interfaceC65784Pro;
        this.l0 = c28064Azs;
        this.l1 = c28064Azs2;
        this.l2 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(B1U b1u, InstallmentPlanListElementViewHolder installmentPlanListElementViewHolder, B2D b2d, int i) {
        super(1);
        this.$t = i;
        this.l0 = b1u;
        this.l1 = installmentPlanListElementViewHolder;
        this.l2 = b2d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(M78 m78, ProfileMusicTabService profileMusicTabService, C76732zl c76732zl, int i) {
        super(1);
        this.$t = i;
        this.l0 = m78;
        this.l1 = profileMusicTabService;
        this.l2 = c76732zl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(InterfaceC88472Yns interfaceC88472Yns, AqS154S0200000_7 aqS154S0200000_7, C68322mC c68322mC, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC88472Yns;
        this.l1 = aqS154S0200000_7;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(Context context, T5T t5t, SeriesListItemCell seriesListItemCell, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = t5t;
        this.l2 = seriesListItemCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(Context context, BizAddress bizAddress, Aweme aweme, int i) {
        super(1);
        this.$t = i;
        this.l0 = aweme;
        this.l1 = context;
        this.l2 = bizAddress;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(View view, OrderSubmitBottomWidget orderSubmitBottomWidget, View view2, int i) {
        super(1);
        this.$t = i;
        this.l0 = view;
        this.l1 = orderSubmitBottomWidget;
        this.l2 = view2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(Fragment fragment, Aweme aweme, XKS xks, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = aweme;
        this.l2 = xks;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(FragmentManager fragmentManager, C252989wM c252989wM, AddressEditViewModel addressEditViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = fragmentManager;
        this.l1 = c252989wM;
        this.l2 = addressEditViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(UIAssem uIAssem, HeaderRecommendUserCardUserComponent headerRecommendUserCardUserComponent, User user, int i) {
        super(1);
        this.$t = i;
        this.l0 = uIAssem;
        this.l1 = headerRecommendUserCardUserComponent;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(CreatorToolsActivity creatorToolsActivity, C9G2 c9g2, IArticleModeRssService iArticleModeRssService, int i) {
        super(1);
        this.$t = i;
        this.l0 = iArticleModeRssService;
        this.l1 = c9g2;
        this.l2 = creatorToolsActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(AddressListData addressListData, AddressListData addressListData2, List<Object> list, GlobalAddressListViewModel globalAddressListViewModel) {
        super(1);
        this.$t = globalAddressListViewModel;
        this.l0 = addressListData;
        this.l1 = addressListData2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(AddressEditViewModel addressEditViewModel, InputItemData inputItemData, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.l1 = inputItemData;
        this.l2 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(AddressListState addressListState, AddressListState addressListState2, AddressListNativeStrategy addressListNativeStrategy, C68322mC<String> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = addressListState;
        this.l1 = addressListState2;
        this.l2 = addressListNativeStrategy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(AddressListViewModel addressListViewModel, AddressListViewModel addressListViewModel2, C68322mC<List<Object>> c68322mC, AddressListData addressListData) {
        super(1);
        this.$t = addressListData;
        this.l0 = addressListViewModel;
        this.l1 = addressListViewModel2;
        this.l2 = c68322mC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(LogisticAdapter.LogisticViewHolder logisticViewHolder, View view, LogisticDTO logisticDTO, int i) {
        super(1);
        this.$t = i;
        this.l0 = logisticViewHolder;
        this.l1 = view;
        this.l2 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(DeliveryPanelViewModel deliveryPanelViewModel, DeliveryData deliveryData, DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage, int i) {
        super(1);
        this.$t = i;
        this.l0 = deliveryPanelViewModel;
        this.l1 = deliveryData;
        this.l2 = enterParamForProductDetailPage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(ShopInfoVH shopInfoVH, C26804AfY c26804AfY, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = shopInfoVH;
        this.l1 = c26804AfY;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(PaymentViewModel paymentViewModel, PaymentMethod paymentMethod, PaymentInfo paymentInfo, int i) {
        super(1);
        this.$t = i;
        this.l0 = paymentViewModel;
        this.l1 = paymentMethod;
        this.l2 = paymentInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(ElementDTO elementDTO, PaymentMethod paymentMethod, B1V b1v, int i) {
        super(1);
        this.$t = i;
        this.l0 = elementDTO;
        this.l1 = paymentMethod;
        this.l2 = b1v;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(NormalElementViewHolder normalElementViewHolder, B21 b21, SD6 sd6, int i) {
        super(1);
        this.$t = i;
        this.l0 = normalElementViewHolder;
        this.l1 = b21;
        this.l2 = sd6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(ProductPackStruct productPackStruct, C27959AyB c27959AyB, DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult, int i) {
        super(1);
        this.$t = i;
        this.l0 = productPackStruct;
        this.l1 = c27959AyB;
        this.l2 = packedDeliverySelectResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(USCashierNormalElementVH uSCashierNormalElementVH, B21 b21, SD6 sd6, int i) {
        super(1);
        this.$t = i;
        this.l0 = uSCashierNormalElementVH;
        this.l1 = b21;
        this.l2 = sd6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(OfflineModeSheetPageFragment offlineModeSheetPageFragment, View view, C9Q1 c9q1, int i) {
        super(1);
        this.$t = i;
        this.l0 = offlineModeSheetPageFragment;
        this.l1 = view;
        this.l2 = c9q1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem, PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem2, List<C252659vp> list, C252659vp c252659vp) {
        super(1);
        this.$t = c252659vp;
        this.l0 = paidContentCollectionDetailHeaderAssem;
        this.l1 = paidContentCollectionDetailHeaderAssem2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(ManageSeriesListAssem manageSeriesListAssem, T5T t5t, ManagementPagePaidVideo managementPagePaidVideo, int i) {
        super(1);
        this.$t = i;
        this.l0 = manageSeriesListAssem;
        this.l1 = t5t;
        this.l2 = managementPagePaidVideo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(I18nUserProfileFragmentV2 i18nUserProfileFragmentV2, C26175APb c26175APb, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = i18nUserProfileFragmentV2;
        this.l1 = c26175APb;
        this.l2 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(OtherProfileAvatarAssem otherProfileAvatarAssem, OtherProfileAvatarAssem otherProfileAvatarAssem2, Context context, C68322mC<InterfaceC82683Wch> c68322mC) {
        super(1);
        this.$t = c68322mC;
        this.l0 = otherProfileAvatarAssem;
        this.l1 = otherProfileAvatarAssem2;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(MusicModel musicModel, MusicPlayViewModel musicPlayViewModel, C240719cZ c240719cZ, int i) {
        super(1);
        this.$t = i;
        this.l0 = musicModel;
        this.l1 = musicPlayViewModel;
        this.l2 = c240719cZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(ProfileComponents profileComponents, ProfileRootBaseComponent profileRootBaseComponent, C234109Gs c234109Gs, int i) {
        super(1);
        this.$t = i;
        this.l0 = profileComponents;
        this.l1 = profileRootBaseComponent;
        this.l2 = c234109Gs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(List list, List<DialogButton> list2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, PaymentMethodView paymentMethodView) {
        super(1);
        this.$t = paymentMethodView;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS108S0300000_4(List list, List<AddressTipButton> list2, AddressEditFragment addressEditFragment, AddressVerifyData addressVerifyData) {
        super(1);
        this.$t = addressVerifyData;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = addressEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS108S0300000_4(List list, List list2, InterfaceC88472Yns interfaceC88472Yns, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.l1 = interfaceC88472Yns;
        this.l2 = list2;
    }
}
