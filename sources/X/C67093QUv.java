package X;

import kotlin.jvm.internal.o;

/* renamed from: X.QUv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67093QUv {
    public boolean LIZ;
    public int LIZIZ;
    public String LIZJ;

    public C67093QUv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C67093QUv) {
                C67093QUv c67093QUv = (C67093QUv) obj;
                if (this.LIZ != c67093QUv.LIZ || this.LIZIZ != c67093QUv.LIZIZ || !o.LJ(this.LIZJ, c67093QUv.LIZJ)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = ((r0 * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SyncIdPatchResult(success=");
        LIZ.append(this.LIZ);
        LIZ.append(", deleteCnt=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errMsg=");
        return JBR.LJFF(LIZ, this.LIZJ, ")", LIZ);
    }

    public C67093QUv(int i) {
        this.LIZ = false;
        this.LIZIZ = 0;
        this.LIZJ = "";
    }
}
