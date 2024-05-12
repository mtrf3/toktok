package com.bytedance.android.livesdk.chatroom.detail;

import X.B35;
import X.B3K;
import X.B4E;
import X.B4I;
import X.B57;
import X.BJ9;
import X.BJD;
import X.BMZ;
import X.BQ0;
import X.BQ1;
import X.BQ2;
import X.BQ5;
import X.C0NB;
import X.C16880lQ;
import X.C28329B9x;
import X.C28639BLv;
import X.C28644BMa;
import X.C28735BPn;
import X.C28736BPo;
import X.C28739BPr;
import X.C28742BPu;
import X.C28746BPy;
import X.C38354F3m;
import X.C51093K3l;
import X.CN1;
import X.InterfaceC28738BPq;
import X.InterfaceC28740BPs;
import X.InterfaceC30442Bx8;
import X.VCA;
import X.X1D;
import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer2;
import com.bytedance.android.livesdk.livesetting.performance.degrade.AudioFocusControllerAsyncOptSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.EnableEnterRoomOptReuseRoomPlayerSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateSurfaceSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.TestDisablePullStreamSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.firstscreen.LiveMultiPlayerEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class RoomPlayer2 implements B35 {
    public int audioCurrentStatusStore;
    public String enterRoomScene;
    public C51093K3l entranceParam;
    public boolean hasLogPrePlayerHitCache;
    public boolean isBackground;
    public boolean isPreparePlayer;
    public boolean isReusePlayer;
    public boolean isReusePlayerWithFirstFrame;
    public boolean isSmoothEnter;
    public BJD liveRoomLogger;
    public C28736BPo mAudioFocusController;
    public WeakReference<InterfaceC28740BPs> mCallbackRef;
    public C28644BMa mConfig;
    public int mDecodeStatus;
    public boolean mHasAttached;
    public boolean mHasWarmedUp;
    public InterfaceC28738BPq mLivePlayController;
    public C28639BLv mLogger;
    public Handler mMainHandler;
    public String mMediaErrorMessage;
    public List<BQ0> mPendingCallbacks;
    public Runnable mPendingMessageRunnable;
    public BQ5 mPlayMessageListener;
    public String mPlayerTag;
    public WeakReference<B4E> mRenderViewRef;
    public boolean mStopOnPlayingOther;
    public WeakReference<Context> mTagContextRef;
    public boolean multiPlayer;
    public String reusePlayerTag;
    public long roomId;
    public long startTime;

    @Override // X.B35
    public void onBackground() {
        this.isBackground = true;
        if (!InterfaceC30442Bx8.LLJJJJLIIL.LIZJ().booleanValue()) {
            lambda$setMuteNew$0(true, "bgplay close");
            return;
        }
        if (!C28329B9x.LIZIZ(getTagContext()) && InterfaceC30442Bx8.LLJJJJ.LIZJ().booleanValue()) {
            lambda$setMuteNew$0(true, "bgplay close");
            return;
        }
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo == null) {
            return;
        }
        c28736BPo.LIZIZ(true);
    }

    @Override // X.B35
    public void onForeground() {
        this.isBackground = false;
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo == null) {
            return;
        }
        c28736BPo.LIZIZ(false);
        this.mAudioFocusController.LIZLLL(getTagContext(), this.mPlayerTag);
    }

    @Override // X.B35
    public /* bridge */ /* synthetic */ void setSeiOpen(boolean z) {
    }

    @Override // X.B35
    public boolean warmUp() {
        this.mHasWarmedUp = true;
        return start();
    }

    private boolean doStart() {
        int i;
        boolean z;
        InterfaceC28738BPq interfaceC28738BPq;
        this.mLogger.LIZJ = this.mHasWarmedUp;
        setLivePlayEntranceParamFromConfig();
        if (this.isReusePlayer && (interfaceC28738BPq = this.mLivePlayController) != null) {
            this.isReusePlayerWithFirstFrame = interfaceC28738BPq.LJIJJLI();
        }
        C28639BLv c28639BLv = this.mLogger;
        boolean z2 = this.isReusePlayer;
        boolean z3 = this.isReusePlayerWithFirstFrame;
        c28639BLv.getClass();
        if (z2) {
            if (z3) {
                i = 1;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        c28639BLv.LIZLLL = i;
        if (this.multiPlayer && this.mLivePlayController != null) {
            ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJIIJJI(this.mPlayerTag, this.mLivePlayController);
        }
        int i2 = this.mConfig.LJII;
        if (i2 == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long currentTimeMillis = System.currentTimeMillis();
            this.startTime = currentTimeMillis;
            this.mLogger.LJI(Long.valueOf(currentTimeMillis), "room_player_start");
            this.isBackground = false;
            doStartPlayByMultiPullStreamData();
        } else {
            if (i2 != 2) {
                return false;
            }
            long currentTimeMillis2 = System.currentTimeMillis();
            this.startTime = currentTimeMillis2;
            this.mLogger.LJI(Long.valueOf(currentTimeMillis2), "room_player_start");
            this.isBackground = false;
            doStartPlayByStreamUrl();
        }
        return true;
    }

    private void doStartPlayByMultiPullStreamData() {
        C28746BPy c28746BPy;
        if (this.mConfig == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play stream data: ");
        LIZ.append(this.mConfig.LIZJ);
        LIZ.append(", streamType: ");
        LIZ.append(this.mConfig.LJ);
        B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ));
        try {
            StreamUrlExtra.SrConfig srConfig = this.mConfig.LJFF;
            if (srConfig != null) {
                BQ1 bq1 = new BQ1();
                bq1.LIZ = srConfig.enabled;
                bq1.LIZIZ = srConfig.antiAlias;
                bq1.LIZJ = srConfig.strength;
                c28746BPy = new C28746BPy(bq1);
            } else {
                c28746BPy = null;
            }
            InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
            C28644BMa c28644BMa = this.mConfig;
            interfaceC28738BPq.LJJIJL(c28644BMa.LIZ, c28644BMa.LIZIZ, getRenderView(), this.mConfig.LJ.ordinal(), c28746BPy, this.mPlayMessageListener, this.mPlayerTag);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            InterfaceC28740BPs callback = getCallback();
            if (callback != null) {
                callback.onError(e);
            }
        }
    }

    private void doStartPlayByStreamUrl() {
        C28746BPy c28746BPy;
        if (this.mConfig == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play url: ");
        LIZ.append(this.mConfig.LIZJ);
        LIZ.append(", streamType: ");
        LIZ.append(this.mConfig.LJ);
        B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ));
        try {
            StreamUrlExtra.SrConfig srConfig = this.mConfig.LJFF;
            if (srConfig != null) {
                BQ1 bq1 = new BQ1();
                bq1.LIZ = srConfig.enabled;
                bq1.LIZIZ = srConfig.antiAlias;
                bq1.LIZJ = srConfig.strength;
                c28746BPy = new C28746BPy(bq1);
            } else {
                c28746BPy = null;
            }
            this.mLivePlayController.LJJJIL(this.mConfig.LIZJ, getRenderView(), this.mConfig.LJ.ordinal(), c28746BPy, this.mPlayMessageListener, this.mConfig.LIZLLL, this.mPlayerTag);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            InterfaceC28740BPs callback = getCallback();
            if (callback != null) {
                callback.onError(e);
            }
        }
    }

    private B4E getRenderView() {
        WeakReference<B4E> weakReference = this.mRenderViewRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void reusePlayerAndBgOptRecordFirstFrame() {
        long currentTimeMillis;
        if (this.isReusePlayer && this.isReusePlayerWithFirstFrame && EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue()) {
            if (this.mLivePlayController.LJIJJLI() && this.isSmoothEnter) {
                long LJFF = this.mLogger.LJFF();
                this.mLogger.LJI(Long.valueOf(LJFF), "first_frame");
                InterfaceC28740BPs callback = getCallback();
                if (callback != null) {
                    callback.m(this.mLogger.LIZLLL(), this.mLogger.LJ());
                }
                BJD bjd = this.liveRoomLogger;
                if (bjd != null) {
                    ((BJ9) bjd).LJJJLL = LJFF;
                    return;
                }
                return;
            }
            B3K b3k = this.mLogger.LIZIZ;
            if (b3k != null) {
                currentTimeMillis = b3k.LJII;
            } else {
                currentTimeMillis = System.currentTimeMillis();
            }
            this.mLogger.LJI(Long.valueOf(currentTimeMillis), "first_frame");
            InterfaceC28740BPs callback2 = getCallback();
            if (callback2 != null) {
                callback2.m(this.mLogger.LIZLLL(), this.mLogger.LJ());
            }
            BJD bjd2 = this.liveRoomLogger;
            if (bjd2 == null) {
                return;
            }
            ((BJ9) bjd2).LJJJLL = currentTimeMillis;
        }
    }

    private void setLivePlayEntranceParamFromConfig() {
        if (this.mLivePlayController == null) {
            return;
        }
        EnterRoomConfig enterRoomConfig = B57.LIZ.LIZ().mEnterRoomConfig;
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        String str = roomsData.enterFromMerge;
        String str2 = roomsData.enterMethod;
        String str3 = roomsData.actionType;
        if (C38354F3m.LJ(str3)) {
            if (enterRoomConfig.mLogData.loadDuration > 0) {
                str3 = "draw";
            } else {
                str3 = "click";
            }
        }
        C51093K3l c51093K3l = new C51093K3l(str, str2, str3);
        this.entranceParam = c51093K3l;
        this.mLivePlayController.LJJIIJZLJL(c51093K3l);
    }

    public long getAudioLostFocusTime() {
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo == null) {
            return -1L;
        }
        return c28736BPo.LJ;
    }

    public InterfaceC28740BPs getCallback() {
        WeakReference<InterfaceC28740BPs> weakReference = this.mCallbackRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // X.B35
    public String getCurrentResolution() {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            return interfaceC28738BPq.getCurrentResolution();
        }
        return "";
    }

    @Override // X.B35
    public String getCurrentUrl() {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq == null) {
            return "";
        }
        return interfaceC28738BPq.getCurrentUrl();
    }

    public Context getTagContext() {
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // X.B35
    public boolean isPlaying() {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null && interfaceC28738BPq.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // X.B35
    public boolean isVideoHorizontal() {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null && interfaceC28738BPq.isVideoHorizontal()) {
            return true;
        }
        return false;
    }

    @Override // X.B35
    public void preparePlayer() {
        InterfaceC28738BPq LIZJ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZJ(this.mPlayerTag);
        C28644BMa c28644BMa = this.mConfig;
        LIZJ.LJJII(c28644BMa.LIZ, c28644BMa.LIZIZ);
    }

    @Override // X.B35
    public void restoreAudioStatus() {
        int i;
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo != null && (i = this.audioCurrentStatusStore) != -100) {
            c28736BPo.LIZ = i;
            this.audioCurrentStatusStore = -100;
        }
    }

    @Override // X.B35
    public void saveAudioStatus() {
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo != null) {
            this.audioCurrentStatusStore = c28736BPo.LIZ;
        }
    }

    @Override // X.B35
    public boolean start() {
        if (TestDisablePullStreamSetting.INSTANCE.getValue()) {
            B4I.LIZ("RoomPlayer2", "block pull stream -> it only valid for offline packages");
            return true;
        }
        if (this.mConfig == null || this.mLivePlayController != null) {
            reusePlayerAndBgOptRecordFirstFrame();
            return true;
        }
        if (this.multiPlayer && this.isReusePlayer && !C38354F3m.LJ(this.reusePlayerTag)) {
            ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LJIIIIZZ(this.reusePlayerTag, this.mPlayerTag);
        }
        InterfaceC28738BPq LIZJ = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).Tx().LIZJ(this.mPlayerTag);
        this.mLivePlayController = LIZJ;
        LIZJ.LJIJ(new BQ2(((IPullStreamService) CN1.LIZ(IPullStreamService.class)).th(), this));
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        this.mConfig.getClass();
        interfaceC28738BPq.LJJJJL();
        this.mLivePlayController.LJIIL(this.mConfig.LJI);
        this.mAudioFocusController = new C28736BPo(this.mLivePlayController);
        return doStart();
    }

    @Override // X.B35
    public boolean startWithNewLivePlayer() {
        if (this.mLivePlayController != null) {
            return true;
        }
        if (this.mConfig.LJII == 0) {
            return false;
        }
        InterfaceC28738BPq h0 = ((IPullStreamService) CN1.LIZ(IPullStreamService.class)).h0();
        this.mLivePlayController = h0;
        h0.LJIILJJIL();
        this.mLivePlayController.LJJJJL();
        this.mAudioFocusController = new C28736BPo(this.mLivePlayController);
        return doStart();
    }

    @Override // X.B35
    public boolean tryResumePlay() {
        if (!this.mStopOnPlayingOther) {
            return false;
        }
        this.mStopOnPlayingOther = false;
        return doStart();
    }

    @Override // X.B35
    public void tryToStartAudioDevice() {
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo != null) {
            c28736BPo.LIZLLL(getTagContext(), this.mPlayerTag);
        }
    }

    @Override // X.B35
    public void tryToUploadFirstScreenTime() {
        this.mLogger.LJII();
    }

    @Override // X.B35
    public boolean pipResumePlay() {
        return doStart();
    }

    @Override // X.B35
    public void recycle() {
        BMZ LIZIZ = BMZ.LIZIZ();
        LIZIZ.getClass();
        String playerTag = getPlayerTag();
        if (playerTag == null) {
            return;
        }
        release();
        ((HashMap) LIZIZ.LIZ).remove(playerTag);
        ((LinkedList) LIZIZ.LIZIZ).offer(this);
    }

    @Override // X.B35
    public void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.roomId);
        LIZ.append(", release -> roomPlayer release and reset param");
        B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ));
        this.mAudioFocusController = null;
        this.mLivePlayController = null;
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.isPreparePlayer = false;
        this.hasLogPrePlayerHitCache = false;
        this.isBackground = false;
        this.mPendingCallbacks.clear();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.isReusePlayer = false;
        this.reusePlayerTag = null;
        this.isReusePlayerWithFirstFrame = false;
        this.isSmoothEnter = false;
        this.startTime = 0L;
        this.mPlayerTag = null;
        this.roomId = 0L;
        this.entranceParam = null;
        C28639BLv c28639BLv = this.mLogger;
        ((ConcurrentHashMap) c28639BLv.LIZ).clear();
        c28639BLv.LIZIZ = null;
        c28639BLv.LIZJ = false;
        c28639BLv.LJFF = false;
        c28639BLv.LIZLLL = 0;
        c28639BLv.LJ = false;
        this.mConfig = null;
        WeakReference<Context> weakReference = this.mTagContextRef;
        if (weakReference != null) {
            weakReference.clear();
            this.mTagContextRef = null;
        }
        WeakReference<InterfaceC28740BPs> weakReference2 = this.mCallbackRef;
        if (weakReference2 != null) {
            weakReference2.clear();
            this.mCallbackRef = null;
        }
        WeakReference<B4E> weakReference3 = this.mRenderViewRef;
        if (weakReference3 != null) {
            weakReference3.clear();
            this.mRenderViewRef = null;
        }
    }

    @Override // X.B35
    public int getDecodeStatus() {
        return this.mDecodeStatus;
    }

    @Override // X.B35
    public boolean getIsPreparePlayer() {
        return this.isPreparePlayer;
    }

    @Override // X.B35
    public String getMediaErrorMessage() {
        return this.mMediaErrorMessage;
    }

    @Override // X.B35
    public boolean getPlayerHasLogPrePlayerHitCache() {
        return this.hasLogPrePlayerHitCache;
    }

    @Override // X.B35
    public String getPlayerTag() {
        return this.mPlayerTag;
    }

    public long getRoomId() {
        return this.roomId;
    }

    @Override // X.B35
    public long getStartTime() {
        return this.startTime;
    }

    @Override // X.B35
    public C28639BLv getLogger() {
        return this.mLogger;
    }

    @Override // X.B35
    public void changeSRSupportScene(boolean z) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.changeSRSupportScene(z);
        }
    }

    @Override // X.B35
    public void getVideoSize(int[] iArr) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq == null || iArr == null) {
            return;
        }
        int videoSize = interfaceC28738BPq.getVideoSize();
        iArr[0] = 65535 & videoSize;
        iArr[1] = videoSize >> 16;
    }

    public void onPlayerLog(JSONObject jSONObject) {
        C28639BLv c28639BLv = this.mLogger;
        c28639BLv.getClass();
        if (jSONObject == null || !TextUtils.equals(jSONObject.optString("event_key"), "first_frame")) {
            return;
        }
        String[] strArr = C28639BLv.LJII;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            long optLong = jSONObject.optLong(C28639BLv.LJIIIIZZ[i], 0L);
            if (optLong != 0) {
                ((ConcurrentHashMap) c28639BLv.LIZ).put(str, Long.valueOf(optLong));
            }
        }
    }

    @Override // X.B35
    public boolean preCreatedSurface(Context context) {
        boolean preCreatedSurface = this.mLivePlayController.preCreatedSurface(context);
        this.mLogger.LJ = preCreatedSurface;
        return preCreatedSurface;
    }

    @Override // X.B35
    public void setAnchorInteractMode(boolean z) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.setAnchorInteractMode(z);
        }
    }

    @Override // X.B35
    public void setAudioRespondDisableForQuiz(boolean z) {
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo != null) {
            c28736BPo.LJFF = z;
        }
    }

    @Override // X.B35
    public void setEnterRoomScene(String str) {
        if (str != null) {
            this.enterRoomScene = str;
        }
    }

    @Override // X.B35
    public void setIsPreparePlayer(boolean z) {
        this.isPreparePlayer = z;
    }

    public void setLiveRoomLogger(BJD bjd) {
        this.liveRoomLogger = bjd;
    }

    @Override // X.B35
    public void setPlayerHashLogPrePlayerHitCache(boolean z) {
        this.hasLogPrePlayerHitCache = z;
    }

    @Override // X.B35
    public void setPrePullStream(boolean z) {
        if (this.mHasWarmedUp) {
            return;
        }
        this.mHasWarmedUp = z;
    }

    @Override // X.B35
    public void setScreenOrientation(boolean z) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.setScreenOrientation(z);
        }
    }

    @Override // X.B35
    public void stop(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop -> playerTag=");
        LIZ.append(this.mPlayerTag);
        LIZ.append(", needRelease: ");
        LIZ.append(z);
        B4I.LIZ("RoomPlayer2", X1D.LIZIZ(LIZ));
        String str = this.mPlayerTag;
        if (str == null) {
            return;
        }
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo != null) {
            if (z) {
                c28736BPo.LJ(str);
            } else {
                C28739BPr c28739BPr = c28736BPo.LIZIZ;
                HashSet hashSet = (HashSet) C28742BPu.LIZJ;
                hashSet.remove(c28739BPr);
                if (hashSet.isEmpty()) {
                    try {
                        C28742BPu.LIZ.abandonAudioFocus(C28742BPu.LIZIZ);
                    } catch (Exception unused) {
                        C0NB.LJIIL("AudioFocusUtil", "returnFocus error");
                    }
                }
            }
            this.mAudioFocusController = null;
        }
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.LJII(this.mPlayerTag);
            if (z) {
                this.mLivePlayController.LJI(this.mPlayerTag);
            }
            this.mLivePlayController = null;
        }
        this.mDecodeStatus = 0;
        this.mMediaErrorMessage = null;
        this.mStopOnPlayingOther = false;
        this.mMainHandler.removeCallbacks(this.mPendingMessageRunnable);
    }

    @Override // X.B35
    public void stopWhenJoinInteract(Context context) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq == null) {
            return;
        }
        interfaceC28738BPq.LJJIZ(this.mPlayerTag);
    }

    @Override // X.B35
    public void stopWhenPlayingOther(Context context) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq == null) {
            return;
        }
        interfaceC28738BPq.LJJIJLIJ(this.mPlayerTag);
    }

    @Override // X.B35
    public void switchResolution(String str) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.switchResolution(str);
        }
    }

    @Override // X.B35
    public void initialize(long j, C28644BMa c28644BMa) {
        this.roomId = j;
        this.mConfig = c28644BMa;
        if (this.isPreparePlayer) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prepare_");
            LIZ.append(this.roomId);
            LIZ.append("_");
            LIZ.append(SystemClock.uptimeMillis());
            this.mPlayerTag = X1D.LIZIZ(LIZ);
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.roomId);
        LIZ2.append("_");
        LIZ2.append(SystemClock.uptimeMillis());
        this.mPlayerTag = X1D.LIZIZ(LIZ2);
    }

    @Override // X.B35
    /* renamed from: setMute, reason: merged with bridge method [inline-methods] */
    public void lambda$setMuteNew$0(boolean z, String str) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.LJJJJ(this.mPlayerTag, str, z);
        }
    }

    @Override // X.B35
    public void setMuteNew(final boolean z, final String str) {
        if (AudioFocusControllerAsyncOptSetting.INSTANCE.getEnable()) {
            C28736BPo.LJIIIIZZ.LIZ().execute(new Runnable() { // from class: X.BQ4
                @Override // java.lang.Runnable
                public final void run() {
                    RoomPlayer2.this.lambda$setMuteNew$0(z, str);
                }
            });
        } else {
            lambda$setMuteNew$0(z, str);
        }
    }

    @Override // X.B35
    public void switchResolution(String str, VCA vca) {
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            if (vca != null) {
                interfaceC28738BPq.switchResolution(str, vca);
            } else {
                interfaceC28738BPq.switchResolution(str);
            }
        }
    }

    public RoomPlayer2(long j, C28644BMa c28644BMa, boolean z) {
        this.mPendingCallbacks = new ArrayList();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.isReusePlayer = false;
        this.isReusePlayerWithFirstFrame = false;
        this.audioCurrentStatusStore = -100;
        this.mMainHandler = new Handler(C16880lQ.LLJJJJ());
        this.mPendingMessageRunnable = new ARunnableS41S0100000_5(this, 116);
        this.mLogger = new C28639BLv();
        this.entranceParam = null;
        this.reusePlayerTag = null;
        this.multiPlayer = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        this.isSmoothEnter = false;
        this.hasLogPrePlayerHitCache = false;
        this.mPlayMessageListener = new C28735BPn(this);
        this.isPreparePlayer = z;
        initialize(j, c28644BMa);
    }

    @Override // X.B35
    public void attach(Context context, B4E b4e, InterfaceC28740BPs interfaceC28740BPs) {
        this.mTagContextRef = new WeakReference<>(context);
        this.mCallbackRef = new WeakReference<>(interfaceC28740BPs);
        this.mRenderViewRef = new WeakReference<>(b4e);
        InterfaceC28738BPq interfaceC28738BPq = this.mLivePlayController;
        if (interfaceC28738BPq != null) {
            interfaceC28738BPq.LJJJJJ(b4e);
        }
        C28736BPo c28736BPo = this.mAudioFocusController;
        if (c28736BPo != null) {
            c28736BPo.LIZLLL(context, this.mPlayerTag);
        }
        this.mHasAttached = true;
        if (interfaceC28740BPs != null) {
            if (LivePreCreateSurfaceSetting.INSTANCE.getValue() || (this.isReusePlayer && EnableEnterRoomOptReuseRoomPlayerSetting.INSTANCE.getValue())) {
                this.mMainHandler.postAtFrontOfQueue(this.mPendingMessageRunnable);
            } else {
                this.mMainHandler.post(this.mPendingMessageRunnable);
            }
        }
    }

    @Override // X.B35
    public void setReusePlayer(boolean z, String str, boolean z2) {
        this.isReusePlayer = z;
        this.reusePlayerTag = str;
        this.isSmoothEnter = z2;
    }

    public RoomPlayer2(long j, C28644BMa c28644BMa, B4E b4e, InterfaceC28740BPs interfaceC28740BPs) {
        this.mPendingCallbacks = new ArrayList();
        this.mHasAttached = false;
        this.mHasWarmedUp = false;
        this.isReusePlayer = false;
        this.isReusePlayerWithFirstFrame = false;
        this.audioCurrentStatusStore = -100;
        this.mMainHandler = new Handler(C16880lQ.LLJJJJ());
        this.mPendingMessageRunnable = new ARunnableS41S0100000_5(this, 116);
        this.mLogger = new C28639BLv();
        this.entranceParam = null;
        this.reusePlayerTag = null;
        this.multiPlayer = LiveMultiPlayerEnableSetting.INSTANCE.getValue();
        this.isSmoothEnter = false;
        this.isPreparePlayer = false;
        this.hasLogPrePlayerHitCache = false;
        this.mPlayMessageListener = new C28735BPn(this);
        initialize(j, c28644BMa);
        this.mRenderViewRef = new WeakReference<>(b4e);
        this.mCallbackRef = new WeakReference<>(interfaceC28740BPs);
    }
}
