package X;

import java.util.Objects;

/* loaded from: classes12.dex */
public final class R9X extends R74 {
    public final String LJFF;
    public final String LJI;
    public final String LJII;

    public final Object[] LIZIZ() {
        return new Object[]{this.LJFF, this.LJI, this.LJII};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof R9X) {
            return C78966Uyw.LJIIIZ(((R9X) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("EmailChangeQueryObj:%s,%s,%s", LIZIZ());
    }

    public R9X(String str, String str2, String str3) {
        super(0);
        this.LJFF = str;
        this.LJI = str2;
        this.LJII = str3;
    }
}
