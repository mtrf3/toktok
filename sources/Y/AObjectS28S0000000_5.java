package Y;

import X.B4U;
import X.C30731C4h;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.ies.foundation.base.BaseViewModel;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class AObjectS28S0000000_5 implements InterfaceC88472Yns {
    public final int $t;

    public static final Object invoke$1(AObjectS28S0000000_5 aObjectS28S0000000_5, Object obj) {
        return null;
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public AObjectS28S0000000_5(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS28S0000000_5 aObjectS28S0000000_5, Object obj) {
        Map params = (Map) obj;
        o.LJIIIZ(params, "params");
        C30731C4h.LJIIZILJ = (String) params.get("cpu_cores");
        C30731C4h.LJIJ = (String) params.get("cpu_rate");
        C30731C4h.LJIJI = (String) params.get("cpu_speed");
        C30731C4h.LJIJJ = (String) params.get("single_cores_cpu_speed");
        C30731C4h.LJIJJLI = (String) params.get("app_max_memory");
        C30731C4h.LJIL = (String) params.get("memory_app_allocate");
        C30731C4h.LJJ = (String) params.get("memory_usage_rate_android");
        C30731C4h.LJJI = (String) params.get("pss_app_usage");
        LivePerformanceManager LIZ = B4U.LIZ();
        LIZ.getClass();
        ((CopyOnWriteArrayList) LIZ.LLIIZ).remove(aObjectS28S0000000_5);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS28S0000000_5 aObjectS28S0000000_5, Object obj) {
        ((BaseViewModel) obj).config(new AObjectS21S0001000_5(1, 4));
        return null;
    }
}
