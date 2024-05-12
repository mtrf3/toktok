package Y;

import X.C164906da;
import X.C44009HOz;
import X.C44498HdG;
import X.C5S1;
import X.EnumC61598OFm;
import X.HP0;
import X.InterfaceC44004HOu;
import X.InterfaceC61107NyZ;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import android.app.Activity;
import com.ss.android.ugc.aweme.share.ShareDependService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDeS155S0200000_7 implements InterfaceC61107NyZ {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void LIZ$0(IDeS155S0200000_7 iDeS155S0200000_7) {
    }

    public static final void LIZ$1(IDeS155S0200000_7 iDeS155S0200000_7) {
    }

    public static final void LIZ$2(IDeS155S0200000_7 iDeS155S0200000_7) {
    }

    public static final void LIZ$3(IDeS155S0200000_7 iDeS155S0200000_7) {
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
            case 2:
                LIZ$2(this);
                return;
            case 3:
                LIZ$3(this);
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
            case 2:
                LIZIZ$2(this, c164906daArr);
                return;
            case 3:
                LIZIZ$3(this, c164906daArr);
                return;
            default:
                return;
        }
    }

    public static final void LIZIZ$0(IDeS155S0200000_7 iDeS155S0200000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        if (results.length == 0) {
            return;
        }
        if (results[0].LIZIZ == EnumC61598OFm.GRANTED) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDeS155S0200000_7.l0;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
                return;
            }
            return;
        }
        C5S1 c5s1 = new C5S1((Activity) iDeS155S0200000_7.l1);
        c5s1.LIZLLL(((Activity) iDeS155S0200000_7.l1).getString(R.string.it0));
        c5s1.LJ();
    }

    public static final void LIZIZ$1(IDeS155S0200000_7 iDeS155S0200000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            if (c164906da.LIZIZ != EnumC61598OFm.GRANTED) {
                ShareDependService.LIZ.getClass();
                C44498HdG.LIZ().LJFF((Activity) iDeS155S0200000_7.l1);
                return;
            }
        }
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDeS155S0200000_7.l0;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    public static final void LIZIZ$2(IDeS155S0200000_7 iDeS155S0200000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            int i = HP0.LIZ[c164906da.LIZIZ.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ShareDependService.LIZ.getClass();
                    C44498HdG.LIZ().LJFF((Activity) iDeS155S0200000_7.l1);
                }
            } else {
                InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDeS155S0200000_7.l0;
                if (interfaceC88472Yns != null) {
                    interfaceC88472Yns.invoke(Boolean.TRUE);
                }
            }
        }
    }

    public static final void LIZIZ$3(IDeS155S0200000_7 iDeS155S0200000_7, C164906da... results) {
        o.LJIIIZ(results, "results");
        for (C164906da c164906da : results) {
            int i = C44009HOz.LIZ[c164906da.LIZIZ.ordinal()];
            if (i != 1) {
                if (i == 2 || i == 3) {
                    ((InterfaceC44004HOu) iDeS155S0200000_7.l1).onFailed();
                }
            } else {
                InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) iDeS155S0200000_7.l0;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
        }
    }

    public IDeS155S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
