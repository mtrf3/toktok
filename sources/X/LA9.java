package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LA9 {
    public static WeakReference<MM2> LIZIZ;
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53770L8k.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(LA3.LJLIL);

    public static OSZ LIZJ() {
        return new OSZ(Integer.valueOf(LIZ(true) ? 1 : 0), 0);
    }

    public static MM4 LIZIZ() {
        View view;
        MM2 mm2;
        WeakReference<MM2> weakReference = LIZIZ;
        if (weakReference != null && (mm2 = weakReference.get()) != null) {
            view = mm2.itemView;
        } else {
            view = null;
        }
        if (!(view instanceof MM4)) {
            return null;
        }
        return (MM4) view;
    }

    public static boolean LIZ(boolean z) {
        boolean z2;
        C62822Ol8 c62822Ol8 = LIZJ;
        LA1 la1 = (LA1) c62822Ol8.getValue();
        la1.getClass();
        Object obj = la1.LIZ().get("key_creator_enable");
        if (obj == null) {
            obj = null;
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            return bool.booleanValue();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("Creator read config from cache-");
        LAB.LIZ.getClass();
        LIZ2.append(LAB.LIZ());
        LIZ2.append(", ");
        LAE.LIZ.getClass();
        LIZ2.append(LAE.LIZ());
        C56204M4a.LIZLLL(X1D.LIZIZ(LIZ2));
        boolean z3 = false;
        if (LAB.LIZ() && LAE.LIZ()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2 && !C78966Uyw.LJJIJ().LIZIZ()) {
                z3 = true;
            }
        } else {
            z3 = z2;
        }
        LA1 la12 = (LA1) c62822Ol8.getValue();
        Boolean value = Boolean.valueOf(z3);
        la12.getClass();
        o.LJIIIZ(value, "value");
        la12.LIZ().put("key_creator_enable", value);
        return z3;
    }
}
