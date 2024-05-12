package Y;

import X.C25806AAw;
import X.C25907AEt;
import X.InterfaceC116954iR;
import X.InterfaceC25805AAv;
import X.InterfaceC25906AEs;
import X.InterfaceC92693kP;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class IDxS25S0300000_4 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public static final void onComplete$0(IDxS25S0300000_4 iDxS25S0300000_4) {
    }

    public static final void onComplete$1(IDxS25S0300000_4 iDxS25S0300000_4) {
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
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onError$0(IDxS25S0300000_4 iDxS25S0300000_4, Throwable e) {
        o.LJIIIZ(e, "e");
        ((C25806AAw) iDxS25S0300000_4.l0).LIZ.LIZ();
    }

    public static final void onError$1(IDxS25S0300000_4 iDxS25S0300000_4, Throwable e) {
        o.LJIIIZ(e, "e");
        InterfaceC25906AEs interfaceC25906AEs = ((C25907AEt) iDxS25S0300000_4.l0).LIZ;
        if (interfaceC25906AEs != null) {
            interfaceC25906AEs.pb(e);
        }
    }

    public static final void onNext$0(IDxS25S0300000_4 iDxS25S0300000_4, Object obj) {
        InterfaceC25805AAv interfaceC25805AAv;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        if (response.status_code == 0 && (interfaceC25805AAv = ((C25806AAw) iDxS25S0300000_4.l0).LIZ) != null) {
            interfaceC25805AAv.LIZIZ((String[]) iDxS25S0300000_4.l1, (String[]) iDxS25S0300000_4.l2);
        }
    }

    public static final void onNext$1(IDxS25S0300000_4 iDxS25S0300000_4, Object obj) {
        InterfaceC25906AEs interfaceC25906AEs;
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        if (response.status_code == 0 && (interfaceC25906AEs = ((C25907AEt) iDxS25S0300000_4.l0).LIZ) != null) {
            interfaceC25906AEs.Wf((String[]) iDxS25S0300000_4.l1, (String[]) iDxS25S0300000_4.l2);
        }
    }

    public IDxS25S0300000_4(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
