package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Um0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78164Um0 {
    public final List<C35946E8w> LIZ;
    public final Double LIZIZ;
    public final Double LIZJ;
    public final Double LIZLLL;
    public final Double LJ;
    public Double LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C78164Um0)) {
            return false;
        }
        C78164Um0 c78164Um0 = (C78164Um0) obj;
        return o.LJ(this.LIZ, c78164Um0.LIZ) && o.LJ(this.LIZIZ, c78164Um0.LIZIZ) && o.LJ(this.LIZJ, c78164Um0.LIZJ) && o.LJ(this.LIZLLL, c78164Um0.LIZLLL) && o.LJ(this.LJ, c78164Um0.LJ) && o.LJ(this.LJFF, c78164Um0.LJFF);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        Double d = this.LIZIZ;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.LJ;
        int hashCode5 = (hashCode4 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.LJFF;
        return hashCode5 + (d5 != null ? d5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Result(records=");
        LIZ.append(this.LIZ);
        LIZ.append(", avgRenderFps=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", avgPushFps=");
        LIZ.append(this.LIZJ);
        LIZ.append(", minRenderFps=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", minPushFps=");
        LIZ.append(this.LJ);
        LIZ.append(", deviceFps=");
        LIZ.append(this.LJFF);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C78164Um0(List<C35946E8w> list, Double d, Double d2, Double d3, Double d4, Double d5) {
        this.LIZ = list;
        this.LIZIZ = d;
        this.LIZJ = d2;
        this.LIZLLL = d3;
        this.LJ = d4;
        this.LJFF = d5;
    }
}
