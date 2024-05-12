package com.bytedance.android.live.broadcast.api;

import X.AbstractBinderC30512ByG;
import X.AbstractC12520eO;
import X.AbstractC73672Svk;
import X.BBC;
import X.BEF;
import X.BHJ;
import X.BUT;
import X.BZI;
import X.C10U;
import X.C10W;
import X.C10X;
import X.C11000bw;
import X.C14090gv;
import X.C1VE;
import X.C24130x7;
import X.C28467BFf;
import X.C29180Bcm;
import X.C2M;
import X.C30553Byv;
import X.C76800UCe;
import X.EnumC12540eQ;
import X.InterfaceC05250In;
import X.InterfaceC06390Mx;
import X.InterfaceC10980bu;
import X.InterfaceC12560eS;
import X.InterfaceC12570eT;
import X.InterfaceC12590eV;
import X.InterfaceC12610eX;
import X.InterfaceC12620eY;
import X.InterfaceC12630eZ;
import X.InterfaceC12640ea;
import X.InterfaceC12650eb;
import X.InterfaceC12670ed;
import X.InterfaceC12690ef;
import X.InterfaceC15310it;
import X.InterfaceC15320iu;
import X.InterfaceC15330iv;
import X.InterfaceC15340iw;
import X.InterfaceC17140lq;
import X.InterfaceC17150lr;
import X.InterfaceC17160ls;
import X.InterfaceC21020s6;
import X.InterfaceC28921BWr;
import X.InterfaceC29074Bb4;
import X.InterfaceC30043Bqh;
import X.InterfaceC30045Bqj;
import X.InterfaceC30046Bqk;
import X.InterfaceC30105Brh;
import X.InterfaceC30152BsS;
import X.InterfaceC30302Bus;
import X.InterfaceC30359Bvn;
import X.InterfaceC30519ByN;
import X.InterfaceC74605TPt;
import X.InterfaceC86149XrV;
import X.InterfaceC88472Yns;
import X.UB9;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayDeleteResponse;
import com.bytedance.android.livesdk.chatroom.model.AnchorReplayInfoResponse;
import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.widget.Widget;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tikcast.api.anchor.AnchorLiveFragmentEditResponse;
import tikcast.api.anchor.AnchorLiveFragmentInfoResponse;
import tikcast.api.anchor.AnchorLiveReplayFrameResponse;
import tikcast.api.anchor.CancelAutoDownloadResponse;
import tikcast.api.anchor.ScheduleAutoDownloadResponse;

/* loaded from: classes.dex */
public interface IBroadcastService extends InterfaceC06390Mx {
    void addBroadcastLifecycle(InterfaceC12670ed interfaceC12670ed);

    void addDisplaySourceOption(long j, InterfaceC17150lr interfaceC17150lr);

    void addOnExtendedScreenRegistryReadyListener(InterfaceC15320iu interfaceC15320iu);

    AbstractC73672Svk<CancelAutoDownloadResponse> cancelLiveReplayAutoDownload(long j);

    AbstractC73672Svk<AnchorReplayInfoResponse> checkScheduledLiveReplayVideoTask(boolean z, Long l);

    void clearPreviewImageInfo();

    AbstractC73672Svk<AnchorLiveFragmentEditResponse> clipOrSaveLiveReplayFragment(long j, long j2, long j3, int i);

    AbstractBinderC30512ByG createBgBroadcastBinder();

    void createCloseRoomHelper(Room room, Context context, DataChannel dataChannel, Fragment fragment, C10W c10w);

    InterfaceC30152BsS createCommonInteractionFunctionHelper(Context context, BaseFragment baseFragment, InterfaceC30105Brh interfaceC30105Brh, View view, RecyclableWidgetManager recyclableWidgetManager);

    InterfaceC74605TPt createLinkMicPreviewView(Context context, C24130x7 c24130x7, DataChannel dataChannel, Object obj);

    InterfaceC74605TPt createLinkMicPreviewViewV2(Context context, C24130x7 c24130x7, DataChannel dataChannel, Object obj);

    InterfaceC74605TPt createLinkVideoView(Context context, C24130x7 c24130x7, InterfaceC17140lq interfaceC17140lq, DataChannel dataChannel);

    InterfaceC30043Bqh createLiveBroadcastEndFragment(Bundle bundle);

    BBC createLiveBroadcastEndSafetyToolsFragment(Bundle bundle);

    InterfaceC30302Bus createLiveBroadcastFragment(C2M c2m, Bundle bundle);

    LiveWidget createLiveCenterEntranceWidget();

    InterfaceC30045Bqj createLiveCoverCameraFragment();

    C10U createLiveIllegalHelper(Room room, Context context, DataChannel dataChannel, C10W c10w);

    InterfaceC21020s6 createLiveStream(C14090gv c14090gv);

    InterfaceC12640ea createLongPressHelper(Room room, Fragment fragment, View view, Context context, DataChannel dataChannel);

    InterfaceC17160ls createMonitorReport();

    LiveRecyclableWidget createNetSpeedMonitorWidget(boolean z);

    InterfaceC86149XrV createObsBroadcastFragment(C2M c2m, Bundle bundle);

    void createPauseLiveHelper(DataChannel dataChannel, InterfaceC21020s6 interfaceC21020s6, C11000bw c11000bw);

    Widget createPauseLiveWidget(View view);

    InterfaceC30046Bqk createStartLiveFragment(InterfaceC29074Bb4 interfaceC29074Bb4);

    InterfaceC10980bu createStatusReporter(Room room);

    InterfaceC15340iw createStreamLogger();

    InterfaceC15330iv createStreamUploader();

    InterfaceC15330iv createStreamUploader(String str);

    C10X createSyncGiftHelper(Room room);

    LiveDialogFragment createTryModeEducationDialogFragment(String str, View.OnClickListener onClickListener);

    InterfaceC74605TPt createVirtualVideoView(Context context, C24130x7 c24130x7, String str, String str2);

    InterfaceC86149XrV createVoiceChatBroadcastFragment(C2M c2m, Bundle bundle);

    UB9 createVoiceChatVideoClientFactory();

    AbstractC73672Svk<AnchorReplayDeleteResponse> deleteLiveReplayAutoDownload(long j);

    EnumC12540eQ disableFunctionAccordingLevel(DataChannel dataChannel, InterfaceC88472Yns<AnchorLevelPermission, EnumC12540eQ> interfaceC88472Yns, InterfaceC88472Yns<EnumC12540eQ, C76800UCe> interfaceC88472Yns2, InterfaceC88472Yns<BZI, BZI> interfaceC88472Yns3, String str, Boolean bool);

    Activity getBroadcastActivity();

    AbstractC12520eO getBroadcastGestureDetector(DataChannel dataChannel);

    InterfaceC12570eT getBroadcastPreviewService();

    String getBroadcastScene();

    Map<String, String> getBroadcastTag();

    String getConnectionType();

    InterfaceC12590eV getEchoHelper();

    AbstractC73672Svk<C28467BFf<GetResponse.Data>> getGoalGiftInfo(String str, Long l, int i, int i2);

    LiveMode getLastBroadcastLiveMode(Context context);

    InterfaceC12610eX getLiveCameraCapture(SurfaceView surfaceView, InterfaceC21020s6 interfaceC21020s6, boolean z, boolean z2, boolean z3);

    InterfaceC15310it getLiveCameraResManager();

    View getLiveCenterNativeView(Context context);

    String getLiveComposerFilePath();

    InterfaceC12620eY getLiveCoreInitUtil();

    String getLiveCoreVersion();

    InterfaceC30359Bvn getLiveParamsListener(DataChannel dataChannel);

    AbstractC73672Svk<AnchorLiveFragmentInfoResponse> getLiveReplayFragment(long j);

    AbstractC73672Svk<AnchorLiveReplayFrameResponse> getLiveReplayFrame(long j, long j2, long j3, boolean z);

    InterfaceC12630eZ getLiveStreamSoundPlayer();

    String getModelFilePath();

    C1VE getMultiGuestV3OriginFrameReviewManager(long j);

    InterfaceC12560eS getMuteMicView(Context context);

    List<InterfaceC15320iu> getOnExtendedScreenRegistryReadyListeners();

    Object getResourceFinder(Context context);

    Map<String, String> getRoomInfo();

    String getRtcDeviceID();

    String getRtcVersion();

    InterfaceC12690ef getVideoSizeManager();

    void greenScreenUploadCurrentStickerImage(long j, String str, String str2);

    void init();

    void initLiveBroadcastContext();

    void initPublicScreenConfiguration();

    boolean isCommerce(DataChannel dataChannel);

    void loadPauseLiveButton(DataChannel dataChannel);

    AbstractC73672Svk<Integer> loadShortVideoRes();

    void logLiveOver(Room room, DataChannel dataChannel);

    @Override // X.InterfaceC06390Mx
    /* bridge */ /* synthetic */ void onInit();

    void onLiveTabShow(Context context);

    void onLocaleChanged(Locale locale);

    boolean oneTapGoLive(Context context, Uri uri);

    void preLoadGameLiveCover();

    void preloadLiveStream(Context context, boolean z, boolean z2);

    void preloadVoiceChatLiveStream(Context context);

    void releaseLiveStream();

    void releaseVoiceChatLiveStream();

    void removeBroadcastLifecycle(InterfaceC12670ed interfaceC12670ed);

    void removeDisplaySourceOption(long j, InterfaceC17150lr interfaceC17150lr);

    void reportBroadcastCreated();

    void reportBroadcastEnd();

    void reportCameraFirstShow();

    void reportEnterBroadcast();

    void reportStartPushStream(WeakHandler weakHandler);

    void reportStreamEnd(int i, long j, long j2, boolean z, int i2);

    void reportStreamEndForApi(int i, long j, long j2, boolean z, int i2);

    void reportStreamEndForLiveCore(int i, int i2, String str, long j, long j2, boolean z, int i3);

    void requestCreateInfoFromTools(InterfaceC30519ByN interfaceC30519ByN);

    void resetGameLiveStreamEndFlag();

    AbstractC73672Svk<ScheduleAutoDownloadResponse> scheduledLiveReplayAutoDownload(long j);

    void setAnchorLevelPermissionInPreview(BHJ bhj);

    void setApplyLivePermission(BUT but);

    void setBroadcastActivity(Activity activity);

    void setDetailLivePermission(C29180Bcm c29180Bcm);

    void setLiveBanCapability(BEF bef);

    void setResumeLiveParams(int i);

    void setTryModeExperiment(C30553Byv c30553Byv);

    void showCppUnlockGuideDialog(String str, String str2, Boolean bool, FragmentManager fragmentManager);

    void showCppUnlockGuideDialogV2(String str, String str2, Boolean bool, FragmentManager fragmentManager);

    void showDialog(Context context, PerceptionMessage perceptionMessage, DataChannel dataChannel, InterfaceC12650eb interfaceC12650eb);

    void showEndPageForPaidEvent();

    void showGuideBirthdayEditDialog(Activity activity, String str, String str2, InterfaceC05250In interfaceC05250In);

    InterfaceC28921BWr startLiveManager();

    void upLoadLiveEcoEvent(long j, int i);

    void updateEffectAddTime(String str);

    void uploadStickerImage(String str, String str2, long j);
}
