package X;

import java.util.HashSet;

/* loaded from: classes15.dex */
public abstract class W8S {
    public final Object LJLIL;
    public final Object LJLILLLLZI;

    public abstract int LIZJ(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final Object LJ() {
        Object pollLast;
        W8T w8t = (W8T) this.LJLILLLLZI;
        synchronized (w8t) {
            W8U<T> w8u = w8t.LIZJ;
            if (w8u != 0) {
                pollLast = w8u.LIZJ.pollLast();
                if (w8u.LIZJ.isEmpty()) {
                    w8t.LIZ(w8u);
                    w8t.LIZ.remove(w8u.LIZIZ);
                }
            } else {
                pollLast = null;
            }
        }
        LIZLLL(pollLast);
        return pollLast;
    }

    public /* synthetic */ W8S() {
        this.LJLIL = new HashSet();
        this.LJLILLLLZI = new W8T();
    }

    public Object LIZ(int i) {
        Object pollFirst;
        W8T w8t = (W8T) this.LJLILLLLZI;
        synchronized (w8t) {
            W8U w8u = w8t.LIZ.get(i);
            if (w8u != null) {
                pollFirst = w8u.LIZJ.pollFirst();
                if (w8t.LIZIZ != w8u) {
                    w8t.LIZ(w8u);
                    W8U w8u2 = w8t.LIZIZ;
                    if (w8u2 == null) {
                        w8t.LIZIZ = w8u;
                        w8t.LIZJ = w8u;
                    } else {
                        w8u.LIZLLL = w8u2;
                        w8u2.LIZ = w8u;
                        w8t.LIZIZ = w8u;
                    }
                }
            } else {
                pollFirst = null;
            }
        }
        LIZLLL(pollFirst);
        return pollFirst;
    }

    public final void LIZLLL(Object obj) {
        if (obj != null) {
            synchronized (this) {
                ((java.util.Set) this.LJLIL).remove(obj);
            }
        }
    }

    public void LJFF(Object obj) {
        boolean add;
        synchronized (this) {
            add = ((java.util.Set) this.LJLIL).add(obj);
        }
        if (add) {
            ((W8T) this.LJLILLLLZI).LIZIZ(LIZJ(obj), obj);
        }
    }

    public /* synthetic */ W8S(Object obj, Object obj2) {
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
    }
}
