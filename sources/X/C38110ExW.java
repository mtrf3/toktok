package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.ExW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38110ExW {
    public static final Object LIZ(String str, AbstractC38082Ex4<?, ?> target) {
        o.LJIIIZ(target, "target");
        Type genericSuperclass = target.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            Type[] actualTypeArguments = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
            o.LJIIIIZZ(actualTypeArguments, "type as ParameterizedType).actualTypeArguments");
            Type type = actualTypeArguments[0];
            o.LJIIIZ(type, "type");
            if (o.LJ(type, JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
                return new JSONObject(str);
            }
            return GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, str, type);
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
