package X;

import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PZS {
    public static Method LIZIZ;
    public static Method LIZJ;
    public static Method LIZLLL;
    public static Method LJ;
    public static Method LJFF;
    public final Object LIZ;

    public PZS(Object obj) {
        this.LIZ = obj;
    }

    public final String LIZIZ(String name) {
        Object obj;
        o.LJIIIZ(name, "name");
        Method method = LIZIZ;
        if (method != null) {
            obj = method.invoke(this.LIZ, name);
        } else {
            obj = null;
        }
        return (String) obj;
    }

    public final void LIZJ(String name) {
        o.LJIIIZ(name, "name");
        Method method = LIZLLL;
        if (method != null) {
            method.invoke(this.LIZ, name);
        }
    }

    public final void LIZ(String str, String str2) {
        Method method = LIZJ;
        if (method != null) {
            method.invoke(this.LIZ, str, str2);
        }
    }

    public final void LIZLLL(String str, String str2) {
        Method method = LJ;
        if (method != null) {
            method.invoke(this.LIZ, str, str2);
        }
    }
}
