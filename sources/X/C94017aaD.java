package X;

import java.util.Objects;

/* renamed from: X.aaD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94017aaD {
    public final String LIZ;
    public final String LIZIZ;

    public C94017aaD(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public final int hashCode() {
        return (Objects.hashCode(this.LIZ) * 37) + Objects.hashCode(this.LIZIZ);
    }

    public final String toString() {
        return "[packageName=" + this.LIZ + ",libraryName=" + this.LIZIZ + "]";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C94017aaD) {
            C94017aaD c94017aaD = (C94017aaD) obj;
            if (Objects.equals(this.LIZ, c94017aaD.LIZ) && Objects.equals(this.LIZIZ, c94017aaD.LIZIZ)) {
                return true;
            }
        }
        return false;
    }
}
