package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.Piz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65237Piz extends AbstractC65022PfW {
    public final Gson LIZ;

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        return null;
    }

    public C65237Piz(Gson gson) {
        if (gson != null) {
            this.LIZ = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        if (!(type instanceof ParameterizedType)) {
            return null;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        if (!(rawType instanceof Class) || !QDX.class.isAssignableFrom((Class) rawType)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            return new QDW(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(actualTypeArguments[0])));
        }
        throw new RuntimeException("ChunkBundle should have one generic type.");
    }
}
