package X;

/* renamed from: X.PYu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64648PYu<T> extends PZ1<T> {
    public final String LIZ;
    public final InterfaceC65017PfR<T, String> LIZIZ;

    public C64648PYu(String str, InterfaceC65017PfR<T, String> interfaceC65017PfR) {
        C65138PhO.LIZ(str, "name == null");
        this.LIZ = str;
        this.LIZIZ = interfaceC65017PfR;
    }

    @Override // X.PZ1
    public final void LIZ(C64638PYk c64638PYk, T t) {
        String LIZ;
        if (t == null || (LIZ = this.LIZIZ.LIZ(t)) == null) {
            return;
        }
        c64638PYk.LIZ(this.LIZ, LIZ);
    }
}
