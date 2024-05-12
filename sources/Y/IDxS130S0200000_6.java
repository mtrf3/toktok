package Y;

import X.C16880lQ;
import X.C36175EHr;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.O3U;
import android.content.Context;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.ss.android.ugc.aweme.requesttask.idle.GeckoLocalRequest;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDxS130S0200000_6 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onComplete$0(IDxS130S0200000_6 iDxS130S0200000_6) {
    }

    public static final void onComplete$1(IDxS130S0200000_6 iDxS130S0200000_6) {
    }

    public static final void onComplete$2(IDxS130S0200000_6 iDxS130S0200000_6) {
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
            case 2:
                onComplete$2(this);
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
                o.LJIIIZ(th, "e");
                return;
            case 2:
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
            case 2:
                onNext$2(this, obj);
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
            case 2:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public static final void onNext$0(IDxS130S0200000_6 iDxS130S0200000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GeckoCheckInRequest) iDxS130S0200000_6.l0).LIZLLL((Context) iDxS130S0200000_6.l1);
        }
    }

    public static final void onNext$1(IDxS130S0200000_6 iDxS130S0200000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            ((GeckoHighPriorityCheckInRequest) iDxS130S0200000_6.l0).LIZLLL((Context) iDxS130S0200000_6.l1);
        }
    }

    public static final void onNext$2(IDxS130S0200000_6 iDxS130S0200000_6, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            GeckoLocalRequest geckoLocalRequest = (GeckoLocalRequest) iDxS130S0200000_6.l0;
            Context context = (Context) iDxS130S0200000_6.l1;
            geckoLocalRequest.getClass();
            o.LJIIIZ(context, "context");
            try {
                O3U.LIZIZ();
            } catch (Exception e) {
                C36175EHr.LIZ(e);
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public IDxS130S0200000_6(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
