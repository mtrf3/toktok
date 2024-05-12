package com.bytedance.android.live.service.initializer;

import X.C89455Z8x;
import X.CN2;
import X.InterfaceC06390Mx;
import com.bytedance.android.live.CommentService;
import com.bytedance.android.live.SlotService;
import com.bytedance.android.live.ai.impl.pitaya.LiveClientAIServiceImpl;
import com.bytedance.android.live.ai.impl.trigger.LiveTriggerServiceImpl;
import com.bytedance.android.live.banner.BannerService;
import com.bytedance.android.live.effect.EffectService;
import com.bytedance.android.live.iap.service.IapServiceClass;
import com.bytedance.android.live.linkmock.api.LinkMockDummyService;
import com.bytedance.android.live.liveinteract.linkroom.InteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.service.MultiGuestV3InternalServiceImplV2;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostMultiAdapterImpl;
import com.bytedance.android.live.liveinteract.multihost.core.service.MultiHostService;
import com.bytedance.android.live.liveinteract.multihost.event.LiveHostCrossRoomEventHelper;
import com.bytedance.android.live.livepullstream.PullStreamService;
import com.bytedance.android.live.publicscreen.impl.PublicScreenService;
import com.bytedance.android.live.slot.util.BcToggleToggleService;
import com.bytedance.android.live.wallet.WalletService;
import com.bytedance.android.live.wallet.service.feedback.FeedBackService;
import com.bytedance.android.live.walletnew.ui.LocationService;
import com.bytedance.android.livesdk.BarrageServiceImpl;
import com.bytedance.android.livesdk.GiftServiceKt;
import com.bytedance.android.livesdk.MessageService;
import com.bytedance.android.livesdk.actionhandler.ActionHandlerService;
import com.bytedance.android.livesdk.adminsetting.AdminSettingService;
import com.bytedance.android.livesdk.broadcast.BroadcastService;
import com.bytedance.android.livesdk.browser.pb.HybridPBService;
import com.bytedance.android.livesdk.comp.impl.debug.DebugService;
import com.bytedance.android.livesdk.comp.impl.game.GamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.GameService;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.GameLinkMicService;
import com.bytedance.android.livesdk.comp.impl.image.ImageService;
import com.bytedance.android.livesdk.comp.impl.linkcore.LinkCoreService;
import com.bytedance.android.livesdk.comp.impl.linkcore.impl.LinkMicService;
import com.bytedance.android.livesdk.comp.impl.logger.service.LoggerService;
import com.bytedance.android.livesdk.comp.impl.network.NetworkService;
import com.bytedance.android.livesdk.definition.DefinitionService;
import com.bytedance.android.livesdk.feed.tab.FeedUrlService;
import com.bytedance.android.livesdk.function.RoomFunctionService;
import com.bytedance.android.livesdk.game.GameTopicService;
import com.bytedance.android.livesdk.giftlimitnotification.GiftReminderService;
import com.bytedance.android.livesdk.hashtag.HashTagService;
import com.bytedance.android.livesdk.hotword.HotWordGiftServiceImpl;
import com.bytedance.android.livesdk.impl.DecorationService;
import com.bytedance.android.livesdk.impl.revenue.goodybag.GoodyBagService;
import com.bytedance.android.livesdk.impl.revenue.level.UserLevelService;
import com.bytedance.android.livesdk.impl.revenue.starcomment.StarCommentService;
import com.bytedance.android.livesdk.impl.revenue.subscription.SubscribeService;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.TreasureBoxService;
import com.bytedance.android.livesdk.layer.LayerService;
import com.bytedance.android.livesdk.liveevent.LiveEventService;
import com.bytedance.android.livesdk.lynx.LiveLynxService;
import com.bytedance.android.livesdk.microom.MicRoomService;
import com.bytedance.android.livesdk.moderator.ModeratorService;
import com.bytedance.android.livesdk.module.BrowserService;
import com.bytedance.android.livesdk.module.ContainerService;
import com.bytedance.android.livesdk.module.HostJsbRegisterService;
import com.bytedance.android.livesdk.module.HybridContainerService;
import com.bytedance.android.livesdk.module.HybridPerformanceService;
import com.bytedance.android.livesdk.module.HybridPropsService;
import com.bytedance.android.livesdk.module.LiveSparkService;
import com.bytedance.android.livesdk.player.LiveGiftDelegatePlayerService;
import com.bytedance.android.livesdk.programmedlive.ProgrammedLiveService;
import com.bytedance.android.livesdk.qa.QAService;
import com.bytedance.android.livesdk.rank.impl.RankService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.FansClubService;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.service.UserLevelBackService;
import com.bytedance.android.livesdk.share.ShareService;
import com.bytedance.android.livesdk.shorttouch.service.ShortTouchService;
import com.bytedance.android.livesdk.survey.SurveyService;
import com.bytedance.android.livesdk.toolbar.ToolbarService;
import com.bytedance.android.livesdk.unityanimation.service.UnityAnimationService;
import com.bytedance.android.livesdk.usercard.UserCardService;
import com.bytedance.android.livesdk.userinfowidget.UserInfoWidgetService;
import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.android.livesdk.watch.DisplayOptService;
import com.bytedance.android.livesdk.watch.WatchLiveService;
import com.bytedance.gift.render.engine.alphaplayer.player.LiveGiftPlayerService;

/* loaded from: classes17.dex */
public final class ServiceInitializerV2 implements CN2 {
    public static final C89455Z8x Companion = new C89455Z8x();

    public static final void preloadServiceClasses() {
        Companion.getClass();
    }

    @Override // X.CN2
    public <T extends InterfaceC06390Mx> T getService(Class<T> cls) {
        T t = null;
        if (cls == null) {
            return null;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2137365871:
                if (name.equals("com.bytedance.android.live.publicscreen.api.IPublicScreenService")) {
                    t = new PublicScreenService();
                    t.onInit();
                    break;
                }
                break;
            case -2056659612:
                if (name.equals("com.bytedance.android.live.browser.IContainerService")) {
                    t = new ContainerService();
                    t.onInit();
                    break;
                }
                break;
            case -2042858237:
                if (name.equals("com.bytedance.android.live.liveinteract.api.IInteractService")) {
                    t = new InteractService();
                    t.onInit();
                    break;
                }
                break;
            case -2041697179:
                if (name.equals("com.bytedance.android.live.adminsetting.IAdminSettingService")) {
                    t = new AdminSettingService();
                    t.onInit();
                    break;
                }
                break;
            case -1977219700:
                if (name.equals("com.bytedance.android.live.ICommentService")) {
                    t = new CommentService();
                    t.onInit();
                    break;
                }
                break;
            case -1731872943:
                if (name.equals("com.bytedance.android.live.browser.IHostJsbRegisterService")) {
                    t = new HostJsbRegisterService();
                    t.onInit();
                    break;
                }
                break;
            case -1691614868:
                if (name.equals("com.bytedance.android.live.gift.IHotWordGiftService")) {
                    t = new HotWordGiftServiceImpl();
                    t.onInit();
                    break;
                }
                break;
            case -1577955761:
                if (name.equals("com.bytedance.android.livesdk.IBarrageService")) {
                    t = new BarrageServiceImpl();
                    t.onInit();
                    break;
                }
                break;
            case -1503633465:
                if (name.equals("com.bytedance.android.live.qa.IQAService")) {
                    t = new QAService();
                    t.onInit();
                    break;
                }
                break;
            case -1496755203:
                if (name.equals("com.bytedance.android.live.share.IShareService")) {
                    t = new ShareService();
                    t.onInit();
                    break;
                }
                break;
            case -1489696699:
                if (name.equals("com.bytedance.android.live.livepullstream.api.IPullStreamService")) {
                    t = new PullStreamService();
                    t.onInit();
                    break;
                }
                break;
            case -1444067634:
                if (name.equals("com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService")) {
                    t = new FansClubService();
                    t.onInit();
                    break;
                }
                break;
            case -1420508877:
                if (name.equals("com.bytedance.android.live.linkmock.api.ILinkMockService")) {
                    t = new LinkMockDummyService();
                    t.onInit();
                    break;
                }
                break;
            case -1333247939:
                if (name.equals("com.bytedance.android.live.layer.ILayerService")) {
                    t = new LayerService();
                    t.onInit();
                    break;
                }
                break;
            case -1319467599:
                if (name.equals("com.bytedance.android.live.browser.IHybridPropsService")) {
                    t = new HybridPropsService();
                    t.onInit();
                    break;
                }
                break;
            case -1294589114:
                if (name.equals("com.bytedance.android.livesdk.api.revenue.level.IUserLevelService")) {
                    t = new UserLevelService();
                    t.onInit();
                    break;
                }
                break;
            case -1217176201:
                if (name.equals("com.bytedance.android.livesdk.survey.ISurveyService")) {
                    t = new SurveyService();
                    t.onInit();
                    break;
                }
                break;
            case -1208382324:
                if (name.equals("com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService")) {
                    t = new LinkMicService();
                    t.onInit();
                    break;
                }
                break;
            case -1090203801:
                if (name.equals("com.bytedance.android.live.decoration.IDecorationService")) {
                    t = new DecorationService();
                    t.onInit();
                    break;
                }
                break;
            case -1085054755:
                if (name.equals("com.bytedance.android.live.browser.IBrowserService")) {
                    t = new BrowserService();
                    t.onInit();
                    break;
                }
                break;
            case -1014450718:
                if (name.equals("com.bytedance.android.live.wallet.service.IFeedbackService")) {
                    t = new FeedBackService();
                    t.onInit();
                    break;
                }
                break;
            case -912030868:
                if (name.equals("com.bytedance.android.livesdk.comp.api.image.IImageService")) {
                    t = new ImageService();
                    t.onInit();
                    break;
                }
                break;
            case -901057871:
                if (name.equals("com.bytedance.android.live.usercard.IUserCardService")) {
                    t = new UserCardService();
                    t.onInit();
                    break;
                }
                break;
            case -814062086:
                if (name.equals("com.bytedance.android.live.shorttouch.service.IShortTouchService")) {
                    t = new ShortTouchService();
                    t.onInit();
                    break;
                }
                break;
            case -782508215:
                if (name.equals("com.bytedance.android.livesdk.watch.IDisplayOptService")) {
                    t = new DisplayOptService();
                    t.onInit();
                    break;
                }
                break;
            case -765000549:
                if (name.equals("com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService")) {
                    t = new GamePartnershipService();
                    t.onInit();
                    break;
                }
                break;
            case -717169093:
                if (name.equals("com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService")) {
                    t = new TreasureBoxService();
                    t.onInit();
                    break;
                }
                break;
            case -701204159:
                if (name.equals("com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2")) {
                    t = new MultiGuestV3InternalServiceImplV2();
                    t.onInit();
                    break;
                }
                break;
            case -680338966:
                if (name.equals("com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService")) {
                    t = new GameLinkMicService();
                    t.onInit();
                    break;
                }
                break;
            case -647391402:
                if (name.equals("com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter")) {
                    t = new MultiHostMultiAdapterImpl();
                    t.onInit();
                    break;
                }
                break;
            case -621025411:
                if (name.equals("com.bytedance.android.live.toolbar.IToolbarService")) {
                    t = new ToolbarService();
                    t.onInit();
                    break;
                }
                break;
            case -597485285:
                if (name.equals("com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService")) {
                    t = new MultiHostService();
                    t.onInit();
                    break;
                }
                break;
            case -502416332:
                if (name.equals("com.bytedance.android.live.slot.IBcToggleService")) {
                    t = new BcToggleToggleService();
                    t.onInit();
                    break;
                }
                break;
            case -406393116:
                if (name.equals("com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService")) {
                    t = new LinkCoreService();
                    t.onInit();
                    break;
                }
                break;
            case -392139571:
                if (name.equals("com.bytedance.android.live.userinfowidget.IUserInfoWidgetService")) {
                    t = new UserInfoWidgetService();
                    t.onInit();
                    break;
                }
                break;
            case -347166443:
                if (name.equals("com.bytedance.android.live.wallet.IWalletService")) {
                    t = new WalletService();
                    t.onInit();
                    break;
                }
                break;
            case -345441817:
                if (name.equals("com.bytedance.android.livesdk.rank.api.IRankService")) {
                    t = new RankService();
                    t.onInit();
                    break;
                }
                break;
            case -338144899:
                if (name.equals("com.bytedance.android.live.liveevent.ILiveEventService")) {
                    t = new LiveEventService();
                    t.onInit();
                    break;
                }
                break;
            case -287951747:
                if (name.equals("com.bytedance.android.live.hashtag.IHashTagService")) {
                    t = new HashTagService();
                    t.onInit();
                    break;
                }
                break;
            case -251433793:
                if (name.equals("com.bytedance.android.live.programmedlive.IProgrammedLiveService")) {
                    t = new ProgrammedLiveService();
                    t.onInit();
                    break;
                }
                break;
            case -246957811:
                if (name.equals("com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService")) {
                    t = new GoodyBagService();
                    t.onInit();
                    break;
                }
                break;
            case -242890091:
                if (name.equals("com.bytedance.android.live.ai.api.trigger.ILiveTriggerService")) {
                    t = new LiveTriggerServiceImpl();
                    t.onInit();
                    break;
                }
                break;
            case -200230529:
                if (name.equals("com.bytedance.android.live.wallet.api.ILocationPickerService")) {
                    t = new LocationService();
                    t.onInit();
                    break;
                }
                break;
            case -168708369:
                if (name.equals("com.bytedance.android.live.banner.IBannerService")) {
                    t = new BannerService();
                    t.onInit();
                    break;
                }
                break;
            case -79448421:
                if (name.equals("com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService")) {
                    t = new StarCommentService();
                    t.onInit();
                    break;
                }
                break;
            case -51507572:
                if (name.equals("com.bytedance.android.livesdk.comp.api.network.INetworkService")) {
                    t = new NetworkService();
                    t.onInit();
                    break;
                }
                break;
            case -49207875:
                if (name.equals("com.bytedance.android.live.moderator.IModeratorService")) {
                    t = new ModeratorService();
                    t.onInit();
                    break;
                }
                break;
            case -47941786:
                if (name.equals("com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService")) {
                    t = new UserLevelBackService();
                    t.onInit();
                    break;
                }
                break;
            case -38706537:
                if (name.equals("com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper")) {
                    t = new LiveHostCrossRoomEventHelper();
                    t.onInit();
                    break;
                }
                break;
            case 49224920:
                if (name.equals("com.bytedance.android.live.game.IGameTopicService")) {
                    t = new GameTopicService();
                    t.onInit();
                    break;
                }
                break;
            case 89750903:
                if (name.equals("com.bytedance.android.live.browser.IHybridPBService")) {
                    t = new HybridPBService();
                    t.onInit();
                    break;
                }
                break;
            case 131715256:
                if (name.equals("com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService")) {
                    t = new SubscribeService();
                    t.onInit();
                    break;
                }
                break;
            case 188808971:
                if (name.equals("com.bytedance.android.live.slot.ISlotService")) {
                    t = new SlotService();
                    t.onInit();
                    break;
                }
                break;
            case 222015868:
                if (name.equals("com.bytedance.android.live.function.IRoomFunctionService")) {
                    t = new RoomFunctionService();
                    t.onInit();
                    break;
                }
                break;
            case 222784108:
                if (name.equals("com.bytedance.android.livesdk.comp.api.debug.IDebugService")) {
                    t = new DebugService();
                    t.onInit();
                    break;
                }
                break;
            case 278319023:
                if (name.equals("com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService")) {
                    t = new LoggerService();
                    t.onInit();
                    break;
                }
                break;
            case 332936610:
                if (name.equals("com.bytedance.android.live.unityanimation.service.IUnityAnimationService")) {
                    t = new UnityAnimationService();
                    t.onInit();
                    break;
                }
                break;
            case 436026473:
                if (name.equals("com.bytedance.android.live.broadcast.api.IBroadcastService")) {
                    t = new BroadcastService();
                    t.onInit();
                    break;
                }
                break;
            case 623816303:
                if (name.equals("com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter")) {
                    t = new MultiHostCrossAdapterImpl();
                    t.onInit();
                    break;
                }
                break;
            case 639478705:
                if (name.equals("com.bytedance.android.livesdk.lynx.ILiveLynxService")) {
                    t = new LiveLynxService();
                    t.onInit();
                    break;
                }
                break;
            case 972953077:
                if (name.equals("com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService")) {
                    t = new LiveGiftDelegatePlayerService();
                    t.onInit();
                    break;
                }
                break;
            case 974829255:
                if (name.equals("com.bytedance.android.live.usermanage.IUserManageService")) {
                    t = new UserManageService();
                    t.onInit();
                    break;
                }
                break;
            case 1339127680:
                if (name.equals("com.bytedance.android.live.browser.IHybridContainerService")) {
                    t = new HybridContainerService();
                    t.onInit();
                    break;
                }
                break;
            case 1443202177:
                if (name.equals("com.bytedance.android.message.IMessageService")) {
                    t = new MessageService();
                    t.onInit();
                    break;
                }
                break;
            case 1499150525:
                if (name.equals("com.bytedance.android.live.actionhandler.IActionHandlerService")) {
                    t = new ActionHandlerService();
                    t.onInit();
                    break;
                }
                break;
            case 1556585108:
                if (name.equals("com.bytedance.android.live.browser.ILiveSparkService")) {
                    t = new LiveSparkService();
                    t.onInit();
                    break;
                }
                break;
            case 1562666709:
                if (name.equals("com.bytedance.android.live.gift.IGiftReminderService")) {
                    t = new GiftReminderService();
                    t.onInit();
                    break;
                }
                break;
            case 1573926781:
                if (name.equals("com.bytedance.android.live.microom.IMicRoomService")) {
                    t = new MicRoomService();
                    t.onInit();
                    break;
                }
                break;
            case 1654394353:
                if (name.equals("com.bytedance.android.live.browser.IHybridPerformanceService")) {
                    t = new HybridPerformanceService();
                    t.onInit();
                    break;
                }
                break;
            case 1689676596:
                if (name.equals("com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService")) {
                    t = new LiveGiftPlayerService();
                    t.onInit();
                    break;
                }
                break;
            case 1694778207:
                if (name.equals("com.bytedance.android.live.iap.service.IapService")) {
                    t = new IapServiceClass();
                    t.onInit();
                    break;
                }
                break;
            case 1731425131:
                if (name.equals("com.bytedance.android.livesdk.comp.api.game.service.IGameService")) {
                    t = new GameService();
                    t.onInit();
                    break;
                }
                break;
            case 1742841255:
                if (name.equals("com.bytedance.android.live.gift.IGiftService")) {
                    t = new GiftServiceKt();
                    t.onInit();
                    break;
                }
                break;
            case 1929345305:
                if (name.equals("com.bytedance.android.feed.api.ILiveFeedApiService")) {
                    t = new FeedUrlService();
                    t.onInit();
                    break;
                }
                break;
            case 1963714529:
                if (name.equals("com.bytedance.android.live.definition.IDefinitionService")) {
                    t = new DefinitionService();
                    t.onInit();
                    break;
                }
                break;
            case 1972069077:
                if (name.equals("com.bytedance.android.livesdk.watch.IWatchLiveService")) {
                    t = new WatchLiveService();
                    t.onInit();
                    break;
                }
                break;
            case 2038755430:
                if (name.equals("com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService")) {
                    t = new LiveClientAIServiceImpl();
                    t.onInit();
                    break;
                }
                break;
            case 2141253945:
                if (name.equals("com.bytedance.android.live.effect.api.IEffectService")) {
                    t = new EffectService();
                    t.onInit();
                    break;
                }
                break;
        }
        return t;
    }
}
