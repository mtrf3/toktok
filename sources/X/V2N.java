package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V2N {
    public static final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-473330960);
        if (i != 0 || !LJIL.LIZ()) {
            C1JE LIZIZ = C1JJ.LIZIZ(C1JJ.LJ(LJIL), 360.0f, C1JI.LJIJJ(C1JI.LJJIJIIJIL(1000, 0, C1J1.LIZ, 2), null, 6), LJIL);
            InterfaceC07790Sh interfaceC07790Sh = InterfaceC07790Sh.LJJJI;
            float floatValue = ((Number) LIZIZ.getValue()).floatValue();
            o.LJIIIZ(interfaceC07790Sh, "<this>");
            if (floatValue != 0.0f) {
                interfaceC07790Sh = C78847Ux1.LJJIIZI(interfaceC07790Sh, 0.0f, 0.0f, 0.0f, 0.0f, floatValue, null, false, 65279);
            }
            V2K.LIZJ(R.raw.icon_spinner_normal, "spinner", interfaceC07790Sh, 0L, 14.0f, 14.0f, false, LJIL, 221232, 72);
        } else {
            LJIL.LIZLLL();
        }
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new V2O(i);
    }
}
