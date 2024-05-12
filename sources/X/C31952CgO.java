package X;

/* renamed from: X.CgO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31952CgO implements InterfaceC64592gB<byte[]> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;

    @Override // X.InterfaceC64592gB
    public final void accept(byte[] bArr) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("entries key = ");
        LIZ.append(this.LJLIL);
        LIZ.append(",value = ");
        LIZ.append(this.LJLILLLLZI);
        C0NB.LIZ(X1D.LIZIZ(LIZ));
    }

    public C31952CgO(String str, long j) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
    }
}
