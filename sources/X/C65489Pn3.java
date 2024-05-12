package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: X.Pn3, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65489Pn3 extends C65488Pn2 {
    public final /* synthetic */ TypeVariable LIZIZ;
    public final /* synthetic */ C65488Pn2 LIZJ;

    public C65489Pn3(TypeVariable typeVariable, C65488Pn2 c65488Pn2) {
        this.LIZIZ = typeVariable;
        this.LIZJ = c65488Pn2;
    }

    @Override // X.C65488Pn2
    public final Type LIZ(TypeVariable typeVariable, C65489Pn3 c65489Pn3) {
        if (typeVariable.getGenericDeclaration().equals(this.LIZIZ.getGenericDeclaration())) {
            return typeVariable;
        }
        return this.LIZJ.LIZ(typeVariable, c65489Pn3);
    }
}
