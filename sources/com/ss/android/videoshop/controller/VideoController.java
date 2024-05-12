package com.ss.android.videoshop.controller;

import X.AbstractC47819Ipj;
import X.C05L;
import X.C07670Rv;
import X.C0EH;
import X.C16880lQ;
import X.C1JX;
import X.C25990AHy;
import X.C46886Iag;
import X.C47160If6;
import X.C47163If9;
import X.C47164IfA;
import X.C47575Iln;
import X.C47620ImW;
import X.C47789IpF;
import X.C48041ItJ;
import X.C48217Iw9;
import X.C61845OOz;
import X.C78702Uug;
import X.C78949Uyf;
import X.C78999UzT;
import X.C79985VaH;
import X.C79994VaQ;
import X.C87407YSd;
import X.C87416YSm;
import X.EnumC47176IfM;
import X.EnumC48216Iw8;
import X.EnumC48219IwB;
import X.EnumC81331Vvz;
import X.InterfaceC46853Ia9;
import X.InterfaceC46854IaA;
import X.InterfaceC47042IdC;
import X.InterfaceC47896Iqy;
import X.InterfaceC48221IwD;
import X.InterfaceC58392Mvs;
import X.InterfaceC87404YSa;
import X.InterfaceC87405YSb;
import X.InterfaceC87410YSg;
import X.KMP;
import X.UC0;
import X.UC7;
import X.V10;
import X.VIA;
import X.VIF;
import X.X1D;
import X.YDG;
import X.YS7;
import X.YSH;
import X.YSL;
import X.YSM;
import X.YSP;
import X.YSV;
import X.YSZ;
import X.YTA;
import X.YTJ;
import Y.ARunnableS18S0201000_15;
import Y.ARunnableS51S0100000_15;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.TTVideoEngineImpl;
import defpackage.b0;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public class VideoController extends C47575Iln implements YS7, InterfaceC46854IaA, InterfaceC46853Ia9, InterfaceC47042IdC {
    public boolean asyncPosition;
    public boolean asyncRelease;
    public boolean autoQuality;
    public EnumC47176IfM autoResolution;
    public int bufferCount;
    public int earDurationForLastLoop;
    public C47789IpF error;
    public boolean forceUseLitePlayer;
    public boolean loop;
    public int loopEarStayDuration;
    public int loopWatchedDuration;
    public SurfaceHolder mSurfaceHolder;
    public C47164IfA mVideoModel;
    public int mVideoViewType;
    public boolean mute;
    public boolean onErrorReceived;
    public VIA pendingActionManager;
    public boolean playCalled;
    public boolean playCompleted;
    public C79985VaH playEntity;
    public int playStartType;
    public C46886Iag playbackParams;
    public int playerType;
    public boolean prepareCalled;
    public boolean prepared;
    public boolean preparing2Play;
    public int renderMode;
    public boolean renderStarted;
    public EnumC47176IfM resolution;
    public int resolutionCount;
    public boolean seekToEnd;
    public boolean shouldMarkPushTime;
    public long startPlayPosition;
    public List<C47160If6> supportedVideoInfoList;
    public Surface surface;
    public EnumC47176IfM targetResolution;
    public boolean tryToInterceptPlay;
    public AbstractC47819Ipj ttvNetClient;
    public YTJ videoContext;
    public TTVideoEngine videoEngine;
    public InterfaceC58392Mvs videoEngineFactory;
    public SparseArray<C47160If6> videoInfos;
    public InterfaceC87405YSb videoPlayConfiger;
    public InterfaceC87404YSa videoPlayListener;
    public YSH videoStateInquirer;
    public int watchedDurationForLastLoop;
    public boolean rememberVideoPosition = true;
    public boolean canCountBuffer = true;
    public boolean releaseEngineEnabled = true;
    public String currentQualityDesc = "";
    public C87407YSd dataSource = new C87407YSd();
    public Map<String, C47620ImW> videoEngineInfoMap = new HashMap();
    public YSZ weakMaskInfo = new YSZ(this);
    public YSV mExternalSubtitlesInfo = new YSV(this);
    public long enginePoolsStartPos = -1;
    public boolean mVideoMethodOpt = false;
    public int mLastProgressUpdatePosition = 0;
    public boolean mStopToPlay = false;
    public Runnable playRunnable = new ARunnableS51S0100000_15(this, 59);
    public WeakHandler.IHandler handlerListener = new YSL(this);
    public WeakHandler handler = new WeakHandler(this.handlerListener);
    public InterfaceC47896Iqy mSeekCompletionListener = new C87416YSm(this);

    private int getVideoSegmentFormatFlag(boolean z) {
        return z ? 2 : 4;
    }

    public /* bridge */ /* synthetic */ String getEncryptedLocalTime() {
        return null;
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ void onAVBadInterlaced(Map map) {
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ void onCurrentPlaybackTimeUpdate(TTVideoEngine tTVideoEngine, int i) {
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ void onFrameAboutToBeRendered(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public /* bridge */ /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    private void clearSurfaceOrSurfaceHolder() {
        int i = this.mVideoViewType;
        if (i == 0 || i == 2) {
            this.videoEngine.LLILZIL(null);
        } else {
            this.videoEngine.LLILZLL(null);
        }
    }

    private void doPlay() {
        String str;
        InterfaceC87405YSb interfaceC87405YSb;
        if (this.videoEngine != null) {
            try {
                if (this.tryToInterceptPlay && ((this.videoInfos != null || this.supportedVideoInfoList != null) && (interfaceC87405YSb = this.videoPlayConfiger) != null && interfaceC87405YSb.LIZIZ(C16880lQ.LLJJI(C78999UzT.LJLIL)))) {
                    EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_INTERCEPT_DO_PLAY, null, null, this.videoStateInquirer);
                    return;
                }
                if (isVideoPlayCompleted()) {
                    this.playStartType = 3;
                    str = "replay";
                } else if (isPaused()) {
                    this.playStartType = 2;
                    str = "pause2play";
                } else if (this.preparing2Play) {
                    this.playStartType = 5;
                    str = "preparing2play";
                } else if (this.prepared) {
                    this.playStartType = 4;
                    str = "prepared2play";
                } else if (this.mStopToPlay) {
                    this.playStartType = 6;
                    str = "stop2play";
                } else {
                    this.playStartType = 1;
                    str = "release2play";
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("doPlay mute:");
                LIZ.append(this.mute);
                X1D.LIZIZ(LIZ);
                this.videoEngine.LJLZ(this.mute);
                setRenderMode(this.renderMode);
                this.videoEngine.LLFII(this.loop);
                this.playCompleted = false;
                if (!this.mVideoMethodOpt) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("play volume:");
                    LIZ2.append(this.videoEngine.LJJJJ());
                    LIZ2.append(" max volume:");
                    LIZ2.append(this.videoEngine.LJJIIZ());
                    X1D.LIZIZ(LIZ2);
                }
                if (this.prepareCalled) {
                    this.videoEngine.LJLLLL(100, 1);
                }
                C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("EnginePlay", YDG.PLAY, 6);
                if (LIZIZ != null) {
                    LIZIZ.LIZ("type", str);
                    EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
                }
                this.videoEngine.LJJLI();
                InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
                if (interfaceC87404YSa != null && !this.preparing2Play) {
                    interfaceC87404YSa.onEnginePlayStart(this.videoStateInquirer, this.playEntity, this.playStartType);
                }
                EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_DO_ENGINE_PLAY, null, null, this.videoStateInquirer);
            } catch (Exception e) {
                Logger.throwException(e);
            }
        }
    }

    private List<String> geRealSupportedQualityInfos() {
        String[] LLJJL;
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && (LLJJL = tTVideoEngine.LLJJL()) != null && LLJJL.length > 0 && (LLJJL.length != 1 || !TextUtils.isEmpty(LLJJL[0]))) {
            return Arrays.asList(LLJJL);
        }
        ArrayList arrayList = new ArrayList();
        C47164IfA c47164IfA = this.mVideoModel;
        if (c47164IfA != null && c47164IfA.LIZLLL() != null) {
            for (C47160If6 c47160If6 : this.mVideoModel.LIZLLL()) {
                if (c47160If6 != null) {
                    String LIZIZ = c47160If6.LIZIZ(32);
                    if (!TextUtils.isEmpty(LIZIZ)) {
                        arrayList.add(LIZIZ);
                    }
                }
            }
        }
        return arrayList;
    }

    private void init() {
        this.videoStateInquirer = new YSH(this, this.videoContext);
        this.videoEngineFactory = new C78949Uyf();
        this.videoPlayConfiger = new C78702Uug();
        this.pendingActionManager = new VIA();
    }

    private void onBufferEnd() {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onBufferEnd(this.videoStateInquirer, this.playEntity);
        }
    }

    private void onBufferStart() {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onBufferStart(this.videoStateInquirer, this.playEntity);
        }
        if (this.canCountBuffer) {
            this.bufferCount++;
        } else {
            this.canCountBuffer = true;
        }
        InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
        if (interfaceC87404YSa2 != null) {
            interfaceC87404YSa2.onBufferCount(this.videoStateInquirer, this.playEntity, this.bufferCount);
        }
    }

    private void pauseProgressUpdate() {
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.removeMessages(EnumC81331Vvz.UPDATE_PROGRESS.getWhat());
        }
    }

    private void releaseEngineWhenErr() {
        C47789IpF c47789IpF;
        int i;
        if (this.onErrorReceived) {
            if (this.videoEngine != null && (c47789IpF = this.error) != null && (i = c47789IpF.LIZIZ) != 10408 && i != 50401) {
                EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCErrRelease", YDG.PLAY, 0));
                InterfaceC58392Mvs interfaceC58392Mvs = this.videoEngineFactory;
                if (interfaceC58392Mvs instanceof InterfaceC87410YSg) {
                    ((InterfaceC87410YSg) interfaceC58392Mvs).LIZJ();
                }
                if (this.asyncRelease) {
                    this.videoEngine.LJJLIIIJJI();
                } else {
                    this.videoEngine.LJJLIIIJILLIZJL();
                }
                clearVideoEngineListeners(this.videoEngine);
                this.videoEngine = null;
                EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_RELEASE_ENGINE_WHEN_ERR, null, this.error, this.videoStateInquirer);
            }
            this.error = null;
        }
    }

    private void setEngineParams() {
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCSetEngineParams", YDG.PLAY, 0));
        if (this.mVideoMethodOpt) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("videoEngine setPlayAPIVersion. videoEngine:");
            LIZ.append(this.videoEngine);
            LIZ.append(", vid:");
            LIZ.append(this.playEntity.LIZ);
            LIZ.append(", hashCode:");
            LIZ.append(hashCode());
            X1D.LIZIZ(LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("videoEngine setPlayAPIVersion. videoEngine:");
            LIZ2.append(this.videoEngine);
            LIZ2.append(", vid:");
            LIZ2.append(this.playEntity.LIZ);
            LIZ2.append(", hashCode:");
            LIZ2.append(hashCode());
            LIZ2.append(", thread:");
            LIZ2.append(C16880lQ.LLLLIIIILLL());
            X1D.LIZIZ(LIZ2);
        }
        this.playEntity.getClass();
        this.playEntity.getClass();
        if (!TextUtils.isEmpty(null)) {
            TTVideoEngine tTVideoEngine = this.videoEngine;
            this.playEntity.getClass();
            tTVideoEngine.LLII(1, null);
        } else {
            this.videoEngine.LLII(0, "");
        }
        if (TextUtils.isEmpty(this.playEntity.LJII)) {
            this.videoEngine.LLJIJIL("");
        } else {
            this.videoEngine.LLJIJIL(this.playEntity.LJII);
        }
        this.playEntity.getClass();
        if (TextUtils.isEmpty(null)) {
            this.videoEngine.LLILZ("");
        } else {
            TTVideoEngine tTVideoEngine2 = this.videoEngine;
            this.playEntity.getClass();
            tTVideoEngine2.LLILZ(null);
        }
        this.playEntity.getClass();
        this.videoEngine.LJLJI(this.dataSource);
        this.playEntity.getClass();
        if (!TextUtils.isEmpty(null)) {
            TTVideoEngine tTVideoEngine3 = this.videoEngine;
            this.playEntity.getClass();
            tTVideoEngine3.LJLJLLL(null);
        } else {
            this.videoEngine.LJLJLLL("");
        }
        this.playEntity.getClass();
        if (!TextUtils.isEmpty(null)) {
            TTVideoEngine tTVideoEngine4 = this.videoEngine;
            this.playEntity.getClass();
            tTVideoEngine4.LJLJJL(null);
        } else {
            this.videoEngine.LJLJJL("");
        }
        C46886Iag c46886Iag = this.playbackParams;
        if (c46886Iag != null) {
            this.videoEngine.LLIIIJ(c46886Iag);
        }
    }

    private void setSurfaceOrSurfaceHolder() {
        int i = this.mVideoViewType;
        if (i == 0) {
            this.videoEngine.LLILZIL(this.surface);
        } else if (i == 2) {
            this.videoEngine.LLJ(this.surface);
        } else {
            this.videoEngine.LLILZLL(this.mSurfaceHolder);
        }
    }

    public void cleanVideoEngine() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLI(null);
            this.videoEngine.LLJJIII(null);
            this.videoEngine.LLJJIJI(null);
            this.videoEngine.LLFZ(null);
            this.videoEngine.LLILLL(null);
        }
        TTVideoEngine tTVideoEngine2 = this.videoEngine;
        if (tTVideoEngine2 != null) {
            AbstractC47819Ipj abstractC47819Ipj = this.ttvNetClient;
            if (abstractC47819Ipj != null) {
                tTVideoEngine2.LLI(abstractC47819Ipj);
            }
            this.videoEngine.LLJJIII(this);
            this.videoEngine.LLJJIJI(this);
        }
        this.videoEngine = null;
    }

    @Override // X.YS7
    public void clearSurfaceIfUseSurfaceView() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJ(null);
        }
    }

    @Override // X.YS7
    public YSP fetchVideoSnapshotInfo() {
        YSP ysp = new YSP();
        ysp.LIZ = this.videoEngine;
        ysp.LIZIZ = this.playCompleted;
        ysp.LIZJ = this.playEntity;
        EnumC47176IfM enumC47176IfM = this.resolution;
        ysp.LIZLLL = enumC47176IfM;
        ysp.LJ = this.resolutionCount;
        ysp.LJFF = this.playbackParams;
        SparseArray<C47160If6> sparseArray = this.videoInfos;
        ysp.LJI = sparseArray;
        if (sparseArray != null && enumC47176IfM != null) {
            sparseArray.get(enumC47176IfM.getIndex());
        }
        ysp.LJII = this.loop;
        ysp.LJIIJ = this.asyncRelease;
        return ysp;
    }

    public EnumC47176IfM getAutoResolution() {
        EnumC47176IfM LJIJJLI;
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && (LJIJJLI = tTVideoEngine.LJIJJLI()) != null && this.autoResolution != LJIJJLI) {
            this.autoResolution = LJIJJLI;
        }
        return this.autoResolution;
    }

    @Override // X.YS7
    public int getCurrentPosition() {
        return getCurrentPosition(this.asyncPosition);
    }

    @Override // X.YS7
    public String getCurrentQualityDesc() {
        TTVideoEngine tTVideoEngine;
        TTVideoEngine tTVideoEngine2 = this.videoEngine;
        if (tTVideoEngine2 != null && !TextUtils.isEmpty(tTVideoEngine2.LJIJJ())) {
            return this.videoEngine.LJIJJ();
        }
        if (TextUtils.isEmpty(this.currentQualityDesc) && (tTVideoEngine = this.videoEngine) != null && tTVideoEngine.LJIJJLI() != null && this.mVideoModel != null) {
            this.currentQualityDesc = (String) ((ConcurrentHashMap) C48041ItJ.LIZ).get(this.videoEngine.LJIJJLI());
        }
        return this.currentQualityDesc;
    }

    @Override // X.YS7
    public C47160If6 getCurrentVideoInfo() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && !TextUtils.isEmpty(tTVideoEngine.LJIJJ()) && this.supportedVideoInfoList != null) {
            String LJIJJ = this.videoEngine.LJIJJ();
            for (C47160If6 c47160If6 : this.supportedVideoInfoList) {
                if (LJIJJ.equals(c47160If6.LIZIZ(32))) {
                    return c47160If6;
                }
            }
        }
        EnumC47176IfM resolution = getResolution();
        if (resolution == EnumC47176IfM.Auto) {
            resolution = getAutoResolution();
        }
        if (this.videoInfos != null && resolution != null) {
            for (int i = 0; i < this.videoInfos.size(); i++) {
                C47160If6 valueAt = this.videoInfos.valueAt(i);
                if (valueAt != null && valueAt.getResolution() == resolution && valueAt.LIZ() == 0) {
                    return valueAt;
                }
            }
            for (int i2 = 0; i2 < this.videoInfos.size(); i2++) {
                C47160If6 valueAt2 = this.videoInfos.valueAt(i2);
                if (valueAt2 != null && valueAt2.getResolution() == resolution) {
                    return valueAt2;
                }
            }
            return null;
        }
        return null;
    }

    @Override // X.YS7
    public int getDuration() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIL();
        }
        return 0;
    }

    public int getEarDurationForLastLoop() {
        if (this.videoEngine != null) {
            return this.earDurationForLastLoop;
        }
        return 0;
    }

    public float getMaxVolume() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJIIZ();
        }
        return 0.0f;
    }

    public C79994VaQ getPlaySettings() {
        C79985VaH c79985VaH = this.playEntity;
        if (c79985VaH != null) {
            return c79985VaH.LJIIIIZZ;
        }
        return null;
    }

    public float getVolume() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJ();
        }
        return 0.0f;
    }

    @Override // X.YS7
    public int getWatchedDuration() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJI();
        }
        return 0;
    }

    public int getWatchedDurationForLastLoop() {
        if (this.videoEngine != null) {
            return this.watchedDurationForLastLoop;
        }
        return 0;
    }

    public boolean isDashSource() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && tTVideoEngine.LJJJJJL()) {
            return true;
        }
        return false;
    }

    public boolean isError() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine == null || tTVideoEngine.LJJIJIIJIL() != 3) {
            return false;
        }
        return true;
    }

    public boolean isLoading() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && tTVideoEngine.LJJIII() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isPaused() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine == null || tTVideoEngine.LJJIJIIJIL() != 2) {
            return false;
        }
        return true;
    }

    public boolean isPlayUsedSR() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJLL();
        }
        return false;
    }

    @Override // X.YS7
    public boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine == null || tTVideoEngine.LJJIJIIJIL() != 1) {
            return false;
        }
        return true;
    }

    @Override // X.YS7
    public boolean isReleased() {
        if (this.videoEngine == null) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isShouldPlay() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && tTVideoEngine.LJJJJZ()) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isStarted() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJZI();
        }
        return false;
    }

    public boolean isSupportRealAbr() {
        return isSupportRealAbr(this.mVideoModel);
    }

    public boolean isSystemPlayer() {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && tTVideoEngine.LJJJLIIL()) {
            return true;
        }
        return false;
    }

    public boolean isUseSurfaceView() {
        int i = this.mVideoViewType;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isVideoPlayCompleted() {
        if (this.videoEngine != null && this.playCompleted) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public void play() {
        boolean z;
        InterfaceC87404YSa interfaceC87404YSa;
        boolean z2;
        InterfaceC87405YSb interfaceC87405YSb;
        C47164IfA c47164IfA;
        if (this.playEntity == null) {
            return;
        }
        if (this.mVideoMethodOpt) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("play videoEngine:");
            LIZ.append(this.videoEngine);
            LIZ.append(", vid:");
            LIZ.append(this.playEntity.LIZ);
            LIZ.append(", hashCode:");
            LIZ.append(hashCode());
            LIZ.append(", title:");
            C05L.LJ(this.playEntity, LIZ, null, LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("play videoEngine:");
            LIZ2.append(this.videoEngine);
            LIZ2.append(", vid:");
            LIZ2.append(this.playEntity.LIZ);
            LIZ2.append(", hashCode:");
            LIZ2.append(hashCode());
            LIZ2.append(", thread:");
            LIZ2.append(C16880lQ.LLLLIIIILLL());
            LIZ2.append(" title:");
            C05L.LJ(this.playEntity, LIZ2, null, LIZ2);
        }
        EnumC48219IwB enumC48219IwB = EnumC48219IwB.INS;
        enumC48219IwB.trace(this.playEntity, YSM.CONTROLLER_PLAY, null, null, this.videoStateInquirer);
        this.bufferCount = 0;
        releaseEngineWhenErr();
        if (this.videoEngine == null) {
            resetEngine(false);
            z = true;
        } else {
            z = false;
        }
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("VCPlay", YDG.PLAY, 6);
        if (LIZIZ != null) {
            EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        }
        if (z) {
            if (LIZIZ != null) {
                LIZIZ.LIZ("type", "init");
            }
            boolean engineSource = setEngineSource(0);
            InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
            if (interfaceC87404YSa2 != null) {
                interfaceC87404YSa2.onEngineInitPlay(this.videoStateInquirer, this.playEntity);
            }
            if (!engineSource) {
                setEngineParamsAndPlay();
            } else {
                enumC48219IwB.trace(this.playEntity, YSM.CONTROLLER_INTERCEPT_INIT_PLAY, null, null, this.videoStateInquirer);
            }
        } else if (this.prepareCalled) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("prepareCalled play:");
            LIZ3.append(this.playEntity.LIZ);
            LIZ3.append(" title:");
            C05L.LJ(this.playEntity, LIZ3, null, LIZ3);
            if (!this.playCalled) {
                if (this.tryToInterceptPlay && (interfaceC87405YSb = this.videoPlayConfiger) != null && (c47164IfA = this.mVideoModel) != null) {
                    z2 = interfaceC87405YSb.LIZ(c47164IfA.LIZJ);
                } else {
                    z2 = false;
                }
                InterfaceC87404YSa interfaceC87404YSa3 = this.videoPlayListener;
                if (interfaceC87404YSa3 != null) {
                    interfaceC87404YSa3.onFetchVideoModel(this.videoStateInquirer, this.playEntity, z2);
                    this.videoPlayListener.onEngineInitPlay(this.videoStateInquirer, this.playEntity);
                }
                if (z2) {
                    this.playCalled = true;
                    enumC48219IwB.trace(this.playEntity, YSM.CONTROLLER_INTERCEPT_PREPARE_PLAY, null, null, this.videoStateInquirer);
                    return;
                }
            }
            if (this.prepared) {
                if (LIZIZ != null) {
                    LIZIZ.LIZ("type", "prepared");
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("prepared play:");
                LIZ4.append(this.playEntity.LIZ);
                LIZ4.append(" title:");
                C05L.LJ(this.playEntity, LIZ4, null, LIZ4);
                this.preparing2Play = false;
                setEngineParamsAndPlay();
                if (!this.playCalled && (interfaceC87404YSa = this.videoPlayListener) != null) {
                    interfaceC87404YSa.onPrepared(this.videoStateInquirer, this.playEntity);
                }
            } else {
                if (LIZIZ != null) {
                    LIZIZ.LIZ("type", "preparing");
                }
                this.preparing2Play = true;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("preparing play:");
                LIZ5.append(this.playEntity.LIZ);
                LIZ5.append(" title:");
                C05L.LJ(this.playEntity, LIZ5, null, LIZ5);
                InterfaceC87404YSa interfaceC87404YSa4 = this.videoPlayListener;
                if (interfaceC87404YSa4 != null) {
                    if (this.onErrorReceived) {
                        interfaceC87404YSa4.onVideoRetry(this.videoStateInquirer, this.playEntity);
                    } else if (isVideoPlayCompleted()) {
                        this.videoPlayListener.onVideoReplay(this.videoStateInquirer, this.playEntity);
                    }
                }
                this.playStartType = 5;
                InterfaceC87404YSa interfaceC87404YSa5 = this.videoPlayListener;
                if (interfaceC87404YSa5 != null) {
                    interfaceC87404YSa5.onEnginePlayStart(this.videoStateInquirer, this.playEntity, 5);
                }
                this.playRunnable.run();
            }
        } else {
            if (LIZIZ != null) {
                LIZIZ.LIZ("type", "paused");
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("pause play:");
            LIZ6.append(this.playEntity.LIZ);
            LIZ6.append(" title:");
            this.playEntity.getClass();
            LIZ6.append((String) null);
            X1D.LIZIZ(LIZ6);
            setEngineParamsAndPlay();
        }
        this.playCalled = true;
    }

    @Override // X.YS7
    public void prepare() {
        if (this.playEntity == null || this.playCalled || this.prepareCalled) {
            return;
        }
        if (this.mVideoMethodOpt) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prepare videoEngine:");
            LIZ.append(this.videoEngine);
            LIZ.append(", vid:");
            LIZ.append(this.playEntity.LIZ);
            LIZ.append(", hashCode:");
            LIZ.append(hashCode());
            LIZ.append(", title:");
            C05L.LJ(this.playEntity, LIZ, null, LIZ);
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("prepare videoEngine:");
            LIZ2.append(this.videoEngine);
            LIZ2.append(", vid:");
            LIZ2.append(this.playEntity.LIZ);
            LIZ2.append(", hashCode:");
            LIZ2.append(hashCode());
            LIZ2.append(", thread:");
            LIZ2.append(C16880lQ.LLLLIIIILLL());
            LIZ2.append(" title:");
            C05L.LJ(this.playEntity, LIZ2, null, LIZ2);
        }
        EnumC48219IwB enumC48219IwB = EnumC48219IwB.INS;
        enumC48219IwB.trace(this.playEntity, YSM.CONTROLLER_PREPARE, null, null, this.videoStateInquirer);
        releaseEngineWhenErr();
        if (this.videoEngine == null) {
            resetEngine(true);
            setEngineSource(1);
        }
        setEngineParams();
        int i = this.mVideoViewType;
        if (i == 0) {
            this.videoEngine.LLILZIL(this.surface);
        } else if (i == 2) {
            this.videoEngine.LLJ(this.surface);
        } else {
            this.videoEngine.LLILZLL(null);
        }
        this.enginePoolsStartPos = -1L;
        this.onErrorReceived = false;
        if (this.videoEngine == null) {
            return;
        }
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCPrepare", YDG.PLAY, 6));
        this.prepareCalled = true;
        this.videoEngine.LJJLIIIIJ();
        enumC48219IwB.trace(this.playEntity, YSM.CONTROLLER_ENGINE_PREPARE, null, null, this.videoStateInquirer);
    }

    @Override // X.YS7
    public void resumeProgressUpdate() {
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(EnumC81331Vvz.UPDATE_PROGRESS.getWhat());
        }
    }

    public void setEngineParamsAndPlay() {
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_SET_PARAMS_AND_PLAY, null, null, this.videoStateInquirer);
        setEngineParams();
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null && !this.preparing2Play) {
            if (this.onErrorReceived) {
                interfaceC87404YSa.onVideoRetry(this.videoStateInquirer, this.playEntity);
            } else if (isVideoPlayCompleted()) {
                this.videoPlayListener.onVideoReplay(this.videoStateInquirer, this.playEntity);
            }
        }
        setSurfaceOrSurfaceHolder();
        this.enginePoolsStartPos = -1L;
        this.onErrorReceived = false;
        doPlay();
    }

    public List<String> supportedQualityInfos() {
        String[] LLJJL;
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && (LLJJL = tTVideoEngine.LLJJL()) != null && LLJJL.length > 0 && (LLJJL.length != 1 || !TextUtils.isEmpty(LLJJL[0]))) {
            return Arrays.asList(LLJJL);
        }
        ArrayList arrayList = new ArrayList();
        C47164IfA c47164IfA = this.mVideoModel;
        if (c47164IfA != null && c47164IfA.LIZLLL() != null) {
            for (C47160If6 c47160If6 : this.mVideoModel.LIZLLL()) {
                if (c47160If6 != null) {
                    String LIZIZ = c47160If6.LIZIZ(32);
                    if (!TextUtils.isEmpty(LIZIZ)) {
                        arrayList.add(LIZIZ);
                    } else {
                        String str = (String) ((ConcurrentHashMap) C48041ItJ.LIZ).get(c47160If6.getResolution());
                        if (!TextUtils.isEmpty(str) && !arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public VideoController() {
        init();
    }

    @Override // X.YS7
    public Bitmap captureVideoCurrentFrame() {
        TTVideoEngine tTVideoEngine;
        if (!isReleased() && (tTVideoEngine = this.videoEngine) != null) {
            return tTVideoEngine.LJJLIIIJL();
        }
        return null;
    }

    @Override // X.YS7
    public void pause() {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause_video vid:");
        C79985VaH c79985VaH = this.playEntity;
        String str2 = "entity null";
        if (c79985VaH == null) {
            str = "entity null";
        } else {
            str = c79985VaH.LIZ;
        }
        LIZ.append(str);
        LIZ.append(" hashCode:");
        LIZ.append(hashCode());
        LIZ.append(" title:");
        C79985VaH c79985VaH2 = this.playEntity;
        if (c79985VaH2 != null) {
            c79985VaH2.getClass();
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_PAUSE, null, null, this.videoStateInquirer);
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCPause", YDG.PLAY, 6));
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
        pauseProgressUpdate();
        this.pendingActionManager.LIZ();
    }

    @Override // X.YS7
    public void release() {
        Object obj;
        C79985VaH c79985VaH;
        if (isReleased()) {
            return;
        }
        this.pendingActionManager.LIZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseEngineEnabled:");
        LIZ.append(this.releaseEngineEnabled);
        LIZ.append(", asyncRelease:");
        LIZ.append(this.asyncRelease);
        LIZ.append(", vid:");
        LIZ.append(this.playEntity.LIZ);
        LIZ.append(" title:");
        Object obj2 = null;
        C05L.LJ(this.playEntity, LIZ, null, LIZ);
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_RELEASE, null, null, this.videoStateInquirer);
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            int LJJII = this.videoEngine.LJJII(84) + tTVideoEngine.LJJII(83);
            this.watchedDurationForLastLoop = this.videoEngine.LJJJJI() - this.loopWatchedDuration;
            this.earDurationForLastLoop = LJJII - this.loopEarStayDuration;
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoPreRelease(this.videoStateInquirer, this.playEntity);
        }
        pauseProgressUpdate();
        if (!this.playCompleted) {
            long currentPosition = getCurrentPosition();
            if (currentPosition > 0 && (c79985VaH = this.playEntity) != null && !TextUtils.isEmpty(c79985VaH.LIZ)) {
                C25990AHy.LIZIZ(currentPosition, this.playEntity.LIZ, this.shouldMarkPushTime);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Release Vid:");
                b0.LJ(LIZ2, this.playEntity.LIZ, " Push Pos:", currentPosition);
                X1D.LIZIZ(LIZ2);
            }
        }
        this.prepared = false;
        this.playCompleted = false;
        this.resolution = null;
        this.loopWatchedDuration = 0;
        this.watchedDurationForLastLoop = 0;
        this.loopEarStayDuration = 0;
        this.earDurationForLastLoop = 0;
        this.enginePoolsStartPos = -1L;
        this.videoInfos = null;
        this.supportedVideoInfoList = null;
        this.onErrorReceived = false;
        this.error = null;
        this.autoResolution = null;
        this.renderStarted = false;
        this.mVideoModel = null;
        this.resolutionCount = 0;
        this.playbackParams = null;
        this.videoEngineInfoMap.clear();
        this.playCalled = false;
        this.prepareCalled = false;
        this.preparing2Play = false;
        this.currentQualityDesc = "";
        TTVideoEngine tTVideoEngine2 = this.videoEngine;
        if (tTVideoEngine2 != null && this.releaseEngineEnabled) {
            clearSurfaceOrSurfaceHolder();
            InterfaceC58392Mvs interfaceC58392Mvs = this.videoEngineFactory;
            if (interfaceC58392Mvs instanceof InterfaceC87410YSg) {
                ((InterfaceC87410YSg) interfaceC58392Mvs).LIZJ();
            }
            if (this.asyncRelease) {
                tTVideoEngine2.LJJLIIIJJI();
            } else {
                tTVideoEngine2.LJJLIIIJILLIZJL();
            }
            clearVideoEngineListeners(tTVideoEngine2);
        }
        this.videoEngine = null;
        InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
        if (interfaceC87404YSa2 != null) {
            interfaceC87404YSa2.onVideoReleased(this.videoStateInquirer, this.playEntity);
        }
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("VCRelease", YDG.PLAY, 6);
        if (LIZIZ != null) {
            if (this.playEntity != null) {
                try {
                    if (Map.class.isInstance(null)) {
                        obj = Map.class.cast(null);
                    } else {
                        obj = null;
                    }
                    Map map = (Map) obj;
                    if (map != null) {
                        obj2 = map.get("release_reason");
                    }
                } catch (Exception unused) {
                }
            }
            if (obj2 instanceof String) {
                LIZIZ.LIZ("reason", (String) obj2);
            }
            EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        }
        EnumC48216Iw8.INS.getTracesJson(this.playEntity);
    }

    public List<C47160If6> getAllVideoInfoList() {
        return this.supportedVideoInfoList;
    }

    @Override // X.YS7
    public C79985VaH getPlayEntity() {
        return this.playEntity;
    }

    public int getPlayStartType() {
        return this.playStartType;
    }

    @Override // X.YS7
    public C46886Iag getPlaybackParams() {
        return this.playbackParams;
    }

    @Override // X.YS7
    public EnumC47176IfM getResolution() {
        return this.resolution;
    }

    public int getResolutionCount() {
        return this.resolutionCount;
    }

    public long getStartPlayPosition() {
        return this.startPlayPosition;
    }

    @Override // X.YS7
    public TTVideoEngine getVideoEngine() {
        return this.videoEngine;
    }

    public SparseArray<C47160If6> getVideoInfos() {
        return this.videoInfos;
    }

    @Override // X.YS7
    public C47164IfA getVideoModel() {
        return this.mVideoModel;
    }

    @Override // X.YS7
    public InterfaceC48221IwD getVideoStateInquirer() {
        return this.videoStateInquirer;
    }

    @Override // X.YS7
    public boolean isCurrentAutoQuality() {
        return this.autoQuality;
    }

    @Override // X.YS7
    public boolean isLoop() {
        return this.loop;
    }

    @Override // X.YS7
    public boolean isPlayed() {
        return this.playCalled;
    }

    @Override // X.YS7
    public boolean isPrepared() {
        return this.prepared;
    }

    public boolean isReleaseEngineEnabled() {
        return this.releaseEngineEnabled;
    }

    @Override // X.YS7
    public boolean isRenderStarted() {
        return this.renderStarted;
    }

    public boolean isTryToInterceptPlay() {
        return this.tryToInterceptPlay;
    }

    public VideoController(YTJ ytj) {
        this.videoContext = ytj;
        init();
    }

    private void clearVideoEngineListeners(TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJIII(null);
            tTVideoEngine.LLJJIJI(null);
            tTVideoEngine.LLILIL(null);
            tTVideoEngine.LLJJI(null);
            tTVideoEngine.LJJLIIIJLLLLLLLZ();
            tTVideoEngine.LLFZ(null);
            tTVideoEngine.LLILLL(null);
        }
    }

    private String composeVideoInfosLog(SparseArray<C47160If6> sparseArray) {
        if (sparseArray == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            C47160If6 valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                sb.append("[(res:");
                String LIZIZ = valueAt.LIZIZ(7);
                String LIZIZ2 = valueAt.LIZIZ(32);
                int LIZLLL = valueAt.LIZLLL(3);
                sb.append(LIZIZ);
                sb.append("),(quality:");
                C0EH.LIZLLL(sb, LIZIZ2, "),(br:", LIZLLL, ")],");
            }
        }
        if (sb.length() >= 1) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    private C47620ImW copyVideoEngineInfo(C47620ImW c47620ImW) {
        C47620ImW c47620ImW2 = new C47620ImW();
        c47620ImW2.LIZ = c47620ImW.LIZ;
        c47620ImW2.LIZIZ = c47620ImW.LIZIZ;
        c47620ImW2.LIZJ = c47620ImW.LIZJ;
        long j = c47620ImW.LJ;
        if (j >= 0) {
            c47620ImW2.LJ = j;
        }
        String str = c47620ImW.LIZLLL;
        if (!TextUtils.isEmpty(str) && !str.isEmpty()) {
            c47620ImW2.LIZLLL = str;
        }
        return c47620ImW2;
    }

    private void createVideoEngine(boolean z) {
        boolean z2 = this.videoEngineFactory instanceof InterfaceC87410YSg;
        if (this.videoEngine != null) {
            clearSurfaceOrSurfaceHolder();
            if (z2) {
                ((InterfaceC87410YSg) this.videoEngineFactory).LIZJ();
            }
            if (this.asyncRelease) {
                this.videoEngine.LJJLIIIJJI();
            } else {
                this.videoEngine.LJJLIIIJILLIZJL();
            }
            clearVideoEngineListeners(this.videoEngine);
        }
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("CreateEngine", YDG.PLAY, 0));
        if (z2) {
            InterfaceC87410YSg interfaceC87410YSg = (InterfaceC87410YSg) this.videoEngineFactory;
            if (interfaceC87410YSg.LIZJ() != -1) {
                interfaceC87410YSg.LIZLLL();
                interfaceC87410YSg.LJII();
                interfaceC87410YSg.LIZJ();
            }
            this.mStopToPlay = false;
            new TTVideoEngine(C78999UzT.LJLIL, interfaceC87410YSg.LIZLLL(), interfaceC87410YSg.LJII());
            this.videoEngine = ((InterfaceC87410YSg) this.videoEngineFactory).initVideoEngine();
        } else {
            this.videoEngine = this.videoEngineFactory.LJ(C78999UzT.LJLIL, this.playerType);
        }
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            AbstractC47819Ipj abstractC47819Ipj = this.ttvNetClient;
            if (abstractC47819Ipj != null) {
                tTVideoEngine.LIZ.LLZ = abstractC47819Ipj;
            }
            tTVideoEngine.LLJJIII(this);
            this.videoEngine.LLFZ(this.weakMaskInfo);
            this.videoEngine.LLILLL(this.mExternalSubtitlesInfo);
            this.videoEngine.LLJJIJI(this);
            this.videoEngine.LLILIL(this);
            this.videoEngine.LLJJI(this);
            EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_CREATE_ENGINE, null, null, this.videoStateInquirer);
            return;
        }
        throw new NullPointerException("video engine can't be null");
    }

    private List<C47160If6> getSupportedVideoInfoList(C47163If9 c47163If9) {
        ArrayList arrayList = new ArrayList();
        if (c47163If9 != null && c47163If9.LJIIIIZZ() != null) {
            for (C47160If6 c47160If6 : c47163If9.LJIIIIZZ()) {
                if (!TextUtils.isEmpty(c47160If6.LIZIZ(7))) {
                    arrayList.add(c47160If6);
                }
            }
        }
        return arrayList;
    }

    private String getVideoInfoLog(C47160If6 c47160If6) {
        if (c47160If6 == null) {
            return null;
        }
        return c47160If6.LIZIZ(8) + ", size:" + c47160If6.LIZLLL(1) + "*" + c47160If6.LIZLLL(2) + ", definition:" + c47160If6.LIZIZ(7);
    }

    private boolean isSupportRealAbr(C47164IfA c47164IfA) {
        if (isDashSource() || isSupportSeamlessSwitch(c47164IfA)) {
            return true;
        }
        return false;
    }

    private void resetEngine(boolean z) {
        this.loopWatchedDuration = 0;
        this.watchedDurationForLastLoop = 0;
        this.loopEarStayDuration = 0;
        this.earDurationForLastLoop = 0;
        this.playCompleted = false;
        this.onErrorReceived = false;
        this.renderStarted = false;
        this.autoResolution = null;
        this.resolution = null;
        this.resolutionCount = 0;
        this.videoEngineInfoMap.clear();
        this.prepared = false;
        createVideoEngine(z);
    }

    private boolean setEngineSource(int i) {
        String str;
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("VCSetEngineSource", YDG.PLAY, 6);
        EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        if (i == 1) {
            str = "try_prepare";
        } else {
            str = "try_play";
        }
        TTVideoEngine.LIZJ = this.forceUseLitePlayer;
        C79985VaH c79985VaH = this.playEntity;
        boolean z = false;
        if (c79985VaH.LJFF != null) {
            C1JX.LJIIIIZZ(str, "_direct_url_use_data_loader");
            if (LIZIZ != null) {
                LIZIZ.LIZ("source", "DirectUrlUseDataLoader");
            }
            EnumC47176IfM enumC47176IfM = this.resolution;
            if (enumC47176IfM != null) {
                setResolution(enumC47176IfM, false);
            } else {
                this.playEntity.getClass();
                setResolution((String) null, false);
            }
            TTVideoEngine tTVideoEngine = this.videoEngine;
            C79985VaH c79985VaH2 = this.playEntity;
            tTVideoEngine.LJLJL(c79985VaH2.LJFF, c79985VaH2.LJI);
        } else if (c79985VaH.LIZLLL != null) {
            if (LIZIZ != null) {
                LIZIZ.LIZ("source", "VideoModel");
            }
            StringBuilder LIZJ = b1.LIZJ(str, "_cache_video_model vid:");
            LIZJ.append(this.playEntity.LIZ);
            LIZJ.append(" title:");
            C05L.LJ(this.playEntity, LIZJ, null, LIZJ);
            this.videoEngine.LLJJIJIIJIL(this.playEntity.LIZLLL);
            z = onFetchedVideoInfo(this.playEntity.LIZLLL);
        } else if (!TextUtils.isEmpty(null)) {
            if (LIZIZ != null) {
                LIZIZ.LIZ("source", "LocalUrl");
            }
            StringBuilder LIZJ2 = b1.LIZJ(str, "_local_url:");
            C05L.LJ(this.playEntity, LIZJ2, null, LIZJ2);
            EnumC47176IfM enumC47176IfM2 = this.resolution;
            if (enumC47176IfM2 != null) {
                setResolution(enumC47176IfM2, false);
            } else {
                this.playEntity.getClass();
                setResolution((String) null, false);
            }
            TTVideoEngine tTVideoEngine2 = this.videoEngine;
            this.playEntity.getClass();
            tTVideoEngine2.LL(null);
        } else if (!TextUtils.isEmpty(this.playEntity.LJ)) {
            if (LIZIZ != null) {
                LIZIZ.LIZ("source", "VideoUrl");
            }
            StringBuilder LIZJ3 = b1.LIZJ(str, "_direct_url:");
            LIZJ3.append(this.playEntity.LJ);
            X1D.LIZIZ(LIZJ3);
            EnumC47176IfM enumC47176IfM3 = this.resolution;
            if (enumC47176IfM3 != null) {
                setResolution(enumC47176IfM3, false);
            } else {
                this.playEntity.getClass();
                setResolution((String) null, false);
            }
            this.videoEngine.LJLJJLL(this.playEntity.LJ);
            this.playEntity.getClass();
        } else {
            this.playEntity.getClass();
            this.playEntity.getClass();
            if (!TextUtils.isEmpty(null)) {
                if (LIZIZ != null) {
                    LIZIZ.LIZ("source", "MusicUrl");
                }
                StringBuilder LIZJ4 = b1.LIZJ(str, "_music_url:");
                C05L.LJ(this.playEntity, LIZJ4, null, LIZJ4);
                EnumC47176IfM enumC47176IfM4 = this.resolution;
                if (enumC47176IfM4 != null) {
                    setResolution(enumC47176IfM4, false);
                } else {
                    this.playEntity.getClass();
                    setResolution((String) null, false);
                }
                TTVideoEngine tTVideoEngine3 = this.videoEngine;
                this.playEntity.getClass();
                tTVideoEngine3.LJLJJLL(null);
            } else {
                this.playEntity.getClass();
                if (!TextUtils.isEmpty(null)) {
                    if (LIZIZ != null) {
                        LIZIZ.LIZ("source", "MusicPath");
                    }
                    StringBuilder LIZJ5 = b1.LIZJ(str, "_music_path:");
                    C05L.LJ(this.playEntity, LIZJ5, null, LIZJ5);
                    EnumC47176IfM enumC47176IfM5 = this.resolution;
                    if (enumC47176IfM5 != null) {
                        setResolution(enumC47176IfM5, false);
                    } else {
                        this.playEntity.getClass();
                        setResolution((String) null, false);
                    }
                    TTVideoEngine tTVideoEngine4 = this.videoEngine;
                    this.playEntity.getClass();
                    tTVideoEngine4.LL(null);
                } else {
                    if (LIZIZ != null) {
                        LIZIZ.LIZ("source", "vid");
                    }
                    StringBuilder LIZJ6 = b1.LIZJ(str, "_vid:");
                    LIZJ6.append(this.playEntity.LIZ);
                    LIZJ6.append(" title:");
                    C05L.LJ(this.playEntity, LIZJ6, null, LIZJ6);
                    TTVideoEngine tTVideoEngine5 = this.videoEngine;
                    String str2 = this.playEntity.LIZ;
                    TTVideoEngineImpl tTVideoEngineImpl = tTVideoEngine5.LIZ;
                    if (tTVideoEngineImpl.b5.LIZ(false)) {
                        tTVideoEngineImpl.b5.LIZLLL(14, 0, 0, str2);
                    } else {
                        tTVideoEngineImpl.LJJLIIIJL(str2);
                    }
                    EnumC47176IfM enumC47176IfM6 = this.resolution;
                    if (enumC47176IfM6 != null) {
                        setResolution(enumC47176IfM6, false);
                    } else {
                        this.playEntity.getClass();
                        setResolution((String) null, false);
                    }
                }
            }
        }
        long j = this.enginePoolsStartPos;
        long j2 = 0;
        if (j > 0) {
            updateStartPlayPosition(j);
        } else {
            if (this.rememberVideoPosition) {
                Long LIZJ7 = C25990AHy.LIZJ(this.playEntity.LIZ, this.shouldMarkPushTime);
                if (LIZJ7 != null) {
                    j2 = LIZJ7.longValue();
                }
            } else {
                j2 = this.playEntity.LIZJ;
            }
            updateStartPlayPosition(j2);
        }
        return z;
    }

    private void updateStartPlayPosition(long j) {
        if (j > 0) {
            if (this.prepared) {
                StringBuilder LIZJ = V10.LIZJ("updateStartPlayPosition videoEngine.seekTo:", j, " vid:");
                LIZJ.append(this.playEntity.LIZ);
                X1D.LIZIZ(LIZJ);
                seekTo(j);
            } else {
                StringBuilder LIZJ2 = V10.LIZJ("videoEngine.setStartTime:", j, " vid:");
                LIZJ2.append(this.playEntity.LIZ);
                X1D.LIZIZ(LIZJ2);
                this.videoEngine.LLIIZ((int) j);
            }
            this.startPlayPosition = j;
            return;
        }
        this.startPlayPosition = 0L;
    }

    private void updateVideoClarityInfo(C47163If9 c47163If9) {
        SparseArray LJJIIJZLJL = UC0.LJJIIJZLJL(c47163If9);
        int i = 0;
        for (int size = LJJIIJZLJL.size() - 1; size >= 0; size--) {
            if (LJJIIJZLJL.valueAt(size) != null) {
                i++;
            }
        }
        this.resolutionCount = i;
    }

    private void updateVideoSize(C47163If9 c47163If9) {
        if (this.videoPlayListener != null && c47163If9 != null) {
            for (EnumC47176IfM enumC47176IfM : EnumC47176IfM.getAllResolutions()) {
                C47160If6 LJII = c47163If9.LJII(enumC47176IfM, c47163If9.LJ(7), null);
                if (LJII != null) {
                    int LIZLLL = LJII.LIZLLL(1);
                    if (LJII.LIZLLL(2) > 0 && LIZLLL > 0) {
                        this.videoPlayListener.onUpdateVideoSize(LJII);
                        return;
                    }
                }
            }
        }
    }

    public boolean filterProgressUpdate(int i) {
        if (i <= 0) {
            return false;
        }
        getPlaySettings();
        return false;
    }

    @Override // X.YS7
    public int getCurrentPosition(boolean z) {
        if (z && this.asyncPosition) {
            TTVideoEngine tTVideoEngine = this.videoEngine;
            if (tTVideoEngine == null) {
                return 0;
            }
            return tTVideoEngine.LJIJI();
        }
        TTVideoEngine tTVideoEngine2 = this.videoEngine;
        if (tTVideoEngine2 == null) {
            return 0;
        }
        return tTVideoEngine2.LJIJ();
    }

    public Object getEngineLongOptionValue(int i) {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            try {
                return Long.valueOf(tTVideoEngine.LJJIIJZLJL(i));
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    public EnumC47176IfM getTargetResolutionByQuality(String str) {
        if (TextUtils.isEmpty(str)) {
            return EnumC47176IfM.Standard;
        }
        for (Map.Entry entry : ((ConcurrentHashMap) C48041ItJ.LIZ).entrySet()) {
            if (entry != null && str.equals(entry.getValue())) {
                return (EnumC47176IfM) entry.getKey();
            }
        }
        return EnumC47176IfM.Standard;
    }

    public C47620ImW getVideoEngineInfos(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.videoEngineInfoMap.get(str);
        }
        return null;
    }

    public boolean isSupportSeamlessSwitch(C47164IfA c47164IfA) {
        if (c47164IfA == null) {
            return false;
        }
        if (c47164IfA.LJJIJ()) {
            return true;
        }
        C47163If9 c47163If9 = c47164IfA.LIZJ;
        if (c47163If9 == null || !c47163If9.LIZLLL(206).booleanValue()) {
            return false;
        }
        boolean LJJIII = c47164IfA.LJJIII();
        if (((getVideoSegmentFormatFlag(false) >> 2) & 1) != 1 || !LJJIII) {
            return false;
        }
        return true;
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onCompletion(TTVideoEngine tTVideoEngine) {
        String str;
        this.playCompleted = true;
        this.onErrorReceived = false;
        this.error = null;
        if (!this.loop) {
            pauseProgressUpdate();
        }
        int LJJII = this.videoEngine.LJJII(84) + this.videoEngine.LJJII(83);
        this.watchedDurationForLastLoop = tTVideoEngine.LJJJJI() - this.loopWatchedDuration;
        this.earDurationForLastLoop = LJJII - this.loopEarStayDuration;
        if (this.loop) {
            this.loopWatchedDuration = tTVideoEngine.LJJJJI();
            this.loopEarStayDuration = LJJII;
        } else {
            this.loopWatchedDuration = 0;
            this.loopEarStayDuration = 0;
        }
        C79985VaH c79985VaH = this.playEntity;
        if (c79985VaH != null && !TextUtils.isEmpty(c79985VaH.LIZ) && (str = this.playEntity.LIZ) != null) {
            LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = C25990AHy.LIZ;
            synchronized (linkedHashMap) {
                linkedHashMap.remove(str);
            }
            LinkedHashMap<String, Boolean> linkedHashMap2 = C25990AHy.LIZIZ;
            synchronized (linkedHashMap2) {
                linkedHashMap2.remove(str);
            }
        }
        this.enginePoolsStartPos = -1L;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoPreCompleted(this.videoStateInquirer, this.playEntity);
            this.videoPlayListener.onVideoCompleted(this.videoStateInquirer, this.playEntity);
            if (this.loop) {
                this.videoPlayListener.onVideoReplay(this.videoStateInquirer, this.playEntity);
                this.playCompleted = false;
            }
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onError(C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError:");
        LIZ.append(c47789IpF.LIZLLL);
        LIZ.append(" errorCode:");
        LIZ.append(c47789IpF.LIZ);
        LIZ.append(" internalCode:");
        LIZ.append(c47789IpF.LIZIZ);
        String LIZIZ = X1D.LIZIZ(LIZ);
        C48217Iw9 LIZIZ2 = C48217Iw9.LIZIZ("VCOnError", YDG.PLAY, 6);
        if (LIZIZ2 != null) {
            LIZIZ2.LIZ("err", LIZIZ);
            EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ2);
        }
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_ON_ERROR, LIZIZ, c47789IpF, this.videoStateInquirer);
        this.loopWatchedDuration = 0;
        this.loopEarStayDuration = 0;
        this.onErrorReceived = true;
        this.prepareCalled = false;
        this.playCalled = false;
        this.prepared = false;
        this.preparing2Play = false;
        this.error = c47789IpF;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onError(this.videoStateInquirer, this.playEntity, c47789IpF);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (r4 == null) goto L11;
     */
    @Override // X.InterfaceC46854IaA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onFetchedVideoInfo(X.C47164IfA r7) {
        /*
            r6 = this;
            r3 = 0
            if (r7 != 0) goto L4
            return r3
        L4:
            X.Iw8 r5 = X.EnumC48216Iw8.INS
            X.VaH r4 = r6.playEntity
            X.YDG r2 = X.YDG.PLAY
            r1 = 6
            java.lang.String r0 = "VCOnFetchedVideoInfo"
            X.Iw9 r0 = X.C48217Iw9.LIZIZ(r0, r2, r1)
            r5.addTrace(r4, r0)
            r6.mVideoModel = r7
            X.If9 r2 = r7.LIZJ
            android.util.SparseArray r0 = X.UC0.LJJIIJZLJL(r2)
            r6.videoInfos = r0
            java.util.List r0 = r6.getSupportedVideoInfoList(r2)
            r6.supportedVideoInfoList = r0
            X.YSb r5 = r6.videoPlayConfiger
            if (r5 == 0) goto L7b
            boolean r0 = r5 instanceof X.InterfaceC87411YSh
            if (r0 == 0) goto L3f
            X.YSh r5 = (X.InterfaceC87411YSh) r5
            X.YSH r1 = r6.videoStateInquirer
            X.VaH r0 = r6.playEntity
            X.If6 r4 = r5.LJFF(r1, r7, r0)
            X.YSH r1 = r6.videoStateInquirer
            X.VaH r0 = r6.playEntity
            r5.LIZLLL(r4, r1, r7, r0)
            if (r4 != 0) goto L4f
        L3f:
            X.YSb r0 = r6.videoPlayConfiger
            X.If6 r4 = r0.LIZJ(r7)
            if (r4 != 0) goto L4f
            X.YSb r0 = r6.videoPlayConfiger
            X.If6 r4 = r0.LJ(r2)
            if (r4 == 0) goto Lc5
        L4f:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "get_video_info:"
            r1.append(r0)
            java.lang.String r0 = r6.getVideoInfoLog(r4)
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            boolean r0 = r6.isSupportRealAbr(r7)
            if (r0 == 0) goto L96
            X.IfM r0 = r4.getResolution()
            X.IfM r1 = X.EnumC47176IfM.Auto
            if (r0 != r1) goto L96
            r6.resolution = r1
            r0 = 1
            r6.autoQuality = r0
            r6.setResolution(r1, r3)
            r6.updateVideoSize(r2)
        L7b:
            r6.updateVideoClarityInfo(r2)
            boolean r0 = r6.tryToInterceptPlay
            if (r0 == 0) goto L8a
            X.YSb r0 = r6.videoPlayConfiger
            if (r0 == 0) goto L8a
            boolean r3 = r0.LIZ(r2)
        L8a:
            X.YSa r2 = r6.videoPlayListener
            if (r2 == 0) goto L95
            X.YSH r1 = r6.videoStateInquirer
            X.VaH r0 = r6.playEntity
            r2.onFetchVideoModel(r1, r0, r3)
        L95:
            return r3
        L96:
            r0 = 7
            java.lang.String r1 = r4.LIZIZ(r0)
            r0 = 32
            java.lang.String r0 = r4.LIZIZ(r0)
            r6.currentQualityDesc = r0
            r6.autoQuality = r3
            X.IfM r0 = X.UC0.LIZIZ(r1)
            r6.resolution = r0
            X.VaH r0 = r6.playEntity
            if (r0 == 0) goto Lb2
            r0.getClass()
        Lb2:
            java.lang.String r0 = r6.currentQualityDesc
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc1
            X.VaH r0 = r6.playEntity
            if (r0 == 0) goto Lc1
            r0.getClass()
        Lc1:
            r6.setResolution(r1, r3)
            goto L7b
        Lc5:
            r6.updateVideoSize(r2)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.controller.VideoController.onFetchedVideoInfo(X.IfA):boolean");
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onPrepare(TTVideoEngine tTVideoEngine) {
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCOnPrepare", YDG.PLAY, 3));
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_ON_PREPARE, null, null, this.videoStateInquirer);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPrepare(this.videoStateInquirer, this.playEntity);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onPrepared(TTVideoEngine tTVideoEngine) {
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCOnPrepared", YDG.PLAY, 6));
        this.prepared = true;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPrepared:");
        LIZ.append(this.playEntity.LIZ);
        LIZ.append(" title:");
        this.playEntity.getClass();
        LIZ.append((String) null);
        LIZ.append(" hashCode:");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_ON_PREPARED, null, null, this.videoStateInquirer);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPrepared(this.videoStateInquirer, this.playEntity);
        }
        this.pendingActionManager.LIZIZ();
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onRenderStart(TTVideoEngine tTVideoEngine) {
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCOnRenderStart", YDG.PLAY, 6));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onRenderStart:");
        LIZ.append(this.playEntity.LIZ);
        LIZ.append(" title:");
        this.playEntity.getClass();
        LIZ.append((String) null);
        LIZ.append(" hashCode:");
        LIZ.append(hashCode());
        X1D.LIZIZ(LIZ);
        EnumC48219IwB enumC48219IwB = EnumC48219IwB.INS;
        enumC48219IwB.trace(this.playEntity, YSM.CONTROLLER_ON_RENDER_START, null, null, this.videoStateInquirer);
        if (!this.mVideoMethodOpt) {
            enumC48219IwB.updateVolume(this.playEntity, getMaxVolume(), getVolume());
        }
        this.renderStarted = true;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPreRenderStart(this.videoStateInquirer, this.playEntity);
            this.videoPlayListener.onRenderStart(this.videoStateInquirer, this.playEntity);
        }
    }

    public void onSeekComplete(boolean z) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("seek_complete:");
        if (z) {
            str = "done";
        } else {
            str = "fail";
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_SEEK_COMPLETE, null, null, this.videoStateInquirer);
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCOnSeekComplete", YDG.SEEK, 6));
        if (!isVideoPlayCompleted() && isPlaying() && (!this.seekToEnd || this.loop)) {
            resumeProgressUpdate();
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoSeekComplete(this.videoStateInquirer, this.playEntity, z);
        }
    }

    @Override // X.InterfaceC46853Ia9
    public void onVideoEngineInfos(C47620ImW c47620ImW) {
        boolean z;
        if (c47620ImW == null) {
            return;
        }
        C47620ImW copyVideoEngineInfo = copyVideoEngineInfo(c47620ImW);
        this.videoEngineInfoMap.put(copyVideoEngineInfo.LIZ, copyVideoEngineInfo);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoEngineInfos(this.videoStateInquirer, this.playEntity, copyVideoEngineInfo);
        }
        if (copyVideoEngineInfo.LIZ.equals("renderSeekComplete") && this.videoPlayListener != null) {
            Object obj = copyVideoEngineInfo.LIZJ;
            if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.videoPlayListener.onRenderSeekComplete(this.videoStateInquirer, this.playEntity, z);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onVideoStatusException(int i) {
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("VCOnVideoStatusException", YDG.PLAY, 6);
        if (LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(i);
            LIZIZ.LIZ("status", X1D.LIZIZ(LIZ));
            EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        }
        UC7.LIZLLL("onVideoStatusException:", i);
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_ON_STATUS_EXCEPTION, KMP.LJ("", i), Integer.valueOf(i), this.videoStateInquirer);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoStatusException(this.videoStateInquirer, this.playEntity, i);
        }
    }

    public void openTextureRenderSR(boolean z) {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJJZ(z);
        }
    }

    @Override // X.YS7
    public void resumeVideoSnapshotInfo(YSP ysp) {
        if (ysp == null) {
            return;
        }
        setVideoEngine(ysp.LIZ);
        this.playCompleted = ysp.LIZIZ;
        this.playEntity = ysp.LIZJ;
        this.resolution = ysp.LIZLLL;
        this.resolutionCount = ysp.LJ;
        this.playbackParams = ysp.LJFF;
        this.videoInfos = ysp.LJI;
        this.loop = ysp.LJII;
        this.asyncRelease = ysp.LJIIJ;
        this.dataSource.getClass();
    }

    @Override // X.YS7
    public void seekTo(long j) {
        String LIZ;
        boolean z;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPreVideoSeek(this.videoStateInquirer, this.playEntity, j);
        }
        if (this.videoEngine != null) {
            if (j >= r0.LJIL()) {
                z = true;
            } else {
                z = false;
            }
            this.seekToEnd = z;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("seek:");
        if (this.seekToEnd) {
            LIZ = "end";
        } else {
            LIZ = C61845OOz.LIZ("", j);
        }
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
        if (this.videoEngine == null) {
            return;
        }
        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_SEEK, null, null, this.videoStateInquirer);
        EnumC48216Iw8.INS.addTrace(this.playEntity, C48217Iw9.LIZIZ("VCSeekTo", YDG.SEEK, 6));
        this.canCountBuffer = false;
        pauseProgressUpdate();
        this.videoEngine.LJJLIIIJLJLI((int) j, this.mSeekCompletionListener);
        InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
        if (interfaceC87404YSa2 != null) {
            interfaceC87404YSa2.onVideoSeekStart(this.videoStateInquirer, this.playEntity, j);
        }
    }

    @Override // X.YS7
    public void setAsyncPosition(boolean z) {
        this.asyncPosition = z;
    }

    @Override // X.YS7
    public void setAsyncRelease(boolean z) {
        this.asyncRelease = z;
    }

    public void setForceUseLitePlayer(boolean z) {
        this.forceUseLitePlayer = z;
    }

    @Override // X.YS7
    public void setLoop(boolean z) {
        this.loop = z;
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLFII(z);
        }
    }

    @Override // X.YS7
    public void setMute(boolean z) {
        this.mute = z;
        if (this.videoEngine != null) {
            C07670Rv.LIZLLL("setMute:", z);
            this.videoEngine.LJLZ(z);
        }
    }

    @Override // X.YS7
    public void setPlayEntity(C79985VaH c79985VaH) {
        this.playEntity = c79985VaH;
        this.dataSource.getClass();
    }

    @Override // X.YS7
    public void setPlayUrlConstructor(YTA yta) {
        if (yta != null) {
            this.dataSource.LIZ = yta;
        }
    }

    @Override // X.YS7
    public void setPlaybackParams(C46886Iag c46886Iag) {
        this.playbackParams = c46886Iag;
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null && c46886Iag != null) {
            tTVideoEngine.LLIIIJ(c46886Iag);
        }
    }

    public void setPlayerType(int i) {
        this.playerType = i;
    }

    @Override // X.YS7
    public void setReleaseEngineEnabled(boolean z) {
        this.releaseEngineEnabled = z;
    }

    @Override // X.YS7
    public void setRememberVideoPosition(boolean z) {
        this.rememberVideoPosition = z;
    }

    @Override // X.YS7
    public void setRenderMode(int i) {
        this.renderMode = i;
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJLLLL(4, i);
        }
    }

    public void setShouldMarkPushTime(boolean z) {
        this.shouldMarkPushTime = z;
    }

    @Override // X.YS7
    public void setStartTime(int i) {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLIIZ(i);
        }
    }

    @Override // X.YS7
    public void setSurface(Surface surface) {
        if (this.surface != surface) {
            this.surface = surface;
            TTVideoEngine tTVideoEngine = this.videoEngine;
            if (tTVideoEngine != null) {
                int i = this.mVideoViewType;
                if (i == 0) {
                    tTVideoEngine.LLILZIL(surface);
                } else {
                    if (i != 2) {
                        return;
                    }
                    tTVideoEngine.LLJ(surface);
                }
            }
        }
    }

    @Override // X.YS7
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceHolder != surfaceHolder) {
            this.mSurfaceHolder = surfaceHolder;
            TTVideoEngine tTVideoEngine = this.videoEngine;
            if (tTVideoEngine != null) {
                if (this.prepareCalled && !this.playCalled) {
                    tTVideoEngine.LLIZ(surfaceHolder);
                    VideoSurface LJJIL = this.videoEngine.LJJIL();
                    if (LJJIL != null) {
                        LJJIL.LJJ(25, 1);
                        return;
                    }
                    return;
                }
                tTVideoEngine.LLILZLL(surfaceHolder);
            }
        }
    }

    @Override // X.YS7
    public void setTryToInterceptPlay(boolean z) {
        this.tryToInterceptPlay = z;
    }

    @Override // X.YS7
    public void setTtvNetClient(AbstractC47819Ipj abstractC47819Ipj) {
        this.ttvNetClient = abstractC47819Ipj;
    }

    @Override // X.YS7
    public void setVideoEngine(TTVideoEngine tTVideoEngine) {
        TTVideoEngine tTVideoEngine2 = this.videoEngine;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LLI(null);
            this.videoEngine.LLJJIII(null);
            this.videoEngine.LLJJIJI(null);
            this.videoEngine.LLFZ(null);
            this.videoEngine.LLILLL(null);
        }
        this.videoEngine = tTVideoEngine;
        if (tTVideoEngine != null) {
            AbstractC47819Ipj abstractC47819Ipj = this.ttvNetClient;
            if (abstractC47819Ipj != null) {
                tTVideoEngine.LLI(abstractC47819Ipj);
            }
            this.videoEngine.LLJJIII(this);
            this.videoEngine.LLJJIJI(this);
            this.videoEngine.LLFZ(this.weakMaskInfo);
            this.videoEngine.LLILLL(this.mExternalSubtitlesInfo);
        }
    }

    @Override // X.YS7
    public void setVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs) {
        if (interfaceC58392Mvs != null) {
            this.videoEngineFactory = interfaceC58392Mvs;
        }
    }

    @Override // X.YS7
    public void setVideoMethodOpt(boolean z) {
        this.mVideoMethodOpt = z;
    }

    @Override // X.YS7
    public void setVideoPlayConfiger(InterfaceC87405YSb interfaceC87405YSb) {
        this.videoPlayConfiger = interfaceC87405YSb;
    }

    @Override // X.YS7
    public void setVideoPlayListener(InterfaceC87404YSa interfaceC87404YSa) {
        this.videoPlayListener = interfaceC87404YSa;
    }

    @Override // X.YS7
    public void setVideoViewType(int i) {
        this.mVideoViewType = i;
    }

    private String composeSelectedVideoInfoLog(C47164IfA c47164IfA, C47160If6 c47160If6) {
        if (c47160If6 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (isSupportRealAbr(c47164IfA) && c47160If6.getResolution() == EnumC47176IfM.Auto) {
            sb.append("[res:Auto]");
        } else {
            sb.append("[(res:");
            String LIZIZ = c47160If6.LIZIZ(7);
            String LIZIZ2 = c47160If6.LIZIZ(32);
            int LIZLLL = c47160If6.LIZLLL(3);
            sb.append(LIZIZ);
            sb.append("),(quality:");
            C0EH.LIZLLL(sb, LIZIZ2, "),(br:", LIZLLL, ")]");
        }
        return sb.toString();
    }

    public void handleSubPathInfo(String str, C47789IpF c47789IpF) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onExternalSubtitlesPathInfoCallback(this.videoStateInquirer, this.playEntity, str, c47789IpF);
        }
    }

    public void handleSubSwitchCompleted(int i, int i2) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onSubSwitchCompletedCallback(this.videoStateInquirer, this.playEntity, i, i2);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onBufferingUpdate(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onBufferingUpdate(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onFrameDraw(int i, Map map) {
        super.onFrameDraw(i, map);
        VIF.LIZ().post(new ARunnableS18S0201000_15(i, map, this, 1));
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onLoadStateChanged(TTVideoEngine tTVideoEngine, int i) {
        String str;
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("OnLoadStateChanged", YDG.PLAY, 3);
        EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_LOAD_STATE_ERROR, null, null, this.videoStateInquirer);
                    str = "error";
                }
            } else {
                onBufferStart();
                EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_LOAD_STATE_STALLED, null, null, this.videoStateInquirer);
                str = "stalled";
            }
        } else {
            onBufferEnd();
            EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_LOAD_STATE_PLAYABLE, null, null, this.videoStateInquirer);
            str = "playable";
        }
        if (LIZIZ != null) {
            LIZIZ.LIZ("state", str);
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onLoadStateChanged(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onPlaybackStateChanged(TTVideoEngine tTVideoEngine, int i) {
        String str;
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("PlayStateChanged", YDG.PLAY, 3);
        EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        pauseProgressUpdate();
                        EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_PLAY_STATE_ERROR, null, null, this.videoStateInquirer);
                        str = "error";
                    }
                } else {
                    InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
                    if (interfaceC87404YSa != null) {
                        interfaceC87404YSa.onVideoPause(this.videoStateInquirer, this.playEntity);
                    }
                    EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_PLAY_STATE_PAUSED, null, null, this.videoStateInquirer);
                    str = "paused";
                }
            } else {
                resumeProgressUpdate();
                InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
                if (interfaceC87404YSa2 != null) {
                    interfaceC87404YSa2.onVideoPlay(this.videoStateInquirer, this.playEntity);
                }
                EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_PLAY_STATE_PLAYING, null, null, this.videoStateInquirer);
                str = "playing";
            }
        } else {
            EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_PLAY_STATE_STOPPED, null, null, this.videoStateInquirer);
            str = "stopped";
        }
        if (LIZIZ != null) {
            LIZIZ.LIZ("state", str);
        }
        InterfaceC87404YSa interfaceC87404YSa3 = this.videoPlayListener;
        if (interfaceC87404YSa3 != null) {
            interfaceC87404YSa3.onPlaybackStateChanged(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onStreamChanged(TTVideoEngine tTVideoEngine, int i) {
        EnumC47176IfM enumC47176IfM;
        UC7.LIZLLL("onStreamChanged type:", i);
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("VCOnStreamChanged", YDG.PLAY, 3);
        if (LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append(i);
            LIZIZ.LIZ("type", X1D.LIZIZ(LIZ));
            EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        }
        if (i == 0 && (enumC47176IfM = this.targetResolution) != null) {
            this.resolution = enumC47176IfM;
            this.targetResolution = null;
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onStreamChanged(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
        C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("VCOnBitrateChanged", YDG.PLAY, 3);
        if (LIZIZ != null) {
            if (enumC47176IfM != null) {
                LIZIZ.LIZ("resolution", enumC47176IfM.toString());
            }
            EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoStreamBitrateChanged resolution:");
        LIZ.append(enumC47176IfM.toString());
        X1D.LIZIZ(LIZ);
        this.autoResolution = enumC47176IfM;
        EnumC47176IfM enumC47176IfM2 = this.targetResolution;
        if (enumC47176IfM2 != null) {
            this.resolution = enumC47176IfM2;
            this.targetResolution = null;
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoStreamBitrateChanged(this.videoStateInquirer, this.playEntity, enumC47176IfM, i);
        }
    }

    @Override // X.YS7
    public void setEngineOption(int i, Object obj) {
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            if (obj instanceof Integer) {
                tTVideoEngine.LJLLLL(i, ((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                tTVideoEngine.LLFF(i, ((Long) obj).longValue());
            } else {
                if (!(obj instanceof String)) {
                    return;
                }
                tTVideoEngine.LLILL(i, (String) obj);
            }
        }
    }

    public void setResolution(int i, boolean z) {
        EnumC47176IfM enumC47176IfM;
        EnumC47176IfM[] values = EnumC47176IfM.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                enumC47176IfM = values[i2];
                if (i == enumC47176IfM.getIndex()) {
                    break;
                } else {
                    i2++;
                }
            } else {
                enumC47176IfM = null;
                break;
            }
        }
        setResolution(enumC47176IfM, z);
    }

    @Override // X.YS7
    public void setVolume(float f, float f2) {
        if (this.videoEngine != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVolume left:");
            LIZ.append(f);
            LIZ.append(" right:");
            LIZ.append(f2);
            X1D.LIZIZ(LIZ);
            this.videoEngine.LLJJIJIL(f, f2);
            if (!this.mVideoMethodOpt) {
                EnumC48219IwB.INS.updateVolume(this.playEntity, getMaxVolume(), f);
            }
        }
    }

    @Override // X.YS7
    public void setResolution(EnumC47176IfM enumC47176IfM, boolean z) {
        setResolution(enumC47176IfM, z, true);
    }

    private void setResolution(String str, boolean z) {
        setResolution(str, z, true);
    }

    private void setResolution(EnumC47176IfM enumC47176IfM, boolean z, boolean z2) {
        boolean z3;
        String str;
        if (enumC47176IfM == null) {
            return;
        }
        boolean z4 = false;
        if (this.resolution != enumC47176IfM) {
            C48217Iw9 LIZIZ = C48217Iw9.LIZIZ("SetResolution", YDG.PLAY, 6);
            if (LIZIZ != null) {
                LIZIZ.LIZ("resolution", enumC47176IfM.toString());
                EnumC48216Iw8.INS.addTrace(this.playEntity, LIZIZ);
            }
            z3 = true;
        } else {
            z3 = false;
        }
        this.targetResolution = enumC47176IfM;
        if (this.resolution == null) {
            this.resolution = enumC47176IfM;
        }
        EnumC47176IfM enumC47176IfM2 = EnumC47176IfM.Auto;
        if (enumC47176IfM == enumC47176IfM2) {
            this.resolution = enumC47176IfM2;
        } else if (this.resolution == enumC47176IfM2 && enumC47176IfM == this.autoResolution) {
            this.resolution = enumC47176IfM;
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null && z3) {
            interfaceC87404YSa.onResolutionChanged(this.videoStateInquirer, this.playEntity, enumC47176IfM, z);
        }
        TTVideoEngine tTVideoEngine = this.videoEngine;
        if (tTVideoEngine != null) {
            if (enumC47176IfM == enumC47176IfM2) {
                if (z2) {
                    tTVideoEngine.LJLLLL(29, 1);
                }
            } else if (z2) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setResolution:");
                LIZ.append(enumC47176IfM);
                LIZ.append(" title:");
                C79985VaH c79985VaH = this.playEntity;
                if (c79985VaH == null) {
                    str = "entity null";
                } else {
                    c79985VaH.getClass();
                    str = null;
                }
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                this.videoEngine.LJII(enumC47176IfM);
            }
            if (enumC47176IfM == enumC47176IfM2) {
                z4 = true;
            }
            this.autoQuality = z4;
            if (this.prepareCalled && !this.renderStarted) {
                this.resolution = enumC47176IfM;
            }
        }
    }

    public void handleMaskInfoCallback(int i, int i2, String str) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onBarrageMaskCallback(this.videoStateInquirer, this.playEntity, i2, str);
        }
    }

    public void handleSubInfoCallback(int i, int i2, String str) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onExternalSubtitlesCallback(this.videoStateInquirer, this.playEntity, i2, str);
        }
    }

    @Override // X.C47575Iln, X.InterfaceC47787IpD
    public void onVideoSizeChanged(TTVideoEngine tTVideoEngine, int i, int i2) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoSizeChanged(this.videoStateInquirer, this.playEntity, i, i2);
        }
    }

    private void setResolution(String str, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setResolution(UC0.LIZIZ(str), z, z2);
    }

    @Override // X.YS7
    public void configResolutionByQuality(boolean z, String str, boolean z2, boolean z3, String str2) {
        boolean z4;
        if (this.videoEngine != null) {
            if (z2 && !isDashSource() && !isSupportSeamlessSwitch(this.mVideoModel)) {
                return;
            }
            boolean z5 = this.autoQuality;
            String currentQualityDesc = getCurrentQualityDesc();
            if (z5 != z2 || (!TextUtils.isEmpty(str) && !str.equals(currentQualityDesc))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z && this.videoPlayListener != null && ((z3 || !TextUtils.isEmpty(str)) && z4)) {
                this.videoPlayListener.onResolutionChangedByQuality(this.videoStateInquirer, this.playEntity, str, z2, z3);
            }
            this.autoQuality = z2;
            if (z2) {
                this.videoEngine.LJLLLL(29, 1);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            List<String> geRealSupportedQualityInfos = geRealSupportedQualityInfos();
            if (geRealSupportedQualityInfos == null || geRealSupportedQualityInfos.size() == 0 || (geRealSupportedQualityInfos.size() == 1 && TextUtils.isEmpty((CharSequence) ListProtector.get(geRealSupportedQualityInfos, 0)))) {
                for (Map.Entry entry : ((ConcurrentHashMap) C48041ItJ.LIZ).entrySet()) {
                    if (entry != null && str.equals(entry.getValue())) {
                        EnumC47176IfM enumC47176IfM = (EnumC47176IfM) entry.getKey();
                        if (enumC47176IfM == null) {
                            return;
                        }
                        this.currentQualityDesc = str;
                        this.videoEngine.LJII(enumC47176IfM);
                        return;
                    }
                }
                return;
            }
            this.currentQualityDesc = str;
            HashMap hashMap = new HashMap();
            hashMap.put(32, str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("configResolutionByQuality:");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            this.videoEngine.LJI(getTargetResolutionByQuality(str), hashMap);
        }
    }
}
