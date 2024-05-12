package X;

import kotlin.jvm.internal.o;

/* renamed from: X.0No, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C06560No {
    public final C1ID LIZ;
    public final C1I3 LIZIZ;
    public final C1I8 LIZJ;
    public final C0O4 LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C06560No() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06560No)) {
            return false;
        }
        C06560No c06560No = (C06560No) obj;
        return o.LJ(this.LIZ, c06560No.LIZ) && o.LJ(this.LIZIZ, c06560No.LIZIZ) && o.LJ(this.LIZJ, c06560No.LIZJ) && o.LJ(this.LIZLLL, c06560No.LIZLLL);
    }

    public final int hashCode() {
        C1ID c1id = this.LIZ;
        int hashCode = (c1id == null ? 0 : c1id.hashCode()) * 31;
        C1I3 c1i3 = this.LIZIZ;
        int hashCode2 = (hashCode + (c1i3 == null ? 0 : c1i3.hashCode())) * 31;
        C1I8 c1i8 = this.LIZJ;
        int hashCode3 = (hashCode2 + (c1i8 == null ? 0 : c1i8.hashCode())) * 31;
        C0O4 c0o4 = this.LIZLLL;
        return hashCode3 + (c0o4 != null ? c0o4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TransitionData(fade=");
        LIZ.append(this.LIZ);
        LIZ.append(", slide=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", changeSize=");
        LIZ.append(this.LIZJ);
        LIZ.append(", scale=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C06560No(C1ID c1id, C1I3 c1i3, C1I8 c1i8, C0O4 c0o4) {
        this.LIZ = c1id;
        this.LIZIZ = c1i3;
        this.LIZJ = c1i8;
        this.LIZLLL = c0o4;
    }

    public /* synthetic */ C06560No(C1ID c1id, C1I3 c1i3, C1I8 c1i8, C0O4 c0o4, int i) {
        this((i & 1) != 0 ? null : c1id, (i & 2) != 0 ? null : c1i3, (i & 4) != 0 ? null : c1i8, (i & 8) != 0 ? null : c0o4);
    }
}
