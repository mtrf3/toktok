package X;

/* renamed from: X.PYw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64650PYw<T> extends PZ1<T> {
    public final InterfaceC65017PfR<T, String> LIZ;
    public final boolean LIZIZ;

    public C64650PYw(InterfaceC65017PfR<T, String> interfaceC65017PfR, boolean z) {
        this.LIZ = interfaceC65017PfR;
        this.LIZIZ = z;
    }

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, T t) {
        if (t == null) {
            return;
        }
        c64638PYk.LIZIZ(this.LIZ.LIZ(t), null, this.LIZIZ);
    }
}
