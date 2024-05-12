package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1LM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1LM extends AbstractC07660Ru {
    public final EnumC07540Ri LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1LM) && this.LIZ == ((C1LM) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenContainer(defaultPage=");
        LIZ.append(this.LIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C1LM(EnumC07540Ri defaultPage) {
        o.LJIIIZ(defaultPage, "defaultPage");
        this.LIZ = defaultPage;
    }
}
