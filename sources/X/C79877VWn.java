package X;

import java.util.Arrays;

/* renamed from: X.VWn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79877VWn<V> {
    public final V LIZ;
    public final Throwable LIZIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZ, this.LIZIZ});
    }

    public C79877VWn(V v) {
        this.LIZ = v;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79877VWn)) {
            return false;
        }
        C79877VWn c79877VWn = (C79877VWn) obj;
        V v = this.LIZ;
        if (v != null && v.equals(c79877VWn.LIZ)) {
            return true;
        }
        Throwable th = this.LIZIZ;
        if (th == null || c79877VWn.LIZIZ == null) {
            return false;
        }
        return th.toString().equals(this.LIZIZ.toString());
    }

    public C79877VWn(Throwable th) {
        this.LIZIZ = th;
    }
}
