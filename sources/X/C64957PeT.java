package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.PeT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64957PeT extends AbstractC65015PfP {
    public boolean LIZ = true;

    @Override // X.AbstractC65015PfP
    public final InterfaceC65017PfR<PVM, ?> responseBodyConverter(Type type, Annotation[] annotationArr, C65018PfS c65018PfS) {
        if (type == PVM.class) {
            if (C65138PhO.LJIIIIZZ(annotationArr, InterfaceC28048Azc.class)) {
                return C64981Per.LJLIL;
            }
            return C64641PYn.LJLIL;
        }
        if (type == Void.class) {
            return PZH.LJLIL;
        }
        if (this.LIZ && type == C76800UCe.class) {
            try {
                return PZI.LJLIL;
            } catch (NoClassDefFoundError unused) {
                this.LIZ = false;
                return null;
            }
        }
        return null;
    }

    @Override // X.AbstractC65015PfP
    public final InterfaceC65017PfR<?, PVP> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65018PfS c65018PfS) {
        if (PVP.class.isAssignableFrom(C65138PhO.LJFF(type))) {
            return C64980Peq.LJLIL;
        }
        return null;
    }
}
