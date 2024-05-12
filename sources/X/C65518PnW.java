package X;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: X.PnW, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65518PnW extends PMI {
    public final /* synthetic */ C65584Poa LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65518PnW(C65584Poa c65584Poa) {
        super(4);
        this.LIZIZ = c65584Poa;
    }

    @Override // X.PMI
    public final void LJIIJ(Class<?> cls) {
        this.LIZIZ.LIZLLL(cls);
    }

    @Override // X.PMI
    public final void LJIIJJI(GenericArrayType genericArrayType) {
        this.LIZIZ.LIZLLL(Array.newInstance(AbstractC65516PnU.of(genericArrayType.getGenericComponentType()).getRawType(), 0).getClass());
    }

    @Override // X.PMI
    public final void LJIIL(ParameterizedType parameterizedType) {
        this.LIZIZ.LIZLLL(parameterizedType.getRawType());
    }

    @Override // X.PMI
    public final void LJIILIIL(TypeVariable<?> typeVariable) {
        LJIIIZ(typeVariable.getBounds());
    }

    @Override // X.PMI
    public final void LJIILJJIL(WildcardType wildcardType) {
        LJIIIZ(wildcardType.getUpperBounds());
    }
}
