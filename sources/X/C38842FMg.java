package X;

import android.content.res.Configuration;
import java.lang.reflect.Method;

/* renamed from: X.FMg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38842FMg {
    public Configuration LIZIZ;
    public boolean LIZJ;
    public int LIZ = -1;
    public final ComponentCallbacksC38849FMn LIZLLL = new ComponentCallbacksC38849FMn(this);

    public static Object LIZ(Object obj, Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-6778635983055278369"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }
}
