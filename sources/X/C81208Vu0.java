package X;

/* renamed from: X.Vu0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81208Vu0 implements InterfaceC81206Vty {
    public boolean LIZ;

    @Override // X.InterfaceC81206Vty
    public final void block() {
        this.LIZ = true;
    }

    @Override // X.InterfaceC81206Vty
    public final void reset() {
        this.LIZ = false;
    }

    @Override // X.InterfaceC81206Vty
    public final void resume() {
        this.LIZ = false;
    }

    @Override // X.InterfaceC81206Vty
    public final boolean LIZ() {
        return this.LIZ;
    }
}
