package X;

import kotlin.jvm.internal.o;

/* renamed from: X.N2y, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58724N2y extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final C58724N2y LJLIL = new C58724N2y();

    public C58724N2y() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 m952 = m95;
        o.LJIIIZ(m952, "$this$int");
        Object LIZ = m952.LIZ(NGR.class);
        if (LIZ != null) {
            return Integer.valueOf(!((NGR) LIZ).LIZIZ ? 1 : 0);
        }
        throw new C58623Mzb(NGR.class);
    }
}
