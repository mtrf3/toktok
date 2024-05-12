package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1kg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41901kg extends C31241Km {
    public final EnumC07540Ri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41901kg) && this.LIZ == ((C41901kg) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenKaraokeContainerAction(defaultPage=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41901kg(EnumC07540Ri defaultPage) {
        o.LJIIIZ(defaultPage, "defaultPage");
        this.LIZ = defaultPage;
    }
}
