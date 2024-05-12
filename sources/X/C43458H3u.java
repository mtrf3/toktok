package X;

import Y.ARunnableS37S0100000_1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.H3u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43458H3u {
    public final InterfaceC43387H1b LIZ;
    public volatile boolean LIZIZ;
    public final List<Runnable> LIZJ;
    public C41875Gc3 LIZLLL;
    public double LJ;
    public int LJFF;
    public final ReentrantLock LJI;

    public final void LIZLLL() {
        this.LIZIZ = true;
        this.LIZLLL = new C41875Gc3(0);
        this.LJ = C47636Imm.LJII(2);
        this.LJFF = C47636Imm.LIZJ();
        this.LJI.lock();
        try {
            LIZ();
        } finally {
            this.LJI.unlock();
        }
    }

    public final void LIZ() {
        this.LIZ.LJIIIIZZ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClickPublishWaiter start onStartObservers, observer count: ");
        LIZ.append(((ArrayList) this.LIZJ).size());
        C41813Gb3.LIZJ("ClickPublishWaiter", X1D.LIZIZ(LIZ));
        if (!((ArrayList) this.LIZJ).isEmpty()) {
            Iterator it = ((ArrayList) this.LIZJ).iterator();
            while (it.hasNext()) {
                Runnable runnable = (Runnable) it.next();
                if (runnable != null) {
                    try {
                        runnable.run();
                    } catch (NullPointerException e) {
                        int size = ((ArrayList) this.LIZJ).size();
                        List<Runnable> list = this.LIZJ;
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next == null) {
                                arrayList.add(next);
                            }
                        }
                        int size2 = arrayList.size();
                        this.LIZ.LJIIIIZZ();
                        C41813Gb3.LIZJ("ClickPublishWaiter", C48263Iwt.LIZLLL("observerCount: ", size, ", nullObserverCount: ", size2));
                        throw e;
                    }
                }
            }
        }
        this.LIZ.LJIIIIZZ();
        C41813Gb3.LIZJ("ClickPublishWaiter", "ClickPublishWaiter end onStartObservers");
    }

    public final C41875Gc3 LIZIZ() {
        C41875Gc3 c41875Gc3 = this.LIZLLL;
        if (c41875Gc3 != null) {
            return c41875Gc3;
        }
        o.LJIJI("startPublishSystemTime");
        throw null;
    }

    public C43458H3u(InterfaceC43387H1b externalDependency) {
        o.LJIIIZ(externalDependency, "externalDependency");
        this.LIZ = externalDependency;
        this.LIZJ = new ArrayList();
        this.LJ = -1.0d;
        this.LJI = new ReentrantLock();
    }

    public final boolean LIZJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.LIZIZ) {
            interfaceC65784Pro.invoke();
            return true;
        }
        this.LJI.lock();
        try {
            ((ArrayList) this.LIZJ).add(new ARunnableS37S0100000_1(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 74));
            this.LJI.unlock();
            return false;
        } catch (Throwable th) {
            this.LJI.unlock();
            throw th;
        }
    }
}
