package X;

import com.bytedance.common.utility.reflect.Reflect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public final class EY4 implements InvocationHandler {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ Reflect LIZIZ;

    public EY4(Reflect reflect, boolean z) {
        this.LIZIZ = reflect;
        this.LIZ = z;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        int length;
        String name = method.getName();
        try {
            return Reflect.on(this.LIZIZ.object).call(name, Reflect.types(objArr), objArr).get();
        } catch (EY6 e) {
            if (this.LIZ) {
                java.util.Map map = (java.util.Map) this.LIZIZ.object;
                if (objArr == null) {
                    length = 0;
                } else {
                    length = objArr.length;
                }
                if (length == 0 && name.startsWith("get")) {
                    return map.get(Reflect.property(name.substring(3)));
                }
                if (length == 0 && name.startsWith("is")) {
                    return map.get(Reflect.property(name.substring(2)));
                }
                if (length == 1 && name.startsWith("set")) {
                    map.put(Reflect.property(name.substring(3)), objArr[0]);
                    return null;
                }
            }
            throw e;
        }
    }
}
