package X;

import java.util.Arrays;

/* renamed from: X.Zes, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90462Zes {
    public int LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0, Integer.valueOf(this.LIZ), 0, 0, 0, Boolean.FALSE});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C90462Zes)) {
            return false;
        }
        C90462Zes c90462Zes = (C90462Zes) obj;
        c90462Zes.getClass();
        if (this.LIZ == c90462Zes.LIZ) {
            return true;
        }
        return false;
    }
}
