package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Gbw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41868Gbw extends AbstractC41869Gbx {
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZ);
        LIZ.append(" Msg-AfterCancel info:");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41868Gbw(C41875Gc3 happenTime, Object sourceTag, Object obj) {
        super(sourceTag, obj, happenTime);
        o.LJIIIZ(sourceTag, "sourceTag");
        o.LJIIIZ(happenTime, "happenTime");
    }
}
