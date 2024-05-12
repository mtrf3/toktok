package X;

import kotlin.jvm.internal.o;

/* renamed from: X.5ws, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151385ws {
    public final boolean LIZ;
    public final Boolean LIZIZ;

    public C151385ws() {
        this(3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C151385ws)) {
            return false;
        }
        C151385ws c151385ws = (C151385ws) obj;
        return this.LIZ == c151385ws.LIZ && o.LJ(this.LIZIZ, c151385ws.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Boolean bool = this.LIZIZ;
        return i + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ImageSynthesisParam(needText=");
        LIZ.append(this.LIZ);
        LIZ.append(", autoEnhanceOn=");
        return C78920UyC.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C151385ws(int i) {
        this((i & 1) != 0, null);
    }

    public C151385ws(boolean z, Boolean bool) {
        this.LIZ = z;
        this.LIZIZ = bool;
    }
}
