package X;

import android.graphics.Color;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OBr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61499OBr {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return true;
        }
        return false;
    }

    public static int LIZ(String color) {
        int parseColor;
        o.LJIIIZ(color, "color");
        try {
            parseColor = Color.parseColor(color);
        } catch (Throwable unused) {
            parseColor = ColorProtector.parseColor("#000000");
        }
        if (color.length() == 9) {
            return (parseColor << 24) | (parseColor >>> 8);
        }
        return parseColor;
    }
}
