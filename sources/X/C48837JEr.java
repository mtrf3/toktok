package X;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.view.Display;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.JEr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48837JEr {
    public static final java.util.Set<String> LIZ = C77275UUl.LJII("google");

    public static boolean LIZ() {
        try {
            if (((Boolean) C48838JEs.LIZ.getValue()).booleanValue()) {
                String MANUFACTURER = Build.MANUFACTURER;
                o.LJIIIIZZ(MANUFACTURER, "MANUFACTURER");
                String lowerCase = MANUFACTURER.toLowerCase(Locale.ROOT);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return LIZ.contains(lowerCase);
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean LIZIZ(Context context) {
        try {
            Object LLILL = C16880lQ.LLILL(context, "display");
            o.LJII(LLILL, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
            Display[] displays = ((DisplayManager) LLILL).getDisplays();
            o.LJIIIIZZ(displays, "displayManager.displays");
            for (Display display : displays) {
                if (display != null && ((int) display.getRefreshRate()) > 60) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }
}
