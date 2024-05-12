package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mzr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58639Mzr extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Long> {
    public static final C58639Mzr LJLIL = new C58639Mzr();

    public C58639Mzr() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Long invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(InterfaceC58799N5v.class);
        if (LIZ != null) {
            return Long.valueOf(((InterfaceC58799N5v) LIZ).getVideoLength());
        }
        throw new C58623Mzb(InterfaceC58799N5v.class);
    }
}
