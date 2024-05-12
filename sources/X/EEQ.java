package X;

import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EEQ {
    public static boolean LIZ;
    public static Integer LIZIZ;

    public static boolean LIZ(EEY legoComponent) {
        o.LJIIIZ(legoComponent, "legoComponent");
        Integer num = LIZIZ;
        int targetProcess = legoComponent.targetProcess();
        Integer num2 = LIZIZ;
        o.LJI(num2);
        int intValue = targetProcess & num2.intValue();
        if (num == null || num.intValue() != intValue) {
            return false;
        }
        return true;
    }
}
