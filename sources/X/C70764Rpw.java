package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.AqS33S0100100_12;

/* renamed from: X.Rpw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70764Rpw implements IPR {
    public final /* synthetic */ C70763Rpv LJLIL;

    @Override // X.IPR
    public final void LIZIZ(int i) {
    }

    @Override // X.IPR
    public final void LIZJ(String str) {
    }

    @Override // X.IPR
    public final void LJIILL(String str) {
    }

    @Override // X.IPR
    public final void LJJJI() {
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
    }

    @Override // X.IPR
    public final void onPlayProgressChange(float f) {
    }

    @Override // X.IPR
    public final void onResumePlay(String str) {
    }

    @Override // X.IPR
    public final void LIZ() {
        Video video;
        long j;
        Aweme aweme = this.LJLIL.LIZ;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C70763Rpv c70763Rpv = this.LJLIL;
            if (video.getVideoLength() <= 0) {
                C27606AsU c27606AsU = c70763Rpv.LIZIZ;
                if (c27606AsU != null) {
                    IWF iwf = c70763Rpv.LIZJ.LJII;
                    if (iwf != null) {
                        j = iwf.getDuration();
                    } else {
                        j = 0;
                    }
                    c27606AsU.LJ = Integer.valueOf((int) (j / 1000));
                }
                c70763Rpv.LJ.setParams(c70763Rpv.LIZIZ);
            }
        }
    }

    @Override // X.IPR
    public final void LJJJJZI() {
        C70763Rpv c70763Rpv = this.LJLIL;
        if (c70763Rpv.LJFF != 0 && !c70763Rpv.LJI) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C70763Rpv c70763Rpv2 = this.LJLIL;
            C78946Uyc.LJJIIJ(c70763Rpv2.LIZLLL, new C70950Rsw(), new AqS33S0100100_12(this.LJLIL, elapsedRealtime - c70763Rpv2.LJFF, 3));
            this.LJLIL.LJFF = 0L;
        }
        this.LJLIL.LJI = false;
    }

    public C70764Rpw(C70763Rpv c70763Rpv) {
        this.LJLIL = c70763Rpv;
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
        if (this.LJLIL.LJFF != 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C70763Rpv c70763Rpv = this.LJLIL;
            C78946Uyc.LJJIIJ(c70763Rpv.LIZLLL, new C70950Rsw(), new AqS33S0100100_12(this.LJLIL, elapsedRealtime - c70763Rpv.LJFF, 4));
            this.LJLIL.LJFF = 0L;
        }
    }
}
