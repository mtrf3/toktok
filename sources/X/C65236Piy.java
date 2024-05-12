package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.Piy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65236Piy extends AbstractC65022PfW {
    public final Gson LIZ;

    public C65236Piy(Gson gson) {
        if (gson != null) {
            this.LIZ = gson;
            return;
        }
        throw new NullPointerException("gson == null");
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        return new C65240Pj2(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        return new C65235Pix(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }
}
