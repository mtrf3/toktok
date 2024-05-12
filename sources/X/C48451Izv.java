package X;

import android.content.Context;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.ttvideoengine.TTVideoEngine;

/* renamed from: X.Izv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48451Izv extends AbsPlayer<C48451Izv> {
    public final String LIZ;
    public TTVideoEngine LIZIZ;
    public final C48452Izw LIZJ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final VideoInfo getVideoInfo() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setScreenOnWhilePlaying(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final int getCurrentPosition() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine == null) {
            return 0;
        }
        return tTVideoEngine.LJIJ();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        C0NB.LJIIIZ(this.LIZ, "initMediaPlayer() called");
        TTVideoEngine tTVideoEngine = new TTVideoEngine(this.context, 0);
        this.LIZIZ = tTVideoEngine;
        tTVideoEngine.LJLLLL(160, 1);
        TTVideoEngine tTVideoEngine2 = this.LIZIZ;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LJLLLL(21, 1);
        }
        TTVideoEngine tTVideoEngine3 = this.LIZIZ;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.LJZI(this.LIZJ);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine == null || tTVideoEngine.LJJIJIIJIL() != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareAsync() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        this.preparedListener.onPrepared(this);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLIIIJILLIZJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJJJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJLI();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJJJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return this.LIZ;
    }

    public C48451Izv(Context context) {
        super(context);
        this.LIZ = "BgSoundsPlayer";
        this.LIZJ = new C48452Izw(this);
        this.context = context;
        initMediaPlayer();
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        String str2 = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDataSource() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LL(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setLooping(boolean z) {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLFII(z);
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setSurface(Surface surface) {
        String str = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurface() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append(']');
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLILZIL(surface);
        }
    }
}
