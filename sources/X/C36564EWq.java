package X;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.EWq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36564EWq implements InvocationHandler {
    public final /* synthetic */ C36558EWk LIZ;
    public final /* synthetic */ Class LIZIZ;
    public final /* synthetic */ JSONObject LIZJ;

    public C36564EWq(C36558EWk c36558EWk, Class cls, JSONObject jSONObject) {
        this.LIZ = c36558EWk;
        this.LIZIZ = cls;
        this.LIZJ = jSONObject;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        o.LJFF(method, "method");
        if (o.LJ(method.getName(), "toJSON")) {
            return this.LIZ.LJ(this.LIZJ, this.LIZIZ);
        }
        InterfaceC36563EWp interfaceC36563EWp = (InterfaceC36563EWp) method.getAnnotation(InterfaceC36563EWp.class);
        return this.LIZ.LIZJ(this.LIZJ.opt(interfaceC36563EWp.keyPath()), interfaceC36563EWp);
    }
}
