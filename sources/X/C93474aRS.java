package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aRS, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93474aRS {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C93474aRS) && o.LJ(this.LIZ, ((C93474aRS) obj).LIZ);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DlgGridItemData(icon=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93474aRS(String icon) {
        o.LJIIIZ(icon, "icon");
        this.LIZ = icon;
    }
}
