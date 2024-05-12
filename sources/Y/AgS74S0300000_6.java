package Y;

import X.C10I;
import X.C10K;
import X.C34K;
import X.C68322mC;
import X.C72242sW;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.KFN;
import X.KFO;
import X.KFP;
import X.QDX;
import X.X1D;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.search.result.vertical.assem.ShopVerticalAssem;
import com.ss.android.ugc.aweme.result.common.core.ui.fragment.DynamicSearchShopFragment;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class AgS74S0300000_6 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS74S0300000_6 agS74S0300000_6, C10K c10k) {
        C34K c34k = new C34K();
        c34k.element = true;
        C34K c34k2 = new C34K();
        QDX qdx = (QDX) c10k.LJIIJJI();
        if (qdx == null) {
            ((ShopVerticalAssem) agS74S0300000_6.l0).v3(null, new Throwable("Response null error"));
        } else {
            C68322mC c68322mC = new C68322mC();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C76732zl c76732zl = new C76732zl();
            C72242sW c72242sW = new C72242sW();
            c72242sW.element = SystemClock.elapsedRealtime();
            qdx.LIZIZ(new KFP((ShopVerticalAssem) agS74S0300000_6.l0, c34k, (C72242sW) agS74S0300000_6.l1, c68322mC, linkedHashMap, c76732zl, c34k2, (KFN) agS74S0300000_6.l2, c72242sW));
        }
        return c10k;
    }

    public static final Object then$1(AgS74S0300000_6 agS74S0300000_6, C10K c10k) {
        C34K c34k = new C34K();
        c34k.element = true;
        C34K c34k2 = new C34K();
        QDX qdx = (QDX) c10k.LJIIJJI();
        if (qdx == null) {
            ((DynamicSearchShopFragment) agS74S0300000_6.l0).fm(null, new Throwable("Response null error"));
        } else {
            C68322mC c68322mC = new C68322mC();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C76732zl c76732zl = new C76732zl();
            C72242sW c72242sW = new C72242sW();
            c72242sW.element = SystemClock.elapsedRealtime();
            qdx.LIZIZ(new KFO((DynamicSearchShopFragment) agS74S0300000_6.l0, c34k, (C72242sW) agS74S0300000_6.l1, c68322mC, linkedHashMap, c76732zl, c34k2, (KFN) agS74S0300000_6.l2, c72242sW));
        }
        return c10k;
    }

    public static final Object then$2(AgS74S0300000_6 agS74S0300000_6, C10K task) {
        String str;
        o.LJIIIZ(task, "task");
        if (task.LJIILJJIL() || task.LJIIL()) {
            InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) agS74S0300000_6.l0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("task has error: ");
            Exception LJIIJ = task.LJIIJ();
            if (LJIIJ == null || (str = LJIIJ.getLocalizedMessage()) == null) {
                str = "unknown error";
            }
            LIZ.append(str);
            interfaceC88471Ynr.invoke(3, X1D.LIZIZ(LIZ));
        } else if (!((C34K) agS74S0300000_6.l1).element) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) agS74S0300000_6.l2;
            Object LJIIJJI = task.LJIIJJI();
            o.LJIIIIZZ(LJIIJJI, "task.result");
            interfaceC88472Yns.invoke(LJIIJJI);
        }
        return C76800UCe.LIZ;
    }

    public AgS74S0300000_6(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
