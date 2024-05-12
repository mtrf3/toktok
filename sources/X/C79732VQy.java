package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.widget.TextView;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;

/* renamed from: X.VQy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79732VQy {
    public static boolean LIZ = false;
    public static boolean LIZIZ = false;
    public static int LIZJ = -1;
    public static String LIZLLL;
    public static Typeface LJ;
    public static boolean LJFF;

    public static synchronized Typeface LIZ() {
        synchronized (C79732VQy.class) {
            if (!LIZIZ()) {
                return null;
            }
            if (LJFF) {
                return LJ;
            }
            try {
                TextPaint paint = new TextView(LynxEnv.LJIIIZ().LIZ).getPaint();
                if (paint != null) {
                    LJ = paint.getTypeface();
                }
            } catch (Exception unused) {
                LLog.LIZLLL(4, "Lynx", "get default typeface failed");
            }
            LJFF = true;
            return LJ;
        }
    }

    public static synchronized boolean LIZIZ() {
        boolean z;
        synchronized (C79732VQy.class) {
            if (!LIZ) {
                try {
                    Class.forName("miui.os.Build");
                    LIZIZ = true;
                } catch (Exception unused) {
                }
                LIZ = true;
            }
            z = LIZIZ;
        }
        return z;
    }
}
