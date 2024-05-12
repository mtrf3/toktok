package X;

/* renamed from: X.PVi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64558PVi extends AbstractC64556PVg {
    public boolean LJLJJL;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLILLLLZI) {
            return;
        }
        if (!this.LJLJJL) {
            LIZ(null, false);
        }
        this.LJLILLLLZI = true;
    }

    public C64558PVi(C64560PVk c64560PVk) {
        super(c64560PVk);
    }

    @Override // X.AbstractC64556PVg, X.PUC
    public final long read(C64533PUj c64533PUj, long j) {
        if (j >= 0) {
            if (!this.LJLILLLLZI) {
                if (this.LJLJJL) {
                    return -1L;
                }
                long read = super.read(c64533PUj, j);
                if (read == -1) {
                    this.LJLJJL = true;
                    LIZ(null, true);
                    return -1L;
                }
                return read;
            }
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(C61845OOz.LIZ("byteCount < 0: ", j));
    }
}
