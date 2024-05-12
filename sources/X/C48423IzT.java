package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.ecommercelive.business.player.audio.EcAudioPlayer;

/* renamed from: X.IzT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48423IzT implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ EcAudioPlayer LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public C48423IzT(EcAudioPlayer ecAudioPlayer, String str) {
        this.LJLIL = ecAudioPlayer;
        this.LJLILLLLZI = str;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.LJLIL.LJLILLLLZI.remove(this.LJLILLLLZI);
        this.LJLIL.LJLJI.addLast(mediaPlayer);
    }
}
