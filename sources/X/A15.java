package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A15 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A15)) {
            return false;
        }
        A15 a15 = (A15) obj;
        return o.LJ(this.LIZ, a15.LIZ) && o.LJ(this.LIZIZ, a15.LIZIZ) && o.LJ(this.LIZJ, a15.LIZJ);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        String str = this.LIZJ;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadingVideo(creationId=");
        LIZ.append(this.LIZ);
        LIZ.append(", videoTitle=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", videoCoverUri=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public A15(String creationId, String str, String str2) {
        o.LJIIIZ(creationId, "creationId");
        this.LIZ = creationId;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
