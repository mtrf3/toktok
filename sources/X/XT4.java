package X;

import android.media.MediaPlayer;
import java.util.LinkedList;

/* loaded from: classes16.dex */
public final class XT4 implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ LinkedList<String> LJLIL;
    public final /* synthetic */ XT2 LJLILLLLZI;
    public final /* synthetic */ C84881XSz LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public XT4(LinkedList<String> linkedList, XT2 xt2, C84881XSz c84881XSz, boolean z) {
        this.LJLIL = linkedList;
        this.LJLILLLLZI = xt2;
        this.LJLJI = c84881XSz;
        this.LJLJJI = z;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        if (C79004UzY.LJJIFFI(this.LJLIL)) {
            this.LJLILLLLZI.LIZ(i, i2);
            return false;
        }
        this.LJLILLLLZI.LJ(this.LJLJI, this.LJLIL, this.LJLJJI);
        return false;
    }
}
