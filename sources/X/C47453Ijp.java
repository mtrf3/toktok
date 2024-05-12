package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* renamed from: X.Ijp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47453Ijp implements InterfaceC47454Ijq {
    public IY1 LIZ;
    public final /* synthetic */ SimVideoUrlModel LIZIZ;
    public final /* synthetic */ int LIZJ;
    public final /* synthetic */ C47458Iju LIZLLL;

    public final int LIZ() {
        if (this.LIZ == null) {
            LIZIZ();
        }
        int i = this.LIZJ;
        if (this.LIZ != null) {
            int PlayerAbPreloadSizeOffsetThresholdExp = this.LIZLLL.LJLJJLL.config.getExperiment().PlayerAbPreloadSizeOffsetThresholdExp();
            IYN iyn = this.LIZ.LIZLLL;
            if (iyn != null) {
                if (iyn.getSize() > this.LIZJ && this.LIZ.LIZLLL.getSize() - this.LIZJ <= PlayerAbPreloadSizeOffsetThresholdExp) {
                    return this.LIZ.LIZLLL.getSize();
                }
                return i;
            }
            if (this.LIZIZ.getSize() <= this.LIZJ || this.LIZIZ.getSize() - this.LIZJ > PlayerAbPreloadSizeOffsetThresholdExp) {
                return i;
            }
            return (int) this.LIZIZ.getSize();
        }
        return i;
    }

    public final String[] LIZIZ() {
        if (this.LIZ == null) {
            this.LIZ = this.LIZLLL.LJLJJLL.config.createVideoUrlProcessor().LIZ(this.LIZIZ, IXN.LIZJ.getPlayerType());
        }
        IY1 iy1 = this.LIZ;
        if (iy1 != null) {
            return iy1.LIZ;
        }
        return null;
    }

    public C47453Ijp(C47458Iju c47458Iju, SimVideoUrlModel simVideoUrlModel, int i) {
        this.LIZLLL = c47458Iju;
        this.LIZIZ = simVideoUrlModel;
        this.LIZJ = i;
    }
}
