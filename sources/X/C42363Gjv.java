package X;

import java.util.Objects;
import kotlin.jvm.internal.o;

/* renamed from: X.Gjv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42363Gjv extends AbstractC42364Gjw {
    public final String LIZ;
    public final int LIZIZ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZ, Integer.valueOf(this.LIZIZ)};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C42363Gjv) {
            return C78966Uyw.LJIIIZ(((C42363Gjv) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CloudMergeSuccess:%s,%s", LIZ());
    }

    public C42363Gjv(String resultVID) {
        o.LJIIIZ(resultVID, "resultVID");
        this.LIZ = resultVID;
        this.LIZIZ = 2;
    }
}
