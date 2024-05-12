package X;

import Y.ACallableS3S2000000_1;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CNB extends AbstractC60800Ntc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = true;

    public CNB(String str) {
        this.LJLIL = str;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        String url = this.LJLIL;
        o.LJIIIZ(url, "url");
        ACallableS3S2000000_1 aCallableS3S2000000_1 = new ACallableS3S2000000_1("success", url, 2);
        ExecutorService executorService = C10K.LJI;
        C10K.LIZIZ(aCallableS3S2000000_1, executorService, null);
        String enterFrom = C61601OFp.LIZJ;
        o.LJIIIZ(enterFrom, "enterFrom");
        C10K.LIZIZ(new ACallableS3S2000000_1("open", enterFrom, 1), executorService, null);
        if (this.LJLILLLLZI) {
            C61601OFp.LIZIZ = true;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJ(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJ(view, url);
        C10K.LIZIZ(new ACallableS3S2000000_1("failed", url, 2), C10K.LJI, null);
    }
}
