package X;

import java.lang.annotation.Annotation;

/* renamed from: X.Qep, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67527Qep implements InterfaceC67542Qf4 {
    public final int LJIIIIZZ;
    public final EnumC67540Qf2 LJIIIZ;

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.LJIIIIZZ + "intEncoding=" + this.LJIIIZ + ')';
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.LJIIIIZZ) + (this.LJIIIZ.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return InterfaceC67542Qf4.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC67542Qf4)) {
            return false;
        }
        InterfaceC67542Qf4 interfaceC67542Qf4 = (InterfaceC67542Qf4) obj;
        if (this.LJIIIIZZ == ((C67527Qep) interfaceC67542Qf4).LJIIIIZZ && this.LJIIIZ.equals(((C67527Qep) interfaceC67542Qf4).LJIIIZ)) {
            return true;
        }
        return false;
    }

    public C67527Qep(int i, EnumC67540Qf2 enumC67540Qf2) {
        this.LJIIIIZZ = i;
        this.LJIIIZ = enumC67540Qf2;
    }
}
