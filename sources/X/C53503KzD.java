package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KzD, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53503KzD extends AbstractC53585L1h<EnumC53519KzT, C53526Kza> {
    public static final C53503KzD LIZ = new C53503KzD();

    @Override // X.InterfaceC53584L1g
    public final EnumC53663L4h LIZ() {
        return EnumC53663L4h.ACTIVE;
    }

    @Override // X.InterfaceC53584L1g
    public final AbstractC53588L1k LIZIZ(AUS aus) {
        return new C53482Kys((C53526Kza) aus);
    }

    @Override // X.InterfaceC53584L1g
    public final InterfaceC53587L1j LIZJ(AUS aus) {
        return new L67((C53526Kza) aus);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC53585L1h
    public final EnumC53519KzT LJ(L4O state) {
        o.LJIIIZ(state, "state");
        if (state instanceof EnumC53519KzT) {
            return state;
        }
        return null;
    }
}
