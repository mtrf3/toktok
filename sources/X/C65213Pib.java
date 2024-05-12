package X;

import android.os.Build;
import com.google.gson.internal.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: X.Pib, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65213Pib extends AbstractC65069PgH {
    public final C65216Pie LIZ = new C65216Pie();

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        InterfaceC65014PfO<?, ?> LIZ;
        if (C65139PhP.LJFF(type) != C10K.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            if (Build.VERSION.SDK_INT >= 28) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is ");
                LIZ2.append(type.getTypeName());
                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
            }
            throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is ");
        }
        Type LJ = C65139PhP.LJ(0, (ParameterizedType) type);
        Class<?> LJFF = C65139PhP.LJFF(LJ);
        if (InterfaceC65316PkG.class.isAssignableFrom(LJFF) && (LIZ = this.LIZ.LIZ(new a.b(null, C10K.class, new a.b(null, C64797Pbt.class, LJ)), annotationArr, c65019PfT)) != null) {
            return new C65219Pih(LIZ);
        }
        if (LJFF != C64797Pbt.class) {
            return this.LIZ.LIZ(type, annotationArr, c65019PfT);
        }
        throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
    }
}
