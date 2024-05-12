package X;

import android.media.AudioAttributes;
import android.media.MediaPlayer;

/* renamed from: X.IzD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48407IzD {
    public int LIZ;
    public final MediaPlayer LIZIZ;
    public C48405IzB LIZJ;

    public C48407IzD() {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.LIZIZ = mediaPlayer;
        C48406IzC c48406IzC = new C48406IzC(this);
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build());
        mediaPlayer.setOnPreparedListener(c48406IzC);
        mediaPlayer.setOnBufferingUpdateListener(c48406IzC);
        mediaPlayer.setOnInfoListener(c48406IzC);
        mediaPlayer.setOnSeekCompleteListener(c48406IzC);
        mediaPlayer.setOnCompletionListener(c48406IzC);
        mediaPlayer.setOnVideoSizeChangedListener(c48406IzC);
        mediaPlayer.setOnErrorListener(c48406IzC);
        this.LIZ = 0;
    }
}
