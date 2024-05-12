package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.MusicDetailAwemeListFragment;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MHG implements InterfaceC56517MGb {
    public MHI LIZ;
    public final /* synthetic */ MusicDetailAwemeListFragment LIZIZ;

    public MHG(MusicDetailAwemeListFragment musicDetailAwemeListFragment) {
        this.LIZIZ = musicDetailAwemeListFragment;
    }

    @Override // X.InterfaceC56517MGb
    public final void LIZ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
    }

    @Override // X.InterfaceC56517MGb
    public final void LIZIZ(C50420Jqa videoEvent) {
        o.LJIIIZ(videoEvent, "videoEvent");
        long uptimeMillis = SystemClock.uptimeMillis();
        MHI mhi = this.LIZ;
        if (mhi != null) {
            MusicDetailAwemeListFragment musicDetailAwemeListFragment = this.LIZIZ;
            musicDetailAwemeListFragment.LLJ.LIZLLL(mhi.LIZ, uptimeMillis - mhi.LIZIZ, mhi.LIZJ);
        }
        this.LIZ = null;
    }

    @Override // X.InterfaceC56517MGb
    public final void LIZJ(int i, C50420Jqa videoEvent, Aweme aweme) {
        String str;
        o.LJIIIZ(videoEvent, "videoEvent");
        MHI mhi = this.LIZ;
        if (mhi != null) {
            Aweme aweme2 = mhi.LIZ;
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            if (o.LJ(str, aweme.getAid())) {
                return;
            }
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MHI mhi2 = this.LIZ;
        if (mhi2 != null) {
            MusicDetailAwemeListFragment musicDetailAwemeListFragment = this.LIZIZ;
            musicDetailAwemeListFragment.LLJ.LIZLLL(mhi2.LIZ, uptimeMillis - mhi2.LIZIZ, mhi2.LIZJ);
        }
        this.LIZ = new MHI(aweme, SystemClock.uptimeMillis(), i);
    }
}
