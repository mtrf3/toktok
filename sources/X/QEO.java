package X;

import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class QEO implements Runnable {
    public ByteBuffer LJLIL;
    public final /* synthetic */ CronetUrlRequest LJLILLLLZI;

    public final void LIZ() {
        this.LJLILLLLZI.LJIJJ();
        ByteBuffer byteBuffer = this.LJLIL;
        this.LJLIL = null;
        try {
            synchronized (this.LJLILLLLZI.LJFF) {
                if (this.LJLILLLLZI.LJJIFFI()) {
                    return;
                }
                CronetUrlRequest cronetUrlRequest = this.LJLILLLLZI;
                cronetUrlRequest.LJ = true;
                cronetUrlRequest.LJIIIZ.LIZLLL(cronetUrlRequest, cronetUrlRequest.LJJII, byteBuffer);
            }
        } catch (Exception e) {
            this.LJLILLLLZI.LJJIII(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public QEO(CronetUrlRequest cronetUrlRequest) {
        this.LJLILLLLZI = cronetUrlRequest;
    }
}
