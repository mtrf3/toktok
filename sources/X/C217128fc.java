package X;

import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.8fc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217128fc {
    public final C216758f1 LIZ;
    public final InterfaceC217158ff LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final LinkedList<AbstractC216708ew<AbstractC216018dp>> LJ = new LinkedList<>();

    public final void LIZ(InterfaceC88472Yns<? super AbstractC216708ew<AbstractC216018dp>, Boolean> interfaceC88472Yns) {
        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LJ.iterator();
        o.LJIIIIZZ(it, "mBufferItems.iterator()");
        while (it.hasNext()) {
            AbstractC216708ew<AbstractC216018dp> next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            if (interfaceC88472Yns.invoke(next).booleanValue()) {
                it.remove();
            }
        }
    }

    public final void LIZIZ(int i, long j) {
        Iterator<AbstractC216708ew<AbstractC216018dp>> it = this.LJ.iterator();
        while (it.hasNext()) {
            this.LIZIZ.LIZ(it.next());
        }
        this.LJ.clear();
        this.LIZJ = i;
        this.LIZLLL = j;
    }

    public C217128fc(C216758f1 c216758f1, InterfaceC217158ff interfaceC217158ff, int i, long j) {
        this.LIZ = c216758f1;
        this.LIZIZ = interfaceC217158ff;
        this.LIZJ = i;
        this.LIZLLL = j;
    }
}
