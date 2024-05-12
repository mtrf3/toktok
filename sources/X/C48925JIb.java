package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import kotlin.jvm.internal.o;

/* renamed from: X.JIb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48925JIb implements IPR {
    public final /* synthetic */ C48924JIa LJLIL;

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
    public final void LJJJJZI() {
    }

    @Override // X.IPR
    public final void onBuffering(boolean z) {
    }

    @Override // X.IPR
    public final void onPlayCompleted(String str) {
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
        Aweme aweme = this.LJLIL.LJLJJI;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            C48924JIa c48924JIa = this.LJLIL;
            if (video.getVideoLength() <= 0) {
                C27606AsU c27606AsU = c48924JIa.LJLJJL;
                if (c27606AsU != null) {
                    C46578IPu c46578IPu = c48924JIa.LJLJI;
                    if (c46578IPu != null) {
                        IWF iwf = c46578IPu.LJII;
                        if (iwf != null) {
                            j = iwf.getDuration();
                        } else {
                            j = 0;
                        }
                        c27606AsU.LJ = Integer.valueOf((int) (j / 1000));
                    } else {
                        o.LJIJI("playerController");
                        throw null;
                    }
                }
                c48924JIa.LJLILLLLZI.setParams(c48924JIa.LJLJJL);
            }
        }
    }

    public C48925JIb(C48924JIa c48924JIa) {
        this.LJLIL = c48924JIa;
    }
}
