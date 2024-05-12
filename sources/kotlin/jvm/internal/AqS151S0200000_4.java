package kotlin.jvm.internal;

import X.A97;
import X.ASL;
import X.ASQ;
import X.ASY;
import X.AbstractC253779xd;
import X.AbstractC32579CqV;
import X.AbstractC56327M8t;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass114;
import X.B17;
import X.B1R;
import X.C119774mz;
import X.C132805Jc;
import X.C158056If;
import X.C16880lQ;
import X.C17J;
import X.C17N;
import X.C188727au;
import X.C212428Vi;
import X.C233969Ge;
import X.C235119Kp;
import X.C235759Nb;
import X.C235769Nc;
import X.C237559Tz;
import X.C242979gD;
import X.C242989gE;
import X.C243369gq;
import X.C243409gu;
import X.C243439gx;
import X.C243799hX;
import X.C243819hZ;
import X.C243839hb;
import X.C252709vu;
import X.C252989wM;
import X.C25524A0a;
import X.C25532A0i;
import X.C25589A2n;
import X.C25765A9h;
import X.C25908AEu;
import X.C26045AKb;
import X.C26224AQy;
import X.C26227ARb;
import X.C26231ARf;
import X.C26338AVi;
import X.C26572Abo;
import X.C26573Abp;
import X.C26703Adv;
import X.C26936Ahg;
import X.C26937Ahh;
import X.C26947Ahr;
import X.C26968AiC;
import X.C27021Aj3;
import X.C27090AkA;
import X.C27241Amb;
import X.C27356AoS;
import X.C27486AqY;
import X.C27739Aud;
import X.C27949Ay1;
import X.C29706BlG;
import X.C2NU;
import X.C2YJ;
import X.C31811Ce7;
import X.C38281F0r;
import X.C38350F3i;
import X.C45804HyK;
import X.C47117IeP;
import X.C4LD;
import X.C51029K0z;
import X.C51633KOf;
import X.C57396Mfo;
import X.C58096Mr6;
import X.C5H3;
import X.C61447O9r;
import X.C62822Ol8;
import X.C62889OmD;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70887Rrv;
import X.C70917RsP;
import X.C70918RsQ;
import X.C70960Rt6;
import X.C71759SEh;
import X.C73969T1h;
import X.C76542zS;
import X.C76800UCe;
import X.C77125UOr;
import X.C78609UtB;
import X.C78840Uwu;
import X.C78857UxB;
import X.C78928UyK;
import X.C78946Uyc;
import X.C78977Uz7;
import X.C79045V0n;
import X.C87030YDq;
import X.C88913eJ;
import X.C8VC;
import X.C9KF;
import X.C9L8;
import X.EnumC111394Yt;
import X.FMX;
import X.HSS;
import X.InterfaceC226988vW;
import X.InterfaceC243269gg;
import X.InterfaceC248679pP;
import X.InterfaceC35811ar;
import X.InterfaceC57910Mo6;
import X.InterfaceC64592gB;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.O6N;
import X.ORZ;
import X.OSZ;
import X.Q8U;
import X.S4U;
import X.T16;
import X.UC0;
import X.UOK;
import X.UOL;
import X.ViewOnClickListenerC226978vV;
import X.ViewOnClickListenerC252769w0;
import X.X1D;
import Y.ACListenerS39S0200000_4;
import Y.ARunnableS23S0200000_4;
import Y.IDxS305S0100000_4;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAProfilePageService;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.widget.Widget;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commerce.BizAccountInfo;
import com.ss.android.ugc.aweme.commerce.BizAddress;
import com.ss.android.ugc.aweme.commerce.BizContactInfo;
import com.ss.android.ugc.aweme.commerce.CouponInfo;
import com.ss.android.ugc.aweme.commercialize.ba.impl.service.BAProfilePageServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.ui.fragment.AddOrModifyKeywordFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.SearchInputItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticTextDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.OrderSKUDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.PaymentMethodViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OrderShopDigest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.QuitReasonData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.SkuInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BottomTip;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PrivacyPolicy;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SizeGuide;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.userright.UserRightFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.fragment.DistrictFragment;
import com.ss.android.ugc.aweme.ecommerce.core.services.ECLayerService;
import com.ss.android.ugc.aweme.ecommerce.global.pdp.module.sku.GlobalSkuVH;
import com.ss.android.ugc.aweme.ecommerce.service.IECLayerService;
import com.ss.android.ugc.aweme.ecommerce.tts.addressedit.us.USAddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.ss.android.ugc.aweme.ecommerce.us.osp.payment.viewholder.cashier.USCashierPaymentMethodVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.trendingtopic.VideoTrendingTopic;
import com.ss.android.ugc.aweme.feed.ui.BaseFeedListFragment;
import com.ss.android.ugc.aweme.feed.ui.FeedFragment;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionStatus;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.offlinemode.ui.sheet.OfflineModeSheetPageFragment;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailHeaderAssem;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionListAssem;
import com.ss.android.ugc.aweme.paidcontent.experiment.PaidContentFeedbackIntegrationURLSetting;
import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesNavBarAssem;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.ui.ProfileEditPronounsSearchAndDisplayAssem;
import com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsSearchAndDisplayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileEditFragment;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem;
import com.ss.android.ugc.aweme.prop.fragment.featureeffectvideo.ui.FeatureVideoAwemeListNavBarAssem;
import com.ss.android.ugc.aweme.prop.fragment.featurevideo.viewmodel.FeatureVideoAwemeListNavBarViewModel;
import com.ss.android.ugc.aweme.services.story.EnterStoryParam;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.story.feed.guidecard.component.StoryGuideVideoComponent;
import com.ss.android.ugc.aweme.topic.trendingtopic.VideoTrendingTopicListViewModel;
import com.ss.android.ugc.aweme.topic.trendingtopic.ui.VideoTrendingTopicHeaderAssem;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.feed.platform.panel.pagestate.PageStateCommonComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.HeaderCTASocialEntranceComponent;
import com.ss.android.ugc.profile.platform.business.header.business.info.business.userinfo.business.user.AccountModifyUserNameComponent;
import com.zhiliaoapp.musically.R;
import defpackage.k1;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class AqS151S0200000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            case 10:
                return invoke$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$0();
            case 12:
                return invoke$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            case 15:
                return invoke$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this);
            case 17:
                return invoke$1();
            case 18:
                return invoke$18(this);
            case 19:
                return invoke$19(this);
            case 20:
                return invoke$20(this);
            case 21:
                return invoke$21(this);
            case 22:
                return invoke$22(this);
            case 23:
                return invoke$23(this);
            case 24:
                return invoke$24(this);
            case 25:
                return invoke$25(this);
            case 26:
                return invoke$26(this);
            case 27:
                return invoke$27(this);
            case 28:
                return invoke$28(this);
            case 29:
                return invoke$29(this);
            case 30:
                return invoke$30(this);
            case 31:
                return invoke$31(this);
            case 32:
                return invoke$32(this);
            case 33:
                return invoke$33(this);
            case 34:
                return invoke$34(this);
            case 35:
                return invoke$35(this);
            case 36:
                return invoke$36(this);
            case 37:
                return invoke$37(this);
            case 38:
                return invoke$38(this);
            case 39:
                return invoke$39(this);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this);
            case 41:
                return invoke$3();
            case 42:
                return invoke$4();
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this);
            case 44:
                return invoke$44(this);
            case 45:
                return invoke$45(this);
            case 46:
                return invoke$46(this);
            case 47:
                return invoke$5();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this);
            case C61447O9r.LJIIJ:
                return invoke$49(this);
            case 50:
                return invoke$50(this);
            case 51:
                return invoke$51(this);
            case 52:
                return invoke$52(this);
            case 53:
                return invoke$53(this);
            case 54:
                return invoke$54(this);
            case 55:
                return invoke$55(this);
            case 56:
                return invoke$56(this);
            case 57:
                return invoke$57(this);
            case 58:
                return invoke$58(this);
            case 59:
                return invoke$59(this);
            case 60:
                return invoke$60(this);
            case 61:
                return invoke$61(this);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this);
            case 63:
                return invoke$63(this);
            case 64:
                return invoke$64(this);
            case 65:
                return invoke$6();
            default:
                return null;
        }
    }

    public final View invoke$0() {
        if (((SizeGuide) this.l0) == null) {
            return null;
        }
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a7d, C16880lQ.LLZIL(((GlobalSkuVH) this.l1).itemView.getContext()), null);
        View findViewById = LLLZIIL.findViewById(R.id.k1o);
        o.LJIIIIZZ(findViewById, "sizeGuideView.size_guide_container");
        findViewById.setVisibility(0);
        ((TextView) LLLZIIL.findViewById(R.id.k1r)).setText(((SizeGuide) this.l0).skuSizeGuideTitle);
        return LLLZIIL;
    }

    public final void invoke$2() {
        String str;
        String str2;
        List<String> urlList;
        Aweme aweme;
        PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem = (PaidContentCollectionDetailHeaderAssem) this.l0;
        CollectionDetailModel collectionDetailModel = paidContentCollectionDetailHeaderAssem.LJLJJI;
        if (collectionDetailModel != null) {
            ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.l1;
            Intent intent = paidContentCollectionDetailHeaderAssem.v3().LJLJJI;
            String str3 = null;
            if (intent != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
            } else {
                str = null;
            }
            C25589A2n.LJIIJJI("click_share_collection", str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, 66584572);
            if (activityC45651qj != null) {
                ShareService shareService = C4LD.LIZ;
                long collectionId = collectionDetailModel.getCollectionId();
                String collectionName = collectionDetailModel.getCollectionName();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('@');
                User collectionCreator = collectionDetailModel.getCollectionCreator();
                if (collectionCreator == null || (str2 = collectionCreator.getNickname()) == null) {
                    str2 = "";
                }
                LIZ.append(str2);
                String LIZIZ = X1D.LIZIZ(LIZ);
                User collectionCreator2 = collectionDetailModel.getCollectionCreator();
                String LIZIZ2 = Q8U.LIZIZ(new Object[]{Long.valueOf(collectionDetailModel.getCollectionId()), "chat"}, 2, "aweme://paidcontent/collections/detail?collection_id=%s&from_share=true&enter_from=%s", "format(this, *args)");
                List<PaidVideoItem> paidVideoList = collectionDetailModel.getPaidVideoList();
                ArrayList arrayList = new ArrayList();
                for (PaidVideoItem paidVideoItem : paidVideoList) {
                    if (paidVideoItem != null && (aweme = paidVideoItem.getAweme()) != null) {
                        arrayList.add(aweme);
                    }
                }
                String str4 = paidContentCollectionDetailHeaderAssem.v3().LJLILLLLZI;
                UrlModel collectionCover = collectionDetailModel.getCollectionCover();
                if (collectionCover != null && (urlList = collectionCover.getUrlList()) != null) {
                    str3 = (String) ORZ.LJLLLL(urlList);
                }
                shareService.LJIILIIL(activityC45651qj, new A97(collectionId, collectionName, LIZIZ, collectionCreator2, LIZIZ2, arrayList, str4, str3, collectionDetailModel.getHasPurchasedCollection()));
            }
        }
    }

    public final View invoke$3() {
        LayoutInflater LLZIL = C16880lQ.LLZIL((Context) this.l0);
        ((UOK) this.l1).getClass();
        return C16880lQ.LLLZIIL(R.layout.dcm, LLZIL, null);
    }

    public final View invoke$4() {
        LayoutInflater LLZIL = C16880lQ.LLZIL((Context) this.l0);
        ((UOL) this.l1).getClass();
        return C16880lQ.LLLZIIL(R.layout.dcn, LLZIL, null);
    }

    public final View invoke$5() {
        return C16880lQ.LLLLIILL(C16880lQ.LLZIL((Context) this.l0), R.layout.cfc, (C51633KOf) this.l1, true);
    }

    public final String invoke$1() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((Widget) this.l0).getClass().getName());
        LIZ.append('_');
        return C57396Mfo.LIZIZ((InterfaceC65350Pko) this.l1, LIZ, LIZ);
    }

    public final String invoke$6() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((AbstractC32579CqV) this.l0).getClass().getName());
        LIZ.append('_');
        return C57396Mfo.LIZIZ((InterfaceC65350Pko) this.l1, LIZ, LIZ);
    }

    public static final Object invoke$0(AqS151S0200000_4 aqS151S0200000_4) {
        String str;
        IECLayerService eCLayerService;
        Uri uri;
        View view;
        DynamicSchema dynamicSchema;
        String popupSchema;
        DynamicSchema dynamicSchema2;
        if (((OrderSubmitActivity) aqS151S0200000_4.l0).LLII().LLFII != null) {
            ((OrderSubmitActivity) aqS151S0200000_4.l0).LLII().getClass();
            OrderSubmitViewModel.Ow0();
            OrderSubmitActivity orderSubmitActivity = (OrderSubmitActivity) aqS151S0200000_4.l0;
            AddressEditFragment addressEditFragment = (AddressEditFragment) aqS151S0200000_4.l1;
            QuitReasonData quitReasonData = orderSubmitActivity.LLII().LLFII;
            if (quitReasonData != null && (dynamicSchema2 = quitReasonData.schemaInfo) != null) {
                str = dynamicSchema2.getPopupSchema();
            } else {
                str = null;
            }
            if (str == null) {
                OrderSubmitActivity orderSubmitActivity2 = (OrderSubmitActivity) aqS151S0200000_4.l0;
                QuitReasonData quitReasonData2 = orderSubmitActivity2.LLII().LLFII;
                AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4((AddressEditFragment) aqS151S0200000_4.l1, 2);
                AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4((OrderSubmitActivity) aqS151S0200000_4.l0, 1);
                HashMap<String, Object> fw0 = ((OrderSubmitActivity) aqS151S0200000_4.l0).LLII().fw0(true);
                fw0.put("previous_page", "shipping_address");
                new S4U(orderSubmitActivity2, quitReasonData2, aqS154S0100000_4, aqS170S0100000_4, fw0).LIZ();
            } else {
                Object LIZ = C58096Mr6.LIZ(IECLayerService.class, false);
                if (LIZ != null) {
                    eCLayerService = (IECLayerService) LIZ;
                } else {
                    eCLayerService = new ECLayerService();
                }
                Uri.Builder builder = new Uri.Builder();
                addressEditFragment.getContext();
                QuitReasonData quitReasonData3 = orderSubmitActivity.LLII().LLFII;
                if (quitReasonData3 != null && (dynamicSchema = quitReasonData3.schemaInfo) != null && (popupSchema = dynamicSchema.getPopupSchema()) != null) {
                    uri = C17N.LJJJJIZL(popupSchema);
                } else {
                    uri = null;
                }
                Uri parse = UriProtector.parse(C29706BlG.LIZ(uri));
                Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
                Iterator LIZ2 = C47117IeP.LIZ(parse, "uri.queryParameterNames");
                while (LIZ2.hasNext()) {
                    String str2 = (String) LIZ2.next();
                    encodedPath.appendQueryParameter(str2, UriProtector.getQueryParameter(parse, str2));
                }
                ArrayList arrayList = new ArrayList();
                List<OrderShopDigest> list = orderSubmitActivity.LLII().LJLJLLL;
                if (list != null) {
                    Iterator<OrderShopDigest> it = list.iterator();
                    while (it.hasNext()) {
                        List<OrderSKUDTO> orderSKUs = it.next().getOrderSKUs();
                        if (orderSKUs != null) {
                            for (OrderSKUDTO orderSKUDTO : orderSKUs) {
                                arrayList.add(new SkuInfo(orderSKUDTO.productId, orderSKUDTO.skuId));
                            }
                        }
                    }
                }
                encodedPath.appendQueryParameter("track_params", C27739Aud.LJI(C51029K0z.LJJIIZI(new OSZ("extra_info", new ExtraInfo(arrayList)))));
                String uri2 = builder.build().toString();
                o.LJIIIIZZ(uri2, "Builder().apply {\n      …     }.build().toString()");
                O6N o6n = O6N.BUSINESS;
                View view2 = addressEditFragment.getView();
                if (view2 != null) {
                    view = view2.findViewById(R.id.ckn);
                } else {
                    view = null;
                }
                eCLayerService.LIZ(o6n, view, uri2);
            }
        } else {
            ActivityC45651qj mo49getActivity = ((AddressEditFragment) aqS151S0200000_4.l1).mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        }
        ((OrderSubmitActivity) aqS151S0200000_4.l0).LLII().LLFII = null;
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AqS151S0200000_4 r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS151S0200000_4.invoke$1(kotlin.jvm.internal.AqS151S0200000_4):java.lang.Object");
    }

    public static final Object invoke$10(AqS151S0200000_4 aqS151S0200000_4) {
        UserRightFragment userRightFragment = (UserRightFragment) aqS151S0200000_4.l0;
        String str = ((PrivacyPolicy) aqS151S0200000_4.l1).nameEn;
        if (str == null) {
            str = "terms_of_use_and_sale";
        }
        userRightFragment.logButtonClick(str);
        String str2 = ((PrivacyPolicy) aqS151S0200000_4.l1).link;
        if (str2 != null) {
            SmartRouter.buildRoute(((UserRightFragment) aqS151S0200000_4.l0)._$_findCachedViewById(R.id.n0g).getContext(), UriProtector.parse(str2).toString()).open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$12(AqS151S0200000_4 aqS151S0200000_4) {
        USAddressEditViewModel uSAddressEditViewModel = (USAddressEditViewModel) aqS151S0200000_4.l0;
        List<Region> list = uSAddressEditViewModel.LJLL;
        if (list != null) {
            uSAddressEditViewModel.Fw0(list, (C27021Aj3) aqS151S0200000_4.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$13(AqS151S0200000_4 aqS151S0200000_4) {
        int i;
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String str = (String) ((OfflineModeSheetPageFragment) aqS151S0200000_4.l0).LJLJI.getValue();
        if (str == null) {
            str = "";
        }
        c9kf.LIZJ = str;
        c235119Kp.LIZJ = c9kf;
        c235119Kp.LIZIZ(((C5H3) aqS151S0200000_4.l1).getValue());
        c235119Kp.LIZLLL = false;
        Context context = ((OfflineModeSheetPageFragment) aqS151S0200000_4.l0).getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        c235119Kp.LIZJ(i);
        return c235119Kp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AqS151S0200000_4 aqS151S0200000_4) {
        int i;
        Integer LJI;
        C235119Kp c235119Kp = new C235119Kp();
        String str = (String) ((OfflineModeSheetPageFragment) aqS151S0200000_4.l0).LJLJI.getValue();
        if (str == null) {
            str = "";
        }
        C78840Uwu.LJJIZ(c235119Kp, str, new AqS154S0100000_4((OfflineModeSheetPageFragment) aqS151S0200000_4.l0, 524));
        c235119Kp.LIZIZ(((C5H3) aqS151S0200000_4.l1).getValue());
        c235119Kp.LIZLLL = false;
        Context context = ((OfflineModeSheetPageFragment) aqS151S0200000_4.l0).getContext();
        if (context != null && (LJI = C79045V0n.LJI(R.attr.c9, context)) != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        c235119Kp.LIZJ(i);
        return c235119Kp;
    }

    public static final Object invoke$15(AqS151S0200000_4 aqS151S0200000_4) {
        ProfileEditPronounsSearchAndDisplayViewModel W3 = ((ProfileEditPronounsSearchAndDisplayAssem) aqS151S0200000_4.l0).W3();
        Context context = (Context) aqS151S0200000_4.l1;
        W3.getClass();
        o.LJIIIZ(context, "context");
        try {
            String normalEntry = C2YJ.LIZIZ.LIZ.getFeedbackConf().getNormalEntry();
            normalEntry.toString();
            int LJJLIIIJL = s.LJJLIIIJL(normalEntry, "hide_nav_bar", 0, false, 6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String substring = normalEntry.substring(0, LJJLIIIJL);
            o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) substring).append((CharSequence) URLEncoder.encode("id=6420&"));
            String substring2 = normalEntry.substring(LJJLIIIJL);
            o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
            String spannableStringBuilder2 = append.append((CharSequence) substring2).toString();
            o.LJIIIIZZ(spannableStringBuilder2, "SpannableStringBuilder()…string(index)).toString()");
            SmartRouter.buildRoute(context, new C38281F0r(spannableStringBuilder2).LJ()).open();
        } catch (C158056If unused) {
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS151S0200000_4 aqS151S0200000_4) {
        ((ProfileEditFragment) aqS151S0200000_4.l0).xm();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS151S0200000_4 aqS151S0200000_4) {
        Activity LJIJJ;
        String str;
        C243369gq c243369gq;
        Aweme aweme;
        String aid;
        Aweme aweme2;
        C243369gq x3 = ((FeatureVideoAwemeListNavBarAssem) aqS151S0200000_4.l0).x3();
        if (x3 != null) {
            FeatureVideoAwemeListNavBarAssem featureVideoAwemeListNavBarAssem = (FeatureVideoAwemeListNavBarAssem) aqS151S0200000_4.l0;
            C252709vu c252709vu = (C252709vu) aqS151S0200000_4.l1;
            x3.LJLILLLLZI = ((InterfaceC243269gg) C8VC.LIZ(featureVideoAwemeListNavBarAssem, C65352Pkq.LIZ(InterfaceC243269gg.class), null)).i4();
            C243369gq c243369gq2 = (C243369gq) featureVideoAwemeListNavBarAssem.C3().LJLILLLLZI.getValue();
            if (c243369gq2 != null && c243369gq2.LJLILLLLZI != null) {
                C243369gq c243369gq3 = (C243369gq) featureVideoAwemeListNavBarAssem.C3().LJLILLLLZI.getValue();
                if (c243369gq3 != null && (aweme2 = c243369gq3.LJLILLLLZI) != null) {
                    String str2 = x3.LJLIL;
                    String str3 = x3.LJLJI;
                    String aid2 = aweme2.getAid();
                    o.LJIIIIZZ(aid2, "currentFeatureVideo.aid");
                    C188727au LIZ = C78928UyK.LIZ(str2, "itemId", str3, "authorId");
                    LIZ.LJIIIZ("enter_from", "prop_page");
                    LIZ.LJIIIZ("prop_id", str2);
                    LIZ.LJIIIZ("prop_author_id", str3);
                    LIZ.LJIIIZ("enter_method", C243439gx.LIZ);
                    LIZ.LIZLLL(1, "is_prop_author_video");
                    LIZ.LIZLLL(1, "order");
                    LIZ.LJIIIZ("group_id", aid2);
                    FMX.LJIIL("save_featured_video", LIZ.LIZ);
                }
                FeatureVideoAwemeListNavBarViewModel C3 = featureVideoAwemeListNavBarAssem.C3();
                C3.setState(C243409gu.LJLIL);
                C243369gq c243369gq4 = (C243369gq) C3.LJLILLLLZI.getValue();
                if (c243369gq4 != null && (str = c243369gq4.LJLIL) != null && (c243369gq = (C243369gq) C3.LJLILLLLZI.getValue()) != null && (aweme = c243369gq.LJLILLLLZI) != null && (aid = aweme.getAid()) != null) {
                    C25908AEu.LIZ.saveFeatureVideo(str, aid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS305S0100000_4(C3, 22));
                }
            } else {
                Context context = c252709vu.getContext();
                if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
                    C31811Ce7.LIZIZ(LJIJJ, "No video selected");
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS151S0200000_4 aqS151S0200000_4) {
        ((StoryGuideVideoComponent) aqS151S0200000_4.l0).LLFII.postDelayed((Runnable) aqS151S0200000_4.l1, 5000L);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS151S0200000_4 aqS151S0200000_4) {
        TuxIconView tuxIconView = new TuxIconView((Context) aqS151S0200000_4.l0, null, 0, 6, null);
        C71759SEh c71759SEh = (C71759SEh) aqS151S0200000_4.l1;
        tuxIconView.setIconRes(R.raw.icon_info_circle);
        tuxIconView.setTintColorRes(R.attr.gv);
        tuxIconView.setIconHeight(c71759SEh.LJLJI);
        tuxIconView.setIconWidth(c71759SEh.LJLJI);
        int i = c71759SEh.LJLJI;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        tuxIconView.setLayoutParams(layoutParams);
        C26338AVi.LJI(tuxIconView, Integer.valueOf(c71759SEh.LJLJJI), null, null, null, false, 30);
        return tuxIconView;
    }

    public static final Object invoke$20(AqS151S0200000_4 aqS151S0200000_4) {
        Intent intent;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS151S0200000_4.l0;
        VideoTrendingTopicListViewModel E3 = ((VideoTrendingTopicHeaderAssem) aqS151S0200000_4.l1).E3();
        if (E3.LJLJLJ != null) {
            intent = new Intent();
            VideoTrendingTopic videoTrendingTopic = E3.LJLJLJ;
            if (videoTrendingTopic != null) {
                intent.putExtra("video_trending_topic", videoTrendingTopic);
            }
        } else {
            intent = null;
        }
        activityC45651qj.setResult(-1, intent);
        ((ActivityC45651qj) aqS151S0200000_4.l0).finish();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS151S0200000_4 aqS151S0200000_4) {
        FeedFragment feedFragment;
        Fragment fragment = (Fragment) aqS151S0200000_4.l0;
        if (fragment != null && (fragment instanceof BaseFeedListFragment) && (feedFragment = (FeedFragment) fragment) != null) {
            PageStateCommonComponent pageStateCommonComponent = (PageStateCommonComponent) aqS151S0200000_4.l1;
            pageStateCommonComponent.getClass();
            if (C2NU.LIZ.LIZJ == EnumC111394Yt.NOT_AVAILABLE) {
                pageStateCommonComponent.Ic0(null);
            } else {
                feedFragment.ub(false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS151S0200000_4 aqS151S0200000_4) {
        int i;
        String str;
        boolean z = !((Boolean) ((InterfaceC35811ar) aqS151S0200000_4.l1).getValue()).booleanValue();
        if (C62889OmD.LIZJ(z)) {
            ((InterfaceC35811ar) aqS151S0200000_4.l1).setValue(Boolean.valueOf(z));
            if (z) {
                i = R.string.iu2;
            } else {
                i = R.string.iu6;
            }
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ((Context) aqS151S0200000_4.l0);
            if (LJJLIIIJ != null) {
                AnonymousClass114.LIZ(LJJLIIIJ, i);
            }
            C188727au c188727au = new C188727au();
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            c188727au.LJIIIZ("value", str);
            FMX.LJIIL("select_personalization_preference", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$23(AqS151S0200000_4 aqS151S0200000_4) {
        aqS151S0200000_4.invoke$2();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS151S0200000_4 aqS151S0200000_4) {
        String str;
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) aqS151S0200000_4.l0;
        PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel feedbackIntegrationInfoStructJsonModel = (PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel) aqS151S0200000_4.l1;
        if (feedbackIntegrationInfoStructJsonModel != null) {
            str = feedbackIntegrationInfoStructJsonModel.feedbackUrl;
        } else {
            str = null;
        }
        SmartRouter.buildRoute(activityC45651qj, str).open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS151S0200000_4 aqS151S0200000_4) {
        SmartRouter.buildRoute(C212428Vi.LIZLLL((PaidContentCollectionListAssem) aqS151S0200000_4.l0), ((PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel) aqS151S0200000_4.l1).feedbackUrl).open();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS151S0200000_4 aqS151S0200000_4) {
        int i;
        String str;
        boolean z = !((Boolean) ((InterfaceC35811ar) aqS151S0200000_4.l1).getValue()).booleanValue();
        if (C62889OmD.LIZLLL(z)) {
            ((InterfaceC35811ar) aqS151S0200000_4.l1).setValue(Boolean.valueOf(z));
            if (z) {
                i = R.string.jgx;
            } else {
                i = R.string.jgy;
            }
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ((Context) aqS151S0200000_4.l0);
            if (LJJLIIIJ != null) {
                AnonymousClass114.LIZ(LJJLIIIJ, i);
            }
            C188727au c188727au = new C188727au();
            if (z) {
                str = "off";
            } else {
                str = "on";
            }
            c188727au.LJIIIZ("action", str);
            FMX.LJIIL("select_personalization_search_setting", c188727au.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS151S0200000_4 aqS151S0200000_4) {
        ((InterfaceC88472Yns) aqS151S0200000_4.l0).invoke((Throwable) aqS151S0200000_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS151S0200000_4 aqS151S0200000_4) {
        if (((C26224AQy) aqS151S0200000_4.l0).LJIILJJIL) {
            ASQ.LIZ((TuxIntroFragment) aqS151S0200000_4.l1, ASY.LIZ);
        } else {
            ActivityC45651qj mo49getActivity = ((TuxIntroFragment) aqS151S0200000_4.l1).mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS151S0200000_4 aqS151S0200000_4) {
        ((HSS) aqS151S0200000_4.l0).LJJJJIZL(new AqS170S0100000_4((SmartImageView) aqS151S0200000_4.l1, 947));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS151S0200000_4 aqS151S0200000_4) {
        C233969Ge c233969Ge = new C233969Ge((Context) aqS151S0200000_4.l0);
        B17 b17 = (B17) aqS151S0200000_4.l1;
        c233969Ge.getBalanceTextValue();
        b17.addView(c233969Ge);
        return c233969Ge;
    }

    public static final Object invoke$30(AqS151S0200000_4 aqS151S0200000_4) {
        USMainOrderInfoVH uSMainOrderInfoVH = (USMainOrderInfoVH) aqS151S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) aqS151S0200000_4.l1;
        View itemView = uSMainOrderInfoVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70918RsQ(0), new AqS170S0100000_4(logisticDTO, 966));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS151S0200000_4 aqS151S0200000_4) {
        USMainOrderInfoVH uSMainOrderInfoVH = (USMainOrderInfoVH) aqS151S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) aqS151S0200000_4.l1;
        View itemView = uSMainOrderInfoVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70960Rt6(), new AqS170S0100000_4(logisticDTO, 967));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS151S0200000_4 aqS151S0200000_4) {
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aqS151S0200000_4.l0;
        C242979gD c242979gD = new C242979gD();
        C26231ARf c26231ARf = (C26231ARf) ((C242989gE) aqS151S0200000_4.l1).LIZLLL;
        if (c26231ARf != null) {
            c242979gD.LIZ = c26231ARf;
            interfaceC88472Yns.invoke(c242979gD);
            return C76800UCe.LIZ;
        }
        o.LJIJI("dialog");
        throw null;
    }

    public static final Object invoke$33(AqS151S0200000_4 aqS151S0200000_4) {
        ((BaseMyProfileGuideWidget) aqS151S0200000_4.l0).LJIILL((ViewOnClickListenerC226978vV) aqS151S0200000_4.l1);
        return (ViewOnClickListenerC226978vV) aqS151S0200000_4.l1;
    }

    public static final Object invoke$34(AqS151S0200000_4 aqS151S0200000_4) {
        final MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = (MyProfileGuideWidgetV2) aqS151S0200000_4.l0;
        final ViewOnClickListenerC226978vV LIZLLL = myProfileGuideWidgetV2.LIZLLL();
        o.LJI(LIZLLL);
        final MyProfileGuideState myProfileGuideState = (MyProfileGuideState) aqS151S0200000_4.l1;
        o.LJIIIZ(myProfileGuideState, "myProfileGuideState");
        String string = C77125UOr.LIZJ(myProfileGuideWidgetV2).getString(R.string.p9k);
        o.LJIIIIZZ(string, "activity.getString(R.str…privacy_download_tips_v2)");
        String string2 = C77125UOr.LIZJ(myProfileGuideWidgetV2).getString(R.string.p9l);
        o.LJIIIIZZ(string2, "activity.getString(R.str…download_tips_v2_confirm)");
        LIZLLL.setIconImage(R.drawable.by3);
        LIZLLL.setTitleText(R.string.p9k);
        SpannableString spannableString = new SpannableString(string);
        ClickableSpan clickableSpan = new ClickableSpan() { // from class: X.9Zz
            @Override // android.text.style.ClickableSpan
            public final void onClick(View widget) {
                int i;
                o.LJIIIZ(widget, "widget");
                ViewOnClickListenerC226978vV.this.setVisibility(8);
                C87030YDq c87030YDq = C87030YDq.LIZIZ;
                BaseMyProfileGuideWidget baseMyProfileGuideWidget = myProfileGuideWidgetV2;
                baseMyProfileGuideWidget.getClass();
                ActivityC45651qj LIZJ = C77125UOr.LIZJ(baseMyProfileGuideWidget);
                Integer currentDownloadSetting = myProfileGuideState.getCurrentDownloadSetting();
                if (currentDownloadSetting != null) {
                    i = currentDownloadSetting.intValue();
                } else {
                    i = -1;
                }
                c87030YDq.startDownloadControlSettingActivity(LIZJ, i);
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint ds) {
                o.LJIIIZ(ds, "ds");
                BaseMyProfileGuideWidget baseMyProfileGuideWidget = myProfileGuideWidgetV2;
                baseMyProfileGuideWidget.getClass();
                ds.setColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, C77125UOr.LIZJ(baseMyProfileGuideWidget)));
                ds.setUnderlineText(false);
                T5S t5s = new T5S();
                t5s.LIZ(82);
                ds.setTypeface(t5s.getTypeface());
            }
        };
        int LJJLIIIJL = s.LJJLIIIJL(string, string2, 0, false, 6);
        if (LJJLIIIJL < 0) {
            LJJLIIIJL = string.length();
        }
        spannableString.setSpan(clickableSpan, LJJLIIIJL, string.length(), 17);
        LIZLLL.setTitleText(spannableString);
        TextView textView = (TextView) LIZLLL.findViewById(R.id.mo6);
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        View findViewById = LIZLLL.findViewById(R.id.l_j);
        if (findViewById != null) {
            findViewById.setClickable(false);
        }
        LIZLLL.setOnInternalClickListener(new InterfaceC226988vW() { // from class: X.9Na
            @Override // X.InterfaceC226988vW
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC226988vW
            public final void LIZ() {
                ViewOnClickListenerC226978vV.this.setVisibility(8);
            }
        });
        C87030YDq.LIZIZ.LIZ.setPrivateSettingItem("download_prompt", 1).LJJII(new InterfaceC64592gB() { // from class: X.9FN
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }, new InterfaceC64592gB() { // from class: X.2O4
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                Exception exc;
                Throwable th = (Throwable) obj;
                if ((th instanceof Exception) && (exc = (Exception) th) != null) {
                    C36922EeM.LIZ(exc);
                }
            }
        });
        ActivityC45651qj LIZJ = C77125UOr.LIZJ(myProfileGuideWidgetV2);
        o.LJII(LIZJ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        final C235769Nc LIZ = C235759Nb.LIZ(LIZJ);
        final AqS151S0200000_4 aqS151S0200000_42 = new AqS151S0200000_4(LIZLLL, myProfileGuideWidgetV2, 33);
        PopupManager.LJIIL(new AbstractC56327M8t<View>(LIZ, aqS151S0200000_42) { // from class: X.97F
            public final InterfaceC65784Pro<View> LJLIL;

            @Override // X.InterfaceC56321M8n
            public final int getPriority() {
                return 200;
            }

            @Override // com.bytedance.poplayer.IPopupTask
            public final Object showPopup(C54082LKk context) {
                o.LJIIIZ(context, "context");
                return this.LJLIL.invoke();
            }

            {
                this.LJLIL = aqS151S0200000_42;
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$35(AqS151S0200000_4 aqS151S0200000_4) {
        ((BaseMyProfileGuideWidget) aqS151S0200000_4.l0).LJIILL((ViewOnClickListenerC226978vV) aqS151S0200000_4.l1);
        FMX.LJIIL("privacy_floating_bar_show", new C188727au().LIZ);
        ((BaseMyProfileGuideWidget) aqS151S0200000_4.l0).getClass();
        BaseMyProfileGuideWidget.LJIIL(true);
        return (ViewOnClickListenerC226978vV) aqS151S0200000_4.l1;
    }

    public static final Object invoke$36(AqS151S0200000_4 aqS151S0200000_4) {
        ((BaseMyProfileGuideWidget) aqS151S0200000_4.l0).LJIILL((ViewOnClickListenerC252769w0) aqS151S0200000_4.l1);
        return (ViewOnClickListenerC252769w0) aqS151S0200000_4.l1;
    }

    public static final Object invoke$37(AqS151S0200000_4 aqS151S0200000_4) {
        FragmentManager supportFragmentManager;
        ((AddOrModifyKeywordFragment) aqS151S0200000_4.l0).xl().dismiss();
        ActivityC45651qj mo49getActivity = ((AddOrModifyKeywordFragment) aqS151S0200000_4.l0).mo49getActivity();
        if (mo49getActivity != null && (supportFragmentManager = mo49getActivity.getSupportFragmentManager()) != null) {
            supportFragmentManager.LJJLIIIJJI();
        }
        ActivityC45651qj mo49getActivity2 = ((AddOrModifyKeywordFragment) aqS151S0200000_4.l0).mo49getActivity();
        o.LJI(mo49getActivity2);
        C26045AKb c26045AKb = new C26045AKb(mo49getActivity2);
        c26045AKb.LJIIIZ(((AddOrModifyKeywordFragment) aqS151S0200000_4.l0).getString(R.string.hmx, ((Keyword) aqS151S0200000_4.l1).text));
        c26045AKb.LJIIJ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS151S0200000_4 aqS151S0200000_4) {
        if ((((Fragment) aqS151S0200000_4.l0) instanceof PaymentFragment) && o.LJ("ordersubmit", ((USCashierPaymentMethodVH) aqS151S0200000_4.l1).getViewModel().LJZI)) {
            ((PaymentFragment) ((Fragment) aqS151S0200000_4.l0)).getOnCloseClick().invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS151S0200000_4 aqS151S0200000_4) {
        if ((((Fragment) aqS151S0200000_4.l0) instanceof PaymentFragment) && o.LJ("ordersubmit", ((USCashierPaymentMethodVH) aqS151S0200000_4.l1).getViewModel().LJZI)) {
            ((PaymentFragment) ((Fragment) aqS151S0200000_4.l0)).getOnCloseClick().invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS151S0200000_4 aqS151S0200000_4) {
        OSZ<String, String> fullPhoneNumber = ((C27486AqY) ((C252989wM) aqS151S0200000_4.l0).LIZIZ(R.id.hni)).getFullPhoneNumber();
        ((C27021Aj3) aqS151S0200000_4.l1).LIZIZ = fullPhoneNumber;
        String second = fullPhoneNumber.getSecond();
        C252989wM c252989wM = (C252989wM) aqS151S0200000_4.l0;
        C27021Aj3 c27021Aj3 = (C27021Aj3) aqS151S0200000_4.l1;
        if (second != null && !ujb.o.LJJJJJL(second)) {
            c252989wM.LIZJ();
            c27021Aj3.LIZJ = null;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS151S0200000_4 aqS151S0200000_4) {
        User curUser = ((HeaderCTASocialEntranceComponent) aqS151S0200000_4.l0).getCurUser();
        HeaderCTASocialEntranceComponent headerCTASocialEntranceComponent = (HeaderCTASocialEntranceComponent) aqS151S0200000_4.l0;
        Map<Integer, C243819hZ> map = headerCTASocialEntranceComponent.LJLIL;
        C243799hX.LJI(headerCTASocialEntranceComponent.getContext(), curUser, (C243839hb) aqS151S0200000_4.l1, map);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS151S0200000_4 aqS151S0200000_4) {
        C119774mz c119774mz = (C119774mz) aqS151S0200000_4.l0;
        C78977Uz7.LJJIIJZLJL(c119774mz, (List) aqS151S0200000_4.l1, new AqS170S0100000_4(c119774mz, 1136), C26703Adv.INSTANCE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS151S0200000_4 aqS151S0200000_4) {
        FragmentManager supportFragmentManager;
        String str = ((C25524A0a) ((ManageSeriesNavBarAssem) aqS151S0200000_4.l0).LJLILLLLZI.getValue()).LJLILLLLZI;
        String str2 = ((C25532A0i) ((AssemViewModel) ((ManageSeriesNavBarAssem) aqS151S0200000_4.l0).LJLIL.getValue()).getState()).LJLIL;
        String str3 = ((C25524A0a) ((ManageSeriesNavBarAssem) aqS151S0200000_4.l0).LJLILLLLZI.getValue()).LJLJI;
        C188727au c188727au = new C188727au();
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c188727au.LJIIIZ("collection_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        c188727au.LJIIIZ("entry_point", str3);
        FMX.LJIIL("click_series_video_upload_more", c188727au.LIZ);
        ManageSeriesNavBarAssem manageSeriesNavBarAssem = (ManageSeriesNavBarAssem) aqS151S0200000_4.l0;
        Context context = ((View) aqS151S0200000_4.l1).getContext();
        o.LJIIIIZZ(context, "view.context");
        manageSeriesNavBarAssem.getClass();
        ManagementPagePaidCollectionStatus managementPagePaidCollectionStatus = null;
        View view = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aig, null, false);
        ASL asl = new ASL();
        o.LJIIIIZZ(view, "view");
        asl.LIZ.LJLLI = view;
        asl.LJI(1);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLJ = true;
        ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo = ((C25532A0i) ((AssemViewModel) manageSeriesNavBarAssem.LJLIL.getValue()).getState()).LJLJL;
        if (managementPagePaidCollectionInfo != null) {
            managementPagePaidCollectionStatus = managementPagePaidCollectionInfo.status;
        }
        if (managementPagePaidCollectionStatus == ManagementPagePaidCollectionStatus.DRAFT) {
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.cpm);
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS39S0200000_4(manageSeriesNavBarAssem, tuxSheet, 90));
            linearLayout.setVisibility(0);
        }
        ActivityC45651qj LIZ = C212428Vi.LIZ(manageSeriesNavBarAssem);
        if (LIZ != null && (supportFragmentManager = LIZ.getSupportFragmentManager()) != null) {
            tuxSheet.show(supportFragmentManager, "edit_series_details");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$45(AqS151S0200000_4 aqS151S0200000_4) {
        ((AbstractC253779xd) aqS151S0200000_4.l0).LIZLLL().W7((InterfaceC57910Mo6) aqS151S0200000_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS151S0200000_4 aqS151S0200000_4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(((InterfaceC65350Pko) aqS151S0200000_4.l0).LJFF());
        LIZ.append('_');
        LIZ.append(((C25765A9h) aqS151S0200000_4.l1).hashCode());
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$48(AqS151S0200000_4 aqS151S0200000_4) {
        int i;
        boolean z;
        String charSequence = ((TuxTextView) aqS151S0200000_4.l0).getText().toString();
        int length = charSequence.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (o.LJIIJJI(charSequence.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else {
                if (!z) {
                    break;
                }
                length--;
            }
        }
        String LIZJ = C132805Jc.LIZJ(length, 1, charSequence, i2);
        if (!TextUtils.isEmpty(LIZJ) && ujb.o.LJJJJ(LIZJ, " T", false)) {
            ((AccountModifyUserNameComponent) aqS151S0200000_4.l1).v3(R.drawable.bxw);
        }
        ((AssemViewModel) ((AccountModifyUserNameComponent) aqS151S0200000_4.l1).LJLJL.getValue()).setState(new AqS9S0010000_4(false, 57));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS151S0200000_4 aqS151S0200000_4) {
        C26227ARb c26227ARb = new C26227ARb((ActivityC45651qj) aqS151S0200000_4.l0);
        c26227ARb.LJ(R.string.r9d);
        c26227ARb.LIZ(R.string.r9b);
        UC0.LIZJ(c26227ARb, new AqS170S0100000_4((AddressEditViewModel) aqS151S0200000_4.l1, 1335));
        c26227ARb.LJII = true;
        c26227ARb.LJI().LIZLLL();
        C27241Amb.LIZIZ(((AddressEditViewModel) aqS151S0200000_4.l1).Wv0(), "delete_address", null, null, null, 254);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AqS151S0200000_4 aqS151S0200000_4) {
        AddressEditViewModel viewModel = ((SearchInputItemViewHolder) aqS151S0200000_4.l0).getViewModel();
        CandInputData candInputData = (CandInputData) ((C27356AoS) aqS151S0200000_4.l1).LIZ;
        Address address = candInputData.address;
        SearchInputItemViewHolder searchInputItemViewHolder = (SearchInputItemViewHolder) aqS151S0200000_4.l0;
        viewModel.jw0(address, searchInputItemViewHolder.LJLJJI, candInputData.autocompleteAddressId, candInputData.placeType, new AqS170S0100000_4(searchInputItemViewHolder, 207));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$50(AqS151S0200000_4 aqS151S0200000_4) {
        C78946Uyc.LJJIIJ((k1) aqS151S0200000_4.l0, new C70917RsP(), new AqS170S0100000_4((HashMap) aqS151S0200000_4.l1, (HashMap<String, Object>) 1348));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(AqS151S0200000_4 aqS151S0200000_4) {
        String str;
        B1R b1r = (B1R) aqS151S0200000_4.l0;
        PaymentMethod paymentMethod = b1r.LJLLL;
        if (paymentMethod != null) {
            paymentMethod.LJFF = true;
        }
        b1r.LJIIL(true);
        PaymentMethod paymentMethod2 = (PaymentMethod) aqS151S0200000_4.l1;
        o.LJIIIIZZ(paymentMethod2, "paymentMethod");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(C27949Ay1.LIZIZ);
        BindInfo bindInfo = paymentMethod2.bindInfo;
        if (bindInfo != null && (str = bindInfo.bindStatus) != null && str.length() != 0) {
            linkedHashMap.put("pay_bind_status", str);
        }
        linkedHashMap.put("is_option_discounted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod2.extraInfo) ? 1 : 0));
        linkedHashMap.put("is_payment_promoted", Integer.valueOf(C78857UxB.LJJJIL(paymentMethod2.LJIIIIZZ()) ? 1 : 0));
        linkedHashMap.put("payment_option", paymentMethod2.LJIIL());
        linkedHashMap.put("button_name", "view_installment_plan");
        C76542zS.LIZ("tiktokec_button_click", linkedHashMap);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS151S0200000_4 aqS151S0200000_4) {
        boolean onBackPressed = ((DistrictFragment) aqS151S0200000_4.l0).onBackPressed();
        if (!onBackPressed) {
            DeliveryPanelViewModel deliveryPanelViewModel = ((C26936Ahg) aqS151S0200000_4.l1).LJLILLLLZI;
            C26947Ahr c26947Ahr = C26947Ahr.LJLIL;
            deliveryPanelViewModel.getClass();
            o.LJIIIZ(c26947Ahr, "<set-?>");
            deliveryPanelViewModel.LJLJLJ = c26947Ahr;
        }
        return Boolean.valueOf(onBackPressed);
    }

    public static final Object invoke$53(AqS151S0200000_4 aqS151S0200000_4) {
        ViewGroup flow_layout = (ViewGroup) ((C26572Abo) aqS151S0200000_4.l0)._$_findCachedViewById(R.id.dj8);
        o.LJIIIIZZ(flow_layout, "flow_layout");
        C78977Uz7.LJJIIJZLJL(flow_layout, (List) aqS151S0200000_4.l1, new AqS170S0100000_4((C26572Abo) aqS151S0200000_4.l0, 1442), C26573Abp.INSTANCE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$54(AqS151S0200000_4 aqS151S0200000_4) {
        BizAddress bizAddress;
        BizContactInfo bizContactInfo;
        ProfileEnterpriseBAAssem profileEnterpriseBAAssem = (ProfileEnterpriseBAAssem) aqS151S0200000_4.l0;
        C17J.LJJJ(profileEnterpriseBAAssem, profileEnterpriseBAAssem.L7(), "ba_business_address");
        new C237559Tz().LJIIL(((ProfileEnterpriseBAAssem) aqS151S0200000_4.l0).getAweme(), (User) aqS151S0200000_4.l1);
        IBAProfilePageService LJIIJJI = BAProfilePageServiceImpl.LJIIJJI();
        Context context = ((ProfileEnterpriseBAAssem) aqS151S0200000_4.l0).getContext();
        Gson LIZ = GsonHolder.LIZLLL().LIZ();
        BizAccountInfo bizAccountInfo = ((User) aqS151S0200000_4.l1).getBizAccountInfo();
        if (bizAccountInfo != null && (bizContactInfo = bizAccountInfo.getBizContactInfo()) != null) {
            bizAddress = bizContactInfo.getBizAddress();
        } else {
            bizAddress = null;
        }
        String json = GsonProtectorUtils.toJson(LIZ, bizAddress);
        o.LJIIIIZZ(json, "get().gson.toJson(user.b…zContactInfo?.bizAddress)");
        C9L8.LIZ(LJIIJJI, context, 5, json, ((ProfileEnterpriseBAAssem) aqS151S0200000_4.l0).getAweme(), null, 48);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS151S0200000_4 aqS151S0200000_4) {
        CouponInfo couponInfo;
        Context context = ((ProfileEnterpriseBAAssem) aqS151S0200000_4.l0).getContext();
        if (context != null && C45804HyK.LJIJJ(context) != null) {
            User user = (User) aqS151S0200000_4.l1;
            ProfileEnterpriseBAAssem profileEnterpriseBAAssem = (ProfileEnterpriseBAAssem) aqS151S0200000_4.l0;
            List<CouponInfo> couponInfo2 = user.getBizAccountInfo().getCouponInfo();
            if (couponInfo2 != null && (couponInfo = (CouponInfo) ListProtector.get(couponInfo2, 0)) != null) {
                C17J.LJJJ(profileEnterpriseBAAssem, profileEnterpriseBAAssem.L7(), "ba_coupon");
                new C237559Tz().LJIILJJIL(user, profileEnterpriseBAAssem.getAweme(), couponInfo);
                BAProfilePageServiceImpl.LJIIJJI().LJIIIIZZ(profileEnterpriseBAAssem.getContext(), profileEnterpriseBAAssem.getAweme(), user, couponInfo);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$56(AqS151S0200000_4 aqS151S0200000_4) {
        USLogisticVH uSLogisticVH = (USLogisticVH) aqS151S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) aqS151S0200000_4.l1;
        View itemView = uSLogisticVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70918RsQ(0), new AqS170S0100000_4(logisticDTO, 1630));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$57(AqS151S0200000_4 aqS151S0200000_4) {
        USLogisticVH uSLogisticVH = (USLogisticVH) aqS151S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) aqS151S0200000_4.l1;
        View itemView = uSLogisticVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70960Rt6(), new AqS170S0100000_4(logisticDTO, 1631));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$58(AqS151S0200000_4 aqS151S0200000_4) {
        USLogisticVH uSLogisticVH = (USLogisticVH) aqS151S0200000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) aqS151S0200000_4.l1;
        View itemView = uSLogisticVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70917RsP(), new AqS170S0100000_4(logisticDTO, 1629));
        FragmentManager fragmentManager = ((USLogisticVH) aqS151S0200000_4.l0).LJLIL.getFragmentManager();
        if (fragmentManager != null) {
            USLogisticVH uSLogisticVH2 = (USLogisticVH) aqS151S0200000_4.l0;
            LogisticDTO logisticDTO2 = (LogisticDTO) aqS151S0200000_4.l1;
            Context context = uSLogisticVH2.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            C26968AiC.LJFF(C26968AiC.LIZIZ(C26968AiC.LIZLLL(context, logisticDTO2), C88913eJ.LIZ(uSLogisticVH2.itemView, R.string.fan, "itemView.context.getStri…_next_day_delivery_badge)"), 0.73f, new IDqS183S0200000_4(uSLogisticVH2, logisticDTO2, 11)), fragmentManager, null, new AqS151S0200000_4(uSLogisticVH2, logisticDTO2, 57), 4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$59(AqS151S0200000_4 aqS151S0200000_4) {
        JediViewModel jediViewModel = (JediViewModel) ((USLogisticVH) aqS151S0200000_4.l0).LJLILLLLZI.getValue();
        LogisticDTO logisticDTO = (LogisticDTO) aqS151S0200000_4.l1;
        jediViewModel.getClass();
        jediViewModel.setState(new AqS170S0100000_4(logisticDTO, 1643));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS151S0200000_4 aqS151S0200000_4) {
        Float f;
        String str;
        LogisticTextDTO logisticTextDTO;
        Price price;
        Price price2;
        String priceVal;
        ((LogisticSelectFragment) aqS151S0200000_4.l0).getViewModel().LJLJL.invoke();
        LogisticDTO selectedLogistic = ((DeliveryPanelState) aqS151S0200000_4.l1).getSelectedLogistic();
        String str2 = null;
        if (selectedLogistic != null && (price2 = selectedLogistic.shippingFee) != null && (priceVal = price2.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal);
        } else {
            f = null;
        }
        LogisticDTO selectedLogistic2 = ((DeliveryPanelState) aqS151S0200000_4.l1).getSelectedLogistic();
        if (selectedLogistic2 != null && (price = selectedLogistic2.shippingFee) != null) {
            str = price.getCurrency();
        } else {
            str = null;
        }
        LogisticDTO selectedLogistic3 = ((DeliveryPanelState) aqS151S0200000_4.l1).getSelectedLogistic();
        if (selectedLogistic3 != null && (logisticTextDTO = selectedLogistic3.logisticText) != null) {
            str2 = logisticTextDTO.thresholdTextEn;
        }
        C26937Ahh.LIZLLL("close", "close", f, str, str2, null, ((LogisticSelectFragment) aqS151S0200000_4.l0).getSubPageName(), 32);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$60(AqS151S0200000_4 aqS151S0200000_4) {
        InterfaceC248679pP interfaceC248679pP = (InterfaceC248679pP) aqS151S0200000_4.l0;
        com.ss.android.ugc.aweme.model.Price price = (com.ss.android.ugc.aweme.model.Price) aqS151S0200000_4.l1;
        o.LJIIIIZZ(price, "price");
        interfaceC248679pP.LIZ(price);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$61(AqS151S0200000_4 aqS151S0200000_4) {
        ((ReturnPoliciesFragment) aqS151S0200000_4.l0).vl((BottomTip) aqS151S0200000_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$62(AqS151S0200000_4 aqS151S0200000_4) {
        ((ReturnPoliciesFragment) aqS151S0200000_4.l0).vl((BottomTip) aqS151S0200000_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$63(AqS151S0200000_4 aqS151S0200000_4) {
        ((AddressListViewModel) aqS151S0200000_4.l0).Jv0(new Address(C27090AkA.LJLILLLLZI, null, null, null, null));
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS151S0200000_4.l1;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$64(AqS151S0200000_4 aqS151S0200000_4) {
        AVExternalServiceImpl.LIZ().storyService().startStoryActivity((ActivityC45651qj) aqS151S0200000_4.l0, (EnterStoryParam) aqS151S0200000_4.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS151S0200000_4 aqS151S0200000_4) {
        if ((((Fragment) aqS151S0200000_4.l0) instanceof PaymentFragment) && o.LJ("ordersubmit", ((PaymentMethodViewHolder) aqS151S0200000_4.l1).getViewModel().LJZI)) {
            ((PaymentFragment) ((Fragment) aqS151S0200000_4.l0)).getOnCloseClick().invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS151S0200000_4 aqS151S0200000_4) {
        C78946Uyc.LJJII((UserRightFragment) aqS151S0200000_4.l0, new C70887Rrv(), new AqS170S0100000_4((UserRightFragment) aqS151S0200000_4.l0, 311));
        String str = ((ContactDetail) aqS151S0200000_4.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((UserRightFragment) aqS151S0200000_4.l0).getContext(), UriProtector.parse(str).toString()).open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS151S0200000_4 aqS151S0200000_4) {
        C78946Uyc.LJJII((UserRightFragment) aqS151S0200000_4.l0, new C70887Rrv(), new AqS170S0100000_4((UserRightFragment) aqS151S0200000_4.l0, 312));
        String str = ((ContactDetail) aqS151S0200000_4.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((UserRightFragment) aqS151S0200000_4.l0).getContext(), UriProtector.parse(str).toString()).open();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ActivityC45651qj activityC45651qj, C51633KOf c51633KOf, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = c51633KOf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ActivityC45651qj activityC45651qj, AddressEditViewModel addressEditViewModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = addressEditViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ActivityC45651qj activityC45651qj, PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel feedbackIntegrationInfoStructJsonModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = feedbackIntegrationInfoStructJsonModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ActivityC45651qj activityC45651qj, EnterStoryParam enterStoryParam, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = enterStoryParam;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ActivityC45651qj activityC45651qj, VideoTrendingTopicHeaderAssem videoTrendingTopicHeaderAssem, int i) {
        super(0);
        this.$t = i;
        this.l0 = activityC45651qj;
        this.l1 = videoTrendingTopicHeaderAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(C119774mz c119774mz, C119774mz c119774mz2, List<Icon> list) {
        super(0);
        this.$t = list;
        this.l0 = c119774mz;
        this.l1 = c119774mz2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ViewOnClickListenerC226978vV viewOnClickListenerC226978vV, MyProfileGuideWidgetV2 myProfileGuideWidgetV2, int i) {
        super(0);
        this.$t = i;
        this.l0 = myProfileGuideWidgetV2;
        this.l1 = viewOnClickListenerC226978vV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(InterfaceC248679pP interfaceC248679pP, com.ss.android.ugc.aweme.model.Price price, int i) {
        super(0);
        this.$t = i;
        this.l0 = interfaceC248679pP;
        this.l1 = price;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ViewOnClickListenerC252769w0 viewOnClickListenerC252769w0, BaseMyProfileGuideWidget baseMyProfileGuideWidget, int i) {
        super(0);
        this.$t = i;
        this.l0 = baseMyProfileGuideWidget;
        this.l1 = viewOnClickListenerC252769w0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(C252989wM c252989wM, C27021Aj3 c27021Aj3, int i) {
        super(0);
        this.$t = i;
        this.l0 = c252989wM;
        this.l1 = c27021Aj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(AbstractC253779xd abstractC253779xd, InterfaceC57910Mo6 interfaceC57910Mo6, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC253779xd;
        this.l1 = interfaceC57910Mo6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(C26224AQy c26224AQy, TuxIntroFragment tuxIntroFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = c26224AQy;
        this.l1 = tuxIntroFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(C26572Abo c26572Abo, C26572Abo c26572Abo2, List<Icon> list) {
        super(0);
        this.$t = list;
        this.l0 = c26572Abo;
        this.l1 = c26572Abo2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(B1R b1r, PaymentMethod paymentMethod, int i) {
        super(0);
        this.$t = i;
        this.l0 = b1r;
        this.l1 = paymentMethod;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(AbstractC32579CqV abstractC32579CqV, InterfaceC65350Pko interfaceC65350Pko, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC32579CqV;
        this.l1 = interfaceC65350Pko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(HSS hss, SmartImageView smartImageView, int i) {
        super(0);
        this.$t = i;
        this.l0 = hss;
        this.l1 = smartImageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(C65776Prg c65776Prg, C25765A9h c25765A9h, int i) {
        super(0);
        this.$t = i;
        this.l0 = c65776Prg;
        this.l1 = c25765A9h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super C242979gD, C76800UCe> interfaceC88472Yns2, C242989gE c242989gE) {
        super(0);
        this.$t = c242989gE;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns2, Throwable th) {
        super(0);
        this.$t = th;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(Context context, Context context2, InterfaceC35811ar<Boolean> interfaceC35811ar) {
        super(0);
        this.$t = interfaceC35811ar;
        this.l0 = context;
        this.l1 = context2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Context context, B17 b17, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = b17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Context context, C71759SEh c71759SEh, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = c71759SEh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Context context, UOK uok, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = uok;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Context context, UOL uol, int i) {
        super(0);
        this.$t = i;
        this.l0 = context;
        this.l1 = uol;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Fragment fragment, PaymentMethodViewHolder paymentMethodViewHolder, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = paymentMethodViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Fragment fragment, USCashierPaymentMethodVH uSCashierPaymentMethodVH, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = uSCashierPaymentMethodVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Fragment fragment, PageStateCommonComponent pageStateCommonComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = pageStateCommonComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(TuxTextView tuxTextView, AccountModifyUserNameComponent accountModifyUserNameComponent, int i) {
        super(0);
        this.$t = i;
        this.l0 = tuxTextView;
        this.l1 = accountModifyUserNameComponent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(Widget widget, InterfaceC65350Pko interfaceC65350Pko, int i) {
        super(0);
        this.$t = i;
        this.l0 = widget;
        this.l1 = interfaceC65350Pko;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(AddOrModifyKeywordFragment addOrModifyKeywordFragment, Keyword keyword, int i) {
        super(0);
        this.$t = i;
        this.l0 = addOrModifyKeywordFragment;
        this.l1 = keyword;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(SearchInputItemViewHolder searchInputItemViewHolder, SearchInputItemViewHolder searchInputItemViewHolder2, C27356AoS<CandInputData> c27356AoS) {
        super(0);
        this.$t = c27356AoS;
        this.l0 = searchInputItemViewHolder;
        this.l1 = searchInputItemViewHolder2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(AddressListViewModel addressListViewModel, AqS154S0100000_4 aqS154S0100000_4, int i) {
        super(0);
        this.$t = i;
        this.l0 = addressListViewModel;
        this.l1 = aqS154S0100000_4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(LogisticSelectFragment logisticSelectFragment, DeliveryPanelState deliveryPanelState, int i) {
        super(0);
        this.$t = i;
        this.l0 = logisticSelectFragment;
        this.l1 = deliveryPanelState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(OrderSubmitActivity orderSubmitActivity, AddressEditFragment addressEditFragment, int i) {
        super(0);
        this.$t = i;
        this.l0 = orderSubmitActivity;
        this.l1 = addressEditFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(SizeGuide sizeGuide, GlobalSkuVH globalSkuVH, int i) {
        super(0);
        this.$t = i;
        this.l0 = sizeGuide;
        this.l1 = globalSkuVH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ReturnPoliciesFragment returnPoliciesFragment, BottomTip bottomTip, int i) {
        super(0);
        this.$t = i;
        this.l0 = returnPoliciesFragment;
        this.l1 = bottomTip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(UserRightFragment userRightFragment, ContactDetail contactDetail, int i) {
        super(0);
        this.$t = i;
        this.l0 = userRightFragment;
        this.l1 = contactDetail;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(UserRightFragment userRightFragment, PrivacyPolicy privacyPolicy, int i) {
        super(0);
        this.$t = i;
        this.l0 = userRightFragment;
        this.l1 = privacyPolicy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(PdpViewModel pdpViewModel, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = pdpViewModel;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(DistrictFragment districtFragment, C26936Ahg c26936Ahg, int i) {
        super(0);
        this.$t = i;
        this.l0 = districtFragment;
        this.l1 = c26936Ahg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(USAddressEditViewModel uSAddressEditViewModel, C27021Aj3 c27021Aj3, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSAddressEditViewModel;
        this.l1 = c27021Aj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(USLogisticVH uSLogisticVH, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSLogisticVH;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(USMainOrderInfoVH uSMainOrderInfoVH, LogisticDTO logisticDTO, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSMainOrderInfoVH;
        this.l1 = logisticDTO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(OfflineModeSheetPageFragment offlineModeSheetPageFragment, C62822Ol8 c62822Ol8, int i) {
        super(0);
        this.$t = i;
        this.l0 = offlineModeSheetPageFragment;
        this.l1 = c62822Ol8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(PaidContentCollectionDetailHeaderAssem paidContentCollectionDetailHeaderAssem, ActivityC45651qj activityC45651qj, int i) {
        super(0);
        this.$t = i;
        this.l0 = paidContentCollectionDetailHeaderAssem;
        this.l1 = activityC45651qj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(PaidContentCollectionListAssem paidContentCollectionListAssem, PaidContentFeedbackIntegrationURLSetting.FeedbackIntegrationInfoStructJsonModel feedbackIntegrationInfoStructJsonModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = paidContentCollectionListAssem;
        this.l1 = feedbackIntegrationInfoStructJsonModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ManageSeriesNavBarAssem manageSeriesNavBarAssem, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = manageSeriesNavBarAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ProfileEditPronounsSearchAndDisplayAssem profileEditPronounsSearchAndDisplayAssem, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileEditPronounsSearchAndDisplayAssem;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ProfileEditFragment profileEditFragment, View view, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileEditFragment;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, MyProfileGuideState myProfileGuideState, int i) {
        super(0);
        this.$t = i;
        this.l0 = myProfileGuideWidgetV2;
        this.l1 = myProfileGuideState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(ProfileEnterpriseBAAssem profileEnterpriseBAAssem, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileEnterpriseBAAssem;
        this.l1 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(FeatureVideoAwemeListNavBarAssem featureVideoAwemeListNavBarAssem, C252709vu c252709vu, int i) {
        super(0);
        this.$t = i;
        this.l0 = featureVideoAwemeListNavBarAssem;
        this.l1 = c252709vu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(StoryGuideVideoComponent storyGuideVideoComponent, ARunnableS23S0200000_4 aRunnableS23S0200000_4, int i) {
        super(0);
        this.$t = i;
        this.l0 = storyGuideVideoComponent;
        this.l1 = aRunnableS23S0200000_4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS151S0200000_4(HeaderCTASocialEntranceComponent headerCTASocialEntranceComponent, C243839hb c243839hb, int i) {
        super(0);
        this.$t = i;
        this.l0 = headerCTASocialEntranceComponent;
        this.l1 = c243839hb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS151S0200000_4(k1 k1Var, k1 k1Var2, HashMap<String, Object> hashMap) {
        super(0);
        this.$t = hashMap;
        this.l0 = k1Var;
        this.l1 = k1Var2;
    }
}
