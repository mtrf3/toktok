package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Future;

/* renamed from: X.PWh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64583PWh {
    public final C64563PVn LIZ;
    public C64592PWq LIZIZ;
    public C64562PVm LIZJ;
    public final C64582PWg LIZLLL;
    public final InterfaceC48133Iun LJ;
    public final AbstractC64590PWo LJFF;
    public final Object LJI;
    public final C64585PWj LJII;
    public int LJIIIIZZ;
    public C64561PVl LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL = -1;
    public PW9 LJIILJJIL;

    public final synchronized C64561PVl LIZIZ() {
        return this.LJIIIZ;
    }

    public final void LJFF() {
        C64561PVl c64561PVl;
        Socket LIZJ;
        synchronized (this.LIZLLL) {
            c64561PVl = this.LJIIIZ;
            LIZJ = LIZJ(true, false, false);
            if (this.LJIIIZ != null) {
                c64561PVl = null;
            }
        }
        PVA.LJFF(LIZJ);
        if (c64561PVl != null) {
            this.LJFF.connectionReleased(this.LJ, c64561PVl);
        }
    }

    public final void LJI() {
        C64561PVl c64561PVl;
        Socket LIZJ;
        synchronized (this.LIZLLL) {
            c64561PVl = this.LJIIIZ;
            LIZJ = LIZJ(false, true, false);
            if (this.LJIIIZ != null) {
                c64561PVl = null;
            }
        }
        PVA.LJFF(LIZJ);
        if (c64561PVl != null) {
            C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
            InterfaceC48133Iun interfaceC48133Iun = this.LJ;
            c64586PWk.getClass();
            ((C64587PWl) interfaceC48133Iun).LIZLLL(null);
            this.LJFF.connectionReleased(this.LJ, c64561PVl);
            this.LJFF.callEnd(this.LJ);
        }
    }

    public final String toString() {
        C64561PVl LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            return LIZIZ.toString();
        }
        return this.LIZ.toString();
    }

    public final void LJII(IOException iOException) {
        C64561PVl c64561PVl;
        boolean z;
        Socket LIZJ;
        synchronized (this.LIZLLL) {
            c64561PVl = null;
            if (iOException instanceof C64576PWa) {
                PWT pwt = ((C64576PWa) iOException).errorCode;
                if (pwt == PWT.REFUSED_STREAM) {
                    int i = this.LJIIIIZZ + 1;
                    this.LJIIIIZZ = i;
                    if (i > 1) {
                        this.LIZJ = null;
                        z = true;
                    }
                    z = false;
                } else {
                    if (pwt != PWT.CANCEL) {
                        this.LIZJ = null;
                        z = true;
                    }
                    z = false;
                }
            } else {
                C64561PVl c64561PVl2 = this.LJIIIZ;
                if (c64561PVl2 != null && (c64561PVl2.LJII == null || (iOException instanceof C64580PWe))) {
                    if (c64561PVl2.LJIIJJI == 0) {
                        C64562PVm c64562PVm = this.LIZJ;
                        if (c64562PVm != null && iOException != null) {
                            this.LJII.LIZ(c64562PVm, iOException);
                        }
                        this.LIZJ = null;
                    }
                    z = true;
                }
                z = false;
            }
            C64561PVl c64561PVl3 = this.LJIIIZ;
            LIZJ = LIZJ(z, false, true);
            if (this.LJIIIZ == null && this.LJIIJ) {
                c64561PVl = c64561PVl3;
            }
        }
        PVA.LJFF(LIZJ);
        if (c64561PVl != null) {
            this.LJFF.connectionReleased(this.LJ, c64561PVl);
        }
    }

    public final void LIZ(C64561PVl c64561PVl, boolean z) {
        if (this.LJIIIZ == null) {
            this.LJIIIZ = c64561PVl;
            this.LJIIJ = z;
            ((ArrayList) c64561PVl.LJIILIIL).add(new PX5(this, this.LJI));
            return;
        }
        throw new IllegalStateException();
    }

    public final Socket LIZJ(boolean z, boolean z2, boolean z3) {
        Socket socket;
        Future<?> future;
        if (z3) {
            this.LJIILJJIL = null;
        }
        boolean z4 = true;
        if (z2) {
            this.LJIIJJI = true;
        }
        C64561PVl c64561PVl = this.LJIIIZ;
        if (c64561PVl == null) {
            return null;
        }
        if (z) {
            c64561PVl.LJIIJ = true;
        }
        if (this.LJIILJJIL != null) {
            return null;
        }
        if (!this.LJIIJJI && !c64561PVl.LJIIJ) {
            return null;
        }
        int size = ((ArrayList) c64561PVl.LJIILIIL).size();
        for (int i = 0; i < size; i++) {
            if (((Reference) ListProtector.get(c64561PVl.LJIILIIL, i)).get() == this) {
                ListProtector.remove(c64561PVl.LJIILIIL, i);
                if (((ArrayList) this.LJIIIZ.LJIILIIL).isEmpty()) {
                    this.LJIIIZ.LJIILJJIL = System.nanoTime();
                    C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
                    C64582PWg c64582PWg = this.LIZLLL;
                    C64561PVl c64561PVl2 = this.LJIIIZ;
                    c64586PWk.getClass();
                    c64582PWg.getClass();
                    if (c64561PVl2.LJIIJ || c64582PWg.LIZ == 0) {
                        ((ArrayDeque) c64582PWg.LIZLLL).remove(c64561PVl2);
                    } else {
                        c64582PWg.notifyAll();
                        z4 = false;
                    }
                    if (!z4) {
                        Runnable runnable = c64582PWg.LIZJ;
                        if (runnable instanceof RunnableC64591PWp) {
                            RunnableC64591PWp runnableC64591PWp = (RunnableC64591PWp) runnable;
                            synchronized (runnableC64591PWp.LJLIL) {
                                future = runnableC64591PWp.LJLJJI;
                                runnableC64591PWp.LJLJJI = null;
                            }
                            if (future != null && future.cancel(false)) {
                                runnableC64591PWp.LJLILLLLZI.execute(runnableC64591PWp);
                            }
                        }
                    }
                    if (z4) {
                        socket = this.LJIIIZ.LJ;
                        this.LJIIIZ = null;
                        return socket;
                    }
                }
                socket = null;
                this.LJIIIZ = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    public final void LJIIIIZZ(boolean z, PW9 pw9, long j, IOException iOException) {
        C64561PVl c64561PVl;
        Socket LIZJ;
        boolean z2;
        this.LJFF.responseBodyEnd(this.LJ, j);
        synchronized (this.LIZLLL) {
            if (pw9 != null) {
                if (pw9 == this.LJIILJJIL) {
                    if (!z) {
                        this.LJIIIZ.LJIIJJI++;
                    }
                    c64561PVl = this.LJIIIZ;
                    LIZJ = LIZJ(z, false, true);
                    if (this.LJIIIZ != null) {
                        c64561PVl = null;
                    }
                    z2 = this.LJIIJJI;
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("expected ");
            LIZ.append(this.LJIILJJIL);
            LIZ.append(" but was ");
            LIZ.append(pw9);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
        PVA.LJFF(LIZJ);
        if (c64561PVl != null) {
            this.LJFF.connectionReleased(this.LJ, c64561PVl);
        }
        if (iOException != null) {
            C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
            InterfaceC48133Iun interfaceC48133Iun = this.LJ;
            c64586PWk.getClass();
            this.LJFF.callFailed(this.LJ, ((C64587PWl) interfaceC48133Iun).LIZLLL(iOException));
            return;
        }
        if (!z2) {
            return;
        }
        C64586PWk c64586PWk2 = AbstractC64554PVe.LIZ;
        InterfaceC48133Iun interfaceC48133Iun2 = this.LJ;
        c64586PWk2.getClass();
        ((C64587PWl) interfaceC48133Iun2).LIZLLL(null);
        this.LJFF.callEnd(this.LJ);
    }

    public C64583PWh(C64582PWg c64582PWg, C64563PVn c64563PVn, InterfaceC48133Iun interfaceC48133Iun, AbstractC64590PWo abstractC64590PWo, Object obj) {
        this.LIZLLL = c64582PWg;
        this.LIZ = c64563PVn;
        this.LJ = interfaceC48133Iun;
        this.LJFF = abstractC64590PWo;
        AbstractC64554PVe.LIZ.getClass();
        this.LJII = new C64585PWj(c64563PVn, c64582PWg.LJ, interfaceC48133Iun, abstractC64590PWo);
        this.LJI = obj;
    }

    public final C64561PVl LIZLLL(int i, int i2, int i3, int i4, boolean z) {
        C64561PVl c64561PVl;
        Socket socket;
        Socket socket2;
        C64561PVl c64561PVl2;
        C64562PVm c64562PVm;
        boolean z2;
        boolean z3;
        C64592PWq c64592PWq;
        int i5 = i;
        synchronized (this.LIZLLL) {
            if (!this.LJIIJJI) {
                if (this.LJIILJJIL == null) {
                    if (!this.LJIIL) {
                        c64561PVl = this.LJIIIZ;
                        socket = null;
                        if (c64561PVl != null && c64561PVl.LJIIJ) {
                            socket2 = LIZJ(false, false, true);
                        } else {
                            socket2 = null;
                        }
                        c64561PVl2 = this.LJIIIZ;
                        if (c64561PVl2 != null) {
                            c64561PVl = null;
                        } else {
                            c64561PVl2 = null;
                        }
                        if (!this.LJIIJ) {
                            c64561PVl = null;
                        }
                        if (c64561PVl2 == null) {
                            AbstractC64554PVe.LIZ.LIZIZ(this.LIZLLL, this.LIZ, this, null);
                            C64561PVl c64561PVl3 = this.LJIIIZ;
                            if (c64561PVl3 != null) {
                                c64561PVl2 = c64561PVl3;
                                z2 = true;
                                c64562PVm = null;
                            } else {
                                c64562PVm = this.LIZJ;
                            }
                        } else {
                            c64562PVm = null;
                        }
                        z2 = false;
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Canceled#Reason=");
                        LIZ.append(this.LJIILIIL);
                        throw new IOException(X1D.LIZIZ(LIZ));
                    }
                } else {
                    throw new IllegalStateException("codec != null");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        PVA.LJFF(socket2);
        if (c64561PVl != null) {
            this.LJFF.connectionReleased(this.LJ, c64561PVl);
        }
        if (z2) {
            this.LJFF.connectionAcquired(this.LJ, c64561PVl2);
        }
        if (c64561PVl2 != null) {
            this.LIZJ = this.LJIIIZ.LIZJ;
            return c64561PVl2;
        }
        if (c64562PVm == null && ((c64592PWq = this.LIZIZ) == null || !c64592PWq.LIZ())) {
            this.LIZIZ = this.LJII.LIZIZ();
            if (PWY.LIZ().LJ.get() <= 0 || !PWY.LIZ().LIZLLL.get()) {
                this.LIZIZ.LIZJ = false;
            }
            z3 = true;
        } else {
            z3 = false;
        }
        synchronized (this.LIZLLL) {
            if (!this.LJIIL) {
                if (z3) {
                    C64592PWq c64592PWq2 = this.LIZIZ;
                    c64592PWq2.getClass();
                    ArrayList arrayList = new ArrayList(c64592PWq2.LIZ);
                    int size = arrayList.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        C64562PVm c64562PVm2 = (C64562PVm) arrayList.get(i6);
                        AbstractC64554PVe.LIZ.LIZIZ(this.LIZLLL, this.LIZ, this, c64562PVm2);
                        C64561PVl c64561PVl4 = this.LJIIIZ;
                        if (c64561PVl4 != null) {
                            this.LIZJ = c64562PVm2;
                            c64561PVl2 = c64561PVl4;
                            z2 = true;
                            break;
                        }
                    }
                }
                if (!z2) {
                    if (c64562PVm == null) {
                        C64592PWq c64592PWq3 = this.LIZIZ;
                        if (c64592PWq3.LIZ()) {
                            List<C64562PVm> list = c64592PWq3.LIZ;
                            int i7 = c64592PWq3.LIZIZ;
                            c64592PWq3.LIZIZ = i7 + 1;
                            c64562PVm = (C64562PVm) ListProtector.get(list, i7);
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                    this.LIZJ = c64562PVm;
                    this.LJIIIIZZ = 0;
                    c64561PVl2 = new C64561PVl(this.LIZLLL, c64562PVm);
                    LIZ(c64561PVl2, false);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Canceled#Reason=");
                LIZ2.append(this.LJIILIIL);
                throw new IOException(X1D.LIZIZ(LIZ2));
            }
        }
        if (z2) {
            this.LJFF.connectionAcquired(this.LJ, c64561PVl2);
            return c64561PVl2;
        }
        C64592PWq c64592PWq4 = this.LIZIZ;
        if (c64592PWq4 != null && c64592PWq4.LIZJ) {
            i5 = PWY.LIZ().LJ.get();
        }
        if (this.LIZIZ == null && this.LIZJ != null && PWY.LIZ().LIZLLL.get() && PWY.LIZ().LJ.get() > 0) {
            i5 = PWY.LIZ().LJ.get();
        }
        c64561PVl2.LIZJ(i5, i2, i3, i4, z, this.LJ, this.LJFF);
        C64586PWk c64586PWk = AbstractC64554PVe.LIZ;
        C64582PWg c64582PWg = this.LIZLLL;
        c64586PWk.getClass();
        c64582PWg.LJ.LIZ(c64561PVl2.LIZJ);
        synchronized (this.LIZLLL) {
            this.LJIIJ = true;
            C64586PWk.LIZJ(this.LIZLLL, c64561PVl2);
            if (c64561PVl2.LJII != null) {
                socket = AbstractC64554PVe.LIZ.LIZ(this.LIZLLL, this.LIZ, this);
                c64561PVl2 = this.LJIIIZ;
            }
        }
        PVA.LJFF(socket);
        this.LJFF.connectionAcquired(this.LJ, c64561PVl2);
        return c64561PVl2;
    }

    public final C64561PVl LJ(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C64561PVl LIZLLL = LIZLLL(i, i2, i3, i4, z);
            synchronized (this.LIZLLL) {
                if (LIZLLL.LJIIJJI != 0 || LIZLLL.LJII != null) {
                    if (!LIZLLL.LJII(z2)) {
                        LJFF();
                    } else {
                        return LIZLLL;
                    }
                } else {
                    return LIZLLL;
                }
            }
        }
    }
}
