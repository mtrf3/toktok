package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.OutputStream;

/* renamed from: X.ODe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61538ODe extends OutputStream {
    public final OEF LJLIL;
    public final AbstractC61537ODd LJLILLLLZI;
    public final UpdatePackage LJLJI;
    public final long LJLJJI;
    public long LJLJJL;
    public ODI LJLJJLL;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final void LIZ(int i) {
        this.LJLJJL += i;
        if (this.LJLILLLLZI == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download progress, channel: ");
        LIZ.append(this.LJLJI.getChannel());
        LIZ.append(" total:");
        LIZ.append(this.LJLJJI);
        LIZ.append(" current:");
        LIZ.append(this.LJLJJL);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJII(this.LJLJI, this.LJLJJI, this.LJLJJL);
    }

    public final void LIZIZ(long j) {
        this.LJLJJL = j;
        this.LJLIL.position(j);
        if (this.LJLJJL == 0 || this.LJLILLLLZI == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("download progress with breakpoint, channel: ");
        LIZ.append(this.LJLJI.getChannel());
        LIZ.append(" total:");
        LIZ.append(this.LJLJJI);
        LIZ.append(" current:");
        LIZ.append(this.LJLJJL);
        OC6.LIZ("gecko-debug-tag", X1D.LIZIZ(LIZ));
        this.LJLILLLLZI.LJII(this.LJLJI, this.LJLJJI, this.LJLJJL);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LJLIL.write(i);
        LIZ(4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.LJLIL.write(bArr);
        LIZ(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LJLIL.LJJI(i, bArr, i2);
        LIZ(i2);
    }

    public C61538ODe(OEF oef, AbstractC61537ODd abstractC61537ODd, UpdatePackage updatePackage, long j, long j2) {
        this.LJLIL = oef;
        this.LJLILLLLZI = abstractC61537ODd;
        this.LJLJI = updatePackage;
        this.LJLJJI = j;
        this.LJLJJL = j2;
    }
}
