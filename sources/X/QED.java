package X;

import java.net.HttpRetryException;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class QED extends AbstractC66664QEi {
    public final /* synthetic */ QEA LJLIL;

    @Override // X.AbstractC66664QEi
    public final long LIZ() {
        return -1L;
    }

    public QED(QEA qea) {
        this.LJLIL = qea;
    }

    @Override // X.AbstractC66664QEi
    public final void LIZJ(QXX qxx) {
        qxx.LLLILZLLLI(new HttpRetryException("Cannot retry streamed Http body", -1));
    }

    @Override // X.AbstractC66664QEi
    public final void LIZIZ(QXX qxx, ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= this.LJLIL.LJLJJLL.remaining()) {
            byteBuffer.put(this.LJLIL.LJLJJLL);
            this.LJLIL.LJLJJLL.clear();
            qxx.LLLIL(this.LJLIL.LJLJLJ);
            QEA qea = this.LJLIL;
            if (!qea.LJLJLJ) {
                qea.LJLJJL.LJLILLLLZI = false;
                return;
            }
            return;
        }
        int limit = this.LJLIL.LJLJJLL.limit();
        ByteBuffer byteBuffer2 = this.LJLIL.LJLJJLL;
        byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
        byteBuffer.put(this.LJLIL.LJLJJLL);
        this.LJLIL.LJLJJLL.limit(limit);
        qxx.LLLIL(false);
    }
}
