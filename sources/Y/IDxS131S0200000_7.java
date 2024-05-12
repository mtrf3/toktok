package Y;

import X.C45440HsS;
import X.InterfaceC116954iR;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDxS131S0200000_7 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(IDxS131S0200000_7 iDxS131S0200000_7) {
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
                o.LJIIJ(th, "e");
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
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            default:
                return;
        }
    }

    public static final void onComplete$1(IDxS131S0200000_7 iDxS131S0200000_7) {
        ((C45440HsS) iDxS131S0200000_7.l0).LIZ();
    }

    public static final void onError$1(IDxS131S0200000_7 iDxS131S0200000_7, Throwable e) {
        o.LJIIJ(e, "e");
        ((C45440HsS) iDxS131S0200000_7.l0).LIZ();
    }

    public static final void onNext$0(IDxS131S0200000_7 iDxS131S0200000_7, Object obj) {
        ((InterfaceC88472Yns) iDxS131S0200000_7.l1).invoke(Long.valueOf(((Number) obj).longValue()));
    }

    public static final void onNext$1(IDxS131S0200000_7 iDxS131S0200000_7, Object obj) {
        ((InterfaceC88472Yns) iDxS131S0200000_7.l1).invoke(Long.valueOf(((Number) obj).longValue()));
    }

    public static final void onSubscribe$0(IDxS131S0200000_7 iDxS131S0200000_7, InterfaceC92693kP disposable) {
        o.LJIIJ(disposable, "disposable");
        ((C45440HsS) iDxS131S0200000_7.l0).LIZ = disposable;
    }

    public static final void onSubscribe$1(IDxS131S0200000_7 iDxS131S0200000_7, InterfaceC92693kP disposable) {
        o.LJIIJ(disposable, "disposable");
        ((C45440HsS) iDxS131S0200000_7.l0).LIZ = disposable;
    }

    public IDxS131S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
