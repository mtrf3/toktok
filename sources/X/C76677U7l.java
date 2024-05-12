package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.U7l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76677U7l {
    public final U6Y LIZ;
    public final U7T LIZIZ;
    public final ConcurrentHashMap<Long, InterfaceC92693kP> LIZJ;
    public final ConcurrentHashMap<Long, C76690U7y> LIZLLL;
    public final ConcurrentHashMap<Long, C76689U7x> LJ;

    public final void LIZ() {
        Iterator<InterfaceC92693kP> it = this.LIZJ.values().iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.LJ.clear();
    }

    public final void LIZIZ(long j) {
        this.LIZLLL.remove(Long.valueOf(j));
        InterfaceC92693kP interfaceC92693kP = this.LIZJ.get(Long.valueOf(j));
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        this.LIZJ.remove(Long.valueOf(j));
    }

    public final void LIZJ(List<Long> list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (this.LIZJ.contains(Long.valueOf(longValue))) {
                InterfaceC92693kP interfaceC92693kP = this.LIZJ.get(Long.valueOf(longValue));
                if (interfaceC92693kP != null) {
                    interfaceC92693kP.dispose();
                }
                this.LIZJ.remove(Long.valueOf(longValue));
            }
        }
    }

    public C76677U7l(U6Y timeoutListener, U7T linker) {
        o.LJIIIZ(timeoutListener, "timeoutListener");
        o.LJIIIZ(linker, "linker");
        this.LIZ = timeoutListener;
        this.LIZIZ = linker;
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new ConcurrentHashMap<>();
        this.LJ = new ConcurrentHashMap<>();
    }

    public final void LIZLLL(int i, long j, long j2) {
        StringBuilder LIZJ = V10.LIZJ("startCountDown uid=", j, " expireTimeInSeconds=");
        C06510Nj.LIZIZ(LIZJ, j2, " joinType=", i);
        U4R.LIZLLL("InviteOrApplyTimeoutManager", X1D.LIZIZ(LIZJ));
        InterfaceC92693kP LJIIJJI = new C73440Ss0(AbstractC73672Svk.LJJIJIIJIL(1L, j2, 0L, 1L, TimeUnit.SECONDS).LJJL(C73969T1h.LIZIZ()).LJIILL(new U81(j, j2, i, this)).LJIIZILJ(new C76691U7z(i, j, this)).LJIJ(new U8G(i, j, this))).LJIIIIZZ().LJIIJJI();
        this.LIZJ.put(Long.valueOf(j), LJIIJJI);
    }
}
