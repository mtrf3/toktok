package f87;

import X.C116414hZ;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import p8.a;

/* loaded from: classes2.dex */
public final class o {
    public int LIZ = -1;
    public int LIZIZ = -1;

    public final void LIZ(String str, a.b bVar, C116414hZ c116414hZ, ViewGroup.LayoutParams layoutParams) {
        int i;
        c116414hZ.getContext();
        String LJ = q8.a.LJ(str);
        int hashCode = LJ.hashCode();
        if (hashCode != 280523342) {
            if (hashCode != 292743585) {
                if (hashCode == 1495653632 && LJ.equals("tux_tintColor")) {
                    String str2 = bVar.LIZ;
                    kotlin.jvm.internal.o.LJIIIIZZ(str2, "value.value");
                    this.LIZIZ = CastIntegerProtector.parseInt(str2);
                }
            } else if (LJ.equals("tux_icon")) {
                String str3 = bVar.LIZ;
                kotlin.jvm.internal.o.LJIIIIZZ(str3, "value.value");
                this.LIZ = CastIntegerProtector.parseInt(str3);
            }
        } else if (LJ.equals("gravity")) {
            c116414hZ.setForegroundGravity(17);
        }
        int i2 = this.LIZ;
        if (i2 > 0 && (i = this.LIZIZ) > 0) {
            c116414hZ.LIZ(i2, i);
        }
    }
}
