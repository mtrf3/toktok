package X;

import java.util.Objects;

/* renamed from: X.SYt, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72291SYt extends AbstractC72297SYz {
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;

    public final Object[] LIZ() {
        return new Object[]{Float.valueOf(this.LIZIZ), Float.valueOf(this.LIZJ), Float.valueOf(this.LIZLLL), Float.valueOf(this.LJ), Float.valueOf(this.LJFF), Float.valueOf(this.LJI)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C72291SYt) {
            return C78966Uyw.LJIIIZ(((C72291SYt) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("ListDropPerformanceParams:%s,%s,%s,%s,%s,%s", LIZ());
    }

    public C72291SYt(float f, float f2, float f3, float f4, float f5, float f6) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
        this.LJFF = f5;
        this.LJI = f6;
    }
}
