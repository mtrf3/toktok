package Y;

import X.C147295qH;
import X.C164906da;
import X.C5S1;
import X.C76800UCe;
import X.EnumC61598OFm;
import X.InterfaceC61107NyZ;
import X.InterfaceC65784Pro;
import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDeS154S0200000_2 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZ$0(IDeS154S0200000_2 iDeS154S0200000_2) {
    }

    public static final void LIZ$1(IDeS154S0200000_2 iDeS154S0200000_2) {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
        switch (this.$t) {
            case 0:
                LIZ$0(this);
                return;
            case 1:
                LIZ$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c164906daArr);
                return;
            case 1:
                LIZIZ$1(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public static final void LIZIZ$0(IDeS154S0200000_2 iDeS154S0200000_2, C164906da... c164906daArr) {
        if (c164906daArr.length == 0 || c164906daArr[0].LIZIZ != EnumC61598OFm.GRANTED) {
            ((InterfaceC65784Pro) iDeS154S0200000_2.l0).invoke();
        } else {
            ((InterfaceC65784Pro) iDeS154S0200000_2.l1).invoke();
        }
    }

    public static final void LIZIZ$1(IDeS154S0200000_2 iDeS154S0200000_2, C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0 || !results[0].LIZ()) {
            Activity activity = ((C147295qH) iDeS154S0200000_2.l0).mActivity;
            if (activity != null) {
                C5S1 c5s1 = new C5S1(activity);
                c5s1.LIZJ(R.string.e2q);
                c5s1.LJ();
                return;
            }
            return;
        }
        ((InterfaceC65784Pro) iDeS154S0200000_2.l1).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDeS154S0200000_2(Object obj, C147295qH c147295qH, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.l0 = obj;
        this.l1 = c147295qH;
    }
}
