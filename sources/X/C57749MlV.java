package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MlV, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57749MlV {
    public final C57742MlO LIZ;
    public final C197267og LIZIZ;

    public C57749MlV() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57749MlV)) {
            return false;
        }
        C57749MlV c57749MlV = (C57749MlV) obj;
        return o.LJ(this.LIZ, c57749MlV.LIZ) && o.LJ(this.LIZIZ, c57749MlV.LIZIZ);
    }

    public final int hashCode() {
        C57742MlO c57742MlO = this.LIZ;
        int hashCode = (c57742MlO == null ? 0 : c57742MlO.hashCode()) * 31;
        C197267og c197267og = this.LIZIZ;
        return hashCode + (c197267og != null ? c197267og.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelationLabelMeta(textInfo=");
        LIZ.append(this.LIZ);
        LIZ.append(", avatarInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C57749MlV(C57742MlO c57742MlO, C197267og c197267og) {
        this.LIZ = c57742MlO;
        this.LIZIZ = c197267og;
    }
}
