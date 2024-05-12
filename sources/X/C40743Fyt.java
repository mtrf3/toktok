package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fyt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40743Fyt implements G1H {
    public final /* synthetic */ InterfaceC40755Fz5 LJLIL;
    public final /* synthetic */ InterfaceC40766FzG LJLILLLLZI;

    @Override // X.G1H
    public final void onStart() {
    }

    @Override // X.G1H
    public final void onComplete() {
        this.LJLIL.LIZJ().run();
        EnumC40753Fz3 type = this.LJLILLLLZI.type();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("removeRunningFlow ");
        LIZ.append(type);
        C40741Fyr.LIZ(X1D.LIZIZ(LIZ));
        C40751Fz1.LIZ = null;
        C12460eI.LJIIJJI("b5106");
        C40751Fz1.LIZJ = 3;
        E6T.LIZIZ = 3;
        C36213EJd.LIZJ = 3;
    }

    @Override // X.G1H
    public final void Di0(G04<?> nujComponent) {
        o.LJIIIZ(nujComponent, "nujComponent");
    }

    @Override // X.G1H
    public final void OS(EnumC35461Dvt error) {
        o.LJIIIZ(error, "error");
    }

    public C40743Fyt(InterfaceC40755Fz5 interfaceC40755Fz5, AbstractC40767FzH abstractC40767FzH) {
        this.LJLIL = interfaceC40755Fz5;
        this.LJLILLLLZI = abstractC40767FzH;
    }

    @Override // X.G1H
    public final void gb0(G04<?> nujComponent, C40745Fyv c40745Fyv) {
        o.LJIIIZ(nujComponent, "nujComponent");
    }
}
