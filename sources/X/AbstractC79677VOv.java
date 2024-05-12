package X;

import java.lang.reflect.Method;

/* renamed from: X.VOv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC79677VOv {
    public final String LIZ;
    public final Method LIZIZ;
    public final Integer LIZJ;

    public static void LIZ(Object obj, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-928841784001077200")).LIZ) {
            return;
        }
        method.invoke(obj, objArr);
    }

    public abstract Object LIZIZ(VPA vpa);

    public AbstractC79677VOv(VPD vpd, Method method) {
        this.LIZ = vpd.name();
        if (!"__default_type__".equals(vpd.customType())) {
            vpd.customType();
        }
        this.LIZIZ = method;
        this.LIZJ = null;
    }

    public AbstractC79677VOv(VPE vpe, Method method, int i) {
        this.LIZ = vpe.names()[i];
        if (!"__default_type__".equals(vpe.customType())) {
            vpe.customType();
        }
        this.LIZIZ = method;
        this.LIZJ = Integer.valueOf(i);
    }
}
