package com.bytedance.android.live.service.initializer;

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
import com.bytedance.android.livesdk.automationtest.GiftTestService;
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
import com.bytedance.android.livesdk.comp.impl.subscription.SubscriptionService;
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
import kotlin.jvm.internal.o;

/* loaded from: classes17.dex */
public final class ServiceInitializer implements CN2 {
    @Override // X.CN2
    public <T extends InterfaceC06390Mx> T getService(Class<T> cls) {
        if (cls == null) {
            return null;
        }
        if (o.LJ("com.bytedance.android.live.wallet.api.ILocationPickerService", cls.getName())) {
            return new LocationService();
        }
        if (o.LJ("com.bytedance.android.live.userinfowidget.IUserInfoWidgetService", cls.getName())) {
            return new UserInfoWidgetService();
        }
        if (o.LJ("com.bytedance.android.live.browser.IHybridPBService", cls.getName())) {
            return new HybridPBService();
        }
        if (o.LJ("com.bytedance.android.live.definition.IDefinitionService", cls.getName())) {
            return new DefinitionService();
        }
        if (o.LJ("com.bytedance.android.message.IMessageService", cls.getName())) {
            MessageService messageService = new MessageService();
            messageService.onInit();
            return messageService;
        }
        if (o.LJ("com.bytedance.android.livesdk.watch.IWatchLiveService", cls.getName())) {
            return new WatchLiveService();
        }
        if (o.LJ("com.bytedance.android.live.effect.api.IEffectService", cls.getName())) {
            EffectService effectService = new EffectService();
            effectService.onInit();
            return effectService;
        }
        if (o.LJ("com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService", cls.getName())) {
            return new TreasureBoxService();
        }
        if (o.LJ("com.bytedance.android.live.livepullstream.api.IPullStreamService", cls.getName())) {
            PullStreamService pullStreamService = new PullStreamService();
            pullStreamService.onInit();
            return pullStreamService;
        }
        if (o.LJ("com.bytedance.android.live.publicscreen.api.IPublicScreenService", cls.getName())) {
            return new PublicScreenService();
        }
        if (o.LJ("com.bytedance.android.live.qa.IQAService", cls.getName())) {
            QAService qAService = new QAService();
            qAService.onInit();
            return qAService;
        }
        if (o.LJ("com.bytedance.android.livesdk.api.revenue.level.IUserLevelService", cls.getName())) {
            return new UserLevelService();
        }
        if (o.LJ("com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostCrossAdapter", cls.getName())) {
            return new MultiHostCrossAdapterImpl();
        }
        if (o.LJ("com.bytedance.android.live.actionhandler.IActionHandlerService", cls.getName())) {
            ActionHandlerService actionHandlerService = new ActionHandlerService();
            actionHandlerService.onInit();
            return actionHandlerService;
        }
        if (o.LJ("com.bytedance.android.live.banner.IBannerService", cls.getName())) {
            return new BannerService();
        }
        if (o.LJ("com.bytedance.android.live.browser.IHybridPerformanceService", cls.getName())) {
            return new HybridPerformanceService();
        }
        if (o.LJ("com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService", cls.getName())) {
            return new FansClubService();
        }
        if (o.LJ("com.bytedance.android.live.decoration.IDecorationService", cls.getName())) {
            return new DecorationService();
        }
        if (o.LJ("com.bytedance.android.live.liveinteract.multihost.core.adapter.IMultiHostMultiAdapter", cls.getName())) {
            return new MultiHostMultiAdapterImpl();
        }
        if (o.LJ("com.bytedance.android.live.usercard.IUserCardService", cls.getName())) {
            return new UserCardService();
        }
        if (o.LJ("com.bytedance.android.live.browser.IContainerService", cls.getName())) {
            return new ContainerService();
        }
        if (o.LJ("com.bytedance.android.live.liveevent.ILiveEventService", cls.getName())) {
            return new LiveEventService();
        }
        if (o.LJ("com.bytedance.android.live.wallet.service.IFeedbackService", cls.getName())) {
            FeedBackService feedBackService = new FeedBackService();
            feedBackService.onInit();
            return feedBackService;
        }
        if (o.LJ("com.bytedance.android.live.ai.api.trigger.ILiveTriggerService", cls.getName())) {
            return new LiveTriggerServiceImpl();
        }
        if (o.LJ("com.bytedance.android.live.browser.IHostJsbRegisterService", cls.getName())) {
            return new HostJsbRegisterService();
        }
        if (o.LJ("com.bytedance.android.live.shorttouch.service.IShortTouchService", cls.getName())) {
            return new ShortTouchService();
        }
        if (o.LJ("com.bytedance.android.live.hashtag.IHashTagService", cls.getName())) {
            return new HashTagService();
        }
        if (o.LJ("com.bytedance.android.live.gift.ILiveGiftDelegatePlayerService", cls.getName())) {
            LiveGiftDelegatePlayerService liveGiftDelegatePlayerService = new LiveGiftDelegatePlayerService();
            liveGiftDelegatePlayerService.onInit();
            return liveGiftDelegatePlayerService;
        }
        if (o.LJ("com.bytedance.android.live.gift.IGiftService", cls.getName())) {
            GiftServiceKt giftServiceKt = new GiftServiceKt();
            giftServiceKt.onInit();
            return giftServiceKt;
        }
        if (o.LJ("com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService", cls.getName())) {
            return new MultiHostService();
        }
        if (o.LJ("com.bytedance.android.livesdkapi.host.ILiveHostCrossRoomEventHelper", cls.getName())) {
            LiveHostCrossRoomEventHelper liveHostCrossRoomEventHelper = new LiveHostCrossRoomEventHelper();
            liveHostCrossRoomEventHelper.onInit();
            return liveHostCrossRoomEventHelper;
        }
        if (o.LJ("com.bytedance.android.live.ai.api.pitaya.ILiveClientAIService", cls.getName())) {
            return new LiveClientAIServiceImpl();
        }
        if (o.LJ("com.bytedance.android.live.browser.IHybridContainerService", cls.getName())) {
            return new HybridContainerService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.game.linkmic.IGameLinkMicService", cls.getName())) {
            return new GameLinkMicService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.image.IImageService", cls.getName())) {
            return new ImageService();
        }
        if (o.LJ("com.bytedance.android.live.moderator.IModeratorService", cls.getName())) {
            return new ModeratorService();
        }
        if (o.LJ("com.bytedance.android.live.usermanage.IUserManageService", cls.getName())) {
            return new UserManageService();
        }
        if (o.LJ("com.bytedance.android.live.gift.IHotWordGiftService", cls.getName())) {
            HotWordGiftServiceImpl hotWordGiftServiceImpl = new HotWordGiftServiceImpl();
            hotWordGiftServiceImpl.onInit();
            return hotWordGiftServiceImpl;
        }
        if (o.LJ("com.bytedance.android.live.programmedlive.IProgrammedLiveService", cls.getName())) {
            return new ProgrammedLiveService();
        }
        if (o.LJ("com.bytedance.android.live.wallet.IWalletService", cls.getName())) {
            WalletService walletService = new WalletService();
            walletService.onInit();
            return walletService;
        }
        if (o.LJ("com.bytedance.android.livesdk.watch.IDisplayOptService", cls.getName())) {
            return new DisplayOptService();
        }
        if (o.LJ("com.bytedance.android.live.function.IRoomFunctionService", cls.getName())) {
            RoomFunctionService roomFunctionService = new RoomFunctionService();
            roomFunctionService.onInit();
            return roomFunctionService;
        }
        if (o.LJ("com.bytedance.android.live.unityanimation.service.IUnityAnimationService", cls.getName())) {
            return new UnityAnimationService();
        }
        if (o.LJ("com.bytedance.android.live.broadcast.api.IBroadcastService", cls.getName())) {
            BroadcastService broadcastService = new BroadcastService();
            broadcastService.onInit();
            return broadcastService;
        }
        if (o.LJ("com.bytedance.android.livesdk.lynx.ILiveLynxService", cls.getName())) {
            return new LiveLynxService();
        }
        if (o.LJ("com.bytedance.android.live.layer.ILayerService", cls.getName())) {
            return new LayerService();
        }
        if (o.LJ("com.bytedance.android.live.browser.ILiveSparkService", cls.getName())) {
            return new LiveSparkService();
        }
        if (o.LJ("com.bytedance.android.live.toolbar.IToolbarService", cls.getName())) {
            return new ToolbarService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService", cls.getName())) {
            return new LoggerService();
        }
        if (o.LJ("com.bytedance.android.livesdk.revenue.level.api.service.IUserLevelBackService", cls.getName())) {
            return new UserLevelBackService();
        }
        if (o.LJ("com.bytedance.android.live.liveinteract.api.IInteractService", cls.getName())) {
            InteractService interactService = new InteractService();
            interactService.onInit();
            return interactService;
        }
        if (o.LJ("com.bytedance.android.live.gift.IGiftTestService", cls.getName())) {
            return new GiftTestService();
        }
        if (o.LJ("com.bytedance.android.live.share.IShareService", cls.getName())) {
            return new ShareService();
        }
        if (o.LJ("com.bytedance.android.live.browser.IBrowserService", cls.getName())) {
            return new BrowserService();
        }
        if (o.LJ("com.bytedance.android.live.slot.IBcToggleService", cls.getName())) {
            return new BcToggleToggleService();
        }
        if (o.LJ("com.bytedance.android.live.microom.IMicRoomService", cls.getName())) {
            return new MicRoomService();
        }
        if (o.LJ("com.bytedance.android.livesdk.api.revenue.goodybag.IGoodyBagService", cls.getName())) {
            return new GoodyBagService();
        }
        if (o.LJ("com.bytedance.android.live.browser.IHybridPropsService", cls.getName())) {
            return new HybridPropsService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.linkcore.ILinkCoreService", cls.getName())) {
            return new LinkCoreService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.network.INetworkService", cls.getName())) {
            return new NetworkService();
        }
        if (o.LJ("com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2", cls.getName())) {
            return new MultiGuestV3InternalServiceImplV2();
        }
        if (o.LJ("com.bytedance.android.live.slot.ISlotService", cls.getName())) {
            SlotService slotService = new SlotService();
            slotService.onInit();
            return slotService;
        }
        if (o.LJ("com.bytedance.android.live.game.IGameTopicService", cls.getName())) {
            return new GameTopicService();
        }
        if (o.LJ("com.bytedance.android.live.gift.IGiftReminderService", cls.getName())) {
            return new GiftReminderService();
        }
        if (o.LJ("com.bytedance.android.livesdk.survey.ISurveyService", cls.getName())) {
            return new SurveyService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.subscription.ISubscriptionService", cls.getName())) {
            return new SubscriptionService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService", cls.getName())) {
            return new LinkMicService();
        }
        if (o.LJ("com.bytedance.android.live.ICommentService", cls.getName())) {
            return new CommentService();
        }
        if (o.LJ("com.bytedance.android.live.adminsetting.IAdminSettingService", cls.getName())) {
            return new AdminSettingService();
        }
        if (o.LJ("com.bytedance.android.feed.api.ILiveFeedApiService", cls.getName())) {
            return new FeedUrlService();
        }
        if (o.LJ("com.bytedance.android.livesdk.IBarrageService", cls.getName())) {
            return new BarrageServiceImpl();
        }
        if (o.LJ("com.bytedance.android.live.iap.service.IapService", cls.getName())) {
            return new IapServiceClass();
        }
        if (o.LJ("com.bytedance.android.livesdk.api.revenue.starcomment.IStarCommentService", cls.getName())) {
            return new StarCommentService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService", cls.getName())) {
            return new GamePartnershipService();
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.game.service.IGameService", cls.getName())) {
            GameService gameService = new GameService();
            gameService.onInit();
            return gameService;
        }
        if (o.LJ("com.bytedance.android.livesdk.comp.api.debug.IDebugService", cls.getName())) {
            return new DebugService();
        }
        if (o.LJ("com.bytedance.android.livesdk.rank.api.IRankService", cls.getName())) {
            return new RankService();
        }
        if (o.LJ("com.bytedance.gift.render.engine.alphaplayer.api.ILiveGiftPlayerService", cls.getName())) {
            LiveGiftPlayerService liveGiftPlayerService = new LiveGiftPlayerService();
            liveGiftPlayerService.onInit();
            return liveGiftPlayerService;
        }
        if (o.LJ("com.bytedance.android.livesdk.api.revenue.subscription.ISubscribeService", cls.getName())) {
            SubscribeService subscribeService = new SubscribeService();
            subscribeService.onInit();
            return subscribeService;
        }
        if (!o.LJ("com.bytedance.android.live.linkmock.api.ILinkMockService", cls.getName())) {
            return null;
        }
        LinkMockDummyService linkMockDummyService = new LinkMockDummyService();
        linkMockDummyService.onInit();
        return linkMockDummyService;
    }
}
