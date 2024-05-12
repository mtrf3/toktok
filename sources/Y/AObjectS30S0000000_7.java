package Y;

import X.C188727au;
import X.C76800UCe;
import X.FMX;
import X.GGS;
import X.GGT;
import X.InterfaceC88472Yns;
import com.bytedance.ies.foundation.base.BaseViewModel;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS30S0000000_7 implements InterfaceC88472Yns {
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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS30S0000000_7(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS30S0000000_7 aObjectS30S0000000_7, Object obj) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("exit_method", "cancel");
        FMX.LJIIL("exit_remove_account_window", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AObjectS30S0000000_7 aObjectS30S0000000_7, Object obj) {
        return null;
    }

    public static final Object invoke$2(AObjectS30S0000000_7 aObjectS30S0000000_7, Object eventArgs) {
        o.LJIIIZ(eventArgs, "eventArgs");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS30S0000000_7 aObjectS30S0000000_7, Object obj) {
        GGT ggt = GGS.LIZ;
        Objects.requireNonNull(ggt);
        ((BaseViewModel) obj).config(new AObjectS52S0101000_7(1, ggt, 17));
        return null;
    }

    public static final Object invoke$4(AObjectS30S0000000_7 aObjectS30S0000000_7, Object obj) {
        GGT ggt = GGS.LIZ;
        Objects.requireNonNull(ggt);
        ((BaseViewModel) obj).config(new AObjectS52S0101000_7(2, ggt, 9));
        return null;
    }
}
