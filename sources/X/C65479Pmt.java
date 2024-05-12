package X;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Pmt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65479Pmt extends PMI {
    public final /* synthetic */ AtomicReference LIZIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65479Pmt(AtomicReference atomicReference) {
        super(4);
        this.LIZIZ = atomicReference;
    }

    @Override // X.PMI
    public final void LJIIJ(Class<?> cls) {
        this.LIZIZ.set(cls.getComponentType());
    }

    @Override // X.PMI
    public final void LJIIJJI(GenericArrayType genericArrayType) {
        this.LIZIZ.set(genericArrayType.getGenericComponentType());
    }

    @Override // X.PMI
    public final void LJIILIIL(TypeVariable<?> typeVariable) {
        this.LIZIZ.set(C65484Pmy.LJFF(typeVariable.getBounds()));
    }

    @Override // X.PMI
    public final void LJIILJJIL(WildcardType wildcardType) {
        this.LIZIZ.set(C65484Pmy.LJFF(wildcardType.getUpperBounds()));
    }
}
