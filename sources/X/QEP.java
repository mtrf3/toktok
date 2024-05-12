package X;

import com.ttnet.org.chromium.net.impl.CronetUrlRequest;

/* loaded from: classes12.dex */
public final class QEP implements Runnable {
    public final /* synthetic */ C61460OAe LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ CronetUrlRequest LJLJJI;

    public final void LIZ() {
        this.LJLJJI.LJIJJ();
        synchronized (this.LJLJJI.LJFF) {
            if (this.LJLJJI.LJJIFFI()) {
                return;
            }
            CronetUrlRequest cronetUrlRequest = this.LJLJJI;
            cronetUrlRequest.LIZLLL = true;
            try {
                cronetUrlRequest.LJIIIZ.LJ(cronetUrlRequest, this.LJLIL, this.LJLILLLLZI, this.LJLJI);
            } catch (Exception e) {
                this.LJLJJI.LJJIII(e);
            }
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

    public QEP(CronetUrlRequest cronetUrlRequest, C61460OAe c61460OAe, String str, String str2) {
        this.LJLJJI = cronetUrlRequest;
        this.LJLIL = c61460OAe;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
