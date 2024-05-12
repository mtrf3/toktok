package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class Q9O {
    public final Q9P LIZ;
    public final List<String> LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=#####, permissions=" + this.LIZIZ + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Q9O.class != obj.getClass()) {
            return false;
        }
        Q9O q9o = (Q9O) obj;
        if (!this.LIZ.equals(q9o.LIZ)) {
            return false;
        }
        return this.LIZIZ.equals(q9o.LIZIZ);
    }

    public Q9O(Q9P q9p, List<String> list) {
        this.LIZ = q9p;
        this.LIZIZ = Collections.unmodifiableList(list);
    }
}
