package X;

import Y.ARunnableS21S0300000_10;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NQ5 extends AbstractC73391SrD<Boolean> {
    public final /* synthetic */ NQ3 LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    public NQ5(NQ3 nq3) {
        this.LJLILLLLZI = nq3;
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        NQ3 nq3 = this.LJLILLLLZI;
        if (booleanValue) {
            z = true;
        } else {
            ARunnableS21S0300000_10 aRunnableS21S0300000_10 = nq3.LIZ;
            if (aRunnableS21S0300000_10 != null && nq3.LIZLLL) {
                nq3.LIZJ.remove(aRunnableS21S0300000_10);
                nq3.LIZJ.schedule(aRunnableS21S0300000_10, 100L, TimeUnit.MILLISECONDS);
            }
            z = false;
        }
        nq3.LIZLLL = z;
    }
}
