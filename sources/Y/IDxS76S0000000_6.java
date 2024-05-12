package Y;

import X.C16880lQ;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.RunnableC36789EcD;
import X.UTU;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDxS76S0000000_6 implements InterfaceC116954iR {
    public final int $t;

    public static final void onComplete$0(IDxS76S0000000_6 iDxS76S0000000_6) {
    }

    public static final void onComplete$1(IDxS76S0000000_6 iDxS76S0000000_6) {
    }

    public static final void onError$1(IDxS76S0000000_6 iDxS76S0000000_6, Throwable th) {
    }

    public static final void onSubscribe$1(IDxS76S0000000_6 iDxS76S0000000_6, InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                onError$1(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public IDxS76S0000000_6(int i) {
        this.$t = i;
    }

    public static final void onNext$0(IDxS76S0000000_6 iDxS76S0000000_6, Object obj) {
        UTU.LIZIZ = ((Number) obj).longValue();
        UTU.LIZLLL = true;
        UTU.LJ = true;
        new Handler(C16880lQ.LLJJJJ()).postDelayed(RunnableC36789EcD.LJLIL, UTU.LIZIZ);
    }

    public static final /* bridge */ /* synthetic */ void onNext$1(IDxS76S0000000_6 iDxS76S0000000_6, Object obj) {
    }
}
