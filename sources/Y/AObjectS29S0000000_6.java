package Y;

import X.C35019Dol;
import X.C38378F4k;
import X.C66457Q6j;
import X.C66460Q6m;
import X.C66466Q6s;
import X.GGS;
import X.GGT;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.bytedance.ies.safemode.SafeModeActivity;
import com.lynx.react.bridge.ReadableMap;
import java.util.Objects;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AObjectS29S0000000_6 implements InterfaceC88472Yns {
    public final int $t;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public AObjectS29S0000000_6(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS29S0000000_6 aObjectS29S0000000_6, Object params) {
        o.LJIIJ(params, "params");
        if (params instanceof ReadableMap) {
            C38378F4k.LIZ.getClass();
            return C38378F4k.LIZLLL((ReadableMap) params);
        }
        return null;
    }

    public static final Object invoke$1(AObjectS29S0000000_6 aObjectS29S0000000_6, Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        GGT ggt = GGS.LIZ;
        Objects.requireNonNull(ggt);
        baseViewModel.config(new AObjectS51S0101000_6(1, ggt, 0));
        baseViewModel.config(new AObjectS22S0001000_6(1, 8));
        baseViewModel.config(new AObjectS22S0001000_6(1, 9));
        return null;
    }

    public static final Object invoke$2(AObjectS29S0000000_6 aObjectS29S0000000_6, Object obj) {
        if (C35019Dol.LIZIZ() || C35019Dol.LIZ()) {
            C66466Q6s.LIZIZ(60000);
        } else {
            C66466Q6s.LIZIZ(14400000);
        }
        C66460Q6m.LIZIZ().getClass();
        SafeModeActivity.LJLJJLL.getClass();
        C66457Q6j.LIZ();
        return null;
    }

    public static final Object invoke$3(AObjectS29S0000000_6 aObjectS29S0000000_6, Object params) {
        o.LJIIJ(params, "params");
        if (params instanceof JSONObject) {
            return params;
        }
        return null;
    }
}
