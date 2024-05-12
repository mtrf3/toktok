package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ec8, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36784Ec8<T> {
    public InterfaceC65784Pro<? extends T> LIZ;
    public volatile Object LIZIZ;
    public final Object LIZJ;

    public final T LIZ() {
        T t;
        T t2 = (T) this.LIZIZ;
        C36785Ec9 c36785Ec9 = C36785Ec9.LIZ;
        if (t2 != c36785Ec9) {
            return t2;
        }
        synchronized (this.LIZJ) {
            t = (T) this.LIZIZ;
            if (t == c36785Ec9) {
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
        if (this.LIZIZ != C36785Ec9.LIZ) {
            return String.valueOf(LIZ());
        }
        return "Lazy value not initialized yet.";
    }

    public C36784Ec8(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        this.LIZ = initializer;
        this.LIZIZ = C36785Ec9.LIZ;
        this.LIZJ = this;
    }

    public final void LIZIZ(T t) {
        if (o.LJ(this.LIZIZ, C36785Ec9.LIZ)) {
            synchronized (this.LIZJ) {
                this.LIZIZ = t;
                this.LIZ = null;
            }
            return;
        }
        this.LIZIZ = t;
    }
}
