package X;

import java.util.Objects;

/* renamed from: X.Lls, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55224Lls extends SZD {
    public final String LIZJ;

    public final int hashCode() {
        return Objects.hash(this.LIZJ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("VScopePerformanceParams:%s", this.LIZJ);
    }

    public C55224Lls(String str) {
        this.LIZJ = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C55224Lls)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C55224Lls) obj).LIZJ}, new Object[]{this.LIZJ});
    }
}
