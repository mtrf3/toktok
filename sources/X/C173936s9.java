package X;

import java.util.Objects;

/* renamed from: X.6s9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173936s9<T> extends AbstractC26082ALm<T> {
    public final T LIZ;

    public final int hashCode() {
        return Objects.hash(this.LIZ);
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("Success:%s", this.LIZ);
    }

    @Override // X.AbstractC26082ALm
    public final T LIZ() {
        return this.LIZ;
    }

    public C173936s9(T t) {
        this.LIZ = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C173936s9)) {
            return false;
        }
        return C78966Uyw.LJIIIZ(new Object[]{((C173936s9) obj).LIZ}, new Object[]{this.LIZ});
    }
}
