package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.Pj0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65238Pj0 extends AbstractC65022PfW {
    public final Gson LIZ;

    public static C65238Pj0 LJFF() {
        return new C65238Pj0(new Gson());
    }

    public C65238Pj0(Gson gson) {
        this.LIZ = gson;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        return new C65241Pj3(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        return new C65234Piw(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }
}
