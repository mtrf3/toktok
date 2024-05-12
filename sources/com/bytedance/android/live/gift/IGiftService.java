package com.bytedance.android.live.gift;

import X.AbstractC32474Coo;
import X.C06070Lr;
import X.C15940ju;
import X.C29428Bgm;
import X.C2U;
import X.C76800UCe;
import X.C77446UaQ;
import X.C78126UlO;
import X.CCK;
import X.CML;
import X.CYO;
import X.EnumC31118CJe;
import X.EnumC31997Ch7;
import X.InterfaceC06390Mx;
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

/* loaded from: classes.dex */
public interface IGiftService extends InterfaceC06390Mx {
    void cancelSyncGiftList(long j);

    void clearAssetModels();

    void clearAssets(String str);

    void clearFastGift(long j);

    void clearGiftMap();

    CML createGiftDebugService(Context context, DataChannel dataChannel);

    InterfaceC15850jl createGiftFeedEffectPlayViewManager();

    void destroyGiftBannedManager();

    void downloadAssets(long j, InterfaceC32416Cns interfaceC32416Cns, int i);

    boolean enablePlatformPortal();

    boolean enablePortal();

    boolean enableRedEnvelope();

    void exitRoom(boolean z, Room room);

    Gift findClosetGift(int i);

    Gift findGiftById(long j);

    View generateCPCTopView(Context context, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    String getAmountString(long j);

    AssetsModel getAssets(String str, long j);

    String getAssetsPath(String str, long j);

    CYO getBoostChartInfo();

    long getEffectIdWithGiftId(Gift gift, long j);

    Class<? extends LiveRecyclableWidget> getExtendScreenGiftTrayWidget();

    C2U getFirstRechargeManager();

    long getFirstSubscribeGiftId();

    InterfaceC32073CiL getGiftInterceptor(long j, boolean z);

    GiftMessage getGiftMessage(long j, SendGiftResult sendGiftResult, User user);

    List<GiftPage> getGiftPages();

    GiftSuspension getGiftSuspensionData(DataChannel dataChannel);

    LiveWidget getGiftWidget(EnterRoomConfig enterRoomConfig, RecyclableWidgetManager recyclableWidgetManager);

    Class<? extends LiveRecyclableWidget> getGiftWidget();

    Class<? extends LiveRecyclableWidget> getLiveGiftTrayWidgetV2Class();

    String getLowAgeReportUrl();

    LynxUI<?> getLynxAudioLiveView(VNU vnu);

    LiveWidget getPinCardWidget();

    CCK getPollGifts();

    LiveRecyclableWidget getRedEnvelopeWidget();

    Class<? extends LiveRecyclableWidget> getRedEnvelopeWidgetClass();

    String getRoomStatus();

    C78126UlO getSendGiftResultLog(SendGiftResult sendGiftResult);

    Pair<Integer, Integer> getShowedAndUnShowedGuestGiftCount();

    List<Gift> getStickerGifts();

    int getTargetGiftDiamondCount(long j);

    long giftVideoResourcesClear(boolean z);

    boolean hasFirstRechargeGift();

    void initGiftBannedManager(Room room, DataChannel dataChannel, boolean z);

    void initGiftResource();

    void initGiftResourceManager(Context context);

    void initPublicScreenConfiguration();

    boolean isAssetsDownloaded(String str, long j);

    boolean isFansCLubGiftLimited(DataChannel dataChannel);

    boolean isFirstRecharge();

    boolean isFirstRechargeGift(long j);

    boolean isGiftSuspended(DataChannel dataChannel);

    boolean isGiftingAvailable(DataChannel dataChannel);

    boolean isGuestMatchAnchorGiftTrayEnable();

    boolean isNewsAccount(DataChannel dataChannel);

    boolean isSubscriptionGift(long j);

    void loadBehavior(Context context, DataChannel dataChannel, int i);

    void logBoostCardLiveEndClick(int i);

    void logBoostCardLiveEndShow();

    void monitorBroadcastClicked(long j);

    void monitorBroadcastMonitor(long j, boolean z);

    void monitorGiftIconShow(boolean z, EnumC31118CJe enumC31118CJe, String str, String str2, int i);

    void notifyUserLeaveRoom();

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void onLiveActivityDestroyed();

    void onLiveBroadcastActivityDestroyed();

    void onLocaleChanged(Locale locale);

    void onPlayFragmentCreate();

    void onSeiUpdate(Object obj);

    void openGiftDialog(String str);

    void openGiftDialog(String str, C06070Lr c06070Lr);

    void openGiftDialogFromJSB(C29428Bgm c29428Bgm);

    void openRechargeFAQPage(Context context);

    void playGiftVideo(long j, InterfaceC32308Cm8 interfaceC32308Cm8);

    void preloadBroadcastApi();

    void preloadLayout();

    void preloadRoomEffects();

    InterfaceC28903BVz provideInteractionView(LifecycleOwner lifecycleOwner);

    void removeAnimationEngine(EnumC31997Ch7 enumC31997Ch7);

    void removeEffectPreloadCallback();

    void resetPinCardStatus();

    void resetRoomStatus();

    void sendFansClubJoinGift(DataChannel dataChannel, InterfaceC32497CpB interfaceC32497CpB, String str);

    void sendGiftForBecomeGuest(long j, Room room, DataChannel dataChannel);

    void sendGiftInternal(Context context, C15940ju c15940ju);

    void sendGiftPoll(long j, long j2, Room room, DataChannel dataChannel, Z8D z8d);

    void setGiftAnimationEngine(EnumC31997Ch7 enumC31997Ch7, InterfaceC32103Cip interfaceC32103Cip);

    void setShowGiftEducationGift(boolean z);

    boolean shouldShowCPCMessageFromService();

    boolean shouldShowPostRechargeRetentionSheet(C77446UaQ c77446UaQ, long j, int i);

    void showBroadCaseEndPage(boolean z);

    void showGiftBannedPopup(Context context, boolean z);

    void syncAssetList(int i, ArrayList<Long> arrayList, InterfaceC32013ChN interfaceC32013ChN);

    void syncGiftList(int i);

    void syncGiftList(AbstractC32474Coo abstractC32474Coo, long j, int i, boolean z);

    void toggleGiftBehavior(Context context, DataChannel dataChannel, boolean z);
}
