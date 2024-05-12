package X;

import defpackage.i0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PkV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65331PkV implements TypeVariable<GenericDeclaration>, Type {
    public final InterfaceC65333PkX LJLIL;

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List<InterfaceC65332PkW> upperBounds = this.LJLIL.getUpperBounds();
        ArrayList arrayList = new ArrayList(C32I.LJJL(upperBounds, 10));
        Iterator<InterfaceC65332PkW> it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(C65330PkU.LIZ(it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.LJLIL.getName();
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getGenericDeclaration() is not yet supported for type variables created from KType: ");
        LIZ.append(this.LJLIL);
        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", X1D.LIZIZ(LIZ)));
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return getName();
    }

    public final int hashCode() {
        getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return getName();
    }

    public C65331PkV(InterfaceC65333PkX typeParameter) {
        o.LJIIIZ(typeParameter, "typeParameter");
        this.LJLIL = typeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !o.LJ(getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }
}
