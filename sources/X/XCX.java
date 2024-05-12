package X;

import Y.ARunnableS34S0200000_15;
import java.util.Iterator;

/* loaded from: classes16.dex */
public final class XCX {
    public final C40601ia<String, AbstractC13830gV> LIZ = new C40601ia<>(false);
    public final C40601ia<String, InterfaceC13850gX> LIZIZ = new C40601ia<>(true);
    public final C46151rX<InterfaceC13850gX> LIZJ = new C46151rX<>();
    public final C46151rX<InterfaceC13850gX> LIZLLL = new C46151rX<>();
    public final C30941Ji LJ = new C30941Ji(0);
    public final C0R2 LJFF = new C0R2(0);
    public final C40601ia<String, InterfaceC13850gX> LJI = new C40601ia<>(true);
    public final int LJII;
    public final InterfaceExecutorC06770Oj LJIIIIZZ;

    public final void LIZ(InterfaceC13850gX interfaceC13850gX) {
        Iterator<AbstractC13830gV> it = this.LIZ.values().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (it.next().LIZ()) {
                z = true;
            }
        }
        if (interfaceC13850gX instanceof XCZ) {
            ((XCZ) interfaceC13850gX).LJ();
        }
        if (!z) {
            this.LJIIIIZZ.execute(new ARunnableS34S0200000_15(this, interfaceC13850gX, 30));
        }
    }

    public XCX(int i, InterfaceExecutorC06770Oj interfaceExecutorC06770Oj) {
        this.LJII = i;
        this.LJIIIIZZ = interfaceExecutorC06770Oj;
    }
}
