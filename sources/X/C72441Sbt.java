package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sbt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72441Sbt<T> {
    public InterfaceC65784Pro<? extends T> LIZ;
    public volatile Object LIZIZ;
    public final Object LIZJ;

    public final T LIZ() {
        T t;
        T t2 = (T) this.LIZIZ;
        C72442Sbu c72442Sbu = C72442Sbu.LIZ;
        if (t2 != c72442Sbu) {
            return t2;
        }
        synchronized (this.LIZJ) {
            t = (T) this.LIZIZ;
            if (t == c72442Sbu) {
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
        if (this.LIZIZ != C72442Sbu.LIZ) {
            return String.valueOf(LIZ());
        }
        return "Lazy value not initialized yet.";
    }

    public C72441Sbt(InterfaceC65784Pro initializer) {
        o.LJIIJ(initializer, "initializer");
        this.LIZ = initializer;
        this.LIZIZ = C72442Sbu.LIZ;
        this.LIZJ = this;
    }

    public final void LIZIZ(T t) {
        if (o.LJ(this.LIZIZ, C72442Sbu.LIZ)) {
            synchronized (this.LIZJ) {
                this.LIZIZ = t;
                this.LIZ = null;
            }
            return;
        }
        this.LIZIZ = t;
    }
}
