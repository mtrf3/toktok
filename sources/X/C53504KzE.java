package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KzE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53504KzE extends AbstractC53585L1h<EnumC53520KzU, C53486Kyw> {
    @Override // X.InterfaceC53584L1g
    public final EnumC53663L4h LIZ() {
        return EnumC53663L4h.FOLLOW;
    }

    @Override // X.InterfaceC53584L1g
    public final AbstractC53588L1k LIZIZ(AUS aus) {
        return new C53484Kyu((C53486Kyw) aus);
    }

    @Override // X.InterfaceC53584L1g
    public final InterfaceC53587L1j LIZJ(AUS aus) {
        return new C53505KzF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC53585L1h
    public final EnumC53520KzU LJ(L4O state) {
        o.LJIIIZ(state, "state");
        if (state instanceof EnumC53520KzU) {
            return state;
        }
        return null;
    }
}
