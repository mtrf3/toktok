package X;

import android.os.IBinder;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* renamed from: X.0qb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20090qb implements InvocationHandler {
    public final IBinder LIZ;
    public IBinder LIZIZ;
    public final InterfaceC20100qc LIZJ;
    public final Class<?> LIZLLL;
    public final Class<?> LJ;

    public C20090qb(IBinder iBinder, InterfaceC20100qc interfaceC20100qc) {
        this.LIZ = iBinder;
        this.LIZJ = interfaceC20100qc;
        try {
            String LIZ = interfaceC20100qc.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZ);
            LIZ2.append("$Stub");
            this.LIZLLL = Class.forName(X1D.LIZIZ(LIZ2));
            this.LJ = Class.forName(LIZ);
        } catch (ClassNotFoundException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        if ("queryLocalInterface".equals(method.getName())) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            Class[] clsArr = {this.LJ};
            final IBinder iBinder = this.LIZ;
            final Class<?> cls = this.LIZLLL;
            final InterfaceC20100qc interfaceC20100qc = this.LIZJ;
            final IBinder iBinder2 = this.LIZIZ;
            return Proxy.newProxyInstance(classLoader, clsArr, new InvocationHandler(iBinder, cls, interfaceC20100qc, iBinder2) { // from class: X.0qZ
                public final Object LIZ;
                public final InterfaceC20100qc LIZIZ;
                public final IBinder LIZJ;

                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method2, Object[] objArr2) {
                    if (this.LIZJ != null && method2.getName().equals("asBinder")) {
                        return this.LIZJ;
                    }
                    this.LIZIZ.LJ(method2, objArr2);
                    Object obj3 = this.LIZ;
                    C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method2, new Object[]{obj3, objArr2}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8962449095044713878"));
                    if (LIZJ.LIZ) {
                        return LIZJ.LIZIZ;
                    }
                    return method2.invoke(obj3, objArr2);
                }

                {
                    try {
                        this.LIZ = cls.getDeclaredMethod("asInterface", IBinder.class).invoke(null, iBinder);
                        this.LIZIZ = interfaceC20100qc;
                        this.LIZJ = iBinder2;
                    } catch (Exception unused) {
                    }
                }
            });
        }
        IBinder iBinder3 = this.LIZ;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{iBinder3, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "416789999045350858"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return method.invoke(iBinder3, objArr);
    }
}
