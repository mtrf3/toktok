package X;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes12.dex */
public abstract class QEG extends OutputStream {
    public IOException LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;

    public abstract void LIZIZ();

    public abstract AbstractC66664QEi LIZJ();

    public abstract void LIZLLL();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.LJLILLLLZI = true;
    }

    public final void LIZ() {
        if (!this.LJLJI) {
            if (!this.LJLILLLLZI) {
            } else {
                throw new IOException("Stream has been closed.");
            }
        } else {
            IOException iOException = this.LJLIL;
            if (iOException == null) {
                throw new IOException("Writing after request completed.");
            }
            throw iOException;
        }
    }
}
