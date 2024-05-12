package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JCm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48780JCm {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public C48780JCm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48780JCm)) {
            return false;
        }
        C48780JCm c48780JCm = (C48780JCm) obj;
        return o.LJ(this.LIZ, c48780JCm.LIZ) && this.LIZIZ == c48780JCm.LIZIZ && o.LJ(this.LIZJ, c48780JCm.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ) * 31;
        String str2 = this.LIZJ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PipFeedParam(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", pageType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", eventType=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C48780JCm(int i) {
        this(null, 0, null);
    }

    public C48780JCm(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
