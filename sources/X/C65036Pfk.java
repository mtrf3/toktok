package X;

import java.util.Optional;

/* renamed from: X.Pfk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65036Pfk<T> implements InterfaceC65017PfR<PVM, Optional<T>> {
    public final InterfaceC65017PfR<PVM, T> LJLIL;

    public C65036Pfk(InterfaceC65017PfR<PVM, T> interfaceC65017PfR) {
        this.LJLIL = interfaceC65017PfR;
    }

    @Override // X.InterfaceC65017PfR
    public final Object LIZ(PVM pvm) {
        return Optional.ofNullable(this.LJLIL.LIZ(pvm));
    }
}
