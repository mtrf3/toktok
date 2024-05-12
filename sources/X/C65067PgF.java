package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: X.PgF, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65067PgF extends AbstractC65069PgH {
    public final Executor LIZ;

    public C65067PgF(Executor executor) {
        this.LIZ = executor;
    }

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        Executor executor = null;
        if (C65139PhP.LJFF(type) != InterfaceC37276Ek4.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type LJ = C65139PhP.LJ(0, (ParameterizedType) type);
            if (!C65139PhP.LJIIIIZZ(annotationArr, InterfaceC65004PfE.class)) {
                executor = this.LIZ;
            }
            return new C65070PgI(LJ, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
