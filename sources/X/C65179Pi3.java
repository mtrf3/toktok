package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.ss.android.ugc.aweme.app.api.proto.ComposePbAndJson;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.Pi3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65179Pi3 extends AbstractC65022PfW {
    public final Gson LIZ;
    public InterfaceC55669Lt3 LIZIZ;

    public C65179Pi3(Gson gson) {
        if (gson != null) {
            this.LIZ = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() != ComposePbAndJson.class) {
                return null;
            }
            return new C65244Pj6(parameterizedType, this.LIZ, this.LIZIZ);
        }
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C65180Pi4(ProtoAdapter.get(cls));
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!Message.class.isAssignableFrom(cls)) {
            return null;
        }
        return new C65178Pi2(ProtoAdapter.get(cls));
    }
}
