package X;

import android.media.MediaPlayer;

/* loaded from: classes9.dex */
public final class J9M implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ J9K LJLIL;
    public final /* synthetic */ MediaPlayer LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    public J9M(J9K j9k, MediaPlayer mediaPlayer, float f) {
        this.LJLIL = j9k;
        this.LJLILLLLZI = mediaPlayer;
        this.LJLJI = f;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.LJLIL.LIZJ = true;
        this.LJLILLLLZI.start();
        MediaPlayer mediaPlayer2 = this.LJLILLLLZI;
        float f = this.LJLJI;
        mediaPlayer2.setVolume(f, f);
    }
}
