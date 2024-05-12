package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UmG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78180UmG extends AbstractC78171Um7 {
    public final /* synthetic */ C78191UmR LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ C32449CoP LIZJ;

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LIZJ(EnumC78220Umu engine) {
        o.LJIIIZ(engine, "engine");
        C78191UmR c78191UmR = this.LIZ;
        long j = this.LIZIZ;
        C78163Ulz c78163Ulz = new C78163Ulz(-29, "stopped", 4);
        c78191UmR.getClass();
        C78191UmR.LJJI(j, c78163Ulz);
    }

    @Override // X.AbstractC78171Um7, X.InterfaceC78206Umg
    public final void LJFF(EnumC78220Umu engine, C78163Ulz error) {
        o.LJIIIZ(engine, "engine");
        o.LJIIIZ(error, "error");
        C78191UmR c78191UmR = this.LIZ;
        long j = this.LIZIZ;
        c78191UmR.getClass();
        C78191UmR.LJJI(j, error);
        this.LIZJ.LJIILIIL = 1;
    }

    @Override // X.InterfaceC78206Umg
    public final void LJII(EnumC78220Umu engine, C78165Um1 c78165Um1) {
        o.LJIIIZ(engine, "engine");
        C78191UmR c78191UmR = this.LIZ;
        long j = this.LIZIZ;
        c78191UmR.getClass();
        C78191UmR.LJJI(j, null);
        this.LIZJ.LJIILIIL = 0;
    }

    public C78180UmG(C78191UmR c78191UmR, long j, C32449CoP c32449CoP) {
        this.LIZ = c78191UmR;
        this.LIZIZ = j;
        this.LIZJ = c32449CoP;
    }
}
