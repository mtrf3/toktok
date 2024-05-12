package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wgc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82926Wgc extends AbstractC82929Wgf {
    public final String LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82926Wgc)) {
            return false;
        }
        C82926Wgc c82926Wgc = (C82926Wgc) obj;
        return o.LJ(this.LIZ, c82926Wgc.LIZ) && this.LIZIZ == c82926Wgc.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OpenNativeLink(link=");
        LIZ.append(this.LIZ);
        LIZ.append(", webViewTitle=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C82926Wgc(String link, boolean z) {
        o.LJIIIZ(link, "link");
        this.LIZ = link;
        this.LIZIZ = z;
    }
}
