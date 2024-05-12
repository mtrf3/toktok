package X;

import Y.ARunnableS28S0200000_9;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.ablility.IWindowAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.IDistributeStateAbility;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.InteractTitleScope;
import com.bytedance.android.live.liveinteract.multihost.biz.helper.MultiHostScope;
import com.bytedance.android.live.liveinteract.multihost.biz.view.ICoHostTopicAbility;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchScope;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.speedchallenge.ui.ISpeedChallengeAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.IBottomNoticeAbility;
import com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility;
import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.ILinkStateAbility;
import com.bytedance.android.live.liveinteract.voicechat.main.common.assem.VoiceChatMaskAbility;
import com.bytedance.assem.provider.performance.AbilityMap$getRemoveObserver$1;
import com.bytedance.provider.impl.GScope;
import com.bytedance.provider.vm.ScopeViewModel;
import com.bytedance.tiktok.homepage.mainfragment.MainFragmentBusinessAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFShopAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.assem.MainPageSeekAbility;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NoticeAbility;
import com.ss.android.ugc.aweme.DanmakuEntranceAbility;
import com.ss.android.ugc.aweme.abilities.IDanmakuLayoutAbility;
import com.ss.android.ugc.aweme.ability.IDubbingAbility;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.ToolsMainActivityAbility;
import com.ss.android.ugc.aweme.ad.feed.midad.IMidAdCellAbility;
import com.ss.android.ugc.aweme.ad.feed.slide.SlideAdWebPreloadAbility;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.base.BackRefreshStrategyAbility;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.base.MainDialogAbility;
import com.ss.android.ugc.aweme.base.activity.BottomTabAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageBusinessAbility;
import com.ss.android.ugc.aweme.base.mainpagefragment.MainPageSocialAbility;
import com.ss.android.ugc.aweme.casting.api.ICastingAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.INowKeyboardMultiPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.GiftSelectAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.HorizontalEmojiAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentGiftPanelAssemVAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardCommentEmojiAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardIconGroupAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardInputPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardMultiPanelAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRepostCardAssemAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRepostCheckAssemVAbility;
import com.ss.android.ugc.aweme.detail.DetailFlingGestureAbility;
import com.ss.android.ugc.aweme.detail.DetailFragmentScope;
import com.ss.android.ugc.aweme.detail.component.bottom.DetailBottomAbility;
import com.ss.android.ugc.aweme.dsp.IAudioCardUIStateAbility;
import com.ss.android.ugc.aweme.dsp.arch.AudioCardScope;
import com.ss.android.ugc.aweme.dsp.arch.FragmentScope;
import com.ss.android.ugc.aweme.dsp.playerservice.v2.IAudioPlayerAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IContainerUtilityAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IEventDispatchAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IStatusViewAbility;
import com.ss.android.ugc.aweme.dsp.playpage.v2.IViewPagerAbility;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.CustomDotAbilityCommon;
import com.ss.android.ugc.aweme.ecommerce.search.page.ECSearchPageScope;
import com.ss.android.ugc.aweme.ecommerce.search.result.ISearchResultSubPageAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.SearchVerticalScope;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalParamsBuildAbility;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.VerticalSearchAbility;
import com.ss.android.ugc.aweme.feed.adapter.CellInteractAreaScope;
import com.ss.android.ugc.aweme.feed.assem.ILazyLoadAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PanelSingleTapInterceptAbility;
import com.ss.android.ugc.aweme.feed.assem.ability.PauseTimeAbility;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedDefaultAvatarAbility;
import com.ss.android.ugc.aweme.feed.assem.commoditycard.ICommodityCardAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.InteractInfoDescAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescProviderAbility;
import com.ss.android.ugc.aweme.feed.assem.multitag.FeedMultiAnchorAbility;
import com.ss.android.ugc.aweme.feed.assem.music.InteractInfoMusicTitleAbility;
import com.ss.android.ugc.aweme.feed.assem.music.InteractRightMenuMusicCoverAbility;
import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.InteractInfoAuthorInfoAbility;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeEntrancesControlAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.ICellSpeedActionAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedDataLoadLogicAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedVideoEventDispatcherAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.scope.LandscapeFeedScope;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;
import com.ss.android.ugc.aweme.feed.survey.ability.ISurveyInteractAbility;
import com.ss.android.ugc.aweme.feed.ui.GetRemainingWordCountWithoutHashtagAbility;
import com.ss.android.ugc.aweme.fullpagev3.scope.FullPageBottomActionBarAbility;
import com.ss.android.ugc.aweme.fullpagev3.scope.PostModeDetailFragmentScope;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem.TitleBarActivityStatusAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.single.ui.assem.TitleBarTypingAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.actionbar.ActionBarAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomEditTextAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.ChatRoomMentionInputAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.panel.ChatRoomPanelAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mention.ChatRoomMentionPanelAbility;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.ProfileItemUpdater;
import com.ss.android.ugc.aweme.im.sdk.common.ui.titlebar.TitleBarLeftAbility;
import com.ss.android.ugc.aweme.input.DanmakuInputAbility;
import com.ss.android.ugc.aweme.input.DanmakuKeyboardScope;
import com.ss.android.ugc.aweme.journey.NewUserGuideAbility;
import com.ss.android.ugc.aweme.main.IPerformanceAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.music.highlight.HighlightScope;
import com.ss.android.ugc.aweme.music.highlight.HighlightSubmitBtnShowAbility;
import com.ss.android.ugc.aweme.notification.creator.vscope.CreatorNoticeTabScope;
import com.ss.android.ugc.aweme.notification.creator.vscope.ICreatorFindBaseAdapterAbility;
import com.ss.android.ugc.aweme.offlinemode.IOfflineModeSwitchAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.CategoryEntranceAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.ICategoryListAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyLocationPermissionAbility;
import com.ss.android.ugc.aweme.poi.collect.collectassem.IPoiDetailFavoriteBottomVAbility;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.IPoiDetailInfoVAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailScope;
import com.ss.android.ugc.aweme.popularfeed.scope.FeedPopularFragmentScope;
import com.ss.android.ugc.aweme.popularfeed.ui.IPopularContentAssemAbility;
import com.ss.android.ugc.aweme.popularfeed.ui.IPopularEmptyAssemAbility;
import com.ss.android.ugc.aweme.popularfeed.ui.IPopularPopupAssemAbility;
import com.ss.android.ugc.aweme.popularfeed.ui.IPopularToFYPAssemAbility;
import com.ss.android.ugc.aweme.popup.INearbyPopupAssemAbility;
import com.ss.android.ugc.aweme.result.common.core.ui.LiveInnerFlowAbility;
import com.ss.android.ugc.aweme.roaming.IRegionAllListAbility;
import com.ss.android.ugc.aweme.roaming.IRegionSearchListAbility;
import com.ss.android.ugc.aweme.roaming.NearbyRegionScope;
import com.ss.android.ugc.aweme.scope.FeedNearbyFragmentScope;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.scope.MainFragmentScope;
import com.ss.android.ugc.aweme.scope.MainPageFragmentScope;
import com.ss.android.ugc.aweme.search.common.ui.component.searchguide.ISearchSwipeGuideAbility;
import com.ss.android.ugc.aweme.search.detail.shoot.core.IDetailBottomMusicShootAbility;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentAbility;
import com.ss.android.ugc.aweme.search.ecommerce.middle.SearchResultFragmentScope;
import com.ss.android.ugc.aweme.search.pages.core.ui.assem.SearchContainerFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.ResearchFilterAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.research.core.vability.SearchFragmentScope;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.ISearchCLASubtitleAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoScope;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.ILayoutSwitcherAbility;
import com.ss.android.ugc.aweme.service.CLACaptionAbility;
import com.ss.android.ugc.aweme.stemfeed.scope.StemFeedFragmentScope;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemContentAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemEmptyAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemPopupAssemAbility;
import com.ss.android.ugc.aweme.stemfeed.ui.IStemToFYPAssemAbility;
import com.ss.android.ugc.aweme.story.ability.QuickDMEntranceAbility;
import com.ss.android.ugc.aweme.story.ability.StoryViewerEntranceBridgeAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionPlayerViewAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionProgressBarAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.FeedCollectionViewPagerAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.ability.StoryBubbleListAbility;
import com.ss.android.ugc.aweme.story.feed.common.newarch.scope.FeedCollectionScope;
import com.ss.android.ugc.aweme.topicfeed.scope.TopicFeedFragmentScope;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicContentAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicEmptyAssemAbility;
import com.ss.android.ugc.aweme.topicfeed.ui.ITopicToFYPAssemAbility;
import com.ss.android.ugc.aweme.toptab.ui.ILiveSingleFeedContentAssemAbility;
import com.ss.android.ugc.aweme.ui.INearbyContentAssemAbility;
import com.ss.android.ugc.aweme.ui.INearbyCurrentRegionAbility;
import com.ss.android.ugc.aweme.ui.INearbyEmptyAssemAbility;
import com.ss.android.ugc.aweme.ui.INearbyFeatureNotAvailableAbility;
import com.ss.android.ugc.aweme.ui.INearbyToFYPAssemAbility;
import com.ss.android.ugc.aweme.upvote.IRepostListAbility;
import com.ss.android.ugc.aweme.upvote.scope.RepostListScope;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellScope;
import com.ss.android.ugc.feed.platform.cell.clean.ICellCleanAbility;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.component.cleanmode.CellCleanModeAbility;
import com.ss.android.ugc.feed.platform.cell.component.playerview.CellPlayerViewAbility;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.CellStickerComponentAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility;
import com.ss.android.ugc.feed.platform.cell.gradual.CellGradualAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBottomAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractFullScreenAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractInfoAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import com.ss.android.ugc.feed.platform.cell.interact.top.topwarn.TopWarnAbility;
import com.ss.android.ugc.feed.platform.cell.pinch.PinchAbility;
import com.ss.android.ugc.feed.platform.cell.shrink.VideoShrinkAbility;
import com.ss.android.ugc.feed.platform.container.info.FeedInfoTagAreaContainerAbility;
import com.ss.android.ugc.feed.platform.container.info.button.FeedBottomButtonAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.BottomBarPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.CategoryPriorityAbility;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityAbility;
import com.ss.android.ugc.feed.platform.container.scope.CommonVideoCellScope;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.RootPanelScope;
import com.ss.android.ugc.feed.platform.panel.adaption.IScreenComponentAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IDefaultAutoScrollAbility;
import com.ss.android.ugc.feed.platform.panel.clean.IFeedCleanAbility;
import com.ss.android.ugc.feed.platform.panel.clearmode.IClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.clearmode.IPinchToClearModePanelComponent;
import com.ss.android.ugc.feed.platform.panel.digg.IDiggComponentAbility;
import com.ss.android.ugc.feed.platform.panel.downloadbar.IDownloadBarAbility;
import com.ss.android.ugc.feed.platform.panel.earphone.IEarphonePlayerControlComponent;
import com.ss.android.ugc.feed.platform.panel.homeviewpager.EdgeSlideGuideAbility;
import com.ss.android.ugc.feed.platform.panel.live.IGameLiveAbility;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.ILoadMoreAbility;
import com.ss.android.ugc.feed.platform.panel.login.ILoginFollowAbility;
import com.ss.android.ugc.feed.platform.panel.midad.IMidAdAbility;
import com.ss.android.ugc.feed.platform.panel.nonperson.IFeedNonPersonalizedAbility;
import com.ss.android.ugc.feed.platform.panel.pagestate.IPageStateAbility;
import com.ss.android.ugc.feed.platform.panel.pip.IPipAbility;
import com.ss.android.ugc.feed.platform.panel.playbutton.IPlayButtonAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerPreloadDataAbility;
import com.ss.android.ugc.feed.platform.panel.player.IResumePlayPanelComponent;
import com.ss.android.ugc.feed.platform.panel.refreshpanel.IRefreshAbility;
import com.ss.android.ugc.feed.platform.panel.system.SystemComponentAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.service.HideVideoTagAbility;
import com.ss.android.ugc.now.interaction.CommentListFragmentScope;
import com.ss.android.ugc.now.interaction.assem.ICommentMentionAssemAbility;
import com.ss.android.ugc.now.interaction.assem.IFakeKeyboardInputAssemAbility;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS64S1200000_9;
import kotlin.jvm.internal.AqS90S0300000_1;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Ljo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55096Ljo {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(C8W0 c8w0) {
        Class<? extends C2K0>[] LJ;
        Class<? extends C2K0>[] LJ2;
        Object targetScope;
        o.LJIIIZ(c8w0, "<this>");
        SZE.LIZ(String.valueOf(c8w0.hashCode()), C65352Pkq.LIZ(C88509YoT.class));
        int i = 0;
        if (C55103Ljv.LIZ) {
            if ((c8w0 instanceof InterfaceC55102Lju) && (LJ2 = LJ(c8w0.getClass())) != null && LJ2.length != 0) {
                int length = LJ2.length;
                while (i < length) {
                    Class<? extends C2K0> cls = LJ2[i];
                    Class<Object> LJFF = LJFF(cls);
                    if (o.LJ(LJFF, GScope.class)) {
                        targetScope = GScope.LJLIL;
                    } else {
                        targetScope = c8w0;
                        do {
                            if (!(targetScope instanceof C2L4) || !ORZ.LJLJJI(LJFF, ((C2L4) targetScope).getScopeDefine())) {
                                targetScope = C55097Ljp.LIZJ(targetScope);
                            }
                        } while (targetScope != null);
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("can not find scope define for lifecycleOwner! ");
                        LIZ.append(c8w0);
                        throw new IllegalAccessException(X1D.LIZIZ(LIZ));
                    }
                    InterfaceC55102Lju interfaceC55102Lju = (InterfaceC55102Lju) c8w0;
                    o.LJIIIZ(targetScope, "targetScope");
                    ConcurrentHashMap<Object, CopyOnWriteArrayList<C53899LDj>> concurrentHashMap = C53897LDh.LIZ;
                    C53898LDi c53898LDi = C53898LDi.LJLIL;
                    CopyOnWriteArrayList<C53899LDj> copyOnWriteArrayList = concurrentHashMap.get(targetScope);
                    if (copyOnWriteArrayList == null) {
                        c53898LDi.getClass();
                        copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                        concurrentHashMap.put(targetScope, copyOnWriteArrayList);
                    }
                    copyOnWriteArrayList.add(new C53899LDj(cls, interfaceC55102Lju, c8w0));
                    if (o.LJ(C16880lQ.LLJJJJ(), Looper.myLooper())) {
                        c8w0.getLifecycle().addObserver(new AbilityMap$getRemoveObserver$1(targetScope));
                    } else {
                        new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS28S0200000_9(targetScope, c8w0, 74));
                    }
                    i++;
                }
            }
        } else {
            Class<? extends C2K0>[] LJ3 = LJ(c8w0.getClass());
            if (LJ3 != null && LJ3.length != 0 && (LJ = LJ(c8w0.getClass())) != null && LJ.length != 0 && (c8w0 instanceof InterfaceC55102Lju)) {
                int length2 = LJ.length;
                while (i < length2) {
                    Class<? extends C2K0> cls2 = LJ[i];
                    InterfaceC55235Lm3 LJI = LJI(c8w0, LJFF(cls2));
                    if (LJI != null) {
                        LJIIJ(LJI, (InterfaceC55102Lju) c8w0, cls2, null, null);
                    }
                    i++;
                }
                AqS148S0200000_1 aqS148S0200000_1 = new AqS148S0200000_1((LifecycleOwner) c8w0, (LifecycleOwner) LJ, (Class<? extends C2K0>[]) 46);
                if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
                    aqS148S0200000_1.invoke();
                } else {
                    ((Handler) C55097Ljp.LIZ.getValue()).post(new ARunnableS37S0100000_1(aqS148S0200000_1, 130));
                }
            }
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88509YoT.class), String.valueOf(c8w0.hashCode()), new AqS159S0100000_9(c8w0, 33));
    }

    public static final Class<? extends C2K0>[] LJ(Class<?> cls) {
        Class<? extends C2K0>[] clsArr;
        int hashCode = C16880lQ.LJLLILLLL(cls).hashCode();
        Class<? extends C2K0>[] clsArr2 = null;
        switch (hashCode) {
            case -2084430433:
                clsArr = new Class[]{TranslationAbility.class};
                break;
            case -2080771809:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -2066999223:
                clsArr = new Class[]{IFeedCleanAbility.class};
                break;
            case -2006464570:
                clsArr = new Class[]{InteractAreaCommonAbility.class};
                break;
            case -1999968312:
                clsArr = new Class[]{LandscapeFeedViewPagerAbility.class};
                break;
            case -1960079416:
                clsArr = new Class[]{ITopicContentAssemAbility.class};
                break;
            case -1922582110:
                clsArr = new Class[]{CellAdaptionComponentAbility.class};
                break;
            case -1886878656:
                clsArr = new Class[]{HomePageViewPagerAbility.class};
                break;
            case -1880802956:
                clsArr = new Class[]{ITopicEmptyAssemAbility.class};
                break;
            case -1861843569:
                clsArr = new Class[]{NewUserGuideAbility.class};
                break;
            case -1852969323:
                clsArr = new Class[]{IResumePlayPanelComponent.class};
                break;
            case -1814195791:
                clsArr = new Class[]{INearbyLocationPermissionAbility.class};
                break;
            case -1814195790:
                clsArr = new Class[]{INearbyLocationPermissionAbility.class};
                break;
            case -1776808412:
                clsArr = new Class[]{TitleBarTypingAbility.class, TitleBarActivityStatusAbility.class};
                break;
            case -1772173865:
                clsArr = new Class[]{IPipAbility.class};
                break;
            case -1748524114:
                clsArr = new Class[]{MainDialogAbility.class};
                break;
            case -1642354136:
                clsArr = new Class[]{ISearchResultSubPageAbility.class};
                break;
            case -1639033392:
            case -1062226514:
            case -724741748:
            case -532916400:
                clsArr = new Class[0];
                break;
            case -1601666922:
                clsArr = new Class[]{LandscapeEntrancesControlAbility.class};
                break;
            case -1593435209:
                clsArr = new Class[]{IRegionAllListAbility.class};
                break;
            case -1586205630:
                clsArr = new Class[]{MainPageBusinessAbility.class};
                break;
            case -1566241386:
                clsArr = new Class[]{IRegionSearchListAbility.class};
                break;
            case -1546501552:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -1538061030:
                clsArr = new Class[]{ILoginFollowAbility.class};
                break;
            case -1487253110:
                clsArr = new Class[]{IPoiDetailFavoriteBottomVAbility.class};
                break;
            case -1464668470:
                clsArr = new Class[]{CellCleanModeAbility.class};
                break;
            case -1447007687:
                clsArr = new Class[]{IAudioPlayerAbility.class};
                break;
            case -1436849471:
                clsArr = new Class[]{IRefreshAbility.class};
                break;
            case -1429515304:
                clsArr = new Class[]{LandscapeFeedDataLoadLogicAbility.class};
                break;
            case -1424100253:
                clsArr = new Class[]{ICreatorFindBaseAdapterAbility.class};
                break;
            case -1385837402:
                clsArr = new Class[]{ICastingAbility.class};
                break;
            case -1365145854:
                clsArr = new Class[]{BottomTabAbility.class};
                break;
            case -1353435017:
                clsArr = new Class[]{IMFPubAbility.class};
                break;
            case -1347296372:
                clsArr = new Class[]{FeedCollectionProgressBarAbility.class};
                break;
            case -1325671668:
                clsArr = new Class[]{DanmakuEntranceAbility.class};
                break;
            case -1295554795:
                clsArr = new Class[]{IViewPagerComponentAbility.class};
                break;
            case -1239854331:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -1210482499:
                clsArr = new Class[]{ILazyLoadAbility.class};
                break;
            case -1198335649:
                clsArr = new Class[]{IPopularToFYPAssemAbility.class};
                break;
            case -1155025991:
                clsArr = new Class[]{IDanmakuLayoutAbility.class};
                break;
            case -1109711039:
                clsArr = new Class[]{InteractBottomBarAbility.class, BottomBarPriorityAbility.class};
                break;
            case -1091725106:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -1080763274:
                clsArr = new Class[]{ResearchFilterAbility.class};
                break;
            case -1079669701:
                clsArr = new Class[]{IAudioCardUIStateAbility.class};
                break;
            case -1064944410:
                clsArr = new Class[]{IDefaultAutoScrollAbility.class};
                break;
            case -1027908171:
                clsArr = new Class[]{PriorityAbility.class, FeedBottomButtonAbility.class};
                break;
            case -1023616510:
                clsArr = new Class[]{CellStickerComponentAbility.class};
                break;
            case -969019681:
                clsArr = new Class[]{ICellCleanAbility.class};
                break;
            case -957071303:
                clsArr = new Class[]{IClearModePanelComponent.class};
                break;
            case -952416987:
                clsArr = new Class[]{IStemToFYPAssemAbility.class};
                break;
            case -940699097:
                clsArr = new Class[]{IWindowAbility.class};
                break;
            case -938873906:
                clsArr = new Class[]{LandscapeFeedVideoEventDispatcherAbility.class};
                break;
            case -938181955:
                clsArr = new Class[]{ActionBarAbility.class};
                break;
            case -903897408:
                clsArr = new Class[]{IMFFeedAbility.class};
                break;
            case -843677834:
                clsArr = new Class[]{InteractRightMenuMusicCoverAbility.class};
                break;
            case -813508398:
                clsArr = new Class[]{ILiveSingleFeedContentAssemAbility.class};
                break;
            case -801128394:
                clsArr = new Class[]{HighlightSubmitBtnShowAbility.class};
                break;
            case -776150895:
                clsArr = new Class[]{IRepostCheckAssemVAbility.class};
                break;
            case -758392485:
                clsArr = new Class[]{INearbyCategoryTabAbility.class};
                break;
            case -730106502:
                clsArr = new Class[]{IStatusViewAbility.class};
                break;
            case -704114523:
                clsArr = new Class[]{VerticalSearchAbility.class};
                break;
            case -657895917:
                clsArr = new Class[]{ChatRoomMentionPanelAbility.class};
                break;
            case -657856921:
                clsArr = new Class[]{IPoiDetailInfoVAbility.class};
                break;
            case -651728292:
                clsArr = new Class[]{ISearchCLASubtitleAbility.class};
                break;
            case -634426041:
                clsArr = new Class[]{IBottomNoticeAbility.class};
                break;
            case -613851688:
                clsArr = new Class[]{VerticalParamsBuildAbility.class};
                break;
            case -603128225:
                clsArr = new Class[]{IKeyboardIconGroupAssemAbility.class};
                break;
            case -575380629:
                clsArr = new Class[]{FeedMultiAnchorAbility.class};
                break;
            case -571301727:
                clsArr = new Class[]{SystemComponentAbility.class};
                break;
            case -558045427:
                clsArr = new Class[]{IEventDispatchAbility.class};
                break;
            case -557580619:
                clsArr = new Class[]{IDiggComponentAbility.class};
                break;
            case -552670043:
                clsArr = new Class[]{CategoryPriorityAbility.class, InteractVideoTagAbility.class};
                break;
            case -536958110:
                clsArr = new Class[]{IViewPagerAbility.class};
                break;
            case -525337718:
                clsArr = new Class[]{IScreenComponentAbility.class};
                break;
            case -498232269:
                clsArr = new Class[]{IOfflineModeSwitchAbility.class};
                break;
            case -463082571:
                clsArr = new Class[]{IPerformanceAbility.class};
                break;
            case -454580781:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -435311611:
                clsArr = new Class[]{IRepostCheckAssemVAbility.class};
                break;
            case -408720268:
                clsArr = new Class[]{InteractCommonLogicAbility.class};
                break;
            case -355793529:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -354941136:
                clsArr = new Class[]{InteractRightAreaAttachAbility.class};
                break;
            case -335538110:
                clsArr = new Class[]{CustomDotAbilityCommon.class};
                break;
            case -333064377:
                clsArr = new Class[]{LiveInnerFlowAbility.class, VerticalSearchAbility.class};
                break;
            case -307173789:
                clsArr = new Class[]{FeedDefaultAvatarAbility.class};
                break;
            case -299717086:
                clsArr = new Class[]{IScreenComponentAbility.class};
                break;
            case -293865830:
                clsArr = new Class[]{INearbyToFYPAssemAbility.class};
                break;
            case -280139755:
                clsArr = new Class[]{RootCellCommonAbility.class};
                break;
            case -253286463:
                clsArr = new Class[]{QuickDMEntranceAbility.class};
                break;
            case -232259467:
                clsArr = new Class[]{IPopularPopupAssemAbility.class};
                break;
            case -225467196:
                clsArr = new Class[]{InteractInfoAuthorInfoAbility.class};
                break;
            case -65847608:
                clsArr = new Class[]{IPopularContentAssemAbility.class};
                break;
            case -65660815:
                clsArr = new Class[]{HideVideoTagAbility.class, FeedInfoTagAreaContainerAbility.class};
                break;
            case -36030713:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case -35348928:
                clsArr = new Class[]{IMidAdCellAbility.class};
                break;
            case -33205995:
                clsArr = new Class[]{ICategoryListAbility.class};
                break;
            case 13659195:
                clsArr = new Class[]{IStemPopupAssemAbility.class};
                break;
            case 20521696:
                clsArr = new Class[]{INearbyPopupAssemAbility.class};
                break;
            case 20894003:
                clsArr = new Class[]{GiftSelectAbility.class};
                break;
            case 28536651:
                clsArr = new Class[]{ChatRoomPanelAbility.class};
                break;
            case 32987358:
                clsArr = new Class[]{ICommentMentionAssemAbility.class};
                break;
            case 38785294:
                clsArr = new Class[]{IStemContentAssemAbility.class};
                break;
            case 58464934:
                clsArr = new Class[]{DanmakuInputAbility.class};
                break;
            case 137621107:
                clsArr = new Class[]{LandscapeFeedPlayerAbility.class};
                break;
            case 151835381:
                clsArr = new Class[]{MainPageSocialAbility.class};
                break;
            case 156823711:
                clsArr = new Class[]{ICommentGiftPanelAssemVAbility.class};
                break;
            case 184003271:
                clsArr = new Class[]{ILazyLoadAbility.class};
                break;
            case 193499000:
                clsArr = new Class[]{IGameLiveAbility.class};
                break;
            case 212121751:
                clsArr = new Class[]{StoryViewerEntranceBridgeAbility.class};
                break;
            case 218834972:
                clsArr = new Class[]{HomeViewPagerAbility.class};
                break;
            case 225750748:
                clsArr = new Class[]{IRepostCardAssemAbility.class};
                break;
            case 275515162:
                clsArr = new Class[]{VideoShrinkAbility.class};
                break;
            case 339624226:
                clsArr = new Class[]{IKeyboardV2Ability.class};
                break;
            case 392107488:
                clsArr = new Class[]{EdgeSlideGuideAbility.class};
                break;
            case 404242824:
                clsArr = new Class[]{ToolsMainActivityAbility.class};
                break;
            case 412960390:
                clsArr = new Class[]{IPlayerPreloadDataAbility.class};
                break;
            case 425110901:
                clsArr = new Class[]{InteractInfoMusicTitleAbility.class};
                break;
            case 458407657:
                clsArr = new Class[]{HorizontalEmojiAbility.class};
                break;
            case 492536979:
                clsArr = new Class[]{IRepostListAbility.class};
                break;
            case 511311349:
                clsArr = new Class[]{IPlayerComponentAbility.class};
                break;
            case 519253867:
                clsArr = new Class[]{CommerceInteractionAbility.class};
                break;
            case 522518957:
                clsArr = new Class[]{IKeyboardMultiPanelAssemAbility.class};
                break;
            case 546920308:
                clsArr = new Class[]{IScreenComponentAbility.class};
                break;
            case 556042200:
                clsArr = new Class[]{IInteractTitleAbility.class, ICoHostTopicAbility.class};
                break;
            case 560474120:
                clsArr = new Class[]{EdgeSpeedupAbility.class};
                break;
            case 585061642:
                clsArr = new Class[]{MainPageSeekAbility.class};
                break;
            case 591988793:
                clsArr = new Class[]{ISpeedChallengeAbility.class};
                break;
            case 592063305:
                clsArr = new Class[]{FullPageBottomActionBarAbility.class};
                break;
            case 596339295:
                clsArr = new Class[]{ITopicToFYPAssemAbility.class};
                break;
            case 597443451:
                clsArr = new Class[]{CLACaptionAbility.class};
                break;
            case 599607170:
                clsArr = new Class[]{TopWarnAbility.class};
                break;
            case 600816114:
                clsArr = new Class[]{IPhotoModeAbility.class, PauseTimeAbility.class, PanelSingleTapInterceptAbility.class};
                break;
            case 619489396:
                clsArr = new Class[]{IPopularEmptyAssemAbility.class};
                break;
            case 628057954:
                clsArr = new Class[]{DetailFlingGestureAbility.class};
                break;
            case 639308081:
                clsArr = new Class[]{DetailBottomAbility.class};
                break;
            case 681316085:
                clsArr = new Class[]{IScreenComponentAbility.class};
                break;
            case 685268328:
                clsArr = new Class[]{ILinkStateAbility.class};
                break;
            case 688836250:
                clsArr = new Class[]{IMFAbility.class};
                break;
            case 738224167:
                clsArr = new Class[]{IMidAdAbility.class};
                break;
            case 807021212:
                clsArr = new Class[]{IContainerUtilityAbility.class};
                break;
            case 811062830:
                clsArr = new Class[]{MainFragmentBusinessAbility.class};
                break;
            case 817363565:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case 833354337:
                clsArr = new Class[]{IPlayButtonAbility.class};
                break;
            case 833369855:
                clsArr = new Class[]{IKeyboardInputPanelAssemAbility.class};
                break;
            case 864315597:
                clsArr = new Class[]{CellGradualAbility.class};
                break;
            case 865408058:
                clsArr = new Class[]{IStemEmptyAssemAbility.class};
                break;
            case 894927352:
                clsArr = new Class[]{INowKeyboardMultiPanelAssemAbility.class};
                break;
            case 942135068:
                clsArr = new Class[]{IFeedNonPersonalizedAbility.class};
                break;
            case 947703645:
                clsArr = new Class[]{IEarphonePlayerControlComponent.class};
                break;
            case 951587339:
                clsArr = new Class[]{ProfileItemUpdater.class};
                break;
            case 951851899:
                clsArr = new Class[]{PinchAbility.class};
                break;
            case 974785677:
                clsArr = new Class[]{InteractFullScreenAreaAttachAbility.class};
                break;
            case 977066211:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case 980205242:
                clsArr = new Class[]{ISurveyInteractAbility.class};
                break;
            case 1085419212:
                clsArr = new Class[]{IPKCountDownTitleAbility.class};
                break;
            case 1141805551:
                clsArr = new Class[]{com.ss.android.ugc.aweme.ecommerce.mall.customdot.CustomDotAbilityCommon.class};
                break;
            case 1146555714:
                clsArr = new Class[]{FeedCollectionPlayerViewAbility.class};
                break;
            case 1185333358:
                clsArr = new Class[]{IScreenComponentAbility.class};
                break;
            case 1186503363:
                clsArr = new Class[]{VoiceChatMaskAbility.class};
                break;
            case 1193846240:
                clsArr = new Class[]{InteractInfoAreaAttachAbility.class};
                break;
            case 1198116462:
                clsArr = new Class[]{MainBusinessAbility.class};
                break;
            case 1210504465:
                clsArr = new Class[]{IMFSocialAbility.class};
                break;
            case 1251845506:
                clsArr = new Class[]{CellPlayerViewAbility.class};
                break;
            case 1323305407:
                clsArr = new Class[]{ICommodityCardAbility.class};
                break;
            case 1331953419:
                clsArr = new Class[]{ILoadMoreAbility.class};
                break;
            case 1341429479:
                clsArr = new Class[]{IDownloadBarAbility.class};
                break;
            case 1349156193:
                clsArr = new Class[]{IKeyboardCommentEmojiAssemAbility.class};
                break;
            case 1351406748:
                clsArr = new Class[]{IDubbingAbility.class};
                break;
            case 1380356642:
                clsArr = new Class[]{CellSurveyComponentAbility.class};
                break;
            case 1388905970:
                clsArr = new Class[]{VerticalSearchAbility.class};
                break;
            case 1418699269:
                clsArr = new Class[]{TitleBarLeftAbility.class};
                break;
            case 1433540501:
                clsArr = new Class[]{BackRefreshStrategyAbility.class};
                break;
            case 1436224324:
                clsArr = new Class[]{IPinchToClearModePanelComponent.class};
                break;
            case 1446062519:
                clsArr = new Class[]{IMFShopAbility.class};
                break;
            case 1497137163:
                clsArr = new Class[]{InteractInfoMusicTitleAbility.class};
                break;
            case 1515364934:
                clsArr = new Class[]{ICellSpeedActionAbility.class};
                break;
            case 1523959215:
                clsArr = new Class[]{INearbyEmptyAssemAbility.class};
                break;
            case 1546254659:
                clsArr = new Class[]{INearbyContentAssemAbility.class};
                break;
            case 1587058432:
                clsArr = new Class[]{InteractBottomAreaAttachAbility.class};
                break;
            case 1697159141:
                clsArr = new Class[]{SlideAdWebPreloadAbility.class};
                break;
            case 1717947538:
                clsArr = new Class[]{INearbyFeatureNotAvailableAbility.class};
                break;
            case 1725164348:
                clsArr = new Class[]{InteractAreaAttachAbility.class};
                break;
            case 1742725373:
                clsArr = new Class[]{CategoryEntranceAbility.class};
                break;
            case 1800938841:
                clsArr = new Class[]{IMFDialogAbility.class, IMFToolBarAbility.class};
                break;
            case 1840099093:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case 1843013775:
                clsArr = new Class[]{IDetailBottomMusicShootAbility.class};
                break;
            case 1850303521:
                clsArr = new Class[]{IAutoAScrollAbility.class};
                break;
            case 1857838317:
                clsArr = new Class[]{IRootAbility.class};
                break;
            case 1880905513:
                clsArr = new Class[]{VideoDescProviderAbility.class, InteractInfoDescAbility.class, GetRemainingWordCountWithoutHashtagAbility.class};
                break;
            case 1901487814:
                clsArr = new Class[]{INowKeyboardInputPanelAssemAbility.class};
                break;
            case 1919614548:
                clsArr = new Class[]{FeedCollectionViewPagerAbility.class};
                break;
            case 1923048055:
                clsArr = new Class[]{StoryBubbleListAbility.class};
                break;
            case 1930050683:
                clsArr = new Class[]{ISearchSwipeGuideAbility.class};
                break;
            case 1952929869:
                clsArr = new Class[]{ILayoutSwitcherAbility.class};
                break;
            case 1964241512:
                clsArr = new Class[]{NoticeAbility.class};
                break;
            case 1976109200:
                clsArr = new Class[]{IMatchItemAbility.class};
                break;
            case 1996174921:
                clsArr = new Class[]{IPageStateAbility.class};
                break;
            case 2025824735:
                clsArr = new Class[]{InteractBizTopAreaAttachAbility.class};
                break;
            case 2054590914:
                clsArr = new Class[]{SearchResultFragmentAbility.class};
                break;
            case 2092211546:
                clsArr = new Class[]{ChatRoomEditTextAbility.class, ChatRoomMentionInputAbility.class};
                break;
            case 2119969769:
                clsArr = new Class[]{IFakeKeyboardInputAssemAbility.class};
                break;
            case 2126564733:
                clsArr = new Class[]{VerticalSearchAbility.class};
                break;
            case 2133672561:
                clsArr = new Class[]{INearbyCurrentRegionAbility.class};
                break;
            case 2141273201:
                clsArr = new Class[]{IDistributeStateAbility.class};
                break;
        }
        clsArr2 = new Class[clsArr.length];
        for (int i = 0; i < clsArr.length; i++) {
            clsArr2[i] = clsArr[i];
        }
        return clsArr2;
    }

    public static final Class<Object> LJFF(Class<? extends C2K0> cls) {
        switch (C16880lQ.LJLLILLLL(cls).hashCode()) {
            case -2141538595:
            case -2065189638:
            case -2016640377:
            case -1931704516:
            case -1712106744:
            case -1456181304:
            case -1354300871:
            case -1312751005:
            case -1131140269:
            case -1077756689:
            case -1053154726:
            case -666077674:
            case -647875625:
            case -574489147:
            case -556512712:
            case -193890719:
            case -78363505:
            case -49398551:
            case -20851065:
            case -16814679:
            case 136784447:
            case 223331207:
            case 229016414:
            case 280727298:
            case 443726284:
            case 532206958:
            case 614565913:
            case 1138953562:
            case 1215530286:
            case 1229862352:
            case 1244115485:
            case 1248994953:
            case 1479031592:
            case 1493204508:
            case 1649553494:
            case 1804422228:
            case 1903035257:
            case 2048052340:
                return VideoCellScope.class;
            case -2117387148:
            case -962867476:
            case -217498049:
            case 1516453084:
            case 1810706519:
            case 2039799461:
                return FeedCollectionScope.class;
            case -2087593781:
                return FeedNearbyFragmentScope.class;
            case -2054121039:
            case -2002560905:
            case -1878454082:
            case -1637548447:
            case -1501226910:
            case -1351108355:
            case -1222730094:
            case -935865689:
            case -882608657:
            case -874997508:
            case -700243652:
            case -641279993:
            case -556924923:
            case -482206377:
            case -361057552:
            case -310872369:
            case -103993180:
            case 154805478:
            case 391341784:
            case 428147899:
            case 480406480:
            case 616597518:
            case 1142664397:
            case 1353757167:
            case 1953082163:
            case 2058607272:
                return MainActivityScope.class;
            case -2021424687:
            case -1996443098:
            case -1860815867:
            case -1360875123:
            case -1236297514:
            case -998920429:
            case -950925715:
            case -934552109:
            case -827329592:
            case -733131012:
            case -721105229:
            case -292136012:
            case -252390251:
            case -168195021:
            case 150134619:
            case 438363465:
            case 476418352:
            case 519754333:
            case 528344913:
            case 621572173:
            case 861651795:
            case 1143713310:
            case 1191199952:
            case 1431079234:
            case 1570964940:
            case 1883218582:
            case 1889187972:
            case 1969856132:
            case 2129690801:
                return RootPanelScope.class;
            case -2020384924:
            case -1611563263:
            case -1567494017:
            case 802344177:
                return LandscapeFeedScope.class;
            case -1942240631:
            case -1730696938:
            case -1684082298:
            case -1395943517:
            case -1068315276:
            case 10693085:
            case 541901228:
            case 731495615:
            case 749131655:
            case 795746295:
            case 906244472:
            case 1485945235:
            case 1867027516:
                return CommentKeyboardScope.class;
            case -1938039177:
            case -1573931489:
            case -1534603512:
            case 548277498:
            case 1047333186:
            case 1875681240:
                return MainFragmentScope.class;
            case -1809055789:
                return DetailFragmentScope.class;
            case -1715811374:
            case -1715472472:
            case -536348941:
            case 1082365663:
                return StemFeedFragmentScope.class;
            case -1700307391:
            case -1373506092:
            case -1244493789:
            case -1091089431:
            case -771300373:
            case -603997068:
            case 464743730:
            case 1158195468:
            case 1369642310:
                return ChatRoomScope.class;
            case -1672577172:
                return ECSearchPageScope.class;
            case -1669038589:
                return CellInteractAreaScope.class;
            case -1609450420:
                return SearchResultFragmentScope.class;
            case -1368434413:
            case 293667815:
            case 1567676036:
            case 2007555203:
                return LinkMicScope.class;
            case -1351615169:
            case 592606728:
            case 1771730259:
                return TopicFeedFragmentScope.class;
            case -1293470206:
            case -1143000686:
            case -959555912:
            case -902258490:
            case 1841867199:
            case 1856293165:
            case 1917770024:
            case 2012153696:
                return CommonVideoCellScope.class;
            case -1245798836:
            case 482288883:
            case 932331992:
                return SearchVerticalScope.class;
            case -1199155498:
                return InteractTitleScope.class;
            case -1174640001:
            case 1864980331:
            case 1940864862:
            case 1941203764:
                return FeedPopularFragmentScope.class;
            case -1086323985:
            case 2142927800:
                return MatchScope.class;
            case -1056908010:
                return HighlightScope.class;
            case -997701040:
            case 1013447067:
                return PoiDetailScope.class;
            case -972069985:
            case -83257801:
            case 102985896:
            case 1059232495:
                return RootCellScope.class;
            case -928968259:
            case -48221874:
            case 668511829:
            case 1534287719:
            case 1935783682:
                return FragmentScope.class;
            case -892200181:
            case -825782664:
            case 1649727721:
                return MainPageFragmentScope.class;
            case -786191505:
            case 1298294848:
                return NearbyRegionScope.class;
            case -569553815:
            case 474166000:
            case 1915663792:
                return MultiHostScope.class;
            case -430695812:
                return CommentListFragmentScope.class;
            case -145495641:
                return DanmakuKeyboardScope.class;
            case 272856951:
                return SearchFragmentScope.class;
            case 506101717:
                return RepostListScope.class;
            case 786952119:
                return CreatorNoticeTabScope.class;
            case 1141746704:
                return SearchVideoScope.class;
            case 1292524735:
                return PostModeDetailFragmentScope.class;
            case 1506908123:
                return AudioCardScope.class;
            case 1551652967:
                return SearchContainerFragmentScope.class;
            default:
                return null;
        }
    }

    public static final ActivityC45651qj LJIIIIZZ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return C212428Vi.LIZ(c8w0);
    }

    public static final Fragment LJIIIZ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        return C212428Vi.LIZLLL(c8w0);
    }

    public static final void LJIILJJIL(InterfaceC65784Pro interfaceC65784Pro) {
        if (((Boolean) C34656Diu.LJ.getValue()).booleanValue()) {
            return;
        }
        C8K7.LIZ("LogicAssem", interfaceC65784Pro, false);
    }

    public static final InterfaceC55235Lm3 LJIIZILJ(C8W0 c8w0) {
        o.LJIIIZ(c8w0, "<this>");
        String LIZ = C8XR.LIZ(c8w0);
        SZE.LIZ(LIZ, C65352Pkq.LIZ(C88511YoV.class));
        if (C55249LmH.LJ) {
            if (!o.LJ(c8w0.getTree().LIZJ, GScope.LJLIL)) {
                SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ, C55221Llp.LJLIL);
                return c8w0;
            }
            InterfaceC55235Lm3 LIZ2 = C55097Ljp.LIZ(c8w0.getParent());
            if (LIZ2 != null) {
                C55247LmF.LIZ(c8w0, LIZ2);
                SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ, C55222Llq.LJLIL);
                return c8w0;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("can not find parent scope for assem: ");
            LIZ3.append(c8w0.getParent());
            throw new IllegalAccessException(X1D.LIZIZ(LIZ3));
        }
        InterfaceC55235Lm3 hv0 = ((ScopeViewModel) new ViewModelProvider(c8w0).get(ScopeViewModel.class)).hv0("assem_logic_scope", new AqS175S0100000_9(c8w0, 21));
        SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ, C55223Llr.LJLIL);
        return hv0;
    }

    public static final InterfaceC55235Lm3 LJIJ(InterfaceC55100Ljs interfaceC55100Ljs) {
        InterfaceC55235Lm3 hv0;
        o.LJIIIZ(interfaceC55100Ljs, "<this>");
        String LIZ = C8XR.LIZ(interfaceC55100Ljs);
        SZE.LIZ(LIZ, C65352Pkq.LIZ(C88511YoV.class));
        ScopeViewModel scopeViewModel = (ScopeViewModel) new ViewModelProvider(interfaceC55100Ljs.getViewModelStoreOwner()).get(ScopeViewModel.class);
        if (C214368bA.LJIIJ) {
            hv0 = scopeViewModel.hv0("assem_logic_scope", new AqS175S0100000_9(interfaceC55100Ljs, 19));
            InterfaceC55235Lm3 parentScope = interfaceC55100Ljs.getParentScope();
            if (parentScope != null) {
                C55247LmF.LIZ(hv0, parentScope);
            }
        } else {
            hv0 = scopeViewModel.hv0("assem_logic_scope", new AqS175S0100000_9(interfaceC55100Ljs, 20));
        }
        SZE.LIZIZ(C65352Pkq.LIZ(C88511YoV.class), LIZ, C55220Llo.LJLIL);
        return hv0;
    }

    public static final <T extends C2K0> T LIZIZ(InterfaceC55235Lm3 scope, Class<? extends T> cls) {
        InterfaceC80653En interfaceC80653En;
        InterfaceC55102Lju interfaceC55102Lju;
        C2K0 c2k0;
        C55101Ljt c55101Ljt;
        InterfaceC55102Lju interfaceC55102Lju2;
        C55101Ljt c55101Ljt2;
        o.LJIIIZ(scope, "scope");
        Object obj = null;
        try {
            T t = (T) LIZ(scope, cls, null);
            o.LJI(t);
            return t;
        } catch (Throwable th) {
            String LJII = LJII(cls, null);
            if (LJII == null) {
                LJII = "source_default_key";
            }
            InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(scope, C55101Ljt.class, LJII);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is source null? > ");
            LIZ.append(LIZLLL);
            LIZ.append(" >>>> is source.value null? > ");
            if (LIZLLL != null) {
                interfaceC80653En = LIZLLL.getSource();
            } else {
                interfaceC80653En = null;
            }
            LIZ.append(interfaceC80653En);
            LIZ.append(" >>>> is source.ability null? > ");
            if (LIZLLL != null && (c55101Ljt2 = (C55101Ljt) LIZLLL.getSource()) != null) {
                interfaceC55102Lju = c55101Ljt2.LJLIL;
            } else {
                interfaceC55102Lju = null;
            }
            LIZ.append(interfaceC55102Lju);
            LIZ.append(" >>>> is can not provide ability? > ");
            if (LIZLLL != null && (c55101Ljt = (C55101Ljt) LIZLLL.getSource()) != null && (interfaceC55102Lju2 = c55101Ljt.LJLIL) != null) {
                c2k0 = interfaceC55102Lju2.provideAbility(C16880lQ.LJLLILLLL(cls));
            } else {
                c2k0 = null;
            }
            LIZ.append(c2k0);
            LIZ.append(" >>>> current activity is ");
            Object host = scope.getHost();
            if (!(host instanceof ActivityC45651qj)) {
                if (!(host instanceof Fragment)) {
                    if (host instanceof View) {
                        Context context = ((View) host).getContext();
                        if (context instanceof ActivityC45651qj) {
                            obj = context;
                        }
                    } else if (host instanceof C8W0) {
                        obj = LJIIIIZZ((C8W0) host);
                    }
                } else {
                    obj = ((Fragment) host).mo49getActivity();
                }
            } else {
                obj = host;
            }
            LIZ.append(obj);
            String LIZIZ = X1D.LIZIZ(LIZ);
            LJIILJJIL(new AqS64S1200000_9(scope, cls, LIZIZ, 0));
            throw new Exception(LIZIZ, th);
        }
    }

    public static final InterfaceC55235Lm3 LJI(LifecycleOwner lifecycleOwner, Class cls) {
        if (o.LJ(cls, GScope.class)) {
            return GScope.LJLIL;
        }
        for (Object obj = lifecycleOwner; obj != null; obj = C55097Ljp.LIZJ(obj)) {
            for (Class<?> cls2 = obj.getClass(); cls2 != null; cls2 = cls2.getSuperclass()) {
                if (o.LJ(C55097Ljp.LIZIZ(cls2), cls)) {
                    return C55097Ljp.LIZ(obj);
                }
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("can not find scope define for lifecycleOwner! ");
        LIZ.append(lifecycleOwner);
        throw new IllegalAccessException(X1D.LIZIZ(LIZ));
    }

    public static final String LJII(Class<? extends C2K0> clazz, String str) {
        o.LJIIIZ(clazz, "clazz");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ability-tag-");
        LIZ.append(clazz.getName());
        if (str == null) {
            str = "";
        }
        LIZ.append(str);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (r1 != null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a6  */
    /* JADX WARN: Type inference failed for: r1v15, types: [X.2K0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends X.C2K0> T LIZ(X.InterfaceC55235Lm3 r6, java.lang.Class<? extends T> r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.Class<X.YoU> r0 = X.C88510YoU.class
            X.Prg r2 = X.C65352Pkq.LIZ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            int r0 = r6.hashCode()
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.SZE.LIZ(r0, r2)
            java.lang.String r5 = LJII(r7, r8)
            if (r5 != 0) goto Lf3
            java.lang.String r1 = "source_default_key"
        L30:
            java.lang.Class<X.Ljt> r0 = X.C55101Ljt.class
            X.LmJ r0 = X.C55247LmF.LIZLLL(r6, r0, r1)
            r4 = 0
            if (r0 == 0) goto L45
            X.3En r0 = r0.getSource()
            X.Ljt r0 = (X.C55101Ljt) r0
            if (r0 == 0) goto L45
            X.Lju r1 = r0.LJLIL
            if (r1 != 0) goto L9a
        L45:
            boolean r0 = X.C55103Ljv.LIZ
            if (r0 == 0) goto Lf1
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, java.util.concurrent.CopyOnWriteArrayList<X.LDj>> r0 = X.C53897LDh.LIZ
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf1
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L69:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L53
            java.lang.Object r0 = r1.next()
            X.LDj r0 = (X.C53899LDj) r0
            java.lang.Class<? extends X.2K0> r0 = r0.LIZ
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L69
            java.lang.Object r0 = r6.getHost()
        L81:
            if (r0 == 0) goto Ldf
            X.LDj r3 = X.C53897LDh.LIZ(r7, r0)
            if (r3 == 0) goto Lda
            X.Lm3 r2 = X.C55097Ljp.LIZ(r0)
            if (r2 == 0) goto Lda
            X.Lju r1 = r3.LIZIZ
            androidx.lifecycle.LifecycleOwner r0 = r3.LIZJ
            LJIIJ(r2, r1, r7, r8, r0)
            X.Lju r1 = r3.LIZIZ
        L98:
            if (r1 == 0) goto Lf1
        L9a:
            java.lang.String r0 = X.C16880lQ.LJLLILLLL(r7)
            X.2K0 r1 = r1.provideAbility(r0)
        La2:
            boolean r0 = r1 instanceof X.C2K0
            if (r0 == 0) goto La7
            r4 = r1
        La7:
            java.lang.Class<X.YoU> r0 = X.C88510YoU.class
            X.Prg r3 = X.C65352Pkq.LIZ(r0)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            int r0 = r6.hashCode()
            r1.append(r0)
            java.lang.Thread r0 = X.C16880lQ.LLLLIIIILLL()
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r2 = X.X1D.LIZIZ(r1)
            kotlin.jvm.internal.AqS98S0300000_9 r1 = new kotlin.jvm.internal.AqS98S0300000_9
            r0 = 0
            r1.<init>(r7, r4, r6, r0)
            X.SZE.LIZIZ(r3, r2, r1)
            kotlin.jvm.internal.AqS56S1200000_1 r1 = new kotlin.jvm.internal.AqS56S1200000_1
            r0 = 0
            r1.<init>(r4, r7, r5, r0)
            LJIILJJIL(r1)
            return r4
        Lda:
            java.lang.Object r0 = X.C55097Ljp.LIZJ(r0)
            goto L81
        Ldf:
            com.bytedance.provider.impl.GScope r3 = com.bytedance.provider.impl.GScope.LJLIL
            X.LDj r2 = X.C53897LDh.LIZ(r7, r3)
            if (r2 == 0) goto Lf1
            X.Lju r1 = r2.LIZIZ
            androidx.lifecycle.LifecycleOwner r0 = r2.LIZJ
            LJIIJ(r3, r1, r7, r8, r0)
            X.Lju r1 = r2.LIZIZ
            goto L98
        Lf1:
            r1 = r4
            goto La2
        Lf3:
            r1 = r5
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55096Ljo.LIZ(X.Lm3, java.lang.Class, java.lang.String):X.2K0");
    }

    public static final void LIZLLL(LifecycleOwner lifecycleOwner, InterfaceC55235Lm3 interfaceC55235Lm3, Class<? extends C2K0> cls) {
        AqS90S0300000_1 aqS90S0300000_1 = new AqS90S0300000_1(lifecycleOwner, (LifecycleOwner) interfaceC55235Lm3, (InterfaceC55235Lm3) cls, (Class<? extends C2K0>) 0);
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            aqS90S0300000_1.invoke();
        } else {
            ((Handler) C55097Ljp.LIZ.getValue()).post(new ARunnableS37S0100000_1(aqS90S0300000_1, 14));
        }
    }

    public static final void LJIILL(InterfaceC55235Lm3 scope, Class<? extends C2K0> clazz, String str) {
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(clazz, "clazz");
        LJIILJJIL(new AqS156S0200000_9(scope, (InterfaceC55235Lm3) clazz, (Class<? extends C2K0>) 2));
        String LJII = LJII(clazz, str);
        if (LJII == null) {
            LJII = "source_default_key";
        }
        C55247LmF.LJ(scope, C55101Ljt.class, LJII);
    }

    public static void LJIILLIIL(LifecycleOwner lifecycleOwner, Class cls, Class clazz) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(clazz, "clazz");
        InterfaceC55235Lm3 LJI = LJI(lifecycleOwner, cls);
        if (LJI != null) {
            LJIILL(LJI, clazz, null);
        }
    }

    public static final void LJIIJJI(InterfaceC55235Lm3 scope, C2K0 ability, Class<? extends C2K0> clazz, String str) {
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(ability, "ability");
        o.LJIIIZ(clazz, "clazz");
        LJIIL(scope, ability, clazz, str, null);
    }

    public static void LJIILIIL(LifecycleOwner lifecycleOwner, Class cls, C2K0 ability, Class clazz) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(ability, "ability");
        o.LJIIIZ(clazz, "clazz");
        InterfaceC55235Lm3 LJI = LJI(lifecycleOwner, cls);
        if (LJI != null) {
            LJIIL(LJI, ability, clazz, null, null);
        }
    }

    public static final void LJIIJ(InterfaceC55235Lm3 scope, InterfaceC55102Lju abilityContainer, Class<? extends C2K0> cls, String str, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(abilityContainer, "abilityContainer");
        LJIILJJIL(new AqS98S0300000_9(scope, (InterfaceC55235Lm3) abilityContainer, (InterfaceC55102Lju) cls, (Class<? extends C2K0>) 1));
        C55101Ljt c55101Ljt = new C55101Ljt(abilityContainer);
        String LJII = LJII(cls, str);
        if (LJII == null) {
            LJII = "source_default_key";
        }
        C55247LmF.LIZIZ(scope, c55101Ljt, C55101Ljt.class, LJII);
        if (lifecycleOwner != null) {
            LIZLLL(lifecycleOwner, scope, cls);
        }
    }

    public static final void LJIIL(InterfaceC55235Lm3 scope, C2K0 ability, Class<? extends C2K0> clazz, String str, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(scope, "scope");
        o.LJIIIZ(ability, "ability");
        o.LJIIIZ(clazz, "clazz");
        C55098Ljq c55098Ljq = new C55098Ljq(clazz, ability);
        LJIILJJIL(new AqS156S0200000_9(scope, (InterfaceC55235Lm3) clazz, (Class<? extends C2K0>) 1));
        C55101Ljt c55101Ljt = new C55101Ljt(c55098Ljq);
        String LJII = LJII(clazz, str);
        if (LJII == null) {
            LJII = "source_default_key";
        }
        C55247LmF.LIZIZ(scope, c55101Ljt, C55101Ljt.class, LJII);
        if (lifecycleOwner != null) {
            LIZLLL(lifecycleOwner, scope, clazz);
        }
    }
}
