package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1Lb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C31391Lb extends AbstractC07660Ru {
    public final EnumC07540Ri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31391Lb) && this.LIZ == ((C31391Lb) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShowPlayList(defaultPage=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C31391Lb(EnumC07540Ri defaultPage) {
        o.LJIIIZ(defaultPage, "defaultPage");
        this.LIZ = defaultPage;
    }
}
