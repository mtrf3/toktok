package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

/* renamed from: X.Pn2, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65488Pn2 {
    public final AbstractC65564PoG<C65481Pmv, Type> LIZ;

    public C65488Pn2() {
        this.LIZ = AbstractC65564PoG.of();
    }

    public C65488Pn2(C65574PoQ c65574PoQ) {
        this.LIZ = c65574PoQ;
    }

    public Type LIZ(TypeVariable typeVariable, C65489Pn3 c65489Pn3) {
        Type type = this.LIZ.get(new C65481Pmv(typeVariable));
        if (type == null) {
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] LIZJ = new C65486Pn0(c65489Pn3).LIZJ(bounds);
            if (C65483Pmx.LIZ && Arrays.equals(bounds, LIZJ)) {
                return typeVariable;
            }
            return C65484Pmy.LIZLLL(typeVariable.getGenericDeclaration(), typeVariable.getName(), LIZJ);
        }
        return new C65486Pn0(c65489Pn3).LIZIZ(type);
    }
}
