package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.musicprovider.provider.MusicPlayer;

/* renamed from: X.Iz7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48401Iz7 implements MediaPlayer.OnSeekCompleteListener {
    public final /* synthetic */ MusicPlayer LJLIL;

    public C48401Iz7(MusicPlayer musicPlayer) {
        this.LJLIL = musicPlayer;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        this.LJLIL.LJIIJJI();
        InterfaceC47330Ihq interfaceC47330Ihq = this.LJLIL.LJLJL;
        if (interfaceC47330Ihq != null) {
            interfaceC47330Ihq.LIZ(4, mediaPlayer.getDuration());
        }
    }
}