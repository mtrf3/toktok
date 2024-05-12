package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.FileDescriptor;
import ujb.o;

/* renamed from: X.J7e, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48642J7e implements InterfaceC80053VbN {
    public static final String LJIILJJIL = C16880lQ.LJLLJ(C48642J7e.class);
    public MediaPlayer LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public long LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public EnumC79954VZm LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public final Handler LJIIJJI;
    public final Context LJIIL;
    public final InterfaceC48640J7c LJIILIIL;

    @Override // X.InterfaceC80053VbN
    public final int LIZIZ() {
        return 0;
    }

    @Override // X.InterfaceC80053VbN
    public final long LJFF() {
        return 0L;
    }

    @Override // X.InterfaceC80053VbN
    public final boolean LJIIIIZZ() {
        return false;
    }

    public final void LJIIJ() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(3);
        mediaPlayer.setOnPreparedListener(new C48643J7f(this));
        mediaPlayer.setOnCompletionListener(new C48644J7g(this));
        mediaPlayer.setLooping(false);
        this.LIZ = mediaPlayer;
    }

    public final void LJIIJJI() {
        J7Z.LIZIZ(LJIILJJIL, " ---> resetFlags()");
        this.LJII = true;
        this.LIZJ = false;
        this.LJ = false;
        this.LJFF = false;
        this.LJI = false;
        LJIILJJIL(false);
    }

    public final void LJIIL() {
        MediaPlayer mediaPlayer = this.LIZ;
        if (mediaPlayer != null) {
            LJIIJJI();
            mediaPlayer.setOnCompletionListener(null);
            mediaPlayer.setOnPreparedListener(null);
            mediaPlayer.setOnSeekCompleteListener(null);
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.LIZ = null;
    }

    public final void LJIILIIL() {
        String str = LJIILJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> start(), startPlayTime: ");
        LIZ.append(this.LIZLLL);
        LIZ.append(",   mIsStart: ");
        LIZ.append(this.LJ);
        LIZ.append(",   mIsPendingStart: ");
        LIZ.append(this.LIZJ);
        LIZ.append(",   mIsPrepared: ");
        LIZ.append(this.LIZIZ);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        long j = this.LIZLLL;
        if (j > 0) {
            LJI(j, null);
            this.LIZLLL = 0L;
        }
        try {
            MediaPlayer mediaPlayer = this.LIZ;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
            this.LJ = true;
            this.LIZJ = false;
            this.LJFF = false;
            this.LJII = false;
            EnumC79954VZm enumC79954VZm = EnumC79954VZm.PLAYBACK_STATE_PLAYING;
            this.LJIIIIZZ = enumC79954VZm;
            this.LJIILIIL.LJFF(this, enumC79954VZm);
            LJIILJJIL(true);
        } catch (Throwable th) {
            J7Z.LIZ(LJIILJJIL, th.getMessage());
            this.LJIILIIL.LIZ(EnumC48648J7k.INVALIDATE_PLAYER_MODEL);
        }
    }

    @Override // X.InterfaceC80053VbN
    public final long getCurrentPlaybackTime() {
        MediaPlayer mediaPlayer;
        long j = 0;
        try {
            if (!this.LIZIZ || (mediaPlayer = this.LIZ) == null) {
                return 0L;
            }
            j = mediaPlayer.getCurrentPosition();
            return j;
        } catch (Throwable unused) {
            LJIIL();
            return j;
        }
    }

    @Override // X.InterfaceC80053VbN
    public final long getDuration() {
        MediaPlayer mediaPlayer;
        try {
            if (this.LIZIZ && (mediaPlayer = this.LIZ) != null) {
                return mediaPlayer.getDuration();
            }
        } catch (Throwable th) {
            J7Z.LIZ(LJIILJJIL, th.getMessage());
            LJIIL();
        }
        return 0L;
    }

    @Override // X.InterfaceC80053VbN
    public final void pause() {
        String str = LJIILJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> pause(), mIsStarted: ");
        LIZ.append(this.LJ);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        if (this.LJ) {
            try {
                MediaPlayer mediaPlayer = this.LIZ;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Throwable th) {
                J7Z.LIZ(LJIILJJIL, th.getMessage());
                LJIIL();
            }
            this.LJFF = true;
            this.LJ = false;
            this.LIZJ = false;
            this.LJII = false;
            EnumC79954VZm enumC79954VZm = EnumC79954VZm.PLAYBACK_STATE_PAUSED;
            this.LJIIIIZZ = enumC79954VZm;
            this.LJIILIIL.LJFF(this, enumC79954VZm);
            LJIILJJIL(false);
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void release() {
        J7Z.LIZIZ(LJIILJJIL, " ---> release()");
        LJIIL();
    }

    @Override // X.InterfaceC80053VbN
    public final void resume() {
        String str = LJIILJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> resume(), mIsPaused: ");
        LIZ.append(this.LJFF);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        if (this.LJFF) {
            LJIILIIL();
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void stop() {
        String str = LJIILJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> stop(), mIsStopped: ");
        LIZ.append(this.LJII);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
        if (this.LJII) {
            return;
        }
        try {
            MediaPlayer mediaPlayer = this.LIZ;
            if (mediaPlayer != null) {
                mediaPlayer.pause();
            }
            EnumC79954VZm enumC79954VZm = EnumC79954VZm.PLAYBACK_STATE_STOPPED;
            this.LJIIIIZZ = enumC79954VZm;
            this.LJIILIIL.LJFF(this, enumC79954VZm);
            LJIIJJI();
            MediaPlayer mediaPlayer2 = this.LIZ;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnSeekCompleteListener(null);
            }
            MediaPlayer mediaPlayer3 = this.LIZ;
            if (mediaPlayer3 != null) {
                mediaPlayer3.seekTo(0);
            }
        } catch (Throwable th) {
            J7Z.LIZ(LJIILJJIL, th.getMessage());
            LJIIL();
        }
    }

    public final void LJIILL() {
        long currentPlaybackTime = getCurrentPlaybackTime();
        if (currentPlaybackTime != this.LJIIIZ) {
            this.LJIILIIL.LJI(this, currentPlaybackTime);
            if (Math.abs(currentPlaybackTime - this.LJIIJ) >= 500) {
                this.LJIILIIL.LIZLLL(this, currentPlaybackTime);
                this.LJIIJ = currentPlaybackTime;
            }
            this.LJIIIZ = currentPlaybackTime;
        }
        this.LJIIJJI.postAtTime(new ARunnableS44S0100000_8(this, 162), this, SystemClock.uptimeMillis() + 50);
    }

    @Override // X.InterfaceC80053VbN
    public final EnumC79954VZm LJIIZILJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC80053VbN
    public final void LIZJ(long j) {
        String str = LJIILJJIL;
        StringBuilder LIZJ = V10.LIZJ(" ---> play(), startPlayTime: ", j, ",   mIsStart: ");
        LIZJ.append(this.LJ);
        LIZJ.append(",   mIsPendingStart: ");
        LIZJ.append(this.LIZJ);
        LIZJ.append(",   mIsPrepared: ");
        LIZJ.append(this.LIZIZ);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZJ));
        if (this.LJ || this.LIZJ) {
            return;
        }
        this.LIZLLL = j;
        if (this.LIZIZ) {
            LJIILIIL();
        } else {
            this.LIZJ = true;
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void LIZLLL(String str) {
        LJ(str);
    }

    @Override // X.InterfaceC80053VbN
    public final void LJ(String str) {
        String str2 = LJIILJJIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" ---> setDirectURL(), url is ");
        LIZ.append(str);
        J7Z.LIZIZ(str2, X1D.LIZIZ(LIZ));
        try {
            if (this.LIZ == null) {
                J7Z.LIZIZ(str2, "mediaplayer is null ---> createMediaPlayer");
                LJIIJ();
            }
            MediaPlayer mediaPlayer = this.LIZ;
            if (mediaPlayer != null) {
                this.LIZIZ = false;
                mediaPlayer.reset();
                if (str == null || !o.LJJJLIIL(str, "http", false)) {
                    mediaPlayer.setDataSource(this.LJIIL, UriProtector.parse(str));
                } else {
                    mediaPlayer.setDataSource(str);
                }
                this.LJIILIIL.LIZIZ(this);
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            J7Z.LIZ(LJIILJJIL, th.getMessage());
            this.LJIILIIL.LIZ(EnumC48648J7k.INVALIDATE_PLAYER_MODEL);
        }
    }

    public final void LJIILJJIL(boolean z) {
        if (z) {
            this.LJIIJJI.postAtTime(new ARunnableS44S0100000_8(this, 161), this, SystemClock.uptimeMillis() + 50);
        } else {
            this.LJIIJJI.removeCallbacksAndMessages(this);
        }
    }

    public C48642J7e(Context context, C80048VbI c80048VbI) {
        kotlin.jvm.internal.o.LJIIJ(context, "context");
        this.LJIIL = context;
        this.LJIILIIL = c80048VbI;
        this.LJII = true;
        this.LJIIIIZZ = EnumC79954VZm.PLAYBACK_STATE_STOPPED;
        this.LJIIIZ = Long.MIN_VALUE;
        this.LJIIJ = Long.MIN_VALUE;
        this.LJIIJJI = new Handler(C16880lQ.LLJJJJ());
    }

    @Override // X.InterfaceC80053VbN
    public final void LJI(long j, C80055VbP c80055VbP) {
        String str = LJIILJJIL;
        StringBuilder LIZJ = V10.LIZJ(" ---> seekToTime(), time: ", j, ",   mIsSeeking: ");
        LIZJ.append(this.LJI);
        J7Z.LIZIZ(str, X1D.LIZIZ(LIZJ));
        if (this.LJI || j < 0) {
            if (c80055VbP != null) {
                c80055VbP.LIZ(j, false);
                return;
            }
            return;
        }
        this.LJI = true;
        LJIILJJIL(false);
        try {
            MediaPlayer mediaPlayer = this.LIZ;
            if (mediaPlayer != null) {
                mediaPlayer.seekTo((int) j);
            }
            MediaPlayer mediaPlayer2 = this.LIZ;
            if (mediaPlayer2 != null) {
                mediaPlayer2.setOnSeekCompleteListener(new C48645J7h(this, c80055VbP, j));
            }
        } catch (Throwable th) {
            J7Z.LIZ(LJIILJJIL, th.getMessage());
            LJIIL();
        }
    }

    @Override // X.InterfaceC80053VbN
    public final void LJII(String str, String str2) {
        LJ(str);
    }

    @Override // X.InterfaceC80053VbN
    public final void LJIIIZ(EnumC47176IfM enumC47176IfM, C47164IfA c47164IfA) {
        J7Z.LIZ(LJIILJJIL, "light player not support VideoModel src Type");
    }

    @Override // X.InterfaceC80053VbN
    public final void LIZ(FileDescriptor fileDescriptor, long j, long j2) {
        try {
            String str = LJIILJJIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(" ---> setDataSource(), file descriptor is ");
            LIZ.append(String.valueOf(fileDescriptor));
            J7Z.LIZIZ(str, X1D.LIZIZ(LIZ));
            if (this.LIZ == null) {
                J7Z.LIZIZ(str, "mediaplayer is null ---> createMediaPlayer");
                LJIIJ();
            }
            MediaPlayer mediaPlayer = this.LIZ;
            if (mediaPlayer != null) {
                this.LIZIZ = false;
                mediaPlayer.reset();
                mediaPlayer.setDataSource(fileDescriptor, j, j2);
                this.LJIILIIL.LIZIZ(this);
                mediaPlayer.prepareAsync();
            }
        } catch (Throwable th) {
            J7Z.LIZ(LJIILJJIL, th.getMessage());
            this.LJIILIIL.LIZ(EnumC48648J7k.INVALIDATE_PLAYER_MODEL);
        }
    }
}
