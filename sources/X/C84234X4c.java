package X;

import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: X.X4c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84234X4c {
    public final long LIZ;
    public final AtomicLong LIZIZ;
    public volatile long LIZJ;
    public long LIZLLL;
    public int LJ;
    public volatile X4T LJFF;
    public int LJI;
    public JSONObject LJII;

    public final long LIZ() {
        long j = this.LIZIZ.get();
        long j2 = this.LIZLLL;
        if (j2 > 0) {
            long j3 = j2 + 1;
            if (j > j3) {
                return j3;
            }
        }
        return j;
    }

    public final long LIZIZ() {
        X4T x4t = this.LJFF;
        if (x4t != null) {
            long j = x4t.LJLLJ;
            if (j > this.LIZJ) {
                return j;
            }
        }
        return this.LIZJ;
    }

    public final long LIZJ() {
        return this.LIZIZ.get() - this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Segment{startOffset=");
        LIZ.append(this.LIZ);
        LIZ.append(",\t currentOffset=");
        LIZ.append(this.LIZIZ);
        LIZ.append(",\t currentOffsetRead=");
        LIZ.append(LIZIZ());
        LIZ.append(",\t endOffset=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public C84234X4c(JSONObject jSONObject) {
        AtomicLong atomicLong = new AtomicLong();
        this.LIZIZ = atomicLong;
        this.LJI = 0;
        this.LIZ = jSONObject.optLong("st");
        LJ(jSONObject.optLong("en"));
        LIZLLL(jSONObject.optLong("cu"));
        long LIZ = LIZ();
        if (LIZ >= atomicLong.get()) {
            this.LIZJ = LIZ;
        }
    }

    public final void LIZLLL(long j) {
        long j2 = this.LIZ;
        if (j < j2) {
            j = j2;
        }
        long j3 = this.LIZLLL;
        if (j3 > 0) {
            long j4 = j3 + 1;
            if (j > j4) {
                j = j4;
            }
        }
        this.LIZIZ.set(j);
    }

    public final void LJ(long j) {
        if (j >= this.LIZ) {
            this.LIZLLL = j;
            return;
        }
        if (C65210PiY.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EndOffset = ");
            LIZ.append(j);
            LIZ.append(", segment = ");
            LIZ.append(this);
            C65210PiY.LIZIZ("Segment", "setEndOffset", X1D.LIZIZ(LIZ));
        }
        if (j != -1) {
            return;
        }
        this.LIZLLL = j;
    }

    public C84234X4c(C84234X4c c84234X4c) {
        AtomicLong atomicLong = new AtomicLong();
        this.LIZIZ = atomicLong;
        this.LJI = 0;
        this.LIZ = c84234X4c.LIZ;
        this.LIZLLL = c84234X4c.LIZLLL;
        atomicLong.set(c84234X4c.LIZIZ.get());
        this.LIZJ = atomicLong.get();
        this.LJ = c84234X4c.LJ;
    }

    public C84234X4c(long j, long j2) {
        AtomicLong atomicLong = new AtomicLong();
        this.LIZIZ = atomicLong;
        this.LJI = 0;
        this.LIZ = j;
        atomicLong.set(j);
        this.LIZJ = j;
        if (j2 >= j) {
            this.LIZLLL = j2;
        } else {
            this.LIZLLL = -1L;
        }
    }
}
