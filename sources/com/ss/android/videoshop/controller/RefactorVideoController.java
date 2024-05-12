package com.ss.android.videoshop.controller;

import X.AbstractC47819Ipj;
import X.C05L;
import X.C07670Rv;
import X.C16880lQ;
import X.C25990AHy;
import X.C46886Iag;
import X.C46967Ibz;
import X.C47160If6;
import X.C47163If9;
import X.C47164IfA;
import X.C47620ImW;
import X.C47789IpF;
import X.C48041ItJ;
import X.C48042ItK;
import X.C48155Iv9;
import X.C48157IvB;
import X.C48160IvE;
import X.C61845OOz;
import X.C78702Uug;
import X.C78949Uyf;
import X.C78999UzT;
import X.C79985VaH;
import X.C87406YSc;
import X.EnumC47176IfM;
import X.EnumC48219IwB;
import X.EnumC81331Vvz;
import X.InterfaceC48221IwD;
import X.InterfaceC58392Mvs;
import X.InterfaceC87404YSa;
import X.InterfaceC87405YSb;
import X.InterfaceC87410YSg;
import X.InterfaceC87411YSh;
import X.UC0;
import X.VIF;
import X.X1D;
import X.YS7;
import X.YSH;
import X.YSI;
import X.YSK;
import X.YSM;
import X.YSO;
import X.YSP;
import X.YSR;
import X.YSS;
import X.YST;
import X.YSU;
import X.YSW;
import X.YSX;
import X.YTA;
import X.YTJ;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.ttvideoengine.TTVideoEngine;
import defpackage.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes16.dex */
public class RefactorVideoController implements YS7, YSR {
    public boolean asyncPosition;
    public boolean asyncRelease;
    public int bufferCount;
    public boolean canCountBuffer;
    public final WeakHandler controllerHandler;
    public C87406YSc dataSource;
    public boolean forceUseLitePlayer;
    public final WeakHandler handler;
    public final WeakHandler.IHandler handlerListener;
    public boolean loop;
    public C48157IvB mEngineCallback;
    public int mLastProgressUpdatePosition;
    public SurfaceHolder mSurfaceHolder;
    public YSI mTTVideoPlayer;
    public int mVideoViewType;
    public boolean mute;
    public C79985VaH playEntity;
    public C46886Iag playbackParams;
    public int playerType;
    public boolean releaseEngineEnabled;
    public boolean rememberVideoPosition;
    public int renderMode;
    public boolean seekToEnd;
    public boolean shouldMarkPushTime;
    public Surface surface;
    public boolean tryToInterceptPlay;
    public AbstractC47819Ipj ttvNetClient;
    public YTJ videoContext;
    public InterfaceC58392Mvs videoEngineFactory;
    public C48155Iv9 videoInfoBean;
    public YSS videoInfoQuery;
    public InterfaceC87405YSb videoPlayConfiger;
    public InterfaceC87404YSa videoPlayListener;
    public YSX videoPlayStatusQuery;
    public YSU videoSourceInfo;
    public InterfaceC48221IwD videoStateInquirer;
    public WeakHandler.IHandler weakIHandler;

    public RefactorVideoController() {
        this(null);
    }

    public void cleanVideoEngine() {
    }

    @Override // X.YSR
    public void doEnginePlay() {
        String str;
        InterfaceC87405YSb interfaceC87405YSb;
        updatePlayStatus(1);
        if (this.tryToInterceptPlay && ((getVideoModelInfo().LIZIZ != null || getVideoModelInfo().LIZJ != null) && (interfaceC87405YSb = this.videoPlayConfiger) != null && interfaceC87405YSb.LIZIZ(C16880lQ.LLJJI(C78999UzT.LJLIL)))) {
            EnumC48219IwB.INS.trace(this.playEntity, YSM.CONTROLLER_INTERCEPT_DO_PLAY, null, null, this.videoStateInquirer);
            return;
        }
        YSI ysi = this.mTTVideoPlayer;
        ysi.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play_video vid:");
        YSU ysu = ysi.LJLJJI;
        String str2 = "";
        if (ysu == null) {
            str = "";
        } else {
            str = ysu.LIZIZ;
        }
        LIZ.append(str);
        LIZ.append(" hashCode:");
        LIZ.append(ysi.hashCode());
        LIZ.append(" title:");
        YSU ysu2 = ysi.LJLJJI;
        if (ysu2 != null) {
            str2 = ysu2.LJI;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        TTVideoEngine tTVideoEngine = ysi.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLI();
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onEnginePlayStart(this.videoStateInquirer, this.playEntity, getPlayStartType());
        }
        this.bufferCount = 0;
    }

    @Override // X.YSR
    public void doPrepare() {
        String str;
        updatePlayStatus(2);
        YSI ysi = this.mTTVideoPlayer;
        ysi.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepare_video vid:");
        YSU ysu = ysi.LJLJJI;
        String str2 = "";
        if (ysu == null) {
            str = "";
        } else {
            str = ysu.LIZIZ;
        }
        LIZ.append(str);
        LIZ.append(" hashCode:");
        LIZ.append(ysi.hashCode());
        LIZ.append(" title:");
        YSU ysu2 = ysi.LJLJJI;
        if (ysu2 != null) {
            str2 = ysu2.LJI;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        TTVideoEngine tTVideoEngine = ysi.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIIJ();
        }
    }

    @Override // X.YSR
    public void responseCompleted() {
        String str;
        updatePlayStatus(5);
        if (!this.videoInfoQuery.LIZ()) {
            pauseProgressUpdate();
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
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoPreCompleted(this.videoStateInquirer, this.playEntity);
            this.videoPlayListener.onVideoCompleted(this.videoStateInquirer, this.playEntity);
            if (this.videoInfoQuery.LIZ()) {
                this.videoPlayListener.onVideoReplay(this.videoStateInquirer, this.playEntity);
                updatePlayStatus(6);
            }
        }
    }

    @Override // X.YSR
    public void responsePrepared() {
        updatePlayStatus(3);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPrepared(this.videoStateInquirer, this.playEntity);
        }
    }

    @Override // X.YSR
    public void responseRenderStart() {
        updatePlayStatus(4);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPreRenderStart(this.videoStateInquirer, this.playEntity);
            this.videoPlayListener.onRenderStart(this.videoStateInquirer, this.playEntity);
        }
    }

    @Override // X.YS7
    public void setVideoMethodOpt(boolean z) {
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

    private void resetEngineAndData() {
        this.mTTVideoPlayer.LJIILIIL(this.asyncRelease, true);
        this.mEngineCallback.LIZIZ();
        YSS yss = this.videoInfoQuery;
        yss.LIZ = null;
        yss.LIZIZ = 0;
        yss.LIZJ = 0;
        yss.LIZLLL = 0;
        yss.LJ = 0;
        yss.LJI = null;
        yss.LJII = null;
        yss.LJFF = false;
        yss.LJIIIIZZ = 0L;
        YSX ysx = this.videoPlayStatusQuery;
        ysx.LIZJ = false;
        ysx.LJ = false;
        ysx.LJFF = false;
        ysx.LIZLLL = false;
        ysx.LIZ = null;
        ysx.LJI = false;
        ysx.LIZIZ = false;
        ysx.LJII = 1;
        C48155Iv9 c48155Iv9 = this.videoInfoBean;
        C48042ItK c48042ItK = c48155Iv9.LIZ;
        c48042ItK.LIZ = null;
        c48042ItK.LIZLLL = 0;
        c48042ItK.LIZIZ.clear();
        ((ArrayList) c48042ItK.LIZJ).clear();
        c48155Iv9.LIZIZ = null;
        c48155Iv9.LIZJ = null;
        this.videoSourceInfo = null;
    }

    @Override // X.YSR
    public YSU buildVideoSourceInfo() {
        YSW ysw = new YSW();
        C79985VaH c79985VaH = this.playEntity;
        if (c79985VaH.LJFF != null) {
            C79985VaH c79985VaH2 = this.playEntity;
            Pair<String, String> pair = new Pair<>(c79985VaH2.LJFF, c79985VaH2.LJI);
            ysw.LIZ = 5;
            ysw.LJ = pair;
        } else {
            C47164IfA c47164IfA = c79985VaH.LIZLLL;
            if (c47164IfA != null) {
                ysw.LIZ = 2;
                ysw.LIZIZ = c47164IfA;
            } else if (!TextUtils.isEmpty(null)) {
                ysw.LIZ = 3;
                this.playEntity.getClass();
                ysw.LIZJ = null;
            } else if (!TextUtils.isEmpty(this.playEntity.LJ)) {
                ysw.LIZ = 4;
                ysw.LIZLLL = this.playEntity.LJ;
            } else {
                this.playEntity.getClass();
                if (!TextUtils.isEmpty(null)) {
                    ysw.LIZ = 4;
                    this.playEntity.getClass();
                    ysw.LIZLLL = null;
                } else {
                    this.playEntity.getClass();
                    if (!TextUtils.isEmpty(null)) {
                        ysw.LIZ = 3;
                        this.playEntity.getClass();
                        ysw.LIZJ = null;
                    } else {
                        this.playEntity.getClass();
                    }
                }
            }
        }
        String str = this.playEntity.LIZ;
        YSU ysu = new YSU();
        ysu.LIZ = ysw.LIZ;
        ysu.LIZIZ = str;
        ysu.LIZJ = ysw.LIZIZ;
        ysu.LIZLLL = ysw.LIZJ;
        ysu.LJ = ysw.LIZLLL;
        ysu.LJFF = ysw.LJ;
        ysu.LJI = null;
        this.videoSourceInfo = ysu;
        return ysu;
    }

    @Override // X.YS7
    public Bitmap captureVideoCurrentFrame() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJLIIIJL();
        }
        return null;
    }

    @Override // X.YS7
    public void clearSurfaceIfUseSurfaceView() {
        TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJ(null);
        }
    }

    @Override // X.YSR
    public void configPrepareToPlay() {
        if (this.videoPlayStatusQuery.LIZIZ) {
            if (this.surface != null && (getVideoViewType() == 0 || getVideoViewType() == 2)) {
                setSurface(this.surface);
            } else {
                SurfaceHolder surfaceHolder = this.mSurfaceHolder;
                if (surfaceHolder != null) {
                    setSurfaceHolder(surfaceHolder);
                }
            }
            this.mTTVideoPlayer.LJIILJJIL(100, 1);
        }
    }

    @Override // X.YS7
    public YSP fetchVideoSnapshotInfo() {
        YSP ysp = new YSP();
        ysp.LIZ = this.mTTVideoPlayer.LJLJI;
        ysp.LIZIZ = this.videoPlayStatusQuery.LIZ();
        ysp.LIZJ = this.playEntity;
        ysp.LIZLLL = this.videoInfoQuery.LJI;
        C48042ItK c48042ItK = this.videoInfoBean.LIZ;
        ysp.LJ = c48042ItK.LIZLLL;
        ysp.LJFF = this.playbackParams;
        ysp.LJI = c48042ItK.LIZIZ;
        getCurrentVideoInfo();
        ysp.LJII = this.videoInfoQuery.LIZ();
        ysp.LJIIJ = this.asyncRelease;
        return ysp;
    }

    public EnumC47176IfM getAutoResolution() {
        if (this.videoPlayStatusQuery.LIZ == null) {
            return this.videoInfoQuery.LJI;
        }
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIJJLI();
        }
        return null;
    }

    @Override // X.YS7
    public int getCurrentPosition() {
        return getCurrentPosition(this.asyncPosition);
    }

    @Override // X.YS7
    public String getCurrentQualityDesc() {
        TTVideoEngine tTVideoEngine;
        YSS yss = this.videoInfoQuery;
        TTVideoEngine tTVideoEngine2 = yss.LIZ;
        if (tTVideoEngine2 != null && !TextUtils.isEmpty(tTVideoEngine2.LJIJJ())) {
            return yss.LIZ.LJIJJ();
        }
        if (TextUtils.isEmpty(yss.LJII) && (tTVideoEngine = yss.LIZ) != null && tTVideoEngine.LJIJJLI() != null) {
            yss.LJII = (String) ((ConcurrentHashMap) C48041ItJ.LIZ).get(yss.LIZ.LJIJJLI());
        }
        return yss.LJII;
    }

    @Override // X.YS7
    public int getDuration() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIL();
        }
        return 0;
    }

    public int getEarDurationForLastLoop() {
        return this.videoInfoQuery.LJ;
    }

    public float getMaxVolume() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJIIZ();
        }
        return 0.0f;
    }

    public int getPlayStartType() {
        return this.videoPlayStatusQuery.LJII;
    }

    @Override // X.YS7
    public EnumC47176IfM getResolution() {
        YSS yss = this.videoInfoQuery;
        if (yss.LJFF) {
            return EnumC47176IfM.Auto;
        }
        TTVideoEngine tTVideoEngine = yss.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJIJJLI();
        }
        return null;
    }

    public long getStartPlayPosition() {
        return (int) this.videoInfoQuery.LJIIIIZZ;
    }

    @Override // X.YS7
    public TTVideoEngine getVideoEngine() {
        return this.mTTVideoPlayer.LJLJI;
    }

    public C48042ItK getVideoModelInfo() {
        return this.videoInfoBean.LIZ;
    }

    public float getVolume() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJ();
        }
        return 0.0f;
    }

    @Override // X.YS7
    public int getWatchedDuration() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJI();
        }
        return 0;
    }

    public int getWatchedDurationForLastLoop() {
        return this.videoInfoQuery.LIZJ;
    }

    @Override // X.YSR
    public void initVideoEngine() {
        TTVideoEngine LJ;
        InterfaceC58392Mvs interfaceC58392Mvs = this.videoEngineFactory;
        if (interfaceC58392Mvs instanceof InterfaceC87410YSg) {
            InterfaceC87410YSg interfaceC87410YSg = (InterfaceC87410YSg) interfaceC58392Mvs;
            LJ = new TTVideoEngine(C78999UzT.LJLIL, interfaceC87410YSg.LIZLLL(), interfaceC87410YSg.LJII());
            ((InterfaceC87410YSg) this.videoEngineFactory).initVideoEngine();
        } else {
            LJ = interfaceC58392Mvs.LJ(C78999UzT.LJLIL, this.playerType);
        }
        bindEngine(LJ);
    }

    @Override // X.YS7
    public boolean isCurrentAutoQuality() {
        return this.videoInfoQuery.LJFF;
    }

    public boolean isDashSource() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJJJJL()) {
            return true;
        }
        return false;
    }

    public boolean isError() {
        TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 3) {
            return true;
        }
        return false;
    }

    public boolean isLoading() {
        TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJIII() == 2) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isLoop() {
        return this.videoInfoQuery.LIZ();
    }

    @Override // X.YS7
    public boolean isPaused() {
        TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 2) {
            return true;
        }
        return false;
    }

    public boolean isPlayUsedSR() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJJLL()) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isPlayed() {
        return this.videoPlayStatusQuery.LIZLLL;
    }

    @Override // X.YS7
    public boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 1) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isPrepared() {
        return this.videoPlayStatusQuery.LIZJ;
    }

    @Override // X.YS7
    public boolean isReleased() {
        if (this.videoPlayStatusQuery.LIZ == null) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isRenderStarted() {
        return this.videoPlayStatusQuery.LJ;
    }

    @Override // X.YS7
    public boolean isShouldPlay() {
        TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJJJZ()) {
            return true;
        }
        return false;
    }

    @Override // X.YS7
    public boolean isStarted() {
        TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJJJZI()) {
            return true;
        }
        return false;
    }

    public boolean isSupportRealAbr() {
        C47163If9 c47163If9;
        C47164IfA c47164IfA = this.videoInfoBean.LIZ.LIZ;
        if (!c47164IfA.LJJIJ() && !c47164IfA.LJJIJ() && (((c47163If9 = c47164IfA.LIZJ) == null || !c47163If9.LIZLLL(206).booleanValue() || !c47164IfA.LJJIII()) && !isDashSource())) {
            return false;
        }
        return true;
    }

    public boolean isSystemPlayer() {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
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
        return this.videoPlayStatusQuery.LIZ();
    }

    @Override // X.YS7
    public void pause() {
        String str;
        YSI ysi = this.mTTVideoPlayer;
        ysi.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause_video vid:");
        YSU ysu = ysi.LJLJJI;
        String str2 = "";
        if (ysu == null) {
            str = "";
        } else {
            str = ysu.LIZIZ;
        }
        LIZ.append(str);
        LIZ.append(" hashCode:");
        LIZ.append(ysi.hashCode());
        LIZ.append(" title:");
        YSU ysu2 = ysi.LJLJJI;
        if (ysu2 != null) {
            str2 = ysu2.LJI;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        TTVideoEngine tTVideoEngine = ysi.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
        pauseProgressUpdate();
    }

    @Override // X.YS7
    public void play() {
        if (this.playEntity == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play videoEngine:");
        LIZ.append(this.mTTVideoPlayer.LJLJI);
        LIZ.append(", vid:");
        LIZ.append(this.playEntity.LIZ);
        LIZ.append(", hashCode:");
        LIZ.append(hashCode());
        LIZ.append(", title:");
        C05L.LJ(this.playEntity, LIZ, null, LIZ);
        if (this.videoPlayStatusQuery.LJI) {
            this.videoPlayListener.onVideoRetry(this.videoStateInquirer, this.playEntity);
            resetEngineAndData();
        }
        this.bufferCount = 0;
        YSI ysi = this.mTTVideoPlayer;
        if (!ysi.LJIIL()) {
            YSX ysx = this.videoPlayStatusQuery;
            if (ysx.LIZLLL) {
                if (ysx.LIZ()) {
                    this.videoPlayListener.onVideoReplay(this.videoStateInquirer, this.playEntity);
                }
                doEnginePlay();
                return;
            }
            if (ysx.LIZIZ) {
                InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
                if (interfaceC87404YSa != null) {
                    interfaceC87404YSa.onFetchVideoModel(this.videoStateInquirer, this.playEntity, false);
                    this.videoPlayListener.onEngineInitPlay(this.videoStateInquirer, this.playEntity);
                }
                if (this.videoPlayStatusQuery.LIZJ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("prepared play:");
                    LIZ2.append(this.playEntity.LIZ);
                    LIZ2.append(" title:");
                    C05L.LJ(this.playEntity, LIZ2, null, LIZ2);
                    YSI ysi2 = this.mTTVideoPlayer;
                    ((YSR) ysi2.LJLILLLLZI).configPrepareToPlay();
                    ((YSR) ysi2.LJLILLLLZI).doEnginePlay();
                    InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
                    if (interfaceC87404YSa2 != null) {
                        interfaceC87404YSa2.onPrepared(this.videoStateInquirer, this.playEntity);
                        return;
                    }
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("preparing play:");
                LIZ3.append(this.playEntity.LIZ);
                LIZ3.append(" title:");
                C05L.LJ(this.playEntity, LIZ3, null, LIZ3);
                if (this.videoPlayListener != null) {
                    TTVideoEngine tTVideoEngine = this.videoPlayStatusQuery.LIZ;
                    if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 3) {
                        this.videoPlayListener.onVideoRetry(this.videoStateInquirer, this.playEntity);
                    } else if (isVideoPlayCompleted()) {
                        this.videoPlayListener.onVideoReplay(this.videoStateInquirer, this.playEntity);
                    }
                }
                YSI ysi3 = this.mTTVideoPlayer;
                ((YSR) ysi3.LJLILLLLZI).configPrepareToPlay();
                ((YSR) ysi3.LJLILLLLZI).doEnginePlay();
                return;
            }
            doEnginePlay();
            return;
        }
        ((YSR) ysi.LJLILLLLZI).initVideoEngine();
        YSU buildVideoSourceInfo = ((YSR) ysi.LJLILLLLZI).buildVideoSourceInfo();
        ysi.LJIJ(buildVideoSourceInfo);
        ((YSR) ysi.LJLILLLLZI).responseEngineInitPlay();
        ysi.LJIILL(((YSR) ysi.LJLILLLLZI).generateEngineParam(false));
        if (buildVideoSourceInfo.LIZ != 2 || !((YSR) ysi.LJLILLLLZI).responseFetchedVideoModel(buildVideoSourceInfo.LIZJ)) {
            ((YSR) ysi.LJLILLLLZI).doEnginePlay();
        }
    }

    @Override // X.YS7
    public void prepare() {
        if (this.playEntity == null) {
            return;
        }
        YSX ysx = this.videoPlayStatusQuery;
        if (ysx.LIZJ || ysx.LIZIZ) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepare videoEngine:");
        LIZ.append(this.mTTVideoPlayer.LJLJI);
        LIZ.append(", vid:");
        LIZ.append(this.playEntity.LIZ);
        LIZ.append(", hashCode:");
        LIZ.append(hashCode());
        LIZ.append(", thread:");
        LIZ.append(C16880lQ.LLLLIIIILLL());
        LIZ.append(" title:");
        C05L.LJ(this.playEntity, LIZ, null, LIZ);
        resetEngineAndData();
        YSI ysi = this.mTTVideoPlayer;
        ((YSR) ysi.LJLILLLLZI).initVideoEngine();
        YSU buildVideoSourceInfo = ((YSR) ysi.LJLILLLLZI).buildVideoSourceInfo();
        ysi.LJIJ(buildVideoSourceInfo);
        if (buildVideoSourceInfo.LIZ == 2) {
            ((YSR) ysi.LJLILLLLZI).responseFetchedVideoModel(buildVideoSourceInfo.LIZJ);
        }
        ysi.LJIILL(((YSR) ysi.LJLILLLLZI).generateEngineParam(true));
        ((YSR) ysi.LJLILLLLZI).doPrepare();
    }

    @Override // X.YSR
    public boolean prepareCalledPlayNotCalled() {
        YSX ysx = this.videoPlayStatusQuery;
        if (ysx.LIZIZ && !ysx.LIZLLL) {
            return true;
        }
        return false;
    }

    @Override // X.YSR
    public void responseEngineInitPlay() {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onEngineInitPlay(this.videoStateInquirer, this.playEntity);
        }
    }

    @Override // X.YSR
    public void responsePrepare() {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPrepare(this.videoStateInquirer, this.playEntity);
        }
    }

    public void responseSubtitlePathInfo() {
        String str;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            C48160IvE c48160IvE = this.videoInfoBean.LIZIZ;
            if (c48160IvE != null) {
                str = c48160IvE.LIZ;
            } else {
                str = null;
            }
            interfaceC87404YSa.onExternalSubtitlesPathInfoCallback(this.videoStateInquirer, this.playEntity, str, null);
        }
    }

    @Override // X.YS7
    public void resumeProgressUpdate() {
        WeakHandler weakHandler = this.handler;
        if (weakHandler != null) {
            weakHandler.sendEmptyMessage(EnumC81331Vvz.UPDATE_PROGRESS.getWhat());
        }
    }

    public List<String> supportedQualityInfos() {
        String[] LLJJL;
        YSS yss = this.videoInfoQuery;
        List<C47160If6> list = this.videoInfoBean.LIZ.LIZJ;
        TTVideoEngine tTVideoEngine = yss.LIZ;
        if (tTVideoEngine != null && (LLJJL = tTVideoEngine.LLJJL()) != null && LLJJL.length > 0 && (LLJJL.length != 1 || !TextUtils.isEmpty(LLJJL[0]))) {
            return Arrays.asList(LLJJL);
        }
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C47160If6 c47160If6 = (C47160If6) it.next();
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
        return arrayList;
    }

    private void updateVideoSize() {
        List<C47160If6> LIZLLL = getVideoModel().LIZLLL();
        if (this.videoPlayListener != null && LIZLLL != null) {
            for (C47160If6 c47160If6 : LIZLLL) {
                if (c47160If6 != null) {
                    int LIZLLL2 = c47160If6.LIZLLL(1);
                    if (c47160If6.LIZLLL(2) > 0 && LIZLLL2 > 0) {
                        this.videoPlayListener.onUpdateVideoSize(c47160If6);
                        return;
                    }
                }
            }
        }
    }

    public List<C47160If6> getAllVideoInfoList() {
        return getVideoModelInfo().LIZJ;
    }

    @Override // X.YS7
    public C47160If6 getCurrentVideoInfo() {
        List<C47160If6> list = getVideoModelInfo().LIZJ;
        if (list != null) {
            String currentQualityDesc = getCurrentQualityDesc();
            if (!TextUtils.isEmpty(currentQualityDesc)) {
                for (C47160If6 c47160If6 : list) {
                    if (currentQualityDesc.equals(c47160If6.LIZIZ(32))) {
                        return c47160If6;
                    }
                }
            }
            EnumC47176IfM autoResolution = getAutoResolution();
            if (autoResolution != null) {
                for (C47160If6 c47160If62 : list) {
                    if (c47160If62 != null && c47160If62.getResolution() == autoResolution) {
                        return c47160If62;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public int getResolutionCount() {
        return getVideoModelInfo().LIZLLL;
    }

    public SparseArray<C47160If6> getVideoInfos() {
        return getVideoModelInfo().LIZIZ;
    }

    @Override // X.YS7
    public C47164IfA getVideoModel() {
        return getVideoModelInfo().LIZ;
    }

    @Override // X.YS7
    public void release() {
        C79985VaH c79985VaH;
        if (isReleased()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("releaseEngineEnabled:");
        LIZ.append(this.releaseEngineEnabled);
        LIZ.append(", asyncRelease:");
        LIZ.append(this.asyncRelease);
        LIZ.append(", vid:");
        LIZ.append(this.playEntity.LIZ);
        LIZ.append(" title:");
        C05L.LJ(this.playEntity, LIZ, null, LIZ);
        updatePlayStatus(8);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoPreRelease(this.videoStateInquirer, this.playEntity);
        }
        pauseProgressUpdate();
        if (!this.videoPlayStatusQuery.LIZ()) {
            long currentPosition = getCurrentPosition();
            if (currentPosition > 0 && (c79985VaH = this.playEntity) != null && !TextUtils.isEmpty(c79985VaH.LIZ)) {
                C25990AHy.LIZIZ(currentPosition, this.playEntity.LIZ, this.shouldMarkPushTime);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Release Vid:");
                b0.LJ(LIZ2, this.playEntity.LIZ, " Push Pos:", currentPosition);
                X1D.LIZIZ(LIZ2);
            }
        }
        this.mTTVideoPlayer.LJIILIIL(this.asyncRelease, this.releaseEngineEnabled);
        YSX ysx = this.videoPlayStatusQuery;
        ysx.LIZJ = false;
        ysx.LJ = false;
        ysx.LJFF = false;
        ysx.LIZLLL = false;
        ysx.LIZ = null;
        ysx.LJI = false;
        ysx.LIZIZ = false;
        ysx.LJII = 1;
        YSS yss = this.videoInfoQuery;
        yss.LIZ = null;
        yss.LIZIZ = 0;
        yss.LIZJ = 0;
        yss.LIZLLL = 0;
        yss.LJ = 0;
        yss.LJI = null;
        yss.LJII = null;
        yss.LJFF = false;
        yss.LJIIIIZZ = 0L;
        this.mEngineCallback.LIZIZ();
        C48155Iv9 c48155Iv9 = this.videoInfoBean;
        C48042ItK c48042ItK = c48155Iv9.LIZ;
        c48042ItK.LIZ = null;
        c48042ItK.LIZLLL = 0;
        c48042ItK.LIZIZ.clear();
        ((ArrayList) c48042ItK.LIZJ).clear();
        c48155Iv9.LIZIZ = null;
        c48155Iv9.LIZJ = null;
        InterfaceC87404YSa interfaceC87404YSa2 = this.videoPlayListener;
        if (interfaceC87404YSa2 != null) {
            interfaceC87404YSa2.onVideoReleased(this.videoStateInquirer, this.playEntity);
        }
    }

    @Override // X.YSR
    public void responseOnVideoPause() {
        pauseProgressUpdate();
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoPause(this.videoStateInquirer, this.playEntity);
        }
    }

    @Override // X.YSR
    public void responseOnVideoPlay() {
        resumeProgressUpdate();
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoPlay(this.videoStateInquirer, this.playEntity);
        }
    }

    public boolean asyncRelease() {
        return this.asyncRelease;
    }

    @Override // X.YS7
    public C79985VaH getPlayEntity() {
        return this.playEntity;
    }

    @Override // X.YS7
    public C46886Iag getPlaybackParams() {
        return this.playbackParams;
    }

    @Override // X.YSR
    public C48155Iv9 getVideoInfoBean() {
        return this.videoInfoBean;
    }

    public YSS getVideoInfoQuery() {
        return this.videoInfoQuery;
    }

    public YSX getVideoPlayStatusQuery() {
        return this.videoPlayStatusQuery;
    }

    @Override // X.YSR
    public YSU getVideoSourceInfo() {
        return this.videoSourceInfo;
    }

    @Override // X.YS7
    public InterfaceC48221IwD getVideoStateInquirer() {
        return this.videoStateInquirer;
    }

    @Override // X.YSR
    public int getVideoViewType() {
        return this.mVideoViewType;
    }

    public boolean isReleaseEngineEnabled() {
        return this.releaseEngineEnabled;
    }

    public boolean isTryToInterceptPlay() {
        return this.tryToInterceptPlay;
    }

    public RefactorVideoController(YTJ ytj) {
        this.rememberVideoPosition = true;
        this.canCountBuffer = true;
        this.releaseEngineEnabled = true;
        this.dataSource = new C87406YSc();
        YSK ysk = new YSK(this);
        this.handlerListener = ysk;
        this.handler = new WeakHandler(ysk);
        this.weakIHandler = new YST(this);
        WeakHandler weakHandler = new WeakHandler(VIF.LIZ().getLooper(), this.weakIHandler);
        this.controllerHandler = weakHandler;
        this.videoContext = ytj;
        YSI ysi = new YSI();
        this.mTTVideoPlayer = ysi;
        ysi.LJLILLLLZI = this;
        this.videoStateInquirer = new YSO(ytj, this);
        this.videoPlayStatusQuery = new YSX();
        this.videoInfoQuery = new YSS();
        this.videoInfoBean = new C48155Iv9();
        C48157IvB c48157IvB = new C48157IvB();
        this.mEngineCallback = c48157IvB;
        c48157IvB.LJI = this;
        c48157IvB.LJII = weakHandler;
        this.videoStateInquirer = new YSH(this, ytj);
        this.videoEngineFactory = new C78949Uyf();
        this.videoPlayConfiger = new C78702Uug();
    }

    private void bindEngine(TTVideoEngine tTVideoEngine) {
        this.mTTVideoPlayer.LJLJI = tTVideoEngine;
        this.mEngineCallback.LIZ(tTVideoEngine);
        this.videoInfoQuery.LIZ = tTVideoEngine;
        this.videoPlayStatusQuery.LIZ = tTVideoEngine;
    }

    private C47160If6 getFirstPlayVideoInfo(C47164IfA c47164IfA) {
        InterfaceC87405YSb interfaceC87405YSb = this.videoPlayConfiger;
        if (interfaceC87405YSb == null) {
            return null;
        }
        C47163If9 c47163If9 = c47164IfA.LIZJ;
        if (interfaceC87405YSb instanceof InterfaceC87411YSh) {
            InterfaceC87411YSh interfaceC87411YSh = (InterfaceC87411YSh) interfaceC87405YSb;
            C47160If6 LJFF = interfaceC87411YSh.LJFF(this.videoStateInquirer, c47164IfA, this.playEntity);
            interfaceC87411YSh.LIZLLL(LJFF, this.videoStateInquirer, c47164IfA, this.playEntity);
            if (LJFF != null) {
                return LJFF;
            }
        }
        C47160If6 LIZJ = this.videoPlayConfiger.LIZJ(c47164IfA);
        if (LIZJ == null) {
            return this.videoPlayConfiger.LJ(c47163If9);
        }
        return LIZJ;
    }

    private void updatePlayStatus(int i) {
        updatePlayStatus(i, null);
    }

    public boolean filterProgressUpdate(int i) {
        if (i <= 0) {
            return false;
        }
        C79985VaH c79985VaH = this.playEntity;
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f2  */
    @Override // X.YSR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.YSN generateEngineParam(boolean r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.videoshop.controller.RefactorVideoController.generateEngineParam(boolean):X.YSN");
    }

    @Override // X.YS7
    public int getCurrentPosition(boolean z) {
        if (z && this.asyncPosition) {
            TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
            if (tTVideoEngine == null) {
                return 0;
            }
            return tTVideoEngine.LJIJI();
        }
        TTVideoEngine tTVideoEngine2 = this.videoInfoQuery.LIZ;
        if (tTVideoEngine2 == null) {
            return 0;
        }
        return tTVideoEngine2.LJIJ();
    }

    public Object getEngineLongOptionValue(int i) {
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        Long l = null;
        if (tTVideoEngine == null) {
            return null;
        }
        try {
            l = Long.valueOf(tTVideoEngine.LJJIIJZLJL(i));
            return l;
        } catch (Exception unused) {
            return l;
        }
    }

    public EnumC47176IfM getTargetResolutionByQuality(String str) {
        this.videoInfoBean.LIZ.getClass();
        return C48042ItK.LIZ(str);
    }

    public C47620ImW getVideoEngineInfos(String str) {
        C46967Ibz c46967Ibz;
        Map map;
        if (TextUtils.isEmpty(str) || (c46967Ibz = this.videoInfoBean.LIZJ) == null || (map = c46967Ibz.LIZ) == null) {
            return null;
        }
        return (C47620ImW) map.get(str);
    }

    public void openTextureRenderSR(boolean z) {
        TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJJZ(z);
        }
    }

    public void responseBarrageMaskInfo(Bundle bundle) {
        if (this.videoPlayListener != null && bundle != null) {
            this.videoPlayListener.onBarrageMaskCallback(this.videoStateInquirer, this.playEntity, bundle.getInt("pts", 0), bundle.getString("info", ""));
        }
    }

    @Override // X.YSR
    public void responseBufferingUpdate(int i) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onBufferingUpdate(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.YSR
    public void responseError(C47789IpF c47789IpF) {
        updatePlayStatus(7, c47789IpF);
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onError(this.videoStateInquirer, this.playEntity, c47789IpF);
        }
    }

    @Override // X.YSR
    public boolean responseFetchedVideoModel(C47164IfA c47164IfA) {
        InterfaceC87405YSb interfaceC87405YSb;
        C48042ItK c48042ItK = this.videoInfoBean.LIZ;
        c48042ItK.LIZ = c47164IfA;
        boolean z = false;
        if (c47164IfA != null) {
            C47163If9 c47163If9 = c47164IfA.LIZJ;
            c48042ItK.LIZIZ = UC0.LJJIIJZLJL(c47163If9);
            ArrayList arrayList = new ArrayList();
            if (c47163If9 != null && c47163If9.LJIIIIZZ() != null) {
                for (C47160If6 c47160If6 : c47163If9.LJIIIIZZ()) {
                    if (!TextUtils.isEmpty(c47160If6.LIZIZ(7))) {
                        arrayList.add(c47160If6);
                    }
                }
            }
            c48042ItK.LIZJ = arrayList;
            SparseArray LJJIIJZLJL = UC0.LJJIIJZLJL(c47163If9);
            int i = 0;
            for (int size = LJJIIJZLJL.size() - 1; size >= 0; size--) {
                if (LJJIIJZLJL.valueAt(size) != null) {
                    i++;
                }
            }
            c48042ItK.LIZLLL = i;
        }
        C47160If6 firstPlayVideoInfo = getFirstPlayVideoInfo(c47164IfA);
        if (firstPlayVideoInfo == null) {
            updateVideoSize();
        }
        setFistPlayResolution(firstPlayVideoInfo);
        if (this.tryToInterceptPlay && (interfaceC87405YSb = this.videoPlayConfiger) != null) {
            z = interfaceC87405YSb.LIZ(c47164IfA.LIZJ);
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onFetchVideoModel(this.videoStateInquirer, this.playEntity, z);
        }
        return z;
    }

    @Override // X.YSR
    public void responseLoadStateChanged(int i) {
        if (i == 1) {
            onBufferEnd();
        } else if (i == 2) {
            onBufferStart();
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onLoadStateChanged(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.YSR
    public void responsePlaybackStateChanged(int i) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPlaybackStateChanged(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.YSR
    public void responseSeekComplete(boolean z) {
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
        if (isPlaying() && (!this.seekToEnd || this.videoInfoQuery.LIZ())) {
            resumeProgressUpdate();
        }
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoSeekComplete(this.videoStateInquirer, this.playEntity, z);
        }
    }

    @Override // X.YSR
    public void responseStreamChanged(int i) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onStreamChanged(this.videoStateInquirer, this.playEntity, i);
        }
    }

    public void responseSubtitleInfoCallback(Bundle bundle) {
        if (this.videoPlayListener != null && bundle != null) {
            this.videoPlayListener.onExternalSubtitlesCallback(this.videoStateInquirer, this.playEntity, bundle.getInt("pts", 0), bundle.getString("info", ""));
        }
    }

    public void responseSubtitleSwitchComplete(Bundle bundle) {
        if (this.videoPlayListener != null && bundle != null) {
            this.videoPlayListener.onSubSwitchCompletedCallback(this.videoStateInquirer, this.playEntity, bundle.getInt("success", 0), bundle.getInt("subId", 0));
        }
    }

    @Override // X.YSR
    public void responseVideoEngineInfos(C47620ImW c47620ImW) {
        boolean z;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoEngineInfos(this.videoStateInquirer, this.playEntity, c47620ImW);
        }
        if (c47620ImW.LIZ.equals("renderSeekComplete") && this.videoPlayListener != null) {
            Object obj = c47620ImW.LIZJ;
            if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.videoPlayListener.onRenderSeekComplete(this.videoStateInquirer, this.playEntity, z);
        }
    }

    @Override // X.YSR
    public void responseVideoStatusException(int i) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoStatusException(this.videoStateInquirer, this.playEntity, i);
        }
    }

    @Override // X.YS7
    public void resumeVideoSnapshotInfo(YSP ysp) {
        if (ysp == null) {
            return;
        }
        setVideoEngine(ysp.LIZ);
        this.playEntity = ysp.LIZJ;
        YSS yss = this.videoInfoQuery;
        EnumC47176IfM enumC47176IfM = ysp.LIZLLL;
        yss.getClass();
        if (enumC47176IfM == EnumC47176IfM.Auto) {
            yss.LJFF = true;
        }
        yss.LJI = enumC47176IfM;
        this.playbackParams = ysp.LJFF;
        this.loop = ysp.LJII;
        this.asyncRelease = ysp.LJIIJ;
        this.dataSource.getClass();
        YSX ysx = this.videoPlayStatusQuery;
        ysx.getClass();
        ysx.LJFF = ysp.LIZIZ;
        C48042ItK c48042ItK = this.videoInfoBean.LIZ;
        c48042ItK.getClass();
        c48042ItK.LIZIZ = ysp.LJI;
        c48042ItK.LIZLLL = ysp.LJ;
    }

    @Override // X.YS7
    public void seekTo(long j) {
        int i;
        boolean z;
        String LIZ;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onPreVideoSeek(this.videoStateInquirer, this.playEntity, j);
        }
        TTVideoEngine tTVideoEngine = this.videoInfoQuery.LIZ;
        if (tTVideoEngine != null) {
            i = tTVideoEngine.LJIL();
        } else {
            i = 0;
        }
        if (j >= i) {
            z = true;
        } else {
            z = false;
        }
        this.seekToEnd = z;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("seek:");
        if (this.seekToEnd) {
            LIZ = "end";
        } else {
            LIZ = C61845OOz.LIZ("", j);
        }
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
        this.canCountBuffer = false;
        pauseProgressUpdate();
        YSI ysi = this.mTTVideoPlayer;
        long j2 = (int) j;
        TTVideoEngine tTVideoEngine2 = ysi.LJLJI;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LJJLIIIJLJLI((int) j2, ysi.LJLJJL);
        }
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

    public void setFistPlayResolution(C47160If6 c47160If6) {
        String str;
        C47163If9 c47163If9;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("get_video_info:");
        if (c47160If6 == null) {
            str = null;
        } else {
            str = c47160If6.LIZIZ(8) + ", size:" + c47160If6.LIZLLL(1) + "*" + c47160If6.LIZLLL(2) + ", definition:" + c47160If6.LIZIZ(7);
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (c47160If6 == null) {
            return;
        }
        C47164IfA c47164IfA = getVideoModelInfo().LIZ;
        if (c47164IfA.LJJIJ() || c47164IfA.LJJIJ() || ((c47163If9 = c47164IfA.LIZJ) != null && c47163If9.LIZLLL(206).booleanValue() && c47164IfA.LJJIII())) {
            EnumC47176IfM resolution = c47160If6.getResolution();
            EnumC47176IfM enumC47176IfM = EnumC47176IfM.Auto;
            if (resolution == enumC47176IfM) {
                YSS yss = this.videoInfoQuery;
                yss.getClass();
                yss.LJFF = true;
                yss.LJI = enumC47176IfM;
                setResolution(this.videoInfoQuery.LJI, false);
                return;
            }
        }
        YSS yss2 = this.videoInfoQuery;
        yss2.LJFF = false;
        EnumC47176IfM resolution2 = c47160If6.getResolution();
        if (resolution2 == EnumC47176IfM.Auto) {
            yss2.LJFF = true;
        }
        yss2.LJI = resolution2;
        this.videoInfoQuery.LJII = c47160If6.LIZIZ(32);
        TextUtils.isEmpty(this.videoInfoQuery.LJII);
        setResolution(this.videoInfoQuery.LJI, false);
    }

    public void setForceUseLitePlayer(boolean z) {
        this.forceUseLitePlayer = z;
    }

    @Override // X.YS7
    public void setLoop(boolean z) {
        this.loop = z;
        TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLFII(z);
        }
    }

    @Override // X.YS7
    public void setMute(boolean z) {
        this.mute = z;
        YSI ysi = this.mTTVideoPlayer;
        if (ysi.LJLJI != null) {
            C07670Rv.LIZLLL("setMute:", z);
            ysi.LJLJI.LJLZ(z);
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
        TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine != null) {
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
        TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJLLLL(4, i);
        }
    }

    public void setShouldMarkPushTime(boolean z) {
        this.shouldMarkPushTime = z;
    }

    @Override // X.YS7
    public void setStartTime(int i) {
        TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLIIZ(i);
        }
    }

    @Override // X.YS7
    public void setSurface(Surface surface) {
        this.surface = surface;
        this.mTTVideoPlayer.LJIILLIIL(surface);
    }

    @Override // X.YS7
    public void setSurfaceHolder(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        this.mTTVideoPlayer.LJIIZILJ(surfaceHolder);
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
        this.mEngineCallback.LIZIZ();
        this.mTTVideoPlayer.LJLJI = tTVideoEngine;
        this.mEngineCallback.LIZ(tTVideoEngine);
    }

    @Override // X.YS7
    public void setVideoEngineFactory(InterfaceC58392Mvs interfaceC58392Mvs) {
        if (interfaceC58392Mvs != null) {
            this.videoEngineFactory = interfaceC58392Mvs;
        }
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

    private void updatePlayStatus(int i, Object obj) {
        YSX ysx = this.videoPlayStatusQuery;
        ysx.getClass();
        switch (i) {
            case 1:
                ysx.LIZLLL = true;
                if (ysx.LIZ()) {
                    ysx.LJII = 3;
                } else {
                    TTVideoEngine tTVideoEngine = ysx.LIZ;
                    if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 2) {
                        ysx.LJII = 2;
                    } else if (ysx.LIZIZ && !ysx.LIZJ) {
                        ysx.LJII = 5;
                    } else if (ysx.LIZJ) {
                        ysx.LJII = 4;
                    } else {
                        ysx.LJII = 1;
                    }
                }
                ysx.LJFF = false;
                break;
            case 2:
                ysx.LJI = false;
                ysx.LIZIZ = true;
                break;
            case 3:
                ysx.LIZJ = true;
                break;
            case 4:
                ysx.LJ = true;
                ysx.LJI = false;
                break;
            case 5:
                ysx.LJFF = true;
                break;
            case 6:
                ysx.LJFF = false;
                break;
            case 7:
                boolean z = obj instanceof C47789IpF;
                ysx.LJI = true;
                ysx.LJFF = false;
                ysx.LIZJ = false;
                ysx.LIZIZ = false;
                ysx.LIZLLL = false;
                break;
        }
        YSS yss = this.videoInfoQuery;
        if (i != 5) {
            if (i != 7) {
                if (i != 8) {
                    yss.getClass();
                    return;
                } else {
                    yss.LIZIZ(false);
                    return;
                }
            }
            yss.LIZIZ = 0;
            yss.LIZLLL = 0;
            return;
        }
        yss.LIZIZ(true);
    }

    public void responseFrameDraw(int i, Map map) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onFrameDraw(this.videoStateInquirer, this.playEntity, i, map);
        }
    }

    @Override // X.YSR
    public void responseVideoSizeChanged(int i, int i2) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoSizeChanged(this.videoStateInquirer, this.playEntity, i, i2);
        }
    }

    @Override // X.YSR
    public void responseVideoStreamBitrateChanged(EnumC47176IfM enumC47176IfM, int i) {
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null) {
            interfaceC87404YSa.onVideoStreamBitrateChanged(this.videoStateInquirer, this.playEntity, enumC47176IfM, i);
        }
    }

    @Override // X.YS7
    public void setEngineOption(int i, Object obj) {
        this.mTTVideoPlayer.LJIILJJIL(i, obj);
    }

    @Override // X.YS7
    public void setResolution(EnumC47176IfM enumC47176IfM, boolean z) {
        boolean z2;
        String str;
        if (enumC47176IfM == null) {
            return;
        }
        YSS yss = this.videoInfoQuery;
        if (yss.LJI != enumC47176IfM) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC47176IfM enumC47176IfM2 = EnumC47176IfM.Auto;
        if (enumC47176IfM == enumC47176IfM2) {
            yss.LJFF = true;
        }
        yss.LJI = enumC47176IfM;
        InterfaceC87404YSa interfaceC87404YSa = this.videoPlayListener;
        if (interfaceC87404YSa != null && z2) {
            interfaceC87404YSa.onResolutionChanged(this.videoStateInquirer, this.playEntity, enumC47176IfM, z);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setResolution:");
        LIZ.append(enumC47176IfM);
        LIZ.append(" title:");
        if (this.playEntity == null) {
            str = "entity null";
        } else {
            str = null;
        }
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (enumC47176IfM == enumC47176IfM2) {
            TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJLLLL(29, 1);
                return;
            }
            return;
        }
        TTVideoEngine tTVideoEngine2 = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine2 == null) {
            return;
        }
        tTVideoEngine2.LJII(enumC47176IfM);
    }

    @Override // X.YS7
    public void setVolume(float f, float f2) {
        YSI ysi = this.mTTVideoPlayer;
        if (ysi.LJLJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setVolume left:");
            LIZ.append(f);
            LIZ.append(" right:");
            LIZ.append(f2);
            X1D.LIZIZ(LIZ);
            ysi.LJLJI.LLJJIJIL(f, f2);
        }
    }

    public void setResolution(int i, boolean z) {
        for (EnumC47176IfM enumC47176IfM : EnumC47176IfM.values()) {
            if (i == enumC47176IfM.getIndex()) {
                setResolution(enumC47176IfM, z);
                return;
            }
        }
    }

    @Override // X.YS7
    public void configResolutionByQuality(boolean z, String str, boolean z2, boolean z3, String str2) {
        boolean z4;
        C47163If9 c47163If9;
        if (z2 && !isDashSource()) {
            C47164IfA c47164IfA = getVideoModelInfo().LIZ;
            if (c47164IfA == null) {
                return;
            }
            if (!c47164IfA.LJJIJ() && ((c47163If9 = c47164IfA.LIZJ) == null || !c47163If9.LIZLLL(206).booleanValue() || !c47164IfA.LJJIII())) {
                return;
            }
        }
        boolean z5 = this.videoInfoQuery.LJFF;
        String currentQualityDesc = getCurrentQualityDesc();
        if (z5 != z2 || (!TextUtils.isEmpty(str) && !str.equals(currentQualityDesc))) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z && this.videoPlayListener != null && ((z3 || !TextUtils.isEmpty(str)) && z4)) {
            this.videoPlayListener.onResolutionChangedByQuality(this.videoStateInquirer, this.playEntity, str, z2, z3);
        }
        this.videoInfoQuery.LJFF = z2;
        if (z2) {
            TTVideoEngine tTVideoEngine = this.mTTVideoPlayer.LJLJI;
            if (tTVideoEngine != null) {
                tTVideoEngine.LJLLLL(29, 1);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C48042ItK c48042ItK = this.videoInfoBean.LIZ;
        c48042ItK.getClass();
        EnumC47176IfM LIZ = C48042ItK.LIZ(str);
        this.videoInfoQuery.LJII = str;
        C47164IfA c47164IfA2 = c48042ItK.LIZ;
        if (c47164IfA2 != null && c47164IfA2.LIZLLL() != null) {
            for (C47160If6 c47160If6 : c48042ItK.LIZ.LIZLLL()) {
                if (c47160If6 != null && !TextUtils.isEmpty(c47160If6.LIZIZ(32))) {
                    YSI ysi = this.mTTVideoPlayer;
                    if (ysi.LJLJI == null) {
                        return;
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put(32, str);
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("configResolutionByQuality:");
                    LIZ2.append(str);
                    X1D.LIZIZ(LIZ2);
                    ysi.LJLJI.LJI(LIZ, hashMap);
                    return;
                }
            }
        }
        TTVideoEngine tTVideoEngine2 = this.mTTVideoPlayer.LJLJI;
        if (tTVideoEngine2 == null) {
            return;
        }
        tTVideoEngine2.LJII(LIZ);
    }
}
