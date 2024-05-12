package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.W6t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractRunnableC81755W6t<T> implements Runnable {
    public final AtomicInteger LJLIL = new AtomicInteger(0);
    public final W7F<T> LJLILLLLZI;
    public final InterfaceC81754W6s LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;

    public abstract void LIZIZ(Object obj);

    public java.util.Map LIZJ() {
        return null;
    }

    public java.util.Map<String, String> LIZLLL(T t) {
        return null;
    }

    public abstract Object LJ();

    public final void LIZ() {
        if (this.LJLIL.compareAndSet(0, 2)) {
            LJFF();
        }
    }

    public void LJFF() {
        InterfaceC81754W6s interfaceC81754W6s = this.LJLJI;
        String str = this.LJLJJL;
        String str2 = this.LJLJJI;
        interfaceC81754W6s.LJIIIZ(str);
        interfaceC81754W6s.LIZJ(str, str2, null);
        this.LJLILLLLZI.LIZJ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLIL.compareAndSet(0, 1)) {
                try {
                    Object LJ = LJ();
                    this.LJLIL.set(3);
                    try {
                        LJII(LJ);
                        LIZIZ(LJ);
                    } catch (Throwable th) {
                        LIZIZ(LJ);
                        throw th;
                    }
                } catch (Exception e) {
                    this.LJLIL.set(4);
                    LJI(e);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public void LJI(Exception exc) {
        java.util.Map map;
        InterfaceC81754W6s interfaceC81754W6s = this.LJLJI;
        String str = this.LJLJJL;
        String str2 = this.LJLJJI;
        if (interfaceC81754W6s.LJIIIZ(str)) {
            map = LIZJ();
        } else {
            map = null;
        }
        interfaceC81754W6s.LJI(str, str2, exc, map);
        this.LJLILLLLZI.onFailure(exc);
    }

    public void LJII(T t) {
        java.util.Map<String, String> map;
        InterfaceC81754W6s interfaceC81754W6s = this.LJLJI;
        String str = this.LJLJJL;
        String str2 = this.LJLJJI;
        if (interfaceC81754W6s.LJIIIZ(str)) {
            map = LIZLLL(t);
        } else {
            map = null;
        }
        interfaceC81754W6s.LIZIZ(str, str2, map);
        this.LJLILLLLZI.LIZIZ(1, t);
    }

    public AbstractRunnableC81755W6t(W7F<T> w7f, InterfaceC81754W6s interfaceC81754W6s, String str, String str2) {
        this.LJLILLLLZI = w7f;
        this.LJLJI = interfaceC81754W6s;
        this.LJLJJI = str;
        this.LJLJJL = str2;
        interfaceC81754W6s.LIZ(str2, str);
    }
}
