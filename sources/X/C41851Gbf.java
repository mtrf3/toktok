package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gbf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41851Gbf extends AbstractC41869Gbx {
    public final C42360Gjs LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" Failed exception:");
        LIZ.append(this.LIZLLL);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41851Gbf(Object sourceTag, C42360Gjs exception, C41875Gc3 happenTime) {
        super(sourceTag, exception, happenTime);
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(exception, "exception");
        o.LJIIIZ(happenTime, "happenTime");
        this.LIZLLL = exception;
    }
}
