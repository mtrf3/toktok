package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XT2 implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {
    public final Context LJLIL;
    public final String LJLILLLLZI;
    public boolean LJLJI;
    public XTB LJLJJI;
    public XTJ LJLJJL;
    public XTI LJLJJLL;
    public MediaPlayer LJLJL;
    public XT3 LJLJLJ;
    public long LJLJLLL;
    public C84881XSz LJLL;
    public String LJLLI;

    public final void LJI() {
        XT3 xt3 = this.LJLJLJ;
        if (xt3 != null) {
            xt3.cancel();
        }
    }

    public final void LIZJ() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLLL;
        C84881XSz c84881XSz = this.LJLL;
        if (c84881XSz != null) {
            String valueOf = String.valueOf(c84881XSz.LIZIZ);
            String str = this.LJLLI;
            String str2 = this.LJLILLLLZI;
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("duration", Long.valueOf(elapsedRealtime));
            c198517qh.LIZ.put("fileUri", str);
            c198517qh.LIZ.put("fileUrlList", valueOf);
            c198517qh.LIZ.put("isUseTTPlayer", Boolean.FALSE);
            c198517qh.LIZ.put("trace", str2);
            C09900aA.LJIIJJI("aweme_music_play_error_rate", 0, c198517qh.LJ());
        }
    }

    public final void LIZLLL() {
        MediaPlayer mediaPlayer;
        try {
            LJI();
            this.LJLJI = true;
            MediaPlayer mediaPlayer2 = this.LJLJL;
            if (mediaPlayer2 != null && mediaPlayer2.isPlaying() && (mediaPlayer = this.LJLJL) != null) {
                mediaPlayer.pause();
            }
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJFF() {
        try {
            LIZLLL();
            MediaPlayer mediaPlayer = this.LJLJL;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            MediaPlayer mediaPlayer2 = this.LJLJL;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.LJLJL = null;
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public XT2(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLIL = context;
        this.LJLILLLLZI = "";
    }

    public final void LIZIZ(Exception exc) {
        XT6 xt6;
        XTJ xtj = this.LJLJJL;
        if (xtj != null && (xt6 = ((XT5) xtj).LIZ.LJIILIIL) != null) {
            xt6.LIZ();
        }
        LJFF();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLLL;
        C84881XSz c84881XSz = this.LJLL;
        if (c84881XSz != null) {
            C48422IzS.LIZ(-1, String.valueOf(c84881XSz.LIZIZ), this.LJLLI, elapsedRealtime, exc.getMessage(), this.LJLILLLLZI);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        XTI xti = this.LJLJJLL;
        if (xti != null) {
            XT1 xt1 = (XT1) xti;
            XT6 xt6 = xt1.LIZ.LJIILIIL;
            if (xt6 != null) {
                xt6.LIZIZ();
            }
            C84880XSy c84880XSy = xt1.LIZ;
            if (c84880XSy.LJIIL.LJFF) {
                String musicId = c84880XSy.LJII.getMusicId();
                XTF xtf = SFS.LJLJL;
                if (xtf == null || !o.LJ(xtf.LIZ, musicId)) {
                    return;
                }
                System.currentTimeMillis();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            try {
            } catch (IllegalStateException e) {
                LJFF();
                LIZIZ(e);
            }
            if (this.LJLJI) {
                return;
            }
            LIZJ();
            MediaPlayer mediaPlayer2 = this.LJLJL;
            if (mediaPlayer2 != null) {
                mediaPlayer2.start();
                XTB xtb = this.LJLJJI;
                if (xtb != null) {
                    xtb.LIZIZ(mediaPlayer2.getDuration());
                }
            }
        } finally {
            LJI();
        }
    }

    public final void LIZ(int i, int i2) {
        XT6 xt6;
        XTJ xtj = this.LJLJJL;
        if (xtj != null && (xt6 = ((XT5) xtj).LIZ.LJIILIIL) != null) {
            xt6.LIZ();
        }
        LJFF();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.LJLJLLL;
        C84881XSz c84881XSz = this.LJLL;
        if (c84881XSz != null) {
            C48422IzS.LIZ(i, String.valueOf(c84881XSz.LIZIZ), this.LJLLI, elapsedRealtime, String.valueOf(i2), this.LJLILLLLZI);
        }
    }

    public final void LJ(C84881XSz c84881XSz, LinkedList linkedList, boolean z) {
        MediaPlayer mediaPlayer;
        if (this.LJLJI || (mediaPlayer = this.LJLJL) == null) {
            return;
        }
        try {
            this.LJLL = c84881XSz;
            XT3 xt3 = new XT3(linkedList, this, c84881XSz, z, C66589QBl.LJ);
            this.LJLJLJ = xt3;
            xt3.start();
            String str = (String) linkedList.poll();
            this.LJLLI = str;
            android.net.Uri parse = UriProtector.parse(str);
            mediaPlayer.stop();
            mediaPlayer.reset();
            this.LJLJLLL = SystemClock.elapsedRealtime();
            mediaPlayer.setAudioStreamType(3);
            HashMap<String, String> hashMap = c84881XSz.LIZLLL;
            if (hashMap != null) {
                mediaPlayer.setDataSource(this.LJLIL, parse, hashMap);
            } else {
                mediaPlayer.setDataSource(this.LJLIL, parse);
            }
            mediaPlayer.setLooping(z);
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnCompletionListener(this);
        } catch (Exception e) {
            LJFF();
            LIZIZ(e);
        }
    }
}
