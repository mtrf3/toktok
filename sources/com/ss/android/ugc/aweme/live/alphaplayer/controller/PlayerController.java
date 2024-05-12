package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import X.C16880lQ;
import X.C78249UnN;
import X.C79890VXa;
import X.C79895VXf;
import X.C79898VXi;
import X.InterfaceC79452VGe;
import X.InterfaceC79901VXl;
import X.VGV;
import X.VGY;
import X.VXM;
import X.VXP;
import X.VXQ;
import X.VXU;
import X.VXW;
import X.VXY;
import X.X1D;
import Y.ARunnableS33S0200000_14;
import Y.ARunnableS50S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.alphaplayer.Configuration;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.AlphaPlayerAction;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IMonitor;
import com.ss.android.ugc.aweme.live.alphaplayer.listener.IProgressListener;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.DefaultSystemPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import defpackage.b1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public class PlayerController implements GenericLifecycleObserver, IPlayerController, Handler.Callback {
    public AlphaPlayerAction alphaPlayerAction;
    public InterfaceC79452VGe alphaVideoView;
    public Context context;
    public InterfaceC79901VXl customPrepareListener;
    public VGY firstGLFrameListener;
    public boolean isIntentPrepare;
    public boolean isLooping;
    public boolean isPlaying;
    public IMediaPlayer<AbsPlayer<AbsPlayer>> mediaPlayer;
    public long messageId;
    public IMonitor monitor;
    public HandlerThread playThread;
    public Handler workHandler;
    public List<MaskSrc> masks = new ArrayList();
    public VXQ state = VXQ.NOT_PREPARED;
    public Handler mainHandler = new Handler(C16880lQ.LLJJJJ());
    public int actualWidth = 0;
    public int actualHeight = 0;
    public int version = 0;
    public int totalFrame = 0;
    public volatile boolean isAttached = false;
    public boolean autoRelease = true;
    public final VXM progressHelper = new VXM();
    public LifecycleOwner owner = null;
    public IMediaPlayer.OnPreparedListener<AbsPlayer<AbsPlayer>> preparedListener = new C79890VXa(this);
    public IMediaPlayer.OnErrorListener<AbsPlayer<AbsPlayer>> errorListener = new VXW(this);

    public void emitEndSignal() {
        this.isPlaying = false;
        this.messageId = 0L;
        this.mainHandler.post(new ARunnableS50S0100000_14(this, 66));
        this.progressHelper.LIZLLL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        sendMessage(getMessage(6, null));
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
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

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void pause() {
        sendMessage(getMessage(3, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void release() {
        sendMessage(getMessage(6, null));
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            this.owner = null;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void resume() {
        sendMessage(getMessage(4, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setPrepareListener(InterfaceC79901VXl interfaceC79901VXl) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void stop() {
        sendMessage(getMessage(5, null));
    }

    private void initMediaPlayer() {
        try {
            this.mediaPlayer.initMediaPlayer();
        } catch (Exception e) {
            monitorInit(e);
            DefaultSystemPlayer defaultSystemPlayer = new DefaultSystemPlayer();
            defaultSystemPlayer.initMediaPlayer();
            this.mediaPlayer = defaultSystemPlayer;
        }
        this.mediaPlayer.setScreenOnWhilePlaying(true);
        this.mediaPlayer.setLooping(this.isLooping);
        this.mediaPlayer.setOnFirstFrameListener(new VXY(this));
        this.mediaPlayer.setOnCompletionListener(new VXP(this));
    }

    private void parseVideoSize() {
        if (this.version <= 0) {
            VideoInfo videoInfo = this.mediaPlayer.getVideoInfo();
            this.actualWidth = videoInfo.getVideoWidth() / 2;
            this.actualHeight = videoInfo.getVideoHeight();
        }
        this.alphaVideoView.LJ(this.actualWidth, this.actualHeight);
        this.mainHandler.post(new ARunnableS33S0200000_14(this, this.alphaVideoView.getScaleType(), 36));
    }

    private void prepareAsync() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer == null) {
            return;
        }
        VXQ vxq = this.state;
        if (vxq == VXQ.NOT_PREPARED || vxq == VXQ.STOPPED) {
            iMediaPlayer.setOnPreparedListener(this.preparedListener);
            this.mediaPlayer.setOnErrorListener(this.errorListener);
            this.mediaPlayer.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void cancel() {
        sendMessage(getMessage(12, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public int getCurFrame() {
        if (this.mediaPlayer == null || this.totalFrame == 0) {
            return -1;
        }
        float duration = getDuration();
        if (duration <= 0.0f) {
            return -1;
        }
        if (this.mediaPlayer.getCurrentPosition() / duration > 1.0f) {
            return -1;
        }
        return (int) Math.ceil(r1 * this.totalFrame);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public int getDuration() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
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
    public String getPlayerType() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            return iMediaPlayer.getPlayerSimpleName();
        }
        return "unknown";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public View getView() {
        InterfaceC79452VGe interfaceC79452VGe = this.alphaVideoView;
        if (interfaceC79452VGe != null) {
            return interfaceC79452VGe.getView();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public boolean isPlaying() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null && iMediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void reset() {
        sendMessage(getMessage(9, null));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void startPlay() {
        if (this.mediaPlayer != null) {
            int i = VXU.LIZ[this.state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        return;
                    }
                    try {
                        prepareAsync();
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        monitor(false, "prepare and start MediaPlayer failure.");
                        emitEndSignal();
                        return;
                    }
                }
                this.mediaPlayer.start();
                this.state = VXQ.STARTED;
                this.progressHelper.LIZJ();
                return;
            }
            this.mediaPlayer.start();
            this.isPlaying = true;
            this.state = VXQ.STARTED;
            this.mainHandler.post(new ARunnableS50S0100000_14(this, 67));
            this.progressHelper.LIZJ();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        pause();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        resume();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        stop();
    }

    private int getOrientation(Context context) {
        if (context instanceof Activity) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.widthPixels < displayMetrics.heightPixels) {
                return 1;
            }
            return 2;
        }
        return context.getResources().getConfiguration().orientation;
    }

    private void initAlphaView(int i) {
        if (i == 1) {
            this.alphaVideoView = new C79898VXi(this.context);
        } else {
            this.alphaVideoView = new C79895VXf(this.context);
        }
        this.alphaVideoView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.alphaVideoView.setPlayerController(this);
        InterfaceC79452VGe interfaceC79452VGe = this.alphaVideoView;
        interfaceC79452VGe.setVideoRenderer(new VGV(interfaceC79452VGe));
    }

    private void initPlayer(IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer) {
        if (iMediaPlayer == null) {
            this.mediaPlayer = new DefaultSystemPlayer();
        } else {
            this.mediaPlayer = iMediaPlayer;
        }
        this.progressHelper.LIZ = this.mediaPlayer;
        sendMessage(getMessage(10, null));
    }

    private void monitorInit(Exception exc) {
        String str;
        IMonitor iMonitor = this.monitor;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            str = iMediaPlayer.getPlayerSimpleName();
        } else {
            str = "unknown";
        }
        iMonitor.monitorInit(str, exc);
    }

    private void setDataSource(DataSource dataSource) {
        try {
            setVideoFromFile(dataSource);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            emitEndSignal();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("alphaVideoView set dataSource failure:");
            LIZ.append(Log.getStackTraceString(e));
            monitor(false, X1D.LIZIZ(LIZ));
        }
    }

    private void setVideoFromFile(DataSource dataSource) {
        String path;
        if (!this.isAttached) {
            monitor(false, "alphaVideoView is not attach");
            emitEndSignal();
            return;
        }
        this.mediaPlayer.reset();
        this.state = VXQ.NOT_PREPARED;
        int i = this.context.getResources().getConfiguration().orientation;
        DataSource.DataInfo dataInfo = dataSource.getDataInfo(i);
        if (dataInfo == null || TextUtils.isEmpty(dataInfo.getPath()) || !new File(dataInfo.getPath()).exists()) {
            if (1 == i) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("dataPath is empty or File is not exists. path: ");
                if (dataInfo == null) {
                    path = "null";
                } else {
                    path = dataInfo.getPath();
                }
                LIZ.append(path);
                monitor(false, X1D.LIZIZ(LIZ));
            }
            emitEndSignal();
            return;
        }
        this.alphaVideoView.setConfigParams(dataInfo);
        this.alphaVideoView.LIZIZ(this.masks);
        this.mediaPlayer.setDataSource(dataInfo.getPath());
        boolean loop = dataSource.getLoop();
        this.isLooping = loop;
        this.mediaPlayer.setLooping(loop);
        this.totalFrame = dataInfo.getTotalFrame();
        this.actualWidth = dataInfo.getActualWidth();
        this.actualHeight = dataInfo.getActualHeight();
        this.version = dataInfo.getVersion();
        this.autoRelease = dataSource.getAutoRelease();
        if (this.alphaVideoView.LIZJ()) {
            prepareAsync();
        } else {
            this.isIntentPrepare = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void attachAlphaView(ViewGroup viewGroup) {
        InterfaceC79452VGe interfaceC79452VGe = this.alphaVideoView;
        if (interfaceC79452VGe != null && interfaceC79452VGe.LJFF(viewGroup)) {
            this.isAttached = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void detachAlphaView(ViewGroup viewGroup) {
        InterfaceC79452VGe interfaceC79452VGe = this.alphaVideoView;
        if (interfaceC79452VGe != null && interfaceC79452VGe.LIZLLL(viewGroup)) {
            this.isAttached = false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        VXQ vxq;
        switch (message.what) {
            case 1:
                if (message.obj instanceof DataSource) {
                    Handler handler = this.workHandler;
                    if (handler != null) {
                        handler.removeMessages(8);
                    }
                    setDataSource((DataSource) message.obj);
                }
                return true;
            case 2:
                try {
                    parseVideoSize();
                    this.state = VXQ.PREPARED;
                    startPlay();
                } catch (Exception e) {
                    emitEndSignal();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("start video failure:");
                    LIZ.append(Log.getStackTraceString(e));
                    monitor(false, X1D.LIZIZ(LIZ));
                }
                return true;
            case 3:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
                if (iMediaPlayer != null && this.state == VXQ.STARTED) {
                    iMediaPlayer.pause();
                    this.progressHelper.LIZLLL();
                    this.state = VXQ.PAUSED;
                }
                return true;
            case 4:
                if (this.isPlaying) {
                    startPlay();
                } else if (this.isIntentPrepare) {
                    try {
                        prepareAsync();
                        this.isIntentPrepare = false;
                    } catch (Exception e2) {
                        C16880lQ.LLLLIIL(e2);
                        monitor(false, "RESUME: prepare and start MediaPlayer failure.");
                        emitEndSignal();
                    }
                }
                return true;
            case 5:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer2 = this.mediaPlayer;
                if (iMediaPlayer2 != null && ((vxq = this.state) == VXQ.STARTED || vxq == VXQ.PAUSED)) {
                    iMediaPlayer2.pause();
                    this.progressHelper.LIZLLL();
                    this.state = VXQ.PAUSED;
                }
                return true;
            case 6:
                this.alphaVideoView.onPause();
                this.progressHelper.LIZLLL();
                VXM vxm = this.progressHelper;
                vxm.LIZ();
                HandlerThread handlerThread = vxm.LJ;
                if (handlerThread != null) {
                    handlerThread.quit();
                    vxm.LJ = null;
                }
                vxm.LIZ = null;
                vxm.LIZJ = 500L;
                vxm.LIZIZ = VXM.LJFF;
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer3 = this.mediaPlayer;
                if (iMediaPlayer3 == null) {
                    this.state = VXQ.NOT_PREPARED;
                    return true;
                }
                if (this.state == VXQ.STARTED) {
                    iMediaPlayer3.pause();
                    this.state = VXQ.PAUSED;
                }
                if (this.state == VXQ.PAUSED) {
                    this.mediaPlayer.stop();
                    this.state = VXQ.STOPPED;
                }
                this.mediaPlayer.release();
                this.alphaVideoView.release();
                this.state = VXQ.RELEASE;
                HandlerThread handlerThread2 = this.playThread;
                if (handlerThread2 != null) {
                    handlerThread2.quit();
                    this.playThread.interrupt();
                }
                return true;
            case 7:
                try {
                    this.mediaPlayer.setSurface((Surface) message.obj);
                } catch (Exception unused) {
                    emitEndSignal();
                    monitor(false, "surface has been released");
                }
                return true;
            case 8:
            default:
                return true;
            case 9:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer4 = this.mediaPlayer;
                if (iMediaPlayer4 != null) {
                    iMediaPlayer4.reset();
                    this.progressHelper.LIZLLL();
                    this.state = VXQ.NOT_PREPARED;
                    this.isPlaying = false;
                }
                return true;
            case 10:
                initMediaPlayer();
                return true;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                Object obj = message.obj;
                if (obj instanceof MaskSrc) {
                    MaskSrc maskSrc = (MaskSrc) obj;
                    if (maskSrc.getType() == 0) {
                        try {
                            maskSrc.setBitmap(C78249UnN.LIZ(maskSrc));
                        } catch (OutOfMemoryError unused2) {
                        }
                    }
                    if (maskSrc.getBitmap() != null) {
                        maskSrc.setWidth(maskSrc.getBitmap().getWidth());
                        maskSrc.setHeight(maskSrc.getBitmap().getHeight());
                        this.masks.add(maskSrc);
                    }
                }
                return true;
            case 12:
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer5 = this.mediaPlayer;
                if (iMediaPlayer5 != null) {
                    iMediaPlayer5.stop();
                    this.state = VXQ.STOPPED;
                    this.isPlaying = false;
                    this.progressHelper.LIZLLL();
                    InterfaceC79452VGe interfaceC79452VGe = this.alphaVideoView;
                    if (interfaceC79452VGe != null) {
                        interfaceC79452VGe.onCompletion();
                    }
                }
                return true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void seekTo(int i) {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    public void sendMessage(Message message) {
        sendMessage(message, 0L);
    }

    public void setFirstGLFrameListener(VGY vgy) {
        this.firstGLFrameListener = vgy;
        this.alphaVideoView.setFirstGLFrameListener(vgy);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setMask(MaskSrc maskSrc) {
        sendMessage(getMessage(11, maskSrc));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setMonitor(IMonitor iMonitor) {
        this.monitor = iMonitor;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setSurface(Surface surface) {
        sendMessage(getMessage(7, surface));
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setVisibility(int i) {
        this.alphaVideoView.setVisibility(i);
        if (i == 0) {
            this.alphaVideoView.bringToFront();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void start(DataSource dataSource) {
        startWithLastFrameHold(dataSource, false);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        this.alphaPlayerAction = alphaPlayerAction;
        return this;
    }

    public static PlayerController get(Configuration configuration, IMediaPlayer iMediaPlayer) {
        return new PlayerController(configuration.getContext(), configuration.getLifecycleOwner(), iMediaPlayer, configuration.getAlphaVideoViewType(), configuration.getThreadName());
    }

    public static Message getMessage(int i, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.obj = obj;
        return obtain;
    }

    private void sendMessage(Message message, long j) {
        HandlerThread handlerThread = this.playThread;
        if (handlerThread != null && handlerThread.isAlive() && !this.playThread.isInterrupted()) {
            if (this.workHandler == null) {
                this.workHandler = new Handler(this.playThread.getLooper(), this);
            }
            this.workHandler.sendMessageDelayed(message, j);
        }
    }

    public void monitor(boolean z, String str) {
        monitor(z, 0, 0, str);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void setProgressListener(IProgressListener iProgressListener, long j) {
        VXM vxm = this.progressHelper;
        if (iProgressListener != null) {
            vxm.LIZIZ = iProgressListener;
        } else {
            vxm.LIZIZ = VXM.LJFF;
        }
        vxm.LIZJ = j;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public void startWithLastFrameHold(DataSource dataSource, boolean z) {
        this.alphaVideoView.setLastFrameHold(z);
        DataSource copy = DataSource.copy(dataSource);
        this.messageId = dataSource.getMessageId();
        if (dataSource.isValid()) {
            setVisibility(0);
            sendMessage(getMessage(1, copy));
            return;
        }
        emitEndSignal();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("dataSource is invalid. ErrorInfo: ");
        LIZ.append(copy.getErrorInfo());
        monitor(false, X1D.LIZIZ(LIZ));
    }

    private void init(Context context, LifecycleOwner lifecycleOwner, String str) {
        this.context = context;
        this.owner = lifecycleOwner;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        }
        HandlerThread handlerThread = new HandlerThread(str, 10);
        this.playThread = handlerThread;
        handlerThread.start();
        this.workHandler = new Handler(this.playThread.getLooper(), this);
    }

    public void monitor(boolean z, int i, int i2, String str) {
        String str2;
        IMonitor iMonitor = this.monitor;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.mediaPlayer;
        if (iMediaPlayer != null) {
            str2 = iMediaPlayer.getPlayerSimpleName();
        } else {
            str2 = "unknown";
        }
        StringBuilder LIZJ = b1.LIZJ(str, ", messageId: ");
        LIZJ.append(this.messageId);
        iMonitor.monitor(z, str2, i, i2, X1D.LIZIZ(LIZJ));
    }

    public PlayerController(Context context, LifecycleOwner lifecycleOwner, IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer, int i, String str) {
        init(context, lifecycleOwner, str);
        initAlphaView(i);
        initPlayer(iMediaPlayer);
    }
}
