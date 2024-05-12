package X;

import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import kotlin.jvm.internal.o;

/* renamed from: X.Gnc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42592Gnc {
    public ACLCommonShare LIZ;
    public boolean LIZIZ;

    public C42592Gnc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42592Gnc)) {
            return false;
        }
        C42592Gnc c42592Gnc = (C42592Gnc) obj;
        return o.LJ(this.LIZ, c42592Gnc.LIZ) && this.LIZIZ == c42592Gnc.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        ACLCommonShare aCLCommonShare = this.LIZ;
        int hashCode = (aCLCommonShare == null ? 0 : aCLCommonShare.hashCode()) * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final C42593Gnd LIZ() {
        return new C42593Gnd(this.LIZ, this.LIZIZ);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Builder(aclCommonShare=");
        LIZ.append(this.LIZ);
        LIZ.append(", toShare=");
        return C48339Iy7.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C42592Gnc(int i) {
        this.LIZ = null;
        this.LIZIZ = false;
    }
}
