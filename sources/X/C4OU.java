package X;

import kotlin.jvm.internal.o;

/* renamed from: X.4OU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4OU {
    public final String LIZ;
    public final boolean LIZIZ;

    public C4OU() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4OU)) {
            return false;
        }
        C4OU c4ou = (C4OU) obj;
        return o.LJ(this.LIZ, c4ou.LIZ) && this.LIZIZ == c4ou.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SharePanelHeadLayoutSetting(overrideTitle=");
        LIZ.append(this.LIZ);
        LIZ.append(", showCloseIcon=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C4OU(int i) {
        this(null, false);
    }

    public C4OU(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
