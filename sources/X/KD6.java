package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KD6 {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static View LIZ(ActivityC45651qj activityC45651qj, int i, LayoutInflater inflater, ViewGroup viewGroup) {
        InterfaceC45601Hv3 interfaceC45601Hv3;
        InterfaceC51123K4p inflater2;
        View LIZ2;
        o.LJIIIZ(inflater, "inflater");
        if (!(activityC45651qj instanceof InterfaceC45601Hv3) || (interfaceC45601Hv3 = (InterfaceC45601Hv3) activityC45651qj) == null || (inflater2 = interfaceC45601Hv3.getInflater()) == null || (LIZ2 = inflater2.LIZ(i)) == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, i, viewGroup, false);
            o.LJIIIIZZ(LLLLIILL, "inflater.inflate(res, container, false)");
            return LLLLIILL;
        }
        return LIZ2;
    }
}
