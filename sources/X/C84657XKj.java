package X;

import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKj, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84657XKj<T> extends JobSupport implements InterfaceC43919HLn<T>, C3CD<T> {
    @Override // X.InterfaceC68342mE
    public final T LIZJ() {
        return (T) LJJJJL();
    }

    public C84657XKj(InterfaceC79150V4o interfaceC79150V4o) {
        super(true);
        LJJJZ(interfaceC79150V4o);
    }

    @Override // X.InterfaceC43919HLn
    public final boolean LJ(T t) {
        return LJJLI(t);
    }

    @Override // X.InterfaceC68342mE
    public final Object LJI(InterfaceC67352kd<? super T> interfaceC67352kd) {
        return LJJIJ(interfaceC67352kd);
    }

    @Override // X.InterfaceC43919HLn
    public final boolean LJJ(Throwable th) {
        return LJJLI(new CompletedExceptionally(th, false, 2, null));
    }

    @Override // X.C3CD
    public final void LJJI(XKG xkg, C3C9 c3c9) {
        LJJLIIIJLLLLLLLZ(xkg, c3c9);
    }
}
