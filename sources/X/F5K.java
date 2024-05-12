package X;

import com.bytedance.ies.bullet.kit.lynx.api.BulletReadableMap;
import com.lynx.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5K extends F5L {
    public final /* synthetic */ java.util.Map LIZ;

    public static void LIZ(F5M f5m, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{f5m, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-4974810240580495201")).LIZ) {
            return;
        }
        method.invoke(f5m, objArr);
    }

    public F5K(F5M f5m, java.util.Map map) {
        this.LIZ = map;
    }

    @Override // X.F5N
    public final void setProperty(String str, Object obj) {
        if (this.LIZ.get(str) != null) {
            Object obj2 = this.LIZ.get(str);
            if (obj2 != null) {
                Method method = (Method) obj2;
                Class<?>[] parameterTypes = method.getParameterTypes();
                o.LJFF(parameterTypes, "method.parameterTypes");
                if (parameterTypes.length != 1) {
                    return;
                }
                try {
                    if (o.LJ(parameterTypes[0], BulletReadableMap.class) && (obj instanceof ReadableMap)) {
                        LIZ(null, method, new Object[]{OJY.LJIIZILJ((ReadableMap) obj)});
                    } else {
                        LIZ(null, method, new Object[]{obj});
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            o.LJIIZILJ();
            throw null;
        }
    }
}
