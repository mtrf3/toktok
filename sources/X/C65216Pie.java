package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.Pie, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65216Pie extends AbstractC65069PgH {
    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        if (C65139PhP.LJFF(type) != C10K.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type LJ = C65139PhP.LJ(0, (ParameterizedType) type);
            if (C65139PhP.LJFF(LJ) != C64797Pbt.class) {
                return new C65220Pii(LJ);
            }
            if (LJ instanceof ParameterizedType) {
                return new C65221Pij(C65139PhP.LJ(0, (ParameterizedType) LJ));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
    }
}
