package X;

import android.media.MediaPlayer;
import com.ss.android.ugc.musicprovider.provider.MusicPlayer;
import java.util.LinkedList;

/* renamed from: X.Iz5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48399Iz5 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ LinkedList<String> LJLIL;
    public final /* synthetic */ MusicPlayer LJLILLLLZI;
    public final /* synthetic */ C47325Ihl LJLJI;

    public C48399Iz5(LinkedList<String> linkedList, MusicPlayer musicPlayer, C47325Ihl c47325Ihl) {
        this.LJLIL = linkedList;
        this.LJLILLLLZI = musicPlayer;
        this.LJLJI = c47325Ihl;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (C79004UzY.LJJIFFI(this.LJLIL)) {
            this.LJLILLLLZI.LJI(i, i2);
            return false;
        }
        MusicPlayer musicPlayer = this.LJLILLLLZI;
        musicPlayer.LJIIIIZZ(this.LJLJI, this.LJLIL, musicPlayer.LJZ);
        return false;
    }
}
