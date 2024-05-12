package Y;

import X.ActivityC45651qj;
import X.C1046948z;
import X.C10K;
import X.C113554cx;
import X.C188727au;
import X.C189127bY;
import X.C190187dG;
import X.C190497dl;
import X.C190817eH;
import X.C191867fy;
import X.C196697nl;
import X.C198507qg;
import X.C1DG;
import X.C211068Qc;
import X.C211088Qe;
import X.C218008h2;
import X.C218028h4;
import X.C220488l2;
import X.C221018lt;
import X.C222578oP;
import X.C224498rV;
import X.C227128vk;
import X.C227328w4;
import X.C227768wm;
import X.C26045AKb;
import X.C2U8;
import X.C38350F3i;
import X.C40343FsR;
import X.C40883G2t;
import X.C45804HyK;
import X.C51556KLg;
import X.C54838Lfe;
import X.C55723Ltv;
import X.C56750MPa;
import X.C57362MfG;
import X.C57386Mfe;
import X.C57738MlK;
import X.C65352Pkq;
import X.C6ZT;
import X.C72818Shy;
import X.C75792yF;
import X.C78609UtB;
import X.C78685UuP;
import X.C7DS;
import X.C7ZV;
import X.C8RC;
import X.C8VC;
import X.EnumC2049482o;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.F6B;
import X.FMX;
import X.HG3;
import X.IWF;
import X.IWH;
import X.InterfaceC189137bZ;
import X.InterfaceC229748zy;
import X.InterfaceC46645ISj;
import X.InterfaceC57702Mkk;
import X.J9P;
import X.JHM;
import X.MH9;
import X.OKG;
import X.RBX;
import X.X1D;
import X.Y9G;
import X.Y9H;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.assem.addtostorybutton.AddToStoryButtonAssem;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.MixFlowParam;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionRecommendCell;
import com.ss.android.ugc.aweme.mention.ui.cell.VideoCaptionMentionSearchCell;
import com.ss.android.ugc.aweme.mention.viewmodel.VideoCaptionMentionSearchViewModel;
import com.ss.android.ugc.aweme.mix.bottom.AbsMixBottomBarVM;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.PoiDetailContentHeaderBaseAssemV3;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.old.PoiDetailContentHeaderBaseAssem;
import com.ss.android.ugc.aweme.poi.map.LocationDetailMobParam;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.experiment.ClickMutualLabelToMutualListSetting;
import com.ss.android.ugc.aweme.relation.ffp.ui.search.SearchFriendCell;
import com.ss.android.ugc.aweme.relation.mutual.MutualRelationServiceImpl;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiWriteReviewBottomBarAssem;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.PoiWriteReviewViewModel;
import com.ss.android.ugc.tiktok.location_api.service.experiment.PoiReviewFrequencyControl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS46S1200000_3;
import kotlin.jvm.internal.AqS57S1100000_3;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class ACListenerS25S1200000_3 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        Aweme aweme;
        User author;
        MatchedFriendStruct matchedFriendStruct;
        MutualStruct mMutualStruct;
        List<MutualUser> userList;
        Aweme aweme2;
        User author2;
        MatchedFriendStruct matchedFriendStruct2;
        MutualStruct mMutualStruct2;
        List<MutualUser> userList2;
        User author3;
        MatchedFriendStruct matchedFriendStruct3;
        MutualStruct mMutualStruct3;
        String secUid;
        String uid;
        C211088Qe.LIZ.getClass();
        int i = 0;
        String str = "";
        if (C211088Qe.LIZ()) {
            String LIZIZ = C211068Qc.LIZIZ((Aweme) aCListenerS25S1200000_3.l1);
            if ((o.LJ(LIZIZ, "3-1") || o.LJ(LIZIZ, "3-2") || o.LJ(LIZIZ, "3-3")) && (aweme = (Aweme) aCListenerS25S1200000_3.l1) != null && (author = aweme.getAuthor()) != null && (matchedFriendStruct = author.getMatchedFriendStruct()) != null && (mMutualStruct = matchedFriendStruct.getMMutualStruct()) != null && (userList = mMutualStruct.getUserList()) != null && !userList.isEmpty()) {
                C221018lt.LIZ("FeedSocialTagUtil", "[click event]");
                if (((ClickMutualLabelToMutualListSetting) C211088Qe.LIZJ.getValue()).isMutualSheetStyle) {
                    Context context = ((View) aCListenerS25S1200000_3.l2).getContext();
                    o.LJIIIIZZ(context, "containerView.context");
                    C221018lt.LIZ("FeedSocialTagUtil", String.valueOf(C45804HyK.LJJIFFI(context)));
                    ActivityC45651qj LJ = C1DG.LJ((View) aCListenerS25S1200000_3.l2, "containerView.context");
                    if (LJ != null && (aweme2 = (Aweme) aCListenerS25S1200000_3.l1) != null && (author2 = aweme2.getAuthor()) != null && (matchedFriendStruct2 = author2.getMatchedFriendStruct()) != null && (mMutualStruct2 = matchedFriendStruct2.getMMutualStruct()) != null && (userList2 = mMutualStruct2.getUserList()) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (MutualUser mutualUser : userList2) {
                            if (mutualUser != null && (uid = mutualUser.getUid()) != null) {
                                arrayList.add(uid);
                            }
                        }
                        ArrayList<String> arrayList2 = new ArrayList<>(arrayList);
                        ArrayList arrayList3 = new ArrayList();
                        for (MutualUser mutualUser2 : userList2) {
                            if (mutualUser2 != null && (secUid = mutualUser2.getSecUid()) != null) {
                                arrayList3.add(secUid);
                            }
                        }
                        ArrayList<String> arrayList4 = new ArrayList<>(arrayList3);
                        if (aweme2 != null && (author3 = aweme2.getAuthor()) != null && (matchedFriendStruct3 = author3.getMatchedFriendStruct()) != null && (mMutualStruct3 = matchedFriendStruct3.getMMutualStruct()) != null) {
                            i = mMutualStruct3.getTotal();
                        }
                        MutualRelationServiceImpl.LIZJ().LIZIZ(LJ, arrayList2, arrayList4, i);
                    }
                } else {
                    Context context2 = ((View) aCListenerS25S1200000_3.l2).getContext();
                    o.LJIIIIZZ(context2, "containerView.context");
                    User author4 = ((Aweme) aCListenerS25S1200000_3.l1).getAuthor();
                    o.LJIIIIZZ(author4, "aweme.author");
                    String str2 = aCListenerS25S1200000_3.s0;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C57386Mfe.LIZ(context2, author4, str2);
                }
                C57362MfG c57362MfG = new C57362MfG();
                String str3 = aCListenerS25S1200000_3.s0;
                if (str3 != null) {
                    str = str3;
                }
                c57362MfG.LJJIIZI(str);
                c57362MfG.LJJLIIIIJ = EnumC57365MfJ.CLICK_REC_LABEL;
                c57362MfG.LJJIJIIJI(EnumC2049482o.CLICK_REC_LABEL);
                c57362MfG.LJJIIZ((Aweme) aCListenerS25S1200000_3.l1);
                c57362MfG.LJJJJIZL(((Aweme) aCListenerS25S1200000_3.l1).getAuthor());
                c57362MfG.LJJJJ(((Aweme) aCListenerS25S1200000_3.l1).getLogPbString());
                c57362MfG.LJJLI = EnumC57366MfK.ITEM;
                c57362MfG.LJJJJI();
                c57362MfG.LJJIZ();
                return;
            }
        }
        C2U8.LIZ(new C224498rV(((View) aCListenerS25S1200000_3.l2).getContext().hashCode(), 0));
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C7ZV c7zv = new C7ZV();
        String str4 = aCListenerS25S1200000_3.s0;
        if (str4 == null) {
            str4 = "";
        }
        c7zv.LIZLLL = str4;
        c7zv.LJJLIIIJJIZ = ((Aweme) aCListenerS25S1200000_3.l1).getAuthorUid();
        c7zv.LJLLLL = Boolean.TRUE;
        c7zv.LJIJI = C211068Qc.LIZIZ((Aweme) aCListenerS25S1200000_3.l1);
        c7zv.LJJLI = "click_rec_label";
        Object LJII = c220488l2.LJII((Aweme) aCListenerS25S1200000_3.l1, c7zv);
        C222578oP.LIZJ(LJII, (Aweme) aCListenerS25S1200000_3.l1, null, null, 14);
        ((JHM) LJII).LJIILIIL();
        C57362MfG c57362MfG2 = new C57362MfG();
        String str5 = aCListenerS25S1200000_3.s0;
        if (str5 != null) {
            str = str5;
        }
        c57362MfG2.LJJIIZI(str);
        c57362MfG2.LJJLIIIIJ = EnumC57365MfJ.ENTER_PROFILE;
        c57362MfG2.LJJIJIIJI(EnumC2049482o.CLICK_REC_LABEL);
        c57362MfG2.LJJIIZ((Aweme) aCListenerS25S1200000_3.l1);
        c57362MfG2.LJJJJIZL(((Aweme) aCListenerS25S1200000_3.l1).getAuthor());
        c57362MfG2.LJJJJ(((Aweme) aCListenerS25S1200000_3.l1).getLogPbString());
        c57362MfG2.LJJLI = EnumC57366MfK.ITEM;
        c57362MfG2.LJJJJI();
        Object LJII2 = c220488l2.LJII((Aweme) aCListenerS25S1200000_3.l1, c57362MfG2);
        C222578oP.LIZJ(LJII2, (Aweme) aCListenerS25S1200000_3.l1, null, null, 14);
        ((C57362MfG) LJII2).LJJIZ();
    }

    public static final void onClick$1(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        PoiAnchorData poiAnchorData;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> map;
        PoiDetailContentHeaderBaseAssemV3 poiDetailContentHeaderBaseAssemV3 = (PoiDetailContentHeaderBaseAssemV3) aCListenerS25S1200000_3.l1;
        String str7 = aCListenerS25S1200000_3.s0;
        boolean z = ((C190187dG) poiDetailContentHeaderBaseAssemV3.LJLILLLLZI.getValue().getState()).LJLIL;
        C190497dl c190497dl = (C190497dl) aCListenerS25S1200000_3.l2;
        if (!F6B.LIZ()) {
            C51556KLg.LIZ.getClass();
            C51556KLg.LIZ().LJJIJIIJIL(1, "POI_DETAIL_CLICK_EVENT", true);
        }
        Context context = poiDetailContentHeaderBaseAssemV3.getContext();
        if (context == null) {
            return;
        }
        if (c190497dl != null) {
            poiAnchorData = c190497dl.LJLJI;
            str = c190497dl.LJLIL;
            str2 = c190497dl.LJLILLLLZI;
            str3 = c190497dl.LJLJJI;
            str4 = c190497dl.LJLJJL;
            str5 = c190497dl.LJLJJLL;
            str6 = c190497dl.LJLJL;
            map = c190497dl.LJLJLLL;
        } else {
            poiAnchorData = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            map = null;
        }
        LocationDetailMobParam locationDetailMobParam = new LocationDetailMobParam(poiAnchorData, "click_address", str, str2, str3, str4, str5, str6, map);
        C190817eH LIZ = C189127bY.LIZ((InterfaceC189137bZ) C8VC.LIZIZ(poiDetailContentHeaderBaseAssemV3, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), false, null, null, 14);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//poi/map");
        buildRoute.withParam("poi_id", str7);
        buildRoute.withParam("enter_from", poiDetailContentHeaderBaseAssemV3.LJLJI);
        buildRoute.withParam("is_collected", z);
        buildRoute.withParam("mob_param", locationDetailMobParam);
        buildRoute.withParam("poi_collect_mob_data", LIZ);
        buildRoute.open();
    }

    public static final void onClick$10(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        if (!C6ZT.LIZ(view)) {
            C55723Ltv.LIZIZ.LJIIL((ActivityC45651qj) aCListenerS25S1200000_3.l1, aCListenerS25S1200000_3.s0, (Aweme) aCListenerS25S1200000_3.l2);
        }
    }

    public static final void onClick$11(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        String str;
        String str2;
        String str3;
        String str4;
        C191867fy c191867fy = com.ss.android.ugc.aweme.poi.PoiAnchorData.Companion;
        Aweme aweme = (Aweme) aCListenerS25S1200000_3.l1;
        c191867fy.getClass();
        com.ss.android.ugc.aweme.poi.PoiAnchorData LIZ = C191867fy.LIZ(aweme);
        String str5 = null;
        if (LIZ != null && C78685UuP.LJJJZ(LIZ.getPoiId())) {
            PoiWriteReviewBottomBarAssem poiWriteReviewBottomBarAssem = (PoiWriteReviewBottomBarAssem) aCListenerS25S1200000_3.l2;
            str = (String) ((LinkedHashMap) ((PoiWriteReviewViewModel) poiWriteReviewBottomBarAssem.LLI.LIZ(poiWriteReviewBottomBarAssem, PoiWriteReviewBottomBarAssem.LLIIII[0])).LJLIL).get(LIZ.getPoiId());
        } else {
            str = null;
        }
        String str6 = aCListenerS25S1200000_3.s0;
        if (LIZ != null) {
            str2 = LIZ.getPoiId();
        } else {
            str2 = null;
        }
        String groupId = ((Aweme) aCListenerS25S1200000_3.l1).getGroupId();
        String authorUid = ((Aweme) aCListenerS25S1200000_3.l1).getAuthorUid();
        if (str == null) {
            if (LIZ != null) {
                str3 = LIZ.getCollectInfo();
            } else {
                str3 = null;
            }
        } else {
            str3 = str;
        }
        C8RC.LIZIZ(1, str6, str2, groupId, authorUid, str3);
        PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
        if (LIZ != null) {
            str4 = LIZ.getPoiId();
        } else {
            str4 = null;
        }
        String str7 = "";
        if (str4 == null) {
            str4 = "";
        }
        poiReviewFrequencyControl.getClass();
        String LIZIZ = PoiReviewFrequencyControl.LIZIZ("ts_profile_banner_with_same_poi", str4);
        Keva keva = PoiReviewFrequencyControl.LIZIZ;
        keva.storeLong(LIZIZ, System.currentTimeMillis());
        keva.storeInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_with_same_poi", str4), 0);
        if (LIZ != null) {
            PoiWriteReviewBottomBarAssem poiWriteReviewBottomBarAssem2 = (PoiWriteReviewBottomBarAssem) aCListenerS25S1200000_3.l2;
            String str8 = aCListenerS25S1200000_3.s0;
            Aweme aweme2 = (Aweme) aCListenerS25S1200000_3.l1;
            Context context = view.getContext();
            o.LJIIIIZZ(context, "it.context");
            String poiId = LIZ.getPoiId();
            String poiName = LIZ.getPoiName();
            if (str == null) {
                str = LIZ.getCollectInfo();
            }
            Video video = aweme2.getVideo();
            if (video != null) {
                str5 = video.getVideoId();
            }
            poiWriteReviewBottomBarAssem2.getClass();
            o.LJIIIZ(poiId, "poiId");
            C72818Shy.LIZLLL("closeReviewSubmitPage", poiWriteReviewBottomBarAssem2);
            String LJIJJLI = PoiServiceImpl.LIZIZ().LJIJJLI("poi_review_post");
            if (LJIJJLI != null) {
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(LJIJJLI);
                sparkContext.LJJIIJ("poi_id", poiId);
                if (poiName == null) {
                    poiName = "";
                }
                String encode = Uri.encode(poiName);
                o.LJIIIIZZ(encode, "encode(poiName.orEmpty())");
                sparkContext.LJJIIJ("poi_name", encode);
                if (str8 != null) {
                    sparkContext.LJJIIJ("enter_from", str8);
                }
                if (str5 != null) {
                    sparkContext.LJJIIJ("associated_video_id", str5);
                }
                sparkContext.LJJIIJ("enter_method", "poi_review_toast");
                if (str != null) {
                    str7 = str;
                }
                String encode2 = Uri.encode(str7);
                o.LJIIIIZZ(encode2, "encode(collectInfo.orEmpty())");
                sparkContext.LJJIIJ("collect_info", encode2);
                sparkContext.LJJIFFI(2, "post_source");
                OKG.LIZLLL(C40343FsR.LJIILJJIL, context, sparkContext);
            }
        }
    }

    public static final void onClick$12(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        String str;
        String str2;
        PoiReviewFrequencyControl.ProfilePage profilePage;
        PoiReviewFrequencyControl.Frequency frequency;
        C191867fy c191867fy = com.ss.android.ugc.aweme.poi.PoiAnchorData.Companion;
        Aweme aweme = (Aweme) aCListenerS25S1200000_3.l1;
        c191867fy.getClass();
        com.ss.android.ugc.aweme.poi.PoiAnchorData LIZ = C191867fy.LIZ(aweme);
        String str3 = null;
        if (LIZ != null && C78685UuP.LJJJZ(LIZ.getPoiId())) {
            PoiWriteReviewBottomBarAssem poiWriteReviewBottomBarAssem = (PoiWriteReviewBottomBarAssem) aCListenerS25S1200000_3.l2;
            str = (String) ((LinkedHashMap) ((PoiWriteReviewViewModel) poiWriteReviewBottomBarAssem.LLI.LIZ(poiWriteReviewBottomBarAssem, PoiWriteReviewBottomBarAssem.LLIIII[0])).LJLIL).get(LIZ.getPoiId());
        } else {
            str = null;
        }
        String str4 = aCListenerS25S1200000_3.s0;
        if (LIZ != null) {
            str2 = LIZ.getPoiId();
        } else {
            str2 = null;
        }
        String groupId = ((Aweme) aCListenerS25S1200000_3.l1).getGroupId();
        String authorUid = ((Aweme) aCListenerS25S1200000_3.l1).getAuthorUid();
        if (str == null) {
            if (LIZ != null) {
                str3 = LIZ.getCollectInfo();
            }
        } else {
            str3 = str;
        }
        C8RC.LIZIZ(0, str4, str2, groupId, authorUid, str3);
        ((PoiWriteReviewBottomBarAssem) aCListenerS25S1200000_3.l2).mp0();
        PoiReviewFrequencyControl poiReviewFrequencyControl = PoiReviewFrequencyControl.LIZ;
        String aid = ((Aweme) aCListenerS25S1200000_3.l1).getAid();
        o.LJIIIIZZ(aid, "aweme.aid");
        poiReviewFrequencyControl.getClass();
        PoiReviewFrequencyControl.InnerConfig LIZ2 = PoiReviewFrequencyControl.LIZ();
        if (LIZ2 == null || (profilePage = LIZ2.profilePage) == null || (frequency = profilePage.video) == null) {
            return;
        }
        int i = frequency.frequencyDay;
        int i2 = frequency.frequencyTimes;
        String LIZIZ = PoiReviewFrequencyControl.LIZIZ("ts_profile_banner_close", aid);
        Keva keva = PoiReviewFrequencyControl.LIZIZ;
        if (System.currentTimeMillis() - keva.getLong(LIZIZ, 0L) > i * 24 * 60 * 60 * 1000) {
            keva.storeInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_close", aid), 1);
            keva.storeLong(PoiReviewFrequencyControl.LIZIZ("ts_profile_banner_close", aid), System.currentTimeMillis());
        } else {
            if (keva.getInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_close", aid), 0) >= i2) {
                return;
            }
            keva.storeInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_close", aid), keva.getInt(PoiReviewFrequencyControl.LIZIZ("count_profile_banner_close", aid), 0) + 1);
        }
    }

    public static final void onClick$2(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        PoiAnchorData poiAnchorData;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Map<String, String> map;
        PoiDetailContentHeaderBaseAssem poiDetailContentHeaderBaseAssem = (PoiDetailContentHeaderBaseAssem) aCListenerS25S1200000_3.l1;
        String str7 = aCListenerS25S1200000_3.s0;
        boolean z = ((C190187dG) poiDetailContentHeaderBaseAssem.LJLILLLLZI.getValue().getState()).LJLIL;
        C190497dl c190497dl = (C190497dl) aCListenerS25S1200000_3.l2;
        if (!F6B.LIZ()) {
            C51556KLg.LIZ.getClass();
            C51556KLg.LIZ().LJJIJIIJIL(1, "POI_DETAIL_CLICK_EVENT", true);
        }
        Context context = poiDetailContentHeaderBaseAssem.getContext();
        if (context == null) {
            return;
        }
        if (c190497dl != null) {
            poiAnchorData = c190497dl.LJLJI;
            str = c190497dl.LJLIL;
            str2 = c190497dl.LJLILLLLZI;
            str3 = c190497dl.LJLJJI;
            str4 = c190497dl.LJLJJL;
            str5 = c190497dl.LJLJJLL;
            str6 = c190497dl.LJLJL;
            map = c190497dl.LJLJLLL;
        } else {
            poiAnchorData = null;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            map = null;
        }
        LocationDetailMobParam locationDetailMobParam = new LocationDetailMobParam(poiAnchorData, "click_address", str, str2, str3, str4, str5, str6, map);
        C190817eH LIZ = C189127bY.LIZ((InterfaceC189137bZ) C8VC.LIZIZ(poiDetailContentHeaderBaseAssem, C65352Pkq.LIZ(InterfaceC189137bZ.class), null), false, null, null, 14);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//poi/map");
        buildRoute.withParam("poi_id", str7);
        buildRoute.withParam("enter_from", poiDetailContentHeaderBaseAssem.LJLJI);
        buildRoute.withParam("is_collected", z);
        buildRoute.withParam("mob_param", locationDetailMobParam);
        buildRoute.withParam("poi_collect_mob_data", LIZ);
        buildRoute.open();
    }

    public static final void onClick$3(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        String str;
        User user = ((C227128vk) aCListenerS25S1200000_3.l1).LJLIL;
        InterfaceC57702Mkk LJIILIIL = C57738MlK.LIZIZ.LJIILIIL();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        C56750MPa.LIZIZ(LJIILIIL, context, user, "search_result", null, "find_friends_page", null, EnumC57366MfK.RELATION_LABEL.getType(), 40);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("button_type", "click_info");
        c188727au.LJIIIIZZ(((C227128vk) aCListenerS25S1200000_3.l1).LJLILLLLZI);
        FMX.LJIIL("search_result_click", c188727au.LIZ);
        SearchFriendCell searchFriendCell = (SearchFriendCell) aCListenerS25S1200000_3.l2;
        C227128vk c227128vk = (C227128vk) aCListenerS25S1200000_3.l1;
        EnumC57365MfJ enumC57365MfJ = EnumC57365MfJ.ENTER_PROFILE;
        searchFriendCell.getClass();
        SearchFriendCell.L(c227128vk, enumC57365MfJ);
        Map LJJLIL = C113554cx.LJJLIL(((C227128vk) aCListenerS25S1200000_3.l1).LJLILLLLZI);
        LJJLIL.put("order", aCListenerS25S1200000_3.s0);
        if (((C227128vk) aCListenerS25S1200000_3.l1).LJLJLJ != null) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LJJLIL.put("has_label", str);
        String str2 = ((C227128vk) aCListenerS25S1200000_3.l1).LJLILLLLZI.get("enter_from");
        if (str2 == null) {
            str2 = "";
        }
        new C227328w4(str2, user, "click_search_result", null, null, C38350F3i.LJJIL(aCListenerS25S1200000_3.s0), null, LJJLIL, null, null, null, 1880).LIZLLL(null);
    }

    public static final void onClick$4(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        float f;
        InterfaceC46645ISj LIZJ;
        String str;
        if (view == null || C6ZT.LIZIZ(view, 3000L)) {
            return;
        }
        String str2 = null;
        if (view.getContext() instanceof InterfaceC229748zy) {
            MixFlowParam mixFlowParam = ((Aweme) aCListenerS25S1200000_3.l1).mixFlowParam;
            if (mixFlowParam != null) {
                str = mixFlowParam.getFrom();
            } else {
                str = null;
            }
            if (!o.LJ(str, "from_search_mix")) {
                Object context = view.getContext();
                o.LJII(context, "null cannot be cast to non-null type com.ss.android.ugc.aweme.mix.api.IMixDetailHandleBottomDialog");
                ((InterfaceC229748zy) context).LJJII((Aweme) aCListenerS25S1200000_3.l1);
                return;
            }
        }
        AbsMixBottomBarVM absMixBottomBarVM = (AbsMixBottomBarVM) aCListenerS25S1200000_3.l2;
        Context context2 = view.getContext();
        o.LJIIIIZZ(context2, "view.context");
        absMixBottomBarVM.hv0(context2, (Aweme) aCListenerS25S1200000_3.l1, aCListenerS25S1200000_3.s0, false);
        IMixFeedService LJJIJIIJIL = MixFeedService.LJJIJIIJIL();
        o.LJIIIIZZ(LJJIJIIJIL, "get().getService(IMixFeedService::class.java)");
        String str3 = aCListenerS25S1200000_3.s0;
        PlayListInfo playListInfo = ((Aweme) aCListenerS25S1200000_3.l1).playlist_info;
        if (playListInfo != null) {
            str2 = playListInfo.getMixId();
        }
        String groupId = ((Aweme) aCListenerS25S1200000_3.l1).getGroupId();
        String authorUid = ((Aweme) aCListenerS25S1200000_3.l1).getAuthorUid();
        IWH LJJIJIL = IWF.LJJLIIIIJ().LJJIJIL();
        if (LJJIJIL != null && (LIZJ = LJJIJIL.LIZJ()) != null) {
            f = (float) LIZJ.getCurrentPosition();
        } else {
            f = 0.0f;
        }
        C1046948z.LIZIZ(LJJIJIIJIL, str3, str2, groupId, authorUid, f, "click_banner", Integer.valueOf(((Aweme) aCListenerS25S1200000_3.l1).getVideo().getDuration()), 64);
    }

    public static final void onClick$5(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View it) {
        AddToStoryButtonAssem addToStoryButtonAssem = (AddToStoryButtonAssem) aCListenerS25S1200000_3.l1;
        o.LJIIIIZZ(it, "it");
        Aweme aweme = ((VideoItemParams) aCListenerS25S1200000_3.l2).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        String str = aCListenerS25S1200000_3.s0;
        String str2 = addToStoryButtonAssem.LLI;
        if (str2 != null) {
            C54838Lfe.LJJIIZI(it, aweme, str2, str);
        } else {
            o.LJIJI("position");
            throw null;
        }
    }

    public static final void onClick$6(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        String str;
        int i;
        User author;
        ((MH9) aCListenerS25S1200000_3.l1).LLLILZ(view, ((C196697nl) aCListenerS25S1200000_3.l2).LJLJJI, aCListenerS25S1200000_3.s0);
        C198507qg c198507qg = C198507qg.LIZIZ;
        Aweme aweme = ((C196697nl) aCListenerS25S1200000_3.l2).LJLJJI;
        if (aweme == null || (str = aweme.getAuthorUid()) == null) {
            str = "";
        }
        Aweme aweme2 = ((C196697nl) aCListenerS25S1200000_3.l2).LJLJJI;
        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
            i = author.getFollowStatus();
        } else {
            i = -1;
        }
        c198507qg.LIZ.LIZ("now_click", aCListenerS25S1200000_3.s0, str, Integer.valueOf(i));
    }

    public static final void onClick$7(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        String str;
        Set<Map.Entry<String, j>> entrySet;
        VideoCaptionMentionRecommendCell videoCaptionMentionRecommendCell = (VideoCaptionMentionRecommendCell) aCListenerS25S1200000_3.l1;
        Y9G y9g = ((C218008h2) aCListenerS25S1200000_3.l2).LJLIL;
        videoCaptionMentionRecommendCell.getClass();
        User LIZJ = Y9H.LIZJ(y9g);
        AqS169S0100000_3 aqS169S0100000_3 = new AqS169S0100000_3(y9g, 832);
        JSONObject jSONObject = new JSONObject();
        aqS169S0100000_3.invoke(jSONObject);
        String socialInfo = LIZJ.getSocialInfo();
        if (socialInfo == null || socialInfo.length() == 0) {
            MatchedFriendStruct matchedFriendStruct = LIZJ.getMatchedFriendStruct();
            if (matchedFriendStruct == null || (str = matchedFriendStruct.getSocialInfo()) == null) {
                str = "";
            }
        } else {
            str = LIZJ.getSocialInfo();
            o.LJIIIIZZ(str, "{\n        user.socialInfo\n    }");
        }
        try {
            m mVar = (m) C75792yF.LIZ(str, m.class);
            if (mVar != null && (entrySet = mVar.entrySet()) != null) {
                for (Map.Entry<String, j> entry : entrySet) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("social_info_");
                    LIZ.append(entry.getKey());
                    jSONObject.put(X1D.LIZIZ(LIZ), entry.getValue().LJJIFFI());
                }
            }
        } catch (s unused) {
        }
        C10K.LIZJ(new ACallableS31S1100000_3(jSONObject, 2));
        if (!((C218008h2) aCListenerS25S1200000_3.l2).LJLIL.LJIJI.LIZ) {
            View itemView = ((VideoCaptionMentionRecommendCell) aCListenerS25S1200000_3.l1).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.i2p);
            c26045AKb.LJIIJ();
        } else if (!TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), ((C218008h2) aCListenerS25S1200000_3.l2).LJLIL.LIZ)) {
            AssemViewModel assemViewModel = (AssemViewModel) ((VideoCaptionMentionRecommendCell) aCListenerS25S1200000_3.l1).LJLIL.getValue();
            Y9G mentionUser = ((C218008h2) aCListenerS25S1200000_3.l2).LJLIL;
            o.LJIIIZ(mentionUser, "mentionUser");
            assemViewModel.setState(new AqS169S0100000_3(mentionUser, 911));
        } else {
            View itemView2 = ((VideoCaptionMentionRecommendCell) aCListenerS25S1200000_3.l1).itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            C26045AKb c26045AKb2 = new C26045AKb(itemView2);
            c26045AKb2.LJIIIIZZ(R.string.iqh);
            c26045AKb2.LJIIJ();
        }
        VideoCaptionMentionRecommendCell videoCaptionMentionRecommendCell2 = (VideoCaptionMentionRecommendCell) aCListenerS25S1200000_3.l1;
        Y9G y9g2 = ((C218008h2) aCListenerS25S1200000_3.l2).LJLIL;
        String str2 = aCListenerS25S1200000_3.s0;
        videoCaptionMentionRecommendCell2.getClass();
        C7DS.LIZIZ("tag_mention_head_click", new AqS57S1100000_3(y9g2, str2, 31));
    }

    public static final void onClick$8(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        Y9G y9g = ((C218028h4) aCListenerS25S1200000_3.l1).LJLIL;
        if (!y9g.LJIJI.LIZ) {
            View itemView = ((VideoCaptionMentionSearchCell) aCListenerS25S1200000_3.l2).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.i2p);
            c26045AKb.LJIIJ();
        } else {
            VideoCaptionMentionSearchCell videoCaptionMentionSearchCell = (VideoCaptionMentionSearchCell) aCListenerS25S1200000_3.l2;
            videoCaptionMentionSearchCell.getClass();
            C7DS.LIZIZ("add_video_at", new AqS134S0200000_3(videoCaptionMentionSearchCell, y9g, 246));
            VideoCaptionMentionSearchCell videoCaptionMentionSearchCell2 = (VideoCaptionMentionSearchCell) aCListenerS25S1200000_3.l2;
            Y9G y9g2 = ((C218028h4) aCListenerS25S1200000_3.l1).LJLIL;
            videoCaptionMentionSearchCell2.getClass();
            C7DS.LIZIZ("trending_words_click", new AqS134S0200000_3(videoCaptionMentionSearchCell2, y9g2, 247));
            if (!TextUtils.equals(((RBX) HG3.LJIILL()).getCurUserId(), ((C218028h4) aCListenerS25S1200000_3.l1).LJLIL.LIZ)) {
                VideoCaptionMentionSearchViewModel L = ((VideoCaptionMentionSearchCell) aCListenerS25S1200000_3.l2).L();
                Y9G mentionUser = ((C218028h4) aCListenerS25S1200000_3.l1).LJLIL;
                L.getClass();
                o.LJIIIZ(mentionUser, "mentionUser");
                L.setState(new AqS169S0100000_3(mentionUser, 912));
            } else {
                View itemView2 = ((VideoCaptionMentionSearchCell) aCListenerS25S1200000_3.l2).itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                C26045AKb c26045AKb2 = new C26045AKb(itemView2);
                c26045AKb2.LJIIIIZZ(R.string.iqh);
                c26045AKb2.LJIIJ();
            }
        }
        VideoCaptionMentionSearchCell videoCaptionMentionSearchCell3 = (VideoCaptionMentionSearchCell) aCListenerS25S1200000_3.l2;
        Y9G y9g3 = ((C218028h4) aCListenerS25S1200000_3.l1).LJLIL;
        String str = aCListenerS25S1200000_3.s0;
        videoCaptionMentionSearchCell3.getClass();
        C7DS.LIZIZ("tag_mention_head_click", new AqS46S1200000_3(y9g3, str, videoCaptionMentionSearchCell3, 9));
    }

    public static final void onClick$9(ACListenerS25S1200000_3 aCListenerS25S1200000_3, View view) {
        Activity activity;
        Aweme aweme;
        Context context = (Context) aCListenerS25S1200000_3.l1;
        String str = null;
        if (context != null) {
            activity = C78609UtB.LJJLIIIJ(context);
        } else {
            activity = null;
        }
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZLLL("group_id", aCListenerS25S1200000_3.s0);
        VideoItemParams gv0 = ((VideoFavoriteVM) aCListenerS25S1200000_3.l2).gv0();
        if (gv0 != null && (aweme = gv0.getAweme()) != null) {
            str = aweme.getAuthorUid();
        }
        c40883G2t.LIZLLL("author_id", str);
        c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aCListenerS25S1200000_3.s0));
        J9P.LIZIZ(activity, "bottom_toast", "click_favorite_video", (Bundle) c40883G2t.LIZ, new IDgS347S0100000_3((VideoFavoriteVM) aCListenerS25S1200000_3.l2, 7));
    }

    public ACListenerS25S1200000_3(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
