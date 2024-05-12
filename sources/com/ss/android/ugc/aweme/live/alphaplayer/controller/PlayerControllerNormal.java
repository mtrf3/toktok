package com.ss.android.ugc.aweme.live.alphaplayer.controller;

import X.C16880lQ;
import X.C79892VXc;
import X.C79895VXf;
import X.InterfaceC79901VXl;
import X.VGV;
import X.VXN;
import X.VXQ;
import X.VXS;
import X.VXV;
import X.VXX;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
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

/* loaded from: classes15.dex */
public class PlayerControllerNormal implements GenericLifecycleObserver, IPlayerController {
    public long LJLIL;
    public boolean LJLILLLLZI;
    public Context LJLJJI;
    public IMonitor LJLJJL;
    public AlphaPlayerAction LJLJJLL;
    public IMediaPlayer<AbsPlayer<AbsPlayer>> LJLJL;
    public C79895VXf LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public VXQ LJLJI = VXQ.NOT_PREPARED;
    public final VXN LJLLJ = new VXN(this);
    public final VXX LJLLL = new VXX(this);

    public final void LIZ() {
        this.LJLILLLLZI = false;
        this.LJLIL = 0L;
        AlphaPlayerAction alphaPlayerAction = this.LJLJJLL;
        if (alphaPlayerAction != null) {
            alphaPlayerAction.endAction();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void cancel() {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getCurFrame() {
        return 0;
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

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMask(MaskSrc maskSrc) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setPrepareListener(InterfaceC79901VXl interfaceC79901VXl) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setProgressListener(IProgressListener iProgressListener, long j) {
    }

    public final void LIZJ() {
        if (this.LJLLILLLL <= 0) {
            VideoInfo videoInfo = this.LJLJL.getVideoInfo();
            this.LJLL = videoInfo.getVideoWidth() / 2;
            this.LJLLI = videoInfo.getVideoHeight();
        }
        this.LJLJLJ.LJ(this.LJLL, this.LJLLI);
        DataSource.ScaleType scaleType = this.LJLJLJ.getScaleType();
        AlphaPlayerAction alphaPlayerAction = this.LJLJJLL;
        if (alphaPlayerAction != null) {
            alphaPlayerAction.onVideoSizeChange(this.LJLL, this.LJLLI, scaleType);
        }
    }

    public final void LIZLLL() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer == null) {
            return;
        }
        VXQ vxq = this.LJLJI;
        if (vxq == VXQ.NOT_PREPARED || vxq == VXQ.STOPPED) {
            iMediaPlayer.setOnPreparedListener(this.LJLLJ);
            this.LJLJL.setOnErrorListener(this.LJLLL);
            this.LJLJL.prepareAsync();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final int getDuration() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
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
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer != null) {
            return iMediaPlayer.getPlayerSimpleName();
        }
        return "unknown";
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final boolean isPlaying() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer != null && iMediaPlayer.isPlaying()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void pause() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer != null && this.LJLJI == VXQ.STARTED) {
            iMediaPlayer.pause();
            this.LJLJI = VXQ.PAUSED;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void release() {
        this.LJLJLJ.onPause();
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer == null) {
            this.LJLJI = VXQ.NOT_PREPARED;
            return;
        }
        if (this.LJLJI == VXQ.STARTED) {
            iMediaPlayer.pause();
            this.LJLJI = VXQ.PAUSED;
        }
        if (this.LJLJI == VXQ.PAUSED) {
            this.LJLJL.stop();
            this.LJLJI = VXQ.STOPPED;
        }
        this.LJLJL.release();
        this.LJLJLJ.release();
        this.LJLJI = VXQ.RELEASE;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void reset() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer != null) {
            iMediaPlayer.reset();
            this.LJLJI = VXQ.NOT_PREPARED;
            this.LJLILLLLZI = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void resume() {
        if (this.LJLILLLLZI) {
            startPlay();
        } else {
            if (!this.LJLJLLL) {
                return;
            }
            this.LJLJLLL = false;
            LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startPlay() {
        if (this.LJLJL != null) {
            int i = VXV.LIZ[this.LJLJI.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        return;
                    }
                    try {
                        LIZLLL();
                        return;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                        LIZIZ(false, 0, 0, "prepare and start MediaPlayer failure.");
                        LIZ();
                        return;
                    }
                }
                this.LJLJL.start();
                this.LJLJI = VXQ.STARTED;
                return;
            }
            this.LJLJL.start();
            this.LJLILLLLZI = true;
            this.LJLJI = VXQ.STARTED;
            AlphaPlayerAction alphaPlayerAction = this.LJLJJLL;
            if (alphaPlayerAction == null) {
                return;
            }
            alphaPlayerAction.startAction();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void stop() {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer != null) {
            VXQ vxq = this.LJLJI;
            if (vxq == VXQ.STARTED || vxq == VXQ.PAUSED) {
                iMediaPlayer.pause();
                this.LJLJI = VXQ.PAUSED;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final View getView() {
        return this.LJLJLJ;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        release();
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

    public final void LJ(DataSource dataSource) {
        String path;
        this.LJLJL.reset();
        this.LJLJI = VXQ.NOT_PREPARED;
        int i = this.LJLJJI.getResources().getConfiguration().orientation;
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
                LIZIZ(false, 0, 0, X1D.LIZIZ(LIZ));
            }
            LIZ();
            return;
        }
        this.LJLJLJ.setConfigParams(dataInfo);
        this.LJLJL.setDataSource(dataInfo.getPath());
        this.LJLL = dataInfo.getActualWidth();
        this.LJLLI = dataInfo.getActualHeight();
        this.LJLLILLLL = dataInfo.getVersion();
        if (this.LJLJLJ.LJLIL) {
            LIZLLL();
        } else {
            this.LJLJLLL = true;
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void attachAlphaView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.LJLJLJ.getParent();
        if (viewGroup2 != null) {
            C16880lQ.LJLLL(this.LJLJLJ, viewGroup2);
        }
        if (viewGroup.indexOfChild(this.LJLJLJ) == -1) {
            viewGroup.addView(this.LJLJLJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void detachAlphaView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        C16880lQ.LJLLL(this.LJLJLJ, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void seekTo(int i) {
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
        if (iMediaPlayer != null) {
            iMediaPlayer.seekTo(i);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setMonitor(IMonitor iMonitor) {
        this.LJLJJL = iMonitor;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setSurface(Surface surface) {
        this.LJLJL.setSurface(surface);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void setVisibility(int i) {
        this.LJLJLJ.setVisibility(i);
        if (i == 0) {
            this.LJLJLJ.bringToFront();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void start(DataSource dataSource) {
        startWithLastFrameHold(dataSource, false);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final IPlayerController withVideoAction(AlphaPlayerAction alphaPlayerAction) {
        this.LJLJJLL = alphaPlayerAction;
        return this;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController
    public final void startWithLastFrameHold(DataSource dataSource, boolean z) {
        this.LJLJLJ.setLastFrameHold(z);
        this.LJLIL = dataSource.getMessageId();
        if (dataSource.isValid()) {
            setVisibility(0);
            try {
                LJ(dataSource);
                return;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                LIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("alphaVideoView set dataSource failure:");
                LIZ.append(Log.getStackTraceString(e));
                LIZIZ(false, 0, 0, X1D.LIZIZ(LIZ));
                return;
            }
        }
        LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("dataSource is invalid. ErrorInfo: ");
        LIZ2.append(dataSource.getErrorInfo());
        LIZIZ(false, 0, 0, X1D.LIZIZ(LIZ2));
    }

    public PlayerControllerNormal(Context context, LifecycleOwner lifecycleOwner, IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer) {
        String str;
        this.LJLJJI = context;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJLJ = new C79895VXf(this.LJLJJI);
        this.LJLJLJ.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.LJLJLJ.setPlayerController(this);
        C79895VXf c79895VXf = this.LJLJLJ;
        c79895VXf.setVideoRenderer(new VGV(c79895VXf));
        if (iMediaPlayer == null) {
            this.LJLJL = new DefaultSystemPlayer();
        } else {
            this.LJLJL = iMediaPlayer;
        }
        try {
            this.LJLJL.initMediaPlayer();
        } catch (Exception e) {
            IMonitor iMonitor = this.LJLJJL;
            if (iMonitor != null) {
                IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer2 = this.LJLJL;
                if (iMediaPlayer2 != null) {
                    str = iMediaPlayer2.getPlayerSimpleName();
                } else {
                    str = "unknown";
                }
                iMonitor.monitorInit(str, e);
            }
            DefaultSystemPlayer defaultSystemPlayer = new DefaultSystemPlayer();
            defaultSystemPlayer.initMediaPlayer();
            this.LJLJL = defaultSystemPlayer;
        }
        this.LJLJL.setScreenOnWhilePlaying(true);
        this.LJLJL.setLooping(false);
        this.LJLJL.setOnFirstFrameListener(new C79892VXc(this));
        this.LJLJL.setOnCompletionListener(new VXS(this));
    }

    public final void LIZIZ(boolean z, int i, int i2, String str) {
        String str2;
        IMonitor iMonitor = this.LJLJJL;
        if (iMonitor == null) {
            return;
        }
        IMediaPlayer<AbsPlayer<AbsPlayer>> iMediaPlayer = this.LJLJL;
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
