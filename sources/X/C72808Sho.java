package X;

import X.InterfaceC57784Mm4;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;

/* renamed from: X.Sho, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72808Sho<T extends InterfaceC57784Mm4> extends MZ7<T> {
    public final List<T> LIZJ = new ArrayList();
    public final ReentrantLock LIZLLL = new ReentrantLock();

    public final void LJFF() {
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).clear();
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final List<InterfaceC57784Mm4> LJII() {
        return new ArrayList(this.LIZJ);
    }

    public final int LJIIIIZZ() {
        return ((ArrayList) this.LIZJ).size();
    }

    public final void LIZJ(T element) {
        o.LJIIIZ(element, "element");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).add(element);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJ(Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).addAll(elements);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final T LJI(int i) {
        return (T) ListProtector.get(this.LIZJ, i);
    }

    public final int LJIIIZ(T element) {
        o.LJIIIZ(element, "element");
        return ((ArrayList) this.LIZJ).indexOf(element);
    }

    public final void LJIIJ(Collection<? extends T> collection) {
        ((ArrayList) this.LIZJ).clear();
        ((ArrayList) this.LIZJ).addAll(collection);
        MZ7.LIZ(this, this.LIZJ, true, false, 4);
    }

    public final void LJIIJJI(Collection<? extends T> list) {
        o.LJIIIZ(list, "list");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).clear();
            ((ArrayList) this.LIZJ).addAll(list);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, true, 2);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIIL(T element) {
        o.LJIIIZ(element, "element");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).remove(element);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIILIIL(int i) {
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIILLIIL(Collection<? extends T> list) {
        o.LJIIIZ(list, "list");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).clear();
            ((ArrayList) this.LIZJ).addAll(list);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LIZIZ(int i, T element) {
        o.LJIIIZ(element, "element");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).add(i, element);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LIZLLL(int i, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).addAll(i, elements);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIILL(int i, T element) {
        o.LJIIIZ(element, "element");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            ((ArrayList) this.LIZJ).remove(i);
            ((ArrayList) this.LIZJ).add(i, element);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void LJIILJJIL(int i, int i2, Collection<? extends T> elements) {
        o.LJIIIZ(elements, "elements");
        ReentrantLock reentrantLock = this.LIZLLL;
        reentrantLock.lock();
        try {
            List<T> list = this.LIZJ;
            ArrayList arrayList = (ArrayList) list;
            ((ArrayList) list).removeAll(arrayList.subList(i, i2 + i));
            ((ArrayList) this.LIZJ).addAll(i, elements);
            reentrantLock.unlock();
            MZ7.LIZ(this, this.LIZJ, false, false, 6);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
