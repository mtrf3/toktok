package X;

import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;

/* loaded from: classes8.dex */
public final class HX1 implements IC5 {
    public final /* synthetic */ VideoRecordNewScene LIZ;

    @Override // X.IC5
    public final void LIZ() {
        this.LIZ.LLJIJIL.nZ("sticker stop record");
    }

    @Override // X.IC5
    public final boolean LIZIZ() {
        if (this.LIZ.LJLZ == null) {
            return false;
        }
        return !C77413UZt.LJIILL(r0.LJII());
    }

    @Override // X.IC5
    public final boolean LIZJ() {
        I3X i3x;
        C45848Hz2 c45848Hz2 = this.LIZ.LLIIIILZ;
        if (c45848Hz2 == null || c45848Hz2.LLJILJILJ() == null || (i3x = this.LIZ.LLJIJIL) == null) {
            return true;
        }
        return i3x.Ue0().LIZ().booleanValue();
    }

    public HX1(VideoRecordNewScene videoRecordNewScene) {
        this.LIZ = videoRecordNewScene;
    }
}
