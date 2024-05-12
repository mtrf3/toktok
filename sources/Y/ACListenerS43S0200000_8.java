package Y;

import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.C00F;
import X.C03660Ck;
import X.C1799074g;
import X.C17N;
import X.C188727au;
import X.C201487vU;
import X.C26045AKb;
import X.C2NU;
import X.C2U8;
import X.C34409Dev;
import X.C38354F3m;
import X.C47390Iio;
import X.C47699Inn;
import X.C48954JJe;
import X.C48955JJf;
import X.C49065JNl;
import X.C49124JPs;
import X.C49383JZr;
import X.C49503Jbn;
import X.C49512Jbw;
import X.C50110Jla;
import X.C50214JnG;
import X.C50293JoX;
import X.C50321Joz;
import X.C50322Jp0;
import X.C50410JqQ;
import X.C50433Jqn;
import X.C50605JtZ;
import X.C50646JuE;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50653JuL;
import X.C50654JuM;
import X.C50699Jv5;
import X.C50948Jz6;
import X.C51006K0c;
import X.C51063K2h;
import X.C51105K3x;
import X.C51698KQs;
import X.C55096Ljo;
import X.C58655N0h;
import X.C58704N2e;
import X.C5S1;
import X.C6ZT;
import X.C72242sW;
import X.C76800UCe;
import X.C77275UUl;
import X.C80013Cb;
import X.C86393XvR;
import X.EF7;
import X.FMX;
import X.HG3;
import X.InterfaceC1798974f;
import X.InterfaceC46330IGg;
import X.InterfaceC50111Jlb;
import X.InterfaceC51702KQw;
import X.InterfaceC51703KQx;
import X.InterfaceC88473Ynt;
import X.J14;
import X.J17;
import X.J9P;
import X.JJ4;
import X.JJG;
import X.JJH;
import X.JNB;
import X.JND;
import X.JNW;
import X.JPM;
import X.JQA;
import X.JTG;
import X.JTO;
import X.JVR;
import X.JYS;
import X.K3H;
import X.KAK;
import X.KHK;
import X.KHM;
import X.KHZ;
import X.KLC;
import X.KNV;
import X.ORZ;
import X.RBX;
import X.X1D;
import X.XKX;
import X.Z9N;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.commercialize.challenge.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.challenge.service.ICommerceChallengeService;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.detail.button.SearchVideoSkipButtonAssem;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.entry.core.viewmodel.DetailFeedSearchHelper;
import com.ss.android.ugc.aweme.search.pages.core.ui.fragment.SearchContainerFragment;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import com.ss.android.ugc.aweme.search.pages.result.effectlist.core.model.SearchEffect;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpot;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchSpotInfo;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubPictureComponent;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.LayoutSwitcherAssem;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.vision.background.CropImageWindowViewModel;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.LiveTaskBarBottomBarAssem;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONObject;
import ujb.s;
import yq4.a;

/* loaded from: classes9.dex */
public class ACListenerS43S0200000_8 implements View.OnClickListener {
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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        String str;
        String str2;
        String str3;
        C50433Jqn searchCommonModel;
        if (C6ZT.LIZ(view)) {
            return;
        }
        Context context = ((JPM) aCListenerS43S0200000_8.l0).getContext();
        SearchSpot searchSpot = ((JPM) aCListenerS43S0200000_8.l0).LJLLILLLL;
        o.LJI(searchSpot);
        SearchSpotInfo searchSpotInfo = searchSpot.searchSpotInfo;
        String str4 = null;
        if (searchSpotInfo != null) {
            str = searchSpotInfo.buttonSchema;
        } else {
            str = null;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, str);
        buildRoute.withParam("pre_search_id", ((JQA) aCListenerS43S0200000_8.l1).LJII);
        C50948Jz6 c50948Jz6 = JTO.LIZ(((JPM) aCListenerS43S0200000_8.l0).getActivity()).LJLIL;
        if (c50948Jz6 != null) {
            str2 = c50948Jz6.getEnterSearchFrom();
        } else {
            str2 = null;
        }
        buildRoute.withParam("enter_from", str2);
        buildRoute.open();
        JPM jpm = (JPM) aCListenerS43S0200000_8.l0;
        SearchSpot searchSpot2 = jpm.LJLLILLLL;
        o.LJI(searchSpot2);
        jpm.U("search_result_click", searchSpot2);
        JSONObject jSONObject = new JSONObject();
        JPM jpm2 = (JPM) aCListenerS43S0200000_8.l0;
        C50948Jz6 c50948Jz62 = JTO.LIZ(jpm2.getActivity()).LJLIL;
        if (c50948Jz62 != null) {
            str3 = c50948Jz62.getEnterSearchFrom();
        } else {
            str3 = null;
        }
        jSONObject.put("enter_from", str3);
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj activity = jpm2.getActivity();
        c50651JuJ.getClass();
        C50650JuI LJII = C50651JuJ.LJII(activity);
        if (LJII != null && (searchCommonModel = LJII.getSearchCommonModel()) != null) {
            str4 = searchCommonModel.getEnterFrom();
        }
        jSONObject.put("enter_from_x", str4);
        JVR.LIZLLL("ref_search_hot_spot_bind", C77275UUl.LIZLLL("enter_from"), jSONObject);
    }

    public static final void onClick$1(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        final C51698KQs c51698KQs = (C51698KQs) aCListenerS43S0200000_8.l0;
        final User user = (User) aCListenerS43S0200000_8.l1;
        c51698KQs.getClass();
        if (C6ZT.LIZIZ(view, 300L)) {
            return;
        }
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            InterfaceC51703KQx interfaceC51703KQx = c51698KQs.LJLJL;
            if (interfaceC51703KQx != null) {
                user.getFollowStatus();
                if (interfaceC51703KQx.LIZ()) {
                    return;
                }
            }
            if (!((RBX) HG3.LJIILL()).isLogin()) {
                J9P.LIZIZ(c51698KQs.LJLILLLLZI, c51698KQs.LJLJI.getEnterFrom(), c51698KQs.LJLJI.getEnterMethod(), null, new JJ4() { // from class: X.KQt
                    @Override // X.JJ4
                    public final /* synthetic */ void LIZIZ() {
                    }

                    @Override // X.JJ4
                    public final void LIZ() {
                        C51698KQs c51698KQs2 = C51698KQs.this;
                        User user2 = user;
                        c51698KQs2.getClass();
                        if (HG3.LJIILL().isLogin()) {
                            c51698KQs2.LJ(user2);
                        }
                    }
                });
                return;
            }
            InterfaceC51702KQw interfaceC51702KQw = c51698KQs.LJLJJLL;
            if (interfaceC51702KQw != null) {
                interfaceC51702KQw.onStartFollowOperation();
            }
            c51698KQs.LJ(user);
            return;
        }
        AnonymousClass030.LJ(view, R.string.img);
    }

    public static final void onClick$10(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View it) {
        if (C6ZT.LIZ(it)) {
            return;
        }
        ((C48955JJf) aCListenerS43S0200000_8.l0).itemView.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            ((C48955JJf) aCListenerS43S0200000_8.l0).P(((C48954JJe) aCListenerS43S0200000_8.l1).LIZIZ, true);
            InterfaceC88473Ynt<View, Aweme, Integer, C76800UCe> interfaceC88473Ynt = ((C48954JJe) aCListenerS43S0200000_8.l1).LIZJ;
            if (interfaceC88473Ynt != null) {
                o.LJIIIIZZ(it, "it");
                interfaceC88473Ynt.invoke(it, ((C48954JJe) aCListenerS43S0200000_8.l1).LIZ, Integer.valueOf(((C48955JJf) aCListenerS43S0200000_8.l0).getLayoutPosition()));
                return;
            }
            return;
        }
        C5S1 c5s1 = new C5S1(((C48955JJf) aCListenerS43S0200000_8.l0).itemView.getContext());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public static final void onClick$11(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        String str;
        String str2;
        if (a.LJIIIZ().LIZJ()) {
            LinearLayout linearLayout = ((C51006K0c) aCListenerS43S0200000_8.l0).LJLLI;
            if (linearLayout != null) {
                C26045AKb c26045AKb = new C26045AKb(linearLayout);
                c26045AKb.LJIIIIZZ(R.string.g9g);
                c26045AKb.LJIIJ();
                return;
            }
            o.LJIJI("layout");
            throw null;
        }
        C51006K0c c51006K0c = (C51006K0c) aCListenerS43S0200000_8.l0;
        Aweme aweme = c51006K0c.LJLIL;
        String str3 = c51006K0c.LJLILLLLZI;
        C50646JuE c50646JuE = new C50646JuE();
        c50646JuE.LJIIZILJ("search_position", str3);
        c50646JuE.LJJIIJ(c51006K0c.LJLJI);
        c50646JuE.LJIIZILJ("words_source", "comment_related_search");
        c50646JuE.LJIIZILJ("words_content", c51006K0c.LJLLLL);
        c50646JuE.LJIIZILJ("group_id", c51006K0c.LJLLLLLL);
        String groupId = aweme.getGroupId();
        if (groupId != null) {
            groupId.toString();
            c50646JuE.LIZLLL("enter_group_id", groupId);
        }
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
            str = ((C50322Jp0) KNV.LIZ()).LJLJI;
        }
        c50646JuE.LJIIZILJ("impr_id", str);
        c50646JuE.LJIIZILJ("is_ecom_search", CardStruct.IStatusCode.DEFAULT);
        if (c51006K0c.LJLJJL) {
            c50646JuE.LJIIZILJ("is_from_photo", "1");
            DetailFeedSearchHelper.LJLIL.getClass();
            c50646JuE.LJIIZILJ("is_from_video", DetailFeedSearchHelper.LIZLLL(str3));
        }
        c50646JuE.LJIILIIL();
        C50699Jv5 c50699Jv5 = new C50699Jv5(c51006K0c.getContext());
        LogPbBean logPbBean2 = aweme.getLogPbBean();
        if (logPbBean2 == null || (str2 = logPbBean2.getImprId()) == null) {
            str2 = ((C50322Jp0) KNV.LIZ()).LJLJI;
        }
        c50699Jv5.LJII(str2);
        C51006K0c c51006K0c2 = (C51006K0c) aCListenerS43S0200000_8.l0;
        Bundle searchParams = c51006K0c2.getSearchParams();
        SmartRoute buildRoute = SmartRouter.buildRoute(c51006K0c2.getContext(), "//search");
        buildRoute.withParam(searchParams);
        buildRoute.open();
        Z9N.LIZIZ.LIZ.LLLIIII(((C72242sW) aCListenerS43S0200000_8.l1).element, "comment_related_search", false);
    }

    public static final void onClick$12(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View it) {
        String LIZJ;
        if (a.LJIIIZ().LIZJ()) {
            o.LJIIIIZZ(it, "it");
            C26045AKb c26045AKb = new C26045AKb(it);
            c26045AKb.LJIIIIZZ(R.string.g9g);
            c26045AKb.LJIIJ();
            return;
        }
        SmartRoute it2 = SmartRouter.buildRoute(((View) aCListenerS43S0200000_8.l0).getContext(), "//search");
        it2.withParam("set_hint_by_sug_word", true);
        it2.withParam("is_from_video", "1");
        it2.withParam("in_single_stack", true);
        it2.withParam("group_id", (String) ((Map) aCListenerS43S0200000_8.l1).get("group_id"));
        it2.withParam("search_session_id", (String) ((Map) aCListenerS43S0200000_8.l1).get("search_session_id"));
        if (((Map) aCListenerS43S0200000_8.l1).containsKey("isTrending")) {
            LIZJ = "trending_inflow";
        } else {
            DetailFeedSearchHelper detailFeedSearchHelper = DetailFeedSearchHelper.LJLIL;
            Map map = (Map) aCListenerS43S0200000_8.l1;
            detailFeedSearchHelper.getClass();
            LIZJ = DetailFeedSearchHelper.LIZJ(map);
        }
        it2.withParam("blankpage_enter_from", LIZJ);
        Map map2 = (Map) aCListenerS43S0200000_8.l1;
        String str = (String) map2.get("is_from_photo");
        if (str != null) {
            if (o.LJ(str, "1")) {
                it2.withParam("is_from_video", (String) map2.get("is_from_video"));
            }
            it2.withParam("is_from_photo", str);
        }
        it2.withParam("blankpage_enter_method", "enter");
        Map map3 = (Map) aCListenerS43S0200000_8.l1;
        DetailFeedSearchHelper detailFeedSearchHelper2 = DetailFeedSearchHelper.LJLIL;
        o.LJIIIIZZ(it2, "it");
        detailFeedSearchHelper2.getClass();
        DetailFeedSearchHelper.LJII(it2, map3);
        it2.open();
        DetailFeedSearchHelper.LJIILIIL((Map) aCListenerS43S0200000_8.l1);
    }

    public static final void onClick$13(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        K3H k3h = (K3H) aCListenerS43S0200000_8.l0;
        SearchEffect searchEffect = (SearchEffect) aCListenerS43S0200000_8.l1;
        k3h.getClass();
        C50653JuL.LJLILLLLZI.getClass();
        Map LIZIZ = C50654JuM.LIZIZ();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("prop_id", searchEffect.id());
        c188727au.LIZLLL(k3h.getAdapterPosition(), "rank");
        c188727au.LJIIIZ("group_id", C50293JoX.LJFF());
        c188727au.LJIIIZ("enter_from", "search_result");
        c188727au.LJIIIZ("enter_method", "click_search_result");
        c188727au.LJIIIZ("search_result_id", searchEffect.docId);
        c188727au.LJIIIZ("search_keyword", (String) LIZIZ.get("search_keyword"));
        c188727au.LJIIIZ("search_id", (String) LIZIZ.get("search_id"));
        c188727au.LJIIIZ("process_id", (String) LIZIZ.get("process_id"));
        FMX.LJIIL("enter_prop_detail", c188727au.LIZ);
        ((K3H) aCListenerS43S0200000_8.l0).L((SearchEffect) aCListenerS43S0200000_8.l1, "click_tool");
        Map LIZIZ2 = C50654JuM.LIZIZ();
        String str = ((SearchEffect) aCListenerS43S0200000_8.l1).docId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZIZ2.put("list_item_id", str);
        String str3 = ((SearchEffect) aCListenerS43S0200000_8.l1).id;
        o.LJIIIIZZ(str3, "data.id");
        LIZIZ2.put("prop_id", str3);
        LIZIZ2.put("search_type", "effect");
        String str4 = ((SearchEffect) aCListenerS43S0200000_8.l1).docId;
        if (str4 != null) {
            str2 = str4;
        }
        LIZIZ2.put("search_result_id", str2);
        C50654JuM.LIZJ(LIZIZ2, false);
        Context context = ((K3H) aCListenerS43S0200000_8.l0).itemView.getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("//stickers/detail/");
        LIZ.append(((SearchEffect) aCListenerS43S0200000_8.l1).id());
        SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
        buildRoute.withParam("extra_previous_page", "general_search");
        buildRoute.open();
    }

    public static final void onClick$14(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        ((K3H) aCListenerS43S0200000_8.l0).L((SearchEffect) aCListenerS43S0200000_8.l1, "click_shoot");
        C50653JuL.LJLILLLLZI.getClass();
        Map LIZIZ = C50654JuM.LIZIZ();
        String str = ((SearchEffect) aCListenerS43S0200000_8.l1).docId;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        LIZIZ.put("list_item_id", str);
        String str3 = ((SearchEffect) aCListenerS43S0200000_8.l1).id;
        o.LJIIIIZZ(str3, "data.id");
        LIZIZ.put("prop_id", str3);
        LIZIZ.put("search_type", "effect");
        String str4 = ((SearchEffect) aCListenerS43S0200000_8.l1).docId;
        if (str4 != null) {
            str2 = str4;
        }
        LIZIZ.put("search_result_id", str2);
        C50654JuM.LIZJ(LIZIZ, false);
        HashMap<String, String> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : LIZIZ.entrySet()) {
            if (!o.LJ("is_search_scene", entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        hashMap.putAll(linkedHashMap);
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        RecordConfig.Builder builder = new RecordConfig.Builder();
        builder.sticker(((SearchEffect) aCListenerS43S0200000_8.l1).id());
        builder.creationId(uuid);
        builder.shootWay("prop_page");
        builder.enterFrom("search_result");
        builder.extraLogParams(hashMap);
        IExternalService LIZ = AVExternalServiceImpl.LIZ();
        Context context = ((K3H) aCListenerS43S0200000_8.l0).itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        LIZ.asyncService(context, "prop_page", new IDLCallbackS107S0200000_9((K3H) aCListenerS43S0200000_8.l0, builder, 4));
        C50410JqQ c50410JqQ = new C50410JqQ();
        c50410JqQ.LJIILLIIL(hashMap);
        c50410JqQ.LJIIZILJ("enter_method", "click_prop_publish");
        c50410JqQ.LJIJI("search_result");
        c50410JqQ.LJIIZILJ("shoot_way", "prop_page");
        c50410JqQ.LJIIZILJ("shoot_entrance", "prop_page");
        c50410JqQ.LJIIZILJ("creation_id", uuid);
        c50410JqQ.LJIIZILJ("search_type", "effect");
        c50410JqQ.LJIILIIL();
    }

    public static final void onClick$15(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        String str;
        if (C6ZT.LIZ(view)) {
            return;
        }
        CommerceChallengeServiceImpl.LIZIZ().LIZLLL(((C49383JZr) aCListenerS43S0200000_8.l1).LJLJLLL);
        String uuid = UUID.randomUUID().toString();
        C49383JZr c49383JZr = (C49383JZr) aCListenerS43S0200000_8.l1;
        int adapterPosition = c49383JZr.getAdapterPosition();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view2 = c49383JZr.itemView;
        c50651JuJ.getClass();
        C50650JuI LJI = C50651JuJ.LJI(view2);
        if (LJI != null) {
            c49383JZr.LJLLL = LJI.getSearchVideoModel().getGroupId();
        }
        Challenge challenge = c49383JZr.LJLJLLL;
        String str2 = null;
        if (challenge != null) {
            JQA LJLJL = c49383JZr.LJLJL();
            if (LJLJL.LIZ) {
                View view3 = c49383JZr.itemView;
                String str3 = LJLJL.LJ;
                String cid = challenge.getCid();
                String LIZIZ = JNW.LIZIZ(c49383JZr.LJLL);
                int i = c49383JZr.LJLLLL;
                String str4 = c49383JZr.LJLLL;
                C49503Jbn.LIZ(view3, cid, adapterPosition, null);
                String LIZIZ2 = C49503Jbn.LIZIZ();
                C201487vU c201487vU = new C201487vU();
                c201487vU.LJJLIIIJJI = cid;
                c201487vU.LJJLIIIJLJLI = uuid;
                c201487vU.LIZLLL = JNW.LIZ(3);
                String rank = String.valueOf(i);
                o.LJIIIZ(rank, "rank");
                c201487vU.LJIIIZ = rank;
                c201487vU.LJJLIIIIJ = 0;
                c201487vU.LJJIJ(LIZIZ2);
                if (!C38354F3m.LJ(str4)) {
                    c201487vU.LJLJJL = str4;
                }
                JNW.LIZJ(adapterPosition, str3, LIZIZ2, c201487vU, 3, LIZIZ);
                JNW.LJI(3, cid, str3);
            } else {
                View view4 = c49383JZr.itemView;
                String str5 = LJLJL.LJ;
                String requestId = challenge.getRequestId();
                String cid2 = challenge.getCid();
                String LIZIZ3 = JNW.LIZIZ(c49383JZr.LJLL);
                String LIZIZ4 = C49503Jbn.LIZIZ();
                String cid3 = challenge.getCid();
                String str6 = c49383JZr.LJLLL;
                C49503Jbn.LIZ(view4, cid2, adapterPosition, null);
                C201487vU c201487vU2 = new C201487vU();
                c201487vU2.LJJLIIIJJI = cid2;
                c201487vU2.LJJLIIIJLJLI = uuid;
                c201487vU2.LIZLLL = JNW.LIZ(2);
                String rank2 = String.valueOf(adapterPosition);
                o.LJIIIZ(rank2, "rank");
                c201487vU2.LJIIIZ = rank2;
                c201487vU2.LJJLIIIIJ = 0;
                c201487vU2.LJJIJ(requestId);
                c201487vU2.LJJIL = LIZIZ4;
                c201487vU2.LJJIFFI = cid3;
                if (!C38354F3m.LJ(str6)) {
                    c201487vU2.LJLJJL = str6;
                }
                JNW.LIZJ(adapterPosition, str5, requestId, c201487vU2, 2, LIZIZ3);
                JNW.LJI(2, cid2, str5);
            }
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(((View) aCListenerS43S0200000_8.l0).getContext(), "//challenge/detail");
        buildRoute.withParam("id", ((C49383JZr) aCListenerS43S0200000_8.l1).LJLJLLL.getCid());
        buildRoute.withParam("enter_from", ((C49383JZr) aCListenerS43S0200000_8.l1).LJLLI);
        buildRoute.withParam("process_id", uuid);
        if (CommerceChallengeServiceImpl.LIZIZ().LJIJJ(((C49383JZr) aCListenerS43S0200000_8.l1).LJLJLLL)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        buildRoute.withParam("is_commerce", str);
        buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", ((C49383JZr) aCListenerS43S0200000_8.l1).LJLJLLL.getSubType());
        buildRoute.open();
        JQA LJLJL2 = ((C49383JZr) aCListenerS43S0200000_8.l1).LJLJL();
        if (((C49383JZr) aCListenerS43S0200000_8.l1).M() != null) {
            str2 = ((C49383JZr) aCListenerS43S0200000_8.l1).M().jv0();
        }
        LJLJL2.LIZ(str2);
        ((C49383JZr) aCListenerS43S0200000_8.l1).getClass();
        JNB LIZ = JND.LIZ(LJLJL2);
        LIZ.LJIIZILJ("token_type", "tag");
        LIZ.LJJIIJZLJL(CardStruct.IStatusCode.DEFAULT);
        LIZ.LJIJ("search_result_id", ((C49383JZr) aCListenerS43S0200000_8.l1).LJLJLLL.getCid());
        LIZ.LJIIZILJ("button_type", "click_info");
        LIZ.LJ("hashtags_name", ((C49383JZr) aCListenerS43S0200000_8.l1).LJLJLLL.getSearchChaName(), InterfaceC1798974f.LIZ);
        LIZ.LJIILIIL();
        if (((C49383JZr) aCListenerS43S0200000_8.l1).LJLLILLLL.booleanValue()) {
            ICommerceChallengeService LIZIZ5 = CommerceChallengeServiceImpl.LIZIZ();
            C49383JZr c49383JZr2 = (C49383JZr) aCListenerS43S0200000_8.l1;
            LIZIZ5.LIZJ(c49383JZr2.LJLLJ, c49383JZr2.LJLJLLL.getSearchChaName());
        }
        HashMap LIZJ = C03660Ck.LIZJ("search_type", "tag");
        LIZJ.put("search_id", ((C49383JZr) aCListenerS43S0200000_8.l1).LJLJL().LJII);
        LIZJ.put("enter_position", "tag_card");
        C50653JuL.LJLILLLLZI.getClass();
        C50654JuM.LIZJ(LIZJ, false);
    }

    public static final void onClick$16(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View it) {
        if (C6ZT.LIZ(it) || JTG.LIZIZ()) {
            return;
        }
        ((JJH) aCListenerS43S0200000_8.l0).itemView.getContext();
        if (C2NU.LIZ.LIZIZ()) {
            JJG.LJLJLLL = ((Aweme) aCListenerS43S0200000_8.l1).getAid();
            InterfaceC88473Ynt<View, Integer, Aweme, C76800UCe> interfaceC88473Ynt = ((JJH) aCListenerS43S0200000_8.l0).LJLIL;
            if (interfaceC88473Ynt != null) {
                o.LJIIIIZZ(it, "it");
                interfaceC88473Ynt.invoke(it, Integer.valueOf(((JJH) aCListenerS43S0200000_8.l0).getAdapterPosition()), (Aweme) aCListenerS43S0200000_8.l1);
                return;
            }
            return;
        }
        C5S1 c5s1 = new C5S1(((JJH) aCListenerS43S0200000_8.l0).itemView.getContext());
        c5s1.LIZJ(R.string.img);
        c5s1.LJ();
    }

    public static final void onClick$17(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        String str;
        String str2;
        List<Float> videoSkipRelevantTime;
        Float f;
        IPlayerComponentAbility playerComponentAbility;
        InterfaceC46330IGg playerManager;
        BaseFeedPageParams rp0;
        Object value = ((SearchVideoSkipButtonAssem) aCListenerS43S0200000_8.l0).LLFZ.getValue();
        SearchVideoSkipButtonAssem searchVideoSkipButtonAssem = (SearchVideoSkipButtonAssem) aCListenerS43S0200000_8.l0;
        View view2 = (View) aCListenerS43S0200000_8.l1;
        Aweme aweme = searchVideoSkipButtonAssem.LLI;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(searchVideoSkipButtonAssem), IVideoCellAbility.class, null);
        if (iVideoCellAbility != null && (rp0 = iVideoCellAbility.rp0()) != null) {
            str2 = rp0.eventType;
        } else {
            str2 = null;
        }
        value.getClass();
        SearchVideoSkipVM.iv0(str, str2, false);
        o.LJIIIZ(view2, "view");
        C26045AKb c26045AKb = new C26045AKb(view2);
        c26045AKb.LJIIIIZZ(R.string.qec);
        c26045AKb.LIZLLL(1000L);
        c26045AKb.LJIIJ();
        Aweme aweme2 = searchVideoSkipButtonAssem.LLI;
        if (aweme2 != null && (videoSkipRelevantTime = aweme2.getVideoSkipRelevantTime()) != null && (f = (Float) ListProtector.get(videoSkipRelevantTime, 0)) != null) {
            float floatValue = f.floatValue();
            IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(searchVideoSkipButtonAssem), IFeedPanelPlatformAbility.class, null);
            if (iFeedPanelPlatformAbility != null && (playerComponentAbility = iFeedPanelPlatformAbility.getPlayerComponentAbility()) != null && (playerManager = playerComponentAbility.getPlayerManager()) != null) {
                playerManager.LJI((floatValue / ((float) playerManager.getDuration())) * 100);
            }
        }
    }

    public static final void onClick$18(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        Aweme aweme;
        String str;
        String str2;
        String LIZIZ;
        C86393XvR LJJIJIL;
        if (view == null || C6ZT.LIZ(view) || !(((LiveTaskBarBottomBarAssem) aCListenerS43S0200000_8.l0).getContext() instanceof ActivityC45651qj) || ((Aweme) aCListenerS43S0200000_8.l1).getAid() == null) {
            return;
        }
        C47699Inn.LJFF((Aweme) aCListenerS43S0200000_8.l1, false);
        LiveTaskBarBottomBarAssem liveTaskBarBottomBarAssem = (LiveTaskBarBottomBarAssem) aCListenerS43S0200000_8.l0;
        if (liveTaskBarBottomBarAssem.LLIFFJFJJ || (aweme = liveTaskBarBottomBarAssem.LLFZ) == null) {
            return;
        }
        List LJLJJL = s.LJLJJL(C47699Inn.LIZJ, new String[]{","}, 0, 6);
        if (LJLJJL.size() < 4) {
            str = "";
        } else {
            str = (String) ListProtector.get(LJLJJL, 0);
        }
        ILiveOuterService LJJJLL = LiveOuterService.LJJJLL();
        if (LJJJLL != null && (LJJIJIL = LJJJLL.LJJIJIL()) != null) {
            str2 = LJJIJIL.LJLLLLLL();
        } else {
            str2 = null;
        }
        if (o.LJ(C47699Inn.LIZIZ, "")) {
            StringBuilder LIZJ = b1.LIZJ(str2, "&video_id=");
            LIZJ.append(aweme.getAid());
            LIZJ.append("&enter_from=");
            LIZJ.append(str);
            LIZIZ = X1D.LIZIZ(LIZJ);
        } else {
            StringBuilder LIZJ2 = b1.LIZJ(str2, "&video_id=");
            LIZJ2.append(aweme.getAid());
            LIZJ2.append("&enter_from=");
            LIZJ2.append(str);
            LIZJ2.append("&last_client_page=");
            LIZJ2.append(C47699Inn.LIZIZ);
            LIZIZ = X1D.LIZIZ(LIZJ2);
        }
        SmartRouter.buildRoute(liveTaskBarBottomBarAssem.getContext(), LIZIZ).open();
    }

    public static final void onClick$19(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        KHZ khz;
        KLC klc;
        if (((KHM) aCListenerS43S0200000_8.l0).LIZLLL || C6ZT.LIZ(view)) {
            return;
        }
        KHK khk = (KHK) aCListenerS43S0200000_8.l1;
        KHM khm = (KHM) aCListenerS43S0200000_8.l0;
        khk.LIZJ(Integer.valueOf(khm.LJ), khm.LJI, "switch_entity", "frame");
        CropImageWindowViewModel cropImageWindowViewModel = ((KHK) aCListenerS43S0200000_8.l1).LJLJI;
        if (cropImageWindowViewModel == null || (khz = cropImageWindowViewModel.LJLIL) == null) {
            return;
        }
        int i = ((KHM) aCListenerS43S0200000_8.l0).LJ;
        List<KLC> list = khz.LLFZ;
        if (list == null || (klc = (KLC) ORZ.LJLLLLLL(i, list)) == null) {
            return;
        }
        khz.LJII(klc, true);
    }

    public static final void onClick$2(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        SearchBotHolder searchBotHolder = (SearchBotHolder) aCListenerS43S0200000_8.l0;
        SearchMixFeed searchMixFeed = (SearchMixFeed) aCListenerS43S0200000_8.l1;
        searchBotHolder.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("button_type", "click_info");
        TakoInfo takoInfo = searchMixFeed.bot;
        if (takoInfo != null && o.LJ(takoInfo.getLoading(), Boolean.FALSE)) {
            searchBotHolder.V(hashMap, true);
        } else {
            C49512Jbw.LIZ++;
        }
        searchBotHolder.LJLL.LJJJJ(C34409Dev.LJLIL);
        searchBotHolder.Q();
    }

    public static final void onClick$3(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        if (C6ZT.LIZIZ((View) aCListenerS43S0200000_8.l0, 500L)) {
            return;
        }
        TuxIconView tuxIconView = ((LayoutSwitcherAssem) aCListenerS43S0200000_8.l1).LJLLI;
        if (tuxIconView != null) {
            tuxIconView.setIconRes(R.raw.icon_spinner_normal);
            LayoutSwitcherAssem layoutSwitcherAssem = (LayoutSwitcherAssem) aCListenerS43S0200000_8.l1;
            TuxIconView tuxIconView2 = layoutSwitcherAssem.LJLLI;
            if (tuxIconView2 != null) {
                tuxIconView2.startAnimation((Animation) layoutSwitcherAssem.LJLLLLLL.getValue());
                SearchGlobalViewModel searchGlobalViewModel = ((LayoutSwitcherAssem) aCListenerS43S0200000_8.l1).LJLLL;
                if (searchGlobalViewModel != null) {
                    C50110Jla c50110Jla = InterfaceC50111Jlb.LJI;
                    String jv0 = searchGlobalViewModel.jv0();
                    c50110Jla.getClass();
                    if (o.LJ(jv0, "single_column")) {
                        jv0 = "double_column";
                    } else if (o.LJ(jv0, "double_column")) {
                        jv0 = "single_column";
                    }
                    XKX.LIZLLL(ViewModelKt.getViewModelScope(searchGlobalViewModel), null, null, new C80013Cb(searchGlobalViewModel, jv0, null), 3);
                    return;
                }
                o.LJIJI("globalVm");
                throw null;
            }
            o.LJIJI("tuxIconView");
            throw null;
        }
        o.LJIJI("tuxIconView");
        throw null;
    }

    public static final void onClick$4(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        boolean z = true;
        if (((C47390Iio) aCListenerS43S0200000_8.l0).LIZJ == ((Number) ((Map.Entry) aCListenerS43S0200000_8.l1).getKey()).floatValue()) {
            z = false;
        } else {
            ((C47390Iio) aCListenerS43S0200000_8.l0).LIZJ = ((Number) ((Map.Entry) aCListenerS43S0200000_8.l1).getKey()).floatValue();
            C47390Iio c47390Iio = (C47390Iio) aCListenerS43S0200000_8.l0;
            c47390Iio.LIZ(c47390Iio.LIZJ);
        }
        C47390Iio c47390Iio2 = (C47390Iio) aCListenerS43S0200000_8.l0;
        c47390Iio2.LIZ.invoke(Float.valueOf(c47390Iio2.LIZJ), Boolean.valueOf(z));
    }

    public static final void onClick$5(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        SearchHubHeaderVM searchHubHeaderVM = (SearchHubHeaderVM) ((SearchHubPictureComponent) aCListenerS43S0200000_8.l0).LJLJLLL.getValue();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C50214JnG picture = (C50214JnG) aCListenerS43S0200000_8.l1;
        o.LJIIIZ(picture, "picture");
        searchHubHeaderVM.withState(new AqS139S0200000_8(searchHubHeaderVM, picture, 27));
        ISearchContextAbility LJJJJLL = C17N.LJJJJLL();
        JSONObject jSONObject = new JSONObject();
        C50322Jp0 LIZJ = LJJJJLL.If().LIZJ();
        jSONObject.put("search_id", LIZJ.LJLJI);
        jSONObject.put("search_keyword", LIZJ.LJLJJI);
        jSONObject.put("search_result_id", picture.LJLIL);
        jSONObject.put("enter_from", "general_search");
        jSONObject.put("token_type", picture.LJLJJL.getTokenType());
        jSONObject.put("page_type", picture.LJLJJL.getPageType());
        jSONObject.put("card_title", picture.LJLILLLLZI);
        jSONObject.put("card_url", picture.LJLJJI);
        jSONObject.put("entity_type", "common");
        jSONObject.put("is_entity", "1");
        jSONObject.put("card_style", "picture");
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "JSONObject().apply {\n   …re\")\n        }.toString()");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://search_third_party");
        buildRoute.withParam("url", picture.LJLJJI);
        buildRoute.withParam("business_event_tracking", jSONObject2);
        buildRoute.withParam("report_event_tracking", jSONObject2);
        buildRoute.withParam("click_time", System.currentTimeMillis());
        buildRoute.open();
    }

    public static final void onClick$6(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        String str;
        String str2;
        String str3;
        SearchContainerFragment searchContainerFragment = (SearchContainerFragment) aCListenerS43S0200000_8.l0;
        View view2 = (View) aCListenerS43S0200000_8.l1;
        C50321Joz fetchTopFragmentData = C50652JuK.fetchTopFragmentData(searchContainerFragment.mo49getActivity());
        if (fetchTopFragmentData != null) {
            str = fetchTopFragmentData.getSearchId();
        } else {
            str = null;
        }
        if (searchContainerFragment.vl().xl() == C50605JtZ.LJIIJJI()) {
            str2 = "general_search";
        } else if (searchContainerFragment.vl().xl() == C50605JtZ.LJI()) {
            str2 = "search_places";
        } else {
            str2 = "search_result";
        }
        HashMap LIZJ = C03660Ck.LIZJ("search_id", str);
        String LJFF = C50605JtZ.LJFF(searchContainerFragment.vl().xl());
        if (o.LJ(LJFF, KAK.HASHTAG.getTabName())) {
            LJFF = "tag";
        }
        LIZJ.put("search_type", LJFF);
        LIZJ.put("search_keyword", searchContainerFragment.LJLIL.getKeyword());
        LIZJ.put("enter_from", str2);
        if (!C6ZT.LIZ(searchContainerFragment.LJLLI)) {
            if (C50605JtZ.LJII(searchContainerFragment.vl().xl()).equals("shop")) {
                if (C00F.LIZ(31744, 0, "shop_vertical_search_filter_panel", true) == 1) {
                    C51063K2h c51063K2h = new C51063K2h();
                    c51063K2h.LJIILLIIL(LIZJ);
                    C1799074g c1799074g = InterfaceC1798974f.LIZ;
                    c51063K2h.LJ("button_type", "filter_panel", c1799074g);
                    c51063K2h.LJ("search_entrance", str2, c1799074g);
                    c51063K2h.LJ("search_id", searchContainerFragment.LJLLLL.LJLLLL, c1799074g);
                    c51063K2h.LJIILIIL();
                    if (searchContainerFragment.mo49getActivity() != null) {
                        str3 = String.valueOf(searchContainerFragment.mo49getActivity().hashCode());
                    } else {
                        str3 = "";
                    }
                    Uri.Builder buildUpon = UriProtector.parse(EcomSearchServiceImpl.LJJJJZI().LJII()).buildUpon();
                    buildUpon.appendQueryParameter("container_unique_id", str3);
                    SmartRouter.buildRoute(view2.getContext(), buildUpon.toString()).open();
                } else {
                    C51105K3x c51105K3x = (C51105K3x) searchContainerFragment.vl().vl();
                    Objects.requireNonNull(c51105K3x);
                    c51105K3x.LIZLLL(LIZJ);
                }
            } else {
                C51105K3x c51105K3x2 = (C51105K3x) searchContainerFragment.vl().vl();
                Objects.requireNonNull(c51105K3x2);
                c51105K3x2.LIZLLL(LIZJ);
            }
        }
        searchContainerFragment.LL.LJLJI.postValue(Boolean.TRUE);
    }

    public static final void onClick$7(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        Aweme aweme;
        J14 j14 = (J14) aCListenerS43S0200000_8.l0;
        if (j14.LJLJJL) {
            J17 delegate = j14.getDelegate();
            if (delegate != null) {
                delegate.O2("video paused");
            }
            ((J14) aCListenerS43S0200000_8.l0).setFirstPlaybackComplete(false);
            if (!((J14) aCListenerS43S0200000_8.l0).getVideoViewComponent().LJFF() && (aweme = ((J14) aCListenerS43S0200000_8.l0).LJLJI) != null && aweme.getVideo() != null) {
                ((J14) aCListenerS43S0200000_8.l0).getClass();
                ((J14) aCListenerS43S0200000_8.l0).getVideoViewComponent().resume();
                ((J14) aCListenerS43S0200000_8.l0).LIZJ();
                J14 j142 = (J14) aCListenerS43S0200000_8.l0;
                j142.LJLJJL = false;
                J17 delegate2 = j142.getDelegate();
                if (delegate2 != null) {
                    delegate2.o3(8);
                    return;
                }
                return;
            }
            return;
        }
        J17 delegate3 = j14.getDelegate();
        if (delegate3 != null) {
            delegate3.O2("video playing");
        }
        J17 delegate4 = ((J14) aCListenerS43S0200000_8.l0).getDelegate();
        if (delegate4 == null) {
            return;
        }
        delegate4.LLLF((PaidVideoItem) aCListenerS43S0200000_8.l1);
    }

    public static final void onClick$8(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        AqS158S0100000_8 aqS158S0100000_8;
        AwemeRawAd awemeRawAd = ((Aweme) aCListenerS43S0200000_8.l0).getAwemeRawAd();
        C58655N0h LIZLLL = C58704N2e.LIZLLL("result_ad", "click", awemeRawAd);
        LIZLLL.LIZJ("shop_anchor", "refer");
        LIZLLL.LJI();
        C58655N0h LIZLLL2 = C58704N2e.LIZLLL("result_ad", "otherclick", awemeRawAd);
        LIZLLL2.LIZJ("shop_anchor", "refer");
        LIZLLL2.LJI();
        C49065JNl c49065JNl = (C49065JNl) aCListenerS43S0200000_8.l1;
        if (c49065JNl != null && (aqS158S0100000_8 = c49065JNl.LJ) != null) {
            aqS158S0100000_8.invoke();
        }
    }

    public static final void onClick$9(ACListenerS43S0200000_8 aCListenerS43S0200000_8, View view) {
        String str;
        JQA jqa = (JQA) aCListenerS43S0200000_8.l0;
        SearchGlobalViewModel M = ((C49124JPs) aCListenerS43S0200000_8.l1).M();
        if (M != null) {
            str = M.jv0();
        } else {
            str = null;
        }
        jqa.LIZ(str);
        JNB LIZ = JND.LIZ((JQA) aCListenerS43S0200000_8.l0);
        LIZ.LJIIZILJ("token_type", "live_card");
        LIZ.LJIIZILJ("list_result_type", "live");
        LIZ.LIZLLL("aladdin_words", "live");
        LIZ.LJIJ("search_result_id", ((JQA) aCListenerS43S0200000_8.l0).LJIILJJIL);
        LIZ.LJIIZILJ("aladdin_button_type", "click_more_button");
        LIZ.LJIIZILJ("list_item_id", ((JQA) aCListenerS43S0200000_8.l0).LJIILJJIL);
        LIZ.LJJI(0);
        LIZ.LJJIII(0);
        LIZ.LJIILIIL();
        C2U8.LIZ(new JYS(C50605JtZ.LJ()));
    }

    public ACListenerS43S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
