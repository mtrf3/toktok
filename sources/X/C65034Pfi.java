package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: X.Pfi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65034Pfi extends AbstractC65025PfZ {
    public final Executor LIZ;

    public C65034Pfi(Executor executor) {
        this.LIZ = executor;
    }

    @Override // X.AbstractC65025PfZ
    public final InterfaceC65013PfN LIZ(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (C65138PhO.LJFF(type) != InterfaceC65079PgR.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type LJ = C65138PhO.LJ(0, (ParameterizedType) type);
            if (!C65138PhO.LJIIIIZZ(annotationArr, InterfaceC65007PfH.class)) {
                executor = this.LIZ;
            }
            return new C65041Pfp(LJ, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
