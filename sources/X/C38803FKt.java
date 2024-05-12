package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS39S1300000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FKt, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38803FKt implements FL4 {
    public static final C38803FKt LIZ = new C38803FKt();

    @Override // X.FL4
    public final Object LIZ(Integer num, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        AqS39S1300000_6 aqS39S1300000_6 = new AqS39S1300000_6(num, str, interfaceC65784Pro, interfaceC65784Pro2, 3);
        C38805FKv.LIZ.getClass();
        FL5 fl5 = (FL5) ((LinkedHashMap) C38805FKv.LJI).get(str);
        if (fl5 != null) {
            try {
                return aqS39S1300000_6.invoke();
            } catch (Throwable th) {
                if (AnonymousClass028.LJFF(th) != null) {
                    o.LJI(str);
                    fl5.LIZ();
                    return null;
                }
                return null;
            }
        }
        return aqS39S1300000_6.invoke();
    }
}
