package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WDi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81926WDi<T> {
    public InterfaceC65784Pro<? extends T> LIZ;
    public volatile Object LIZIZ;
    public final Object LIZJ;

    public final T LIZ() {
        T t;
        T t2 = (T) this.LIZIZ;
        C81927WDj c81927WDj = C81927WDj.LIZ;
        if (t2 != c81927WDj) {
            return t2;
        }
        synchronized (this.LIZJ) {
            t = (T) this.LIZIZ;
            if (t == c81927WDj) {
                InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.LIZ;
                if (interfaceC65784Pro != null) {
                    t = interfaceC65784Pro.invoke();
                    this.LIZIZ = t;
                    this.LIZ = null;
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
        }
        return t;
    }

    public final String toString() {
        if (this.LIZIZ != C81927WDj.LIZ) {
            return String.valueOf(LIZ());
        }
        return "Lazy value not initialized yet.";
    }

    public C81926WDi(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        this.LIZ = initializer;
        this.LIZIZ = C81927WDj.LIZ;
        this.LIZJ = this;
    }

    public final void LIZIZ(T t) {
        if (o.LJ(this.LIZIZ, C81927WDj.LIZ)) {
            synchronized (this.LIZJ) {
                this.LIZIZ = t;
                this.LIZ = null;
            }
            return;
        }
        this.LIZIZ = t;
    }
}