package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.53y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1288653y {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C1288653y() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1288653y)) {
            return false;
        }
        C1288653y c1288653y = (C1288653y) obj;
        return o.LJ(this.LIZ, c1288653y.LIZ) && o.LJ(this.LIZIZ, c1288653y.LIZIZ) && o.LJ(this.LIZJ, c1288653y.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResourceCategory(categoryName=");
        LIZ.append(this.LIZ);
        LIZ.append(", categoryKey=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", categoryIcon=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C1288653y(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
