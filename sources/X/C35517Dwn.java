package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Dwn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35517Dwn {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35517Dwn) && o.LJ(this.LIZ, ((C35517Dwn) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadResult(tosKey=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C35517Dwn(String str) {
        this.LIZ = str;
    }
}
