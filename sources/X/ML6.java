package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ML6<TYPE> {
    public static final /* synthetic */ int LIZLLL = 0;
    public final TYPE LIZ;
    public final Throwable LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ML6)) {
            return false;
        }
        ML6 ml6 = (ML6) obj;
        return o.LJ(this.LIZ, ml6.LIZ) && o.LJ(this.LIZIZ, ml6.LIZIZ) && o.LJ(this.LIZJ, ml6.LIZJ);
    }

    public final int hashCode() {
        TYPE type = this.LIZ;
        int hashCode = (type == null ? 0 : type.hashCode()) * 31;
        Throwable th = this.LIZIZ;
        int hashCode2 = (hashCode + (th == null ? 0 : th.hashCode())) * 31;
        String str = this.LIZJ;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RespMetaData(result=");
        LIZ.append(this.LIZ);
        LIZ.append(", error=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", logId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ML6(Object obj, String str, Throwable th) {
        this.LIZ = obj;
        this.LIZIZ = th;
        this.LIZJ = str;
    }
}
