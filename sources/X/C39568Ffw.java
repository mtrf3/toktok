package X;

import android.util.LruCache;
import kotlin.jvm.internal.o;

/* renamed from: X.Ffw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39568Ffw {
    public static final C78862UxG LIZ = C78857UxB.LJJIIJ(1476440065, "bpea-get_country_carrier");
    public static final C78862UxG LIZIZ = C78857UxB.LJJIIJ(1476444161, "bpea-get_gaid");

    public static final Object LIZ(LruCache cacheFirst, Object obj, InterfaceC65784Pro interfaceC65784Pro) {
        Object obj2;
        boolean z;
        o.LJIIJ(cacheFirst, "$this$cacheFirst");
        try {
            Object obj3 = cacheFirst.get(obj);
            Object obj4 = null;
            if (!(obj3 instanceof Object)) {
                obj3 = null;
            }
            if (obj3 == null) {
                try {
                    Object invoke = interfaceC65784Pro.invoke();
                    if (obj != null && invoke != null) {
                        cacheFirst.put(obj, invoke);
                    }
                    if (invoke instanceof Object) {
                        obj4 = invoke;
                    }
                } catch (Q0C unused) {
                }
            } else {
                obj4 = obj3;
            }
            if (obj4 != null) {
                obj2 = obj4;
            } else {
                obj2 = "";
            }
            InterfaceC39570Ffy interfaceC39570Ffy = C39569Ffx.LIZLLL;
            if (interfaceC39570Ffy != null) {
                if (obj4 == null) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC39570Ffy.LIZIZ(obj, z);
            }
            return obj2;
        } catch (Throwable th) {
            InterfaceC39570Ffy interfaceC39570Ffy2 = C39569Ffx.LIZLLL;
            if (interfaceC39570Ffy2 != null) {
                interfaceC39570Ffy2.LIZ(obj, th);
            }
            throw th;
        }
    }
}
