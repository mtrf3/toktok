package com.bytedance.gift.render.engine.alphaplayer.controller;

import X.C16880lQ;
import X.C32257ClJ;
import X.C32444CoK;
import X.C59895Nf1;
import X.C78163Ulz;
import X.C78249UnN;
import X.C79891VXb;
import X.C79895VXf;
import X.C79898VXi;
import X.DJ4;
import X.InterfaceC79452VGe;
import X.InterfaceC79901VXl;
import X.J01;
import X.J02;
import X.J07;
import X.VGW;
import X.VXM;
import X.VXO;
import X.VXQ;
import X.VXR;
import X.VXT;
import X.VXZ;
import X.X1D;
import Y.ARunnableS17S0101000_13;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import defpackage.b1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public class LocalPlayerController implements GenericLifecycleObserver, IPlayerController, Handler.Callback {
    public static final /* synthetic */ int LLIFFJFJJ = 0;
    public long LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public Context LJLJJLL;
    public IMonitor LJLJL;
    public AlphaPlayerAction LJLJLJ;
    public IMediaPlayer<AbsPlayer<AbsPlayer>> LJLJLLL;
    public Handler LJLL;
    public HandlerThread LJLLILLLL;
    public InterfaceC79452VGe LJLLJ;
    public final VXM LJZL;
    public LifecycleOwner LL;
    public boolean LLD;
    public VGW LLF;
    public JSONObject LLFF;
    public final IDRunnableS6S0101000 LLFFF;
    public final ARunnableS17S0101000_13 LLFII;
    public final VXZ LLFZ;
    public final VXR LLI;
    public final List<MaskSrc> LJLJJI = new ArrayList();
    public VXQ LJLJJL = VXQ.NOT_PREPARED;
    public final Handler LJLLI = new Handler(C16880lQ.LLJJJJ());
    public int LJLLL = 0;
    public int LJLLLL = 0;
    public int LJLLLLLL = 0;
    public int LJLZ = 0;
    public volatile boolean LJZ = false;
    public boolean LJZI = true;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        LJFF(LIZIZ(6, null));
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void pause() {
        LJFF(LIZIZ(3, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void release() {
        LJFF(LIZIZ(6, null));
        LifecycleOwner lifecycleOwner = this.LL;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.LL = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void resume() {
        LJFF(LIZIZ(4, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setPrepareListener(InterfaceC79901VXl interfaceC79901VXl) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void stop() {
        LJFF(LIZIZ(5, null));
    }

    static {
        C16880lQ.LJLLJ(LocalPlayerController.class);
    }

    public final void LIZLLL() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer;
        if (this.LJLLLLLL <= 0 && (iMediaPlayer = this.LJLJLLL) != null) {
            VideoInfo videoInfo = iMediaPlayer.getVideoInfo();
            this.LJLLL = videoInfo.getVideoWidth() / 2;
            this.LJLLLL = videoInfo.getVideoHeight();
        }
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe == null) {
            return;
        }
        interfaceC79452VGe.LJ(this.LJLLL, this.LJLLLL);
        this.LJLLI.post(new ARunnableS33S0200000_14(this, this.LJLLJ.getScaleType(), 7));
    }

    public final void LJ() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer == null) {
            return;
        }
        VXQ vxq = this.LJLJJL;
        if (vxq == VXQ.NOT_PREPARED || vxq == VXQ.STOPPED) {
            iMediaPlayer.setOnPreparedListener(this.LLFZ);
            this.LJLJLLL.setOnErrorListener(this.LLI);
            this.LJLJLLL.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void cancel() {
        LJFF(LIZIZ(12, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getCurFrame() {
        if (this.LJLJLLL == null || this.LJLZ == 0) {
            return -1;
        }
        float duration = getDuration();
        if (duration <= 0.0f) {
            return -1;
        }
        if (this.LJLJLLL.getCurrentPosition() / duration > 1.0f) {
            return -1;
        }
        return (int) Math.ceil(r1 * this.LJLZ);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getDuration() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer == null) {
            return -1;
        }
        try {
            return iMediaPlayer.getVideoInfo().getDuration();
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final String getPlayerType() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer != null) {
            return iMediaPlayer.getPlayerSimpleName();
        }
        return "unknown";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final View getView() {
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe != null) {
            return interfaceC79452VGe.getView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final boolean isPlaying() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer != null && iMediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void reset() {
        LJFF(LIZIZ(9, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startPlay() {
        if (this.LJLJLLL != null) {
            int i = VXT.LIZ[this.LJLJJL.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        return;
                    }
                    try {
                        LJ();
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        LIZJ(false, 0, 0, "prepare and start MediaPlayer failure.");
                        LIZ(new C78163Ulz(-23, "prepare and start MediaPlayer failure.", (Throwable) null));
                        return;
                    }
                }
                this.LJLJLLL.start();
                this.LJLJJL = VXQ.STARTED;
                this.LJZL.LIZJ();
                return;
            }
            this.LJLJLLL.start();
            this.LJLILLLLZI = true;
            this.LJLJJL = VXQ.STARTED;
            this.LJLLI.post(new ARunnableS50S0100000_14(this, 15));
            long j = C32257ClJ.LIZIZ().LJIIIIZZ;
            float f = C32257ClJ.LIZIZ().LJIIIZ;
            if (j > 0) {
                long duration = f * getDuration();
                if (duration > 0) {
                    j = duration;
                }
                this.LJLLI.removeCallbacks(this.LLFFF);
                this.LJLLI.postDelayed(this.LLFFF, j);
            }
            this.LJZL.LIZJ();
        }
    }

    public final void LIZ(C78163Ulz c78163Ulz) {
        this.LJLILLLLZI = false;
        this.LJLIL = 0L;
        if (c78163Ulz != null && c78163Ulz.LIZ == -23) {
            DJ4.LIZ.storeBoolean("has_gift_play_internal_error", true);
        }
        this.LJLLI.removeCallbacks(this.LLFFF);
        this.LJLLI.removeCallbacks(this.LLFII);
        this.LJLLI.post(new ARunnableS33S0200000_14(this, c78163Ulz, 6));
        this.LJZL.LIZLLL();
    }

    public final void LJFF(Message message) {
        HandlerThread handlerThread = this.LJLLILLLL;
        if (handlerThread != null && handlerThread.isAlive() && !this.LJLLILLLL.isInterrupted()) {
            if (this.LJLL == null) {
                this.LJLL = new Handler(this.LJLLILLLL.getLooper(), this);
            }
            this.LJLL.sendMessageDelayed(message, 0L);
        }
    }

    public final void LJI(DataSource dataSource) {
        String path;
        if (!this.LJZ) {
            LIZJ(false, 0, 0, "alphaVideoView is not attach");
            LIZ(new C78163Ulz(-23, "alphaVideoView is not attach", (Throwable) null));
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
        }
        this.LJLJJL = VXQ.NOT_PREPARED;
        int i = this.LJLJJLL.getResources().getConfiguration().orientation;
        DataSource.DataInfo dataInfo = dataSource.getDataInfo(i);
        if (dataInfo == null || TextUtils.isEmpty(dataInfo.getPath()) || !new File(dataInfo.getPath()).exists()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("dataPath is empty or File is not exists. path: ");
            if (dataInfo == null) {
                path = "null";
            } else {
                path = dataInfo.getPath();
            }
            LIZ.append(path);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (1 == i) {
                LIZJ(false, 0, 0, LIZIZ);
            }
            LIZ(new C78163Ulz(-21, LIZIZ, (Throwable) null));
            return;
        }
        this.LJLLJ.setConfigParams(dataInfo);
        this.LJLLJ.LIZIZ(this.LJLJJI);
        this.LJLJLLL.setDataSource(dataInfo.getPath());
        boolean loop = dataSource.getLoop();
        this.LLD = loop;
        this.LJLJLLL.setLooping(loop);
        this.LJLZ = dataInfo.getTotalFrame();
        this.LJLLL = dataInfo.getActualWidth();
        this.LJLLLL = dataInfo.getActualHeight();
        this.LJLLLLLL = dataInfo.getVersion();
        this.LJZI = dataSource.getAutoRelease();
        if (this.LJLLJ.LIZJ()) {
            LJ();
        } else {
            this.LJLJI = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void attachAlphaView(ViewGroup viewGroup) {
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe != null && interfaceC79452VGe.LJFF(viewGroup)) {
            this.LJZ = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void detachAlphaView(ViewGroup viewGroup) {
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe != null && interfaceC79452VGe.LIZLLL(viewGroup)) {
            this.LJZ = false;
        }
        this.LJLLI.removeCallbacks(this.LLFII);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String str;
        VXQ vxq;
        switch (message.what) {
            case 1:
                if (message.obj instanceof DataSource) {
                    Handler handler = this.LJLL;
                    if (handler != null) {
                        handler.removeMessages(8);
                    }
                    try {
                        LJI((DataSource) message.obj);
                    } catch (Exception e) {
                        StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "alphaVideoView set dataSource failure:");
                        LIZIZ.append(Log.getStackTraceString(e));
                        String LIZIZ2 = X1D.LIZIZ(LIZIZ);
                        LIZ(new C78163Ulz(-21, LIZIZ2, e));
                        LIZJ(false, 0, 0, LIZIZ2);
                    }
                }
                return true;
            case 2:
                try {
                    LIZLLL();
                    this.LJLJJL = VXQ.PREPARED;
                    startPlay();
                } catch (Exception e2) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("start video failure:");
                    LIZ.append(Log.getStackTraceString(e2));
                    String LIZIZ3 = X1D.LIZIZ(LIZ);
                    LIZ(new C78163Ulz(-23, LIZIZ3, e2));
                    LIZJ(false, 0, 0, LIZIZ3);
                }
                return true;
            case 3:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
                if (iMediaPlayer != null && this.LJLJJL == VXQ.STARTED) {
                    iMediaPlayer.pause();
                    this.LJZL.LIZLLL();
                    this.LJLJJL = VXQ.PAUSED;
                }
                return true;
            case 4:
                if (this.LJLILLLLZI) {
                    startPlay();
                } else if (this.LJLJI) {
                    this.LJLJI = false;
                    try {
                        LJ();
                    } catch (Exception e3) {
                        C16880lQ.LLLLIIL(e3);
                        LIZJ(false, 0, 0, "prepare MediaPlayer failure on resume.");
                        LIZ(new C78163Ulz(-23, "prepare MediaPlayer failure on resume.", (Throwable) null));
                    }
                }
                return true;
            case 5:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer2 = this.LJLJLLL;
                if (iMediaPlayer2 != null && ((vxq = this.LJLJJL) == VXQ.STARTED || vxq == VXQ.PAUSED)) {
                    iMediaPlayer2.pause();
                    this.LJZL.LIZLLL();
                    this.LJLJJL = VXQ.PAUSED;
                }
                return true;
            case 6:
                this.LJLLJ.onPause();
                this.LJZL.LIZLLL();
                VXM vxm = this.LJZL;
                vxm.LIZ();
                HandlerThread handlerThread = vxm.LJ;
                if (handlerThread != null) {
                    handlerThread.quit();
                    vxm.LJ = null;
                }
                vxm.LIZ = null;
                vxm.LIZJ = 500L;
                vxm.LIZIZ = VXM.LJFF;
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer3 = this.LJLJLLL;
                if (iMediaPlayer3 == null) {
                    this.LJLJJL = VXQ.NOT_PREPARED;
                    return true;
                }
                if (this.LJLJJL == VXQ.STARTED) {
                    iMediaPlayer3.pause();
                    this.LJLJJL = VXQ.PAUSED;
                }
                if (this.LJLJJL == VXQ.PAUSED) {
                    this.LJLJLLL.stop();
                    this.LJLJJL = VXQ.STOPPED;
                }
                this.LJLJLLL.release();
                this.LJLLJ.release();
                this.LJLJJL = VXQ.RELEASE;
                HandlerThread handlerThread2 = this.LJLLILLLL;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                    this.LJLLILLLL.interrupt();
                }
                return true;
            case 7:
                try {
                    this.LJLJLLL.setSurface((Surface) message.obj);
                } catch (Exception e4) {
                    LIZ(new C78163Ulz(-23, "surface has been released", e4));
                    LIZJ(false, 0, 0, "surface has been released");
                }
                return true;
            case 8:
            default:
                return true;
            case 9:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer4 = this.LJLJLLL;
                if (iMediaPlayer4 != null) {
                    iMediaPlayer4.reset();
                    this.LJZL.LIZLLL();
                    this.LJLJJL = VXQ.NOT_PREPARED;
                    this.LJLILLLLZI = false;
                }
                return true;
            case 10:
                try {
                    this.LJLJLLL.initMediaPlayer();
                } catch (Exception e5) {
                    C32444CoK.LIZJ(e5);
                    IMonitor iMonitor = this.LJLJL;
                    if (iMonitor != null) {
                        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer5 = this.LJLJLLL;
                        if (iMediaPlayer5 != null) {
                            str = iMediaPlayer5.getPlayerSimpleName();
                        } else {
                            str = "unknown";
                        }
                        iMonitor.monitorInit(str, e5);
                    }
                    J07 j07 = new J07();
                    j07.initMediaPlayer();
                    this.LJLJLLL = j07;
                }
                this.LJLJLLL.setScreenOnWhilePlaying(true);
                this.LJLJLLL.setLooping(this.LLD);
                this.LJLJLLL.setOnFirstFrameListener(new C79891VXb(this));
                this.LJLJLLL.setOnCompletionListener(new VXO(this));
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer6 = this.LJLJLLL;
                if (iMediaPlayer6 instanceof J02) {
                    ((J02) iMediaPlayer6).LIZ(new J01(this));
                }
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                Object obj = message.obj;
                if (obj instanceof MaskSrc) {
                    MaskSrc maskSrc = (MaskSrc) obj;
                    if (maskSrc.getType() == 0) {
                        try {
                            maskSrc.setBitmap(C78249UnN.LIZ(maskSrc));
                        } catch (OutOfMemoryError unused) {
                        }
                    }
                    if (maskSrc.getBitmap() != null) {
                        maskSrc.setWidth(maskSrc.getBitmap().getWidth());
                        maskSrc.setHeight(maskSrc.getBitmap().getHeight());
                        ((ArrayList) this.LJLJJI).add(maskSrc);
                    }
                }
                return true;
            case 12:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer7 = this.LJLJLLL;
                if (iMediaPlayer7 != null) {
                    iMediaPlayer7.stop();
                    this.LJLJJL = VXQ.STOPPED;
                    this.LJLILLLLZI = false;
                    InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
                    if (interfaceC79452VGe != null) {
                        interfaceC79452VGe.onCompletion();
                    }
                }
                return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void seekTo(int i) {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMask(MaskSrc maskSrc) {
        LJFF(LIZIZ(11, maskSrc));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMonitor(IMonitor iMonitor) {
        this.LJLJL = iMonitor;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setSurface(Surface surface) {
        LJFF(LIZIZ(7, surface));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setVisibility(int i) {
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe != null) {
            interfaceC79452VGe.setVisibility(i);
            if (i == 0) {
                this.LJLLJ.bringToFront();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void start(DataSource dataSource) {
        this.LJLIL = dataSource.getMessageId();
        if (dataSource.isValid()) {
            setVisibility(0);
            LJFF(LIZIZ(1, dataSource));
            long j = C32257ClJ.LIZIZ().LJIIJJI;
            if (j > 0) {
                this.LJLLI.removeCallbacks(this.LLFII);
                this.LJLLI.postDelayed(this.LLFII, j);
                return;
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dataSource is invalid when start. ErrorInfo: ");
        LIZ.append(dataSource.getErrorInfo());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZ(new C78163Ulz(-21, LIZIZ, (Throwable) null));
        LIZJ(false, 0, 0, LIZIZ);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        this.LJLJLJ = alphaPlayerAction;
        return this;
    }

    public static Message LIZIZ(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setProgressListener(IProgressListener iProgressListener, long j) {
        VXM vxm = this.LJZL;
        if (iProgressListener != null) {
            vxm.LIZIZ = iProgressListener;
        } else {
            vxm.LIZIZ = VXM.LJFF;
        }
        vxm.LIZJ = j;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startWithLastFrameHold(DataSource dataSource, boolean z) {
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe != null) {
            interfaceC79452VGe.setLastFrameHold(z);
        }
        DataSource copy = DataSource.copy(dataSource);
        this.LJLIL = dataSource.getMessageId();
        if (dataSource.isValid()) {
            setVisibility(0);
            long j = C32257ClJ.LIZIZ().LJIIJJI;
            if (j > 0) {
                this.LJLLI.removeCallbacks(this.LLFII);
                this.LJLLI.postDelayed(this.LLFII, j);
            }
            LJFF(LIZIZ(1, copy));
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dataSource is invalid when startWithLastFrameHold. ErrorInfo: ");
        LIZ.append(copy.getErrorInfo());
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZ(new C78163Ulz(-21, LIZIZ, (Throwable) null));
        LIZJ(false, 0, 0, LIZIZ);
    }

    public LocalPlayerController(Context context, LifecycleOwner lifecycleOwner, AbsPlayer absPlayer, int i) {
        VXM vxm = new VXM();
        this.LJZL = vxm;
        this.LLFFF = new IDRunnableS6S0101000(3, this, 14);
        this.LLFII = new ARunnableS17S0101000_13(1, this, 12);
        this.LLFZ = new VXZ(this);
        this.LLI = new VXR(this);
        this.LJLJJLL = context;
        this.LL = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        HandlerThread handlerThread = new HandlerThread("alpha-play-thread", 10);
        this.LJLLILLLL = handlerThread;
        handlerThread.start();
        this.LJLL = new Handler(this.LJLLILLLL.getLooper(), this);
        if (i == 1) {
            this.LJLLJ = new C79898VXi(this.LJLJJLL);
        } else {
            this.LJLLJ = new C79895VXf(this.LJLJJLL);
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        InterfaceC79452VGe interfaceC79452VGe = this.LJLLJ;
        if (interfaceC79452VGe != null) {
            interfaceC79452VGe.setLayoutParams(layoutParams);
            this.LJLLJ.setPlayerController(this);
        }
        VGW vgw = new VGW(this.LJLLJ);
        this.LLF = vgw;
        InterfaceC79452VGe interfaceC79452VGe2 = this.LJLLJ;
        if (interfaceC79452VGe2 != null) {
            interfaceC79452VGe2.setVideoRenderer(vgw);
        }
        this.LJLJLLL = absPlayer;
        vxm.LIZ = absPlayer;
        LJFF(LIZIZ(10, null));
    }

    public final void LIZJ(boolean z, int i, int i2, String str) {
        String str2;
        IMonitor iMonitor = this.LJLJL;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJLLL;
        if (iMediaPlayer != null) {
            str2 = iMediaPlayer.getPlayerSimpleName();
        } else {
            str2 = "unknown";
        }
        StringBuilder LIZJ = b1.LIZJ(str, ", messageId: ");
        LIZJ.append(this.LJLIL);
        iMonitor.monitor(z, str2, i, i2, X1D.LIZIZ(LIZJ));
    }
}
