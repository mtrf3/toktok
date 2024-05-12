package X;

import java.util.Arrays;

/* renamed from: X.0GQ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0GQ<V> {
    public final V LIZ;
    public final Throwable LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    public C0GQ(V v) {
        this.LIZ = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0GQ)) {
            return false;
        }
        C0GQ c0gq = (C0GQ) obj;
        V v = this.LIZ;
        if (v != null && v.equals(c0gq.LIZ)) {
            return true;
        }
        Throwable th = this.LIZIZ;
        if (th == null || c0gq.LIZIZ == null) {
            return false;
        }
        return th.toString().equals(this.LIZIZ.toString());
    }

    public C0GQ(Throwable th) {
        this.LIZIZ = th;
    }
}
