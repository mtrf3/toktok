package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NuC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60836NuC {
    public final int LIZ;
    public final L7N LIZIZ;
    public boolean LIZJ;

    public C60836NuC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60836NuC)) {
            return false;
        }
        C60836NuC c60836NuC = (C60836NuC) obj;
        return this.LIZ == c60836NuC.LIZ && o.LJ(this.LIZIZ, c60836NuC.LIZIZ) && this.LIZJ == c60836NuC.LIZJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        L7N l7n = this.LIZIZ;
        int hashCode = (i + (l7n != null ? l7n.hashCode() : 0)) * 31;
        boolean z = this.LIZJ;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DefaultUIConfig(defaultStatusBarBgColor=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultStatusFontMode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showWebViewProgressBar=");
        return C19U.LIZ(LIZ, this.LIZJ, ")", LIZ);
    }

    public C60836NuC(int i) {
        L7N defaultStatusFontMode = L7N.DARK;
        o.LJIIJ(defaultStatusFontMode, "defaultStatusFontMode");
        this.LIZ = 0;
        this.LIZIZ = defaultStatusFontMode;
        this.LIZJ = true;
    }
}
