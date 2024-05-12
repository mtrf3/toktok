package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65035Pfj extends AbstractC65025PfZ {
    public static final C65035Pfj LIZ = new C65035Pfj();

    @Override // X.AbstractC65025PfZ
    public final InterfaceC65013PfN LIZ(Type type, Annotation[] annotationArr) {
        if (C65138PhO.LJFF(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type LJ = C65138PhO.LJ(0, (ParameterizedType) type);
            if (C65138PhO.LJFF(LJ) != C64653PYz.class) {
                return new C65040Pfo(LJ);
            }
            if (LJ instanceof ParameterizedType) {
                return new C65037Pfl(C65138PhO.LJ(0, (ParameterizedType) LJ));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
