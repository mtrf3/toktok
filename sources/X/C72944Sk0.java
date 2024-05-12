package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Sk0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72944Sk0 {
    public final EnumC72939Sjv LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        return obj == this;
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
        LIZ.append("DialogPage(page=");
        LIZ.append(this.LIZ);
        LIZ.append(", isGoNetPage=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C72944Sk0(EnumC72939Sjv page, boolean z) {
        o.LJIIIZ(page, "page");
        this.LIZ = page;
        this.LIZIZ = z;
    }
}
