package X;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: X.Pmz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65485Pmz<D extends GenericDeclaration> {
    public final D LIZ;
    public final String LIZIZ;
    public final AbstractC65590Pog<Type> LIZJ;

    public final int hashCode() {
        return this.LIZ.hashCode() ^ this.LIZIZ.hashCode();
    }

    public final String toString() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (C65483Pmx.LIZ) {
            if (obj == null || !Proxy.isProxyClass(obj.getClass()) || !(Proxy.getInvocationHandler(obj) instanceof C65487Pn1)) {
                return false;
            }
            C65485Pmz<?> c65485Pmz = ((C65487Pn1) Proxy.getInvocationHandler(obj)).LIZ;
            if (this.LIZIZ.equals(c65485Pmz.LIZIZ) && this.LIZ.equals(c65485Pmz.LIZ) && this.LIZJ.equals(c65485Pmz.LIZJ)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) obj;
        if (this.LIZIZ.equals(typeVariable.getName()) && this.LIZ.equals(typeVariable.getGenericDeclaration())) {
            return true;
        }
        return false;
    }

    public C65485Pmz(D d, String str, Type[] typeArr) {
        C65484Pmy.LIZ(typeArr, "bound for type variable");
        d.getClass();
        this.LIZ = d;
        str.getClass();
        this.LIZIZ = str;
        this.LIZJ = AbstractC65590Pog.copyOf(typeArr);
    }
}
