package X;

import java.lang.annotation.Annotation;

/* renamed from: X.Pee, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64968Pee implements InterfaceC65007PfH {
    public static final C64968Pee LJIIIIZZ = new C64968Pee();

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("@");
        LIZ.append(InterfaceC65007PfH.class.getName());
        LIZ.append("()");
        return X1D.LIZIZ(LIZ);
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC65007PfH.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        return obj instanceof InterfaceC65007PfH;
    }
}
