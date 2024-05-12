package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.33M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C33M {
    public final boolean LIZ;
    public final List<InterfaceC57784Mm4> LIZIZ;
    public final C87933cj LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33M)) {
            return false;
        }
        C33M c33m = (C33M) obj;
        return this.LIZ == c33m.LIZ && o.LJ(this.LIZIZ, c33m.LIZIZ) && o.LJ(this.LIZJ, c33m.LIZJ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchDefaultRefreshBundle(scrollToTop=");
        LIZ.append(this.LIZ);
        LIZ.append(", refreshItemList=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", pageLoadData=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final int hashCode() {
        int hashCode;
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LIZIZ, r0 * 31, 31);
        C87933cj c87933cj = this.LIZJ;
        if (c87933cj == null) {
            hashCode = 0;
        } else {
            hashCode = c87933cj.hashCode();
        }
        return LIZIZ + hashCode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33M(boolean z, List<? extends InterfaceC57784Mm4> list, C87933cj c87933cj) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = c87933cj;
    }
}
