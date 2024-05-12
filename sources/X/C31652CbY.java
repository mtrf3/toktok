package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.CbY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31652CbY {
    public C31652CbY(Context context) {
        o.LJIIIZ(context, "context");
    }

    public static boolean LIZ(C31652CbY c31652CbY, Boolean bool) {
        c31652CbY.getClass();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static int LIZIZ(C31652CbY c31652CbY, Integer num, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        c31652CbY.getClass();
        if (num == null || num.intValue() < 0 || !z) {
            return i;
        }
        return num.intValue();
    }
}
