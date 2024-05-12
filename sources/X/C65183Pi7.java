package X;

import java.io.InputStream;

/* renamed from: X.Pi7, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65183Pi7 extends InputStream {
    public int LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ C65182Pi6 LJLJI;

    @Override // java.io.InputStream
    public final int read() {
        if (this.LJLILLLLZI == 0) {
            return -1;
        }
        this.LJLJI.LJLIL.seek(this.LJLIL);
        int read = this.LJLJI.LJLIL.read();
        this.LJLIL = this.LJLJI.LJIIJ(this.LJLIL + 1);
        this.LJLILLLLZI--;
        return read;
    }

    public C65183Pi7(C65182Pi6 c65182Pi6, C65184Pi8 c65184Pi8) {
        this.LJLJI = c65182Pi6;
        this.LJLIL = c65182Pi6.LJIIJ(c65184Pi8.LIZ + 4);
        this.LJLILLLLZI = c65184Pi8.LIZIZ;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.LJLILLLLZI;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    C65182Pi6 c65182Pi6 = this.LJLJI;
                    int LJIIJ = c65182Pi6.LJIIJ(this.LJLIL);
                    int i4 = LJIIJ + i2;
                    int i5 = c65182Pi6.LJLILLLLZI;
                    if (i4 <= i5) {
                        c65182Pi6.LJLIL.seek(LJIIJ);
                        c65182Pi6.LJLIL.readFully(bArr, i, i2);
                    } else {
                        int i6 = i5 - LJIIJ;
                        c65182Pi6.LJLIL.seek(LJIIJ);
                        c65182Pi6.LJLIL.readFully(bArr, i, i6);
                        c65182Pi6.LJLIL.seek(16L);
                        c65182Pi6.LJLIL.readFully(bArr, i + i6, i2 - i6);
                    }
                    this.LJLIL = this.LJLJI.LJIIJ(this.LJLIL + i2);
                    this.LJLILLLLZI -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new NullPointerException("buffer");
    }
}
