package X;

/* renamed from: X.L2d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53607L2d extends F9E implements InterfaceC73131Sn1 {
    public final int LJLIL = 1;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL)};
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLILLIZIL(Object obj) {
        if (!(obj instanceof C53607L2d) || ((C53607L2d) obj).LJLIL != this.LJLIL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC73131Sn1
    public final boolean LLLLLLZ(Object obj) {
        return obj instanceof C53607L2d;
    }
}
