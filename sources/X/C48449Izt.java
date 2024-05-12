package X;

import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import com.ss.android.ugc.aweme.live.alphaplayer.model.VideoInfo;
import com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer;
import com.ss.ttvideoengine.TTVideoEngine;
import java.io.File;

/* renamed from: X.Izt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48449Izt extends AbsPlayer<C48449Izt> implements J02 {
    public static String LJIIJ;
    public final J03 LIZ;
    public TTVideoEngine LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public boolean LJI;
    public J04 LJII;
    public boolean LJIIIIZZ;
    public final C48450Izu LJIIIZ;

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void reset() {
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
    public final VideoInfo getVideoInfo() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine == null) {
            return new J00(0, 0, 0);
        }
        return new J00(tTVideoEngine.LJJJIL(), this.LIZIZ.LJJJ(), this.LIZIZ.LIZ.LJJJLZIJ);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void initMediaPlayer() {
        C32444CoK.LIZ("Alpha-TTEngine", "initMediaPlayer() called");
        J03 j03 = this.LIZ;
        if (j03 != null) {
            this.LIZJ = j03.LJ();
        } else {
            this.LIZJ = 0L;
        }
        if (C32257ClJ.LIZIZ().LJIIL && this.LIZJ == 0 && !DJ4.LIZ.getBoolean("has_gift_play_internal_error", false)) {
            this.LIZIZ = new TTVideoEngine(this.context, 2);
            this.LIZLLL = "TTEnginePlayerImpl_OS";
        } else {
            TTVideoEngine tTVideoEngine = new TTVideoEngine(this.context, 0);
            this.LIZIZ = tTVideoEngine;
            this.LIZLLL = "TTEnginePlayerImpl";
            if (tTVideoEngine.LJJJLIIL()) {
                throw new Exception("create ttVideoEngine failure");
            }
        }
        this.LIZIZ.LJLLLL(4, 1);
        this.LIZIZ.LJLLLL(216, 1);
        this.LIZIZ.LJLLLL(610, 0);
        this.LIZIZ.LJZI(this.LJIIIZ);
        boolean z = this.LJIIIIZZ;
        if (z) {
            this.LIZIZ.LJLZ(z);
        }
        if (C32257ClJ.LIZIZ().LJ == 1) {
            this.LIZIZ.LJLLLL(7, 1);
            C32444CoK.LIZ("PlayerType", "PlayerType HARDCODE");
        } else {
            this.LIZIZ.LJLLLL(7, 0);
            C32444CoK.LIZ("PlayerType", "PlayerType SOFT DECODE");
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null && tTVideoEngine.LJJIJIIJIL() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void pause() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("pause() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void prepareAsync() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("prepareAsync() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        this.preparedListener.onPrepared(this);
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void release() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("release() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            if (this.LJI) {
                tTVideoEngine.LJJJZ(false);
            }
            this.LIZIZ.LJJLIIIJILLIZJL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void start() {
        InterfaceC32258ClK interfaceC32258ClK;
        int i;
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("start() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        if (this.LIZIZ != null) {
            if (!C32257ClJ.LJI() && ((interfaceC32258ClK = (InterfaceC32258ClK) C32260ClM.LIZ(InterfaceC32258ClK.class)) == null || !interfaceC32258ClK.LIZIZ())) {
                if (this.LJI) {
                    C32444CoK.LIZ("TTEnginePlayerImpl", "initSuperResolution initialized");
                } else if (!this.LJFF) {
                    C32444CoK.LIZ("TTEnginePlayerImpl", "initSuperResolution sr is disable");
                } else {
                    this.LJI = true;
                    TTVideoEngine tTVideoEngine = this.LIZIZ;
                    if (this.LJ == 2) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    C32444CoK.LIZ("TTEnginePlayerImpl", "obtainSRKernelBinPath");
                    if (LJIIJ != null) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("obtainSRKernelBinPath result == ");
                        LIZ2.append(LJIIJ);
                        C32444CoK.LIZ("TTEnginePlayerImpl", X1D.LIZIZ(LIZ2));
                        str = LJIIJ;
                    } else {
                        File LLIIIL = C16880lQ.LLIIIL(this.context);
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("tt_live_sdk");
                        File file = new File(LLIIIL, JBR.LJFF(LIZ3, File.pathSeparator, "SRKernelBinPath", LIZ3));
                        if (!file.exists() && !file.mkdir()) {
                            C32444CoK.LIZ("TTEnginePlayerImpl", "obtainSRKernelBinPath fail when create dir");
                            str = null;
                        } else {
                            LJIIJ = file.getAbsolutePath();
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("obtainSRKernelBinPath result == ");
                            LIZ4.append(LJIIJ);
                            C32444CoK.LIZ("TTEnginePlayerImpl", X1D.LIZIZ(LIZ4));
                            str = LJIIJ;
                        }
                    }
                    tTVideoEngine.LLIILII(i, str);
                    this.LIZIZ.LJJJJIZL(true);
                    this.LIZIZ.LLIILZL(1440, 1440);
                    this.LIZIZ.LJ(false);
                    this.LIZIZ.LJIIJ(true);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("srIsMaliSync", true);
                    this.LIZIZ.LIZ.j1 = bundle;
                }
            }
            if (this.LJI) {
                this.LIZIZ.LJJJZ(true);
            }
            this.LIZIZ.LJJLI();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void stop() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("stop() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJJJJIL();
        }
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final String getPlayerSimpleName() {
        return this.LIZLLL;
    }

    @Override // X.J02
    public final void LIZ(J01 j01) {
        this.LJII = j01;
    }

    @Override // com.ss.android.ugc.aweme.live.alphaplayer.player.AbsPlayer, com.ss.android.ugc.aweme.live.alphaplayer.player.IMediaPlayer
    public final void setDataSource(String str) {
        TTVideoEngine tTVideoEngine;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setDataSource() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine2 = this.LIZIZ;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LL(str);
        }
        J03 j03 = this.LIZ;
        if (j03 != null) {
            this.LIZJ = j03.LJ();
        } else {
            this.LIZJ = 0L;
        }
        long j = this.LIZJ;
        if (j != 0 && (tTVideoEngine = this.LIZIZ) != null) {
            tTVideoEngine.LLFF(440, j);
            this.LIZIZ.LJLLLL(430, 2);
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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setSurface() called with player : [");
        LIZ.append(this.LIZIZ);
        LIZ.append("]");
        C32444CoK.LIZ("Alpha-TTEngine", X1D.LIZIZ(LIZ));
        TTVideoEngine tTVideoEngine = this.LIZIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLILZIL(surface);
        }
    }

    public C48449Izt(Context context, J03 j03) {
        super(context);
        boolean z;
        this.LIZLLL = "";
        int i = C32257ClJ.LIZIZ().LJI;
        this.LJ = i;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJFF = z;
        this.LJI = false;
        this.LJIIIZ = new C48450Izu(this);
        this.context = context;
        this.LIZ = j03;
    }
}
