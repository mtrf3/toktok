package X;

import android.graphics.Point;
import com.bytedance.keva.Keva;

/* loaded from: classes9.dex */
public final class JEI {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(JDB.LJLIL);

    public static Keva LIZ() {
        return (Keva) LIZ.getValue();
    }

    public static void LIZIZ(JEJ jej) {
        LIZ().storeString("last_window_size", jej.LIZ.name());
        Point point = jej.LIZIZ;
        LIZ().storeInt("last_window_position_x", point.x);
        LIZ().storeInt("last_window_position_y", point.y);
        LIZ().storeBoolean("last_window_adhere_to_left", jej.LIZJ);
        LIZ().storeFloat("last_window_position_y_relative", jej.LIZLLL);
    }
}
