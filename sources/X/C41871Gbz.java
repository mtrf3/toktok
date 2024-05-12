package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gbz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41871Gbz extends AbstractC41872Gc0 {
    public final Object LIZJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" Custom info:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41871Gbz(C41875Gc3 happenTime, Object sourceTag, Object info) {
        super(sourceTag, happenTime);
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(info, "info");
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZJ = info;
    }
}
