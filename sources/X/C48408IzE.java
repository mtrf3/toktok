package X;

import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import com.ss.ttm.player.ABRStrategy;
import com.ss.ttm.player.IMediaDataSource;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.MaskInfo;
import com.ss.ttm.player.SubInfo;
import java.io.FileDescriptor;

/* renamed from: X.IzE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48408IzE extends AbstractC48434Ize {
    public MediaPlayer LJLIL;
    public InterfaceC47775Ip1 LJLILLLLZI;

    @Override // X.AbstractC48434Ize
    public final int LJI() {
        return 0;
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILJJIL() {
    }

    @Override // X.AbstractC48434Ize
    public final void LJIL(IMediaDataSource iMediaDataSource) {
    }

    @Override // X.AbstractC48434Ize
    public final void LJJII(C47791IpH c47791IpH) {
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJIIJIL(VAL val) {
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJLIJ(C47811Ipb c47811Ipb) {
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJJL(int i, int i2) {
    }

    @Override // X.AbstractC48434Ize
    public final void setABRStrategy(ABRStrategy aBRStrategy) {
    }

    @Override // X.AbstractC48434Ize
    public final void setLoadControl(LoadControl loadControl) {
    }

    @Override // X.AbstractC48434Ize
    public final void setMaskInfo(MaskInfo maskInfo) {
    }

    @Override // X.AbstractC48434Ize
    public final void setSubInfo(SubInfo subInfo) {
    }

    @Override // X.AbstractC48434Ize
    public final int LIZ() {
        MediaPlayer mediaPlayer = this.LJLIL;
        int i = 0;
        if (mediaPlayer != null) {
            try {
                i = mediaPlayer.getCurrentPosition();
                return i;
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    @Override // X.AbstractC48434Ize
    public final int LIZIZ() {
        MediaPlayer mediaPlayer = this.LJLIL;
        int i = 0;
        if (mediaPlayer != null) {
            try {
                i = mediaPlayer.getDuration();
                return i;
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    @Override // X.AbstractC48434Ize
    public final int LJII() {
        MediaPlayer mediaPlayer = this.LJLIL;
        int i = 0;
        if (mediaPlayer != null) {
            try {
                i = mediaPlayer.getVideoHeight();
                return i;
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    @Override // X.AbstractC48434Ize
    public final int LJIIIZ() {
        MediaPlayer mediaPlayer = this.LJLIL;
        int i = 0;
        if (mediaPlayer != null) {
            try {
                i = mediaPlayer.getVideoWidth();
                return i;
            } catch (Throwable unused) {
            }
        }
        return i;
    }

    @Override // X.AbstractC48434Ize
    public final boolean LJIIJJI() {
        MediaPlayer mediaPlayer = this.LJLIL;
        boolean z = false;
        if (mediaPlayer != null) {
            try {
                z = mediaPlayer.isPlaying();
                return z;
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    @Override // X.AbstractC48434Ize
    public final void LJIIL() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILIIL() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.prepareAsync();
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILL() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
            } catch (Exception unused) {
            } catch (Throwable th) {
                this.LJLIL = null;
                throw th;
            }
            this.LJLIL = null;
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIILLIIL() {
        new PthreadThread(new ARunnableS44S0100000_8(this, 70), "SPlayerClient").start();
    }

    @Override // X.AbstractC48434Ize
    public final void LJIIZILJ() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJI() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setScreenOnWhilePlaying(true);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJIZL() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJJ() {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception unused) {
            }
        }
    }

    public static final synchronized C48408IzE LJJJJL(InterfaceC47775Ip1 interfaceC47775Ip1) {
        C48408IzE c48408IzE;
        synchronized (C48408IzE.class) {
            c48408IzE = new C48408IzE();
            c48408IzE.LJLIL = new MediaPlayer();
            c48408IzE.LJLILLLLZI = interfaceC47775Ip1;
        }
        return c48408IzE;
    }

    @Override // X.AbstractC48434Ize
    public final void LJIJ(int i) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJI(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer == null) {
            return;
        }
        try {
            mediaPlayer.setDisplay(surfaceHolder);
        } catch (Exception unused) {
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIIZ(boolean z) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setLooping(z);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIIZI(C47811Ipb c47811Ipb) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnBufferingUpdateListener(new C47979IsJ(c47811Ipb, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJ(InterfaceC48414IzK interfaceC48414IzK) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new C48409IzF(interfaceC48414IzK, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJIIJI(InterfaceC48415IzL interfaceC48415IzL) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnErrorListener(new C48410IzG(interfaceC48415IzL, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJIL(InterfaceC48416IzM interfaceC48416IzM) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnInfoListener(new C48411IzH(interfaceC48416IzM, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIJL(InterfaceC48417IzN interfaceC48417IzN) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new C48412IzI(interfaceC48417IzN, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIL(C47811Ipb c47811Ipb) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnSeekCompleteListener(new C47980IsK(c47811Ipb, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJIZ(InterfaceC48418IzO interfaceC48418IzO) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            mediaPlayer.setOnVideoSizeChangedListener(new C48413IzJ(interfaceC48418IzO, this.LJLILLLLZI));
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJ(C46886Iag c46886Iag) {
        if (Build.VERSION.SDK_INT >= 23) {
            PlaybackParams playbackParams = new PlaybackParams();
            float f = c46886Iag.LIZLLL;
            if (f > 0.0f) {
                playbackParams.setSpeed(f);
            }
            int i = c46886Iag.LIZIZ;
            if (i >= 0) {
                playbackParams.setAudioFallbackMode(i);
            }
            float f2 = c46886Iag.LIZJ;
            if (f2 > 0.0f) {
                playbackParams.setPitch(f2);
            }
            MediaPlayer mediaPlayer = this.LJLIL;
            if (mediaPlayer != null) {
                try {
                    mediaPlayer.setPlaybackParams(playbackParams);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJ(Surface surface) {
        this.LJLIL.setSurface(surface);
    }

    @Override // X.AbstractC48434Ize
    public final void LJIJJ(Context context, android.net.Uri uri) {
        this.LJLIL.setDataSource(context, uri);
    }

    @Override // X.AbstractC48434Ize
    public final void LJJJJI(float f, float f2) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f, f2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void seekTo(int i, int i2) {
        MediaPlayer mediaPlayer = this.LJLIL;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.seekTo(i);
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC48434Ize
    public final void LJIJJLI(Context context, android.net.Uri uri, java.util.Map<String, String> map) {
        this.LJLIL.setDataSource(context, uri, map);
    }

    @Override // X.AbstractC48434Ize
    public final void LJJ(FileDescriptor fileDescriptor, long j, long j2) {
        this.LJLIL.setDataSource(fileDescriptor, j, j2);
    }
}
