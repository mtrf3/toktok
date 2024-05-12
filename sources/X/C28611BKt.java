package X;

import kotlin.jvm.internal.o;

/* renamed from: X.BKt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28611BKt {
    public final String LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28611BKt)) {
            return false;
        }
        C28611BKt c28611BKt = (C28611BKt) obj;
        return o.LJ(this.LIZ, c28611BKt.LIZ) && this.LIZIZ == c28611BKt.LIZIZ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZIZ) + (this.LIZ.hashCode() * 31);
    }

    public C28611BKt() {
        this("", 0L);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Stream(streamUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", roomId=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C28611BKt(String streamUrl, long j) {
        o.LJIIIZ(streamUrl, "streamUrl");
        this.LIZ = streamUrl;
        this.LIZIZ = j;
    }
}
