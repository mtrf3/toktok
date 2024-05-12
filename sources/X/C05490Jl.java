package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0Jl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C05490Jl {
    public static final C05490Jl LIZIZ = new C05490Jl(-1);
    public final long LIZ;

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MuteDuration(duration=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C05490Jl(long j) {
        this.LIZ = j;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(C05490Jl.class, cls)) {
            return false;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.android.live.broadcast.model.MuteDuration");
        if (this.LIZ == ((C05490Jl) obj).LIZ) {
            return true;
        }
        return false;
    }
}
