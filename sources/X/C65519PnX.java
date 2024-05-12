package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: X.PnX, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65519PnX extends AbstractC65539Pnr<AbstractC65516PnU<?>> {
    @Override // X.AbstractC65539Pnr
    public final Iterable<? extends AbstractC65516PnU<?>> LIZJ(AbstractC65516PnU<?> abstractC65516PnU) {
        AbstractC65516PnU<?> abstractC65516PnU2 = abstractC65516PnU;
        Type type = abstractC65516PnU2.runtimeType;
        if (type instanceof TypeVariable) {
            return AbstractC65516PnU.LIZIZ(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return AbstractC65516PnU.LIZIZ(((WildcardType) type).getUpperBounds());
        }
        C65587Pod builder = AbstractC65590Pog.builder();
        for (Type type2 : abstractC65516PnU2.getRawType().getGenericInterfaces()) {
            AbstractC65516PnU<?> resolveType = abstractC65516PnU2.resolveType(type2);
            resolveType.LJLIL = abstractC65516PnU2.LJLIL;
            builder.LIZIZ(resolveType);
        }
        return builder.LJ();
    }

    @Override // X.AbstractC65539Pnr
    public final Class LIZLLL(AbstractC65516PnU<?> abstractC65516PnU) {
        return abstractC65516PnU.getRawType();
    }

    @Override // X.AbstractC65539Pnr
    public final AbstractC65516PnU<?> LJ(AbstractC65516PnU<?> abstractC65516PnU) {
        AbstractC65516PnU<?> of;
        AbstractC65516PnU<?> abstractC65516PnU2 = abstractC65516PnU;
        Type type = abstractC65516PnU2.runtimeType;
        if (type instanceof TypeVariable) {
            of = AbstractC65516PnU.of(((TypeVariable) type).getBounds()[0]);
            if (of.getRawType().isInterface()) {
                return null;
            }
        } else if (type instanceof WildcardType) {
            of = AbstractC65516PnU.of(((WildcardType) type).getUpperBounds()[0]);
            if (of.getRawType().isInterface()) {
                return null;
            }
        } else {
            Type genericSuperclass = abstractC65516PnU2.getRawType().getGenericSuperclass();
            if (genericSuperclass == null) {
                return null;
            }
            AbstractC65516PnU<?> resolveType = abstractC65516PnU2.resolveType(genericSuperclass);
            resolveType.LJLIL = abstractC65516PnU2.LJLIL;
            return resolveType;
        }
        return of;
    }
}
