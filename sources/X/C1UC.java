package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1UC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1UC<T> implements InterfaceC13800gS<T> {
    public final List<String> LIZ = new ArrayList();
    public T LIZIZ;
    public final AbstractC16850lN<T> LIZJ;
    public InterfaceC15110iZ LIZLLL;

    public abstract boolean LIZIZ(C19380pS c19380pS);

    public abstract boolean LIZJ(T t);

    public C1UC(AbstractC16850lN<T> abstractC16850lN) {
        this.LIZJ = abstractC16850lN;
    }

    @Override // X.InterfaceC13800gS
    public final void LIZ(T t) {
        this.LIZIZ = t;
        LJ(this.LIZLLL, t);
    }

    public final void LIZLLL(Iterable<C19380pS> iterable) {
        ((ArrayList) this.LIZ).clear();
        for (C19380pS c19380pS : iterable) {
            if (LIZIZ(c19380pS)) {
                ((ArrayList) this.LIZ).add(c19380pS.LIZ);
            }
        }
        if (((ArrayList) this.LIZ).isEmpty()) {
            this.LIZJ.LIZIZ(this);
        } else {
            AbstractC16850lN<T> abstractC16850lN = this.LIZJ;
            synchronized (abstractC16850lN.LIZJ) {
                if (abstractC16850lN.LIZLLL.add(this)) {
                    if (abstractC16850lN.LIZLLL.size() == 1) {
                        abstractC16850lN.LJ = abstractC16850lN.LIZ();
                        C0VW LIZ = C0VW.LIZ();
                        C16880lQ.LLLZ("%s: initial state = %s", new Object[]{C16880lQ.LJLLJ(abstractC16850lN.getClass()), abstractC16850lN.LJ});
                        LIZ.getClass();
                        abstractC16850lN.LIZLLL();
                    }
                    LIZ(abstractC16850lN.LJ);
                }
            }
        }
        LJ(this.LIZLLL, this.LIZIZ);
    }

    public final void LJ(InterfaceC15110iZ interfaceC15110iZ, T t) {
        if (((ArrayList) this.LIZ).isEmpty() || interfaceC15110iZ == null) {
            return;
        }
        if (t == null || LIZJ(t)) {
            List<String> list = this.LIZ;
            C33091Rp c33091Rp = (C33091Rp) interfaceC15110iZ;
            synchronized (c33091Rp.LIZJ) {
                InterfaceC13820gU interfaceC13820gU = c33091Rp.LIZ;
                if (interfaceC13820gU != null) {
                    interfaceC13820gU.LIZLLL(list);
                }
            }
            return;
        }
        ((C33091Rp) interfaceC15110iZ).LIZIZ(this.LIZ);
    }
}
