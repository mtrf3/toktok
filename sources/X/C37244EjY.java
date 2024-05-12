package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: X.EjY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37244EjY implements InterfaceC37245EjZ {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Runtime LIZLLL;
    public final /* synthetic */ Method LJ;

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1995215827672875156"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public final void LIZIZ(int i, String str) {
        String str2;
        if (this.LIZ) {
            if ((i & 4) == 4) {
                str2 = this.LIZIZ;
            } else {
                str2 = this.LIZJ;
            }
            try {
                synchronized (this.LIZLLL) {
                    String str3 = (String) LIZ(this.LIZLLL, this.LJ, new Object[]{str, C39633Fgz.class.getClassLoader(), str2});
                    if (str3 != null) {
                        throw new UnsatisfiedLinkError(str3);
                    }
                }
                return;
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Error: Cannot load ");
                LIZ.append(str);
                throw new RuntimeException(X1D.LIZIZ(LIZ), e);
            }
        }
        System.load(str);
    }

    public C37244EjY(boolean z, String str, String str2, Runtime runtime, Method method) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = runtime;
        this.LJ = method;
    }
}
