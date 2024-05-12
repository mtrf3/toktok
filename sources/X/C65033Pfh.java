package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;

/* renamed from: X.Pfh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65033Pfh extends AbstractC65015PfP {
    public static final C65033Pfh LIZ = new C65033Pfh();

    @Override // X.AbstractC65015PfP
    public final InterfaceC65017PfR<PVM, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C65018PfS c65018PfS) {
        if (C65138PhO.LJFF(type) != Optional.class) {
            return null;
        }
        return new C65036Pfk(c65018PfS.LJ(C65138PhO.LJ(0, (ParameterizedType) type), annotationArr));
    }
}
