package X;

import java.util.Objects;

/* renamed from: X.aat, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94059aat<T> extends AbstractC93428aQi<T> {
    public final T LIZIZ;

    public C94059aat() {
        this(null);
    }

    public final int hashCode() {
        return Objects.hash(this.LIZIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Loading:%s", this.LIZIZ);
    }

    public C94059aat(Object obj) {
        super(null);
        this.LIZIZ = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94059aat)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C94059aat) obj).LIZIZ}, new Object[]{this.LIZIZ});
    }
}
