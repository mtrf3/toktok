package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ib1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46907Ib1 implements InterfaceC46904Iay {
    public final String LIZ;
    public long LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46907Ib1)) {
            return false;
        }
        C46907Ib1 c46907Ib1 = (C46907Ib1) obj;
        return o.LJ(this.LIZ, c46907Ib1.LIZ) && this.LIZIZ == c46907Ib1.LIZIZ && this.LIZJ == c46907Ib1.LIZJ;
    }

    public final int hashCode() {
        return C16880lQ.LLJIJIL(this.LIZJ) + JBR.LIZJ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
    }

    @Override // X.InterfaceC46904Iay
    public final float LJ() {
        return C46910Ib4.LIZ(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SimpleCacheInfo(key=");
        LIZ.append(this.LIZ);
        LIZ.append(", fileSize=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cacheSize=");
        return C47135Ieh.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // X.InterfaceC46904Iay
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC46904Iay
    public final List<InterfaceC46904Iay> LIZJ() {
        return C61878OQg.INSTANCE;
    }

    @Override // X.InterfaceC46904Iay
    public final long LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC46904Iay
    public final String key() {
        return this.LIZ;
    }

    public C46907Ib1(String key, long j, long j2) {
        o.LJIIIZ(key, "key");
        this.LIZ = key;
        this.LIZIZ = j;
        this.LIZJ = j2;
    }
}
