package X;

import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.Fa5, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39205Fa5 {
    public static final InterfaceC39206Fa6 LIZ;

    static {
        Object obj;
        try {
            Field getInstance = Class.forName("com.bytedance.bpea.core.checker.CorePowerProvider").getDeclaredField("INSTANCE");
            o.LJFF(getInstance, "getInstance");
            getInstance.setAccessible(true);
            obj = getInstance.get(null);
        } catch (Throwable unused) {
        }
        if (obj != null) {
            LIZ = (InterfaceC39206Fa6) obj;
            InterfaceC39206Fa6 interfaceC39206Fa6 = LIZ;
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.bpea.basics.ICorePowerProvider");
    }
}
