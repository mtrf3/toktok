package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2T9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2T9 {
    public final int LIZ;
    public final String LIZIZ;
    public final C35861aw LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2T9)) {
            return false;
        }
        C2T9 c2t9 = (C2T9) obj;
        return this.LIZ == c2t9.LIZ && o.LJ(this.LIZIZ, c2t9.LIZIZ) && o.LJ(this.LIZJ, c2t9.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        C35861aw c35861aw = this.LIZJ;
        return hashCode + (c35861aw != null ? c35861aw.hashCode() : 0);
    }

    public final String toString() {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LocationCheckResult(code=");
        LIZ.append(this.LIZ);
        LIZ.append(", msg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isEmptyCert=");
        if (this.LIZ == -1000) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(", params=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C2T9(int i, String str, C35861aw c35861aw) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = c35861aw;
    }
}
