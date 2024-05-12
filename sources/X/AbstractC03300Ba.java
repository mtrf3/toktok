package X;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Ba, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC03300Ba {
    public volatile InterfaceC262211e LIZ;
    public Executor LIZIZ;
    public C0BJ LIZJ;
    public InterfaceC262711j LIZLLL;
    public boolean LJFF;
    public List<C0BX> LJI;
    public final ReentrantReadWriteLock LJIIIIZZ = new ReentrantReadWriteLock();
    public final ThreadLocal<Integer> LJIIIZ = new ThreadLocal<>();
    public final java.util.Map<String, Object> LJIIJ = Collections.synchronizedMap(new HashMap());
    public final C0BR LJ = LJFF();
    public final java.util.Map<Class<?>, Object> LJIIJJI = new HashMap();
    public final java.util.Map<Class<? extends InterfaceC23730wT>, InterfaceC23730wT> LJII = new HashMap();

    public abstract C0BR LJFF();

    public abstract InterfaceC262711j LJI(C0BG c0bg);

    public final void LIZ() {
        if (!this.LJFF && C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void LIZLLL() {
        InterfaceC262211e interfaceC262211e = this.LIZ;
        if (interfaceC262211e != null && interfaceC262211e.isOpen()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.LJIIIIZZ.writeLock();
            writeLock.lock();
            try {
                this.LJ.getClass();
                this.LIZLLL.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    public final boolean LJIIJ() {
        return this.LIZLLL.LJLJLLL().LJJJ();
    }

    public final void LJIIJJI() {
        this.LIZLLL.LJLJLLL().LJJIJLIJ();
        if (!LJIIJ()) {
            C0BR c0br = this.LJ;
            if (c0br.LJ.compareAndSet(false, true)) {
                c0br.LIZLLL.LIZIZ.execute(c0br.LJIIJ);
            }
        }
    }

    public final void LJIILLIIL() {
        this.LIZLLL.LJLJLLL().LJJIJL();
    }

    public final void LIZIZ() {
        if (LJIIJ() || this.LJIIIZ.get() == null) {
        } else {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void LIZJ() {
        LIZ();
        LIZ();
        InterfaceC262211e LJLJLLL = this.LIZLLL.LJLJLLL();
        this.LJ.LJ(LJLJLLL);
        if (LJLJLLL.D()) {
            LJLJLLL.LJIL();
        } else {
            LJLJLLL.LJII();
        }
    }

    public List LJII() {
        return Collections.emptyList();
    }

    public java.util.Set<Class<? extends InterfaceC23730wT>> LJIIIIZZ() {
        return Collections.emptySet();
    }

    public java.util.Map<Class<?>, List<Class<?>>> LJIIIZ() {
        return Collections.emptyMap();
    }

    public final InterfaceC37591dj LJ(String str) {
        LIZ();
        LIZIZ();
        return this.LIZLLL.LJLJLLL().LJIILLIIL(str);
    }

    public final void LJIIL(InterfaceC262211e interfaceC262211e) {
        C0BR c0br = this.LJ;
        synchronized (c0br) {
            if (!c0br.LJFF) {
                interfaceC262211e.LJJIJIIJI("PRAGMA temp_store = MEMORY;");
                interfaceC262211e.LJJIJIIJI("PRAGMA recursive_triggers='ON';");
                interfaceC262211e.LJJIJIIJI("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                c0br.LJ(interfaceC262211e);
                c0br.LJI = interfaceC262211e.LJIILLIIL("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                c0br.LJFF = true;
            }
        }
    }

    public final Cursor LJIILIIL(InterfaceC262911l interfaceC262911l) {
        LIZ();
        LIZIZ();
        return this.LIZLLL.LJLJLLL().LLLLZLLIL(interfaceC262911l);
    }

    public final <V> V LJIILJJIL(Callable<V> callable) {
        LIZJ();
        try {
            try {
                try {
                    V call = callable.call();
                    LJIILLIIL();
                    return call;
                } catch (Exception e) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            }
        } finally {
            LJIIJJI();
        }
    }

    public final void LJIILL(Runnable runnable) {
        LIZJ();
        try {
            runnable.run();
            LJIILLIIL();
        } finally {
            LJIIJJI();
        }
    }

    public static Object LJIIZILJ(Class cls, InterfaceC262711j interfaceC262711j) {
        if (cls.isInstance(interfaceC262711j)) {
            return interfaceC262711j;
        }
        if (interfaceC262711j instanceof C0BH) {
            return LJIIZILJ(cls, ((C0BH) interfaceC262711j).getDelegate());
        }
        return null;
    }
}
