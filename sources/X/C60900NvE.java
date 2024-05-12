package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NvE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60900NvE<T> {
    public InterfaceC65784Pro<? extends T> LIZ;
    public volatile Object LIZIZ;
    public final Object LIZJ;

    public final T LIZ() {
        T t;
        T t2 = (T) this.LIZIZ;
        C60901NvF c60901NvF = C60901NvF.LIZ;
        if (t2 != c60901NvF) {
            return t2;
        }
        synchronized (this.LIZJ) {
            t = (T) this.LIZIZ;
            if (t == c60901NvF) {
                InterfaceC65784Pro<? extends T> interfaceC65784Pro = this.LIZ;
                o.LJI(interfaceC65784Pro);
                t = interfaceC65784Pro.invoke();
                this.LIZIZ = t;
                this.LIZ = null;
            }
        }
        return t;
    }

    public final String toString() {
        if (this.LIZIZ != C60901NvF.LIZ) {
            return String.valueOf(LIZ());
        }
        return "Lazy value not initialized yet.";
    }

    public C60900NvE(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        this.LIZ = initializer;
        this.LIZIZ = C60901NvF.LIZ;
        this.LIZJ = this;
    }

    public final void LIZIZ(T t) {
        if (o.LJ(this.LIZIZ, C60901NvF.LIZ)) {
            synchronized (this.LIZJ) {
                this.LIZIZ = t;
                this.LIZ = null;
            }
            return;
        }
        this.LIZIZ = t;
    }
}
