package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rr9, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C70839Rr9 {
    public final C70840RrA LIZ;
    public final int LIZIZ;

    public C70839Rr9() {
        this(3);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public /* synthetic */ C70839Rr9(int i) {
        this((i & 1) != 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C70839Rr9)) {
            return false;
        }
        C70839Rr9 c70839Rr9 = (C70839Rr9) obj;
        if (!(!o.LJ(this.LIZ, c70839Rr9.LIZ)) && this.LIZIZ == c70839Rr9.LIZIZ) {
            return true;
        }
        return false;
    }

    public C70839Rr9(boolean z, int i) {
        this.LIZIZ = i;
        this.LIZ = new C70840RrA(z);
    }
}
