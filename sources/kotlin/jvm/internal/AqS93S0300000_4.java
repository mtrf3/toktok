package kotlin.jvm.internal;

import X.AEY;
import X.AMQ;
import X.AMR;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.B1R;
import X.C110614Vt;
import X.C119774mz;
import X.C132805Jc;
import X.C16880lQ;
import X.C1799074g;
import X.C17J;
import X.C2068389v;
import X.C214378bB;
import X.C235399Lr;
import X.C235439Lv;
import X.C236079Oh;
import X.C237559Tz;
import X.C243799hX;
import X.C243819hZ;
import X.C243839hb;
import X.C245319jz;
import X.C247519nX;
import X.C250729si;
import X.C252659vp;
import X.C253249wm;
import X.C26087ALr;
import X.C26338AVi;
import X.C26702Adu;
import X.C26704Adw;
import X.C26705Adx;
import X.C26796AfQ;
import X.C26798AfS;
import X.C26968AiC;
import X.C27117Akb;
import X.C27739Aud;
import X.C27798Ava;
import X.C27949Ay1;
import X.C28064Azs;
import X.C2RM;
import X.C2RS;
import X.C32151Nz;
import X.C39557Ffl;
import X.C45804HyK;
import X.C53765L8f;
import X.C55096Ljo;
import X.C61328O5c;
import X.C61447O9r;
import X.C61836OOq;
import X.C61841OOv;
import X.C62889OmD;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70887Rrv;
import X.C70917RsP;
import X.C72264SXs;
import X.C73156SnQ;
import X.C73340SqO;
import X.C76732zl;
import X.C76800UCe;
import X.C77125UOr;
import X.C78685UuP;
import X.C78946Uyc;
import X.C78977Uz7;
import X.C78999UzT;
import X.C7MY;
import X.C7VU;
import X.C99W;
import X.EF7;
import X.EnumC234309Hm;
import X.FP1;
import X.InterfaceC1798974f;
import X.InterfaceC236109Ok;
import X.InterfaceC252779w1;
import X.InterfaceC35811ar;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.NO5;
import X.O6R;
import X.SY4;
import X.TBT;
import X.ViewOnClickListenerC252769w0;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS39S0200000_4;
import Y.IDeS95S0200000_1;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionExpireRemindHourSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.touchpoint.core.model.ProfileActivityButton;
import com.bytedance.touchpoint.core.model.ProfileActivityIcon;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.bytedance.widget.Widget;
import com.ss.android.ugc.aweme.IBindService;
import com.ss.android.ugc.aweme.account.agegate.activity.AccountDeletedActivity;
import com.ss.android.ugc.aweme.commerce.OfflineInfo;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.model.Keyword;
import com.ss.android.ugc.aweme.compliance.business.filtervideo.viewmodel.FilterVideoKeywordsViewModel;
import com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.api.model.RedirectContent;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfoItem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.module.review.PdpReviewImageViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ContactDetail;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.subpage.returnpolicies.ReturnPoliciesFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.ImageRichText;
import com.ss.android.ugc.aweme.ecommerce.global.osp.dto.UserTrustItemDescriptionChunk;
import com.ss.android.ugc.aweme.ecommerce.global.osp.module.usertrust.UserTrustItemAdapter;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.shop.USMainOrderInfoVH;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftAdvanceVoucherPriceAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel;
import com.ss.android.ugc.aweme.profile.model.AgeGateOption;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ability.ProfileBaseAbility;
import com.ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import com.ss.android.ugc.aweme.profile.widgets.BaseMyProfileGuideWidget;
import com.ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.ss.android.ugc.aweme.profile.widgets.bind.account.ProfileBindAccountAssem;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseBAAssem;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.ProfileMafRedPointsVM;
import com.ss.android.ugc.aweme.profile.widgets.navbar.entrances.mine.MineNavBarFindFriendsAssem;
import com.ss.android.ugc.aweme.profile.widgets.userId.ProfileUserIdAssem;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.cta.assemble.ProfileHeaderCTAComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.HeaderCTAEditProfileComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.HeaderCTAShareProfileComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.HeaderCTASocialEntranceComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.addfriends.HeaderCTAAddFriendsComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.recommendbutton.HeaderCTARecommendButtonComponent;
import com.ss.android.ugc.profile.platform.business.header.business.cta.business.socialinteraction.HeaderCTASocialInteractionComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes5.dex */
public class AqS93S0300000_4 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$0();
            case 2:
                return invoke$1();
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$2();
            case 5:
                return invoke$3();
            case 6:
                return invoke$4();
            case 7:
                return invoke$5();
            case 8:
                return invoke$6();
            case 9:
                return invoke$7();
            case 10:
                return invoke$8();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$9();
            case 12:
                return invoke$10();
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$11();
            case 14:
                return invoke$12();
            case 15:
                return invoke$13();
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$14();
            case 17:
                return invoke$15();
            case 18:
                return invoke$16();
            case 19:
                return invoke$17();
            case 20:
                return invoke$18();
            case 21:
                return invoke$19();
            case 22:
                return invoke$20();
            case 23:
                return invoke$21();
            case 24:
                return invoke$22();
            case 25:
                return invoke$23();
            case 26:
                return invoke$24();
            case 27:
                return invoke$25();
            case 28:
                return invoke$26();
            case 29:
                return invoke$27();
            case 30:
                return invoke$28();
            case 31:
                return invoke$29();
            case 32:
                return invoke$30();
            case 33:
                return invoke$31();
            case 34:
                return invoke$32();
            case 35:
                return invoke$33();
            case 36:
                return invoke$34();
            case 37:
                return invoke$35();
            case 38:
                return invoke$36();
            case 39:
                return invoke$37();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$38();
            case 41:
                return invoke$39();
            case 42:
                return invoke$40();
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$41();
            case 44:
                return invoke$42();
            case 45:
                return invoke$43();
            case 46:
                return invoke$44();
            case 47:
                return invoke$45();
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$46();
            case C61447O9r.LJIIJ:
                return invoke$47();
            case 50:
                return invoke$48();
            case 51:
                return invoke$49();
            case 52:
                return invoke$50();
            case 53:
                return invoke$51();
            case 54:
                return invoke$52();
            case 55:
                return invoke$53();
            case 56:
                return invoke$54();
            case 57:
                return invoke$55();
            case 58:
                return invoke$56();
            case 59:
                return invoke$57();
            case 60:
                return invoke$58();
            case 61:
                return invoke$59();
            case BaseNotice.CREATOR /* 62 */:
                return invoke$60();
            case 63:
                return invoke$61();
            case 64:
                return invoke$62();
            case 65:
                return invoke$63();
            case 66:
                return invoke$64();
            case 67:
                return invoke$65();
            case 68:
                return invoke$66();
            case 69:
                return invoke$67();
            case 70:
                return invoke$68();
            case 71:
                return invoke$69();
            case SubscriptionExpireRemindHourSetting.DEFAULT /* 72 */:
                return invoke$70();
            case 73:
                return invoke$71();
            case 74:
                return invoke$72();
            case 75:
                return invoke$73();
            case 76:
                return invoke$74();
            case 77:
                return invoke$75();
            case 78:
                return invoke$76();
            case 79:
                return invoke$77();
            case 80:
                return invoke$78();
            case 81:
                return invoke$79();
            case 82:
                return invoke$80();
            case 83:
                return invoke$81();
            case 84:
                return invoke$82();
            case LiveAnchorEnableInnerBeautyMaxValue.DEFAULT /* 85 */:
                return invoke$83();
            case 86:
                return invoke$84();
            case 87:
                return invoke$85();
            case 88:
                return invoke$86();
            case 89:
                return invoke$87();
            case 90:
                return invoke$88();
            case 91:
                return invoke$89();
            case 92:
                return invoke$90();
            case 93:
                return invoke$91();
            case 94:
                return invoke$92();
            case 95:
                return invoke$95(this);
            case 96:
                return invoke$93();
            case 97:
                return invoke$94();
            case 98:
                return invoke$95();
            case 99:
                return invoke$96();
            case 100:
                return invoke$97();
            case 101:
                return invoke$98();
            case 102:
                return invoke$99();
            case 103:
                return invoke$100();
            case 104:
                return invoke$101();
            case 105:
                return invoke$102();
            case 106:
                return invoke$103();
            case 107:
                return invoke$104();
            case 108:
                return invoke$105();
            case 109:
                return invoke$106();
            case 110:
                return invoke$107();
            case 111:
                return invoke$108();
            case 112:
                return invoke$109();
            case 113:
                return invoke$110();
            case 114:
                return invoke$111();
            case 115:
                return invoke$112();
            case 116:
                return invoke$113();
            case 117:
                return invoke$114();
            case 118:
                return invoke$115();
            case 119:
                return invoke$116();
            case LiveTryModeCountDownThresholdSetting.DEFAULT /* 120 */:
                return invoke$117();
            case 121:
                return invoke$118();
            case 122:
                return invoke$119();
            case 123:
                return invoke$120();
            case 124:
                return invoke$121();
            case 125:
                return invoke$122();
            case 126:
                return invoke$123();
            case 127:
                return invoke$124();
            case 128:
                return invoke$125();
            case 129:
                return invoke$126();
            case 130:
                return invoke$127();
            case 131:
                return invoke$128();
            case 132:
                return invoke$129();
            case 133:
                return invoke$130();
            case 134:
                return invoke$131();
            case 135:
                return invoke$132();
            case 136:
                return invoke$133();
            case 137:
                return invoke$134();
            case 138:
                return invoke$135();
            case 139:
                return invoke$136();
            case UserLevelGeckoUpdateSetting.DEFAULT /* 140 */:
                return invoke$137();
            case 141:
                return invoke$138();
            case 142:
                return invoke$139();
            case 143:
                return invoke$140();
            case 144:
                return invoke$141();
            case 145:
                return invoke$142();
            case 146:
                return invoke$143();
            case 147:
                return invoke$147(this);
            case 148:
                return invoke$144();
            case 149:
                return invoke$145();
            case 150:
                return invoke$146();
            case 151:
                return invoke$147();
            case 152:
                return invoke$152(this);
            case 153:
                return invoke$148();
            case 154:
                return invoke$149();
            case 155:
                return invoke$150();
            case 156:
                return invoke$151();
            case 157:
                return invoke$152();
            case 158:
                return invoke$153();
            case 159:
                return invoke$154();
            case 160:
                return invoke$160(this);
            case 161:
                return invoke$161(this);
            case 162:
                return invoke$162(this);
            case 163:
                return invoke$155();
            case 164:
                return invoke$164(this);
            case 165:
                return invoke$156();
            case 166:
                return invoke$166(this);
            case 167:
                return invoke$157();
            case 168:
                return invoke$168(this);
            case 169:
                return invoke$169(this);
            case 170:
                return invoke$158();
            case 171:
                return invoke$159();
            case 172:
                return invoke$160();
            case 173:
                return invoke$161();
            case 174:
                return invoke$162();
            case 175:
                return invoke$163();
            case 176:
                return invoke$176(this);
            case 177:
                return invoke$177(this);
            case 178:
                return invoke$178(this);
            case 179:
                return invoke$164();
            case 180:
                return invoke$165();
            case 181:
                return invoke$181(this);
            case 182:
                return invoke$166();
            case 183:
                return invoke$167();
            case 184:
                return invoke$168();
            case 185:
                return invoke$185(this);
            case 186:
                return invoke$186(this);
            case 187:
                return invoke$187(this);
            case 188:
                return invoke$169();
            case 189:
                return invoke$170();
            case 190:
                return invoke$171();
            case 191:
                return invoke$172();
            case 192:
                return invoke$192(this);
            case 193:
                return invoke$193(this);
            case 194:
                return invoke$194(this);
            case 195:
                return invoke$173();
            case 196:
                return invoke$174();
            case 197:
                return invoke$197(this);
            case 198:
                return invoke$175();
            case 199:
                return invoke$199(this);
            case 200:
                return invoke$177();
            case 201:
                return invoke$178();
            case 202:
                return invoke$179();
            case 203:
                return invoke$203(this);
            case 204:
                return invoke$204(this);
            case 205:
                return invoke$180();
            default:
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$0() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$1() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$10() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$100() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$101() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$102() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$103() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$104() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$105() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$106() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$107() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$108() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$109() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$11() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$110() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$111() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$112() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$113() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$114() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$115() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$116() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$117() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$118() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$119() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$12() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$120() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$120():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel invoke$121() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$121():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DeliveryPanelViewModel invoke$122() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressSelectViewModel invoke$123() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressSelectViewModel invoke$124() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DeliveryPanelViewModel invoke$125() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$126() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$127() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$128() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$129() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$13() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$130() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$131() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$132() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$133() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$134() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel invoke$135() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$135():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel invoke$136() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$136():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FollowRelationTabViewModel invoke$137() {
        return (JediViewModel) ViewModelProviders.of(((Fragment) this.l0).requireActivity(), AMR.LIZ).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FollowRelationTabViewModel invoke$138() {
        return (JediViewModel) ViewModelProviders.of(((Fragment) this.l0).requireActivity(), AMR.LIZ).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FollowRelationTabViewModel invoke$139() {
        return (JediViewModel) ViewModelProviders.of(((Fragment) this.l0).requireActivity(), AMR.LIZ).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel invoke$14() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$14():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final FollowRelationTabViewModel invoke$140() {
        return (JediViewModel) ViewModelProviders.of(C77125UOr.LIZJ(((JediViewHolder) this.l0).getHost()), AMR.LIZ).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
    public final FollowerRelationViewModel invoke$141() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PushSettingNotificationChoiceViewModel invoke$142() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PushSettingNotificationChoiceViewModel invoke$143() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.profile.effect.EffectProfileListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final EffectProfileListViewModel invoke$144() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel invoke$145() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$145():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AuthListViewModel invoke$146() {
        Fragment parentFragment = ((Fragment) this.l0).getParentFragment();
        if (parentFragment != null) {
            return (JediViewModel) ViewModelProviders.of(parentFragment, AMR.LIZ).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AuthListViewModel invoke$147() {
        Fragment parentFragment = ((Fragment) this.l0).getParentFragment();
        if (parentFragment != null) {
            return (JediViewModel) ViewModelProviders.of(parentFragment, AMR.LIZ).get(C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName(), C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        o.LJIIZILJ();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$148() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$148():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$149() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$149():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DeliveryPanelViewModel invoke$15() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel invoke$150() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$150():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel invoke$151() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$151():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel invoke$152() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$152():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.minipdp.MiniPdpPanelViewModel invoke$153() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$153():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$154() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$155() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$156() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$157() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$158() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$159() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel invoke$16() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$16():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$160() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$161() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$162() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$163() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final TrendsTabViewModel invoke$164() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final TrendsTabViewModel invoke$165() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$166() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$167() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$168() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$169() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DeliveryPanelViewModel invoke$17() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$170() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$171() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$172() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$173() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DeliveryPanelViewModel invoke$174() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$175() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    public final void invoke$176() {
        if (((C253249wm) this.l0).LIZIZ) {
            ((SY4) ((AccountDeletedActivity) this.l1)._$_findCachedViewById(R.id.b2a)).setEnabled(true);
            C16880lQ.LJJIZ((SY4) ((AccountDeletedActivity) this.l1)._$_findCachedViewById(R.id.b2a), new ACListenerS39S0200000_4((AgeGateOption) this.l2, (AccountDeletedActivity) this.l1, 109));
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$177() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$178() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$179() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressSelectViewModel invoke$18() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$180() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$19() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.discover.viewmodel.TrendsTabViewModel invoke$2() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$2():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$20() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$21() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$22() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$23() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$24() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$25() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$26() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$27() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$28() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$29() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditDetailViewModel invoke$3() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$30() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$31() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel invoke$32() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$32():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$33() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$34() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$35() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$36() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$37() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$38() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$39() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.detail.AddressEditDetailViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditDetailViewModel invoke$4() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$40() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$41() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$42() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PaymentViewModel invoke$43() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel invoke$44() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$44():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel invoke$45() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$45():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$46() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$47() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$48() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$49() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$5() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$50() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$51() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$52() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$53() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$54() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$55() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$56() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$57() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$58() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$59() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$6() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$60() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$61() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$62() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$63() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$64() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$65() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$66() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$67() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$68() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$69() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$7() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$70() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$70():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$71() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$71():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$72() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$72():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel invoke$73() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$73():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ProductReviewViewModel invoke$74() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.review.ProductReviewViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ProductReviewViewModel invoke$75() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.review.gallery.ReviewGalleryViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final ReviewGalleryViewModel invoke$76() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel invoke$77() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$77():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel invoke$78() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$78():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(r4.requireActivity(), X.AMR.LIZ).get(r3, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r5.l1));
     */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel invoke$79() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.l0
            com.bytedance.widget.Widget r0 = (com.bytedance.widget.Widget) r0
            java.lang.Object r4 = r0.getHost()
            java.lang.Object r0 = r5.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r3 = r0.getName()
            boolean r0 = r4 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L52
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            r2 = r4
        L1b:
            if (r2 == 0) goto L39
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r2, r0)     // Catch: X.AMQ -> L32
            java.lang.Object r0 = r5.l1     // Catch: X.AMQ -> L32
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L32
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L32
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)     // Catch: X.AMQ -> L32
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L32
            goto L37
        L32:
            androidx.fragment.app.Fragment r2 = r2.getParentFragment()
            goto L1b
        L37:
            if (r0 != 0) goto L6a
        L39:
            X.1qj r1 = r4.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r5.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            goto L6a
        L52:
            boolean r0 = r4 instanceof X.ActivityC45651qj
            if (r0 == 0) goto L6b
            X.1qj r4 = (X.ActivityC45651qj) r4
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r2 = androidx.lifecycle.ViewModelProviders.of(r4, r0)
            java.lang.Object r1 = r5.l1
            X.Pko r1 = (X.InterfaceC65350Pko) r1
            java.lang.String r0 = "ViewModelProviders\n     …key, viewModelClass.java)"
            androidx.lifecycle.ViewModel r0 = X.FP1.LIZIZ(r1, r2, r3, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L6a:
            return r0
        L6b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$79():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$8() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final DistrictPickerViewModel invoke$80() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.viewmodel.DistrictPickerWrapperViewModel invoke$81() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$81():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$82() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$83() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.list.AddressListViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressListViewModel invoke$84() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$85() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$86() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$87() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$88() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$89() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final AddressEditViewModel invoke$9() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$90() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$91() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final OrderSubmitViewModel invoke$92() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004e, code lost:
    
        return (com.bytedance.jedi.arch.JediViewModel) androidx.lifecycle.ViewModelProviders.of(((androidx.fragment.app.Fragment) r4.l0).requireActivity(), X.AMR.LIZ).get(r2, X.C39557Ffl.LIZ((X.InterfaceC65350Pko) r4.l1));
     */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel invoke$93() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.Fragment r3 = r0.getParentFragment()
            java.lang.Object r0 = r4.l2
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            java.lang.String r2 = r0.getName()
        L14:
            if (r3 == 0) goto L32
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r3, r0)     // Catch: X.AMQ -> L2b
            java.lang.Object r0 = r4.l1     // Catch: X.AMQ -> L2b
            X.Pko r0 = (X.InterfaceC65350Pko) r0     // Catch: X.AMQ -> L2b
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)     // Catch: X.AMQ -> L2b
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)     // Catch: X.AMQ -> L2b
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch: X.AMQ -> L2b
            goto L30
        L2b:
            androidx.fragment.app.Fragment r3 = r3.getParentFragment()
            goto L14
        L30:
            if (r0 != 0) goto L4e
        L32:
            java.lang.Object r0 = r4.l0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.1qj r1 = r0.requireActivity()
            Y.IDFactoryS62S0000000_4 r0 = X.AMR.LIZ
            androidx.lifecycle.ViewModelProvider r1 = androidx.lifecycle.ViewModelProviders.of(r1, r0)
            java.lang.Object r0 = r4.l1
            X.Pko r0 = (X.InterfaceC65350Pko) r0
            java.lang.Class r0 = X.C39557Ffl.LIZ(r0)
            androidx.lifecycle.ViewModel r0 = r1.get(r2, r0)
            com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.invoke$93():com.bytedance.jedi.arch.JediViewModel");
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$94() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$95() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$96() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$97() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$98() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel, com.bytedance.jedi.arch.JediViewModel] */
    public final PdpViewModel invoke$99() {
        Object LJIILLIIL = C77125UOr.LJIILLIIL(((JediViewHolder) this.l0).getHost());
        String name = C39557Ffl.LIZ((InterfaceC65350Pko) this.l2).getName();
        if (LJIILLIIL instanceof Fragment) {
            Fragment fragment = (Fragment) LJIILLIIL;
            Fragment fragment2 = fragment;
            while (true) {
                if (fragment2 == null) {
                    break;
                }
                try {
                    ?? r0 = (JediViewModel) ViewModelProviders.of(fragment2, AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
                    if (r0 != 0) {
                        return r0;
                    }
                } catch (AMQ unused) {
                    fragment2 = fragment2.getParentFragment();
                }
            }
            return (JediViewModel) ViewModelProviders.of(fragment.requireActivity(), AMR.LIZ).get(name, C39557Ffl.LIZ((InterfaceC65350Pko) this.l1));
        }
        if (LJIILLIIL instanceof ActivityC45651qj) {
            return (JediViewModel) FP1.LIZIZ((InterfaceC65350Pko) this.l1, ViewModelProviders.of((ActivityC45651qj) LJIILLIIL, AMR.LIZ), name, "ViewModelProviders\n     …key, viewModelClass.java)");
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS93S0300000_4 aqS93S0300000_4) {
        ExceptionUX exceptionUX;
        RedirectContent redirectContent;
        String str;
        PayResponseData payResponseData = (PayResponseData) ((Response) aqS93S0300000_4.l0).data;
        if (payResponseData != null && (exceptionUX = payResponseData.exceptionUX) != null && (redirectContent = exceptionUX.getRedirectContent()) != null) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS93S0300000_4.l1;
            C28064Azs c28064Azs = (C28064Azs) aqS93S0300000_4.l2;
            String jumpSchema = redirectContent.getJumpSchema();
            if (jumpSchema != null) {
                Uri.Builder buildUpon = UriProtector.parse(jumpSchema).buildUpon();
                buildUpon.appendQueryParameter("source", c28064Azs.LIZLLL);
                HashMap<String, Object> hashMap = c28064Azs.LJII;
                if (hashMap != null) {
                    str = C27739Aud.LJI(hashMap);
                } else {
                    str = "{}";
                }
                buildUpon.appendQueryParameter("trackParams", str);
                buildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
                SmartRouter.buildRoute(EF7.LIZIZ(), buildUpon.toString()).open();
            }
            if (o.LJ(redirectContent.getClosePage(), Boolean.TRUE)) {
                interfaceC65784Pro.invoke();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$147(AqS93S0300000_4 aqS93S0300000_4) {
        ((SeriesDraftAdvanceVoucherPriceAssem) aqS93S0300000_4.l0).H3().kv0(new AqS134S0200000_3((SeriesDraftAdvanceVoucherPriceAssem) aqS93S0300000_4.l0, (Context) aqS93S0300000_4.l2, 119), !((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l1).getValue()).booleanValue());
        SeriesDraftViewModel H3 = ((SeriesDraftAdvanceVoucherPriceAssem) aqS93S0300000_4.l0).H3();
        H3.getClass();
        H3.setState(new AqS170S0100000_4((Price) null, 39));
        ((C7VU) ((SeriesDraftAdvanceVoucherPriceAssem) aqS93S0300000_4.l0).LJLL.getValue()).LJLIL.LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$152(AqS93S0300000_4 aqS93S0300000_4) {
        ProfileBaseAbility profileBaseAbility = (ProfileBaseAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ((ProfileHeaderCTAComponent) aqS93S0300000_4.l0), ProfileBaseAbility.class, null);
        if (profileBaseAbility != null && profileBaseAbility.L7()) {
            C78685UuP.LJIIL((ProfileHeaderCTAComponent) aqS93S0300000_4.l0, "cta_edit_profile", C65352Pkq.LIZ(HeaderCTAEditProfileComponent.class), EnumC234309Hm.TEXT, 0);
        }
        C78685UuP.LJIIL((ProfileHeaderCTAComponent) aqS93S0300000_4.l0, "cta_social_interaction", C65352Pkq.LIZ(HeaderCTASocialInteractionComponent.class), EnumC234309Hm.TEXT, -1);
        C78685UuP.LJIIL((ProfileHeaderCTAComponent) aqS93S0300000_4.l0, "cta_add_friends", C65352Pkq.LIZ(HeaderCTAAddFriendsComponent.class), (EnumC234309Hm) aqS93S0300000_4.l1, -1);
        C78685UuP.LJIIL((ProfileHeaderCTAComponent) aqS93S0300000_4.l0, "cta_share_profile", C65352Pkq.LIZ(HeaderCTAShareProfileComponent.class), (EnumC234309Hm) aqS93S0300000_4.l2, -1);
        ProfileHeaderCTAComponent profileHeaderCTAComponent = (ProfileHeaderCTAComponent) aqS93S0300000_4.l0;
        C65776Prg LIZ = C65352Pkq.LIZ(HeaderCTASocialEntranceComponent.class);
        EnumC234309Hm enumC234309Hm = EnumC234309Hm.ICON;
        C78685UuP.LJIIL(profileHeaderCTAComponent, "cta_social_entrance", LIZ, enumC234309Hm, -1);
        C78685UuP.LJIIL((ProfileHeaderCTAComponent) aqS93S0300000_4.l0, "cta_recommend_button", C65352Pkq.LIZ(HeaderCTARecommendButtonComponent.class), enumC234309Hm, -1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$160(AqS93S0300000_4 aqS93S0300000_4) {
        ((InterfaceC88472Yns) aqS93S0300000_4.l0).invoke(Boolean.valueOf(((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l2).getValue()).booleanValue()));
        boolean z = !((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l2).getValue()).booleanValue();
        if (C62889OmD.LIZJ(z)) {
            ((InterfaceC88472Yns) aqS93S0300000_4.l1).invoke(Boolean.valueOf(!z));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$161(AqS93S0300000_4 aqS93S0300000_4) {
        ((InterfaceC88472Yns) aqS93S0300000_4.l0).invoke(Boolean.valueOf(((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l2).getValue()).booleanValue()));
        boolean z = !((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l2).getValue()).booleanValue();
        if (C62889OmD.LIZJ(z)) {
            ((InterfaceC88472Yns) aqS93S0300000_4.l1).invoke(Boolean.valueOf(!z));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$162(AqS93S0300000_4 aqS93S0300000_4) {
        boolean z = !((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l2).getValue()).booleanValue();
        boolean booleanValue = ((Boolean) ((InterfaceC35811ar) aqS93S0300000_4.l2).getValue()).booleanValue();
        if (C62889OmD.LIZLLL(z)) {
            ((InterfaceC88472Yns) aqS93S0300000_4.l0).invoke(Boolean.valueOf(booleanValue));
        }
        ((InterfaceC88472Yns) aqS93S0300000_4.l1).invoke(Boolean.valueOf(booleanValue));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$164(AqS93S0300000_4 aqS93S0300000_4) {
        String str;
        ((C76732zl) aqS93S0300000_4.l0).element = 0;
        FindFriendsPageArg findFriendsPageArg = new FindFriendsPageArg(false, 0, "personal_homepage", null, null, ((C76732zl) aqS93S0300000_4.l0).element, false, 27, null);
        SmartRoute buildRoute = SmartRouter.buildRoute(((MineNavBarFindFriendsAssem) aqS93S0300000_4.l1).getContext(), "//friends/ffp");
        buildRoute.withNavArg(findFriendsPageArg);
        buildRoute.open();
        C235399Lr c235399Lr = new C235399Lr("click_add_friends");
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c235399Lr.LJ("enter_from", "personal_homepage", c1799074g);
        c235399Lr.LJ("event_type", "normal_way", c1799074g);
        c235399Lr.LJIILL("button_type", "icon");
        if (((ProfileMafRedPointsVM) ((C214378bB) aqS93S0300000_4.l2).getValue()).LJLILLLLZI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c235399Lr.LJIILL("has_notice", str);
        if (((ProfileMafRedPointsVM) ((C214378bB) aqS93S0300000_4.l2).getValue()).LJLILLLLZI) {
            c235399Lr.LJIILL("notice_cnt", String.valueOf(((C76732zl) aqS93S0300000_4.l0).element));
        }
        c235399Lr.LJIILIIL();
        C17J.LJJJ((MineNavBarFindFriendsAssem) aqS93S0300000_4.l1, true, "find_friends");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$166(AqS93S0300000_4 aqS93S0300000_4) {
        C78977Uz7.LJJIIJZLJL((C119774mz) aqS93S0300000_4.l0, ((List) aqS93S0300000_4.l1).subList(0, 4), new C26796AfQ((C119774mz) aqS93S0300000_4.l0, (((C119774mz) aqS93S0300000_4.l0).getWidth() - (C45804HyK.LJJ(8) * 3)) / 4), new IDqS183S0200000_4((List) aqS93S0300000_4.l1, (List<C26798AfS>) aqS93S0300000_4.l2, (PdpReviewImageViewHolder) 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$168(AqS93S0300000_4 aqS93S0300000_4) {
        USMainOrderInfoVH uSMainOrderInfoVH = (USMainOrderInfoVH) aqS93S0300000_4.l0;
        LogisticDTO logisticDTO = (LogisticDTO) aqS93S0300000_4.l1;
        View itemView = uSMainOrderInfoVH.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C78946Uyc.LJJIIJ(itemView, new C70917RsP(), new AqS170S0100000_4(logisticDTO, 965));
        FragmentManager fragmentManager = ((USMainOrderInfoVH) aqS93S0300000_4.l0).LJLILLLLZI.getFragmentManager();
        if (fragmentManager != null) {
            C27117Akb c27117Akb = (C27117Akb) aqS93S0300000_4.l2;
            LogisticDTO logisticDTO2 = (LogisticDTO) aqS93S0300000_4.l1;
            USMainOrderInfoVH uSMainOrderInfoVH2 = (USMainOrderInfoVH) aqS93S0300000_4.l0;
            Context context = c27117Akb.getContext();
            o.LJIIIIZZ(context, "context");
            C2RS LIZLLL = C26968AiC.LIZLLL(context, logisticDTO2);
            String string = c27117Akb.getContext().getString(R.string.fan);
            o.LJIIIIZZ(string, "context.getString(R.stri…_next_day_delivery_badge)");
            C26968AiC.LJFF(C26968AiC.LIZIZ(LIZLLL, string, 0.73f, new IDqS183S0200000_4(uSMainOrderInfoVH2, logisticDTO2, 7)), fragmentManager, null, new AqS151S0200000_4(uSMainOrderInfoVH2, logisticDTO2, 31), 4);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$169(AqS93S0300000_4 aqS93S0300000_4) {
        final MyProfileGuideWidgetV2 myProfileGuideWidgetV2 = (MyProfileGuideWidgetV2) aqS93S0300000_4.l0;
        final ViewOnClickListenerC252769w0 LIZJ = myProfileGuideWidgetV2.LIZJ();
        ProfileState profileState = (ProfileState) aqS93S0300000_4.l1;
        MyProfileGuideState myProfileGuideState = (MyProfileGuideState) aqS93S0300000_4.l2;
        o.LJIIIZ(profileState, "profileState");
        o.LJIIIZ(myProfileGuideState, "myProfileGuideState");
        LIZJ.setOnInternalClickListener(new InterfaceC252779w1() { // from class: X.9zr
            @Override // X.InterfaceC252779w1
            public final void LIZJ() {
            }

            @Override // X.InterfaceC252779w1
            public final void LIZ() {
                LIZJ.setVisibility(8);
                C255179zt LIZ = new C255179zt().LIZ();
                LIZ.LIZJ.storeInt("click_delete_icon_times", LIZ.LIZJ.getInt("click_delete_icon_times", 0) + 1);
                C255209zw.LIZ(EnumC255169zs.CLOSE.getType());
            }

            @Override // X.InterfaceC252779w1
            public final void LIZIZ() {
                C255209zw.LIZ(EnumC255169zs.CLICK.getType());
                IBindService LJFF = HG3.LJFF();
                BaseMyProfileGuideWidget baseMyProfileGuideWidget = myProfileGuideWidgetV2;
                baseMyProfileGuideWidget.getClass();
                ActivityC45651qj LIZJ2 = C77125UOr.LIZJ(baseMyProfileGuideWidget);
                Bundle LIZ = C0H1.LIZ("profile_bind_from", "click_btm_bar");
                LIZ.putInt("phone_number_source", EnumC78973Uz3.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_PROFILE_FLOATING_NOTICE.getValue());
                LJFF.bindMobile(LIZJ2, "personal_homepage", LIZ, new IDeS95S0200000_1(LIZJ, myProfileGuideWidgetV2, 0));
            }
        });
        int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(56));
        if (C53765L8f.LJIIJJI()) {
            LJJIIZ = 0;
        }
        C45804HyK.LJJL(LJJIIZ, LIZJ);
        int LJJIIZ2 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        int LIZIZ = C7MY.LIZIZ(4);
        int LIZIZ2 = C7MY.LIZIZ(88);
        int LJJIIZ3 = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        View LIZ = LIZJ.LIZ(R.id.l_j);
        o.LJIIIIZZ(LIZ, "notice.title_container");
        C26338AVi.LJI(LIZ, Integer.valueOf(LJJIIZ2), null, Integer.valueOf(LIZIZ), null, false, 26);
        ((TuxTextView) LIZJ.LIZ(R.id.f10)).setTuxFont(61);
        View LIZ2 = LIZJ.LIZ(R.id.ezm);
        o.LJIIIIZZ(LIZ2, "notice.iv_button");
        ViewGroup.LayoutParams layoutParams = LIZ2.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = LIZIZ2;
            LIZ2.setLayoutParams(layoutParams);
            ImageView it = (ImageView) LIZJ.LIZ(R.id.f0h);
            o.LJIIIIZZ(it, "it");
            it.setPadding(LIZIZ, LIZIZ, LIZIZ, LIZIZ);
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_x_mark;
            c2068389v.LIZJ = LJJIIZ3;
            c2068389v.LIZIZ = LJJIIZ3;
            c2068389v.LJ = Integer.valueOf(R.attr.gp);
            it.setImageDrawable(c2068389v.LIZ(C77125UOr.LIZJ(myProfileGuideWidgetV2)));
            if (C99W.LIZ) {
                View LIZ3 = LIZJ.LIZ(R.id.h3w);
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(12);
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.ct);
                Context context = LIZJ.getContext();
                o.LJIIIIZZ(context, "notice.context");
                LIZ3.setBackground(c110614Vt.LIZ(context));
            }
            ((ImageView) LIZJ.LIZ(R.id.f51)).setVisibility(8);
            C78999UzT.LJFF(C73156SnQ.LJII(myProfileGuideWidgetV2, myProfileGuideWidgetV2.LIZ(), new TBT() { // from class: X.9zp
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ProfileState) obj).getGuideCardOnDisplay();
                }
            }, new TBT() { // from class: X.9zq
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ProfileState) obj).isBlankWorkShow();
                }
            }, new IDqS36S0300000_4(LIZJ, myProfileGuideWidgetV2, myProfileGuideState, 2)), myProfileGuideWidgetV2.LJZ);
            return C76800UCe.LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public static final Object invoke$176(AqS93S0300000_4 aqS93S0300000_4) {
        InterfaceC236109Ok interfaceC236109Ok = ((C236079Oh) aqS93S0300000_4.l0).LJLJL;
        if (interfaceC236109Ok != null) {
            interfaceC236109Ok.LIZIZ();
        }
        C247519nX.LIZ.LJI((ProfileActivityIcon) aqS93S0300000_4.l1, (List) aqS93S0300000_4.l2);
        Activity activity = ((C236079Oh) aqS93S0300000_4.l0).LJLJJL;
        if (activity != null) {
            String str = ((ProfileActivityButton) ListProtector.get((List) aqS93S0300000_4.l2, 0)).jumpLink;
            ProfileActivityIcon profileActivityIcon = (ProfileActivityIcon) aqS93S0300000_4.l1;
            C250729si.LIZ(activity, str, profileActivityIcon.LIZIZ, profileActivityIcon.LJ, false);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$177(AqS93S0300000_4 aqS93S0300000_4) {
        ActivityC45651qj LJJIFFI;
        InterfaceC236109Ok interfaceC236109Ok = ((C236079Oh) aqS93S0300000_4.l0).LJLJL;
        if (interfaceC236109Ok != null) {
            interfaceC236109Ok.LIZIZ();
        }
        C247519nX.LIZ.LJI((ProfileActivityIcon) aqS93S0300000_4.l1, (List) aqS93S0300000_4.l2);
        ArrayList arrayList = new ArrayList();
        for (ProfileActivityButton profileActivityButton : (List) aqS93S0300000_4.l2) {
            C252659vp c252659vp = new C252659vp();
            c252659vp.LJI = new AqS170S0100000_4(profileActivityButton, 1061);
            c252659vp.LIZIZ(profileActivityButton.name);
            c252659vp.LJ = new ACListenerS21S0100000_1(new AqS135S0200000_4(aqS93S0300000_4, profileActivityButton, 202), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            arrayList.add(c252659vp);
        }
        Activity activity = ((C236079Oh) aqS93S0300000_4.l0).LJLJJL;
        if (activity != null && (LJJIFFI = C45804HyK.LJJIFFI(activity)) != null) {
            C245319jz c245319jz = new C245319jz();
            c245319jz.LJ(arrayList);
            TuxActionSheet LIZJ = c245319jz.LIZJ();
            FragmentManager supportFragmentManager = LJJIFFI.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "it.supportFragmentManager");
            LIZJ.show(supportFragmentManager, "");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$178(AqS93S0300000_4 aqS93S0300000_4) {
        MutableLiveData<List<Keyword>> iv0 = ((FilterVideoKeywordsViewModel) aqS93S0300000_4.l0).iv0();
        List<Keyword> value = ((FilterVideoKeywordsViewModel) aqS93S0300000_4.l0).iv0().getValue();
        if (value != null) {
            ListProtector.add(value, 0, (Keyword) aqS93S0300000_4.l2);
        } else {
            value = null;
        }
        iv0.setValue(value);
        ((InterfaceC65784Pro) aqS93S0300000_4.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$181(AqS93S0300000_4 aqS93S0300000_4) {
        User user = (User) aqS93S0300000_4.l0;
        Map map = (Map) aqS93S0300000_4.l1;
        ProfileBindAccountAssem profileBindAccountAssem = (ProfileBindAccountAssem) aqS93S0300000_4.l2;
        C243839hb c243839hb = profileBindAccountAssem.LJLJJLL;
        if (c243839hb != null) {
            C243799hX.LJI(profileBindAccountAssem.getContext(), user, c243839hb, map);
            return C76800UCe.LIZ;
        }
        o.LJIJI("mobParam");
        throw null;
    }

    public static final Object invoke$185(AqS93S0300000_4 aqS93S0300000_4) {
        String str;
        RedirectContent redirectContent = ((PayResponseData) aqS93S0300000_4.l0).exceptionUX.getRedirectContent();
        if (redirectContent != null) {
            OrderSubmitViewModel orderSubmitViewModel = (OrderSubmitViewModel) aqS93S0300000_4.l1;
            Context context = (Context) aqS93S0300000_4.l2;
            String jumpSchema = redirectContent.getJumpSchema();
            if (jumpSchema != null) {
                Uri.Builder buildUpon = UriProtector.parse(jumpSchema).buildUpon();
                buildUpon.appendQueryParameter("source", "ordersubmit");
                HashMap<String, Object> hashMap = orderSubmitViewModel.LLIL;
                if (hashMap != null) {
                    str = C27739Aud.LJI(hashMap);
                } else {
                    str = "{}";
                }
                buildUpon.appendQueryParameter("trackParams", str);
                buildUpon.appendQueryParameter("_ec_start_time", String.valueOf(System.currentTimeMillis()));
                SmartRouter.buildRoute(context, buildUpon.toString()).open();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$186(AqS93S0300000_4 aqS93S0300000_4) {
        C119774mz c119774mz = (C119774mz) aqS93S0300000_4.l0;
        C78977Uz7.LJJIIJZLJL(c119774mz, (List) aqS93S0300000_4.l1, new AqS135S0200000_4(c119774mz, (C26087ALr) aqS93S0300000_4.l2, 233), C26702Adu.INSTANCE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$187(AqS93S0300000_4 aqS93S0300000_4) {
        int i;
        boolean z;
        String charSequence = ((TextView) aqS93S0300000_4.l0).getText().toString();
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
            ((ProfileUserIdAssem) aqS93S0300000_4.l1).x3((User) aqS93S0300000_4.l2);
        }
        ((AssemViewModel) ((ProfileUserIdAssem) aqS93S0300000_4.l1).LJLILLLLZI.getValue()).setState(new AqS9S0010000_4(false, 57));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$192(AqS93S0300000_4 aqS93S0300000_4) {
        FragmentManager supportFragmentManager;
        Context context = ((B1R) aqS93S0300000_4.l0).getContext();
        o.LJIIIIZZ(context, "context");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            PaymentMethod paymentMethod = (PaymentMethod) aqS93S0300000_4.l1;
            PaymentInfoVH2 paymentInfoVH2 = (PaymentInfoVH2) aqS93S0300000_4.l2;
            o.LJIIIIZZ(paymentMethod, "paymentMethod");
            C27949Ay1.LJIIJJI(paymentMethod, "tiktokec_button_click");
            paymentInfoVH2.M().Fw0(supportFragmentManager, paymentMethod, OrderSubmitViewModel.Wv0(paymentInfoVH2.M(), paymentMethod, null, null, 6), "EDIT_CARD");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$193(AqS93S0300000_4 aqS93S0300000_4) {
        String str;
        CommuteType commuteType;
        String paymentMethodBindUrl;
        Object obj = ((PaymentInfoVH2) aqS93S0300000_4.l0).M().LLIL;
        if (obj == null) {
            obj = new LinkedHashMap();
        }
        Context context = ((B1R) aqS93S0300000_4.l1).getContext();
        o.LJIIIIZZ(context, "context");
        C72264SXs.LIZ(context).LJIIIIZZ(C27739Aud.LJI(obj), "payment_track_params");
        PaymentMethod paymentMethod = (PaymentMethod) aqS93S0300000_4.l2;
        BindInfo bindInfo = paymentMethod.bindInfo;
        String str2 = null;
        if (bindInfo != null) {
            str = bindInfo.schema;
        } else {
            str = null;
        }
        String str3 = paymentMethod.packageName;
        CommuteInfo LJ = paymentMethod.LJ();
        if (LJ != null) {
            commuteType = LJ.commuteType;
        } else {
            commuteType = null;
        }
        if (str != null && C78685UuP.LJJJZ(str)) {
            if (commuteType != null) {
                str2 = C61841OOv.LIZ(commuteType);
            }
            Uri.Builder buildUpon = UriProtector.parse(str).buildUpon();
            buildUpon.appendQueryParameter("source", "order_submit");
            if (str2 != null && str2.length() != 0) {
                buildUpon.appendQueryParameter("commute_type", str2);
            }
            PaymentMethod paymentMethod2 = (PaymentMethod) aqS93S0300000_4.l2;
            paymentMethod2.getClass();
            String uuid = UUID.randomUUID().toString();
            paymentMethod2.LIZLLL = uuid;
            if (uuid != null && uuid.length() != 0) {
                buildUpon.appendQueryParameter("idempotency_key", uuid);
            }
            Context context2 = ((B1R) aqS93S0300000_4.l1).getContext();
            o.LJIIIIZZ(context2, "context");
            String builder = buildUpon.toString();
            o.LJIIIIZZ(builder, "builder.toString()");
            C61836OOq.LIZ(context2, uuid, str3, builder, commuteType, "ordersubmit");
        } else {
            OrderSubmitViewModel M = ((PaymentInfoVH2) aqS93S0300000_4.l0).M();
            PaymentMethod paymentMethod3 = (PaymentMethod) aqS93S0300000_4.l2;
            InterfaceC88472Yns<? super String, C76800UCe> aqS29S1300000_4 = new AqS29S1300000_4((B1R) aqS93S0300000_4.l1, paymentMethod3, str3, commuteType, 3);
            M.getClass();
            if (paymentMethod3 != null) {
                BindInfoItem bindInfoItem = (BindInfoItem) ((LinkedHashMap) M.LLLI).get(paymentMethod3.id);
                if (bindInfoItem == null || (paymentMethodBindUrl = bindInfoItem.getPaymentMethodBindUrl()) == null || paymentMethodBindUrl.length() == 0) {
                    M.setState(C27798Ava.LJLIL);
                    M.Nw0(paymentMethod3, false, aqS29S1300000_4);
                } else {
                    aqS29S1300000_4.invoke(paymentMethodBindUrl);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$194(AqS93S0300000_4 aqS93S0300000_4) {
        return ((AEY) aqS93S0300000_4.l0).LJIIJJI((Context) aqS93S0300000_4.l1, (AttributeSet) aqS93S0300000_4.l2);
    }

    public static final Object invoke$197(AqS93S0300000_4 aqS93S0300000_4) {
        String str;
        C237559Tz c237559Tz = new C237559Tz();
        User user = (User) aqS93S0300000_4.l0;
        Aweme aweme = ((ProfileEnterpriseBAAssem) aqS93S0300000_4.l1).getAweme();
        String bioUrl = ((User) aqS93S0300000_4.l0).getBioUrl();
        if (bioUrl == null) {
            bioUrl = "";
        }
        if (((ProfileEnterpriseBAAssem) aqS93S0300000_4.l1).L7()) {
            str = "personal_homepage";
        } else {
            str = "others_homepage";
        }
        c237559Tz.LJIILIIL(user, aweme, bioUrl, str);
        new C237559Tz().LJII("ttelite_BA_external_link_clicked", new String[0]);
        ((ProfileEnterpriseBAAssem) aqS93S0300000_4.l1).C3((User) aqS93S0300000_4.l0, "web_link");
        Context context = ((ProfileEnterpriseBAAssem) aqS93S0300000_4.l1).getContext();
        String action = ((OfflineInfo) aqS93S0300000_4.l2).getAction();
        String text = ((OfflineInfo) aqS93S0300000_4.l2).getText();
        C73340SqO.LJIJI().getClass();
        if (!NO5.LJI(context, action, true)) {
            C73340SqO.LJIJI().getClass();
            NO5.LJII(context, action, text);
        }
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$199(AqS93S0300000_4 aqS93S0300000_4) {
        aqS93S0300000_4.invoke$176();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$203(AqS93S0300000_4 aqS93S0300000_4) {
        C78946Uyc.LJJII((ReturnPoliciesFragment) aqS93S0300000_4.l0, new C70887Rrv(), new AqS170S0100000_4((ReturnPoliciesFragment) aqS93S0300000_4.l0, 1649));
        String str = ((ContactDetail) aqS93S0300000_4.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((C2RM) aqS93S0300000_4.l2).getContext(), UriProtector.parse(str).toString()).open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$204(AqS93S0300000_4 aqS93S0300000_4) {
        C78946Uyc.LJJII((ReturnPoliciesFragment) aqS93S0300000_4.l0, new C70887Rrv(), new AqS170S0100000_4((ReturnPoliciesFragment) aqS93S0300000_4.l0, 1650));
        String str = ((ContactDetail) aqS93S0300000_4.l1).link;
        if (str != null) {
            SmartRouter.buildRoute(((C2RM) aqS93S0300000_4.l2).getContext(), UriProtector.parse(str).toString()).open();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS93S0300000_4 aqS93S0300000_4) {
        MutableLiveData<List<Keyword>> iv0 = ((FilterVideoKeywordsViewModel) aqS93S0300000_4.l0).iv0();
        List<Keyword> value = ((FilterVideoKeywordsViewModel) aqS93S0300000_4.l0).iv0().getValue();
        if (value != null) {
            value.remove((Keyword) aqS93S0300000_4.l2);
        } else {
            value = null;
        }
        iv0.setValue(value);
        ((InterfaceC65784Pro) aqS93S0300000_4.l1).invoke();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$95(AqS93S0300000_4 aqS93S0300000_4) {
        List<Icon> list;
        C26705Adx c26705Adx = (C26705Adx) aqS93S0300000_4.l0;
        C119774mz c119774mz = c26705Adx.LJLJJL;
        ImageRichText imageRichText = ((UserTrustItemDescriptionChunk) aqS93S0300000_4.l1).textWithImage;
        if (imageRichText != null) {
            list = imageRichText.icons;
        } else {
            list = null;
        }
        C78977Uz7.LJJIIJZLJL(c119774mz, list, new AqS135S0200000_4(c26705Adx, (UserTrustItemAdapter) aqS93S0300000_4.l2, 59), C26704Adw.INSTANCE);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS93S0300000_4(X.B1R r3, com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2 r4, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 192: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r1.l2 = r5
            r0 = 0
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r4
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS93S0300000_4.<init>(X.B1R, com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoVH2, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(C76732zl c76732zl, C76732zl c76732zl2, MineNavBarFindFriendsAssem mineNavBarFindFriendsAssem, C214378bB<C235439Lv, ProfileMafRedPointsVM> c214378bB) {
        super(0);
        this.$t = c214378bB;
        this.l0 = c76732zl;
        this.l1 = c76732zl2;
        this.l2 = mineNavBarFindFriendsAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(C119774mz c119774mz, C119774mz c119774mz2, List<Image> list, C26087ALr c26087ALr) {
        super(0);
        this.$t = c26087ALr;
        this.l0 = c119774mz;
        this.l1 = c119774mz2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(C119774mz c119774mz, C119774mz c119774mz2, List<C26798AfS> list, PdpReviewImageViewHolder pdpReviewImageViewHolder) {
        super(0);
        this.$t = pdpReviewImageViewHolder;
        this.l0 = c119774mz;
        this.l1 = c119774mz2;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(C236079Oh c236079Oh, ProfileActivityIcon profileActivityIcon, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = c236079Oh;
        this.l1 = profileActivityIcon;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(C253249wm c253249wm, AccountDeletedActivity accountDeletedActivity, AgeGateOption ageGateOption, int i) {
        super(0);
        this.$t = i;
        this.l0 = c253249wm;
        this.l1 = accountDeletedActivity;
        this.l2 = ageGateOption;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(AEY aey, Context context, AttributeSet attributeSet, int i) {
        super(0);
        this.$t = i;
        this.l0 = aey;
        this.l1 = context;
        this.l2 = attributeSet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(C26705Adx c26705Adx, UserTrustItemDescriptionChunk userTrustItemDescriptionChunk, UserTrustItemAdapter userTrustItemAdapter, int i) {
        super(0);
        this.$t = i;
        this.l0 = c26705Adx;
        this.l1 = userTrustItemDescriptionChunk;
        this.l2 = userTrustItemAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns3, InterfaceC35811ar<Boolean> interfaceC35811ar) {
        super(0);
        this.$t = interfaceC35811ar;
        this.l0 = interfaceC88472Yns;
        this.l1 = interfaceC88472Yns2;
        this.l2 = interfaceC88472Yns3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(TextView textView, ProfileUserIdAssem profileUserIdAssem, User user, int i) {
        super(0);
        this.$t = i;
        this.l0 = textView;
        this.l1 = profileUserIdAssem;
        this.l2 = user;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(Fragment fragment, InterfaceC65350Pko interfaceC65350Pko, InterfaceC65350Pko interfaceC65350Pko2, int i) {
        super(0);
        this.$t = i;
        this.l0 = fragment;
        this.l1 = interfaceC65350Pko;
        this.l2 = interfaceC65350Pko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(JediViewHolder jediViewHolder, InterfaceC65350Pko interfaceC65350Pko, InterfaceC65350Pko interfaceC65350Pko2, int i) {
        super(0);
        this.$t = i;
        this.l0 = jediViewHolder;
        this.l1 = interfaceC65350Pko;
        this.l2 = interfaceC65350Pko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(Widget widget, InterfaceC65350Pko interfaceC65350Pko, InterfaceC65350Pko interfaceC65350Pko2, int i) {
        super(0);
        this.$t = i;
        this.l0 = widget;
        this.l1 = interfaceC65350Pko;
        this.l2 = interfaceC65350Pko2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(FilterVideoKeywordsViewModel filterVideoKeywordsViewModel, FilterVideoKeywordsViewModel filterVideoKeywordsViewModel2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, Keyword keyword) {
        super(0);
        this.$t = keyword;
        this.l0 = filterVideoKeywordsViewModel;
        this.l1 = filterVideoKeywordsViewModel2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(FilterVideoKeywordsViewModel filterVideoKeywordsViewModel, AqS151S0200000_4 aqS151S0200000_4, Keyword keyword, int i) {
        super(0);
        this.$t = i;
        this.l0 = filterVideoKeywordsViewModel;
        this.l1 = aqS151S0200000_4;
        this.l2 = keyword;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(Response response, Response<PayResponseData> response2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C28064Azs c28064Azs) {
        super(0);
        this.$t = c28064Azs;
        this.l0 = response;
        this.l1 = response2;
        this.l2 = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(PayResponseData payResponseData, OrderSubmitViewModel orderSubmitViewModel, Context context, int i) {
        super(0);
        this.$t = i;
        this.l0 = payResponseData;
        this.l1 = orderSubmitViewModel;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(ReturnPoliciesFragment returnPoliciesFragment, ContactDetail contactDetail, C2RM c2rm, int i) {
        super(0);
        this.$t = i;
        this.l0 = returnPoliciesFragment;
        this.l1 = contactDetail;
        this.l2 = c2rm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(USMainOrderInfoVH uSMainOrderInfoVH, LogisticDTO logisticDTO, C27117Akb c27117Akb, int i) {
        super(0);
        this.$t = i;
        this.l0 = uSMainOrderInfoVH;
        this.l1 = logisticDTO;
        this.l2 = c27117Akb;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem, SeriesDraftAdvanceVoucherPriceAssem seriesDraftAdvanceVoucherPriceAssem2, InterfaceC35811ar<Boolean> interfaceC35811ar, Context context) {
        super(0);
        this.$t = context;
        this.l0 = seriesDraftAdvanceVoucherPriceAssem;
        this.l1 = seriesDraftAdvanceVoucherPriceAssem2;
        this.l2 = interfaceC35811ar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(User user, ProfileEnterpriseBAAssem profileEnterpriseBAAssem, OfflineInfo offlineInfo, int i) {
        super(0);
        this.$t = i;
        this.l0 = user;
        this.l1 = profileEnterpriseBAAssem;
        this.l2 = offlineInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS93S0300000_4(User user, User user2, Map<Integer, C243819hZ> map, ProfileBindAccountAssem profileBindAccountAssem) {
        super(0);
        this.$t = profileBindAccountAssem;
        this.l0 = user;
        this.l1 = user2;
        this.l2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(MyProfileGuideWidgetV2 myProfileGuideWidgetV2, ProfileState profileState, MyProfileGuideState myProfileGuideState, int i) {
        super(0);
        this.$t = i;
        this.l0 = myProfileGuideWidgetV2;
        this.l1 = profileState;
        this.l2 = myProfileGuideState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS93S0300000_4(ProfileHeaderCTAComponent profileHeaderCTAComponent, EnumC234309Hm enumC234309Hm, EnumC234309Hm enumC234309Hm2, int i) {
        super(0);
        this.$t = i;
        this.l0 = profileHeaderCTAComponent;
        this.l1 = enumC234309Hm;
        this.l2 = enumC234309Hm2;
    }
}
