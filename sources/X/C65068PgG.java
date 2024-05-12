package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.PgG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65068PgG extends AbstractC65069PgH {
    public static final C65068PgG LIZ = new C65068PgG();

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        if (C65139PhP.LJFF(type) != InterfaceC37276Ek4.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new C65071PgJ(C65139PhP.LJ(0, (ParameterizedType) type));
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
