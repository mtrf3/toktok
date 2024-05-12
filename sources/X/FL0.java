package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS61S1200000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FL0 implements FL4 {
    public static final FL0 LIZ = new FL0();

    @Override // X.FL4
    public final Object LIZ(Integer num, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        AqS61S1200000_6 aqS61S1200000_6 = new AqS61S1200000_6(str, interfaceC65784Pro, interfaceC65784Pro2, 4);
        C38805FKv.LIZ.getClass();
        FL5 fl5 = (FL5) ((LinkedHashMap) C38805FKv.LJI).get(str);
        if (fl5 != null) {
            try {
                return aqS61S1200000_6.invoke();
            } catch (Throwable th) {
                if (AnonymousClass028.LJFF(th) != null) {
                    o.LJI(str);
                    fl5.LIZ();
                    return null;
                }
                return null;
            }
        }
        return aqS61S1200000_6.invoke();
    }
}
