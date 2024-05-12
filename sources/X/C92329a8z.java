package X;

import java.util.Objects;

/* renamed from: X.a8z, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92329a8z extends C92108a5Q {
    public final String LIZJ;
    public final String LIZLLL;

    public final Object[] LIZIZ() {
        return new Object[]{this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C92329a8z) {
            return C78966Uyw.LJIIIZ(((C92329a8z) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("PayResultSuccess:%s,%s", LIZIZ());
    }

    public C92329a8z(String str, String str2) {
        super(EnumC92109a5R.SUCCESS, null);
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
