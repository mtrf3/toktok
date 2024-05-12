package X;

import kotlin.jvm.internal.o;

/* renamed from: X.2rw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71882rw<DATA> {
    public final DATA LIZ;
    public final EnumC71872rv LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71882rw)) {
            return false;
        }
        C71882rw c71882rw = (C71882rw) obj;
        return o.LJ(this.LIZ, c71882rw.LIZ) && this.LIZIZ == c71882rw.LIZIZ;
    }

    public final int hashCode() {
        DATA data = this.LIZ;
        int hashCode = (data == null ? 0 : data.hashCode()) * 31;
        EnumC71872rv enumC71872rv = this.LIZIZ;
        return hashCode + (enumC71872rv != null ? enumC71872rv.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheDataWrapper(cacheData=");
        LIZ.append(this.LIZ);
        LIZ.append(", cacheType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C71882rw(DATA data, EnumC71872rv enumC71872rv) {
        this.LIZ = data;
        this.LIZIZ = enumC71872rv;
    }
}
