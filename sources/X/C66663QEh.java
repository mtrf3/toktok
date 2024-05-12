package X;

import java.nio.ByteBuffer;

/* renamed from: X.QEh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66663QEh extends AbstractC66664QEi {
    public final AbstractC66664QEi LJLIL;

    @Override // X.AbstractC66664QEi
    public final long LIZ() {
        return this.LJLIL.LIZ();
    }

    @Override // X.AbstractC66664QEi, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public C66663QEh(AbstractC66664QEi abstractC66664QEi) {
        this.LJLIL = abstractC66664QEi;
    }

    @Override // X.AbstractC66664QEi
    public final void LIZJ(QXX qxx) {
        this.LJLIL.LIZJ(qxx);
    }

    @Override // X.AbstractC66664QEi
    public final void LIZIZ(QXX qxx, ByteBuffer byteBuffer) {
        this.LJLIL.LIZIZ(qxx, byteBuffer);
    }
}
