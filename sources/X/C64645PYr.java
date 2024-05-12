package X;

/* renamed from: X.PYr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64645PYr<T> extends PZ1<T> {
    public final String LIZ;
    public final InterfaceC65017PfR<T, String> LIZIZ;
    public final boolean LIZJ;

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, T t) {
        String LIZ;
        if (t == null || (LIZ = this.LIZIZ.LIZ(t)) == null) {
            return;
        }
        String str = this.LIZ;
        if (this.LIZJ) {
            c64638PYk.LJIIIZ.LIZIZ(str, LIZ);
        } else {
            c64638PYk.LJIIIZ.LIZ(str, LIZ);
        }
    }

    public C64645PYr(String str, InterfaceC65017PfR<T, String> interfaceC65017PfR, boolean z) {
        C65138PhO.LIZ(str, "name == null");
        this.LIZ = str;
        this.LIZIZ = interfaceC65017PfR;
        this.LIZJ = z;
    }
}
