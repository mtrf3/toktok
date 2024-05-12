package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;

/* renamed from: X.WNe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82182WNe implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ RepeatMusicPlayer LJLIL;

    public C82182WNe(RepeatMusicPlayer repeatMusicPlayer) {
        this.LJLIL = repeatMusicPlayer;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        RepeatMusicPlayer repeatMusicPlayer = this.LJLIL;
        repeatMusicPlayer.LIZ(repeatMusicPlayer.LJLILLLLZI);
    }
}
