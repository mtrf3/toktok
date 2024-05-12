package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;

/* loaded from: classes9.dex */
public final class IXQ implements IXJ<IXW> {
    public final /* synthetic */ SimVideoUrlModel LIZ;
    public final /* synthetic */ InterfaceC46867IaN LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ boolean LIZLLL;

    @Override // X.IXJ
    public final /* synthetic */ IXW LIZ() {
        return null;
    }

    @Override // X.IXJ
    public final IXW get() {
        IXT ixt = new IXT();
        ixt.LIZ = this.LIZ;
        ixt.LJ = this.LIZIZ;
        ixt.LIZIZ = this.LIZJ;
        ixt.LIZJ = this.LIZLLL;
        return IUA.LIZ.LIZ().createVideoUrlProcessor().LIZIZ(ixt);
    }

    public IXQ(SimVideoUrlModel simVideoUrlModel, InterfaceC46867IaN interfaceC46867IaN, boolean z, boolean z2) {
        this.LIZ = simVideoUrlModel;
        this.LIZIZ = interfaceC46867IaN;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
