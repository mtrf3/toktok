package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EWm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36560EWm implements InvocationHandler {
    public final /* synthetic */ C36557EWj LIZ;
    public final /* synthetic */ Class LIZIZ;
    public final /* synthetic */ HashMap LIZJ;

    public C36560EWm(C36557EWj c36557EWj, Class cls, HashMap hashMap) {
        this.LIZ = c36557EWj;
        this.LIZIZ = cls;
        this.LIZJ = hashMap;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        o.LJFF(method, "method");
        if (o.LJ(method.getName(), "toJSON")) {
            return new JSONObject(this.LIZ.LJ(this.LIZIZ, this.LIZJ));
        }
        InterfaceC36563EWp interfaceC36563EWp = (InterfaceC36563EWp) method.getAnnotation(InterfaceC36563EWp.class);
        return this.LIZ.LIZJ(this.LIZJ.get(interfaceC36563EWp.keyPath()), interfaceC36563EWp);
    }
}
