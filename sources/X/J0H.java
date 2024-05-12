package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.mt.protector.impl.UriProtector;

/* loaded from: classes9.dex */
public final class J0H implements J0O, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnSeekCompleteListener {
    public final MediaPlayer LJLIL;
    public J0I LJLILLLLZI;
    public final Context LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // X.J0O
    public final int LJIJ() {
        return 0;
    }

    @Override // X.J0O
    public final boolean LIZIZ() {
        return this.LJLIL.isLooping();
    }

    @Override // X.J0O
    public final double LIZLLL() {
        return this.LJLIL.getCurrentPosition() / 1000.0d;
    }

    @Override // X.J0O
    public final boolean isPlaying() {
        return this.LJLIL.isPlaying();
    }

    @Override // X.J0O
    public final void pause() {
        try {
            this.LJLIL.pause();
            J0I j0i = this.LJLILLLLZI;
            if (j0i != null) {
                J0M j0m = (J0M) j0i;
                new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 145));
            }
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("pause exception:");
            LIZ.append(e.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.J0O
    public final void play() {
        try {
            this.LJLIL.start();
            J0I j0i = this.LJLILLLLZI;
            if (j0i != null) {
                J0M j0m = (J0M) j0i;
                new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 144));
            }
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("play exception:");
            LIZ.append(e.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.J0O
    public final void prepare() {
        try {
            this.LJLIL.prepareAsync();
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("prepareAsync exception: ");
            LIZ.append(e.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("prepareAsync exception:");
            LIZ2.append(e.getMessage());
            LJFF(X1D.LIZIZ(LIZ2));
        }
    }

    @Override // X.J0O
    public final void release() {
        try {
            this.LJLIL.release();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("release exception:");
            LIZ.append(e.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.J0O
    public final int getDuration() {
        return this.LJLJJLL;
    }

    @Override // X.J0O
    public final int getVideoHeight() {
        return this.LJLJJL;
    }

    @Override // X.J0O
    public final int getVideoWidth() {
        return this.LJLJJI;
    }

    public J0H(Context context) {
        this.LJLJI = context;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.LJLIL = mediaPlayer;
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnErrorListener(this);
        mediaPlayer.setOnCompletionListener(this);
        mediaPlayer.setOnSeekCompleteListener(this);
        mediaPlayer.setOnInfoListener(this);
    }

    @Override // X.J0O
    public final void LIZ(J0M j0m) {
        synchronized (this) {
            this.LJLILLLLZI = j0m;
        }
    }

    @Override // X.J0O
    public final void LIZJ(double d) {
        float f = (float) d;
        this.LJLIL.setVolume(f, f);
    }

    @Override // X.J0O
    public final void LJ(double d) {
        int i = (int) (d * 1000.0d);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                this.LJLIL.seekTo(i, 3);
            } else {
                this.LJLIL.seekTo(i);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seekTo exception:");
            LIZ.append(e.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
        }
    }

    public final void LJFF(String str) {
        synchronized (this) {
            J0I j0i = this.LJLILLLLZI;
            if (j0i != null) {
                new Error(str);
                J0M j0m = (J0M) j0i;
                new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 141));
            }
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        synchronized (this) {
            J0I j0i = this.LJLILLLLZI;
            if (j0i != null) {
                J0M j0m = (J0M) j0i;
                new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, UserLevelGeckoUpdateSetting.DEFAULT));
            }
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        O5Y.LJJJ("Player default", "onPrepared");
        synchronized (this) {
            if (this.LJLILLLLZI != null) {
                this.LJLJJI = this.LJLIL.getVideoWidth();
                this.LJLJJL = this.LJLIL.getVideoHeight();
                this.LJLJJLL = this.LJLIL.getDuration();
                ((J0M) this.LJLILLLLZI).LIZ(this);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        synchronized (this) {
            J0I j0i = this.LJLILLLLZI;
            if (j0i != null) {
                J0M j0m = (J0M) j0i;
                new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 142));
            }
        }
    }

    @Override // X.J0O
    public final void setDataSource(String str) {
        try {
            this.LJLIL.reset();
            try {
                this.LJLIL.setDataSource(this.LJLJI, UriProtector.parse(str));
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("setDataSource exception: ");
                LIZ.append(e.getMessage());
                O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("setDataSource exception:");
                LIZ2.append(e.getMessage());
                LJFF(X1D.LIZIZ(LIZ2));
            }
        } catch (Exception e2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("reset exception: ");
            LIZ3.append(e2.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ3));
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("reset exception:");
            LIZ4.append(e2.getMessage());
            LJFF(X1D.LIZIZ(LIZ4));
        }
    }

    @Override // X.J0O
    public final void setLooping(boolean z) {
        this.LJLIL.setLooping(z);
    }

    @Override // X.J0O
    public final void setSurface(Surface surface) {
        try {
            this.LJLIL.setSurface(surface);
        } catch (IllegalStateException e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setSurface exception:");
            LIZ.append(e.getMessage());
            O5Y.LJIILIIL("Player default", X1D.LIZIZ(LIZ));
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError what ");
        LIZ.append(i);
        LIZ.append(" extra ");
        LIZ.append(i2);
        O5Y.LJJJ("Player default", X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("what: ");
        LIZ2.append(i);
        LIZ2.append(", extra: ");
        LIZ2.append(i2);
        LJFF(X1D.LIZIZ(LIZ2));
        return false;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onInfo what ");
        LIZ.append(i);
        LIZ.append(" extra ");
        LIZ.append(i2);
        O5Y.LJJJ("Player default", X1D.LIZIZ(LIZ));
        if (i == 3) {
            synchronized (this) {
                J0I j0i = this.LJLILLLLZI;
                if (j0i != null) {
                    J0M j0m = (J0M) j0i;
                    new Handler(j0m.LIZ).post(new ARunnableS44S0100000_8(j0m, 143));
                }
            }
            return true;
        }
        return false;
    }
}
