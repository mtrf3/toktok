package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* loaded from: classes9.dex */
public final class IXP implements IXJ<IXY> {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ SimVideoUrlModel LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.IXJ
    public final IXY LIZ() {
        return IUA.LIZ.LIZ().getProcessUrlData(this.LIZIZ, this.LJ);
    }

    @Override // X.IXJ
    public final IXY get() {
        if (!this.LIZ) {
            IXM.LIZ().PreloadProcessDataExperiment();
        }
        IXT ixt = new IXT();
        ixt.LIZ = this.LIZIZ;
        ixt.LIZIZ = this.LIZ;
        ixt.LIZJ = this.LIZJ;
        ixt.LIZLLL = this.LIZLLL;
        return IUA.LIZ.LIZ().createVideoUrlProcessor().LJFF(ixt);
    }

    public IXP(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = simVideoUrlModel;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = str;
    }
}
