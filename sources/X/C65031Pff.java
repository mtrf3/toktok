package X;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.Pff, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65031Pff extends C65030Pfe {
    @Override // X.C65030Pfe
    public final int LIZLLL() {
        return 1;
    }

    @Override // X.C65030Pfe
    public final List<? extends AbstractC65015PfP> LIZJ() {
        return Collections.singletonList(C65033Pfh.LIZ);
    }

    @Override // X.C65030Pfe
    public final List<? extends AbstractC65025PfZ> LIZ(Executor executor) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(C65035Pfj.LIZ);
        arrayList.add(new C65034Pfi(executor));
        return Collections.unmodifiableList(arrayList);
    }

    @Override // X.C65030Pfe
    public final boolean LJFF(Method method) {
        return method.isDefault();
    }

    @Override // X.C65030Pfe
    public final Object LJ(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        return ((MethodHandles.Lookup) declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
