package X;

import android.content.Context;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.o;

/* renamed from: X.FDw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38624FDw extends AbstractC38621FDt {
    @Override // X.AbstractC38621FDt
    public final EnumC38627FDz LIZ() {
        return EnumC38627FDz.CREATING;
    }

    @Override // X.AbstractC38621FDt
    public final InterfaceC38616FDo LIZIZ(Context context, int i, FE1 fe1) {
        InterfaceC38616FDo interfaceC38616FDo;
        o.LJIIJ(context, "context");
        ReentrantReadWriteLock.ReadLock readLock = FE8.LIZIZ.readLock();
        readLock.lock();
        try {
            List LIZLLL = FE8.LIZJ.LIZLLL(i);
            synchronized (LIZLLL) {
                C38626FDy c38626FDy = new C38626FDy(context, fe1, true);
                C38626FDy c38626FDy2 = new C38626FDy(context, fe1, false);
                Object LJIIJ = C109434Rf.LJIIJ(LIZLLL, c38626FDy);
                if (LJIIJ == null) {
                    LJIIJ = C109434Rf.LJIIJ(LIZLLL, c38626FDy2);
                }
                FE5 fe5 = (FE5) LJIIJ;
                if (fe5 != null) {
                    interfaceC38616FDo = fe5.LJLJJL;
                } else {
                    interfaceC38616FDo = null;
                }
            }
            return interfaceC38616FDo;
        } finally {
            readLock.unlock();
        }
    }
}
