package com.bytedance.android.live.gift;

import X.AbstractC32474Coo;
import X.C06070Lr;
import X.C15860jm;
import X.C15940ju;
import X.C29428Bgm;
import X.C2U;
import X.C76800UCe;
import X.C77446UaQ;
import X.C78126UlO;
import X.CCK;
import X.CML;
import X.CN1;
import X.CYO;
import X.EnumC31118CJe;
import X.EnumC31997Ch7;
import X.InterfaceC15850jl;
import X.InterfaceC28903BVz;
import X.InterfaceC32013ChN;
import X.InterfaceC32073CiL;
import X.InterfaceC32103Cip;
import X.InterfaceC32308Cm8;
import X.InterfaceC32416Cns;
import X.InterfaceC32497CpB;
import X.InterfaceC65784Pro;
import X.VNU;
import X.Z8D;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.gift.model.SendGiftResult;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.GiftSuspension;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.lynx.tasm.behavior.ui.LynxUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class GiftService implements IGiftService {
    public static final GiftService LJLILLLLZI = new GiftService();
    public final /* synthetic */ IGiftService LJLIL = (IGiftService) CN1.LIZ(IGiftService.class);

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void cancelSyncGiftList(long j) {
        this.LJLIL.cancelSyncGiftList(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearAssetModels() {
        this.LJLIL.clearAssetModels();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearAssets(String str) {
        this.LJLIL.clearAssets(str);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearFastGift(long j) {
        this.LJLIL.clearFastGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void clearGiftMap() {
        this.LJLIL.clearGiftMap();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final CML createGiftDebugService(Context context, DataChannel dataChannel) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(dataChannel, "dataChannel");
        return this.LJLIL.createGiftDebugService(context, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC15850jl createGiftFeedEffectPlayViewManager() {
        return this.LJLIL.createGiftFeedEffectPlayViewManager();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void destroyGiftBannedManager() {
        this.LJLIL.destroyGiftBannedManager();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void downloadAssets(long j, InterfaceC32416Cns interfaceC32416Cns, int i) {
        this.LJLIL.downloadAssets(j, interfaceC32416Cns, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enablePlatformPortal() {
        return this.LJLIL.enablePlatformPortal();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enablePortal() {
        return this.LJLIL.enablePortal();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean enableRedEnvelope() {
        return this.LJLIL.enableRedEnvelope();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void exitRoom(boolean z, Room room) {
        this.LJLIL.exitRoom(z, room);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift findClosetGift(int i) {
        return this.LJLIL.findClosetGift(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Gift findGiftById(long j) {
        return this.LJLIL.findGiftById(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final View generateCPCTopView(Context context, InterfaceC65784Pro<C76800UCe> onCompleted) {
        o.LJIIIZ(onCompleted, "onCompleted");
        return this.LJLIL.generateCPCTopView(context, onCompleted);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getAmountString(long j) {
        return this.LJLIL.getAmountString(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final AssetsModel getAssets(String str, long j) {
        return this.LJLIL.getAssets(str, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getAssetsPath(String str, long j) {
        return this.LJLIL.getAssetsPath(str, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final CYO getBoostChartInfo() {
        return this.LJLIL.getBoostChartInfo();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final long getEffectIdWithGiftId(Gift gift, long j) {
        return this.LJLIL.getEffectIdWithGiftId(gift, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getExtendScreenGiftTrayWidget() {
        return this.LJLIL.getExtendScreenGiftTrayWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C2U getFirstRechargeManager() {
        return this.LJLIL.getFirstRechargeManager();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final long getFirstSubscribeGiftId() {
        return this.LJLIL.getFirstSubscribeGiftId();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC32073CiL getGiftInterceptor(long j, boolean z) {
        return this.LJLIL.getGiftInterceptor(j, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftMessage getGiftMessage(long j, SendGiftResult sendGiftResult, User user) {
        return this.LJLIL.getGiftMessage(j, sendGiftResult, user);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final List<GiftPage> getGiftPages() {
        return this.LJLIL.getGiftPages();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final GiftSuspension getGiftSuspensionData(DataChannel dataChannel) {
        return this.LJLIL.getGiftSuspensionData(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveWidget getGiftWidget(EnterRoomConfig enterRoomConfig, RecyclableWidgetManager recyclableWidgetManager) {
        return this.LJLIL.getGiftWidget(enterRoomConfig, recyclableWidgetManager);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getGiftWidget() {
        return this.LJLIL.getGiftWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getLiveGiftTrayWidgetV2Class() {
        return this.LJLIL.getLiveGiftTrayWidgetV2Class();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getLowAgeReportUrl() {
        return this.LJLIL.getLowAgeReportUrl();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LynxUI<?> getLynxAudioLiveView(VNU context) {
        o.LJIIIZ(context, "context");
        return this.LJLIL.getLynxAudioLiveView(context);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveWidget getPinCardWidget() {
        return this.LJLIL.getPinCardWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final CCK getPollGifts() {
        return this.LJLIL.getPollGifts();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final LiveRecyclableWidget getRedEnvelopeWidget() {
        return this.LJLIL.getRedEnvelopeWidget();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Class<? extends LiveRecyclableWidget> getRedEnvelopeWidgetClass() {
        return this.LJLIL.getRedEnvelopeWidgetClass();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final String getRoomStatus() {
        return this.LJLIL.getRoomStatus();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final C78126UlO getSendGiftResultLog(SendGiftResult sendGiftResult) {
        return this.LJLIL.getSendGiftResultLog(sendGiftResult);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final Pair<Integer, Integer> getShowedAndUnShowedGuestGiftCount() {
        return this.LJLIL.getShowedAndUnShowedGuestGiftCount();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final List<Gift> getStickerGifts() {
        return this.LJLIL.getStickerGifts();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final int getTargetGiftDiamondCount(long j) {
        return this.LJLIL.getTargetGiftDiamondCount(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final long giftVideoResourcesClear(boolean z) {
        return this.LJLIL.giftVideoResourcesClear(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean hasFirstRechargeGift() {
        return this.LJLIL.hasFirstRechargeGift();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initGiftBannedManager(Room room, DataChannel dataChannel, boolean z) {
        this.LJLIL.initGiftBannedManager(room, dataChannel, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initGiftResource() {
        this.LJLIL.initGiftResource();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initGiftResourceManager(Context context) {
        this.LJLIL.initGiftResourceManager(context);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void initPublicScreenConfiguration() {
        this.LJLIL.initPublicScreenConfiguration();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isAssetsDownloaded(String str, long j) {
        return this.LJLIL.isAssetsDownloaded(str, j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isFansCLubGiftLimited(DataChannel dataChannel) {
        return this.LJLIL.isFansCLubGiftLimited(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isFirstRecharge() {
        return this.LJLIL.isFirstRecharge();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isFirstRechargeGift(long j) {
        return this.LJLIL.isFirstRechargeGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isGiftSuspended(DataChannel dataChannel) {
        return this.LJLIL.isGiftSuspended(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isGiftingAvailable(DataChannel dataChannel) {
        return this.LJLIL.isGiftingAvailable(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isGuestMatchAnchorGiftTrayEnable() {
        return this.LJLIL.isGuestMatchAnchorGiftTrayEnable();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isNewsAccount(DataChannel dataChannel) {
        return this.LJLIL.isNewsAccount(dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean isSubscriptionGift(long j) {
        return this.LJLIL.isSubscriptionGift(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void loadBehavior(Context context, DataChannel dataChannel, int i) {
        this.LJLIL.loadBehavior(context, dataChannel, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void logBoostCardLiveEndClick(int i) {
        this.LJLIL.logBoostCardLiveEndClick(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void logBoostCardLiveEndShow() {
        this.LJLIL.logBoostCardLiveEndShow();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void monitorBroadcastClicked(long j) {
        this.LJLIL.monitorBroadcastClicked(j);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void monitorBroadcastMonitor(long j, boolean z) {
        this.LJLIL.monitorBroadcastMonitor(j, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void monitorGiftIconShow(boolean z, EnumC31118CJe reason, String userType, String iconShowPosition, int i) {
        o.LJIIIZ(reason, "reason");
        o.LJIIIZ(userType, "userType");
        o.LJIIIZ(iconShowPosition, "iconShowPosition");
        this.LJLIL.monitorGiftIconShow(z, reason, userType, iconShowPosition, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void notifyUserLeaveRoom() {
        this.LJLIL.notifyUserLeaveRoom();
    }

    @Override // com.bytedance.android.live.gift.IGiftService, X.InterfaceC06390Mx
    public final /* bridge */ /* synthetic */ void onInit() {
        C15860jm.LIZ(this);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onLiveActivityDestroyed() {
        this.LJLIL.onLiveActivityDestroyed();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onLiveBroadcastActivityDestroyed() {
        this.LJLIL.onLiveBroadcastActivityDestroyed();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onLocaleChanged(Locale locale) {
        this.LJLIL.onLocaleChanged(locale);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onPlayFragmentCreate() {
        this.LJLIL.onPlayFragmentCreate();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void onSeiUpdate(Object obj) {
        this.LJLIL.onSeiUpdate(obj);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialog(String str) {
        this.LJLIL.openGiftDialog(str);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialog(String str, C06070Lr c06070Lr) {
        this.LJLIL.openGiftDialog(str, c06070Lr);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openGiftDialogFromJSB(C29428Bgm c29428Bgm) {
        this.LJLIL.openGiftDialogFromJSB(c29428Bgm);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void openRechargeFAQPage(Context context) {
        this.LJLIL.openRechargeFAQPage(context);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void playGiftVideo(long j, InterfaceC32308Cm8 interfaceC32308Cm8) {
        this.LJLIL.playGiftVideo(j, null);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void preloadBroadcastApi() {
        this.LJLIL.preloadBroadcastApi();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void preloadLayout() {
        this.LJLIL.preloadLayout();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void preloadRoomEffects() {
        this.LJLIL.preloadRoomEffects();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final InterfaceC28903BVz provideInteractionView(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        return this.LJLIL.provideInteractionView(lifecycleOwner);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void removeAnimationEngine(EnumC31997Ch7 giftType) {
        o.LJIIIZ(giftType, "giftType");
        this.LJLIL.removeAnimationEngine(giftType);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void removeEffectPreloadCallback() {
        this.LJLIL.removeEffectPreloadCallback();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void resetPinCardStatus() {
        this.LJLIL.resetPinCardStatus();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void resetRoomStatus() {
        this.LJLIL.resetRoomStatus();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendFansClubJoinGift(DataChannel dataChannel, InterfaceC32497CpB interfaceC32497CpB, String str) {
        this.LJLIL.sendFansClubJoinGift(dataChannel, interfaceC32497CpB, str);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftForBecomeGuest(long j, Room room, DataChannel dataChannel) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL.sendGiftForBecomeGuest(j, room, dataChannel);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftInternal(Context context, C15940ju params) {
        o.LJIIIZ(params, "params");
        this.LJLIL.sendGiftInternal(context, params);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void sendGiftPoll(long j, long j2, Room room, DataChannel dataChannel, Z8D z8d) {
        o.LJIIIZ(room, "room");
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LJLIL.sendGiftPoll(j, j2, room, dataChannel, z8d);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void setGiftAnimationEngine(EnumC31997Ch7 enumC31997Ch7, InterfaceC32103Cip interfaceC32103Cip) {
        this.LJLIL.setGiftAnimationEngine(enumC31997Ch7, interfaceC32103Cip);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void setShowGiftEducationGift(boolean z) {
        this.LJLIL.setShowGiftEducationGift(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean shouldShowCPCMessageFromService() {
        return this.LJLIL.shouldShowCPCMessageFromService();
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final boolean shouldShowPostRechargeRetentionSheet(C77446UaQ event, long j, int i) {
        o.LJIIIZ(event, "event");
        return this.LJLIL.shouldShowPostRechargeRetentionSheet(event, j, i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void showBroadCaseEndPage(boolean z) {
        this.LJLIL.showBroadCaseEndPage(z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void showGiftBannedPopup(Context context, boolean z) {
        o.LJIIIZ(context, "context");
        this.LJLIL.showGiftBannedPopup(context, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void syncAssetList(int i, ArrayList<Long> arrayList, InterfaceC32013ChN interfaceC32013ChN) {
        this.LJLIL.syncAssetList(i, arrayList, interfaceC32013ChN);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void syncGiftList(int i) {
        this.LJLIL.syncGiftList(i);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void syncGiftList(AbstractC32474Coo abstractC32474Coo, long j, int i, boolean z) {
        this.LJLIL.syncGiftList(abstractC32474Coo, j, i, z);
    }

    @Override // com.bytedance.android.live.gift.IGiftService
    public final void toggleGiftBehavior(Context context, DataChannel dataChannel, boolean z) {
        this.LJLIL.toggleGiftBehavior(context, dataChannel, z);
    }
}
