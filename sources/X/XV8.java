package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.choosemusic.cutmusic.CutMusicRepeartPlayer;

/* loaded from: classes16.dex */
public final class XV8 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ CutMusicRepeartPlayer LJLIL;

    public XV8(CutMusicRepeartPlayer cutMusicRepeartPlayer) {
        this.LJLIL = cutMusicRepeartPlayer;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        CutMusicRepeartPlayer cutMusicRepeartPlayer = this.LJLIL;
        cutMusicRepeartPlayer.LIZ(cutMusicRepeartPlayer.LJLILLLLZI);
    }
}
