package X;

/* renamed from: X.PWs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64594PWs extends PXP {
    public final /* synthetic */ C64583PWh LJLJJI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PW9 pw9;
        C64583PWh c64583PWh = this.LJLJJI;
        synchronized (c64583PWh.LIZLLL) {
            pw9 = c64583PWh.LJIILJJIL;
        }
        c64583PWh.LJIIIIZZ(true, pw9, -1L, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64594PWs(PW3 pw3, PVU pvu, C64583PWh c64583PWh) {
        super(pw3, pvu);
        this.LJLJJI = c64583PWh;
    }
}
