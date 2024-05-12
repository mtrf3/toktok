package X;

import com.google.gson.internal.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.Pic, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65214Pic extends AbstractC65069PgH {
    public final C65215Pid LIZ = new C65215Pid();

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        InterfaceC65014PfO<?, ?> LIZ;
        if (C65139PhP.LJFF(type) != C76L.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type LJ = C65139PhP.LJ(0, (ParameterizedType) type);
            Class<?> LJFF = C65139PhP.LJFF(LJ);
            if ((InterfaceC65316PkG.class.isAssignableFrom(LJFF) || K4J.class.isAssignableFrom(LJFF)) && (LIZ = this.LIZ.LIZ(new a.b(null, C76L.class, new a.b(null, C64797Pbt.class, LJ)), annotationArr, c65019PfT)) != null) {
                return new C65218Pig(LIZ);
            }
            if (LJFF != C64797Pbt.class) {
                return this.LIZ.LIZ(type, annotationArr, c65019PfT);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
