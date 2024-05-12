package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IOE {
    public final String LIZ = "detail_page";
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IOE)) {
            return false;
        }
        IOE ioe = (IOE) obj;
        return o.LJ(this.LIZ, ioe.LIZ) && this.LIZIZ == ioe.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SceneData(scene=");
        LIZ.append(this.LIZ);
        LIZ.append(", beginTime=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public IOE(long j) {
        this.LIZIZ = j;
    }
}
