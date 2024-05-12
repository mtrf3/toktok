package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ki, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C41921ki extends C31241Km {
    public final EnumC07540Ri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C41921ki) && this.LIZ == ((C41921ki) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenPlayListAction(defaultPage=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C41921ki() {
        this(EnumC07540Ri.QUEUE);
    }

    public C41921ki(EnumC07540Ri defaultPage) {
        o.LJIIIZ(defaultPage, "defaultPage");
        this.LIZ = defaultPage;
    }
}
