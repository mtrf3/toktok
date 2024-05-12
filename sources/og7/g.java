package og7;

import X.C221108m2;
import X.C47171tB;
import X.C53651L3v;
import X.C62822Ol8;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.LayeredConstraintLayout;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class g {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C53651L3v.LJLIL);
    public int LIZIZ;
    public int LIZJ;

    public final void LIZ(String str, p8.a aVar, C47171tB c47171tB, ViewGroup.LayoutParams layoutParams) {
        Integer num;
        LayeredConstraintLayout.LayoutParams layoutParams2;
        String LJ = q8.a.LJ(str);
        switch (LJ.hashCode()) {
            case -2069471751:
                if (!LJ.equals("layout_order")) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams3 = c47171tB.getLayoutParams();
                if (!(layoutParams3 instanceof LayeredConstraintLayout.LayoutParams) || (layoutParams2 = (LayeredConstraintLayout.LayoutParams) layoutParams3) == null) {
                    return;
                }
                String str2 = aVar.LIZ;
                o.LJIIIIZZ(str2, "type.value");
                layoutParams2.setOrder(CastIntegerProtector.parseInt(str2));
                return;
            case -1817851110:
                if (!LJ.equals("gradientPositions")) {
                    return;
                }
                String str3 = aVar.LIZ;
                o.LJIIIIZZ(str3, "type.value");
                this.LIZJ = CastIntegerProtector.parseInt(str3);
                return;
            case -284066624:
                if (!LJ.equals("gradientColors")) {
                    return;
                }
                String str4 = aVar.LIZ;
                o.LJIIIIZZ(str4, "type.value");
                this.LIZIZ = CastIntegerProtector.parseInt(str4);
                return;
            case -205305728:
                if (LJ.equals("gradientOrientation") && (num = (Integer) ((Map) this.LIZ.getValue()).get(aVar.LIZ)) != null) {
                    c47171tB.setGradientOrientation(num.intValue());
                    return;
                }
                return;
            default:
                return;
        }
    }
}
