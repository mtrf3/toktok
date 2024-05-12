package X;

import android.content.Context;
import android.media.MediaPlayer;
import com.bytedance.mt.protector.impl.UriProtector;
import java.io.IOException;
import ujb.o;

/* loaded from: classes9.dex */
public final class J9K {
    public final Context LIZ;
    public MediaPlayer LIZIZ;
    public boolean LIZJ = true;

    public final void LIZIZ() {
        MediaPlayer mediaPlayer;
        if (this.LIZJ && (mediaPlayer = this.LIZIZ) != null) {
            mediaPlayer.pause();
        }
    }

    public final void LIZLLL() {
        MediaPlayer mediaPlayer = this.LIZIZ;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
        }
        MediaPlayer mediaPlayer2 = this.LIZIZ;
        if (mediaPlayer2 != null) {
            mediaPlayer2.release();
        }
        this.LIZIZ = null;
    }

    public J9K(Context context) {
        this.LIZ = context;
    }

    public static boolean LIZ(String str) {
        if (str.length() == 0) {
            return false;
        }
        if (o.LJJJLIIL(str, "http://", false) || o.LJJJLIIL(str, "https://", false)) {
            return true;
        }
        return false;
    }

    public final void LIZJ(float f, String str) {
        android.net.Uri LJIIIIZZ;
        MediaPlayer mediaPlayer = this.LIZIZ;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        if (C5P9.LIZIZ() == f) {
            f = 1.0f;
        }
        try {
            if (LIZ(str)) {
                LJIIIIZZ = UriProtector.parse(str);
            } else {
                LJIIIIZZ = C44694HgQ.LJIIIIZZ(str);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("media player play path - ");
            LIZ.append(LJIIIIZZ);
            H78.LIZIZ("image_mode", X1D.LIZIZ(LIZ));
            this.LIZJ = false;
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            mediaPlayer2.setDataSource(this.LIZ, LJIIIIZZ);
            mediaPlayer2.setAudioStreamType(3);
            mediaPlayer2.setDisplay(null);
            mediaPlayer2.setLooping(true);
            mediaPlayer2.setOnCompletionListener(J9N.LJLIL);
            mediaPlayer2.setOnErrorListener(new J9L(this));
            mediaPlayer2.setOnPreparedListener(new J9M(this, mediaPlayer2, f));
            mediaPlayer2.prepareAsync();
            this.LIZIZ = mediaPlayer2;
        } catch (IOException e) {
            C78983UzD.LJIJ(e, "Error(IOException) while creating MediaPlayer in photo mode");
        } catch (IllegalArgumentException e2) {
            C78983UzD.LJIJ(e2, "Error(IllegalArgumentException) while creating MediaPlayer in photo mode");
        } catch (IllegalStateException e3) {
            C78983UzD.LJIJ(e3, "Error(IllegalStateException) while creating MediaPlayer in photo mode");
        } catch (SecurityException e4) {
            C78983UzD.LJIJ(e4, "Error(SecurityException) while creating MediaPlayer in photo mode");
        }
    }
}
