package X;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* loaded from: classes12.dex */
public final class PVN extends Reader {
    public final PW3 LJLIL;
    public final Charset LJLILLLLZI;
    public boolean LJLJI;
    public Reader LJLJJI;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLJI = true;
        Reader reader = this.LJLJJI;
        if (reader != null) {
            reader.close();
        } else {
            this.LJLIL.close();
        }
    }

    public PVN(PW3 pw3, Charset charset) {
        this.LJLIL = pw3;
        this.LJLILLLLZI = charset;
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) {
        if (!this.LJLJI) {
            Reader reader = this.LJLJJI;
            if (reader == null) {
                reader = new InputStreamReader(this.LJLIL.K(), PVA.LIZIZ(this.LJLIL, this.LJLILLLLZI));
                this.LJLJJI = reader;
            }
            return reader.read(cArr, i, i2);
        }
        throw new IOException("Stream closed");
    }
}
