package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Mzt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58641Mzt extends AbstractC65781Prl implements InterfaceC88472Yns<M95, Integer> {
    public static final C58641Mzt LJLIL = new C58641Mzt();

    public C58641Mzt() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Integer invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(InterfaceC58799N5v.class);
        if (LIZ != null) {
            return Integer.valueOf(!((N54) ((InterfaceC41034G8o) LIZ).L9()).isMute() ? 1 : 0);
        }
        throw new C58623Mzb(InterfaceC58799N5v.class);
    }
}
