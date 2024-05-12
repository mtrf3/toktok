package X;

import X.InterfaceC106334Fh;
import kotlin.jvm.internal.o;

/* renamed from: X.0QK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0QK<T extends InterfaceC106334Fh<? extends Boolean>> {
    public final String LIZ;
    public final T LIZIZ;

    public final int hashCode() {
        int i;
        String str = this.LIZ;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        T t = this.LIZIZ;
        if (t != null) {
            i2 = t.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AccessibilityAction(label=");
        LIZ.append(this.LIZ);
        LIZ.append(", action=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QK)) {
            return false;
        }
        C0QK c0qk = (C0QK) obj;
        if (o.LJ(this.LIZ, c0qk.LIZ) && o.LJ(this.LIZIZ, c0qk.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C0QK(String str, T t) {
        this.LIZ = str;
        this.LIZIZ = t;
    }
}
