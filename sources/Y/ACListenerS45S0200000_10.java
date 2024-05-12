package Y;

import X.ActivityC45651qj;
import X.C025908h;
import X.C113554cx;
import X.C16880lQ;
import X.C188727au;
import X.C212428Vi;
import X.C26042AJy;
import X.C26227ARb;
import X.C40002Fmw;
import X.C40101FoX;
import X.C50420Jqa;
import X.C53355Kwp;
import X.C53857LBt;
import X.C56602Ka;
import X.C57903Mnz;
import X.C58878N8w;
import X.C58879N8x;
import X.C58955NBv;
import X.C58985NCz;
import X.C59022NEk;
import X.C59273NOb;
import X.C59314NPq;
import X.C59316NPs;
import X.C59454NVa;
import X.C59455NVb;
import X.C59614NaU;
import X.C59679NbX;
import X.C5S1;
import X.C60071Nhr;
import X.C61779OMl;
import X.C61783OMp;
import X.C61845OOz;
import X.C61995OUt;
import X.C62680Oiq;
import X.C62681Oir;
import X.C62738Ojm;
import X.C62792Oke;
import X.C62797Okj;
import X.C62798Okk;
import X.C62879Om3;
import X.C63781P1l;
import X.C65352Pkq;
import X.C6ZT;
import X.C72513Sd3;
import X.C72516Sd6;
import X.C72521SdB;
import X.C75252xN;
import X.C78598Ut0;
import X.C78857UxB;
import X.C78920UyC;
import X.C8CH;
import X.C94363n6;
import X.EnumC211478Rr;
import X.EnumC58952NBs;
import X.EnumC61773OMf;
import X.EnumC61786OMs;
import X.FCG;
import X.FCH;
import X.FMX;
import X.H96;
import X.H9A;
import X.InterfaceC53858LBu;
import X.InterfaceC58979NCt;
import X.InterfaceC63059Oox;
import X.InterfaceC74236TBo;
import X.N4C;
import X.N4R;
import X.NFB;
import X.NK0;
import X.NLW;
import X.NN6;
import X.NPD;
import X.NRW;
import X.NVO;
import X.NWB;
import X.NZ3;
import X.NZ4;
import X.OFZ;
import X.ONQ;
import X.ORY;
import X.ORZ;
import X.OSZ;
import X.P1U;
import X.P1V;
import X.SIS;
import X.SY4;
import X.UC0;
import X.X1D;
import X.XKX;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.router.fragment.PushType;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyVM;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import com.ss.android.ugc.aweme.commercialize.media.impl.handler.detail.substitutemusic.v2.CommerceMusicSubstituteMusicListViewModel;
import com.ss.android.ugc.aweme.commercialize.media.impl.logging.CommerceMusicLogger;
import com.ss.android.ugc.aweme.commercialize.media.impl.viewmodel.RecommendMusicV2ViewModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleLogInfo;
import com.ss.android.ugc.aweme.commercialize.preview.ui.AdsPreviewFragment;
import com.ss.android.ugc.aweme.commercialize.profile.AdNewFakeUserProfileHeaderWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileBottomBarWidget;
import com.ss.android.ugc.aweme.commercialize.widget.AdFakeUserProfileNewBottomBarWidget;
import com.ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.ss.android.ugc.aweme.component.ctacomponent.AnolFeedCtaButtonData;
import com.ss.android.ugc.aweme.component.ctacomponent.AnoleFeedCTAData;
import com.ss.android.ugc.aweme.donation.BannerStruct;
import com.ss.android.ugc.aweme.donation.detail.DonationFragment;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.survey.Option;
import com.ss.android.ugc.aweme.live.LiveBroadcastActivity;
import com.ss.android.ugc.aweme.music.model.ExternalMusicInfo;
import com.ss.android.ugc.aweme.music.ui.widget.ThirdMusicViewHolder;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.ss.android.ugc.aweme.notification.module.cell.HeaderCell;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.ContactMaFCell;
import com.ss.android.ugc.aweme.relation.auth.widget.cell.FacebookMaFCell;
import com.ss.android.ugc.aweme.relation.auth.widget.contact.ContactMaFWidgetVM;
import com.ss.android.ugc.aweme.relation.auth.widget.ext.InviteFriendsSharePackageV2;
import com.ss.android.ugc.aweme.relation.auth.widget.fb.FacebookMaFWidgetVM;
import com.ss.android.ugc.aweme.relation.model.SmgSettingsModel;
import com.ss.android.ugc.aweme.setting.page.accessibility.DynamicFontSizeFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.ui.PreviewItemFragment;
import com.zhiliaoapp.musically.R;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS15S2100000_6;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.AqS52S1200000_10;
import kotlin.jvm.internal.o;
import ujb.s;
import yq4.a;

/* loaded from: classes11.dex */
public class ACListenerS45S0200000_10 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            case 9:
                onClick$9(this, view);
                return;
            case 10:
                onClick$10(this, view);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                onClick$11(this, view);
                return;
            case 12:
                onClick$12(this, view);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                onClick$13(this, view);
                return;
            case 14:
                onClick$14(this, view);
                return;
            case 15:
                onClick$15(this, view);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                onClick$16(this, view);
                return;
            case 17:
                onClick$17(this, view);
                return;
            case 18:
                onClick$18(this, view);
                return;
            case 19:
                onClick$19(this, view);
                return;
            case 20:
                onClick$20(this, view);
                return;
            case 21:
                onClick$21(this, view);
                return;
            case 22:
                onClick$22(this, view);
                return;
            case 23:
                onClick$23(this, view);
                return;
            case 24:
                onClick$24(this, view);
                return;
            case 25:
                onClick$25(this, view);
                return;
            case 26:
                onClick$26(this, view);
                return;
            case 27:
                onClick$27(this, view);
                return;
            case 28:
                onClick$28(this, view);
                return;
            case 29:
                onClick$29(this, view);
                return;
            case 30:
                onClick$30(this, view);
                return;
            case 31:
                onClick$31(this, view);
                return;
            case 32:
                onClick$32(this, view);
                return;
            case 33:
                onClick$33(this, view);
                return;
            case 34:
                onClick$34(this, view);
                return;
            case 35:
                onClick$35(this, view);
                return;
            case 36:
                onClick$36(this, view);
                return;
            case 37:
                onClick$37(this, view);
                return;
            case 38:
                onClick$38(this, view);
                return;
            case 39:
                onClick$39(this, view);
                return;
            case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40 /* 40 */:
                onClick$40(this, view);
                return;
            case 41:
                onClick$41(this, view);
                return;
            case 42:
                onClick$42(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) aCListenerS45S0200000_10.l0;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS45S0200000_10.l1;
        Aweme aweme = videoRelationBtnAssem.LLIFFJFJJ;
        if (aweme == null || videoRelationBtnAssem.LLFII == null) {
            return;
        }
        if (C56602Ka.LIZIZ(aweme)) {
            str = "expand_card";
        } else {
            str = "small_card";
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ((C61995OUt) videoRelationBtnAssem.LLIIL.getValue()).LIZ();
        } else {
            ((C61995OUt) videoRelationBtnAssem.LLIIL.getValue()).LIZIZ(85, 61);
        }
        DataCenter dataCenter = videoItemParams.dataCenter;
        if (dataCenter != null) {
            C50420Jqa c50420Jqa = new C50420Jqa(12, videoRelationBtnAssem.LLIFFJFJJ);
            c50420Jqa.LJLJJI = "feed";
            c50420Jqa.LJLLL = str;
            dataCenter.jv0(c50420Jqa, "feed_internal_event");
        }
        videoRelationBtnAssem.q4("follow", true);
        if (!o.LJ(videoRelationBtnAssem.u4().LJLJLLL, EnumC211478Rr.SOCIAL.getValue())) {
            return;
        }
        VideoUserCardAssem.LLIFFJFJJ.getClass();
        if (!C57903Mnz.LIZ(videoItemParams)) {
            return;
        }
        VideoUserCardVM videoUserCardVM = (VideoUserCardVM) videoRelationBtnAssem.LLIIJLIL.LIZ(videoRelationBtnAssem, VideoRelationBtnAssem.LLIIZ[2]);
        videoUserCardVM.getClass();
        videoUserCardVM.withState(new AqS179S0100000_13(videoUserCardVM, 432));
    }

    public static final void onClick$1(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aCListenerS45S0200000_10.l0, "//aweme/scan");
        buildRoute.withParam("finishAfterScan", true);
        buildRoute.open();
        ActivityC45651qj mo49getActivity = ((AdsPreviewFragment) aCListenerS45S0200000_10.l1).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    public static final void onClick$10(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        if (C6ZT.LIZ(view) || ((AwemeRawAd) aCListenerS45S0200000_10.l0).getLabel().byUid == 0) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(((C59316NPs) aCListenerS45S0200000_10.l1).LJLLI, "aweme://user/profile/");
        buildRoute.withParam("uid", String.valueOf(((AwemeRawAd) aCListenerS45S0200000_10.l0).getLabel().byUid));
        buildRoute.open();
    }

    public static final void onClick$11(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        AwemeRawAd awemeRawAd;
        InterfaceC53858LBu callback = ((C53857LBt) aCListenerS45S0200000_10.l0).getCallback();
        if (callback != null) {
            callback.LIZ(false);
        }
        NLW feedAdDepend = ((C53857LBt) aCListenerS45S0200000_10.l0).getFeedAdDepend();
        if (feedAdDepend != null) {
            feedAdDepend.LIZ(((C53857LBt) aCListenerS45S0200000_10.l0).getContext(), (Aweme) aCListenerS45S0200000_10.l1, 48, NPD.LIZ);
        }
        Aweme aweme = (Aweme) aCListenerS45S0200000_10.l1;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C025908h.LIZLLL("draw_ad", "click", awemeRawAd, "popup_window", "refer");
    }

    public static final void onClick$12(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((LiveBroadcastActivity) aCListenerS45S0200000_10.l0).LLII((Bundle) aCListenerS45S0200000_10.l1);
    }

    public static final void onClick$13(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        Option[] optionArr;
        int id = view.getId();
        if (id == R.id.eb1) {
            C61779OMl.LIZJ(EnumC61773OMf.CANCEL, null, null, ((ONQ) aCListenerS45S0200000_10.l0).LLD);
            ((ONQ) aCListenerS45S0200000_10.l0).dismiss();
            return;
        }
        if (id != R.id.azi) {
            return;
        }
        ONQ onq = (ONQ) aCListenerS45S0200000_10.l0;
        Option option = onq.LJZI;
        if (option != null) {
            optionArr = new Option[]{option};
        } else {
            optionArr = null;
        }
        C61779OMl.LIZJ(EnumC61773OMf.SUBMIT, null, optionArr, onq.LLD);
        C5S1 c5s1 = new C5S1((Context) aCListenerS45S0200000_10.l1);
        c5s1.LIZJ(R.string.rx2);
        c5s1.LIZ(R.raw.icon_tick_fill_small);
        c5s1.LIZIZ(R.attr.e8);
        c5s1.LJ();
        ((ONQ) aCListenerS45S0200000_10.l0).dismiss();
    }

    public static final void onClick$14(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((ContactMaFCell) aCListenerS45S0200000_10.l0).M((C62797Okj) aCListenerS45S0200000_10.l1, "contact");
    }

    public static final void onClick$15(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        ContactMaFWidgetVM contactMaFWidgetVM = (ContactMaFWidgetVM) aCListenerS45S0200000_10.l0;
        C62792Oke toInviteItem = (C62792Oke) aCListenerS45S0200000_10.l1;
        contactMaFWidgetVM.getClass();
        o.LJIIIZ(toInviteItem, "toInviteItem");
        String phoneNumber = toInviteItem.LJLILLLLZI.getPhoneNumber();
        new C94363n6(contactMaFWidgetVM.LJLIL.LIZJ.LJLIL).LIZLLL(null);
        InviteFriendsSharePackageV2 inviteFriendsSharePackageV2 = contactMaFWidgetVM.LJLJI;
        P1U p1u = contactMaFWidgetVM.LJLIL;
        String str2 = p1u.LJIILIIL;
        String str3 = p1u.LJIILJJIL;
        AqS52S1200000_10 aqS52S1200000_10 = new AqS52S1200000_10(contactMaFWidgetVM, phoneNumber, toInviteItem, 5);
        inviteFriendsSharePackageV2.getClass();
        o.LJIIIZ(phoneNumber, "phoneNumber");
        if (str3 == null) {
            str3 = inviteFriendsSharePackageV2.LJIIZILJ();
        }
        if (str2 != null) {
            Activity topActivity = ActivityStack.getTopActivity();
            o.LJIIIIZZ(topActivity, "getTopActivity()");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str3);
            LIZ.append(str2);
            aqS52S1200000_10.invoke(Boolean.valueOf(C40002Fmw.LIZ(topActivity, phoneNumber, X1D.LIZIZ(LIZ))));
            return;
        }
        SmgSettingsModel smgSettingsModel = inviteFriendsSharePackageV2.smgSettingsModel;
        if (smgSettingsModel == null || (str = smgSettingsModel.getUrl()) == null || str.length() == 0) {
            str = "https://m.tiktok.com/invitef/download";
        }
        inviteFriendsSharePackageV2.LJIJ(inviteFriendsSharePackageV2.LJIILL(str, ""), new AqS15S2100000_6(phoneNumber, str3, aqS52S1200000_10, 1));
    }

    public static final void onClick$16(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((FacebookMaFCell) aCListenerS45S0200000_10.l0).M((C62798Okk) aCListenerS45S0200000_10.l1, "facebook");
    }

    public static final void onClick$17(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        FacebookMaFWidgetVM facebookMaFWidgetVM = ((C63781P1l) aCListenerS45S0200000_10.l0).LJLL;
        if (facebookMaFWidgetVM != null) {
            facebookMaFWidgetVM.hv0(((P1V) aCListenerS45S0200000_10.l1).LIZ);
        } else {
            o.LJIJI("viewModel");
            throw null;
        }
    }

    public static final void onClick$18(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        NRW nrw = (NRW) aCListenerS45S0200000_10.l0;
        nrw.animate().alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS5S0201000_2(2, nrw, (NK0) aCListenerS45S0200000_10.l1, 4));
    }

    public static final void onClick$19(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((InterfaceC63059Oox) C8CH.LIZ((ThirdMusicViewHolder) aCListenerS45S0200000_10.l0, C65352Pkq.LIZ(InterfaceC63059Oox.class))).ll((ExternalMusicInfo) aCListenerS45S0200000_10.l1);
    }

    public static final void onClick$2(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        SmartRoute buildRoute = SmartRouter.buildRoute((Context) aCListenerS45S0200000_10.l0, "//aweme/scan");
        buildRoute.withParam("finishAfterScan", true);
        buildRoute.open();
        ActivityC45651qj mo49getActivity = ((AdsPreviewFragment) aCListenerS45S0200000_10.l1).mo49getActivity();
        if (mo49getActivity != null) {
            mo49getActivity.finish();
        }
    }

    public static final void onClick$20(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        if (((C62680Oiq) aCListenerS45S0200000_10.l0).LJLIL && ((Dialog) aCListenerS45S0200000_10.l1).isShowing()) {
            C62680Oiq c62680Oiq = (C62680Oiq) aCListenerS45S0200000_10.l0;
            Context context = ((Dialog) aCListenerS45S0200000_10.l1).getContext();
            o.LJIIIIZZ(context, "dialog.context");
            if (!c62680Oiq.LJLILLLLZI) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ORY.LJJLJ(new Integer[]{Integer.valueOf(android.R.attr.windowCloseOnTouchOutside)}));
                o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…oIntArray()\n            )");
                c62680Oiq.LJLILLLLZI = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            if (c62680Oiq.LJLILLLLZI) {
                ((Dialog) aCListenerS45S0200000_10.l1).cancel();
            }
        }
    }

    public static final void onClick$21(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        if (((C62681Oir) aCListenerS45S0200000_10.l0).LJLIL && ((Dialog) aCListenerS45S0200000_10.l1).isShowing()) {
            C62681Oir c62681Oir = (C62681Oir) aCListenerS45S0200000_10.l0;
            Context context = ((Dialog) aCListenerS45S0200000_10.l1).getContext();
            o.LJIIIIZZ(context, "dialog.context");
            if (!c62681Oir.LJLILLLLZI) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ORY.LJJLJ(new Integer[]{Integer.valueOf(android.R.attr.windowCloseOnTouchOutside)}));
                o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…oIntArray()\n            )");
                c62681Oir.LJLILLLLZI = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
            }
            if (c62681Oir.LJLILLLLZI) {
                ((Dialog) aCListenerS45S0200000_10.l1).cancel();
            }
        }
    }

    public static final void onClick$22(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        if (((C62738Ojm) aCListenerS45S0200000_10.l0).LJLILLLLZI && ((Dialog) aCListenerS45S0200000_10.l1).isShowing()) {
            C62738Ojm c62738Ojm = (C62738Ojm) aCListenerS45S0200000_10.l0;
            Context context = ((Dialog) aCListenerS45S0200000_10.l1).getContext();
            o.LJIIIIZZ(context, "dialog.context");
            c62738Ojm.getClass();
            if (!c62738Ojm.LJLJJI) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
                o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ndowCloseOnTouchOutside))");
                c62738Ojm.LJLJI = obtainStyledAttributes.getBoolean(0, true);
                obtainStyledAttributes.recycle();
                c62738Ojm.LJLJJI = true;
            }
            if (c62738Ojm.LJLJI) {
                ((Dialog) aCListenerS45S0200000_10.l1).cancel();
            }
        }
    }

    public static final void onClick$23(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((View.OnClickListener) aCListenerS45S0200000_10.l0).onClick(view);
        SparkContext sparkContext = ((C60071Nhr) aCListenerS45S0200000_10.l1).LJLJJL;
        if (sparkContext != null) {
            String str = sparkContext.containerId;
            if (str == null) {
                str = "";
            }
            String str2 = C75252xN.LIZJ(str).get("__spark_session_id");
            if (str2 != null) {
                C40101FoX.LIZIZ(str2);
                return;
            }
            return;
        }
        o.LJIJI("sparkContext");
        throw null;
    }

    public static final void onClick$24(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        MusicModel musicModel = (MusicModel) ORZ.LJLLLLLL(((Number) ((C58878N8w) aCListenerS45S0200000_10.l1).LJLLL.getValue()).intValue(), ((CommerceMusicSubstituteMusicListViewModel) aCListenerS45S0200000_10.l0).hv0());
        if (musicModel != null) {
            C58878N8w c58878N8w = (C58878N8w) aCListenerS45S0200000_10.l1;
            CommerceMusicLogger commerceMusicLogger = c58878N8w.LJLJI;
            N4C.LIZ.getClass();
            commerceMusicLogger.LJIILJJIL(N4C.LJIIL, new AqS141S0200000_10(c58878N8w, musicModel, 44));
            c58878N8w.LJLJJI.invoke(musicModel);
        }
    }

    public static final void onClick$25(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((CommerceMusicSubstituteMusicListViewModel) aCListenerS45S0200000_10.l0).gv0(((Number) ((C58878N8w) aCListenerS45S0200000_10.l1).LJLLL.getValue()).intValue());
    }

    public static final void onClick$26(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((CommerceMusicSubstituteMusicListViewModel) aCListenerS45S0200000_10.l0).gv0(((Number) ((C58878N8w) aCListenerS45S0200000_10.l1).LJLLL.getValue()).intValue());
    }

    public static final void onClick$27(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        CommerceMusicSubstituteMusicListViewModel commerceMusicSubstituteMusicListViewModel = (CommerceMusicSubstituteMusicListViewModel) aCListenerS45S0200000_10.l0;
        Context context = ((C58878N8w) aCListenerS45S0200000_10.l1).LJLIL.getContext();
        o.LJIIIIZZ(context, "container.context");
        int intValue = ((Number) ((C58878N8w) aCListenerS45S0200000_10.l1).LJLLL.getValue()).intValue();
        commerceMusicSubstituteMusicListViewModel.getClass();
        MusicModel musicModel = (MusicModel) ORZ.LJLLLLLL(intValue, commerceMusicSubstituteMusicListViewModel.hv0());
        if (musicModel == null) {
            return;
        }
        CommerceMusicLogger commerceMusicLogger = commerceMusicSubstituteMusicListViewModel.LJLJI;
        if (commerceMusicLogger != null) {
            N4C.LIZ.getClass();
            commerceMusicLogger.LJIILJJIL(N4C.LJIIJJI, new AqS176S0100000_10(musicModel, 194));
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://music/detail/");
            buildRoute.withParam("id", musicModel.getMusicId());
            buildRoute.withParam("aweme_id", "");
            buildRoute.withParam("extra_music_from", "music_detail_rec");
            buildRoute.withParam("extra_enter_from", 2);
            buildRoute.open(10086);
            return;
        }
        o.LJIJI("logger");
        throw null;
    }

    public static final void onClick$28(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String valueOf = String.valueOf(((C59314NPq) aCListenerS45S0200000_10.l0).LIZIZ.LIZ);
        C59273NOb c59273NOb = ((C59314NPq) aCListenerS45S0200000_10.l0).LIZIZ;
        NWB.LIZ(c59273NOb.LJJJZ, valueOf, c59273NOb.LJIIIIZZ, c59273NOb.LJJJLZIJ);
        NZ4 titleWrap = ((NZ3) aCListenerS45S0200000_10.l1).getTitleWrap();
        if (titleWrap != null) {
            titleWrap.LIZ();
        }
    }

    public static final void onClick$29(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        C59679NbX c59679NbX = (C59679NbX) aCListenerS45S0200000_10.l0;
        Aweme aweme = (Aweme) aCListenerS45S0200000_10.l1;
        o.LJI(aweme);
        c59679NbX.getClass();
        a.LJIILLIIL().LJI(C26042AJy.LIZIZ(aweme));
        IReportService LJIILLIIL = a.LJIILLIIL();
        FCH.LIZIZ.getClass();
        LJIILLIIL.LIZJ(FCG.LIZIZ(), C26042AJy.LIZJ("landing_page", aweme));
    }

    public static final void onClick$3(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        ((TextView) aCListenerS45S0200000_10.l0).setGravity(17);
        TextView textView = (TextView) aCListenerS45S0200000_10.l0;
        Aweme aweme = ((AdNewFakeUserProfileHeaderWidget) aCListenerS45S0200000_10.l1).LJLJLJ;
        if (aweme != null) {
            str = aweme.getDesc();
        } else {
            str = null;
        }
        textView.setText(str);
        view.setVisibility(8);
    }

    public static final void onClick$30(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        ((View.OnClickListener) aCListenerS45S0200000_10.l0).onClick(view);
        SparkContext sparkContext = ((C59679NbX) aCListenerS45S0200000_10.l1).LJLJLJ;
        if (sparkContext == null || (str = sparkContext.containerId) == null) {
            str = "";
        }
        String str2 = C75252xN.LIZJ(str).get("__spark_session_id");
        if (str2 != null) {
            C40101FoX.LIZIZ(str2);
        }
    }

    public static final void onClick$31(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        String str2;
        Integer buttonType;
        C58985NCz c58985NCz = (C58985NCz) aCListenerS45S0200000_10.l0;
        AnoleFeedCTAData anoleFeedCTAData = (AnoleFeedCTAData) aCListenerS45S0200000_10.l1;
        InterfaceC58979NCt interfaceC58979NCt = c58985NCz.LJLJI;
        Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ(EnumC58952NBs.ENTER_FROM.getRName(), 70));
        String rName = EnumC58952NBs.REFER.getRName();
        AnoleLogInfo logInfo = anoleFeedCTAData.getLogInfo();
        if (logInfo == null || (str = logInfo.getRefer()) == null) {
            str = "anole_cta";
        }
        LJJLIIIIJ.put(rName, str);
        String rName2 = EnumC58952NBs.TAG.getRName();
        AnoleLogInfo logInfo2 = anoleFeedCTAData.getLogInfo();
        if (logInfo2 == null || (str2 = logInfo2.getTag()) == null) {
            str2 = "anole_ad";
        }
        LJJLIIIIJ.put(rName2, str2);
        String rName3 = EnumC58952NBs.AD_EXTRA_DATA.getRName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AnolFeedCtaButtonData ctaButtonData = anoleFeedCTAData.getCtaButtonData();
        if (ctaButtonData != null && (buttonType = ctaButtonData.getButtonType()) != null) {
            C61845OOz.LIZLLL(buttonType, linkedHashMap, "buttonType");
        }
        linkedHashMap.put("is_lynx", 0);
        LJJLIIIIJ.put(rName3, linkedHashMap);
        interfaceC58979NCt.LJIIIIZZ(new C58955NBv(LJJLIIIIJ), c58985NCz);
    }

    public static final void onClick$32(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        Integer num;
        C59614NaU c59614NaU;
        PopupWindow popupWindow;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        C59455NVb c59455NVb = ((BaseCommonBizRootContainer) aCListenerS45S0200000_10.l0).LJLLL;
        if (c59455NVb != null && (popupWindow = c59455NVb.LIZIZ) != null) {
            popupWindow.dismiss();
        }
        if (TextUtils.isEmpty(((BaseCommonBizRootContainer) aCListenerS45S0200000_10.l0).LJLLILLLL) || num == null) {
            return;
        }
        if (num.intValue() == R.id.hbo) {
            C59454NVa.LIZJ((Activity) aCListenerS45S0200000_10.l1, ((BaseCommonBizRootContainer) aCListenerS45S0200000_10.l0).LJLLILLLL);
            return;
        }
        if (num.intValue() == R.id.bva) {
            C59454NVa.LIZ((Activity) aCListenerS45S0200000_10.l1, ((BaseCommonBizRootContainer) aCListenerS45S0200000_10.l0).LJLLILLLL, C78857UxB.LJJIIJ(1476399124, "bpea-bullet_container_copy_link"));
        } else {
            if (num.intValue() != R.id.itn || (c59614NaU = ((BaseCommonBizRootContainer) aCListenerS45S0200000_10.l0).LJLJLJ) == null) {
                return;
            }
            c59614NaU.reload();
        }
    }

    public static final void onClick$33(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        NVO nvo = (NVO) aCListenerS45S0200000_10.l0;
        nvo.LL = "click_button";
        nvo.LJJLIIIJ();
        ((View.OnClickListener) aCListenerS45S0200000_10.l1).onClick(view);
    }

    public static final void onClick$34(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        Integer num;
        WebKitView webKitView;
        PopupWindow popupWindow;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        C59455NVb c59455NVb = ((NVO) aCListenerS45S0200000_10.l0).LJLLILLLL;
        if (c59455NVb != null && (popupWindow = c59455NVb.LIZIZ) != null) {
            popupWindow.dismiss();
        }
        if (TextUtils.isEmpty(((NVO) aCListenerS45S0200000_10.l0).LJLLI) || num == null) {
            return;
        }
        if (num.intValue() == R.id.hbo) {
            C59454NVa.LIZJ((Activity) aCListenerS45S0200000_10.l1, ((NVO) aCListenerS45S0200000_10.l0).LJLLI);
            return;
        }
        if (num.intValue() == R.id.bva) {
            C59454NVa.LIZ((Activity) aCListenerS45S0200000_10.l1, ((NVO) aCListenerS45S0200000_10.l0).LJLLI, C78857UxB.LJJIIJ(1476399124, "bpea-1940"));
        } else {
            if (num.intValue() != R.id.itn || (webKitView = ((NVO) aCListenerS45S0200000_10.l0).LJLJL) == null) {
                return;
            }
            webKitView.reload();
        }
    }

    public static final void onClick$35(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        NVO nvo = (NVO) aCListenerS45S0200000_10.l0;
        nvo.LL = "click_button";
        nvo.LJJLIIIJ();
        ((View.OnClickListener) aCListenerS45S0200000_10.l1).onClick(view);
    }

    public static final void onClick$36(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        int i;
        C62879Om3 c62879Om3 = (C62879Om3) aCListenerS45S0200000_10.l0;
        boolean z = !c62879Om3.LIZIZ;
        c62879Om3.LIZIZ = z;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        ((TuxTextView) aCListenerS45S0200000_10.l1).setVisibility(i);
    }

    public static final void onClick$37(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        RecommendMusicV2ViewModel recommendMusicV2ViewModel = (RecommendMusicV2ViewModel) aCListenerS45S0200000_10.l0;
        int intValue = ((Number) ((C58879N8x) aCListenerS45S0200000_10.l1).LJLLILLLL.getValue()).intValue();
        MusicModel musicModel = (MusicModel) ORZ.LJLLLLLL(intValue, (List) recommendMusicV2ViewModel.LJLJJI.getValue());
        if (musicModel == null) {
            return;
        }
        N4R n4r = recommendMusicV2ViewModel.LJLIL;
        if (n4r != null) {
            n4r.LLILLL(musicModel);
            H96 h96 = new H96();
            h96.LJIIIIZZ(musicModel);
            h96.LJI("ttelite_BA_music_rec_select", new OSZ<>("meta_song_id", H9A.LIZ), new OSZ<>("music_placement_index", Integer.valueOf(intValue)));
            return;
        }
        o.LJIJI("callback");
        throw null;
    }

    public static final void onClick$38(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((RecommendMusicV2ViewModel) aCListenerS45S0200000_10.l0).gv0(((Number) ((C58879N8x) aCListenerS45S0200000_10.l1).LJLLILLLL.getValue()).intValue());
    }

    public static final void onClick$39(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        ((RecommendMusicV2ViewModel) aCListenerS45S0200000_10.l0).gv0(((Number) ((C58879N8x) aCListenerS45S0200000_10.l1).LJLLILLLL.getValue()).intValue());
    }

    public static final void onClick$4(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        AdFakeUserProfileBottomBarWidget adFakeUserProfileBottomBarWidget = (AdFakeUserProfileBottomBarWidget) aCListenerS45S0200000_10.l0;
        NN6.LIZ(adFakeUserProfileBottomBarWidget.LJLIL, adFakeUserProfileBottomBarWidget.LJLJLJ);
    }

    public static final void onClick$40(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        RecommendMusicV2ViewModel recommendMusicV2ViewModel = (RecommendMusicV2ViewModel) aCListenerS45S0200000_10.l0;
        Context context = ((C58879N8x) aCListenerS45S0200000_10.l1).LJLIL.getContext();
        o.LJIIIIZZ(context, "container.context");
        int intValue = ((Number) ((C58879N8x) aCListenerS45S0200000_10.l1).LJLLILLLL.getValue()).intValue();
        recommendMusicV2ViewModel.getClass();
        MusicModel musicModel = (MusicModel) ORZ.LJLLLLLL(intValue, (List) recommendMusicV2ViewModel.LJLJJI.getValue());
        if (musicModel == null) {
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://music/detail/");
        buildRoute.withParam("id", musicModel.getMusicId());
        buildRoute.withParam("aweme_id", "");
        buildRoute.withParam("extra_music_from", "music_detail_rec");
        buildRoute.withParam("extra_enter_from", 2);
        buildRoute.open(10086);
    }

    public static final void onClick$41(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        if (C6ZT.LIZ((SY4) aCListenerS45S0200000_10.l0)) {
            return;
        }
        AdFollowUpAceSurveyVM adFollowUpAceSurveyVM = ((NFB) aCListenerS45S0200000_10.l1).LJLZ;
        if (adFollowUpAceSurveyVM != null) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(adFollowUpAceSurveyVM), null, null, new C59022NEk(adFollowUpAceSurveyVM, null), 3);
        } else {
            o.LJIJI("surveyVm");
            throw null;
        }
    }

    public static final void onClick$42(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        C61783OMp c61783OMp = (C61783OMp) aCListenerS45S0200000_10.l0;
        ImageView imageView = (ImageView) aCListenerS45S0200000_10.l1;
        if (c61783OMp.LJLJI) {
            int i = (int) c61783OMp.LJLJLJ;
            if (new BigDecimal(Float.toString(c61783OMp.LJLJLJ)).subtract(new BigDecimal(Integer.toString(i))).floatValue() == 0.0f) {
                i--;
            }
            if (c61783OMp.LJLILLLLZI.indexOfChild(view) > i) {
                c61783OMp.setStar(c61783OMp.LJLILLLLZI.indexOfChild(view) + 1);
                return;
            }
            if (c61783OMp.LJLILLLLZI.indexOfChild(view) == i) {
                if (c61783OMp.LJLLILLLL == EnumC61786OMs.Full) {
                    return;
                }
                if (imageView.getDrawable().getCurrent().getConstantState().equals(c61783OMp.LJLLI.getConstantState())) {
                    c61783OMp.setStar(c61783OMp.LJLILLLLZI.indexOfChild(view) + 1);
                    return;
                } else {
                    c61783OMp.setStar(c61783OMp.LJLILLLLZI.indexOfChild(view) + 0.5f);
                    return;
                }
            }
            c61783OMp.setStar(c61783OMp.LJLILLLLZI.indexOfChild(view) + 1.0f);
        }
    }

    public static final void onClick$5(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        AdFakeUserProfileNewBottomBarWidget adFakeUserProfileNewBottomBarWidget = (AdFakeUserProfileNewBottomBarWidget) aCListenerS45S0200000_10.l0;
        NN6.LIZ(adFakeUserProfileNewBottomBarWidget.LJLIL, adFakeUserProfileNewBottomBarWidget.LJLJLJ);
    }

    public static final void onClick$6(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String authorUid;
        DonationFragment donationFragment = (DonationFragment) aCListenerS45S0200000_10.l0;
        if (!donationFragment.LJLLLLLL) {
            donationFragment.LJLLLLLL = true;
        }
        C188727au c188727au = new C188727au();
        String vl = ((DonationFragment) aCListenerS45S0200000_10.l0).vl();
        String str = "";
        if (vl == null) {
            vl = "";
        }
        c188727au.LJIIIZ("group_id", vl);
        Aweme aweme = ((DonationFragment) aCListenerS45S0200000_10.l0).getAweme();
        if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
            str = authorUid;
        }
        c188727au.LJIIIZ("author_id", str);
        c188727au.LJIIIZ("enter_from", ((DonationFragment) aCListenerS45S0200000_10.l0).getEnterFrom());
        c188727au.LJIIIZ("ngo_name", (String) ((DonationFragment) aCListenerS45S0200000_10.l0).LJLLJ.getValue());
        c188727au.LJIIIZ("enter_method", "donation_panel");
        c188727au.LJIIIZ("log_pb", (String) ((DonationFragment) aCListenerS45S0200000_10.l0).LJLJJI.getValue());
        FMX.LJIIL("donation_h5_entrance_click", c188727au.LIZ);
        BannerStruct bannerStruct = (BannerStruct) aCListenerS45S0200000_10.l1;
        if (bannerStruct != null && bannerStruct.bannerSiteUrl != null) {
            String str2 = bannerStruct.bannerSiteUrl;
            o.LJI(str2);
            if (str2.length() > 0) {
                DonationFragment donationFragment2 = (DonationFragment) aCListenerS45S0200000_10.l0;
                donationFragment2.Hl(((BannerStruct) aCListenerS45S0200000_10.l1).bannerSiteUrl, donationFragment2.getEnterFrom());
            }
        }
    }

    public static final void onClick$7(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        NotificationChunkVM notificationChunkVM;
        SIS sis;
        Map<String, String> map;
        HeaderCell headerCell = (HeaderCell) aCListenerS45S0200000_10.l0;
        C72516Sd6 c72516Sd6 = headerCell.LJLJJL;
        InterfaceC74236TBo<Object>[] interfaceC74236TBoArr = HeaderCell.LJLJLLL;
        C72513Sd3 c72513Sd3 = (C72513Sd3) c72516Sd6.LIZ(headerCell, interfaceC74236TBoArr[0]);
        o.LJI(c72513Sd3);
        c72513Sd3.LJLIL.LJIIJ().LIZJ();
        HeaderCell headerCell2 = (HeaderCell) aCListenerS45S0200000_10.l0;
        C72513Sd3 c72513Sd32 = (C72513Sd3) headerCell2.LJLJJL.LIZ(headerCell2, interfaceC74236TBoArr[0]);
        if (c72513Sd32 != null && (notificationChunkVM = c72513Sd32.LJLILLLLZI) != null && (sis = notificationChunkVM.LJLL) != null && (map = sis.LJFF) != null) {
            str = map.get("enter_from");
        } else {
            str = null;
        }
        String uri = UriProtector.parse(((C72521SdB) aCListenerS45S0200000_10.l1).LJLJJI).buildUpon().appendQueryParameter("start_click_time", String.valueOf(SystemClock.elapsedRealtime())).appendQueryParameter("enter_from", str).appendQueryParameter("previous_page", "shop_message").build().toString();
        o.LJIIIIZZ(uri, "parse(t.moreJumpSchema).…      .build().toString()");
        ((HeaderCell) aCListenerS45S0200000_10.l0).getClass();
        int length = uri.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (uri.charAt(i) == '?') {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        String substring = uri.substring(0, i);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = uri.substring(i + 1);
        o.LJIIIIZZ(substring2, "this as java.lang.String).substring(startIndex)");
        Bundle bundle = new Bundle();
        for (String str2 : s.LJLJJL(substring2, new String[]{"&"}, 0, 6)) {
            bundle.putString((String) ListProtector.get(s.LJLJJL(str2, new String[]{"="}, 0, 6), 0), (String) ListProtector.get(s.LJLJJL(str2, new String[]{"="}, 0, 6), 1));
        }
        OSZ osz = new OSZ(substring, bundle);
        if (o.LJ("aweme://notice/detail", osz.getFirst()) && o.LJ("Shop updates", ((BaseBundle) osz.getSecond()).getString("title")) && C53355Kwp.LIZ()) {
            LifecycleOwner currentLifecycleOwner = ((HeaderCell) aCListenerS45S0200000_10.l0).getCurrentLifecycleOwner();
            if (currentLifecycleOwner != null) {
                if (NavigationUtils.findNavigationContainer(C212428Vi.LIZLLL(currentLifecycleOwner)) != null) {
                    LifecycleOwner currentLifecycleOwner2 = ((HeaderCell) aCListenerS45S0200000_10.l0).getCurrentLifecycleOwner();
                    if (currentLifecycleOwner2 != null) {
                        FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(C212428Vi.LIZLLL(currentLifecycleOwner2));
                        o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(fragm…(currentLifecycleOwner)))");
                        FragmentRoute.push$default(fragmentNavigation, "aweme://notice/detail_fragment", null, null, 6, null);
                        fragmentNavigation.withParam((Bundle) osz.getSecond());
                        fragmentNavigation.withAnimation(R.anim.fv, R.anim.g0, R.anim.ft, R.anim.g2);
                        fragmentNavigation.withPushType(PushType.ADD);
                        FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
                        return;
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        SmartRouter.buildRoute(((HeaderCell) aCListenerS45S0200000_10.l0).itemView.getContext(), uri).open();
    }

    public static final void onClick$8(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        String str;
        DynamicFontSizeFragment dynamicFontSizeFragment = (DynamicFontSizeFragment) aCListenerS45S0200000_10.l0;
        if (dynamicFontSizeFragment.LJZL == dynamicFontSizeFragment.LL) {
            if (dynamicFontSizeFragment.xl() != null) {
                OFZ.LIZ("click_adjust_button");
            }
            ActivityC45651qj mo49getActivity = ((DynamicFontSizeFragment) aCListenerS45S0200000_10.l0).mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
                return;
            }
            return;
        }
        View view2 = (View) aCListenerS45S0200000_10.l1;
        if (dynamicFontSizeFragment.xl() != null) {
            FMX.LJIIL("trigger_confirm_font_size", C78920UyC.LIZJ(dynamicFontSizeFragment.LL, "font_value").LIZ);
        }
        Context context = view2.getContext();
        o.LJIIIIZZ(context, "view.context");
        C26227ARb c26227ARb = new C26227ARb(context);
        Context context2 = dynamicFontSizeFragment.getContext();
        String str2 = null;
        if (context2 != null) {
            str = context2.getString(R.string.f23);
        } else {
            str = null;
        }
        c26227ARb.LJFF(str);
        c26227ARb.LJII = false;
        Context context3 = dynamicFontSizeFragment.getContext();
        if (context3 != null) {
            str2 = context3.getString(R.string.f22);
        }
        c26227ARb.LIZIZ(str2);
        UC0.LIZJ(c26227ARb, new AqS176S0100000_10(dynamicFontSizeFragment, 143));
        c26227ARb.LJI().LIZLLL();
    }

    public static final void onClick$9(ACListenerS45S0200000_10 aCListenerS45S0200000_10, View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(((Item) aCListenerS45S0200000_10.l0).uri, "video/*");
        try {
            PreviewItemFragment previewItemFragment = (PreviewItemFragment) aCListenerS45S0200000_10.l1;
            C78598Ut0.LJIJJ(intent, previewItemFragment);
            previewItemFragment.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            C16880lQ.LLZILL(Toast.makeText(((PreviewItemFragment) aCListenerS45S0200000_10.l1).getContext(), R.string.i10, 0));
        }
    }

    public ACListenerS45S0200000_10(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
