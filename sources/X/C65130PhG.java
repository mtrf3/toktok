package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: X.PhG, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65130PhG extends AbstractC65069PgH {
    public static final /* synthetic */ int LIZIZ = 0;
    public final AbstractC65069PgH LIZ;

    public C65130PhG(C65148PhY c65148PhY) {
        this.LIZ = c65148PhY;
    }

    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        Annotation[] annotationArr2;
        if (annotationArr == null) {
            annotationArr2 = new Annotation[0];
        } else {
            annotationArr2 = annotationArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Annotation annotation : annotationArr2) {
            if (annotation instanceof InterfaceC65131PhH) {
                arrayList.add(annotation);
            }
        }
        InterfaceC65131PhH interfaceC65131PhH = (InterfaceC65131PhH) ORZ.LJLLLL(arrayList);
        if (interfaceC65131PhH == null) {
            return this.LIZ.LIZ(type, annotationArr, c65019PfT);
        }
        InterfaceC65014PfO<?, ?> LIZ = this.LIZ.LIZ(type, annotationArr, c65019PfT);
        if (LIZ != null) {
            return new C65132PhI(LIZ, interfaceC65131PhH.value(), interfaceC65131PhH.settingKey());
        }
        return null;
    }
}
