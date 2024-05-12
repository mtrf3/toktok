package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* renamed from: X.Nj9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC60151Nj9 implements Runnable {
    public final /* synthetic */ MusicModel LJLIL;
    public final /* synthetic */ MusicWaveBean LJLILLLLZI;
    public final /* synthetic */ C60148Nj6 LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ C60152NjA LJLJJL;

    public RunnableC60151Nj9(MusicModel musicModel, MusicWaveBean musicWaveBean, C60148Nj6 c60148Nj6, String str, C60152NjA c60152NjA) {
        this.LJLIL = musicModel;
        this.LJLILLLLZI = musicWaveBean;
        this.LJLJI = c60148Nj6;
        this.LJLJJI = str;
        this.LJLJJL = c60152NjA;
    }

    public final void LIZ() {
        long j;
        this.LJLIL.setMusicWaveBean(this.LJLILLLLZI);
        this.LJLJI.LIZLLL.LIZ(this.LJLIL, this.LJLJJI);
        Long l = this.LJLJJL.LIZ;
        if (l != null) {
            j = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            j = -1;
        }
        new H96().LJIIJJI(j);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
