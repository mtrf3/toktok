package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Dhi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C34582Dhi {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(String taskKey) {
        o.LJIIIZ(taskKey, "taskKey");
        try {
            if (C3UJ.LIZ() == null) {
                return false;
            }
            return C3UJ.LIZ().contains(taskKey);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean LIZIZ(String str) {
        try {
            if (!((Boolean) C34195DbT.LJFF.getValue()).booleanValue() || C7GT.LIZ() == null) {
                return false;
            }
            return C7GT.LIZ().contains(str);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean LIZJ(String taskKey) {
        o.LJIIIZ(taskKey, "taskKey");
        try {
            if (!C34195DbT.LIZIZ() || C3UK.LIZ() == null) {
                return false;
            }
            return C3UK.LIZ().contains(taskKey);
        } catch (Exception unused) {
            return false;
        }
    }
}
