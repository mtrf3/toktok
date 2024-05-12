package djb;

import X.C1DH;
import X.C34B;
import X.C3PI;
import X.C69732oT;
import X.C98453th;
import X.InterfaceC48698J9i;
import X.MB6;
import X.MBA;
import X.X1D;
import Y.ARunnableS20S0200000_1;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public class IDaS66S0100000_1 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                handleException$0(this, mba, th);
                return;
            case 1:
                handleException$1(this, mba, th);
                return;
            case 2:
                handleException$2(this, mba, th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS66S0100000_1(InterfaceC48698J9i interfaceC48698J9i, Object obj, int i) {
        super(interfaceC48698J9i);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void handleException$0(IDaS66S0100000_1 iDaS66S0100000_1, MBA mba, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadSuccess failed ");
        LIZ.append(((SharePanelViewModel) iDaS66S0100000_1.l0).LJZ);
        LIZ.append(" :");
        C34B.LIZLLL("SharePanelViewModel", X1D.LIZIZ(LIZ), th);
        C1DH.LJJIJIIJI(new ARunnableS20S0200000_1((SharePanelViewModel) iDaS66S0100000_1.l0, th, 0));
    }

    public static final void handleException$1(IDaS66S0100000_1 iDaS66S0100000_1, MBA mba, Throwable th) {
        ((C98453th) ((C3PI) iDaS66S0100000_1.l0).LJ.getValue()).LIZLLL(th);
    }

    public static final void handleException$2(IDaS66S0100000_1 iDaS66S0100000_1, MBA mba, Throwable th) {
        Iterator it = ((List) iDaS66S0100000_1.l0).iterator();
        while (it.hasNext()) {
            C69732oT.LJI((String) it.next());
        }
    }
}
