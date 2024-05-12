package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.EWr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36565EWr {
    public static Class LIZ(Class cls) {
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        o.LJFF(declaredClasses, "clazz.declaredClasses");
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls2 : declaredClasses) {
            if (cls2.getAnnotation(InterfaceC31169CLd.class) != null) {
                arrayList.add(cls2);
            }
        }
        if (arrayList.isEmpty()) {
            Class superclass = cls.getSuperclass();
            o.LJFF(superclass, "clazz.superclass");
            Class<?>[] declaredClasses2 = superclass.getDeclaredClasses();
            o.LJFF(declaredClasses2, "clazz.superclass.declaredClasses");
            arrayList = new ArrayList();
            for (Class<?> cls3 : declaredClasses2) {
                if (cls3.getAnnotation(InterfaceC31169CLd.class) != null) {
                    arrayList.add(cls3);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Object LJLLJ = ORZ.LJLLJ(arrayList);
        if (LJLLJ != null) {
            return (Class) LJLLJ;
        }
        throw new C37692Eqm("null cannot be cast to non-null type java.lang.Class<out com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel>");
    }
}
