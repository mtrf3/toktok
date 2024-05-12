package com.bytedance.android.livesdk.broadcast.video;

import X.AbstractC30473Bxd;
import X.AbstractC30707C3j;
import X.ActivityC45651qj;
import X.B73;
import X.B83;
import X.BCN;
import X.BP4;
import X.BPM;
import X.BWY;
import X.BWZ;
import X.BYI;
import X.BZI;
import X.BZT;
import X.BZV;
import X.BZW;
import X.C025908h;
import X.C08770Wb;
import X.C08780Wc;
import X.C0K2;
import X.C0NB;
import X.C0TW;
import X.C0TY;
import X.C0WC;
import X.C0WD;
import X.C0WE;
import X.C0WF;
import X.C11040c0;
import X.C16880lQ;
import X.C18230nb;
import X.C199097rd;
import X.C1EW;
import X.C1KU;
import X.C1MX;
import X.C1MZ;
import X.C1Q2;
import X.C1QA;
import X.C1QB;
import X.C1XG;
import X.C279017q;
import X.C28268B7o;
import X.C28467BFf;
import X.C28718BOw;
import X.C28787BRn;
import X.C28984BZc;
import X.C28985BZd;
import X.C29058Bao;
import X.C29306Beo;
import X.C29374Bfu;
import X.C29702BlC;
import X.C29829BnF;
import X.C29963BpP;
import X.C2E4;
import X.C2E5;
import X.C30326BvG;
import X.C30355Bvj;
import X.C30409Bwb;
import X.C30425Bwr;
import X.C30458BxO;
import X.C30459BxP;
import X.C30464BxU;
import X.C30469BxZ;
import X.C30471Bxb;
import X.C30475Bxf;
import X.C30485Bxp;
import X.C30493Bxx;
import X.C30495Bxz;
import X.C30514ByI;
import X.C30517ByL;
import X.C30527ByV;
import X.C30529ByX;
import X.C30704C3g;
import X.C30868C9o;
import X.C31691Mf;
import X.C32041No;
import X.C32141Ny;
import X.C32241Oi;
import X.C32537Cpp;
import X.C32801Qm;
import X.C42691lx;
import X.C44384HbQ;
import X.C49521wy;
import X.C55012Dx;
import X.C55032Dz;
import X.C72818Shy;
import X.C73318Sq2;
import X.C73495Sst;
import X.C73666Sve;
import X.C73943T0h;
import X.C76800UCe;
import X.C77633UdR;
import X.C78857UxB;
import X.C7N;
import X.CKJ;
import X.CN1;
import X.EnumC12540eQ;
import X.EnumC30204BtI;
import X.InterfaceC05190Ih;
import X.InterfaceC08070Tj;
import X.InterfaceC08090Tl;
import X.InterfaceC08140Tq;
import X.InterfaceC08160Ts;
import X.InterfaceC12680ee;
import X.InterfaceC17160ls;
import X.InterfaceC21020s6;
import X.InterfaceC29405BgP;
import X.InterfaceC30314Bv4;
import X.InterfaceC30442Bx8;
import X.InterfaceC30494Bxy;
import X.InterfaceC30497By1;
import X.InterfaceC30498By2;
import X.InterfaceC30516ByK;
import X.InterfaceC31203CMl;
import X.InterfaceC31971Nh;
import X.InterfaceC31994Ch4;
import X.InterfaceC72822Si2;
import X.InterfaceC78280Uns;
import X.InterfaceC88471Ynr;
import X.ORZ;
import X.OSJ;
import X.UB9;
import X.WM7;
import X.X1D;
import X.YLI;
import X.YLM;
import Y.AObjectS42S0101000_5;
import Y.AObjectS43S0101000_7;
import Y.ARunnableS41S0100000_5;
import Y.ARunnableS5S2200000_5;
import Y.ARunnableS9S0101000_5;
import Y.AfS17S0001000_5;
import Y.AfS37S0000000_5;
import Y.AfS57S0100000_5;
import android.app.Dialog;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.ClickInsertStickerEvent;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.ShowStickerPanelEvent;
import com.bytedance.android.live.broadcast.api.StickerShortcutPanelChannel;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.api.FaceDetectEnabledEvent;
import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.ScrollToInsertStickerEvent;
import com.bytedance.android.live.effect.api.ShowStickerShortCutPanelEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCaptureImageChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.AnchorBroadcastResolutionChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.MultiGuestV3VideoCaptureChangeEvent;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.api.StickerReportApi;
import com.bytedance.android.livesdk.broadcast.video.VideoWidget;
import com.bytedance.android.livesdk.dataChannel.BGMDialogShowEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveTalkStateEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.MuteMicMiniWidgetClosedEvent;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.effect.StickerImageUploader;
import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastForceUploadVideoImageSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEffectShortcutPanelTypeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtLiveBackgroundSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectFaceDetectAllowlistSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGoal2GreenScreenSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestEnableEffectSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.ttlivestreamer.core.effect.IVideoEffectProcessor;
import com.ss.ttlivestreamer.core.opengl.GlUtil;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import com.ss.ttlivestreamer.livestreamv2.core.LiveCore;
import com.ss.ttlivestreamer.livestreamv2.filter.IAudioFilterManager;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class VideoWidget extends LiveWidget implements InterfaceC31994Ch4, UB9, InterfaceC17160ls, WeakHandler.IHandler, InterfaceC30516ByK, InterfaceC72822Si2 {
    public static final String TAG = C16880lQ.LJLLJ(VideoWidget.class);
    public LiveDialogFragment bgmDialog;
    public CKJ captureImageUploadController;
    public C30529ByX captureVideoUploadController;
    public long detectTime;
    public IFilterManager filterManager;
    public ActivityC45651qj fragmentActivity;
    public boolean hasDestroy;
    public volatile boolean hasSticker;
    public boolean isTryModeGoingLive;
    public C0TW liveEffectPalletHandler;
    public AbstractC30473Bxd mCameraCapture;
    public InterfaceC30314Bv4 mFilterToastView;
    public FragmentManager mFragmentManager;
    public InterfaceC30498By2 mFrameListener;
    public AbstractC30707C3j mLiveBeautyHelper;
    public C1MZ mLiveFilterHelper;
    public boolean mLivePushing;
    public Dialog mLiveStickerDialog;
    public InterfaceC21020s6 mLiveStream;
    public IVideoEffectProcessor.FaceDetectListener mOnRefreshDataListener;
    public Room mRoom;
    public LiveEffect mSelectedSticker;
    public StickerMessageManager mStickerMessageManager;
    public StreamUrlExtra mStreamUrlExtra;
    public SurfaceView mSurfaceView;
    public YLI mTouchEventHelper;
    public InterfaceC08160Ts magicGestureEffectAnchorHelper;
    public InterfaceC30497By1 stateListener;
    public final String LIVE_GOAL_POSITION = "live_goal_background_position";
    public final String IS_QUIT = "isQuit";
    public boolean mIsMirror = true;
    public WeakHandler mHandler = new WeakHandler(this);
    public Map<String, Runnable> mSendLogSmallItemBeautyTagRunnableMap = new HashMap();
    public C30459BxP mToolbarReverseMirrorBehavior = new C30459BxP(this);
    public boolean mInitializedEffect = false;
    public boolean isSpeaking = false;
    public boolean isLivePause = false;
    public C0WD mCurrentStickerChangeListener = new C30469BxZ(this);
    public C0WC mComposerTagValueChangeListener = new C30493Bxx();
    public InterfaceC30494Bxy onStickerViewListener = new C30464BxU(this);
    public InterfaceC08070Tj<?> liveFilterManager = C7N.LJII().getLiveFilterManager();

    public static /* synthetic */ C76800UCe LJZ(VideoWidget videoWidget, C76800UCe c76800UCe) {
        return videoWidget.lambda$onCreate$6(c76800UCe);
    }

    public static /* synthetic */ C76800UCe LJZI(VideoWidget videoWidget, C76800UCe c76800UCe) {
        return videoWidget.lambda$onCreate$7(c76800UCe);
    }

    public static /* synthetic */ C76800UCe LL(VideoWidget videoWidget, Boolean bool) {
        return videoWidget.lambda$onCreate$3(bool);
    }

    public static /* synthetic */ C76800UCe LLF(VideoWidget videoWidget, Boolean bool) {
        return videoWidget.lambda$onCreate$8(bool);
    }

    public static /* synthetic */ C76800UCe LLFF(VideoWidget videoWidget, C32801Qm c32801Qm) {
        return videoWidget.lambda$onCreate$2(c32801Qm);
    }

    public static /* synthetic */ void LLFFF(VideoWidget videoWidget, Object obj) {
        videoWidget.lambda$registerRxBus$0(obj);
    }

    public static /* synthetic */ C76800UCe LLIIII(VideoWidget videoWidget, Boolean bool) {
        return videoWidget.lambda$onCreate$4(bool);
    }

    public static /* synthetic */ C76800UCe LLIIIILZ(VideoWidget videoWidget, Boolean bool) {
        return videoWidget.lambda$onCreate$5(bool);
    }

    public static /* synthetic */ C76800UCe LLIIIJ(VideoWidget videoWidget, Boolean bool) {
        return videoWidget.lambda$onCreate$9(bool);
    }

    private void bindStreamBackground() {
    }

    private void initEffectStage1() {
        InterfaceC21020s6 interfaceC21020s6;
        IFilterManager iFilterManager = this.filterManager;
        if (iFilterManager != null) {
            iFilterManager.composerSetMode(1, 0);
        }
        initComposerManager();
        if (this.mLiveBeautyHelper == null) {
            InterfaceC31971Nh composerManager = C7N.LJII().composerManager();
            o.LJIIIIZZ(composerManager, "effectService.composerManager()");
            this.mLiveBeautyHelper = new C30704C3g(composerManager);
        }
        if (this.mLiveFilterHelper == null) {
            C1QB c1qb = new C1QB();
            this.mCameraCapture.LIZIZ(c1qb);
            C1MZ LJII = C30355Bvj.LJII();
            this.mLiveFilterHelper = LJII;
            LJII.LJFF(c1qb);
            this.liveFilterManager.LIZIZ(this.mLiveFilterHelper);
        }
        C0WF LIZJ = C30355Bvj.LIZJ();
        String LJIILLIIL = LIZJ.LJIILLIIL();
        String LJII2 = LIZJ.LJII();
        if (!TextUtils.isEmpty(LJIILLIIL) && !TextUtils.isEmpty(LJII2) && (interfaceC21020s6 = this.mLiveStream) != null && interfaceC21020s6.getVideoFilterMgr() != null) {
            C30326BvG.LIZJ(new ARunnableS5S2200000_5(this, LJIILLIIL, LJII2, LIZJ, 0), null, 500L);
        }
        List<LiveEffect> LIZ = LIZJ.LIZ(C0TY.LIZIZ);
        if (!LIZ.isEmpty()) {
            this.hasSticker = true;
            startOriginImageUpload(true, (LiveEffect) ListProtector.get(LIZ, 0));
        }
        C1QA liveTouchEventEffect = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveTouchEventEffect();
        this.mCameraCapture.LIZIZ(liveTouchEventEffect);
        this.mTouchEventHelper = new YLI(liveTouchEventEffect);
    }

    public static /* synthetic */ void lambda$reportStickerChange$14(C28467BFf c28467BFf) {
    }

    public static /* synthetic */ void lambda$reportStickerChange$15(Throwable th) {
    }

    public void liveStreamStart() {
        this.mLivePushing = true;
    }

    public void liveStreamStop() {
        this.mLivePushing = false;
        Iterator<Runnable> it = this.mSendLogSmallItemBeautyTagRunnableMap.values().iterator();
        while (it.hasNext()) {
            this.mHandler.removeCallbacks(it.next());
        }
        BZI LIZ = C28787BRn.LIZ("pm_live_gesture_use");
        LIZ.LJIILLIIL(this.dataChannel);
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIL("other");
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJIJJ("unused", "use_status");
        LIZ.LJJIIJZLJL();
        Dialog dialog = this.mLiveStickerDialog;
        if (dialog != null) {
            dialog.dismiss();
            this.mLiveStickerDialog = null;
        }
        CKJ ckj = this.captureImageUploadController;
        if (ckj != null) {
            ckj.LJIIJ = 0L;
            ckj.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void removeFrameListener() {
        this.mFrameListener = null;
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJIIJJI(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SurfaceView getSurfaceView() {
        SurfaceView surfaceView;
        SurfaceView surfaceView2 = this.mSurfaceView;
        if (surfaceView2 != null) {
            return surfaceView2;
        }
        ActivityC45651qj lazyGetFragmentActivity = lazyGetFragmentActivity();
        this.fragmentActivity = lazyGetFragmentActivity;
        if (lazyGetFragmentActivity instanceof InterfaceC12680ee) {
            surfaceView = ((InterfaceC12680ee) lazyGetFragmentActivity).LJJZZIII();
        } else {
            surfaceView = null;
        }
        this.mSurfaceView = surfaceView;
        if (surfaceView != null) {
            surfaceView.setVisibility(0);
        }
        return surfaceView;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void initCameraCapture() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.video.VideoWidget.initCameraCapture():void");
    }

    public void initEffectStage2() {
        RoomAuthStatus roomAuthStatus;
        AnchorLevelPermission anchorLevelPermission;
        Room room = this.mRoom;
        if (room != null && (roomAuthStatus = room.mRoomAuthStatus) != null && (anchorLevelPermission = roomAuthStatus.anchorLevelPermission) != null && EnumC12540eQ.fromInt(anchorLevelPermission.voiceEffect) == EnumC12540eQ.OFF) {
            C30355Bvj.LJIIJJI();
            if (C32141Ny.LJIIIIZZ != null) {
                ((LinkedHashMap) C32141Ny.LJFF).clear();
                C32141Ny.LJ(C32141Ny.LJIIIIZZ);
                C32141Ny.LJIIIIZZ = null;
                C32141Ny.LJI = null;
                C32141Ny.LJII = null;
                ((Handler) C32141Ny.LJIIJJI.getValue()).removeCallbacksAndMessages(null);
                C32141Ny.LIZLLL = null;
                C32141Ny.LIZIZ = null;
                C32141Ny.LIZJ = null;
            }
        }
        if (this.mLiveStream.getAudioFilterMgr() != null) {
            C30355Bvj.LJIIJJI();
            DataChannel dataChannel = this.dataChannel;
            IAudioFilterManager audioManager = this.mLiveStream.getAudioFilterMgr();
            o.LJIIIZ(audioManager, "audioManager");
            C32141Ny.LIZLLL = dataChannel;
            C32141Ny.LIZIZ = audioManager;
            C32141Ny.LIZJ = audioManager.getAudioStrangeVoice();
        }
        if (this.mLiveStream.getLiveCore() != null && this.mLiveStream.getLiveCore().getBuilder() != null) {
            C30355Bvj.LIZJ().LJJ(C0WE.LIZ(this.mSurfaceView.getWidth(), this.mSurfaceView.getHeight(), this.mLiveStream.getLiveCore().getBuilder().getVideoWidth(), this.mLiveStream.getLiveCore().getBuilder().getVideoHeight(), this.context, false));
        }
        C30355Bvj.LJI();
        C1KU.LIZIZ(this.dataChannel, this, false, C29306Beo.LIZIZ(this.context));
        C30355Bvj.LIZLLL().LIZLLL(false);
        C30355Bvj.LIZLLL().LJFF(this.dataChannel, true);
        C30355Bvj.LIZLLL().LIZ(this.dataChannel, true);
        C30355Bvj.LIZLLL().LJ();
        setMagicGestureEffectData();
    }

    private ActivityC45651qj lazyGetFragmentActivity() {
        if (this.fragmentActivity == null) {
            this.fragmentActivity = C29306Beo.LIZ(this.context);
        }
        return this.fragmentActivity;
    }

    private void registerXBridge() {
        C72818Shy.LIZLLL("live_goal_update_event", this);
    }

    private void unRegisterXBridge() {
        C72818Shy.LJII("live_goal_update_event", this);
    }

    @Override // X.UB9
    public ILiveStream getLiveCore() {
        return this.mLiveStream.getLiveCore();
    }

    public long getRoomId() {
        Room room = this.mRoom;
        if (room != null) {
            return room.getId();
        }
        return 0L;
    }

    public void initEffect() {
        if (TestEnableEffectSetting.INSTANCE.disable()) {
            return;
        }
        C1Q2.LIZ.LIZLLL();
        initEffectStage1();
        B73.LIZIZ(new ARunnableS9S0101000_5(0, this, 8), this.dataChannel);
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C31691Mf.LJI(C49521wy.LJLIL);
            C30355Bvj.LJ().LJ(this.dataChannel);
            InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
            DataChannel dataChannel = this.dataChannel;
            liveGoalEffectHelper.getClass();
            C31691Mf.LIZJ = dataChannel;
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C31691Mf.LIZLLL = true;
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [java.lang.Boolean, O] */
    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        String str;
        if (this.hasDestroy) {
            return;
        }
        this.hasDestroy = true;
        unRegisterXBridge();
        if (this.isTryModeGoingLive) {
            ((C32537Cpp) DataChannelGlobal.LJLJJI.gv0(C29058Bao.class)).LIZ = Boolean.valueOf(this.mIsMirror);
        } else {
            ((ConcurrentHashMap) DataChannelGlobal.LJLJJI.LJLIL).remove(C29058Bao.class);
        }
        C30459BxP c30459BxP = this.mToolbarReverseMirrorBehavior;
        c30459BxP.getClass();
        BZI LIZ = C28787BRn.LIZ("pm_live_mirror_use");
        LIZ.LJIIIZ("live_take");
        LIZ.LJIIJJI("live_take_detail");
        LIZ.LJIJJ(Long.valueOf(c30459BxP.LJLJJI.mRoom.getId()), "room_id");
        LIZ.LJIJJ(Long.valueOf(c30459BxP.LJLJJI.mRoom.getOwnerUserId()), "anchor_id");
        LIZ.LJIJJ(Integer.valueOf(c30459BxP.LJLJJI.mIsMirror ? 1 : 0), "is_open");
        if (c30459BxP.LJLIL) {
            str = "front";
        } else {
            str = "back";
        }
        LIZ.LJIJJ(str, "camera_type");
        LIZ.LJJIIJZLJL();
        InterfaceC08070Tj<?> interfaceC08070Tj = this.liveFilterManager;
        if (interfaceC08070Tj != null) {
            interfaceC08070Tj.LIZLLL(this.mLiveFilterHelper);
        }
        ((C1KU) C30355Bvj.LJI()).LIZ(this.dataChannel);
        C7N.LJII().releasePanelResource(true);
        C7N.LJII().releaseBgPanelResource();
        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).BT();
        ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).releaseGalleryModule();
        if (LiveGoal2GreenScreenSetting.INSTANCE.getEnable()) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper().getClass();
            C31691Mf.LIZJ = null;
        }
        if (this.mLivePushing) {
            liveStreamStop();
        }
        this.mFrameListener = null;
        C7N.LJII().stickerPresenter().onDestroy();
        C7N.LJII().destroyEffectPalletHandler();
        C30355Bvj.LIZJ().LJIILJJIL(this.mCurrentStickerChangeListener);
        C30355Bvj.LIZJ().LJIIZILJ(this.mComposerTagValueChangeListener);
        if (!C29306Beo.LJJII(this.dataChannel)) {
            C30355Bvj.LIZJ().release();
        }
        this.mCameraCapture.LJ(C78857UxB.LJJIIJ(1476788483, "bpea-434"));
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        IVideoEffectProcessor.FaceDetectListener faceDetectListener = this.mOnRefreshDataListener;
        synchronized (abstractC30473Bxd) {
            List<IVideoEffectProcessor.FaceDetectListener> list = abstractC30473Bxd.LJLIL;
            if (list != null) {
                int size = ((ArrayList) list).size();
                while (true) {
                    size--;
                    if (size <= 0) {
                        break;
                    } else if (ListProtector.get(abstractC30473Bxd.LJLIL, size) == faceDetectListener) {
                        ListProtector.remove(abstractC30473Bxd.LJLIL, size);
                    }
                }
            }
        }
        AbstractC30473Bxd abstractC30473Bxd2 = this.mCameraCapture;
        if (abstractC30473Bxd2 != null) {
            abstractC30473Bxd2.LJIIIIZZ(this);
            this.mCameraCapture.LJIIIIZZ(this.mStickerMessageManager);
        }
        C1MZ c1mz = this.mLiveFilterHelper;
        if (c1mz != null) {
            c1mz.release();
        }
        this.mStickerMessageManager.destroy();
        GlUtil.nativeDetachThreadToOpenGl();
        this.mHandler.removeCallbacksAndMessages(null);
        C30529ByX c30529ByX = this.captureVideoUploadController;
        if (c30529ByX != null) {
            C0NB.LIZIZ("CaptureVideoUploadController", "stop");
            if (!((C73318Sq2) c30529ByX.LJI.getValue()).LJLILLLLZI) {
                ((C73318Sq2) c30529ByX.LJI.getValue()).dispose();
            }
            try {
                C16880lQ.LLLZZIL(new File((String) c30529ByX.LJ.getValue()));
                C16880lQ.LLLZZIL(new File((String) c30529ByX.LJFF.getValue()));
            } catch (Throwable th) {
                C0NB.LJI("CaptureVideoUploadController", th);
            }
            this.captureVideoUploadController = null;
        }
        StickerImageUploader stickerImageUploader = C30495Bxz.LIZ;
        C73666Sve c73666Sve = stickerImageUploader.LIZIZ;
        if (c73666Sve != null && !c73666Sve.isDisposed()) {
            stickerImageUploader.LIZIZ.dispose();
        }
        C73495Sst c73495Sst = stickerImageUploader.LIZ;
        if (c73495Sst != null && !c73495Sst.isDisposed()) {
            stickerImageUploader.LIZ.dispose();
        }
        stickerImageUploader.LIZLLL.LIZ.clear();
        C30471Bxb.LJIIIIZZ = null;
        C30471Bxb.LJIIIZ = null;
        C30471Bxb.LJFF = true;
        InterfaceC08160Ts interfaceC08160Ts = this.magicGestureEffectAnchorHelper;
        if (interfaceC08160Ts != null) {
            C32241Oi c32241Oi = (C32241Oi) interfaceC08160Ts;
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(c32241Oi);
            DataChannel dataChannel = c32241Oi.LIZ;
            if (dataChannel != null) {
                dataChannel.jv0(c32241Oi);
            }
        }
        this.bgmDialog = null;
        super.onDestroy();
    }

    public void startStickerMessageManager() {
        StickerMessageManager stickerMessageManager = this.mStickerMessageManager;
        if (stickerMessageManager != null) {
            stickerMessageManager.start();
        }
    }

    private boolean canShowFaceDetectHint() {
        boolean z;
        Map<String, Map<String, LiveEffect>> Z5 = C30355Bvj.LIZJ().Z5();
        String str = C0TY.LIZIZ;
        if (Z5.containsKey(str) && !Z5.get(str).isEmpty()) {
            ArrayList arrayList = new ArrayList(Z5.get(str).values());
            HashSet hashSet = new HashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LiveEffect liveEffect = (LiveEffect) it.next();
                if (liveEffect.getEffect() != null && !liveEffect.getEffect().getRequirements().isEmpty()) {
                    hashSet.addAll(liveEffect.getEffect().getRequirements());
                }
            }
            Iterator it2 = hashSet.iterator();
            z = false;
            while (true) {
                if (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (z) {
                        break;
                    }
                    String[] allowlist = LiveEffectFaceDetectAllowlistSetting.INSTANCE.getALLOWLIST();
                    int length = allowlist.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (str2.contains(allowlist[i])) {
                            z = true;
                            break;
                        }
                        i++;
                    }
                } else if (!z) {
                    DataChannel dataChannel = this.dataChannel;
                    Boolean bool = Boolean.FALSE;
                    dataChannel.qv0(FaceDetectEvent.class, bool);
                    this.dataChannel.qv0(FaceDetectEnabledEvent.class, bool);
                }
            }
        } else {
            z = false;
        }
        if (this.isLivePause) {
            return false;
        }
        return z;
    }

    private void initComposerManager() {
        List<String> list;
        C0WF LIZJ = C30355Bvj.LIZJ();
        LIZJ.LJIIIZ(this.mCurrentStickerChangeListener);
        LIZJ.LJIJJ(this.mComposerTagValueChangeListener);
        C08770Wb c08770Wb = new C08770Wb();
        if (LiveEffectDowngradeSetting.INSTANCE.enable()) {
            list = C0TY.LJII;
        } else {
            list = C0TY.LJI;
        }
        c08770Wb.LIZ = list;
        c08770Wb.LIZLLL = "broadcast";
        c08770Wb.LIZIZ = Collections.singletonList("effect_gift");
        c08770Wb.LIZJ = ((IEffectService) CN1.LIZ(IEffectService.class)).getDefaultComposerHandler(this.filterManager, TAG);
        LIZJ.LJJIIZ(new C08780Wc(c08770Wb));
    }

    private void setMagicGestureEffectData() {
        InterfaceC08160Ts interfaceC08160Ts;
        List<LiveEffect> LIZ = C30355Bvj.LIZJ().LIZ(C0TY.LIZIZ);
        if (!LIZ.isEmpty() && ((LiveEffect) ListProtector.get(LIZ, 0)).needSafeArea && (interfaceC08160Ts = this.magicGestureEffectAnchorHelper) != null) {
            ((C32241Oi) interfaceC08160Ts).LIZIZ();
        }
    }

    private void updateSelectedSticker() {
        List<LiveEffect> LIZ = C30355Bvj.LIZJ().LIZ(C0TY.LIZIZ);
        if (LIZ.size() > 0) {
            reportStickerChange((LiveEffect) ListProtector.get(LIZ, 0));
            this.mSelectedSticker = (LiveEffect) ListProtector.get(LIZ, 0);
        }
    }

    @Override // X.InterfaceC31994Ch4
    public void finishPlayStickerGift() {
        C30355Bvj.LIZJ().LIZLLL("effect_gift");
    }

    public long getUserId() {
        if (B83.LIZ().LIZIZ() != null) {
            return C025908h.LIZ();
        }
        return 0L;
    }

    @Override // com.bytedance.android.widget.Widget
    public View getView() {
        return getSurfaceView();
    }

    public boolean isVideoEnable() {
        return C7N.LJIILJJIL().on();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        boolean z;
        super.onCreate();
        if (!this.mLivePushing) {
            liveStreamStart();
        }
        this.mSurfaceView = getSurfaceView();
        registerRxBus(C11040c0.class);
        registerRxBus(C28268B7o.class);
        registerRxBus(YLM.class);
        registerXBridge();
        this.mRoom = (Room) this.dataChannel.kv0(RoomChannel.class);
        initCameraCapture();
        if (this.mLiveStream instanceof InterfaceC08140Tq) {
            this.magicGestureEffectAnchorHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).createMagicGestureEffectAnchorHelper(this.dataChannel, this.mSurfaceView, (InterfaceC08140Tq) this.mLiveStream);
        }
        C0TW liveEffectPalletHandler = C7N.LJII().getLiveEffectPalletHandler(new WeakReference<>(this.dataChannel), new WeakReference<>(this.widgetCallback.getFragment()), new C30475Bxf(this.mCameraCapture));
        this.liveEffectPalletHandler = liveEffectPalletHandler;
        final int i = 0;
        if (liveEffectPalletHandler != null) {
            liveEffectPalletHandler.LJII(new InterfaceC88471Ynr() { // from class: X.Bxu
                @Override // X.InterfaceC88471Ynr
                public final Object invoke(Object obj, Object obj2) {
                    Integer lambda$onCreate$1;
                    switch (i) {
                        case 0:
                            lambda$onCreate$1 = ((VideoWidget) this).lambda$onCreate$1((String) obj, (String) obj2);
                            return lambda$onCreate$1;
                        default:
                            C59127NIl c59127NIl = (C59127NIl) obj;
                            c59127NIl.LJ((Aweme) this);
                            return c59127NIl;
                    }
                }
            });
        }
        updateSelectedSticker();
        this.mStickerMessageManager = new StickerMessageManager(this);
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LIZ(this);
            this.mCameraCapture.LIZ(this.mStickerMessageManager);
        }
        EnumC30204BtI.STICKER.load(this.dataChannel, new C30409Bwb(this));
        if (TtLiveBackgroundSetting.INSTANCE.enable() && !C29306Beo.LJJII(this.dataChannel)) {
            EnumC30204BtI.BACKGROUND.load(this.dataChannel, new C28984BZc(this));
        }
        EnumC30204BtI.PROPS.load(this.dataChannel, new BZT(this));
        EnumC30204BtI.MUSIC.load(this.dataChannel, new C28985BZd(new C30485Bxp(this)));
        EnumC30204BtI.REVERSE_CAMERA.load(this.dataChannel, new C30458BxO(this));
        if (InterfaceC30442Bx8.LJIIIZ.LIZIZ().intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        C30459BxP c30459BxP = this.mToolbarReverseMirrorBehavior;
        c30459BxP.LJLIL = z;
        c30459BxP.LIZ(true);
        EnumC30204BtI.REVERSE_MIRROR.load(this.dataChannel, this.mToolbarReverseMirrorBehavior);
        EnumC30204BtI.VOICE_EFFECT.load(this.dataChannel, new BZW(this.context));
        EnumC30204BtI.SOUND_EFFECT.load(this.dataChannel, new BZV());
        EnumC30204BtI.ECHO_MODE.load(this.dataChannel, new C30425Bwr());
        EnumC30204BtI.MUTE_MIC.load(this.dataChannel, new C29963BpP(this));
        if (!BYI.LIZIZ(BWZ.PAID_LIVE_EVENT) && !BYI.LIZIZ(BWZ.SUB_ONLY) && !BYI.LIZIZ(BWZ.COMMERCE) && LiveKaraokeSetting.INSTANCE.enable() && !C44384HbQ.LJJIJ()) {
            EnumC30204BtI.KARAOKE.load(this.dataChannel, new BWY());
        }
        View view = getView();
        InterfaceC21020s6 interfaceC21020s6 = this.mLiveStream;
        C30471Bxb.LJIIIIZZ = view;
        C30471Bxb.LJIIIZ = interfaceC21020s6;
        DataChannel dataChannel = this.dataChannel;
        dataChannel.lv0(this, ShowStickerPanelEvent.class, new AObjectS42S0101000_5(1, this, 53));
        dataChannel.lv0(this, ClickInsertStickerEvent.class, new AObjectS42S0101000_5(1, this, 54));
        dataChannel.lv0(this, ECLiveStatusChangeChannel.class, new AObjectS42S0101000_5(1, this, 56));
        dataChannel.lv0(this, LiveTalkStateEvent.class, new AObjectS42S0101000_5(1, this, 57));
        dataChannel.lv0(this, BroadcastEnableSubOnlyLiveEvent.class, new AObjectS42S0101000_5(1, this, 58));
        dataChannel.lv0(this, BGMDialogShowEvent.class, new AObjectS42S0101000_5(2, this, 60));
        if (((IEffectService) CN1.LIZ(IEffectService.class)).getEcEffectHelper() != null) {
            InterfaceC30494Bxy onStickerViewListener = this.onStickerViewListener;
            o.LJIIIZ(onStickerViewListener, "onStickerViewListener");
            C42691lx.LIZJ = new WeakReference<>(onStickerViewListener);
        }
        if (LiveEffectShortcutPanelTypeSetting.INSTANCE.getValue() != 0 && InterfaceC30442Bx8.C1.LIZJ().booleanValue()) {
            this.dataChannel.qv0(ShowStickerShortCutPanelEvent.class, new C1MX(this.onStickerViewListener, true, false, false));
        }
        DataChannel dataChannel2 = this.dataChannel;
        dataChannel2.lv0(this, PauseLiveChannel.class, new AObjectS42S0101000_5(2, this, 61));
        dataChannel2.lv0(this, MuteMicChannel.class, new AObjectS42S0101000_5(1, this, 31));
        dataChannel2.lv0(this, MuteMicMiniWidgetClosedEvent.class, new AObjectS43S0101000_7(1, this, 2));
        C30355Bvj.LIZJ().LJIIIZ(C30527ByV.LIZIZ);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        super.onPause();
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJFF();
        }
        CKJ ckj = this.captureImageUploadController;
        if (ckj != null) {
            ckj.LIZ();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        super.onResume();
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd != null) {
            abstractC30473Bxd.LJI();
        }
        this.mStickerMessageManager.start();
        CKJ ckj = this.captureImageUploadController;
        if (ckj != null) {
            ckj.LIZIZ();
        }
    }

    public AbstractC30707C3j getLiveBeautyHelper() {
        return this.mLiveBeautyHelper;
    }

    public C1MZ getLiveFilterHelper() {
        return this.mLiveFilterHelper;
    }

    public /* synthetic */ void lambda$initCameraCapture$12(int i) {
        if (this.hasSticker && System.currentTimeMillis() - this.detectTime > 100) {
            this.detectTime = System.currentTimeMillis();
            this.mHandler.removeMessages(101);
            Message obtain = Message.obtain();
            obtain.what = 101;
            obtain.obj = Integer.valueOf(i);
            this.mHandler.sendMessage(obtain);
        }
    }

    public /* synthetic */ C76800UCe lambda$onCreate$10(C76800UCe c76800UCe) {
        C29829BnF.LIZ().postDelayed(new ARunnableS41S0100000_5(this, 96), 5000L);
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C76800UCe lambda$onCreate$2(C32801Qm c32801Qm) {
        showStickerPanel(c32801Qm.LJLIL, c32801Qm.LJLILLLLZI, c32801Qm.LJLJI, false, false);
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C76800UCe lambda$onCreate$3(Boolean bool) {
        if (Boolean.TRUE.equals(this.dataChannel.kv0(StickerShortcutPanelChannel.class))) {
            this.dataChannel.qv0(ScrollToInsertStickerEvent.class, bool);
        } else {
            showStickerPanel(LiveEffectShortcutPanelTypeSetting.INSTANCE.canShowShortCutPanelWhenClickEntrance(), false, false, bool.booleanValue(), true);
        }
        return C76800UCe.LIZ;
    }

    public C76800UCe lambda$onCreate$4(Boolean bool) {
        if (bool.booleanValue() && (C7N.LJII().isUsingAccompanimentBusiness() || C30355Bvj.LJIILJJIL())) {
            IEffectService LJII = C7N.LJII();
            Boolean bool2 = Boolean.TRUE;
            LJII.pauseAccompanimentPlay(bool2);
            C7N.LJII().pauseBGM(bool2);
            HashMap hashMap = new HashMap();
            hashMap.put("extra", "background_music");
            BPM bpm = new BPM();
            bpm.LIZJ = R.string.meu;
            bpm.LJ = hashMap;
            bpm.LIZLLL = true;
            bpm.LJFF = this.dataChannel;
            bpm.LIZIZ = "pm_live_bgmusic_playlist_music_cannot_enter";
            C30868C9o.LJII(bpm);
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_ksong_conflict_toast_show");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJJIIJZLJL();
        }
        if (bool.booleanValue()) {
            BYI.LIZJ(BWZ.COMMERCE_GOODS);
        } else {
            BYI.LIZLLL(BWZ.COMMERCE_GOODS);
        }
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C76800UCe lambda$onCreate$5(Boolean bool) {
        if (this.isSpeaking != bool.booleanValue()) {
            this.isSpeaking = bool.booleanValue();
            bindStreamBackground();
        }
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C76800UCe lambda$onCreate$6(C76800UCe c76800UCe) {
        EnumC30204BtI.MUSIC.unload(this.dataChannel);
        return C76800UCe.LIZ;
    }

    public C76800UCe lambda$onCreate$7(C76800UCe c76800UCe) {
        if (this.bgmDialog == null) {
            LiveDialogFragment liveBGMDialog = C7N.LJII().getLiveBGMDialog();
            o.LJIIIIZZ(liveBGMDialog, "effectService.liveBGMDialog");
            this.bgmDialog = liveBGMDialog;
        }
        if (this.mFragmentManager != null && !this.bgmDialog.isShowing()) {
            this.bgmDialog.show(this.mFragmentManager, "MUSIC");
        }
        return C76800UCe.LIZ;
    }

    public /* synthetic */ C76800UCe lambda$onCreate$8(Boolean bool) {
        onPauseLive(bool.booleanValue());
        return C76800UCe.LIZ;
    }

    public C76800UCe lambda$onCreate$9(Boolean bool) {
        if (!bool.booleanValue()) {
            C0NB.LJIIIZ("LiveMicMute", "mic unmuted, remove callbacks");
            C29829BnF.LIZ().removeCallbacksAndMessages(null);
        }
        LiveCore liveCore = this.mLiveStream.getLiveCore();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive MuteMicChannel: ");
        LIZ.append(bool);
        C0NB.LJIIIZ("LiveMicMute", X1D.LIZIZ(LIZ));
        if (liveCore != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("set volumeMute: ");
            LIZ2.append(bool);
            C0NB.LJIIIZ("LiveMicMute", X1D.LIZIZ(LIZ2));
            C29829BnF.LIZ = bool.booleanValue();
            if (bool.booleanValue()) {
                liveCore.getADM().setAudioCaptureMute(true);
            } else {
                liveCore.getADM().setAudioCaptureMute(false);
            }
            C29829BnF.LIZJ(liveCore, bool.booleanValue());
        }
        return C76800UCe.LIZ;
    }

    public /* synthetic */ void lambda$registerRxBus$0(Object obj) {
        if (obj instanceof C28268B7o) {
            onEvent((C28268B7o) obj);
        } else if (obj instanceof C11040c0) {
            onEvent((C11040c0) obj);
        } else {
            if (!(obj instanceof YLM)) {
                return;
            }
            onEvent((YLM) obj);
        }
    }

    private void onPauseLive(boolean z) {
        this.isLivePause = z;
    }

    private <T> void registerRxBus(Class<T> cls) {
        C73943T0h.LIZ().LJ(cls).LJII(getAutoUnbindTransformer()).LJJJJZI(new AfS57S0100000_5(this, 55));
    }

    @Override // X.UB9
    public Client create(InteractConfig interactConfig) {
        return this.mLiveStream.create(interactConfig);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        boolean z;
        if (isViewValid() && message.what == 101 && canShowFaceDetectHint()) {
            DataChannel dataChannel = this.dataChannel;
            Object obj = message.obj;
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 0) {
                z = true;
            } else {
                z = false;
            }
            dataChannel.qv0(FaceDetectEvent.class, Boolean.valueOf(z));
        }
    }

    public void onBeautySkinChange(float f) {
        AbstractC30707C3j abstractC30707C3j = this.mLiveBeautyHelper;
        if (abstractC30707C3j == null) {
            return;
        }
        abstractC30707C3j.LJFF(f);
    }

    public void onBigEyesChange(float f) {
        AbstractC30707C3j abstractC30707C3j = this.mLiveBeautyHelper;
        if (abstractC30707C3j == null) {
            return;
        }
        abstractC30707C3j.LJI(f);
    }

    public void onDestroy(boolean z) {
        this.isTryModeGoingLive = z;
        onDestroy();
    }

    public void onEvent(C28268B7o c28268B7o) {
        boolean z;
        int i = c28268B7o.LIZ;
        if (i != 2) {
            if (i != 40) {
                if (i != 41) {
                    return;
                }
                ((C30514ByI) this.mCameraCapture).LJIILLIIL(C78857UxB.LJJIIJ(1476788483, "certBpea805"), false);
                this.dataChannel.qv0(FaceDetectEnabledEvent.class, Boolean.FALSE);
                bindStreamBackground();
                return;
            }
            ((C30514ByI) this.mCameraCapture).LJIILLIIL(C78857UxB.LJJIIJ(1476788233, "bpea-805"), true);
            this.dataChannel.qv0(FaceDetectEnabledEvent.class, Boolean.TRUE);
            bindStreamBackground();
            return;
        }
        ((C30514ByI) this.mCameraCapture).LJIIZILJ(C78857UxB.LJJIIJ(1476788233, "bpea-377"));
        if (InterfaceC30442Bx8.LJIIIZ.LIZIZ().intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.mIsMirror) {
            this.mCameraCapture.LIZJ(false);
        }
        C30459BxP c30459BxP = this.mToolbarReverseMirrorBehavior;
        c30459BxP.LJLIL = z;
        c30459BxP.LIZ(true);
    }

    public void onFaceLiftChange(float f) {
        AbstractC30707C3j abstractC30707C3j = this.mLiveBeautyHelper;
        if (abstractC30707C3j == null) {
            return;
        }
        abstractC30707C3j.LJII(f);
    }

    @Override // X.InterfaceC72822Si2
    public void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        String str;
        Effect effect;
        if (!c199097rd.LJLIL.equals("live_goal_update_event") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null) {
            return;
        }
        InterfaceC08090Tl liveGoalEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
        if (interfaceC78280Uns.hasKey("isQuit") && interfaceC78280Uns.getBoolean("isQuit")) {
            ((C31691Mf) liveGoalEffectHelper).LJIILL();
            return;
        }
        if (interfaceC78280Uns.hasKey("live_goal_background_position") && interfaceC78280Uns.getInt("live_goal_background_position") == 0) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper().getClass();
            LiveEffect liveEffect = C1XG.LIZIZ;
            if (liveEffect != null && (effect = liveEffect.getEffect()) != null) {
                str = effect.getPanel();
            } else {
                str = null;
            }
            if (o.LJ(str, "livebackground")) {
                C1XG.LIZIZ = null;
            }
            ((C31691Mf) liveGoalEffectHelper).LJIIJJI();
        } else {
            C31691Mf.LJJI();
            C31691Mf.LJJ();
        }
        liveGoalEffectHelper.getClass();
        C31691Mf.LJ = null;
    }

    public void reportStickerChange(LiveEffect liveEffect) {
        String valueOf;
        String valueOf2;
        String resourceId;
        if (LiveEffect.equals(liveEffect, this.mSelectedSticker)) {
            return;
        }
        BP4 LIZ = C28718BOw.LIZ();
        LIZ.getClass();
        StickerReportApi stickerReportApi = (StickerReportApi) LIZ.LIZIZ(StickerReportApi.class);
        long roomId = getRoomId();
        String str = "";
        if (liveEffect == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(liveEffect.effectId);
        }
        LiveEffect liveEffect2 = this.mSelectedSticker;
        if (liveEffect2 == null) {
            valueOf2 = "";
        } else {
            valueOf2 = String.valueOf(liveEffect2.effectId);
        }
        if (liveEffect == null) {
            resourceId = "";
        } else {
            resourceId = liveEffect.getResourceId();
        }
        LiveEffect liveEffect3 = this.mSelectedSticker;
        if (liveEffect3 != null) {
            str = liveEffect3.getResourceId();
        }
        C1EW.LIZ(stickerReportApi.reportEffectChange(roomId, 1, valueOf, valueOf2, resourceId, str, 1)).LJJJLIIL(new AfS17S0001000_5(1, 17), new AfS37S0000000_5(2));
    }

    public void setFilterToastView(InterfaceC30314Bv4 interfaceC30314Bv4) {
        this.mFilterToastView = interfaceC30314Bv4;
    }

    public void showFilterStyleText(boolean z) {
        C1MZ c1mz = this.mLiveFilterHelper;
        if (c1mz == null) {
            return;
        }
        String LIZJ = c1mz.LIZJ();
        InterfaceC30314Bv4 interfaceC30314Bv4 = this.mFilterToastView;
        if (interfaceC30314Bv4 != null) {
            interfaceC30314Bv4.j1(LIZJ, z);
        }
    }

    public void onEvent(C11040c0 c11040c0) {
        if (this.mLiveFilterHelper == null) {
            return;
        }
        int i = c11040c0.LIZ;
        if (i == 1) {
            if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                this.mLiveFilterHelper.LIZLLL();
            }
            showFilterStyleText(true);
        } else if (i == 2) {
            if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                this.mLiveFilterHelper.LJ();
            }
            showFilterStyleText(false);
        }
        C30355Bvj.LJII().LIZ(this.mRoom.getId());
        C29702BlC LIZ = C18230nb.LIZ("ttlive_broadcast_action_all");
        LIZ.LJII("action", "change_filter");
        LIZ.LJFF(Integer.valueOf(this.mLiveFilterHelper.LJIIIZ()), "action_id");
        LIZ.LJI(Long.valueOf(getUserId()), "user_id");
        LIZ.LJI(Long.valueOf(getRoomId()), "room_id");
        LIZ.LJIIIZ();
    }

    private void onEvent(YLM ylm) {
        YLI yli = this.mTouchEventHelper;
        if (yli != null) {
            yli.onEvent(ylm);
        }
    }

    public /* synthetic */ Integer lambda$onCreate$1(String str, String str2) {
        return Integer.valueOf(this.onStickerViewListener.LJI(str, str2));
    }

    public void onFilterValueChange(LiveEffect liveEffect, float f) {
        C1MZ c1mz = this.mLiveFilterHelper;
        if (c1mz != null) {
            c1mz.LJII(liveEffect, f);
        }
    }

    public void setStickerLayout(FrameLayout frameLayout, FragmentManager fragmentManager) {
        this.mFragmentManager = fragmentManager;
    }

    public void startOriginImageUpload(boolean z, LiveEffect liveEffect) {
        if (this.captureImageUploadController != null) {
            if ((liveEffect != null && liveEffect.reviewOriginalFrame) || LiveBroadcastForceUploadVideoImageSetting.INSTANCE.isEnable()) {
                if (z) {
                    this.captureImageUploadController.LIZJ(this.mLiveStream, this.mRoom.getId());
                } else {
                    this.captureImageUploadController.LIZLLL();
                }
            }
        }
    }

    @Override // X.InterfaceC31994Ch4
    public void startPlayStickerGift(LiveEffect liveEffect, boolean z) {
        C30355Bvj.LIZJ().LIZIZ(liveEffect, "effect_gift");
    }

    public /* synthetic */ void lambda$initCameraCapture$11(int i, int i2, int i3) {
        DataChannel dataChannel;
        if (i != 4 && i != 5 && i != 6) {
            if (i != 38 || (dataChannel = this.dataChannel) == null) {
                return;
            }
            dataChannel.pv0(AnchorBroadcastResolutionChangeEvent.class);
            return;
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 == null) {
            return;
        }
        dataChannel2.qv0(MultiGuestV3VideoCaptureChangeEvent.class, new OSJ(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public void lambda$initEffectStage1$13(String str, String str2, C0WF c0wf) {
        long j;
        this.mLiveStream.getVideoFilterMgr().setCustomEffect(str, str2);
        C0TW c0tw = this.liveEffectPalletHandler;
        if (c0tw != null) {
            c0tw.LIZJ(c0wf.LJI());
        }
        Room room = this.mRoom;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C30495Bxz.LIZ.LIZ(new C30517ByL(j, ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId(), str2));
        c0wf.LJIJJLI(null);
        c0wf.LIZJ(null);
    }

    private void setCustomEffectImage(String str, String str2, boolean z) {
        C279017q.LJ("set custom sticker image:", str2, TAG);
        IFilterManager iFilterManager = this.filterManager;
        if (iFilterManager != null) {
            iFilterManager.setCustomEffect(str, str2);
        }
    }

    public void reportMonitorDuration(String str, long j, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("duration", j);
            C77633UdR c77633UdR = new C77633UdR();
            c77633UdR.LIZ = jSONObject;
            JSONObject jSONObject2 = (JSONObject) c77633UdR.LIZIZ;
            InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
            if (interfaceC31203CMl == null) {
                return;
            }
            interfaceC31203CMl.monitorStatusAndDuration(str, 0, jSONObject, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    public void reportMonitorStatus(String str, int i, JSONObject jSONObject) {
        C77633UdR c77633UdR = new C77633UdR();
        c77633UdR.LIZIZ = jSONObject;
        JSONObject jSONObject2 = (JSONObject) c77633UdR.LIZ;
        InterfaceC31203CMl interfaceC31203CMl = C0K2.LIZ;
        if (interfaceC31203CMl == null) {
            return;
        }
        interfaceC31203CMl.monitorStatusAndDuration(str, i, jSONObject2, jSONObject);
    }

    @Override // X.InterfaceC31994Ch4
    public void setCustomStickerImage(String str, String str2, boolean z) {
        setCustomEffectImage(str, str2, z);
    }

    public VideoWidget(InterfaceC30498By2 interfaceC30498By2, StreamUrlExtra streamUrlExtra, InterfaceC21020s6 interfaceC21020s6, InterfaceC30497By1 interfaceC30497By1) {
        this.mLiveStream = interfaceC21020s6;
        this.filterManager = interfaceC21020s6.getVideoFilterMgr();
        this.mFrameListener = interfaceC30498By2;
        this.mStreamUrlExtra = streamUrlExtra;
        this.stateListener = interfaceC30497By1;
    }

    @Override // X.InterfaceC30516ByK
    public void onMessageReceived(int i, int i2, int i3, String msg) {
        InterfaceC08160Ts interfaceC08160Ts;
        String str;
        int i4;
        int i5;
        double d;
        double d2;
        double d3;
        Object obj;
        boolean z;
        InterfaceC05190Ih interfaceC05190Ih;
        if (i == 55 && (interfaceC08160Ts = this.magicGestureEffectAnchorHelper) != null) {
            C32241Oi c32241Oi = (C32241Oi) interfaceC08160Ts;
            o.LJIIIZ(msg, "msg");
            try {
                List<LiveEffect> LIZ = c32241Oi.LIZLLL.LIZ(C0TY.LIZIZ);
                o.LJIIIIZZ(LIZ, "composerManager.getCurre…cker(EffectPanel.STICKER)");
                LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLL(LIZ);
                if (liveEffect == null || (str = liveEffect.actionSchema) == null) {
                    str = "";
                }
                c32241Oi.LJFF = str;
                InterfaceC08140Tq interfaceC08140Tq = c32241Oi.LIZJ;
                if (interfaceC08140Tq != null) {
                    i4 = interfaceC08140Tq.LJIILJJIL();
                } else {
                    i4 = 720;
                }
                InterfaceC08140Tq interfaceC08140Tq2 = c32241Oi.LIZJ;
                if (interfaceC08140Tq2 != null) {
                    i5 = interfaceC08140Tq2.LJI();
                } else {
                    i5 = 1280;
                }
                if (i4 != 0 && i5 != 0) {
                    JSONObject jSONObject = new JSONObject(msg);
                    int optInt = jSONObject.optInt("status", 1);
                    long optLong = jSONObject.optLong("resource_id", 0L);
                    JSONObject optJSONObject = jSONObject.optJSONObject("point");
                    JSONObject optJSONObject2 = jSONObject.optJSONObject("radius");
                    int optInt2 = jSONObject.optInt("animation_duration", 0);
                    double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    if (optJSONObject != null) {
                        d = optJSONObject.optDouble("x", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        d2 = optJSONObject.optDouble("y", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    } else {
                        d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                        d2 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    }
                    if (optJSONObject2 == null) {
                        d3 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    } else {
                        d3 = optJSONObject2.optDouble("w", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        d4 = optJSONObject2.optDouble("h", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
                    if (LIZIZ != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
                        obj = Long.valueOf(interfaceC05190Ih.getId());
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObject2.put("anchor_id", obj);
                    jSONObject2.put("resource_id", optLong);
                    jSONObject2.put("status", optInt);
                    jSONObject2.put("action_schema", c32241Oi.LJFF);
                    jSONObject2.put("point_x", d);
                    jSONObject2.put("point_y", d2);
                    jSONObject2.put("radius_x", d3);
                    jSONObject2.put("radius_y", d4);
                    jSONObject2.put("animation_duration", optInt2);
                    InterfaceC08140Tq interfaceC08140Tq3 = c32241Oi.LIZJ;
                    if (interfaceC08140Tq3 != null) {
                        z = true;
                        interfaceC08140Tq3.LIZ("magic_gesture_activity_sei", jSONObject2, true);
                    } else {
                        z = true;
                    }
                    if (optInt == z) {
                        if (c32241Oi.LJ) {
                            BZI LIZ2 = C28787BRn.LIZ("livesdk_anchor_gesture_effect_success");
                            LIZ2.LJIILLIIL(c32241Oi.LIZ);
                            LIZ2.LJJIIJZLJL();
                        }
                        c32241Oi.LJ = false;
                    } else {
                        c32241Oi.LJ = z;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && i == 69) {
            if (msg != null) {
                dataChannel.rv0(DrawGuessCaptureImageChannel.class, msg);
                return;
            }
        } else if (i == 67) {
            if (i2 == 1) {
                if (i3 == 1) {
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                    C31691Mf.LJIIJ(msg);
                    return;
                } else {
                    if (i3 != 0) {
                        return;
                    }
                    ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGoalEffectHelper();
                    C31691Mf.LJIJJLI(msg);
                    return;
                }
            }
            if (i2 != 2 || this.mSelectedSticker == null || ((IEffectService) CN1.LIZ(IEffectService.class)).getEcEffectHelper() == null) {
                return;
            }
            C42691lx.LJII(this.mSelectedSticker, this.context, msg, (Long) this.dataChannel.kv0(BCN.class));
            return;
        }
        C30527ByV.LIZ(i, Integer.valueOf(i2), msg);
    }

    public int sendEffectMsg(int i, int i2, int i3, String str) {
        AbstractC30473Bxd abstractC30473Bxd = this.mCameraCapture;
        if (abstractC30473Bxd == null) {
            return 0;
        }
        return abstractC30473Bxd.LJIIIZ(i, i2, i3, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    public void showStickerPanel(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        ((C32537Cpp) this.dataChannel.gv0(C55032Dz.class)).LIZ = Boolean.valueOf(z2);
        ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveStickerLogManager().getClass();
        C32041No.LJIILLIIL = z2;
        ((IUserManageService) CN1.LIZ(IUserManageService.class)).Ye0(getRoomId(), this.dataChannel, 7);
        C30355Bvj.LJFF();
        DataChannel dataChannel = this.dataChannel;
        InterfaceC30442Bx8.y.LIZ(Boolean.FALSE);
        if (dataChannel != null) {
            dataChannel.pv0(EffectRedDotStatusChangeEvent.class);
        }
        if (this.context != null && this.dataChannel != null) {
            C7N.LJII().showStickerPanel(this.context, this.dataChannel, z, this.onStickerViewListener, z4, z5);
        }
        if (z3) {
            BZI LIZ = C28787BRn.LIZ("pm_live_sticker_click");
            LIZ.LJIILLIIL(this.dataChannel);
            LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_new_anchor_guide");
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            LIZ.LJIJJ(dataChannelGlobal.mv0(C55012Dx.class), "enter_from");
            LIZ.LJIJJ(dataChannelGlobal.mv0(C2E4.class), "banner_id");
            LIZ.LJIJJ(dataChannelGlobal.mv0(C2E5.class), "banner_from");
            LIZ.LJIJJ(0, "is_special_icon");
            LIZ.LJIJJ(0, "is_animation");
            LIZ.LJIJJ(((IBroadcastService) CN1.LIZ(IBroadcastService.class)).getBroadcastScene(), WM7.SCENE_SERVICE);
            LIZ.LJJIIJZLJL();
        }
    }
}
