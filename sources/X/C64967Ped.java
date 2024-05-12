package X;

import java.lang.annotation.Annotation;

/* renamed from: X.Ped, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64967Ped implements InterfaceC65004PfE {
    public static final C64967Ped LJIIIIZZ = new C64967Ped();

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("@");
        LIZ.append(InterfaceC65004PfE.class.getName());
        LIZ.append("()");
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC65004PfE.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof InterfaceC65004PfE;
    }
}
