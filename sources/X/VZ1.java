package X;

/* loaded from: classes15.dex */
public final class VZ1 implements InterfaceC79767VSh<Integer> {
    public final int LIZ;
    public final int LIZIZ;

    @Override // X.InterfaceC79767VSh
    public final int LIZ() {
        return (this.LIZIZ - this.LIZ) + 1;
    }

    @Override // X.InterfaceC79767VSh
    public final Integer getItem(int i) {
        if (i >= 0 && i < LIZ()) {
            return Integer.valueOf(this.LIZ + i);
        }
        return 0;
    }

    public VZ1(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
