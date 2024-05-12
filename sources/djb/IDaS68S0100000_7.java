package djb;

import X.C162486Zg;
import X.C36747EbX;
import X.C41819Gb9;
import X.C67996QmO;
import X.C72512sx;
import X.H2Z;
import X.H4P;
import X.H78;
import X.InterfaceC48698J9i;
import X.InterfaceC88472Yns;
import X.MB6;
import X.MBA;
import X.X1D;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public class IDaS68S0100000_7 extends MB6 implements CoroutineExceptionHandler {
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
    public IDaS68S0100000_7(InterfaceC48698J9i interfaceC48698J9i, Object obj, int i) {
        super(interfaceC48698J9i);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void handleException$0(IDaS68S0100000_7 iDaS68S0100000_7, MBA mba, Throwable th) {
        int i;
        if (th instanceof C162486Zg) {
            i = 300000;
        } else {
            i = 300001;
        }
        C67996QmO c67996QmO = ((H2Z) iDaS68S0100000_7.l0).LJI;
        if (c67996QmO != null) {
            C41819Gb9 c41819Gb9 = new C41819Gb9(th.getMessage(), th);
            c41819Gb9.setErrorCode(i);
            c67996QmO.LIZLLL(i, c41819Gb9);
            return;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    public static final void handleException$1(IDaS68S0100000_7 iDaS68S0100000_7, MBA mba, Throwable th) {
        int i;
        C72512sx c72512sx;
        if ((th instanceof C72512sx) && (c72512sx = (C72512sx) th) != null) {
            i = c72512sx.getErrorCode();
        } else {
            i = 10080;
        }
        WaterMarkListener waterMarkListener = ((H4P) iDaS68S0100000_7.l0).LJ.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onError(i);
        }
        H4P h4p = (H4P) iDaS68S0100000_7.l0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed to add effect watermark, reason: ");
        LIZ.append(C36747EbX.LIZIZ(th));
        String LIZIZ = X1D.LIZIZ(LIZ);
        h4p.getClass();
        H4P.LJI(LIZIZ);
    }

    public static final void handleException$2(IDaS68S0100000_7 iDaS68S0100000_7, MBA mba, Throwable th) {
        H78.LIZLLL("WatermarkResourceLoader", th);
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDaS68S0100000_7.l0;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(th);
        }
    }
}
