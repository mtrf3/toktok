package X;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: X.PnD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65499PnD implements WildcardType, Serializable {
    public static final long serialVersionUID = 0;
    public final AbstractC65590Pog<Type> LJLIL;
    public final AbstractC65590Pog<Type> LJLILLLLZI;

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        AbstractC65590Pog<Type> abstractC65590Pog = this.LJLIL;
        return (Type[]) abstractC65590Pog.toArray(new Type[abstractC65590Pog.size()]);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        AbstractC65590Pog<Type> abstractC65590Pog = this.LJLILLLLZI;
        return (Type[]) abstractC65590Pog.toArray(new Type[abstractC65590Pog.size()]);
    }

    public final int hashCode() {
        return this.LJLIL.hashCode() ^ this.LJLILLLLZI.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("?");
        AbstractC65557Po9<Type> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            Type next = it.next();
            sb.append(" super ");
            sb.append(EnumC65510PnO.LJLJI.LIZLLL(next));
        }
        AbstractC65590Pog<Type> abstractC65590Pog = this.LJLILLLLZI;
        C65501PnF c65501PnF = new C65501PnF(new C65500PnE(Object.class));
        abstractC65590Pog.getClass();
        Iterator<Object> it2 = new C65502PnG(abstractC65590Pog, c65501PnF).iterator();
        while (true) {
            AbstractC65554Po6 abstractC65554Po6 = (AbstractC65554Po6) it2;
            if (abstractC65554Po6.hasNext()) {
                Type type = (Type) abstractC65554Po6.next();
                sb.append(" extends ");
                sb.append(EnumC65510PnO.LJLJI.LIZLLL(type));
            } else {
                return sb.toString();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WildcardType)) {
            return false;
        }
        WildcardType wildcardType = (WildcardType) obj;
        if (!this.LJLIL.equals(Arrays.asList(wildcardType.getLowerBounds())) || !this.LJLILLLLZI.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
            return false;
        }
        return true;
    }

    public C65499PnD(Type[] typeArr, Type[] typeArr2) {
        C65484Pmy.LIZ(typeArr, "lower bound for wildcard");
        C65484Pmy.LIZ(typeArr2, "upper bound for wildcard");
        EnumC65510PnO enumC65510PnO = EnumC65510PnO.LJLJI;
        this.LJLIL = enumC65510PnO.LJ(typeArr);
        this.LJLILLLLZI = enumC65510PnO.LJ(typeArr2);
    }
}
