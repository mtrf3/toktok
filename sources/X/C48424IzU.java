package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.ecommercelive.business.player.audio.EcAudioPlayer;

/* renamed from: X.IzU, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48424IzU implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ EcAudioPlayer LJLIL;

    public C48424IzU(EcAudioPlayer ecAudioPlayer) {
        this.LJLIL = ecAudioPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (!this.LJLIL.LJLJJI) {
            mediaPlayer.start();
        }
    }
}
