package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS73S1100000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.FKw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38806FKw implements FL4 {
    public static final C38806FKw LIZ = new C38806FKw();

    @Override // X.FL4
    public final Object LIZ(Integer num, String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (str != null) {
            C38805FKv c38805FKv = C38805FKv.LIZ;
            c38805FKv.getClass();
            InterfaceC38802FKs interfaceC38802FKs = C38805FKv.LJFF;
            if (interfaceC38802FKs != null) {
                c38805FKv.LIZJ();
                interfaceC38802FKs.LIZIZ(str);
            }
        }
        AqS73S1100000_6 aqS73S1100000_6 = new AqS73S1100000_6(currentTimeMillis, str, interfaceC65784Pro2, 7);
        C38805FKv.LIZ.getClass();
        FL5 fl5 = (FL5) ((LinkedHashMap) C38805FKv.LJI).get(str);
        if (fl5 != null) {
            try {
                return aqS73S1100000_6.invoke();
            } catch (Throwable th) {
                if (AnonymousClass028.LJFF(th) != null) {
                    o.LJI(str);
                    fl5.LIZ();
                    return null;
                }
                return null;
            }
        }
        return aqS73S1100000_6.invoke();
    }
}
