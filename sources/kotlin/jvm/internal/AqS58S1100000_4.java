package kotlin.jvm.internal;

import X.A0Z;
import X.AEB;
import X.AEG;
import X.AEP;
import X.AG2;
import X.ALY;
import X.ARI;
import X.ARN;
import X.AbstractC65781Prl;
import X.C141335gf;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C1EW;
import X.C1GE;
import X.C234109Gs;
import X.C247689no;
import X.C249189qE;
import X.C249549qo;
import X.C249589qs;
import X.C249649qy;
import X.C25846ACk;
import X.C25859ACx;
import X.C25860ACy;
import X.C27021Aj3;
import X.C27196Als;
import X.C27206Am2;
import X.C27354AoQ;
import X.C27356AoS;
import X.C27380Aoq;
import X.C27448Apw;
import X.C27493Aqf;
import X.C27513Aqz;
import X.C27739Aud;
import X.C27943Axv;
import X.C28115B1r;
import X.C28116B1s;
import X.C3C5;
import X.C4LX;
import X.C61447O9r;
import X.C70414RkI;
import X.C70921RsT;
import X.C70989RtZ;
import X.C71692SBs;
import X.C71693SBt;
import X.C72912tb;
import X.C73305Spp;
import X.C73969T1h;
import X.C76542zS;
import X.C76800UCe;
import X.C78946Uyc;
import X.C8V1;
import X.C9PN;
import X.EnumC26549AbR;
import X.EnumC28000Ayq;
import X.FMX;
import X.InterfaceC88472Yns;
import X.KNV;
import X.LB1;
import X.ORZ;
import X.Q8U;
import X.SY4;
import X.T16;
import X.V1M;
import Y.ACListenerS24S0100000_4;
import Y.AfS56S0100000_4;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSelectHelper;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.strategy.AddressListNativeStrategy;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.viewholder.SearchAddressElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Announcement;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionEntranceInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.promotion.PdpPromotionResourceBannerViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.EntranceBannerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductDetailReview;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.ShippingServiceFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.RegionPicker;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.offlinemode.ui.pagestate.OfflineModeDetailPageStateImp;
import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesListAssem;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.ss.android.ugc.aweme.profile.ui.v2.I18nUserProfileFragmentV2;
import com.ss.android.ugc.aweme.setting.page.account.ThirdPartyBindingPage;
import com.ss.android.ugc.aweme.tag.viewmodel.VideoTagFriendsListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class AqS58S1100000_4 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l1;
    public String s0;

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

    public final void invoke$0(SY4 btn) {
        o.LJIIIZ(btn, "btn");
        btn.setText(this.s0);
        btn.setButtonSize(3);
        btn.setButtonVariant(2);
        C16880lQ.LJJIZ(btn, new ACListenerS24S0100000_4((OfflineModeDetailPageStateImp) this.l1, 95));
    }

    public final C25846ACk invoke$1(C25846ACk it) {
        o.LJIIIZ(it, "it");
        String string = ((CaptionsPanelFragment) this.l1).getString(R.string.day);
        o.LJIIIIZZ(string, "getString(R.string.claCo…dontTranslatePopUp_title)");
        return C25846ACk.LJIILJJIL(it, false, null, false, true, null, Q8U.LIZIZ(new Object[]{this.s0}, 1, string, "format(format, *args)"), false, false, 126959);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS58S1100000_4(X.AG2 r3, int r4) {
        /*
            r2 = this;
            r2.$t = r4
            switch(r4) {
                case 26: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "settings_page"
            r1.s0 = r0
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l1 = r3
            java.lang.String r0 = "show"
            r1.s0 = r0
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S1100000_4.<init>(X.AG2, int):void");
    }

    public static final Object invoke$0(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        Map sendLog = (Map) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        sendLog.put("payment_option", aqS58S1100000_4.s0);
        sendLog.put("payment_option_cnt", Integer.valueOf(((List) aqS58S1100000_4.l1).size()));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("drop_down_list_name", aqS58S1100000_4.s0);
        logNode.plusAssign("item_num", Integer.valueOf(((AddressEditViewModel) aqS58S1100000_4.l1).LLJIJIL));
        C1EW.LIZIZ(SystemClock.elapsedRealtime(), ((AddressEditViewModel) aqS58S1100000_4.l1).LLJI, logNode, "stay_time");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C71692SBs(((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getCcdcPaymentMethod(), ((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getEnterParams(), ((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getDismissParent(), ((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getOpenType(), aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        hierarchyData.LIZ = new C71693SBt(((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getCcdcPaymentMethod(), ((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getEnterParams(), ((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getDismissParent(), ((CCDCAddCardHalfFragment) aqS58S1100000_4.l1).getOpenType(), aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$12(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        int i;
        HashMap logView = (HashMap) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.put("module_name", aqS58S1100000_4.s0);
        logView.put("jump_link", ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZJ);
        EntranceBannerInfo entranceBannerInfo = ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZ;
        String str = null;
        if (entranceBannerInfo == null || entranceBannerInfo.titleImg == null) {
            i = 0;
        } else {
            i = 1;
        }
        logView.put("has_icon", Integer.valueOf(i));
        EntranceBannerInfo entranceBannerInfo2 = ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZ;
        if (entranceBannerInfo2 != null) {
            str = entranceBannerInfo2.title;
        }
        logView.put("module_title", str);
        logView.put("module_describe", ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZIZ);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        int i;
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.put("module_name", aqS58S1100000_4.s0);
        logWhenShow.put("jump_link", ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZJ);
        EntranceBannerInfo entranceBannerInfo = ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZ;
        String str = null;
        if (entranceBannerInfo == null || entranceBannerInfo.titleImg == null) {
            i = 0;
        } else {
            i = 1;
        }
        logWhenShow.put("has_icon", Integer.valueOf(i));
        EntranceBannerInfo entranceBannerInfo2 = ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZ;
        if (entranceBannerInfo2 != null) {
            str = entranceBannerInfo2.title;
        }
        logWhenShow.put("module_title", str);
        logWhenShow.put("module_describe", ((C27513Aqz) ((PdpPromotionResourceBannerViewHolder) aqS58S1100000_4.l1).getItem()).LIZIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("quit_type", aqS58S1100000_4.s0);
        logNode.plusAssign("stay_time", Long.valueOf(((ShippingServiceFragment) aqS58S1100000_4.l1).getStayDuration()));
        logNode.plusAssign("shipping_rights_content", ((ShippingServiceFragment) aqS58S1100000_4.l1).LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", aqS58S1100000_4.s0);
        logNode.putAll(((UserRightFragment) aqS58S1100000_4.l1).daInfo);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("stay_time", Long.valueOf(((UserRightFragment) aqS58S1100000_4.l1).getStayDuration()));
        logNode.plusAssign("quit_type", aqS58S1100000_4.s0);
        logNode.putAll(((UserRightFragment) aqS58S1100000_4.l1).daInfo);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        District district;
        DistrictPickerState it = (DistrictPickerState) obj;
        o.LJIIIZ(it, "it");
        boolean z = true;
        if (it.getTitleEn().length() > 0) {
            RegionPicker regionPicker = (RegionPicker) aqS58S1100000_4.l1;
            String str = aqS58S1100000_4.s0;
            try {
                C27380Aoq c27380Aoq = regionPicker.xl().LJLJJLL;
                C76800UCe c76800UCe = null;
                r2 = null;
                String str2 = null;
                if (c27380Aoq != null) {
                    Object LJLLLLLL = ORZ.LJLLLLLL(0, it.getDistrictList());
                    if ((LJLLLLLL instanceof District) && (district = (District) LJLLLLLL) != null) {
                        str2 = district.districtKey;
                    }
                    C73305Spp c73305Spp = (C73305Spp) regionPicker._$_findCachedViewById(R.id.keh);
                    if (c73305Spp != null && c73305Spp.getVisibility() == 0) {
                        z = false;
                    }
                    c27380Aoq.LIZJ(str2, str, z);
                    c76800UCe = C76800UCe.LIZ;
                }
                C3C5.m7constructorimpl(c76800UCe);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$18(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        aqS58S1100000_4.invoke$0((SY4) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        C9PN c9pn = (C9PN) obj;
        I18nUserProfileFragmentV2 i18nUserProfileFragmentV2 = (I18nUserProfileFragmentV2) aqS58S1100000_4.l1;
        String str = aqS58S1100000_4.s0;
        i18nUserProfileFragmentV2.LJLILLLLZI = str;
        if (c9pn != null) {
            return C9PN.LIZ(c9pn, null, str, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 268435453);
        }
        return null;
    }

    public static final Object invoke$2(AqS58S1100000_4 aqS58S1100000_4, Object view) {
        Object obj;
        Object obj2;
        o.LJIIIZ(view, "view");
        if (aqS58S1100000_4.s0 != null) {
            AddressEditFragment addressEditFragment = AddressEditFragment.LLD;
            if (addressEditFragment != null) {
                C78946Uyc.LJJII(addressEditFragment, new C70921RsT(), new AqS170S0100000_4((RegionSelectHelper) aqS58S1100000_4.l1, 200));
            }
            List<Region> list = null;
            if (C27196Als.LIZ()) {
                RegionSelectHelper regionSelectHelper = (RegionSelectHelper) aqS58S1100000_4.l1;
                String str = aqS58S1100000_4.s0;
                C27021Aj3 inputItem = regionSelectHelper.getInputItem();
                if (inputItem != null) {
                    obj2 = inputItem.LIZIZ;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof List) {
                    list = (List) obj2;
                }
                regionSelectHelper.openRegionPickerPage(str, list);
            } else {
                RegionSelectHelper regionSelectHelper2 = (RegionSelectHelper) aqS58S1100000_4.l1;
                String str2 = aqS58S1100000_4.s0;
                C27021Aj3 inputItem2 = regionSelectHelper2.getInputItem();
                if (inputItem2 != null) {
                    obj = inputItem2.LIZIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof List) {
                    list = (List) obj;
                }
                regionSelectHelper2.showRegionDialog(str2, list);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$20(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        HashMap logWhenShow = (HashMap) obj;
        o.LJIIIZ(logWhenShow, "$this$logWhenShow");
        logWhenShow.putAll(((C27448Apw) ((PdpPromotionEntranceInfoViewHolder) aqS58S1100000_4.l1).getItem()).LIZLLL);
        logWhenShow.put("module_name", aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        HashMap logNode = (HashMap) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.put("coupon_zone", aqS58S1100000_4.s0);
        Map map = (Map) aqS58S1100000_4.l1;
        Object obj7 = null;
        if (map != null) {
            obj2 = map.get("coupon_id");
        } else {
            obj2 = null;
        }
        logNode.put("coupon_id", obj2);
        Map map2 = (Map) aqS58S1100000_4.l1;
        if (map2 != null) {
            obj3 = map2.get("coupon_type_id");
        } else {
            obj3 = null;
        }
        logNode.put("coupon_type_id", obj3);
        Map map3 = (Map) aqS58S1100000_4.l1;
        if (map3 != null) {
            obj4 = map3.get("coupon_type");
        } else {
            obj4 = null;
        }
        logNode.put("coupon_type", obj4);
        Map map4 = (Map) aqS58S1100000_4.l1;
        if (map4 != null) {
            obj5 = map4.get("is_coupon_available");
        } else {
            obj5 = null;
        }
        logNode.put("is_coupon_available", obj5);
        Map map5 = (Map) aqS58S1100000_4.l1;
        if (map5 != null) {
            obj6 = map5.get("coupon_type_info");
        } else {
            obj6 = null;
        }
        logNode.put("coupon_type_info", obj6);
        Map map6 = (Map) aqS58S1100000_4.l1;
        if (map6 != null) {
            obj7 = map6.get("coupon_cost_role");
        }
        logNode.put("coupon_cost_role", obj7);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS58S1100000_4 aqS58S1100000_4, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        String collectionId = ((CreatorCollectionDetailResponse) aqS58S1100000_4.l1).collectionDetail.collectionId;
        String str = aqS58S1100000_4.s0;
        C72912tb c72912tb = new C72912tb(C76800UCe.LIZ);
        o.LJIIIZ(collectionId, "collectionId");
        return new C249189qE(collectionId, str, c72912tb);
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        return aqS58S1100000_4.invoke$1((C25846ACk) obj);
    }

    public static final Object invoke$24(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return C25859ACx.LJIILJJIL(((C25860ACy) aqS58S1100000_4.l1).LJFF(), null, null, false, null, aqS58S1100000_4.s0, false, false, null, false, false, false, false, 8388479);
    }

    public static final Object invoke$25(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEB.LIZJ(((AEG) aqS58S1100000_4.l1).LJFF(), aqS58S1100000_4.s0, false, false, false, 16382);
    }

    public static final Object invoke$26(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS58S1100000_4.l1).LJFF(), null, null, false, null, null, false, null, null, null, aqS58S1100000_4.s0, null, false, false, null, 8384511);
    }

    public static final Object invoke$27(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS58S1100000_4.l1).LJFF(), null, null, false, null, aqS58S1100000_4.s0, false, null, null, null, null, null, false, false, null, 8388543);
    }

    public static final Object invoke$28(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS58S1100000_4.l1).LJFF(), aqS58S1100000_4.s0, null, false, null, null, false, null, null, null, null, null, false, false, null, 8388606);
    }

    public static final Object invoke$29(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS58S1100000_4.l1).LJFF(), null, null, false, null, null, false, null, null, aqS58S1100000_4.s0, null, null, false, false, null, 8386559);
    }

    public static final Object invoke$3(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        ViewItem viewItem;
        String str;
        ViewItem viewItem2;
        String str2;
        boolean z;
        CandInputDataOptions candInputDataOptions = (CandInputDataOptions) obj;
        if (candInputDataOptions != null) {
            SearchInputItemViewHolder searchInputItemViewHolder = (SearchInputItemViewHolder) aqS58S1100000_4.l1;
            searchInputItemViewHolder.LJLJJI = candInputDataOptions.sessionKey;
            searchInputItemViewHolder.getViewModel().LLIIII = ((SearchInputItemViewHolder) aqS58S1100000_4.l1).LJLJJI;
            ArrayList arrayList = new ArrayList();
            boolean LJFF = C27206Am2.LJFF(EnumC28000Ayq.TTS, "shipping_address", EnumC26549AbR.TTS_GLOBAL_ADDRESS_EDIT_V1.getTemplate());
            List<CandInputData> list = candInputDataOptions.candInputOptions;
            if (list != null) {
                String str3 = aqS58S1100000_4.s0;
                SearchInputItemViewHolder searchInputItemViewHolder2 = (SearchInputItemViewHolder) aqS58S1100000_4.l1;
                for (CandInputData candInputData : list) {
                    List<ViewItem> list2 = candInputData.viewItems;
                    if (list2 != null && (viewItem = (ViewItem) ORZ.LJLLLLLL(0, list2)) != null && (str = viewItem.text) != null) {
                        Integer num = null;
                        if (LJFF || (viewItem2 = (ViewItem) ORZ.LJLLLLLL(1, candInputData.viewItems)) == null) {
                            str2 = null;
                        } else {
                            str2 = viewItem2.text;
                        }
                        Integer num2 = candInputData.itemType;
                        if (num2 == null || num2.intValue() != 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Integer num3 = candInputData.itemType;
                        if (num3 != null && num3.intValue() == 1) {
                            num = C19N.LIZIZ(searchInputItemViewHolder2.itemView, "itemView.context", R.attr.go);
                        }
                        arrayList.add(new C27356AoS(candInputData, str, str2, str3, z, num, 192));
                    }
                }
            }
            SearchInputItemViewHolder searchInputItemViewHolder3 = (SearchInputItemViewHolder) aqS58S1100000_4.l1;
            C27354AoQ<CandInputData> c27354AoQ = searchInputItemViewHolder3.LJLJI;
            if (c27354AoQ != null) {
                c27354AoQ.LJFF(true, arrayList, searchInputItemViewHolder3, false, true);
            }
            if (arrayList.size() > 0) {
                SearchInputItemViewHolder searchInputItemViewHolder4 = (SearchInputItemViewHolder) aqS58S1100000_4.l1;
                if (!searchInputItemViewHolder4.LJLJLJ) {
                    searchInputItemViewHolder4.LJLJLJ = true;
                    searchInputItemViewHolder4.LJLJLLL = SystemClock.elapsedRealtime();
                    View itemView = ((SearchInputItemViewHolder) aqS58S1100000_4.l1).itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    C78946Uyc.LJJIIJ(itemView, new C70989RtZ(), new AqS170S0100000_4(arrayList, (List<? extends Object>) 208));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS58S1100000_4.l1).LJFF(), null, null, false, null, null, false, aqS58S1100000_4.s0, null, null, null, null, false, false, null, 8388095);
    }

    public static final Object invoke$31(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        return AEP.LJIILJJIL(((AG2) aqS58S1100000_4.l1).LJFF(), null, null, false, null, null, false, null, null, null, null, null, false, false, aqS58S1100000_4.s0, 4194303);
    }

    public static final Object invoke$32(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        String str;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("module_name", "logistics");
        logView.plusAssign("delivery_info", aqS58S1100000_4.s0);
        LogisticDTO logisticDTO = (LogisticDTO) aqS58S1100000_4.l1;
        if (logisticDTO != null) {
            str = logisticDTO.LIZ();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logView.plusAssign("is_next_day_delivery", str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", ((VideoTagFriendsListViewModel) aqS58S1100000_4.l1).gv0().getEnterFrom());
        sendEventTrackingAsync.put("tag_num", ((VideoTagFriendsListViewModel) aqS58S1100000_4.l1).iv0().size());
        sendEventTrackingAsync.put("function", "tag");
        sendEventTrackingAsync.put("close_type", aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$34(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("previous_page", ((VideoTagFriendsListViewModel) aqS58S1100000_4.l1).gv0().getEnterFrom());
        sendEventTrackingAsync.put("tag_num", ((VideoTagFriendsListViewModel) aqS58S1100000_4.l1).iv0().size());
        sendEventTrackingAsync.put("function", "tag");
        sendEventTrackingAsync.put("close_type", aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        FollowerRelationState it = (FollowerRelationState) obj;
        o.LJIIIZ(it, "it");
        List<Object> list = it.getListState().getList();
        String str = aqS58S1100000_4.s0;
        Iterator<Object> it2 = list.iterator();
        int i = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((next instanceof LB1) && o.LJ(((LB1) next).LJLILLLLZI.getUid(), str)) {
                if (i != -1) {
                    List<? extends Object> LLJILJILJ = ORZ.LLJILJILJ(it.getListState().getList());
                    ListProtector.remove(LLJILJILJ, i);
                    ((FollowerRelationViewModel) aqS58S1100000_4.l1).LJLLL.LJIIIZ(LLJILJILJ);
                }
            } else {
                i++;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        ThirdPartyBindingPage thirdPartyBindingPage = (ThirdPartyBindingPage) aqS58S1100000_4.l1;
        String str = aqS58S1100000_4.s0;
        thirdPartyBindingPage.getClass();
        ThirdPartyBindingPage.Al(str, "remove", "cancel");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("drop_down_list_name", aqS58S1100000_4.s0);
        logNode.plusAssign("item_num", 1);
        if (o.LJ(aqS58S1100000_4.s0, "address") && (str = ((CandInputDataOptions) aqS58S1100000_4.l1).report) != null) {
            logNode.plusAssign("sever_data_report", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("drop_down_list_name", aqS58S1100000_4.s0);
        logNode.plusAssign("item_num", 1);
        logNode.plusAssign("action_type", "auto");
        logNode.plusAssign("rank", 0);
        if (o.LJ(aqS58S1100000_4.s0, "address") && (str = ((CandInputDataOptions) aqS58S1100000_4.l1).report) != null) {
            logNode.plusAssign("sever_data_report", str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        ARN it = (ARN) obj;
        o.LJIIIZ(it, "it");
        A0Z.LIZJ("video_delete", "delete", ((ManageSeriesListAssem) aqS58S1100000_4.l1).H3().LJLILLLLZI, ((ManageSeriesListAssem) aqS58S1100000_4.l1).H3().LJLIL, ((ManageSeriesListAssem) aqS58S1100000_4.l1).H3().LJLJI);
        ManageSeriesViewModel L3 = ((ManageSeriesListAssem) aqS58S1100000_4.l1).L3();
        String videoId = aqS58S1100000_4.s0;
        L3.getClass();
        o.LJIIIZ(videoId, "videoId");
        String str = L3.getState().LJLIL;
        if (str != null) {
            L3.disposeOnClear(L3.hv0().LIZIZ(str, videoId).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJIIL(new AfS56S0100000_4(L3, 149)).LJJII(new AfS56S0100000_4(L3, 150), new AfS56S0100000_4(L3, 151)));
        }
        it.LIZJ = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJII(aqS58S1100000_4.s0, new AqS170S0100000_4((AddressListNativeStrategy) aqS58S1100000_4.l1, 225));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJ(R.string.qr_, new AqS58S1100000_4((ManageSeriesListAssem) aqS58S1100000_4.l1, aqS58S1100000_4.s0, 39));
        actionGroup.LJIIIIZZ(R.string.qr9, new AqS170S0100000_4((ManageSeriesListAssem) aqS58S1100000_4.l1, 1224));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("is_success", CardStruct.IStatusCode.DEFAULT);
        logView.plusAssign("fail_reason", aqS58S1100000_4.s0);
        ((DistrictFragment) aqS58S1100000_4.l1).getClass();
        logView.plusAssign("is_retry", V1M.LJJJJZ(false));
        C1EW.LIZIZ(System.currentTimeMillis(), ((DistrictFragment) aqS58S1100000_4.l1).LJLLL, logView, "duration");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS58S1100000_4 aqS58S1100000_4, Object report) {
        o.LJIIIZ(report, "report");
        C249549qo c249549qo = (C249549qo) aqS58S1100000_4.l1;
        String str = aqS58S1100000_4.s0;
        c249549qo.getClass();
        C247689no.LIZ().LJJII(6, str);
        ((C249549qo) aqS58S1100000_4.l1).getClass();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        C249649qy report = (C249649qy) obj;
        o.LJIIIZ(report, "report");
        if (report.LJLIL != 10009) {
            ((C249589qs) aqS58S1100000_4.l1).LJFF();
            ((C249589qs) aqS58S1100000_4.l1).LJJIII(aqS58S1100000_4.s0);
        } else {
            ((C249589qs) aqS58S1100000_4.l1).LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS58S1100000_4 aqS58S1100000_4, Object report) {
        o.LJIIIZ(report, "report");
        ((C249589qs) aqS58S1100000_4.l1).LJJIII(aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004f, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$45(kotlin.jvm.internal.AqS58S1100000_4 r10, java.lang.Object r11) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions r11 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputDataOptions) r11
            if (r11 == 0) goto L51
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData> r0 = r11.candInputOptions
            if (r0 == 0) goto L51
            java.lang.String r5 = r10.s0
            java.lang.Object r6 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r6 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r6
            java.util.Iterator r3 = r0.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r8 = r3.next()
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r8 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData) r8
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r8.address
            if (r0 == 0) goto L12
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem> r0 = r0.items
            if (r0 == 0) goto L12
            java.util.Iterator r2 = r0.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem r1 = (com.ss.android.ugc.aweme.ecommerce.base.address.dto.AddressItem) r1
            java.lang.String r0 = r1.key
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r5)
            if (r0 == 0) goto L2a
            java.lang.String r7 = r1.value
            r6.getClass()
            kotlin.jvm.internal.AqS10S2200000_4 r4 = new kotlin.jvm.internal.AqS10S2200000_4
            r9 = 3
            r4.<init>(r5, r6, r7, r8, r9)
            r6.ww0(r5, r4)
            goto L2a
        L4d:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L64
        L51:
            java.lang.Object r3 = r10.l1
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r3
            java.lang.String r2 = r10.s0
            r3.getClass()
            kotlin.jvm.internal.AqS58S1100000_4 r1 = new kotlin.jvm.internal.AqS58S1100000_4
            r0 = 47
            r1.<init>(r3, r2, r0)
            r3.ww0(r2, r1)
        L64:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S1100000_4.invoke$45(kotlin.jvm.internal.AqS58S1100000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$46(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        String str;
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.plusAssign("button_name", aqS58S1100000_4.s0);
        if (((AddressEditFragment) aqS58S1100000_4.l1).Dl().LLJILJILJ) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        logNode.plusAssign("is_fullscreen", str);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$47(kotlin.jvm.internal.AqS58S1100000_4 r12, java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S1100000_4.invoke$47(kotlin.jvm.internal.AqS58S1100000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$48(AqS58S1100000_4 aqS58S1100000_4, Object it) {
        o.LJIIIZ(it, "it");
        ALY aly = (ALY) aqS58S1100000_4.l1;
        if (aly != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", aly.LIZJ);
            c188727au.LJIIIZ("enter_method", aly.LIZLLL);
            c188727au.LJIIIZ("room_id", aly.LIZ);
            c188727au.LJIIIZ("anchor_id", aly.LIZIZ);
            FMX.LJIIL("livesdk_push_pre_permission_deny", c188727au.LIZ);
        } else {
            String str = aqS58S1100000_4.s0;
            C188727au LIZLLL = KNV.LIZLLL(str, "enterFrom");
            LIZLLL.LJIIIZ("enter_from", str);
            LIZLLL.LJIIIZ("enter_method", "notification_bell");
            LIZLLL.LJIIIZ("enter_reason", "leave");
            FMX.LJIIL("push_pre_permission_deny", LIZLLL.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS58S1100000_4.l1).LIZIZ);
        logNode.plusAssign("shop_id", aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        HashMap<String, Object> LJII = C27739Aud.LJII(((Announcement) aqS58S1100000_4.l1).getDaInfo());
        if (LJII != null) {
            logNode.putAll(LJII);
        }
        logNode.plusAssign("button_type", aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LaneParams logNode = (LaneParams) obj;
        o.LJIIIZ(logNode, "$this$logNode");
        logNode.withParamsGroup(((C70414RkI) aqS58S1100000_4.l1).LIZIZ);
        logNode.plusAssign("page_name", aqS58S1100000_4.s0);
        ((C70414RkI) aqS58S1100000_4.l1).LJJLIIIJLJLI(logNode);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        LogisticDTO logisticDTO;
        Integer num;
        C27943Axv sendLogReturnParams = (C27943Axv) obj;
        o.LJIIIZ(sendLogReturnParams, "$this$sendLogReturnParams");
        C27943Axv.LIZ(sendLogReturnParams, ((C70414RkI) aqS58S1100000_4.l1).LIZIZ);
        sendLogReturnParams.LIZJ("page_name", aqS58S1100000_4.s0);
        C70414RkI c70414RkI = (C70414RkI) aqS58S1100000_4.l1;
        c70414RkI.getClass();
        sendLogReturnParams.LIZJ("previous_page", "product_detail");
        int i = 0;
        sendLogReturnParams.LIZJ("is_fullscreen", 0);
        Boolean bool = c70414RkI.LJJI;
        if (bool != null) {
            sendLogReturnParams.LIZJ("is_address_deliverable", Integer.valueOf(bool.booleanValue() ? 1 : 0));
        }
        ProductPackStruct productPackStruct = c70414RkI.LJIIJJI;
        if (productPackStruct != null && (logisticDTO = productPackStruct.logistic) != null && (num = logisticDTO.deliveryOption) != null) {
            i = num.intValue();
        }
        sendLogReturnParams.LIZJ("delivery_option", Integer.valueOf(i));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        int i;
        ProductDetailReview productDetailReview;
        Integer num;
        ProductDetailReview productDetailReview2;
        Object obj2;
        ProductDetailReview productDetailReview3;
        ProductDetailReview productDetailReview4;
        LaneParams logView = (LaneParams) obj;
        o.LJIIIZ(logView, "$this$logView");
        logView.plusAssign("module_name", "size_fitness");
        ProductPackStruct productPackStruct = ((C70414RkI) aqS58S1100000_4.l1).LJIIJJI;
        Float f = null;
        if (productPackStruct != null && (productDetailReview4 = productPackStruct.review) != null) {
            f = productDetailReview4.rating;
        }
        int i2 = 0;
        if (f == null) {
            i = 0;
        } else {
            i = 1;
        }
        logView.plusAssign("has_rate", Integer.valueOf(i));
        ProductPackStruct productPackStruct2 = ((C70414RkI) aqS58S1100000_4.l1).LJIIJJI;
        if (productPackStruct2 != null && (productDetailReview2 = productPackStruct2.review) != null && productDetailReview2.rating != null) {
            if (productPackStruct2 == null || (productDetailReview3 = productPackStruct2.review) == null || (obj2 = productDetailReview3.rating) == null) {
                obj2 = 0;
            }
            logView.plusAssign("rate", obj2);
        }
        ProductPackStruct productPackStruct3 = ((C70414RkI) aqS58S1100000_4.l1).LJIIJJI;
        if (productPackStruct3 != null && (productDetailReview = productPackStruct3.review) != null && (num = productDetailReview.reviewCount) != null) {
            i2 = num.intValue();
        }
        logView.plusAssign("review_cnt", Integer.valueOf(i2));
        logView.plusAssign("fitness_info", aqS58S1100000_4.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        C8V1 uiContentAssem = (C8V1) obj;
        o.LJIIIZ(uiContentAssem, "$this$uiContentAssem");
        uiContentAssem.LIZLLL(((C234109Gs) aqS58S1100000_4.l1).LIZIZ);
        uiContentAssem.LIZIZ = aqS58S1100000_4.s0;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r5 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$6(kotlin.jvm.internal.AqS58S1100000_4 r17, java.lang.Object r18) {
        /*
            r1 = r18
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState) r1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJIIIZ(r1, r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r3 = r1.getCheckedPaymentMethod()
            if (r3 == 0) goto Lf7
            r0 = r17
            java.lang.Object r4 = r0.l1
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment r4 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment) r4
            java.lang.String r7 = r0.s0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r0 = r4.getViewModel()
            r0.getClass()
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement>>> r1 = r0.LJLLJ
            java.lang.String r0 = r3.LJFF()
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            java.lang.Object r1 = r1.get(r0)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L33
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
        L33:
            java.lang.String r0 = "sub_payment_type_element"
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L4c
            r0 = 0
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r0, r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement r0 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement) r0
            if (r0 == 0) goto L4c
            java.lang.String r6 = r0.getParamValue()
            if (r6 != 0) goto L4e
        L4c:
            java.lang.String r6 = r3.id
        L4e:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod> r1 = r3.subPaymentMethods
            r0 = 0
            if (r1 == 0) goto L70
            java.util.Iterator r2 = r1.iterator()
        L57:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto Lff
            java.lang.Object r5 = r2.next()
            r1 = r5
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r1
            java.lang.String r1 = r1.id
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r6)
            if (r1 == 0) goto L57
        L6c:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5 = (com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod) r5
            if (r5 != 0) goto L71
        L70:
            r5 = r3
        L71:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r4.getViewModel()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan r2 = r1.Mv0(r3)
            X.B1K r6 = r4.getPaymentLogger()
            java.lang.String r8 = r5.LJIIL()
            boolean r1 = r4.isSaveCard()
            if (r1 == 0) goto Lfc
            java.lang.String r9 = "1"
        L89:
            java.lang.String[] r10 = r4.errorParamString
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r4.getViewModel()
            r1.getClass()
            boolean r1 = com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel.Qv0(r3)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo r1 = r3.bindInfo
            if (r1 == 0) goto Lfa
            java.lang.String r12 = r1.bindStatus
        La0:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r1 = r4.getEnterParams()
            java.lang.String r13 = r1.price
            if (r13 != 0) goto Lc2
            java.lang.StringBuilder r5 = X.X1D.LIZ()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r1 = r4.getEnterParams()
            java.lang.String r1 = r1.currency
            r5.append(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams r1 = r4.getEnterParams()
            java.lang.String r1 = r1.totalPriceVal
            r5.append(r1)
            java.lang.String r13 = X.X1D.LIZIZ(r5)
        Lc2:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r4.getViewModel()
            X.SCQ r1 = r1.Kv0()
            boolean r1 = r1.LJ
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r1)
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r4.getViewModel()
            X.SCQ r1 = r1.Kv0()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.OcrStatus r1 = r1.LJFF
            java.lang.String r15 = r1.toString()
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel r1 = r4.getViewModel()
            X.SCQ r1 = r1.Kv0()
            java.lang.Integer r1 = r1.LJI
            if (r2 == 0) goto Lec
            java.lang.String r0 = r2.tenure
        Lec:
            java.lang.String r18 = r3.LJIIL()
            r17 = r0
            r16 = r1
            r6.LJIIJ(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        Lf7:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        Lfa:
            r12 = r0
            goto La0
        Lfc:
            java.lang.String r9 = "0"
            goto L89
        Lff:
            r5 = r0
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S1100000_4.invoke$6(kotlin.jvm.internal.AqS58S1100000_4, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        ViewItem viewItem;
        String str;
        boolean z;
        Integer LIZIZ;
        CandInputDataOptions candInputData = (CandInputDataOptions) obj;
        o.LJIIIZ(candInputData, "candInputData");
        ((SearchAddressElementViewHolder) aqS58S1100000_4.l1).LJLILLLLZI = candInputData.sessionKey;
        ArrayList arrayList = new ArrayList();
        List<CandInputData> list = candInputData.candInputOptions;
        if (list != null) {
            String str2 = aqS58S1100000_4.s0;
            SearchAddressElementViewHolder searchAddressElementViewHolder = (SearchAddressElementViewHolder) aqS58S1100000_4.l1;
            for (CandInputData candInputData2 : list) {
                List<ViewItem> list2 = candInputData2.viewItems;
                if (list2 != null && (viewItem = (ViewItem) ORZ.LJLLLLLL(0, list2)) != null && (str = viewItem.text) != null) {
                    Integer num = candInputData2.itemType;
                    if (num == null || num.intValue() != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Integer num2 = candInputData2.itemType;
                    if (num2 == null || num2.intValue() != 1) {
                        LIZIZ = null;
                    } else {
                        LIZIZ = C19N.LIZIZ(searchAddressElementViewHolder.itemView, "itemView.context", R.attr.go);
                    }
                    arrayList.add(new C27356AoS(candInputData2, str, null, str2, z, LIZIZ, 192));
                }
            }
        }
        if (!((SearchAddressElementViewHolder) aqS58S1100000_4.l1).LJLJL && C1GE.LJIILIIL(arrayList)) {
            SearchAddressElementViewHolder searchAddressElementViewHolder2 = (SearchAddressElementViewHolder) aqS58S1100000_4.l1;
            searchAddressElementViewHolder2.LJLJL = true;
            C27493Aqf.LJ(searchAddressElementViewHolder2.LJLJJLL);
        } else {
            SearchAddressElementViewHolder searchAddressElementViewHolder3 = (SearchAddressElementViewHolder) aqS58S1100000_4.l1;
            searchAddressElementViewHolder3.LJLJL = false;
            C27493Aqf.LIZ(searchAddressElementViewHolder3.LJLJJLL);
        }
        if (arrayList.size() > 0) {
            int size = arrayList.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(C27493Aqf.LIZ);
            linkedHashMap.put("drop_down_list_name", "address_searchbar");
            linkedHashMap.put("item_num", String.valueOf(size));
            C76542zS.LIZ("tiktokec_drop_down_list_show", linkedHashMap);
        }
        SearchAddressElementViewHolder searchAddressElementViewHolder4 = (SearchAddressElementViewHolder) aqS58S1100000_4.l1;
        C27354AoQ<CandInputData> c27354AoQ = searchAddressElementViewHolder4.LJLIL;
        if (c27354AoQ != null) {
            c27354AoQ.LJFF(true, arrayList, searchAddressElementViewHolder4, false, true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) aqS58S1100000_4.l1;
        assemble.mv0(cCDCAddCardHalfFragment, new AqS58S1100000_4(cCDCAddCardHalfFragment, aqS58S1100000_4.s0, 10));
        assemble.wv0((CCDCAddCardHalfFragment) aqS58S1100000_4.l1, C28115B1r.LJLIL);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS58S1100000_4 aqS58S1100000_4, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        CCDCAddCardHalfFragment cCDCAddCardHalfFragment = (CCDCAddCardHalfFragment) aqS58S1100000_4.l1;
        assemble.mv0(cCDCAddCardHalfFragment, new AqS58S1100000_4(cCDCAddCardHalfFragment, aqS58S1100000_4.s0, 11));
        assemble.wv0((CCDCAddCardHalfFragment) aqS58S1100000_4.l1, C28116B1s.LJLIL);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS58S1100000_4(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 1: goto Lf;
                case 47: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S1100000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, java.lang.String, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS58S1100000_4(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment r3, java.lang.String r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 15: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l1 = r3
            r1.s0 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.s0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS58S1100000_4.<init>(com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment, java.lang.String, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(C234109Gs c234109Gs, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c234109Gs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(C249549qo c249549qo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c249549qo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(C249589qs c249589qs, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c249589qs;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(C25860ACy c25860ACy, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c25860ACy;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(AEG aeg, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aeg;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(AG2 ag2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = ag2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(ALY aly, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = aly;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(C70414RkI c70414RkI, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c70414RkI;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(CaptionsPanelFragment captionsPanelFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = captionsPanelFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(SearchInputItemViewHolder searchInputItemViewHolder, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = searchInputItemViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(LogisticDTO logisticDTO, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(PaymentFragment paymentFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = paymentFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(SearchAddressElementViewHolder searchAddressElementViewHolder, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = searchAddressElementViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(CCDCAddCardHalfFragment cCDCAddCardHalfFragment, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = cCDCAddCardHalfFragment;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(Announcement announcement, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = announcement;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(PdpPromotionEntranceInfoViewHolder pdpPromotionEntranceInfoViewHolder, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pdpPromotionEntranceInfoViewHolder;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(RegionPicker regionPicker, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = regionPicker;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(FollowerRelationViewModel followerRelationViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = followerRelationViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(CreatorCollectionDetailResponse creatorCollectionDetailResponse, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = creatorCollectionDetailResponse;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(ManageSeriesListAssem manageSeriesListAssem, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = manageSeriesListAssem;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(I18nUserProfileFragmentV2 i18nUserProfileFragmentV2, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = i18nUserProfileFragmentV2;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(ThirdPartyBindingPage thirdPartyBindingPage, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = thirdPartyBindingPage;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(VideoTagFriendsListViewModel videoTagFriendsListViewModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = videoTagFriendsListViewModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, CandInputDataOptions candInputDataOptions, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = candInputDataOptions;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, AddressEditFragment addressEditFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = addressEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, RegionSelectHelper regionSelectHelper, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = regionSelectHelper;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, AddressListNativeStrategy addressListNativeStrategy, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = addressListNativeStrategy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, PdpPromotionResourceBannerViewHolder pdpPromotionResourceBannerViewHolder, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = pdpPromotionResourceBannerViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, ShippingServiceFragment shippingServiceFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = shippingServiceFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, DistrictFragment districtFragment, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = districtFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS58S1100000_4(String str, OfflineModeDetailPageStateImp offlineModeDetailPageStateImp, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = offlineModeDetailPageStateImp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S1100000_4(String str, String str2, List<PaymentMethod> list) {
        super(1);
        this.$t = list;
        this.s0 = str;
        this.l1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS58S1100000_4(String str, String str2, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.s0 = str;
        this.l1 = str2;
    }
}
