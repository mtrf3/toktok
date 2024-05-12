package X;

import java.util.Objects;

/* renamed from: X.aau, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94060aau<T> extends AbstractC93428aQi<T> {
    public final T LIZIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Success:%s", this.LIZIZ);
    }

    @Override // X.AbstractC93428aQi
    public final T LIZ() {
        return this.LIZIZ;
    }

    public C94060aau(T t) {
        super(t);
        this.LIZIZ = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C94060aau)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C94060aau) obj).LIZIZ}, new Object[]{this.LIZIZ});
    }
}
