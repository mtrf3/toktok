package X;

/* renamed from: X.PeU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64958PeU<T> extends AbstractC64964Pea<T> {
    public final String LIZ;
    public final InterfaceC65016PfQ<T, String> LIZIZ;
    public final boolean LIZJ;

    @Override // X.AbstractC64964Pea
    public final void LIZ(C64970Peg c64970Peg, T t) {
        if (t == null) {
            return;
        }
        c64970Peg.LIZ(this.LIZ, this.LIZIZ.LIZ(t), this.LIZJ);
    }

    public C64958PeU(String str, InterfaceC65016PfQ<T, String> interfaceC65016PfQ, boolean z) {
        if (str != null) {
            this.LIZ = str;
            this.LIZIZ = interfaceC65016PfQ;
            this.LIZJ = z;
            return;
        }
        throw new NullPointerException("name == null");
    }
}