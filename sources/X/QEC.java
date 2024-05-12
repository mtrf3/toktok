package X;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class QEC extends AbstractC66664QEi {
    public final /* synthetic */ QE9 LJLIL;

    @Override // X.AbstractC66664QEi
    public final long LIZ() {
        return this.LJLIL.LJLJJLL;
    }

    public QEC(QE9 qe9) {
        this.LJLIL = qe9;
    }

    @Override // X.AbstractC66664QEi
    public final void LIZJ(QXX qxx) {
        QE9 qe9 = this.LJLIL;
        if (qe9.LJLL) {
            qe9.LJLLI = true;
            qe9.LJLJL.rewind();
            qxx.LLLIZZ();
            return;
        }
        qxx.LLLILZLLLI(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    @Override // X.AbstractC66664QEi
    public final void LIZIZ(QXX qxx, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.LJLIL.LJLJL.remaining()) {
            byteBuffer.put(this.LJLIL.LJLJL);
            this.LJLIL.LJLJL.clear();
            qxx.LLLIL(false);
            QE9 qe9 = this.LJLIL;
            if (!qe9.LJLLI) {
                qe9.LJLJJL.LJLILLLLZI = false;
                return;
            }
            return;
        }
        int limit = this.LJLIL.LJLJL.limit();
        ByteBuffer byteBuffer2 = this.LJLIL.LJLJL;
        byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
        byteBuffer.put(this.LJLIL.LJLJL);
        this.LJLIL.LJLJL.limit(limit);
        qxx.LLLIL(false);
    }
}
