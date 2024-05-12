package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69942oo extends AbstractC69952op {
    public final Exception LIZIZ;

    public C69942oo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C69942oo) && o.LJ(this.LIZIZ, ((C69942oo) obj).LIZIZ);
    }

    public final int hashCode() {
        Exception exc = this.LIZIZ;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fail(e=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C69942oo(int i) {
        super(-1);
        this.LIZIZ = null;
    }
}
