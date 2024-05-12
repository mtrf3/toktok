package X;

import java.util.Objects;

/* loaded from: classes12.dex */
public final class R9W extends R74 {
    public final String LJFF;
    public final String LJI;

    public final Object[] LIZIZ() {
        return new Object[]{this.LJFF, this.LJI};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof R9W) {
            return C78966Uyw.LJIIIZ(((R9W) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("EmailBindQueryObj:%s,%s", LIZIZ());
    }

    public R9W(String str, String str2) {
        super(0);
        this.LJFF = str;
        this.LJI = str2;
    }
}
