package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* renamed from: X.Pgm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65100Pgm extends AbstractC65069PgH {
    @Override // X.AbstractC65069PgH
    public final InterfaceC65014PfO<?, ?> LIZ(Type type, Annotation[] annotationArr, C65019PfT c65019PfT) {
        Class<?> LJFF = C65139PhP.LJFF(type);
        if (LJFF != C76L.class && LJFF != C10K.class) {
            return null;
        }
        InterfaceC65014PfO<?, ?> LIZJ = c65019PfT.LIZJ(this, type, annotationArr);
        if (LJFF == C76L.class) {
            return new C65227Pip(LIZJ);
        }
        if (LJFF == C10K.class) {
            return new C65101Pgn(LIZJ);
        }
        throw new AssertionError();
    }
}
