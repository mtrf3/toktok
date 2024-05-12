package X;

import java.lang.reflect.Method;

/* renamed from: X.FgG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public enum EnumC39588FgG {
    LOAD_URL_1,
    LOAD_URL_2,
    ADD_JAVASCRIPT_INTERFACE,
    EVALUATE_JAVASCRIPT,
    DESTROY,
    RELOAD,
    GO_BACK,
    CAN_GO_BACK,
    GO_FORWARD,
    CAN_GO_FORWARD,
    INIT;

    public Method LJLIL;

    public static EnumC39588FgG valueOf(String str) {
        return (EnumC39588FgG) V0N.LJJJ(EnumC39588FgG.class, str);
    }

    public final void LIZJ(Method method) {
        if (this.LJLIL == null) {
            this.LJLIL = method;
            method.setAccessible(true);
        }
    }

    public final Object LIZLLL(Object obj, Object... objArr) {
        Method method = this.LJLIL;
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "8983682220778060183"));
        if (LIZJ.LIZ) {
            return LIZJ.LIZIZ;
        }
        return method.invoke(obj, objArr);
    }
}
