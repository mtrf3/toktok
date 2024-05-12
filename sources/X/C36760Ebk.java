package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Ebk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36760Ebk implements InterfaceC36606EYg {
    public static final /* synthetic */ int LJIIJ = 0;
    public transient InterfaceC36766Ebq LIZIZ;
    public transient Throwable LJ;
    public C36754Ebe LJFF;
    public final String LJI;
    public final C36758Ebi LJII;
    public final long LJIIIIZZ;
    public final long LJIIIZ;
    public final transient java.util.Set<InterfaceC36765Ebp> LIZ = Q4K.LIZLLL();
    public transient EnumC36761Ebl LIZJ = EnumC36761Ebl.FALLBACK;
    public transient long LIZLLL = System.currentTimeMillis();

    public final void LIZLLL() {
        String str;
        if (this.LIZIZ == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
        InterfaceC36766Ebq interfaceC36766Ebq = this.LIZIZ;
        if (interfaceC36766Ebq != null) {
            interfaceC36766Ebq.LIZJ(this.LJII, this.LIZJ);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{ request: ");
        C1DI.LIZIZ(LIZ, this.LJII.LIZLLL, "], ", "duration: ");
        C65232Piu.LIZLLL(LIZ, currentTimeMillis, ", ", "hitState: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", ");
        LIZ.append("content: ");
        LIZ.append(this.LJII.LIZIZ.getValue());
        LIZ.append(", ");
        LIZ.append("error: ");
        Throwable th = this.LJ;
        if (th != null) {
            str = C16880lQ.LJLLJ(th.getClass());
        } else {
            str = null;
        }
        LIZ.append(str);
        LIZ.append(" }");
        C36762Ebm.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC36606EYg
    public final void LIZ(Throwable throwable) {
        o.LJIIJ(throwable, "throwable");
        this.LJ = throwable;
        LIZLLL();
        java.util.Set<InterfaceC36765Ebp> listenerSet = this.LIZ;
        o.LJFF(listenerSet, "listenerSet");
        Iterator<InterfaceC36765Ebp> it = listenerSet.iterator();
        while (it.hasNext()) {
            it.next().onFailed(throwable);
        }
    }

    @Override // X.InterfaceC36606EYg
    public final void LIZIZ(C36754Ebe c36754Ebe) {
        this.LJFF = c36754Ebe;
        LIZLLL();
        java.util.Set<InterfaceC36765Ebp> listenerSet = this.LIZ;
        o.LJFF(listenerSet, "listenerSet");
        Iterator<InterfaceC36765Ebp> it = listenerSet.iterator();
        while (it.hasNext()) {
            it.next().LIZ(c36754Ebe);
        }
    }

    public final void LIZJ(InterfaceC36765Ebp processListener) {
        o.LJIIJ(processListener, "processListener");
        this.LIZ.add(processListener);
        C36754Ebe c36754Ebe = this.LJFF;
        if (c36754Ebe != null) {
            LIZLLL();
            processListener.LIZ(c36754Ebe);
        }
        Throwable th = this.LJ;
        if (th != null) {
            LIZLLL();
            processListener.onFailed(th);
        }
    }

    public C36760Ebk(String str, C36758Ebi c36758Ebi, long j, long j2) {
        this.LJI = str;
        this.LJII = c36758Ebi;
        this.LJIIIIZZ = j;
        this.LJIIIZ = j2;
    }
}
