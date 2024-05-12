package Y;

import X.C76800UCe;
import X.InterfaceC116954iR;
import X.InterfaceC65784Pro;
import X.InterfaceC77407UZn;
import X.InterfaceC92693kP;
import X.UZN;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class IDxS311S0100000_13 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$1(IDxS311S0100000_13 iDxS311S0100000_13) {
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
                onError$0(this, th);
                return;
            case 1:
                o.LJIIIZ(th, "e");
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
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onComplete$0(IDxS311S0100000_13 iDxS311S0100000_13) {
        InterfaceC77407UZn interfaceC77407UZn = (InterfaceC77407UZn) iDxS311S0100000_13.l0;
        if (interfaceC77407UZn != null) {
            interfaceC77407UZn.onSuccess();
        }
    }

    public IDxS311S0100000_13(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$0(IDxS311S0100000_13 iDxS311S0100000_13, Throwable e) {
        o.LJIIIZ(e, "e");
        InterfaceC77407UZn interfaceC77407UZn = (InterfaceC77407UZn) iDxS311S0100000_13.l0;
        if (interfaceC77407UZn != null) {
            interfaceC77407UZn.onFail();
        }
    }

    public static final void onNext$0(IDxS311S0100000_13 iDxS311S0100000_13, Object obj) {
        if (((Number) obj).intValue() > 0) {
            iDxS311S0100000_13.onComplete();
        } else {
            iDxS311S0100000_13.onError(new Throwable("UNKNOWN EXCEPTIION"));
        }
    }

    public static final void onNext$1(IDxS311S0100000_13 iDxS311S0100000_13, Object t) {
        o.LJIIIZ(t, "t");
        UZN uzn = (UZN) iDxS311S0100000_13.l0;
        uzn.LJLLJ = true;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = uzn.LJLJJLL.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
