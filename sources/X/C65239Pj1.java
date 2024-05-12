package X;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.Pj1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65239Pj1 extends AbstractC65015PfP {
    public final Gson LIZ;

    public C65239Pj1(Gson gson) {
        this.LIZ = gson;
    }

    @Override // X.AbstractC65015PfP
    public final InterfaceC65017PfR<PVM, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C65018PfS c65018PfS) {
        return new C65242Pj4(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }

    @Override // X.AbstractC65015PfP
    public final InterfaceC65017PfR<?, PVP> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65018PfS c65018PfS) {
        return new C65233Piv(this.LIZ, this.LIZ.LJIIIZ(TypeToken.get(type)));
    }
}
