package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Pil, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65223Pil extends AbstractC65069PgH {
    public C65223Pil(int i) {
    }

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type returnType, Annotation[] annotations, C65019PfT retrofit) {
        o.LJIIIZ(returnType, "returnType");
        o.LJIIIZ(annotations, "annotations");
        o.LJIIIZ(retrofit, "retrofit");
        if (!o.LJ(InterfaceC68342mE.class, C65139PhP.LJFF(returnType))) {
            return null;
        }
        if (returnType instanceof ParameterizedType) {
            Type responseType = C65139PhP.LJ(0, (ParameterizedType) returnType);
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation : annotations) {
                if (annotation instanceof InterfaceC65131PhH) {
                    arrayList.add(annotation);
                }
            }
            InterfaceC65131PhH interfaceC65131PhH = (InterfaceC65131PhH) ORZ.LJLLLL(arrayList);
            o.LJIIIIZZ(responseType, "responseType");
            return new C73404SrQ(responseType, interfaceC65131PhH);
        }
        throw new IllegalStateException("Deferred return type must be parameterized as Deferred<Foo> or Deferred<out Foo>");
    }
}
