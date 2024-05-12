package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0VB, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0VB {
    public final C0VA LIZ;
    public final C0V8 LIZIZ;

    public final int hashCode() {
        int i;
        C0VA c0va = this.LIZ;
        int i2 = 0;
        if (c0va != null) {
            i = c0va.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C0V8 c0v8 = this.LIZIZ;
        if (c0v8 != null) {
            i2 = c0v8.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlatformTextStyle(spanStyle=");
        LIZ.append(this.LIZ);
        LIZ.append(", paragraphSyle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VB)) {
            return false;
        }
        C0VB c0vb = (C0VB) obj;
        if (o.LJ(this.LIZIZ, c0vb.LIZIZ) && o.LJ(this.LIZ, c0vb.LIZ)) {
            return true;
        }
        return false;
    }

    public C0VB(C0VA c0va, C0V8 c0v8) {
        this.LIZ = c0va;
        this.LIZIZ = c0v8;
    }
}
