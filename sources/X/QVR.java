package X;

import Y.ARunnableS30S0200000_11;
import com.bytedance.sync.v2.compensate.CompensatorImpl;
import java.util.concurrent.ExecutorService;

/* loaded from: classes12.dex */
public final class QVR implements QW4 {
    public final /* synthetic */ QVN LJLIL;
    public final /* synthetic */ CompensatorImpl LJLILLLLZI;

    @Override // X.QW4
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.QW4
    public final void LJJL(QW3 qw3) {
        CompensatorImpl compensatorImpl = this.LJLILLLLZI;
        qw3.LIZLLL = new QVS(compensatorImpl.LJLJL, compensatorImpl.LJLJJLL);
        ((ExecutorService) QW7.LIZ.LIZLLL(new Object[0])).submit(new ARunnableS30S0200000_11(this, qw3, 10));
    }

    public QVR(CompensatorImpl compensatorImpl, QVN qvn) {
        this.LJLILLLLZI = compensatorImpl;
        this.LJLIL = qvn;
    }
}
