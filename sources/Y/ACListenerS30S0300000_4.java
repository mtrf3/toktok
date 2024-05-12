package Y;

import X.A0D;
import X.A0Z;
import X.A13;
import X.A14;
import X.A69;
import X.ADH;
import X.AMJ;
import X.APK;
import X.APM;
import X.APN;
import X.AR3;
import X.AR4;
import X.ASL;
import X.ASQ;
import X.ASX;
import X.ActivityC45651qj;
import X.C119244m8;
import X.C16880lQ;
import X.C188727au;
import X.C2321199b;
import X.C237749Us;
import X.C243799hX;
import X.C243839hb;
import X.C244459ib;
import X.C249109q6;
import X.C25545A0v;
import X.C25589A2n;
import X.C25590A2o;
import X.C25860ACy;
import X.C26034AJq;
import X.C26035AJr;
import X.C26073ALd;
import X.C26074ALe;
import X.C26076ALg;
import X.C26227ARb;
import X.C26231ARf;
import X.C26335AVf;
import X.C26937Ahh;
import X.C27415ApP;
import X.C27422ApW;
import X.C27740Aue;
import X.C279017q;
import X.C2QY;
import X.C38350F3i;
import X.C38683FGd;
import X.C3AW;
import X.C45631qh;
import X.C45804HyK;
import X.C50656JuO;
import X.C55096Ljo;
import X.C61878OQg;
import X.C62905OmT;
import X.C63081OpJ;
import X.C65767PrX;
import X.C68322mC;
import X.C73969T1h;
import X.C76542zS;
import X.C76800UCe;
import X.C77119UOl;
import X.C78685UuP;
import X.C78857UxB;
import X.C86661Xzl;
import X.C9G2;
import X.C9Y7;
import X.C9Y8;
import X.DialogC72721SgP;
import X.EnumC25627A3z;
import X.EnumC72807Shn;
import X.FMX;
import X.InterfaceC237779Uv;
import X.InterfaceC248679pP;
import X.InterfaceC82683Wch;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.ST9;
import X.STD;
import X.SY4;
import X.T16;
import X.T5T;
import X.UC0;
import X.ViewOnApplyWindowInsetsListenerC51181K6v;
import X.W5F;
import X.W5U;
import X.Z8A;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vh.ExtraLogisticsInfoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.following.ui.adapter.FollowListAdapter;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.model.Price;
import com.ss.android.ugc.aweme.model.PricesResponse;
import com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.aweme.paidcontent.activity.PaidContentCollectionDetailFragment;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.paidcontent.manageseries.assem.ManageSeriesListAssem;
import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftPriceAssem;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.ss.android.ugc.aweme.paidcontent.viewmodel.PaidContentDetailVideoListViewModel;
import com.ss.android.ugc.aweme.profile.aigc.IProfileAIGCService;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAIGCServiceImpl;
import com.ss.android.ugc.aweme.profile.aigc.ProfileBadgeSettingsObject;
import com.ss.android.ugc.aweme.profile.model.ProfileBadgeStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.MusProfileEditFragment;
import com.ss.android.ugc.aweme.profile.widgets.bind.account.ProfileBindAccountAssem;
import com.ss.android.ugc.aweme.profile.widgets.enterprise.ProfileEnterpriseAssem;
import com.ss.android.ugc.aweme.profile.widgets.header.avatar.OtherProfileAvatarAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.ellipsis.core.ui.SearchBarEllipsisAssem;
import com.ss.android.ugc.aweme.service.IPaidContentService;
import com.ss.android.ugc.aweme.services.ArticleModeService;
import com.ss.android.ugc.aweme.services.IArticleModeRssService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushOffReason;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushOffReasonBottomSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS108S0300000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ACListenerS30S0300000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        InterfaceC88472Yns<? super Aweme, C76800UCe> interfaceC88472Yns;
        if (o.LJ(((LinkedHashMap) ((C2321199b) aCListenerS30S0300000_4.l0).LJLJI).get((SmartImageView) aCListenerS30S0300000_4.l1), Boolean.TRUE) && (interfaceC88472Yns = ((C2321199b) aCListenerS30S0300000_4.l0).LJLIL) != null) {
            interfaceC88472Yns.invoke((Aweme) aCListenerS30S0300000_4.l2);
        }
    }

    public static final void onClick$1(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        View view2 = ((SearchBarEllipsisAssem) aCListenerS30S0300000_4.l0).LJLIL;
        if (view2 != null) {
            ASQ.LIZLLL(view2, ASX.LIZ);
            C50656JuO.LIZ(((SearchBarEllipsisAssem) aCListenerS30S0300000_4.l0).getContext(), ((C38683FGd) aCListenerS30S0300000_4.l1).LIZ, null, (Map) aCListenerS30S0300000_4.l2, false);
        } else {
            o.LJIJI("sheetView");
            throw null;
        }
    }

    public static final void onClick$10(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        C86661Xzl nv0 = ((VideoCLACaptionViewModel) aCListenerS30S0300000_4.l0).nv0();
        ((VideoCLACaptionViewModel) aCListenerS30S0300000_4.l0).getClass();
        nv0.getClass();
        C188727au c188727au = new C188727au();
        String str = nv0.LIZLLL;
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("enter_method", "translate_subtitle");
        FMX.LJIIL("enter_setting_page", c188727au.LIZ);
        SmartRoute buildRoute = SmartRouter.buildRoute((ActivityC45651qj) aCListenerS30S0300000_4.l1, "aweme://setting");
        ((VideoCLACaptionViewModel) aCListenerS30S0300000_4.l0).getClass();
        buildRoute.withParam("enter_from", "translate_subtitle");
        buildRoute.open();
        ((TuxSheet) aCListenerS30S0300000_4.l2).dismiss();
    }

    public static final void onClick$11(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        ((C26035AJr) aCListenerS30S0300000_4.l0).LJLJI.toggle();
        PushOffReasonBottomSheetFragment pushOffReasonBottomSheetFragment = ((C26034AJq) aCListenerS30S0300000_4.l1).LJLJI;
        if (pushOffReasonBottomSheetFragment != null) {
            pushOffReasonBottomSheetFragment.wl(((PushOffReason) aCListenerS30S0300000_4.l2).category, ((C26035AJr) aCListenerS30S0300000_4.l0).LJLJI.isChecked());
        }
    }

    public static final void onClick$12(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        int i = (-(view.getHeight() + ((A14) aCListenerS30S0300000_4.l0).LJLIL.getHeight())) / 2;
        ((A13) aCListenerS30S0300000_4.l1).LJLIL.yf(new C25545A0v(view.getWidth(), i, view, (ManagementPagePaidVideo) aCListenerS30S0300000_4.l2));
    }

    public static final void onClick$13(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        String str;
        long j;
        Object value = ((A69) aCListenerS30S0300000_4.l0).LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-paidContentService>(...)");
        IPaidContentService iPaidContentService = (IPaidContentService) value;
        long collectionId = ((CollectionDetailModel) aCListenerS30S0300000_4.l1).getCollectionId();
        User collectionCreator = ((CollectionDetailModel) aCListenerS30S0300000_4.l1).getCollectionCreator();
        if (collectionCreator == null || (str = collectionCreator.getUid()) == null) {
            str = "";
        }
        Long l = ((A69) aCListenerS30S0300000_4.l0).LJLILLLLZI;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        PaidContentCollectionDetailFragment LIZ = iPaidContentService.LIZ("live_pop_card", collectionId, str, j, EnumC25627A3z.LIVE);
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI((Context) aCListenerS30S0300000_4.l2);
        if (LJJIFFI != null) {
            ASL LIZ2 = C249109q6.LIZ(1);
            LIZ2.LIZ.LJLLLLLL = (int) (C63081OpJ.LJJJJJL(LJJIFFI) * 0.73d);
            o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
            TuxSheet tuxSheet = LIZ2.LIZ;
            tuxSheet.LJLLILLLL = LIZ;
            tuxSheet.LJZI = false;
            tuxSheet.LJLLJ = false;
            tuxSheet.LJZL = true;
            tuxSheet.showNow(LJJIFFI.getSupportFragmentManager(), null);
        }
    }

    public static final void onClick$14(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        User user = (User) aCListenerS30S0300000_4.l0;
        Map map = (Map) aCListenerS30S0300000_4.l1;
        ProfileBindAccountAssem profileBindAccountAssem = (ProfileBindAccountAssem) aCListenerS30S0300000_4.l2;
        C243839hb c243839hb = profileBindAccountAssem.LJLJJLL;
        if (c243839hb != null) {
            C243799hX.LJI(profileBindAccountAssem.getContext(), user, c243839hb, map);
        } else {
            o.LJIJI("mobParam");
            throw null;
        }
    }

    public static final void onClick$15(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        A0Z.LIZIZ(((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).H3().LJLILLLLZI, "edit_title", ((ManagementPagePaidVideo) aCListenerS30S0300000_4.l1).id, ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3().getState().LJLIL, ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).H3().LJLJI);
        ManageSeriesListAssem manageSeriesListAssem = (ManageSeriesListAssem) aCListenerS30S0300000_4.l0;
        ManagementPagePaidVideo managementPagePaidVideo = (ManagementPagePaidVideo) aCListenerS30S0300000_4.l1;
        Context context = manageSeriesListAssem.getContext();
        if (context != null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.aih, null, false);
            T5T t5t = (T5T) LLLLIILL.findViewById(R.id.cq6);
            t5t.requestFocus();
            if (managementPagePaidVideo.title.length() > 0) {
                t5t.setText(managementPagePaidVideo.title);
            }
            t5t.setHint(context.getString(R.string.qmp));
            t5t.setSelection(t5t.length());
            ImageView imageView = new ImageView(context);
            String str = managementPagePaidVideo.coverUrl;
            if (str != null) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                LJIIIIZZ.LJIJJ = EnumC72807Shn.CENTER_CROP;
                LJIIIIZZ.LJJIIJZLJL = imageView;
                C16880lQ.LLJJJ(LJIIIIZZ);
            }
            C26227ARb LIZ = C3AW.LIZ(context);
            C78857UxB.LJJI(LIZ, imageView, A0D.LJLIL);
            LIZ.LJ(R.string.qs3);
            UC0.LIZJ(LIZ, new AqS108S0300000_4(manageSeriesListAssem, t5t, managementPagePaidVideo, 38));
            LIZ.LJII = false;
            C77119UOl.LJFF(LIZ, LLLLIILL);
            C26231ARf LJI = LIZ.LJI();
            View LJFF = LJI.LJFF(R.id.nj);
            LJFF.setOnApplyWindowInsetsListener(new ViewOnApplyWindowInsetsListenerC51181K6v(context, LJFF));
            LJI.LIZLLL();
        }
        ((PopupWindow) aCListenerS30S0300000_4.l2).dismiss();
    }

    public static final void onClick$16(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        A0Z.LIZIZ(((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).H3().LJLILLLLZI, "remove_trailer", ((ManagementPagePaidVideo) aCListenerS30S0300000_4.l1).id, ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3().getState().LJLIL, ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).H3().LJLJI);
        ManageSeriesViewModel L3 = ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3();
        String str = ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3().getState().LJLIL;
        if (str == null) {
            str = "";
        }
        String videoId = ((ManagementPagePaidVideo) aCListenerS30S0300000_4.l1).id;
        L3.getClass();
        o.LJIIIZ(videoId, "videoId");
        L3.disposeOnClear(L3.hv0().LIZJ(str, videoId).LJIIL(new AfS56S0100000_4(L3, 144)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0100000_4(L3, 146), new AfS56S0100000_4(L3, 148)));
        ((PopupWindow) aCListenerS30S0300000_4.l2).dismiss();
    }

    public static final void onClick$17(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        A0Z.LIZIZ(((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).H3().LJLILLLLZI, "set_trailer", ((ManagementPagePaidVideo) aCListenerS30S0300000_4.l1).id, ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3().getState().LJLIL, ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).H3().LJLJI);
        ManageSeriesViewModel L3 = ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3();
        String str = ((ManageSeriesListAssem) aCListenerS30S0300000_4.l0).L3().getState().LJLIL;
        if (str == null) {
            str = "";
        }
        String videoId = ((ManagementPagePaidVideo) aCListenerS30S0300000_4.l1).id;
        L3.getClass();
        o.LJIIIZ(videoId, "videoId");
        L3.disposeOnClear(L3.hv0().LJII(str, videoId).LJIIL(new AfS56S0100000_4(L3, 139)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS56S0100000_4(L3, 141), new AfS56S0100000_4(L3, 142)));
        ((PopupWindow) aCListenerS30S0300000_4.l2).dismiss();
    }

    public static final void onClick$18(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        ((C27415ApP) aCListenerS30S0300000_4.l0).LJZ(((C27422ApW) aCListenerS30S0300000_4.l1).getBindingAdapterPosition());
        InterfaceC88471Ynr<? super Integer, ? super T, C76800UCe> interfaceC88471Ynr = ((C27415ApP) aCListenerS30S0300000_4.l0).LJLIL;
        if (interfaceC88471Ynr != 0) {
            Integer valueOf = Integer.valueOf(((C27422ApW) aCListenerS30S0300000_4.l1).getBindingAdapterPosition());
            District item = (District) aCListenerS30S0300000_4.l2;
            o.LJIIIIZZ(item, "item");
            interfaceC88471Ynr.invoke(valueOf, item);
        }
    }

    public static final void onClick$19(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        String str = ((C9G2) aCListenerS30S0300000_4.l0).LIZ;
        boolean z = false;
        if (str != null && C78685UuP.LJJJZ(str)) {
            z = true;
        }
        if (z) {
            ((IArticleModeRssService) aCListenerS30S0300000_4.l1).openRssFeed((CreatorToolsActivity) aCListenerS30S0300000_4.l2, str, "creator_tools");
        } else {
            IArticleModeRssService.DefaultImpls.openRssLinkFlow$default((IArticleModeRssService) aCListenerS30S0300000_4.l1, (CreatorToolsActivity) aCListenerS30S0300000_4.l2, null, "creator_tools", null, 10, null);
        }
        ((IArticleModeRssService) aCListenerS30S0300000_4.l1).markRssEntrypointClicked();
        C25860ACy c25860ACy = ((CreatorToolsActivity) aCListenerS30S0300000_4.l2).LLII;
        if (c25860ACy != null) {
            c25860ACy.LJIIJ(ADH.LJLIL);
        }
        ArticleModeService.INSTANCE.getArticleLoggingService().logRssFeedClick("creator_tools");
    }

    public static final void onClick$2(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        AR4 ar4 = new AR4();
        ar4.LIZ = (SY4) aCListenerS30S0300000_4.l0;
        ((InterfaceC88472Yns) aCListenerS30S0300000_4.l2).invoke(ar4);
        if (ar4.LIZIZ) {
            ASQ.LJ((TuxIntroFragment) aCListenerS30S0300000_4.l1, AR3.LIZ);
        }
    }

    public static final void onClick$20(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        InterfaceC237779Uv interfaceC237779Uv = ((C9Y7) aCListenerS30S0300000_4.l0).LJLILLLLZI;
        if (interfaceC237779Uv != null) {
            interfaceC237779Uv.LIZ(((C9Y8) aCListenerS30S0300000_4.l1).LJLILLLLZI, (C237749Us) aCListenerS30S0300000_4.l2);
        }
    }

    public static final void onClick$21(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        Context context = ((C119244m8) aCListenerS30S0300000_4.l0).getContext();
        if (context != null) {
            ProfileEnterpriseAssem profileEnterpriseAssem = (ProfileEnterpriseAssem) aCListenerS30S0300000_4.l2;
            User user = (User) aCListenerS30S0300000_4.l1;
            C62905OmT c62905OmT = new C62905OmT(context);
            c62905OmT.LJ(R.string.hsq);
            c62905OmT.LIZ(R.string.hso);
            c62905OmT.LJIIJJI(R.string.hsp, new IDCListenerS48S0200000_4(profileEnterpriseAssem, user, 1), false);
            C279017q.LIZLLL(c62905OmT);
        }
        C26335AVf.LIZ((User) aCListenerS30S0300000_4.l1, "weblink");
    }

    public static final void onClick$22(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((UIAssem) aCListenerS30S0300000_4.l0);
        if (LJIIIIZZ != null) {
            final SeriesDraftPriceAssem seriesDraftPriceAssem = (SeriesDraftPriceAssem) aCListenerS30S0300000_4.l1;
            PricesResponse pricesResponse = (PricesResponse) aCListenerS30S0300000_4.l2;
            SeriesDraftViewModel H3 = seriesDraftPriceAssem.H3();
            List<Price> priceList = pricesResponse.getPriceList();
            if (priceList == null) {
                priceList = C61878OQg.INSTANCE;
            }
            C65767PrX<Price> copyOf = C65767PrX.copyOf((List) priceList);
            o.LJIIIIZZ(copyOf, "copyOf(this ?: emptyList())");
            H3.jv0(LJIIIIZZ, copyOf, seriesDraftPriceAssem.H3().getState().LJLJJI, pricesResponse.getLocalCurrencySymbol(), new InterfaceC248679pP() { // from class: X.9pd
                @Override // X.InterfaceC248679pP
                public final void LIZ(Price price) {
                    SeriesDraftViewModel H32 = SeriesDraftPriceAssem.this.H3();
                    H32.getClass();
                    H32.setState(new AqS170S0100000_4(price, 40));
                    SeriesDraftViewModel H33 = SeriesDraftPriceAssem.this.H3();
                    H33.getClass();
                    H33.setState(new AqS170S0100000_4((Price) null, 39));
                }
            }, null, null);
        }
    }

    public static final void onClick$23(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        String str;
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ((DialogC72721SgP) aCListenerS30S0300000_4.l0).LLIIL);
        Object id = ((ProfileBadgeStruct) aCListenerS30S0300000_4.l1).getId();
        if (id == null) {
            id = "";
        }
        c188727au.LJFF(id, "badge_id");
        FMX.LJIIL("profile_badge_obtain", c188727au.LIZ);
        Context context = ((DialogC72721SgP) aCListenerS30S0300000_4.l0).getContext();
        ProfileBadgeSettingsObject profileBadgeSettingsObject = (ProfileBadgeSettingsObject) aCListenerS30S0300000_4.l2;
        if (profileBadgeSettingsObject != null) {
            str = profileBadgeSettingsObject.url;
        } else {
            str = null;
        }
        SmartRouter.buildRoute(context, str).open();
        ((DialogC72721SgP) aCListenerS30S0300000_4.l0).dismiss();
    }

    public static final void onClick$24(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", ((OtherProfileAvatarAssem) aCListenerS30S0300000_4.l0).F3());
        c188727au.LJIIIZ("action_type", "click");
        FMX.LJIIL("profile_ai_avatar_bubble", c188727au.LIZ);
        ProfileAIGCServiceImpl.LJFF().LIZIZ((Context) aCListenerS30S0300000_4.l1, APM.MY_PROFILE_FIRST_ENTRY, APN.OTHERS_HOMEPAGE, APK.CLICK_BUBBLE);
        InterfaceC82683Wch interfaceC82683Wch = (InterfaceC82683Wch) ((C68322mC) aCListenerS30S0300000_4.l2).element;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            interfaceC82683Wch.dismiss();
        }
    }

    public static final void onClick$3(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        String str;
        String priceVal;
        Float f = null;
        Map<String, String> map = ((LogisticDTO) aCListenerS30S0300000_4.l0).eventTrackInfo;
        String str2 = null;
        if (map != null) {
            str = map.get("is_next_day_delivery");
        } else {
            str = null;
        }
        C26937Ahh.LIZLLL("next_day_delivery_info", null, null, null, null, str, null, 94);
        String str3 = ((ExtraLogisticsInfoViewHolder) aCListenerS30S0300000_4.l1).getViewModel().LJLLJ;
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price = ((LogisticDTO) aCListenerS30S0300000_4.l0).shippingFee;
        if (price != null && (priceVal = price.getPriceVal()) != null) {
            f = C38350F3i.LJJIJLIJ(priceVal);
        }
        com.ss.android.ugc.aweme.ecommerce.base.common.model.Price price2 = ((LogisticDTO) aCListenerS30S0300000_4.l0).shippingFee;
        if (price2 != null) {
            str2 = price2.getCurrency();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        linkedHashMap.put("page_name", "logistics");
        linkedHashMap.put("actionsheet_name", "next_day_delivery");
        if (str3 != null) {
            linkedHashMap.put("enter_from_info", str3);
        }
        if (f != null) {
            linkedHashMap.put("shipping_price", f);
        }
        if (str2 != null) {
            linkedHashMap.put("shipping_currency", str2);
        }
        C76542zS.LIZ("tiktokec_enter_actionsheet", linkedHashMap);
        ExtraLogisticsInfoViewHolder extraLogisticsInfoViewHolder = (ExtraLogisticsInfoViewHolder) aCListenerS30S0300000_4.l1;
        Context context = ((C2QY) aCListenerS30S0300000_4.l2).getContext();
        o.LJIIIIZZ(context, "logisticInfo.context");
        extraLogisticsInfoViewHolder.showNextDayDeliverySheet(context, (LogisticDTO) aCListenerS30S0300000_4.l0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$4(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        C26074ALe.LIZLLL(new C26076ALg((User) aCListenerS30S0300000_4.l0, C27740Aue.LIZ(view.getContext()), ((FollowListAdapter) aCListenerS30S0300000_4.l1).LL(), "others_homepage", null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, new AMJ((FollowListAdapter.FollowItemViewHolder) aCListenerS30S0300000_4.l2, (User) aCListenerS30S0300000_4.l0), 1008));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$5(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        ((PushSettingFollowListAdapter.FollowItemViewHolder) aCListenerS30S0300000_4.l0).LJLJJLL = false;
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        User user = (User) aCListenerS30S0300000_4.l1;
        Activity LIZ = C27740Aue.LIZ(view.getContext());
        ((PushSettingFollowListAdapter) aCListenerS30S0300000_4.l2).getClass();
        C26074ALe.LIZLLL(new C26076ALg(user, LIZ, "push_setting", ((PushSettingFollowListAdapter) aCListenerS30S0300000_4.l2).LJLJJL, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 2032));
    }

    public static final void onClick$6(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        if (((PushSettingFollowListAdapter) aCListenerS30S0300000_4.l0).LJLJJLL) {
            ((PushSettingFollowListAdapter.FollowItemViewHolder) aCListenerS30S0300000_4.l1).LJLJJLL = true;
            if (view.getContext() != null) {
                SmartRoute buildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/");
                buildRoute.withParam("uid", ((User) aCListenerS30S0300000_4.l2).getUid());
                buildRoute.withParam("sec_user_id", ((User) aCListenerS30S0300000_4.l2).getSecUid());
                ((PushSettingFollowListAdapter) aCListenerS30S0300000_4.l0).getClass();
                buildRoute.withParam("enter_from", "push_setting");
                buildRoute.withParam("profile_enterprise_type", Z8A.LIZIZ.getEnterpriseType((User) aCListenerS30S0300000_4.l2));
                buildRoute.open();
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "click_head");
            c188727au.LJIIIZ("enter_method", "live_push_setting");
            c188727au.LJIIIZ("to_user_id", ((User) aCListenerS30S0300000_4.l2).getUid());
            FMX.LJIIL("enter_personal_detail", c188727au.LIZ);
            return;
        }
        C26074ALe LJJJZ = LiveOuterService.LJJJLL().LJJIZ().LJJJZ();
        Context context = view.getContext();
        User user = (User) aCListenerS30S0300000_4.l2;
        LJJJZ.getClass();
        C26073ALd.LJFF(context, user);
    }

    public static final void onClick$7(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        STD.LJFF("click", (ST9) aCListenerS30S0300000_4.l0, null);
        if (((ST9) aCListenerS30S0300000_4.l0) == ST9.SUCCESSFUL) {
            IProfileAIGCService LJFF = ProfileAIGCServiceImpl.LJFF();
            Context requireContext = ((MusProfileEditFragment) aCListenerS30S0300000_4.l1).requireContext();
            o.LJIIIIZZ(requireContext, "requireContext()");
            LJFF.LIZLLL(requireContext, APM.EDIT_PROFILE_BANNER, APN.PERSONAL_HOMEPAGE, APK.CLICK_EDIT_PROFILE, ((C244459ib) aCListenerS30S0300000_4.l2).LIZJ);
            return;
        }
        IProfileAIGCService LJFF2 = ProfileAIGCServiceImpl.LJFF();
        Context requireContext2 = ((MusProfileEditFragment) aCListenerS30S0300000_4.l1).requireContext();
        o.LJIIIIZZ(requireContext2, "requireContext()");
        LJFF2.LIZJ(requireContext2, APM.EDIT_PROFILE_BANNER, APN.PERSONAL_HOMEPAGE, APK.CLICK_EDIT_PROFILE, (ST9) aCListenerS30S0300000_4.l0, null);
    }

    public static final void onClick$8(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        C45631qh c45631qh = (C45631qh) aCListenerS30S0300000_4.l0;
        if (c45631qh != null) {
            c45631qh.post(new ARunnableS23S0200000_4((LinearLayout) aCListenerS30S0300000_4.l2, c45631qh, 23));
        }
        PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem = (PaidContentCollectionDetailDescriptionAssem) aCListenerS30S0300000_4.l1;
        CollectionDetailModel collectionDetailModel = paidContentCollectionDetailDescriptionAssem.LJLLJ;
        if (collectionDetailModel != null) {
            String str = paidContentCollectionDetailDescriptionAssem.C3().LJLILLLLZI;
            Boolean valueOf = Boolean.valueOf(C25590A2o.LIZ(paidContentCollectionDetailDescriptionAssem.C3().LJLJJI));
            C188727au c188727au = new C188727au();
            c188727au.LJI("enter_from", str);
            C25589A2n.LJ(c188727au, collectionDetailModel);
            C25589A2n.LIZ(c188727au, collectionDetailModel);
            C25589A2n.LJI(c188727au, collectionDetailModel);
            c188727au.LJ(collectionDetailModel.getCollectionSalesNum(), "collection_sold_cnt");
            if (valueOf != null) {
                C25589A2n.LJII(c188727au, valueOf.booleanValue());
            }
            C25589A2n.LJIIIZ(c188727au, collectionDetailModel.getHasPurchasedCollection());
            FMX.LJIIL("click_refund_and_lifetime_access_row", c188727au.LIZ);
        }
    }

    public static final void onClick$9(ACListenerS30S0300000_4 aCListenerS30S0300000_4, View view) {
        PaidContentDetailVideoListViewModel F3 = ((PaidContentCollectionDetailDescriptionAssem) aCListenerS30S0300000_4.l0).F3();
        PaidVideoItem paidVideoItem = (PaidVideoItem) aCListenerS30S0300000_4.l1;
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        String str = null;
        F3.iv0(paidVideoItem, context, (CollectionDetailModel) aCListenerS30S0300000_4.l2, null);
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aCListenerS30S0300000_4.l2;
        if (collectionDetailModel != null) {
            PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem = (PaidContentCollectionDetailDescriptionAssem) aCListenerS30S0300000_4.l0;
            Intent intent = paidContentCollectionDetailDescriptionAssem.C3().LJLJJI;
            if (intent != null) {
                str = C16880lQ.LLJJIJIIJIL(intent, "enter_from");
            }
            C25589A2n.LJIIJJI("click_trailer_button_collection", str, null, null, null, Boolean.valueOf(C25590A2o.LIZ(paidContentCollectionDetailDescriptionAssem.C3().LJLJJI)), null, null, null, null, null, null, null, null, null, null, null, null, collectionDetailModel, null, null, null, null, null, null, 66584508);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS30S0300000_4(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter.FollowItemViewHolder r2, com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter r3, com.ss.android.ugc.aweme.profile.model.User r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 5: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r4
            r0.l2 = r3
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS30S0300000_4.<init>(com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter$FollowItemViewHolder, com.ss.android.ugc.aweme.notificationlive.ui.adapter.PushSettingFollowListAdapter, com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    public ACListenerS30S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
