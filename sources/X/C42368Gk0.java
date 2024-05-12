package X;

import java.util.Objects;

/* renamed from: X.Gk0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42368Gk0 extends AbstractC42369Gk1 {
    public final String LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("CloudCompileSuccess:%s", this.LIZ);
    }

    public C42368Gk0(String str) {
        this.LIZ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42368Gk0)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C42368Gk0) obj).LIZ}, new Object[]{this.LIZ});
    }
}
