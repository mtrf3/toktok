package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC87490YVi;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C0NB;
import X.C12460eI;
import X.C17N;
import X.C188447aS;
import X.C1DF;
import X.C2314396l;
import X.C253179wf;
import X.C25620zW;
import X.C26227ARb;
import X.C32341Cmf;
import X.C32420Cnw;
import X.C32442CoI;
import X.C35936E8m;
import X.C42625Go9;
import X.C43001GuD;
import X.C43I;
import X.C45804HyK;
import X.C47261Igj;
import X.C51733KSb;
import X.C55096Ljo;
import X.C56179M3b;
import X.C61447O9r;
import X.C61491OBj;
import X.C63081OpJ;
import X.C65300Pk0;
import X.C68322mC;
import X.C73340SqO;
import X.C74053T4n;
import X.C76800UCe;
import X.C76964UIm;
import X.C78685UuP;
import X.C79043V0l;
import X.C80648Vky;
import X.C84459XCt;
import X.C84460XCu;
import X.C85136XbA;
import X.C85144XbI;
import X.C85147XbL;
import X.C85149XbN;
import X.C85150XbO;
import X.C85216XcS;
import X.C85218XcU;
import X.C85257Xd7;
import X.C85258Xd8;
import X.C85355Xeh;
import X.C85679Xjv;
import X.C85865Xmv;
import X.C86067XqB;
import X.C86109Xqr;
import X.C86457XwT;
import X.C86496Xx6;
import X.C86861Y7d;
import X.C86863Y7f;
import X.C87123bQ;
import X.C87482YVa;
import X.C87483YVb;
import X.C87484YVc;
import X.C8W0;
import X.C96Q;
import X.DJX;
import X.DialogC25756A8y;
import X.EOO;
import X.EnumC85364Xeq;
import X.EnumC86865Y7h;
import X.FMX;
import X.IO0;
import X.InterfaceC55235Lm3;
import X.InterfaceC85336XeO;
import X.InterfaceC86816Y5k;
import X.InterfaceC87439YTj;
import X.InterfaceC88471Ynr;
import X.KEI;
import X.KOV;
import X.MF8;
import X.ORZ;
import X.PU0;
import X.QQI;
import X.UC0;
import X.VW9;
import X.ViewOnClickListenerC86063Xq7;
import X.X1D;
import X.XB7;
import X.XCZ;
import X.YFI;
import X.YVK;
import X.YVN;
import X.YVR;
import X.YVS;
import X.YVT;
import X.YVU;
import X.YVV;
import X.YVW;
import X.YVX;
import X.YVY;
import X.YVZ;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayExpSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityAssem;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.assem.VideoStickerContentStatusAssem;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.creator.model.response.NoticeFilterModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSErrorModel;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryAssem;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDetailDiscoveryViewModel;
import com.ss.android.ugc.aweme.poi.detail.discovery.PoiDiscoveryApi;
import com.ss.android.ugc.aweme.poi.detail.discovery.category.CardItemCell;
import com.ss.android.ugc.aweme.poi.experiment.PoiServerConfigSettings;
import com.ss.android.ugc.aweme.poi.search.PoiSearchAssem;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionAssemV2;
import com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2;
import com.ss.android.ugc.aweme.profile.tab.profiletab.mob.IProfileTabEventAbility;
import com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment;
import com.ss.android.ugc.aweme.profile.widgets.ad.UserProfileADAssemV2;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerAssem;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.MineAwemePagerAssem;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.UserAwemePagerAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.PhotoModeRelatedSearchUiAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.SearchRelatedSuggestionUiAssem;
import com.ss.android.ugc.aweme.services.IRegistrationAgeGateService;
import com.ss.android.ugc.profile.platform.business.tabs.container.AwemePagerAssemV2;
import com.ss.android.ugc.profile.platform.business.tabs.container.MineAwemePagerAssemV2;
import com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2;
import com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl;
import com.zhiliaoapp.musically.R;
import ij2.a;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes16.dex */
public class AqS197S0100000_15 extends AbstractC65781Prl implements InterfaceC88471Ynr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case 9:
                return invoke$9(this, obj, obj2);
            case 10:
                return invoke$10(this, obj, obj2);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2);
            case 12:
                return invoke$12(this, obj, obj2);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return invoke$16(this, obj, obj2);
            case 17:
                return invoke$17(this, obj, obj2);
            case 18:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case 20:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case 24:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case 33:
                return invoke$33(this, obj, obj2);
            case 34:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case 36:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case LiveBroadcastTaskResourceIdSetting.DEFAULT /* 43 */:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                return invoke$48(this, obj, obj2);
            case C61447O9r.LJIIJ:
                return invoke$49(this, obj, obj2);
            case 50:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(XB7 xb7, int i) {
        super(2);
        this.$t = i;
        this.l0 = xb7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C84459XCt c84459XCt, int i) {
        super(2);
        this.$t = i;
        this.l0 = c84459XCt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C84460XCu c84460XCu, int i) {
        super(2);
        this.$t = i;
        this.l0 = c84460XCu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C85355Xeh c85355Xeh, int i) {
        super(2);
        this.$t = i;
        this.l0 = c85355Xeh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C85679Xjv c85679Xjv, int i) {
        super(2);
        this.$t = i;
        this.l0 = c85679Xjv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C85865Xmv c85865Xmv, int i) {
        super(2);
        this.$t = i;
        this.l0 = c85865Xmv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(ViewOnClickListenerC86063Xq7 viewOnClickListenerC86063Xq7, int i) {
        super(2);
        this.$t = i;
        this.l0 = viewOnClickListenerC86063Xq7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C86109Xqr c86109Xqr, int i) {
        super(2);
        this.$t = i;
        this.l0 = c86109Xqr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(C86861Y7d c86861Y7d, int i) {
        super(2);
        this.$t = i;
        this.l0 = c86861Y7d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS197S0100000_15(YVK.a aVar, YVK<YVS, AbstractC87490YVi, YVR>.a<YVY> aVar2) {
        super(2);
        this.$t = aVar2;
        this.l0 = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS197S0100000_15(InterfaceC88471Ynr interfaceC88471Ynr, InterfaceC88471Ynr<? super S, ? super E, ? extends YVN<? extends STATE, ? extends SIDE_EFFECT>> interfaceC88471Ynr2) {
        super(2);
        this.$t = interfaceC88471Ynr2;
        this.l0 = interfaceC88471Ynr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(FragmentManager fragmentManager, int i) {
        super(2);
        this.$t = i;
        this.l0 = fragmentManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(RecentDevicesFragmentViewModel recentDevicesFragmentViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = recentDevicesFragmentViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(TwoStepVerificationActivityAssem twoStepVerificationActivityAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = twoStepVerificationActivityAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = twoStepVerificationActivityViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(VideoStickerContentStatusAssem videoStickerContentStatusAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoStickerContentStatusAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(PoiDetailDiscoveryAssem poiDetailDiscoveryAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiDetailDiscoveryAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(CardItemCell cardItemCell, int i) {
        super(2);
        this.$t = i;
        this.l0 = cardItemCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(PoiSearchAssem poiSearchAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiSearchAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(PoiPublishExtensionAssemV2 poiPublishExtensionAssemV2, int i) {
        super(2);
        this.$t = i;
        this.l0 = poiPublishExtensionAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(UserProfileADAssemV2 userProfileADAssemV2, int i) {
        super(2);
        this.$t = i;
        this.l0 = userProfileADAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(AwemePagerAssem awemePagerAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = awemePagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(MineAwemePagerAssem mineAwemePagerAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = mineAwemePagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(UserAwemePagerAssem userAwemePagerAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = userAwemePagerAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(PhotoModeRelatedSearchUiAssem photoModeRelatedSearchUiAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = photoModeRelatedSearchUiAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(SearchRelatedSuggestionUiAssem searchRelatedSuggestionUiAssem, int i) {
        super(2);
        this.$t = i;
        this.l0 = searchRelatedSuggestionUiAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(IRegistrationAgeGateService iRegistrationAgeGateService, int i) {
        super(2);
        this.$t = i;
        this.l0 = iRegistrationAgeGateService;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(AwemePagerAssemV2 awemePagerAssemV2, int i) {
        super(2);
        this.$t = i;
        this.l0 = awemePagerAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(MineAwemePagerAssemV2 mineAwemePagerAssemV2, int i) {
        super(2);
        this.$t = i;
        this.l0 = mineAwemePagerAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(UserAwemePagerAssemV2 userAwemePagerAssemV2, int i) {
        super(2);
        this.$t = i;
        this.l0 = userAwemePagerAssemV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(AqS146S0200000_15 aqS146S0200000_15, int i) {
        super(2);
        this.$t = i;
        this.l0 = aqS146S0200000_15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS197S0100000_15(FragmentManager fragmentManager, Bundle bundle, int i) {
        super(2);
        this.$t = i;
        this.l0 = fragmentManager;
    }

    public static final Object invoke$0(AqS197S0100000_15 aqS197S0100000_15, Object state, Object event) {
        o.LJIIIZ(state, "state");
        o.LJIIIZ(event, "event");
        return ((InterfaceC88471Ynr) aqS197S0100000_15.l0).invoke(state, event);
    }

    public static final Object invoke$1(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87484YVc c87484YVc = C87484YVc.LIZ;
        YVX yvx = YVX.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87484YVc, yvx);
    }

    public static final Object invoke$10(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87484YVc c87484YVc = C87484YVc.LIZ;
        YVV yvv = YVV.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87484YVc, yvv);
    }

    public static final Object invoke$11(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87484YVc c87484YVc = C87484YVc.LIZ;
        YVV yvv = YVV.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87484YVc, yvv);
    }

    public static final Object invoke$12(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        ((TwoStepVerificationActivityAssem) aqS197S0100000_15.l0).H3().setEnabled(booleanValue);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object, java.lang.String] */
    public static final Object invoke$13(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        boolean z;
        T t;
        C85149XbN it = (C85149XbN) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        TwoStepVerificationActivityAssem twoStepVerificationActivityAssem = (TwoStepVerificationActivityAssem) aqS197S0100000_15.l0;
        twoStepVerificationActivityAssem.getClass();
        C85136XbA c85136XbA = it.LIZ;
        if (c85136XbA != null) {
            C85144XbI.LIZLLL(twoStepVerificationActivityAssem.LJLLLLLL.getVerifyTypeFromMethod(c85136XbA.LIZJ), twoStepVerificationActivityAssem.getEnterFrom());
            Context context = twoStepVerificationActivityAssem.getContext();
            if (context != null) {
                if (it.LIZIZ == IO0.REMOVE) {
                    z = true;
                } else {
                    z = false;
                }
                C68322mC c68322mC = new C68322mC();
                ?? string = context.getString(R.string.t8_);
                o.LJIIIIZZ(string, "ctx.getString(R.string.t…age_emailModal_updateBtn)");
                c68322mC.element = string;
                C68322mC c68322mC2 = new C68322mC();
                if (z) {
                    String string2 = context.getString(R.string.t88);
                    o.LJIIIIZZ(string2, "{\n                    ct…oveBtn)\n                }");
                    t = string2;
                } else {
                    String string3 = context.getString(R.string.t8w);
                    o.LJIIIIZZ(string3, "{\n                    ct…offBtn)\n                }");
                    t = string3;
                }
                c68322mC2.element = t;
                String string4 = context.getString(R.string.t97);
                o.LJIIIIZZ(string4, "ctx.getString(R.string.t…_trustedDevice_cancelBtn)");
                C26227ARb c26227ARb = new C26227ARb(context);
                int i = C85150XbO.LIZ[c85136XbA.LIZJ.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                c26227ARb.LJFF(context.getString(R.string.t83));
                                c26227ARb.LIZIZ(context.getString(R.string.t82));
                            }
                        } else {
                            c26227ARb.LJFF(context.getString(R.string.t8i));
                            c26227ARb.LIZIZ(context.getString(R.string.t8h));
                        }
                    } else {
                        c26227ARb.LJFF(context.getString(R.string.t89, c85136XbA.LIZLLL));
                        c26227ARb.LIZIZ(context.getString(R.string.t87));
                    }
                } else {
                    c26227ARb.LJFF(context.getString(R.string.t8n, c85136XbA.LIZLLL));
                    c26227ARb.LIZIZ(context.getString(R.string.t8m));
                }
                c26227ARb.LIZJ(new AqS181S0100000_15(twoStepVerificationActivityAssem, 294));
                UC0.LIZJ(c26227ARb, new C85147XbL(c85136XbA, c68322mC, c68322mC2, string4, twoStepVerificationActivityAssem, it, z));
                c26227ARb.LJI().LIZLLL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$14(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        ((IRegistrationAgeGateService) aqS197S0100000_15.l0).displayFeedback(new PNSFeedbackModel(new PNSErrorModel(Integer.valueOf(((Number) obj2).intValue()), (String) obj), null, null, 6, null));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        UIAssem selectSubscribe = (UIAssem) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.withState(((VideoStickerContentStatusAssem) aqS197S0100000_15.l0).x3(), new AqS146S0200000_15((List) obj2, (List<C87123bQ>) aqS197S0100000_15.l0, (VideoStickerContentStatusAssem) 21));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object targetStatus) {
        o.LJIIIZ(obj, "<anonymous parameter 0>");
        o.LJIIIZ(targetStatus, "targetStatus");
        InnerPushMessage curMsg = ((C86109Xqr) aqS197S0100000_15.l0).getCurMsg();
        if (curMsg != null) {
            C86496Xx6.LJI(curMsg, "follow");
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        List<PoiDiscoveryApi.PoiCategory> list;
        InterfaceC55235Lm3 LJIIZILJ;
        IPoiDetailInfoVAbility iPoiDetailInfoVAbility;
        PoiListApi.PoiDetailResponse EO;
        List list2;
        Activity LJIJJ;
        int i;
        C8W0 selectSubscribe = (C8W0) obj;
        PoiDiscoveryApi.PoiDiscoveryCardListResponse poiDiscoveryCardListResponse = (PoiDiscoveryApi.PoiDiscoveryCardListResponse) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C74053T4n c74053T4n = ((PoiDetailDiscoveryAssem) aqS197S0100000_15.l0).LJLLJ;
        Throwable th = null;
        if (c74053T4n != null) {
            c74053T4n.LJIIIZ();
            KOV kov = ((PoiDetailDiscoveryAssem) aqS197S0100000_15.l0).LJLLL;
            if (kov != null) {
                C12460eI.LIZ(kov);
                if (poiDiscoveryCardListResponse == null || (list = poiDiscoveryCardListResponse.poiCategoryList) == null || list.isEmpty() || (LJIIZILJ = C55096Ljo.LJIIZILJ(selectSubscribe)) == null || (iPoiDetailInfoVAbility = (IPoiDetailInfoVAbility) C55096Ljo.LIZ(LJIIZILJ, IPoiDetailInfoVAbility.class, null)) == null || (EO = iPoiDetailInfoVAbility.EO()) == null || !o.LJ(EO.haveRegionDiscovery, Boolean.TRUE)) {
                    ((PoiDetailDiscoveryAssem) aqS197S0100000_15.l0).M3(false);
                } else {
                    ((PoiDetailDiscoveryAssem) aqS197S0100000_15.l0).M3(true);
                    List<PoiDiscoveryApi.PoiCategory> list3 = poiDiscoveryCardListResponse.poiCategoryList;
                    if (list3 != null) {
                        list2 = ORZ.LJLL(list3);
                    } else {
                        list2 = null;
                    }
                    PoiDetailDiscoveryAssem poiDetailDiscoveryAssem = (PoiDetailDiscoveryAssem) aqS197S0100000_15.l0;
                    ArrayList arrayList = new ArrayList();
                    if (list2 != null) {
                        int i2 = 0;
                        for (Object obj3 : list2) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                PoiDiscoveryApi.PoiCategory poiCategory = (PoiDiscoveryApi.PoiCategory) obj3;
                                if (poiCategory != null) {
                                    C74053T4n c74053T4n2 = poiDetailDiscoveryAssem.LJLLJ;
                                    if (c74053T4n2 != null) {
                                        KEI LJII = c74053T4n2.LJII();
                                        LJII.LIZ = poiCategory.tabCode;
                                        LJII.LIZIZ(poiCategory.tabName);
                                        C74053T4n c74053T4n3 = poiDetailDiscoveryAssem.LJLLJ;
                                        if (c74053T4n3 != null) {
                                            C74053T4n.LIZJ(c74053T4n3, LJII, 0, o.LJ(poiDetailDiscoveryAssem.N3().LJLILLLLZI, poiCategory.tabCode), 2);
                                            arrayList.add(PoiDiscoveryApi.PoiCategory.LIZ(poiCategory, poiDetailDiscoveryAssem.LJLLI, i2, list2.size(), false, 35));
                                            th = null;
                                        } else {
                                            o.LJIJI("tabBar");
                                            throw th;
                                        }
                                    } else {
                                        o.LJIJI("tabBar");
                                        throw th;
                                    }
                                }
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw th;
                            }
                        }
                    }
                    KOV kov2 = poiDetailDiscoveryAssem.LJLLL;
                    if (kov2 != null) {
                        kov2.getViewItemOperator().getState().LJIILLIIL(arrayList);
                        Boolean bool = poiDiscoveryCardListResponse.inPoiRegion;
                        if (bool != null) {
                            PoiDetailDiscoveryAssem poiDetailDiscoveryAssem2 = (PoiDetailDiscoveryAssem) aqS197S0100000_15.l0;
                            boolean booleanValue = bool.booleanValue();
                            Context context = selectSubscribe.getContext();
                            if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (LJIJJ instanceof ActivityC45651qj)) {
                                PoiDetailDiscoveryViewModel N3 = poiDetailDiscoveryAssem2.N3();
                                ActivityC45651qj activityC45651qj = (ActivityC45651qj) LJIJJ;
                                N3.getClass();
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("GPS - tryUpdateGPS ");
                                LIZ.append(N3.LJLJJI);
                                LIZ.append("， inPoiRegion: ");
                                LIZ.append(booleanValue);
                                C188447aS.LIZ(X1D.LIZIZ(LIZ));
                                if (!N3.LJLJJI) {
                                    N3.LJLJJI = true;
                                    if (booleanValue) {
                                        if (LocationServiceImpl.LJIJJ().LJIJ("android.permission.ACCESS_COARSE_LOCATION")) {
                                            TokenCert with = TokenCert.Companion.with("bpea-poi_detail_discovery_fetch_gps");
                                            with.auth("sgix");
                                            C51733KSb.LIZ("poi", "anchor", with, null, new C85218XcU(), 32);
                                        } else {
                                            Integer num = PoiServerConfigSettings.LIZ().regionPoiDiscoveryGpsFreq;
                                            if (num != null) {
                                                i = num.intValue();
                                            } else {
                                                i = 0;
                                            }
                                            long j = 0;
                                            long currentTimeMillis = System.currentTimeMillis() - DJX.LIZ.getLong(C43001GuD.LJIILJJIL(), 0L);
                                            if (i != -1) {
                                                if (i <= 0) {
                                                    j = 604800000;
                                                } else {
                                                    j = 1000 * i * 24 * 60 * 60;
                                                }
                                            }
                                            StringBuilder LIZ2 = X1D.LIZ();
                                            LIZ2.append("canShowPermissionDialogInPDDiscovery: timeGap: ");
                                            LIZ2.append(currentTimeMillis / 86400000);
                                            LIZ2.append(", timeLimit: ");
                                            LIZ2.append(j / 86400000);
                                            C188447aS.LIZ(X1D.LIZIZ(LIZ2));
                                            if (currentTimeMillis > j) {
                                                C85258Xd8 c85258Xd8 = new C85258Xd8(null, null, null, false, 255);
                                                c85258Xd8.LIZ = "poi_detail";
                                                c85258Xd8.LIZIZ = "regional_places_discover";
                                                C56179M3b.LIZ.LJIJI("poi", "anchor", TokenCert.Companion.with("bpea-poi_detail_discovery_request_permission"), activityC45651qj, c85258Xd8, new C85216XcS(N3), new C17N());
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        o.LJIJI("viewPager");
                        throw null;
                    }
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("tabBar");
        throw null;
    }

    public static final Object invoke$18(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        String itemID = (String) obj2;
        o.LJIIIZ(itemID, "itemID");
        StringBuilder LIZIZ = C25620zW.LIZIZ("exposeCallback: itemId:", itemID, ", bindingPos: ");
        LIZIZ.append(((CardItemCell) aqS197S0100000_15.l0).getBindingAdapterPosition());
        C188447aS.LIZ(X1D.LIZIZ(LIZIZ));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        Boolean bool = (Boolean) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (bool != null) {
            bool.booleanValue();
            if (bool.booleanValue()) {
                PoiSearchAssem poiSearchAssem = (PoiSearchAssem) aqS197S0100000_15.l0;
                View view = ((PoiSearchAssem) aqS197S0100000_15.l0).LJLIL;
                if (view != null) {
                    Context context = view.getContext();
                    o.LJIIIIZZ(context, "content.context");
                    poiSearchAssem.LJLJL = new DialogC25756A8y(context);
                    DialogC25756A8y dialogC25756A8y = ((PoiSearchAssem) aqS197S0100000_15.l0).LJLJL;
                    if (dialogC25756A8y != null) {
                        dialogC25756A8y.LIZIZ(R.string.rbh);
                    }
                    DialogC25756A8y dialogC25756A8y2 = ((PoiSearchAssem) aqS197S0100000_15.l0).LJLJL;
                    if (dialogC25756A8y2 != null && !new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y2, new Object[0], "void", new C65300Pk0(false, "()V", "2364167091517416210")).LIZ) {
                        dialogC25756A8y2.show();
                    }
                } else {
                    o.LJIJI("content");
                    throw null;
                }
            } else {
                DialogC25756A8y dialogC25756A8y3 = ((PoiSearchAssem) aqS197S0100000_15.l0).LJLJL;
                if (dialogC25756A8y3 != null) {
                    dialogC25756A8y3.dismiss();
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87483YVb c87483YVb = C87483YVb.LIZ;
        YVW yvw = YVW.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87483YVb, yvw);
    }

    public static final Object invoke$20(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        Boolean bool = (Boolean) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        PoiPublishExtensionAssemV2 poiPublishExtensionAssemV2 = (PoiPublishExtensionAssemV2) aqS197S0100000_15.l0;
        EnumC85364Xeq enumC85364Xeq = poiPublishExtensionAssemV2.LJLLL;
        if (enumC85364Xeq == EnumC85364Xeq.STATUS_POI_LIST_SHOW || enumC85364Xeq == EnumC85364Xeq.STATUS_POI_REFRESH_END) {
            poiPublishExtensionAssemV2.P3(bool);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0071, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008b, code lost:
    
        if (r0.LJIIIZ() != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$21(kotlin.jvm.internal.AqS197S0100000_15 r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS197S0100000_15.invoke$21(kotlin.jvm.internal.AqS197S0100000_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$22(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        PoiPublishExtensionAssemV2 poiPublishExtensionAssemV2;
        EnumC85364Xeq enumC85364Xeq;
        C8W0 selectSubscribe = (C8W0) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (((PoiPublishExtensionAssemV2) aqS197S0100000_15.l0).I3().getState().LJLILLLLZI == null && ((enumC85364Xeq = (poiPublishExtensionAssemV2 = (PoiPublishExtensionAssemV2) aqS197S0100000_15.l0).LJLLL) == null || enumC85364Xeq != EnumC85364Xeq.STATUS_POI_SELECTED)) {
            if (poiPublishExtensionAssemV2.LJLLJ.LIZJ()) {
                PoiPublishExtensionVMV2 I3 = ((PoiPublishExtensionAssemV2) aqS197S0100000_15.l0).I3();
                ((InterfaceC85336XeO) I3.LJLL.getValue().getOperator()).LL(new C85257Xd7(I3, selectSubscribe));
                PoiPublishExtensionAssemV2 poiPublishExtensionAssemV22 = (PoiPublishExtensionAssemV2) aqS197S0100000_15.l0;
                poiPublishExtensionAssemV22.getClass();
                if (!poiPublishExtensionAssemV22._$_findCachedViewById(R.id.iol).getLocalVisibleRect(new Rect())) {
                    PoiPublishExtensionAssemV2.R3((PoiPublishExtensionAssemV2) aqS197S0100000_15.l0, EnumC85364Xeq.STATUS_POI_IDLE, false, 6);
                } else {
                    PoiPublishExtensionAssemV2.R3((PoiPublishExtensionAssemV2) aqS197S0100000_15.l0, EnumC85364Xeq.STATUS_POI_REFRESHING, false, 6);
                }
            } else {
                ((PoiPublishExtensionAssemV2) aqS197S0100000_15.l0).I3().hv0(null, selectSubscribe);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        Aweme aweme = (Aweme) obj;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (aweme != null) {
            ((UserProfileADAssemV2) aqS197S0100000_15.l0).LJLJL = aweme.isAd();
            if (C63081OpJ.LLJJLIIIJLLLLLLLZ(aweme)) {
                if (C1DF.LJIL(aweme)) {
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).A3(aweme);
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).v3(aweme);
                }
                ((UserProfileADAssemV2) aqS197S0100000_15.l0).x3(aweme);
                ((UserProfileADAssemV2) aqS197S0100000_15.l0).F3(0);
                ((UserProfileADAssemV2) aqS197S0100000_15.l0).I3(0);
            } else if (C63081OpJ.LLJL(aweme)) {
                ((UserProfileADAssemV2) aqS197S0100000_15.l0).A3(aweme);
                ((UserProfileADAssemV2) aqS197S0100000_15.l0).F3(0);
                ((UserProfileADAssemV2) aqS197S0100000_15.l0).H3(0);
            } else {
                C73340SqO.LJIJJLI().getClass();
                if (C61491OBj.LJLIIL(aweme)) {
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).v3(aweme);
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).H3(0);
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).I3(0);
                } else {
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).F3(0);
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).H3(0);
                    ((UserProfileADAssemV2) aqS197S0100000_15.l0).I3(0);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0134, code lost:
    
        if (r2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
    
        if (r2 != null) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$24(kotlin.jvm.internal.AqS197S0100000_15 r6, java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS197S0100000_15.invoke$24(kotlin.jvm.internal.AqS197S0100000_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$25(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            UserProfileADAssemV2 userProfileADAssemV2 = (UserProfileADAssemV2) aqS197S0100000_15.l0;
            userProfileADAssemV2.LJLJJI = false;
            userProfileADAssemV2.LJLJJL = false;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UserProfileADAssemV2 userProfileADAssemV2 = (UserProfileADAssemV2) aqS197S0100000_15.l0;
        userProfileADAssemV2.LJLLI = booleanValue;
        if (booleanValue) {
            userProfileADAssemV2.LJLLILLLL = true;
            C42625Go9.LIZIZ(selectSubscribe);
        } else {
            userProfileADAssemV2.LJLLJ = false;
            C42625Go9.LIZJ(selectSubscribe);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        AwemePagerAssem awemePagerAssem = (AwemePagerAssem) aqS197S0100000_15.l0;
        List<Integer> list = awemePagerAssem.LJLJJI;
        if (list != null && ((Number) ListProtector.get(list, awemePagerAssem.LJLJL)).intValue() != intValue) {
            ((AwemePagerAssem) aqS197S0100000_15.l0).C3(intValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        MF8.LIZIZ(intValue, ((MineAwemePagerAssem) aqS197S0100000_15.l0).q4());
        YFI yfi = ((MineAwemePagerAssem) aqS197S0100000_15.l0).LLILLJJLI;
        if (yfi != null) {
            yfi.LJJJJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        ((UserAwemePagerAssem) aqS197S0100000_15.l0).j7((String) obj, (String) obj2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87482YVa c87482YVa = C87482YVa.LIZ;
        YVU yvu = YVU.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87482YVa, yvu);
    }

    public static final Object invoke$30(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        UIAssem selectSubscribe = (UIAssem) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        MF8.LIZIZ(intValue, ((UserAwemePagerAssem) aqS197S0100000_15.l0).q4());
        MTAwemeListFragment mTAwemeListFragment = ((UserAwemePagerAssem) aqS197S0100000_15.l0).LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LJJJJ();
        }
        View view = null;
        if (intValue == 1) {
            UserAwemePagerAssem userAwemePagerAssem = (UserAwemePagerAssem) aqS197S0100000_15.l0;
            if (userAwemePagerAssem.LLILZIL) {
                userAwemePagerAssem.LLJ = true;
                View containerView = selectSubscribe.getContainerView();
                if (containerView != null) {
                    view = containerView.findViewById(R.id.mz6);
                }
                ((C2314396l) view).LIZJ();
            }
        } else {
            UserAwemePagerAssem userAwemePagerAssem2 = (UserAwemePagerAssem) aqS197S0100000_15.l0;
            if (userAwemePagerAssem2.LLJ) {
                userAwemePagerAssem2.LLJ = false;
                userAwemePagerAssem2.LLILZIL = true;
                View containerView2 = selectSubscribe.getContainerView();
                if (containerView2 != null) {
                    view = containerView2.findViewById(R.id.mz6);
                }
                C2314396l c2314396l = (C2314396l) view;
                c2314396l.LIZLLL(c2314396l.LJLIL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$31(AqS197S0100000_15 aqS197S0100000_15, Object view, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(view, "view");
        ((C85865Xmv) aqS197S0100000_15.l0).getUiActions().LJLIL.invoke(Integer.valueOf(intValue));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$32(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        AwemePagerAssemV2 awemePagerAssemV2 = (AwemePagerAssemV2) aqS197S0100000_15.l0;
        List<Integer> list = awemePagerAssemV2.LJLJJLL;
        if (list != null && ((Number) ListProtector.get(list, awemePagerAssemV2.LJLJLLL)).intValue() != intValue) {
            ((AwemePagerAssemV2) aqS197S0100000_15.l0).C3(intValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$33(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        MF8.LIZIZ(intValue, ((MineAwemePagerAssemV2) aqS197S0100000_15.l0).u4());
        YFI yfi = ((MineAwemePagerAssemV2) aqS197S0100000_15.l0).LLIL;
        if (yfi != null) {
            yfi.LJJJJ();
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        r1 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
    
        r2.LLJILLL = r3;
        r2.LLJJ = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.LLL) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        r2.LLL = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r7 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$34(kotlin.jvm.internal.AqS197S0100000_15 r5, java.lang.Object r6, java.lang.Object r7) {
        /*
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.ss.android.ugc.aweme.feed.model.Aweme) r7
            java.lang.String r0 = "$this$selectSubscribe"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2 r1 = (com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2) r1
            r4 = 0
            if (r7 == 0) goto L5b
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
        L12:
            r3 = 0
            boolean r0 = X.AV1.LJIIZILJ(r0, r3)
            r1.LLILLIZIL = r0
            java.lang.Object r1 = r5.l0
            com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2 r1 = (com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2) r1
            if (r7 == 0) goto L59
            boolean r0 = r7.isStoryFakeAweme()
        L23:
            r1.LLJ = r0
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2 r0 = (com.ss.android.ugc.profile.platform.business.tabs.container.other.UserAwemePagerAssemV2) r0
            com.ss.android.ugc.aweme.profile.ui.MTAwemeListFragment r2 = r0.LLIIJLIL
            if (r2 == 0) goto L53
            if (r7 == 0) goto L56
            int r3 = r7.getAwemeType()
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.getAuthor()
            if (r0 == 0) goto L56
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r4 = r0.getMatchedFriendStruct()
        L3d:
            java.lang.String r1 = r7.getRequestId()
            if (r1 != 0) goto L45
        L43:
            java.lang.String r1 = ""
        L45:
            r2.LLJILLL = r3
            r2.LLJJ = r4
            java.lang.String r0 = r2.LLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L53
            r2.LLL = r1
        L53:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L56:
            if (r7 == 0) goto L43
            goto L3d
        L59:
            r0 = 0
            goto L23
        L5b:
            r0 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS197S0100000_15.invoke$34(kotlin.jvm.internal.AqS197S0100000_15, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$35(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        C8W0 selectSubscribe = (C8W0) obj;
        C43I c43i = (C43I) obj2;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            ((UserAwemePagerAssemV2) aqS197S0100000_15.l0).LLILIL = ((Boolean) c43i.LIZ).booleanValue();
            UserAwemePagerAssemV2 userAwemePagerAssemV2 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
            if (!userAwemePagerAssemV2.LLILIL) {
                userAwemePagerAssemV2.Z6();
                ((UserAwemePagerAssemV2) aqS197S0100000_15.l0).X0();
                IProfileTabEventAbility iProfileTabEventAbility = (IProfileTabEventAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), IProfileTabEventAbility.class, null);
                if (iProfileTabEventAbility != null) {
                    iProfileTabEventAbility.RS("others_homepage");
                }
            }
            UserAwemePagerAssemV2 userAwemePagerAssemV22 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
            userAwemePagerAssemV22.F4(userAwemePagerAssemV22.LLILIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$36(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (obj != null) {
            UserAwemePagerAssemV2 userAwemePagerAssemV2 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
            C80648Vky c80648Vky = userAwemePagerAssemV2.LJLJL;
            if (c80648Vky != null && c80648Vky.LLFII != 0) {
                c80648Vky.scrollTo(0, 0);
            }
            MTAwemeListFragment mTAwemeListFragment = userAwemePagerAssemV2.LLIIL;
            if (mTAwemeListFragment != null) {
                mTAwemeListFragment.clearData();
            }
            MTAwemeListFragment mTAwemeListFragment2 = userAwemePagerAssemV2.LLIIJLIL;
            if (mTAwemeListFragment2 != null) {
                mTAwemeListFragment2.clearData();
            }
            userAwemePagerAssemV2.LLILLIZIL = false;
            VW9 vw9 = userAwemePagerAssemV2.LJZI;
            if (vw9 != null) {
                vw9.setCurrentItem(0, false);
            }
        }
        ((UserAwemePagerAssemV2) aqS197S0100000_15.l0).c4().LJLJJLL = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$37(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UserAwemePagerAssemV2 userAwemePagerAssemV2 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
        userAwemePagerAssemV2.j7(userAwemePagerAssemV2.K6());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        UserAwemePagerAssemV2 userAwemePagerAssemV2 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
        userAwemePagerAssemV2.h7(userAwemePagerAssemV2.v6());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        UIAssem selectSubscribe = (UIAssem) obj;
        int intValue = ((Number) obj2).intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        MF8.LIZIZ(intValue, ((UserAwemePagerAssemV2) aqS197S0100000_15.l0).u4());
        MTAwemeListFragment mTAwemeListFragment = ((UserAwemePagerAssemV2) aqS197S0100000_15.l0).LLIIJLIL;
        if (mTAwemeListFragment != null) {
            mTAwemeListFragment.LJJJJ();
        }
        View view = null;
        if (intValue == 1) {
            UserAwemePagerAssemV2 userAwemePagerAssemV2 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
            if (userAwemePagerAssemV2.LLILZLL) {
                userAwemePagerAssemV2.LLJI = true;
                View containerView = selectSubscribe.getContainerView();
                if (containerView != null) {
                    view = containerView.findViewById(R.id.mz6);
                }
                ((C2314396l) view).LIZJ();
            }
        } else {
            UserAwemePagerAssemV2 userAwemePagerAssemV22 = (UserAwemePagerAssemV2) aqS197S0100000_15.l0;
            if (userAwemePagerAssemV22.LLJI) {
                userAwemePagerAssemV22.LLJI = false;
                userAwemePagerAssemV22.LLILZLL = true;
                View containerView2 = selectSubscribe.getContainerView();
                if (containerView2 != null) {
                    view = containerView2.findViewById(R.id.mz6);
                }
                C2314396l c2314396l = (C2314396l) view;
                c2314396l.LIZLLL(c2314396l.LJLIL);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87484YVc c87484YVc = C87484YVc.LIZ;
        YVV yvv = YVV.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87484YVc, yvv);
    }

    public static final Object invoke$40(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        XB7 xb7 = (XB7) aqS197S0100000_15.l0;
        if (xb7 != null) {
            xb7.onProgress(intValue, longValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        C84459XCt c84459XCt = (C84459XCt) aqS197S0100000_15.l0;
        c84459XCt.getClass();
        XCZ.LJFF(new AqS5S0101100_15(c84459XCt, intValue, longValue, 1));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        C84460XCu c84460XCu = (C84460XCu) aqS197S0100000_15.l0;
        c84460XCu.getClass();
        XCZ.LJFF(new AqS5S0101100_15(c84460XCu, intValue, longValue, 2));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJIIJ((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$44(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJII((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$45(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJIIL((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$46(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJIILIIL((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJIIJJI((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$48(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LIZIZ((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LIZ((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87482YVa c87482YVa = C87482YVa.LIZ;
        YVU yvu = YVU.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87482YVa, yvu);
    }

    public static final Object invoke$50(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LIZJ((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$51(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LIZLLL((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        InterfaceC87439YTj checkAndExecute = (InterfaceC87439YTj) obj;
        BaseFragment baseFragment = (BaseFragment) obj2;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment, "baseFragment");
        checkAndExecute.LJIIIIZZ((FragmentManager) aqS197S0100000_15.l0, baseFragment);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C85355Xeh c85355Xeh = (C85355Xeh) aqS197S0100000_15.l0;
        if (!c85355Xeh.LJLJLJ) {
            c85355Xeh.LJIIIIZZ(c85355Xeh.LJLJL ? 1 : 0);
            ((C85355Xeh) aqS197S0100000_15.l0).LJLJLJ = true;
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$54(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        a.LJIJ.getClass();
        a.LJIIIZ(longValue, longValue2, "card_holdername");
        ((InterfaceC86816Y5k) ((AqS146S0200000_15) aqS197S0100000_15.l0).l0).setClearButton(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        a.LJIJ.getClass();
        a.LJIIIZ(longValue, longValue2, "card_no");
        ((InterfaceC86816Y5k) ((AqS146S0200000_15) aqS197S0100000_15.l0).l0).setClearButton(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$56(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        long longValue = ((Number) obj).longValue();
        long longValue2 = ((Number) obj2).longValue();
        a.LJIJ.getClass();
        a.LJIIIZ(longValue, longValue2, "expiration_date");
        ((InterfaceC86816Y5k) ((AqS146S0200000_15) aqS197S0100000_15.l0).l0).setClearButton(false);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$57(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        PhotoModeRelatedSearchUiAssem photoModeRelatedSearchUiAssem = (PhotoModeRelatedSearchUiAssem) aqS197S0100000_15.l0;
        photoModeRelatedSearchUiAssem.A3(booleanValue, photoModeRelatedSearchUiAssem.v3());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$58(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        PhotoModeRelatedSearchUiAssem photoModeRelatedSearchUiAssem = (PhotoModeRelatedSearchUiAssem) aqS197S0100000_15.l0;
        if (photoModeRelatedSearchUiAssem.isContainerViewAssigned()) {
            if (booleanValue) {
                C79043V0l.LJIIJ(photoModeRelatedSearchUiAssem.getContainerView());
            } else {
                photoModeRelatedSearchUiAssem.getContainerView().setVisibility(0);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$59(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        float f;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        PhotoModeRelatedSearchUiAssem photoModeRelatedSearchUiAssem = (PhotoModeRelatedSearchUiAssem) aqS197S0100000_15.l0;
        if (photoModeRelatedSearchUiAssem.isContainerViewAssigned()) {
            View containerView = photoModeRelatedSearchUiAssem.getContainerView();
            if (booleanValue) {
                f = 0.2f;
            } else {
                f = 1.0f;
            }
            containerView.setAlpha(f);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        YVZ yvz = YVZ.LIZ;
        YVT yvt = YVT.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, yvz, yvt);
    }

    public static final Object invoke$60(AqS197S0100000_15 aqS197S0100000_15, Object selectSubscribe, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        C86457XwT.LIZLLL(booleanValue, ((SearchRelatedSuggestionUiAssem) aqS197S0100000_15.l0).v3());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$61(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        NoticeFilterModel noticeFilterModel;
        String str;
        ((Number) obj).intValue();
        C253179wf option = (C253179wf) obj2;
        o.LJIIIZ(option, "option");
        Object obj3 = option.LIZLLL;
        if ((obj3 instanceof NoticeFilterModel) && (noticeFilterModel = (NoticeFilterModel) obj3) != null) {
            ViewOnClickListenerC86063Xq7 viewOnClickListenerC86063Xq7 = (ViewOnClickListenerC86063Xq7) aqS197S0100000_15.l0;
            C86067XqB c86067XqB = new C86067XqB();
            c86067XqB.LIZJ = "notification_page";
            c86067XqB.LIZLLL = viewOnClickListenerC86063Xq7.LJLIL.LIZIZ();
            c86067XqB.LJFF = noticeFilterModel.trackingName;
            if (option.LIZJ) {
                str = "select";
            } else {
                str = "unselect";
            }
            c86067XqB.LJI = str;
            c86067XqB.LIZJ();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$62(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        C32442CoI c32442CoI;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        ((C86861Y7d) aqS197S0100000_15.l0).getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("assets download success(");
        LIZ.append(booleanValue);
        LIZ.append(')');
        C0NB.LIZIZ("GiftFeedEffectPlayViewManager", X1D.LIZIZ(LIZ));
        C86861Y7d c86861Y7d = (C86861Y7d) aqS197S0100000_15.l0;
        C86863Y7f c86863Y7f = c86861Y7d.LIZIZ;
        if (c86863Y7f == null) {
            c86861Y7d.LJFF();
        } else if (booleanValue) {
            if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getFull() || c86863Y7f.LJIIJ) {
                C86861Y7d c86861Y7d2 = (C86861Y7d) aqS197S0100000_15.l0;
                C86863Y7f c86863Y7f2 = c86861Y7d2.LIZIZ;
                if (c86863Y7f2 != null && (c32442CoI = c86863Y7f2.LJII) != null) {
                    String result = c32442CoI.getResult();
                    if (c32442CoI.LIZIZ() && C96Q.LIZ(result)) {
                        ((C86861Y7d) aqS197S0100000_15.l0).getClass();
                        C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "assets download success");
                        C76964UIm.LIZ(0, c86863Y7f.LIZ, c86863Y7f.LIZIZ, c86863Y7f.LIZJ, c86863Y7f.LIZLLL, c86863Y7f.LJIJI);
                        C86861Y7d c86861Y7d3 = (C86861Y7d) aqS197S0100000_15.l0;
                        C86863Y7f c86863Y7f3 = c86861Y7d3.LIZIZ;
                        if (c86863Y7f3 != null) {
                            c86863Y7f3.LJIILJJIL = result;
                        }
                        c86861Y7d3.LIZ = EnumC86865Y7h.PLAYING;
                        c86861Y7d3.LJII();
                    } else {
                        ((C86861Y7d) aqS197S0100000_15.l0).getClass();
                        C0NB.LJ("GiftFeedEffectPlayViewManager", "assets download success but still cannot find assets!");
                        c86863Y7f.LJJI = -1;
                        ((C86861Y7d) aqS197S0100000_15.l0).LJFF();
                    }
                } else {
                    c86861Y7d2.LJFF();
                }
            } else {
                C32420Cnw c32420Cnw = c86863Y7f.LJIIJJI;
                if (c32420Cnw != null) {
                    String LIZIZ = PU0.LJI().LIZIZ.LIZ.LIZIZ(c32420Cnw);
                    if (PU0.LJI().LJII(c32420Cnw) && C96Q.LIZ(LIZIZ)) {
                        ((C86861Y7d) aqS197S0100000_15.l0).getClass();
                        C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "assets download success h264");
                        C76964UIm.LIZ(0, c86863Y7f.LIZ, c86863Y7f.LIZIZ, c86863Y7f.LIZJ, c86863Y7f.LIZLLL, c86863Y7f.LJIJJ);
                        c86863Y7f.LJIILJJIL = LIZIZ;
                        C86861Y7d c86861Y7d4 = (C86861Y7d) aqS197S0100000_15.l0;
                        c86861Y7d4.LIZ = EnumC86865Y7h.PLAYING;
                        c86861Y7d4.LJII();
                    } else {
                        ((C86861Y7d) aqS197S0100000_15.l0).getClass();
                        C0NB.LJ("GiftFeedEffectPlayViewManager", "assets download success but still cannot find h264 assets!");
                        c86863Y7f.LJIIJ = true;
                        ((C86861Y7d) aqS197S0100000_15.l0).LJII();
                    }
                } else {
                    ((C86861Y7d) aqS197S0100000_15.l0).LJFF();
                }
            }
        } else if (LiveGiftFeedEffectPlayExpSetting.INSTANCE.getCorner() && !c86863Y7f.LJIIJ) {
            c86863Y7f.LJIIJ = true;
            ((C86861Y7d) aqS197S0100000_15.l0).LJII();
        } else {
            c86863Y7f.LJJI = Integer.valueOf(intValue);
            ((C86861Y7d) aqS197S0100000_15.l0).LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$63(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int intValue = ((Number) obj2).intValue();
        ((C86861Y7d) aqS197S0100000_15.l0).getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("model download success(");
        LIZ.append(booleanValue);
        LIZ.append(')');
        C0NB.LIZIZ("GiftFeedEffectPlayViewManager", X1D.LIZIZ(LIZ));
        C86861Y7d c86861Y7d = (C86861Y7d) aqS197S0100000_15.l0;
        C86863Y7f c86863Y7f = c86861Y7d.LIZIZ;
        if (c86863Y7f == null) {
            c86861Y7d.LJFF();
        } else if (booleanValue) {
            AssetsModel LIZIZ = C32341Cmf.LIZIZ(c86863Y7f.LIZLLL);
            if (LIZIZ == null) {
                ((C86861Y7d) aqS197S0100000_15.l0).getClass();
                C0NB.LJ("GiftFeedEffectPlayViewManager", "model download success but still cannot find model!");
                c86863Y7f.LJJ = -1;
                ((C86861Y7d) aqS197S0100000_15.l0).LJFF();
            } else {
                ((C86861Y7d) aqS197S0100000_15.l0).getClass();
                C0NB.LIZIZ("GiftFeedEffectPlayViewManager", "model download success");
                C76964UIm.LIZIZ(0, c86863Y7f.LIZ, c86863Y7f.LIZIZ, c86863Y7f.LIZJ, c86863Y7f.LIZLLL, c86863Y7f.LJIIZILJ);
                c86863Y7f.LJIJ = System.currentTimeMillis();
                c86863Y7f.LJI = LIZIZ;
                C86861Y7d c86861Y7d2 = (C86861Y7d) aqS197S0100000_15.l0;
                c86861Y7d2.LIZ = EnumC86865Y7h.DOWNLOAD_ASSERT;
                c86861Y7d2.LJII();
            }
        } else {
            c86863Y7f.LJJ = Integer.valueOf(intValue);
            ((C86861Y7d) aqS197S0100000_15.l0).LJFF();
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$64(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        XB7 xb7 = (XB7) aqS197S0100000_15.l0;
        if (xb7 != null) {
            xb7.onProgress(intValue, longValue);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$65(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        QQI qqi = (QQI) obj;
        int intValue = ((Number) obj2).intValue();
        if (qqi != null) {
            intValue = qqi.LIZLLL;
        }
        RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) aqS197S0100000_15.l0;
        RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel, Integer.valueOf(intValue), null, 6);
        recentDevicesFragmentViewModel.kv0();
        C85144XbI.LJJII(((RecentDevicesFragmentViewModel) aqS197S0100000_15.l0).LJLIL.size(), 0, intValue, ((RecentDevicesFragmentViewModel) aqS197S0100000_15.l0).getEnterFrom());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$66(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        String str;
        QQI qqi = (QQI) obj;
        int intValue = ((Number) obj2).intValue();
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS197S0100000_15.l0;
        Integer valueOf = Integer.valueOf(intValue);
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.withState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, valueOf, str, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$67(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        String str;
        QQI qqi = (QQI) obj;
        int intValue = ((Number) obj2).intValue();
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS197S0100000_15.l0;
        Integer valueOf = Integer.valueOf(intValue);
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.withState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, valueOf, str, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$68(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        String str;
        QQI qqi = (QQI) obj;
        int intValue = ((Number) obj2).intValue();
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS197S0100000_15.l0;
        Integer valueOf = Integer.valueOf(intValue);
        if (qqi == null || (str = qqi.LJFF) == null) {
            str = "";
        }
        TwoStepVerificationActivityViewModel.hv0(twoStepVerificationActivityViewModel, valueOf, str, 4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$69(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        String str;
        QQI qqi = (QQI) obj;
        int intValue = ((Number) obj2).intValue();
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) aqS197S0100000_15.l0;
        Integer valueOf = Integer.valueOf(intValue);
        if (qqi != null) {
            str = qqi.LJFF;
        } else {
            str = null;
        }
        twoStepVerificationActivityViewModel.getClass();
        twoStepVerificationActivityViewModel.withState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, valueOf, str, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87484YVc c87484YVc = C87484YVc.LIZ;
        YVV yvv = YVV.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87484YVc, yvv);
    }

    public static final Object invoke$70(AqS197S0100000_15 aqS197S0100000_15, Object obj, Object obj2) {
        List<String> list = (List) obj;
        String str = (String) obj2;
        C85679Xjv c85679Xjv = (C85679Xjv) aqS197S0100000_15.l0;
        int i = 0;
        c85679Xjv.LIZ.Ik(false);
        c85679Xjv.LIZ.LLZZZZ(list);
        c85679Xjv.LIZ.j5(false);
        if (C78685UuP.LJJJZ(str)) {
            c85679Xjv.LIZ.LJIILL(str);
        } else {
            c85679Xjv.LIZ.LJLJL(null, Integer.valueOf(R.string.g5t));
        }
        if (str == null) {
            str = "network error";
        }
        if (list != null && !list.isEmpty()) {
            i = 1;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("error_desc", str);
        c35936E8m.LIZ(i, "show_suggest");
        c35936E8m.LIZ(EOO.LIZIZ(), "is_in_personalized_nuj");
        FMX.LJIIL("show_create_account_error", c35936E8m.LIZ);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        C87483YVb c87483YVb = C87483YVb.LIZ;
        YVW yvw = YVW.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, c87483YVb, yvw);
    }

    public static final Object invoke$9(AqS197S0100000_15 aqS197S0100000_15, Object on, Object it) {
        o.LJIIIZ(on, "$this$on");
        o.LJIIIZ(it, "it");
        YVK.a aVar = (YVK.a) aqS197S0100000_15.l0;
        YVZ yvz = YVZ.LIZ;
        YVT yvt = YVT.LIZ;
        aVar.getClass();
        return YVK.a.LIZIZ(on, yvz, yvt);
    }
}
