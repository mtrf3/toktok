package X;

import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorVideoRecordScene;

/* loaded from: classes8.dex */
public final class HX0 implements IC5 {
    public final /* synthetic */ ExteriorVideoRecordScene LIZ;

    @Override // X.IC5
    public final void LIZ() {
        this.LIZ.LLILLL.nZ("sticker stop record");
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
        C45848Hz2 c45848Hz2 = this.LIZ.LLI;
        if (c45848Hz2 == null || c45848Hz2.LLJILJILJ() == null || (i3x = this.LIZ.LLILLL) == null) {
            return true;
        }
        return i3x.Ue0().LIZ().booleanValue();
    }

    public HX0(ExteriorVideoRecordScene exteriorVideoRecordScene) {
        this.LIZ = exteriorVideoRecordScene;
    }
}
