package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.PfP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65015PfP {
    public InterfaceC65017PfR<?, PVP> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65018PfS c65018PfS) {
        return null;
    }

    public InterfaceC65017PfR<PVM, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C65018PfS c65018PfS) {
        return null;
    }

    public InterfaceC65017PfR<?, String> stringConverter(Type type, Annotation[] annotationArr, C65018PfS c65018PfS) {
        return null;
    }

    public static Class<?> getRawType(Type type) {
        return C65138PhO.LJFF(type);
    }

    public static Type getParameterUpperBound(int i, ParameterizedType parameterizedType) {
        return C65138PhO.LJ(i, parameterizedType);
    }
}
