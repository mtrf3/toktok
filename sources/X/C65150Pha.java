package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.Pha, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65150Pha extends AbstractC65022PfW {
    static {
        C39745Fin.LIZJ("text/plain");
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<TypedInput, ?> LIZLLL(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        if (String.class.equals(type)) {
            return new C1NE();
        }
        return null;
    }

    @Override // X.AbstractC65022PfW
    public final InterfaceC65016PfQ<?, TypedOutput> LIZJ(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C65019PfT c65019PfT) {
        if (String.class.equals(type)) {
            return new C65151Phb();
        }
        return null;
    }
}
