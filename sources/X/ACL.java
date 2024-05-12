package X;

import Y.AObserverS72S0100000_4;
import com.ss.android.ugc.aweme.captionsheet.TranscriptPanelFragment;

/* loaded from: classes5.dex */
public final class ACL implements Y7M {
    public final /* synthetic */ TranscriptPanelFragment LIZ;

    @Override // X.Y7M
    public final boolean isPlaying() {
        int mg = this.LIZ.Jl().mg();
        if (mg == 1 || mg == 2 || mg == 4) {
            return true;
        }
        return false;
    }

    @Override // X.Y7M
    public final void pause() {
        this.LIZ.Jl().pausePlayer();
    }

    @Override // X.Y7M
    public final void play() {
        this.LIZ.Jl().LJJJJLI();
    }

    public ACL(TranscriptPanelFragment transcriptPanelFragment) {
        this.LIZ = transcriptPanelFragment;
    }

    @Override // X.Y7M
    public final void LIZ(int i) {
        this.LIZ.Jl().i5(i);
        this.LIZ.Jl().LJJJJLI();
    }

    public final void LIZIZ(C61147NzD c61147NzD) {
        this.LIZ.Jl().u().observe(this.LIZ, new AObserverS72S0100000_4(c61147NzD, 29));
        this.LIZ.Jl().LJJJLIIL();
    }
}
