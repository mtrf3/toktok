package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2hQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65362hQ<T> {
    public final T LIZ;
    public final InterfaceC68342mE<T> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65362hQ)) {
            return false;
        }
        C65362hQ c65362hQ = (C65362hQ) obj;
        return o.LJ(this.LIZ, c65362hQ.LIZ) && o.LJ(this.LIZIZ, c65362hQ.LIZIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        InterfaceC68342mE<T> interfaceC68342mE = this.LIZIZ;
        return hashCode + (interfaceC68342mE != null ? interfaceC68342mE.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HandlerAsyncResultTask(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", asyncResult=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C65362hQ(Object obj, C84661XKn c84661XKn) {
        this.LIZ = obj;
        this.LIZIZ = c84661XKn;
    }
}
