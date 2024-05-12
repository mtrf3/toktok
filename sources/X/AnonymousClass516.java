package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.516, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass516 {
    public final boolean LIZ;
    public final float LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass516)) {
            return false;
        }
        AnonymousClass516 anonymousClass516 = (AnonymousClass516) obj;
        return this.LIZ == anonymousClass516.LIZ && Float.compare(this.LIZIZ, anonymousClass516.LIZIZ) == 0 && o.LJ(this.LIZJ, anonymousClass516.LIZJ);
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
        int LIZIZ = C47959Irz.LIZIZ(this.LIZIZ, r0 * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LIZIZ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PanelBounceEvent(booleanShow=");
        LIZ.append(this.LIZ);
        LIZ.append(", height=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", panelType=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public AnonymousClass516(String str, float f, boolean z) {
        this.LIZ = z;
        this.LIZIZ = f;
        this.LIZJ = str;
    }
}
