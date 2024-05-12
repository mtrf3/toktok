package X;

import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableArrayWrapper;
import com.bytedance.ies.lynx.lynx_adapter.wrapper.ReadableMapWrapper;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F5C extends F5D {
    public final /* synthetic */ java.util.Map LIZ;

    public static void LIZ(F5E f5e, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{f5e, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "-3609132005313194777")).LIZ) {
            return;
        }
        method.invoke(f5e, objArr);
    }

    public F5C(F5E f5e, java.util.Map map) {
        this.LIZ = map;
    }

    @Override // X.F5F
    public final void setProperty(String str, Object obj) {
        if (this.LIZ.get(str) != null) {
            Object obj2 = this.LIZ.get(str);
            if (obj2 != null) {
                Method method = (Method) obj2;
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 1) {
                    return;
                }
                try {
                    if (o.LJ(parameterTypes[0], ReadableMapWrapper.class) && (obj instanceof ReadableMap)) {
                        LIZ(null, method, new Object[]{C1FE.LIZIZ((ReadableMap) obj)});
                    } else if (o.LJ(parameterTypes[0], ReadableArrayWrapper.class) && (obj instanceof ReadableArray)) {
                        LIZ(null, method, new Object[]{C1FE.LIZ((ReadableArray) obj)});
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
