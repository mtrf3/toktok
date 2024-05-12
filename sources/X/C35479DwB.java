package X;

import kotlin.jvm.internal.o;

/* renamed from: X.DwB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35479DwB<T> {
    public InterfaceC65784Pro<? extends T> LIZ;
    public volatile Object LIZIZ = C35480DwC.LIZ;
    public final Object LIZJ = this;

    public final T LIZ() {
        T t;
        T t2 = (T) this.LIZIZ;
        C35480DwC c35480DwC = C35480DwC.LIZ;
        if (t2 != c35480DwC) {
            return t2;
        }
        synchronized (this.LIZJ) {
            t = (T) this.LIZIZ;
            if (t == c35480DwC) {
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
        if (this.LIZIZ != C35480DwC.LIZ) {
            return String.valueOf(LIZ());
        }
        return "Lazy value not initialized yet.";
    }

    public C35479DwB(C35477Dw9 c35477Dw9) {
        this.LIZ = c35477Dw9;
    }
}
