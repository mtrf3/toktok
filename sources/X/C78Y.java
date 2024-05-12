package X;

import java.io.Serializable;

/* renamed from: X.78Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C78Y implements Serializable {
    public final long LJLIL;
    public final long LJLILLLLZI;

    public static /* synthetic */ C78Y copy$default(C78Y c78y, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = c78y.LJLIL;
        }
        if ((i & 2) != 0) {
            j2 = c78y.LJLILLLLZI;
        }
        return c78y.copy(j, j2);
    }

    public final C78Y copy(long j, long j2) {
        return new C78Y(j, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78Y)) {
            return false;
        }
        C78Y c78y = (C78Y) obj;
        return this.LJLIL == c78y.LJLIL && this.LJLILLLLZI == c78y.LJLILLLLZI;
    }

    public int hashCode() {
        return C16880lQ.LLJIJIL(this.LJLILLLLZI) + (C16880lQ.LLJIJIL(this.LJLIL) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CountData(timeStamp=");
        LIZ.append(this.LJLIL);
        LIZ.append(", count=");
        return C47135Ieh.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public final long getCount() {
        return this.LJLILLLLZI;
    }

    public final long getTimeStamp() {
        return this.LJLIL;
    }

    public C78Y(long j, long j2) {
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
    }
}
