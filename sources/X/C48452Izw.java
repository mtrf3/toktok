package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer;
import com.ss.texturerender.VideoSurface;
import com.ss.ttvideoengine.TTVideoEngine;
import kotlin.jvm.internal.o;

/* renamed from: X.Izw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48452Izw implements InterfaceC47814Ipe {
    public final /* synthetic */ C48451Izv LJLIL;

    @Override // X.InterfaceC47814Ipe
    public final void onBufferingUpdate(TTVideoEngine engine, int i) {
        o.LJIIIZ(engine, "engine");
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onFirstAVSyncFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onLoadStateChanged(TTVideoEngine engine, int i) {
        o.LJIIIZ(engine, "engine");
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPlaybackStateChanged(TTVideoEngine engine, int i) {
        o.LJIIIZ(engine, "engine");
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepare(TTVideoEngine engine) {
        o.LJIIIZ(engine, "engine");
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onRefreshSurface(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ int onSetSurface(TTVideoEngine tTVideoEngine, VideoSurface videoSurface, Surface surface) {
        return 0;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onStreamChanged(TTVideoEngine engine, int i) {
        o.LJIIIZ(engine, "engine");
    }

    @Override // X.InterfaceC47814Ipe
    public final /* synthetic */ void onVideoSecondFrame(TTVideoEngine tTVideoEngine) {
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoSizeChanged(TTVideoEngine engine, int i, int i2) {
        o.LJIIIZ(engine, "engine");
    }

    @Override // X.InterfaceC47814Ipe
    public final void onVideoStatusException(int i) {
    }

    public C48452Izw(C48451Izv c48451Izv) {
        this.LJLIL = c48451Izv;
    }

    @Override // X.InterfaceC47814Ipe
    public final void onCompletion(TTVideoEngine engine) {
        o.LJIIIZ(engine, "engine");
        String str = this.LJLIL.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCompletion player : [");
        LIZ.append(this.LJLIL.LIZIZ);
        LIZ.append(", ");
        LIZ.append(engine);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        C48451Izv c48451Izv = this.LJLIL;
        IMediaPlayer.OnCompletionListener<AbsPlayer<T>> onCompletionListener = c48451Izv.completionListener;
        if (onCompletionListener != 0) {
            onCompletionListener.onCompletion(c48451Izv.self);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onError(C47789IpF error) {
        o.LJIIIZ(error, "error");
        C48451Izv c48451Izv = this.LJLIL;
        IMediaPlayer.OnErrorListener<AbsPlayer<T>> onErrorListener = c48451Izv.errorListener;
        if (onErrorListener != 0) {
            onErrorListener.onError(c48451Izv.self, error.LIZ, error.LIZIZ, error.LIZLLL);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onPrepared(TTVideoEngine engine) {
        o.LJIIIZ(engine, "engine");
        C48451Izv c48451Izv = this.LJLIL;
        IMediaPlayer.OnPreparedListener<AbsPlayer<T>> onPreparedListener = c48451Izv.preparedListener;
        if (onPreparedListener != 0) {
            onPreparedListener.onPrepared(c48451Izv.self);
        }
    }

    @Override // X.InterfaceC47814Ipe
    public final void onRenderStart(TTVideoEngine engine) {
        o.LJIIIZ(engine, "engine");
        C48451Izv c48451Izv = this.LJLIL;
        IMediaPlayer.OnFirstFrameListener<AbsPlayer<T>> onFirstFrameListener = c48451Izv.firstFrameListener;
        if (onFirstFrameListener != 0) {
            onFirstFrameListener.onFirstFrame(c48451Izv.self);
        }
    }
}
