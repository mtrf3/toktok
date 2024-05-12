package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2U6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2U6 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2U6) && o.LJ(this.LIZ, ((C2U6) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PUgcTemplateUploadResult(imageTosKey=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C2U6(String str) {
        this.LIZ = str;
    }
}
