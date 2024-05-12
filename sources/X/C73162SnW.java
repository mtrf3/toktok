package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SnW, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73162SnW<S> implements InterfaceC73163SnX<S> {
    public final InterfaceC73163SnX<S> LIZ;

    @Override // X.InterfaceC73163SnX
    public final AbstractC73672Svk<S> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // X.InterfaceC73163SnX
    public final S getState() {
        return this.LIZ.getState();
    }

    public C73162SnW(InterfaceC73163SnX<S> realStore) {
        o.LJIIJ(realStore, "realStore");
        this.LIZ = realStore;
    }

    @Override // X.InterfaceC73163SnX
    public final void LIZJ(InterfaceC88472Yns<? super S, ? extends S> stateReducer) {
        o.LJIIJ(stateReducer, "stateReducer");
        this.LIZ.LIZJ(stateReducer);
    }

    @Override // X.InterfaceC73163SnX
    public final void LIZLLL(InterfaceC88472Yns<? super S, ? extends S> stateReducer) {
        o.LJIIJ(stateReducer, "stateReducer");
        this.LIZ.LIZLLL(stateReducer);
    }

    @Override // X.InterfaceC73163SnX
    public final void LJ(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIJ(block, "block");
        this.LIZ.LJ(block);
    }
}
