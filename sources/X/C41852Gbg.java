package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gbg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41852Gbg extends AbstractC41869Gbx {
    public final Object LIZLLL;
    public final boolean LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" Success result:");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41852Gbg(Object sourceTag, Object obj, boolean z, C41875Gc3 happenTime) {
        super(sourceTag, obj, happenTime);
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZLLL = obj;
        this.LJ = z;
    }
}
