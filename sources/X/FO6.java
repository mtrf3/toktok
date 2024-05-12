package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS106S0101000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FO6 {
    public static final java.util.Map<Integer, Drawable> LIZ;
    public static boolean LIZIZ;

    static {
        java.util.Map<Integer, Drawable> synchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        o.LJIIIIZZ(synchronizedMap, "synchronizedMap(mutableMapOf())");
        LIZ = synchronizedMap;
    }

    public static void LIZ(int i, Context context) {
        if (LIZIZ) {
            return;
        }
        C2NW.LIZ().LJJIJIIJI(new ARunnableS42S0100000_6(FO7.LJLIL, 2), new AqS106S0101000_6(context, i, 0));
    }
}
