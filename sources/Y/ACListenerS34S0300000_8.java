package Y;

import X.ActivityC45651qj;
import X.C05040Hs;
import X.C113554cx;
import X.C26045AKb;
import X.C2NU;
import X.C2U8;
import X.C30581Hy;
import X.C45804HyK;
import X.C47261Igj;
import X.C48880JGi;
import X.C48881JGj;
import X.C48887JGp;
import X.C48892JGu;
import X.C49124JPs;
import X.C49444Jaq;
import X.C49445Jar;
import X.C49447Jat;
import X.C49489JbZ;
import X.C49604JdQ;
import X.C50322Jp0;
import X.C50600JtU;
import X.C50605JtZ;
import X.C50651JuJ;
import X.C50652JuK;
import X.C50668Jua;
import X.C50669Jub;
import X.C50699Jv5;
import X.C50773JwH;
import X.C50837JxJ;
import X.C50890JyA;
import X.C50896JyG;
import X.C50898JyI;
import X.C50948Jz6;
import X.C51282KAs;
import X.C51320KCe;
import X.C51323KCh;
import X.C51324KCi;
import X.C51393KEz;
import X.C51468KHw;
import X.C76800UCe;
import X.C78857UxB;
import X.EnumC50899JyJ;
import X.EnumC51281KAr;
import X.EnumC61742ba;
import X.FMX;
import X.InterfaceC50897JyH;
import X.InterfaceC51004K0a;
import X.InterfaceC88473Ynt;
import X.JHC;
import X.JI9;
import X.JNB;
import X.JND;
import X.JON;
import X.JP4;
import X.JQ2;
import X.JQA;
import X.JQO;
import X.JTG;
import X.JTO;
import X.JYS;
import X.K2F;
import X.K2G;
import X.K2H;
import X.K2I;
import X.K6B;
import X.KB1;
import X.KBQ;
import X.KC6;
import X.KF7;
import X.KF9;
import X.KFB;
import X.KFD;
import X.KFE;
import X.KHW;
import X.KI4;
import X.KI8;
import X.KIO;
import X.KNV;
import X.M89;
import X.OSZ;
import X.XVF;
import X.XWV;
import X.Z9N;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecomsearch.middle.utils.EcSearchSugMobHelper;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;
import com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui.SearchMusicHistoryCell;
import com.ss.android.ugc.aweme.search.pages.choosemusic.middlepage.core.ui.SearchMusicHistoryCellNew;
import com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugHistoryCell;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.core.repo.ClickSearchWord;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.sug.core.viewmodel.SearchSugMobHelper;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public class ACListenerS34S0300000_8 implements View.OnClickListener {
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
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        ECSearchEntranceData eCSearchEntranceData;
        EnumC61742ba enumC61742ba;
        C51324KCi c51324KCi = (C51324KCi) aCListenerS34S0300000_8.l0;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS34S0300000_8.l1;
        int i = c51324KCi.LJLJJI;
        InterfaceC50897JyH interfaceC50897JyH = (InterfaceC50897JyH) aCListenerS34S0300000_8.l2;
        Context context = c51324KCi.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C50948Jz6 LIZIZ = JTO.LIZIZ(C45804HyK.LJJIFFI(context));
        int LIZ = KB1.LIZ(LIZIZ);
        EnumC51281KAr.Companion.getClass();
        EnumC51281KAr LIZIZ2 = C51282KAs.LIZIZ(LIZ);
        boolean LJI = KB1.LJI(LIZIZ2);
        if (LIZIZ != null) {
            eCSearchEntranceData = LIZIZ.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        int adapterPosition = c51324KCi.getAdapterPosition();
        C51323KCh c51323KCh = ((C50896JyG) interfaceC50897JyH).LIZ;
        if (adapterPosition >= 0) {
            if (adapterPosition < c51323KCh.getItemCount()) {
                ListProtector.remove(c51323KCh.LJLIL, adapterPosition);
                c51323KCh.notifyItemRemoved(adapterPosition);
            }
        } else {
            c51323KCh.getClass();
        }
        C50669Jub.LIZIZ.LIZ().LIZIZ(C47261Igj.LJJIJ(searchSugEntity.content), false, LIZIZ2, eCSearchEntranceData);
        C50837JxJ.LJIIL(LIZIZ2, eCSearchEntranceData).LJ(new SearchHistory(searchSugEntity.content, c51324KCi.LJLIL.N6()));
        if (LJI && eCSearchEntranceData != null && eCSearchEntranceData.isEC()) {
            IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
            if (LJJJJZI != null) {
                enumC61742ba = LJJJJZI.LJJIIJ(eCSearchEntranceData);
            } else {
                enumC61742ba = null;
            }
            if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                C50837JxJ.LJIIL(null, null).LJ(new SearchHistory(searchSugEntity.content, c51324KCi.LJLIL.N6()));
            } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
                C50837JxJ.LJIIL(null, null).LJ(new SearchHistory(searchSugEntity.content, c51324KCi.LJLIL.N6()));
            }
        }
        C50773JwH LIZ2 = C50668Jua.LIZ(LJI);
        if (LIZ2 != null) {
            LIZ2.LJIIIZ(searchSugEntity.content);
        }
        SearchSugMobHelper searchSugMobHelper = c51324KCi.LJLJI;
        if (searchSugMobHelper != null) {
            searchSugMobHelper.gv0("history", Integer.valueOf(i), "clear", searchSugEntity);
        }
        ((C51324KCi) aCListenerS34S0300000_8.l0).LJLIL.g3((SearchSugEntity) aCListenerS34S0300000_8.l1);
    }

    public static final void onClick$1(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        ((EComPhotoSearchServiceImpl) aCListenerS34S0300000_8.l0).LJI((Context) aCListenerS34S0300000_8.l1, (KHW) aCListenerS34S0300000_8.l2);
        C78857UxB.LJJJJLL("homepage", "");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$10(Y.ACListenerS34S0300000_8 r19, android.view.View r20) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS34S0300000_8.onClick$10(Y.ACListenerS34S0300000_8, android.view.View):void");
    }

    public static final void onClick$11(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        String str;
        String str2;
        C51468KHw c51468KHw = new C51468KHw();
        c51468KHw.LIZ = "search_sug";
        c51468KHw.LIZIZ = ((SearchSugEntity) aCListenerS34S0300000_8.l0).content;
        C2U8.LIZ(new K2I(c51468KHw));
        int layoutPosition = ((SearchMusicSugHistoryCell) aCListenerS34S0300000_8.l1).getLayoutPosition();
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS34S0300000_8.l0;
        KI4 ki4 = new KI4();
        ki4.LIZJ("words_source", "sug");
        ki4.LIZJ("search_position", "video_music");
        ki4.LIZ(layoutPosition, "words_position");
        ki4.LIZJ("words_content", searchSugEntity.content);
        Word word = searchSugEntity.mWord;
        String str3 = "";
        if (word == null || (str = word.getId()) == null) {
            str = "";
        }
        ki4.LIZJ("group_id", str);
        ki4.LIZJ("creation_id", XVF.LJ);
        ki4.LIZIZ(searchSugEntity.LIZLLL);
        ki4.LIZJ("new_sug_session_id", KIO.LIZ);
        FMX.LJIIL("trending_words_click", ki4.LIZ);
        KI4 ki42 = new KI4();
        ki42.LIZJ("action_type", "search");
        ki42.LIZJ("enter_method", "sug");
        Word word2 = searchSugEntity.mWord;
        if (word2 != null) {
            str3 = word2.getId();
        }
        ki42.LIZJ("group_id", str3);
        Map<String, String> map = searchSugEntity.LIZLLL;
        String str4 = null;
        if (map != null) {
            str2 = map.get("raw_query");
        } else {
            str2 = null;
        }
        ki42.LIZJ("input_keyword", str2);
        ki42.LIZ(layoutPosition, "order");
        Map<String, String> map2 = searchSugEntity.LIZLLL;
        if (map2 != null) {
            str4 = map2.get("impr_id");
        }
        ki42.LIZJ("query_id", str4);
        ki42.LIZJ("search_keyword", searchSugEntity.content);
        ki42.LIZJ("search_type", "video_music");
        ki42.LIZJ("words_type", "history");
        ki42.LIZJ("new_sug_session_id", KIO.LIZ);
        FMX.LJIIL("search_trending_click", ki42.LIZ);
        ((KI8) aCListenerS34S0300000_8.l2).LJLILLLLZI.e2(((SearchMusicSugHistoryCell) aCListenerS34S0300000_8.l1).getLayoutPosition(), ((SearchSugEntity) aCListenerS34S0300000_8.l0).content);
    }

    public static final void onClick$12(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        String str;
        String str2;
        SearchMusicSugHistoryCell searchMusicSugHistoryCell = (SearchMusicSugHistoryCell) aCListenerS34S0300000_8.l0;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS34S0300000_8.l1;
        int layoutPosition = searchMusicSugHistoryCell.getLayoutPosition();
        ((KI8) aCListenerS34S0300000_8.l2).LJLILLLLZI.e4(searchMusicSugHistoryCell.getLayoutPosition());
        Z9N.LIZIZ.LJIIL(new MusicSearchHistory(searchSugEntity.content, 1));
        KI4 ki4 = new KI4();
        ki4.LIZJ("action_type", "clear");
        ki4.LIZJ("enter_method", "sug");
        Word word = searchSugEntity.mWord;
        if (word == null || (str = word.getId()) == null) {
            str = "";
        }
        ki4.LIZJ("group_id", str);
        Map<String, String> map = searchSugEntity.LIZLLL;
        String str3 = null;
        if (map != null) {
            str2 = map.get("raw_query");
        } else {
            str2 = null;
        }
        ki4.LIZJ("input_keyword", str2);
        ki4.LIZ(layoutPosition, "order");
        Map<String, String> map2 = searchSugEntity.LIZLLL;
        if (map2 != null) {
            str3 = map2.get("impr_id");
        }
        ki4.LIZJ("query_id", str3);
        ki4.LIZJ("search_keyword", searchSugEntity.content);
        ki4.LIZJ("search_type", "video_music");
        ki4.LIZJ("words_type", "history");
        ki4.LIZJ("new_sug_session_id", KIO.LIZ);
        FMX.LJIIL("search_trending_click", ki4.LIZ);
    }

    public static final void onClick$13(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        String str;
        String str2;
        String str3;
        new C50699Jv5(((TuxTextView) aCListenerS34S0300000_8.l0).getContext()).LJI();
        ClickSearchWord clickSearchWord = (ClickSearchWord) aCListenerS34S0300000_8.l1;
        JQO jqo = (JQO) aCListenerS34S0300000_8.l2;
        JP4 jp4 = jqo.LJLJLLL;
        if (jp4 != null) {
            str = jp4.LIZJ;
            str2 = jp4.LIZIZ;
        } else {
            str = null;
            str2 = null;
        }
        C49604JdQ.LIZJ(clickSearchWord, str, str2, jqo.LJLJLJ);
        SearchResultParam searchResultParam = new SearchResultParam();
        JQA jqa = ((JQO) aCListenerS34S0300000_8.l2).LJLJLJ;
        if (jqa != null) {
            str3 = jqa.LJII;
        } else {
            str3 = null;
        }
        searchResultParam.setLastSearchId(str3);
        searchResultParam.setSearchFrom("click_recom");
        searchResultParam.setKeyword(((ClickSearchWord) aCListenerS34S0300000_8.l1).word);
        C50948Jz6 searchEnterParam = searchResultParam.getSearchEnterParam();
        if (searchEnterParam != null) {
            searchEnterParam.setTargetTab(null);
        }
        Context context = ((TuxTextView) aCListenerS34S0300000_8.l0).getContext();
        C50948Jz6 searchEnterParam2 = searchResultParam.getSearchEnterParam();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        ActivityC45651qj LJJIJIL = C30581Hy.LJJIJIL((TuxTextView) aCListenerS34S0300000_8.l0);
        c50651JuJ.getClass();
        C50600JtU.LIZIZ(context, searchResultParam, searchEnterParam2, null, C50651JuJ.LJIIJ(LJJIJIL), 40);
    }

    public static final void onClick$14(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        String str;
        int i;
        String str2;
        String str3;
        Context context;
        LogPbBean logPbBean;
        String imprId;
        M89 m89;
        C51393KEz c51393KEz = KFE.LJLIIL;
        String str4 = ((KFD) aCListenerS34S0300000_8.l0).LIZ;
        String str5 = ((VideoItemParams) aCListenerS34S0300000_8.l1).mEventType;
        o.LJIIIIZZ(str5, "item.eventType");
        String str6 = ((KFD) aCListenerS34S0300000_8.l0).LIZIZ;
        LogPbBean logPbBean2 = ((VideoItemParams) aCListenerS34S0300000_8.l1).getAweme().getLogPbBean();
        String str7 = null;
        if (logPbBean2 == null || (str = logPbBean2.getImprId()) == null) {
            str = ((C50322Jp0) KNV.LIZ()).LJLJI;
        }
        String groupId = ((VideoItemParams) aCListenerS34S0300000_8.l1).getAweme().getGroupId();
        o.LJIIIIZZ(groupId, "item.aweme.groupId");
        KF7 kf7 = (KF7) ((KFD) aCListenerS34S0300000_8.l0).LIZLLL;
        if (kf7 == null) {
            i = -1;
        } else {
            i = KFB.LIZ[kf7.ordinal()];
        }
        if (i == 1) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c51393KEz.getClass();
        C51393KEz.LIZ("related_search_anchor_v2", str4, str5, str6, str, groupId, str2);
        FeedEcSearchBottomBarAssem feedEcSearchBottomBarAssem = (FeedEcSearchBottomBarAssem) aCListenerS34S0300000_8.l2;
        VideoItemParams videoItemParams = (VideoItemParams) aCListenerS34S0300000_8.l1;
        KFD kfd = (KFD) aCListenerS34S0300000_8.l0;
        feedEcSearchBottomBarAssem.getClass();
        KF7 kf72 = (KF7) kfd.LIZLLL;
        if (kf72 != null) {
            int i2 = KF9.LIZ[kf72.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    Z9N z9n = Z9N.LIZIZ;
                    LogPbBean logPbBean3 = videoItemParams.getAweme().getLogPbBean();
                    if (logPbBean3 == null || (str3 = logPbBean3.getImprId()) == null) {
                        str3 = ((C50322Jp0) KNV.LIZ()).LJLJI;
                    }
                    z9n.LLI(str3);
                    ConstraintLayout constraintLayout = feedEcSearchBottomBarAssem.LLFII;
                    if (constraintLayout != null) {
                        context = constraintLayout.getContext();
                    } else {
                        context = null;
                    }
                    SmartRoute buildRoute = SmartRouter.buildRoute(context, "//search");
                    buildRoute.withParam("in_single_stack", true);
                    buildRoute.withParam("keyword", kfd.LIZ);
                    buildRoute.withParam("is_feed_liked", videoItemParams.getAweme().isLike());
                    buildRoute.withParam("is_feed_collected", videoItemParams.getAweme().isCollected());
                    buildRoute.withParam("is_feed_comment_clicked", videoItemParams.getAweme().isCommentClicked());
                    buildRoute.withParam("is_feed_forward_clicked", videoItemParams.getAweme().isForwardClicked());
                    buildRoute.withParam("search_position", videoItemParams.mEventType);
                    buildRoute.withParam("back_flag", 1);
                    BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
                    if (baseFeedPageParams != null && (m89 = baseFeedPageParams.param) != null) {
                        str7 = m89.getTabName();
                    }
                    buildRoute.withParam("tab_name", str7);
                    String str8 = videoItemParams.mEventType;
                    o.LJIIIIZZ(str8, "item.eventType");
                    if (!z9n.LIZ.LLIIZ(str8)) {
                        buildRoute.withParam("is_from_video", "1");
                    }
                    buildRoute.withParam("group_id", videoItemParams.getAweme().getAid());
                    Aweme aweme = videoItemParams.getAweme();
                    if (aweme != null && (logPbBean = aweme.getLogPbBean()) != null && (imprId = logPbBean.getImprId()) != null) {
                        buildRoute.withParam("preClickImprId", imprId);
                    }
                    C05040Hs.LJ(buildRoute, "enter_from", videoItemParams.mEventType, "enter_method", "related_search_anchor_v2");
                    return;
                }
            } else {
                feedEcSearchBottomBarAssem.q4(videoItemParams, kfd);
                return;
            }
        }
        feedEcSearchBottomBarAssem.q4(videoItemParams, kfd);
    }

    public static final void onClick$2(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        boolean z;
        if (JTG.LIZIZ()) {
            return;
        }
        ((JI9) aCListenerS34S0300000_8.l0).itemView.getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            View itemView = ((JI9) aCListenerS34S0300000_8.l0).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return;
        }
        new C50699Jv5(((C48887JGp) aCListenerS34S0300000_8.l1).getContext()).LJI();
        C48881JGj dataProvider = ((C48887JGp) aCListenerS34S0300000_8.l2).getDataProvider();
        if (dataProvider != null && dataProvider.LIZJ != null) {
            C48881JGj dataProvider2 = ((C48887JGp) aCListenerS34S0300000_8.l2).getDataProvider();
            if (dataProvider2 == null) {
                return;
            }
            if (JQ2.LIZIZ()) {
                C48892JGu.LIZ(dataProvider2, true);
            } else {
                C48892JGu.LIZ(dataProvider2, false);
            }
        }
        JI9 ji9 = (JI9) aCListenerS34S0300000_8.l0;
        Aweme aweme = ji9.LJZI;
        if (aweme != null) {
            InterfaceC88473Ynt<? super View, ? super Integer, ? super Aweme, C76800UCe> interfaceC88473Ynt = ji9.LJZL;
            if (interfaceC88473Ynt != null) {
                View itemView2 = ji9.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                interfaceC88473Ynt.invoke(itemView2, Integer.valueOf(ji9.getAdapterPosition()), aweme);
            }
            JON jon = ji9.LL;
            if (jon == null) {
                return;
            }
            jon.setVisibility(8);
        }
    }

    public static final void onClick$3(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        boolean z;
        int i;
        new C50699Jv5(((JHC) aCListenerS34S0300000_8.l0).getContext()).LJI();
        if (JTG.LIZIZ()) {
            return;
        }
        ((UserPhotoHolder) aCListenerS34S0300000_8.l1).itemView.getContext();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            View itemView = ((UserPhotoHolder) aCListenerS34S0300000_8.l1).itemView;
            o.LJIIIIZZ(itemView, "itemView");
            C26045AKb c26045AKb = new C26045AKb(itemView);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return;
        }
        C48881JGj dataProvider = ((JHC) aCListenerS34S0300000_8.l2).getDataProvider();
        if (dataProvider != null && dataProvider.LIZJ != null) {
            C48881JGj dataProvider2 = ((JHC) aCListenerS34S0300000_8.l2).getDataProvider();
            if (dataProvider2 == null) {
                return;
            }
            C48880JGi LJI = dataProvider2.LJI();
            if (LJI != null) {
                JHC jhc = ((UserPhotoHolder) aCListenerS34S0300000_8.l1).LJLJLLL;
                if (jhc != null) {
                    i = jhc.getPosition();
                } else {
                    i = -1;
                }
                LJI.LJ = i;
            }
            if (JQ2.LIZIZ()) {
                C48892JGu.LIZ(dataProvider2, true);
            } else {
                C48892JGu.LIZ(dataProvider2, false);
            }
        }
        UserPhotoHolder userPhotoHolder = (UserPhotoHolder) aCListenerS34S0300000_8.l1;
        Aweme aweme = userPhotoHolder.LJLLI;
        if (aweme != null) {
            InterfaceC88473Ynt<? super View, ? super Integer, ? super Aweme, C76800UCe> interfaceC88473Ynt = userPhotoHolder.LJLLILLLL;
            if (interfaceC88473Ynt != null) {
                View itemView2 = userPhotoHolder.itemView;
                o.LJIIIIZZ(itemView2, "itemView");
                interfaceC88473Ynt.invoke(itemView2, Integer.valueOf(userPhotoHolder.getAdapterPosition()), aweme);
            }
            JON jon = userPhotoHolder.LJLLJ;
            if (jon == null) {
                return;
            }
            jon.setVisibility(8);
        }
    }

    public static final void onClick$4(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        ECSearchEntranceData eCSearchEntranceData;
        ECSearchEntranceData ecSearchEntranceData;
        EnumC61742ba enumC61742ba;
        C51320KCe c51320KCe = (C51320KCe) aCListenerS34S0300000_8.l0;
        SearchSugEntity searchSugEntity = (SearchSugEntity) aCListenerS34S0300000_8.l1;
        int i = c51320KCe.LJLJJLL;
        Z9N z9n = Z9N.LIZIZ;
        List<String> LJJIJ = C47261Igj.LJJIJ(searchSugEntity.content);
        Context context = c51320KCe.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        z9n.LLJI(LJJIJ, false, C45804HyK.LJJIFFI(context));
        ISearchService LLLZI = SearchServiceImpl.LLLZI();
        Context context2 = c51320KCe.itemView.getContext();
        o.LJIIIIZZ(context2, "itemView.context");
        Integer valueOf = Integer.valueOf(KB1.LIZ(JTO.LIZIZ(C45804HyK.LJJIFFI(context2))));
        Context context3 = c51320KCe.itemView.getContext();
        o.LJIIIIZZ(context3, "itemView.context");
        C50948Jz6 LIZIZ = JTO.LIZIZ(C45804HyK.LJJIFFI(context3));
        if (LIZIZ != null) {
            eCSearchEntranceData = LIZIZ.getEcSearchEntranceData();
        } else {
            eCSearchEntranceData = null;
        }
        LLLZI.LJJLJLI(eCSearchEntranceData, valueOf).LJ(new SearchHistory(searchSugEntity.content, 0));
        Context context4 = c51320KCe.itemView.getContext();
        o.LJIIIIZZ(context4, "itemView.context");
        C50948Jz6 LIZIZ2 = JTO.LIZIZ(C45804HyK.LJJIFFI(context4));
        if (LIZIZ2 != null && (ecSearchEntranceData = LIZIZ2.getEcSearchEntranceData()) != null && ecSearchEntranceData.isEC()) {
            IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
            if (LJJJJZI != null) {
                enumC61742ba = LJJJJZI.LJJIIJ(ecSearchEntranceData);
            } else {
                enumC61742ba = null;
            }
            if (enumC61742ba == EnumC61742ba.EC_SINGLE_ISOLATE) {
                SearchServiceImpl.LLLZI().LJJLJLI(null, null).LJ(new SearchHistory(searchSugEntity.content, 0));
            }
        } else if (C50898JyI.LIZ() == EnumC50899JyJ.SINGLE) {
            SearchServiceImpl.LLLZI().LJJLJLI(null, null).LJ(new SearchHistory(searchSugEntity.content, 0));
        }
        KC6 kc6 = c51320KCe.LJLJI;
        if (kc6 != null) {
            kc6.LLIIIL("history", Integer.valueOf(i), "clear", searchSugEntity);
        } else {
            EcSearchSugMobHelper ecSearchSugMobHelper = c51320KCe.LJLJJI;
            if (ecSearchSugMobHelper != null) {
                ecSearchSugMobHelper.gv0("history", Integer.valueOf(i), "clear", searchSugEntity);
            }
        }
        InterfaceC51004K0a interfaceC51004K0a = (InterfaceC51004K0a) aCListenerS34S0300000_8.l2;
        if (interfaceC51004K0a != null) {
            int adapterPosition = ((C51320KCe) aCListenerS34S0300000_8.l0).getAdapterPosition();
            KBQ kbq = (KBQ) ((XWV) interfaceC51004K0a).LJLIL;
            if (adapterPosition >= 0) {
                if (adapterPosition < kbq.getItemCount()) {
                    ListProtector.remove(kbq.LJLIL, adapterPosition);
                    kbq.notifyItemRemoved(adapterPosition);
                }
            } else {
                kbq.getClass();
            }
        }
        K6B k6b = ((C51320KCe) aCListenerS34S0300000_8.l0).LJLIL;
        if (k6b != null) {
            k6b.g3((SearchSugEntity) aCListenerS34S0300000_8.l1);
        }
        C51320KCe c51320KCe2 = (C51320KCe) aCListenerS34S0300000_8.l0;
        KC6 kc62 = c51320KCe2.LJLJI;
        if (kc62 != null) {
            kc62.LLIIJI(c51320KCe2.getAdapterPosition(), (SearchSugEntity) aCListenerS34S0300000_8.l1);
        }
    }

    public static final void onClick$5(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        String str;
        JQA jqa = (JQA) aCListenerS34S0300000_8.l0;
        SearchGlobalViewModel M = ((C49124JPs) aCListenerS34S0300000_8.l1).M();
        if (M != null) {
            str = M.jv0();
        } else {
            str = null;
        }
        jqa.LIZ(str);
        JNB LIZ = JND.LIZ((JQA) aCListenerS34S0300000_8.l0);
        LIZ.LJIIZILJ("token_type", "live_card");
        LIZ.LJIIZILJ("list_result_type", "live");
        LIZ.LIZLLL("aladdin_words", "live");
        LIZ.LJIJ("search_result_id", ((JQA) aCListenerS34S0300000_8.l0).LJIILJJIL);
        LIZ.LJIIZILJ("aladdin_button_type", "click_more_button");
        LIZ.LJIIZILJ("list_item_id", ((JQA) aCListenerS34S0300000_8.l0).LJIILJJIL);
        LIZ.LJJI(0);
        LIZ.LJJIII(0);
        LIZ.LJIILIIL();
        if (!C49445Jar.LIZ()) {
            SearchSecurityControlConfig.LIZ.getClass();
            if (!SearchSecurityControlConfig.LIZ().disableLiveTab) {
                Context context = GlobalContext.getContext();
                o.LJI(context);
                C49444Jaq c49444Jaq = new C49444Jaq();
                JQA jqa2 = (JQA) aCListenerS34S0300000_8.l0;
                SearchMixFeed searchMixFeed = (SearchMixFeed) aCListenerS34S0300000_8.l2;
                c49444Jaq.setSearchKeyword(jqa2.LJ);
                c49444Jaq.setEnterFrom(jqa2.LJFF);
                c49444Jaq.setSearchId("searchId");
                c49444Jaq.setSearchType("general");
                C49489JbZ c49489JbZ = C49489JbZ.LIZ;
                List<Aweme> list = searchMixFeed.collectionLive.lives;
                c49489JbZ.getClass();
                c49444Jaq.setRoomIdList(C49489JbZ.LIZLLL(list));
                c49444Jaq.setEnterMethod("click_more_general_list");
                C49447Jat.LIZ(context, c49444Jaq, Z9N.LIZIZ.LJJLIIIJLJLI());
                return;
            }
        }
        C2U8.LIZ(new JYS(C50605JtZ.LJ()));
    }

    public static final void onClick$6(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        C2U8.LIZ(new K2H("clear", C113554cx.LJJL(new OSZ("search_keyword", ((K2F) aCListenerS34S0300000_8.l0).LJLIL.keyword), new OSZ("order", String.valueOf(((SearchMusicHistoryCell) aCListenerS34S0300000_8.l1).getLayoutPosition())))));
        C50890JyA LJIIIZ = C50890JyA.LJIIIZ();
        ((ArrayList) LJIIIZ.LJLJJL).remove((MusicSearchHistory) aCListenerS34S0300000_8.l2);
        LJIIIZ.LJII();
        LJIIIZ.LJFF();
    }

    public static final void onClick$7(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        C2U8.LIZ(new K2H("click", C113554cx.LJJL(new OSZ("search_keyword", ((K2F) aCListenerS34S0300000_8.l0).LJLIL.keyword), new OSZ("order", String.valueOf(((SearchMusicHistoryCell) aCListenerS34S0300000_8.l1).getLayoutPosition())))));
        C51468KHw c51468KHw = new C51468KHw();
        c51468KHw.LIZ = "search_history";
        c51468KHw.LIZIZ = ((MusicSearchHistory) aCListenerS34S0300000_8.l2).keyword;
        C2U8.LIZ(new K2I(c51468KHw));
    }

    public static final void onClick$8(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        C2U8.LIZ(new K2H("clear", C113554cx.LJJL(new OSZ("search_keyword", ((K2G) aCListenerS34S0300000_8.l0).LJLIL.keyword), new OSZ("order", String.valueOf(((SearchMusicHistoryCellNew) aCListenerS34S0300000_8.l1).getLayoutPosition())))));
        C50890JyA LJIIIZ = C50890JyA.LJIIIZ();
        ((ArrayList) LJIIIZ.LJLJJL).remove((MusicSearchHistory) aCListenerS34S0300000_8.l2);
        LJIIIZ.LJII();
        LJIIIZ.LJFF();
    }

    public static final void onClick$9(ACListenerS34S0300000_8 aCListenerS34S0300000_8, View view) {
        C2U8.LIZ(new K2H("click", C113554cx.LJJL(new OSZ("search_keyword", ((K2G) aCListenerS34S0300000_8.l0).LJLIL.keyword), new OSZ("order", String.valueOf(((SearchMusicHistoryCellNew) aCListenerS34S0300000_8.l1).getLayoutPosition())))));
        C51468KHw c51468KHw = new C51468KHw();
        c51468KHw.LIZ = "search_history";
        c51468KHw.LIZIZ = ((MusicSearchHistory) aCListenerS34S0300000_8.l2).keyword;
        C2U8.LIZ(new K2I(c51468KHw));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS34S0300000_8(com.ss.android.ugc.aweme.search.model.SearchSugEntity r2, com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugHistoryCell r3, X.KI8 r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 11: goto L10;
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
            r0.l1 = r3
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS34S0300000_8.<init>(com.ss.android.ugc.aweme.search.model.SearchSugEntity, com.ss.android.ugc.aweme.search.pages.choosemusic.sug.core.ui.SearchMusicSugHistoryCell, X.KI8, int):void");
    }

    public ACListenerS34S0300000_8(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
