package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.Pg4, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65056Pg4 extends AbstractC65022PfW {
    public boolean LIZ = true;

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ LIZ(Type type) {
        if (type == EJ6.class) {
            return C65059Pg7.LIZ;
        }
        return null;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ LIZIZ(Type type) {
        if (type == Object.class) {
            return C65063PgB.LIZ;
        }
        return null;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ LJ(Type type) {
        if (type == String.class) {
            return C65062PgA.LIZ;
        }
        return null;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        if (type == TypedInput.class) {
            if (C65139PhP.LJIIIIZZ(annotationArr, ENX.class)) {
                return C65061Pg9.LIZ;
            }
            return C65055Pg3.LIZ;
        }
        if (type == String.class) {
            return C65044Pfs.LIZ;
        }
        if (type == Void.class) {
            return C65058Pg6.LIZ;
        }
        if (this.LIZ && type == C76800UCe.class) {
            try {
                return C65057Pg5.LIZ;
            } catch (NoClassDefFoundError unused) {
                this.LIZ = false;
                return null;
            }
        }
        return null;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        if (TypedOutput.class.isAssignableFrom(C65139PhP.LJFF(type))) {
            return C65060Pg8.LIZ;
        }
        return null;
    }
}
