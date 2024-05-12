package X;

import com.google.gson.j;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHS extends FHM {
    public final java.util.Map<String, j> LIZIZ;
    public final InterfaceC38722FHq LIZJ;

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LIZ() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LIZ = this.LIZJ.LIZ();
        o.LJIIIIZZ(LIZ, "originStorage.providePreciseExposureRepo()");
        return new FH7(map, LIZ);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LIZIZ() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LIZIZ = this.LIZJ.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "originStorage.provideConfigRepo()");
        return new FH7(map, LIZIZ);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LIZJ() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LIZJ = this.LIZJ.LIZJ();
        o.LJIIIIZZ(LIZJ, "originStorage.provideConfigMetaRepo()");
        return new FH7(map, LIZJ);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LIZLLL() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LIZLLL = this.LIZJ.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "originStorage.provideUnregisterConfigRepo()");
        return new FH7(map, LIZLLL);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LJ() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LJ = this.LIZJ.LJ();
        o.LJIIIIZZ(LJ, "originStorage.provideLibraConfigRepo()");
        return new FH7(map, LJ);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LJFF() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LJFF = this.LIZJ.LJFF();
        o.LJIIIIZZ(LJFF, "originStorage.provideLaunchConfigRepo()");
        return new FH7(map, LJFF);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final FHP LJI() {
        java.util.Map<String, j> map = this.LIZIZ;
        FHP LJI = this.LIZJ.LJI();
        o.LJIIIIZZ(LJI, "originStorage.provideHybridConfigRepo()");
        return new FH7(map, LJI);
    }

    @Override // X.FHM, X.InterfaceC38722FHq
    public final void LJII(FI6 fi6) {
        super.LJII(fi6);
        this.LIZJ.LJII(fi6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FHS(java.util.Map<String, ? extends j> map, InterfaceC38722FHq interfaceC38722FHq) {
        this.LIZIZ = map;
        this.LIZJ = interfaceC38722FHq;
    }
}
