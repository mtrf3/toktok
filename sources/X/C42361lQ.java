package X;

/* renamed from: X.1lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C42361lQ extends C32631Pv {
    public long LIZIZ;
    public final C32631Pv LIZJ;

    @Override // X.C32631Pv
    public final void LIZ() {
        this.LIZJ.LIZ();
    }

    @Override // X.C32631Pv, X.InterfaceC10860bi
    public final void close() {
        this.LIZJ.close();
    }

    public C42361lQ(C32631Pv c32631Pv) {
        this.LIZJ = c32631Pv;
    }

    @Override // X.C32631Pv
    public final void LIZIZ(byte[] bArr, int i) {
        this.LIZJ.LIZIZ(bArr, i);
        this.LIZIZ += i;
    }
}
