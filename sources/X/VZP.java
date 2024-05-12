package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VZP {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZIZ(Context context) {
        Resources resources = context.getResources();
        o.LJFF(resources, "context.resources");
        return resources.getDisplayMetrics().widthPixels;
    }

    public static int LIZLLL(String toARGB) {
        o.LJIIJ(toARGB, "$this$toARGB");
        if (toARGB.length() <= 7) {
            return ColorProtector.parseColor(toARGB);
        }
        int parseColor = ColorProtector.parseColor(toARGB);
        return (parseColor << 24) | (parseColor >>> 8);
    }

    public static int LIZ(Context context, float f) {
        Resources resources = context.getResources();
        o.LJFF(resources, "context.resources");
        return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
    }

    public static int LIZJ(Context context, float f) {
        o.LJFF(context.getResources(), "context.resources");
        return (int) ((f * r1.getDisplayMetrics().widthPixels) / 750);
    }
}
