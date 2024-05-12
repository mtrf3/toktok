package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mp6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57972Mp6 {
    public final boolean LIZ;
    public C57967Mp1 LIZIZ;
    public final EnumC57985MpJ LIZJ;
    public final AbstractC57990MpO LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57972Mp6)) {
            return false;
        }
        C57972Mp6 c57972Mp6 = (C57972Mp6) obj;
        return this.LIZ == c57972Mp6.LIZ && o.LJ(this.LIZIZ, c57972Mp6.LIZIZ) && this.LIZJ == c57972Mp6.LIZJ && o.LJ(this.LIZLLL, c57972Mp6.LIZLLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        C57967Mp1 c57967Mp1 = this.LIZIZ;
        return this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((i + (c57967Mp1 == null ? 0 : c57967Mp1.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LoadContext(isRefresh: ");
        LIZ.append(this.LIZ);
        LIZ.append(", params: ");
        LIZ.append(this.LIZIZ);
        LIZ.append(", origin: ");
        LIZ.append(this.LIZJ);
        LIZ.append(", merge:");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public static C57972Mp6 LIZ(C57972Mp6 c57972Mp6, EnumC57985MpJ loadOrigin) {
        boolean z = c57972Mp6.LIZ;
        C57967Mp1 c57967Mp1 = c57972Mp6.LIZIZ;
        AbstractC57990MpO pageMerge = c57972Mp6.LIZLLL;
        c57972Mp6.getClass();
        o.LJIIIZ(loadOrigin, "loadOrigin");
        o.LJIIIZ(pageMerge, "pageMerge");
        return new C57972Mp6(z, c57967Mp1, loadOrigin, pageMerge);
    }

    public C57972Mp6(boolean z, C57967Mp1 c57967Mp1, EnumC57985MpJ loadOrigin, AbstractC57990MpO pageMerge) {
        o.LJIIIZ(loadOrigin, "loadOrigin");
        o.LJIIIZ(pageMerge, "pageMerge");
        this.LIZ = z;
        this.LIZIZ = c57967Mp1;
        this.LIZJ = loadOrigin;
        this.LIZLLL = pageMerge;
    }
}
