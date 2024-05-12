package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PZE implements InterfaceC64642PYo<Object> {
    public final /* synthetic */ XJL LIZ;

    public PZE(XKS xks) {
        this.LIZ = xks;
    }

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<Object> call, Throwable t) {
        o.LJIIJ(call, "call");
        o.LJIIJ(t, "t");
        XJL xjl = this.LIZ;
        C3C4 LIZ = C141335gf.LIZ(t);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<Object> call, C64653PYz<Object> response) {
        o.LJIIJ(call, "call");
        o.LJIIJ(response, "response");
        if (response.LIZ()) {
            Object obj = response.LIZIZ;
            if (obj == null) {
                Object tag = call.request().tag(C37273Ek1.class);
                if (tag != null) {
                    Method method = ((C37273Ek1) tag).LIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Response from ");
                    o.LJFF(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    o.LJFF(declaringClass, "method.declaringClass");
                    LIZ.append(declaringClass.getName());
                    LIZ.append('.');
                    LIZ.append(method.getName());
                    LIZ.append(" was null but response body type was declared as non-null");
                    C37470EnC c37470EnC = new C37470EnC(X1D.LIZIZ(LIZ));
                    XJL xjl = this.LIZ;
                    C3C4 LIZ2 = C141335gf.LIZ(c37470EnC);
                    C3C5.m7constructorimpl(LIZ2);
                    xjl.resumeWith(LIZ2);
                    return;
                }
                o.LJIIZILJ();
                throw null;
            }
            XJL xjl2 = this.LIZ;
            C3C5.m7constructorimpl(obj);
            xjl2.resumeWith(obj);
            return;
        }
        XJL xjl3 = this.LIZ;
        C3C4 LIZ3 = C141335gf.LIZ(new PZF(response));
        C3C5.m7constructorimpl(LIZ3);
        xjl3.resumeWith(LIZ3);
    }
}
