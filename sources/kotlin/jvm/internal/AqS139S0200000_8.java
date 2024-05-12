package kotlin.jvm.internal;

import X.AbstractC030309z;
import X.AbstractC49300JWm;
import X.AbstractC65781Prl;
import X.AbstractC72932td;
import X.AbstractDialogInterfaceC26236ARk;
import X.C10K;
import X.C16880lQ;
import X.C208218Fd;
import X.C25847ACl;
import X.C26045AKb;
import X.C2W3;
import X.C34K;
import X.C3C1;
import X.C3C5;
import X.C3C8;
import X.C47007Icd;
import X.C47015Icl;
import X.C47020Icq;
import X.C47261Igj;
import X.C48887JGp;
import X.C48909JHl;
import X.C48929JIf;
import X.C48942JIs;
import X.C48948JIy;
import X.C48952JJc;
import X.C48954JJe;
import X.C49029JMb;
import X.C49034JMg;
import X.C49159JRb;
import X.C49331JXr;
import X.C49358JYs;
import X.C49362JYw;
import X.C49462Jb8;
import X.C49505Jbp;
import X.C49512Jbw;
import X.C49517Jc1;
import X.C49624Jdk;
import X.C49740Jfc;
import X.C49851JhP;
import X.C49854JhS;
import X.C49862Jha;
import X.C49863Jhb;
import X.C49864Jhc;
import X.C4LX;
import X.C50201Jn3;
import X.C50210JnC;
import X.C50211JnD;
import X.C50214JnG;
import X.C50222JnO;
import X.C50321Joz;
import X.C50322Jp0;
import X.C50420Jqa;
import X.C50438Jqs;
import X.C50652JuK;
import X.C50764Jw8;
import X.C51006K0c;
import X.C51392KEy;
import X.C51393KEz;
import X.C51598KMw;
import X.C51762KTe;
import X.C55096Ljo;
import X.C57819Mmd;
import X.C60193Njp;
import X.C61447O9r;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C68322mC;
import X.C72912tb;
import X.C72922tc;
import X.C73305Spp;
import X.C73994T2g;
import X.C76800UCe;
import X.C78613UtF;
import X.C78855Ux9;
import X.C7MY;
import X.C8NH;
import X.C8NK;
import X.EnumC57435MgR;
import X.ILC;
import X.IVM;
import X.IX4;
import X.InterfaceC47035Id5;
import X.InterfaceC49025JLx;
import X.InterfaceC49037JMj;
import X.InterfaceC49871Jhj;
import X.InterfaceC51512KJo;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.J87;
import X.JHC;
import X.JI9;
import X.JKG;
import X.JLW;
import X.JM7;
import X.JMI;
import X.JMJ;
import X.JMK;
import X.JML;
import X.JMP;
import X.JMV;
import X.JMW;
import X.JMX;
import X.JMZ;
import X.JQA;
import X.JR1;
import X.JR2;
import X.JR9;
import X.JRJ;
import X.JSM;
import X.JVD;
import X.K42;
import X.K47;
import X.KA5;
import X.KAU;
import X.KF7;
import X.KFA;
import X.KFD;
import X.KFE;
import X.KGR;
import X.KL2;
import X.KN9;
import X.KNA;
import X.KNK;
import X.KNV;
import X.KSI;
import X.O5Y;
import X.O6R;
import X.OSZ;
import X.SVU;
import X.ViewOnAttachStateChangeListenerC49251JUp;
import X.X1D;
import X.XJL;
import X.XKS;
import X.XKX;
import Y.AObjectS31S0000000_8;
import Y.ARunnableS14S0110000_8;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.Callback;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.FashionMallFragment;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.ui.MallToolBarAssem;
import com.ss.android.ugc.aweme.ecommerce.model.AddressCardProducts;
import com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM;
import com.ss.android.ugc.aweme.ecommerce.search.sug.repo.EcSearchSugResponse;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.ProductAnchor;
import com.ss.android.ugc.aweme.general.ECStoreInfoAssem;
import com.ss.android.ugc.aweme.general.ECStoreLiveAssem;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCarouselViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.SearchFollowAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchBuiltInBottomAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchCardViewHolder;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.parser.SearchSingleCardTemplateAssem;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardCommonAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchCardMobAbilityImpl;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$CardCommonAbility;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$MobAbility;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.detail.button.SearchVideoSkipTrigger;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.filter.SubFilterOptionStruct;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.ILynxSearchHorizontal;
import com.ss.android.ugc.aweme.search.lynx.xsearch.horizontallist.core.ui.SearchHorizontalInnerContainer;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder;
import com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfoResponse;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.search.pages.result.common.filter.core.ui.FlowLayoutCell;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchrelation.core.ui.SearchRelationUserAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoHolder;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.photo.UserPhotoRootAssem;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.ui.AggregatedVideoRootAssme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.creationentrance.viewmodel.SearchCreationEntranceViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.FeedEcSearchBottomBarAssemTrigger;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class AqS139S0200000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;

    public static /* bridge */ /* synthetic */ Object invoke$37(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        aqS139S0200000_8.invoke$0((ViewGroup) obj);
        return C76800UCe.LIZ;
    }

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
            case 54:
                return invoke$54(this, obj);
            case 55:
                return invoke$55(this, obj);
            case 56:
                return invoke$56(this, obj);
            case 57:
                return invoke$57(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(ViewGroup it) {
        o.LJIIJ(it, "it");
        C16880lQ.LJLLL((C60193Njp) this.l0, it);
        it.addView((C60193Njp) this.l1, ((C60193Njp) this.l0).getLayoutParams());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        List<Aweme> awemeList;
        String str;
        JQA jqa;
        String str2;
        String message;
        C49517Jc1 pollingState = (C49517Jc1) obj;
        o.LJIIIZ(pollingState, "pollingState");
        AbstractC72932td abstractC72932td = (AbstractC72932td) aqS139S0200000_8.l0;
        String str3 = "";
        int i = 0;
        if (abstractC72932td instanceof C72912tb) {
            TakoInfo takoInfo = (TakoInfo) abstractC72932td.LIZ();
            if (takoInfo != null) {
                SearchBotHolder searchBotHolder = (SearchBotHolder) aqS139S0200000_8.l1;
                searchBotHolder.Y(pollingState, true);
                C208218Fd c208218Fd = searchBotHolder.LJLL;
                c208218Fd.LJZL = false;
                c208218Fd.LL = true;
                String message2 = takoInfo.getMessage();
                searchBotHolder.LJLLI.setLoading(false);
                searchBotHolder.LJLLILLLL.setLoading(false);
                searchBotHolder.LJLLJ.setVisibility(8);
                searchBotHolder.LJLLL.setVisibility(8);
                searchBotHolder.LJLLLLLL.setVisibility(8);
                if (message2 != null) {
                    str3 = message2;
                }
                searchBotHolder.X(str3);
                List<Aweme> awemeList2 = takoInfo.getAwemeList();
                JQA LJLJL = searchBotHolder.LJLJL();
                if (awemeList2 != null) {
                    if (!awemeList2.isEmpty()) {
                        searchBotHolder.LJLLLLLL.setVisibility(0);
                    } else {
                        searchBotHolder.LJLLLLLL.setVisibility(8);
                    }
                    C49505Jbp c49505Jbp = searchBotHolder.LJLLLL;
                    Map<String, String> T = searchBotHolder.T();
                    IDqS37S0300000_8 iDqS37S0300000_8 = new IDqS37S0300000_8((List) awemeList2, (List<? extends Aweme>) searchBotHolder, (SearchBotHolder) LJLJL, (JQA) 0);
                    c49505Jbp.getClass();
                    c49505Jbp.LIZ.getContext();
                    c49505Jbp.LIZ.setLayoutManager(new LinearLayoutManager(0, false));
                    c49505Jbp.LIZJ.LIZJ(new AObjectS31S0000000_8(0), awemeList2);
                    ArrayList arrayList = new ArrayList();
                    Iterator<Aweme> it = awemeList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C48954JJe(it.next(), T, iDqS37S0300000_8, Integer.valueOf(awemeList2.size())));
                    }
                    C48952JJc c48952JJc = c49505Jbp.LIZIZ;
                    c48952JJc.getClass();
                    c48952JJc.LJLIL = arrayList;
                    c48952JJc.LJLILLLLZI = T;
                    c49505Jbp.LIZ.setAdapter(c49505Jbp.LIZIZ);
                    View itemView = searchBotHolder.itemView;
                    o.LJIIIIZZ(itemView, "itemView");
                    JSM.LIZJ(itemView, searchBotHolder);
                    JVD.LIZ(searchBotHolder.LJLLLLLL, new AqS158S0100000_8(searchBotHolder, 7));
                }
                searchBotHolder.Q();
            }
            TakoInfo takoInfo2 = (TakoInfo) ((AbstractC72932td) aqS139S0200000_8.l0).LIZ();
            if (takoInfo2 != null && (message = takoInfo2.getMessage()) != null) {
                i = message.length();
            }
            C49512Jbw.LIZJ(((SearchBotHolder) aqS139S0200000_8.l1).T(), i, true);
        } else if (abstractC72932td instanceof C3C1) {
            Integer num = pollingState.LJLJL;
            if (num == null || num.intValue() != 3) {
                SearchBotHolder searchBotHolder2 = (SearchBotHolder) aqS139S0200000_8.l1;
                searchBotHolder2.LJLLI.setLoading(false);
                searchBotHolder2.LJLLILLLL.setLoading(false);
                searchBotHolder2.LJLLJ.setVisibility(0);
                searchBotHolder2.LJLLL.setVisibility(8);
                searchBotHolder2.LJLLLLLL.setVisibility(8);
                searchBotHolder2.X("");
            } else {
                SearchBotHolder searchBotHolder3 = (SearchBotHolder) aqS139S0200000_8.l1;
                searchBotHolder3.LJLLI.setLoading(false);
                searchBotHolder3.LJLLILLLL.setLoading(false);
                searchBotHolder3.LJLLJ.setVisibility(8);
                searchBotHolder3.LJLLL.setVisibility(0);
                searchBotHolder3.LJLLLLLL.setVisibility(8);
                searchBotHolder3.X("");
            }
            C49512Jbw.LIZJ(((SearchBotHolder) aqS139S0200000_8.l1).T(), 0, false);
            ((SearchBotHolder) aqS139S0200000_8.l1).Y(pollingState, false);
        } else if (abstractC72932td instanceof C72922tc) {
            ((SearchBotHolder) aqS139S0200000_8.l1).U();
        }
        SearchMixFeed searchMixFeed = ((SearchBotHolder) aqS139S0200000_8.l1).LJZI;
        if (searchMixFeed != null) {
            TakoInfo LIZ = pollingState.LJLJJLL.LIZ();
            SearchBotHolder searchBotHolder4 = (SearchBotHolder) aqS139S0200000_8.l1;
            if (LIZ != null && (awemeList = LIZ.getAwemeList()) != null) {
                for (Aweme aweme : awemeList) {
                    aweme.appendExtraParamUseInSearch("token_type", "tikbot");
                    SearchMixFeed searchMixFeed2 = searchBotHolder4.LJZI;
                    if (searchMixFeed2 != null) {
                        str = searchMixFeed2.providerDocIdStr;
                    } else {
                        str = null;
                    }
                    aweme.appendExtraParamUseInSearch("search_result_id", str);
                }
            }
            searchMixFeed.bot = LIZ;
        }
        Object LIZ2 = ((AbstractC72932td) aqS139S0200000_8.l0).LIZ();
        if (LIZ2 != null && (jqa = ((SearchBotHolder) aqS139S0200000_8.l1).LL) != null && (str2 = jqa.LJII) != null) {
            C49624Jdk.LIZJ.put(str2, LIZ2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ((InterfaceC88472Yns) aqS139S0200000_8.l0).invoke(obj);
        ((C34K) aqS139S0200000_8.l1).element = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C8NK reusedUiContentAssem = (C8NK) obj;
        o.LJIIIZ(reusedUiContentAssem, "$this$reusedUiContentAssem");
        InterfaceC65350Pko<? extends ReusedUIContentAssem<? extends C3C8>> LIZ = ((InterfaceC49037JMj) aqS139S0200000_8.l0).LIZ();
        if (LIZ != null) {
            reusedUiContentAssem.LIZ = LIZ;
            ((C49358JYs) aqS139S0200000_8.l1).getClass();
            View view = ((C49358JYs) aqS139S0200000_8.l1).LIZIZ;
            if (view != null) {
                reusedUiContentAssem.LJFF = view;
                return C76800UCe.LIZ;
            }
            o.LJIJI("contentView");
            throw null;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$11(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C8NH reusedUiSlotAssem = (C8NH) obj;
        o.LJIIIZ(reusedUiSlotAssem, "$this$reusedUiSlotAssem");
        InterfaceC65350Pko<? extends ReusedUISlotAssem<? extends C3C8>> LIZIZ = ((JMX) aqS139S0200000_8.l0).LIZIZ();
        if (LIZIZ != null) {
            reusedUiSlotAssem.LIZ = LIZIZ;
            reusedUiSlotAssem.LIZLLL = ((JMW) aqS139S0200000_8.l1).LIZIZ;
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$12(AqS139S0200000_8 aqS139S0200000_8, Object it) {
        o.LJIIIZ(it, "it");
        SearchVideoSkipTrigger searchVideoSkipTrigger = (SearchVideoSkipTrigger) aqS139S0200000_8.l0;
        VideoItemParams videoItemParams = (VideoItemParams) aqS139S0200000_8.l1;
        searchVideoSkipTrigger.getContainerView().setVisibility(0);
        searchVideoSkipTrigger.LLFF.getValue();
        String aid = videoItemParams.getAweme().getAid();
        BaseFeedPageParams baseFeedPageParams = searchVideoSkipTrigger.LL;
        if (baseFeedPageParams != null) {
            SearchVideoSkipVM.iv0(aid, baseFeedPageParams.eventType, true);
            if (((SearchVideoSkipVM) searchVideoSkipTrigger.LLFF.getValue()).LJLILLLLZI) {
                searchVideoSkipTrigger.LLFF.getValue();
                C26045AKb c26045AKb = new C26045AKb(searchVideoSkipTrigger.getContainerView());
                c26045AKb.LJIIIIZZ(R.string.qec);
                c26045AKb.LIZLLL(1000L);
                c26045AKb.LJIIJ();
                ((SearchVideoSkipVM) searchVideoSkipTrigger.LLFF.getValue()).LJLILLLLZI = false;
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("pageParams");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$13(kotlin.jvm.internal.AqS139S0200000_8 r8, java.lang.Object r9) {
        /*
            X.Jc1 r9 = (X.C49517Jc1) r9
            java.lang.String r0 = "state"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            java.lang.Object r0 = r8.l0
            com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder r0 = (com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder) r0
            android.view.View r0 = r0.itemView
            android.view.ViewParent r2 = r0.getParent()
            boolean r1 = r2 instanceof androidx.recyclerview.widget.RecyclerView
            r0 = 0
            if (r1 == 0) goto L72
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
        L18:
            r4 = 2
            if (r2 == 0) goto L5b
            X.2td<com.ss.android.ugc.aweme.search.pages.result.bot.model.TakoInfo> r0 = r9.LJLJJLL
            boolean r0 = r0 instanceof X.C72912tb
            if (r0 == 0) goto L5b
            java.lang.Object r5 = r8.l1
            com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM r5 = (com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM) r5
            java.lang.Object r7 = r8.l0
            com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder r7 = (com.ss.android.ugc.aweme.search.pages.result.bot.SearchBotHolder) r7
            int r6 = r2.computeVerticalScrollOffset()
            X.Jcd r1 = r5.gv0()
            r0 = 52
            int r0 = X.C7MY.LIZIZ(r0)
            r3 = 1
            if (r6 >= r0) goto L70
            r0 = 1
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.LIZIZ(r0)
            float r2 = (float) r3
            float r1 = (float) r6
            android.view.View r0 = r7.itemView
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r1 = r1 / r0
            float r2 = r2 - r1
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L6e
        L54:
            r5.hv0(r3)
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L6b
        L5b:
            java.lang.Object r0 = r8.l1
            com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM r0 = (com.ss.android.ugc.aweme.search.pages.result.bot.component.viewmodel.SearchTakoCardUIVM) r0
            r0.hv0(r4)
            X.Jcd r1 = r0.gv0()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.LIZIZ(r0)
        L6b:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L6e:
            r3 = 2
            goto L54
        L70:
            r0 = 0
            goto L3b
        L72:
            r2 = r0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.invoke$13(kotlin.jvm.internal.AqS139S0200000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$14(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.rv0((SearchPhotoRootAssem) aqS139S0200000_8.l0, new AqS174S0100000_8((View) aqS139S0200000_8.l1, 84));
        assemble.rv0((SearchPhotoRootAssem) aqS139S0200000_8.l0, new AqS174S0100000_8((View) aqS139S0200000_8.l1, 85));
        assemble.rv0((SearchPhotoRootAssem) aqS139S0200000_8.l0, new AqS174S0100000_8((View) aqS139S0200000_8.l1, 86));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$15(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.rv0((UserPhotoRootAssem) aqS139S0200000_8.l0, new AqS174S0100000_8((View) aqS139S0200000_8.l1, 94));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$16(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.sv0((AggregatedVideoRootAssme) aqS139S0200000_8.l0, JMJ.LJLIL);
        assemble.sv0((AggregatedVideoRootAssme) aqS139S0200000_8.l0, JMK.LJLIL);
        assemble.sv0((AggregatedVideoRootAssme) aqS139S0200000_8.l0, JML.LJLIL);
        assemble.rv0((AggregatedVideoRootAssme) aqS139S0200000_8.l0, new AqS174S0100000_8((View) aqS139S0200000_8.l1, 99));
        assemble.rv0((AggregatedVideoRootAssme) aqS139S0200000_8.l0, new AqS174S0100000_8((View) aqS139S0200000_8.l1, 100));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$17(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C49740Jfc state = (C49740Jfc) obj;
        o.LJIIIZ(state, "state");
        if (state.LJLJI) {
            ((SearchJediMixFeedFragment) aqS139S0200000_8.l0).Ln((C50420Jqa) aqS139S0200000_8.l1);
        } else {
            SearchCreationEntranceViewModel om = ((SearchJediMixFeedFragment) aqS139S0200000_8.l0).om();
            String str = ((C50420Jqa) aqS139S0200000_8.l1).LJLLILLLL;
            o.LJIIIIZZ(str, "event.creationId");
            C50420Jqa videoEvent = (C50420Jqa) aqS139S0200000_8.l1;
            om.getClass();
            o.LJIIIZ(videoEvent, "videoEvent");
            om.LJLIL.put(str, videoEvent);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$18(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            ((SearchJediMixFeedFragment) aqS139S0200000_8.l0).dn();
        }
        GlobalDoodleConfig globalDoodleConfig = (GlobalDoodleConfig) aqS139S0200000_8.l1;
        boolean z2 = false;
        if (globalDoodleConfig != null) {
            z = o.LJ(globalDoodleConfig.getDisableGoldTask(), Boolean.TRUE);
        } else {
            z = false;
        }
        boolean z3 = !z;
        C50222JnO c50222JnO = ((SearchJediMixFeedFragment) aqS139S0200000_8.l0).LLIL;
        if (c50222JnO != null) {
            if (booleanValue && z3) {
                z2 = true;
            }
            c50222JnO.setBanAdjustBottomMargin(z2);
        }
        SearchJediMixFeedFragment searchJediMixFeedFragment = (SearchJediMixFeedFragment) aqS139S0200000_8.l0;
        C50222JnO c50222JnO2 = searchJediMixFeedFragment.LLIL;
        if (c50222JnO2 != null) {
            c50222JnO2.LJLIL.post(new ARunnableS14S0110000_8(c50222JnO2, C78855Ux9.LJII(searchJediMixFeedFragment.Zl()), 14));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$19(AqS139S0200000_8 aqS139S0200000_8, Object it) {
        String str;
        String str2;
        o.LJIIIZ(it, "it");
        ((FeedEcSearchBottomBarAssemTrigger) aqS139S0200000_8.l0).getContainerView().setVisibility(0);
        KFD LIZIZ = C51392KEy.LIZIZ((VideoItemParams) aqS139S0200000_8.l1);
        C51393KEz c51393KEz = KFE.LJLIIL;
        String str3 = LIZIZ.LIZ;
        String str4 = ((VideoItemParams) aqS139S0200000_8.l1).mEventType;
        o.LJIIIIZZ(str4, "item.eventType");
        String str5 = LIZIZ.LIZIZ;
        LogPbBean logPbBean = ((VideoItemParams) aqS139S0200000_8.l1).getAweme().getLogPbBean();
        if (logPbBean == null || (str = logPbBean.getImprId()) == null) {
            str = ((C50322Jp0) KNV.LIZ()).LJLJI;
        }
        String groupId = ((VideoItemParams) aqS139S0200000_8.l1).getAweme().getGroupId();
        o.LJIIIIZZ(groupId, "item.aweme.groupId");
        KF7 kf7 = (KF7) LIZIZ.LIZLLL;
        if (kf7 == null || KFA.LIZ[kf7.ordinal()] != 1) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = "1";
        }
        c51393KEz.getClass();
        C51393KEz.LIZIZ("related_search_anchor_v2", str3, str4, str5, str, groupId, str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.wv0((MallToolBarAssem) aqS139S0200000_8.l0, new AqS175S0100000_9((View) aqS139S0200000_8.l1, 39));
        FashionMallFragment.LJZ.getClass();
        if (!C51762KTe.LIZIZ()) {
            assemble.xv0((MallToolBarAssem) aqS139S0200000_8.l0, SVU.LJLIL);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$20(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C48909JHl obtainScrollObserver = (C48909JHl) obj;
        o.LJIIIZ(obtainScrollObserver, "$this$obtainScrollObserver");
        obtainScrollObserver.LIZLLL = new AqS158S0100000_8((C48887JGp) aqS139S0200000_8.l0, 464);
        new AqS158S0100000_8((JI9) aqS139S0200000_8.l1, 466);
        obtainScrollObserver.LJFF = new AqS158S0100000_8((JI9) aqS139S0200000_8.l1, 467);
        obtainScrollObserver.LJ = new AqS158S0100000_8((C48887JGp) aqS139S0200000_8.l0, 468);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$21(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        AbstractDialogInterfaceC26236ARk it = (AbstractDialogInterfaceC26236ARk) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = it.LJLJL;
        if (o.LJ(obj2, 0)) {
            if (((XJL) aqS139S0200000_8.l0).isActive()) {
                ((SearchUserViewHolder) aqS139S0200000_8.l1).n0();
                XJL xjl = (XJL) aqS139S0200000_8.l0;
                Boolean bool = Boolean.FALSE;
                C3C5.m7constructorimpl(bool);
                xjl.resumeWith(bool);
            }
        } else if (o.LJ(obj2, 1) && ((XJL) aqS139S0200000_8.l0).isActive()) {
            ((SearchUserViewHolder) aqS139S0200000_8.l1).l0();
            XJL xjl2 = (XJL) aqS139S0200000_8.l0;
            Boolean bool2 = Boolean.TRUE;
            C3C5.m7constructorimpl(bool2);
            xjl2.resumeWith(bool2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$22(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        AbstractDialogInterfaceC26236ARk it = (AbstractDialogInterfaceC26236ARk) obj;
        o.LJIIIZ(it, "it");
        Object obj2 = it.LJLJL;
        if (o.LJ(obj2, 0)) {
            if (((XJL) aqS139S0200000_8.l0).isActive()) {
                ((SearchUserViewHolder) aqS139S0200000_8.l1).n0();
                XJL xjl = (XJL) aqS139S0200000_8.l0;
                Boolean bool = Boolean.FALSE;
                C3C5.m7constructorimpl(bool);
                xjl.resumeWith(bool);
            }
        } else if (o.LJ(obj2, 1) && ((XJL) aqS139S0200000_8.l0).isActive()) {
            ((SearchUserViewHolder) aqS139S0200000_8.l1).l0();
            XJL xjl2 = (XJL) aqS139S0200000_8.l0;
            Boolean bool2 = Boolean.TRUE;
            C3C5.m7constructorimpl(bool2);
            xjl2.resumeWith(bool2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$23(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C49851JhP outItem = (C49851JhP) obj;
        o.LJIIIZ(outItem, "$this$outItem");
        AbstractC49300JWm abstractC49300JWm = (AbstractC49300JWm) aqS139S0200000_8.l0;
        SearchMixFeed item = (SearchMixFeed) aqS139S0200000_8.l1;
        abstractC49300JWm.getClass();
        o.LJIIIZ(item, "item");
        new AqS139S0200000_8(item, abstractC49300JWm, 53).invoke(outItem);
        Object obj2 = (SearchMixFeed) aqS139S0200000_8.l1;
        if (obj2 instanceof C49854JhS) {
            C49854JhS c49854JhS = (C49854JhS) obj2;
            o.LJIIIZ(c49854JhS, "<set-?>");
            outItem.LJFF = c49854JhS;
        }
        C49863Jhb c49863Jhb = outItem.LIZIZ.LJFF;
        String str = outItem.LIZLLL;
        C49864Jhc c49864Jhc = c49863Jhb.LIZ.get(C65352Pkq.LIZ(SearchMixFeed.class));
        if (c49864Jhc == null) {
            c49864Jhc = new C49864Jhc();
            c49863Jhb.LIZ.put(C65352Pkq.LIZ(SearchMixFeed.class), c49864Jhc);
        }
        HashMap<String, Object> hashMap = c49864Jhc.LIZ;
        if (hashMap != null) {
            hashMap.put(str, obj2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$24(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C48909JHl obtainScrollObserver = (C48909JHl) obj;
        o.LJIIIZ(obtainScrollObserver, "$this$obtainScrollObserver");
        obtainScrollObserver.LIZLLL = new AqS158S0100000_8((JHC) aqS139S0200000_8.l0, 474);
        new AqS158S0100000_8((UserPhotoHolder) aqS139S0200000_8.l1, 475);
        obtainScrollObserver.LJFF = new AqS158S0100000_8((UserPhotoHolder) aqS139S0200000_8.l1, 476);
        obtainScrollObserver.LJ = new AqS158S0100000_8((JHC) aqS139S0200000_8.l0, 477);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$25(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        SuggestWordResponse suggestWordsResponse = (SuggestWordResponse) obj;
        o.LJIIIZ(suggestWordsResponse, "suggestWordsResponse");
        List<TypeWords> list = suggestWordsResponse.data;
        if (list != null) {
            SuggestWordsViewModel suggestWordsViewModel = (SuggestWordsViewModel) aqS139S0200000_8.l0;
            InterfaceC51512KJo interfaceC51512KJo = (InterfaceC51512KJo) aqS139S0200000_8.l1;
            for (TypeWords typeWords : list) {
                if (o.LJ(typeWords.type, "inbox")) {
                    List<Word> list2 = typeWords.words;
                    if (list2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (Word word : list2) {
                            Word word2 = word;
                            if (!TextUtils.isEmpty(word2.getWord()) && !TextUtils.isEmpty(word2.getShowWord())) {
                                arrayList.add(word);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            LiveData liveData = (LiveData) suggestWordsViewModel.LJLIL.getValue();
                            typeWords.logId = suggestWordsResponse.logId;
                            typeWords.words = arrayList;
                            liveData.setValue(new C50764Jw8(typeWords));
                        }
                    }
                    interfaceC51512KJo.onFailed();
                } else {
                    ((LiveData) suggestWordsViewModel.LJLIL.getValue()).setValue(new C50764Jw8(new TypeWords()));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$26(AqS139S0200000_8 aqS139S0200000_8, Object it) {
        o.LJIIIZ(it, "it");
        ((InterfaceC51512KJo) aqS139S0200000_8.l0).onFailed();
        ((LiveData) ((SuggestWordsViewModel) aqS139S0200000_8.l1).LJLIL.getValue()).setValue(new C50764Jw8());
        return C76800UCe.LIZ;
    }

    public static final Object invoke$27(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C50201Jn3 state = (C50201Jn3) obj;
        o.LJIIIZ(state, "state");
        XKX.LIZLLL(ViewModelKt.getViewModelScope((SearchHubHeaderVM) aqS139S0200000_8.l0), C78613UtF.LIZJ, null, new C50210JnC((C50214JnG) aqS139S0200000_8.l1, state, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$28(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C50201Jn3 state = (C50201Jn3) obj;
        o.LJIIIZ(state, "state");
        XKX.LIZLLL(ViewModelKt.getViewModelScope((SearchHubHeaderVM) aqS139S0200000_8.l0), C78613UtF.LIZJ, null, new C50211JnD((C50214JnG) aqS139S0200000_8.l1, state, null), 2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$29(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C48909JHl searchAutoPlayScrollStateObserver = (C48909JHl) obj;
        o.LJIIIZ(searchAutoPlayScrollStateObserver, "$this$searchAutoPlayScrollStateObserver");
        searchAutoPlayScrollStateObserver.LIZLLL = new AqS158S0100000_8((C48942JIs) aqS139S0200000_8.l0, 502);
        new AqS158S0100000_8((JKG) aqS139S0200000_8.l1, 503);
        searchAutoPlayScrollStateObserver.LJFF = new AqS158S0100000_8((JKG) aqS139S0200000_8.l1, 504);
        searchAutoPlayScrollStateObserver.LJ = new AqS158S0100000_8((C48942JIs) aqS139S0200000_8.l0, 505);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        ECStoreInfoAssem eCStoreInfoAssem = (ECStoreInfoAssem) aqS139S0200000_8.l0;
        O6R.LJJIJIIJIL(assemble, eCStoreInfoAssem, new AqS174S0100000_8(eCStoreInfoAssem, 43));
        ECStoreInfoAssem eCStoreInfoAssem2 = (ECStoreInfoAssem) aqS139S0200000_8.l0;
        O6R.LJJIJIIJI(assemble, eCStoreInfoAssem2, new AqS139S0200000_8((View) aqS139S0200000_8.l1, eCStoreInfoAssem2, 5));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$30(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        boolean z;
        InterfaceC47035Id5 action = (InterfaceC47035Id5) obj;
        o.LJIIIZ(action, "action");
        C47020Icq LIZLLL = action.LIZLLL((IX4) aqS139S0200000_8.l0);
        IX4 ix4 = (IX4) aqS139S0200000_8.l0;
        IVM ivm = (IVM) aqS139S0200000_8.l1;
        if (!LIZLLL.LIZ) {
            z = false;
        } else {
            C47007Icd c47007Icd = LIZLLL.LIZIZ;
            if (c47007Icd != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("prepareSession | next: ");
                LIZ.append(c47007Icd);
                LIZ.append(" | action: ");
                LIZ.append(action);
                String msg = X1D.LIZIZ(LIZ);
                o.LJIIIZ(msg, "msg");
                c47007Icd.LJIIJ(ix4.LJJI);
                c47007Icd.LJIIIZ(ivm);
                c47007Icd.LJ(ix4);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$31(AqS139S0200000_8 aqS139S0200000_8, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new KA5((EcSearchSugResponse) aqS139S0200000_8.l0, (List) ((C10K) aqS139S0200000_8.l1).LJIIJJI(), Boolean.TRUE);
    }

    public static final Object invoke$32(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ((C47015Icl) aqS139S0200000_8.l0).LIZ.LIZ((C47007Icd) aqS139S0200000_8.l1);
        String msg = o.LJIILLIIL(obj, "startSession result : ");
        o.LJIIIZ(msg, "msg");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$33(kotlin.jvm.internal.AqS139S0200000_8 r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.invoke$33(kotlin.jvm.internal.AqS139S0200000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$34(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C57819Mmd updateTrackerConfig = (C57819Mmd) obj;
        o.LJIIIZ(updateTrackerConfig, "$this$updateTrackerConfig");
        String str = ((C49331JXr) aqS139S0200000_8.l0).LJLJJI;
        String n4 = ((SearchRelationUserAssem) aqS139S0200000_8.l1).n4();
        SearchRelationUserAssem searchRelationUserAssem = (SearchRelationUserAssem) aqS139S0200000_8.l1;
        return C57819Mmd.LIZ(updateTrackerConfig, null, str, null, n4, searchRelationUserAssem.LLFII, searchRelationUserAssem.p4(), 1015);
    }

    public static final Object invoke$35(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        boolean z;
        C25847ACl it = (C25847ACl) obj;
        o.LJIIIZ(it, "it");
        if (((ILC) aqS139S0200000_8.l0) == ((J87) aqS139S0200000_8.l1).LJLJJL.getPlayOrder()) {
            z = true;
        } else {
            z = false;
        }
        return C25847ACl.LJIILJJIL(it, z, false, false, 8190);
    }

    public static final Object invoke$36(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        Object c = (Context) aqS139S0200000_8.l0;
        o.LJIIIIZZ(c, "c");
        assemble.wv0((LifecycleOwner) c, new AqS181S0100000_15((C51006K0c) aqS139S0200000_8.l1, 259));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$38(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ViewGroup.LayoutParams updateLayoutParams = (ViewGroup.LayoutParams) obj;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        int intValue = ((Number) ((OSZ) aqS139S0200000_8.l0).getFirst()).intValue();
        int T = ((ViewOnAttachStateChangeListenerC49251JUp) aqS139S0200000_8.l1).T();
        if (intValue > T) {
            intValue = T;
        }
        updateLayoutParams.width = intValue;
        updateLayoutParams.height = ((Number) ((OSZ) aqS139S0200000_8.l0).getSecond()).intValue();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$39(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ViewGroup.LayoutParams updateLayoutParams = (ViewGroup.LayoutParams) obj;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        int intValue = ((Number) ((OSZ) aqS139S0200000_8.l0).getFirst()).intValue();
        int T = ((ViewOnAttachStateChangeListenerC49251JUp) aqS139S0200000_8.l1).T();
        if (intValue > T) {
            intValue = T;
        }
        updateLayoutParams.width = intValue;
        updateLayoutParams.height = ((Number) ((OSZ) aqS139S0200000_8.l0).getSecond()).intValue();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        assemble.sv0((ECStoreLiveAssem) aqS139S0200000_8.l0, C49029JMb.LJLIL);
        ECStoreLiveAssem eCStoreLiveAssem = (ECStoreLiveAssem) aqS139S0200000_8.l0;
        O6R.LJJIJIIJIL(assemble, eCStoreLiveAssem, new AqS174S0100000_8(eCStoreLiveAssem, 47));
        O6R.LJJIJIIJIL(assemble, (ECStoreLiveAssem) aqS139S0200000_8.l0, JMZ.LJLIL);
        O6R.LJJIJIIJIL(assemble, (ECStoreLiveAssem) aqS139S0200000_8.l0, JMV.LJLIL);
        ECStoreLiveAssem eCStoreLiveAssem2 = (ECStoreLiveAssem) aqS139S0200000_8.l0;
        O6R.LJJIJIIJI(assemble, eCStoreLiveAssem2, new AqS139S0200000_8((View) aqS139S0200000_8.l1, eCStoreLiveAssem2, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$40(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ViewGroup.LayoutParams updateLayoutParams = (ViewGroup.LayoutParams) obj;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        int intValue = ((Number) ((OSZ) aqS139S0200000_8.l0).getFirst()).intValue();
        int T = ((ViewOnAttachStateChangeListenerC49251JUp) aqS139S0200000_8.l1).T();
        if (intValue > T) {
            intValue = T;
        }
        updateLayoutParams.width = intValue;
        updateLayoutParams.height = ((Number) ((OSZ) aqS139S0200000_8.l0).getSecond()).intValue();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$41(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ViewGroup.LayoutParams updateLayoutParams = (ViewGroup.LayoutParams) obj;
        o.LJIIIZ(updateLayoutParams, "$this$updateLayoutParams");
        int intValue = ((Number) ((OSZ) aqS139S0200000_8.l0).getFirst()).intValue();
        int T = ((ViewOnAttachStateChangeListenerC49251JUp) aqS139S0200000_8.l1).T();
        if (intValue > T) {
            intValue = T;
        }
        updateLayoutParams.width = intValue;
        updateLayoutParams.height = C7MY.LIZIZ(32);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$42(AqS139S0200000_8 aqS139S0200000_8, Object it) {
        o.LJIIIZ(it, "it");
        InterfaceC88471Ynr<? super Context, ? super TextExtraStruct, C76800UCe> interfaceC88471Ynr = ((TopVideoHolderVM) aqS139S0200000_8.l0).LLF;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke((Context) aqS139S0200000_8.l1, it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$43(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C48909JHl searchAutoPlayScrollStateObserver = (C48909JHl) obj;
        o.LJIIIZ(searchAutoPlayScrollStateObserver, "$this$searchAutoPlayScrollStateObserver");
        searchAutoPlayScrollStateObserver.LIZLLL = new AqS158S0100000_8((C48942JIs) aqS139S0200000_8.l0, 646);
        new AqS158S0100000_8((C48948JIy) aqS139S0200000_8.l1, 647);
        searchAutoPlayScrollStateObserver.LJFF = new AqS158S0100000_8((C48948JIy) aqS139S0200000_8.l1, 648);
        searchAutoPlayScrollStateObserver.LJ = new AqS158S0100000_8((C48942JIs) aqS139S0200000_8.l0, 649);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$44(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C50652JuK updateContextSource = (C50652JuK) obj;
        o.LJIIIZ(updateContextSource, "$this$updateContextSource");
        String str = (String) ((C68322mC) aqS139S0200000_8.l0).element;
        SearchKeywordPresenter searchKeywordPresenter = ((KGR) aqS139S0200000_8.l1).LJLIL;
        if (searchKeywordPresenter != null) {
            return C50652JuK.copy$default(updateContextSource, null, new C50438Jqs(new C50321Joz(0, null, str, searchKeywordPresenter.getKeyword().LJLIL, null, null, null, null, false, null, null, false, null, 8179, null), null, 2, null), 1, null);
        }
        o.LJIJI("keywordPresenter");
        throw null;
    }

    public static final Object invoke$45(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        EnterRoomConfig enterRoomConfig = (EnterRoomConfig) obj;
        o.LJIIIZ(enterRoomConfig, "enterRoomConfig");
        AddressCardProducts addressCardProducts = (AddressCardProducts) aqS139S0200000_8.l0;
        if (addressCardProducts != null) {
            ECStoreLiveAssem eCStoreLiveAssem = (ECStoreLiveAssem) aqS139S0200000_8.l1;
            enterRoomConfig.mRoomsData.extraSchema = C49362JYw.LIZLLL(addressCardProducts, false, eCStoreLiveAssem.LLFF, C55096Ljo.LJIIZILJ(eCStoreLiveAssem));
        }
        ECStoreLiveAssem eCStoreLiveAssem2 = (ECStoreLiveAssem) aqS139S0200000_8.l1;
        C73994T2g.LJIIIIZZ(enterRoomConfig, eCStoreLiveAssem2.LLFF, C55096Ljo.LJIIZILJ(eCStoreLiveAssem2));
        return enterRoomConfig;
    }

    public static final Object invoke$46(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ILynxSearchHorizontal.ActiveArea it = (ILynxSearchHorizontal.ActiveArea) obj;
        o.LJIIIZ(it, "it");
        JR1 jr1 = (JR1) aqS139S0200000_8.l0;
        JR2 jr2 = jr1.LJLLL;
        if (jr2 != null) {
            jr2.LJIIJJI(it.getX(), it.getY(), it.getWidth(), it.getHeight());
        }
        jr1.LJLLLL = it;
        JR9 jr9 = ((JRJ) aqS139S0200000_8.l1).LJLJJLL.LJLZ.LJLIL.LJLJL;
        if (jr9 != null) {
            jr9.LIZIZ(it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$47(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ILynxSearchHorizontal.HorizontalStyle it = (ILynxSearchHorizontal.HorizontalStyle) obj;
        o.LJIIIZ(it, "it");
        JR1 jr1 = (JR1) aqS139S0200000_8.l0;
        Context context = jr1.LJLLILLLL.getContext();
        if (context != null) {
            jr1.LJLLILLLL.setPadding(C63081OpJ.LJIJJLI(context, it.getLeftMargin()), jr1.LJLLILLLL.getPaddingTop(), C63081OpJ.LJIJJLI(context, it.getRightMargin()), jr1.LJLLILLLL.getPaddingBottom());
            if (jr1.LJLLILLLL.getItemDecorationCount() <= 0) {
                jr1.LJLLILLLL.LJII((AbstractC030309z) jr1.LJLLLLLL.getValue(), -1);
            }
            ((C49159JRb) jr1.LJLLLLLL.getValue()).LJLIL = KL2.LIZJ(context, it.getItemSpace());
        }
        JRJ jrj = (JRJ) aqS139S0200000_8.l1;
        SearchHorizontalInnerContainer searchHorizontalInnerContainer = jrj.LJLJJLL;
        searchHorizontalInnerContainer.LL = it;
        searchHorizontalInnerContainer.LJLZ.LJLLLLLL.LJLJL = it;
        jrj.LJLJJL = true;
        return C76800UCe.LIZ;
    }

    public static final Object invoke$48(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        ILynxSearchHorizontal.ScrollAnchorInfo info = (ILynxSearchHorizontal.ScrollAnchorInfo) obj;
        o.LJIIIZ(info, "info");
        ((JRJ) aqS139S0200000_8.l0).LJLJJLL.X(info, (Callback) aqS139S0200000_8.l1);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$49(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        List<Product> list;
        List<Product> list2;
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
        ((SearchVideoHolder) aqS139S0200000_8.l0).LLJJIJI = anchorCommonStruct.getMostRelevantProductId();
        if (O5Y.LJJIJLIJ((Aweme) aqS139S0200000_8.l1)) {
            ProductAnchor LIZIZ = C49462Jb8.LIZIZ(anchorCommonStruct);
            if (LIZIZ != null && (list2 = LIZIZ.productList) != null && (!list2.isEmpty())) {
                return LIZIZ;
            }
        } else {
            ProductAnchor LIZ = C49462Jb8.LIZ(anchorCommonStruct);
            if (LIZ != null && (list = LIZ.productList) != null && (!list.isEmpty())) {
                return LIZ;
            }
        }
        return null;
    }

    public static final Object invoke$5(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C49358JYs searchReusedUiContentAssem = (C49358JYs) obj;
        o.LJIIIZ(searchReusedUiContentAssem, "$this$searchReusedUiContentAssem");
        View view = (View) aqS139S0200000_8.l0;
        o.LJIIIZ(view, "<set-?>");
        searchReusedUiContentAssem.LIZIZ = view;
        searchReusedUiContentAssem.LIZ = new C49034JMg(new AqS174S0100000_8((ECStoreInfoAssem) aqS139S0200000_8.l1, 45));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cc, code lost:
    
        if (r2.shouldShowInputAreaAfterSelect == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$50(kotlin.jvm.internal.AqS139S0200000_8 r8, java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.invoke$50(kotlin.jvm.internal.AqS139S0200000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$51(AqS139S0200000_8 aqS139S0200000_8, Object it) {
        o.LJIIIZ(it, "it");
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = ((KNA) aqS139S0200000_8.l0).LJLIL;
        if (effectRecommendationCardViewModel != null) {
            Context context = ((C73305Spp) aqS139S0200000_8.l1).getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCardViewModel.gv0(new KNK(context));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$52(AqS139S0200000_8 aqS139S0200000_8, Object it) {
        o.LJIIIZ(it, "it");
        EffectRecommendationCarouselViewModel effectRecommendationCarouselViewModel = ((KN9) aqS139S0200000_8.l0).LLJJ;
        if (effectRecommendationCarouselViewModel != null) {
            Context context = ((C73305Spp) aqS139S0200000_8.l1).getContext();
            o.LJIIIIZZ(context, "context");
            effectRecommendationCarouselViewModel.gv0(new C51598KMw(context));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$53(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C49851JhP c49851JhP = (C49851JhP) obj;
        o.LJIIIZ(c49851JhP, "$this$null");
        String valueOf = String.valueOf(((InterfaceC49871Jhj) aqS139S0200000_8.l0).LIZ());
        o.LJIIIZ(valueOf, "<set-?>");
        c49851JhP.LIZLLL = valueOf;
        List<Aweme> LIZ = ((AbstractC49300JWm) aqS139S0200000_8.l1).LIZ((InterfaceC49871Jhj) aqS139S0200000_8.l0, c49851JhP.LIZIZ);
        if (LIZ != null) {
            Iterator<Aweme> it = LIZ.iterator();
            while (it.hasNext()) {
                AqS174S0100000_8 aqS174S0100000_8 = new AqS174S0100000_8(it.next(), 272);
                ArrayList<C49862Jha> arrayList = c49851JhP.LJ;
                C49862Jha c49862Jha = new C49862Jha(c49851JhP.LIZIZ, c49851JhP);
                aqS174S0100000_8.invoke(c49862Jha);
                arrayList.add(c49862Jha);
            }
        }
        Object obj2 = (InterfaceC49871Jhj) aqS139S0200000_8.l0;
        if (obj2 instanceof C49854JhS) {
            C49854JhS c49854JhS = (C49854JhS) obj2;
            o.LJIIIZ(c49854JhS, "<set-?>");
            c49851JhP.LJFF = c49854JhS;
        }
        C49863Jhb c49863Jhb = c49851JhP.LIZIZ.LJFF;
        String str = c49851JhP.LIZLLL;
        C49864Jhc c49864Jhc = c49863Jhb.LIZ.get(C65352Pkq.LIZ(InterfaceC49871Jhj.class));
        if (c49864Jhc == null) {
            c49864Jhc = new C49864Jhc();
            c49863Jhb.LIZ.put(C65352Pkq.LIZ(InterfaceC49871Jhj.class), c49864Jhc);
        }
        HashMap<String, Object> hashMap = c49864Jhc.LIZ;
        if (hashMap != null) {
            hashMap.put(str, obj2);
        }
        C49854JhS config = ((AbstractC49300JWm) aqS139S0200000_8.l1).LIZLLL();
        o.LJIIIZ(config, "config");
        c49851JhP.LJFF = C49854JhS.LIZ(config);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$54(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        K42 it = (K42) obj;
        o.LJIIIZ(it, "it");
        String str = ((K47) aqS139S0200000_8.l0).LJLILLLLZI;
        SubFilterOptionStruct subFilterOptionStruct = null;
        if (o.LJ(str, ((FlowLayoutCell) aqS139S0200000_8.l1).N().LJLJJI)) {
            FlowLayoutCell flowLayoutCell = (FlowLayoutCell) aqS139S0200000_8.l1;
            SubFilterOptionStruct subFilterOptionStruct2 = it.LJLJJI;
            K47 item = flowLayoutCell.getItem();
            if (item != null) {
                subFilterOptionStruct = item.LJLIL;
            }
            flowLayoutCell.L(o.LJ(subFilterOptionStruct2, subFilterOptionStruct));
        } else if (o.LJ(str, ((FlowLayoutCell) aqS139S0200000_8.l1).N().LJLJJL)) {
            FlowLayoutCell flowLayoutCell2 = (FlowLayoutCell) aqS139S0200000_8.l1;
            SubFilterOptionStruct subFilterOptionStruct3 = it.LJLJJL;
            K47 item2 = flowLayoutCell2.getItem();
            if (item2 != null) {
                subFilterOptionStruct = item2.LJLIL;
            }
            flowLayoutCell2.L(o.LJ(subFilterOptionStruct3, subFilterOptionStruct));
        } else if (o.LJ(str, ((FlowLayoutCell) aqS139S0200000_8.l1).N().LJLJJLL)) {
            FlowLayoutCell flowLayoutCell3 = (FlowLayoutCell) aqS139S0200000_8.l1;
            SubFilterOptionStruct subFilterOptionStruct4 = it.LJLJJLL;
            K47 item3 = flowLayoutCell3.getItem();
            if (item3 != null) {
                subFilterOptionStruct = item3.LJLIL;
            }
            flowLayoutCell3.L(o.LJ(subFilterOptionStruct4, subFilterOptionStruct));
        } else if (o.LJ(str, ((FlowLayoutCell) aqS139S0200000_8.l1).N().LJLIL)) {
            FlowLayoutCell flowLayoutCell4 = (FlowLayoutCell) aqS139S0200000_8.l1;
            SubFilterOptionStruct subFilterOptionStruct5 = it.LJLILLLLZI;
            K47 item4 = flowLayoutCell4.getItem();
            if (item4 != null) {
                subFilterOptionStruct = item4.LJLIL;
            }
            flowLayoutCell4.L(o.LJ(subFilterOptionStruct5, subFilterOptionStruct));
        } else if (o.LJ(str, ((FlowLayoutCell) aqS139S0200000_8.l1).N().LJLILLLLZI)) {
            FlowLayoutCell flowLayoutCell5 = (FlowLayoutCell) aqS139S0200000_8.l1;
            SubFilterOptionStruct subFilterOptionStruct6 = it.LJLIL;
            K47 item5 = flowLayoutCell5.getItem();
            if (item5 != null) {
                subFilterOptionStruct = item5.LJLIL;
            }
            flowLayoutCell5.L(o.LJ(subFilterOptionStruct6, subFilterOptionStruct));
        } else if (o.LJ(str, ((FlowLayoutCell) aqS139S0200000_8.l1).N().LJLJI)) {
            FlowLayoutCell flowLayoutCell6 = (FlowLayoutCell) aqS139S0200000_8.l1;
            SubFilterOptionStruct subFilterOptionStruct7 = it.LJLJI;
            K47 item6 = flowLayoutCell6.getItem();
            if (item6 != null) {
                subFilterOptionStruct = item6.LJLIL;
            }
            flowLayoutCell6.L(o.LJ(subFilterOptionStruct7, subFilterOptionStruct));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$55(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        EnumC57435MgR it = (EnumC57435MgR) obj;
        o.LJIIIZ(it, "it");
        SearchFollowAssem searchFollowAssem = (SearchFollowAssem) aqS139S0200000_8.l0;
        User user = searchFollowAssem.LLFII;
        if (user != null) {
            FollowStatus followStatus = new FollowStatus();
            followStatus.followStatus = it.getValue();
            User user2 = searchFollowAssem.LLFII;
            if (user2 != null && TextUtils.equals(followStatus.userId, user2.getUid())) {
                user2.setFollowStatus(followStatus.followStatus);
            }
            SearchGlobalViewModel searchGlobalViewModel = (SearchGlobalViewModel) aqS139S0200000_8.l1;
            if (searchGlobalViewModel != null) {
                String uid = user.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                searchGlobalViewModel.pv0(it.getValue(), uid);
            }
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0078, code lost:
    
        if (r2.intValue() != r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$56(kotlin.jvm.internal.AqS139S0200000_8 r4, java.lang.Object r5) {
        /*
            X.K9G r5 = (X.K9G) r5
            java.lang.String r0 = "$this$setState"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.Object r1 = r4.l0
            X.KAU r1 = (X.KAU) r1
            X.KAU r0 = X.KAU.RESULT
            r3 = 0
            if (r1 != r0) goto L63
            boolean r0 = X.C50675Juh.LIZ
            if (r0 == 0) goto L63
            boolean r0 = X.C51242K9e.LIZ()
            if (r0 != 0) goto L63
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM r0 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM) r0
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r0 = r0.LJLJJI
            if (r0 == 0) goto L42
            X.K9E r0 = r0.g8()
            if (r0 == 0) goto L42
            X.Jz6 r1 = r0.LJIILIIL
            if (r1 == 0) goto L42
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r1.getEcSearchEntranceData()
            if (r0 == 0) goto L7b
            int r0 = r0.getRootEnterFromType()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L3a:
            X.KAq r0 = X.EnumC51280KAq.FASHION
            int r1 = r0.getValue()
            if (r2 != 0) goto L74
        L42:
            com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService r1 = com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl.LJJJJZI()
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM r0 = (com.ss.android.ugc.aweme.ecommerce.search.searchbar.vm.ECSearchBarAssemVM) r0
            com.ss.android.ugc.aweme.ecommerce.search.searchbar.ISearchBarContextAbility r0 = r0.LJLJJI
            if (r0 == 0) goto L72
            X.K9E r0 = r0.g8()
            if (r0 == 0) goto L72
            X.Jz6 r0 = r0.LJIILIIL
            if (r0 == 0) goto L72
            com.ss.android.ugc.aweme.search.ecommerce.entrance.ECSearchEntranceData r0 = r0.getEcSearchEntranceData()
        L5c:
            boolean r0 = r1.LJJJJ(r0)
            if (r0 != 0) goto L63
            r3 = 1
        L63:
            java.lang.String r2 = r5.LJLIL
            java.lang.String r1 = r5.LJLILLLLZI
            java.lang.String r0 = "hint"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.K9G r0 = new X.K9G
            r0.<init>(r2, r1, r3)
            return r0
        L72:
            r0 = 0
            goto L5c
        L74:
            int r0 = r2.intValue()
            if (r0 != r1) goto L42
            goto L63
        L7b:
            int r0 = r1.getEcSearchEntranceValue()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L3a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.invoke$56(kotlin.jvm.internal.AqS139S0200000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$57(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C48909JHl obtainScrollObserver = (C48909JHl) obj;
        o.LJIIIZ(obtainScrollObserver, "$this$obtainScrollObserver");
        obtainScrollObserver.LIZLLL = new AqS158S0100000_8((C48929JIf) aqS139S0200000_8.l0, 721);
        new AqS158S0100000_8((C48929JIf) aqS139S0200000_8.l0, 722);
        obtainScrollObserver.LJFF = new AqS158S0100000_8((C48929JIf) aqS139S0200000_8.l0, 723);
        obtainScrollObserver.LJ = new AqS158S0100000_8((C48942JIs) aqS139S0200000_8.l1, 724);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C49358JYs searchReusedUiContentAssem = (C49358JYs) obj;
        o.LJIIIZ(searchReusedUiContentAssem, "$this$searchReusedUiContentAssem");
        View view = (View) aqS139S0200000_8.l0;
        o.LJIIIZ(view, "<set-?>");
        searchReusedUiContentAssem.LIZIZ = view;
        searchReusedUiContentAssem.LIZ = new C49034JMg(new AqS174S0100000_8((ECStoreLiveAssem) aqS139S0200000_8.l1, 49));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        SearchSingleCardTemplateAssem searchSingleCardTemplateAssem = (SearchSingleCardTemplateAssem) aqS139S0200000_8.l0;
        assemble.nv0(searchSingleCardTemplateAssem, new AqS174S0100000_8(searchSingleCardTemplateAssem, 70));
        SearchSingleCardTemplateAssem searchSingleCardTemplateAssem2 = (SearchSingleCardTemplateAssem) aqS139S0200000_8.l0;
        JMP<T> jmp = searchSingleCardTemplateAssem2.LLFF.LIZ;
        if (jmp != 0) {
            assemble.sv0(searchSingleCardTemplateAssem2, new AqS112S0300000_8((JMP) jmp, (JMP<InterfaceC49025JLx>) assemble, (Assembler) searchSingleCardTemplateAssem2, (SearchSingleCardTemplateAssem<InterfaceC49025JLx>) 1));
            assemble.sv0(searchSingleCardTemplateAssem2, new AqS112S0300000_8((JMP) jmp, (JMP<InterfaceC49025JLx>) assemble, (Assembler) searchSingleCardTemplateAssem2, (SearchSingleCardTemplateAssem<InterfaceC49025JLx>) 2));
            SearchSingleCardTemplateAssem searchSingleCardTemplateAssem3 = (SearchSingleCardTemplateAssem) aqS139S0200000_8.l0;
            JM7<T> jm7 = searchSingleCardTemplateAssem3.LLFF.LIZIZ;
            if (jm7 != 0) {
                View view = (View) aqS139S0200000_8.l1;
                JLW<T> jlw = jm7.LIZ;
                if (jlw != 0) {
                    assemble.rv0(searchSingleCardTemplateAssem3, new AqS54S0400000_8(assemble, (Assembler) searchSingleCardTemplateAssem3, (SearchSingleCardTemplateAssem<InterfaceC49025JLx>) view, (View) jlw, (JLW<InterfaceC49025JLx>) 0));
                }
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("ui");
        throw null;
    }

    public static final Object invoke$8(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        List create = (List) obj;
        o.LJIIIZ(create, "$this$create");
        SearchCardViewHolder searchCardViewHolder = (SearchCardViewHolder) aqS139S0200000_8.l0;
        create.add(new OSZ(SearchServiceCenter$CardCommonAbility.class, new SearchCardCommonAbilityImpl(searchCardViewHolder, searchCardViewHolder.LJLIL)));
        View view = (View) aqS139S0200000_8.l1;
        SearchCardViewHolder searchCardViewHolder2 = (SearchCardViewHolder) aqS139S0200000_8.l0;
        create.add(new OSZ(SearchServiceCenter$MobAbility.class, new SearchCardMobAbilityImpl(view, searchCardViewHolder2.LJLIL, searchCardViewHolder2)));
        create.add(new OSZ(ISearchContextAbility.class, (SearchCardViewHolder) aqS139S0200000_8.l0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS139S0200000_8 aqS139S0200000_8, Object obj) {
        C4LX hierarchyData = (C4LX) obj;
        o.LJIIIZ(hierarchyData, "$this$hierarchyData");
        JLW jlw = (JLW) aqS139S0200000_8.l0;
        JMP<T> jmp = ((SearchSingleCardTemplateAssem) aqS139S0200000_8.l1).LLFF.LIZ;
        if (jmp != 0) {
            JMI jmi = jmp.LIZIZ;
            if (jmi != null) {
                if (o.LJ(jmi.LIZ, C65352Pkq.LIZ(SearchBuiltInBottomAssem.class))) {
                    InterfaceC65784Pro interfaceC65784Pro = jlw.LJLJJL;
                    if (interfaceC65784Pro == null) {
                        interfaceC65784Pro = C2W3.LJLIL;
                    }
                    jlw.LJLJJL = new AqS148S0200000_1(C47261Igj.LJJIJIIJI(Integer.valueOf(R.id.desc), Integer.valueOf(R.id.a_v), Integer.valueOf(R.id.aa0), Integer.valueOf(R.id.fr4)), interfaceC65784Pro, 18);
                }
                hierarchyData.LIZIZ(jlw);
                return C76800UCe.LIZ;
            }
            o.LJIJI("bottomAssem");
            throw null;
        }
        o.LJIJI("ui");
        throw null;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS139S0200000_8(X.MJS r3, com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 25: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.<init>(X.MJS, com.ss.android.ugc.aweme.legacy.network.viewmodel.SuggestWordsViewModel, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS139S0200000_8(android.view.View r3, com.ss.android.ugc.aweme.general.ECStoreInfoAssem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 3: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.<init>(android.view.View, com.ss.android.ugc.aweme.general.ECStoreInfoAssem, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS139S0200000_8(android.view.View r3, com.ss.android.ugc.aweme.general.ECStoreLiveAssem r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 4: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 1
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS139S0200000_8.<init>(android.view.View, com.ss.android.ugc.aweme.general.ECStoreLiveAssem, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(C68322mC c68322mC, C68322mC<String> c68322mC2, KGR kgr) {
        super(1);
        this.$t = kgr;
        this.l0 = c68322mC;
        this.l1 = c68322mC2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(AbstractC72932td abstractC72932td, AbstractC72932td<TakoInfo> abstractC72932td2, SearchBotHolder searchBotHolder) {
        super(1);
        this.$t = searchBotHolder;
        this.l0 = abstractC72932td;
        this.l1 = abstractC72932td2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(ILC ilc, J87 j87, int i) {
        super(1);
        this.$t = i;
        this.l0 = ilc;
        this.l1 = j87;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(IX4 ix4, IVM ivm, int i) {
        super(1);
        this.$t = i;
        this.l0 = ix4;
        this.l1 = ivm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C47015Icl c47015Icl, C47007Icd c47007Icd, int i) {
        super(1);
        this.$t = i;
        this.l0 = c47015Icl;
        this.l1 = c47007Icd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C48887JGp c48887JGp, JI9 ji9, int i) {
        super(1);
        this.$t = i;
        this.l0 = c48887JGp;
        this.l1 = ji9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(JHC jhc, UserPhotoHolder userPhotoHolder, int i) {
        super(1);
        this.$t = i;
        this.l0 = jhc;
        this.l1 = userPhotoHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C48929JIf c48929JIf, C48942JIs c48942JIs, int i) {
        super(1);
        this.$t = i;
        this.l0 = c48929JIf;
        this.l1 = c48942JIs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C48942JIs c48942JIs, C48948JIy c48948JIy, int i) {
        super(1);
        this.$t = i;
        this.l0 = c48942JIs;
        this.l1 = c48948JIy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C48942JIs c48942JIs, JKG jkg, int i) {
        super(1);
        this.$t = i;
        this.l0 = c48942JIs;
        this.l1 = jkg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(JLW jlw, JLW<InterfaceC49025JLx> jlw2, SearchSingleCardTemplateAssem<InterfaceC49025JLx> searchSingleCardTemplateAssem) {
        super(1);
        this.$t = searchSingleCardTemplateAssem;
        this.l0 = jlw;
        this.l1 = jlw2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(JMX jmx, JMW jmw, int i) {
        super(1);
        this.$t = i;
        this.l0 = jmx;
        this.l1 = jmw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(InterfaceC49037JMj interfaceC49037JMj, C49358JYs c49358JYs, int i) {
        super(1);
        this.$t = i;
        this.l0 = interfaceC49037JMj;
        this.l1 = c49358JYs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(JR1 jr1, JRJ jrj, int i) {
        super(1);
        this.$t = i;
        this.l0 = jr1;
        this.l1 = jrj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(JRJ jrj, Callback callback, int i) {
        super(1);
        this.$t = i;
        this.l0 = jrj;
        this.l1 = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(AbstractC49300JWm abstractC49300JWm, AbstractC49300JWm<InterfaceC49871Jhj> abstractC49300JWm2, SearchMixFeed searchMixFeed) {
        super(1);
        this.$t = searchMixFeed;
        this.l0 = abstractC49300JWm;
        this.l1 = abstractC49300JWm2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C49331JXr c49331JXr, SearchRelationUserAssem searchRelationUserAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = c49331JXr;
        this.l1 = searchRelationUserAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(K47 k47, FlowLayoutCell flowLayoutCell, int i) {
        super(1);
        this.$t = i;
        this.l0 = k47;
        this.l1 = flowLayoutCell;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(KAU kau, ECSearchBarAssemVM eCSearchBarAssemVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = kau;
        this.l1 = eCSearchBarAssemVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(KN9 kn9, C73305Spp c73305Spp, int i) {
        super(1);
        this.$t = i;
        this.l0 = kn9;
        this.l1 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(KNA kna, C73305Spp c73305Spp, int i) {
        super(1);
        this.$t = i;
        this.l0 = kna;
        this.l1 = c73305Spp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(C60193Njp c60193Njp, C60193Njp c60193Njp2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c60193Njp;
        this.l1 = c60193Njp2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(OSZ osz, OSZ<Integer, Integer> osz2, ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp) {
        super(1);
        this.$t = viewOnAttachStateChangeListenerC49251JUp;
        this.l0 = osz;
        this.l1 = osz2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(XKS xks, SearchUserViewHolder searchUserViewHolder, int i) {
        super(1);
        this.$t = i;
        this.l0 = xks;
        this.l1 = searchUserViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(Context context, C51006K0c c51006K0c, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = c51006K0c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(MallToolBarAssem mallToolBarAssem, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = mallToolBarAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(AddressCardProducts addressCardProducts, ECStoreLiveAssem eCStoreLiveAssem, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressCardProducts;
        this.l1 = eCStoreLiveAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(EcSearchSugResponse ecSearchSugResponse, EcSearchSugResponse ecSearchSugResponse2, C10K<List<SearchSugEntity>> c10k) {
        super(1);
        this.$t = c10k;
        this.l0 = ecSearchSugResponse;
        this.l1 = ecSearchSugResponse2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(Aweme aweme, SearchVideoHolder searchVideoHolder, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchVideoHolder;
        this.l1 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchFollowAssem searchFollowAssem, SearchGlobalViewModel searchGlobalViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchFollowAssem;
        this.l1 = searchGlobalViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchCardViewHolder searchCardViewHolder, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchCardViewHolder;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS139S0200000_8(SearchSingleCardTemplateAssem searchSingleCardTemplateAssem, SearchSingleCardTemplateAssem<T> searchSingleCardTemplateAssem2, View view) {
        super(1);
        this.$t = view;
        this.l0 = searchSingleCardTemplateAssem;
        this.l1 = searchSingleCardTemplateAssem2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchVideoSkipTrigger searchVideoSkipTrigger, VideoItemParams videoItemParams, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchVideoSkipTrigger;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchBotHolder searchBotHolder, SearchTakoCardUIVM searchTakoCardUIVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchBotHolder;
        this.l1 = searchTakoCardUIVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(PollingInfoResponse pollingInfoResponse, TakoPollingVM takoPollingVM, int i) {
        super(1);
        this.$t = i;
        this.l0 = pollingInfoResponse;
        this.l1 = takoPollingVM;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchPhotoRootAssem searchPhotoRootAssem, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchPhotoRootAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(UserPhotoRootAssem userPhotoRootAssem, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = userPhotoRootAssem;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(AggregatedVideoRootAssme aggregatedVideoRootAssme, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = aggregatedVideoRootAssme;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchMixFeed searchMixFeed, AbstractC49300JWm abstractC49300JWm, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchMixFeed;
        this.l1 = abstractC49300JWm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchJediMixFeedFragment searchJediMixFeedFragment, C50420Jqa c50420Jqa, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchJediMixFeedFragment;
        this.l1 = c50420Jqa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchJediMixFeedFragment searchJediMixFeedFragment, GlobalDoodleConfig globalDoodleConfig, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchJediMixFeedFragment;
        this.l1 = globalDoodleConfig;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(SearchHubHeaderVM searchHubHeaderVM, C50214JnG c50214JnG, int i) {
        super(1);
        this.$t = i;
        this.l0 = searchHubHeaderVM;
        this.l1 = c50214JnG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(TopVideoHolderVM topVideoHolderVM, Context context, int i) {
        super(1);
        this.$t = i;
        this.l0 = topVideoHolderVM;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(HashtagFeedbackCell hashtagFeedbackCell, KSI ksi, int i) {
        super(1);
        this.$t = i;
        this.l0 = hashtagFeedbackCell;
        this.l1 = ksi;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(FeedEcSearchBottomBarAssemTrigger feedEcSearchBottomBarAssemTrigger, VideoItemParams videoItemParams, int i) {
        super(1);
        this.$t = i;
        this.l0 = feedEcSearchBottomBarAssemTrigger;
        this.l1 = videoItemParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS139S0200000_8(AqS178S0100000_12 aqS178S0100000_12, C34K c34k, int i) {
        super(1);
        this.$t = i;
        this.l0 = aqS178S0100000_12;
        this.l1 = c34k;
    }
}
